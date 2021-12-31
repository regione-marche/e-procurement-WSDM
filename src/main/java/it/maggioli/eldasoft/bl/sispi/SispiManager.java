package it.maggioli.eldasoft.bl.sispi;

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
import it.sispi.protocollo.Protocollo;
import it.sispi.protocollo.ProtocolloService;
import it.sispi.protocollo.WsProtAnagrafica;
import it.sispi.protocollo.WsProtClient;
import it.sispi.protocollo.WsProtException_Exception;
import it.sispi.protocollo.WsProtRichMappata;
import it.sispi.protocollo.WsProtRisposta;
import it.sispi.protocollo.WsProtocolloAllegato;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.message.Message;
import org.apache.log4j.Logger;
import org.apache.xerces.impl.dv.util.Base64;

import com.sun.istack.ByteArrayDataSource;

/**
 * Manager per la gestione documentale.
 * 
 */

public class SispiManager implements IWSDMManager {

  static Logger              logger                       = Logger.getLogger(SispiManager.class);

  static private String      SISPI_PROTOCOLLO             = "java:comp/env/SISPI_PROTOCOLLO";
  static private String      SISPI_CLIENTID               = "java:comp/env/SISPI_CLIENTID";

  static private String      SISPI_PROTOCOLLO_NOT_DEFINED = "SISPI: l'indirizzo del servizio di protocollo non e' definito";
  static private String      SISPI_CLIENTID_NOT_DEFINED   = "SISPI: l'identificativo del client (CLIENTID) non e' definito";

  static public final String PROTOCOLLO_IN_INGRESSO       = "";
  static public final String PROTOCOLLO_IN_USCITA         = "";

  static public final String ALLEGATO_PRINCIPALE          = "P";
  static public final String ALLEGATO_NON_PRINCIPALE      = "A";

  static public final String ANAGRAFICA_MITTENTE          = "M";
  static public final String ANAGRAFICA_DESTINATARIO      = "D";

  static public final String ANAGRAFICA_SESSO_ALTRO       = "A";

  /**
   * Restituisce accesso al servizio.
   * 
   * @param username
   * @param password
   * @return
   * @throws Exception
   */
  private Protocollo getProtocollo(String username, String password) throws NamingException, Exception {

    // Url del servizio
    String url = InitialContext.doLookup(SISPI_PROTOCOLLO);
    if (url == null || (url != null && "".equals(url))) {
      throw new Exception(SISPI_PROTOCOLLO_NOT_DEFINED);
    }

    // Gestione servizio
    ProtocolloService protocolloService = new ProtocolloService();
    Protocollo protocollo = protocolloService.getProtocolloServicePort();
    Client clientProtocollo = ClientProxy.getClient(protocollo);
    clientProtocollo.getRequestContext().put(Message.ENDPOINT_ADDRESS, url);

    return protocollo;

  }

  /**
   * Restituisce oggetto WsProtClient.
   * 
   * @return
   * @throws NamingException
   * @throws Exception
   */
  private WsProtClient getWsProtClient() throws NamingException, Exception {

    String clientid = InitialContext.doLookup(SISPI_CLIENTID);
    if (clientid == null || (clientid != null && "".equals(clientid))) {
      throw new Exception(SISPI_CLIENTID_NOT_DEFINED);
    }

    WsProtClient protClient = new WsProtClient();
    protClient.setClientId(clientid);

    return protClient;
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
      if (SispiUtilityControllo.ctrProtocolloInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {
        _protocolloInserisci(username, password, wsdmprotocolloDocumentoIn, wsdmprotocolloDocumentoRes);
      } else {
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
      }
    } catch (NamingException e) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_protocolloInserisci)", e);
    } catch (Exception e) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(e.getMessage());
      logger.error("Errore (_protocolloInserisci)", e);
    }

    return wsdmprotocolloDocumentoRes;
  }

  /**
   * Gestione inserimento in protocollo.
   * 
   * @param username
   * @param password
   * @param wsdmprotocolloDocumentoIn
   * @param wsdmprotocolloDocumentoRes
   * @throws DatatypeConfigurationException
   * @throws UnsupportedEncodingException
   * @throws NamingException
   * @throws Exception
   * @throws WsProtException_Exception
   */
  private void _protocolloInserisci(String username, String password, WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn,
      WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes) throws DatatypeConfigurationException, UnsupportedEncodingException,
      NamingException, Exception, WsProtException_Exception {

    WsProtRichMappata protRichMappata = new WsProtRichMappata();

    // UserIdOperatore
    String userIdOperatore = "";
    protRichMappata.setUserIdOperatore(userIdOperatore);

    // Oggetto
    protRichMappata.setOggetto(wsdmprotocolloDocumentoIn.getOggetto());

    // ********************************************************************
    // ********************************************************************
    // CodiceServizio - CHIARIRE CON VERSO IN/OUT
    if (wsdmprotocolloDocumentoIn.getTipoDocumento() != null) {
      Long codiceServizio = new Long(wsdmprotocolloDocumentoIn.getTipoDocumento());
      protRichMappata.setCodiceServizio(codiceServizio);
    }

    // Data documento
    GregorianCalendar gregorianCalendar = new GregorianCalendar();
    XMLGregorianCalendar now = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
    protRichMappata.setDataDocumento(now);

    // Allegati
    WSDMProtocolloAllegato[] wsdmprotocolloAllegati = wsdmprotocolloDocumentoIn.getAllegati();
    if (wsdmprotocolloAllegati != null && wsdmprotocolloAllegati.length > 0) {

      List<WsProtocolloAllegato> listaAllegati = protRichMappata.getAllegato();

      for (int a = 0; a < wsdmprotocolloAllegati.length; a++) {
        WsProtocolloAllegato singoloAllegato = new WsProtocolloAllegato();
        singoloAllegato.setNome(wsdmprotocolloAllegati[a].getNome());
        singoloAllegato.setNote(wsdmprotocolloAllegati[a].getTitolo());

        // Tipo: valori ammessi (P)rincipale, (A)llegato).
        // Per una registrazione di protocollo e' ammesso al massimo un
        // documento di tipo P
        if (a == 0) {
          singoloAllegato.setTipo(ALLEGATO_PRINCIPALE);
        } else {
          singoloAllegato.setTipo(ALLEGATO_NON_PRINCIPALE);
        }

        String contenuto = new String(wsdmprotocolloAllegati[a].getContenuto(), "UTF-8");
        contenuto = contenuto.trim();
        String contenutoBase64 = Base64.encode(contenuto.getBytes());
        DataSource source = new ByteArrayDataSource(contenutoBase64.getBytes(), "application/octet-stream");
        singoloAllegato.setFileData(new DataHandler(source));

        listaAllegati.add(singoloAllegato);

      }
    }

    // Mittenti/destinatari (almeno un mittente/destinatario e'
    // obbligatorio)
    WSDMProtocolloInOut inOut = wsdmprotocolloDocumentoIn.getInout();
    List<WsProtAnagrafica> listaAnagrafiche = protRichMappata.getMittDestAna();

    if (WSDMProtocolloInOut.IN.equals(inOut)) {
      WSDMProtocolloAnagrafica[] wsdmMittentiDestinatari = wsdmprotocolloDocumentoIn.getMittenti();
      __popolaMittentiDestinatari(wsdmMittentiDestinatari, ANAGRAFICA_MITTENTE, listaAnagrafiche);
    } else if (WSDMProtocolloInOut.OUT.equals(inOut)) {
      WSDMProtocolloAnagrafica[] wsdmMittentiDestinatari = wsdmprotocolloDocumentoIn.getDestinatari();
      __popolaMittentiDestinatari(wsdmMittentiDestinatari, ANAGRAFICA_DESTINATARIO, listaAnagrafiche);
    }

    Protocollo protocollo = getProtocollo(username, password);
    WsProtRisposta protRisposta = protocollo.regProtMappata(protRichMappata, this.getWsProtClient());

    WSDMProtocolloDocumento wsdmProtocolloDocumento = new WSDMProtocolloDocumento();

    // Anno protocollo
    long annoProt = protRisposta.getAnnoProt();
    wsdmProtocolloDocumento.setAnnoProtocollo(new Long(annoProt));

    // Data protocollo
    XMLGregorianCalendar datProt = protRisposta.getDatProt();
    if (datProt != null) {
      Calendar cal = Calendar.getInstance();
      cal.setTime(datProt.toGregorianCalendar().getTime());
      wsdmProtocolloDocumento.setDataProtocollo(cal.getTime());
    } else {
      Calendar dataProtocolloToday = Calendar.getInstance();
      wsdmProtocolloDocumento.setDataProtocollo(dataProtocolloToday.getTime());
    }

    // Numero protocollo
    long numProt = protRisposta.getNumProt();
    wsdmProtocolloDocumento.setNumeroProtocollo(String.valueOf(numProt));

    // Codice identificativo del registro di protocollo
    if (protRisposta.getRegProt() != null) {
      wsdmProtocolloDocumento.setNumeroDocumento(protRisposta.getRegProt());
    }

    wsdmprotocolloDocumentoRes.setEsito(true);
    wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmProtocolloDocumento);
  }

  /**
   * Popola la lista dei mittenti/destinatari.
   * 
   * @param wsdmMittentiDestinatari
   * @param mittDest
   * @param listaAnagrafiche
   */
  private void __popolaMittentiDestinatari(WSDMProtocolloAnagrafica[] wsdmMittentiDestinatari, String mittDest,
      List<WsProtAnagrafica> listaAnagrafiche) {
    if (wsdmMittentiDestinatari != null && wsdmMittentiDestinatari.length > 0) {
      for (int md = 0; md < wsdmMittentiDestinatari.length; md++) {
        WsProtAnagrafica singolaAnagrafica = new WsProtAnagrafica();

        // Tipo di anagrafica
        singolaAnagrafica.setMittDest(mittDest);

        // Cognome
        String cognome = wsdmMittentiDestinatari[md].getCognomeointestazione();
        if (cognome != null && cognome.length() > 60) cognome = cognome.substring(0, 60);
        singolaAnagrafica.setCognome(cognome);

        // Nome
        if (wsdmMittentiDestinatari[md] != null) {
          singolaAnagrafica.setNome(wsdmMittentiDestinatari[md].getNome());
        }

        // Codice fiscale
        if (wsdmMittentiDestinatari[md] != null) {
          singolaAnagrafica.setCodFisPIVA(wsdmMittentiDestinatari[md].getCodiceFiscale());
        }

        // Denominazione dell'ente
        String denominazione = wsdmMittentiDestinatari[md].getCognomeointestazione();
        if (denominazione != null && denominazione.length() > 255) denominazione = denominazione.substring(0, 255);
        singolaAnagrafica.setDenominaz(denominazione);

        // Sesso
        singolaAnagrafica.setSesso(ANAGRAFICA_SESSO_ALTRO);

        // Email
        if (wsdmMittentiDestinatari[md].getEmail() != null) {
          singolaAnagrafica.setEmail(wsdmMittentiDestinatari[md].getEmail());
        }

        // Indirizzo
        if (wsdmMittentiDestinatari[md].getIndirizzoResidenza() != null) {
          singolaAnagrafica.setIndirizzo(wsdmMittentiDestinatari[md].getIndirizzoResidenza());
        }

        // Comune
        if (wsdmMittentiDestinatari[md].getComuneResidenza() != null) {
          singolaAnagrafica.setCognome(wsdmMittentiDestinatari[md].getCodiceComuneResidenza());
        }

        listaAnagrafiche.add(singolaAnagrafica);

      }
    }
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
    wsdmprotocolloDocumentoRes.setEsito(false);
    wsdmprotocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
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
      Long annoFascicolo, String numeroFascicolo, String classificaFascicolo) {
    WSDMFascicoloRes wsdmFascicoloRes = new WSDMFascicoloRes();
    wsdmFascicoloRes.setEsito(false);
    wsdmFascicoloRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmFascicoloRes;
  }

  @Override
  public WSDMFascicoloRes _fascicoloMetadatiLeggi(String username, String password, WSDMLoginAttr loginAttr, String codiceFascicolo,
      Long annoFascicolo, String numeroFascicolo, String classificaFascicolo) {
    WSDMFascicoloRes wsdmFascicoloRes = new WSDMFascicoloRes();
    wsdmFascicoloRes.setEsito(false);
    wsdmFascicoloRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmFascicoloRes;
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
