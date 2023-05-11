package it.maggioli.eldasoft.bl.folium2;

import java.net.URL;
import java.util.Calendar;
import java.util.Date;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.log4j.Logger;

import agora.folium2.ws.WSAuthentication;
import agora.folium2.ws.WSEsito;
import folium2.protocollowebservice.Allegato;
import folium2.protocollowebservice.DocumentoProtocollato;
import folium2.protocollowebservice.MittenteDestinatario;
import folium2.protocollowebservice.ProtocolloWebService;
import folium2.protocollowebservice.ProtocolloWebServiceServiceLocator;
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
import it.maggioli.eldasoft.ws.dm.WSDMRicercaFascicolo;
import it.maggioli.eldasoft.ws.dm.WSDMRicercaFascicoloRes;
import it.maggioli.eldasoft.ws.dm.WSDMTrasmissioneIn;
import it.maggioli.eldasoft.ws.dm.WSDMTrasmissioneRes;
import it.maggioli.eldasoft.ws.dm.WSDMVerificaMailRes;

/**
 * Manager per la gestione documentale.
 * 
 */

public class Folium2Manager implements IWSDMManager {

  static Logger              logger                            = Logger.getLogger(Folium2Manager.class);

  static private String      FOLIUM2_WS_PROTOCOLLO             = "java:comp/env/FOLIUM2_WS_PROTOCOLLO";
  static private String      FOLIUM2_WS_PROTOCOLLO_NOT_DEFINED = "FOLIUM2: l'indirizzo del servizio protocollo non e' definito";

  static private String      FOLIUM2_AOO                       = "java:comp/env/FOLIUM2_AOO";
  static private String      FOLIUM2_AOO_NOT_DEFINED           = "FOLIUM2: il codice AOO non e' definito";

  static private String      FOLIUM2_APPLICAZIONE              = "java:comp/env/FOLIUM2_APPLICAZIONE";
  static private String      FOLIUM2_APPLICAZIONE_NOT_DEFINED  = "FOLIUM2: l'identificativo dell'applicazione non e' definito";

  static private String      FOLIUM2_ENTE                      = "java:comp/env/FOLIUM2_ENTE";
  static private String      FOLIUM2_ENTE_NOT_DEFINED          = "FOLIUM2: il codice dell'ente non e' definito";

  static private String      FOLIUM2_REGISTRO                  = "java:comp/env/FOLIUM2_REGISTRO";

  static public final String PROTOCOLLO_IN_INGRESSO            = "I";
  static public final String PROTOCOLLO_IN_USCITA              = "U";

  static public final String TIPO_ANAGRAFICA_PERSONA_FISICA    = "F";
  static public final String TIPO_ANAGRAFICA_PERSONA_GIURIDICA = "G";

  static public final String ESITO_OK                          = "000";

  static private String      FOLIUM2_ESEGUI_SALVA_DOCUMENTO    = "java:comp/env/FOLIUM2_ESEGUI_SALVA_DOCUMENTO";
  static public final String ESEGUI_SALVA_DOCUMENTO_SI         = "SI";

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
      if (Folium2UtilityControllo.ctrProtocolloInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {
        _protocolloInserisci(username, password, wsdmprotocolloDocumentoIn, wsdmprotocolloDocumentoRes);
      } else {
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
      }
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
   * Gestione inserimento in protocollo.
   * 
   * @param username
   * @param password
   * @param wsdmprotocolloDocumentoIn
   * @param wsdmprotocolloDocumentoRes
   * @throws NamingException
   * @throws Exception
   */
  private void _protocolloInserisci(String username, String password, WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn,
      WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes) throws NamingException, Exception {

    boolean esito = false;
    String messaggio = "";

    ProtocolloWebService _serviceProtocollo = _getProtocolloWebServiceService();

    WSAuthentication wsAuthentication = _getAuthentication(username, password);

    DocumentoProtocollato documentoRichiesta = new DocumentoProtocollato();

    // Tipo Protocollo (verso del protocollo)
    String tipoProtocollo = null;
    WSDMProtocolloInOut inOut = wsdmprotocolloDocumentoIn.getInout();
    if (WSDMProtocolloInOut.IN.equals(inOut)) {
      tipoProtocollo = PROTOCOLLO_IN_INGRESSO;
    } else if (WSDMProtocolloInOut.OUT.equals(inOut)) {
      tipoProtocollo = PROTOCOLLO_IN_USCITA;
    }
    documentoRichiesta.setTipoProtocollo(tipoProtocollo);

    // Registro (se non e' indicato si utilizza il registro ufficiale)
    String registro = null;
    try {
      registro = InitialContext.doLookup(FOLIUM2_REGISTRO);
    } catch (NamingException e) {

    }
    if (registro != null) {
      documentoRichiesta.setRegistro(registro);
    }

    // Oggetto del protocollo
    if (wsdmprotocolloDocumentoIn.getOggetto() != null) {
      documentoRichiesta.setOggetto(wsdmprotocolloDocumentoIn.getOggetto());
    }

    // Mittenti e destinatari
    if (WSDMProtocolloInOut.IN.equals(inOut)) {
      WSDMProtocolloAnagrafica[] wsdmMittentiDestinatari = wsdmprotocolloDocumentoIn.getMittenti();
      MittenteDestinatario[] mittentiRichiesta = _gestioneMittentiDestinatari(wsdmMittentiDestinatari);
      documentoRichiesta.setMittentiDestinatari(mittentiRichiesta);
    } else if (WSDMProtocolloInOut.OUT.equals(inOut)) {
      WSDMProtocolloAnagrafica[] wsdmMittentiDestinatari = wsdmprotocolloDocumentoIn.getDestinatari();
      MittenteDestinatario[] destinatariRichiesta = _gestioneMittentiDestinatari(wsdmMittentiDestinatari);
      documentoRichiesta.setMittentiDestinatari(destinatariRichiesta);
    }

    // Voci titolario/classificazione
    // Elenco degli id dei nodi di titolario per la classificazione o elenco dei
    // path (campo ordinamento) dei nodi.
    // Per distinguere gli uni dagli altri nel secondo caso si deve mettere un
    // “.” Come primo carattere del primo nodo.
    // ES: nodo = 00.01.03
    // Deve essere passata la stringa = .00.01.03.
    if (wsdmprotocolloDocumentoIn.getClassifica() != null && !"".equals(wsdmprotocolloDocumentoIn.getClassifica().trim())) {
      // String[] vociTitolario =
      // wsdmprotocolloDocumentoIn.getClassifica().split("\\.");
      // documentoRichiesta.setVociTitolario(vociTitolario);

      // Elimino i punti alla fine. Nella modalita' classica FOLIUM il codice
      // viene composto con 6 valori separati da punti. Se i valori sono nulli i
      // punti vengono inseriti lo stesso, nella nuova modalita' FOLIUM2 i punti
      // alla fine non ci devono essere.
      String classifica = wsdmprotocolloDocumentoIn.getClassifica();
      
      if(classifica.endsWith(".")) classifica = classifica.substring(0, classifica.length() - 1);
      if(classifica.endsWith(".")) classifica = classifica.substring(0, classifica.length() - 1);
      if(classifica.endsWith(".")) classifica = classifica.substring(0, classifica.length() - 1);
      if(classifica.endsWith(".")) classifica = classifica.substring(0, classifica.length() - 1);
      if(classifica.endsWith(".")) classifica = classifica.substring(0, classifica.length() - 1);
      if(classifica.endsWith(".")) classifica = classifica.substring(0, classifica.length() - 1);

      String[] vociTitolario = new String[1];
      if (classifica.startsWith(".")) {
        vociTitolario[0] = classifica;
      } else {
        vociTitolario[0] = "." + classifica;
      }
      documentoRichiesta.setVociTitolario(vociTitolario);
    }

    // Ufficio competente
    if (wsdmprotocolloDocumentoIn.getStruttura() != null) {
      documentoRichiesta.setUfficioCompetente(wsdmprotocolloDocumentoIn.getStruttura());
    }

    // isContentuto, campo obbligatorio sempre a NO
    documentoRichiesta.setIsContenuto(false);

    // Note
    if (wsdmprotocolloDocumentoIn.getCodiceGaraLotto() != null) {
      documentoRichiesta.setNote(wsdmprotocolloDocumentoIn.getCodiceGaraLotto());
    }

    // Timbro, campo obbligatorio sempre a NO
    documentoRichiesta.setTimbro(false);

    DocumentoProtocollato documentoRisposta = _serviceProtocollo.protocolla(wsAuthentication, documentoRichiesta);

    // Risposta
    WSEsito documentoRispostaEsito = documentoRisposta.getEsito();
    if (ESITO_OK.equals(documentoRispostaEsito.getCodiceEsito())) {
      esito = true;

      WSDMProtocolloDocumento wsdmProtocolloDocumento = new WSDMProtocolloDocumento();

      // Numero protocollo
      if (documentoRisposta.getNumeroProtocollo() != null) {
        wsdmProtocolloDocumento.setNumeroProtocollo(documentoRisposta.getNumeroProtocollo());
      }

      // Data e anno protocollo
      // if (documentoRisposta.getDataProtocollo() != null) {
      // wsdmProtocolloDocumento.setDataProtocollo(documentoRisposta.getDataProtocollo().getTime());
      // wsdmProtocolloDocumento.setAnnoProtocollo(new
      // Long(documentoRisposta.getDataProtocollo().get(Calendar.YEAR)));
      // }

      // Nella risposta c'e' solo la data di protocollazione ma non l'ora.
      // <dataProtocollo
      // xsi:type="xsd:dateTime">2022-07-14T00:00:00.000Z</dataProtocollo>
      // Bisogna utilizzare data e ora di sistema.
      Calendar dataProtocolloToday = Calendar.getInstance();
      wsdmProtocolloDocumento.setDataProtocollo(dataProtocolloToday.getTime());
      wsdmProtocolloDocumento.setAnnoProtocollo(new Long(dataProtocolloToday.get(Calendar.YEAR)));

      // Numero del documento (id del profilo) - Serve per il successivo
      // inserimento degli allegati
      Long idProfilo = documentoRisposta.getId();
      wsdmProtocolloDocumento.setNumeroDocumento(idProfilo.toString());

      wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmProtocolloDocumento);

      // Controllo esecuzione "salva documento". Di default si
      // assume che l'inserimento dei documenti venga sempre effettuato. La
      // nuova proprieta' non e' obbligatoria, se non presente si assume di
      // default "SI". Se presente si legge il valore.
      String eseguiSalvaDocumento = "SI";
      // Tentativo di lettura del valore di FOLIUM2_ESEGUI_SALVA_DOCUMENTO
      try {
        eseguiSalvaDocumento = InitialContext.doLookup(FOLIUM2_ESEGUI_SALVA_DOCUMENTO);
      } catch (NamingException e) {

      }

      // Inserimento degli allegati
      if (ESEGUI_SALVA_DOCUMENTO_SI.equals(eseguiSalvaDocumento.toUpperCase())) {
        WSDMProtocolloAllegato[] wsdmprotocolloAllegati = wsdmprotocolloDocumentoIn.getAllegati();
        String messaggioInserimentoAllegati = "";
        if (wsdmprotocolloAllegati != null && wsdmprotocolloAllegati.length > 0) {
          for (int a = 0; a < wsdmprotocolloAllegati.length && esito == true; a++) {

            // Dati in ingresso per la richiesta di associazione dell'allegato
            // al
            // protocollo appena inserito
            Allegato allegatoRichiesta = new Allegato();

            // Id profilo
            allegatoRichiesta.setIdProfilo(idProfilo);

            // Nome del file
            String nome = wsdmprotocolloAllegati[a].getNome();
            allegatoRichiesta.setNomeFile(nome);

            // Descrizione
            String titolo = wsdmprotocolloAllegati[a].getTitolo();
            if (titolo != null) {
              allegatoRichiesta.setDescrizione(titolo);
            }

            // Contenuto
            allegatoRichiesta.setContenuto(wsdmprotocolloAllegati[a].getContenuto());

            Allegato allegatoRisposta = _serviceProtocollo.inserisciAllegato(wsAuthentication, allegatoRichiesta);

            WSEsito allegatoRispostaEsito = allegatoRisposta.getEsito();
            if (!ESITO_OK.equals(allegatoRispostaEsito.getCodiceEsito())) {
              messaggioInserimentoAllegati += " [Allegato " + nome + ": ";
              messaggioInserimentoAllegati += allegatoRispostaEsito.getCodiceEsito() + " - " + allegatoRispostaEsito.getDescrizioneEsito();
              messaggioInserimentoAllegati += "]";
            }
          }

          if (messaggioInserimentoAllegati != null && !"".equals(messaggioInserimentoAllegati)) {
            esito = false;
            messaggio += messaggioInserimentoAllegati;
          }

        }
      }

    } else {
      esito = false;
      messaggio = documentoRispostaEsito.getDescrizioneEsito();
    }

    wsdmprotocolloDocumentoRes.setEsito(esito);
    wsdmprotocolloDocumentoRes.setMessaggio(messaggio);

  }

  private MittenteDestinatario[] _gestioneMittentiDestinatari(WSDMProtocolloAnagrafica[] wsdmMittentiDestinatari) {

    MittenteDestinatario[] mittentiDestinatariRichiesta = null;

    if (wsdmMittentiDestinatari != null && wsdmMittentiDestinatari.length > 0) {
      mittentiDestinatariRichiesta = new MittenteDestinatario[wsdmMittentiDestinatari.length];
      for (int md = 0; md < wsdmMittentiDestinatari.length; md++) {

        mittentiDestinatariRichiesta[md] = new MittenteDestinatario();

        // Gestione tipo anagrafica, cognome, nome e denominazione
        String cognomeointestazione = wsdmMittentiDestinatari[md].getCognomeointestazione();
        String nome = wsdmMittentiDestinatari[md].getNome();

        mittentiDestinatariRichiesta[md].setDenominazione(cognomeointestazione);
        mittentiDestinatariRichiesta[md].setCognome(cognomeointestazione);
        mittentiDestinatariRichiesta[md].setNome(nome);

        // Tipo di anagrafica
        // Se e' popolato solo "cognomeointestazione" si considera come
        // anagrafica di tipo G - Persona Giuridica
        // Se e' popolato anche il "nome" si considera come anagrafica di tipo
        // F - Persona Fisica
        String tipo = TIPO_ANAGRAFICA_PERSONA_GIURIDICA;
        if (cognomeointestazione != null && nome == null) {
          tipo = TIPO_ANAGRAFICA_PERSONA_GIURIDICA;
        } else if (cognomeointestazione != null && nome != null) {
          tipo = TIPO_ANAGRAFICA_PERSONA_FISICA;
        }
        mittentiDestinatariRichiesta[md].setTipo(tipo);

        // Email
        if (wsdmMittentiDestinatari[md].getEmail() != null) {
          mittentiDestinatariRichiesta[md].setEmail(wsdmMittentiDestinatari[md].getEmail());
        }

        // Indirizzo
        String indirizzo = null;
        String indirizzoResidenza = wsdmMittentiDestinatari[md].getIndirizzoResidenza();
        String localitaResidenza = wsdmMittentiDestinatari[md].getLocalitaResidenza();
        if (indirizzoResidenza != null && !"".equals(indirizzoResidenza)) {
          indirizzo = indirizzoResidenza;
        }
        if (localitaResidenza != null && !"".equals(localitaResidenza)) {
          if (indirizzo == null) {
            indirizzo = localitaResidenza;
          } else {
            indirizzo += " " + localitaResidenza;
          }
        }
        if (indirizzo != null) {
          mittentiDestinatariRichiesta[md].setIndirizzo(indirizzo);
        }

        // Citta'
        if (wsdmMittentiDestinatari[md].getComuneResidenza() != null) {
          mittentiDestinatariRichiesta[md].setCitta(wsdmMittentiDestinatari[md].getComuneResidenza());
        }
      }
    }

    return mittentiDestinatariRichiesta;

  }

  /**
   * Ricava il client SOAP per il protocollo.
   * 
   * @return
   * @throws Exception
   */
  private ProtocolloWebService _getProtocolloWebServiceService() throws Exception {
    String url = InitialContext.doLookup(FOLIUM2_WS_PROTOCOLLO);
    if (url == null || (url != null && "".equals(url.trim()))) {
      throw new Exception(FOLIUM2_WS_PROTOCOLLO_NOT_DEFINED);
    }

    ProtocolloWebServiceServiceLocator _locator = new ProtocolloWebServiceServiceLocator();
    ProtocolloWebService _service = _locator.getProtocolloWebService(new URL(url));

    return _service;

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
    wsdmprotocolloDocumentoRes = this._protocolloInserisci(username, password, loginAttr, wsdmprotocolloDocumentoIn);
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

  /**
   * Autenticazione.
   * 
   * @param username
   * @param password
   * @return
   * @throws NamingException
   * @throws Exception
   */
  private WSAuthentication _getAuthentication(String username, String password) throws NamingException, Exception {
    WSAuthentication wsAuthentication = new WSAuthentication();

    // AOO
    String aoo = InitialContext.doLookup(FOLIUM2_AOO);
    if (aoo == null || (aoo != null && "".equals(aoo.trim()))) {
      throw new Exception(FOLIUM2_AOO_NOT_DEFINED);
    }
    wsAuthentication.setAoo(aoo);

    // Applicazione
    String applicazione = InitialContext.doLookup(FOLIUM2_APPLICAZIONE);
    if (applicazione == null || (applicazione != null && "".equals(applicazione.trim()))) {
      throw new Exception(FOLIUM2_APPLICAZIONE_NOT_DEFINED);
    }
    wsAuthentication.setApplicazione(applicazione);

    // Ente
    String ente = InitialContext.doLookup(FOLIUM2_ENTE);
    if (ente == null || (ente != null && "".equals(ente.trim()))) {
      throw new Exception(FOLIUM2_ENTE_NOT_DEFINED);
    }
    wsAuthentication.setEnte(ente);

    // Utente
    wsAuthentication.setUsername(username);

    // Password
    wsAuthentication.setPassword(password);
    return wsAuthentication;
  }
  
  @Override
  public WSDMProtocolloDocumentoRes _protocolloAsincronoEsito(String username, String password, WSDMLoginAttr loginAttr, String id) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    wsdmprotocolloDocumentoRes.setEsito(false);
    wsdmprotocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmprotocolloDocumentoRes;
  }

}
