package it.maggioli.eldasoft.bl.jprotocol;

import it.maggioli.eldasoft.bl.IWSDMManager;
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
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloAnagrafica;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloDocumento;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloDocumentoIn;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloDocumentoRes;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloInOut;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloModificaIn;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloModificaRes;
import it.maggioli.eldasoft.ws.dm.WSDMRicercaAccountEmail;
import it.maggioli.eldasoft.ws.dm.WSDMRicercaFascicolo;
import it.maggioli.eldasoft.ws.dm.WSDMRicercaFascicoloRes;
import it.maggioli.eldasoft.ws.dm.WSDMTrasmissioneIn;
import it.maggioli.eldasoft.ws.dm.WSDMTrasmissioneRes;
import it.maggioli.eldasoft.ws.dm.WSDMVerificaMailRes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.ws.WebServiceException;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.message.Message;
import org.apache.log4j.Logger;

import com.jprotocol.webservices.Allegato;
import com.jprotocol.webservices.ElencoDocumenti;
import com.jprotocol.webservices.Fascicolo;
import com.jprotocol.webservices.MailServiceRequest;
import com.jprotocol.webservices.MailServiceResponse;
import com.jprotocol.webservices.MittDest;
import com.jprotocol.webservices.MittDestEstesi;
import com.jprotocol.webservices.ProtSilenteResult;
import com.jprotocol.webservices.Protocolla;
import com.jprotocol.webservices.ProtocollaV2;
import com.jprotocol.webservices.ProtocolloDaRegistrare;
import com.jprotocol.webservices.ProtocolloDaRegistrareV2;
import com.jprotocol.webservices.UfficiAssegnati;
import com.jprotocol.webservices.UrlDownloadAllegato;
import com.jprotocol.webservices.WsElencoDocumenti;
import com.jprotocol.webservices.WsElencoDocumenti_Service;
import com.jprotocol.webservices.WsFascicoli;
import com.jprotocol.webservices.WsFascicoli_Service;
import com.jprotocol.webservices.WsProtocollaSilente;
import com.jprotocol.webservices.WsProtocollaSilente_Service;
import com.jprotocol.webservices.WsSendMail;
import com.jprotocol.webservices.WsSendMail_Service;

/**
 * Manager per la gestione documentale mediante sistema di protocollo ARXIVAR.
 * 
 */

public class JProtocolManager implements IWSDMManager {

  static Logger         logger                           = Logger.getLogger(JProtocolManager.class);

  static private String JPROTOCOL_WSPROTOCOLLASILENTE    = "java:comp/env/JPROTOCOL_WSPROTOCOLLASILENTE";
  static private String JPROTOCOL_WSPROTOCOLLASILENTE_ND = "JPROTOCOL: l'indirizzo del servizio protocollo non e' definito";

  static private String JPROTOCOL_WSELENCODOCUMENTI      = "java:comp/env/JPROTOCOL_WSELENCODOCUMENTI";
  static private String JPROTOCOL_WSELENCODOCUMENTI_ND   = "JPROTOCOL: l'indirizzo del servizio documenti non e' definito";

  static private String JPROTOCOL_WSSENDMAIL             = "java:comp/env/JPROTOCOL_WSSENDMAIL";
  static private String JPROTOCOL_WSSENDMAIL_ND          = "JPROTOCOL: l'indirizzo del servizio mail non e' definito";

  static private String JPROTOCOL_WSFASCICOLI            = "java:comp/env/JPROTOCOL_WSFASCICOLI";
  static private String JPROTOCOL_WSFASCICOLI_ND         = "JPROTOCOL: l'indirizzo del servizio fascicoli non e' definito";

  static private String JPROTOCOL_TOKEN                  = "java:comp/env/JPROTOCOL_TOKEN";
  static private String JPROTOCOL_PROTOCOLLATORE_ENTRATA = "java:comp/env/JPROTOCOL_PROTOCOLLATORE_ENTRATA";
  static private String JPROTOCOL_PROTOCOLLATORE_USCITA  = "java:comp/env/JPROTOCOL_PROTOCOLLATORE_USCITA";
  static private String JPROTOCOL_PROTOCOLLATORE_INTERNO = "java:comp/env/JPROTOCOL_PROTOCOLLATORE_INTERNO";
  static private String JPROTOCOL_CODUFFMITTINTERNO      = "java:comp/env/JPROTOCOL_CODUFFMITTINTERNO";
  static private String JPROTOCOL_TIPOLOGIADOC           = "java:comp/env/JPROTOCOL_TIPOLOGIADOC";
  static private String JPROTOCOL_CATDOC                 = "java:comp/env/JPROTOCOL_CATDOC";
  static private String JPROTOCOL_CODICEMAILSERVER       = "java:comp/env/JPROTOCOL_CODICEMAILSERVER";
  static private String JPROTOCOL_GRADO_RISERVATEZZA     = "java:comp/env/JPROTOCOL_GRADO_RISERVATEZZA";
  static private String JPROTOCOL_MITTDEST_TIPOLOGIA     = "java:comp/env/JPROTOCOL_MITTDEST_TIPOLOGIA";

  static private String JPROTOCOL_ENTRATA                = "E";
  static private String JPROTOCOL_INTERNO                = "I";
  static private String JPROTOCOL_USCITA                 = "U";

  private WsProtocollaSilente getWsProtocollaSilente() throws Exception {
    String address = InitialContext.doLookup(JPROTOCOL_WSPROTOCOLLASILENTE);
    if (address == null || (address != null && "".equals(address.trim()))) {
      throw new Exception(JPROTOCOL_WSPROTOCOLLASILENTE_ND);
    }
    WsProtocollaSilente_Service service = new WsProtocollaSilente_Service();
    WsProtocollaSilente port = service.getWsProtocollaSilentePort();
    Client client = ClientProxy.getClient(port);
    client.getRequestContext().put(Message.ENDPOINT_ADDRESS, address);
    client.getRequestContext().put(Message.RECEIVE_TIMEOUT, 30 * 60 * 1000);
    return port;
  }

  private WsElencoDocumenti getWsElencoDocumenti() throws Exception {
    String address = InitialContext.doLookup(JPROTOCOL_WSELENCODOCUMENTI);
    if (address == null || (address != null && "".equals(address.trim()))) {
      throw new Exception(JPROTOCOL_WSELENCODOCUMENTI_ND);
    }
    WsElencoDocumenti_Service service = new WsElencoDocumenti_Service();
    WsElencoDocumenti port = service.getWsElencoDocumentiPort();
    Client client = ClientProxy.getClient(port);
    client.getRequestContext().put(Message.ENDPOINT_ADDRESS, address);
    client.getRequestContext().put(Message.RECEIVE_TIMEOUT, 30 * 60 * 1000);
    return port;
  }

  private WsSendMail getWsSendMail() throws Exception {
    String address = InitialContext.doLookup(JPROTOCOL_WSSENDMAIL);
    if (address == null || (address != null && "".equals(address.trim()))) {
      throw new Exception(JPROTOCOL_WSSENDMAIL_ND);
    }
    WsSendMail_Service service = new WsSendMail_Service();
    WsSendMail port = service.getWsSendMailPort();
    Client client = ClientProxy.getClient(port);
    client.getRequestContext().put(Message.ENDPOINT_ADDRESS, address);
    client.getRequestContext().put(Message.RECEIVE_TIMEOUT, 30 * 60 * 1000);
    return port;
  }

  private WsFascicoli getWsFascicoli() throws Exception {
    String address = InitialContext.doLookup(JPROTOCOL_WSFASCICOLI);
    if (address == null || (address != null && "".equals(address.trim()))) {
      throw new Exception(JPROTOCOL_WSFASCICOLI_ND);
    }
    WsFascicoli_Service service = new WsFascicoli_Service();
    WsFascicoli port = service.getWsFascicoliPort();
    Client client = ClientProxy.getClient(port);
    client.getRequestContext().put(Message.ENDPOINT_ADDRESS, address);
    client.getRequestContext().put(Message.RECEIVE_TIMEOUT, 30 * 60 * 1000);
    return port;
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
  public WSDMProtocolloDocumentoRes _protocolloInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (JProtocolUtilityControllo.ctrProtocolloInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {

        boolean esito = true;
        String codiceFascicolo = null;
        Long annoFascicolo = null;
        String numeroFascicolo = null;

        // Eventuale creazione di un nuovo fascicolo
        if (WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
          String oggettoFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getOggettoFascicolo();
          String classificaFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getClassificaFascicolo();
          String descrizioneFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getDescrizioneFascicolo();
          WSDMFascicoloIn wsdmFascicoloIn = new WSDMFascicoloIn();
          wsdmFascicoloIn.setOggettoFascicolo(oggettoFascicolo);
          wsdmFascicoloIn.setClassificaFascicolo(classificaFascicolo);
          wsdmFascicoloIn.setDescrizioneFascicolo(descrizioneFascicolo);
          WSDMFascicoloRes wsdmFascicoloRes = this._fascicoloInserisci(username, password, loginAttr, wsdmFascicoloIn);
          if (!wsdmFascicoloRes.isEsito()) {
            esito = false;
            wsdmprotocolloDocumentoRes.setEsito(false);
            wsdmprotocolloDocumentoRes.setMessaggio("fascicolo: " + wsdmFascicoloRes.getMessaggio());
          } else {
            annoFascicolo = wsdmFascicoloRes.getFascicolo().getAnnoFascicolo();
            numeroFascicolo = wsdmFascicoloRes.getFascicolo().getNumeroFascicolo();
          }
        }

        // Eventuale associazione con fascicolo gia' esistente.
        // In questo caso e' necessario conoscere solamente il codice fascicolo
        if (wsdmprotocolloDocumentoIn.getInserimentoInFascicolo().equals(WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE)) {
          annoFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getAnnoFascicolo();
          numeroFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getNumeroFascicolo();
        }

        // Inserimento dell'elemento documentale nel protocollo
        if (esito) {

          ProtocollaV2 protocolla = new ProtocollaV2();
          ProtocolloDaRegistrareV2 protocollaDaRegistrare = new ProtocolloDaRegistrareV2();
          protocolla.setNuovoRecord(protocollaDaRegistrare);

          // Corrispondenti
          if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
            WSDMProtocolloAnagrafica[] anagrafiche = wsdmprotocolloDocumentoIn.getMittenti();
            List<MittDestEstesi> listMittDest = protocollaDaRegistrare.getListaCorrispondenti();
            _gestioneCorrispondenti(anagrafiche, listMittDest);
          } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
            WSDMProtocolloAnagrafica[] anagrafiche = wsdmprotocolloDocumentoIn.getDestinatari();
            List<MittDestEstesi> listMittDest = protocollaDaRegistrare.getListaCorrispondenti();
            _gestioneCorrispondenti(anagrafiche, listMittDest);
          } else {
            List<MittDestEstesi> listMittDest = protocollaDaRegistrare.getListaCorrispondenti();
            MittDestEstesi mittDest = new MittDestEstesi();
            mittDest.setCorrispondente("");
            mittDest.setCognome("");
            mittDest.setNome("");
            mittDest.setCf("");
            mittDest.setIndirizzo("");
            mittDest.setCitta("");
            mittDest.setProv("");
            mittDest.setCap("");
            mittDest.setDenominazione("");
            mittDest.setNome("");
            
            // 23/03/2020, aggiunta gestione email con la versione V2 del protocollo.
            mittDest.setMailPEC("");
            
            // 23/03/2020, gestione della tipologia di mittente destinatario
            try {
              String tipologia = InitialContext.doLookup(JPROTOCOL_MITTDEST_TIPOLOGIA);
              mittDest.setTipologia(Integer.parseInt(tipologia));
            } catch (Exception e) {
              logger.error("Errore (_protocolloInserisci)", e);
            }
            
            listMittDest.add(mittDest);
          }

          // Verso
          if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
            protocollaDaRegistrare.setVerso(JPROTOCOL_ENTRATA);
          } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
            protocollaDaRegistrare.setVerso(JPROTOCOL_USCITA);
          } else if (WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
            protocollaDaRegistrare.setVerso(JPROTOCOL_INTERNO);
          }

          // Codice titolario/classifica
          if (wsdmprotocolloDocumentoIn.getClassifica() != null) {
            protocollaDaRegistrare.setCodTit(wsdmprotocolloDocumentoIn.getClassifica());
          }

          // Oggetto
          if (wsdmprotocolloDocumentoIn.getOggetto() != null) {
            protocollaDaRegistrare.setOggetto(wsdmprotocolloDocumentoIn.getOggetto());
          }

          // Protocollatore
          String protocollatore = null;
          if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
            protocollatore = InitialContext.doLookup(JPROTOCOL_PROTOCOLLATORE_ENTRATA);
          } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
            protocollatore = InitialContext.doLookup(JPROTOCOL_PROTOCOLLATORE_USCITA);
          } else if (WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
            protocollatore = InitialContext.doLookup(JPROTOCOL_PROTOCOLLATORE_INTERNO);
          }
          protocollaDaRegistrare.setProtocollatore(protocollatore);

          // Codice ufficio mittente
          if (WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
            String codUffMittInteno = InitialContext.doLookup(JPROTOCOL_CODUFFMITTINTERNO);
            protocollaDaRegistrare.setCodUffMittInterno(codUffMittInteno);
          }

          // Ufficio assegnatario
          List<UfficiAssegnati> listUfficiAssegnati = protocollaDaRegistrare.getUffAss();
          if (wsdmprotocolloDocumentoIn.getStruttura() != null && wsdmprotocolloDocumentoIn.getTipoAssegnazione() != null) {
            UfficiAssegnati ufficioAssegnato = new UfficiAssegnati();
            ufficioAssegnato.setCodUfficio(wsdmprotocolloDocumentoIn.getStruttura());
            try {
              ufficioAssegnato.setTipoAssegnazione(Integer.parseInt(wsdmprotocolloDocumentoIn.getTipoAssegnazione()));
            } catch (Exception e) {
              logger.error("Errore (_protocolloInserisci)", e);
            }
            listUfficiAssegnati.add(ufficioAssegnato);
          }

          // Grado riservatezza
          try {
            String gradoRiservatezza = InitialContext.doLookup(JPROTOCOL_GRADO_RISERVATEZZA);
            protocollaDaRegistrare.setGradoRiservatezza(Integer.parseInt(gradoRiservatezza));
          } catch (Exception e) {
            logger.error("Errore (_protocolloInserisci)", e);
          }
          
          // Mezzo di trasmissione
          try {
            String tipoDoc = InitialContext.doLookup(JPROTOCOL_TIPOLOGIADOC);
            protocollaDaRegistrare.setTipoDoc(Integer.parseInt(tipoDoc));
          } catch (Exception e) {
            logger.error("Errore (_protocolloInserisci)", e);
          }

          // Categoria documento, solo per protocolli in uscita
          try {
            String catDoc = InitialContext.doLookup(JPROTOCOL_CATDOC);
            protocollaDaRegistrare.setCatDoc(Integer.parseInt(catDoc));
          } catch (Exception e) {
            logger.error("Errore (_protocolloInserisci)", e);
          }

          // Documento e allegati
          WSDMProtocolloAllegato[] wsdmAllegati = wsdmprotocolloDocumentoIn.getAllegati();
          if (wsdmAllegati != null && wsdmAllegati.length > 0) {

            // Documento principale
            protocollaDaRegistrare.setFileDocumento(wsdmAllegati[0].getContenuto());

            // Descrizione documento
            protocollaDaRegistrare.setDescrizioneDocumento(wsdmAllegati[0].getTitolo());

            // Estensione file
            // 04/06/2020. Si chiede di ignorare l'estensione indicata dai client Appalti e Portale
            // e di estrarre l'estensione completa dal primo punto in poi.
            String nomeDocumentoPrincipale = wsdmAllegati[0].getNome();
            int idp = nomeDocumentoPrincipale.indexOf(".");
            if (idp >= 0) {
              String estensioneDocumentoPrincipale = nomeDocumentoPrincipale.substring(idp + 1);
              protocollaDaRegistrare.setEstensioneFile(estensioneDocumentoPrincipale);
            } else {
              protocollaDaRegistrare.setEstensioneFile("");
            }

            // Nome file
            protocollaDaRegistrare.setNomeFile(wsdmAllegati[0].getNome());

            // Ulteriori allegati
            if (wsdmAllegati.length > 1) {

              protocollaDaRegistrare.setAllegati(true);

              List<Allegato> listAllegati = protocollaDaRegistrare.getFileAllegati();
              for (int a = 1; a < wsdmAllegati.length; a++) {
                Allegato allegato = new Allegato();
                allegato.setContenutoBinario(wsdmAllegati[a].getContenuto());
                allegato.setDescrizione(wsdmAllegati[a].getTitolo());
                
                // Estensione file
                // 04/06/2020. Si chiede di ignorare l'estensione indicata dai client Appalti e Portale
                // e di estrarre l'estensione completa dal primo punto in poi.
                String nomeAllegato = wsdmAllegati[a].getNome();
                int ida = nomeAllegato.indexOf(".");
                if (ida >= 0) {
                  String estensioneAllegato = nomeAllegato.substring(ida + 1);
                  allegato.setEstensione(estensioneAllegato);
                } else {
                  allegato.setEstensione("");
                }
                
                allegato.setNomeFile(wsdmAllegati[a].getNome());
                listAllegati.add(allegato);
              }
            } else {
              protocollaDaRegistrare.setAllegati(false);
            }

          }

          ProtSilenteResult protSilenteResult = this.getWsProtocollaSilente().protocollaV2(protocollaDaRegistrare);
          int codErrore = protSilenteResult.getCodErrore();

          // 0 = Ok
          // -1 = Errore generico
          // -2 = Origine/Verso non indicata
          // -3 = Errore sui mittenti o i destinatari: o Mittente non unico o
          // Ufficio non assegnato (se Verso = I) o Mittente o Destinatario non
          // indicato Oppure errore sull’assegnazione delle competenze agli
          // uffici: o Nessun Ufficio per il verso indicato o Ufficio competente
          // mancante o non unico
          // -4 = Oggetto non indicato
          // -5 = Titolario non indicato

          if (codErrore == 0) {
            WSDMProtocolloDocumento wsdmprotocolloDocumento = new WSDMProtocolloDocumento();
            wsdmprotocolloDocumento.setAnnoProtocollo(new Long(protSilenteResult.getAnnoProt()));
            wsdmprotocolloDocumento.setNumeroProtocollo(protSilenteResult.getNumeroProtocollo());
            Calendar dataProtocolloToday = Calendar.getInstance();
            wsdmprotocolloDocumento.setDataProtocollo(dataProtocolloToday.getTime());
            wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmprotocolloDocumento);
            wsdmprotocolloDocumentoRes.setEsito(true);
            esito = true;
          } else {
            wsdmprotocolloDocumentoRes.setEsito(false);
            String messaggio = "Errore durante l'inserimento del protocollo";
            switch (codErrore) {
            case -1:
              messaggio += " (" + codErrore + " - Errore generico)";
              break;
            case -2:
              messaggio += " (" + codErrore + " - Origine/Verso non indicata)";
              break;
            case -3:
              messaggio += " ("
                  + codErrore
                  + " - Errore sui mittenti o i destinatari: o Mittente non unico o Ufficio non assegnato, se Verso = I, o Mittente o Destinatario non indicato Oppure errore sull’assegnazione delle competenze agli uffici: o Nessun Ufficio per il verso indicato o Ufficio competente mancante o non unico)";
              break;
            case -4:
              messaggio += " (" + codErrore + " - Oggetto non indicato)";
              break;
            case -5:
              messaggio += " (" + codErrore + " - Titolario non indicato)";
              break;

            }

            if (protSilenteResult.getDesErrore() != null) messaggio += " " + protSilenteResult.getDesErrore();

            wsdmprotocolloDocumentoRes.setMessaggio(messaggio);
            esito = false;
          }

        }

        // Eventuale associazione del nuovo elemento documentale al fascicolo
        // (nuovo o esistente)
        if (esito) {
          if (WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())
              || WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {

            // Token
            String token = InitialContext.doLookup(JPROTOCOL_TOKEN);

            Long annoProtocollo = wsdmprotocolloDocumentoRes.getProtocolloDocumento().getAnnoProtocollo();
            String numeroProtocollo = wsdmprotocolloDocumentoRes.getProtocolloDocumento().getNumeroProtocollo();

            int associaFascicoloRes = this.getWsFascicoli().assegnaFascicolo(token, String.valueOf(annoProtocollo), numeroProtocollo,
                String.valueOf(annoFascicolo), numeroFascicolo, "F");

            // Il metodo restituisce un numero intero indicante l’esito
            // dell’operazione così codificato:
            // 0 = OK
            // -1 = errore generico
            // -2 = errore, parametri mancanti
            // -3 = errore, fascicolo inesistente
            // -4 = errore, protocollo già fascicolato

            if (associaFascicoloRes == 0) {
              WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();
              wsdmFascicolo.setAnnoFascicolo(annoFascicolo);
              wsdmFascicolo.setNumeroFascicolo(numeroFascicolo);
              wsdmprotocolloDocumentoRes.getProtocolloDocumento().setFascicolo(wsdmFascicolo);
            } else {
              wsdmprotocolloDocumentoRes.setEsito(false);
              String messaggio = "Errore nell'associazione al fascicolo";
              switch (associaFascicoloRes) {
              case -1:
                messaggio += " (" + associaFascicoloRes + " - Errore generico)";
                break;
              case -2:
                messaggio += " (" + associaFascicoloRes + " - Errore, parametri mancanti)";
                break;
              case -3:
                messaggio += " (" + associaFascicoloRes + " - Errore, fascicolo inesistente)";
                break;
              case -4:
                messaggio += " (" + associaFascicoloRes + " - Errore, protocollo gia' fascicolato)";
                break;

              }
              wsdmprotocolloDocumentoRes.setMessaggio(messaggio);
            }
          }
        }
      } else {
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
      }
    } catch (WebServiceException w) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_protocolloInserisci)", w);
    } catch (NamingException e) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_protocolloInserisci)", e);
    } catch (Throwable t) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(t.getMessage());
      logger.error("Errore (_protocolloInserisci)", t);
    }

    return wsdmprotocolloDocumentoRes;
  }

  /**
   * Gestione dei corrispondenti.
   * 
   * @param anagrafiche
   * @param listMittDest
   */
  private void _gestioneCorrispondenti(WSDMProtocolloAnagrafica[] anagrafiche, List<MittDestEstesi> listMittDest) {
    if (anagrafiche != null) {
      for (int a = 0; a < anagrafiche.length; a++) {
        WSDMProtocolloAnagrafica anagrafica = anagrafiche[a];
        MittDestEstesi mittDest = new MittDestEstesi();
        mittDest.setCorrispondente(anagrafica.getCognomeointestazione());
        mittDest.setCognome(anagrafica.getCognomeointestazione());
        mittDest.setNome(anagrafica.getNome());
        mittDest.setCf(anagrafica.getCodiceFiscale());

        String indirizzoResidenza = anagrafica.getIndirizzoResidenza();
        if (anagrafica.getLocalitaResidenza() != null) {
          indirizzoResidenza += " " + anagrafica.getLocalitaResidenza();
        }
        mittDest.setIndirizzo(indirizzoResidenza);
        mittDest.setCitta(anagrafica.getComuneResidenza());
        mittDest.setProv(anagrafica.getProvinciaResidenza());
        mittDest.setCap(anagrafica.getCapResidenza());

        mittDest.setDenominazione("");
        mittDest.setNome("");

        // 23/03/2020, gestione dell'indirizzo email con la versione V2 del protocollo.
        mittDest.setMailPEC(anagrafica.getEmail());
        
        // 23/03/2020, gestione della tipologia di mittente destinatario
        try {
          String tipologia = InitialContext.doLookup(JPROTOCOL_MITTDEST_TIPOLOGIA);
          mittDest.setTipologia(Integer.parseInt(tipologia));
        } catch (Exception e) {
          logger.error("Errore (_protocolloInserisci)", e);
        }
        
        listMittDest.add(mittDest);
      }

    }
  }

  @Override
  public WSDMProtocolloDocumentoRes _protocolloLeggi(String username, String password, WSDMLoginAttr loginAttr, Long annoProtocollo,
      String numeroProtocollo) {

    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (JProtocolUtilityControllo.ctrProtocolloLeggi(loginAttr, annoProtocollo, numeroProtocollo, messaggioCtr)) {

        // Token
        String token = InitialContext.doLookup(JPROTOCOL_TOKEN);

        String uor = loginAttr.getCodiceUO();

        List<ElencoDocumenti> resDocumenti = this.getWsElencoDocumenti().list(token, uor, "", "", "", "", annoProtocollo.toString(),
            annoProtocollo.toString(), numeroProtocollo, numeroProtocollo);

        if (resDocumenti != null && resDocumenti.size() > 0) {

          wsdmprotocolloDocumentoRes.setEsito(true);
          WSDMProtocolloDocumento wsdmProtocolloDocumento = new WSDMProtocolloDocumento();

          ElencoDocumenti resDocumento = resDocumenti.get(0);

          // Anno protocollo
          wsdmProtocolloDocumento.setAnnoProtocollo(Long.parseLong(resDocumento.getAnnoProtocollo()));

          // Data protocollo
          try {
            String resDocumentoDataProtocollo = resDocumento.getDataProtocollo();
            Date dataProtocollo = new SimpleDateFormat("dd/mm/yyyy hh24:mi:ss").parse(resDocumentoDataProtocollo);
            wsdmProtocolloDocumento.setDataProtocollo(dataProtocollo);
          } catch (Exception e) {

          }

          // Verso del protocollo
          String resDocumentoVersoProtocollo = resDocumento.getVersoProtocollo();
          if (JPROTOCOL_ENTRATA.equals(resDocumentoVersoProtocollo)) {
            wsdmProtocolloDocumento.setInout(WSDMProtocolloInOut.IN);
          } else if (JPROTOCOL_USCITA.equals(resDocumentoVersoProtocollo)) {
            wsdmProtocolloDocumento.setInout(WSDMProtocolloInOut.OUT);
          } else if (JPROTOCOL_INTERNO.equals(resDocumentoVersoProtocollo)) {
            wsdmProtocolloDocumento.setInout(WSDMProtocolloInOut.INT);
          }

          // Numero protocollo
          wsdmProtocolloDocumento.setNumeroProtocollo(resDocumento.getNumeroProtocollo());

          // Oggetto
          wsdmProtocolloDocumento.setOggetto(resDocumento.getOggetto());

          // Classifica/titolario e descrizione associata
          wsdmProtocolloDocumento.setClassifica(resDocumento.getCodTitolario());
          wsdmProtocolloDocumento.setClassificaDescrizione(resDocumento.getDescrTitolario());

          // Corrispondente
          WSDMProtocolloAnagrafica[] wsdmProtocolloAnagrafica = new WSDMProtocolloAnagrafica[1];
          wsdmProtocolloAnagrafica[0] = new WSDMProtocolloAnagrafica();
          wsdmProtocolloAnagrafica[0].setCognomeointestazione(resDocumento.getCorrispondente());
          if (JPROTOCOL_ENTRATA.equals(resDocumentoVersoProtocollo)) {
            wsdmProtocolloDocumento.setMittenti(wsdmProtocolloAnagrafica);
          } else if (JPROTOCOL_USCITA.equals(resDocumentoVersoProtocollo)) {
            wsdmProtocolloDocumento.setDestinatari(wsdmProtocolloAnagrafica);
          }

          // Documento principale ed allegati
          int numeroDocumenti = 1;
          List<UrlDownloadAllegato> listUrlDownloadAllegato = resDocumento.getUrlDownloadAllegati();
          if (listUrlDownloadAllegato != null && listUrlDownloadAllegato.size() > 0) {
            numeroDocumenti += resDocumento.getUrlDownloadAllegati().size();
          }

          WSDMProtocolloAllegato[] wsdmProtocolloAllegato = new WSDMProtocolloAllegato[numeroDocumenti];

          wsdmProtocolloAllegato[0] = new WSDMProtocolloAllegato();
          wsdmProtocolloAllegato[0].setTitolo(resDocumento.getDescrizioneDocumento());
          wsdmProtocolloAllegato[0].setTipo(resDocumento.getEstensioneDocumento());
          wsdmProtocolloAllegato[0].setNome(resDocumento.getNomeFile());
          wsdmProtocolloAllegato[0].setUrlDownload(resDocumento.getUrlDownloadDocumento());
          wsdmProtocolloAllegato[0].setContenuto(null);

          if (listUrlDownloadAllegato != null && listUrlDownloadAllegato.size() > 0) {
            for (int a = 0; a < listUrlDownloadAllegato.size(); a++) {
              wsdmProtocolloAllegato[a + 1] = new WSDMProtocolloAllegato();
              wsdmProtocolloAllegato[a + 1].setTitolo(listUrlDownloadAllegato.get(a).getDescrizione());
              wsdmProtocolloAllegato[a + 1].setTipo(listUrlDownloadAllegato.get(a).getEstensione());
              wsdmProtocolloAllegato[a + 1].setNome(listUrlDownloadAllegato.get(a).getNomeFile());
              wsdmProtocolloAllegato[a + 1].setUrlDownload(listUrlDownloadAllegato.get(a).getUrlAllegato());
              wsdmProtocolloAllegato[a + 1].setContenuto(null);
            }
          }

          wsdmProtocolloDocumento.setAllegati(wsdmProtocolloAllegato);
          
          wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmProtocolloDocumento);

        } else {
          wsdmprotocolloDocumentoRes.setEsito(false);
          wsdmprotocolloDocumentoRes.setMessaggio("Nessun protocollo trovato.");
        }

      } else {
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (WebServiceException w) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_protocolloLeggi)", w);
    } catch (NamingException e) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_protocolloLeggi)", e);
    } catch (Throwable t) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(t.getMessage());
      logger.error("Errore (_protocolloLeggi)", t);
    }

    return wsdmprotocolloDocumentoRes;
  }

  @Override
  public WSDMProtocolloDocumentoRes _documentoInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (JProtocolUtilityControllo.ctrDocumentoInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {

        boolean esito = true;
        String codiceFascicolo = null;
        Long annoFascicolo = null;
        String numeroFascicolo = null;

        // Eventuale creazione di un nuovo fascicolo
        if (WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
          String oggettoFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getOggettoFascicolo();
          String classificaFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getClassificaFascicolo();
          String descrizioneFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getDescrizioneFascicolo();
          WSDMFascicoloIn wsdmFascicoloIn = new WSDMFascicoloIn();
          wsdmFascicoloIn.setOggettoFascicolo(oggettoFascicolo);
          wsdmFascicoloIn.setClassificaFascicolo(classificaFascicolo);
          wsdmFascicoloIn.setDescrizioneFascicolo(descrizioneFascicolo);
          WSDMFascicoloRes wsdmFascicoloRes = this._fascicoloInserisci(username, password, loginAttr, wsdmFascicoloIn);
          if (!wsdmFascicoloRes.isEsito()) {
            esito = false;
            wsdmprotocolloDocumentoRes.setEsito(false);
            wsdmprotocolloDocumentoRes.setMessaggio("fascicolo: " + wsdmFascicoloRes.getMessaggio());
          } else {
            annoFascicolo = wsdmFascicoloRes.getFascicolo().getAnnoFascicolo();
            numeroFascicolo = wsdmFascicoloRes.getFascicolo().getNumeroFascicolo();
          }
        }

        // Eventuale associazione con fascicolo gia' esistente.
        // In questo caso e' necessario conoscere solamente il codice fascicolo
        if (wsdmprotocolloDocumentoIn.getInserimentoInFascicolo().equals(WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE)) {
          annoFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getAnnoFascicolo();
          numeroFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getNumeroFascicolo();
        }

        // Inserimento dell'elemento documentale nel protocollo
        if (esito) {

          ProtocollaV2 protocolla = new ProtocollaV2();
          ProtocolloDaRegistrareV2 protocollaDaRegistrare = new ProtocolloDaRegistrareV2();
          protocolla.setNuovoRecord(protocollaDaRegistrare);

          // Corrispondenti
          if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
            WSDMProtocolloAnagrafica[] anagrafiche = wsdmprotocolloDocumentoIn.getMittenti();
            List<MittDestEstesi> listMittDest = protocollaDaRegistrare.getListaCorrispondenti();
            _gestioneCorrispondenti(anagrafiche, listMittDest);
          } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
            WSDMProtocolloAnagrafica[] anagrafiche = wsdmprotocolloDocumentoIn.getDestinatari();
            List<MittDestEstesi> listMittDest = protocollaDaRegistrare.getListaCorrispondenti();
            _gestioneCorrispondenti(anagrafiche, listMittDest);
          } else {
            List<MittDestEstesi> listMittDest = protocollaDaRegistrare.getListaCorrispondenti();
            MittDestEstesi mittDest = new MittDestEstesi();
            mittDest.setCorrispondente("");
            mittDest.setCognome("");
            mittDest.setNome("");
            mittDest.setCf("");
            mittDest.setIndirizzo("");
            mittDest.setCitta("");
            mittDest.setProv("");
            mittDest.setCap("");
            mittDest.setDenominazione("");
            mittDest.setNome("");

            // 23/03/2020, gestione dell'indirizzo email con la versione V2 del protocollo.
            mittDest.setMailPEC("");
            
            // 23/03/2020, gestione della tipologia di mittente destinatario
            try {
              String tipologia = InitialContext.doLookup(JPROTOCOL_MITTDEST_TIPOLOGIA);
              mittDest.setTipologia(Integer.parseInt(tipologia));
            } catch (Exception e) {
              logger.error("Errore (_protocolloInserisci)", e);
            }

            listMittDest.add(mittDest);
          }

          // Verso
          if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
            protocollaDaRegistrare.setVerso(JPROTOCOL_ENTRATA);
          } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
            protocollaDaRegistrare.setVerso(JPROTOCOL_USCITA);
          } else if (WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
            protocollaDaRegistrare.setVerso(JPROTOCOL_INTERNO);
          }

          // Codice titolario/classifica
          if (wsdmprotocolloDocumentoIn.getClassifica() != null) {
            protocollaDaRegistrare.setCodTit(wsdmprotocolloDocumentoIn.getClassifica());
          }

          // Oggetto
          if (wsdmprotocolloDocumentoIn.getOggetto() != null) {
            protocollaDaRegistrare.setOggetto(wsdmprotocolloDocumentoIn.getOggetto());
          }

          // Protocollatore
          String protocollatore = null;
          if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
            protocollatore = InitialContext.doLookup(JPROTOCOL_PROTOCOLLATORE_ENTRATA);
          } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
            protocollatore = InitialContext.doLookup(JPROTOCOL_PROTOCOLLATORE_USCITA);
          } else if (WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
            protocollatore = InitialContext.doLookup(JPROTOCOL_PROTOCOLLATORE_INTERNO);
          }
          protocollaDaRegistrare.setProtocollatore(protocollatore);

          // Codice ufficio mittente
          if (WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
            String codUffMittInteno = InitialContext.doLookup(JPROTOCOL_CODUFFMITTINTERNO);
            protocollaDaRegistrare.setCodUffMittInterno(codUffMittInteno);
          }

          // Ufficio assegnatario
          List<UfficiAssegnati> listUfficiAssegnati = protocollaDaRegistrare.getUffAss();
          if (wsdmprotocolloDocumentoIn.getStruttura() != null && wsdmprotocolloDocumentoIn.getTipoAssegnazione() != null) {
            UfficiAssegnati ufficioAssegnato = new UfficiAssegnati();
            ufficioAssegnato.setCodUfficio(wsdmprotocolloDocumentoIn.getStruttura());
            try {
              ufficioAssegnato.setTipoAssegnazione(Integer.parseInt(wsdmprotocolloDocumentoIn.getTipoAssegnazione()));
            } catch (Exception e) {
              logger.error("Errore (_documentoInserisci)", e);
            }
            listUfficiAssegnati.add(ufficioAssegnato);
          }

          // Grado riservatezza
          try {
            String gradoRiservatezza = InitialContext.doLookup(JPROTOCOL_GRADO_RISERVATEZZA);
            protocollaDaRegistrare.setGradoRiservatezza(Integer.parseInt(gradoRiservatezza));
          } catch (Exception e) {
            logger.error("Errore (_protocolloInserisci)", e);
          }
          
          // Mezzo di trasmissione
          try {
            String tipoDoc = InitialContext.doLookup(JPROTOCOL_TIPOLOGIADOC);
            protocollaDaRegistrare.setTipoDoc(Integer.parseInt(tipoDoc));
          } catch (Exception e) {
            logger.error("Errore (_documentoInserisci)", e);
          }

          // Categoria documento, solo per protocolli in uscita
          try {
            String catDoc = InitialContext.doLookup(JPROTOCOL_CATDOC);
            protocollaDaRegistrare.setCatDoc(Integer.parseInt(catDoc));
          } catch (Exception e) {
            logger.error("Errore (_documentoInserisci)", e);
          }

          // Documento e allegati
          WSDMProtocolloAllegato[] wsdmAllegati = wsdmprotocolloDocumentoIn.getAllegati();
          if (wsdmAllegati != null && wsdmAllegati.length > 0) {

            // Documento principale
            protocollaDaRegistrare.setFileDocumento(wsdmAllegati[0].getContenuto());

            // Descrizione documento
            protocollaDaRegistrare.setDescrizioneDocumento(wsdmAllegati[0].getTitolo());

            // Estensione file
            protocollaDaRegistrare.setEstensioneFile(wsdmAllegati[0].getTipo());

            // Nome file
            protocollaDaRegistrare.setNomeFile(wsdmAllegati[0].getNome());

            // Ulteriori allegati
            if (wsdmAllegati.length > 1) {

              protocollaDaRegistrare.setAllegati(true);

              List<Allegato> listAllegati = protocollaDaRegistrare.getFileAllegati();
              for (int a = 1; a < wsdmAllegati.length; a++) {
                Allegato allegato = new Allegato();
                allegato.setContenutoBinario(wsdmAllegati[a].getContenuto());
                allegato.setDescrizione(wsdmAllegati[a].getTitolo());
                allegato.setEstensione(wsdmAllegati[a].getTipo());
                allegato.setNomeFile(wsdmAllegati[a].getNome());
                listAllegati.add(allegato);
              }
            } else {
              protocollaDaRegistrare.setAllegati(false);
            }

          }

          ProtSilenteResult protSilenteResult = this.getWsProtocollaSilente().protocollaV2(protocollaDaRegistrare);
          int codErrore = protSilenteResult.getCodErrore();

          // 0 = Ok
          // -1 = Errore generico
          // -2 = Origine/Verso non indicata
          // -3 = Errore sui mittenti o i destinatari: o Mittente non unico o
          // Ufficio non assegnato (se Verso = I) o Mittente o Destinatario non
          // indicato Oppure errore sull’assegnazione delle competenze agli
          // uffici: o Nessun Ufficio per il verso indicato o Ufficio competente
          // mancante o non unico
          // -4 = Oggetto non indicato
          // -5 = Titolario non indicato

          if (codErrore == 0) {
            WSDMProtocolloDocumento wsdmprotocolloDocumento = new WSDMProtocolloDocumento();
            wsdmprotocolloDocumento.setAnnoProtocollo(new Long(protSilenteResult.getAnnoProt()));
            wsdmprotocolloDocumento.setNumeroProtocollo(protSilenteResult.getNumeroProtocollo());
            Calendar dataProtocolloToday = Calendar.getInstance();
            wsdmprotocolloDocumento.setDataProtocollo(dataProtocolloToday.getTime());
            wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmprotocolloDocumento);
            wsdmprotocolloDocumentoRes.setEsito(true);
            esito = true;
          } else {
            wsdmprotocolloDocumentoRes.setEsito(false);
            String messaggio = "Errore durante l'inserimento del protocollo";
            switch (codErrore) {
            case -1:
              messaggio += " (" + codErrore + " - Errore generico)";
              break;
            case -2:
              messaggio += " (" + codErrore + " - Origine/Verso non indicata)";
              break;
            case -3:
              messaggio += " ("
                  + codErrore
                  + " - Errore sui mittenti o i destinatari: o Mittente non unico o Ufficio non assegnato, se Verso = I, o Mittente o Destinatario non indicato Oppure errore sull’assegnazione delle competenze agli uffici: o Nessun Ufficio per il verso indicato o Ufficio competente mancante o non unico)";
              break;
            case -4:
              messaggio += " (" + codErrore + " - Oggetto non indicato)";
              break;
            case -5:
              messaggio += " (" + codErrore + " - Titolario non indicato)";
              break;

            }

            if (protSilenteResult.getDesErrore() != null) messaggio += " " + protSilenteResult.getDesErrore();

            wsdmprotocolloDocumentoRes.setMessaggio(messaggio);
            esito = false;
          }

        }

        // Eventuale associazione del nuovo elemento documentale al fascicolo
        // (nuovo o esistente)
        if (esito) {
          if (WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())
              || WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {

            // Token
            String token = InitialContext.doLookup(JPROTOCOL_TOKEN);

            Long annoProtocollo = wsdmprotocolloDocumentoRes.getProtocolloDocumento().getAnnoProtocollo();
            String numeroProtocollo = wsdmprotocolloDocumentoRes.getProtocolloDocumento().getNumeroProtocollo();

            int associaFascicoloRes = this.getWsFascicoli().assegnaFascicolo(token, String.valueOf(annoProtocollo), numeroProtocollo,
                String.valueOf(annoFascicolo), numeroFascicolo, "F");

            // Il metodo restituisce un numero intero indicante l’esito
            // dell’operazione così codificato:
            // 0 = OK
            // -1 = errore generico
            // -2 = errore, parametri mancanti
            // -3 = errore, fascicolo inesistente
            // -4 = errore, protocollo già fascicolato

            if (associaFascicoloRes == 0) {
              WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();
              wsdmFascicolo.setAnnoFascicolo(annoFascicolo);
              wsdmFascicolo.setNumeroFascicolo(numeroFascicolo);
              wsdmprotocolloDocumentoRes.getProtocolloDocumento().setFascicolo(wsdmFascicolo);
            } else {
              wsdmprotocolloDocumentoRes.setEsito(false);
              String messaggio = "Errore nell'associazione al fascicolo";
              switch (associaFascicoloRes) {
              case -1:
                messaggio += " (" + associaFascicoloRes + " - Errore generico)";
                break;
              case -2:
                messaggio += " (" + associaFascicoloRes + " - Errore, parametri mancanti)";
                break;
              case -3:
                messaggio += " (" + associaFascicoloRes + " - Errore, fascicolo inesistente)";
                break;
              case -4:
                messaggio += " (" + associaFascicoloRes + " - Errore, protocollo gia' fascicolato)";
                break;

              }
              wsdmprotocolloDocumentoRes.setMessaggio(messaggio);
            }
          }
        }
      } else {
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
      }
    } catch (WebServiceException w) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_documentoInserisci)", w);
    } catch (NamingException e) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_documentoInserisci)", e);
    } catch (Throwable t) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(t.getMessage());
      logger.error("Errore (_documentoInserisci)", t);
    }

    return wsdmprotocolloDocumentoRes;

  }

  @Override
  public WSDMProtocolloDocumentoRes _documentoLeggi(String username, String password, WSDMLoginAttr loginAttr, String numeroDocumento) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    wsdmprotocolloDocumentoRes.setEsito(false);
    wsdmprotocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmprotocolloDocumentoRes;
  }

  public WSDMProtocolloDocumentoRes _documentoMetadatiLeggi(String username, String password, WSDMLoginAttr loginAttr,
      String numeroDocumento) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    wsdmprotocolloDocumentoRes.setEsito(false);
    wsdmprotocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmprotocolloDocumentoRes;
  }

  @Override
  public WSDMFascicoloRes _fascicoloInserisci(String username, String password, WSDMLoginAttr loginAttr, WSDMFascicoloIn wsdmFascicoloIn) {
    WSDMFascicoloRes wsdmfascicoloRes = new WSDMFascicoloRes();

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (JProtocolUtilityControllo.ctrFascicoloInserisci(loginAttr, wsdmFascicoloIn, messaggioCtr)) {

        // Token
        String token = InitialContext.doLookup(JPROTOCOL_TOKEN);

        // Dati del fascicolo
        Fascicolo fascicoloIn = new Fascicolo();

        int year = Calendar.getInstance().get(Calendar.YEAR);
        fascicoloIn.setAnno(String.valueOf(year));

        // Codice titolario
        if (wsdmFascicoloIn.getClassificaFascicolo() != null) {
          fascicoloIn.setCodTitolario(wsdmFascicoloIn.getClassificaFascicolo());
        }

        // Denominazione
        if (wsdmFascicoloIn.getOggettoFascicolo() != null) {
          fascicoloIn.setDenominazione(wsdmFascicoloIn.getOggettoFascicolo());
        }

        // Descrizione
        if (wsdmFascicoloIn.getDescrizioneFascicolo() != null) {
          fascicoloIn.setDescrizione(wsdmFascicoloIn.getDescrizioneFascicolo());
        }

        Fascicolo fascicoloOut = this.getWsFascicoli().creaFascicolo(token, fascicoloIn);
        if (fascicoloOut == null) {
          wsdmfascicoloRes.setEsito(false);
        } else {
          String denominazioneFascicolo = fascicoloOut.getDenominazione();
          String descrizioneFascicolo = fascicoloOut.getDescrizione();
          if ("ERRORE".equals(denominazioneFascicolo)) {
            wsdmfascicoloRes.setEsito(false);
            wsdmfascicoloRes.setMessaggio(descrizioneFascicolo);
          } else {
            wsdmfascicoloRes.setEsito(true);
            WSDMFascicolo wsdmFascicoloOut = new WSDMFascicolo();
            try {
              wsdmFascicoloOut.setAnnoFascicolo(Long.parseLong(fascicoloOut.getAnno()));
            } catch (Exception e) {
              
            }
            wsdmFascicoloOut.setClassificaFascicolo(fascicoloOut.getCodTitolario());
            wsdmFascicoloOut.setOggettoFascicolo(fascicoloOut.getDenominazione());
            wsdmFascicoloOut.setDescrizioneFascicolo(fascicoloOut.getDescrizione());
            wsdmFascicoloOut.setNumeroFascicolo(fascicoloOut.getProgressivo());
            wsdmfascicoloRes.setFascicolo(wsdmFascicoloOut);
          }
        }

      } else {
        wsdmfascicoloRes.setEsito(false);
        wsdmfascicoloRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (WebServiceException w) {
      wsdmfascicoloRes.setEsito(false);
      wsdmfascicoloRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_fascicoloInserisci)", w);
    } catch (NamingException e) {
      wsdmfascicoloRes.setEsito(false);
      wsdmfascicoloRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_fascicoloInserisci)", e);
    } catch (Throwable t) {
      wsdmfascicoloRes.setEsito(false);
      wsdmfascicoloRes.setMessaggio(t.getMessage());
      logger.error("Errore (_fascicoloInserisci)", t);
    }

    return wsdmfascicoloRes;
  }

  @Override
  public WSDMFascicoloRes _fascicoloAggiungiDocumento(String username, String password, WSDMLoginAttr loginAttr, String codiceFascicolo,
      String numeroDocumento) {
    WSDMFascicoloRes wsdmfascicoloRes = new WSDMFascicoloRes();
    wsdmfascicoloRes.setEsito(false);
    wsdmfascicoloRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmfascicoloRes;
  }

  @Override
  public WSDMFascicoloRes _fascicoloLeggi(String username, String password, WSDMLoginAttr loginAttr, String codiceFascicolo,
      Long annoFascicolo, String numeroFascicolo, String classificaFascicolo, String oggettoFascicolo) {
    WSDMFascicoloRes wsdmfascicoloRes = new WSDMFascicoloRes();

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (JProtocolUtilityControllo.ctrFascicoloLeggi(loginAttr, codiceFascicolo, annoFascicolo, numeroFascicolo, classificaFascicolo,
          messaggioCtr)) {

        // Token
        String token = InitialContext.doLookup(JPROTOCOL_TOKEN);

        List<ElencoDocumenti> resDocumenti = this.getWsFascicoli().contenutoFascicolo(token, String.valueOf(annoFascicolo),
            numeroFascicolo, "F");

        if (resDocumenti != null) {

          wsdmfascicoloRes.setEsito(true);
          WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();
          wsdmFascicolo.setCodiceFascicolo(codiceFascicolo);
          wsdmFascicolo.setAnnoFascicolo(annoFascicolo);
          wsdmFascicolo.setNumeroFascicolo(numeroFascicolo);
          wsdmFascicolo.setClassificaFascicolo(classificaFascicolo);

          WSDMFascicoloDocumento[] wsdmFascicoloDocumenti = new WSDMFascicoloDocumento[resDocumenti.size()];
          for (int d = 0; d < resDocumenti.size(); d++) {
            ElencoDocumenti resDocumento = resDocumenti.get(d);

            wsdmFascicoloDocumenti[d] = new WSDMFascicoloDocumento();

            // Anno protocollo
            wsdmFascicoloDocumenti[d].setAnnoProtocollo(Long.parseLong(resDocumento.getAnnoProtocollo()));

            // Data protocollo
            try {
              String resDocumentoDataProtocollo = resDocumento.getDataProtocollo();
              Date dataProtocollo = new SimpleDateFormat("dd/mm/yyyy hh24:mi:ss").parse(resDocumentoDataProtocollo);
              wsdmFascicoloDocumenti[d].setDataProtocollo(dataProtocollo);
            } catch (Exception e) {

            }

            // Verso del protocollo
            String resDocumentoVersoProtocollo = resDocumento.getVersoProtocollo();
            if (JPROTOCOL_ENTRATA.equals(resDocumentoVersoProtocollo)) {
              wsdmFascicoloDocumenti[d].setInout(WSDMProtocolloInOut.IN);
            } else if (JPROTOCOL_USCITA.equals(resDocumentoVersoProtocollo)) {
              wsdmFascicoloDocumenti[d].setInout(WSDMProtocolloInOut.OUT);
            } else if (JPROTOCOL_INTERNO.equals(resDocumentoVersoProtocollo)) {
              wsdmFascicoloDocumenti[d].setInout(WSDMProtocolloInOut.INT);
            }

            // Numero protocollo
            wsdmFascicoloDocumenti[d].setNumeroProtocollo(resDocumento.getNumeroProtocollo());

            // Oggetto
            wsdmFascicoloDocumenti[d].setOggetto(resDocumento.getOggetto());

            // Codice dell'unita' organizzativa
            wsdmFascicoloDocumenti[d].setCodiceUO(resDocumento.getUORCompetente());

          }
          wsdmFascicolo.setDocumenti(wsdmFascicoloDocumenti);
          wsdmfascicoloRes.setFascicolo(wsdmFascicolo);
        } else {
          wsdmfascicoloRes.setEsito(false);
          wsdmfascicoloRes.setMessaggio("Il fascicolo indicato non contiene alcun documento");
        }

      } else {
        wsdmfascicoloRes.setEsito(false);
        wsdmfascicoloRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (WebServiceException w) {
      wsdmfascicoloRes.setEsito(false);
      wsdmfascicoloRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_fascicoloLeggi)", w);
    } catch (NamingException e) {
      wsdmfascicoloRes.setEsito(false);
      wsdmfascicoloRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_fascicoloLeggi)", e);
    } catch (Throwable t) {
      wsdmfascicoloRes.setEsito(false);
      wsdmfascicoloRes.setMessaggio(t.getMessage());
      logger.error("Errore (_fascicoloLeggi)", t);
    }

    return wsdmfascicoloRes;
  }

  @Override
  public WSDMFascicoloRes _fascicoloMetadatiLeggi(String username, String password, WSDMLoginAttr loginAttr, String codiceFascicolo,
      Long annoFascicolo, String numeroFascicolo, String classificaFascicolo, String oggettoFascicolo) {
    WSDMFascicoloRes wsdmFascicoloRes = new WSDMFascicoloRes();
    wsdmFascicoloRes.setEsito(false);
    wsdmFascicoloRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmFascicoloRes;
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

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (JProtocolUtilityControllo.ctrInviaMail(loginAttr, wsdmInviaMail, messaggioCtr)) {

        MailServiceRequest mailServiceRequest = new MailServiceRequest();

        // Token
        String token = InitialContext.doLookup(JPROTOCOL_TOKEN);
        mailServiceRequest.setToken(token);

        // Anno e numero protocollo
        mailServiceRequest.setAnnoProtocollo(wsdmInviaMail.getAnnoProtocollo().toString());
        mailServiceRequest.setNumeroProtocollo(wsdmInviaMail.getNumeroProtocollo());

        // Oggetto
        mailServiceRequest.setOggetto(wsdmInviaMail.getOggettoMail());

        // Corpo del messaggio
        mailServiceRequest.setCorpoMessaggio(wsdmInviaMail.getTestoMail());

        // Traccia PEC
        mailServiceRequest.setTracciaPEC("S");

        // Codice mail server
        String codiceMailServer = InitialContext.doLookup(JPROTOCOL_CODICEMAILSERVER);
        mailServiceRequest.setCodiceMailServer(codiceMailServer);

        // Destinatari
        List<String> listDestinatariTO = mailServiceRequest.getDestinatariTO();
        String[] destinatariMail = wsdmInviaMail.getDestinatariMail();
        if (destinatariMail != null && destinatariMail.length > 0) {
          for (int dm = 0; dm < destinatariMail.length; dm++) {
            listDestinatariTO.add(destinatariMail[dm]);
          }
        }

        MailServiceResponse mailServiceResponse = this.getWsSendMail().sendDocument(mailServiceRequest);
        int codErrore = mailServiceResponse.getCodErrore();

        if (codErrore == 0) {
          wsdmInviaMailRes.setEsito(true);
        } else {
          wsdmInviaMailRes.setEsito(false);
          String messaggio = "Errore durante l'invio mail";
          messaggio += " (" + codErrore + " - " + mailServiceResponse.getDesErrore() + ")";
          wsdmInviaMailRes.setMessaggio(messaggio);
        }
      } else {
        wsdmInviaMailRes.setEsito(false);
        wsdmInviaMailRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (WebServiceException w) {
      wsdmInviaMailRes.setEsito(false);
      wsdmInviaMailRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_inviaMail)", w);
    } catch (NamingException e) {
      wsdmInviaMailRes.setEsito(false);
      wsdmInviaMailRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_inviaMail)", e);
    } catch (Throwable t) {
      wsdmInviaMailRes.setEsito(false);
      wsdmInviaMailRes.setMessaggio(t.getMessage());
      logger.error("Errore (_inviaMail)", t);
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
