package it.maggioli.eldasoft.bl.datagraph;

import java.io.StringWriter;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.axis.encoding.Base64;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.message.Message;
import org.apache.log4j.Logger;

import it.datagraph.AOO;
import it.datagraph.Allegati;
import it.datagraph.Amministrazione;
import it.datagraph.ApplicativoProtocollo;
import it.datagraph.ArrayOfSegnatura;
import it.datagraph.ArrayOfVoceTitolario;
import it.datagraph.Classifica;
import it.datagraph.DOCAREAproto;
import it.datagraph.DOCAREAprotoSoap;
import it.datagraph.Descrizione;
import it.datagraph.Destinatario;
import it.datagraph.Documento;
import it.datagraph.DocumentoRetBase64;
import it.datagraph.Fascicolo;
import it.datagraph.FascicoloNet;
import it.datagraph.FascicoloNetDettaglio;
import it.datagraph.FascicoloRet;
import it.datagraph.Identificatore;
import it.datagraph.IndirizzoTelematico;
import it.datagraph.InserimentoRet;
import it.datagraph.Intestazione;
import it.datagraph.LoginRet;
import it.datagraph.Mittente;
import it.datagraph.Parametro;
import it.datagraph.Persona;
import it.datagraph.ProtocollazioneRet;
import it.datagraph.RegistrazioneRet;
import it.datagraph.Segnatura;
import it.datagraph.UnitaOrganizzativa;
import it.datagraph.VoceTitolario;
import it.datagraph.VociTitolarioRet;
import it.maggioli.eldasoft.bl.IWSDMManager;
import it.maggioli.eldasoft.ws.dm.WSDMAggiungiAllegatiIn;
import it.maggioli.eldasoft.ws.dm.WSDMAggiungiAllegatiRes;
import it.maggioli.eldasoft.ws.dm.WSDMAnagraficaLeggiRes;
import it.maggioli.eldasoft.ws.dm.WSDMAttoContrattoRes;
import it.maggioli.eldasoft.ws.dm.WSDMClassifica;
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

public class DatagraphManager implements IWSDMManager {

  static Logger               logger                                       = Logger.getLogger(DatagraphManager.class);

  static private String       DATAGRAPH_DOCAREAPROTO                       = "java:comp/env/DATAGRAPH_DOCAREAPROTO";
  static private String       DATAGRAPH_DOCAREAPROTO_NOT_DEFINED           = "DATAGRAPH: l'indirizzo del servizio di protocollo non e' definito";

  static private String       DATAGRAPH_DENOMINAZIONE_AMMINISTRAZIONE      = "java:comp/env/DATAGRAPH_DENOMINAZIONE_AMMINISTRAZIONE";

  static private String       DATAGRAPH_CODICE_AMMINISTRAZIONE             = "java:comp/env/DATAGRAPH_CODICE_AMMINISTRAZIONE";
  static private String       DATAGRAPH_CODICE_AMMINISTRAZIONE_NOT_DEFINED = "DATAGRAPH: il codice amministrazione/ente non e' definito";

  static private String       DATAGRAPH_CODICE_AOO                         = "java:comp/env/DATAGRAPH_CODICE_AOO";
  static private String       DATAGRAPH_CODICE_AOO_NOT_DEFINED             = "DATAGRAPH: il codice AOO non e' definito";

  static private String       DATAGRAPH_NOME_APPLICATIVO                   = "java:comp/env/DATAGRAPH_NOME_APPLICATIVO";
  static private String       DATAGRAPH_TIPO_SMISTAMENTO                   = "java:comp/env/DATAGRAPH_TIPO_SMISTAMENTO";

  static private final String PROTOCOLLO_IN_ENTRATA                        = "E";
  static private final String PROTOCOLLO_IN_USCITA                         = "U";
  static private final String PROTOCOLLO_INTERNO                           = "I";

  static private final String INDIRIZZO_TELEMATICO_TIPO                    = "smtp";

  /**
   * Ottiene il riferimento al servizio remoto.
   * 
   * @param username
   * @param password
   * @return
   * @throws Exception
   */
  private DOCAREAprotoSoap _getDOCAREAProtoSoap(String username, String password) throws Exception {

    String url = InitialContext.doLookup(DATAGRAPH_DOCAREAPROTO);
    if (url == null || (url != null && "".equals(url.trim()))) {
      throw new Exception(DATAGRAPH_DOCAREAPROTO_NOT_DEFINED);
    }

    DOCAREAproto docAreaProto = new DOCAREAproto();
    DOCAREAprotoSoap docAreaProtoSoap = docAreaProto.getDOCAREAprotoSoap();
    Client clientProto = ClientProxy.getClient(docAreaProtoSoap);
    clientProto.getRequestContext().put(Message.ENDPOINT_ADDRESS, url);
    BindingProvider bp = (BindingProvider) docAreaProtoSoap;
    bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, username);
    bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, password);

    return docAreaProtoSoap;

  }

  /**
   * Login al servizio remoto con restituzione del token di sessione.
   * 
   * @param docAreaProtoSoap
   * @param username
   * @param password
   * @return
   * @throws Exception
   */
  private LoginRet _login(DOCAREAprotoSoap docAreaProtoSoap, String username, String password) throws Exception {

    String codente = InitialContext.doLookup(DATAGRAPH_CODICE_AMMINISTRAZIONE);
    if (codente == null || (codente != null && "".equals(codente.trim()))) {
      throw new Exception(DATAGRAPH_CODICE_AMMINISTRAZIONE_NOT_DEFINED);
    }
    LoginRet loginRet = docAreaProtoSoap.login(codente, username, password);
    return loginRet;

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
    LoginRet loginRet = null;
    DOCAREAprotoSoap docAreaProtoSoap = null;
    try {

      StringBuffer messaggioCtr = new StringBuffer();
      if (DatagraphUtilityControllo.ctrProtocolloInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {
        docAreaProtoSoap = _getDOCAREAProtoSoap(username, password);
        loginRet = _login(docAreaProtoSoap, username, password);

        if (loginRet.getLngErrNumber() == 0) {
          _datagraphProtocolloInserisci(username, password, loginAttr, wsdmprotocolloDocumentoIn, wsdmprotocolloDocumentoRes,
              docAreaProtoSoap, loginRet);
        } else {
          wsdmprotocolloDocumentoRes.setEsito(false);
          wsdmprotocolloDocumentoRes.setMessaggio(
              "Errore durante la fase di login [" + loginRet.getLngErrNumber() + ", " + loginRet.getStrErrString() + "]");
        }

      } else {
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (Exception e) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(e.getMessage());
      logger.error("Errore (_protocolloInserisci)", e);
    } finally {
      try {
        if (loginRet != null) {
          docAreaProtoSoap.logOut(loginRet.getStrDST());
        }
      } catch (Throwable t) {

      }
    }

    return wsdmprotocolloDocumentoRes;
  }

  /**
   * Inserimento in protocollo.
   * 
   * @param username
   * @param loginAttr
   * @param wsdmprotocolloDocumentoIn
   * @param wsdmprotocolloDocumentoRes
   * @param docAreaProtoSoap
   * @param loginRet
   * @throws NamingException
   * @throws Exception
   * @throws RemoteException
   * @throws JAXBException
   */
  private void _datagraphProtocolloInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn, WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes,
      DOCAREAprotoSoap docAreaProtoSoap, LoginRet loginRet) throws NamingException, Exception, RemoteException, JAXBException {

    boolean _ok;
    _ok = true;

    WSDMProtocolloDocumento wsdmProtocolloDocumento = new WSDMProtocolloDocumento();

    String dstToken = loginRet.getStrDST();

    Segnatura segnatura = new Segnatura();

    Intestazione intestazione = new Intestazione();
    segnatura.setIntestazione(intestazione);

    Identificatore identificatore = new Identificatore();
    intestazione.setIdentificatore(identificatore);

    // Oggetto
    if (wsdmprotocolloDocumentoIn.getOggetto() != null) {
      intestazione.setOggetto(wsdmprotocolloDocumentoIn.getOggetto());
    }

    // Codice amministrazione
    String codiceAmministrazione = InitialContext.doLookup(DATAGRAPH_CODICE_AMMINISTRAZIONE);
    if (codiceAmministrazione == null || (codiceAmministrazione != null && "".equals(codiceAmministrazione.trim()))) {
      throw new Exception(DATAGRAPH_CODICE_AMMINISTRAZIONE_NOT_DEFINED);
    } else {
      identificatore.setCodiceAmministrazione(codiceAmministrazione);
    }

    // Codice AOO

    String codiceAOO = null;
    if (loginAttr != null && loginAttr.getCodiceAOO() != null && !"".equals(loginAttr.getCodiceAOO().trim())) {
      codiceAOO = loginAttr.getCodiceAOO();
    } else {
      codiceAOO = InitialContext.doLookup(DATAGRAPH_CODICE_AOO);
    }

    if (codiceAOO == null || (codiceAOO != null && "".equals(codiceAOO.trim()))) {
      throw new Exception(DATAGRAPH_CODICE_AOO_NOT_DEFINED);
    }
    identificatore.setCodiceAOO(codiceAOO);

    // Flusso (ingresso, uscita)
    if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
      identificatore.setFlusso(PROTOCOLLO_IN_ENTRATA);
    } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      identificatore.setFlusso(PROTOCOLLO_IN_USCITA);
    } else if (WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      identificatore.setFlusso(PROTOCOLLO_INTERNO);
    }

    // Numero registrazione e data registrazione
    identificatore.setNumeroRegistrazione("");
    identificatore.setDataRegistrazione("");

    // Denominazione amministrazione
    String denominazioneAmministrazione = InitialContext.doLookup(DATAGRAPH_DENOMINAZIONE_AMMINISTRAZIONE);

    // Mittenti e Destinatari
    if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
      _gestioneMittentiEsterni(wsdmprotocolloDocumentoIn, intestazione);
      _gestioneDestinatarioInterno(codiceAmministrazione, denominazioneAmministrazione,
          wsdmprotocolloDocumentoIn.getIdUnitaOperativaDestinataria(), codiceAOO, intestazione);
    } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      _gestioneMittenteInterno(codiceAmministrazione, denominazioneAmministrazione, wsdmprotocolloDocumentoIn.getIdUnitaOperativaMittente(),
          codiceAOO, intestazione);
      _gestioneDestinatariEsterni(wsdmprotocolloDocumentoIn, intestazione);
    } else if (WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      _gestioneMittenteInterno(codiceAmministrazione, denominazioneAmministrazione, wsdmprotocolloDocumentoIn.getIdUnitaOperativaMittente(),
          codiceAOO, intestazione);
      _gestioneDestinatarioInterno(codiceAmministrazione, denominazioneAmministrazione,
          wsdmprotocolloDocumentoIn.getIdUnitaOperativaDestinataria(), codiceAOO, intestazione);
    }

    // Classifica
    _gestioneClassifica(wsdmprotocolloDocumentoIn, codiceAmministrazione, codiceAOO, intestazione);

    // Fascicolo
    WSDMFascicolo wsdmFascicoloIn = wsdmprotocolloDocumentoIn.getFascicolo();
    if (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
      Fascicolo fascicolo = new Fascicolo();
      intestazione.setFascicolo(fascicolo);
      fascicolo.setAnno(String.valueOf(wsdmFascicoloIn.getAnnoFascicolo()));
      fascicolo.setNumero(wsdmFascicoloIn.getNumeroFascicolo());

      wsdmProtocolloDocumento.setInserimentoInFascicolo(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo());
      WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();
      wsdmFascicolo.setClassificaFascicolo(wsdmFascicoloIn.getClassificaFascicolo());
      wsdmFascicolo.setAnnoFascicolo(wsdmFascicoloIn.getAnnoFascicolo());
      wsdmFascicolo.setNumeroFascicolo(wsdmFascicoloIn.getNumeroFascicolo());
      wsdmProtocolloDocumento.setFascicolo(wsdmFascicolo);

    } else if (WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {

      WSDMFascicoloRes wsdmFascicoloRes = this._fascicoloInserisci(username, password, loginAttr, wsdmFascicoloIn);
      if (wsdmFascicoloRes.isEsito()) {
        _ok = true;

        Fascicolo fascicolo = new Fascicolo();
        intestazione.setFascicolo(fascicolo);
        fascicolo.setAnno(String.valueOf(wsdmFascicoloRes.getFascicolo().getAnnoFascicolo()));
        fascicolo.setNumero(wsdmFascicoloRes.getFascicolo().getNumeroFascicolo());

        wsdmProtocolloDocumento.setInserimentoInFascicolo(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo());
        WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();
        wsdmFascicolo.setClassificaFascicolo(wsdmFascicoloRes.getFascicolo().getClassificaFascicolo());
        wsdmFascicolo.setAnnoFascicolo(wsdmFascicoloRes.getFascicolo().getAnnoFascicolo());
        wsdmFascicolo.setNumeroFascicolo(wsdmFascicoloRes.getFascicolo().getNumeroFascicolo());
        wsdmFascicolo.setOggettoFascicolo(wsdmFascicoloRes.getFascicolo().getOggettoFascicolo());
        wsdmProtocolloDocumento.setFascicolo(wsdmFascicolo);

      }

    }

    // Applicativo protocollo
    String nomeApplicativo = InitialContext.doLookup(DATAGRAPH_NOME_APPLICATIVO);
    String tipoSmistamento = InitialContext.doLookup(DATAGRAPH_TIPO_SMISTAMENTO);
    _gestioneApplicativoProtocollo(wsdmprotocolloDocumentoIn.getStruttura(), nomeApplicativo, username, tipoSmistamento, segnatura);

    // Descrizione (contiene documento principale e lista degli allegati)
    Descrizione descrizione = new Descrizione();
    segnatura.setDescrizione(descrizione);

    // Inserimento degli allegati
    WSDMProtocolloAllegato[] wsmdAllegati = wsdmprotocolloDocumentoIn.getAllegati();
    if (wsmdAllegati != null && wsmdAllegati.length > 0 && _ok) {
      // Documento principale
      InserimentoRet inserimentoRetDocumentoPrincipale = docAreaProtoSoap.inserimentoBase64(username, dstToken,
          Base64.encode(wsmdAllegati[0].getContenuto()));

      if (inserimentoRetDocumentoPrincipale.getLngErrNumber() == 0) {

        _ok = true;

        Documento documentoPrincipale = new Documento();
        documentoPrincipale.setId(inserimentoRetDocumentoPrincipale.getLngDocID());
        documentoPrincipale.setNome(wsmdAllegati[0].getNome());
        documentoPrincipale.setDescrizioneDocumento(wsmdAllegati[0].getTitolo());

        descrizione.setDocumento(documentoPrincipale);

      } else {

        _ok = false;

        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio("Errore durante l'inserimento del documento principale ["
            + inserimentoRetDocumentoPrincipale.getLngErrNumber()
            + ", "
            + inserimentoRetDocumentoPrincipale.getStrErrString()
            + "]");
      }

      // Ulteriori allegati
      if (wsmdAllegati.length > 1 && _ok) {

        Allegati allegati = new Allegati();
        List<Documento> listaDocumentiAllegati = allegati.getDocumento();

        for (int ai = 1; ai < wsmdAllegati.length; ai++) {
          InserimentoRet inserimentoRetAllegato = docAreaProtoSoap.inserimentoBase64(username, dstToken,
              Base64.encode(wsmdAllegati[ai].getContenuto()));
          if (inserimentoRetAllegato.getLngErrNumber() == 0 && _ok) {

            _ok = true;

            Documento documentoAllegato = new Documento();
            documentoAllegato.setId(inserimentoRetAllegato.getLngDocID());
            documentoAllegato.setNome(wsmdAllegati[ai].getNome());
            documentoAllegato.setDescrizioneDocumento(wsmdAllegati[ai].getTitolo());
            listaDocumentiAllegati.add(documentoAllegato);

          } else {

            _ok = false;

            wsdmprotocolloDocumentoRes.setEsito(false);
            wsdmprotocolloDocumentoRes.setMessaggio("Errore durante l'inserimento del documento allegato ["
                + inserimentoRetAllegato.getLngErrNumber()
                + ", "
                + inserimentoRetAllegato.getStrErrString()
                + "]");
          }
        }

        descrizione.setAllegati(allegati);
      }
    }

    if (_ok) {
      // Conversione in stringa XML
      StringWriter xmlStringWriter = new StringWriter();
      JAXBContext jaxbContext = JAXBContext.newInstance(Segnatura.class);
      Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
      jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
      JAXBElement<Segnatura> jaxbElement = new JAXBElement<Segnatura>(new QName("", "Segnatura"), Segnatura.class, segnatura);

      jaxbMarshaller.marshal(jaxbElement, xmlStringWriter);
      String xmlSegnatura = xmlStringWriter.toString();

      // Invio dei dati di protocollazione
      ProtocollazioneRet protocollazioneRet = docAreaProtoSoap.protocollazioneBase64(username, dstToken,
          Base64.encode(xmlSegnatura.getBytes("UTF-8")));

      if (protocollazioneRet.getLngErrNumber() == 0) {

        _ok = true;

        wsdmprotocolloDocumentoRes.setEsito(true);

        String numeroProtocollo = String.valueOf(protocollazioneRet.getLngNumPG());
        Long annoProtocollo = protocollazioneRet.getLngAnnoPG();

        wsdmProtocolloDocumento.setNumeroProtocollo(numeroProtocollo);
        wsdmProtocolloDocumento.setAnnoProtocollo(annoProtocollo);

        // Composizione del numero documento per restituire un numero documento
        // fittizio,
        // potra' essere utilizzato per invio mail (chiamata mediante numero
        // documento)
        // e per l'operazione _documentoLeggi
        String numeroDocumento = annoProtocollo.toString() + "/" + numeroProtocollo;
        wsdmProtocolloDocumento.setNumeroDocumento(numeroDocumento);

        Calendar dataProtocolloToday = Calendar.getInstance();
        wsdmProtocolloDocumento.setDataProtocollo(dataProtocolloToday.getTime());
        wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmProtocolloDocumento);

      } else {

        _ok = false;

        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio("Errore durante l'inserimento del protocollo ["
            + protocollazioneRet.getLngErrNumber()
            + ", "
            + protocollazioneRet.getStrErrString()
            + "]");
      }
    }
  }

  /**
   * Creazione di un nuovo fascicolo.
   * 
   * @param username
   * @param loginAttr
   * @param wsdmfascicoloIn
   * @param wsdmFascicoloRes
   * @param docAreaProtoSoap
   * @param loginRet
   * @throws JAXBException
   * @throws RemoteException
   * @throws DatatypeConfigurationException
   */
  private void _datagraphFascicoloInserisci(String username, WSDMLoginAttr loginAttr, WSDMFascicoloIn wsdmfascicoloIn,
      WSDMFascicoloRes wsdmFascicoloRes, DOCAREAprotoSoap docAreaProtoSoap, LoginRet loginRet)
      throws JAXBException, RemoteException, DatatypeConfigurationException {

    FascicoloNet fascicoloNet = new FascicoloNet();

    int annoFascicolo;
    Long numeroFascicolo = new Long(0);

    // Anno e data di creazione
    GregorianCalendar gregorianCalendar = new GregorianCalendar();
    XMLGregorianCalendar now = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
    annoFascicolo = now.getYear();
    fascicoloNet.setAnno(annoFascicolo);
    fascicoloNet.setDataApertura(now);

    // Numero (si assegna zero, il sistema restituisce il numero effettivo)
    fascicoloNet.setNumero(numeroFascicolo.intValue());

    // Sotto fascicolo (sempre 0)
    fascicoloNet.setSottoFasc(0);

    // Oggetto fascicolo
    fascicoloNet.setDescrizione(wsdmfascicoloIn.getOggettoFascicolo());

    // Classificazione
    VoceTitolario titolario = new VoceTitolario();
    String[] classificaSplit = wsdmfascicoloIn.getClassificaFascicolo().split("\\.");
    if (classificaSplit.length >= 1) titolario.setTitolo(Integer.parseInt(classificaSplit[0]));
    if (classificaSplit.length >= 2) titolario.setClasse(Integer.parseInt(classificaSplit[1]));
    if (classificaSplit.length >= 3) titolario.setSottoclasse(Integer.parseInt(classificaSplit[2]));
    fascicoloNet.setTitolario(titolario);

    // Struttura
    fascicoloNet.setUO(wsdmfascicoloIn.getStruttura());

    // Creazione del fascicolo
    InserimentoRet inserimentoRet = docAreaProtoSoap.creaFascicolo(fascicoloNet, loginRet.getStrDST());
    if (inserimentoRet.getLngErrNumber() == 0) {
      numeroFascicolo = inserimentoRet.getLngDocID();

      WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();
      wsdmFascicolo.setClassificaFascicolo(wsdmfascicoloIn.getClassificaFascicolo());
      wsdmFascicolo.setAnnoFascicolo(new Long(annoFascicolo));
      wsdmFascicolo.setNumeroFascicolo(String.valueOf(numeroFascicolo));
      wsdmFascicolo.setOggettoFascicolo(wsdmfascicoloIn.getOggettoFascicolo());

      wsdmFascicoloRes.setEsito(true);
      wsdmFascicoloRes.setFascicolo(wsdmFascicolo);

    } else {
      wsdmFascicoloRes.setEsito(false);
      wsdmFascicoloRes.setMessaggio(
          "Errore durante la creazione del fascicolo [" + inserimentoRet.getLngErrNumber() + ", " + inserimentoRet.getStrErrString() + "]");
    }
  }

  /**
   * Lettura del fascicolo.
   * 
   * @param username
   * @param loginAttr
   * @param codiceFascicolo
   * @param annoFascicolo
   * @param numeroFascicolo
   * @param classificaFascicolo
   * @param oggettoFascicolo
   * @param wsdmFascicoloRes
   * @param docAreaProtoSoap
   * @param loginRet
   * @throws JAXBException
   * @throws RemoteException
   * @throws DatatypeConfigurationException
   */
  private void _datagraphFascicoloLeggi(String username, WSDMLoginAttr loginAttr, String codiceFascicolo, Long annoFascicolo,
      String numeroFascicolo, String classificaFascicolo, String oggettoFascicolo, WSDMFascicoloRes wsdmFascicoloRes,
      DOCAREAprotoSoap docAreaProtoSoap, LoginRet loginRet) throws JAXBException, RemoteException, DatatypeConfigurationException {

    FascicoloNet fascicoloNet = new FascicoloNet();

    // Classificazione
    VoceTitolario titolario = new VoceTitolario();
    String[] classificaSplit = classificaFascicolo.split("\\.");
    if (classificaSplit.length >= 1) titolario.setTitolo(Integer.parseInt(classificaSplit[0]));
    if (classificaSplit.length >= 2) titolario.setClasse(Integer.parseInt(classificaSplit[1]));
    if (classificaSplit.length >= 3) titolario.setSottoclasse(Integer.parseInt(classificaSplit[2]));
    fascicoloNet.setTitolario(titolario);

    // Anno
    fascicoloNet.setAnno(annoFascicolo.intValue());

    // Numero
    fascicoloNet.setNumero(Integer.parseInt(numeroFascicolo));

    // Sotto fascicolo (sempre 0)
    fascicoloNet.setSottoFasc(0);

    // Lettura dei dati del fascicolo
    FascicoloRet fascicoloRet = docAreaProtoSoap.getFascicolo(fascicoloNet, false, loginRet.getStrDST());

    if (fascicoloRet.getLngErrNumber() == 0) {

      WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();

      // Anno
      wsdmFascicolo.setAnnoFascicolo(annoFascicolo);

      // Numero
      wsdmFascicolo.setNumeroFascicolo(numeroFascicolo);

      // Classifica
      wsdmFascicolo.setClassificaFascicolo(classificaFascicolo);

      if (fascicoloRet.getFascicolo() != null) {
        FascicoloNetDettaglio fascicoloDettaglio = fascicoloRet.getFascicolo();

        // Descrizione
        if (fascicoloDettaglio.getDescrizione() != null) {
          wsdmFascicolo.setDescrizioneFascicolo(fascicoloDettaglio.getDescrizione());
          wsdmFascicolo.setOggettoFascicolo(fascicoloDettaglio.getDescrizione());
        }

        // Data apertura
        if (fascicoloDettaglio.getDataApertura() != null) {
          try {
            XMLGregorianCalendar dataApertura = fascicoloDettaglio.getDataApertura();
            wsdmFascicolo.setDataFascicolo(dataApertura.toGregorianCalendar().getTime());
          } catch (Throwable t) {

          }
        }

        // Lista registrazioni
        if (fascicoloDettaglio.getListaRegistrazioni() != null) {
          ArrayOfSegnatura arraySegnatura = fascicoloDettaglio.getListaRegistrazioni();
          if (arraySegnatura != null && arraySegnatura.getSegnatura() != null) {
            List<Segnatura> listaSegnatura = arraySegnatura.getSegnatura();
            if (listaSegnatura != null && listaSegnatura.size() > 0) {
              WSDMFascicoloDocumento[] fascicoloDocumento = new WSDMFascicoloDocumento[listaSegnatura.size()];

              for (int s = 0; s < listaSegnatura.size(); s++) {
                fascicoloDocumento[s] = new WSDMFascicoloDocumento();
                if (listaSegnatura.get(s).getIntestazione() != null) {
                  Intestazione intestazione = listaSegnatura.get(s).getIntestazione();

                  // Oggetto
                  fascicoloDocumento[s].setOggetto(intestazione.getOggetto());

                  if (intestazione.getIdentificatore() != null) {
                    // <Identificatore>
                    // <CodiceAmministrazione/>
                    // <CodiceAOO/>
                    // <NumeroRegistrazione>87</NumeroRegistrazione>
                    // <DataRegistrazione>02/03/2022</DataRegistrazione>
                    // <Flusso>U</Flusso>
                    // </Identificatore>

                    Identificatore identificatore = intestazione.getIdentificatore();

                    // Numero registrazione/protocollo
                    String numeroProtocollo = identificatore.getNumeroRegistrazione();
                    fascicoloDocumento[s].setNumeroProtocollo(numeroProtocollo);

                    // Data registrazione/protocollo e anno protocollo
                    String dataProtocolloString = identificatore.getDataRegistrazione();
                    if (dataProtocolloString != null) {
                      try {
                        Date dataProtocollo = new SimpleDateFormat("dd/MM/yyyy").parse(dataProtocolloString);
                        fascicoloDocumento[s].setDataProtocollo(dataProtocollo);
                        
                        Long annoProtocollo = new Long(dataProtocollo.getYear() + 1900);
                        fascicoloDocumento[s].setAnnoProtocollo(annoProtocollo);
                        
                        // Numero documento
                        String numeroDocumento = annoProtocollo.toString() + "/" + numeroProtocollo;
                        fascicoloDocumento[s].setNumeroDocumento(numeroDocumento);
                        
                      } catch (Throwable t) {

                      }
                    }
                    
                    

                    // Flusso
                    String flusso = identificatore.getFlusso();

                    if (PROTOCOLLO_IN_ENTRATA.equals(flusso)) {
                      fascicoloDocumento[s].setInout(WSDMProtocolloInOut.IN);
                    } else if (PROTOCOLLO_IN_USCITA.equals(flusso)) {
                      fascicoloDocumento[s].setInout(WSDMProtocolloInOut.OUT);
                    } else if (PROTOCOLLO_INTERNO.equals(flusso)) {
                      fascicoloDocumento[s].setInout(WSDMProtocolloInOut.INT);
                    }
                  }

                }
              }

              wsdmFascicolo.setDocumenti(fascicoloDocumento);

            }
          }
        }
      }

      wsdmFascicoloRes.setEsito(true);
      wsdmFascicoloRes.setFascicolo(wsdmFascicolo);

    } else {
      wsdmFascicoloRes.setEsito(false);
      wsdmFascicoloRes.setMessaggio(
          "Errore durante la creazione del fascicolo [" + fascicoloRet.getLngErrNumber() + ", " + fascicoloRet.getStrErrString() + "]");
    }
  }

  /**
   * Gestione del destinatario interno.
   * 
   * @param codiceAmministrazione
   * @param denominazioneAmministrazione
   * @param codiceUOAmministrazione
   * @param codiceAOO
   * @param intestazione
   */
  private void _gestioneDestinatarioInterno(String codiceAmministrazione, String denominazioneAmministrazione,
      String codiceUOAmministrazione, String codiceAOO, Intestazione intestazione) {

    Destinatario destinatario = new Destinatario();

    // Codice amministrazione
    Amministrazione amministrazione = new Amministrazione();
    amministrazione.setCodiceAmministrazione(codiceAmministrazione);

    // Denominazione amministrazione
    amministrazione.setDenominazione(denominazioneAmministrazione);

    // Unita' organizzativa amministrazione
    UnitaOrganizzativa uo = new UnitaOrganizzativa();
    uo.setId(codiceUOAmministrazione);
    amministrazione.setUnitaOrganizzativa(uo);

    destinatario.setAmministrazione(amministrazione);

    // AOO
    AOO aoo = new AOO();
    aoo.setCodiceAOO(codiceAOO);
    destinatario.setAOO(aoo);

    intestazione.setDestinatario(destinatario);

  }

  /**
   * Gestione della lista dei mittenti esterni.
   * 
   * @param wsdmprotocolloDocumentoIn
   * @param intestazione
   */
  private void _gestioneMittentiEsterni(WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn, Intestazione intestazione) {
    WSDMProtocolloAnagrafica[] wsdmMittenti = wsdmprotocolloDocumentoIn.getMittenti();
    if (wsdmMittenti != null && wsdmMittenti.length > 0) {
      Mittente mittente = new Mittente();
      List<Persona> listaPersone = mittente.getPersona();
      for (int m = 0; m < wsdmMittenti.length; m++) {
        Persona persona = new Persona();
        listaPersone.add(persona);

        // Id e Codice fiscale
        if (wsdmMittenti[m].getCodiceFiscale() != null) {
          persona.setCodiceFiscale(wsdmMittenti[m].getCodiceFiscale());
          persona.setId(wsdmMittenti[m].getCodiceFiscale());
        }

        // Nome
        if (wsdmMittenti[m].getNome() != null) {
          persona.setNome(wsdmMittenti[m].getNome());
        } else {
          persona.setNome("");
        }

        // Cognome
        persona.setCognome(wsdmMittenti[m].getCognomeointestazione());

        // Indirizzo telematico
        if (wsdmMittenti[m].getEmail() != null && !"".equals(wsdmMittenti[m].getEmail())) {
          IndirizzoTelematico indirizzoTelematico = new IndirizzoTelematico();
          indirizzoTelematico.setTipo(INDIRIZZO_TELEMATICO_TIPO);
          indirizzoTelematico.setValue(wsdmMittenti[m].getEmail());
          persona.setIndirizzoTelematico(indirizzoTelematico);
        }
      }
      intestazione.setMittente(mittente);
    }
  }

  /**
   * Gestione del mittente interno.
   * 
   * @param codiceAmministrazione
   * @param denominazioneAmministrazione
   * @param codiceUOAmministrazione
   * @param codiceAOO
   * @param intestazione
   */
  private void _gestioneMittenteInterno(String codiceAmministrazione, String denominazioneAmministrazione, String codiceUOAmministrazione,
      String codiceAOO, Intestazione intestazione) {

    Mittente mittente = new Mittente();

    // Codice amministrazione
    Amministrazione amministrazione = new Amministrazione();
    amministrazione.setCodiceAmministrazione(codiceAmministrazione);

    // Denominazione amministrazione
    amministrazione.setDenominazione(denominazioneAmministrazione);

    // Unita' organizzativa amministrazione
    UnitaOrganizzativa uo = new UnitaOrganizzativa();
    uo.setId(codiceUOAmministrazione);
    amministrazione.setUnitaOrganizzativa(uo);

    mittente.setAmministrazione(amministrazione);

    // AOO
    AOO aoo = new AOO();
    aoo.setCodiceAOO(codiceAOO);
    mittente.setAOO(aoo);

    intestazione.setMittente(mittente);

  }

  /**
   * Gestione lista dei destinatari esterni.
   * 
   * @param wsdmprotocolloDocumentoIn
   * @param intestazione
   */
  private void _gestioneDestinatariEsterni(WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn, Intestazione intestazione) {
    WSDMProtocolloAnagrafica[] wsdmDestinatari = wsdmprotocolloDocumentoIn.getDestinatari();
    if (wsdmDestinatari != null && wsdmDestinatari.length > 0) {
      Destinatario destinatario = new Destinatario();
      List<Persona> listaPersone = destinatario.getPersona();
      for (int d = 0; d < wsdmDestinatari.length; d++) {
        Persona persona = new Persona();
        listaPersone.add(persona);

        // Id e Codice fiscale
        if (wsdmDestinatari[d].getCodiceFiscale() != null) {
          persona.setCodiceFiscale(wsdmDestinatari[d].getCodiceFiscale());
          persona.setId(wsdmDestinatari[d].getCodiceFiscale());
        }

        // Nome
        if (wsdmDestinatari[d].getNome() != null) {
          persona.setNome(wsdmDestinatari[d].getNome());
        } else {
          persona.setNome("");
        }

        // Cognome
        persona.setCognome(wsdmDestinatari[d].getCognomeointestazione());

        // Indirizzo telematico
        if (wsdmDestinatari[d].getEmail() != null && !"".equals(wsdmDestinatari[d].getEmail())) {
          IndirizzoTelematico indirizzoTelematico = new IndirizzoTelematico();
          indirizzoTelematico.setTipo(INDIRIZZO_TELEMATICO_TIPO);
          indirizzoTelematico.setValue(wsdmDestinatari[d].getEmail());
          persona.setIndirizzoTelematico(indirizzoTelematico);
        }
      }
      intestazione.setDestinatario(destinatario);
    }
  }

  /**
   * Gestione attributi "ApplicativoProtocollo".
   * 
   * @param codiceUO
   * @param nomeApplicativo
   * @param username
   * @param tipoSmistamento
   * @param segnatura
   */
  private void _gestioneApplicativoProtocollo(String codiceUO, String nomeApplicativo, String username, String tipoSmistamento,
      Segnatura segnatura) {

    // Nome applicativo
    ApplicativoProtocollo applicativoProtocollo = new ApplicativoProtocollo();
    if (nomeApplicativo != null) applicativoProtocollo.setNome(nomeApplicativo);

    List<Parametro> listaParametri = applicativoProtocollo.getParametro();

    // Utente
    Parametro parametroUtente = new Parametro();
    parametroUtente.setNome("utente");
    parametroUtente.setValore(username);
    listaParametri.add(parametroUtente);

    // Codice UO, in questo caso e' l'unita' protocollante
    if (codiceUO != null) {
      Parametro parametroUO = new Parametro();
      parametroUO.setNome("uo");
      parametroUO.setValore(codiceUO);
      listaParametri.add(parametroUO);
    }

    // Tipo di smistamento
    if (tipoSmistamento != null && !"".equals(tipoSmistamento)) {
      Parametro parametroTipoSmistamento = new Parametro();
      parametroTipoSmistamento.setNome("tipoSmistamento");
      parametroTipoSmistamento.setValore(tipoSmistamento);
      listaParametri.add(parametroTipoSmistamento);
    }

    // Data del documento
    Date now = Calendar.getInstance().getTime();
    DateFormat nowFormat = new SimpleDateFormat("dd/MM/yyyy");
    String dataDocumento = nowFormat.format(now);
    Parametro parametroDataDocumento = new Parametro();
    parametroDataDocumento.setNome("dataDocumento");
    parametroDataDocumento.setValore(dataDocumento);
    listaParametri.add(parametroDataDocumento);

    segnatura.setApplicativoProtocollo(applicativoProtocollo);
  }

  /**
   * Gestione attributi "Classifica".
   * 
   * @param wsdmprotocolloDocumentoIn
   * @param codiceAmministrazione
   * @param codiceAOO
   * @param intestazione
   */
  private void _gestioneClassifica(WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn, String codiceAmministrazione, String codiceAOO,
      Intestazione intestazione) {
    if (wsdmprotocolloDocumentoIn.getClassifica() != null) {
      Classifica classifica = new Classifica();

      // Titolario/classificazione
      classifica.setCodiceTitolario(wsdmprotocolloDocumentoIn.getClassifica());

      // Codice amministrazione
      if (codiceAmministrazione != null) classifica.setCodiceAmministrazione(codiceAmministrazione);

      // Codice AOO
      if (codiceAOO != null) classifica.setCodiceAOO(codiceAOO);
      intestazione.setClassifica(classifica);
    }
  }

  @Override
  public WSDMProtocolloDocumentoRes _protocolloLeggi(String username, String password, WSDMLoginAttr loginAttr, Long annoProtocollo,
      String numeroProtocollo) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    LoginRet loginRet = null;
    DOCAREAprotoSoap docAreaProtoSoap = null;
    try {

      StringBuffer messaggioCtr = new StringBuffer();
      if (DatagraphUtilityControllo.ctrProtocolloLeggi(loginAttr, annoProtocollo, numeroProtocollo, messaggioCtr)) {
        docAreaProtoSoap = _getDOCAREAProtoSoap(username, password);
        loginRet = _login(docAreaProtoSoap, username, password);

        if (loginRet.getLngErrNumber() == 0) {
          _datagraphProtocolloLeggi(username, annoProtocollo, numeroProtocollo, wsdmprotocolloDocumentoRes, docAreaProtoSoap, loginRet);
        } else {
          wsdmprotocolloDocumentoRes.setEsito(false);
          wsdmprotocolloDocumentoRes.setMessaggio(
              "Errore durante la fase di login [" + loginRet.getLngErrNumber() + ", " + loginRet.getStrErrString() + "]");
        }

      } else {
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (Exception e) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(e.getMessage());
      logger.error("Errore (_protocolloLeggi)", e);
    } finally {
      try {
        if (loginRet != null) {
          docAreaProtoSoap.logOut(loginRet.getStrDST());
        }
      } catch (Throwable t) {

      }
    }

    return wsdmprotocolloDocumentoRes;
  }

  /**
   * Lettura del protocollo.
   * 
   * @param username
   * @param annoProtocollo
   * @param numeroProtocollo
   * @param wsdmprotocolloDocumentoRes
   * @param docAreaProtoSoap
   * @param loginRet
   * @throws Exception
   * @throws JAXBException
   * @throws RemoteException
   */
  private void _datagraphProtocolloLeggi(String username, Long annoProtocollo, String numeroProtocollo,
      WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes, DOCAREAprotoSoap docAreaProtoSoap, LoginRet loginRet)
      throws Exception, JAXBException, RemoteException {

    RegistrazioneRet registrazioneRet = docAreaProtoSoap.getRegistrazione2(annoProtocollo.intValue(), Integer.parseInt(numeroProtocollo),
        false, loginRet.getStrDST());

    if (registrazioneRet.getLngErrNumber() == 0) {

      WSDMProtocolloDocumento wsdmProtocolloDocumento = new WSDMProtocolloDocumento();

      wsdmprotocolloDocumentoRes.setEsito(true);

      wsdmProtocolloDocumento.setNumeroProtocollo(numeroProtocollo);
      wsdmProtocolloDocumento.setAnnoProtocollo(annoProtocollo);
      Calendar dataProtocolloToday = Calendar.getInstance();
      wsdmProtocolloDocumento.setDataProtocollo(dataProtocolloToday.getTime());

      // Oggetto
      if (registrazioneRet != null) {
        if (registrazioneRet.getRegistrazione() != null) {
          if (registrazioneRet.getRegistrazione().getIntestazione() != null) {
            wsdmProtocolloDocumento.setOggetto(registrazioneRet.getRegistrazione().getIntestazione().getOggetto());
          }
        }
      }

      // Classifica
      if (registrazioneRet != null) {
        if (registrazioneRet.getRegistrazione() != null) {
          if (registrazioneRet.getRegistrazione().getIntestazione() != null) {
            if (registrazioneRet.getRegistrazione().getIntestazione().getClassifica() != null) {
              wsdmProtocolloDocumento.setClassifica(
                  registrazioneRet.getRegistrazione().getIntestazione().getClassifica().getCodiceTitolario());
            }
          }
        }
      }

      // Verso (IN, OUT, INT)
      String flusso = null;
      if (registrazioneRet != null) {
        if (registrazioneRet.getRegistrazione() != null) {
          if (registrazioneRet.getRegistrazione().getIntestazione() != null) {
            if (registrazioneRet.getRegistrazione().getIntestazione().getIdentificatore() != null) {
              flusso = registrazioneRet.getRegistrazione().getIntestazione().getIdentificatore().getFlusso();
              if (flusso != null) {
                if (flusso.equals(PROTOCOLLO_IN_ENTRATA)) wsdmProtocolloDocumento.setInout(WSDMProtocolloInOut.IN);
                if (flusso.equals(PROTOCOLLO_IN_USCITA)) wsdmProtocolloDocumento.setInout(WSDMProtocolloInOut.OUT);
                if (flusso.equals(PROTOCOLLO_INTERNO)) wsdmProtocolloDocumento.setInout(WSDMProtocolloInOut.INT);
              }
            }
          }
        }
      }

      // Mittenti e destinatari
      if (flusso.equals(PROTOCOLLO_IN_ENTRATA)) {
        // Mittenti
        if (registrazioneRet.getRegistrazione().getIntestazione() != null) {
          Mittente mittenti = registrazioneRet.getRegistrazione().getIntestazione().getMittente();
          if (mittenti != null) {
            List<Persona> listaPersone = mittenti.getPersona();
            if (listaPersone != null && listaPersone.size() > 0) {
              WSDMProtocolloAnagrafica[] wsdmMittenti = new WSDMProtocolloAnagrafica[listaPersone.size()];
              for (int m = 0; m < listaPersone.size(); m++) {
                wsdmMittenti[m] = new WSDMProtocolloAnagrafica();
                wsdmMittenti[m].setCognomeointestazione(listaPersone.get(m).getCognome());
                wsdmMittenti[m].setNome(listaPersone.get(m).getNome());
                wsdmMittenti[m].setCodiceFiscale(listaPersone.get(m).getCodiceFiscale());
                if (listaPersone.get(m).getIndirizzoTelematico() != null) {
                  wsdmMittenti[m].setEmail(listaPersone.get(m).getIndirizzoTelematico().getValue());
                }
              }
              wsdmProtocolloDocumento.setDestinatari(wsdmMittenti);
            }
          }
        }

      } else if (flusso.equals(PROTOCOLLO_IN_USCITA)) {
        // Destinatari
        if (registrazioneRet.getRegistrazione().getIntestazione() != null) {
          Destinatario destinatari = registrazioneRet.getRegistrazione().getIntestazione().getDestinatario();
          if (destinatari != null) {
            List<Persona> listaPersone = destinatari.getPersona();
            if (listaPersone != null && listaPersone.size() > 0) {
              WSDMProtocolloAnagrafica[] wsdmDestinatari = new WSDMProtocolloAnagrafica[listaPersone.size()];
              for (int d = 0; d < listaPersone.size(); d++) {
                wsdmDestinatari[d] = new WSDMProtocolloAnagrafica();
                wsdmDestinatari[d].setCognomeointestazione(listaPersone.get(d).getCognome());
                wsdmDestinatari[d].setNome(listaPersone.get(d).getNome());
                wsdmDestinatari[d].setCodiceFiscale(listaPersone.get(d).getCodiceFiscale());
                if (listaPersone.get(d).getIndirizzoTelematico() != null) {
                  wsdmDestinatari[d].setEmail(listaPersone.get(d).getIndirizzoTelematico().getValue());
                }
              }
              wsdmProtocolloDocumento.setDestinatari(wsdmDestinatari);
            }
          }
        }
      }

      // Documento principale ed allegati
      if (registrazioneRet != null) {
        if (registrazioneRet.getRegistrazione() != null) {
          if (registrazioneRet.getRegistrazione().getDescrizione() != null) {
            // Calcolo del numero di documento
            int numeroDocumenti = 0;
            if (registrazioneRet.getRegistrazione().getDescrizione().getDocumento() != null) {
              numeroDocumenti++;
            }
            if (registrazioneRet.getRegistrazione().getDescrizione().getAllegati() != null) {
              Allegati allegati = registrazioneRet.getRegistrazione().getDescrizione().getAllegati();
              if (allegati.getDocumento() != null) {
                numeroDocumenti += allegati.getDocumento().size();
              }
            }

            if (numeroDocumenti > 0) {
              WSDMProtocolloAllegato[] wsdmProtocolloAllegati = new WSDMProtocolloAllegato[numeroDocumenti];

              // Lettura documento principale
              if (registrazioneRet.getRegistrazione().getDescrizione().getDocumento() != null) {
                wsdmProtocolloAllegati[0] = new WSDMProtocolloAllegato();
                Documento documentoPrincipale = registrazioneRet.getRegistrazione().getDescrizione().getDocumento();
                wsdmProtocolloAllegati[0].setNome(documentoPrincipale.getNome());
                wsdmProtocolloAllegati[0].setTitolo(documentoPrincipale.getDescrizioneDocumento());
                
                // Lettura dello stream dati del file
                Long documentoPrincipaleId = new Long(documentoPrincipale.getId());
                wsdmProtocolloAllegati[0].setIdAllegato(String.valueOf(documentoPrincipaleId));
                DocumentoRetBase64 documentoPrincipaleBase64 = docAreaProtoSoap.getDocumentoRegBase64(documentoPrincipaleId.intValue(),loginRet.getStrDST());
                if (documentoPrincipaleBase64.getLngErrNumber() == 0) {
                  String fileBase64 = documentoPrincipaleBase64.getFileBase64();
                  wsdmProtocolloAllegati[0].setContenuto(Base64.decode(fileBase64));
                }

              }

              // Lettura degli allegati
              if (registrazioneRet.getRegistrazione().getDescrizione().getAllegati() != null) {
                Allegati allegati = registrazioneRet.getRegistrazione().getDescrizione().getAllegati();
                List<Documento> documentiAllegati = allegati.getDocumento();
                for (int al = 0; al < documentiAllegati.size(); al++) {
                  wsdmProtocolloAllegati[al + 1] = new WSDMProtocolloAllegato();
                  wsdmProtocolloAllegati[al + 1].setNome(documentiAllegati.get(al).getNome());
                  wsdmProtocolloAllegati[al + 1].setTitolo(documentiAllegati.get(al).getDescrizioneDocumento());
                  
                  // Lettura dello stream dati del file
                  Long documentoAllegatoId = new Long(documentiAllegati.get(al).getId());
                  wsdmProtocolloAllegati[al + 1].setIdAllegato(String.valueOf(documentoAllegatoId));
                  DocumentoRetBase64 documentoAllegatoBase64 = docAreaProtoSoap.getDocumentoRegBase64(documentoAllegatoId.intValue(),loginRet.getStrDST());
                  if (documentoAllegatoBase64.getLngErrNumber() == 0) {
                    String fileBase64 = documentoAllegatoBase64.getFileBase64();
                    wsdmProtocolloAllegati[al + 1].setContenuto(Base64.decode(fileBase64));
                  }
                }
              }

              wsdmProtocolloDocumento.setAllegati(wsdmProtocolloAllegati);

            }

          }
        }
      }

      // Collegamento al fascicolo
      if (registrazioneRet != null) {
        if (registrazioneRet.getRegistrazione() != null) {
          if (registrazioneRet.getRegistrazione().getIntestazione() != null) {
            if (registrazioneRet.getRegistrazione().getIntestazione().getFascicolo() != null) {
              WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();
              Fascicolo fascicolo = registrazioneRet.getRegistrazione().getIntestazione().getFascicolo();
              wsdmFascicolo.setAnnoFascicolo(new Long(fascicolo.getAnno()));
              wsdmFascicolo.setNumeroFascicolo(fascicolo.getNumero());
              wsdmFascicolo.setDescrizioneFascicolo(fascicolo.getValue());

              // Classifica del fascicolo
              if (registrazioneRet.getRegistrazione().getIntestazione().getClassifica() != null) {
                wsdmFascicolo.setClassificaFascicolo(
                    registrazioneRet.getRegistrazione().getIntestazione().getClassifica().getCodiceTitolario());
              }

              wsdmProtocolloDocumento.setFascicolo(wsdmFascicolo);
            }
          }
        }
      }
      wsdmprotocolloDocumentoRes.setEsito(true);
      wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmProtocolloDocumento);

    } else {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio("Errore durante la lettura del protocollo ["
          + registrazioneRet.getLngErrNumber()
          + ", "
          + registrazioneRet.getStrErrString()
          + "]");
    }

  }

  @Override
  public WSDMProtocolloDocumentoRes _documentoInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {

    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    LoginRet loginRet = null;
    DOCAREAprotoSoap docAreaProtoSoap = null;
    try {

      StringBuffer messaggioCtr = new StringBuffer();
      if (DatagraphUtilityControllo.ctrDocumentoInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {
        docAreaProtoSoap = _getDOCAREAProtoSoap(username, password);
        loginRet = _login(docAreaProtoSoap, username, password);

        if (loginRet.getLngErrNumber() == 0) {
          _datagraphProtocolloInserisci(username, password, loginAttr, wsdmprotocolloDocumentoIn, wsdmprotocolloDocumentoRes,
              docAreaProtoSoap, loginRet);
        } else {
          wsdmprotocolloDocumentoRes.setEsito(false);
          wsdmprotocolloDocumentoRes.setMessaggio(
              "Errore durante la fase di login [" + loginRet.getLngErrNumber() + ", " + loginRet.getStrErrString() + "]");
        }

      } else {
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (Exception e) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(e.getMessage());
      logger.error("Errore (_documentoInserisci)", e);
    } finally {
      try {
        if (loginRet != null) {
          docAreaProtoSoap.logOut(loginRet.getStrDST());
        }
      } catch (Throwable t) {

      }
    }

    return wsdmprotocolloDocumentoRes;

  }

  @Override
  public WSDMProtocolloDocumentoRes _documentoLeggi(String username, String password, WSDMLoginAttr loginAttr, String numeroDocumento) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    LoginRet loginRet = null;
    DOCAREAprotoSoap docAreaProtoSoap = null;
    try {

      StringBuffer messaggioCtr = new StringBuffer();

      if (DatagraphUtilityControllo.ctrDocumentoLeggi(loginAttr, numeroDocumento, messaggioCtr)) {
        docAreaProtoSoap = _getDOCAREAProtoSoap(username, password);
        loginRet = _login(docAreaProtoSoap, username, password);

        if (loginRet.getLngErrNumber() == 0) {
          // Il numero documento e' un numero fittizio (non restituito dal
          // protocollo) composto dall'anno e dal numero di protocollo
          // (per esempio 2022/04)
          Long annoProtocollo = null;
          String numeroProtocollo = null;
          String[] numeroDocumentSplit = numeroDocumento.split("\\/");
          if (numeroDocumentSplit.length >= 1) annoProtocollo = new Long(numeroDocumentSplit[0]);
          if (numeroDocumentSplit.length >= 2) numeroProtocollo = numeroDocumentSplit[1];
          _datagraphProtocolloLeggi(username, annoProtocollo, numeroProtocollo, wsdmprotocolloDocumentoRes, docAreaProtoSoap, loginRet);
        } else {
          wsdmprotocolloDocumentoRes.setEsito(false);
          wsdmprotocolloDocumentoRes.setMessaggio(
              "Errore durante la fase di login [" + loginRet.getLngErrNumber() + ", " + loginRet.getStrErrString() + "]");
        }

      } else {
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (Exception e) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(e.getMessage());
      logger.error("Errore (_protocolloLeggi)", e);
    } finally {
      try {
        if (loginRet != null) {
          docAreaProtoSoap.logOut(loginRet.getStrDST());
        }
      } catch (Throwable t) {

      }
    }

    return wsdmprotocolloDocumentoRes;
  }

  @Override
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

    LoginRet loginRet = null;
    DOCAREAprotoSoap docAreaProtoSoap = null;
    try {

      StringBuffer messaggioCtr = new StringBuffer();
      if (DatagraphUtilityControllo.ctrFascicoloInserisci(loginAttr, wsdmfascicoloIn, messaggioCtr)) {
        docAreaProtoSoap = _getDOCAREAProtoSoap(username, password);
        loginRet = _login(docAreaProtoSoap, username, password);

        if (loginRet.getLngErrNumber() == 0) {
          _datagraphFascicoloInserisci(username, loginAttr, wsdmfascicoloIn, wsdmFascicoloRes, docAreaProtoSoap, loginRet);
        } else {
          wsdmFascicoloRes.setEsito(false);
          wsdmFascicoloRes.setMessaggio(
              "Errore durante la fase di login [" + loginRet.getLngErrNumber() + ", " + loginRet.getStrErrString() + "]");
        }

      } else {
        wsdmFascicoloRes.setEsito(false);
        wsdmFascicoloRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (Exception e) {
      wsdmFascicoloRes.setEsito(false);
      wsdmFascicoloRes.setMessaggio(e.getMessage());
      logger.error("Errore (_fascicoloInserisci)", e);
    } finally {
      try {
        if (loginRet != null) {
          docAreaProtoSoap.logOut(loginRet.getStrDST());
        }
      } catch (Throwable t) {

      }
    }

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

    LoginRet loginRet = null;
    DOCAREAprotoSoap docAreaProtoSoap = null;
    try {

      StringBuffer messaggioCtr = new StringBuffer();
      if (DatagraphUtilityControllo.ctrFascicoloLeggi(loginAttr, codiceFascicolo, annoFascicolo, numeroFascicolo, classificaFascicolo,
          messaggioCtr)) {
        docAreaProtoSoap = _getDOCAREAProtoSoap(username, password);
        loginRet = _login(docAreaProtoSoap, username, password);

        if (loginRet.getLngErrNumber() == 0) {
          _datagraphFascicoloLeggi(username, loginAttr, codiceFascicolo, annoFascicolo, numeroFascicolo, classificaFascicolo,
              oggettoFascicolo, wsdmFascicoloRes, docAreaProtoSoap, loginRet);

        } else {
          wsdmFascicoloRes.setEsito(false);
          wsdmFascicoloRes.setMessaggio(
              "Errore durante la fase di login [" + loginRet.getLngErrNumber() + ", " + loginRet.getStrErrString() + "]");
        }

      } else {
        wsdmFascicoloRes.setEsito(false);
        wsdmFascicoloRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (Exception e) {
      wsdmFascicoloRes.setEsito(false);
      wsdmFascicoloRes.setMessaggio(e.getMessage());
      logger.error("Errore (_fascicoloInserisci)", e);
    } finally {
      try {
        if (loginRet != null) {
          docAreaProtoSoap.logOut(loginRet.getStrDST());
        }
      } catch (Throwable t) {

      }
    }

    return wsdmFascicoloRes;
  }

  @Override
  public WSDMFascicoloRes _fascicoloMetadatiLeggi(String username, String password, WSDMLoginAttr loginAttr, String codiceFascicolo,
      Long annoFascicolo, String numeroFascicolo, String classificaFascicolo, String oggettoFascicolo) {
    return _fascicoloLeggi(username, password, loginAttr, codiceFascicolo, annoFascicolo, numeroFascicolo, classificaFascicolo,
        oggettoFascicolo);
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

    LoginRet loginRet = null;
    DOCAREAprotoSoap docAreaProtoSoap = null;
    try {

      StringBuffer messaggioCtr = new StringBuffer();
      if (DatagraphUtilityControllo.ctrInviaMail(loginAttr, wsdmInviaMail, messaggioCtr)) {
        docAreaProtoSoap = _getDOCAREAProtoSoap(username, password);
        loginRet = _login(docAreaProtoSoap, username, password);

        if (loginRet.getLngErrNumber() == 0) {
          _datagraphInviaMail(username, wsdmInviaMail, wsdmInviaMailRes, docAreaProtoSoap, loginRet);
        } else {
          wsdmInviaMailRes.setEsito(false);
          wsdmInviaMailRes.setMessaggio(
              "Errore durante la fase di login [" + loginRet.getLngErrNumber() + ", " + loginRet.getStrErrString() + "]");
        }

      } else {
        wsdmInviaMailRes.setEsito(false);
        wsdmInviaMailRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (Exception e) {
      wsdmInviaMailRes.setEsito(false);
      wsdmInviaMailRes.setMessaggio(e.getMessage());
      logger.error("Errore (_inviaMail)", e);
    } finally {
      try {
        if (loginRet != null) {
          docAreaProtoSoap.logOut(loginRet.getStrDST());
        }
      } catch (Throwable t) {

      }
    }

    return wsdmInviaMailRes;
  }

  /**
   * Richiesta di invio mail.
   * 
   * @param username
   * @param wsdmInviaMail
   * @param wsdmInviaMailRes
   * @param docAreaProtoSoap
   * @param loginRet
   * @throws NamingException
   * @throws RemoteException
   */
  private void _datagraphInviaMail(String username, WSDMInviaMail wsdmInviaMail, WSDMInviaMailRes wsdmInviaMailRes,
      DOCAREAprotoSoap docAreaProtoSoap, LoginRet loginRet) throws NamingException, RemoteException {

    Long annoProtocollo = null;
    String numeroProtocollo = null;

    if (wsdmInviaMail.getAnnoProtocollo() != null
        && wsdmInviaMail.getNumeroProtocollo() != null
        && !"".equals(wsdmInviaMail.getNumeroProtocollo())) {
      annoProtocollo = wsdmInviaMail.getAnnoProtocollo();
      numeroProtocollo = wsdmInviaMail.getNumeroProtocollo();
    } else if (wsdmInviaMail.getNumeroDocumento() != null && !"".equals(wsdmInviaMail.getNumeroDocumento())) {
      // Il numero documento e' un numero fittizio (non restituito dal
      // protocollo) composto dall'anno e dal numero di protocollo
      // (per esempio 2022/04)
      String[] numeroDocumentSplit = wsdmInviaMail.getNumeroDocumento().split("\\/");
      if (numeroDocumentSplit.length >= 1) annoProtocollo = new Long(numeroDocumentSplit[0]);
      if (numeroDocumentSplit.length >= 2) numeroProtocollo = numeroDocumentSplit[1];
    }

    String oggettoMail = wsdmInviaMail.getOggettoMail();
    String testoMail = wsdmInviaMail.getTestoMail();


    
    // Aggiornamento del 02/03/2022 da parte di Rodolfo Barbolini
    // Ho provveduto ad aggiungere una nuova variante della funzione InvaMail, ovvero InviaMail3 che prenderà i seguenti parametri:
    //
    // InviaMail3(Anno Integer, Numero Integer, Oggetto String, TestoMail
    // String, WithSegnaturaXML Boolean, AccountMailMittente String,
    // Destinatario String, strDST String) Oggetto restituito RegistrazioneRet
    //
    // Quindi nel parametro “Destinatario” è possibile specificare 1 solo
    // indirizzo e-mail a cui destinare la registrazione.
    //
    // L’indirizzo mail deve corrispondere ad uno dei soggetti caricati nella
    // registrazione. Oggetto e TestoMail possono anche essere passate come stringa vuota in
    // tal caso verranno valorizzate con valori configurati in procedura
    //
    // Nota: il parametro Destinatario puo' essere specificato solo con il
    // parametro WithSegnaturaXML = False
    //
    // Per l’interoperabilità, nel file di segnatura sono riportati tutti i
    // destinatari che devono corrispondere poi ai destinatari email
    //   
    
    //  RegistrazioneRet registrazioneRet = docAreaProtoSoap.inviaMail(annoProtocollo.intValue(), Integer.valueOf(numeroProtocollo),
    //  oggettoMail, testoMail, false, loginRet.getStrDST());
    
    RegistrazioneRet registrazioneRet = docAreaProtoSoap.inviaMail3(annoProtocollo.intValue(), Integer.valueOf(numeroProtocollo),
        oggettoMail, testoMail, false, null, wsdmInviaMail.getDestinatariMail()[0], loginRet.getStrDST());

    if (registrazioneRet.getLngErrNumber() == 0) {
      wsdmInviaMailRes.setEsito(true);
    } else {
      wsdmInviaMailRes.setEsito(false);
      wsdmInviaMailRes.setMessaggio("Errore durante la richiesta di inoltro email ["
          + registrazioneRet.getLngErrNumber()
          + ", "
          + registrazioneRet.getStrErrString()
          + "]");
    }

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
    LoginRet loginRet = null;
    
    DOCAREAprotoSoap docAreaProtoSoap = null;
    try {

      StringBuffer messaggioCtr = new StringBuffer();
      if (DatagraphUtilityControllo.ctrLeggiClassifiche(loginAttr, codice, descrizione, messaggioCtr)) {
        docAreaProtoSoap = _getDOCAREAProtoSoap(username, password);
        loginRet = _login(docAreaProtoSoap, username, password);

        if (loginRet.getLngErrNumber() == 0) {
          
          int titolo = 0;
          int classe = 0; 
          String[] classificaSplit = codice.split("\\.");
          if (classificaSplit.length >= 1) titolo = Integer.parseInt(classificaSplit[0]);
          if (classificaSplit.length >= 2) classe = Integer.parseInt(classificaSplit[1]);
          
          VociTitolarioRet vociTitolarioRet = docAreaProtoSoap.getVociTitolario(titolo, classe, loginRet.getStrDST());
          
          if (vociTitolarioRet.getLngErrNumber() == 0) {
            
            if (vociTitolarioRet.getVoci() != null) {
              ArrayOfVoceTitolario arrayTitolario = vociTitolarioRet.getVoci();
              List<VoceTitolario> listaTitolario = arrayTitolario.getVoceTitolario();
              if (listaTitolario != null && listaTitolario.size() > 0) {
                
                WSDMClassifica[] wsdmClassifiche = new WSDMClassifica[listaTitolario.size()];
                
                for (int t = 0; t < listaTitolario.size(); t++) {
                  wsdmClassifiche[t] = new WSDMClassifica();
                  
                  int titoloRet = listaTitolario.get(t).getTitolo();
                  int classeRet = listaTitolario.get(t).getClasse();
                  int sottoclasseRet = listaTitolario.get(t).getSottoclasse();
                  
                  wsdmClassifiche[t].setCodice(titoloRet + "." + classeRet + "." + sottoclasseRet);
                  wsdmClassifiche[t].setDescrizione(listaTitolario.get(t).getDescrizione());
                }
                
                wsdmListaClassificheRes.setListaClassifiche(wsdmClassifiche);
                
              }
            }
            wsdmListaClassificheRes.setEsito(true);
          } else {
            wsdmListaClassificheRes.setEsito(false);
            wsdmListaClassificheRes.setMessaggio("Errore durante la lettura delle classifiche ["
                + vociTitolarioRet.getLngErrNumber()
                + ", "
                + vociTitolarioRet.getStrErrString()
                + "]");
          }
          

        } else {
          wsdmListaClassificheRes.setEsito(false);
          wsdmListaClassificheRes.setMessaggio(
              "Errore durante la fase di login [" + loginRet.getLngErrNumber() + ", " + loginRet.getStrErrString() + "]");
        }

      } else {
        wsdmListaClassificheRes.setEsito(false);
        wsdmListaClassificheRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (Exception e) {
      wsdmListaClassificheRes.setEsito(false);
      wsdmListaClassificheRes.setMessaggio(e.getMessage());
      logger.error("Errore (_listaClassifiche)", e);
    } finally {
      try {
        if (loginRet != null) {
          docAreaProtoSoap.logOut(loginRet.getStrDST());
        }
      } catch (Throwable t) {

      }
    }
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
