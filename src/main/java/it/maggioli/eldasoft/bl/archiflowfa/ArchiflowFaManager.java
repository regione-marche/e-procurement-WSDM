package it.maggioli.eldasoft.bl.archiflowfa;

import it.archiflow93.Card;
import it.archiflow93.CardBundle;
import it.archiflow93.ResultInfo;
import it.archiflow93.SessionInfo;
import it.archiflow93.classification.FascicoloEntity;
import it.archiflow93.classification.FascicoloIdentifier;
import it.archiflow93.classification.TitolarioItemIdentifier;
import it.maggioli.eldasoft.bl.IWSDMManager;
import it.maggioli.eldasoft.bl.archiflow.ArchiflowException;
import it.maggioli.eldasoft.ws.conf.WSDMConfigurazione;
import it.maggioli.eldasoft.ws.conf.WSDMConfigurazioneImpl;
import it.maggioli.eldasoft.ws.conf.WSDMConfigurazioneOut;
import it.maggioli.eldasoft.ws.conf.WSDMTabellato;
import it.maggioli.eldasoft.ws.conf.WSDMTabellatoElemento;
import it.maggioli.eldasoft.ws.dm.WSDMAggiungiAllegatiIn;
import it.maggioli.eldasoft.ws.dm.WSDMAggiungiAllegatiRes;
import it.maggioli.eldasoft.ws.dm.WSDMAnagraficaLeggiRes;
import it.maggioli.eldasoft.ws.dm.WSDMAttoContrattoRes;
import it.maggioli.eldasoft.ws.dm.WSDMDocumentoCollegaRes;
import it.maggioli.eldasoft.ws.dm.WSDMFascicolo;
import it.maggioli.eldasoft.ws.dm.WSDMFascicoloIn;
import it.maggioli.eldasoft.ws.dm.WSDMFascicoloModificaIn;
import it.maggioli.eldasoft.ws.dm.WSDMFascicoloModificaRes;
import it.maggioli.eldasoft.ws.dm.WSDMFascicoloRes;
import it.maggioli.eldasoft.ws.dm.WSDMInserimentoInFascicolo;
import it.maggioli.eldasoft.ws.dm.WSDMInviaMail;
import it.maggioli.eldasoft.ws.dm.WSDMInviaMailRes;
import it.maggioli.eldasoft.ws.dm.WSDMListaAccountEmailRes;
import it.maggioli.eldasoft.ws.dm.WSDMListaAmministrazioniAooRes;
import it.maggioli.eldasoft.ws.dm.WSDMListaClassificheRes;
import it.maggioli.eldasoft.ws.dm.WSDMListaOperatoriRes;
import it.maggioli.eldasoft.ws.dm.WSDMListaProfiliRes;
import it.maggioli.eldasoft.ws.dm.WSDMListaTipiTrasmissioneRes;
import it.maggioli.eldasoft.ws.dm.WSDMListaUfficiRes;
import it.maggioli.eldasoft.ws.dm.WSDMLoginAttr;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloAllegato;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloDocumento;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloDocumentoIn;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloDocumentoRes;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloModificaIn;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloModificaRes;
import it.maggioli.eldasoft.ws.dm.WSDMRicercaAccountEmail;
import it.maggioli.eldasoft.ws.dm.WSDMRicercaFascicolo;
import it.maggioli.eldasoft.ws.dm.WSDMRicercaFascicoloRes;
import it.maggioli.eldasoft.ws.dm.WSDMTrasmissioneIn;
import it.maggioli.eldasoft.ws.dm.WSDMTrasmissioneRes;
import it.maggioli.eldasoft.ws.dm.WSDMVerificaMailRes;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.InitialContext;
import javax.xml.ws.Holder;

import org.apache.log4j.Logger;

public class ArchiflowFaManager implements IWSDMManager {

  private ArchiflowFaLoginManager          loginManager;
  private ArchiflowFaClassificationManager classificationManager;
  private ArchiflowFaCardManager           cardManager;
  private ArchiflowFaPostingManager        postingManager;
  private ArchiflowFaInterfaceManager      itfManager;
  private ArchiflowFaEmailManager          emailManager;

  static Logger                            logger                     = Logger.getLogger(ArchiflowFaManager.class);

  static private String                    REMOTEWSDM                 = "java:comp/env/REMOTEWSDM";
  static private String                    ARCHIFLOWFA_MODO_INVIO_PEC = "java:comp/env/ARCHIFLOWFA_MODO_INVIO_PEC";

  public ArchiflowFaManager() {

    try {
      loginManager = new ArchiflowFaLoginManager();
      classificationManager = new ArchiflowFaClassificationManager();
      cardManager = new ArchiflowFaCardManager();
      postingManager = new ArchiflowFaPostingManager();
      itfManager = new ArchiflowFaInterfaceManager();
      emailManager = new ArchiflowFaEmailManager();

      String remotewsdm = InitialContext.doLookup(REMOTEWSDM);
      if ("ARCHIFLOWFA".equals(remotewsdm)) {
        loadConfiguration();
      }

    } catch (Exception e) {
      logger.error("ArchiflowManager error : " + e.getMessage());
    }

  }

  private void loadConfiguration() {

    Map<String, Integer> archiflowDocumentMap = new HashMap<String, Integer>();
    Map<Short, String> wsdmDocumentMap = new HashMap<Short, String>();

    Map<String, Integer> archiflowArchiveMap = new HashMap<String, Integer>();
    Map<Integer, String> wsdmArchiveMap = new HashMap<Integer, String>();
    Map<String, Map<String, String>> archiflowDocumentIndexMap = new HashMap<String, Map<String, String>>();
    Map<String, Map<String, String>> wsdmDocumentIndexMap = new HashMap<String, Map<String, String>>();

    Map<String, Map<String, String>> archiflowDocumentTypeMap = new HashMap<String, Map<String, String>>();
    Map<String, Map<String, String>> wsdmDocumentTypeMap = new HashMap<String, Map<String, String>>();

    List<String> mailOptions = new ArrayList<String>();

    Short userCode = null;
    Map<String, String> sendMailBoxMap = new HashMap<String, String>();
    Map<String, String> sendMailBoxChannelMap = new HashMap<String, String>();
    Map<String, Integer> sendMailBoxIdMap = new HashMap<String, Integer>();
    Map<String, String> sendMailBoxEmailMap = new HashMap<String, String>();

    final String SUFFIX_PROP = "_PROP";
    final String SUFFIX_TYPE = "_TYPE";

    String refErr = "";

    WSDMConfigurazione config = new WSDMConfigurazioneImpl();
    try {
      WSDMConfigurazioneOut conf = config.WSDMConfigurazioneLeggi();
      WSDMTabellato[] tabellati = conf.getTabellati();

      logger.info("_ Start Load configuration _");

      for (WSDMTabellato tab : tabellati) {

        // Indici dei documenti
        if (tab.getNome().equals("indexDocument")) {
          for (WSDMTabellatoElemento document : tab.getElementi()) {
            try {
              Integer index = new Integer(document.getDescrizione());
              archiflowDocumentMap.put(document.getCodice(), index);
              wsdmDocumentMap.put(index.shortValue(), document.getCodice());
              logger.info("  Found document " + document.getCodice() + " -> " + index);
            } catch (NumberFormatException e) {
              logger.warn("  Invalid document type index " + document.getCodice() + " : " + document.getDescrizione());
            }
          }
        }

        // Codice utente
        if (tab.getNome().equals("userCode")) {
          userCode = new Short(tab.getElementi()[0].getDescrizione());
          logger.info("  userCode = " + userCode);
        }

        // Indirizzo del mittente
        if (tab.getNome().equals("indirizzomittente")) {
          for (WSDMTabellatoElemento mailbox : tab.getElementi()) {
            sendMailBoxMap.put(mailbox.getCodice(), mailbox.getDescrizione());
          }
        }

        // Opzioni di utilizzo della casella di posta (nel caso di utilizzo del
        // servizio posting.svc)
        if (tab.getNome().equals("sendMailboxOptions")) {
          String opt = "";
          for (WSDMTabellatoElemento options : tab.getElementi()) {
            mailOptions.add(options.getCodice());
            opt = opt + options.getCodice() + " ";
          }
          logger.info("   sendMailbox options : [ " + opt + "]");
        }
      }

      // Lettura dei parametri relativi alle caselle di posta (per posting.svc e
      // email.svc)
      for (WSDMTabellato tab : tabellati) {
        if (sendMailBoxMap.containsKey(tab.getNome())) {
          try {
            for (WSDMTabellatoElemento mailbox : tab.getElementi()) {
              // Identificativo della casella di posta (utilizzato dal servizio
              // posting.svc)
              if (mailbox.getCodice().equals("id")) {
                int id = Integer.parseInt(mailbox.getDescrizione());
                sendMailBoxIdMap.put(tab.getNome(), id);
              }
              // Canale della casella di posta (utilizzato dal servizio
              // posting.svc)
              if (mailbox.getCodice().equals("cPecChannel")) {
                sendMailBoxChannelMap.put(tab.getNome(), mailbox.getDescrizione());
              }
              // Indirizzo email della casella di posta (utilizzato dal servizio
              // email.svc)
              if (mailbox.getCodice().equals("email")) {
                sendMailBoxEmailMap.put(tab.getNome(), mailbox.getDescrizione());
              }

            }
          } catch (NumberFormatException e) {
            logger.warn("   sendMailbox error :  invalid reference [ " + tab.getNome() + "]");
          }
          logger.info("   sendMailbox  config : "
              + tab.getNome()
              + " / "
              + sendMailBoxMap.get(tab.getNome())
              + "  id:"
              + sendMailBoxIdMap.get(tab.getNome())
              + " ch:"
              + sendMailBoxChannelMap.get(tab.getNome())
              + "]");
        }
      }

      // Gestione degli indici degli archivi
      for (WSDMTabellato tab : tabellati) {
        if (tab.getNome().equals("indexArchive")) {
          for (String document : archiflowDocumentMap.keySet()) {
            Integer archiveVal = null;
            for (WSDMTabellatoElemento archive : tab.getElementi()) {
              if (document.equals(archive.getCodice())) {
                try {
                  refErr = tab.getNome() + "[" + archive.getCodice() + "=" + archive.getDescrizione() + "]";
                  archiveVal = new Integer(archive.getDescrizione());
                  archiflowArchiveMap.put(archive.getCodice(), archiveVal);
                  wsdmArchiveMap.put(archiveVal, archive.getCodice());
                  logger.info("  Configured   document -> archive : " + document + " -> " + archiveVal);
                } catch (NumberFormatException e) {
                  logger.warn("  Invalid index for archive " + archive.getCodice() + " : " + archive.getDescrizione());
                }
              }
            }
            if (archiveVal == null) {
              logger.warn("  Archive not found for document " + document);
            }
          }
          break;
        }
      }

      archiflowDocumentIndexMap = new HashMap<String, Map<String, String>>();
      archiflowDocumentTypeMap = new HashMap<String, Map<String, String>>();
      wsdmDocumentIndexMap = new HashMap<String, Map<String, String>>();
      wsdmDocumentTypeMap = new HashMap<String, Map<String, String>>();
      for (String document : archiflowDocumentMap.keySet()) {
        String index_name = document + SUFFIX_PROP;
        String type_name = document + SUFFIX_TYPE;
        Map<String, String> indexMap = null;
        Map<String, String> typeMap = null;

        Map<String, String> indexMap2 = null;
        Map<String, String> typeMap2 = null;
        for (WSDMTabellato tab : tabellati) {
          if (tab.getNome().equals(index_name)) {
            // found configured document indexes
            logger.info("  Configured   document -> index " + document);
            indexMap = new HashMap<String, String>();
            indexMap2 = new HashMap<String, String>();
            for (WSDMTabellatoElemento index : tab.getElementi()) {
              indexMap.put(index.getCodice(), index.getDescrizione());
              indexMap2.put(index.getDescrizione(), index.getCodice());
              logger.info("    " + index.getCodice() + " -> " + index.getDescrizione());
            }
          }

          if (tab.getNome().equals(type_name)) {
            // found configured document indexes type
            logger.info("  Configured   document -> type " + document);
            typeMap = new HashMap<String, String>();
            typeMap2 = new HashMap<String, String>();
            for (WSDMTabellatoElemento type : tab.getElementi()) {
              typeMap.put(type.getCodice(), type.getDescrizione());
              typeMap2.put(type.getDescrizione(), type.getCodice());
              logger.info("    " + type.getCodice() + " -> " + type.getDescrizione());
            }
          }
        }
        if (indexMap == null) {
          logger.warn("  Unable to find configured indexes for document " + document);
        } else {
          archiflowDocumentIndexMap.put(document, indexMap);
          wsdmDocumentIndexMap.put(document, indexMap2);
        }
        if (typeMap == null) {
          logger.warn("  Unable to find configured type indexes for document " + document);
        } else {
          archiflowDocumentTypeMap.put(document, typeMap);
          wsdmDocumentTypeMap.put(document, typeMap2);
        }
      }

    } catch (RemoteException e) {
      logger.error("      Unable to find WSDMConfigurazione service");
    } catch (Exception e) {
      logger.error("      Error loading WSDMConfigurazione : " + refErr);
    }

    itfManager.setArchiflowArchiveMap(archiflowArchiveMap);
    itfManager.setArchiflowDocumentIndexMap(archiflowDocumentIndexMap);
    itfManager.setArchiflowDocumentMap(archiflowDocumentMap);
    itfManager.setArchiflowDocumentTypeMap(archiflowDocumentTypeMap);
    itfManager.setWsdmArchiveMap(wsdmArchiveMap);
    itfManager.setWsdmDocumentIndexMap(wsdmDocumentIndexMap);
    itfManager.setWsdmDocumentMap(wsdmDocumentMap);
    itfManager.setWsdmDocumentTypeMap(wsdmDocumentTypeMap);

    cardManager.setUserCode(userCode);

    postingManager.setUserCode(userCode);
    postingManager.setSendMailBoxChannelList(sendMailBoxChannelMap);
    postingManager.setSendMailBoxIdList(sendMailBoxIdMap);
    postingManager.setMailOptions(mailOptions);

    emailManager.setSendMailBoxEmailMap(sendMailBoxEmailMap);

    logger.info("_ End Load configuration _");
  }

  /**
   * Manages Archiflow.service.CardService in order to insert a
   * WSDMProtocolloDocumento and its attachments. Call
   * Archiflow.service.insertCard and Archiflow.service.attachDocument
   * 
   * @param wsdmprotocolloDocumentoIn
   *        eldasoft.ws.dm.WSDMProtocolloDocumento
   * @return CardBundle The new Card
   * @throws ArchiflowException
   */
  private WSDMProtocolloDocumento _insertCardBundle(WSDMProtocolloDocumentoIn wsdmProtocolloDocumentoIn, Holder<SessionInfo> sessionInfo)
      throws ArchiflowFaException {
    WSDMProtocolloDocumento wsdmProtocolloDocumento = null;

    // Creazione dell'oggetto CardBundle da utilizzare nella successiva
    // operazione InsertCard
    CardBundle newCardBundle = itfManager.buildCard(wsdmProtocolloDocumentoIn);
    if (newCardBundle == null) {
      throw new ArchiflowFaException("buildCard() failed. Some error occurs. Further details on application log.");
    }

    // Tipo di documento configurato per l'operazione: dipende dal verso (IN,
    // OUT, INT)
    short documentTypeId = itfManager.getArchiflowDocumentId(wsdmProtocolloDocumentoIn.getInout());
    newCardBundle.setDocumentTypeId(documentTypeId);

    // Tipo di archivio configurato per l'operazione: dipende dal verso (IN,
    // OUT, INT)
    short archiveId = itfManager.getArchiflowArchiveId(wsdmProtocolloDocumentoIn.getInout());
    newCardBundle.setArchiveId(archiveId);

    // Inserimento della Card
    String classificaFascicolo = null;
    String codiceFascicolo = null;

    if (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmProtocolloDocumentoIn.getInserimentoInFascicolo())) {
      WSDMFascicolo wsdmFascicolo = wsdmProtocolloDocumentoIn.getFascicolo();
      classificaFascicolo = wsdmFascicolo.getClassificaFascicolo();
      codiceFascicolo = wsdmFascicolo.getCodiceFascicolo();
    }

    Card insertedCard = cardManager.insertCard(sessionInfo.value.getSessionId(), newCardBundle, classificaFascicolo, codiceFascicolo);

    // Lettura dei dati minimi necessari (numero, data protocollo... e' esclusa
    // la lettura dei documenti principale ed allegati).
    wsdmProtocolloDocumento = itfManager.getWSDMProtocolloDocumentoFromCard(insertedCard, true);

    // Gestione degli allegati.
    // In questo contesto vengono considerati tutti allegati.
    // Nella InsertCard e nella creazione delle CardBundle da utilizzare per
    // l'inserimento non e' stato indicato alcun documento principale.
    // if (wsdmProtocolloDocumentoIn.getAllegati() != null) {
    // if (wsdmProtocolloDocumentoIn.getAllegati().length >= 1) {
    // WSDMProtocolloAllegato[] allegati =
    // wsdmProtocolloDocumentoIn.getAllegati();
    // for (int a = 1; a < wsdmProtocolloDocumentoIn.getAllegati().length; a++)
    // {
    // WSDMProtocolloAllegato allegato = allegati[a];
    // cardManager.attachDocument(loginManager.getSessionId(), "" +
    // insertedCard.getCardId(), allegato);
    // }
    // }
    // }

    if (wsdmProtocolloDocumentoIn.getAllegati() != null) {
      WSDMProtocolloAllegato[] allegati = wsdmProtocolloDocumentoIn.getAllegati();
      for (int a = 0; a < wsdmProtocolloDocumentoIn.getAllegati().length; a++) {
        WSDMProtocolloAllegato allegato = allegati[a];
        if (a == 0) {
          cardManager.importDocument(sessionInfo.value.getSessionId(), "" + insertedCard.getCardId(), allegato);
        } else {
          cardManager.attachDocument(sessionInfo.value.getSessionId(), "" + insertedCard.getCardId(), allegato);
        }
      }
    }

    return wsdmProtocolloDocumento;
  }

  @Override
  public WSDMProtocolloDocumentoRes _protocolloInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmProtocolloDocumentoIn) {

    WSDMProtocolloDocumentoRes wsdmProtocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    StringBuffer messaggioCtr = new StringBuffer();
    if (ArchiflowFaUtilityControllo.ctrProtocolloInserisci(loginAttr, wsdmProtocolloDocumentoIn, messaggioCtr)) {

      Holder<SessionInfo> sessionInfo = new Holder<SessionInfo>(new SessionInfo());

      if (loginManager.archiflowLogin(username, password, sessionInfo) == ResultInfo.OK) {
        try {

          // Inserimento della Card
          WSDMProtocolloDocumento wsdmProtocolloDocumento = this._insertCardBundle(wsdmProtocolloDocumentoIn, sessionInfo);

          // Gestione dell'eventuale invio email.
          // Si considerano i destinatari indicati tra i dati di protocollo.
          if (wsdmProtocolloDocumentoIn.getDestinatari() != null) {
            String[] destinatari = new String[wsdmProtocolloDocumentoIn.getDestinatari().length];
            for (int idx = 0; idx < wsdmProtocolloDocumentoIn.getDestinatari().length; idx++) {
              destinatari[idx] = wsdmProtocolloDocumentoIn.getDestinatari()[idx].getEmail();
            }

            WSDMInviaMail mailDetails = wsdmProtocolloDocumentoIn.getInviaMail();
            if (mailDetails != null) {
              postingManager.sendPecMail(sessionInfo.value, wsdmProtocolloDocumento.getIdDocumento(), mailDetails.getMittenteMail(),
                  destinatari, mailDetails.getOggettoMail(), mailDetails.getTestoMail());
            }
          }

          wsdmProtocolloDocumentoRes.setProtocolloDocumento(wsdmProtocolloDocumento);
          wsdmProtocolloDocumentoRes.setEsito(true);

        } catch (Exception e) {
          wsdmProtocolloDocumentoRes.setEsito(false);
          wsdmProtocolloDocumentoRes.setMessaggio(itfManager.getItfErrorMsg() + e.getMessage());
        } finally {
          loginManager.archiflowLogout(sessionInfo);
        }
      } else {
        wsdmProtocolloDocumentoRes.setEsito(false);
        wsdmProtocolloDocumentoRes.setMessaggio("_protocolloInserisci failure : login error");
      }
    } else {
      wsdmProtocolloDocumentoRes.setEsito(false);
      wsdmProtocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
    }
    return wsdmProtocolloDocumentoRes;
  }

  @Override
  public WSDMProtocolloDocumentoRes _protocolloLeggi(String username, String password, WSDMLoginAttr loginAttr, Long annoProtocollo,
      String numeroProtocollo) {

    WSDMProtocolloDocumentoRes protocolloResult = new WSDMProtocolloDocumentoRes();
    protocolloResult.setEsito(false);

    Holder<SessionInfo> sessionInfo = new Holder<SessionInfo>(new SessionInfo());

    if (loginManager.archiflowLogin(username, password, sessionInfo) == ResultInfo.OK) {
      CardBundle cardResult = null;

      try {
        cardResult = cardManager.getCardByProtocol(sessionInfo.value.getSessionId(), annoProtocollo, numeroProtocollo);
        protocolloResult.setProtocolloDocumento(itfManager.getWSDMProtocolloDocumento(cardResult, false));
        protocolloResult.setEsito(true);
      } catch (ArchiflowFaException e) {
        protocolloResult.setMessaggio(e.getMessage());
      } finally {
        loginManager.archiflowLogout(sessionInfo);
      }

    } else {
      protocolloResult.setMessaggio("_protocolloLeggi failure : login error");
    }
    logger.info("_protocolloLeggi " + protocolloResult.isEsito() + "   " + protocolloResult.getMessaggio());
    return protocolloResult;
  }

  @Override
  public WSDMProtocolloDocumentoRes _documentoInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmProtocolloDocumentoIn) {

    WSDMProtocolloDocumentoRes wsdmProtocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    StringBuffer messaggioCtr = new StringBuffer();
    if (ArchiflowFaUtilityControllo.ctrDocumentoInserisci(loginAttr, wsdmProtocolloDocumentoIn, messaggioCtr)) {

      Holder<SessionInfo> sessionInfo = new Holder<SessionInfo>(new SessionInfo());

      if (loginManager.archiflowLogin(username, password, sessionInfo) == ResultInfo.OK) {

        try {
          WSDMProtocolloDocumento wsdmProtocolloDocumento = this._insertCardBundle(wsdmProtocolloDocumentoIn, sessionInfo);

          wsdmProtocolloDocumentoRes.setProtocolloDocumento(wsdmProtocolloDocumento);

          String message = String.format("_documentoInserisci eseguita : [ docNum: %s ] ", wsdmProtocolloDocumento.getNumeroDocumento());
          wsdmProtocolloDocumentoRes.setEsito(true);
          wsdmProtocolloDocumentoRes.setMessaggio(message);
          logger.info(message);

        } catch (ArchiflowFaException e) {
          wsdmProtocolloDocumentoRes.setEsito(false);
          wsdmProtocolloDocumentoRes.setMessaggio(itfManager.getItfErrorMsg() + e.getMessage());
          logger.error(e.getMessage());
        } finally {
          loginManager.archiflowLogout(sessionInfo);
        }
      } else {
        wsdmProtocolloDocumentoRes.setMessaggio("_documentoInserisci failure : login error");
        wsdmProtocolloDocumentoRes.setEsito(false);
      }
    } else {
      wsdmProtocolloDocumentoRes.setEsito(false);
      wsdmProtocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
    }

    return wsdmProtocolloDocumentoRes;
  }

  @Override
  public WSDMProtocolloDocumentoRes _documentoLeggi(String username, String password, WSDMLoginAttr loginAttr, String numeroDocumento) {

    WSDMProtocolloDocumentoRes protocolloResult = new WSDMProtocolloDocumentoRes();
    protocolloResult.setEsito(false);

    Holder<SessionInfo> sessionInfo = new Holder<SessionInfo>(new SessionInfo());

    if (loginManager.archiflowLogin(username, password, sessionInfo) == ResultInfo.OK) {
      CardBundle cardResult = null;
      try {
        cardResult = cardManager.getCardByNumber(sessionInfo.value.getSessionId(), numeroDocumento);
      } catch (ArchiflowFaException e) {
        protocolloResult.setMessaggio(e.getMessage());
      }
      loginManager.archiflowLogout(sessionInfo);

      if (cardResult != null) {
        WSDMProtocolloDocumento protocollodocumento = itfManager.getWSDMProtocolloDocumento(cardResult, false);
        if (protocollodocumento != null) {
          protocolloResult.setProtocolloDocumento(protocollodocumento);
          protocolloResult.setEsito(true);
          logger.info("_documentoLeggi " + protocolloResult.isEsito() + "  : " + protocollodocumento.getNumeroDocumento());
        } else {
          protocolloResult.setMessaggio(" Found document " + numeroDocumento + "." + itfManager.getItfErrorMsg());
        }
      }
    } else {
      protocolloResult.setMessaggio("_documentoLeggi failure : login error");
    }
    return protocolloResult;
  }

  @Override
  public WSDMProtocolloDocumentoRes _documentoMetadatiLeggi(String username, String password, WSDMLoginAttr loginAttr,
      String numeroDocumento) {
    WSDMProtocolloDocumentoRes wsdmProtocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    wsdmProtocolloDocumentoRes.setEsito(false);
    wsdmProtocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmProtocolloDocumentoRes;
  }

  @Override
  public WSDMFascicoloRes _fascicoloInserisci(String username, String password, WSDMLoginAttr loginAttr, WSDMFascicoloIn wsdmfascicoloIn) {
    WSDMFascicoloRes wsdmFascicoloRes = new WSDMFascicoloRes();
    wsdmFascicoloRes.setEsito(false);
    wsdmFascicoloRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmFascicoloRes;
  }

  @Override
  public WSDMFascicoloRes _fascicoloAggiungiDocumento(String username, String password, WSDMLoginAttr loginAttr, String codiceFascicolo,
      String numeroDocumento) {
    WSDMFascicoloRes wsdmFascicoloRes = new WSDMFascicoloRes();
    wsdmFascicoloRes.setEsito(false);
    wsdmFascicoloRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmFascicoloRes;
  }

  @Override
  public WSDMFascicoloRes _fascicoloLeggi(String username, String password, WSDMLoginAttr loginAttr, String codiceFascicolo,
      Long annoFascicolo, String numeroFascicolo, String classificaFascicolo, String oggettoFascicolo) {
    WSDMFascicoloRes wsdmFascicoloRes = new WSDMFascicoloRes();

    StringBuffer messaggioCtr = new StringBuffer();
    if (ArchiflowFaUtilityControllo.ctrFascicoloLeggi(loginAttr, codiceFascicolo, annoFascicolo, numeroFascicolo, messaggioCtr)) {

      Holder<SessionInfo> sessionInfo = new Holder<SessionInfo>(new SessionInfo());

      if (loginManager.archiflowLogin(username, password, sessionInfo) == ResultInfo.OK) {

        try {
          FascicoloEntity fascicoloEntity = classificationManager.getReadFascicolo(sessionInfo.value, codiceFascicolo);

          fascicoloEntity.getTitolarioItemId();

          WSDMFascicolo fascicolo = new WSDMFascicolo();

          // Codice
          if (fascicoloEntity.getFascicoloId() != null) {
            FascicoloIdentifier fascicoloIdentifier = fascicoloEntity.getFascicoloId();
            Integer fascicoloId = fascicoloIdentifier.getId();
            fascicolo.setCodiceFascicolo(String.valueOf(fascicoloId.intValue()));
          }

          // Oggetto e descrizione
          if (fascicoloEntity.getLabel() != null) {
            fascicolo.setOggettoFascicolo(fascicoloEntity.getLabel());
            fascicolo.setDescrizioneFascicolo(fascicoloEntity.getLabel());
          }

          // Classifica del fascicolo
          if (fascicoloEntity.getTitolarioItemId() != null) {
            TitolarioItemIdentifier titolarioItemIdentifier = fascicoloEntity.getTitolarioItemId();
            Integer classificaId = titolarioItemIdentifier.getId();
            fascicolo.setClassificaFascicolo(String.valueOf(classificaId.intValue()));
          }

          wsdmFascicoloRes.setEsito(true);
          wsdmFascicoloRes.setFascicolo(fascicolo);

        } catch (ArchiflowFaException e) {
          wsdmFascicoloRes.setEsito(false);
          wsdmFascicoloRes.setMessaggio(e.getMessage());
        } finally {
          loginManager.archiflowLogout(sessionInfo);
        }
      }

    } else {
      wsdmFascicoloRes.setEsito(false);
      wsdmFascicoloRes.setMessaggio(messaggioCtr.toString());
    }

    return wsdmFascicoloRes;
  }

  @Override
  public WSDMFascicoloRes _fascicoloMetadatiLeggi(String username, String password, WSDMLoginAttr loginAttr, String codiceFascicolo,
      Long annoFascicolo, String numeroFascicolo, String classificaFascicolo, String oggettoFascicolo) {
    return _fascicoloLeggi(username, password, loginAttr, codiceFascicolo, annoFascicolo, numeroFascicolo, classificaFascicolo, oggettoFascicolo);
  }

  @Override
  public WSDMProtocolloDocumentoRes _attoContrattoLeggi(String username, String password, WSDMLoginAttr loginAttr, String tipo,
      String organo, Long anno, String numero) {
    WSDMProtocolloDocumentoRes wsdmProtocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    wsdmProtocolloDocumentoRes.setEsito(false);
    wsdmProtocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmProtocolloDocumentoRes;
  }

  @Override
  public WSDMInviaMailRes _inviaMail(String username, String password, WSDMLoginAttr loginAttr, WSDMInviaMail wsdmInviaMail) {

    WSDMInviaMailRes wsdmInviaMailRes = new WSDMInviaMailRes();

    Holder<SessionInfo> sessionInfo = new Holder<SessionInfo>(new SessionInfo());

    if (loginManager.archiflowLogin(username, password, sessionInfo) == ResultInfo.OK) {
      try {

        // Lettura della modalita' di invio PEC.
        // In funzione dell'installazione del cliente potrebbe essere necessario
        // utilizzare servizi e configurazioni differenti.
        // Attualmente le configurazioni supportate sono:
        // - POSTING: invio delle email mediante il servizio postingservice.svc
        // - EMAIL: invio della email mediante il servizio emailservice.svc
        // - CARD: invio della email mediante il servizio card.svc
        String modoinviopec = "POSTING";
        try {
          modoinviopec = InitialContext.doLookup(ARCHIFLOWFA_MODO_INVIO_PEC);
          modoinviopec = modoinviopec.trim();
          modoinviopec = modoinviopec.toUpperCase();
        } catch (Exception e) {

        }

        if ("POSTING".equals(modoinviopec)) {
          CardBundle cardBundle = cardManager.getCardByNumber(sessionInfo.value.getSessionId(), wsdmInviaMail.getNumeroDocumento());
          postingManager.sendPecMail(sessionInfo.value, cardBundle.getCardId(), wsdmInviaMail.getMittenteMail(),
              wsdmInviaMail.getDestinatariMail(), wsdmInviaMail.getOggettoMail(), wsdmInviaMail.getTestoMail());
          wsdmInviaMailRes.setEsito(true);

        } else if ("EMAIL".equals(modoinviopec)) {
          CardBundle cardBundle = cardManager.getCardByNumber(sessionInfo.value.getSessionId(), wsdmInviaMail.getNumeroDocumento());
          emailManager.sendEMail(sessionInfo.value.getSessionId(), cardBundle.getCardId(), wsdmInviaMail.getMittenteMail(),
              wsdmInviaMail.getDestinatariMail(), wsdmInviaMail.getOggettoMail(), wsdmInviaMail.getTestoMail());
          wsdmInviaMailRes.setEsito(true);

        } else if ("CARD".equals(modoinviopec)) {
          CardBundle cardBundle = cardManager.getCardByNumber(sessionInfo.value.getSessionId(), wsdmInviaMail.getNumeroDocumento());
          cardManager.sendCard(sessionInfo.value.getSessionId(), cardBundle.getCardId(), wsdmInviaMail.getMittenteMail(),
              wsdmInviaMail.getDestinatariMail(), wsdmInviaMail.getOggettoMail(), wsdmInviaMail.getTestoMail());
          wsdmInviaMailRes.setEsito(true);

        }

      } catch (Exception e) {
        wsdmInviaMailRes.setEsito(false);
        wsdmInviaMailRes.setMessaggio(e.getMessage());
      } finally {
        loginManager.archiflowLogout(sessionInfo);
      }
    }

    return wsdmInviaMailRes;
  }

  @Override
  public WSDMVerificaMailRes _verificaMail(String username, String password, WSDMLoginAttr loginAttr, String numeroDocumento,
      Long annoProtocollo, String numeroProtocollo) {
    WSDMVerificaMailRes wsdmVerificaMailRes = new WSDMVerificaMailRes();
    wsdmVerificaMailRes.setEsito(false);
    wsdmVerificaMailRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmVerificaMailRes;
  }

  @Override
  public WSDMAttoContrattoRes _attoContrattoRicerca(String username, String password, WSDMLoginAttr loginAttr, String tipo, String organo,
      Long anno, String numeroDa, String numeroA, Date dataDa, Date dataA) {
    WSDMAttoContrattoRes wsdmAttoContrattoRes = new WSDMAttoContrattoRes();
    wsdmAttoContrattoRes.setEsito(false);
    wsdmAttoContrattoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmAttoContrattoRes;
  }

  @Override
  public WSDMListaProfiliRes _listaProfili(String username, String password, String utenteApplicativo) {
    WSDMListaProfiliRes wsdmListaProfiliRes = new WSDMListaProfiliRes();
    wsdmListaProfiliRes.setEsito(false);
    wsdmListaProfiliRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmListaProfiliRes;
  }

  @Override
  public WSDMListaAmministrazioniAooRes _listaAmministrazioniAoo(String username, String password) {
    WSDMListaAmministrazioniAooRes wsdmListaAmministrazioniAooRes = new WSDMListaAmministrazioniAooRes();
    wsdmListaAmministrazioniAooRes.setEsito(false);
    wsdmListaAmministrazioniAooRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmListaAmministrazioniAooRes;
  }

  @Override
  public WSDMListaUfficiRes _listaUffici(String username, String password, WSDMLoginAttr loginAttr, String codiceAoo,
      String descrizioneUfficio, String utente) {
    WSDMListaUfficiRes wsdmListaUfficiRes = new WSDMListaUfficiRes();
    wsdmListaUfficiRes.setEsito(false);
    wsdmListaUfficiRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmListaUfficiRes;
  }

  @Override
  public WSDMListaClassificheRes _listaClassifiche(String username, String password, WSDMLoginAttr loginAttr, String codice,
      String descrizione, String voce) {
    WSDMListaClassificheRes wsdmListaClassificheRes = new WSDMListaClassificheRes();
    wsdmListaClassificheRes.setEsito(false);
    wsdmListaClassificheRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmListaClassificheRes;
  }

  @Override
  public WSDMProtocolloModificaRes _protocolloModifica(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloModificaIn wsdmprotocolloModificaIn) {
    WSDMProtocolloModificaRes wsdmprotocolloModificaRes = new WSDMProtocolloModificaRes();
    wsdmprotocolloModificaRes.setEsito(false);
    wsdmprotocolloModificaRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmprotocolloModificaRes;
  }

  @Override
  public WSDMFascicoloModificaRes _fascicoloModifica(String username, String password, WSDMLoginAttr loginAttr,
      WSDMFascicoloModificaIn wsdmfascicoloModificaIn) {
    WSDMFascicoloModificaRes wsdmfascicoloModificaRes = new WSDMFascicoloModificaRes();
    wsdmfascicoloModificaRes.setEsito(false);
    wsdmfascicoloModificaRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmfascicoloModificaRes;
  }

  @Override
  public WSDMAnagraficaLeggiRes _anagraficaLeggi(String username, String password, WSDMLoginAttr loginAttr, String codiceAnagrafica) {
    WSDMAnagraficaLeggiRes wsdmAnagraficaLeggiRes = new WSDMAnagraficaLeggiRes();
    wsdmAnagraficaLeggiRes.setEsito(false);
    wsdmAnagraficaLeggiRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmAnagraficaLeggiRes;
  }

  @Override
  public WSDMDocumentoCollegaRes _documentoCollega(String username, String password, WSDMLoginAttr loginAttr, String numeroDocumentoPadre,
      String numeroDocumentoFiglio, String tipoCollegamento) {
    WSDMDocumentoCollegaRes wsdmDocumentoCollegaRes = new WSDMDocumentoCollegaRes();
    wsdmDocumentoCollegaRes.setEsito(false);
    wsdmDocumentoCollegaRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmDocumentoCollegaRes;
  }

  @Override
  public WSDMListaOperatoriRes _listaOperatori(String username, String password, WSDMLoginAttr loginAttr, String cognome,
      String codiceFiscale) {
    WSDMListaOperatoriRes wsdmListaOperatoriRes = new WSDMListaOperatoriRes();
    wsdmListaOperatoriRes.setEsito(false);
    wsdmListaOperatoriRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmListaOperatoriRes;
  }

  @Override
  public WSDMListaTipiTrasmissioneRes _listaTipiTrasmissione(String username, String password, WSDMLoginAttr loginAttr) {
    WSDMListaTipiTrasmissioneRes wsdmListaTipiTrasmissioneRes = new WSDMListaTipiTrasmissioneRes();
    wsdmListaTipiTrasmissioneRes.setEsito(false);
    wsdmListaTipiTrasmissioneRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmListaTipiTrasmissioneRes;
  }

  @Override
  public WSDMTrasmissioneRes _trasmissione(String username, String password, WSDMLoginAttr loginAttr, WSDMTrasmissioneIn trasmissioneIn) {
    WSDMTrasmissioneRes wsdmTrasmissioneRes = new WSDMTrasmissioneRes();
    wsdmTrasmissioneRes.setEsito(false);
    wsdmTrasmissioneRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmTrasmissioneRes;
  }  
  
  @Override
  public WSDMAggiungiAllegatiRes _aggiungiAllegati(String username, String password, WSDMLoginAttr loginAttr,
      WSDMAggiungiAllegatiIn aggiungiAllegatiIn) {
    WSDMAggiungiAllegatiRes wsdmAggiungiAllegatiRes = new WSDMAggiungiAllegatiRes();
    wsdmAggiungiAllegatiRes.setEsito(false);
    wsdmAggiungiAllegatiRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmAggiungiAllegatiRes;
  }
  
  @Override
  public WSDMListaAccountEmailRes _listaAccountEmail(String username, String password, WSDMLoginAttr loginAttr, WSDMRicercaAccountEmail ricercaAccountEmail) {
    WSDMListaAccountEmailRes wsdmListaAccountEmailRes = new WSDMListaAccountEmailRes();
    wsdmListaAccountEmailRes.setEsito(false);
    wsdmListaAccountEmailRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmListaAccountEmailRes;
  }
  
  @Override
  public WSDMRicercaFascicoloRes _fascicoloRicerca(String username, String password, WSDMLoginAttr loginAttr,
      WSDMRicercaFascicolo ricercaFascicolo) {
    WSDMRicercaFascicoloRes wsdmRicercaFascicoloRes = new WSDMRicercaFascicoloRes();
    wsdmRicercaFascicoloRes.setEsito(false);
    wsdmRicercaFascicoloRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmRicercaFascicoloRes;
  }
  
  @Override
  public WSDMProtocolloDocumentoRes _firmaInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    wsdmprotocolloDocumentoRes.setEsito(false);
    wsdmprotocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmprotocolloDocumentoRes;
  }

  @Override
  public WSDMProtocolloDocumentoRes _firmaVerifica(String username, String password, WSDMLoginAttr loginAttr, String numeroDocumento) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    wsdmprotocolloDocumentoRes.setEsito(false);
    wsdmprotocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmprotocolloDocumentoRes;
  }
  
  @Override
  public WSDMProtocolloDocumentoRes _protocolloAsincronoEsito(String username, String password, WSDMLoginAttr loginAttr, String id) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    wsdmprotocolloDocumentoRes.setEsito(false);
    wsdmprotocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmprotocolloDocumentoRes;
  }
}
