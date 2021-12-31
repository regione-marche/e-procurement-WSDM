package it.maggioli.eldasoft.bl.engineeringdoc;

import it.eng.auriga.repository2.webservices.addfolder.WSAddFolder;
import it.eng.auriga.repository2.webservices.addfolder.WSAddFolderService;
import it.eng.auriga.repository2.webservices.addfolder.WSAddFolderServiceLocator;
import it.eng.auriga.repository2.webservices.addfolder.WSAddFolderSoapBindingStub;
import it.eng.auriga.repository2.webservices.addunitadoc.WSAddUd;
import it.eng.auriga.repository2.webservices.addunitadoc.WSAddUdService;
import it.eng.auriga.repository2.webservices.addunitadoc.WSAddUdServiceLocator;
import it.eng.auriga.repository2.webservices.addunitadoc.WSAddUdSoapBindingStub;
import it.eng.auriga.repository2.webservices.extractmulti.WSExtractMulti;
import it.eng.auriga.repository2.webservices.extractmulti.WSExtractMultiService;
import it.eng.auriga.repository2.webservices.extractmulti.WSExtractMultiServiceLocator;
import it.eng.auriga.repository2.webservices.extractmulti.WSExtractMultiSoapBindingStub;
import it.eng.auriga.repository2.webservices.getmetadatafolder.WSGetMetadataFolder;
import it.eng.auriga.repository2.webservices.getmetadatafolder.WSGetMetadataFolderService;
import it.eng.auriga.repository2.webservices.getmetadatafolder.WSGetMetadataFolderServiceLocator;
import it.eng.auriga.repository2.webservices.getmetadatafolder.WSGetMetadataFolderSoapBindingStub;
import it.eng.auriga.repository2.webservices.getmetadataud.WSGetMetadataUd;
import it.eng.auriga.repository2.webservices.getmetadataud.WSGetMetadataUdService;
import it.eng.auriga.repository2.webservices.getmetadataud.WSGetMetadataUdServiceLocator;
import it.eng.auriga.repository2.webservices.getmetadataud.WSGetMetadataUdSoapBindingStub;
import it.eng.auriga.repository2.webservices.trovadocfolder.WSTrovaDocFolder;
import it.eng.auriga.repository2.webservices.trovadocfolder.WSTrovaDocFolderService;
import it.eng.auriga.repository2.webservices.trovadocfolder.WSTrovaDocFolderServiceLocator;
import it.eng.auriga.repository2.webservices.trovadocfolder.WSTrovaDocFolderSoapBindingStub;
import it.engineering.documentale.xsd.baseoutput_ws.BaseOutputWS;
import it.engineering.documentale.xsd.estermixidentificazioneud.EstremiXIdentificazioneUD;
import it.engineering.documentale.xsd.newfolder.NewFolder;
import it.engineering.documentale.xsd.newfolder.NewFolder.DatiFolderCustom;
import it.engineering.documentale.xsd.newud.AllegatoUDType;
import it.engineering.documentale.xsd.newud.ClassifFascicoloType;
import it.engineering.documentale.xsd.newud.DestinatarioEsternoType;
import it.engineering.documentale.xsd.newud.EstremiXIdentificazioneFolderNoLibType;
import it.engineering.documentale.xsd.newud.NewUD;
import it.engineering.documentale.xsd.newud.NewUD.CollocazioneClassificazioneUD;
import it.engineering.documentale.xsd.newud.NewUD.DatiEntrata;
import it.engineering.documentale.xsd.newud.NewUD.DatiProduzione;
import it.engineering.documentale.xsd.newud.NewUD.DatiUscita;
import it.engineering.documentale.xsd.newud.SoggettoEsternoType;
import it.engineering.documentale.xsd.newud.UOType;
import it.engineering.documentale.xsd.newud.VersioneElettronicaType;
import it.engineering.documentale.xsd.outputdatifolder.DatiFolder;
import it.engineering.documentale.xsd.outputdatifolder.DatiFolder.Apertura;
import it.engineering.documentale.xsd.outputdatiud.ClassifFascicoloEstesoType;
import it.engineering.documentale.xsd.outputdatiud.DatiUD;
import it.engineering.documentale.xsd.outputfilesud.OutputFilesUD;
import it.engineering.documentale.xsd.outputfilesud.OutputFilesUD.DatiFileEstratto;
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
import it.engineering.documentale.xsd.trovadocfolder.TrovaDocFolder.FiltriPrincipali.CercaInFolder;
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
import it.maggioli.eldasoft.ws.dm.WSDMTipoVoceRubrica;
import it.maggioli.eldasoft.ws.dm.WSDMTrasmissioneIn;
import it.maggioli.eldasoft.ws.dm.WSDMTrasmissioneRes;
import it.maggioli.eldasoft.ws.dm.WSDMVerificaMailRes;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;

import javax.activation.DataHandler;
import javax.mail.util.ByteArrayDataSource;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;
import javax.xml.ws.WebServiceException;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.log4j.Logger;
import org.apache.ws.security.WSSecurityException;
import org.apache.ws.security.util.Base64;
import org.apache.xerces.dom.ElementNSImpl;

/**
 * Manager per la gestione documentale mediante sistema di protocollo
 * ENGINEERINGDOC.
 * 
 */

public class EngineeringDocManager implements IWSDMManager {

  static Logger               logger                              = Logger.getLogger(EngineeringDocManager.class);

  // Informazioni relative al documentale
  static private String       WSADDUD                             = "java:comp/env/ENGINEERINGDOC_WSADDUD";
  static private String       WSGETMETADATAUD                     = "java:comp/env/ENGINEERINGDOC_WSGETMETADATAUD";
  static private String       WSEXTRACTMULTI                      = "java:comp/env/ENGINEERINGDOC_WSEXTRACTMULTI";
  static private String       WSADDFOLDER                         = "java:comp/env/ENGINEERINGDOC_WSADDFOLDER";
  static private String       WSGETMETADATAFOLDER                 = "java:comp/env/ENGINEERINGDOC_WSGETMETADATAFOLDER";
  static private String       WSTROVADOCFOLDER                    = "java:comp/env/ENGINEERINGDOC_WSTROVADOCFOLDER";

  static private String       WSADDUD_URL_NOT_DEFINED             = "WSDM - Gestione documentale: indirizzo servizio di inserimento di una unita' documentaria non definito. ";
  static private String       WSGETMETADATAUD_URL_NOT_DEFINED     = "WSDM - Gestione documentale: indirizzo servizio di estrazione dei metadati di una unita' documentaria non definito. ";
  static private String       WSEXTRACTMULTI_URL_NOT_DEFINED      = "WSDM - Gestione documentale: indirizzo servizio di estrazione di tutti i file relativi ad una unita' documentaria non definito. ";
  static private String       WSADDFOLDER_URL_NOT_DEFINED         = "WSDM - Gestione documentale: indirizzo servizio di creazione di un nuovo folder non definito. ";
  static private String       WSGETMETADATAFOLDER_URL_NOT_DEFINED = "WSDM - Gestione documentale: indirizzo servizio di estrazione dei metadati di un folder non definito. ";
  static private String       WSTROVADOCFOLDER_URL_NOT_DEFINED    = "WSDM - Gestione documentale: indirizzo servizio di ricerca nel repository documentale non definito. ";

  static private String       CODICEAPPLICAZIONE                  = "java:comp/env/ENGINEERINGDOC_CODICEAPPLICAZIONE";
  static private String       ISTANZAAPPLICAZIONE                 = "java:comp/env/ENGINEERINGDOC_ISTANZAAPPLICAZIONE";

  // Documentale - stati per l'oggetto BaseOutputWS
  static private final String WSRESULT_SUCCESS                    = "1";

  // Documentale - tipo provenienza, indica se unità documentaria in entrata
  // (E), uscita (U) o interna (I)
  static public final String  ENG_DOCUMENTALE_IN_ENTRATA          = "E";
  static public final String  ENG_DOCUMENTALE_IN_USCITA           = "U";
  static public final String  ENG_DOCUMENTALE_INTERNO             = "I";

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
    wsdmprotocolloDocumentoRes.setEsito(false);
    wsdmprotocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmprotocolloDocumentoRes;
  }

  @Override
  public WSDMProtocolloDocumentoRes _protocolloLeggi(String username, String password, WSDMLoginAttr loginAttr, Long annoProtocollo,
      String numeroProtocollo) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    wsdmprotocolloDocumentoRes.setEsito(false);
    wsdmprotocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmprotocolloDocumentoRes;
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
  public WSDMProtocolloDocumentoRes _documentoInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {

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
      if (EngineeringDocUtilityControllo.ctrDocumentoInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {

        // Codice applicazione
        String codiceApplicazione = InitialContext.doLookup(CODICEAPPLICAZIONE);

        // Istanza applicazione
        String istanzaApplicazione = InitialContext.doLookup(ISTANZAAPPLICAZIONE);

        // Verifica indirizzi
        String urlWSAddUD = InitialContext.doLookup(WSADDUD);
        if (urlWSAddUD == null || (urlWSAddUD != null && "".equals(urlWSAddUD.trim()))) {
          throw new Exception(WSADDUD_URL_NOT_DEFINED);
        }

        // Servizio
        WSAddUdService addUdService = new WSAddUdServiceLocator();
        WSAddUd addUdPort = addUdService.getWSAddUd(new URL(urlWSAddUD));
        WSAddUdSoapBindingStub addUdStub = (WSAddUdSoapBindingStub) addUdPort;

        NewUD newUD = new NewUD();

        // Oggetto unita' documentaria
        newUD.setOggettoUD(wsdmprotocolloDocumentoIn.getOggetto());

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
        String idFolder = null;
        if (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
          idFolder = wsdmprotocolloDocumentoIn.getFascicolo().getCodiceFascicolo();
          CollocazioneClassificazioneUD collocazioneClassificazioneUD = new CollocazioneClassificazioneUD();
          List<ClassifFascicoloType> listaClassifFascicolo = collocazioneClassificazioneUD.getClassifFascicolo();
          ClassifFascicoloType classifFascicolo = new ClassifFascicoloType();
          EstremiXIdentificazioneFolderNoLibType estremiFolder = new EstremiXIdentificazioneFolderNoLibType();
          estremiFolder.setIdFolder(BigInteger.valueOf(new Long(idFolder)));
          classifFascicolo.setFolderCustom(estremiFolder);
          listaClassifFascicolo.add(classifFascicolo);
          newUD.setCollocazioneClassificazioneUD(collocazioneClassificazioneUD);
        } else if (WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
          String oggettoNuovoFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getOggettoFascicolo();
          String descrizioneNuovoFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getDescrizioneFascicolo();
          WSDMFascicoloIn wsdmNuovoFascicoloIn = new WSDMFascicoloIn();
          wsdmNuovoFascicoloIn.setOggettoFascicolo(oggettoNuovoFascicolo);
          wsdmNuovoFascicoloIn.setDescrizioneFascicolo(descrizioneNuovoFascicolo);
          WSDMFascicoloRes wsdmNuovoFascicoloRes = this._fascicoloInserisci(username, password, loginAttr, wsdmNuovoFascicoloIn);
          if (!wsdmNuovoFascicoloRes.isEsito()) {
            esitoInserimentoFascicolo = false;
            wsdmprotocolloDocumentoRes.setEsito(false);
            wsdmprotocolloDocumentoRes.setMessaggio("L'inserimento del nuovo fascicolo ha restituito il messaggio: "
                + wsdmNuovoFascicoloRes.getMessaggio());
          } else {
            idFolder = wsdmNuovoFascicoloRes.getFascicolo().getCodiceFascicolo();
            CollocazioneClassificazioneUD collocazioneClassificazioneUD = new CollocazioneClassificazioneUD();
            List<ClassifFascicoloType> listaClassifFascicolo = collocazioneClassificazioneUD.getClassifFascicolo();
            ClassifFascicoloType classifFascicolo = new ClassifFascicoloType();
            EstremiXIdentificazioneFolderNoLibType estremiFolder = new EstremiXIdentificazioneFolderNoLibType();
            estremiFolder.setIdFolder(BigInteger.valueOf(new Long(idFolder)));
            classifFascicolo.setFolderCustom(estremiFolder);
            listaClassifFascicolo.add(classifFascicolo);
            newUD.setCollocazioneClassificazioneUD(collocazioneClassificazioneUD);
          }
        }

        if (esitoInserimentoFascicolo == true) {

          // Documento in entrata
          // Valorizzare i dati di acquisizione "DatiEntrata" con i mittenti
          // esterni
          this._documentoInserisciIN(wsdmprotocolloDocumentoIn, newUD);

          // Documento interno (tra uffici)
          // Valorizzare "DatiEntrata" con l'identificativo dell'unita'
          // organizzativa destinataria (ricezione)
          this._documentoInserisciINT(wsdmprotocolloDocumentoIn, newUD);

          // Documento in uscita
          // Valorizzare "DatiUscita" con i destinatari esterni e l'ufficio di
          // spedizione con l'identificativo mittente
          // Valorizzare "DatiProduzione" con l'identificativo dell'unita'
          // organizzativa mittente (produttore)
          this._documentoInserisciOUT(wsdmprotocolloDocumentoIn, newUD);

          // Allegati. Gli allegati devono essere gestiti in "attach".
          // All'interno dell'XML di richiesta deve essere indicato il numero di
          // attach.
          this._documentoInserisciAggiungiAllegati(wsdmprotocolloDocumentoIn, addUdStub, newUD);

          // Conversione in stringa XML
          StringWriter xmlNewUDStringWriter = new StringWriter();
          JAXBContext jaxbLocalContext = JAXBContext.newInstance(NewUD.class);
          jaxbLocalContext.createMarshaller().marshal(newUD, xmlNewUDStringWriter);
          String xmlNewUDInput = xmlNewUDStringWriter.toString();

          // XML Hash
          byte[] xmlNewUDHash = DigestUtils.sha(xmlNewUDInput);
          String xmlNewUDHashBase64 = Base64.encode(xmlNewUDHash);

          // Log della richiesta
          if (logger.isDebugEnabled()) logger.debug("Richiesta inserimento documento: " + xmlNewUDInput);

          String baseOutputAddUdBase = addUdPort.service(codiceApplicazione, istanzaApplicazione, username, password, xmlNewUDInput,
              xmlNewUDHashBase64);
          String baseOutputAddUdXML = new String(Base64.decode(baseOutputAddUdBase));
          BaseOutputWS baseOutputAddUd = this.getBaseOutputWSFromXML(baseOutputAddUdXML);

          if (WSRESULT_SUCCESS.equals(baseOutputAddUd.getWSResult())) {

            WSDMProtocolloDocumento wsdmprotocolloDocumento = new WSDMProtocolloDocumento();

            Object[] attachmentsAddUd = addUdStub.getAttachments();
            if (attachmentsAddUd != null) {
              if (attachmentsAddUd.length > 0) {
                for (int i = 0; i < attachmentsAddUd.length; i++) {
                  // Il primo allegato contiene il file XML descritto da
                  // OutputUD
                  if (i == 0) {
                    org.apache.axis.attachments.AttachmentPart attachPart = (org.apache.axis.attachments.AttachmentPart) attachmentsAddUd[i];
                    DataHandler handler = attachPart.getDataHandler();
                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    handler.writeTo(baos);
                    String datiOutputUDXML = baos.toString();
                    OutputUD outputUD = this.getOutputUDFromXML(datiOutputUDXML);
                    wsdmprotocolloDocumento.setNumeroDocumento(String.valueOf(outputUD.getIdUD()));
                    wsdmprotocolloDocumento.setAnnoProtocollo(null);
                    wsdmprotocolloDocumento.setNumeroProtocollo(null);
                  }
                }
              }
            }

            if (idFolder != null) {
              WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();
              wsdmFascicolo.setAnnoFascicolo(null);
              wsdmFascicolo.setNumeroFascicolo(null);
              wsdmFascicolo.setCodiceFascicolo(idFolder);
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

          // Log della risposta
          if (logger.isDebugEnabled()) logger.debug("Risposta inserimento documento: " + baseOutputAddUdXML);
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
   * Gestione dei dati per unita' documentari in ingresso (IN).
   * 
   * @param wsdmprotocolloDocumentoIn
   * @param newUD
   */
  private void _documentoInserisciIN(WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn, NewUD newUD) {
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
      // Ufficio ricezione
      if (wsdmprotocolloDocumentoIn.getIdUnitaOperativaDestinataria() != null) {
        UOType uoDestinataria = new UOType();
        uoDestinataria.setIdUO(BigInteger.valueOf(new Long(wsdmprotocolloDocumentoIn.getIdUnitaOperativaDestinataria())));
        datiEntrata.setUffRicezione(uoDestinataria);
        newUD.setDatiEntrata(datiEntrata);
      }
    }
  }

  /**
   * Gestione dei dati per unita' documentarie tra uffici (INT).
   * 
   * @param wsdmprotocolloDocumentoIn
   * @param newUD
   */
  private void _documentoInserisciINT(WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn, NewUD newUD) {
    if (WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {

      if (wsdmprotocolloDocumentoIn.getIdUnitaOperativaDestinataria() != null) {
        UOType uoDestinataria = new UOType();
        uoDestinataria.setIdUO(BigInteger.valueOf(new Long(wsdmprotocolloDocumentoIn.getIdUnitaOperativaDestinataria())));
        DatiEntrata datiEntrata = new DatiEntrata();
        datiEntrata.setUffRicezione(uoDestinataria);
        newUD.setDatiEntrata(datiEntrata);
      }

    }
  }

  /**
   * Gestione dei dati per unita' documentarie in uscita (OUT).
   * 
   * @param wsdmprotocolloDocumentoIn
   * @param newUD
   */
  private void _documentoInserisciOUT(WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn, NewUD newUD) {
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

      if (wsdmprotocolloDocumentoIn.getIdUnitaOperativaMittente() != null) {
        // Mittente
        UOType uoMittente = new UOType();
        uoMittente.setIdUO(BigInteger.valueOf(new Long(wsdmprotocolloDocumentoIn.getIdUnitaOperativaMittente())));

        // Identificativo ufficio di spedizione in "DatiUscita"
        newUD.getDatiUscita().setUffSpedizione(uoMittente);

        // Identificativo dell'unita' operativo del produttore
        DatiProduzione datiProduzione = new DatiProduzione();
        List<UOType> listaUffProduttore = datiProduzione.getUffProduttore();
        listaUffProduttore.add(uoMittente);
        newUD.setDatiProduzione(datiProduzione);
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
  private void _documentoInserisciAggiungiAllegati(WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn, WSAddUdSoapBindingStub addUdStub,
      NewUD newUD) {
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
        DataHandler attachPart = new DataHandler(new ByteArrayDataSource(allegati[ai].getContenuto(), "application/octet-stream"));
        addUdStub.addAttachment(attachPart);
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

    try {

      StringBuffer messaggioCtr = new StringBuffer();
      if (EngineeringDocUtilityControllo.ctrDocumentoLeggi(loginAttr, numeroDocumento, messaggioCtr)) {
        wsdmprotocolloDocumentoRes = this.getMetadataUDExtractMulti(username, password, numeroDocumento, true);
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

    try {

      StringBuffer messaggioCtr = new StringBuffer();
      if (EngineeringDocUtilityControllo.ctrDocumentoLeggi(loginAttr, numeroDocumento, messaggioCtr)) {
        wsdmprotocolloDocumentoRes = this.getMetadataUDExtractMulti(username, password, numeroDocumento, false);
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
  private WSDMProtocolloDocumentoRes getMetadataUDExtractMulti(String username, String password, String numeroDocumento,
      boolean extractMulti) throws NamingException, JAXBException, Exception, ServiceException, MalformedURLException, RemoteException,
      WSSecurityException, SOAPException, IOException {

    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    // Codice applicazione
    String codiceApplicazione = InitialContext.doLookup(CODICEAPPLICAZIONE);

    // Istanza applicazione
    String istanzaApplicazione = InitialContext.doLookup(ISTANZAAPPLICAZIONE);

    // Identificazione unita' documentaria
    EstremiXIdentificazioneUD estremiUD = new EstremiXIdentificazioneUD();
    estremiUD.setIdUD(new BigInteger(numeroDocumento));

    // Conversione in stringa XML
    StringWriter xmlEstremiUDStringWriter = new StringWriter();
    JAXBContext jaxbLocalContext = JAXBContext.newInstance(EstremiXIdentificazioneUD.class);
    jaxbLocalContext.createMarshaller().marshal(estremiUD, xmlEstremiUDStringWriter);
    String xmlEstremiUDInput = xmlEstremiUDStringWriter.toString();

    // XML Hash
    byte[] xmlEstremiUDHash = DigestUtils.sha(xmlEstremiUDInput);
    String xmlEstremiUDHashBase64 = Base64.encode(xmlEstremiUDHash);

    // Log della richiesta
    if (logger.isDebugEnabled()) logger.debug("Richiesta lettura documento: " + xmlEstremiUDInput);

    // Verifica indirizzi per lettura metadati e estrazione file allegati
    String urlWsGetMetadataUd = InitialContext.doLookup(WSGETMETADATAUD);
    if (urlWsGetMetadataUd == null || (urlWsGetMetadataUd != null && "".equals(urlWsGetMetadataUd.trim()))) {
      throw new Exception(WSGETMETADATAUD_URL_NOT_DEFINED);
    }
    WSGetMetadataUdService getMetadataUdservice = new WSGetMetadataUdServiceLocator();
    WSGetMetadataUd getMetadataUdport = getMetadataUdservice.getWSGetMetadataUd(new URL(urlWsGetMetadataUd));

    String urlExtractMulti = InitialContext.doLookup(WSEXTRACTMULTI);
    if (urlExtractMulti == null || (urlExtractMulti != null && "".equals(urlExtractMulti.trim()))) {
      throw new Exception(WSEXTRACTMULTI_URL_NOT_DEFINED);
    }
    WSExtractMultiService extractMultiService = new WSExtractMultiServiceLocator();
    WSExtractMulti extractMultiPort = extractMultiService.getWSExtractMulti(new URL(urlExtractMulti));

    // Il file XML in input con gli estremi per individuare l'unita'
    // documentaria di cui estrarre i metadati ha come root element
    // l’elemento EstremiXIdentificazioneUD riportato nell'XSD
    // EstremiXIdentificazioneUD.xsd allegato a questo documento. L'output
    // del Web Service e' un file XML con tracciato come in allegato
    // BaseOutput_WS.xsd. In output e' presente, in caso di successo, un
    // unico attachment XML (tracciato in allegato Output_DatiUD.xsd) che
    // contiene i metadati dell'unità documentaria. I metadati relativi a
    // tag non presenti sono metadati non valorizzati in DB.
    String baseOutputMetadataUdBase = getMetadataUdport.service(codiceApplicazione, istanzaApplicazione, username, password,
        xmlEstremiUDInput, xmlEstremiUDHashBase64);
    String baseOutputMetadataUdXML = new String(Base64.decode(baseOutputMetadataUdBase));
    BaseOutputWS baseOutputMetadataUd = this.getBaseOutputWSFromXML(baseOutputMetadataUdXML);

    if (WSRESULT_SUCCESS.equals(baseOutputMetadataUd.getWSResult())) {

      WSGetMetadataUdSoapBindingStub getMetadataUdStub = (WSGetMetadataUdSoapBindingStub) getMetadataUdport;
      Object[] attachmentsMetadataUd = getMetadataUdStub.getAttachments();

      WSDMProtocolloDocumento wsdmprotocolloDocumento = new WSDMProtocolloDocumento();

      if (attachmentsMetadataUd != null) {
        if (attachmentsMetadataUd.length > 0) {
          for (int i = 0; i < attachmentsMetadataUd.length; i++) {
            // Il primo allegato contiene il file XML descritto da
            // "Output_DatiUD.xsd"
            if (i == 0) {
              org.apache.axis.attachments.AttachmentPart attachPart = (org.apache.axis.attachments.AttachmentPart) attachmentsMetadataUd[i];
              DataHandler handler = attachPart.getDataHandler();
              ByteArrayOutputStream baos = new ByteArrayOutputStream();
              handler.writeTo(baos);
              String datiUDXML = baos.toString();
              DatiUD datiUD = this.getDatiUDFromXML(datiUDXML);

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
            }

            wsdmprotocolloDocumentoRes.setEsito(true);
            wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmprotocolloDocumento);

          }
        }
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
        String baseOutputExtractMultiBase = extractMultiPort.service(codiceApplicazione, istanzaApplicazione, username, password,
            xmlEstremiUDInput, xmlEstremiUDHashBase64);
        String baseOutputExtractMultiXML = new String(Base64.decode(baseOutputExtractMultiBase));
        BaseOutputWS baseOutputExtractMulti = this.getBaseOutputWSFromXML(baseOutputExtractMultiXML);

        if (WSRESULT_SUCCESS.equals(baseOutputExtractMulti.getWSResult())) {
          WSExtractMultiSoapBindingStub extractMultiStub = (WSExtractMultiSoapBindingStub) extractMultiPort;
          Object[] attachmentsExtractMulti = extractMultiStub.getAttachments();
          if (attachmentsExtractMulti != null) {
            if (attachmentsExtractMulti.length > 0) {
              for (int iEM = 0; iEM < attachmentsExtractMulti.length; iEM++) {
                if (iEM == 0) {
                  // Il primo attachment contiene il file XML di tipo
                  // "OutputFilesUD"
                  // con la lista ed i metadati dei file allegati.
                  // I file allegati sono memorizzati dal secondo attachment
                  // in
                  // poi.
                  org.apache.axis.attachments.AttachmentPart attachPartOutputFilesUD = (org.apache.axis.attachments.AttachmentPart) attachmentsExtractMulti[iEM];
                  DataHandler handlerOutputFilesUD = attachPartOutputFilesUD.getDataHandler();
                  ByteArrayOutputStream baosOutputFilesUD = new ByteArrayOutputStream();
                  handlerOutputFilesUD.writeTo(baosOutputFilesUD);
                  String outputFilesUDXML = baosOutputFilesUD.toString();
                  OutputFilesUD outputFilesUD = this.getOutputFilesUDFromXML(outputFilesUDXML);
                  List<DatiFileEstratto> datiFilesEstratti = outputFilesUD.getDatiFileEstratto();

                  if (!datiFilesEstratti.isEmpty() && datiFilesEstratti.size() > 0) {
                    WSDMProtocolloAllegato[] allegati = new WSDMProtocolloAllegato[datiFilesEstratti.size()];
                    for (int iFE = 0; iFE < datiFilesEstratti.size(); iFE++) {

                      DatiFileEstratto datiFE = datiFilesEstratti.get(iFE);
                      // String nomeFile = "";
                      // ElementNSImpl datiFENomeFile = (ElementNSImpl) datiFE.getNomeFile();
                      // if (datiFENomeFile != null) nomeFile = datiFENomeFile.getTextContent();
                      String nomeFile = datiFE.getNomeFile();
                      String datiFEDesOggetto = datiFE.getDesOggetto();
                      BigInteger datiFENroAttachment = datiFE.getNroAttachment();

                      // Lettura del attachment
                      // Al numero di attachment bisogna togliere "1" perche'
                      // la
                      // numerazione degli attachment inizia da "0"
                      org.apache.axis.attachments.AttachmentPart attachPartAllegato = (org.apache.axis.attachments.AttachmentPart) attachmentsExtractMulti[datiFENroAttachment.intValue() - 1];
                      DataHandler handlerAllegato = attachPartAllegato.getDataHandler();
                      ByteArrayOutputStream baosAllegato = new ByteArrayOutputStream();
                      handlerAllegato.writeTo(baosAllegato);

                      allegati[iFE] = new WSDMProtocolloAllegato();
                      allegati[iFE].setContenuto(baosAllegato.toByteArray());
                      allegati[iFE].setNome(nomeFile);
                      allegati[iFE].setIDBase(new Long(datiFENroAttachment.longValue()));
                      allegati[iFE].setTitolo(datiFEDesOggetto);
                    }
                    wsdmprotocolloDocumento.setAllegati(allegati);
                  }
                }
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

    if (logger.isDebugEnabled()) logger.debug("Risposta lettura documento: " + baseOutputMetadataUdXML);

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

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (EngineeringDocUtilityControllo.ctrFascicoloInserisci(loginAttr, wsdmfascicoloIn, messaggioCtr)) {

        // Codice applicazione
        String codiceApplicazione = InitialContext.doLookup(CODICEAPPLICAZIONE);

        // Istanza applicazione
        String istanzaApplicazione = InitialContext.doLookup(ISTANZAAPPLICAZIONE);

        // Dati del nuovo folder
        NewFolder newFolder = new NewFolder();
        newFolder.setOggetto(wsdmfascicoloIn.getOggettoFascicolo());
        if (wsdmfascicoloIn.getDescrizioneFascicolo() != null) {
          newFolder.setNote(wsdmfascicoloIn.getDescrizioneFascicolo());
        }
        DatiFolderCustom datiFolderCustom = new DatiFolderCustom();
        datiFolderCustom.setNomeFolder(wsdmfascicoloIn.getOggettoFascicolo());
        newFolder.setDatiFolderCustom(datiFolderCustom);

        // Conversione in stringa XML
        StringWriter xmlNewFolderStringWriter = new StringWriter();
        JAXBContext jaxbLocalContext = JAXBContext.newInstance(NewFolder.class);
        jaxbLocalContext.createMarshaller().marshal(newFolder, xmlNewFolderStringWriter);
        String xmlNewFolderInput = xmlNewFolderStringWriter.toString();

        // XML Hash
        byte[] xmlNewFolderHash = DigestUtils.sha(xmlNewFolderInput);
        String xmlNewFolderHashBase64 = Base64.encode(xmlNewFolderHash);

        // Log della richiesta
        if (logger.isDebugEnabled()) logger.debug("Richiesta inserimento fascicolo: " + xmlNewFolderInput);

        // Verifica degli indirizzi
        String urlWsAddFolder = InitialContext.doLookup(WSADDFOLDER);
        if (urlWsAddFolder == null || (urlWsAddFolder != null && "".equals(urlWsAddFolder.trim()))) {
          throw new Exception(WSADDFOLDER_URL_NOT_DEFINED);
        }

        WSAddFolderService wsAddFolderService = new WSAddFolderServiceLocator();
        WSAddFolder wsAddFolderPort = wsAddFolderService.getWSAddFolder(new URL(urlWsAddFolder));
        String baseOutputAddFolderBase64 = wsAddFolderPort.service(codiceApplicazione, istanzaApplicazione, username, password,
            xmlNewFolderInput, xmlNewFolderHashBase64);
        String baseOutputAddFolderXML = new String(Base64.decode(baseOutputAddFolderBase64));
        BaseOutputWS baseOutputAddFolder = this.getBaseOutputWSFromXML(baseOutputAddFolderXML);

        if (WSRESULT_SUCCESS.equals(baseOutputAddFolder.getWSResult())) {
          WSAddFolderSoapBindingStub wsAddFolderStud = (WSAddFolderSoapBindingStub) wsAddFolderPort;
          Object[] attachmentAddFolder = wsAddFolderStud.getAttachments();

          WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();

          if (attachmentAddFolder != null) {
            if (attachmentAddFolder.length > 0) {
              for (int i = 0; i < attachmentAddFolder.length; i++) {
                // Il primo allegato contiene il file XML descritto da con il
                // solo attributo IdFolder
                if (i == 0) {
                  org.apache.axis.attachments.AttachmentPart attachPart = (org.apache.axis.attachments.AttachmentPart) attachmentAddFolder[i];
                  DataHandler handler = attachPart.getDataHandler();
                  ByteArrayOutputStream baos = new ByteArrayOutputStream();
                  handler.writeTo(baos);
                  String addFolderXML = baos.toString();
                  int idfolder_i = addFolderXML.indexOf("<IdFolder>");
                  int idfolder_f = addFolderXML.indexOf("</IdFolder>");
                  int idfolder_i_len = ("<IdFolder>").length();
                  String idFolder = addFolderXML.substring(idfolder_i + idfolder_i_len, idfolder_f);
                  wsdmFascicolo.setCodiceFascicolo(idFolder);
                }
                wsdmFascicoloRes.setEsito(true);
                wsdmFascicoloRes.setFascicolo(wsdmFascicolo);
              }
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

  @Override
  public WSDMFascicoloRes _fascicoloLeggi(String username, String password, WSDMLoginAttr loginAttr, String codiceFascicolo,
      Long annoFascicolo, String numeroFascicolo, String classificaFascicolo) {

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
      if (EngineeringDocUtilityControllo.ctrFascicoloLeggi(loginAttr, codiceFascicolo, annoFascicolo, numeroFascicolo, messaggioCtr)) {

        // Codice applicazione
        String codiceApplicazione = InitialContext.doLookup(CODICEAPPLICAZIONE);

        // Istanza applicazione
        String istanzaApplicazione = InitialContext.doLookup(ISTANZAAPPLICAZIONE);

        // Identificazione folder
        String xmlEstremiFolderInput = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><EstremiXIdentificazioneFolder><IdFolder>"
            + codiceFascicolo
            + "</IdFolder></EstremiXIdentificazioneFolder>";

        // XML Hash
        byte[] xmlEstremiFolderHash = DigestUtils.sha(xmlEstremiFolderInput);
        String xmlEstremiFolderHashBase64 = Base64.encode(xmlEstremiFolderHash);

        // Log della richiesta
        if (logger.isDebugEnabled()) logger.debug("Richiesta lettura fascicolo/folder: " + xmlEstremiFolderInput);

        // Verifica indirizzi e gestione servizi per lettura metadati del
        // folder/fascicolo e ricerca documenti
        String urlWsGetMetadataFolder = InitialContext.doLookup(WSGETMETADATAFOLDER);
        if (urlWsGetMetadataFolder == null || (urlWsGetMetadataFolder != null && "".equals(urlWsGetMetadataFolder.trim()))) {
          throw new Exception(WSGETMETADATAFOLDER_URL_NOT_DEFINED);
        }

        WSGetMetadataFolderService getMetadataFolderService = new WSGetMetadataFolderServiceLocator();
        WSGetMetadataFolder getMetadataFolderPort = getMetadataFolderService.getWSGetMetadataFolder(new URL(urlWsGetMetadataFolder));

        String urlWsTrovaDocFolder = InitialContext.doLookup(WSTROVADOCFOLDER);
        if (urlWsTrovaDocFolder == null || (urlWsTrovaDocFolder != null && "".equals(urlWsTrovaDocFolder.trim()))) {
          throw new Exception(WSTROVADOCFOLDER_URL_NOT_DEFINED);
        }

        WSTrovaDocFolderService wsTrovaDocService = new WSTrovaDocFolderServiceLocator();
        WSTrovaDocFolder wsTrovaDocFolderPort = wsTrovaDocService.getWSTrovaDocFolder(new URL(urlWsTrovaDocFolder));

        // Lettura dei metadati del folder/fascicolo
        String baseOutputMetadataFolderBase64 = getMetadataFolderPort.service(codiceApplicazione, istanzaApplicazione, username, password,
            xmlEstremiFolderInput, xmlEstremiFolderHashBase64);
        String baseOutputMetadataFolderXML = new String(Base64.decode(baseOutputMetadataFolderBase64));
        BaseOutputWS baseOutputMetadataFolder = this.getBaseOutputWSFromXML(baseOutputMetadataFolderXML);

        if (WSRESULT_SUCCESS.equals(baseOutputMetadataFolder.getWSResult())) {

          WSGetMetadataFolderSoapBindingStub getMetadataFolderStub = (WSGetMetadataFolderSoapBindingStub) getMetadataFolderPort;
          Object[] attachmentMetadataFolder = getMetadataFolderStub.getAttachments();

          WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();

          if (attachmentMetadataFolder != null && attachmentMetadataFolder.length > 0) {
            org.apache.axis.attachments.AttachmentPart attachPart = (org.apache.axis.attachments.AttachmentPart) attachmentMetadataFolder[0];
            DataHandler handler = attachPart.getDataHandler();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            handler.writeTo(baos);
            String datiFolderXML = baos.toString();
            DatiFolder datiFolder = this.getDatiFolderFromXML(datiFolderXML);

            // Nome ed oggetto
            String oggetto = "";
            String nomeFolder = datiFolder.getNomeFolder();
            String oggettoFolder = datiFolder.getOggetto();
            if (nomeFolder != null) oggetto = nomeFolder;
            if (!nomeFolder.equals(oggettoFolder) && oggettoFolder != null && !"".equals(oggettoFolder.trim())) {
              if ("".equals(oggetto)) {
                oggetto = oggettoFolder;
              } else {
                oggetto += " - " + oggettoFolder;
              }
            }

            wsdmFascicolo.setAnnoFascicolo(null);
            wsdmFascicolo.setNumeroFascicolo(null);
            wsdmFascicolo.setCodiceFascicolo(codiceFascicolo);
            wsdmFascicolo.setOggettoFascicolo(oggetto);

            Apertura aperturaFolder = datiFolder.getApertura();
            if (aperturaFolder != null) {
              wsdmFascicolo.setDataFascicolo(aperturaFolder.getDataOra().toGregorianCalendar().getTime());
            }
            wsdmFascicolo.setDescrizioneFascicolo(datiFolder.getNote());

            wsdmFascicoloRes.setEsito(true);
            wsdmFascicoloRes.setFascicolo(wsdmFascicolo);

          }

          // Ricerca delle unita' documentarie contenute nel folder/fascicolo
          TrovaDocFolder trovaDocFolder = new TrovaDocFolder();
          CercaInFolder cercaInFolder = new CercaInFolder();
          cercaInFolder.setIdFolder(BigInteger.valueOf(new Long(codiceFascicolo)));
          cercaInFolder.setIncludiSubFolder("0");
          FiltriPrincipali filtriPrincipali = new FiltriPrincipali();
          filtriPrincipali.setTipoOggettiDaCercare("D");
          filtriPrincipali.setCercaInFolder(cercaInFolder);
          trovaDocFolder.setFiltriPrincipali(filtriPrincipali);

          // Conversione in stringa XML
          StringWriter xmlTrovaDocFolderStringWriter = new StringWriter();
          JAXBContext jaxbLocalContext = JAXBContext.newInstance(TrovaDocFolder.class);
          jaxbLocalContext.createMarshaller().marshal(trovaDocFolder, xmlTrovaDocFolderStringWriter);
          String xmlTrovaDocFolderInput = xmlTrovaDocFolderStringWriter.toString();

          // XML Hash
          byte[] xmlTrovaDocFolderHash = DigestUtils.sha(xmlTrovaDocFolderInput);
          String xmlTrovaDocFolderHashBase64 = Base64.encode(xmlTrovaDocFolderHash);

          // Log della richiesta
          if (logger.isDebugEnabled()) logger.debug("Richiesta lettura documento: " + xmlTrovaDocFolderInput);

          String baseOutputTrovaDocFolderBase64 = wsTrovaDocFolderPort.service(codiceApplicazione, istanzaApplicazione, username, password,
              xmlTrovaDocFolderInput, xmlTrovaDocFolderHashBase64);
          String baseOutputTrovaDocFolderXML = new String(Base64.decode(baseOutputTrovaDocFolderBase64));
          BaseOutputWS baseOutputTrovaDocFolder = this.getBaseOutputWSFromXML(baseOutputTrovaDocFolderXML);

          if (WSRESULT_SUCCESS.equals(baseOutputTrovaDocFolder.getWSResult())) {

            WSTrovaDocFolderSoapBindingStub wsTrovaDocFolderStub = (WSTrovaDocFolderSoapBindingStub) wsTrovaDocFolderPort;
            Object[] attachmentDocFolder = wsTrovaDocFolderStub.getAttachments();

            if (attachmentDocFolder != null && attachmentDocFolder.length > 0) {
              org.apache.axis.attachments.AttachmentPart attachPart = (org.apache.axis.attachments.AttachmentPart) attachmentDocFolder[0];
              DataHandler handler = attachPart.getDataHandler();
              ByteArrayOutputStream baos = new ByteArrayOutputStream();
              handler.writeTo(baos);
              String searchOutputSTDXML = baos.toString();
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
                    // Nro 2 Identificativo dell'unita' documentaria o folder
                    // Nro 3 Nome dell'unità documentaria o folder
                    // Nro 20 Tipo di provenienza dell'unità documentaria: E =
                    // in Entrata, U = in Uscita, I = tra uffici
                    if (nro.intValue() == 1) flag_FU = colonna.getContent();
                    if (nro.intValue() == 2) id_ud = colonna.getContent();
                    if (nro.intValue() == 3) oggetto_ud = colonna.getContent();
                    if (nro.intValue() == 20) provenienza_ud = colonna.getContent();
                  }

                  if ("U".equals(flag_FU)) {
                    wsdmFascicoloDocumento[r].setNumeroDocumento(id_ud);
                    wsdmFascicoloDocumento[r].setOggetto(oggetto_ud);

                    if (ENG_DOCUMENTALE_IN_ENTRATA.equals(provenienza_ud)) {
                      wsdmFascicoloDocumento[r].setInout(WSDMProtocolloInOut.IN);
                    } else if (ENG_DOCUMENTALE_IN_USCITA.equals(provenienza_ud)) {
                      wsdmFascicoloDocumento[r].setInout(WSDMProtocolloInOut.OUT);
                    } else if (ENG_DOCUMENTALE_INTERNO.equals(provenienza_ud)) {
                      wsdmFascicoloDocumento[r].setInout(WSDMProtocolloInOut.INT);
                    }
                  }

                }

                wsdmFascicoloRes.getFascicolo().setDocumenti(wsdmFascicoloDocumento);

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

        // Log della risposta
        if (logger.isDebugEnabled()) logger.debug("Risposta lettura fascicolo/folder: " + baseOutputMetadataFolderXML);
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
  public WSDMFascicoloRes _fascicoloMetadatiLeggi(String username, String password, WSDMLoginAttr loginAttr, String codiceFascicolo,
      Long annoFascicolo, String numeroFascicolo, String classificaFascicolo) {
    return _fascicoloLeggi(username, password, loginAttr, codiceFascicolo, annoFascicolo, numeroFascicolo, classificaFascicolo);
  }

  @Override
  public WSDMProtocolloDocumentoRes _attoContrattoLeggi(String username, String password, WSDMLoginAttr loginAttr, String tipo,
      String organo, Long anno, String numero) {
    WSDMProtocolloDocumentoRes wsdmProtocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    try {

      StringBuffer messaggioCtr = new StringBuffer();
      if (EngineeringDocUtilityControllo.ctrAttoLeggi(loginAttr, tipo, organo, anno, numero, messaggioCtr)) {

        // Codice applicazione
        String codiceApplicazione = InitialContext.doLookup(CODICEAPPLICAZIONE);

        // Istanza applicazione
        String istanzaApplicazione = InitialContext.doLookup(ISTANZAAPPLICAZIONE);

        // Verifica indirizzi e gestione servizi per la ricerca documenti
        String urlWsTrovaDocFolder = InitialContext.doLookup(WSTROVADOCFOLDER);
        if (urlWsTrovaDocFolder == null || (urlWsTrovaDocFolder != null && "".equals(urlWsTrovaDocFolder.trim()))) {
          throw new Exception(WSTROVADOCFOLDER_URL_NOT_DEFINED);
        }
        WSTrovaDocFolderService wsTrovaDocService = new WSTrovaDocFolderServiceLocator();
        WSTrovaDocFolder wsTrovaDocFolderPort = wsTrovaDocService.getWSTrovaDocFolder(new URL(urlWsTrovaDocFolder));

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
        byte[] xmlTrovaDocFolderHash = DigestUtils.sha(xmlTrovaDocFolderInput);
        String xmlTrovaDocFolderHashBase64 = Base64.encode(xmlTrovaDocFolderHash);

        // Log della richiesta
        if (logger.isDebugEnabled()) logger.debug("Richiesta lettura atto/contratto: " + xmlTrovaDocFolderInput);

        String baseOutputTrovaDocFolderBase64 = wsTrovaDocFolderPort.service(codiceApplicazione, istanzaApplicazione, username, password,
            xmlTrovaDocFolderInput, xmlTrovaDocFolderHashBase64);
        String baseOutputTrovaDocFolderXML = new String(Base64.decode(baseOutputTrovaDocFolderBase64));
        BaseOutputWS baseOutputTrovaDocFolder = this.getBaseOutputWSFromXML(baseOutputTrovaDocFolderXML);

        if (WSRESULT_SUCCESS.equals(baseOutputTrovaDocFolder.getWSResult())) {

          WSTrovaDocFolderSoapBindingStub wsTrovaDocFolderStub = (WSTrovaDocFolderSoapBindingStub) wsTrovaDocFolderPort;
          Object[] attachmentDocFolder = wsTrovaDocFolderStub.getAttachments();

          if (attachmentDocFolder != null && attachmentDocFolder.length > 0) {
            org.apache.axis.attachments.AttachmentPart attachPart = (org.apache.axis.attachments.AttachmentPart) attachmentDocFolder[0];
            DataHandler handler = attachPart.getDataHandler();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            handler.writeTo(baos);
            String searchOutputSTDXML = baos.toString();
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
                wsdmProtocolloDocumentoRes = this.getMetadataUDExtractMulti(username, password, numeroDocumento, true);
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

    WSDMAttoContrattoRes wsdmAttoContrattoRes = new WSDMAttoContrattoRes();

    try {
      // Codice applicazione
      String codiceApplicazione = InitialContext.doLookup(CODICEAPPLICAZIONE);

      // Istanza applicazione
      String istanzaApplicazione = InitialContext.doLookup(ISTANZAAPPLICAZIONE);

      // Verifica indirizzi e gestione servizi per la ricerca documenti
      String urlWsTrovaDocFolder = InitialContext.doLookup(WSTROVADOCFOLDER);
      if (urlWsTrovaDocFolder == null || (urlWsTrovaDocFolder != null && "".equals(urlWsTrovaDocFolder.trim()))) {
        throw new Exception(WSTROVADOCFOLDER_URL_NOT_DEFINED);
      }
      WSTrovaDocFolderService wsTrovaDocService = new WSTrovaDocFolderServiceLocator();
      WSTrovaDocFolder wsTrovaDocFolderPort = wsTrovaDocService.getWSTrovaDocFolder(new URL(urlWsTrovaDocFolder));

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
      byte[] xmlTrovaDocFolderHash = DigestUtils.sha(xmlTrovaDocFolderInput);
      String xmlTrovaDocFolderHashBase64 = Base64.encode(xmlTrovaDocFolderHash);

      // Log della richiesta
      if (logger.isDebugEnabled()) logger.debug("Richiesta ricerca atto/contratto: " + xmlTrovaDocFolderInput);

      String baseOutputTrovaDocFolderBase64 = wsTrovaDocFolderPort.service(codiceApplicazione, istanzaApplicazione, username, password,
          xmlTrovaDocFolderInput, xmlTrovaDocFolderHashBase64);
      String baseOutputTrovaDocFolderXML = new String(Base64.decode(baseOutputTrovaDocFolderBase64));
      BaseOutputWS baseOutputTrovaDocFolder = this.getBaseOutputWSFromXML(baseOutputTrovaDocFolderXML);

      if (WSRESULT_SUCCESS.equals(baseOutputTrovaDocFolder.getWSResult())) {

        WSTrovaDocFolderSoapBindingStub wsTrovaDocFolderStub = (WSTrovaDocFolderSoapBindingStub) wsTrovaDocFolderPort;
        Object[] attachmentDocFolder = wsTrovaDocFolderStub.getAttachments();

        if (attachmentDocFolder != null && attachmentDocFolder.length > 0) {
          org.apache.axis.attachments.AttachmentPart attachPart = (org.apache.axis.attachments.AttachmentPart) attachmentDocFolder[0];
          DataHandler handler = attachPart.getDataHandler();
          ByteArrayOutputStream baos = new ByteArrayOutputStream();
          handler.writeTo(baos);
          String searchOutputSTDXML = baos.toString();
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
  public WSDMListaAccountEmailRes _listaAccountEmail(String username, String password, WSDMLoginAttr loginAttr, WSDMRicercaAccountEmail ricercaAccountEmail) {
    WSDMListaAccountEmailRes wsdmListaAccountEmailRes = new WSDMListaAccountEmailRes();
    wsdmListaAccountEmailRes.setEsito(false);
    wsdmListaAccountEmailRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmListaAccountEmailRes;
  }
  
  
}
