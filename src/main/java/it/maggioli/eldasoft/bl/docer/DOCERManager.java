package it.maggioli.eldasoft.bl.docer;

import it.kdm.docer.core.authentication.AuthenticationService;
import it.kdm.docer.core.authentication.AuthenticationServicePortType;
import it.kdm.docer.fascicolazione.WSFascicolazione;
import it.kdm.docer.fascicolazione.WSFascicolazioneFascicolazioneException_Exception;
import it.kdm.docer.fascicolazione.WSFascicolazionePortType;
import it.kdm.docer.protocollazione.WSProtocollazione;
import it.kdm.docer.protocollazione.WSProtocollazionePortType;
import it.kdm.docer.protocollazione.WSProtocollazioneProtocollazioneException_Exception;
import it.kdm.docer.sdk.classes.xsd.KeyValuePair;
import it.kdm.docer.webservices.DocerServices;
import it.kdm.docer.webservices.DocerServicesDocerException_Exception;
import it.kdm.docer.webservices.DocerServicesPortType;
import it.maggioli.eldasoft.bl.IWSDMManager;
import it.maggioli.eldasoft.ws.dm.WSDMAggiungiAllegatiIn;
import it.maggioli.eldasoft.ws.dm.WSDMAggiungiAllegatiRes;
import it.maggioli.eldasoft.ws.dm.WSDMAnagraficaLeggiRes;
import it.maggioli.eldasoft.ws.dm.WSDMAttoContrattoRes;
import it.maggioli.eldasoft.ws.dm.WSDMDocumentoCollegaRes;
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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.message.Message;
import org.apache.log4j.Logger;

/**
 * Manager per la gestione documentale.
 * 
 */

public class DOCERManager implements IWSDMManager {

  static Logger         logger                                     = Logger.getLogger(DOCERManager.class);

  static private String DOCER_AUTHENTICATION                       = "java:comp/env/DOCER_AUTHENTICATION";
  static private String DOCER_AUTHENTICATION_ND                    = "DOCER: l'indirizzo del servizio 'AuthenticationService' non e' definito";

  static private String DOCER_WS_DOCER                             = "java:comp/env/DOCER_WS_DOCER";
  static private String DOCER_WS_DOCER_ND                          = "DOCER: l'indirizzo del servizio 'DocerService' non e' definito";

  static private String DOCER_WS_PROTOCOLLAZIONE                   = "java:comp/env/DOCER_WS_PROTOCOLLAZIONE";
  static private String DOCER_WS_PROTOCOLLAZIONE_ND                = "DOCER: l'indirizzo del servizio 'Protocollazione' non e' definito";

  static private String DOCER_WS_FASCICOLAZIONE                    = "java:comp/env/DOCER_WS_FASCICOLAZIONE";
  static private String DOCER_WS_FASCICOLAZIONE_ND                 = "DOCER: l'indirizzo del servizio 'Fascicolazione' non e' definito";

  static private String DOCER_AMMINISTRAZIONE_CODICE               = "java:comp/env/DOCER_AMMINISTRAZIONE_CODICE";
  static private String DOCER_AMMINISTRAZIONE_CODICE_ND            = "DOCER: il codice amministrazione/ente non e' definito";
  static private String DOCER_AMMINISTRAZIONE_DENOMINAZIONE        = "java:comp/env/DOCER_AMMINISTRAZIONE_DENOMINAZIONE";
  static private String DOCER_AMMINISTRAZIONE_DENOMINAZIONE_ND     = "DOCER: la denominazione dell'amministrazione/ente non e' definita";
  static private String DOCER_AMMINISTRAZIONE_INDIRIZZO_TELEMATICO = "java:comp/env/DOCER_AMMINISTRAZIONE_INDIRIZZO_TELEMATICO";

  static private String DOCER_AOO_CODICE                           = "java:comp/env/DOCER_AOO_CODICE";
  static private String DOCER_AOO_CODICE_ND                        = "DOCER: il codice AOO non e' definito";
  static private String DOCER_AOO_DENOMINAZIONE                    = "java:comp/env/DOCER_AOO_DENOMINAZIONE";
  static private String DOCER_AOO_DENOMINAZIONE_ND                 = "DOCER: la denominazione della AOO non e' definita";
  static private String DOCER_AOO_INDIRIZZO_TELEMATICO             = "java:comp/env/DOCER_AOO_INDIRIZZO_TELEMATICO";

  static private String DOCER_AOO_MITTENTE_CODICE                  = "java:comp/env/DOCER_AOO_MITTENTE_CODICE";
  static private String DOCER_AOO_MITTENTE_CODICE_ND               = "DOCER: il codice AOO mittente non e' definito";
  static private String DOCER_AOO_MITTENTE_DENOMINAZIONE           = "java:comp/env/DOCER_AOO_MITTENTE_DENOMINAZIONE";
  static private String DOCER_AOO_MITTENTE_DENOMINAZIONE_ND        = "DOCER: la denominazione della AOO mittente non e' definita";
  static private String DOCER_AOO_MITTENTE_INDIRIZZO_TELEMATICO    = "java:comp/env/DOCER_AOO_MITTENTE_INDIRIZZO_TELEMATICO";

  static private String DOCER_APPLICATION                          = "java:comp/env/DOCER_APPLICATION";

  static private String DOCER_ACL                                  = "java:comp/env/DOCER_ACL";

  static private String DOCER_ENTRATA                              = "E";
  static private String DOCER_USCITA                               = "U";

  // TODO: verificare il codice per il tipo di protocollazione interna
  static private String DOCER_INTERNO                              = "I";

  // Dati generici richiesti
  //
  // wsdmProtocolloDocumentoIn.genericS11 - FIRMA (puo' assumere i valori
  // definiti nel tabellato FD, FE, NF)
  // wsdmProtocolloDocumentoIn.genericS21 - Denominazione dell'unita'
  // organizzativa MITTENTE INTERNO
  // wsdmProtocolloDocumentoIn.genericS22 - Codice identificativo dell'unita'
  // organizzativa MITTENTE INTERNO
  // wsdmProtocolloDocumentoIn.genericS31 - Denominazione dell'unita'
  // organizzativa DESTINATARIA INTERNA
  // wsdmProtocolloDocumentoIn.genericS32 - Codice identificativo dell'unita'
  // organizzativa DESTINATARIA INTERNA

  /**
   * Ricava il puntamento al servizio di autenticazione.
   * 
   * @return
   * @throws Exception
   */
  private AuthenticationServicePortType getAuthenticationService() throws Exception {
    String address = InitialContext.doLookup(DOCER_AUTHENTICATION);
    if (address == null || (address != null && "".equals(address.trim()))) {
      throw new Exception(DOCER_AUTHENTICATION_ND);
    }
    AuthenticationService _service = new AuthenticationService();
    AuthenticationServicePortType _port = _service.getAuthenticationServiceHttpsEndpoint();
    Client _client = ClientProxy.getClient(_port);
    _client.getRequestContext().put(Message.ENDPOINT_ADDRESS, address);
    _client.getRequestContext().put(Message.RECEIVE_TIMEOUT, 5 * 60 * 1000);

    return _port;
  }

  /**
   * Ricava il puntamento al servizio di gestione dei documenti principale ed
   * allegati.
   * 
   * @return
   * @throws Exception
   */
  private DocerServicesPortType getDocerService() throws Exception {
    String address = InitialContext.doLookup(DOCER_WS_DOCER);
    if (address == null || (address != null && "".equals(address.trim()))) {
      throw new Exception(DOCER_WS_DOCER_ND);
    }
    DocerServices _service = new DocerServices();
    DocerServicesPortType _port = _service.getDocerServicesHttpsEndpoint();
    Client _client = ClientProxy.getClient(_port);
    _client.getRequestContext().put(Message.ENDPOINT_ADDRESS, address);
    _client.getRequestContext().put(Message.RECEIVE_TIMEOUT, 5 * 60 * 1000);
    return _port;
  }

  /**
   * Ricava il puntamento al servizio di protocollazione.
   * 
   * @return
   * @throws Exception
   */
  private WSProtocollazionePortType getWsProtocollazione() throws Exception {
    String address = InitialContext.doLookup(DOCER_WS_PROTOCOLLAZIONE);
    if (address == null || (address != null && "".equals(address.trim()))) {
      throw new Exception(DOCER_WS_PROTOCOLLAZIONE_ND);
    }

    WSProtocollazione _service = new WSProtocollazione();
    WSProtocollazionePortType _port = _service.getWSProtocollazioneHttpsEndpoint();
    Client _client = ClientProxy.getClient(_port);
    _client.getRequestContext().put(Message.ENDPOINT_ADDRESS, address);
    _client.getRequestContext().put(Message.RECEIVE_TIMEOUT, 5 * 60 * 1000);
    return _port;
  }

  /**
   * Ricava il puntamento al servizio di fascicolazione.
   * 
   * @return
   * @throws Exception
   */
  private WSFascicolazionePortType getWSFascicolazione() throws Exception {
    String address = InitialContext.doLookup(DOCER_WS_FASCICOLAZIONE);
    if (address == null || (address != null && "".equals(address.trim()))) {
      throw new Exception(DOCER_WS_FASCICOLAZIONE_ND);
    }
    WSFascicolazione _service = new WSFascicolazione();
    WSFascicolazionePortType _port = _service.getWSFascicolazioneHttpsEndpoint();
    Client _client = ClientProxy.getClient(_port);
    _client.getRequestContext().put(Message.ENDPOINT_ADDRESS, address);
    _client.getRequestContext().put(Message.RECEIVE_TIMEOUT, 5 * 60 * 1000);
    return _port;
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

  public WSDMListaClassificheRes _listaClassifiche(String username, String password, WSDMLoginAttr loginAttr, String codice,
      String descrizione, String voce) {
    WSDMListaClassificheRes wsdmListaClassificheRes = new WSDMListaClassificheRes();
    wsdmListaClassificheRes.setEsito(false);
    wsdmListaClassificheRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmListaClassificheRes;
  }

  @Override
  public WSDMProtocolloDocumentoRes _protocolloInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    String token = null;

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (DOCERUtilityControllo.ctrProtocolloInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {
        token = _protocolloDocumentoInserisci(username, password, wsdmprotocolloDocumentoIn, wsdmprotocolloDocumentoRes);
      } else {
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
      }
    } catch (Throwable t) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(t.getMessage());
      logger.error("Errore (_protocolloInserisci)", t);
    } finally {
      if (token != null) {
        try {
          logout(token);
        } catch (Exception e) {
          logger.error("Errore durante il logout (_protocolloInserisci)", e);
        }
      }
    }

    return wsdmprotocolloDocumentoRes;
  }

  /**
   * Protocollo/Documenti inserisci.
   * 
   * @param username
   * @param password
   * @param wsdmprotocolloDocumentoIn
   * @param wsdmprotocolloDocumentoRes
   * @return
   * @throws NamingException
   * @throws Exception
   * @throws DocerServicesDocerException_Exception
   * @throws WSProtocollazioneProtocollazioneException_Exception
   * @throws WSFascicolazioneFascicolazioneException_Exception
   */
  private String _protocolloDocumentoInserisci(String username, String password, WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn,
      WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes) throws NamingException, Exception, DocerServicesDocerException_Exception,
      WSProtocollazioneProtocollazioneException_Exception, WSFascicolazioneFascicolazioneException_Exception {
    String token;
    // Codice amministrazione/ente
    String amministrazione_codice = InitialContext.doLookup(DOCER_AMMINISTRAZIONE_CODICE);
    if (amministrazione_codice == null || (amministrazione_codice != null && "".equals(amministrazione_codice.trim()))) {
      throw new Exception(DOCER_AMMINISTRAZIONE_CODICE_ND);
    }

    // Codice AOO
    String aoo_codice = InitialContext.doLookup(DOCER_AOO_CODICE);
    if (aoo_codice == null || (aoo_codice != null && "".equals(aoo_codice.trim()))) {
      throw new Exception(DOCER_AOO_CODICE_ND);
    }

    // Ricavo il token di autenticazione
    token = login(username, password);

    // Inserimento di tutti i documenti allegati dal principale (il primo)
    // agli ulteriori allegati
    DocerServicesPortType docer = getDocerService();

    String docId_DocumentoPrincipale = null;

    if (wsdmprotocolloDocumentoIn.getAllegati() != null) {

      ArrayList<String> related = new ArrayList<String>();

      WSDMProtocolloAllegato[] allegati = wsdmprotocolloDocumentoIn.getAllegati();
      for (int a = 0; a < allegati.length; a++) {
        // Metadati
        ArrayList<KeyValuePair> metadata = new ArrayList<KeyValuePair>();

        // TYPE_ID - Tipo di documento
        KeyValuePair type_id = new KeyValuePair();
        type_id.setValue(wsdmprotocolloDocumentoIn.getTipoDocumento());
        type_id.setKey("TYPE_ID");
        metadata.add(type_id);

        // COD_ENTE - Codice ente
        KeyValuePair cod_ente = new KeyValuePair();
        cod_ente.setValue(amministrazione_codice);
        cod_ente.setKey("COD_ENTE");
        metadata.add(cod_ente);

        // COD_AOO - Codice Area Organizzativa Omogenea
        KeyValuePair cod_aoo = new KeyValuePair();
        cod_aoo.setValue(aoo_codice);
        cod_aoo.setKey("COD_AOO");
        metadata.add(cod_aoo);

        // DOCNAME - Nome del documento
        KeyValuePair docname = new KeyValuePair();
        docname.setValue(conversioneCaratteriXML(allegati[a].getNome()));
        docname.setKey("DOCNAME");
        metadata.add(docname);

        // CREATION_DATE - Data di creazione
        KeyValuePair creationdate = new KeyValuePair();
        Date data = new Date();
        String dataDDMMYYYY = new SimpleDateFormat("yyyy-MM-dd").format(data);
        creationdate.setValue(dataDDMMYYYY);
        creationdate.setKey("CREATION_DATE");
        metadata.add(creationdate);

        // TIPO_COMPONENTE - PRINCIPALE per il documento principale (il
        // primo), ALLEGATO per tutti gli altri documenti
        KeyValuePair tipocomponente = new KeyValuePair();
        if (a == 0) {
          tipocomponente.setValue("PRINCIPALE");
        } else {
          tipocomponente.setValue("ALLEGATO");
        }
        tipocomponente.setKey("TIPO_COMPONENTE");
        metadata.add(tipocomponente);

        // STATO_ARCHIVISTICO
        KeyValuePair statoarchivistico = new KeyValuePair();
        statoarchivistico.setValue("1");
        statoarchivistico.setKey("STATO_ARCHIVISTICO");
        metadata.add(statoarchivistico);

        String docId = docer.createDocument(token, metadata, allegati[a].getContenuto());
        if (a == 0) {
          docId_DocumentoPrincipale = docId;
        } else {
          related.add(docId);
        }

        // ACL: per ogni documento inserito bisogna anche inserire le ACL
        setACLDocumento(token, docer, docId);

      }

      // RELATED: costruzione delle correlazioni con il documento principale
      if (docId_DocumentoPrincipale != null && related.size() > 0) {
        docer.addRelated(token, docId_DocumentoPrincipale, related);
      }

    }

    // Richiesta di protocollazione con indicazione di tutti i documenti
    // precedentemente inseriti
    WSProtocollazionePortType wsProtocollazione = getWsProtocollazione();

    // Metadati del protocollo
    StringBuffer datiProtocollo = new StringBuffer();
    datiProtocollo.append("<Segnatura xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">");
    datiProtocollo.append("<Intestazione>");
    datiProtocollo.append("<Oggetto>" + conversioneCaratteriXML(wsdmprotocolloDocumentoIn.getOggetto()) + "</Oggetto>");
    datiProtocollo.append("<Flusso>");

    String tiporichiesta = null;
    if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
      tiporichiesta = DOCER_ENTRATA;
    } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      tiporichiesta = DOCER_USCITA;
    } else if (WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      tiporichiesta = DOCER_INTERNO;
    }
    datiProtocollo.append("<TipoRichiesta>" + tiporichiesta + "</TipoRichiesta>");
    datiProtocollo.append("<Firma>" + conversioneCaratteriXML(wsdmprotocolloDocumentoIn.getGenericS11()) + "</Firma>");
    datiProtocollo.append("<ForzaRegistrazione>1</ForzaRegistrazione>");
    datiProtocollo.append("<Firmatario/>");
    datiProtocollo.append("</Flusso>");

    // Gestione dei mittenti e dei destinatari

    // PROTOCOLLO IN INGRESSO
    // Nel protocollo in ingresso il mittente e' l'impresa scrivente, si
    // considerano i dati forniti con l'elemento
    // wsdmProtocolloDocumentoIn.mittenti
    // Nel protocollo in ingresso il destinatario e' un destinatario
    // interno, ossia l'amministrazione. I dati devono essere ricavati in
    // parte da parametri fissi scritti nel file context.xml ed in parte
    // come elementi generici passati nella richiesta di protocollazione
    // wsdmProtocolloDocumentoIn.genericSXX
    if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
      gestioneMittentiEsterni(wsdmprotocolloDocumentoIn, datiProtocollo);
      gestioneDestinatarioInterno(wsdmprotocolloDocumentoIn, amministrazione_codice, aoo_codice, datiProtocollo);
    }

    // PROTOCOLLO IN USCITA
    // Nel protocollo in uscita il mittente e' interno, ossia e'
    // l'amministrazione. I dati del mittente interno devono essere ricavati
    // in parte da parametri fissi scritti nel file context.xml ed in parte
    // da elementi passati nella richiesta di protocollazione
    // wsdmProtocolloDocumentoIn.genericSXX
    // Nel protocollo in uscita il destinatario o i destinatari sono quelli
    // forniti con l'elemento wsdmProtocolloDocumentoIn.destinatari.
    if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      gestioneMittenteInterno(wsdmprotocolloDocumentoIn, amministrazione_codice, datiProtocollo);
      gestioneDestinatariEsterni(wsdmprotocolloDocumentoIn, datiProtocollo);
    }

    // PROTOCOLLO INTERNO
    // Mittente interno e destinatario interno
    if (WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      gestioneMittenteInterno(wsdmprotocolloDocumentoIn, amministrazione_codice, datiProtocollo);
      gestioneDestinatarioInterno(wsdmprotocolloDocumentoIn, amministrazione_codice, aoo_codice, datiProtocollo);
    }

    // Gestione del fascicolo
    if (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
      datiProtocollo.append("<FascicoloPrimario>");
      datiProtocollo.append("<CodiceAmministrazione>" + amministrazione_codice + "</CodiceAmministrazione>");
      datiProtocollo.append("<CodiceAOO>" + aoo_codice + "</CodiceAOO>");
      datiProtocollo.append("<Classifica>" + wsdmprotocolloDocumentoIn.getFascicolo().getClassificaFascicolo() + "</Classifica>");
      datiProtocollo.append("<Anno>" + wsdmprotocolloDocumentoIn.getFascicolo().getAnnoFascicolo().toString() + "</Anno>");
      datiProtocollo.append("<Progressivo>" + wsdmprotocolloDocumentoIn.getFascicolo().getNumeroFascicolo() + "</Progressivo>");
      datiProtocollo.append("</FascicoloPrimario>");
      datiProtocollo.append("<FascicoliSecondari/>");
      datiProtocollo.append("<Smistamento/>");
    }

    datiProtocollo.append("</Intestazione>");
    datiProtocollo.append("</Segnatura>");

    String responseProtocollaById = wsProtocollazione.protocollaById(token, new Long(docId_DocumentoPrincipale), datiProtocollo.toString());

    // <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
    // <esito><codice>0</codice><descrizione>Protocollazione avvenuta con
    // successo.</descrizione>
    // <dati_protocollo>
    // <NUM_PG>90258</NUM_PG>
    // <DATA_PG>2021-10-13T11:36:00</DATA_PG>
    // <ANNO_PG>2021</ANNO_PG>
    // <OGGETTO_PG>Protocollazione in ingresso del 13/10/2021</OGGETTO_PG>
    // <REGISTRO_PG>PG</REGISTRO_PG>
    // </dati_protocollo></esito>

    String codice = estraiValoreDaXML(responseProtocollaById, "codice");
    String descrizione = estraiValoreDaXML(responseProtocollaById, "descrizione");
    String numeroProtocollo = estraiValoreDaXML(responseProtocollaById, "NUM_PG");

    if ("0".equals(codice)) {

      // Associazione al fascicolo documentale
      // 13/10/2021 Non necessario. Gia' nella richiesta di protocollazione c'è l'indicazione del fascicolo
      // inserimentoDocumentoInFascicolo(wsdmprotocolloDocumentoIn, token, amministrazione_codice, aoo_codice, numeroProtocollo);

      // Risultati
      wsdmprotocolloDocumentoRes.setEsito(true);
      WSDMProtocolloDocumento wsdmProtocolloDocumento = new WSDMProtocolloDocumento();
      wsdmProtocolloDocumento.setNumeroProtocollo(numeroProtocollo);
      wsdmProtocolloDocumento.setNumeroDocumento(numeroProtocollo);
      Calendar dataProtocolloToday = Calendar.getInstance();
      wsdmProtocolloDocumento.setDataProtocollo(dataProtocolloToday.getTime());
      wsdmProtocolloDocumento.setAnnoProtocollo(new Long(dataProtocolloToday.get(Calendar.YEAR)));
      wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmProtocolloDocumento);
      
    } else {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(descrizione);
    }
    
    return token;
  }

  private String estraiValoreDaXML(String responseProtocollaById, String stringaRicerca) {
    int pos1 = responseProtocollaById.indexOf("<" + stringaRicerca + ">");
    int pos2 = responseProtocollaById.indexOf("</" + stringaRicerca + ">");
    String valore = responseProtocollaById.substring(pos1 + stringaRicerca.length() + 2, pos2);
    return valore;
  }

  /**
   * Gestione destinatario interno. Si tratta dell'amministrazione con la sua
   * unita' organizzativa.
   * 
   * @param wsdmprotocolloDocumentoIn
   * @param amministrazione_codice
   * @param aoo_codice
   * @param datiProtocollo
   * @throws NamingException
   * @throws Exception
   */
  private void gestioneDestinatarioInterno(WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn, String amministrazione_codice,
      String aoo_codice, StringBuffer datiProtocollo) throws NamingException, Exception {
    datiProtocollo.append("<Destinatari>");
    datiProtocollo.append("<Destinatario>");

    // Amministrazione (codice, denominazione e indirizzo telematico)
    datiProtocollo.append("<Amministrazione>");
    String amministrazione_denominazione = InitialContext.doLookup(DOCER_AMMINISTRAZIONE_DENOMINAZIONE);
    if (amministrazione_denominazione == null || (amministrazione_denominazione != null && "".equals(amministrazione_denominazione.trim()))) {
      throw new Exception(DOCER_AMMINISTRAZIONE_DENOMINAZIONE_ND);
    }
    datiProtocollo.append("<Denominazione>" + conversioneCaratteriXML(amministrazione_denominazione) + "</Denominazione>");
    datiProtocollo.append("<CodiceAmministrazione>" + conversioneCaratteriXML(amministrazione_codice) + "</CodiceAmministrazione>");

    String amministrazione_indirizzo_telematico = InitialContext.doLookup(DOCER_AMMINISTRAZIONE_INDIRIZZO_TELEMATICO);
    datiProtocollo.append("<IndirizzoTelematico>" + conversioneCaratteriXML(amministrazione_indirizzo_telematico) + "</IndirizzoTelematico>");

    // Unita' organizzativa dell'amministrazione
    datiProtocollo.append("<UnitaOrganizzativa>");
    datiProtocollo.append("<Denominazione>" + conversioneCaratteriXML(wsdmprotocolloDocumentoIn.getGenericS31()) + "</Denominazione>");
    datiProtocollo.append("<Identificativo>" + conversioneCaratteriXML(wsdmprotocolloDocumentoIn.getGenericS32()) + "</Identificativo>");
    datiProtocollo.append("</UnitaOrganizzativa>");
    datiProtocollo.append("</Amministrazione>");

    // AOO (codice, denominazione e indirizzo telematico)
    datiProtocollo.append("<AOO>");
    String aoo_denominazione = InitialContext.doLookup(DOCER_AOO_DENOMINAZIONE);
    if (aoo_denominazione == null || (aoo_denominazione != null && "".equals(aoo_denominazione.trim()))) {
      throw new Exception(DOCER_AOO_DENOMINAZIONE_ND);
    }
    datiProtocollo.append("<Denominazione>" + conversioneCaratteriXML(aoo_denominazione) + "</Denominazione>");
    datiProtocollo.append("<CodiceAOO>" + conversioneCaratteriXML(aoo_codice) + "</CodiceAOO>");
    String aoo_indirizzo_telematico = InitialContext.doLookup(DOCER_AOO_INDIRIZZO_TELEMATICO);
    datiProtocollo.append("<IndirizzoTelematico>" + conversioneCaratteriXML(aoo_indirizzo_telematico) + "</IndirizzoTelematico>");
    datiProtocollo.append("</AOO>");

    datiProtocollo.append("</Destinatario>");
    datiProtocollo.append("</Destinatari>");
  }

  /**
   * Gestione del mittente interno. Si tratta dell'amministrazione con la sua
   * unita' organizzativa.
   * 
   * @param wsdmprotocolloDocumentoIn
   * @param amministrazione_codice
   * @param aoo_codice
   * @param datiProtocollo
   * @throws NamingException
   * @throws Exception
   */
  private void gestioneMittenteInterno(WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn, String amministrazione_codice,
      StringBuffer datiProtocollo) throws NamingException, Exception {
    datiProtocollo.append("<Mittenti>");
    datiProtocollo.append("<Mittente>");

    // Amministrazione (codice, denominazione e indirizzo telematico)
    datiProtocollo.append("<Amministrazione>");
    String amministrazione_denominazione = InitialContext.doLookup(DOCER_AMMINISTRAZIONE_DENOMINAZIONE);
    if (amministrazione_denominazione == null || (amministrazione_denominazione != null && "".equals(amministrazione_denominazione.trim()))) {
      throw new Exception(DOCER_AMMINISTRAZIONE_DENOMINAZIONE_ND);
    }
    datiProtocollo.append("<Denominazione>" + conversioneCaratteriXML(amministrazione_denominazione) + "</Denominazione>");
    datiProtocollo.append("<CodiceAmministrazione>" + conversioneCaratteriXML(amministrazione_codice) + "</CodiceAmministrazione>");

    String amministrazione_indirizzo_telematico = InitialContext.doLookup(DOCER_AMMINISTRAZIONE_INDIRIZZO_TELEMATICO);
    datiProtocollo.append("<IndirizzoTelematico>" + conversioneCaratteriXML(amministrazione_indirizzo_telematico) + "</IndirizzoTelematico>");

    // Unita' organizzativa dell'amministrazione
    datiProtocollo.append("<UnitaOrganizzativa>");
    datiProtocollo.append("<Denominazione>" + conversioneCaratteriXML(wsdmprotocolloDocumentoIn.getGenericS21()) + "</Denominazione>");
    datiProtocollo.append("<Identificativo>" + conversioneCaratteriXML(wsdmprotocolloDocumentoIn.getGenericS22()) + "</Identificativo>");
    datiProtocollo.append("</UnitaOrganizzativa>");
    datiProtocollo.append("</Amministrazione>");

    // AOO (codice, denominazione e indirizzo telematico)
    datiProtocollo.append("<AOO>");
    String aoo_denominazione = InitialContext.doLookup(DOCER_AOO_MITTENTE_DENOMINAZIONE);
    if (aoo_denominazione == null || (aoo_denominazione != null && "".equals(aoo_denominazione.trim()))) {
      throw new Exception(DOCER_AOO_MITTENTE_DENOMINAZIONE_ND);
    }
    datiProtocollo.append("<Denominazione>" + conversioneCaratteriXML(aoo_denominazione) + "</Denominazione>");
    String aoo_codice = InitialContext.doLookup(DOCER_AOO_MITTENTE_CODICE);
    if (aoo_codice == null || (aoo_codice != null && "".equals(aoo_codice.trim()))) {
      throw new Exception(DOCER_AOO_MITTENTE_CODICE_ND);
    }
    datiProtocollo.append("<CodiceAOO>" + conversioneCaratteriXML(aoo_codice) + "</CodiceAOO>");
    String aoo_indirizzo_telematico = InitialContext.doLookup(DOCER_AOO_MITTENTE_INDIRIZZO_TELEMATICO);
    datiProtocollo.append("<IndirizzoTelematico>" + conversioneCaratteriXML(aoo_indirizzo_telematico) + "</IndirizzoTelematico>");
    datiProtocollo.append("</AOO>");

    datiProtocollo.append("</Mittente>");
    datiProtocollo.append("</Mittenti>");
  }

  /**
   * Gestione dei mittenti esterni. Si tratta dei mittenti indicati nella
   * protocollazione in ingresso.
   * 
   * @param wsdmprotocolloDocumentoIn
   * @param datiProtocollo
   */
  private void gestioneMittentiEsterni(WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn, StringBuffer datiProtocollo) {
    WSDMProtocolloAnagrafica[] mittentiEsterni = wsdmprotocolloDocumentoIn.getMittenti();
    if (mittentiEsterni != null && mittentiEsterni.length > 0) {
      datiProtocollo.append("<Mittenti>");
      for (int me = 0; me < mittentiEsterni.length; me++) {
        datiProtocollo.append("<Mittente>");
        // TODO: chiarire come valorizzare tipo e id, per il momento sono
        // valorizzati rispettivamente con PG (persona giuridica) e il codice
        // fiscale del mittente
        datiProtocollo.append("<PersonaGiuridica tipo=\"PG\" id=\"" + conversioneCaratteriXML(mittentiEsterni[me].getCodiceFiscale()) + "\">");

        // Denominazione e/o nome
        String denominazione = mittentiEsterni[me].getCognomeointestazione();
        if (mittentiEsterni[me].getNome() != null) {
          denominazione += " " + mittentiEsterni[me].getNome();
        }
        datiProtocollo.append("<Denominazione>" + conversioneCaratteriXML(denominazione) + "</Denominazione>");

        // Indirizzo: via, civico, cap, località, provincia
        datiProtocollo.append("<IndirizzoPostale>");
        String indirizzo = "";
        if (mittentiEsterni[me].getIndirizzoResidenza() != null && !"".equals(mittentiEsterni[me].getIndirizzoResidenza().trim())) {
          indirizzo += mittentiEsterni[me].getIndirizzoResidenza();
        }
        if (mittentiEsterni[me].getCapResidenza() != null && !"".equals(mittentiEsterni[me].getCapResidenza().trim())) {
          if (!"".equals(indirizzo)) {
            indirizzo += ", ";
          }
          indirizzo = mittentiEsterni[me].getCapResidenza();
        }
        if (mittentiEsterni[me].getLocalitaResidenza() != null && !"".equals(mittentiEsterni[me].getLocalitaResidenza().trim())) {
          if (!"".equals(indirizzo)) {
            indirizzo += ", ";
          }
          indirizzo = mittentiEsterni[me].getLocalitaResidenza();
        }
        if (mittentiEsterni[me].getComuneResidenza() != null && !"".equals(mittentiEsterni[me].getComuneResidenza().trim())) {
          if (!"".equals(indirizzo)) {
            indirizzo += ", ";
          }
          indirizzo = mittentiEsterni[me].getComuneResidenza();
        }
        if (mittentiEsterni[me].getProvinciaResidenza() != null && !"".equals(mittentiEsterni[me].getProvinciaResidenza().trim())) {
          if (!"".equals(indirizzo)) {
            indirizzo += ", ";
          }
          indirizzo = mittentiEsterni[me].getProvinciaResidenza();
        }
        datiProtocollo.append("<Denominazione>" + conversioneCaratteriXML(indirizzo) + "</Denominazione>");
        datiProtocollo.append("</IndirizzoPostale>");

        // Indirizzo di posta elettronica PEC
        if (mittentiEsterni[me].getEmail() != null) {
          datiProtocollo.append("<IndirizzoTelematico tipo=\"smtp\">" + conversioneCaratteriXML(mittentiEsterni[me].getEmail()) + "</IndirizzoTelematico>");
        }

        // Codice fiscale e/o partita IVA
        if (mittentiEsterni[me].getCodiceFiscale() != null || mittentiEsterni[me].getPartitaIVA() != null) {
          datiProtocollo.append("<Metadati>");
          if (mittentiEsterni[me].getCodiceFiscale() != null) {
            datiProtocollo.append("<Parametro nome=\"CODICE_FISCALE\" valore=\"" + conversioneCaratteriXML(mittentiEsterni[me].getCodiceFiscale()) + "\" />");
          }
          if (mittentiEsterni[me].getPartitaIVA() != null) {
            datiProtocollo.append("<Parametro nome=\"PARTITA_IVA\" valore=\"" + conversioneCaratteriXML(mittentiEsterni[me].getPartitaIVA()) + "\" />");
          }
          datiProtocollo.append("</Metadati>");
        }

        datiProtocollo.append("</PersonaGiuridica>");
        datiProtocollo.append("</Mittente>");

      }
      datiProtocollo.append("</Mittenti>");
    }

  }

  /**
   * Gestione dei destinatari esterni. Si tratta dei destinatari indicati nella
   * richiesta di protocollazione.
   * 
   * @param wsdmprotocolloDocumentoIn
   * @param datiProtocollo
   */
  private void gestioneDestinatariEsterni(WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn, StringBuffer datiProtocollo) {
    WSDMProtocolloAnagrafica[] destinatariEsterni = wsdmprotocolloDocumentoIn.getDestinatari();
    if (destinatariEsterni != null && destinatariEsterni.length > 0) {
      datiProtocollo.append("<Destinatari>");
      for (int de = 0; de < destinatariEsterni.length; de++) {
        datiProtocollo.append("<Destinatario>");
        // TODO: chiarire come valorizzare tipo e id, per il momento sono
        // valorizzati con PG (persona giuridica) ed il codice fiscale del
        // destinatario.
        datiProtocollo.append("<PersonaGiuridica tipo=\"PG\" id=\"" + conversioneCaratteriXML(destinatariEsterni[de].getCodiceFiscale()) + "\">");

        // Denominazione
        String denominazione = destinatariEsterni[de].getCognomeointestazione();
        if (destinatariEsterni[de].getNome() != null) {
          denominazione += " " + destinatariEsterni[de].getNome();
        }
        datiProtocollo.append("<Denominazione>" + conversioneCaratteriXML(denominazione) + "</Denominazione>");

        // Indirizzo: via, civico, cap, località, provincia
        datiProtocollo.append("<IndirizzoPostale>");
        String indirizzo = "";
        if (destinatariEsterni[de].getIndirizzoResidenza() != null && !"".equals(destinatariEsterni[de].getIndirizzoResidenza().trim())) {
          indirizzo += destinatariEsterni[de].getIndirizzoResidenza();
        }
        if (destinatariEsterni[de].getCapResidenza() != null && !"".equals(destinatariEsterni[de].getCapResidenza().trim())) {
          if (!"".equals(indirizzo)) {
            indirizzo += ", ";
          }
          indirizzo = destinatariEsterni[de].getCapResidenza();
        }
        if (destinatariEsterni[de].getLocalitaResidenza() != null && !"".equals(destinatariEsterni[de].getLocalitaResidenza().trim())) {
          if (!"".equals(indirizzo)) {
            indirizzo += ", ";
          }
          indirizzo = destinatariEsterni[de].getLocalitaResidenza();
        }
        if (destinatariEsterni[de].getComuneResidenza() != null && !"".equals(destinatariEsterni[de].getComuneResidenza().trim())) {
          if (!"".equals(indirizzo)) {
            indirizzo += ", ";
          }
          indirizzo = destinatariEsterni[de].getComuneResidenza();
        }
        if (destinatariEsterni[de].getProvinciaResidenza() != null && !"".equals(destinatariEsterni[de].getProvinciaResidenza().trim())) {
          if (!"".equals(indirizzo)) {
            indirizzo += ", ";
          }
          indirizzo = destinatariEsterni[de].getProvinciaResidenza();
        }
        datiProtocollo.append("<Denominazione>" + conversioneCaratteriXML(indirizzo) + "</Denominazione>");
        datiProtocollo.append("</IndirizzoPostale>");

        // Indirizzo di posta elettronica PEC
        if (destinatariEsterni[de].getEmail() != null) {
          datiProtocollo.append("<IndirizzoTelematico tipo=\"smtp\">" + conversioneCaratteriXML(destinatariEsterni[de].getEmail()) + "</IndirizzoTelematico>");
        }

        // Codice fiscale e/o partita IVA
        if (destinatariEsterni[de].getCodiceFiscale() != null || destinatariEsterni[de].getPartitaIVA() != null) {
          datiProtocollo.append("<Metadati>");
          if (destinatariEsterni[de].getCodiceFiscale() != null) {
            datiProtocollo.append("<Parametro nome=\"CODICE_FISCALE\" valore=\"" + conversioneCaratteriXML(destinatariEsterni[de].getCodiceFiscale()) + "\" />");
          }
          if (destinatariEsterni[de].getPartitaIVA() != null) {
            datiProtocollo.append("<Parametro nome=\"PARTITA_IVA\" valore=\"" + conversioneCaratteriXML(destinatariEsterni[de].getPartitaIVA()) + "\" />");
          }
          datiProtocollo.append("</Metadati>");
        }

        datiProtocollo.append("</PersonaGiuridica>");
        datiProtocollo.append("</Destinatario>");

      }
      datiProtocollo.append("</Destinatari>");
    }

  }

  /**
   * Inserimento del protocollo nel fascicolo indicato.
   * 
   * @param wsdmprotocolloDocumentoIn
   * @param token
   * @param codiceente
   * @param codiceaoo
   * @param numeroProtocollo
   * @throws Exception
   * @throws WSFascicolazioneFascicolazioneException_Exception
   */
  private void inserimentoDocumentoInFascicolo(WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn, String token,
      String amministrazione_codice, String aoo_codice, String numeroProtocollo) throws Exception,
      WSFascicolazioneFascicolazioneException_Exception {

    if (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
      WSFascicolazionePortType wsFascicolazione = getWSFascicolazione();

      String datiFascicolo = "<Segnatura xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">";
      datiFascicolo += "<Intestazione>";
      datiFascicolo += "<FascicoloPrimario>";
      datiFascicolo += "<CodiceAmministrazione>" + amministrazione_codice + "</CodiceAmministrazione>";
      datiFascicolo += "<CodiceAOO>" + aoo_codice + "</CodiceAOO>";
      datiFascicolo += "<Classifica>" + wsdmprotocolloDocumentoIn.getFascicolo().getClassificaFascicolo() + "</Classifica>";
      datiFascicolo += "<Anno>" + wsdmprotocolloDocumentoIn.getFascicolo().getAnnoFascicolo().toString() + "</Anno>";
      datiFascicolo += "<Progressivo>" + wsdmprotocolloDocumentoIn.getFascicolo().getNumeroFascicolo() + "</Progressivo>";
      datiFascicolo += "</FascicoloPrimario>";
      datiFascicolo += "<FascicoliSecondari/>";
      datiFascicolo += "</Intestazione>";
      datiFascicolo += "</Segnatura>";

      wsFascicolazione.fascicolaById(token, new Long(numeroProtocollo), datiFascicolo);

    }
  }

  /**
   * Lista delle ACL da assegnare ad ogni documento. La lista delle ACL
   * (group_id o user_id viene prelevata dal parametro DOCER_ACL di
   * context.xml). La lista delle varie ACL deve essere separata da virgola (,)
   * Si assegna il diritto di default: 1 - Normal Access.
   * 
   * @param token
   * @param docer
   * @param docId
   * @throws Exception
   */
  private void setACLDocumento(String token, DocerServicesPortType docer, String docId) throws Exception {

    // TODO: chiarire la gestione delle ACL

    String docer_acl = InitialContext.doLookup(DOCER_ACL);
    if (docer_acl != null && !"".equals(docer_acl)) {
      ArrayList<KeyValuePair> listaACL = new ArrayList<KeyValuePair>();

      String[] group_user_id = docer_acl.split("\\,");

      for (int a = 0; a < group_user_id.length; a++) {
        KeyValuePair acl = new KeyValuePair();
        // 1 - Normal Access
        acl.setValue("1");
        acl.setKey(group_user_id[a]);
        listaACL.add(acl);
      }

      docer.setACLDocument(token, docId, listaACL);

    }

  }

  /**
   * Effettua il login e restituisce il token di sessione.
   * 
   * @param username
   * @param password
   * @return
   * @throws Exception
   */
  private String login(String username, String password) throws Exception {
    AuthenticationServicePortType auth = getAuthenticationService();
    String codiceente = InitialContext.doLookup(DOCER_AMMINISTRAZIONE_CODICE);
    if (codiceente == null || (codiceente != null && "".equals(codiceente.trim()))) {
      throw new Exception(DOCER_AMMINISTRAZIONE_CODICE_ND);
    }
    String application = InitialContext.doLookup(DOCER_APPLICATION);
    String token = auth.login(username, password, codiceente, application);

    return token;
  }

  /**
   * Effettua il logout relativo al token precedentemente ricavato con
   * l'operazione login.
   * 
   * @param token
   * @return
   * @throws Exception
   */
  private Boolean logout(String token) throws Exception {
    AuthenticationServicePortType auth = getAuthenticationService();
    Boolean logoutStatus = auth.logout(token);
    return logoutStatus;
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
  public WSDMProtocolloDocumentoRes _protocolloLeggi(String username, String password, WSDMLoginAttr loginAttr, Long annoProtocollo,
      String numeroProtocollo) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    wsdmprotocolloDocumentoRes.setEsito(false);
    wsdmprotocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmprotocolloDocumentoRes;
  }

  @Override
  public WSDMProtocolloDocumentoRes _documentoInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    String token = null;

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (DOCERUtilityControllo.ctrDocumentoInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {
        token = _protocolloDocumentoInserisci(username, password, wsdmprotocolloDocumentoIn, wsdmprotocolloDocumentoRes);
      } else {
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
      }
    } catch (Throwable t) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(t.getMessage());
      logger.error("Errore (_documentoInserisci)", t);
    } finally {
      if (token != null) {
        try {
          logout(token);
        } catch (Exception e) {
          logger.error("Errore durante il logout (_documentoInserisci)", e);
        }
      }
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

  @Override
  public WSDMDocumentoCollegaRes _documentoCollega(String username, String password, WSDMLoginAttr loginAttr, String numeroDocumentoPadre,
      String numeroDocumentoFiglio, String tipoCollegamento) {
    WSDMDocumentoCollegaRes wsdmDocumentoCollegaRes = new WSDMDocumentoCollegaRes();
    wsdmDocumentoCollegaRes.setEsito(false);
    wsdmDocumentoCollegaRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmDocumentoCollegaRes;
  }

  public WSDMProtocolloDocumentoRes _documentoMetadatiLeggi(String username, String password, WSDMLoginAttr loginAttr,
      String numeroDocumento) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    wsdmprotocolloDocumentoRes.setEsito(false);
    wsdmprotocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmprotocolloDocumentoRes;
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
    wsdmFascicoloRes.setEsito(false);
    wsdmFascicoloRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmFascicoloRes;
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
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    wsdmprotocolloDocumentoRes.setEsito(false);
    wsdmprotocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmprotocolloDocumentoRes;
  }

  @Override
  public WSDMInviaMailRes _inviaMail(String username, String password, WSDMLoginAttr loginAttr, WSDMInviaMail wsdmInviaMail) {
    WSDMInviaMailRes wsdmInviaMailRes = new WSDMInviaMailRes();
    wsdmInviaMailRes.setEsito(false);
    wsdmInviaMailRes.setMessaggio(OPERATION_NOT_SUPPORTED);
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
  public WSDMAnagraficaLeggiRes _anagraficaLeggi(String username, String password, WSDMLoginAttr loginAttr, String codiceAnagrafica) {
    WSDMAnagraficaLeggiRes wsdmAnagraficaLeggiRes = new WSDMAnagraficaLeggiRes();
    wsdmAnagraficaLeggiRes.setEsito(false);
    wsdmAnagraficaLeggiRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmAnagraficaLeggiRes;
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
  public WSDMListaAccountEmailRes _listaAccountEmail(String username, String password, WSDMLoginAttr loginAttr,
      WSDMRicercaAccountEmail ricercaAccountEmail) {
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
  
  private static String conversioneCaratteriXML(String testo) {
    String result = null;

    StringTokenizer tokenizer = new StringTokenizer(testo, "&<>\"%", true);
    int tokenCount = tokenizer.countTokens();

    if (tokenCount == 1)
      result = testo.trim();
    else {
      /*
       * text.length + (tokenCount * 6) Creo il buffer grande in modo da non
       * richiedere un'espansione del buffer che è molto costosa in termini
       * d'utilizzo del processore
       */
      StringBuffer buffer = new StringBuffer(testo.length() + tokenCount * 6);
      while (tokenizer.hasMoreTokens()) {
        String token = tokenizer.nextToken();
        if (token.length() == 1) {
          switch (token.charAt(0)) {
          case '&':
            buffer.append("&amp;");
            break;
          case '<':
            buffer.append("&lt;");
            break;
          case '>':
            buffer.append("&gt;");
            break;
          case '"':
            buffer.append("&quot;");
            break;
          default:
            buffer.append(token);
          }
        } else {
          buffer.append(token);
        }
      }

      result = buffer.toString().trim();
    }

    return result;
  }
  
  @Override
  public WSDMProtocolloDocumentoRes _protocolloAsincronoEsito(String username, String password, WSDMLoginAttr loginAttr, String id) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    wsdmprotocolloDocumentoRes.setEsito(false);
    wsdmprotocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmprotocolloDocumentoRes;
  }
  
}
