package it.maggioli.eldasoft.bl.smat;

import it.maggioli.eldasoft.bl.IWSDMManager;
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

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.ws.WebServiceException;

import org.apache.axis.SimpleChain;
import org.apache.axis.SimpleTargetedChain;
import org.apache.axis.client.AxisClient;
import org.apache.axis.client.Call;
import org.apache.axis.client.Stub;
import org.apache.axis.configuration.SimpleProvider;
import org.apache.axis.transport.http.HTTPSender;
import org.apache.axis.transport.http.HTTPTransport;
import org.apache.log4j.Logger;

import DefaultNamespace.ArchiviaDocServiceLocator;

/**
 * Manager per la gestione documentale.
 * 
 */

public class SmatManager implements IWSDMManager {

  static Logger              logger                 = Logger.getLogger(SmatManager.class);

  static private String      SMAT_WS                = "java:comp/env/SMAT_WS";

  static public final String PROTOCOLLO_IN_INGRESSO = "I";
  static public final String PROTOCOLLO_IN_USCITA   = "U";

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

  /**
   * Ottiene accesso al servizio.
   * 
   * @return
   * @throws Exception
   */
  private DefaultNamespace.ArchiviaDoc getArchiviaDoc(String username, String password) throws Exception {
    String wsSmatAddress = InitialContext.doLookup(SMAT_WS);
    if (wsSmatAddress == null || (wsSmatAddress != null && "".equals(wsSmatAddress))) {
      throw new Exception(URL_NOT_DEFINED);
    }

    // Gestione servizio ed "endpoint"
    ArchiviaDocServiceLocator archiviaDocServiceLocator = new ArchiviaDocServiceLocator();
    DefaultNamespace.ArchiviaDoc archiviaDoc = archiviaDocServiceLocator.getDomino(new URL(wsSmatAddress));

    // Aggiunta di un handler per la modifica del messaggio SOAP
    SimpleProvider clientConfig = new SimpleProvider();
    SOAPHandlers soapHandler = new SOAPHandlers();
    SimpleChain reqHandler = new SimpleChain();
    SimpleChain respHandler = new SimpleChain();
    reqHandler.addHandler(soapHandler);
    org.apache.axis.Handler pivot = new HTTPSender();
    org.apache.axis.Handler transport = new SimpleTargetedChain(reqHandler, pivot, respHandler);
    clientConfig.deployTransport(HTTPTransport.DEFAULT_TRANSPORT_NAME, transport);
    archiviaDocServiceLocator.setEngineConfiguration(clientConfig);
    archiviaDocServiceLocator.setEngine(new AxisClient(clientConfig));

    // Autenticazione
    ((Stub) archiviaDoc)._setProperty(Call.USERNAME_PROPERTY, username);
    ((Stub) archiviaDoc)._setProperty(Call.PASSWORD_PROPERTY, password);

    return archiviaDoc;

  }

  @Override
  public WSDMProtocolloDocumentoRes _protocolloInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (SmatUtilityControllo.ctrProtocolloInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {
        _protocolloDocumentiInserisci(username, password, wsdmprotocolloDocumentoIn, "S", wsdmprotocolloDocumentoRes);
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
    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (SmatUtilityControllo.ctrDocumentoInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {
        _protocolloDocumentiInserisci(username, password, wsdmprotocolloDocumentoIn, "N", wsdmprotocolloDocumentoRes);
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

  /**
   * Inserimento di un protocollo (protocolla = S) o un documento non
   * protocollato (protocolla = N)
   * 
   * @param wsdmprotocolloDocumentoIn
   * @param protocolla
   * @throws Exception
   */
  private void _protocolloDocumentiInserisci(String username, String password, WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn,
      String protocolla, WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes) throws Exception {

    DefaultNamespace.ArchiviaDoc archiviaDoc = this.getArchiviaDoc(username, password);

    // Archiviazione documentale
    // Sempre SI
    String archivia = "S";

    // Data della comunicazione
    // La data deve essere comunicata come stringa formattata gg/mm/aaaa
    String data = null;
    Date wsdmData = wsdmprotocolloDocumentoIn.getData();
    if (wsdmData != null) {
      data = new SimpleDateFormat("dd/MM/yyyy").format(wsdmData);
    }

    // Mittente della comunicazione.
    // Puo' essere lasciato vuoto.
    // Il formato permette di indicare un solo mittente, si considera solo
    // il primo.
    // Il mittente e' identificato dal solo indirizzo email
    String mittente = "";
    WSDMProtocolloAnagrafica[] wsdmMittenti = wsdmprotocolloDocumentoIn.getMittenti();
    if (wsdmMittenti != null && wsdmMittenti.length > 0) {
      mittente = wsdmMittenti[0].getEmail();
    }

    // Destinatario della comunicazione.
    // Puo' essere lasciato vuoto.
    // Il formato permette di indicare anche piu' di un destinatario, per i
    // destinatari multipli utilizzare il separatore ";".
    // Il destinatario e' identificato dal solo indirizzo email.
    String destinatario = "";
    WSDMProtocolloAnagrafica[] wsdmDestinatari = wsdmprotocolloDocumentoIn.getDestinatari();
    if (wsdmDestinatari != null && wsdmDestinatari.length > 0) {
      for (int d = 0; d < wsdmDestinatari.length; d++) {
        if (d > 0) destinatario += ";";
        destinatario += wsdmDestinatari[d].getEmail();
      }
    }

    // Fascicolo
    // Il formato permette di indicare il solo codice del fascicolo, senza
    // descrizione.
    String fascicolo = "";
    WSDMInserimentoInFascicolo inserimentoInFascicolo = wsdmprotocolloDocumentoIn.getInserimentoInFascicolo();
    if (WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO.equals(inserimentoInFascicolo)
        || WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(inserimentoInFascicolo)) {
      fascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getCodiceFascicolo();
    }

    // Oggetto della comunicazione
    String oggetto = wsdmprotocolloDocumentoIn.getOggetto();

    // Invio PEC
    String invia = "N";
    if (wsdmprotocolloDocumentoIn.getInviaMail() != null) {
      invia = "S";
    }

    // Tipo di protocollazione (I: ingresso, U: uscita).
    String tipo = "";
    WSDMProtocolloInOut inOut = wsdmprotocolloDocumentoIn.getInout();
    if (WSDMProtocolloInOut.IN.equals(inOut)) {
      tipo = PROTOCOLLO_IN_INGRESSO;
    } else if (WSDMProtocolloInOut.OUT.equals(inOut)) {
      tipo = PROTOCOLLO_IN_USCITA;
    }

    // Note
    String note = "";
    if (wsdmprotocolloDocumentoIn.getDescrizione() != null) {
      note = wsdmprotocolloDocumentoIn.getDescrizione();
    }

    // Allegati
    // XsdStringArray nomefile = new XsdStringArray();
    // XsdBase64BinaryArray base64FILE = new XsdBase64BinaryArray();
    // WSDMProtocolloAllegato[] wsdmprotocolloAllegati =
    // wsdmprotocolloDocumentoIn.getAllegati();
    // if (wsdmprotocolloAllegati != null && wsdmprotocolloAllegati.length > 0)
    // {
    // List<String> fileItems = nomefile.getItem();
    // List<byte[]> base64Items = base64FILE.getItem();
    // for (int a = 0; a < wsdmprotocolloAllegati.length; a++) {
    // fileItems.add(wsdmprotocolloAllegati[a].getNome());
    //
    // String contenuto = new String(wsdmprotocolloAllegati[a].getContenuto(),
    // "UTF-8");
    // contenuto = contenuto.trim();
    // String contenutoBase64 = Base64.encode(contenuto.getBytes());
    // base64Items.add(contenutoBase64.getBytes());
    // }
    // }

    String[] nomefile = new String[1];
    byte[][] base64FILE = new byte[1][];
    WSDMProtocolloAllegato[] wsdmprotocolloAllegati = wsdmprotocolloDocumentoIn.getAllegati();
    if (wsdmprotocolloAllegati != null && wsdmprotocolloAllegati.length > 0) {

      nomefile = new String[wsdmprotocolloAllegati.length];
      base64FILE = new byte[wsdmprotocolloAllegati.length][];

      for (int a = 0; a < wsdmprotocolloAllegati.length; a++) {
        nomefile[a] = wsdmprotocolloAllegati[a].getNome();

        // String contenuto = new
        // String(wsdmprotocolloAllegati[a].getContenuto(), "UTF-8");
        // contenuto = contenuto.trim();
        // String contenutoBase64 = Base64.encode(contenuto.getBytes());
        // base64FILE[a] = contenutoBase64.getBytes();

        base64FILE[a] = wsdmprotocolloAllegati[a].getContenuto();

      }
    }

    // Lettura della risposta
    try {

      // DOCRESPONSE docResponse = archiviaDoc.addnewdoc(archivia, data,
      // mittente, destinatario, fascicolo, oggetto, protocolla, invia, tipo,
      // note, nomefile, base64FILE);

      DefaultNamespace.DOCRESPONSE docResponse = archiviaDoc.ADDNEWDOC(archivia, data, mittente, destinatario, fascicolo, oggetto,
          protocolla, invia, tipo, note, nomefile, base64FILE);

      wsdmprotocolloDocumentoRes.setEsito(true);
      WSDMProtocolloDocumento wsdmProtocolloDocumento = new WSDMProtocolloDocumento();
      wsdmProtocolloDocumento.setNumeroProtocollo(docResponse.getNUMERO());
      wsdmProtocolloDocumento.setNumeroDocumento(docResponse.getDOCID());
      try {
        if (docResponse.getDATAPROTO() != null) {
          SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
          wsdmProtocolloDocumento.setDataProtocollo(f.parse(docResponse.getDATAPROTO()));
          Calendar dataProtocolloToday = Calendar.getInstance();
          wsdmProtocolloDocumento.setAnnoProtocollo(new Long(dataProtocolloToday.get(Calendar.YEAR)));
        } else {
          Calendar dataProtocolloToday = Calendar.getInstance();
          wsdmProtocolloDocumento.setDataProtocollo(dataProtocolloToday.getTime());
          wsdmProtocolloDocumento.setAnnoProtocollo(new Long(dataProtocolloToday.get(Calendar.YEAR)));
        }
      } catch (Exception e) {
        Calendar dataProtocolloToday = Calendar.getInstance();
        wsdmProtocolloDocumento.setDataProtocollo(dataProtocolloToday.getTime());
        wsdmProtocolloDocumento.setAnnoProtocollo(new Long(dataProtocolloToday.get(Calendar.YEAR)));
      }

      if (docResponse.getFASCICOLO() != null) {
        WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();
        wsdmFascicolo.setCodiceFascicolo(docResponse.getFASCICOLO());
        wsdmProtocolloDocumento.setFascicolo(wsdmFascicolo);
      }

      wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmProtocolloDocumento);

    } catch (Exception e) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(e.getMessage());
    }
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
