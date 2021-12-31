package it.maggioli.eldasoft.bl.archiflow;

import it.archiflow94.Card;
import it.archiflow94.CardBundle;
import it.archiflow94.Folder;
import it.archiflow94.ResultInfo;
import it.archiflow94.SessionInfo;
import it.maggioli.eldasoft.bl.IWSDMManager;
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
import it.maggioli.eldasoft.ws.dm.WSDMFascicoloDocumento;
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

public class ArchiflowManager implements IWSDMManager {

  private ArchiflowLoginManager     loginManager;
  private ArchiflowFolderManager    folderManager;
  private ArchiflowCardManager      cardManager;
  private ArchiflowPostingManager   postingManager;
  private ArchiflowInterfaceManager itfManager;

  static Logger                     logger     = Logger.getLogger(ArchiflowManager.class);

  static private String             REMOTEWSDM = "java:comp/env/REMOTEWSDM";

  public ArchiflowManager() {

    try {
      loginManager = new ArchiflowLoginManager();
      folderManager = new ArchiflowFolderManager();
      cardManager = new ArchiflowCardManager();
      postingManager = new ArchiflowPostingManager();
      itfManager = new ArchiflowInterfaceManager();

      // Lettura delle configurazione solo se la modalità e' ARCHIFLOW
      String remotewsdm = InitialContext.doLookup(REMOTEWSDM);
      if ("ARCHIFLOW".equals(remotewsdm)) {
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
    Map<String, Integer> sendMailboxIdMap = new HashMap<String, Integer>();

    final String SUFFIX_PROP = "_PROP";
    final String SUFFIX_TYPE = "_TYPE";

    String refErr = "";

    WSDMConfigurazione config = new WSDMConfigurazioneImpl();
    try {
      WSDMConfigurazioneOut conf = config.WSDMConfigurazioneLeggi();
      WSDMTabellato[] tabellati = conf.getTabellati();

      logger.info("_ Start Load configuration _");

      for (WSDMTabellato tab : tabellati) {

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

        if (tab.getNome().equals("userCode")) {
          userCode = new Short(tab.getElementi()[0].getDescrizione());
          logger.info("  userCode = " + userCode);
        }

        if (tab.getNome().equals("indirizzomittente")) {
          for (WSDMTabellatoElemento mailbox : tab.getElementi()) {
            sendMailBoxMap.put(mailbox.getCodice(), mailbox.getDescrizione());
          }
        }

        if (tab.getNome().equals("sendMailboxOptions")) {
          String opt = "";
          for (WSDMTabellatoElemento options : tab.getElementi()) {
            mailOptions.add(options.getCodice());
            opt = opt + options.getCodice() + " ";
          }
          logger.info("   sendMailbox options : [ " + opt + "]");
        }
      }

      for (WSDMTabellato tab : tabellati) {
        if (sendMailBoxMap.containsKey(tab.getNome())) {
          try {
            for (WSDMTabellatoElemento mailbox : tab.getElementi()) {
              if (mailbox.getCodice().equals("id")) {
                int id = Integer.parseInt(mailbox.getDescrizione());
                sendMailboxIdMap.put(tab.getNome(), id);
              }
              if (mailbox.getCodice().equals("cPecChannel")) {
                sendMailBoxChannelMap.put(tab.getNome(), mailbox.getDescrizione());
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
              + sendMailboxIdMap.get(tab.getNome())
              + " ch:"
              + sendMailBoxChannelMap.get(tab.getNome())
              + "]");
        }
      }

      // Tabellati
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

      // Indici
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
    folderManager.setUserCode(userCode);

    postingManager.setUserCode(userCode);
    postingManager.setSendMailBoxList(sendMailBoxMap);
    postingManager.setSendMailBoxChannelList(sendMailBoxChannelMap);
    postingManager.setSendMailboxIdList(sendMailboxIdMap);
    postingManager.setMailOptions(mailOptions);

    logger.info("_ End Load configuration _");
  }

  /**
   * 
   * @param wsdmprotocolloDocumentoIn
   * @param sessionInfo
   * @return
   * @throws ArchiflowException
   */
  private WSDMProtocolloDocumento insertDocument(WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn, Holder<SessionInfo> sessionInfo)
      throws ArchiflowException {
    WSDMProtocolloDocumento wsdmDocumentResult = null;

    CardBundle newCard = itfManager.buildCard(wsdmprotocolloDocumentoIn);
    if (newCard == null) {
      throw new ArchiflowException("buildCard() failed. Some error occurs. Further details on application log.");
    }

    // Identificativo documento in funzione del verso di protocollazione
    short documentTypeId = itfManager.getArchiflowDocumentId(wsdmprotocolloDocumentoIn.getInout());
    newCard.setDocumentTypeId(documentTypeId);

    // Identificativo dell'archivio in funzione del verso di protocollazione
    short archiveId = itfManager.getArchiflowArchiveId(wsdmprotocolloDocumentoIn.getInout());
    newCard.setArchiveId(archiveId);

    // Inserimento della card
    CardBundle insertedCard = cardManager.insertCard(sessionInfo.value.getSessionId(), newCard);

    // Risultato dell'inserimento della card
    wsdmDocumentResult = itfManager.getWSDMProtocolloDocumento(insertedCard, true);

    // Gestione degli allegati (per scelta si considerano tutti allegati, non e'
    // presente alcun documento principale
    if (wsdmprotocolloDocumentoIn.getAllegati() != null) {
      for (WSDMProtocolloAllegato allegato : wsdmprotocolloDocumentoIn.getAllegati()) {
        cardManager.attachDocument(sessionInfo.value.getSessionId(), "" + insertedCard.getCardId(), allegato);

      }
      wsdmDocumentResult.setAllegati(wsdmprotocolloDocumentoIn.getAllegati());
    }

    // Gestione del fascicolo
    if (wsdmprotocolloDocumentoIn.getFascicolo() != null) {
      WSDMFascicolo fascicolo = null;
      Folder folder = null;

      // Inserimento del protocollo in un fascicolo esistente
      if (wsdmprotocolloDocumentoIn.getInserimentoInFascicolo().equals(WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE)) {

        String codiceFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getNumeroFascicolo();

        folder = folderManager.getFolder(sessionInfo.value.getSessionId(), codiceFascicolo, null, null);
        if (folder != null) {
          boolean result = folderManager.AddCardInFolder(sessionInfo.value.getSessionId(), folder.getCode(), insertedCard.getCardId());
          if (result == false) {
            logger.error(String.format("insertDocument : AddCardInFolder  doc:%s -> folder:%s  failed", insertedCard.getCardId(),
                folder.getCode()));
          }
        }
        fascicolo = wsdmprotocolloDocumentoIn.getFascicolo();
      }

      // Inserimento del protocollo in un nuovo fascicolo
      if (wsdmprotocolloDocumentoIn.getInserimentoInFascicolo().equals(WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO)) {

        folder = folderManager.inserisciFascicolo(sessionInfo.value.getSessionId(), wsdmprotocolloDocumentoIn.getFascicolo());

        if (folder != null) {
          boolean result = folderManager.AddCardInFolder(sessionInfo.value.getSessionId(), folder.getCode(), insertedCard.getCardId());
          if (result == false) {
            logger.error(String.format("insertDocument : AddCardInFolder  doc:%s -> folder:%s  failed", insertedCard.getCardId(),
                folder.getCode()));
          }
        }

        fascicolo = itfManager.getWSDMFascicolo(folder);
      }

      wsdmDocumentResult.setFascicolo(fascicolo);

    }
    return wsdmDocumentResult;
  }

  @Override
  public WSDMProtocolloDocumentoRes _protocolloInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {

    WSDMProtocolloDocumentoRes resultDocument = new WSDMProtocolloDocumentoRes();
    resultDocument.setEsito(false);

    Holder<SessionInfo> sessionInfo = new Holder<SessionInfo>(new SessionInfo());

    if (loginManager.archiflowLogin(username, password, sessionInfo) == ResultInfo.OK) {

      try {
        // Inserimento del protocollo
        WSDMProtocolloDocumento newWsdmProtocol = this.insertDocument(wsdmprotocolloDocumentoIn, sessionInfo);

        // Richiesta di inoltro email PEC, si considerano i destinatari gia'
        // identificati come destinatari del protocollo
        if (wsdmprotocolloDocumentoIn.getDestinatari() != null) {
          String[] destinatari = new String[wsdmprotocolloDocumentoIn.getDestinatari().length];
          for (int idx = 0; idx < wsdmprotocolloDocumentoIn.getDestinatari().length; idx++) {
            destinatari[idx] = wsdmprotocolloDocumentoIn.getDestinatari()[idx].getEmail();
          }

          WSDMInviaMail mailDetails = wsdmprotocolloDocumentoIn.getInviaMail();
          if (mailDetails != null) {
            postingManager.setOggettoMail(mailDetails.getOggettoMail());
            postingManager.setTestoMail(mailDetails.getTestoMail());
            postingManager.SendPecMail(sessionInfo.value, mailDetails.getMittenteMail(), newWsdmProtocol.getIdDocumento(), destinatari);
          }
        }

        resultDocument.setProtocolloDocumento(newWsdmProtocol);

        resultDocument.setEsito(true);

        String message = String.format("_protocolloInserisci eseguita : [ NumeroDocumento: %s   Protocollo: %s ]",
            newWsdmProtocol.getNumeroDocumento(), newWsdmProtocol.getNumeroProtocollo());

        resultDocument.setMessaggio(message);

        logger.info(message);

      } catch (ArchiflowException e) {
        resultDocument.setMessaggio(itfManager.getItfErrorMsg() + e.getMessage());
        logger.error(e.getMessage());
      } finally {
        loginManager.archiflowLogout(sessionInfo);
      }

    } else {
      resultDocument.setMessaggio("_protocolloInserisci failure : login error");
    }

    return resultDocument;
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
      } catch (ArchiflowException e) {
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
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {

    WSDMProtocolloDocumentoRes resultDocument = new WSDMProtocolloDocumentoRes();
    resultDocument.setEsito(false);

    Holder<SessionInfo> sessionInfo = new Holder<SessionInfo>(new SessionInfo());

    if (loginManager.archiflowLogin(username, password, sessionInfo) == ResultInfo.OK) {

      try {
        WSDMProtocolloDocumento newWsdmDocument = this.insertDocument(wsdmprotocolloDocumentoIn, sessionInfo);

        newWsdmDocument.setAnnoProtocollo(null);
        newWsdmDocument.setNumeroProtocollo(null);
        newWsdmDocument.setDataProtocollo(null);
        resultDocument.setProtocolloDocumento(newWsdmDocument);

        String message = String.format("_documentoInserisci eseguita : [ docNum: %s ] ", newWsdmDocument.getNumeroDocumento());
        resultDocument.setEsito(true);
        resultDocument.setMessaggio(message);
        logger.info(message);

      } catch (ArchiflowException e) {
        resultDocument.setMessaggio(itfManager.getItfErrorMsg() + e.getMessage());
        logger.error(e.getMessage());
      } finally {
        loginManager.archiflowLogout(sessionInfo);
      }
    } else {
      resultDocument.setMessaggio("_documentoInserisci failure : login error");
    }
    return resultDocument;
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
      } catch (ArchiflowException e) {
        protocolloResult.setMessaggio(e.getMessage());
      } finally {
        loginManager.archiflowLogout(sessionInfo);
      }

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

    WSDMProtocolloDocumentoRes protocolloResult = new WSDMProtocolloDocumentoRes();
    protocolloResult.setEsito(false);

    Holder<SessionInfo> sessionInfo = new Holder<SessionInfo>(new SessionInfo());

    if (loginManager.archiflowLogin(username, password, sessionInfo) == ResultInfo.OK) {
      CardBundle cardResult = null;
      try {
        cardResult = cardManager.getCardByNumber(sessionInfo.value.getSessionId(), numeroDocumento);
        protocolloResult.setEsito(true);
      } catch (ArchiflowException e) {
        protocolloResult.setMessaggio(e.getMessage());
      } finally {
        loginManager.archiflowLogout(sessionInfo);
      }
      protocolloResult.setProtocolloDocumento(itfManager.getWSDMProtocolloDocumento(cardResult, false));
      logger.info("_documentoMetadatiLeggi "
          + protocolloResult.isEsito()
          + "  : "
          + protocolloResult.getProtocolloDocumento().getNumeroProtocollo());
    } else {
      protocolloResult.setMessaggio("_documentoMetadatiLeggi failure : login error");
    }
    return protocolloResult;
  }

  @Override
  public WSDMFascicoloRes _fascicoloInserisci(String username, String password, WSDMLoginAttr loginAttr, WSDMFascicoloIn wsdmfascicoloIn) {

    WSDMFascicoloRes fascicoloResult = new WSDMFascicoloRes();

    Holder<SessionInfo> sessionInfo = new Holder<SessionInfo>(new SessionInfo());

    if (loginManager.archiflowLogin(username, password, sessionInfo) == ResultInfo.OK) {
      try {

        Folder folder = folderManager.inserisciFascicolo(sessionInfo.value.getSessionId(), wsdmfascicoloIn);
        fascicoloResult.setEsito(true);

        WSDMFascicolo fascicolo = itfManager.getWSDMFascicolo(folder);
        fascicoloResult.setFascicolo(fascicolo);

      } catch (ArchiflowException e) {
        fascicoloResult.setMessaggio(e.getMessage());
      } finally {
        loginManager.archiflowLogout(sessionInfo);
      }
    } else {
      fascicoloResult.setMessaggio("_fascicoloInserisci failure : login error");
    }
    return fascicoloResult;
  }

  @Override
  public WSDMFascicoloRes _fascicoloAggiungiDocumento(String username, String password, WSDMLoginAttr loginAttr, String codiceFascicolo,
      String numeroDocumento) {

    WSDMFascicoloRes FascicoloResult = new WSDMFascicoloRes();

    Holder<SessionInfo> sessionInfo = new Holder<SessionInfo>(new SessionInfo());

    if (loginManager.archiflowLogin(username, password, sessionInfo) == ResultInfo.OK) {

      CardBundle cardBundle = null;
      Folder folder = null;

      try {
        cardBundle = cardManager.getCardByNumber(sessionInfo.value.getSessionId(), numeroDocumento);
        folder = folderManager.getFolder(sessionInfo.value.getSessionId(), codiceFascicolo, null, null);

        if (cardBundle != null && folder != null) {
          boolean result = folderManager.AddCardInFolder(sessionInfo.value.getSessionId(), folder.getCode(), cardBundle.getCardId());
          if (result) {
            FascicoloResult.setEsito(true);
            FascicoloResult.setFascicolo(itfManager.getWSDMFascicolo(folder));
          } else {
            FascicoloResult.setEsito(false);
          }
        }

      } catch (ArchiflowException e) {
        logger.error("_fascicoloAggiungiDocumento error : " + e.getMessage());
      } finally {
        loginManager.archiflowLogout(sessionInfo);
      }

    }
    return FascicoloResult;
  }

  @Override
  public WSDMFascicoloRes _fascicoloLeggi(String username, String password, WSDMLoginAttr loginAttr, String codiceFascicolo,
      Long annoFascicolo, String numeroFascicolo, String classificaFascicolo) {

    WSDMFascicoloRes fascicoloResult = new WSDMFascicoloRes();

    Folder folder = null;

    Holder<SessionInfo> sessionInfo = new Holder<SessionInfo>(new SessionInfo());

    if (loginManager.archiflowLogin(username, password, sessionInfo) == ResultInfo.OK) {

      try {
        folder = folderManager.getFolder(sessionInfo.value.getSessionId(), codiceFascicolo, annoFascicolo, numeroFascicolo);

        WSDMFascicolo fascicolo = itfManager.getWSDMFascicolo(folder);

        List<String> cardsList = folder.getCardIds().getGuid();

        WSDMFascicoloDocumento[] documentiArray = new WSDMFascicoloDocumento[cardsList.size()];
        for (int idx = 0; idx < cardsList.size(); idx++) {
          Card card = cardManager.getCardById(sessionInfo.value.getSessionId(), cardsList.get(idx));
          WSDMFascicoloDocumento document = itfManager.getWSDMFascicoloDocumento(card);
          documentiArray[idx] = document;
        }
        fascicolo.setDocumenti(documentiArray);
        fascicoloResult.setFascicolo(fascicolo);
        fascicoloResult.setEsito(true);
        fascicoloResult.setMessaggio("");
      } catch (ArchiflowException e) {

      } finally {
        loginManager.archiflowLogout(sessionInfo);
      }
    } else {
      fascicoloResult.setEsito(false);
      fascicoloResult.setMessaggio("");
    }

    return fascicoloResult;
  }

  @Override
  public WSDMFascicoloRes _fascicoloMetadatiLeggi(String username, String password, WSDMLoginAttr loginAttr, String codiceFascicolo,
      Long annoFascicolo, String numeroFascicolo, String classificaFascicolo) {
    WSDMFascicoloRes fascicoloResult = new WSDMFascicoloRes();

    Folder folder = null;

    Holder<SessionInfo> sessionInfo = new Holder<SessionInfo>(new SessionInfo());

    if (loginManager.archiflowLogin(username, password, sessionInfo) == ResultInfo.OK) {

      try {
        folder = folderManager.getFolder(sessionInfo.value.getSessionId(), codiceFascicolo, annoFascicolo, numeroFascicolo);

        WSDMFascicolo fascicolo = itfManager.getWSDMFascicolo(folder);

        fascicoloResult.setFascicolo(fascicolo);
        fascicoloResult.setEsito(true);
        fascicoloResult.setMessaggio("");
      } catch (ArchiflowException e) {

      } finally {
        loginManager.archiflowLogout(sessionInfo);
      }
    } else {
      fascicoloResult.setEsito(false);
      fascicoloResult.setMessaggio("");
    }

    return fascicoloResult;
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
    wsdmInviaMailRes.setEsito(false);

    CardBundle cardBundle = null;

    Holder<SessionInfo> sessionInfo = new Holder<SessionInfo>(new SessionInfo());

    if (loginManager.archiflowLogin(username, password, sessionInfo) == ResultInfo.OK) {
      try {

        cardBundle = cardManager.getCardByNumber(sessionInfo.value.getSessionId(), wsdmInviaMail.getNumeroDocumento());
        wsdmInviaMail.getMittenteMail();

        postingManager.setOggettoMail(wsdmInviaMail.getOggettoMail());
        postingManager.setTestoMail(wsdmInviaMail.getTestoMail());
        postingManager.SendPecMail(sessionInfo.value, cardBundle.getCardId(), wsdmInviaMail.getMittenteMail(),
            wsdmInviaMail.getDestinatariMail());

        wsdmInviaMailRes.setEsito(true);

      } catch (ArchiflowException e) {
        logger.error("_inviaMail error : " + e.getMessage());
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
}
