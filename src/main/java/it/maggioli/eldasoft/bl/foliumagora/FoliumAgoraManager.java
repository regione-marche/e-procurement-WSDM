package it.maggioli.eldasoft.bl.foliumagora;

import it.fascicoliwebservice.FascicoliWebService;
import it.fascicoliwebservice.FascicoliWebServiceServiceLocator;
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
import it.maggioli.eldasoft.ws.dm.WSDMRicercaFascicolo;
import it.maggioli.eldasoft.ws.dm.WSDMRicercaFascicoloRes;
import it.maggioli.eldasoft.ws.dm.WSDMTrasmissioneIn;
import it.maggioli.eldasoft.ws.dm.WSDMTrasmissioneRes;
import it.maggioli.eldasoft.ws.dm.WSDMVerificaMailRes;
import it.protocollowebservice.ProtocolloWebService;
import it.protocollowebservice.ProtocolloWebServiceServiceLocator;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.log4j.Logger;

import agora.folium.ws.WSAuthentication;
import agora.folium.ws.WSEsito;
import agora.folium.ws.type.ElementoNelFascicolo;
import agora.folium.ws.type.Fascicolo;
import agora.folium.ws.type.ImmagineDocumentale;
import agora.folium.ws.type.RicercaFascicoli;
import agora.folium.ws.type.VoceTitolario;

/**
 * Manager per la gestione documentale.
 * 
 */

public class FoliumAgoraManager implements IWSDMManager {

  static Logger         logger                                = Logger.getLogger(FoliumAgoraManager.class);

  static private String FOLIUMAGORA_WS_FASCICOLO              = "java:comp/env/FOLIUMAGORA_WS_FASCICOLO";
  static private String FOLIUMAGORA_WS_FASCICOLO_NOT_DEFINED  = "FOLIUMAGORA: l'indirizzo del servizio fascicolo non e' definito";

  static private String FOLIUMAGORA_WS_PROTOCOLLO             = "java:comp/env/FOLIUMAGORA_WS_PROTOCOLLO";
  static private String FOLIUMAGORA_WS_PROTOCOLLO_NOT_DEFINED = "FOLIUMAGORA: l'indirizzo del servizio protocollo non e' definito";

  static private String FOLIUMAGORA_AOO                       = "java:comp/env/FOLIUMAGORA_AOO";
  static private String FOLIUMAGORA_AOO_NOT_DEFINED           = "FOLIUMAGORA: il codice AOO non e' definito";

  static private String FOLIUMAGORA_APPLICAZIONE              = "java:comp/env/FOLIUMAGORA_APPLICAZIONE";
  static private String FOLIUMAGORA_APPLICAZIONE_NOT_DEFINED  = "FOLIUMAGORA: l'identificativo dell'applicazione non e' definito";

  static private String FOLIUMAGORA_ENTE                      = "java:comp/env/FOLIUMAGORA_ENTE";
  static private String FOLIUMAGORA_ENTE_NOT_DEFINED          = "FOLIUMAGORA: il codice dell'ente non e' definito";

  static private String FOLIUMAGORA_ESITO_OK                  = "000";

  static private int    FOLIUM_FASCICOLO_DOCUMENTO_IN         = 0;
  static private int    FOLIUM_FASCICOLO_DOCUMENTO_OUT        = 1;

  static private String MESSAGE_RICERCA_FASCICOLI_PIU         = "Con i parametri di ricerca indicati e' stato trovato piu' di un fascicolo. Per ottenere un risultato univoco e' possibile utilizzare l'identificativo univoco (codice fascicolo) del fascicolo.";
  static private String MESSAGE_RICERCA_NO_FASCICOLI          = "Non e' stato trovato alcun fascicolo.";

  /**
   * Ricava il client SOAP per il fascicolo.
   * 
   * @return
   * @throws Exception
   */
  private FascicoliWebService _getFascicoliWebServiceService() throws Exception {
    String url = InitialContext.doLookup(FOLIUMAGORA_WS_FASCICOLO);
    if (url == null || (url != null && "".equals(url.trim()))) {
      throw new Exception(FOLIUMAGORA_WS_FASCICOLO_NOT_DEFINED);
    }

    FascicoliWebServiceServiceLocator _locator = new FascicoliWebServiceServiceLocator();
    FascicoliWebService _service = _locator.getFascicoliWebService(new URL(url));

    return _service;

  }

  /**
   * Ricava il client SOAP per il protocollo.
   * 
   * @return
   * @throws Exception
   */
  private ProtocolloWebService _getProtocolloWebServiceService() throws Exception {
    String url = InitialContext.doLookup(FOLIUMAGORA_WS_PROTOCOLLO);
    if (url == null || (url != null && "".equals(url.trim()))) {
      throw new Exception(FOLIUMAGORA_WS_PROTOCOLLO_NOT_DEFINED);
    }

    ProtocolloWebServiceServiceLocator _locator = new ProtocolloWebServiceServiceLocator();
    ProtocolloWebService _service = _locator.getProtocolloWebService(new URL(url));

    return _service;

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
    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (FoliumAgoraUtilityControllo.ctrDocumentoLeggi(loginAttr, numeroDocumento, messaggioCtr)) {

        ProtocolloWebService _serviceProtocollo = _getProtocolloWebServiceService();

        WSAuthentication wsAuthentication = _getAuthentication(username, password);

        WSDMProtocolloDocumento wsdmDocumento = new WSDMProtocolloDocumento();

        // Numero documento
        wsdmDocumento.setNumeroDocumento(numeroDocumento);

        // Lettura del fascicolo indicato per codice
        ImmagineDocumentale recuperaContenutoResponse = _serviceProtocollo.recuperaContenuto(wsAuthentication, new Long(numeroDocumento));

        WSEsito recuperaContenutoEsito = recuperaContenutoResponse.getEsito();
        if (FOLIUMAGORA_ESITO_OK.equals(recuperaContenutoEsito.getCodiceEsito())) {

          WSDMProtocolloAllegato[] wsdmAllegati = new WSDMProtocolloAllegato[1];
          wsdmAllegati[0] = new WSDMProtocolloAllegato();

          // Nome del file e titolo del file
          if (recuperaContenutoResponse.getNomeFile() != null) {
            wsdmAllegati[0].setNome(recuperaContenutoResponse.getNomeFile());
            wsdmAllegati[0].setTitolo(recuperaContenutoResponse.getNomeFile());
          }

          // Contenuto
          if (recuperaContenutoResponse.getContenuto() != null) {
            wsdmAllegati[0].setContenuto(recuperaContenutoResponse.getContenuto());
          }

          wsdmDocumento.setAllegati(wsdmAllegati);
          wsdmprotocolloDocumentoRes.setEsito(true);

        } else {
          wsdmprotocolloDocumentoRes.setEsito(false);
          wsdmprotocolloDocumentoRes.setMessaggio(recuperaContenutoEsito.getDescrizioneEsito());
        }

        wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmDocumento);

      } else {
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
      }
    } catch (Exception e) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(e.getMessage());
      logger.error("Errore (_documentoLeggi)", e);
    }
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
    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (FoliumAgoraUtilityControllo.ctrFascicoloLeggi(loginAttr, codiceFascicolo, annoFascicolo, numeroFascicolo, classificaFascicolo,
          oggettoFascicolo, messaggioCtr)) {

        FascicoliWebService _service = _getFascicoliWebServiceService();
        WSAuthentication wsAuthentication = _getAuthentication(username, password);

        if (codiceFascicolo == null || (codiceFascicolo != null && "".equals(codiceFascicolo.trim()))) {
          RicercaFascicoli ricercaFascicoli = new RicercaFascicoli();
          ricercaFascicoli.setNome(oggettoFascicolo);
          Fascicolo[] ricercaFascicoliResponse = _service.ricercaFascicoli(wsAuthentication, ricercaFascicoli);
          if (ricercaFascicoliResponse != null) {
            if (ricercaFascicoliResponse.length == 0) {
              wsdmFascicoloRes.setMessaggio(MESSAGE_RICERCA_NO_FASCICOLI);
              wsdmFascicoloRes.setEsito(false);
            } else if (ricercaFascicoliResponse.length == 1) {
              WSEsito ricercaFascicoliResponseEsitoPrimoElemento = ricercaFascicoliResponse[0].getEsito();
              if (FOLIUMAGORA_ESITO_OK.equals(ricercaFascicoliResponseEsitoPrimoElemento.getCodiceEsito())) {
                Long idFolder = ricercaFascicoliResponse[0].getIdFolder();
                codiceFascicolo = idFolder.toString();
                wsdmFascicoloRes.setEsito(true);
              } else {
                wsdmFascicoloRes.setEsito(false);
                wsdmFascicoloRes.setMessaggio(MESSAGE_RICERCA_NO_FASCICOLI);
              }
            } else {
              wsdmFascicoloRes.setEsito(false);
              wsdmFascicoloRes.setMessaggio(MESSAGE_RICERCA_FASCICOLI_PIU);
            }
          }
        }

        if (codiceFascicolo != null && !"".equals(codiceFascicolo.trim())) {
          // Lettura del fascicolo indicato per codice
          Fascicolo recuperaFascicoloResponse = _service.recuperaFascicolo(wsAuthentication, new Long(codiceFascicolo));

          WSEsito recuperaFascicoloEsito = recuperaFascicoloResponse.getEsito();
          if (FOLIUMAGORA_ESITO_OK.equals(recuperaFascicoloEsito.getCodiceEsito())) {

            WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();

            // Codice
            wsdmFascicolo.setCodiceFascicolo(codiceFascicolo);

            // Nome
            String nome = recuperaFascicoloResponse.getNome();
            wsdmFascicolo.setOggettoFascicolo(nome);

            // Descrizione
            String descrizione = recuperaFascicoloResponse.getDescrizione();
            wsdmFascicolo.setDescrizioneFascicolo(descrizione);

            // Data e anno apertura
            try {
              String dataApertura = recuperaFascicoloResponse.getDataApertura();
              if (dataApertura != null) {
                Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(dataApertura);
                Calendar cal1 = Calendar.getInstance();
                cal1.setTime(date1);
                wsdmFascicolo.setAnnoFascicolo(new Long(cal1.get(Calendar.YEAR)));
                wsdmFascicolo.setDataFascicolo(date1);
              }
            } catch (Exception e) {

            }

            // Numero
            String numero = recuperaFascicoloResponse.getNumero();
            wsdmFascicolo.setNumeroFascicolo(numero);

            // Titolario
            VoceTitolario voceTitolarioResponse = recuperaFascicoloResponse.getVoceTitolario();
            if (voceTitolarioResponse != null) {
              String codiceTitolario = voceTitolarioResponse.getCodice();
              String descrizioneTitolario = voceTitolarioResponse.getDescrizione();

              wsdmFascicolo.setClassificaFascicolo(codiceTitolario);
              wsdmFascicolo.setClassificaFascicoloDescrizione(descrizioneTitolario);
            }

            // Lettura degli elementi presenti nel fascicolo
            ElementoNelFascicolo[] elementiNelFascicoloResponse = _service.elencoElementiNelFascicolo(wsAuthentication, new Long(
                codiceFascicolo));
            if (elementiNelFascicoloResponse != null && elementiNelFascicoloResponse.length > 0) {

              WSEsito elementiNelFascicoloResponseEsitoPrimoElemento = elementiNelFascicoloResponse[0].getEsito();

              if (FOLIUMAGORA_ESITO_OK.equals(elementiNelFascicoloResponseEsitoPrimoElemento.getCodiceEsito())) {

                WSDMFascicoloDocumento[] fascicoloDocumenti = new WSDMFascicoloDocumento[elementiNelFascicoloResponse.length];

                for (int el = 0; el < elementiNelFascicoloResponse.length; el++) {
                  ElementoNelFascicolo elementoNelFascicolo = elementiNelFascicoloResponse[el];
                  fascicoloDocumenti[el] = new WSDMFascicoloDocumento();

                  // Data e anno protocollo
                  try {
                    String dataProtocollo = elementoNelFascicolo.getDataProtocollo();
                    if (dataProtocollo != null) {
                      Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(dataProtocollo);
                      Calendar cal2 = Calendar.getInstance();
                      cal2.setTime(date2);
                      fascicoloDocumenti[el].setAnnoProtocollo(new Long(cal2.get(Calendar.YEAR)));
                      fascicoloDocumenti[el].setDataProtocollo(date2);
                    }
                  } catch (Exception e) {

                  }

                  // Numero protocollo
                  if (elementoNelFascicolo.getNumeroProtocollo() != null) {
                    fascicoloDocumenti[el].setNumeroProtocollo(elementoNelFascicolo.getNumeroProtocollo().toString());
                  }

                  // Numero documento
                  if (elementoNelFascicolo.getIdElemento() != null) {
                    fascicoloDocumenti[el].setNumeroDocumento(elementoNelFascicolo.getIdElemento().toString());
                  }

                  // Descrizione
                  if (elementoNelFascicolo.getDescrizione() != null) {
                    fascicoloDocumenti[el].setOggetto(elementoNelFascicolo.getDescrizione());
                  }

                  // Fascicolo IN/OUT
                  // La codifica non e' chiara, non abbiamo nemmeno le
                  // specifiche dei servizi,
                  // per il momento si evita di restituire l'informazione
                  // if (elementoNelFascicolo.getTipo() ==
                  // FOLIUM_FASCICOLO_DOCUMENTO_IN) {
                  // fascicoloDocumenti[el].setInout(WSDMProtocolloInOut.IN);
                  // } else if (elementoNelFascicolo.getTipo() ==
                  // FOLIUM_FASCICOLO_DOCUMENTO_OUT) {
                  // fascicoloDocumenti[el].setInout(WSDMProtocolloInOut.OUT);
                  // }
                }
                wsdmFascicolo.setDocumenti(fascicoloDocumenti);
              }

            }

            wsdmFascicoloRes.setEsito(true);
            wsdmFascicoloRes.setFascicolo(wsdmFascicolo);

          } else {
            wsdmFascicoloRes.setEsito(false);
            wsdmFascicoloRes.setMessaggio(recuperaFascicoloEsito.getDescrizioneEsito());
          }
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

  private WSAuthentication _getAuthentication(String username, String password) throws NamingException, Exception {
    WSAuthentication wsAuthentication = new WSAuthentication();

    // AOO
    String aoo = InitialContext.doLookup(FOLIUMAGORA_AOO);
    if (aoo == null || (aoo != null && "".equals(aoo.trim()))) {
      throw new Exception(FOLIUMAGORA_AOO_NOT_DEFINED);
    }
    wsAuthentication.setAoo(aoo);

    // Applicazione
    String applicazione = InitialContext.doLookup(FOLIUMAGORA_APPLICAZIONE);
    if (applicazione == null || (applicazione != null && "".equals(applicazione.trim()))) {
      throw new Exception(FOLIUMAGORA_APPLICAZIONE_NOT_DEFINED);
    }
    wsAuthentication.setApplicazione(applicazione);

    // Ente
    String ente = InitialContext.doLookup(FOLIUMAGORA_ENTE);
    if (ente == null || (ente != null && "".equals(ente.trim()))) {
      throw new Exception(FOLIUMAGORA_ENTE_NOT_DEFINED);
    }
    wsAuthentication.setEnte(ente);

    // Utente
    wsAuthentication.setUsername(username);

    // Password
    wsAuthentication.setPassword(password);
    return wsAuthentication;
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
  
  @Override
  public WSDMProtocolloDocumentoRes _protocolloAsincronoEsito(String username, String password, WSDMLoginAttr loginAttr, String id) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    wsdmprotocolloDocumentoRes.setEsito(false);
    wsdmprotocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmprotocolloDocumentoRes;
  }

}
