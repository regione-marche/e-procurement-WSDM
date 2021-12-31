package it.maggioli.eldasoft.bl.prisma;

import it.dedagroup.ws.salvadocumento.servizi.SalvaDocumentoPortType;
import it.finmatica.affarigenerali.ducd.pec.ParametriIngresso;
import it.finmatica.affarigenerali.ducd.pec.ParametriUscita;
import it.finmatica.affarigenerali.ducd.pec.PecSOAPImpl;
import it.finmatica.affarigenerali.ducd.pec.PecSOAPImplServiceLocator;
import it.finmatica.dmserver.wscxf.service.AttachService;
import it.finmatica.dmserver.wscxf.service.AttachServiceService;
import it.finmatica.dmserver.wscxf.service.DownloadAttachResponse2;
import it.finmatica.protocolloextended.ProtocolloExtendedService;
import it.finmatica.protocolloextended.ProtocolloExtendedServiceServiceLocator;
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
import it.maggioli.eldasoft.ws.dm.WSDMTrasmissioneIn;
import it.maggioli.eldasoft.ws.dm.WSDMTrasmissioneRes;
import it.maggioli.eldasoft.ws.dm.WSDMVerificaMailRes;
import it.prisma.docarea.protosoap.DOCAREAProtoLocator;
import it.prisma.docarea.protosoap.DOCAREAProtoSoap;
import it.prisma.docarea.protosoap.InserimentoRet;
import it.prisma.docarea.protosoap.LoginRet;
import it.prisma.docarea.protosoap.ProtocollazioneRet;
import it.prisma.docarea.protosoap.SmistamentoActionRet;
import it.prisma.getdocumento.result.ALLEGATO;
import it.prisma.getdocumento.result.FILE;
import it.prisma.getdocumento.result.RAPPORTO;
import it.prisma.getfascicoli.ROOT;
import it.prisma.getinfopec.result.MEMO;
import it.prisma.getinfopec.result.MEMOINVIATI;
import it.prisma.segnaturaprotocollazione.AOO;
import it.prisma.segnaturaprotocollazione.Allegati;
import it.prisma.segnaturaprotocollazione.Amministrazione;
import it.prisma.segnaturaprotocollazione.ApplicativoProtocollo;
import it.prisma.segnaturaprotocollazione.Classifica;
import it.prisma.segnaturaprotocollazione.Descrizione;
import it.prisma.segnaturaprotocollazione.DescrizioneDocumento;
import it.prisma.segnaturaprotocollazione.Destinatario;
import it.prisma.segnaturaprotocollazione.Documento;
import it.prisma.segnaturaprotocollazione.Fascicolo;
import it.prisma.segnaturaprotocollazione.Identificatore;
import it.prisma.segnaturaprotocollazione.IndirizzoTelematico;
import it.prisma.segnaturaprotocollazione.Intestazione;
import it.prisma.segnaturaprotocollazione.Mittente;
import it.prisma.segnaturaprotocollazione.Parametro;
import it.prisma.segnaturaprotocollazione.Persona;
import it.prisma.segnaturaprotocollazione.Segnatura;
import it.prisma.segnaturaprotocollazione.TipoDocumento;
import it.prisma.segnaturaprotocollazione.UnitaOrganizzativa;

import java.io.ByteArrayOutputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.activation.DataHandler;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.ws.BindingProvider;

import org.apache.axis.client.Call;
import org.apache.axis.client.Stub;
import org.apache.commons.lang.StringUtils;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.message.Message;
import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.xml.sax.InputSource;

public class PrismaManager implements IWSDMManager {

  static Logger              logger                                    = Logger.getLogger(PrismaManager.class);

  static private String      PRISMA_DOCAREAPROTO                       = "java:comp/env/PRISMA_DOCAREAPROTO";
  static private String      PRISMA_DOCAREAPROTO_NOT_DEFINED           = "PRISMA: l'indirizzo del servizio di protocollo non e' definito";

  static private String      PRISMA_DOCAREAEXTENDED                    = "java:comp/env/PRISMA_DOCAREAEXTENDED";
  static private String      PRISMA_DOCAREAEXTENDED_NOT_DEFINED        = "PRISMA: l'indirizzo del servizio esteso di protocollo non e' definito";

  static private String      PRISMA_DUCDSERVICES                       = "java:comp/env/PRISMA_DUCDSERVICES";
  static private String      PRISMA_DUCDSERVICES_NOT_DEFINED           = "PRISMA: l'indirizzo del servizio PEC non e' definito";

  static private String      PRISMA_DMS_ATTACH                         = "java:comp/env/PRISMA_DMS_ATTACH";
  static private String      PRISMA_DMS_ATTACH_NOT_DEFINED             = "PRISMA: l'indirizzo del servizio DMServerWSCXF/AttachServicePort non e' definito";

  static private String      PRISMA_DENOMINAZIONE_AMMINISTRAZIONE      = "java:comp/env/PRISMA_DENOMINAZIONE_AMMINISTRAZIONE";
  static private String      PRISMA_EMAIL_AMMINISTRAZIONE              = "java:comp/env/PRISMA_EMAIL_AMMINISTRAZIONE";

  static private String      PRISMA_CODICE_AMMINISTRAZIONE             = "java:comp/env/PRISMA_CODICE_AMMINISTRAZIONE";
  static private String      PRISMA_CODICE_AMMINISTRAZIONE_NOT_DEFINED = "PRISMA: il codice amministrazione/ente non e' definito";

  static private String      PRISMA_CODICE_AOO                         = "java:comp/env/PRISMA_CODICE_AOO";
  static private String      PRISMA_CODICE_AOO_NOT_DEFINED             = "PRISMA: il codice AOO non e' definito";

  static private String      PRISMA_NOME_APPLICATIVO                   = "java:comp/env/PRISMA_NOME_APPLICATIVO";
  static private String      PRISMA_TIPO_SMISTAMENTO                   = "java:comp/env/PRISMA_TIPO_SMISTAMENTO";
  static private String      PRISMA_TIPO_REGISTRO                      = "java:comp/env/PRISMA_TIPO_REGISTRO";
  static private String      PRISMA_TIPO_DOCUMENTO_PER_REGISTRO        = "java:comp/env/PRISMA_TIPO_DOCUMENTO_PER_REGISTRO";

  static private String      PRISMA_RICERCA_DOCUMENTI_FASCICOLO_GIORNI = "java:comp/env/PRISMA_RICERCA_DOCUMENTI_FASCICOLO_GIORNI";
  static private String      PRISMA_RICERCA_DOCUMENTI_NUMERO_MASSIMO   = "java:comp/env/PRISMA_RICERCA_DOCUMENTI_NUMERO_MASSIMO";

  static public final String PROTOCOLLO_IN_ENTRATA                     = "E";
  static public final String PROTOCOLLO_IN_USCITA                      = "U";
  static public final String PROTOCOLLO_INTERNO                        = "I";

  static public final String MODALITA_USCITA                           = "PAR";
  static public final String MODALITA_ENTRATA                          = "ARR";
  static public final String MODALITA_INTERNO                          = "INT";

  static public final String INDIRIZZO_TELEMATICO_TIPO                 = "smtp";

  static public final String RESULT_OK                                 = "OK";
  static public final String RESULT_KO                                 = "KO";

  static public final String DMS_RESULT_OK                             = "0";
  static public final String DMS_RESULT_KO                             = "-1";
  
  static private String      PRISMA_ESEGUI_SMISTAMENTO                = "java:comp/env/PRISMA_ESEGUI_SMISTAMENTO";
  static public final String ESEGUI_SMISTAMENTO_SI                    = "SI";

  /**
   * Ottiene il riferimento al servizio di protocollo.
   * 
   * @return
   * @throws Exception
   */
  private DOCAREAProtoSoap _getDOCAREAProtoSoap(String username, String password) throws Exception {

    String url = InitialContext.doLookup(PRISMA_DOCAREAPROTO);
    if (url == null || (url != null && "".equals(url.trim()))) {
      throw new Exception(PRISMA_DOCAREAPROTO_NOT_DEFINED);
    }

    DOCAREAProtoLocator docAreaProtoLocator = new DOCAREAProtoLocator();
    DOCAREAProtoSoap docAreaProtoSoap = docAreaProtoLocator.getDOCAREAProtoSoap(new URL(url));

    ((Stub) docAreaProtoSoap)._setProperty(Call.USERNAME_PROPERTY, username);
    ((Stub) docAreaProtoSoap)._setProperty(Call.PASSWORD_PROPERTY, password);

    return docAreaProtoSoap;

  }

  private AttachService _getAttachService(String username, String password) throws Exception {

    String url = InitialContext.doLookup(PRISMA_DMS_ATTACH);
    if (url == null || (url != null && "".equals(url.trim()))) {
      throw new Exception(PRISMA_DMS_ATTACH_NOT_DEFINED);
    }

    AttachServiceService attachServiceService = new AttachServiceService();
    AttachService attachService = attachServiceService.getAttachServicePort();
    Client clientAttach = ClientProxy.getClient(attachService);
    clientAttach.getRequestContext().put(Message.ENDPOINT_ADDRESS, url);

    BindingProvider bp = (BindingProvider) attachService;
    bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, username);
    bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, password);

    return attachService;

  }

  private ProtocolloExtendedService _getProtocolloExtended(String username, String password) throws Exception {

    String url = InitialContext.doLookup(PRISMA_DOCAREAEXTENDED);
    if (url == null || (url != null && "".equals(url.trim()))) {
      throw new Exception(PRISMA_DOCAREAEXTENDED_NOT_DEFINED);
    }

    ProtocolloExtendedServiceServiceLocator protocolloExtendedLocator = new ProtocolloExtendedServiceServiceLocator();
    ProtocolloExtendedService protocolloExtended = protocolloExtendedLocator.getProtocolloExtendedServicePort(new URL(url));

    ((Stub) protocolloExtended)._setProperty(Call.USERNAME_PROPERTY, username);
    ((Stub) protocolloExtended)._setProperty(Call.PASSWORD_PROPERTY, password);

    return protocolloExtended;

  }

  private PecSOAPImpl _getPecSoap(String username, String password) throws Exception {

    String url = InitialContext.doLookup(PRISMA_DUCDSERVICES);
    if (url == null || (url != null && "".equals(url.trim()))) {
      throw new Exception(PRISMA_DUCDSERVICES_NOT_DEFINED);
    }

    PecSOAPImplServiceLocator pecSOAPServiceLocator = new PecSOAPImplServiceLocator();
    PecSOAPImpl pecSOAP = pecSOAPServiceLocator.getPecSOAPImpl(new URL(url));

    ((Stub) pecSOAP)._setProperty(Call.USERNAME_PROPERTY, username);
    ((Stub) pecSOAP)._setProperty(Call.PASSWORD_PROPERTY, password);

    return pecSOAP;

  }

  /**
   * Login.
   * 
   * @param docAreaProtoSoap
   * @param username
   * @param password
   * @return
   * @throws Exception
   */
  private LoginRet _login(DOCAREAProtoSoap docAreaProtoSoap, String username, String password) throws Exception {

    String codente = InitialContext.doLookup(PRISMA_CODICE_AMMINISTRAZIONE);
    if (codente == null || (codente != null && "".equals(codente.trim()))) {
      throw new Exception(PRISMA_CODICE_AMMINISTRAZIONE_NOT_DEFINED);
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

    try {

      StringBuffer messaggioCtr = new StringBuffer();
      if (PrismaUtilityControllo.ctrProtocolloInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {
        DOCAREAProtoSoap docAreaProtoSoap = _getDOCAREAProtoSoap(username, password);
        ProtocolloExtendedService protocolloExtended = this._getProtocolloExtended(username, password);
        LoginRet loginRet = _login(docAreaProtoSoap, username, password);

        if (loginRet.getLngErrNumber() == 0) {
          _prismaProtocolloInserisci(username, password, loginAttr, wsdmprotocolloDocumentoIn, wsdmprotocolloDocumentoRes,
              docAreaProtoSoap, protocolloExtended, loginRet);
        } else {
          wsdmprotocolloDocumentoRes.setEsito(false);
          wsdmprotocolloDocumentoRes.setMessaggio("Errore durante la fase di login ["
              + loginRet.getLngErrNumber()
              + ", "
              + loginRet.getStrErrString()
              + "]");
        }

      } else {
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (Exception e) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(e.getMessage());
      logger.error("Errore (_protocolloInserisci)", e);
    }

    return wsdmprotocolloDocumentoRes;
  }

  /**
   * Inserimento in protocollo.
   * 
   * @param username
   * @param password
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
  private void _prismaProtocolloInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn, WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes,
      DOCAREAProtoSoap docAreaProtoSoap, ProtocolloExtendedService protocolloExtended, LoginRet loginRet) throws NamingException,
      Exception, RemoteException, JAXBException {
    boolean _ok;
    _ok = true;

    WSDMProtocolloDocumento wsdmProtocolloDocumento = new WSDMProtocolloDocumento();

    String codiceAmministrazione = InitialContext.doLookup(PRISMA_CODICE_AMMINISTRAZIONE);
    String denominazioneAmministrazione = InitialContext.doLookup(PRISMA_DENOMINAZIONE_AMMINISTRAZIONE);
    String emailAmministrazione = InitialContext.doLookup(PRISMA_EMAIL_AMMINISTRAZIONE);

    // Gestione del codice AOO
    String codiceAOO = null;
    if (loginAttr != null && loginAttr.getCodiceAOO() != null && !"".equals(loginAttr.getCodiceAOO().trim())) {
      codiceAOO = loginAttr.getCodiceAOO();
    } else {
      codiceAOO = InitialContext.doLookup(PRISMA_CODICE_AOO);
    }

    if (codiceAOO == null || (codiceAOO != null && "".equals(codiceAOO.trim()))) {
      throw new Exception(PRISMA_CODICE_AOO_NOT_DEFINED);
    }

    String nomeApplicativo = InitialContext.doLookup(PRISMA_NOME_APPLICATIVO);
    String tipoSmistamento = InitialContext.doLookup(PRISMA_TIPO_SMISTAMENTO);
    String tipoDocumentoPerRegistro = InitialContext.doLookup(PRISMA_TIPO_DOCUMENTO_PER_REGISTRO);

    String dstToken = loginRet.getStrDST();

    // Segnatura protocollo
    Segnatura prismaSegnatura = new Segnatura();

    // Intestazione
    Intestazione prismaIntestazione = new Intestazione();
    prismaSegnatura.setIntestazione(prismaIntestazione);

    // Oggetto
    if (wsdmprotocolloDocumentoIn.getOggetto() != null) {
      prismaIntestazione.setOggetto(wsdmprotocolloDocumentoIn.getOggetto());
    }

    // Identificatore
    _gestioneIdentificatore(wsdmprotocolloDocumentoIn, codiceAmministrazione, codiceAOO, prismaIntestazione);

    // Mittenti e Destinatari
    if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
      _gestioneMittentiEsterni(wsdmprotocolloDocumentoIn, prismaIntestazione);
      _gestioneDestinatarioInterno(codiceAmministrazione, denominazioneAmministrazione, emailAmministrazione, codiceAOO,
          wsdmprotocolloDocumentoIn.getIdUnitaOperativaDestinataria(), prismaIntestazione);
    } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      _gestioneMittenteInterno(codiceAmministrazione, denominazioneAmministrazione, emailAmministrazione, codiceAOO,
          wsdmprotocolloDocumentoIn.getIdUnitaOperativaMittente(), prismaIntestazione);
      _gestioneDestinatariEsterni(wsdmprotocolloDocumentoIn, prismaIntestazione);
    } else if (WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      _gestioneMittenteInterno(codiceAmministrazione, denominazioneAmministrazione, emailAmministrazione, codiceAOO,
          wsdmprotocolloDocumentoIn.getIdUnitaOperativaMittente(), prismaIntestazione);
      _gestioneDestinatarioInterno(codiceAmministrazione, denominazioneAmministrazione, emailAmministrazione, codiceAOO,
          wsdmprotocolloDocumentoIn.getIdUnitaOperativaDestinataria(), prismaIntestazione);
    }

    // Classifica
    _gestioneClassifica(wsdmprotocolloDocumentoIn, codiceAmministrazione, codiceAOO, prismaIntestazione);

    // Fascicolo
    WSDMFascicolo wsdmFascicoloIn = wsdmprotocolloDocumentoIn.getFascicolo();
    if (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
      Fascicolo prismaFascicolo = new Fascicolo();
      prismaIntestazione.setFascicolo(prismaFascicolo);
      prismaFascicolo.setAnno(String.valueOf(wsdmFascicoloIn.getAnnoFascicolo()));
      prismaFascicolo.setNumero(wsdmFascicoloIn.getNumeroFascicolo());

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

        Fascicolo prismaFascicolo = new Fascicolo();
        prismaIntestazione.setFascicolo(prismaFascicolo);
        prismaFascicolo.setAnno(String.valueOf(wsdmFascicoloRes.getFascicolo().getAnnoFascicolo()));
        prismaFascicolo.setNumero(wsdmFascicoloRes.getFascicolo().getNumeroFascicolo());

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
    _gestioneApplicativoProtocollo(wsdmprotocolloDocumentoIn.getStruttura(), nomeApplicativo, username, tipoSmistamento, prismaSegnatura);

    // Descrizione (contiene documento principale e lista degli allegati)
    Descrizione prismaDescrizione = new Descrizione();
    prismaSegnatura.setDescrizione(prismaDescrizione);

    // Inserimento degli allegati
    WSDMProtocolloAllegato[] wsmdAllegati = wsdmprotocolloDocumentoIn.getAllegati();
    if (wsmdAllegati != null && wsmdAllegati.length > 0 && _ok) {
      // Documento principale
      InserimentoRet inserimentoRetDocumentoPrincipale = docAreaProtoSoap.inserimento(username, dstToken, wsmdAllegati[0].getContenuto());
      if (inserimentoRetDocumentoPrincipale.getLngErrNumber() == 0) {

        _ok = true;

        Documento prismaDocumentoPrincipale = new Documento();
        prismaDocumentoPrincipale.setId(inserimentoRetDocumentoPrincipale.getLngDocID());
        prismaDocumentoPrincipale.setNome(wsmdAllegati[0].getNome());

        if (tipoDocumentoPerRegistro != null && !"".equals(tipoDocumentoPerRegistro)) {
          TipoDocumento tipoDocumento = new TipoDocumento();
          tipoDocumento.setContent(tipoDocumentoPerRegistro);
          prismaDocumentoPrincipale.setTipoDocumento(tipoDocumento);
        }

        DescrizioneDocumento descrizioneDocumentoPrincipale = new DescrizioneDocumento();
        descrizioneDocumentoPrincipale.setContent(wsmdAllegati[0].getTitolo());
        prismaDocumentoPrincipale.setDescrizioneDocumento(descrizioneDocumentoPrincipale);

        prismaDescrizione.setDocumento(prismaDocumentoPrincipale);

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

        List<Allegati> prismaListaAllegati = prismaDescrizione.getAllegati();

        for (int ai = 1; ai < wsmdAllegati.length; ai++) {
          InserimentoRet inserimentoRetAllegato = docAreaProtoSoap.inserimento(username, dstToken, wsmdAllegati[ai].getContenuto());
          if (inserimentoRetAllegato.getLngErrNumber() == 0 && _ok) {

            _ok = true;

            Documento prismaDocumentoAllegato = new Documento();
            prismaDocumentoAllegato.setId(inserimentoRetAllegato.getLngDocID());
            prismaDocumentoAllegato.setNome(wsmdAllegati[ai].getNome());

            DescrizioneDocumento descrizioneAllegato = new DescrizioneDocumento();
            descrizioneAllegato.setContent(wsmdAllegati[ai].getTitolo());
            prismaDocumentoAllegato.setDescrizioneDocumento(descrizioneAllegato);

            Allegati primaAllegatoSingolo = new Allegati();
            List<Documento> listaDocumentiInAllegato = primaAllegatoSingolo.getDocumento();
            listaDocumentiInAllegato.add(prismaDocumentoAllegato);
            prismaListaAllegati.add(primaAllegatoSingolo);

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
      }
    }

    if (_ok) {
      // Conversione in stringa XML
      StringWriter xmlStringWriter = new StringWriter();
      JAXBContext jaxbLocalContext = JAXBContext.newInstance(Segnatura.class);
      jaxbLocalContext.createMarshaller().marshal(prismaSegnatura, xmlStringWriter);
      String xmlPrismaSegnatura = xmlStringWriter.toString();

      // Invio dei dati di protocollazione
      ProtocollazioneRet protocollazioneRet = docAreaProtoSoap.protocollazione(username, dstToken, xmlPrismaSegnatura.getBytes("UTF-8"));
      if (protocollazioneRet.getLngErrNumber() == 0) {

        _ok = true;

        wsdmprotocolloDocumentoRes.setEsito(true);

        wsdmProtocolloDocumento.setNumeroProtocollo(String.valueOf(protocollazioneRet.getLngNumPG()));
        wsdmProtocolloDocumento.setAnnoProtocollo(protocollazioneRet.getLngAnnoPG());
        Calendar dataProtocolloToday = Calendar.getInstance();
        wsdmProtocolloDocumento.setDataProtocollo(dataProtocolloToday.getTime());

        // Inserimento dello smistamento (presa in carico). Solo per protocollo in ingresso
        // 09/01/2020: riabilitata presa in carico per tutti i versi di protocollazione.
        // if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
        //  _prismaSmistamento(username, wsdmprotocolloDocumentoIn, codiceAmministrazione, codiceAOO, protocollazioneRet, docAreaProtoSoap, dstToken);
        // }
          
        // 13/05/2020 - Issue JIRA WSDM-49, WSDM-50, WSDM-51
        // Controllo esecuzione operazione "smistamentoAction". Su richiesta del
        // Comune di Rivoli bisogna inibire la chiamata all'operazione
        // "smistamentoAction" per impedire l'inserimento dello smistamento
        // aggiuntivo oltre a quello gia' indicato con la richiesta di
        // protocollazione. Di default si assume che lo smistamento sia attivo.
        // La nuova proprieta' non e' obbligatoria, se non presente si assume di
        // default "SI". Se presente si legge il valore. Vedi JIRA WSDM-49
        String eseguiSmistamento = "SI";
        try {
          eseguiSmistamento = InitialContext.doLookup(PRISMA_ESEGUI_SMISTAMENTO);
        } catch (NamingException e) {

        }

        if (ESEGUI_SMISTAMENTO_SI.equals(eseguiSmistamento.toUpperCase())) {
          _prismaSmistamento(username, wsdmprotocolloDocumentoIn, codiceAmministrazione, codiceAOO, protocollazioneRet, docAreaProtoSoap,
              dstToken);
        }

        // Lettura del iddocumento
        try {

          it.prisma.getdocumento.ROOT richiestaDettaglioDocumento = new it.prisma.getdocumento.ROOT();
          richiestaDettaglioDocumento.setANNO(String.valueOf(protocollazioneRet.getLngAnnoPG()));
          richiestaDettaglioDocumento.setNUMERO(String.valueOf(protocollazioneRet.getLngNumPG()));
          richiestaDettaglioDocumento.setTIPOREGISTRO(InitialContext.doLookup(PRISMA_TIPO_REGISTRO).toString());

          richiestaDettaglioDocumento.setUTENTE(username);

          StringWriter xmlStringWriterRichiestaDettaglioDocumento = new StringWriter();
          JAXBContext jaxbRichiestaDettaglioDocumento = JAXBContext.newInstance(it.prisma.getdocumento.ROOT.class);
          jaxbRichiestaDettaglioDocumento.createMarshaller().marshal(richiestaDettaglioDocumento,
              xmlStringWriterRichiestaDettaglioDocumento);
          String xmlRichiestaDettaglioDocumento = xmlStringWriterRichiestaDettaglioDocumento.toString();
          String xmlRispostaDettaglioDocumento = protocolloExtended.getDocumento(username, loginRet.getStrDST(),
              xmlRichiestaDettaglioDocumento);

          JAXBContext jaxbRispostaDettaglioDocumento = JAXBContext.newInstance(it.prisma.getdocumento.result.PROTOCOLLO.class);
          Object _d = jaxbRispostaDettaglioDocumento.createUnmarshaller().unmarshal(
              new InputSource(new StringReader(xmlRispostaDettaglioDocumento)));
          it.prisma.getdocumento.result.PROTOCOLLO rispostaDettaglioDocumento = (it.prisma.getdocumento.result.PROTOCOLLO) _d;

          wsdmProtocolloDocumento.setNumeroDocumento(rispostaDettaglioDocumento.getDOC().getIDDOCUMENTO());
        } catch (Exception e) {

        }

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
   * Inserimento dello smistamento.
   * 
   * @param username
   * @param wsdmprotocolloDocumentoIn
   * @param codiceAmministrazione
   * @param codiceAOO
   * @param protocollazioneRet
   * @throws NamingException
   */
  private void _prismaSmistamento(String username, WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn, String codiceAmministrazione,
      String codiceAOO, ProtocollazioneRet protocollazioneRet, DOCAREAProtoSoap docAreaProtoSoap, String dstToken) throws NamingException {

    try {

      it.prisma.segnaturaaltri.Segnatura prismaSmistamentoSegnatura = new it.prisma.segnaturaaltri.Segnatura();
      it.prisma.segnaturaaltri.Intestazione prismaSmistamentoIntestazione = new it.prisma.segnaturaaltri.Intestazione();
      it.prisma.segnaturaaltri.Identificatore prismaSmistamentoIdentificatore = new it.prisma.segnaturaaltri.Identificatore();

      prismaSmistamentoSegnatura.setIntestazione(prismaSmistamentoIntestazione);
      prismaSmistamentoIntestazione.setIdentificatore(prismaSmistamentoIdentificatore);

      // Codice amministrazione
      if (codiceAmministrazione != null) {
        prismaSmistamentoIdentificatore.setCodiceAmministrazione(codiceAmministrazione);
      }

      // Codice AOO
      if (codiceAOO != null) {
        prismaSmistamentoIdentificatore.setCodiceAOO(codiceAOO);
      }

      // Numero protocollo
      prismaSmistamentoIdentificatore.setNumeroProtocollo(String.valueOf(protocollazioneRet.getLngNumPG()));
      prismaSmistamentoIdentificatore.setAnnoProtocollo(String.valueOf(protocollazioneRet.getLngAnnoPG()));
      prismaSmistamentoIdentificatore.setTipoRegistroProtocollo(InitialContext.doLookup(PRISMA_TIPO_REGISTRO).toString());

      it.prisma.segnaturaaltri.ApplicativoProtocollo prismaSmistamentoApplicativoProtocollo = new it.prisma.segnaturaaltri.ApplicativoProtocollo();
      prismaSmistamentoSegnatura.setApplicativoProtocollo(prismaSmistamentoApplicativoProtocollo);
      List<it.prisma.segnaturaaltri.Parametro> listaParametri = prismaSmistamentoApplicativoProtocollo.getParametro();

      // Utente
      it.prisma.segnaturaaltri.Parametro parametroSmistamentoUtente = new it.prisma.segnaturaaltri.Parametro();
      parametroSmistamentoUtente.setNome("utente");
      parametroSmistamentoUtente.setValore(username);
      listaParametri.add(parametroSmistamentoUtente);

      // Codice UO, in questo caso e' l'unita' protocollante.
      // 19/12/2019 non si considera "struttura" ma "idunitaoperativadestinataria"
      if (wsdmprotocolloDocumentoIn.getIdUnitaOperativaDestinataria() != null) {
        it.prisma.segnaturaaltri.Parametro parametroSmistamentoUO = new it.prisma.segnaturaaltri.Parametro();
        parametroSmistamentoUO.setNome("uo");
        parametroSmistamentoUO.setValore(wsdmprotocolloDocumentoIn.getIdUnitaOperativaDestinataria());
        listaParametri.add(parametroSmistamentoUO);
      }

      // Azione
      it.prisma.segnaturaaltri.Parametro parametroSmistamentoAzione = new it.prisma.segnaturaaltri.Parametro();
      parametroSmistamentoAzione.setNome("azione");
      parametroSmistamentoAzione.setValore("ESEGUI");
      listaParametri.add(parametroSmistamentoAzione);
      
      
      
      // Conversione in stringa XML
      StringWriter xmlStringWriter = new StringWriter();
      JAXBContext jaxbLocalContext = JAXBContext.newInstance(it.prisma.segnaturaaltri.Segnatura.class);
      jaxbLocalContext.createMarshaller().marshal(prismaSmistamentoSegnatura, xmlStringWriter);
      String xmlPrismaSmistamentoSegnatura = xmlStringWriter.toString();

      // Invio dei dati di protocollazione
      SmistamentoActionRet smistamentoRet = docAreaProtoSoap.smistamentoAction(username, dstToken, xmlPrismaSmistamentoSegnatura.getBytes("UTF-8"));
      
      // error_number: e' l'identificativo dell'errore (0 in caso di esito positivo).
      // error_description: e' la descrizione dell'errore ("" in caso di esito positivo).
      if (smistamentoRet.getLngErrNumber() != 0) {
        logger.error("Si e' verificato un errore durante il tentativo di invio dello smistamento: " + smistamentoRet.getLngErrNumber() + " - " + smistamentoRet.getStrErrString());
      }

    } catch (Exception e) {
      logger.error("Si e' verificato un errore durante il tentativo di invio dello smistamento: " + e.getMessage());
    }
  }

  /**
   * Gestione dei destinatari interni (in questo caso si tratta di un unico
   * destinatario corrispondente all'amministrazione).
   * 
   * @param codiceAmministrazione
   * @param denominazioneAmministrazione
   * @param emailAmministrazione
   * @param codiceAOO
   * @param codiceUO
   * @param prismaIntestazione
   */
  private void _gestioneDestinatarioInterno(String codiceAmministrazione, String denominazioneAmministrazione, String emailAmministrazione,
      String codiceAOO, String codiceUO, Intestazione prismaIntestazione) {
    List<Destinatario> prismaListaDestinatari = prismaIntestazione.getDestinatario();
    Destinatario prismaDestinatarioSingolo = new Destinatario();
    Amministrazione prismaAmministrazione = _gestioneAmministrazioneMittenteDestinataria(codiceAmministrazione,
        denominazioneAmministrazione, emailAmministrazione, codiceUO);
    prismaDestinatarioSingolo.setAmministrazione(prismaAmministrazione);
    if (codiceAOO != null) {
      AOO prismaAOO = new AOO();
      prismaAOO.setCodiceAOO(codiceAOO);
      prismaDestinatarioSingolo.setAOO(prismaAOO);
    }
    prismaListaDestinatari.add(prismaDestinatarioSingolo);
  }

  /**
   * Gestione dei mittenti esterni, mittenti di un protocollo in entrata.
   * 
   * @param wsdmprotocolloDocumentoIn
   * @param prismaIntestazione
   */
  private void _gestioneMittentiEsterni(WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn, Intestazione prismaIntestazione) {
    WSDMProtocolloAnagrafica[] wsdmMittenti = wsdmprotocolloDocumentoIn.getMittenti();
    if (wsdmMittenti != null && wsdmMittenti.length > 0) {
      List<Mittente> prismaListaMittenti = prismaIntestazione.getMittente();

      for (int m = 0; m < wsdmMittenti.length; m++) {
        Mittente prismaMittenteSingolo = new Mittente();
        prismaListaMittenti.add(prismaMittenteSingolo);
        Persona prismaPersona = new Persona();
        prismaMittenteSingolo.setPersona(prismaPersona);

        prismaPersona.setCognome(wsdmMittenti[m].getCognomeointestazione());

        if (wsdmMittenti[m].getNome() != null) {
          prismaPersona.setNome(wsdmMittenti[m].getNome());
        } else {
          prismaPersona.setNome(" - ");
        }

        if (wsdmMittenti[m].getCodiceFiscale() != null) {
          prismaPersona.setCodiceFiscale(wsdmMittenti[m].getCodiceFiscale());
        }

        prismaPersona.setId(wsdmMittenti[m].getCodiceFiscale());
        if (wsdmMittenti[m].getEmail() != null && !"".equals(wsdmMittenti[m].getEmail())) {
          IndirizzoTelematico prismaIndirizzoTelematico = new IndirizzoTelematico();
          prismaIndirizzoTelematico.setTipo(INDIRIZZO_TELEMATICO_TIPO);
          prismaIndirizzoTelematico.setContent(wsdmMittenti[m].getEmail());
          prismaPersona.setIndirizzoTelematico(prismaIndirizzoTelematico);
        }
      }
    }
  }

  /**
   * Gestione del mittente interno (in questo caso si tratta di un unico
   * mittente corrispondente all'amministrazione).
   * 
   * @param codiceAmministrazione
   * @param denominazioneAmministrazione
   * @param emailAmministrazione
   * @param codiceAOO
   * @param codiceUO
   * @param prismaIntestazione
   */
  private void _gestioneMittenteInterno(String codiceAmministrazione, String denominazioneAmministrazione, String emailAmministrazione,
      String codiceAOO, String codiceUO, Intestazione prismaIntestazione) {
    List<Mittente> prismaListaMittenti = prismaIntestazione.getMittente();
    Mittente prismaMittenteSingolo = new Mittente();
    Amministrazione prismaAmministrazione = _gestioneAmministrazioneMittenteDestinataria(codiceAmministrazione,
        denominazioneAmministrazione, emailAmministrazione, codiceUO);
    prismaMittenteSingolo.setAmministrazione(prismaAmministrazione);
    if (codiceAOO != null) {
      AOO prismaAOO = new AOO();
      prismaAOO.setCodiceAOO(codiceAOO);
      prismaMittenteSingolo.setAOO(prismaAOO);
    }
    prismaListaMittenti.add(prismaMittenteSingolo);
  }

  /**
   * Gestione dei destinatari esterni, sono i destinatari di un protocollo in
   * uscita.
   * 
   * @param wsdmprotocolloDocumentoIn
   * @param prismaIntestazione
   */
  private void _gestioneDestinatariEsterni(WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn, Intestazione prismaIntestazione) {
    WSDMProtocolloAnagrafica[] wsdmDestinatari = wsdmprotocolloDocumentoIn.getDestinatari();
    if (wsdmDestinatari != null && wsdmDestinatari.length > 0) {
      List<Destinatario> prismaListaDestinatari = prismaIntestazione.getDestinatario();
      for (int d = 0; d < wsdmDestinatari.length; d++) {
        Destinatario prismaDestinatarioSingolo = new Destinatario();
        prismaListaDestinatari.add(prismaDestinatarioSingolo);
        Persona prismaPersona = new Persona();
        prismaDestinatarioSingolo.setPersona(prismaPersona);

        prismaPersona.setCognome(wsdmDestinatari[d].getCognomeointestazione());

        if (wsdmDestinatari[d].getNome() != null) {
          prismaPersona.setNome(wsdmDestinatari[d].getNome());
        } else {
          prismaPersona.setNome(" - ");
        }

        if (wsdmDestinatari[d].getCodiceFiscale() != null) {
          prismaPersona.setCodiceFiscale(wsdmDestinatari[d].getCodiceFiscale());
          prismaPersona.setId(wsdmDestinatari[d].getCodiceFiscale());
        }

        if (wsdmDestinatari[d].getEmail() != null && !"".equals(wsdmDestinatari[d].getEmail())) {
          IndirizzoTelematico prismaIndirizzoTelematico = new IndirizzoTelematico();
          prismaIndirizzoTelematico.setTipo(INDIRIZZO_TELEMATICO_TIPO);
          prismaIndirizzoTelematico.setContent(wsdmDestinatari[d].getEmail());
          prismaPersona.setIndirizzoTelematico(prismaIndirizzoTelematico);
        }
      }
    }
  }

  /**
   * Gestione dell'elemento "Identificatore".
   * 
   * @param wsdmprotocolloDocumentoIn
   * @param codiceAmministrazione
   * @param codiceAOO
   * @param prismaIntestazione
   */
  private void _gestioneIdentificatore(WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn, String codiceAmministrazione, String codiceAOO,
      Intestazione prismaIntestazione) {
    Identificatore prismaIdentificatore = new Identificatore();
    prismaIntestazione.setIdentificatore(prismaIdentificatore);

    // Codice amministrazione
    if (codiceAmministrazione != null) {
      prismaIdentificatore.setCodiceAmministrazione(codiceAmministrazione);
    }

    // Codice AOO
    if (codiceAOO != null) {
      prismaIdentificatore.setCodiceAOO(codiceAOO);
    }

    prismaIdentificatore.setNumeroRegistrazione("");
    prismaIdentificatore.setDataRegistrazione("");

    // Flusso (ingresso, uscita)
    if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
      prismaIdentificatore.setFlusso(PROTOCOLLO_IN_ENTRATA);
    } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      prismaIdentificatore.setFlusso(PROTOCOLLO_IN_USCITA);
    } else if (WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      prismaIdentificatore.setFlusso(PROTOCOLLO_INTERNO);
    }
  }

  /**
   * Gestione dell'elemento "applicativoProtocollo".
   * 
   * @param codiceUO
   * @param nomeApplicativo
   * @param username
   * @param tipoSmistamento
   * @param prismaSegnatura
   */
  private void _gestioneApplicativoProtocollo(String codiceUO, String nomeApplicativo, String username, String tipoSmistamento,
      Segnatura prismaSegnatura) {
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
    // <Parametro nome="dataDocumento" valore="03/04/2019" />
    Date now = Calendar.getInstance().getTime();
    DateFormat nowFormat = new SimpleDateFormat("dd/MM/yyyy");
    String dataDocumento = nowFormat.format(now);
    Parametro parametroDataDocumento = new Parametro();
    parametroDataDocumento.setNome("dataDocumento");
    parametroDataDocumento.setValore(dataDocumento);
    listaParametri.add(parametroDataDocumento);

    prismaSegnatura.setApplicativoProtocollo(applicativoProtocollo);
  }

  /**
   * Gestione dell'elemento "Classifica".
   * 
   * @param wsdmprotocolloDocumentoIn
   * @param codiceAmministrazione
   * @param codiceAOO
   * @param prismaIntestazione
   */
  private void _gestioneClassifica(WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn, String codiceAmministrazione, String codiceAOO,
      Intestazione prismaIntestazione) {
    if (wsdmprotocolloDocumentoIn.getClassifica() != null) {
      Classifica classifica = new Classifica();
      classifica.setCodiceTitolario(wsdmprotocolloDocumentoIn.getClassifica());
      if (codiceAmministrazione != null) classifica.setCodiceAmministrazione(codiceAmministrazione);
      if (codiceAOO != null) classifica.setCodiceAOO(codiceAOO);
      prismaIntestazione.setClassifica(classifica);
    }
  }

  /**
   * Gestione dell'amministrazione. Puo' essere utilizzata come destinatario
   * (nel caso di protocollo in entrata) o come mittente (nel caso di protocollo
   * in uscita).
   * 
   * @param codiceAmministrazione
   * @param denominazioneAmministrazione
   * @param emailAmministrazione
   * @param codiceUO
   * @return
   */
  private Amministrazione _gestioneAmministrazioneMittenteDestinataria(String codiceAmministrazione, String denominazioneAmministrazione,
      String emailAmministrazione, String codiceUO) {
    Amministrazione prismaAmministrazione = new Amministrazione();

    // Codice amministrazione
    if (codiceAmministrazione != null) {
      prismaAmministrazione.setCodiceAmministrazione(codiceAmministrazione);
    }

    // Denominazione amministrazione
    if (denominazioneAmministrazione != null) {
      prismaAmministrazione.setDenominazione(denominazioneAmministrazione);
    }

    // Email amministrazione
    if (emailAmministrazione != null && !"".equals(emailAmministrazione)) {
      IndirizzoTelematico indirizzoTelematicoAmministrazione = new IndirizzoTelematico();
      indirizzoTelematicoAmministrazione.setTipo(INDIRIZZO_TELEMATICO_TIPO);
      indirizzoTelematicoAmministrazione.setContent(emailAmministrazione);
      prismaAmministrazione.setIndirizzoTelematico(indirizzoTelematicoAmministrazione);
    }

    // Unita' organizzativa
    if (codiceUO != null) {
      UnitaOrganizzativa unitaOrganizzativa = new UnitaOrganizzativa();
      unitaOrganizzativa.setId(codiceUO);
      prismaAmministrazione.setUnitaOrganizzativa(unitaOrganizzativa);
    }
    return prismaAmministrazione;
  }

  @Override
  public WSDMProtocolloDocumentoRes _protocolloLeggi(String username, String password, WSDMLoginAttr loginAttr, Long annoProtocollo,
      String numeroProtocollo) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    try {

      StringBuffer messaggioCtr = new StringBuffer();
      if (PrismaUtilityControllo.ctrProtocolloLeggi(loginAttr, annoProtocollo, numeroProtocollo, messaggioCtr)) {
        _prismaProtocolloDocumentoLeggi(username, password, annoProtocollo, numeroProtocollo, null, wsdmprotocolloDocumentoRes);
      } else {
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (Exception e) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(e.getMessage());
      logger.error("Errore (_protocolloLeggi)", e);
    }

    return wsdmprotocolloDocumentoRes;
  }

  /**
   * Lettura del protocollo.
   * 
   * @param username
   * @param password
   * @param annoProtocollo
   * @param numeroProtocollo
   * @param numeroDocumento
   * @param wsdmprotocolloDocumentoRes
   * @throws Exception
   * @throws JAXBException
   * @throws RemoteException
   */
  private void _prismaProtocolloDocumentoLeggi(String username, String password, Long annoProtocollo, String numeroProtocollo,
      String numeroDocumento, WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes) throws Exception, JAXBException, RemoteException {

    DOCAREAProtoSoap docAreaProtoSoap = _getDOCAREAProtoSoap(username, password);
    ProtocolloExtendedService protocolloExtended = this._getProtocolloExtended(username, password);
    AttachService attachService = this._getAttachService(username, password);

    LoginRet loginRet = this._login(docAreaProtoSoap, username, password);

    if (loginRet.getLngErrNumber() == 0) {

      it.prisma.getdocumento.ROOT richiestaDettaglioDocumento = new it.prisma.getdocumento.ROOT();

      if (numeroDocumento != null && !"".equals(numeroDocumento)) {
        richiestaDettaglioDocumento.setIDDOCUMENTO(numeroDocumento);
      } else {
        richiestaDettaglioDocumento.setANNO(annoProtocollo.toString());
        richiestaDettaglioDocumento.setNUMERO(numeroProtocollo);
        richiestaDettaglioDocumento.setTIPOREGISTRO(InitialContext.doLookup(PRISMA_TIPO_REGISTRO).toString());
      }

      richiestaDettaglioDocumento.setUTENTE(username);

      StringWriter xmlStringWriterRichiestaDettaglioDocumento = new StringWriter();
      JAXBContext jaxbRichiestaDettaglioDocumento = JAXBContext.newInstance(it.prisma.getdocumento.ROOT.class);
      jaxbRichiestaDettaglioDocumento.createMarshaller().marshal(richiestaDettaglioDocumento, xmlStringWriterRichiestaDettaglioDocumento);
      String xmlRichiestaDettaglioDocumento = xmlStringWriterRichiestaDettaglioDocumento.toString();
      String xmlRispostaDettaglioDocumento = protocolloExtended.getDocumento(username, loginRet.getStrDST(), xmlRichiestaDettaglioDocumento);

      try {

        WSDMProtocolloDocumento wsdmProtocolloDocumento = new WSDMProtocolloDocumento();

        JAXBContext jaxbRispostaDettaglioDocumento = JAXBContext.newInstance(it.prisma.getdocumento.result.PROTOCOLLO.class);
        Object _d = jaxbRispostaDettaglioDocumento.createUnmarshaller().unmarshal(
            new InputSource(new StringReader(xmlRispostaDettaglioDocumento)));
        it.prisma.getdocumento.result.PROTOCOLLO rispostaDettaglioDocumento = (it.prisma.getdocumento.result.PROTOCOLLO) _d;

        wsdmProtocolloDocumento.setNumeroDocumento(rispostaDettaglioDocumento.getDOC().getIDDOCUMENTO());
        wsdmProtocolloDocumento.setAnnoProtocollo(new Long(rispostaDettaglioDocumento.getDOC().getANNO()));
        wsdmProtocolloDocumento.setNumeroProtocollo(rispostaDettaglioDocumento.getDOC().getNUMERO());

        try {
          if (rispostaDettaglioDocumento.getDOC().getDATA() != null) {
            Date dataProtocollo = null;
            dataProtocollo = new SimpleDateFormat("dd/MM/yyyy").parse(rispostaDettaglioDocumento.getDOC().getDATA());
            wsdmProtocolloDocumento.setDataProtocollo(dataProtocollo);
          }
        } catch (Exception edt) {

        }

        // Oggetto
        wsdmProtocolloDocumento.setOggetto(rispostaDettaglioDocumento.getDOC().getOGGETTO());

        // Classifica
        wsdmProtocolloDocumento.setClassifica(rispostaDettaglioDocumento.getDOC().getCLASSCOD());

        // Verso (IN, OUT, INT)
        String modalita = rispostaDettaglioDocumento.getDOC().getMODALITA();
        if (modalita != null) {
          if (modalita.equals(MODALITA_ENTRATA)) wsdmProtocolloDocumento.setInout(WSDMProtocolloInOut.IN);
          if (modalita.equals(MODALITA_USCITA)) wsdmProtocolloDocumento.setInout(WSDMProtocolloInOut.OUT);
          if (modalita.equals(MODALITA_INTERNO)) wsdmProtocolloDocumento.setInout(WSDMProtocolloInOut.INT);
        }

        // Lettura dei "rapporti", sono i mittenti del protocollo in ingresso o
        // i destinatari del protocollo in uscita
        if (rispostaDettaglioDocumento.getRAPPORTI() != null) {
          List<RAPPORTO> prismaRapporti = rispostaDettaglioDocumento.getRAPPORTI().getRAPPORTO();
          if (prismaRapporti.size() > 0) {
            WSDMProtocolloAnagrafica[] wsdmProtocolloAnagrafiche = new WSDMProtocolloAnagrafica[prismaRapporti.size()];
            for (int r = 0; r < prismaRapporti.size(); r++) {
              wsdmProtocolloAnagrafiche[r] = new WSDMProtocolloAnagrafica();
              wsdmProtocolloAnagrafiche[r].setCognomeointestazione(prismaRapporti.get(r).getCOGNOMENOME());
              wsdmProtocolloAnagrafiche[r].setCodiceFiscale(prismaRapporti.get(r).getCODICEFISCALE());
              wsdmProtocolloAnagrafiche[r].setEmail(prismaRapporti.get(r).getEMAIL());
            }

            if (modalita.equals(MODALITA_ENTRATA)) {
              wsdmProtocolloDocumento.setMittenti(wsdmProtocolloAnagrafiche);
            } else if (modalita.equals(MODALITA_USCITA)) {
              wsdmProtocolloDocumento.setDestinatari(wsdmProtocolloAnagrafiche);
            }

          }
        }

        // Documento principale ed allegati
        if (rispostaDettaglioDocumento.getFILEPRINCIPALE() != null && rispostaDettaglioDocumento.getFILEPRINCIPALE().getFILE() != null) {

          // Calcolo del numero totale di documenti
          int numeroDocumenti = 1;
          if (rispostaDettaglioDocumento.getALLEGATI() != null && rispostaDettaglioDocumento.getALLEGATI().getALLEGATO() != null) {
            numeroDocumenti += rispostaDettaglioDocumento.getALLEGATI().getALLEGATO().size();
          }

          WSDMProtocolloAllegato[] wsdmProtocolloAllegati = new WSDMProtocolloAllegato[numeroDocumenti];
          wsdmProtocolloAllegati[0] = new WSDMProtocolloAllegato();

          FILE filePrincipale = rispostaDettaglioDocumento.getFILEPRINCIPALE().getFILE();

          wsdmProtocolloAllegati[0].setNome(filePrincipale.getFILENAME());
          wsdmProtocolloAllegati[0].setTitolo(filePrincipale.getFILENAME());

          // Download del file associato al documento principale
          try {
            DownloadAttachResponse2 downloadFilePrincipale = attachService.downloadAttach(filePrincipale.getIDDOCUMENTO(), null,
                filePrincipale.getFILENAME(), username);
            if (DMS_RESULT_OK.equals(downloadFilePrincipale.getResult())) {

              DataHandler dataHandlerFilePrincipale = downloadFilePrincipale.getContentFile();
              ByteArrayOutputStream baosFilePrincipale = new ByteArrayOutputStream();
              dataHandlerFilePrincipale.writeTo(baosFilePrincipale);
              wsdmProtocolloAllegati[0].setContenuto(baosFilePrincipale.toByteArray());
            } else {
              logger.debug(downloadFilePrincipale.getErrStr());
            }
          } catch (Exception e) {
            logger.debug(e);
          }

          if (rispostaDettaglioDocumento.getALLEGATI() != null && rispostaDettaglioDocumento.getALLEGATI().getALLEGATO() != null) {
            List<ALLEGATO> prismaAllegati = rispostaDettaglioDocumento.getALLEGATI().getALLEGATO();
            if (prismaAllegati.size() > 0) {
              for (int a = 0; a < prismaAllegati.size(); a++) {
                wsdmProtocolloAllegati[a + 1] = new WSDMProtocolloAllegato();

                if (prismaAllegati.get(a).getFILEALLEGATI() != null && prismaAllegati.get(a).getFILEALLEGATI().getFILE() != null) {
                  FILE fileAllegato = prismaAllegati.get(a).getFILEALLEGATI().getFILE();

                  wsdmProtocolloAllegati[a + 1].setNome(fileAllegato.getFILENAME());
                  wsdmProtocolloAllegati[a + 1].setTitolo(prismaAllegati.get(a).getDESCRIZIONE());

                  // Download del file associato all'allegato
                  try {
                    DownloadAttachResponse2 downloadFileAllegato = attachService.downloadAttach(fileAllegato.getIDDOCUMENTO(), null,
                        fileAllegato.getFILENAME(), username);
                    if (DMS_RESULT_OK.equals(downloadFileAllegato.getResult())) {
                      DataHandler dataHandlerFileAllegato = downloadFileAllegato.getContentFile();
                      ByteArrayOutputStream baosFileAllegato = new ByteArrayOutputStream();
                      dataHandlerFileAllegato.writeTo(baosFileAllegato);
                      wsdmProtocolloAllegati[a + 1].setContenuto(baosFileAllegato.toByteArray());
                    } else {
                      logger.debug(downloadFileAllegato.getErrStr());
                    }
                  } catch (Exception e) {
                    logger.debug(e);
                  }
                }

              }
            }
          }

          wsdmProtocolloDocumento.setAllegati(wsdmProtocolloAllegati);

        }

        // Collegamento al fascicolo
        WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();
        if (rispostaDettaglioDocumento.getDOC().getFASCICOLOANNO() != null
            && !"".equals(rispostaDettaglioDocumento.getDOC().getFASCICOLOANNO())
            && rispostaDettaglioDocumento.getDOC().getFASCICOLONUMERO() != null
            && !"".equals(rispostaDettaglioDocumento.getDOC().getFASCICOLONUMERO())) {

          if (rispostaDettaglioDocumento.getDOC().getFASCICOLOANNO() != null
              && !"".equals(rispostaDettaglioDocumento.getDOC().getFASCICOLOANNO())) {
            wsdmFascicolo.setAnnoFascicolo(new Long(rispostaDettaglioDocumento.getDOC().getFASCICOLOANNO()));
          }

          wsdmFascicolo.setNumeroFascicolo(rispostaDettaglioDocumento.getDOC().getFASCICOLONUMERO());
          wsdmProtocolloDocumento.setFascicolo(wsdmFascicolo);
        }

        wsdmprotocolloDocumentoRes.setEsito(true);
        wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmProtocolloDocumento);

      } catch (Exception ed) {
        try {
          // Tento la lettura del risultato di errore
          Document document = DocumentHelper.parseText(xmlRispostaDettaglioDocumento);
          Element elRoot = document.getRootElement();
          String messaggio = elRoot.element("MESSAGE").getText();
          wsdmprotocolloDocumentoRes.setEsito(false);
          wsdmprotocolloDocumentoRes.setMessaggio(messaggio);

        } catch (Exception ed1) {
          wsdmprotocolloDocumentoRes.setEsito(false);
          wsdmprotocolloDocumentoRes.setMessaggio(ed.getMessage());
        }

      }

    } else {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio("Errore durante la fase di login ["
          + loginRet.getLngErrNumber()
          + ", "
          + loginRet.getStrErrString()
          + "]");
    }
  }

  @Override
  public WSDMProtocolloDocumentoRes _documentoInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    try {

      StringBuffer messaggioCtr = new StringBuffer();
      if (PrismaUtilityControllo.ctrDocumentoInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {
        DOCAREAProtoSoap docAreaProtoSoap = _getDOCAREAProtoSoap(username, password);
        ProtocolloExtendedService protocolloExtended = this._getProtocolloExtended(username, password);
        LoginRet loginRet = _login(docAreaProtoSoap, username, password);

        if (loginRet.getLngErrNumber() == 0) {
          _prismaProtocolloInserisci(username, password, loginAttr, wsdmprotocolloDocumentoIn, wsdmprotocolloDocumentoRes,
              docAreaProtoSoap, protocolloExtended, loginRet);
        } else {
          wsdmprotocolloDocumentoRes.setEsito(false);
          wsdmprotocolloDocumentoRes.setMessaggio("Errore durante la fase di login ["
              + loginRet.getLngErrNumber()
              + ", "
              + loginRet.getStrErrString()
              + "]");
        }

      } else {
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (Exception e) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(e.getMessage());
      logger.error("Errore (_protocolloInserisci)", e);
    }

    return wsdmprotocolloDocumentoRes;
  }

  @Override
  public WSDMProtocolloDocumentoRes _documentoLeggi(String username, String password, WSDMLoginAttr loginAttr, String numeroDocumento) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    try {

      StringBuffer messaggioCtr = new StringBuffer();
      if (PrismaUtilityControllo.ctrDocumentoLeggi(loginAttr, numeroDocumento, messaggioCtr)) {
        _prismaProtocolloDocumentoLeggi(username, password, null, null, numeroDocumento, wsdmprotocolloDocumentoRes);
      } else {
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (Exception e) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(e.getMessage());
      logger.error("Errore (_protocolloLeggi)", e);
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

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (PrismaUtilityControllo.ctrFascicoloInserisci(loginAttr, wsdmfascicoloIn, messaggioCtr)) {
        DOCAREAProtoSoap docAreaProtoSoap = _getDOCAREAProtoSoap(username, password);
        ProtocolloExtendedService protocolloExtended = this._getProtocolloExtended(username, password);

        LoginRet loginRet = this._login(docAreaProtoSoap, username, password);

        if (loginRet.getLngErrNumber() == 0) {

          _prismaFascicoloInserisci(username, loginAttr, wsdmfascicoloIn, wsdmFascicoloRes, protocolloExtended, loginRet);

        } else {
          wsdmFascicoloRes.setEsito(false);
          wsdmFascicoloRes.setMessaggio("Errore durante la fase di login ["
              + loginRet.getLngErrNumber()
              + ", "
              + loginRet.getStrErrString()
              + "]");
        }

      } else {
        wsdmFascicoloRes.setEsito(false);
        wsdmFascicoloRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (Exception e) {
      wsdmFascicoloRes.setEsito(false);
      wsdmFascicoloRes.setMessaggio(e.getMessage());
      logger.error("Errore (_fascicoloInserisci)", e);
    }

    return wsdmFascicoloRes;
  }

  /**
   * Inserimento di un nuovo fascicolo.
   * 
   * @param username
   * @param loginAttr
   * @param wsdmfascicoloIn
   * @param wsdmFascicoloRes
   * @param protocolloExtended
   * @param loginRet
   * @throws JAXBException
   * @throws RemoteException
   */
  private void _prismaFascicoloInserisci(String username, WSDMLoginAttr loginAttr, WSDMFascicoloIn wsdmfascicoloIn,
      WSDMFascicoloRes wsdmFascicoloRes, ProtocolloExtendedService protocolloExtended, LoginRet loginRet) throws JAXBException,
      RemoteException {

    // Fascicolo, formato per l'inoltro delle informazioni di creazione del
    // fascicolo
    it.prisma.creafascicolo.ROOT richiestaFascicolo = new it.prisma.creafascicolo.ROOT();

    // Classifica
    richiestaFascicolo.setCLASSCOD(wsdmfascicoloIn.getClassificaFascicolo());

    // Anno del fascicolo
    Date _now = new Date();
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(_now);
    int year = calendar.get(Calendar.YEAR);
    richiestaFascicolo.setFASCICOLOANNO(String.valueOf(year));

    // Data apertura
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    richiestaFascicolo.setDATAAPERTURA(dateFormat.format(_now));

    // Oggetto del fascicolo
    richiestaFascicolo.setOGGETTO(wsdmfascicoloIn.getOggettoFascicolo());

    // Unita' di competenza ed unita' di creazione
    richiestaFascicolo.setUNITACOMPETENZA(wsdmfascicoloIn.getStruttura());
    richiestaFascicolo.setUNITACREAZIONE(wsdmfascicoloIn.getStruttura());

    // Utente
    richiestaFascicolo.setUTENTE(username);

    StringWriter xmlStringWriterRichiestaFascicolo = new StringWriter();
    JAXBContext jaxbRichiestaFascicolo = JAXBContext.newInstance(it.prisma.creafascicolo.ROOT.class);
    jaxbRichiestaFascicolo.createMarshaller().marshal(richiestaFascicolo, xmlStringWriterRichiestaFascicolo);
    String xmlRichiestaFascicolo = xmlStringWriterRichiestaFascicolo.toString();
    String xmlRispostaFascicolo = protocolloExtended.creaFascicolo(username, loginRet.getStrDST(), xmlRichiestaFascicolo);

    JAXBContext jaxbRispostaFascicolo = JAXBContext.newInstance(it.prisma.result.ROOT.class);
    Object _r = jaxbRispostaFascicolo.createUnmarshaller().unmarshal(new InputSource(new StringReader(xmlRispostaFascicolo)));
    it.prisma.result.ROOT rispostaROOT = (it.prisma.result.ROOT) _r;

    if (RESULT_OK.equals(rispostaROOT.getRESULT())) {
      WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();
      wsdmFascicolo.setClassificaFascicolo(rispostaROOT.getCLASSCOD());
      wsdmFascicolo.setAnnoFascicolo(new Long(rispostaROOT.getFASCICOLOANNO()));
      wsdmFascicolo.setNumeroFascicolo(rispostaROOT.getFASCICOLONUMERO());
      wsdmFascicolo.setOggettoFascicolo(wsdmfascicoloIn.getOggettoFascicolo());

      wsdmFascicoloRes.setEsito(true);
      wsdmFascicoloRes.setFascicolo(wsdmFascicolo);
    } else {
      wsdmFascicoloRes.setEsito(false);
      wsdmFascicoloRes.setMessaggio("Errore durante la creazione del fascicolo ["
          + rispostaROOT.getERRORNUMBER()
          + ", "
          + rispostaROOT.getMESSAGE()
          + ", "
          + rispostaROOT.getEXCEPTION()
          + "]");
    }
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
      Long annoFascicolo, String numeroFascicolo, String classificaFascicolo) {
    WSDMFascicoloRes wsdmFascicoloRes = new WSDMFascicoloRes();
    try {

      StringBuffer messaggioCtr = new StringBuffer();
      if (PrismaUtilityControllo.ctrFascicoloLeggi(loginAttr, codiceFascicolo, annoFascicolo, numeroFascicolo, classificaFascicolo,
          messaggioCtr)) {

        DOCAREAProtoSoap docAreaProtoSoap = _getDOCAREAProtoSoap(username, password);
        ProtocolloExtendedService protocolloExtended = this._getProtocolloExtended(username, password);
        LoginRet loginRet = this._login(docAreaProtoSoap, username, password);
        if (loginRet.getLngErrNumber() == 0) {
          _prismaFascicoloLeggi(username, annoFascicolo, numeroFascicolo, classificaFascicolo, wsdmFascicoloRes, protocolloExtended,
              loginRet, true);
        } else {
          wsdmFascicoloRes.setEsito(false);
          wsdmFascicoloRes.setMessaggio("Errore durante la fase di login ["
              + loginRet.getLngErrNumber()
              + ", "
              + loginRet.getStrErrString()
              + "]");
        }

      } else {
        wsdmFascicoloRes.setEsito(false);
        wsdmFascicoloRes.setMessaggio(messaggioCtr.toString());
      }
    } catch (Exception e) {
      wsdmFascicoloRes.setEsito(false);
      wsdmFascicoloRes.setMessaggio(e.getMessage());
      logger.error("Errore (_fascicoloLeggi)", e);
    }

    return wsdmFascicoloRes;
  }

  @Override
  public WSDMFascicoloRes _fascicoloMetadatiLeggi(String username, String password, WSDMLoginAttr loginAttr, String codiceFascicolo,
      Long annoFascicolo, String numeroFascicolo, String classificaFascicolo) {
    WSDMFascicoloRes wsdmFascicoloRes = new WSDMFascicoloRes();
    try {

      StringBuffer messaggioCtr = new StringBuffer();
      if (PrismaUtilityControllo.ctrFascicoloLeggi(loginAttr, codiceFascicolo, annoFascicolo, numeroFascicolo, classificaFascicolo,
          messaggioCtr)) {

        DOCAREAProtoSoap docAreaProtoSoap = _getDOCAREAProtoSoap(username, password);
        ProtocolloExtendedService protocolloExtended = this._getProtocolloExtended(username, password);
        LoginRet loginRet = this._login(docAreaProtoSoap, username, password);
        if (loginRet.getLngErrNumber() == 0) {
          _prismaFascicoloLeggi(username, annoFascicolo, numeroFascicolo, classificaFascicolo, wsdmFascicoloRes, protocolloExtended,
              loginRet, false);
        } else {
          wsdmFascicoloRes.setEsito(false);
          wsdmFascicoloRes.setMessaggio("Errore durante la fase di login ["
              + loginRet.getLngErrNumber()
              + ", "
              + loginRet.getStrErrString()
              + "]");
        }

      } else {
        wsdmFascicoloRes.setEsito(false);
        wsdmFascicoloRes.setMessaggio(messaggioCtr.toString());
      }
    } catch (Exception e) {
      wsdmFascicoloRes.setEsito(false);
      wsdmFascicoloRes.setMessaggio(e.getMessage());
      logger.error("Errore (_fascicoloLeggi)", e);
    }

    return wsdmFascicoloRes;
  }

  /**
   * Lettura dei dati del fascicolo e dei documenti contenuti.
   * 
   * @param username
   * @param annoFascicolo
   * @param numeroFascicolo
   * @param classificaFascicolo
   * @param wsdmFascicoloRes
   * @param protocolloExtended
   * @param loginRet
   * @throws JAXBException
   * @throws RemoteException
   * @throws NamingException
   */
  private void _prismaFascicoloLeggi(String username, Long annoFascicolo, String numeroFascicolo, String classificaFascicolo,
      WSDMFascicoloRes wsdmFascicoloRes, ProtocolloExtendedService protocolloExtended, LoginRet loginRet, boolean readDocument)
      throws JAXBException, RemoteException, NamingException {

    // Creazione della richiesta di lettura
    ROOT richiestaFascicolo = new ROOT();
    richiestaFascicolo.setFASCICOLOANNO(annoFascicolo.toString());
    richiestaFascicolo.setFASCICOLONUMERO(numeroFascicolo);
    richiestaFascicolo.setCLASSCOD(classificaFascicolo);
    richiestaFascicolo.setUTENTE(username);

    StringWriter xmlStringWriterRichiestaFascicolo = new StringWriter();
    JAXBContext jaxbRichiestaFascicolo = JAXBContext.newInstance(ROOT.class);
    jaxbRichiestaFascicolo.createMarshaller().marshal(richiestaFascicolo, xmlStringWriterRichiestaFascicolo);
    String xmlRichiestaFascicolo = xmlStringWriterRichiestaFascicolo.toString();
    String xmlRispostaFascicolo = protocolloExtended.getFascicoli(username, loginRet.getStrDST(), xmlRichiestaFascicolo);

    // La risposta del servizio e' duplice: se va male risponde con il formato
    // it.prisma.result.ROOT, se va bene risponde con le informazioni del
    // fascicolo it.prisma.getfascicoli.result.FASCICOLI.
    try {
      JAXBContext jaxbRispostaFascicolo = JAXBContext.newInstance(it.prisma.result.ROOT.class);
      Object _r = jaxbRispostaFascicolo.createUnmarshaller().unmarshal(new InputSource(new StringReader(xmlRispostaFascicolo)));
      it.prisma.result.ROOT rispostaROOT = (it.prisma.result.ROOT) _r;

      if (RESULT_OK.equals(rispostaROOT.getERRORNUMBER())) {
        wsdmFascicoloRes.setEsito(true);
        wsdmFascicoloRes.setMessaggio(xmlRispostaFascicolo);
      } else {
        wsdmFascicoloRes.setEsito(false);
        wsdmFascicoloRes.setMessaggio("Errore durante la lettura del fascicolo ["
            + rispostaROOT.getERRORNUMBER()
            + ", "
            + rispostaROOT.getMESSAGE()
            + ", "
            + rispostaROOT.getEXCEPTION()
            + "]");
      }
    } catch (Exception e) {
      JAXBContext jaxbRispostaFascicolo = JAXBContext.newInstance(it.prisma.getfascicoli.result.FASCICOLI.class);
      Object _f = jaxbRispostaFascicolo.createUnmarshaller().unmarshal(new InputSource(new StringReader(xmlRispostaFascicolo)));
      it.prisma.getfascicoli.result.FASCICOLI rispostaFascicoli = (it.prisma.getfascicoli.result.FASCICOLI) _f;

      wsdmFascicoloRes.setEsito(false);
      wsdmFascicoloRes.setMessaggio("Fascicolo non trovato");

      if (rispostaFascicoli != null) {
        if (rispostaFascicoli.getFASCICOLO() != null && rispostaFascicoli.getFASCICOLO().size() > 0) {
          for (int f = 0; f < rispostaFascicoli.getFASCICOLO().size(); f++) {

            it.prisma.getfascicoli.result.FASCICOLO rispostaFASCICOLO = rispostaFascicoli.getFASCICOLO().get(f);

            String rispostaFascicoloAnno = rispostaFASCICOLO.getFASCICOLOANNO();
            String rispostaFascicoloNumero = rispostaFASCICOLO.getFASCICOLONUMERO();

            if (rispostaFascicoloAnno != null
                && rispostaFascicoloAnno.equals(annoFascicolo.toString())
                && rispostaFascicoloNumero != null
                && rispostaFascicoloNumero.equals(numeroFascicolo.toString())) {

              wsdmFascicoloRes.setEsito(true);
              wsdmFascicoloRes.setMessaggio("");
              WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();
              wsdmFascicolo.setAnnoFascicolo(annoFascicolo);
              wsdmFascicolo.setClassificaFascicolo(rispostaFASCICOLO.getCLASSCOD());
              wsdmFascicolo.setCodiceFascicolo(rispostaFASCICOLO.getIDDOCUMENTO());
              wsdmFascicolo.setNumeroFascicolo(numeroFascicolo);
              wsdmFascicolo.setOggettoFascicolo(rispostaFASCICOLO.getFASCICOLOOGGETTO());
              wsdmFascicoloRes.setFascicolo(wsdmFascicolo);

              // Lettura dei documenti protocollati (e' necessario definire la
              // profondita' in mesi per limitare il tempo di ricerca).
              it.prisma.getdocumenti.p.ROOT richiestaDocumenti_P = new it.prisma.getdocumenti.p.ROOT();

              Date now = Calendar.getInstance().getTime();
              DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

              // Profondita' in mesi
              Long giorni = new Long(30);
              try {
                String _g = InitialContext.doLookup(PRISMA_RICERCA_DOCUMENTI_FASCICOLO_GIORNI);
                if (_g == null || (_g != null && !"".equals(_g.trim()))) {
                  giorni = new Long(_g);
                }
              } catch (Exception eg) {

              }

              Calendar past = Calendar.getInstance();
              past.setTime(now);
              past.add(Calendar.DATE, -giorni.intValue());
              richiestaDocumenti_P.setDATADAL(dateFormat.format(past.getTime()));
              richiestaDocumenti_P.setDATAAL(dateFormat.format(now));
              String tipoRegistro = InitialContext.doLookup(PRISMA_TIPO_REGISTRO);
              richiestaDocumenti_P.setTIPOREGISTRO(tipoRegistro);
              richiestaDocumenti_P.setFASCICOLOANNO(annoFascicolo.toString());
              richiestaDocumenti_P.setFASCICOLONUMERO(numeroFascicolo);
              richiestaDocumenti_P.setUTENTE(username);

              // Se readDocument e' impostato a true significa che e' richiesto
              // la lettura degli elementi documentali del fascicolo.>
              if (readDocument == true) {

                StringWriter xmlStringWriterRichiestaDocumenti_P = new StringWriter();
                JAXBContext jaxbRichiestaDocumenti_P = JAXBContext.newInstance(it.prisma.getdocumenti.p.ROOT.class);
                jaxbRichiestaDocumenti_P.createMarshaller().marshal(richiestaDocumenti_P, xmlStringWriterRichiestaDocumenti_P);
                String xmlRichiestaDocumenti_P = xmlStringWriterRichiestaDocumenti_P.toString();
                String xmlRispostaDocumenti_P = protocolloExtended.getDocumentiProtocollati(username, loginRet.getStrDST(),
                    xmlRichiestaDocumenti_P);

                try {
                  JAXBContext jaxbRispostaDocumenti_P = JAXBContext.newInstance(it.prisma.getdocumenti.p.result.DOCUMENTI.class);
                  Object _d_p = jaxbRispostaDocumenti_P.createUnmarshaller().unmarshal(
                      new InputSource(new StringReader(xmlRispostaDocumenti_P)));
                  it.prisma.getdocumenti.p.result.DOCUMENTI rispostaDocumenti = (it.prisma.getdocumenti.p.result.DOCUMENTI) _d_p;
                  if (rispostaDocumenti != null) {
                    List<it.prisma.getdocumenti.p.result.DOCUMENTO> rispostaListaDocumenti = rispostaDocumenti.getDOCUMENTO();
                    if (rispostaListaDocumenti != null && rispostaListaDocumenti.size() > 0) {

                      WSDMFascicoloDocumento[] wsdmFascicoloDocumenti = new WSDMFascicoloDocumento[rispostaListaDocumenti.size()];

                      // Numero massimo di documenti per i quali leggere i
                      // dettagli
                      Long numeroMassimo = new Long(50);
                      try {
                        String _nm = InitialContext.doLookup(PRISMA_RICERCA_DOCUMENTI_NUMERO_MASSIMO);
                        if (_nm == null || (_nm != null && !"".equals(_nm.trim()))) {
                          numeroMassimo = new Long(_nm);
                        }
                      } catch (Exception enm) {

                      }

                      for (int idp = 0; idp < rispostaListaDocumenti.size(); idp++) {
                        wsdmFascicoloDocumenti[idp] = new WSDMFascicoloDocumento();
                        it.prisma.getdocumenti.p.result.DOCUMENTO rispostaDocumento = rispostaListaDocumenti.get(idp);
                        String idDocumento = rispostaDocumento.getIDDOCUMENTO();
                        wsdmFascicoloDocumenti[idp].setNumeroDocumento(idDocumento);

                        // Lettura dei dettagli del documento
                        // Si devono leggere i dettagli sono per il numero
                        // massimo di documenti previsto.
                        // Negli altri casi si riporta solo l'identificativo del
                        // documento.
                        if (idp <= numeroMassimo) {
                          it.prisma.getdocumento.ROOT richiestaDettaglioDocumento = new it.prisma.getdocumento.ROOT();
                          richiestaDettaglioDocumento.setIDDOCUMENTO(idDocumento);
                          richiestaDettaglioDocumento.setUTENTE(username);
                          StringWriter xmlStringWriterRichiestaDettaglioDocumento = new StringWriter();
                          JAXBContext jaxbRichiestaDettaglioDocumento = JAXBContext.newInstance(it.prisma.getdocumento.ROOT.class);
                          jaxbRichiestaDettaglioDocumento.createMarshaller().marshal(richiestaDettaglioDocumento,
                              xmlStringWriterRichiestaDettaglioDocumento);
                          String xmlRichiestaDettaglioDocumento = xmlStringWriterRichiestaDettaglioDocumento.toString();
                          String xmlRispostaDettaglioDocumento = protocolloExtended.getDocumento(username, loginRet.getStrDST(),
                              xmlRichiestaDettaglioDocumento);

                          try {
                            JAXBContext jaxbRispostaDettaglioDocumento = JAXBContext.newInstance(it.prisma.getdocumento.result.PROTOCOLLO.class);
                            Object _d = jaxbRispostaDettaglioDocumento.createUnmarshaller().unmarshal(
                                new InputSource(new StringReader(xmlRispostaDettaglioDocumento)));
                            it.prisma.getdocumento.result.PROTOCOLLO rispostaDettaglioDocumento = (it.prisma.getdocumento.result.PROTOCOLLO) _d;

                            wsdmFascicoloDocumenti[idp].setAnnoProtocollo(new Long(rispostaDettaglioDocumento.getDOC().getANNO()));
                            wsdmFascicoloDocumenti[idp].setNumeroProtocollo(rispostaDettaglioDocumento.getDOC().getNUMERO());

                            try {
                              if (rispostaDettaglioDocumento.getDOC().getDATA() != null) {
                                Date dataProtocollo = null;
                                dataProtocollo = new SimpleDateFormat("dd/MM/yyyy").parse(rispostaDettaglioDocumento.getDOC().getDATA());
                                wsdmFascicoloDocumenti[idp].setDataProtocollo(dataProtocollo);
                              }
                            } catch (Exception edt) {

                            }

                            String modalita = rispostaDettaglioDocumento.getDOC().getMODALITA();
                            if (modalita != null) {
                              if (modalita.equals(MODALITA_ENTRATA)) wsdmFascicoloDocumenti[idp].setInout(WSDMProtocolloInOut.IN);
                              if (modalita.equals(MODALITA_USCITA)) wsdmFascicoloDocumenti[idp].setInout(WSDMProtocolloInOut.OUT);
                              if (modalita.equals(MODALITA_INTERNO)) wsdmFascicoloDocumenti[idp].setInout(WSDMProtocolloInOut.INT);
                            }

                            wsdmFascicoloDocumenti[idp].setOggetto(rispostaDettaglioDocumento.getDOC().getOGGETTO());

                          } catch (Exception ed) {

                          }
                        }

                      }

                      wsdmFascicolo.setDocumenti(wsdmFascicoloDocumenti);

                    }
                  }

                } catch (Exception e_d_p) {

                }
              }

              // Lettura dei documenti non protocollati
              // Non e' possibile effettuare la ricerca dei documenti non
              // protocollati perche' tra i parametri di ricerca bisogna
              // fornire
              // obbligatoriamente l'oggetto, che non conosciamo.

            }
          }
        } else {
          wsdmFascicoloRes.setEsito(false);
          wsdmFascicoloRes.setMessaggio("Fascicolo non trovato");
        }

      } else {
        wsdmFascicoloRes.setEsito(false);
        wsdmFascicoloRes.setMessaggio(xmlRispostaFascicolo);
      }
    }
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

    try {

      StringBuffer messaggioCtr = new StringBuffer();
      if (PrismaUtilityControllo.ctrInviaMail(loginAttr, wsdmInviaMail, messaggioCtr)) {

        DOCAREAProtoSoap docAreaProtoSoap = this._getDOCAREAProtoSoap(username, password);
        PecSOAPImpl pecSOAP = this._getPecSoap(username, password);
        LoginRet loginRet = this._login(docAreaProtoSoap, username, password);

        if (loginRet.getLngErrNumber() == 0) {
          _prismaInviaMail(username, wsdmInviaMail, wsdmInviaMailRes, pecSOAP);
        } else {
          wsdmInviaMailRes.setEsito(false);
          wsdmInviaMailRes.setMessaggio("Errore durante la fase di login ["
              + loginRet.getLngErrNumber()
              + ", "
              + loginRet.getStrErrString()
              + "]");
        }

      } else {
        wsdmInviaMailRes.setEsito(false);
        wsdmInviaMailRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (Exception e) {
      wsdmInviaMailRes.setEsito(false);
      wsdmInviaMailRes.setMessaggio(e.getMessage());
      logger.error("Errore (_inviaMail)", e);
    }

    return wsdmInviaMailRes;
  }

  /**
   * Invio mail.
   * 
   * @param username
   * @param wsdmInviaMail
   * @param wsdmInviaMailRes
   * @param pecSOAP
   * @throws NamingException
   * @throws RemoteException
   */
  private void _prismaInviaMail(String username, WSDMInviaMail wsdmInviaMail, WSDMInviaMailRes wsdmInviaMailRes, PecSOAPImpl pecSOAP)
      throws NamingException, RemoteException {

    ParametriIngresso parametriIngresso = new ParametriIngresso();

    // Informazioni di "collegamento" al documento protocollato.
    // Il collegamento avviene per numero documento (idDocumento) oppure con gli
    // estremi di protocollazione (anno/numero/registro).
    if (wsdmInviaMail.getNumeroDocumento() != null && !"".equals(wsdmInviaMail.getNumeroDocumento())) {
      parametriIngresso.setIdDocumento(Integer.parseInt(wsdmInviaMail.getNumeroDocumento()));
    } else {
      parametriIngresso.setAnno(wsdmInviaMail.getAnnoProtocollo().toString());
      parametriIngresso.setNumero(wsdmInviaMail.getNumeroProtocollo());
      parametriIngresso.setTipo_registro(InitialContext.doLookup(PRISMA_TIPO_REGISTRO).toString());
    }
    parametriIngresso.setUtente_creazione(username);

    // Destinatari: i destinatari devono essere separati dal carattere #
    String[] destinatari = wsdmInviaMail.getDestinatariMail();
    for (int d = 0; d < destinatari.length; d++) {
      destinatari[d] = destinatari[d].trim();
    }

    parametriIngresso.setListaDestinatari(StringUtils.join(destinatari, '#'));

    // Gestione della segnatura ed invio singolo
    parametriIngresso.setInvioSingolo(true);
    parametriIngresso.setSegnaturaCompleta(false);
    parametriIngresso.setSenzaSegnatura(false);

    ParametriUscita parametriUscita = pecSOAP.invioPec(parametriIngresso);

    if (parametriUscita.getCodice() == 0) {
      wsdmInviaMailRes.setEsito(true);
      wsdmInviaMailRes.setMessaggio("Il messaggio con identificativo " + parametriUscita.getMsgId() + " e' stato inviato.");
    } else {
      wsdmInviaMailRes.setEsito(false);
      wsdmInviaMailRes.setMessaggio(parametriUscita.getDescrizione());
    }
  }

  @Override
  public WSDMVerificaMailRes _verificaMail(String username, String password, WSDMLoginAttr loginAttr, String numeroDocumento,
      Long annoProtocollo, String numeroProtocollo) {

    WSDMVerificaMailRes wsdmVerificaMailRes = new WSDMVerificaMailRes();
    try {

      StringBuffer messaggioCtr = new StringBuffer();

      if (PrismaUtilityControllo.ctrVerificaMail(loginAttr, numeroDocumento, annoProtocollo, numeroProtocollo, messaggioCtr)) {

        DOCAREAProtoSoap docAreaProtoSoap = this._getDOCAREAProtoSoap(username, password);
        ProtocolloExtendedService protocolloExtended = this._getProtocolloExtended(username, password);
        LoginRet loginRet = this._login(docAreaProtoSoap, username, password);

        if (loginRet.getLngErrNumber() == 0) {
          _prismaVerificaMail(username, numeroDocumento, annoProtocollo, numeroProtocollo, wsdmVerificaMailRes, protocolloExtended,
              loginRet);
        } else {
          wsdmVerificaMailRes.setEsito(false);
          wsdmVerificaMailRes.setMessaggio("Errore durante la fase di login ["
              + loginRet.getLngErrNumber()
              + ", "
              + loginRet.getStrErrString()
              + "]");
        }

      } else {
        wsdmVerificaMailRes.setEsito(false);
        wsdmVerificaMailRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (Exception e) {
      wsdmVerificaMailRes.setEsito(false);
      wsdmVerificaMailRes.setMessaggio(e.getMessage());
      logger.error("Errore (_inviaMail)", e);
    }
    return wsdmVerificaMailRes;
  }

  /**
   * Verifica mail.
   * 
   * @param username
   * @param numeroDocumento
   * @param annoProtocollo
   * @param numeroProtocollo
   * @param wsdmVerificaMailRes
   * @param protocolloExtended
   * @param loginRet
   * @throws NamingException
   * @throws JAXBException
   * @throws RemoteException
   */
  private void _prismaVerificaMail(String username, String numeroDocumento, Long annoProtocollo, String numeroProtocollo,
      WSDMVerificaMailRes wsdmVerificaMailRes, ProtocolloExtendedService protocolloExtended, LoginRet loginRet) throws NamingException,
      JAXBException, RemoteException {
    it.prisma.getinfopec.ROOT richiestaInfoPec = new it.prisma.getinfopec.ROOT();

    if (numeroDocumento != null && !"".equals(numeroDocumento)) {
      richiestaInfoPec.setIDDOCUMENTO(numeroDocumento);
    } else {
      richiestaInfoPec.setANNO(annoProtocollo.toString());
      richiestaInfoPec.setNUMERO(numeroProtocollo);
      richiestaInfoPec.setTIPOREGISTRO(InitialContext.doLookup(PRISMA_TIPO_REGISTRO).toString());
    }

    richiestaInfoPec.setUTENTE(username);

    StringWriter xmlStringWriterRichiestaInfoPec = new StringWriter();
    JAXBContext jaxbRichiestaInfoPec = JAXBContext.newInstance(it.prisma.getinfopec.ROOT.class);
    jaxbRichiestaInfoPec.createMarshaller().marshal(richiestaInfoPec, xmlStringWriterRichiestaInfoPec);
    String xmlRichiestaInfoPec = xmlStringWriterRichiestaInfoPec.toString();

    String xmlRispostaInfoPec = protocolloExtended.getInfoPec(username, loginRet.getStrDST(), xmlRichiestaInfoPec);

    try {
      JAXBContext jaxbRispostaInfoPec = JAXBContext.newInstance(it.prisma.getinfopec.result.PROTOCOLLO.class);
      Object _p = jaxbRispostaInfoPec.createUnmarshaller().unmarshal(new InputSource(new StringReader(xmlRispostaInfoPec)));

      it.prisma.getinfopec.result.PROTOCOLLO rispostaInfoPec = (it.prisma.getinfopec.result.PROTOCOLLO) _p;

      if (rispostaInfoPec.getMEMOINVIATI() != null) {
        MEMOINVIATI memoInviati = rispostaInfoPec.getMEMOINVIATI();
        if (memoInviati.getMEMO().size() > 0) {

          String messaggio = "";

          for (int m = 0; m < memoInviati.getMEMO().size(); m++) {
            MEMO memo = memoInviati.getMEMO().get(m);
            String idDocumento = memo.getIDDOCUMENTO();
            String dataSpedizione = memo.getDATASPEDIZIONE();
            String destinatari = memo.getDESTINATARI();
            if (m > 0) messaggio += ", ";
            messaggio += "PEC con identificativo " + idDocumento + " inviata in data " + dataSpedizione + " a " + destinatari;
          }

          wsdmVerificaMailRes.setEsito(true);
          wsdmVerificaMailRes.setMessaggio(messaggio);
        } else {
          wsdmVerificaMailRes.setEsito(false);
        }
      } else {
        wsdmVerificaMailRes.setEsito(false);
      }

    } catch (Exception e) {
      wsdmVerificaMailRes.setEsito(false);
      wsdmVerificaMailRes.setMessaggio(xmlRispostaInfoPec + " - " + e.getMessage());
    }
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

    try {

      StringBuffer messaggioCtr = new StringBuffer();

      if (PrismaUtilityControllo.ctrLeggiClassifiche(loginAttr, codice, descrizione, messaggioCtr)) {

        DOCAREAProtoSoap docAreaProtoSoap = _getDOCAREAProtoSoap(username, password);
        ProtocolloExtendedService protocolloExtended = this._getProtocolloExtended(username, password);

        LoginRet loginRet = this._login(docAreaProtoSoap, username, password);

        if (loginRet.getLngErrNumber() == 0) {

          it.prisma.getclassifiche.ROOT richiestaClassifiche = new it.prisma.getclassifiche.ROOT();

          // Ricerca per codice (la ricerca avviene in LIKE)
          if (codice != null && !"".equals(codice)) {
            richiestaClassifiche.setCLASSCOD(codice);
          }

          // Ricerca per descrizione (la ricerca avviene in LIKE)
          if (descrizione != null && !"".equals(descrizione)) {
            richiestaClassifiche.setDESCRIZIONE("*" + descrizione + "*");
          }

          // Codice amministrazione
          String codiceAmministrazione = InitialContext.doLookup(PRISMA_CODICE_AMMINISTRAZIONE);

          // Codice AOO
          String codiceAOO = null;
          if (loginAttr != null && loginAttr.getCodiceAOO() != null && !"".equals(loginAttr.getCodiceAOO().trim())) {
            codiceAOO = loginAttr.getCodiceAOO();
          } else {
            codiceAOO = InitialContext.doLookup(PRISMA_CODICE_AOO);
          }
          if (codiceAOO == null || (codiceAOO != null && "".equals(codiceAOO.trim()))) {
            throw new Exception(PRISMA_CODICE_AOO_NOT_DEFINED);
          }

          // Ricerca solo le classifiche "aperte" (si tratta delle classifiche
          // prive di data scadenza "data al")
          richiestaClassifiche.setVALIDA("Y");

          richiestaClassifiche.setCODICEAMMINISTRAZIONE(codiceAmministrazione);
          richiestaClassifiche.setCODICEAOO(codiceAOO);
          richiestaClassifiche.setUTENTE(username);

          StringWriter xmlStringWriterRichiestaClassifiche = new StringWriter();
          JAXBContext jaxbRichiestaClassifiche = JAXBContext.newInstance(it.prisma.getclassifiche.ROOT.class);
          jaxbRichiestaClassifiche.createMarshaller().marshal(richiestaClassifiche, xmlStringWriterRichiestaClassifiche);
          String xmlRichiestaClassifiche = xmlStringWriterRichiestaClassifiche.toString();

          String xmlRispostaClassifiche = protocolloExtended.getClassifiche(username, loginRet.getStrDST(), xmlRichiestaClassifiche);

          try {
            JAXBContext jaxbRispostaClassifiche = JAXBContext.newInstance(it.prisma.getclassifiche.result.CLASSIFICHE.class);
            Object _f = jaxbRispostaClassifiche.createUnmarshaller().unmarshal(new InputSource(new StringReader(xmlRispostaClassifiche)));
            it.prisma.getclassifiche.result.CLASSIFICHE rispostaClassifiche = (it.prisma.getclassifiche.result.CLASSIFICHE) _f;

            if (rispostaClassifiche != null) {
              if (rispostaClassifiche.getCLASSIFICA() != null && rispostaClassifiche.getCLASSIFICA().size() > 0) {

                WSDMClassifica[] wsdmClassifiche = new WSDMClassifica[rispostaClassifiche.getCLASSIFICA().size()];

                for (int c = 0; c < rispostaClassifiche.getCLASSIFICA().size(); c++) {
                  wsdmClassifiche[c] = new WSDMClassifica();
                  it.prisma.getclassifiche.result.CLASSIFICA prismaClassifica = rispostaClassifiche.getCLASSIFICA().get(c);
                  wsdmClassifiche[c].setCodice(prismaClassifica.getCLASSCOD());
                  wsdmClassifiche[c].setDescrizione(prismaClassifica.getDESCRIZIONE());
                }

                wsdmListaClassificheRes.setListaClassifiche(wsdmClassifiche);
                wsdmListaClassificheRes.setEsito(true);
              } else {
                wsdmListaClassificheRes.setEsito(false);
                wsdmListaClassificheRes.setMessaggio("Nessuna classifica trovata");
              }
            } else {
              wsdmListaClassificheRes.setEsito(false);
              wsdmListaClassificheRes.setMessaggio("Nessuna classifica trovata");
            }
          } catch (Exception e) {
            JAXBContext jaxbRispostaClassifiche = JAXBContext.newInstance(it.prisma.result.ROOT.class);
            Object _r = jaxbRispostaClassifiche.createUnmarshaller().unmarshal(new InputSource(new StringReader(xmlRispostaClassifiche)));
            it.prisma.result.ROOT rispostaROOT = (it.prisma.result.ROOT) _r;

            if (RESULT_OK.equals(rispostaROOT.getERRORNUMBER())) {
              wsdmListaClassificheRes.setEsito(true);
              wsdmListaClassificheRes.setMessaggio(xmlRispostaClassifiche);
            } else {
              wsdmListaClassificheRes.setEsito(false);
              wsdmListaClassificheRes.setMessaggio("Errore durante la lettura delle classifiche ["
                  + rispostaROOT.getERRORNUMBER()
                  + ", "
                  + rispostaROOT.getMESSAGE()
                  + ", "
                  + rispostaROOT.getEXCEPTION()
                  + "]");
            }
          }

        } else {
          wsdmListaClassificheRes.setEsito(false);
          wsdmListaClassificheRes.setMessaggio("Errore durante la fase di login ["
              + loginRet.getLngErrNumber()
              + ", "
              + loginRet.getStrErrString()
              + "]");
        }
      } else {
        wsdmListaClassificheRes.setEsito(false);
        wsdmListaClassificheRes.setMessaggio(messaggioCtr.toString());
      }
    } catch (Exception e) {
      wsdmListaClassificheRes.setEsito(false);
      wsdmListaClassificheRes.setMessaggio(e.getMessage());
      logger.error("Errore (_listaClassifiche)", e);
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
  public WSDMListaAccountEmailRes _listaAccountEmail(String username, String password, WSDMLoginAttr loginAttr, WSDMRicercaAccountEmail ricercaAccountEmail) {
    WSDMListaAccountEmailRes wsdmListaAccountEmailRes = new WSDMListaAccountEmailRes();
    wsdmListaAccountEmailRes.setEsito(false);
    wsdmListaAccountEmailRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmListaAccountEmailRes;
  }
  
}
