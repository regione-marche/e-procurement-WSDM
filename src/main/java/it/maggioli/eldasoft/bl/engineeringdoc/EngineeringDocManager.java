package it.maggioli.eldasoft.bl.engineeringdoc;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import javax.activation.DataHandler;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.AttachmentPart;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.ws.WebServiceException;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.log4j.Logger;
import org.apache.ws.security.WSSecurityException;
import org.apache.ws.security.util.Base64;
import org.w3c.dom.NodeList;

import it.engineering.documentale.xsd.baseoutput_ws.BaseOutputWS;
import it.engineering.documentale.xsd.estermixidentificazioneud.EstremiRegNumType;
import it.engineering.documentale.xsd.estermixidentificazioneud.EstremiXIdentificazioneUD;
import it.engineering.documentale.xsd.newfolder.AssegnatarioEffType;
import it.engineering.documentale.xsd.newfolder.ClassificazioneType;
import it.engineering.documentale.xsd.newfolder.FascDiTitolarioType;
import it.engineering.documentale.xsd.newfolder.LivelloGerarchiaType;
import it.engineering.documentale.xsd.newfolder.NewFolder;
import it.engineering.documentale.xsd.newud.AllegatoUDType;
import it.engineering.documentale.xsd.newud.AssegnazioneInternaType;
import it.engineering.documentale.xsd.newud.AttributoAddizionaleType;
import it.engineering.documentale.xsd.newud.ClassifFascicoloType;
import it.engineering.documentale.xsd.newud.ClassifUAType;
import it.engineering.documentale.xsd.newud.DestinatarioEsternoType;
import it.engineering.documentale.xsd.newud.NewUD;
import it.engineering.documentale.xsd.newud.NewUD.CollocazioneClassificazioneUD;
import it.engineering.documentale.xsd.newud.NewUD.DatiEntrata;
import it.engineering.documentale.xsd.newud.NewUD.DatiProduzione;
import it.engineering.documentale.xsd.newud.NewUD.DatiUscita;
import it.engineering.documentale.xsd.newud.NewUD.RegistrazioneDaDare;
import it.engineering.documentale.xsd.newud.SoggettoEsternoType;
import it.engineering.documentale.xsd.newud.UOType;
import it.engineering.documentale.xsd.newud.VersioneElettronicaType;
import it.engineering.documentale.xsd.outputdatifolder.DatiFolder;
import it.engineering.documentale.xsd.outputdatifolder.DatiFolder.Apertura;
import it.engineering.documentale.xsd.outputdatiud.ClassifFascicoloEstesoType;
import it.engineering.documentale.xsd.outputdatiud.DatiUD;
import it.engineering.documentale.xsd.outputfilesud.OutputFilesUD;
import it.engineering.documentale.xsd.outputfilesud.OutputFilesUD.DatiFileEstratto;
import it.engineering.documentale.xsd.outputorganigramma.NodoOrganigrammaType;
import it.engineering.documentale.xsd.outputud.OutputUD;
import it.engineering.documentale.xsd.searchoutputstd.Lista;
import it.engineering.documentale.xsd.searchoutputstd.Lista.Riga;
import it.engineering.documentale.xsd.searchoutputstd.Lista.Riga.Colonna;
import it.engineering.documentale.xsd.trovadocfolder.CriterioRicercaSuAttributoAddType;
import it.engineering.documentale.xsd.trovadocfolder.OggDiTabDiSistemaType;
import it.engineering.documentale.xsd.trovadocfolder.TrovaDocFolder;
import it.engineering.documentale.xsd.trovadocfolder.TrovaDocFolder.FiltriAvanzati;
import it.engineering.documentale.xsd.trovadocfolder.TrovaDocFolder.FiltriAvanzati.RegistrazioneDoc;
import it.engineering.documentale.xsd.trovadocfolder.TrovaDocFolder.FiltriPrincipali;
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
import it.maggioli.eldasoft.ws.dm.WSDMTipoVoceRubrica;
import it.maggioli.eldasoft.ws.dm.WSDMTrasmissioneIn;
import it.maggioli.eldasoft.ws.dm.WSDMTrasmissioneRes;
import it.maggioli.eldasoft.ws.dm.WSDMUfficio;
import it.maggioli.eldasoft.ws.dm.WSDMVerificaMailRes;

/**
 * Manager per la gestione documentale mediante sistema di protocollo
 * ENGINEERINGDOC.
 * 
 */

public class EngineeringDocManager implements IWSDMManager {

  static Logger               logger                                = Logger.getLogger(EngineeringDocManager.class);

  // Informazioni relative al documentale
  static private String       WSADDUD                               = "java:comp/env/ENGINEERINGDOC_WSADDUD";
  static private String       ADDUD_DISPACH_METHOD                  = "http://addunitadoc.webservices.repository2.auriga.eng.it";

  static private String       WSGETMETADATAUD                       = "java:comp/env/ENGINEERINGDOC_WSGETMETADATAUD";
  static private String       GETMETADATAUD_DISPATCH_METHOD         = "http://getmetadataud.webservices.repository2.auriga.eng.it";

  static private String       WSEXTRACTMULTI                        = "java:comp/env/ENGINEERINGDOC_WSEXTRACTMULTI";
  static private String       EXTRACTMULTI_DISPATCH_METHOD          = "http://extractmulti.webservices.repository2.auriga.eng.it";

  static private String       WSADDFOLDER                           = "java:comp/env/ENGINEERINGDOC_WSADDFOLDER";
  static private String       WSADDFOLDER_DISPATCH_METHOD           = "http://addfolder.webservices.repository2.auriga.eng.it";
  static private String       ADDFOLDER_GENERICS12                  = "java:comp/env/ENGINEERINGDOC_ADDFOLDER_GENERICS12";
  static private String       ADDFOLDER_STRUTTURA                   = "java:comp/env/ENGINEERINGDOC_ADDFOLDER_STRUTTURA";

  static private String       WSGETMETADATAFOLDER                   = "java:comp/env/ENGINEERINGDOC_WSGETMETADATAFOLDER";
  static private String       GETMETADATAFOLDER_DISPATCH_METHOD     = "http://getmetadatafolder.webservices.repository2.auriga.eng.it";

  static private String       WSTROVADOCFOLDER                      = "java:comp/env/ENGINEERINGDOC_WSTROVADOCFOLDER";
  static private String       TROVADOCFOLDER_DISPATCH_METHOD        = "http://trovadocfolder.webservices.repository2.auriga.eng.it";

  static private String       WSTROVAINORGANIGRAMMA                 = "java:comp/env/ENGINEERINGDOC_WSTROVAINORGANIGRAMMA";
  static private String       TROVAINORGANIGRAMMA_DISPATCH_METHOD   = "http://trovainorganigramma.webservices.repository2.auriga.eng.it";

  static private String       BEARER_OAUTH2                         = "java:comp/env/ENGINEERINGDOC_BEARER_OAUTH2";

  static private String       WSADDUD_URL_NOT_DEFINED               = "WSDM - indirizzo servizio di inserimento di una unita' documentaria non definito. ";
  static private String       WSGETMETADATAUD_URL_NOT_DEFINED       = "WSDM - indirizzo servizio di estrazione dei metadati di una unita' documentaria non definito. ";
  static private String       WSEXTRACTMULTI_URL_NOT_DEFINED        = "WSDM - indirizzo servizio di estrazione di tutti i file relativi ad una unita' documentaria non definito. ";
  static private String       WSADDFOLDER_URL_NOT_DEFINED           = "WSDM - indirizzo servizio di creazione di un nuovo folder non definito. ";
  static private String       WSGETMETADATAFOLDER_URL_NOT_DEFINED   = "WSDM - indirizzo servizio di estrazione dei metadati di un folder non definito. ";
  static private String       WSTROVADOCFOLDER_URL_NOT_DEFINED      = "WSDM - indirizzo servizio di ricerca nel repository documentale non definito. ";
  static private String       WSTROVAINORGANIGRAMMA_URL_NOT_DEFINED = "WSDM - indirizzo servizio di ricerca nell'organigramma non definito. ";

  static private String       BEARER_OAUTH2_NOT_DEFINED             = "WSDM - codice di autenticazione BEARER OAUTH2 non definito. ";

  static private String       CODICEAPPLICAZIONE                    = "java:comp/env/ENGINEERINGDOC_CODICEAPPLICAZIONE";
  static private String       ISTANZAAPPLICAZIONE                   = "java:comp/env/ENGINEERINGDOC_ISTANZAAPPLICAZIONE";

  // Documentale - stati per l'oggetto BaseOutputWS
  static private final String WSRESULT_SUCCESS                      = "1";

  // Documentale - tipo provenienza, indica se unità documentaria in entrata
  // (E), uscita (U) o interna (I)
  static public final String  ENG_DOCUMENTALE_IN_ENTRATA            = "E";
  static public final String  ENG_DOCUMENTALE_IN_USCITA             = "U";
  static public final String  ENG_DOCUMENTALE_INTERNO               = "I";

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

    if ("NDEF".equals(password)) {
      password = null;
    }

    WSDMListaUfficiRes wsdmListaUfficiRes = new WSDMListaUfficiRes();

    try {
      String xmlTrovaInOrganigramma = "";
      xmlTrovaInOrganigramma += "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
      xmlTrovaInOrganigramma += "<TrovaInOrganigramma>";
      xmlTrovaInOrganigramma += "<TipoNodo>UO</TipoNodo>";
      xmlTrovaInOrganigramma += "<FinalitaRicerca>ASSEGNAZIONE</FinalitaRicerca>";
      xmlTrovaInOrganigramma += "<DesNodo>" + "*" + descrizioneUfficio + "*" + "</DesNodo>";
      xmlTrovaInOrganigramma += "</TrovaInOrganigramma>";

      // XML Hash
      byte[] xmlTrovaInOrganigrammaHash = DigestUtils.sha(xmlTrovaInOrganigramma.getBytes("UTF-8"));
      String xmlTrovaInOrganigrammaHashBase64 = Base64.encode(xmlTrovaInOrganigrammaHash);

      // Servizio per la lettura dell'organigramma
      String urlWsTrovaInOrganigramma = InitialContext.doLookup(WSTROVAINORGANIGRAMMA);
      if (urlWsTrovaInOrganigramma == null || (urlWsTrovaInOrganigramma != null && "".equals(urlWsTrovaInOrganigramma.trim()))) {
        throw new Exception(WSGETMETADATAFOLDER_URL_NOT_DEFINED);
      }

      SOAPMessage soapMessageOrganigramma = _sendRequestSOAP(username, password, xmlTrovaInOrganigramma, xmlTrovaInOrganigrammaHashBase64,
          urlWsTrovaInOrganigramma, TROVAINORGANIGRAMMA_DISPATCH_METHOD, null);
      BaseOutputWS baseOutputOrganigramma = _getBaseOutputWS(soapMessageOrganigramma);

      // Lettura della risposta
      if (WSRESULT_SUCCESS.equals(baseOutputOrganigramma.getWSResult())) {

        Iterator<AttachmentPart> attachmentsOrganigramma = soapMessageOrganigramma.getAttachments();

        while (attachmentsOrganigramma.hasNext()) {
          AttachmentPart attOrganigramma = (AttachmentPart) attachmentsOrganigramma.next();
          DataHandler handlerOrganigramma = attOrganigramma.getDataHandler();
          ByteArrayOutputStream baosFolder = new ByteArrayOutputStream();
          handlerOrganigramma.writeTo(baosFolder);
          String datiOrganigrammaXMLEscape = baosFolder.toString();
          String datiOrganigrammaXML = StringEscapeUtils.unescapeXml(datiOrganigrammaXMLEscape);
          datiOrganigrammaXML = datiOrganigrammaXML.replace("\u00a0", " ");

          if (logger.isDebugEnabled()) logger.debug("datiOrganigrammaXMLEscape: " + datiOrganigrammaXMLEscape);
          if (logger.isDebugEnabled()) logger.debug("datiOrganigrammaXML: " + datiOrganigrammaXML);

          JAXBContext jaxbContext = JAXBContext.newInstance(it.engineering.documentale.xsd.outputorganigramma.Lista.class);
          Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
          StringBuffer stringBufferXML = new StringBuffer(datiOrganigrammaXML);
          Object objectJAXB = unmarshaller.unmarshal(new StringReader(stringBufferXML.toString()));

          it.engineering.documentale.xsd.outputorganigramma.Lista listaUO = (it.engineering.documentale.xsd.outputorganigramma.Lista) objectJAXB;

          List<NodoOrganigrammaType> listaNodiOrganigramma = listaUO.getNodoOrganigramma();

          if (listaNodiOrganigramma.size() > 0) {
            wsdmListaUfficiRes.setEsito(true);
            WSDMUfficio[] wsdmUffici = new WSDMUfficio[listaNodiOrganigramma.size()];
            for (int n = 0; n < listaNodiOrganigramma.size(); n++) {
              NodoOrganigrammaType nodoOrganigramma = listaNodiOrganigramma.get(n);
              String desNodo = nodoOrganigramma.getDesEstesaNodo();
              String codiceUO = nodoOrganigramma.getCodiceUO();
              wsdmUffici[n] = new WSDMUfficio();
              wsdmUffici[n].setDescrizioneUfficio(desNodo);
              wsdmUffici[n].setCodiceUfficio(codiceUO);
              wsdmListaUfficiRes.setListaUffici(wsdmUffici);
            }
            wsdmListaUfficiRes.setListaUffici(wsdmUffici);
          } else {
            wsdmListaUfficiRes.setEsito(false);
            wsdmListaUfficiRes.setMessaggio("Nessun elemento trovato");
          }
        }

      } else {
        wsdmListaUfficiRes.setEsito(false);
        String errorContext = baseOutputOrganigramma.getWSError().getErrorContext();
        BigInteger errorNumber = baseOutputOrganigramma.getWSError().getErrorNumber();
        String errorMessage = baseOutputOrganigramma.getWSError().getErrorMessage();
        wsdmListaUfficiRes.setMessaggio(errorContext + ", " + errorNumber.toString() + ", " + errorMessage);
      }

    } catch (WebServiceException w) {
      wsdmListaUfficiRes.setEsito(false);
      wsdmListaUfficiRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_listaUffici)", w);
    } catch (NamingException e) {
      wsdmListaUfficiRes.setEsito(false);
      wsdmListaUfficiRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_listaUffici)", e);
    } catch (Throwable t) {
      wsdmListaUfficiRes.setEsito(false);
      wsdmListaUfficiRes.setMessaggio(t.getMessage());
      logger.error("Errore (_listaUffici)", t);
    }

    return wsdmListaUfficiRes;
  }

  @Override
  public WSDMProtocolloDocumentoRes _documentoInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {
    return _protocolloDocumentoInserisci(username, password, loginAttr, wsdmprotocolloDocumentoIn, false);
  }

  @Override
  public WSDMProtocolloDocumentoRes _protocolloInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {
    return _protocolloDocumentoInserisci(username, password, loginAttr, wsdmprotocolloDocumentoIn, true);
  }

  @Override
  public WSDMProtocolloDocumentoRes _protocolloLeggi(String username, String password, WSDMLoginAttr loginAttr, Long annoProtocollo,
      String numeroProtocollo) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    if ("NDEF".equals(password)) {
      password = null;
    }

    try {

      StringBuffer messaggioCtr = new StringBuffer();
      if (EngineeringDocUtilityControllo.ctrProtocolloLeggi(loginAttr, annoProtocollo, numeroProtocollo, messaggioCtr)) {
        wsdmprotocolloDocumentoRes = this.getMetadataUDExtractMulti(username, password, annoProtocollo, numeroProtocollo, null, true);
      } else {
        // Il controllo preliminare non ha dato esito positivo.
        // Si segnala all'utente il problema.
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (WebServiceException w) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_documentoLeggi)", w);
    } catch (NamingException e) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_documentoLeggi)", e);
    } catch (Throwable t) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(t.getMessage());
      logger.error("Errore (_documentoLeggi)", t);
    }
    return wsdmprotocolloDocumentoRes;
  }

  private WSDMProtocolloDocumentoRes _protocolloDocumentoInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn, boolean isProtocollo) {

    if ("NDEF".equals(password)) {
      password = null;
    }

    // Il file XML in input ha come root element l'elemento NewUD riportato
    // nell'XSD NewUD.xsd. Il file primario e i file
    // allegati dell'unità documentaria (che possono esserci o meno) sono
    // passati come attachment del messaggio SOAP. L'ordine con cui vengono
    // allegati e' irrilevante ai fini di come vengono salvati in banca dati,
    // perché l'XSD del file XML in input prevede di poter indicare come salvare
    // ogni attachment (se come file primario o come un certo allegato con
    // eventuali metadati di corredo). L'output del Web Service e' un file XML
    // con tracciato come in allegato BaseOutput_WS.xsd. In output e' presente,
    // in caso di successo, un attach XML (tracciato in allegato Output_UD.xsd)
    // con l'identificativo univoco dell'unita' documentaria caricata e con gli
    // eventuali estremi delle nuove registrazioni/numerazioni che si e'
    // richiesto di assegnare all'unità documentaria stessa. Si tenga conto che
    // l'output del Web Service puo' indicare un esito positivo anche in
    // presenza di warning, ovvero errori non bloccanti; in particolare e'
    // ritenuto tale il fallito caricamento nella repository degli eventuali
    // documenti
    // elettronici specificati: l'informazione dettagliata di quali file non
    // sono stati caricati e' nell'attach XML che ha tracciato Output_UD.xsd.
    // Dettagli sui tracciati dell'XML in input e in output si trovano nei
    // commenti degli allegati NewUD.xsd e Output_UD.xsd.

    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    try {

      StringBuffer messaggioCtr = new StringBuffer();
      if (EngineeringDocUtilityControllo.ctrProtocolloDocumentoInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {

        // Verifica indirizzi
        String urlWSAddUD = InitialContext.doLookup(WSADDUD);
        if (urlWSAddUD == null || (urlWSAddUD != null && "".equals(urlWSAddUD.trim()))) {
          throw new Exception(WSADDUD_URL_NOT_DEFINED);
        }

        NewUD newUD = new NewUD();

        // Oggetto unita' documentaria
        newUD.setOggettoUD(wsdmprotocolloDocumentoIn.getOggetto());

        // Tipo di registrazione
        if (isProtocollo == true) {
          RegistrazioneDaDare registrazioneDaDare = new RegistrazioneDaDare();
          registrazioneDaDare.setCategoriaReg("PG");
          newUD.getRegistrazioneDaDare().add(registrazioneDaDare);
        }

        // Note unita' documentaria
        newUD.setNoteUD(wsdmprotocolloDocumentoIn.getDescrizione());

        // Provenienza: indica se unita' documentaria in entrata (E), uscita (U)
        // o interna (I)
        if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
          newUD.setTipoProvenienza(ENG_DOCUMENTALE_IN_ENTRATA);
        } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
          newUD.setTipoProvenienza(ENG_DOCUMENTALE_IN_USCITA);
        } else if (WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
          newUD.setTipoProvenienza(ENG_DOCUMENTALE_INTERNO);
        }

        // Gestione del fascicolo.
        // L'indicazione del fascicolo e' obbligatoria in uscita: deve essere
        // indicato un fascicolo esistente.
        // Per supportare l'indicazione di un nuovo fascicolo e' necessario
        // inserire "autonomamente" il nuovo fascicolo, richiamando il metodo
        // _fascicoloInserisci, e referenziando la risposta nella creazione
        // del
        // nuovo protocollo.
        boolean esitoInserimentoFascicolo = true;

        Long annoFascicolo = null;
        String numeroFascicolo = null;
        String classificaFascicolo = null;
        String codiceFascicolo = null;

        if (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {

          CollocazioneClassificazioneUD collocazioneClassificazioneUD = new CollocazioneClassificazioneUD();
          List<ClassifFascicoloType> listaClassifFascicolo = collocazioneClassificazioneUD.getClassifFascicolo();
          ClassifFascicoloType classifFascicolo = new ClassifFascicoloType();
          ClassifUAType classifUA = new ClassifUAType();

          // Codice fascicolo
          codiceFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getCodiceFascicolo();

          // Anno fascicolo
          annoFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getAnnoFascicolo();
          classifUA.setAnnoAperturaUA(annoFascicolo.intValue());

          // Livelli di classificazione del fascicolo
          if (wsdmprotocolloDocumentoIn.getFascicolo().getClassificaFascicolo() != null) {
            classificaFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getClassificaFascicolo();
            String[] classificaFascicoloSplit = classificaFascicolo.split("\\.");
            if (classificaFascicoloSplit.length > 0) {
              for (int c = 0; c < classificaFascicoloSplit.length; c++) {
                it.engineering.documentale.xsd.newud.LivelloGerarchiaType livelloClassificazione = new it.engineering.documentale.xsd.newud.LivelloGerarchiaType();
                livelloClassificazione.setNro(c + 1);
                livelloClassificazione.setCodice(classificaFascicoloSplit[c]);
                classifUA.getLivelloClassificazione().add(livelloClassificazione);
              }
            }
          }

          // Numero progressivo
          numeroFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getNumeroFascicolo();
          classifUA.setNroProgrUA(new BigInteger(numeroFascicolo));
          classifFascicolo.setClassifUA(classifUA);
          listaClassifFascicolo.add(classifFascicolo);
          newUD.setCollocazioneClassificazioneUD(collocazioneClassificazioneUD);

        } else if (WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
          String oggettoNuovoFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getOggettoFascicolo();
          String descrizioneNuovoFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getDescrizioneFascicolo();
          String classificaNuovoFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getClassificaFascicolo();
          String strutturaNuovoFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getStruttura();
          WSDMFascicoloIn wsdmNuovoFascicoloIn = new WSDMFascicoloIn();
          wsdmNuovoFascicoloIn.setOggettoFascicolo(oggettoNuovoFascicolo);
          wsdmNuovoFascicoloIn.setDescrizioneFascicolo(descrizioneNuovoFascicolo);
          wsdmNuovoFascicoloIn.setClassificaFascicolo(classificaNuovoFascicolo);
          wsdmNuovoFascicoloIn.setStruttura(strutturaNuovoFascicolo);
          WSDMFascicoloRes wsdmNuovoFascicoloRes = this._fascicoloInserisci(username, password, loginAttr, wsdmNuovoFascicoloIn);
          if (!wsdmNuovoFascicoloRes.isEsito()) {
            esitoInserimentoFascicolo = false;
            wsdmprotocolloDocumentoRes.setEsito(false);
            wsdmprotocolloDocumentoRes.setMessaggio(
                "L'inserimento del nuovo fascicolo ha restituito il messaggio: " + wsdmNuovoFascicoloRes.getMessaggio());
          } else {
            WSDMFascicolo nuovoFascicolo = wsdmNuovoFascicoloRes.getFascicolo();
            CollocazioneClassificazioneUD collocazioneClassificazioneUD = new CollocazioneClassificazioneUD();
            List<ClassifFascicoloType> listaClassifFascicolo = collocazioneClassificazioneUD.getClassifFascicolo();
            ClassifFascicoloType classifFascicolo = new ClassifFascicoloType();
            ClassifUAType classifUA = new ClassifUAType();

            // Codice fascicolo
            codiceFascicolo = nuovoFascicolo.getCodiceFascicolo();

            // Anno fascicolo
            annoFascicolo = nuovoFascicolo.getAnnoFascicolo();
            classifUA.setAnnoAperturaUA(annoFascicolo.intValue());

            // *** Livelli di classificazione del fascicolo
            if (nuovoFascicolo.getClassificaFascicolo() != null) {
              classificaFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getClassificaFascicolo();
              String[] classificaFascicoloSplit = classificaFascicolo.split("\\.");
              if (classificaFascicoloSplit.length > 0) {
                for (int c = 0; c < classificaFascicoloSplit.length; c++) {
                  it.engineering.documentale.xsd.newud.LivelloGerarchiaType livelloClassificazione = new it.engineering.documentale.xsd.newud.LivelloGerarchiaType();
                  livelloClassificazione.setNro(c + 1);
                  livelloClassificazione.setCodice(classificaFascicoloSplit[c]);
                  classifUA.getLivelloClassificazione().add(livelloClassificazione);
                }
              }
            }

            // Numero progressivo
            numeroFascicolo = nuovoFascicolo.getNumeroFascicolo();
            classifUA.setNroProgrUA(new BigInteger(numeroFascicolo));
            classifFascicolo.setClassifUA(classifUA);
            listaClassifFascicolo.add(classifFascicolo);
            newUD.setCollocazioneClassificazioneUD(collocazioneClassificazioneUD);
          }
        }

        if (esitoInserimentoFascicolo == true) {

          // Documento in entrata
          // Valorizzare i dati di acquisizione "DatiEntrata" con i mittenti
          // esterni
          this._protocolloDocumentoInserisciIN(wsdmprotocolloDocumentoIn, newUD);

          // Documento interno (tra uffici)
          // Valorizzare "DatiEntrata" con l'identificativo dell'unita'
          // organizzativa destinataria (ricezione)
          this._protocolloDocumentoInserisciINT(wsdmprotocolloDocumentoIn, newUD);

          // Documento in uscita
          // Valorizzare "DatiUscita" con i destinatari esterni e l'ufficio di
          // spedizione con l'identificativo mittente
          // Valorizzare "DatiProduzione" con l'identificativo dell'unita'
          // organizzativa mittente (produttore)
          this._protocolloDocumentoInserisciOUT(wsdmprotocolloDocumentoIn, newUD);

          // Gestione invio mail
          _protocolloDocumentoInserisciInviaMail(wsdmprotocolloDocumentoIn, newUD);

          // Allegati. Gli allegati devono essere gestiti in "attach".
          // All'interno dell'XML di richiesta deve essere indicato il numero di
          // attach.
          this._protocolloDocumentoInserisciAggiungiAllegati(wsdmprotocolloDocumentoIn, newUD);

          // Conversione in stringa XML
          StringWriter xmlNewUDStringWriter = new StringWriter();
          JAXBContext jaxbLocalContext = JAXBContext.newInstance(NewUD.class);
          jaxbLocalContext.createMarshaller().marshal(newUD, xmlNewUDStringWriter);
          String xmlNewUDInput = xmlNewUDStringWriter.toString();

          // XML Hash
          byte[] xmlNewUDHash = DigestUtils.sha(xmlNewUDInput.getBytes("UTF-8"));
          String xmlNewUDHashBase64 = Base64.encode(xmlNewUDHash);

          WSDMProtocolloAllegato[] allegati = wsdmprotocolloDocumentoIn.getAllegati();
          SOAPMessage soapMessageAddUdBase = _sendRequestSOAP(username, password, xmlNewUDInput, xmlNewUDHashBase64, urlWSAddUD,
              ADDUD_DISPACH_METHOD, allegati);
          BaseOutputWS baseOutputAddUd = _getBaseOutputWS(soapMessageAddUdBase);

          if (WSRESULT_SUCCESS.equals(baseOutputAddUd.getWSResult())) {

            WSDMProtocolloDocumento wsdmprotocolloDocumento = new WSDMProtocolloDocumento();

            Iterator<AttachmentPart> attachmentsAddUd = soapMessageAddUdBase.getAttachments();

            while (attachmentsAddUd.hasNext()) {
              AttachmentPart attachPart = attachmentsAddUd.next();
              DataHandler handler = attachPart.getDataHandler();
              ByteArrayOutputStream baos = new ByteArrayOutputStream();
              handler.writeTo(baos);
              String datiOutputUDXMLEscape = baos.toString();
              String datiOutputUDXML = StringEscapeUtils.unescapeXml(datiOutputUDXMLEscape);
              datiOutputUDXML = datiOutputUDXML.replace("\u00a0", " ");

              if (logger.isDebugEnabled()) logger.debug("datiOutputUDXMLEscape: " + datiOutputUDXMLEscape);
              if (logger.isDebugEnabled()) logger.debug("datiOutputUDXML: " + datiOutputUDXML);

              // <?xml version="1.0" encoding="ISO-8859-1"?>
              // <Output_UD>
              // <IdUD>274505</IdUD>
              // <RegistrazioneDataUD>
              // <CategoriaReg>PG</CategoriaReg>
              // <SiglaReg></SiglaReg>
              // <AnnoReg>2021</AnnoReg>
              // <NumReg>249</NumReg>
              // <DataOraReg>2021-05-31T10:15:27+02:00</DataOraReg>
              // </RegistrazioneDataUD>

              OutputUD outputUD = this.getOutputUDFromXML(datiOutputUDXML);
              if (outputUD.getRegistrazioneDataUD() != null) {
                List<it.engineering.documentale.xsd.outputud.EstremiRegNumType> listaRegistrazioneDataUD = outputUD.getRegistrazioneDataUD();
                if (listaRegistrazioneDataUD != null && listaRegistrazioneDataUD.size() > 0) {
                  it.engineering.documentale.xsd.outputud.EstremiRegNumType registrazioneDataUD = listaRegistrazioneDataUD.get(0);
                  wsdmprotocolloDocumento.setSiglaRegistrazione(registrazioneDataUD.getSiglaReg());
                  wsdmprotocolloDocumento.setAnnoRegistrazione(new Long(registrazioneDataUD.getAnnoReg()));
                  wsdmprotocolloDocumento.setNumeroRegistrazione(new Long(registrazioneDataUD.getNumReg()));
                  // wsdmprotocolloDocumento.setDataRegistrazione(registrazioneDataUD.getDataOraReg().toGregorianCalendar().getTime());

                  if ("PG".equals(registrazioneDataUD.getCategoriaReg())) {
                    wsdmprotocolloDocumento.setAnnoProtocollo(new Long(registrazioneDataUD.getAnnoReg()));
                    wsdmprotocolloDocumento.setNumeroProtocollo(String.valueOf(registrazioneDataUD.getNumReg()));
                  } else {
                    wsdmprotocolloDocumento.setAnnoProtocollo(null);
                    wsdmprotocolloDocumento.setNumeroProtocollo(null);
                  }

                }
              }

              wsdmprotocolloDocumento.setNumeroDocumento(String.valueOf(outputUD.getIdUD()));

            }

            if (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())
                || WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
              WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();
              wsdmFascicolo.setAnnoFascicolo(annoFascicolo);
              wsdmFascicolo.setNumeroFascicolo(numeroFascicolo);
              wsdmFascicolo.setCodiceFascicolo(codiceFascicolo);
              wsdmFascicolo.setClassificaFascicolo(classificaFascicolo);
              wsdmprotocolloDocumento.setFascicolo(wsdmFascicolo);
            }

            wsdmprotocolloDocumentoRes.setEsito(true);
            wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmprotocolloDocumento);

          } else {
            wsdmprotocolloDocumentoRes.setEsito(false);
            String errorContext = baseOutputAddUd.getWSError().getErrorContext();
            BigInteger errorNumber = baseOutputAddUd.getWSError().getErrorNumber();
            String errorMessage = baseOutputAddUd.getWSError().getErrorMessage();
            wsdmprotocolloDocumentoRes.setMessaggio(errorContext + ", " + errorNumber.toString() + ", " + errorMessage);
          }

        }
      } else {
        // Il controllo preliminare non ha dato esito positivo.
        // Si segnala all'utente il problema.
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

  /**
   * 
   * @param wsdmprotocolloDocumentoIn
   * @param newUD
   */
  private void _protocolloDocumentoInserisciInviaMail(WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn, NewUD newUD) {
    if (wsdmprotocolloDocumentoIn.getInviaMail() != null) {
      AttributoAddizionaleType attributoEmail = new AttributoAddizionaleType();
      attributoEmail.setNome("INDIRIZZO_EMAIL_DEST_Ud");
      String[] destinatariMail = wsdmprotocolloDocumentoIn.getInviaMail().getDestinatariMail();
      if (destinatariMail != null && destinatariMail.length > 0) {
        it.engineering.documentale.xsd.newud.AttributoAddizionaleType.Lista _lista = new it.engineering.documentale.xsd.newud.AttributoAddizionaleType.Lista();
        for (int m = 0; m < destinatariMail.length; m++) {
          it.engineering.documentale.xsd.newud.AttributoAddizionaleType.Lista.Riga _riga = new it.engineering.documentale.xsd.newud.AttributoAddizionaleType.Lista.Riga();
          List<it.engineering.documentale.xsd.newud.AttributoAddizionaleType.Lista.Riga.Colonna> _listaColonna = _riga.getColonna();
          it.engineering.documentale.xsd.newud.AttributoAddizionaleType.Lista.Riga.Colonna _colonna = new it.engineering.documentale.xsd.newud.AttributoAddizionaleType.Lista.Riga.Colonna();
          _colonna.setNro(new BigInteger("1"));
          _colonna.setContent(destinatariMail[m]);
          _listaColonna.add(_colonna);
          _lista.getRiga().add(_riga);
        }
        attributoEmail.setLista(_lista);
      }
      newUD.getAttributoAddUD().add(attributoEmail);
    }
  }

  /**
   * Gestione dei dati per unita' documentari in ingresso (IN).
   * 
   * @param wsdmprotocolloDocumentoIn
   * @param newUD
   */
  private void _protocolloDocumentoInserisciIN(WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn, NewUD newUD) {
    if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
      WSDMProtocolloAnagrafica[] mittenti = wsdmprotocolloDocumentoIn.getMittenti();
      DatiEntrata datiEntrata = new DatiEntrata();
      // Mittenti
      if (mittenti != null && mittenti.length > 0) {
        List<SoggettoEsternoType> mittentiEsterni = datiEntrata.getMittenteEsterno();
        for (int mi = 0; mi < mittenti.length; mi++) {
          SoggettoEsternoType mittenteEsterno = new SoggettoEsternoType();
          mittenteEsterno.setDenominazioneCognome(mittenti[mi].getCognomeointestazione());
          mittenteEsterno.setNome(mittenti[mi].getNome());
          mittenteEsterno.setCodiceFiscale(mittenti[mi].getCodiceFiscale());
          if (WSDMTipoVoceRubrica.IMPRESA.equals(mittenti[mi].getTipoVoceRubrica())) {
            mittenteEsterno.setFlagFisica("0");
          } else {
            mittenteEsterno.setFlagFisica("1");
          }
          mittentiEsterni.add(mittenteEsterno);
        }
      }
      newUD.setDatiEntrata(datiEntrata);

      // Ufficio ricezione
      // if (wsdmprotocolloDocumentoIn.getIdUnitaOperativaDestinataria() != null
      // &&
      // !"".equals(wsdmprotocolloDocumentoIn.getIdUnitaOperativaDestinataria().trim()))
      // {
      // UOType uoDestinataria = new UOType();
      // uoDestinataria.setIdUO(BigInteger.valueOf(new
      // Long(wsdmprotocolloDocumentoIn.getIdUnitaOperativaDestinataria())));
      // datiEntrata.setUffRicezione(uoDestinataria);
      // }

      // Ufficio ricezione
      if (wsdmprotocolloDocumentoIn.getIdUnitaOperativaDestinataria() != null
          && !"".equals(wsdmprotocolloDocumentoIn.getIdUnitaOperativaDestinataria().trim())) {
        AssegnazioneInternaType assegnazioneInterna = new AssegnazioneInternaType();
        UOType uo = new UOType();

        String idUnita = wsdmprotocolloDocumentoIn.getIdUnitaOperativaDestinataria().trim();
        String[] idUnitaSplit = idUnita.split("\\.");

        if (idUnitaSplit.length > 0) {
          for (int u = 0; u < idUnitaSplit.length; u++) {
            it.engineering.documentale.xsd.newud.LivelloGerarchiaType livelloUO = new it.engineering.documentale.xsd.newud.LivelloGerarchiaType();
            livelloUO.setNro(u + 1);
            livelloUO.setCodice(idUnitaSplit[u]);
            uo.getLivelloUO().add(livelloUO);
          }
        }
        assegnazioneInterna.setUO(uo);
        assegnazioneInterna.setFlagPerConoscenza("0");
        newUD.getAssegnazioneInterna().add(assegnazioneInterna);
      }
      
      // Unita' operativa di competenza
      if (wsdmprotocolloDocumentoIn.getGenericS31() != null
          && !"".equals(wsdmprotocolloDocumentoIn.getGenericS31().trim())) {
        AssegnazioneInternaType assegnazioneInterna = new AssegnazioneInternaType();
        UOType uo = new UOType();

        String idUnita = wsdmprotocolloDocumentoIn.getGenericS31().trim();
        String[] idUnitaSplit = idUnita.split("\\.");

        if (idUnitaSplit.length > 0) {
          for (int u = 0; u < idUnitaSplit.length; u++) {
            it.engineering.documentale.xsd.newud.LivelloGerarchiaType livelloUO = new it.engineering.documentale.xsd.newud.LivelloGerarchiaType();
            livelloUO.setNro(u + 1);
            livelloUO.setCodice(idUnitaSplit[u]);
            uo.getLivelloUO().add(livelloUO);
          }
        }
        assegnazioneInterna.setUO(uo);
        assegnazioneInterna.setFlagPerConoscenza("0");
        newUD.getAssegnazioneInterna().add(assegnazioneInterna);
      }
      
    }
  }

  /**
   * Gestione dei dati per unita' documentarie tra uffici (INT).
   * 
   * @param wsdmprotocolloDocumentoIn
   * @param newUD
   */
  private void _protocolloDocumentoInserisciINT(WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn, NewUD newUD) {
    if (WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {

      // Ufficio produttore
      if (wsdmprotocolloDocumentoIn.getIdUnitaOperativaMittente() != null
          && !"".equals(wsdmprotocolloDocumentoIn.getIdUnitaOperativaMittente().trim())) {

        DatiProduzione datiProduzione = new DatiProduzione();
        UOType uffProduttore = new UOType();

        String idUnita = wsdmprotocolloDocumentoIn.getIdUnitaOperativaMittente().trim();
        String[] idUnitaSplit = idUnita.split("\\.");

        if (idUnitaSplit.length > 0) {
          for (int u = 0; u < idUnitaSplit.length; u++) {
            it.engineering.documentale.xsd.newud.LivelloGerarchiaType livelloUO = new it.engineering.documentale.xsd.newud.LivelloGerarchiaType();
            livelloUO.setNro(u + 1);
            livelloUO.setCodice(idUnitaSplit[u]);
            uffProduttore.getLivelloUO().add(livelloUO);
          }
        }
        datiProduzione.getUffProduttore().add(uffProduttore);
        newUD.setDatiProduzione(datiProduzione);

      }

      // Ufficio ricezione
      if (wsdmprotocolloDocumentoIn.getIdUnitaOperativaDestinataria() != null
          && !"".equals(wsdmprotocolloDocumentoIn.getIdUnitaOperativaDestinataria().trim())) {
        AssegnazioneInternaType assegnazioneInterna = new AssegnazioneInternaType();
        UOType uo = new UOType();

        String idUnita = wsdmprotocolloDocumentoIn.getIdUnitaOperativaDestinataria().trim();
        String[] idUnitaSplit = idUnita.split("\\.");

        if (idUnitaSplit.length > 0) {
          for (int u = 0; u < idUnitaSplit.length; u++) {
            it.engineering.documentale.xsd.newud.LivelloGerarchiaType livelloUO = new it.engineering.documentale.xsd.newud.LivelloGerarchiaType();
            livelloUO.setNro(u + 1);
            livelloUO.setCodice(idUnitaSplit[u]);
            uo.getLivelloUO().add(livelloUO);
          }
        }
        assegnazioneInterna.setUO(uo);
        assegnazioneInterna.setFlagPerConoscenza("0");
        newUD.getAssegnazioneInterna().add(assegnazioneInterna);
      }

      // if (wsdmprotocolloDocumentoIn.getIdUnitaOperativaDestinataria() != null
      // &&
      // !"".equals(wsdmprotocolloDocumentoIn.getIdUnitaOperativaDestinataria().trim()))
      // {
      // UOType uoDestinataria = new UOType();
      // uoDestinataria.setIdUO(BigInteger.valueOf(new
      // Long(wsdmprotocolloDocumentoIn.getIdUnitaOperativaDestinataria())));
      // DatiEntrata datiEntrata = new DatiEntrata();
      // datiEntrata.setUffRicezione(uoDestinataria);
      // newUD.setDatiEntrata(datiEntrata);
      // }
      
      if (wsdmprotocolloDocumentoIn.getGenericS31() != null
          && !"".equals(wsdmprotocolloDocumentoIn.getGenericS31().trim())) {
        AssegnazioneInternaType assegnazioneInterna = new AssegnazioneInternaType();
        UOType uo = new UOType();

        String idUnita = wsdmprotocolloDocumentoIn.getGenericS31().trim();
        String[] idUnitaSplit = idUnita.split("\\.");

        if (idUnitaSplit.length > 0) {
          for (int u = 0; u < idUnitaSplit.length; u++) {
            it.engineering.documentale.xsd.newud.LivelloGerarchiaType livelloUO = new it.engineering.documentale.xsd.newud.LivelloGerarchiaType();
            livelloUO.setNro(u + 1);
            livelloUO.setCodice(idUnitaSplit[u]);
            uo.getLivelloUO().add(livelloUO);
          }
        }
        assegnazioneInterna.setUO(uo);
        assegnazioneInterna.setFlagPerConoscenza("0");
        newUD.getAssegnazioneInterna().add(assegnazioneInterna);
      }

    }
  }

  /**
   * Gestione dei dati per unita' documentarie in uscita (OUT).
   * 
   * @param wsdmprotocolloDocumentoIn
   * @param newUD
   */
  private void _protocolloDocumentoInserisciOUT(WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn, NewUD newUD) {
    if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      DatiUscita datiUscita = new DatiUscita();
      WSDMProtocolloAnagrafica[] destinatari = wsdmprotocolloDocumentoIn.getDestinatari();
      if (destinatari != null && destinatari.length > 0) {
        List<DestinatarioEsternoType> destinatariEsterni = datiUscita.getDestinatarioEsterno();
        for (int de = 0; de < destinatari.length; de++) {
          DestinatarioEsternoType destinatarioEsterno = new DestinatarioEsternoType();
          destinatarioEsterno.setDenominazioneCognome(destinatari[de].getCognomeointestazione());
          destinatarioEsterno.setNome(destinatari[de].getNome());
          destinatarioEsterno.setCodiceFiscale(destinatari[de].getCodiceFiscale());
          if (WSDMTipoVoceRubrica.IMPRESA.equals(destinatari[de].getTipoVoceRubrica())) {
            destinatarioEsterno.setFlagFisica("0");
          } else {
            destinatarioEsterno.setFlagFisica("1");
          }
          destinatariEsterni.add(destinatarioEsterno);
        }
        newUD.setDatiUscita(datiUscita);
      }

      // Ufficio produttore
      if (wsdmprotocolloDocumentoIn.getIdUnitaOperativaMittente() != null
          && !"".equals(wsdmprotocolloDocumentoIn.getIdUnitaOperativaMittente().trim())) {

        DatiProduzione datiProduzione = new DatiProduzione();
        UOType uffProduttore = new UOType();

        String idUnita = wsdmprotocolloDocumentoIn.getIdUnitaOperativaMittente().trim();
        String[] idUnitaSplit = idUnita.split("\\.");

        if (idUnitaSplit.length > 0) {
          for (int u = 0; u < idUnitaSplit.length; u++) {
            it.engineering.documentale.xsd.newud.LivelloGerarchiaType livelloUO = new it.engineering.documentale.xsd.newud.LivelloGerarchiaType();
            livelloUO.setNro(u + 1);
            livelloUO.setCodice(idUnitaSplit[u]);
            uffProduttore.getLivelloUO().add(livelloUO);
          }
        }
        datiProduzione.getUffProduttore().add(uffProduttore);
        newUD.setDatiProduzione(datiProduzione);

        // // Mittente
        // UOType uoMittente = new UOType();
        // uoMittente.setIdUO(BigInteger.valueOf(new
        // Long(wsdmprotocolloDocumentoIn.getIdUnitaOperativaMittente())));
        //
        // // Identificativo ufficio di spedizione in "DatiUscita"
        // newUD.getDatiUscita().setUffSpedizione(uoMittente);
        //
        // // Identificativo dell'unita' operativo del produttore
        // DatiProduzione datiProduzione = new DatiProduzione();
        // List<UOType> listaUffProduttore = datiProduzione.getUffProduttore();
        // listaUffProduttore.add(uoMittente);
        // newUD.setDatiProduzione(datiProduzione);
      }
      
      if (wsdmprotocolloDocumentoIn.getGenericS31() != null
          && !"".equals(wsdmprotocolloDocumentoIn.getGenericS31().trim())) {
        AssegnazioneInternaType assegnazioneInterna = new AssegnazioneInternaType();
        UOType uo = new UOType();

        String idUnita = wsdmprotocolloDocumentoIn.getGenericS31().trim();
        String[] idUnitaSplit = idUnita.split("\\.");

        if (idUnitaSplit.length > 0) {
          for (int u = 0; u < idUnitaSplit.length; u++) {
            it.engineering.documentale.xsd.newud.LivelloGerarchiaType livelloUO = new it.engineering.documentale.xsd.newud.LivelloGerarchiaType();
            livelloUO.setNro(u + 1);
            livelloUO.setCodice(idUnitaSplit[u]);
            uo.getLivelloUO().add(livelloUO);
          }
        }
        assegnazioneInterna.setUO(uo);
        assegnazioneInterna.setFlagPerConoscenza("0");
        newUD.getAssegnazioneInterna().add(assegnazioneInterna);
      }

    }
  }

  /**
   * Gestione degli allegati nell'inserimento di una nuova unita' documentaria.
   * 
   * @param wsdmprotocolloDocumentoIn
   * @param addUdStub
   * @param newUD
   */
  private void _protocolloDocumentoInserisciAggiungiAllegati(WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn, NewUD newUD) {
    WSDMProtocolloAllegato[] allegati = wsdmprotocolloDocumentoIn.getAllegati();
    if (allegati != null && allegati.length > 0) {

      newUD.setNroAllegati(BigInteger.valueOf(allegati.length));

      List<AllegatoUDType> listaAllegatiUD = newUD.getAllegatoUD();
      for (int ai = 0; ai < allegati.length; ai++) {
        AllegatoUDType schedaAllegatoUD = new AllegatoUDType();
        schedaAllegatoUD.setDesAllegato(allegati[ai].getTitolo());
        VersioneElettronicaType versioneElettronica = new VersioneElettronicaType();
        versioneElettronica.setNomeFile(allegati[ai].getNome());
        versioneElettronica.setNote(allegati[ai].getTitolo());
        versioneElettronica.setNroAttachmentAssociato(BigInteger.valueOf(ai + 1));
        schedaAllegatoUD.setVersioneElettronica(versioneElettronica);
        listaAllegatiUD.add(schedaAllegatoUD);
      }
    }
  }

  /**
   * Lettura di una unita' documentaria WS utilizzati: - WSGetMetadataUD per
   * l'estrazione dei metadati della unita' documentaria - WSExtractMulti per
   * l'estrazione di tutti i file allegati dell'unita' documentaria
   */
  @Override
  public WSDMProtocolloDocumentoRes _documentoLeggi(String username, String password, WSDMLoginAttr loginAttr, String numeroDocumento) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    if ("NDEF".equals(password)) {
      password = null;
    }

    try {

      StringBuffer messaggioCtr = new StringBuffer();
      if (EngineeringDocUtilityControllo.ctrDocumentoLeggi(loginAttr, numeroDocumento, messaggioCtr)) {
        wsdmprotocolloDocumentoRes = this.getMetadataUDExtractMulti(username, password, null, null, numeroDocumento, true);
      } else {
        // Il controllo preliminare non ha dato esito positivo.
        // Si segnala all'utente il problema.
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (WebServiceException w) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_documentoLeggi)", w);
    } catch (NamingException e) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_documentoLeggi)", e);
    } catch (Throwable t) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(t.getMessage());
      logger.error("Errore (_documentoLeggi)", t);
    }

    return wsdmprotocolloDocumentoRes;
  }

  /**
   * Lettura dei metadati dell'unita' documentaria senza gli allegati.
   */

  @Override
  public WSDMProtocolloDocumentoRes _documentoMetadatiLeggi(String username, String password, WSDMLoginAttr loginAttr,
      String numeroDocumento) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    if ("NDEF".equals(password)) {
      password = null;
    }

    try {

      StringBuffer messaggioCtr = new StringBuffer();
      if (EngineeringDocUtilityControllo.ctrDocumentoLeggi(loginAttr, numeroDocumento, messaggioCtr)) {
        wsdmprotocolloDocumentoRes = this.getMetadataUDExtractMulti(username, password, null, null, numeroDocumento, false);
      } else {
        // Il controllo preliminare non ha dato esito positivo.
        // Si segnala all'utente il problema.
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (WebServiceException w) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_documentoLeggi)", w);
    } catch (NamingException e) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_documentoLeggi)", e);
    } catch (Throwable t) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(t.getMessage());
      logger.error("Errore (_documentoLeggi)", t);
    }

    return wsdmprotocolloDocumentoRes;
  }

  /**
   * Lettura dell'unita' documentaria e degli allegati associati.
   * 
   * @param username
   * @param password
   * @param numeroDocumento
   * @return
   * @throws NamingException
   * @throws JAXBException
   * @throws Exception
   * @throws ServiceException
   * @throws MalformedURLException
   * @throws RemoteException
   * @throws WSSecurityException
   * @throws SOAPException
   * @throws IOException
   */
  private WSDMProtocolloDocumentoRes getMetadataUDExtractMulti(String username, String password, Long annoProtocollo,
      String numeroProtocollo, String numeroDocumento, boolean extractMulti) throws NamingException, JAXBException, Exception,
      ServiceException, MalformedURLException, RemoteException, WSSecurityException, SOAPException, IOException {

    if ("NDEF".equals(password)) {
      password = null;
    }

    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    EstremiXIdentificazioneUD estremiUD = new EstremiXIdentificazioneUD();

    // Identificazione del protocollo
    if (annoProtocollo != null && numeroProtocollo != null) {
      EstremiRegNumType estremiRegNum = new EstremiRegNumType();
      estremiRegNum.setAnnoReg(annoProtocollo.intValue());
      estremiRegNum.setNumReg(new Long(numeroProtocollo).intValue());
      estremiUD.setEstremiRegNum(estremiRegNum);
    }

    // Identificazione unita' documentaria
    if (numeroDocumento != null) {
      estremiUD.setIdUD(new BigInteger(numeroDocumento));
    }

    // Conversione in stringa XML
    StringWriter xmlEstremiUDStringWriter = new StringWriter();
    JAXBContext jaxbLocalContext = JAXBContext.newInstance(EstremiXIdentificazioneUD.class);
    jaxbLocalContext.createMarshaller().marshal(estremiUD, xmlEstremiUDStringWriter);
    String xmlEstremiUDInput = xmlEstremiUDStringWriter.toString();

    // XML Hash
    byte[] xmlEstremiUDHash = DigestUtils.sha(xmlEstremiUDInput.getBytes("UTF-8"));
    String xmlEstremiUDHashBase64 = Base64.encode(xmlEstremiUDHash);

    // Log della richiesta
    if (logger.isDebugEnabled()) logger.debug("Richiesta lettura documento: " + xmlEstremiUDInput);

    // Verifica indirizzi per lettura metadati e estrazione file allegati
    String urlWsGetMetadataUd = InitialContext.doLookup(WSGETMETADATAUD);
    if (urlWsGetMetadataUd == null || (urlWsGetMetadataUd != null && "".equals(urlWsGetMetadataUd.trim()))) {
      throw new Exception(WSGETMETADATAUD_URL_NOT_DEFINED);
    }
    String urlWsExtractMulti = InitialContext.doLookup(WSEXTRACTMULTI);
    if (urlWsExtractMulti == null || (urlWsExtractMulti != null && "".equals(urlWsExtractMulti.trim()))) {
      throw new Exception(WSEXTRACTMULTI_URL_NOT_DEFINED);
    }

    // Il file XML in input con gli estremi per individuare l'unita'
    // documentaria di cui estrarre i metadati ha come root element
    // l’elemento EstremiXIdentificazioneUD riportato nell'XSD
    // EstremiXIdentificazioneUD.xsd allegato a questo documento. L'output
    // del Web Service e' un file XML con tracciato come in allegato
    // BaseOutput_WS.xsd. In output e' presente, in caso di successo, un
    // unico attachment XML (tracciato in allegato Output_DatiUD.xsd) che
    // contiene i metadati dell'unità documentaria. I metadati relativi a
    // tag non presenti sono metadati non valorizzati in DB.
    SOAPMessage soapMessageMetadataUd = _sendRequestSOAP(username, password, xmlEstremiUDInput, xmlEstremiUDHashBase64, urlWsGetMetadataUd,
        GETMETADATAUD_DISPATCH_METHOD, null);
    BaseOutputWS baseOutputMetadataUd = _getBaseOutputWS(soapMessageMetadataUd);

    if (WSRESULT_SUCCESS.equals(baseOutputMetadataUd.getWSResult())) {
      Iterator<AttachmentPart> attachmentsMetadataUd = soapMessageMetadataUd.getAttachments();
      WSDMProtocolloDocumento wsdmprotocolloDocumento = new WSDMProtocolloDocumento();

      int iUd = 0;
      while (attachmentsMetadataUd.hasNext()) {
        iUd++;
        // Il primo allegato contiene il file XML descritto da
        // "Output_DatiUD.xsd"
        if (iUd == 1) {
          AttachmentPart attMetadataUd = (AttachmentPart) attachmentsMetadataUd.next();
          DataHandler handlerMetadataUd = attMetadataUd.getDataHandler();
          ByteArrayOutputStream baosMetadataUd = new ByteArrayOutputStream();
          handlerMetadataUd.writeTo(baosMetadataUd);
          String datiMetadataUdXMLEscape = baosMetadataUd.toString();
          String datiMetadataUdXML = StringEscapeUtils.unescapeXml(datiMetadataUdXMLEscape);
          datiMetadataUdXML = datiMetadataUdXML.replace("\u00a0", " ");

          if (logger.isDebugEnabled()) logger.debug("datiMetadataUdXMLEscape: " + datiMetadataUdXMLEscape);
          if (logger.isDebugEnabled()) logger.debug("datiMetadataUdXML: " + datiMetadataUdXML);

          DatiUD datiUD = this.getDatiUDFromXML(datiMetadataUdXML);

          // Lettura numero documento
          wsdmprotocolloDocumento.setNumeroDocumento(String.valueOf(datiUD.getIdUD()));
          wsdmprotocolloDocumento.setAnnoProtocollo(null);
          wsdmprotocolloDocumento.setNumeroProtocollo(null);

          // Lettura del nome e dell'oggetto
          wsdmprotocolloDocumento.setOggetto(datiUD.getNomeUD().getValue());
          wsdmprotocolloDocumento.setDescrizione(datiUD.getOggettoUD().getValue());

          // Indica se unita' documentaria in entrata (E), uscita (U) o
          // interna (I)
          if (ENG_DOCUMENTALE_IN_ENTRATA.equals(datiUD.getTipoProvenienza())) {
            wsdmprotocolloDocumento.setInout(WSDMProtocolloInOut.IN);
          } else if (ENG_DOCUMENTALE_IN_USCITA.equals(datiUD.getTipoProvenienza())) {
            wsdmprotocolloDocumento.setInout(WSDMProtocolloInOut.OUT);
          } else if (ENG_DOCUMENTALE_INTERNO.equals(datiUD.getTipoProvenienza())) {
            wsdmprotocolloDocumento.setInout(WSDMProtocolloInOut.INT);
          } else {
            wsdmprotocolloDocumento.setInout(WSDMProtocolloInOut.INT);
          }

          // Lettura del fascicolo
          if (datiUD.getCollocazioneClassificazioneUD() != null) {
            List<ClassifFascicoloEstesoType> listaClassifFascicolo = datiUD.getCollocazioneClassificazioneUD().getClassifFascicolo();
            if (listaClassifFascicolo != null && listaClassifFascicolo.size() > 0) {
              ClassifFascicoloEstesoType cfe = listaClassifFascicolo.get(0);
              if (cfe != null) {
                if (cfe.getFolderCustom() != null) {
                  BigInteger idFolder = cfe.getFolderCustom().getIdFolder();
                  WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();
                  wsdmFascicolo.setAnnoFascicolo(null);
                  wsdmFascicolo.setNumeroFascicolo(null);
                  wsdmFascicolo.setCodiceFascicolo(idFolder.toString());
                  wsdmprotocolloDocumento.setFascicolo(wsdmFascicolo);
                }
              }
            }
          }

          // Lettura informazioni di registrazione
          // Estremi di registrazione/numerazione dell'unità documentaria
          // (se ne ha più di una viene presa la prima
          // registrazione/numerazione presente andando nel seguente ordine:
          // Protocollo Generale, Repertorio, Registrazione d'Emergenza,
          // Altra numerazione esterna al sistema, Numerazione interna al
          // sistema)

          // <xs:element name="CategoriaReg">
          // <xs:annotation>
          // <xs:documentation>Categoria di registrazione / numerazione;
          // valori ammessi
          // PG=Protocollo Generale;
          // PP=Protocollo Particolare;
          // R=Repertorio;
          // E=Registrazione d'emergenza;
          // A=Altra numerazione data esternamente al sistema documentale;
          // I=Altra numerazione data internamente al sistema documentale
          // </xs:documentation>
          // </xs:annotation>
          // <xs:simpleType>
          // <xs:restriction base="xs:string">
          // <xs:enumeration value="PG"/>
          // <xs:enumeration value="PP"/>
          // <xs:enumeration value="R"/>
          // <xs:enumeration value="E"/>
          // <xs:enumeration value="A"/>
          // <xs:enumeration value="I"/>
          // </xs:restriction>
          // </xs:simpleType>
          // </xs:element>

          if (datiUD.getRegistrazioneData() != null) {
            List<it.engineering.documentale.xsd.outputdatiud.RegistrazioneNumerazioneType> listaRegistrazioneData = datiUD.getRegistrazioneData();
            if (listaRegistrazioneData != null && listaRegistrazioneData.size() > 0) {
              boolean registrazioneTrovata = false;
              registrazioneTrovata = this.getRegistrazione(wsdmprotocolloDocumento, listaRegistrazioneData, "PG");
              if (registrazioneTrovata == false) {
                registrazioneTrovata = this.getRegistrazione(wsdmprotocolloDocumento, listaRegistrazioneData, "PP");
              }
              if (registrazioneTrovata == false) {
                registrazioneTrovata = this.getRegistrazione(wsdmprotocolloDocumento, listaRegistrazioneData, "R");
              }
              if (registrazioneTrovata == false) {
                registrazioneTrovata = this.getRegistrazione(wsdmprotocolloDocumento, listaRegistrazioneData, "E");
              }
              if (registrazioneTrovata == false) {
                registrazioneTrovata = this.getRegistrazione(wsdmprotocolloDocumento, listaRegistrazioneData, "A");
              }
              if (registrazioneTrovata == false) {
                registrazioneTrovata = this.getRegistrazione(wsdmprotocolloDocumento, listaRegistrazioneData, "I");
              }
            }
          }

          // Lettura destinatari esterni per le protocollazioni in uscita
          if (ENG_DOCUMENTALE_IN_USCITA.equals(datiUD.getTipoProvenienza())) {
            if (datiUD.getDatiUscita() != null) {
              if (datiUD.getDatiUscita().getDestinatarioEsterno() != null) {
                List<it.engineering.documentale.xsd.outputdatiud.DestinatarioEsternoType> listaDestinatariEsterni = datiUD.getDatiUscita().getDestinatarioEsterno();
                if (listaDestinatariEsterni.size() > 0) {
                  WSDMProtocolloAnagrafica destinatari[] = new WSDMProtocolloAnagrafica[listaDestinatariEsterni.size()];
                  for (int d = 0; d < listaDestinatariEsterni.size(); d++) {
                    it.engineering.documentale.xsd.outputdatiud.DestinatarioEsternoType destinatarioEsterno = listaDestinatariEsterni.get(
                        d);
                    destinatari[d] = new WSDMProtocolloAnagrafica();
                    destinatari[d].setCognomeointestazione(destinatarioEsterno.getDenominazioneCognome());
                    destinatari[d].setNome(destinatarioEsterno.getNome());
                    destinatari[d].setCodiceFiscale(destinatarioEsterno.getCodiceFiscale());
                  }
                  wsdmprotocolloDocumento.setDestinatari(destinatari);
                }
              }
            }
          }

          // Lettura mittenti esterni per le protocollazioni in entrata
          if (ENG_DOCUMENTALE_IN_ENTRATA.equals(datiUD.getTipoProvenienza())) {
            if (datiUD.getDatiEntrata() != null) {
              if (datiUD.getDatiEntrata().getMittenteEsterno() != null) {
                List<it.engineering.documentale.xsd.outputdatiud.SoggettoEsternoType> listaSoggettiEsterni = datiUD.getDatiEntrata().getMittenteEsterno();
                if (listaSoggettiEsterni.size() > 0) {
                  WSDMProtocolloAnagrafica mittenti[] = new WSDMProtocolloAnagrafica[listaSoggettiEsterni.size()];
                  for (int m = 0; m < listaSoggettiEsterni.size(); m++) {
                    it.engineering.documentale.xsd.outputdatiud.SoggettoEsternoType soggettoEsterno = listaSoggettiEsterni.get(m);
                    mittenti[m] = new WSDMProtocolloAnagrafica();
                    mittenti[m].setCognomeointestazione(soggettoEsterno.getDenominazioneCognome());
                    mittenti[m].setNome(soggettoEsterno.getNome());
                    mittenti[m].setCodiceFiscale(soggettoEsterno.getCodiceFiscale());
                  }
                  wsdmprotocolloDocumento.setMittenti(mittenti);
                }
              }
            }
          }

        }

        wsdmprotocolloDocumentoRes.setEsito(true);
        wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmprotocolloDocumento);

      }

      if (extractMulti) {
        // Lettura di tutti i file relativi all'unita' documentaria richiesta.
        // Deve essere utilizzato il servizio WSExtractMulti.
        // Il file XML in input con gli estremi per individuare l'unita'
        // documentaria di cui estrarre i file ha come root element l'elemento
        // EstremiXIdentificazioneUD riportato nell’XSD
        // EstremiXIdentificazioneUD.xsd. L'output del Web Service e' un file
        // XML con tracciato come in allegato
        // BaseOutput_WS.xsd. In output e' presente, in caso di successo, un
        // primo attachment XML (tracciato in allegato Output_FilesUD.xsd) che
        // contiene i nomi dei file estratti, la versione che rappresentano
        // del
        // documento (primario o allegato) cui sono relativi (e indicazione di
        // qual e' l'ultima versione del documento stesso) ed dati di minima
        // del
        // documento stesso. Il file estratti sono restituiti come attachment
        // successivi (dal secondo in poi) del messaggio SOAP.
        SOAPMessage soapMessageExtractMulti = _sendRequestSOAP(username, password, xmlEstremiUDInput, xmlEstremiUDHashBase64,
            urlWsExtractMulti, EXTRACTMULTI_DISPATCH_METHOD, null);
        BaseOutputWS baseOutputExtractMulti = _getBaseOutputWS(soapMessageMetadataUd);

        if (WSRESULT_SUCCESS.equals(baseOutputExtractMulti.getWSResult())) {
          Iterator<AttachmentPart> attachmentsExtractMulti = soapMessageExtractMulti.getAttachments();

          int iEM = 0;
          while (attachmentsExtractMulti.hasNext()) {
            // Il primo allegato contiene il file XML descritto da
            // "Output_DatiUD.xsd"
            if (iEM == 0) {
              iEM++;
              // Il primo attachment contiene il file XML di tipo
              // "OutputFilesUD"
              // con la lista ed i metadati dei file allegati.
              // I file allegati sono memorizzati dal secondo attachment
              // in
              // poi.
              AttachmentPart attachPartOutputFilesUD = (AttachmentPart) attachmentsExtractMulti.next();
              DataHandler handlerOutputFilesUD = attachPartOutputFilesUD.getDataHandler();
              ByteArrayOutputStream baosOutputFilesUD = new ByteArrayOutputStream();
              handlerOutputFilesUD.writeTo(baosOutputFilesUD);
              String outputFilesUDXMLEscape = baosOutputFilesUD.toString();
              String outputFilesUDXML = StringEscapeUtils.unescapeXml(outputFilesUDXMLEscape);
              outputFilesUDXML = outputFilesUDXML.replace("\u00a0", " ");

              if (logger.isDebugEnabled()) logger.debug("outputFilesUDXMLEscape: " + outputFilesUDXMLEscape);
              if (logger.isDebugEnabled()) logger.debug("outputFilesUDXML: " + outputFilesUDXML);

              OutputFilesUD outputFilesUD = this.getOutputFilesUDFromXML(outputFilesUDXML);
              List<DatiFileEstratto> datiFilesEstratti = outputFilesUD.getDatiFileEstratto();

              if (!datiFilesEstratti.isEmpty() && datiFilesEstratti.size() > 0) {
                WSDMProtocolloAllegato[] allegati = new WSDMProtocolloAllegato[datiFilesEstratti.size()];
                for (int iFE = 0; iFE < datiFilesEstratti.size(); iFE++) {

                  DatiFileEstratto datiFE = datiFilesEstratti.get(iFE);
                  String nomeFile = (String) datiFE.getNomeFile();

                  String datiFEDesOggetto = datiFE.getDesOggetto();
                  BigInteger datiFENroAttachment = datiFE.getNroAttachment();

                  // Lettura del attachment
                  allegati[iFE] = new WSDMProtocolloAllegato();

                  if (attachmentsExtractMulti.hasNext()) {
                    AttachmentPart attachPartAllegato = (AttachmentPart) attachmentsExtractMulti.next();
                    DataHandler handlerAllegato = attachPartAllegato.getDataHandler();
                    ByteArrayOutputStream baosAllegato = new ByteArrayOutputStream();
                    handlerAllegato.writeTo(baosAllegato);
                    allegati[iFE].setContenuto(baosAllegato.toByteArray());
                    allegati[iFE].setNome(nomeFile);
                    allegati[iFE].setIDBase(new Long(datiFENroAttachment.longValue()));
                    allegati[iFE].setTitolo(datiFEDesOggetto);
                  }
                }
                wsdmprotocolloDocumento.setAllegati(allegati);
              }
            }
          }
        }
      }

    } else {
      wsdmprotocolloDocumentoRes.setEsito(false);
      String errorContext = baseOutputMetadataUd.getWSError().getErrorContext();
      BigInteger errorNumber = baseOutputMetadataUd.getWSError().getErrorNumber();
      String errorMessage = baseOutputMetadataUd.getWSError().getErrorMessage();
      wsdmprotocolloDocumentoRes.setMessaggio(errorContext + ", " + errorNumber.toString() + ", " + errorMessage);
    }

    return wsdmprotocolloDocumentoRes;

  }

  /**
   * Lettura della registrazione.
   * 
   * @param wsdmprotocolloDocumento
   * @param listaRegistrazioneData
   * @param categoriaReg
   * @return
   */
  private boolean getRegistrazione(WSDMProtocolloDocumento wsdmprotocolloDocumento,
      List<it.engineering.documentale.xsd.outputdatiud.RegistrazioneNumerazioneType> listaRegistrazioneData, String categoriaReg) {
    boolean registrazioneTrovata = false;
    for (int r = 0; r < listaRegistrazioneData.size(); r++) {
      it.engineering.documentale.xsd.outputdatiud.RegistrazioneNumerazioneType registrazioneData = listaRegistrazioneData.get(r);
      if (registrazioneData != null && categoriaReg.equals(registrazioneData.getCategoriaReg())) {
        registrazioneTrovata = true;
        wsdmprotocolloDocumento.setSiglaRegistrazione(registrazioneData.getSiglaReg());
        wsdmprotocolloDocumento.setAnnoRegistrazione(new Long(registrazioneData.getAnnoReg()));
        wsdmprotocolloDocumento.setNumeroRegistrazione(new Long(registrazioneData.getNumReg()));
        wsdmprotocolloDocumento.setDataRegistrazione(registrazioneData.getDataOraReg().toGregorianCalendar().getTime());

        if ("PG".equals(categoriaReg)) {
          wsdmprotocolloDocumento.setAnnoProtocollo(new Long(registrazioneData.getAnnoReg()));
          wsdmprotocolloDocumento.setNumeroProtocollo(String.valueOf(registrazioneData.getNumReg()));
        }

      }
    }
    return registrazioneTrovata;
  }

  /**
   * Converte la stringa XML contenente l'oggetto BaseOutputWS nella
   * corrispondente classe.
   * 
   * @param baseOutputWSXML
   * @return
   * @throws JAXBException
   */
  private BaseOutputWS getBaseOutputWSFromXML(String baseOutputWSXML) throws JAXBException {
    JAXBContext jaxbContext = JAXBContext.newInstance(BaseOutputWS.class);
    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
    StringBuffer stringBufferXML = new StringBuffer(baseOutputWSXML);
    Object objectJAXB = unmarshaller.unmarshal(new StringReader(stringBufferXML.toString()));
    return (BaseOutputWS) objectJAXB;
  }

  /**
   * Converte la stringa XML ottenuta come risultato di una ricerca sul
   * folder/fascicolo nell'oggetto Lista.
   * 
   * @param searchOutputXML
   * @return
   * @throws JAXBException
   */
  private Lista getSearchOutputSTDFromXML(String searchOutputXML) throws JAXBException {
    JAXBContext jaxbContext = JAXBContext.newInstance(Lista.class);
    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
    StringBuffer stringBufferXML = new StringBuffer(searchOutputXML);
    Object objectJAXB = unmarshaller.unmarshal(new StringReader(stringBufferXML.toString()));
    return (Lista) objectJAXB;
  }

  /**
   * Converte la stringa XML contenente l'oggetto DatiUD nella corrispondente
   * classe.
   * 
   * @param datiUDXML
   * @return
   * @throws JAXBException
   */
  private DatiUD getDatiUDFromXML(String datiUDXML) throws JAXBException {
    JAXBContext jaxbContext = JAXBContext.newInstance(DatiUD.class);
    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
    StringBuffer stringBufferXML = new StringBuffer(datiUDXML);
    Object objectJAXB = unmarshaller.unmarshal(new StringReader(stringBufferXML.toString()));
    return (DatiUD) objectJAXB;
  }

  /**
   * Converte la stringa XML contenente l'oggetto OutputFilesUD nella
   * corrispondente classe.
   * 
   * @param outputFilesUDXML
   * @return
   * @throws JAXBException
   */
  private OutputFilesUD getOutputFilesUDFromXML(String outputFilesUDXML) throws JAXBException {
    JAXBContext jaxbContext = JAXBContext.newInstance(OutputFilesUD.class);
    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
    StringBuffer stringBufferXML = new StringBuffer(outputFilesUDXML);
    Object objectJAXB = unmarshaller.unmarshal(new StringReader(stringBufferXML.toString()));
    return (OutputFilesUD) objectJAXB;
  }

  /**
   * Converte la stringa XML contenente l'oggetto OutputUD nella corrispondente
   * classe.
   * 
   * @param datiOutputUDXML
   * @return
   * @throws JAXBException
   */
  private OutputUD getOutputUDFromXML(String datiOutputUDXML) throws JAXBException {
    JAXBContext jaxbContext = JAXBContext.newInstance(OutputUD.class);
    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
    StringBuffer stringBufferXML = new StringBuffer(datiOutputUDXML);
    Object objectJAXB = unmarshaller.unmarshal(new StringReader(stringBufferXML.toString()));
    return (OutputUD) objectJAXB;
  }

  /**
   * Converte la stringa XML contenente l'oggetto DatiFolder nella
   * corrispondente classe.
   * 
   * @param datiFolderXML
   * @return
   * @throws JAXBException
   */
  private DatiFolder getDatiFolderFromXML(String datiFolderXML) throws JAXBException {
    JAXBContext jaxbContext = JAXBContext.newInstance(DatiFolder.class);
    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
    StringBuffer stringBufferXML = new StringBuffer(datiFolderXML);
    Object objectJAXB = unmarshaller.unmarshal(new StringReader(stringBufferXML.toString()));
    return (DatiFolder) objectJAXB;
  }

  @Override
  public WSDMFascicoloRes _fascicoloInserisci(String username, String password, WSDMLoginAttr loginAttr, WSDMFascicoloIn wsdmfascicoloIn) {
    WSDMFascicoloRes wsdmFascicoloRes = new WSDMFascicoloRes();

    if ("NDEF".equals(password)) {
      password = null;
    }

    // Esempio creazione nuovo fascicolo classificato
    // <?xml version="1.0" encoding="UTF-8"?>
    // <NewFolder>
    // <DatiFascDiTitolario>
    // <FlagTipo>F</FlagTipo>
    // <Classificazione>
    // <LivelloClassificazione Nro="1" Codice="6"/>
    // <LivelloClassificazione Nro="2" Codice="5"/>
    // <LivelloClassificazione Nro="3" Codice="7"/>
    // </Classificazione>
    // <NroSecondario>XXXX 23448-2020</NroSecondario>
    // <!-- opzionale ma utile da settare con un codice/n.ro identificativo
    // parlante della pratica nel sistema chiamante -->
    // </DatiFascDiTitolario>
    // <Oggetto>DESCRIZIONE FASCICOLO TEST DA WS</Oggetto>
    // <TipoDiDettaglio>
    // <Decodifica_Nome>Tipologia XXX</Decodifica_Nome>
    // <!-- da settare opzionalmente se si è stabilita una tipologia di
    // fascicolo censita in Auriga -->
    // </TipoDiDettaglio>
    // <InCaricoA>
    // <UO>
    // <LivelloUO Nro="1" Codice="118"/>
    // <LivelloUO Nro="2" Codice="22"/>
    // </UO>
    // </InCaricoA>
    // <Note>NOTE PROVA TEST DA WS</Note>
    // </NewFolder>

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (EngineeringDocUtilityControllo.ctrFascicoloInserisci(loginAttr, wsdmfascicoloIn, messaggioCtr)) {

        // Dati del fascicolo
        NewFolder newFolder = new NewFolder();

        // Oggetto
        newFolder.setOggetto(wsdmfascicoloIn.getOggettoFascicolo());

        // Eventuale descrizione --> note
        if (wsdmfascicoloIn.getDescrizioneFascicolo() != null) {
          newFolder.setNote(wsdmfascicoloIn.getDescrizioneFascicolo());
        }

        // Titolario di classificazione
        try {
          if (wsdmfascicoloIn.getClassificaFascicolo() != null) {
            FascDiTitolarioType titolario = new FascDiTitolarioType();
            // Flag tipo (indica se si tratta di Fascicolo [F], Sottofascicolo
            // [SF])
            titolario.setFlagTipo("F");

            // Identificativo classificazione
            String classificaFascicolo = wsdmfascicoloIn.getClassificaFascicolo().trim();
            String[] classificaFascicoloSplit = classificaFascicolo.split("\\.");
            if (classificaFascicoloSplit.length > 0) {
              ClassificazioneType classificazione = new ClassificazioneType();
              for (int c = 0; c < classificaFascicoloSplit.length; c++) {
                LivelloGerarchiaType livelloClassificazione = new LivelloGerarchiaType();
                livelloClassificazione.setNro(c + 1);
                livelloClassificazione.setCodice(classificaFascicoloSplit[c]);
                classificazione.getLivelloClassificazione().add(livelloClassificazione);
              }
              titolario.setClassificazione(classificazione);
            }

            // Numero secondario - GENERICS11
            if (wsdmfascicoloIn.getGenericS11() != null && !"".equals(wsdmfascicoloIn.getGenericS11().trim())) {
              titolario.setNroSecondario(wsdmfascicoloIn.getGenericS11());
            }

            newFolder.setDatiFascDiTitolario(titolario);

          }
        } catch (Exception e) {

        }

        // Oggetto
        newFolder.setOggetto(wsdmfascicoloIn.getOggettoFascicolo());

        // Tipo di dettaglio,
        // da settare se e' definita una tipologia di fascicolo censita in
        // Auriga
        // Puo' essere assegnato dal client mediante l'elemento GENERICS12
        // oppure di default con la configurazione (context.xml)
        // ADDFOLDER_GENERICS12

        try {
          String genericS12 = null;
          if (wsdmfascicoloIn.getGenericS12() != null && !"".equals(wsdmfascicoloIn.getGenericS12().trim())) {
            genericS12 = wsdmfascicoloIn.getGenericS12();
          } else {
            genericS12 = InitialContext.doLookup(ADDFOLDER_GENERICS12);
          }

          if (genericS12 != null) {
            it.engineering.documentale.xsd.newfolder.OggDiTabDiSistemaType tipoDiDettaglio = new it.engineering.documentale.xsd.newfolder.OggDiTabDiSistemaType();
            tipoDiDettaglio.setDecodificaNome(genericS12);
            newFolder.setTipoDiDettaglio(tipoDiDettaglio);
          }

        } catch (Exception e) {

        }

        // In carico A
        // Puo' essere assegnato dal client mediante l'elemento STRUTTURA
        // oppure di default con la configurazione (context.xml)
        // ADDFOLDER_STRUTTURA
        try {
          String struttura = null;
          if (wsdmfascicoloIn.getStruttura() != null && !"".equals(wsdmfascicoloIn.getStruttura().trim())) {
            struttura = wsdmfascicoloIn.getStruttura().trim();
          } else {
            struttura = InitialContext.doLookup(ADDFOLDER_STRUTTURA);
          }

          if (struttura != null) {
            String[] strutturaSplit = struttura.split("\\.");
            if (strutturaSplit.length > 0) {
              AssegnatarioEffType inCaricoA = new AssegnatarioEffType();
              it.engineering.documentale.xsd.newfolder.UOType uo = new it.engineering.documentale.xsd.newfolder.UOType();
              for (int i = 0; i < strutturaSplit.length; i++) {
                LivelloGerarchiaType livelloUO = new LivelloGerarchiaType();
                livelloUO.setNro(i + 1);
                livelloUO.setCodice(strutturaSplit[i]);
                uo.getLivelloUO().add(livelloUO);
              }
              inCaricoA.setUO(uo);
              newFolder.setInCaricoA(inCaricoA);

              it.engineering.documentale.xsd.newfolder.NewFolder.Apertura aperturaFolder = new it.engineering.documentale.xsd.newfolder.NewFolder.Apertura();
              aperturaFolder.setUO(uo);
              newFolder.setApertura(aperturaFolder);

            }
          }

        } catch (Exception e) {

        }

        // Conversione in stringa XML
        StringWriter xmlNewFolderStringWriter = new StringWriter();
        JAXBContext jaxbLocalContext = JAXBContext.newInstance(NewFolder.class);
        jaxbLocalContext.createMarshaller().marshal(newFolder, xmlNewFolderStringWriter);
        String xmlNewFolderInput = xmlNewFolderStringWriter.toString();

        // XML Hash
        byte[] xmlNewFolderHash = DigestUtils.sha(xmlNewFolderInput.getBytes("UTF-8"));
        String xmlNewFolderHashBase64 = Base64.encode(xmlNewFolderHash);

        // Log della richiesta
        if (logger.isDebugEnabled()) logger.debug("Richiesta inserimento fascicolo: " + xmlNewFolderInput);

        // Verifica degli indirizzi
        String urlWsAddFolder = InitialContext.doLookup(WSADDFOLDER);
        if (urlWsAddFolder == null || (urlWsAddFolder != null && "".equals(urlWsAddFolder.trim()))) {
          throw new Exception(WSADDFOLDER_URL_NOT_DEFINED);
        }

        SOAPMessage soapMessageAddFolder = _sendRequestSOAP(username, password, xmlNewFolderInput, xmlNewFolderHashBase64, urlWsAddFolder,
            WSADDFOLDER_DISPATCH_METHOD, null);
        BaseOutputWS baseOutputAddFolder = _getBaseOutputWS(soapMessageAddFolder);

        if (WSRESULT_SUCCESS.equals(baseOutputAddFolder.getWSResult())) {

          Iterator<AttachmentPart> attachmentAddFolder = soapMessageAddFolder.getAttachments();

          WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();

          while (attachmentAddFolder.hasNext()) {
            AttachmentPart attAddFolder = (AttachmentPart) attachmentAddFolder.next();
            DataHandler handlerFolder = attAddFolder.getDataHandler();
            ByteArrayOutputStream baosFolder = new ByteArrayOutputStream();
            handlerFolder.writeTo(baosFolder);
            String datiAddFolderXMLEscape = baosFolder.toString();
            String datiAddFolderXML = StringEscapeUtils.unescapeXml(datiAddFolderXMLEscape);

            if (logger.isDebugEnabled()) logger.debug("datiAddFolderXMLEscape: " + datiAddFolderXMLEscape);
            if (logger.isDebugEnabled()) logger.debug("datiAddFolderXML: " + datiAddFolderXML);

            if (datiAddFolderXML != null) {
              String idFolder = getXMLElementValue(datiAddFolderXML, "IdFolder");
              WSDMFascicoloRes wsdmFascicoloLeggiRes = _fascicoloLeggi(username, password, loginAttr, idFolder, null, null, null, null);
              wsdmFascicoloRes.setEsito(true);
              wsdmFascicoloRes.setFascicolo(wsdmFascicoloLeggiRes.getFascicolo());
            } else {
              wsdmFascicoloRes.setEsito(true);
              wsdmFascicoloRes.setFascicolo(wsdmFascicolo);
            }
          }
        } else {
          wsdmFascicoloRes.setEsito(false);
          String errorContext = baseOutputAddFolder.getWSError().getErrorContext();
          BigInteger errorNumber = baseOutputAddFolder.getWSError().getErrorNumber();
          String errorMessage = baseOutputAddFolder.getWSError().getErrorMessage();
          wsdmFascicoloRes.setMessaggio(errorContext + ", " + errorNumber.toString() + ", " + errorMessage);
        }

      } else {
        wsdmFascicoloRes.setEsito(false);
        wsdmFascicoloRes.setMessaggio(messaggioCtr.toString());
      }
    } catch (WebServiceException w) {
      wsdmFascicoloRes.setEsito(false);
      wsdmFascicoloRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_fascicoloDocumentaleLeggi)", w);
    } catch (NamingException e) {
      wsdmFascicoloRes.setEsito(false);
      wsdmFascicoloRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_fascicoloDocumentaleLeggi)", e);
    } catch (Throwable t) {
      wsdmFascicoloRes.setEsito(false);
      wsdmFascicoloRes.setMessaggio(t.getMessage());
      logger.error("Errore (_fascicoloDocumentaleLeggi)", t);
    }

    return wsdmFascicoloRes;
  }

  @Override
  public WSDMFascicoloRes _fascicoloAggiungiDocumento(String username, String password, WSDMLoginAttr loginAttr, String codiceFascicolo,
      String numeroDocumento) {
    WSDMFascicoloRes wsdmfascicoloRes = new WSDMFascicoloRes();
    wsdmfascicoloRes.setEsito(false);
    wsdmfascicoloRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmfascicoloRes;
  }

  private WSDMFascicoloRes _fascicoloLeggiGeneric(String username, String password, WSDMLoginAttr loginAttr, String codiceFascicolo,
      Long annoFascicolo, String numeroFascicolo, String classificaFascicolo, boolean leggiDocumentiFascicolo) {

    if ("NDEF".equals(password)) {
      password = "";
    }

    WSDMFascicoloRes wsdmFascicoloRes = new WSDMFascicoloRes();

    // Il file XML in input con gli estremi per individuare l'unita'
    // documentaria
    // di cui estrarre i metadati ha come root element l’elemento
    // EstremiXIdentificazioneFolder riportato nell'XSD
    // EstremiXIdentificazioneFolder.xsd. L'output
    // del Web Service e' un file XML con tracciato come in allegato
    // BaseOutput_WS.xsd. In output e' presente, in caso di successo, un unico
    // attachment XML (tracciato in allegato Output_DatiFolder.xsd) che contiene
    // i metadati del folder.

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (EngineeringDocUtilityControllo.ctrFascicoloLeggi(loginAttr, codiceFascicolo, annoFascicolo, numeroFascicolo, classificaFascicolo,
          messaggioCtr)) {

        boolean nuovaModalitaRicercaFascicolo = false;

        String xmlEstremiFolderInput = "";

        if (nuovaModalitaRicercaFascicolo) {
          xmlEstremiFolderInput += "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
          xmlEstremiFolderInput += "<TrovaDocFolder>";
          xmlEstremiFolderInput += "<FiltriPrincipali>";
          xmlEstremiFolderInput += "<TipoOggettiDaCercare>F</TipoOggettiDaCercare>";
          xmlEstremiFolderInput += "<ClassifUA>";
          xmlEstremiFolderInput += "<AnnoAperturaUA>" + annoFascicolo.toString() + "</AnnoAperturaUA>";

          String[] classificaFascicoloSplit = classificaFascicolo.split("\\.");
          if (classificaFascicoloSplit.length > 0) {
            for (int c = 0; c < classificaFascicoloSplit.length; c++) {
              xmlEstremiFolderInput += "<LivelloClassificazione Nro=\"" + (c + 1) + "\"Codice=\"" + classificaFascicoloSplit[c] + "\"/>";
            }
          }

          xmlEstremiFolderInput += "<NroProgrUA>" + numeroFascicolo + "</NroProgrUA>";
          xmlEstremiFolderInput += "</ClassifUA>";
          xmlEstremiFolderInput += "</FiltriPrincipali>";
          xmlEstremiFolderInput += "<LimitaEstrazioneAlCampo>2</LimitaEstrazioneAlCampo>";
          xmlEstremiFolderInput += "</TrovaDocFolder>";
        } else {
          xmlEstremiFolderInput = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><EstremiXIdentificazioneFolder><IdFolder>"
              + codiceFascicolo
              + "</IdFolder></EstremiXIdentificazioneFolder>";
        }

        // XML Hash
        byte[] xmlEstremiFolderHash = DigestUtils.sha(xmlEstremiFolderInput.getBytes("UTF-8"));
        String xmlEstremiFolderHashBase64 = Base64.encode(xmlEstremiFolderHash);

        // Servizio di lettura dei metadati
        String urlWsGetMetadataFolder = InitialContext.doLookup(WSGETMETADATAFOLDER);
        if (urlWsGetMetadataFolder == null || (urlWsGetMetadataFolder != null && "".equals(urlWsGetMetadataFolder.trim()))) {
          throw new Exception(WSGETMETADATAFOLDER_URL_NOT_DEFINED);
        }

        // Servizio di lettura del documenti del fascicolo
        String urlWsTrovaDocFolder = InitialContext.doLookup(WSTROVADOCFOLDER);
        if (urlWsTrovaDocFolder == null || (urlWsTrovaDocFolder != null && "".equals(urlWsTrovaDocFolder.trim()))) {
          throw new Exception(WSTROVADOCFOLDER_URL_NOT_DEFINED);
        }

        SOAPMessage soapMessageMetadataFolder = _sendRequestSOAP(username, password, xmlEstremiFolderInput, xmlEstremiFolderHashBase64,
            urlWsGetMetadataFolder, GETMETADATAFOLDER_DISPATCH_METHOD, null);
        BaseOutputWS baseOutputMetadataFolder = _getBaseOutputWS(soapMessageMetadataFolder);

        // Lettura della risposta dei metadati del fascicolo
        if (WSRESULT_SUCCESS.equals(baseOutputMetadataFolder.getWSResult())) {

          Iterator<AttachmentPart> attachmentsMetadataFolder = soapMessageMetadataFolder.getAttachments();

          WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();

          while (attachmentsMetadataFolder.hasNext()) {
            AttachmentPart attMetadataFolder = (AttachmentPart) attachmentsMetadataFolder.next();
            DataHandler handlerFolder = attMetadataFolder.getDataHandler();
            ByteArrayOutputStream baosFolder = new ByteArrayOutputStream();
            handlerFolder.writeTo(baosFolder);
            String datiFolderXMLEscape = baosFolder.toString();
            String datiFolderXML = StringEscapeUtils.unescapeXml(datiFolderXMLEscape);
            datiFolderXML = datiFolderXML.replace("\u00a0", " ");

            if (logger.isDebugEnabled()) logger.debug("datiFolderXMLEscape: " + datiFolderXMLEscape);
            if (logger.isDebugEnabled()) logger.debug("datiFolderXML: " + datiFolderXML);

            DatiFolder datiFolder = this.getDatiFolderFromXML(datiFolderXML);

            // Codice del fascicolo
            wsdmFascicolo.setCodiceFascicolo(codiceFascicolo);

            // Nome ed oggetto
            String oggetto = "";
            String nomeFolder = datiFolder.getNomeFolder();
            String oggettoFolder = datiFolder.getOggetto();
            if (nomeFolder != null) oggetto = nomeFolder;
            if (nomeFolder == null && oggettoFolder != null) {
              oggetto = oggettoFolder;
            }
            wsdmFascicolo.setOggettoFascicolo(oggetto);

            // Classifica, descrizione classifica, numero del fascicolo
            if (datiFolder.getDatiFascDiTitolario() != null) {
              if (datiFolder.getDatiFascDiTitolario().getClassificazione() != null) {

                it.engineering.documentale.xsd.outputdatifolder.ClassificazioneType classificazione = datiFolder.getDatiFascDiTitolario().getClassificazione();
                if (classificazione != null) {
                  // Lista di classificazione per ricavare il valore numerico di
                  // classificazione (es. 6.5.7)
                  List<it.engineering.documentale.xsd.outputdatifolder.LivelloGerarchiaType> listaLivelloClassificazione = classificazione.getLivelloClassificazione();
                  String classifica = "";
                  for (int c = 0; c < listaLivelloClassificazione.size(); c++) {
                    if (c > 0) classifica += ".";
                    classifica += listaLivelloClassificazione.get(c).getCodice();
                  }
                  wsdmFascicolo.setClassificaFascicolo(classifica);

                  // Descrizione della classificazione
                  if (classificazione.getDescrizioneClassificazione() != null) {
                    wsdmFascicolo.setClassificaFascicoloDescrizione(classificazione.getDescrizioneClassificazione());
                  }
                }

                // Numero del fascicolo
                if (datiFolder.getDatiFascDiTitolario().getNroFascicolo() != null) {
                  wsdmFascicolo.setNumeroFascicolo(datiFolder.getDatiFascDiTitolario().getNroFascicolo().toString());
                }

              }
            }

            // Data apertura e ano del fascicolo
            Apertura aperturaFolder = datiFolder.getApertura();
            if (aperturaFolder != null) {
              wsdmFascicolo.setDataFascicolo(aperturaFolder.getDataOra().toGregorianCalendar().getTime());
              int annoAperturaFascicolo = aperturaFolder.getDataOra().toGregorianCalendar().getTime().getYear() + 1900;
              wsdmFascicolo.setAnnoFascicolo(new Long(annoAperturaFascicolo));
            }

            // Numero secondario - GENERICS11
            if (datiFolder.getDatiFascDiTitolario() != null) {
              if (datiFolder.getDatiFascDiTitolario().getNroSecondario() != null) {
                String numeroSecondario = datiFolder.getDatiFascDiTitolario().getNroSecondario();
                wsdmFascicolo.setGenericS11(numeroSecondario);
              }
            }

            // Tipologia censita in Auriga - GENERICS12
            if (datiFolder.getTipoDiDettaglio() != null) {
              if (datiFolder.getTipoDiDettaglio().getDecodificaNome() != null) {
                wsdmFascicolo.setGenericS12(datiFolder.getTipoDiDettaglio().getDecodificaNome());
              }
            }

            // In carico A - Struttura
            if (datiFolder.getInCaricoA() != null) {
              it.engineering.documentale.xsd.outputdatifolder.AssegnatarioEffType inCaricoA = datiFolder.getInCaricoA();
              if (inCaricoA.getUO() != null) {
                List<it.engineering.documentale.xsd.outputdatifolder.LivelloGerarchiaType> listaLivelloUO = inCaricoA.getUO().getLivelloUO();
                String struttura = "";
                for (int u = 0; u < listaLivelloUO.size(); u++) {
                  if (u > 0) struttura += ".";
                  struttura += listaLivelloUO.get(u).getCodice();
                }
                wsdmFascicolo.setStruttura(struttura);
              }
            }

            // Note
            wsdmFascicolo.setDescrizioneFascicolo(datiFolder.getNote());

            wsdmFascicoloRes.setEsito(true);
            wsdmFascicoloRes.setFascicolo(wsdmFascicolo);

            if (leggiDocumentiFascicolo == true) {
              // Ricerca delle unita' documentarie contenute nel
              // folder/fascicolo
              String xmlTrovaDocFolderInput = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
              xmlTrovaDocFolderInput += "<TrovaDocFolder>";
              xmlTrovaDocFolderInput += "<FiltriPrincipali>";
              xmlTrovaDocFolderInput += "<TipoOggettiDaCercare>D</TipoOggettiDaCercare>";
              xmlTrovaDocFolderInput += "<CercaInFolder>";
              xmlTrovaDocFolderInput += "<IdFolder>" + codiceFascicolo + "</IdFolder>";
              xmlTrovaDocFolderInput += "<IncludiSubFolder>1</IncludiSubFolder>";
              xmlTrovaDocFolderInput += "</CercaInFolder>";
              xmlTrovaDocFolderInput += "</FiltriPrincipali>";
              xmlTrovaDocFolderInput += "<LimitaEstrazioneAlCampo>1</LimitaEstrazioneAlCampo>";
              xmlTrovaDocFolderInput += "<LimitaEstrazioneAlCampo>2</LimitaEstrazioneAlCampo>";
              xmlTrovaDocFolderInput += "<LimitaEstrazioneAlCampo>3</LimitaEstrazioneAlCampo>";
              xmlTrovaDocFolderInput += "<LimitaEstrazioneAlCampo>20</LimitaEstrazioneAlCampo>";
              xmlTrovaDocFolderInput += "<EstraiAncheAttributoCustom>String</EstraiAncheAttributoCustom>";
              xmlTrovaDocFolderInput += "<Ordinamento>";
              xmlTrovaDocFolderInput += "<PerCampo>4</PerCampo>";
              xmlTrovaDocFolderInput += "</Ordinamento>";
              // xmlTrovaDocFolderInput += "<EstrazionePaginata>";
              // xmlTrovaDocFolderInput += "<NroPagina>1</NroPagina>";
              // xmlTrovaDocFolderInput +=
              // "<NroRecordInPagina>100</NroRecordInPagina>";
              // xmlTrovaDocFolderInput += "</EstrazionePaginata>";
              xmlTrovaDocFolderInput += "</TrovaDocFolder>";

              // XML Hash
              byte[] xmlTrovaDocFolderHash = DigestUtils.sha(xmlTrovaDocFolderInput.getBytes("UTF-8"));
              String xmlTrovaDocFolderHashBase64 = Base64.encode(xmlTrovaDocFolderHash);

              // Log della richiesta di lettura della lista dei documenti del
              // fascicolo
              if (logger.isDebugEnabled()) logger.debug("Richiesta lettura documento: " + xmlTrovaDocFolderInput);

              SOAPMessage soapMessageTrovaDocFolder = _sendRequestSOAP(username, password, xmlTrovaDocFolderInput,
                  xmlTrovaDocFolderHashBase64, urlWsTrovaDocFolder, TROVADOCFOLDER_DISPATCH_METHOD, null);
              BaseOutputWS baseOutputTrovaDocFolder = _getBaseOutputWS(soapMessageMetadataFolder);

              // Risposta della richiesta di lettura della lista dei documenti
              // del
              // fascicolo
              if (WSRESULT_SUCCESS.equals(baseOutputTrovaDocFolder.getWSResult())) {

                Iterator<AttachmentPart> attachmentsTrovaDocFolder = soapMessageTrovaDocFolder.getAttachments();
                while (attachmentsTrovaDocFolder.hasNext()) {
                  AttachmentPart attTrovaDocFolder = (AttachmentPart) attachmentsTrovaDocFolder.next();
                  DataHandler handlerDoc = attTrovaDocFolder.getDataHandler();
                  ByteArrayOutputStream baosDoc = new ByteArrayOutputStream();
                  handlerDoc.writeTo(baosDoc);
                  String searchOutputSTDXMLEscape = baosDoc.toString();
                  String searchOutputSTDXML = StringEscapeUtils.unescapeXml(searchOutputSTDXMLEscape);
                  searchOutputSTDXML = searchOutputSTDXML.replace("\u00a0", " ");
                  int posWarning = searchOutputSTDXML.indexOf("<WarningMessage>");
                  if (posWarning > 0) {
                    searchOutputSTDXML = searchOutputSTDXML.substring(0, posWarning);
                  }

                  if (logger.isDebugEnabled()) logger.debug("searchOutputSTDXMLEscape: " + searchOutputSTDXMLEscape);
                  if (logger.isDebugEnabled()) logger.debug("searchOutputSTDXML: " + searchOutputSTDXML);

                  Lista lista = this.getSearchOutputSTDFromXML(searchOutputSTDXML);

                  if (lista.getRiga() != null && lista.getRiga().size() > 0) {

                    List<Riga> righe = lista.getRiga();
                    WSDMFascicoloDocumento[] wsdmFascicoloDocumento = new WSDMFascicoloDocumento[righe.size()];

                    for (int r = 0; r < righe.size(); r++) {

                      Riga riga = righe.get(r);
                      wsdmFascicoloDocumento[r] = new WSDMFascicoloDocumento();

                      String flag_FU = null;
                      String id_ud = null;
                      String oggetto_ud = null;
                      String provenienza_ud = null;

                      List<Colonna> colonne = riga.getColonna();
                      for (int c = 0; c < colonne.size(); c++) {
                        Colonna colonna = colonne.get(c);
                        BigInteger nro = colonna.getNro();
                        // Nro 1 Flag F/U che indica se si tratta di unita'
                        // documentaria o folder
                        // Nro 2 Identificativo dell'unita' documentaria o
                        // folder
                        // Nro 3 Nome dell'unità documentaria o folder
                        // Nro 20 Tipo di provenienza dell'unità documentaria: E
                        // =
                        // in Entrata, U = in Uscita, I = tra uffici
                        if (nro.intValue() == 1) flag_FU = colonna.getContent();
                        if (nro.intValue() == 2) id_ud = colonna.getContent();
                        if (nro.intValue() == 3) oggetto_ud = colonna.getContent();
                        if (nro.intValue() == 20) provenienza_ud = colonna.getContent();
                      }

                      if ("U".equals(flag_FU)) {
                        wsdmFascicoloDocumento[r].setNumeroDocumento(id_ud);
                        wsdmFascicoloDocumento[r].setOggetto(oggetto_ud);

                        // Ricavo altri dati interrogando la lettura del
                        // documento
                        // WSDMProtocolloDocumentoRes altriDatiRes =
                        // this.getMetadataUDExtractMulti(username, password,
                        // null, null, id_ud,
                        // false);
                        // if (altriDatiRes != null) {
                        // if (altriDatiRes.getProtocolloDocumento() != null) {
                        // wsdmFascicoloDocumento[r].setAnnoProtocollo(altriDatiRes.getProtocolloDocumento().getAnnoProtocollo());
                        // wsdmFascicoloDocumento[r].setNumeroProtocollo(altriDatiRes.getProtocolloDocumento().getNumeroProtocollo());
                        // }
                        // }

                        if (ENG_DOCUMENTALE_IN_ENTRATA.equals(provenienza_ud)) {
                          wsdmFascicoloDocumento[r].setInout(WSDMProtocolloInOut.IN);
                        } else if (ENG_DOCUMENTALE_IN_USCITA.equals(provenienza_ud)) {
                          wsdmFascicoloDocumento[r].setInout(WSDMProtocolloInOut.OUT);
                        } else if (ENG_DOCUMENTALE_INTERNO.equals(provenienza_ud)) {
                          wsdmFascicoloDocumento[r].setInout(WSDMProtocolloInOut.INT);
                        } else {
                          wsdmFascicoloDocumento[r].setInout(WSDMProtocolloInOut.INT);
                        }
                      }
                    }
                    wsdmFascicoloRes.getFascicolo().setDocumenti(wsdmFascicoloDocumento);
                  }
                }
              }
            }
          }
        } else {
          wsdmFascicoloRes.setEsito(false);
          String errorContext = baseOutputMetadataFolder.getWSError().getErrorContext();
          BigInteger errorNumber = baseOutputMetadataFolder.getWSError().getErrorNumber();
          String errorMessage = baseOutputMetadataFolder.getWSError().getErrorMessage();
          wsdmFascicoloRes.setMessaggio(errorContext + ", " + errorNumber.toString() + ", " + errorMessage);
        }

      } else {

        wsdmFascicoloRes.setEsito(false);
        wsdmFascicoloRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (WebServiceException w) {
      wsdmFascicoloRes.setEsito(false);
      wsdmFascicoloRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_fascicoloDocumentaleLeggi)", w);
    } catch (NamingException e) {
      wsdmFascicoloRes.setEsito(false);
      wsdmFascicoloRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_fascicoloDocumentaleLeggi)", e);
    } catch (Throwable t) {
      wsdmFascicoloRes.setEsito(false);
      wsdmFascicoloRes.setMessaggio(t.getMessage());
      logger.error("Errore (_fascicoloDocumentaleLeggi)", t);
    }

    return wsdmFascicoloRes;
  }

  /**
   * Estrae il valore di un elemento da un XML-
   * 
   * @param datiXML
   * @param elementName
   * @return
   */
  private String getXMLElementValue(String datiXML, String elementName) {
    int _p_in = datiXML.indexOf("<" + elementName + ">");
    int _p_out = datiXML.indexOf("</" + elementName + ">", _p_in);
    if (_p_out < 0) {
      _p_out = datiXML.indexOf("</>", _p_in);
    }
    int _len_in = ("<" + elementName + ">").length();
    String _v = datiXML.substring(_p_in + _len_in, _p_out);
    return StringEscapeUtils.unescapeXml(_v);
  }

  /**
   * Lettura del bearer oauth2 e creazione header.
   * 
   * @return
   * @throws Exception
   */
  private Hashtable<String, String> _getBearerOauth2() throws Exception {
    String bearerOauth2 = InitialContext.doLookup(BEARER_OAUTH2);
    if (bearerOauth2 == null || (bearerOauth2 != null && "".equals(bearerOauth2.trim()))) {
      throw new Exception(BEARER_OAUTH2_NOT_DEFINED);
    }
    Hashtable<String, String> headers = new Hashtable<String, String>();
    headers.put("Authorization", "Bearer " + bearerOauth2);
    return headers;
  }

  @Override
  public WSDMFascicoloRes _fascicoloLeggi(String username, String password, WSDMLoginAttr loginAttr, String codiceFascicolo,
      Long annoFascicolo, String numeroFascicolo, String classificaFascicolo, String oggettoFascicolo) {
    return _fascicoloLeggiGeneric(username, password, loginAttr, codiceFascicolo, annoFascicolo, numeroFascicolo, classificaFascicolo,
        true);
  }

  @Override
  public WSDMFascicoloRes _fascicoloMetadatiLeggi(String username, String password, WSDMLoginAttr loginAttr, String codiceFascicolo,
      Long annoFascicolo, String numeroFascicolo, String classificaFascicolo, String oggettoFascicolo) {
    return _fascicoloLeggiGeneric(username, password, loginAttr, codiceFascicolo, annoFascicolo, numeroFascicolo, classificaFascicolo,
        false);
  }

  /**
   * Lettura di una chiave (key) da un lista (entry) di una mappa (map).
   * 
   * @param mapName
   * @param keyName
   * @return
   */
  private static String _readKey(String mapName, String keyName) {

    String look = "java:comp/env/tab/ENGINEERINGDOC/" + mapName + "/" + keyName;
    String keyValue = null;
    try {
      keyValue = InitialContext.doLookup(look);
    } catch (NamingException e) {

    }

    return keyValue;
  }

  @Override
  public WSDMProtocolloDocumentoRes _attoContrattoLeggi(String username, String password, WSDMLoginAttr loginAttr, String tipo,
      String organo, Long anno, String numero) {
    WSDMProtocolloDocumentoRes wsdmProtocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    if ("NDEF".equals(password)) {
      password = "";
    }

    try {

      StringBuffer messaggioCtr = new StringBuffer();
      if (EngineeringDocUtilityControlloLegacy.ctrAttoLeggi(loginAttr, tipo, organo, anno, numero, messaggioCtr)) {

        // Verifica indirizzi e gestione servizi per la ricerca documenti
        String urlWsTrovaDocFolder = InitialContext.doLookup(WSTROVADOCFOLDER);
        if (urlWsTrovaDocFolder == null || (urlWsTrovaDocFolder != null && "".equals(urlWsTrovaDocFolder.trim()))) {
          throw new Exception(WSTROVADOCFOLDER_URL_NOT_DEFINED);
        }

        TrovaDocFolder trovaDocFolder = new TrovaDocFolder();

        // Filtri principali
        FiltriPrincipali filtriPrincipali = new FiltriPrincipali();
        filtriPrincipali.setTipoOggettiDaCercare("D");
        trovaDocFolder.setFiltriPrincipali(filtriPrincipali);

        // Filtri avanzati
        FiltriAvanzati filtriAvanzati = new FiltriAvanzati();

        // Tipo di ricerca
        if (tipo != null && !"".equals(tipo.trim())) {

          // Se il tipo contratto indicato e' compreso nella lista (tabellato)
          // "tipocontratto",verificare se il tipo di scrittura e' "pubblica".
          // Solo in questo caso si devono utilizzari gli attributi "custom"
          // ricavabili dalle chiavi "attributiadd".
          // Nel caso di tipo scrittura "privata" (non pubblica) o nel caso in
          // cui
          // il tipo contratto non e' compreso nella lista dei tabellati
          // (proviene
          // da una ricerca atto) si devono utilizzare i parametri di ricerca
          // "RegistrazioneDoc".
          String descrizioneTipoContratto = _readKey("tipocontratto", tipo);
          String tiposcrittura = _readKey(tipo, "tiposcrittura");
          String codid = _readKey(tipo, "codid");

          if (descrizioneTipoContratto != null
              && !"".equals(descrizioneTipoContratto.trim())
              && "pubblica".equals(tiposcrittura.toLowerCase())) {

            OggDiTabDiSistemaType tipoDocumento = new OggDiTabDiSistemaType();
            tipoDocumento.setCodId(codid);
            filtriAvanzati.setTipoDocumento(tipoDocumento);
            List<CriterioRicercaSuAttributoAddType> listaAttributi = filtriAvanzati.getAttributoAdd();

            if (numero != null && !"".equals(numero.trim())) {
              CriterioRicercaSuAttributoAddType attributoNumero = new CriterioRicercaSuAttributoAddType();
              String _attributiAddNumero = _readKey("attributiadd", "numero");
              attributoNumero.setNome(_attributiAddNumero);
              attributoNumero.setOperatoreLogico("uguale");
              attributoNumero.setValoreConfronto1(numero);
              listaAttributi.add(attributoNumero);
            }

            if (anno != null) {
              CriterioRicercaSuAttributoAddType attributoAnno = new CriterioRicercaSuAttributoAddType();
              String _attributiAddData = _readKey("attributiadd", "data");
              attributoAnno.setNome(_attributiAddData);
              attributoAnno.setOperatoreLogico("compreso tra");
              attributoAnno.setValoreConfronto1("01/01/" + anno.toString());
              attributoAnno.setValoreConfronto2("31/12/" + anno.toString());
              listaAttributi.add(attributoAnno);
            }

          } else {
            RegistrazioneDoc registrazioneDoc = new RegistrazioneDoc();
            if (tipo != null && !"".equals(tipo.trim())) registrazioneDoc.setSiglaReg(tipo);
            if (anno != null) registrazioneDoc.setAnnoReg(anno.intValue());
            if (numero != null) {
              registrazioneDoc.setNumRegA(new Integer(numero));
              registrazioneDoc.setNumRegDa(new Integer(numero));
            }
            filtriAvanzati.setRegistrazioneDoc(registrazioneDoc);
          }
        }

        trovaDocFolder.setFiltriAvanzati(filtriAvanzati);

        // Conversione in stringa XML
        StringWriter xmlTrovaDocFolderStringWriter = new StringWriter();
        JAXBContext jaxbLocalContext = JAXBContext.newInstance(TrovaDocFolder.class);
        jaxbLocalContext.createMarshaller().marshal(trovaDocFolder, xmlTrovaDocFolderStringWriter);
        String xmlTrovaDocFolderInput = xmlTrovaDocFolderStringWriter.toString();

        // XML Hash
        byte[] xmlTrovaDocFolderHash = DigestUtils.sha(xmlTrovaDocFolderInput.getBytes("UTF-8"));
        String xmlTrovaDocFolderHashBase64 = Base64.encode(xmlTrovaDocFolderHash);

        // Log della richiesta
        if (logger.isDebugEnabled()) logger.debug("Richiesta lettura atto/contratto: " + xmlTrovaDocFolderInput);

        SOAPMessage soapMessageMetadataFolder = _sendRequestSOAP(username, password, xmlTrovaDocFolderInput, xmlTrovaDocFolderHashBase64,
            urlWsTrovaDocFolder, TROVADOCFOLDER_DISPATCH_METHOD, null);
        BaseOutputWS baseOutputTrovaDocFolder = _getBaseOutputWS(soapMessageMetadataFolder);

        if (WSRESULT_SUCCESS.equals(baseOutputTrovaDocFolder.getWSResult())) {

          Iterator<AttachmentPart> attachmentsTrovaDocFolder = soapMessageMetadataFolder.getAttachments();

          while (attachmentsTrovaDocFolder.hasNext()) {
            AttachmentPart attTrovaDocFolder = (AttachmentPart) attachmentsTrovaDocFolder.next();
            DataHandler handler = attTrovaDocFolder.getDataHandler();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            handler.writeTo(baos);
            String searchOutputSTDXMLEscape = baos.toString();
            String searchOutputSTDXML = StringEscapeUtils.unescapeXml(searchOutputSTDXMLEscape);
            searchOutputSTDXML = searchOutputSTDXML.replace("\u00a0", " ");
            int posWarning = searchOutputSTDXML.indexOf("<WarningMessage>");
            if (posWarning > 0) {
              searchOutputSTDXML = searchOutputSTDXML.substring(0, posWarning);
            }

            if (logger.isDebugEnabled()) logger.debug("searchOutputSTDXMLEscape: " + searchOutputSTDXMLEscape);
            if (logger.isDebugEnabled()) logger.debug("searchOutputSTDXML: " + searchOutputSTDXML);

            Lista lista = this.getSearchOutputSTDFromXML(searchOutputSTDXML);
            if (lista.getRiga() != null && lista.getRiga().size() > 0) {

              List<Riga> righe = lista.getRiga();
              Riga riga = righe.get(0);

              String flag_FU = null;
              String numeroDocumento = null;

              List<Colonna> colonne = riga.getColonna();
              for (int c = 0; c < colonne.size(); c++) {
                Colonna colonna = colonne.get(c);
                BigInteger nro = colonna.getNro();
                // Nro 1 Flag F/U che indica se si tratta di unita'
                // documentaria o folder
                // Nro 2 Identificativo dell'unita' documentaria o folder
                if (nro.intValue() == 1) flag_FU = colonna.getContent();
                if (nro.intValue() == 2) numeroDocumento = colonna.getContent();
              }

              if ("U".equals(flag_FU) && numeroDocumento != null && !"".equals(numeroDocumento.trim())) {
                wsdmProtocolloDocumentoRes = this.getMetadataUDExtractMulti(username, password, null, null, numeroDocumento, true);
              }

            } else {
              wsdmProtocolloDocumentoRes.setEsito(false);
              wsdmProtocolloDocumentoRes.setMessaggio("La ricerca dell'atto o del contratto non ha restituito alcun risultato.");
            }

          }

        } else {
          wsdmProtocolloDocumentoRes.setEsito(false);
          String errorContext = baseOutputTrovaDocFolder.getWSError().getErrorContext();
          BigInteger errorNumber = baseOutputTrovaDocFolder.getWSError().getErrorNumber();
          String errorMessage = baseOutputTrovaDocFolder.getWSError().getErrorMessage();
          wsdmProtocolloDocumentoRes.setMessaggio(errorContext + ", " + errorNumber.toString() + ", " + errorMessage);
        }

        // Log della risposta
        if (logger.isDebugEnabled()) logger.debug("Risposta lettura atto/contratto: " + baseOutputTrovaDocFolder);

      } else {
        wsdmProtocolloDocumentoRes.setEsito(false);
        wsdmProtocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (WebServiceException w) {
      wsdmProtocolloDocumentoRes.setEsito(false);
      wsdmProtocolloDocumentoRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_attoContrattoLeggi)", w);
    } catch (NamingException e) {
      wsdmProtocolloDocumentoRes.setEsito(false);
      wsdmProtocolloDocumentoRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_attoContrattoLeggi)", e);
    } catch (Throwable t) {
      wsdmProtocolloDocumentoRes.setEsito(false);
      wsdmProtocolloDocumentoRes.setMessaggio(t.getMessage());
      logger.error("Errore (_attoContrattoLeggi)", t);
    }

    return wsdmProtocolloDocumentoRes;
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

    if ("NDEF".equals(password)) {
      password = "";
    }

    WSDMAttoContrattoRes wsdmAttoContrattoRes = new WSDMAttoContrattoRes();

    try {

      // Verifica indirizzi e gestione servizi per la ricerca documenti
      String urlWsTrovaDocFolder = InitialContext.doLookup(WSTROVADOCFOLDER);
      if (urlWsTrovaDocFolder == null || (urlWsTrovaDocFolder != null && "".equals(urlWsTrovaDocFolder.trim()))) {
        throw new Exception(WSTROVADOCFOLDER_URL_NOT_DEFINED);
      }

      TrovaDocFolder trovaDocFolder = new TrovaDocFolder();

      // Filtri principali
      FiltriPrincipali filtriPrincipali = new FiltriPrincipali();
      filtriPrincipali.setTipoOggettiDaCercare("D");

      // CercaInFolder cercaInFolder = new CercaInFolder();
      // cercaInFolder.setPathNome("FONDO PRIMARIO");
      // cercaInFolder.setIncludiSubFolder("1");
      // filtriPrincipali.setCercaInFolder(cercaInFolder);

      trovaDocFolder.setFiltriPrincipali(filtriPrincipali);

      // Filtri avanzati
      FiltriAvanzati filtriAvanzati = new FiltriAvanzati();

      // Tipo di ricerca
      if (tipo != null && !"".equals(tipo.trim())) {

        // Se il tipo contratto indicato e' compreso nella lista (tabellato)
        // "tipocontratto",verificare se il tipo di scrittura e' "pubblica".
        // Solo in questo caso si devono utilizzari gli attributi "custom"
        // ricavabili dalle chiavi "attributiadd".
        // Nel caso di tipo scrittura "privata" (non pubblica) o nel caso in cui
        // il tipo contratto non e' compreso nella lista dei tabellati (proviene
        // da una ricerca atto) si devono utilizzare i parametri di ricerca
        // "RegistrazioneDoc".
        String descrizioneTipoContratto = _readKey("tipocontratto", tipo);
        String tiposcrittura = _readKey(tipo, "tiposcrittura");
        String codid = _readKey(tipo, "codid");

        if (descrizioneTipoContratto != null
            && !"".equals(descrizioneTipoContratto.trim())
            && "pubblica".equals(tiposcrittura.toLowerCase())) {

          OggDiTabDiSistemaType tipoDocumento = new OggDiTabDiSistemaType();
          tipoDocumento.setCodId(codid);
          filtriAvanzati.setTipoDocumento(tipoDocumento);
          List<CriterioRicercaSuAttributoAddType> listaAttributi = filtriAvanzati.getAttributoAdd();

          if (numeroDa != null && !"".equals(numeroDa.trim()) && numeroA != null && !"".equals(numeroA.trim())) {
            CriterioRicercaSuAttributoAddType attributoNumero = new CriterioRicercaSuAttributoAddType();
            String _attributiAddNumero = _readKey("attributiadd", "numero");
            attributoNumero.setNome(_attributiAddNumero);
            attributoNumero.setOperatoreLogico("compreso tra");
            attributoNumero.setValoreConfronto1(numeroDa);
            attributoNumero.setValoreConfronto2(numeroA);
            listaAttributi.add(attributoNumero);
          }

          if (anno != null) {
            CriterioRicercaSuAttributoAddType attributoAnno = new CriterioRicercaSuAttributoAddType();
            String _attributiAddData = _readKey("attributiadd", "data");
            attributoAnno.setNome(_attributiAddData);
            attributoAnno.setOperatoreLogico("compreso tra");
            attributoAnno.setValoreConfronto1("01/01/" + anno.toString());
            attributoAnno.setValoreConfronto2("31/12/" + anno.toString());
            listaAttributi.add(attributoAnno);
          }

          // CriterioRicercaSuAttributoAddType attributoNumero = new
          // CriterioRicercaSuAttributoAddType();
          // attributoNumero.setNome("NUMERO_REPERTORIO");
          // attributoNumero.setOperatoreLogico("uguale");
          // attributoNumero.setValoreConfronto1("68286");
          // listaAttributi.add(attributoNumero);
          // CriterioRicercaSuAttributoAddType attributoAnno = new
          // CriterioRicercaSuAttributoAddType();
          // attributoAnno.setNome("DATA_REPERTORIO");
          // attributoAnno.setOperatoreLogico("uguale");
          // attributoAnno.setValoreConfronto1("07/11/2018");
          // listaAttributi.add(attributoAnno);

        } else {
          RegistrazioneDoc registrazioneDoc = new RegistrazioneDoc();
          if (tipo != null && !"".equals(tipo.trim())) registrazioneDoc.setSiglaReg(tipo);
          if (anno != null) registrazioneDoc.setAnnoReg(anno.intValue());
          if (numeroDa != null && !"".equals(numeroDa.trim())) registrazioneDoc.setNumRegDa(Integer.parseInt(numeroDa));
          if (numeroA != null && !"".equals(numeroA.trim())) registrazioneDoc.setNumRegA(Integer.parseInt(numeroA));
          filtriAvanzati.setRegistrazioneDoc(registrazioneDoc);
        }
      }

      trovaDocFolder.setFiltriAvanzati(filtriAvanzati);

      // Conversione in stringa XML
      StringWriter xmlTrovaDocFolderStringWriter = new StringWriter();
      JAXBContext jaxbLocalContext = JAXBContext.newInstance(TrovaDocFolder.class);
      jaxbLocalContext.createMarshaller().marshal(trovaDocFolder, xmlTrovaDocFolderStringWriter);
      String xmlTrovaDocFolderInput = xmlTrovaDocFolderStringWriter.toString();

      // XML Hash
      byte[] xmlTrovaDocFolderHash = DigestUtils.sha(xmlTrovaDocFolderInput.getBytes("UTF-8"));
      String xmlTrovaDocFolderHashBase64 = Base64.encode(xmlTrovaDocFolderHash);

      // Log della richiesta
      if (logger.isDebugEnabled()) logger.debug("Richiesta ricerca atto/contratto: " + xmlTrovaDocFolderInput);

      SOAPMessage soapMessageMetadataFolder = _sendRequestSOAP(username, password, xmlTrovaDocFolderInput, xmlTrovaDocFolderHashBase64,
          urlWsTrovaDocFolder, TROVADOCFOLDER_DISPATCH_METHOD, null);
      BaseOutputWS baseOutputTrovaDocFolder = _getBaseOutputWS(soapMessageMetadataFolder);

      if (WSRESULT_SUCCESS.equals(baseOutputTrovaDocFolder.getWSResult())) {

        Iterator<AttachmentPart> attachmentsTrovaDocFolder = soapMessageMetadataFolder.getAttachments();

        while (attachmentsTrovaDocFolder.hasNext()) {
          AttachmentPart attTrovaDocFolder = (AttachmentPart) attachmentsTrovaDocFolder.next();
          DataHandler handler = attTrovaDocFolder.getDataHandler();
          ByteArrayOutputStream baos = new ByteArrayOutputStream();
          handler.writeTo(baos);
          String searchOutputSTDXMLEscape = baos.toString();
          String searchOutputSTDXML = StringEscapeUtils.unescapeXml(searchOutputSTDXMLEscape);
          searchOutputSTDXML = searchOutputSTDXML.replace("\u00a0", " ");
          int posWarning = searchOutputSTDXML.indexOf("<WarningMessage>");
          if (posWarning > 0) {
            searchOutputSTDXML = searchOutputSTDXML.substring(0, posWarning);
          }

          if (logger.isDebugEnabled()) logger.debug("searchOutputSTDXMLEscape: " + searchOutputSTDXMLEscape);
          if (logger.isDebugEnabled()) logger.debug("searchOutputSTDXML: " + searchOutputSTDXML);

          Lista lista = this.getSearchOutputSTDFromXML(searchOutputSTDXML);
          if (lista.getRiga() != null && lista.getRiga().size() > 0) {

            wsdmAttoContrattoRes.setEsito(true);

            List<Riga> righe = lista.getRiga();
            WSDMProtocolloDocumento[] wsdmProtocolloDocumento = new WSDMProtocolloDocumento[righe.size()];

            for (int r = 0; r < righe.size(); r++) {
              Riga riga = righe.get(r);

              wsdmProtocolloDocumento[r] = new WSDMProtocolloDocumento();

              String numeroDocumento = null;
              String nome = null;
              String oggetto = null;

              List<Colonna> colonne = riga.getColonna();
              for (int c = 0; c < colonne.size(); c++) {
                Colonna colonna = colonne.get(c);
                BigInteger nro = colonna.getNro();
                if (nro.intValue() == 2) numeroDocumento = colonna.getContent();
                if (nro.intValue() == 4) nome = colonna.getContent();
                if (nro.intValue() == 18) oggetto = colonna.getContent();
              }

              wsdmProtocolloDocumento[r].setNumeroDocumento(numeroDocumento);
              wsdmProtocolloDocumento[r].setOggetto(nome);
              wsdmProtocolloDocumento[r].setDescrizione(oggetto);

            }
            wsdmAttoContrattoRes.setProtocolloDocumento(wsdmProtocolloDocumento);

          } else {
            wsdmAttoContrattoRes.setEsito(true);
            wsdmAttoContrattoRes.setMessaggio("La ricerca dell'atto o del contratto non ha restituito alcun risultato.");
          }

        }

      } else {
        wsdmAttoContrattoRes.setEsito(false);
        String errorContext = baseOutputTrovaDocFolder.getWSError().getErrorContext();
        BigInteger errorNumber = baseOutputTrovaDocFolder.getWSError().getErrorNumber();
        String errorMessage = baseOutputTrovaDocFolder.getWSError().getErrorMessage();
        wsdmAttoContrattoRes.setMessaggio(errorContext + ", " + errorNumber.toString() + ", " + errorMessage);
      }

      // Log della risposta
      if (logger.isDebugEnabled()) logger.debug("Risposta ricerca atto/contratto: " + baseOutputTrovaDocFolder);

    } catch (WebServiceException w) {
      wsdmAttoContrattoRes.setEsito(false);
      wsdmAttoContrattoRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_attoContrattoRicerca)", w);
    } catch (NamingException e) {
      wsdmAttoContrattoRes.setEsito(false);
      wsdmAttoContrattoRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_attoContrattoRicerca)", e);
    } catch (Throwable t) {
      wsdmAttoContrattoRes.setEsito(false);
      wsdmAttoContrattoRes.setMessaggio(t.getMessage());
      logger.error("Errore (_attoContrattoRicerca)", t);
    }
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
  public WSDMListaAccountEmailRes _listaAccountEmail(String username, String password, WSDMLoginAttr loginAttr,
      WSDMRicercaAccountEmail ricercaAccountEmail) {
    WSDMListaAccountEmailRes wsdmListaAccountEmailRes = new WSDMListaAccountEmailRes();
    wsdmListaAccountEmailRes.setEsito(false);
    wsdmListaAccountEmailRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmListaAccountEmailRes;
  }

  /**
   * Lettura del bearer e restituzione in stringa.
   * 
   * @return
   * @throws Exception
   */
  private String _getBearerOauth2String() throws Exception {
    String bearerOauth2 = InitialContext.doLookup(BEARER_OAUTH2);
    if (bearerOauth2 == null || (bearerOauth2 != null && "".equals(bearerOauth2.trim()))) {
      throw new Exception(BEARER_OAUTH2_NOT_DEFINED);
    }
    return bearerOauth2;
  }

  /**
   * 
   * @param testo
   * @return
   */
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

  /**
   * Restituisce l'oggetto baseOutputWS estraendolo da soapMessage.
   * 
   * @param soapMessage
   * @return
   * @throws SOAPException
   * @throws WSSecurityException
   * @throws JAXBException
   */
  private BaseOutputWS _getBaseOutputWS(SOAPMessage soapMessage) throws SOAPException, WSSecurityException, JAXBException {
    BaseOutputWS baseOutputWS = new BaseOutputWS();
    SOAPBody body = soapMessage.getSOAPPart().getEnvelope().getBody();
    NodeList baseOutputNodeList = body.getElementsByTagName("serviceReturn");
    if (baseOutputNodeList != null && baseOutputNodeList.item(0) != null) {
      String baseOutputEncoded = baseOutputNodeList.item(0).getFirstChild().getTextContent();
      String baseOutputDecoded = new String(Base64.decode(baseOutputEncoded));
      logger.debug("baseOutputEncoded: " + baseOutputEncoded);
      logger.debug("baseOutputDecoded: " + baseOutputDecoded);
      baseOutputWS = this.getBaseOutputWSFromXML(baseOutputDecoded);
    }
    return baseOutputWS;
  }

  /**
   * Invia la richiesta al servizio e legge la risposta.
   * 
   * @param username
   * @param password
   * @param xmlInput
   * @param xmlHashBase64
   * @param wsurl
   * @param dispatch_method
   * @param allegati
   * @return
   * @throws MalformedURLException
   * @throws IOException
   * @throws UnsupportedEncodingException
   * @throws ProtocolException
   * @throws Exception
   * @throws SOAPException
   * @throws WSSecurityException
   * @throws JAXBException
   */
  private SOAPMessage _sendRequestSOAP(String username, String password, String xmlInput, String xmlHashBase64, String wsurl,
      String dispatch_method, WSDMProtocolloAllegato[] allegati) throws MalformedURLException, IOException, UnsupportedEncodingException,
      ProtocolException, Exception, SOAPException, WSSecurityException, JAXBException {

    // Codice applicazione
    String codiceApplicazione = InitialContext.doLookup(CODICEAPPLICAZIONE);

    // Istanza applicazione
    String istanzaApplicazione = InitialContext.doLookup(ISTANZAAPPLICAZIONE);

    // Apertura envelope con il primo boundary multipart
    StringBuffer requestString = new StringBuffer();
    requestString.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
    requestString.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" ");
    requestString.append("xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" ");
    requestString.append("xmlns:ns1=\"" + dispatch_method + "\">\n");

    // Apertura body
    requestString.append("<soapenv:Body>\n");

    // Specifica servizio
    requestString.append("<ns1:service soapenv:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\">\n");

    // Dati di richiesta
    requestString.append("<codApplicazione xsi:type=\"xsd:string\">" + codiceApplicazione + "</codApplicazione>\n");
    requestString.append("<istanzaApplicazione xsi:type=\"xsd:string\">" + istanzaApplicazione + "</istanzaApplicazione>\n");
    requestString.append("<userName xsi:type=\"xsd:string\">" + username + "</userName>\n");
    if (password == null) {
      requestString.append("<password xsi:type=\"xsd:string\" xsi:nil=\"true\"></password>\n");
    } else {
      requestString.append("<password xsi:type=\"xsd:string\">" + password + "</password>\n");
    }
    requestString.append("<xml xsi:type=\"xsd:string\">" + conversioneCaratteriXML(xmlInput) + "</xml>\n");

    // requestString.append("<xml xsi:type=\"xsd:string\"><![CDATA[" + xmlInput
    // + "]]></xml>");

    requestString.append("<hash xsi:type=\"xsd:string\">" + xmlHashBase64 + "</hash>\n");

    // Chiusura servizio
    requestString.append("</ns1:service>\n");

    // Chiusura body
    requestString.append("</soapenv:Body>\n");

    // Chiusura envelope
    requestString.append("</soapenv:Envelope>\n\n");

    // Log dell'intera busta SOAP
    logger.debug("Messaggio SOAP di richiesta: " + requestString);

    MessageFactory msgFactory = MessageFactory.newInstance(SOAPConstants.SOAP_1_1_PROTOCOL);
    SOAPMessage requestSOAPMessage = msgFactory.createMessage();

    SOAPPart requestSOAPPart = requestSOAPMessage.getSOAPPart();
    javax.xml.transform.stream.StreamSource _msg = new javax.xml.transform.stream.StreamSource(
        new java.io.StringReader(requestString.toString()));
    requestSOAPPart.setContent(_msg);

    // Header di autorizzazione
    MimeHeaders headers = requestSOAPMessage.getMimeHeaders();
    headers.addHeader("Authorization", "Bearer " + _getBearerOauth2String());

    // Allegati
    if (allegati != null && allegati.length > 0) {
      for (int ai = 0; ai < allegati.length; ai++) {
        AttachmentPart attachment = requestSOAPMessage.createAttachmentPart();
        InputStream targetStream = new ByteArrayInputStream(allegati[ai].getContenuto());
        attachment.setRawContent(targetStream, allegati[ai].getNome());
        attachment.setContentId(allegati[ai].getNome());
        requestSOAPMessage.addAttachmentPart(attachment);
      }
    }

    requestSOAPMessage.saveChanges();

    SOAPConnectionFactory factory2 = SOAPConnectionFactory.newInstance();
    SOAPConnection soapConnection = factory2.createConnection();
    SOAPMessage message = soapConnection.call(requestSOAPMessage, wsurl);

    return message;
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
