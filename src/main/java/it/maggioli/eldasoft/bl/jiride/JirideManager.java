package it.maggioli.eldasoft.bl.jiride;

import it.iride.protocollo.xsd.AllegatoIn;
import it.iride.protocollo.xsd.ArrayOfAllegatoIn;
import it.iride.protocollo.xsd.ArrayOfMittenteDestinatarioIn;
import it.iride.protocollo.xsd.MittenteDestinatarioIn;
import it.iride.protocollo.xsd.ProtoInDocument;
import it.iride.protocollo.xsd.ProtocolloIn;
import it.iride.protocollo.xsd.RecapitoIn;
import it.iride.wsatti.AttoOut;
import it.iride.wsatti.WSatti;
import it.iride.wsatti.WSattiSoap;
import it.iride.wspostaweb.WsPostaWeb;
import it.iride.wspostaweb.WsPostaWebSoap;
import it.jiride.docwsfascicolisoap.DocWSFascicoli;
import it.jiride.docwsfascicolisoap.DocWSFascicoliSoap;
import it.jiride.docwsfascicolisoap.EsitoOperazione;
import it.jiride.protocollosoap.Protocollo;
import it.jiride.protocollosoap.ProtocolloOut;
import it.jiride.protocollosoap.ProtocolloSoap;
import it.maggioli.eldasoft.bl.IWSDMManager;
import it.maggioli.eldasoft.bl.iride.IrideUtilityControllo;
import it.maggioli.eldasoft.ws.dm.WSDMAccountEmail;
import it.maggioli.eldasoft.ws.dm.WSDMAggiungiAllegatiIn;
import it.maggioli.eldasoft.ws.dm.WSDMAggiungiAllegatiRes;
import it.maggioli.eldasoft.ws.dm.WSDMAnagraficaLeggiRes;
import it.maggioli.eldasoft.ws.dm.WSDMAttoContrattoRes;
import it.maggioli.eldasoft.ws.dm.WSDMCampo;
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
import it.maggioli.eldasoft.ws.dm.WSDMRiga;
import it.maggioli.eldasoft.ws.dm.WSDMTabella;
import it.maggioli.eldasoft.ws.dm.WSDMTrasmissioneIn;
import it.maggioli.eldasoft.ws.dm.WSDMTrasmissioneRes;
import it.maggioli.eldasoft.ws.dm.WSDMUfficio;
import it.maggioli.eldasoft.ws.dm.WSDMVerificaMailRes;
import it.utrwssgateway.UtrWSSGateway;
import it.utrwssgateway.UtrWSSGatewayServiceLocator;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.UnmarshallerHandler;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.ws.WebServiceException;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.message.Message;
import org.apache.log4j.Logger;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.impl.util.Base64;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLFilter;
import org.xml.sax.XMLReader;

import wwwpa2k.ulisse.iride.web_services.ws_tabelle.schema.WsTabelle;
import wwwpa2k.ulisse.iride.web_services.ws_tabelle.schema.WsTabelleSoap;

/**
 * Manager per la gestione documentale mediante sistema di protocollo JIRIDE.
 * 
 */

public class JirideManager implements IWSDMManager {

  static Logger              logger                             = Logger.getLogger(JirideManager.class);

  static private String      WSPROTOCOLLO                       = "java:comp/env/JIRIDE_WSPROTOCOLLO";
  static private String      WSPROTOCOLLO_NOT_DEFINED           = "JIRIDE: l'indirizzo del servizio protocollo non e' definito";

  static private String      WSFASCICOLO                        = "java:comp/env/JIRIDE_WSFASCICOLO";
  static private String      WSFASCICOLO_NOT_DEFINED            = "JIRIDE: l'indirizzo del servizio fascicolo non e' definito";

  static private String      WSATTO                             = "java:comp/env/JIRIDE_WSATTO";
  static private String      WSATTO_NOT_DEFINED                 = "JIRIDE: l'indirizzo del servizio atti non e' definito";

  static private String      WSPOSTA                            = "java:comp/env/JIRIDE_WSPOSTA";
  static private String      WSPOSTA_NOT_DEFINED                = "JIRIDE: l'indirizzo del servizio posta non e' definito";

  static private String      CODICEAMMINISTRAZIONE              = "java:comp/env/JIRIDE_CODICEAMMINISTRAZIONE";
  static private String      CODICEAOO                          = "java:comp/env/JIRIDE_CODICEAOO";
  static private String      AGGIORNAANAGRAFICHE                = "java:comp/env/JIRIDE_AGGIORNAANAGRAFICHE";

  static private String      UTRWSSGATEWAY_WS                   = "java:comp/env/JIRIDE_UTRWSSGATEWAY_WS";
  static private String      UTRWSSGATEWAY_WS_NOT_DEFINED       = "JIRIDE: l'indirizzo del servizio utenti e ruoli non e' definito";

  static private String      UTRWSSGATEWAY_ALIAS                = "java:comp/env/JIRIDE_UTRWSSGATEWAY_ALIAS";
  static private String      UTRWSSGATEWAY_ALIAS_WS_NOT_DEFINED = "JIRIDE: l'alias di accesso al servizio utenti e ruoli non e' definito";

  static private String      WSTABELLE                          = "java:comp/env/JIRIDE_WSTABELLE";
  static private String      WSTABELLE_NOT_DEFINED              = "JIRIDE: l'indirizzo del servizio di lettura tabelle non e' definito";

  static private String      AGGIUNGI_ALLEGATI_SENZALOG         = "java:comp/env/JIRIDE_SENZALOG";
  static private String      AGGIUNGI_ALLEGATI_MOTIVAZIONE      = "java:comp/env/JIRIDE_MOTIVAZIONE";
  static private String      AGGIUNGI_ALLEGATI_ESTREMIPROVVAUT  = "java:comp/env/JIRIDE_ESTREMIPROVVAUT";

  static private String      ACCOUNT_EMAIL_WS                   = "java:comp/env/JIRIDE_ACCOUNT_EMAIL_WS";
  static private String      ACCOUNT_EMAIL_WS_NOT_DEFINED       = "JIRIDE: l'indirizzo del servizio di lettura della lista degli account email non e' definito";

  static private String      TICKET                             = "java:comp/env/JIRIDE_TICKET";
  static private String      TICKET_NON_DEFINED                 = "JIRIDE: il ticket per l'accesso al servizio di lettura degli account email non e' definito";

  static public final String PROTOCOLLO_IN_ARRIVO               = "A";
  static public final String PROTOCOLLO_IN_ENTRATA              = "E";
  static public final String PROTOCOLLO_IN_PARTENZA             = "P";
  static public final String PROTOCOLLO_IN_USCITA               = "U";

  static public final String PROTOCOLLO_INTERNO                 = "I";

  /**
   * Ottiene ProtocolloSoap.
   * 
   * @return
   * @throws Exception
   * @throws MalformedURLException
   */
  private ProtocolloSoap getProtocolloSoap() throws Exception {
    String wsProtocolloAddress = InitialContext.doLookup(WSPROTOCOLLO);
    if (wsProtocolloAddress == null || (wsProtocolloAddress != null && "".equals(wsProtocolloAddress.trim()))) {
      throw new Exception(WSPROTOCOLLO_NOT_DEFINED);
    }
    Protocollo protocollo = new Protocollo();
    ProtocolloSoap protocolloSoap = protocollo.getProtocolloSoap();
    Client client = ClientProxy.getClient(protocolloSoap);
    client.getRequestContext().put(Message.ENDPOINT_ADDRESS, wsProtocolloAddress);
    client.getRequestContext().put(Message.RECEIVE_TIMEOUT, 30 * 60 * 1000);
    return protocolloSoap;
  }

  /**
   * Ottiene DocWSFascicoliSoap.
   * 
   * @return
   * @throws Exception
   * @throws MalformedURLException
   */
  private DocWSFascicoliSoap getWSFascicoloSoap() throws Exception {
    String wsFascicoloAddress = InitialContext.doLookup(WSFASCICOLO);
    if (wsFascicoloAddress == null || (wsFascicoloAddress != null && "".equals(wsFascicoloAddress.trim()))) {
      throw new Exception(WSFASCICOLO_NOT_DEFINED);
    }
    DocWSFascicoli wsfascicolo = new DocWSFascicoli();
    DocWSFascicoliSoap wsfascicoloSoap = wsfascicolo.getDocWSFascicoliSoap();
    Client client = ClientProxy.getClient(wsfascicoloSoap);
    client.getRequestContext().put(Message.ENDPOINT_ADDRESS, wsFascicoloAddress);
    client.getRequestContext().put(Message.RECEIVE_TIMEOUT, 30 * 60 * 1000);
    return wsfascicoloSoap;
  }

  /**
   * Ottiene UtrWSSGateway per l'accesso al servizio utenti e ruoli.
   * 
   * @return
   * @throws Exception
   */
  private UtrWSSGateway getUtrWssGateway() throws Exception {
    String utrWssGateway_ws = InitialContext.doLookup(UTRWSSGATEWAY_WS);
    if (utrWssGateway_ws == null || (utrWssGateway_ws != null && "".equals(utrWssGateway_ws.trim()))) {
      throw new Exception(UTRWSSGATEWAY_WS_NOT_DEFINED);
    }

    String utrWssGateway_alias = InitialContext.doLookup(UTRWSSGATEWAY_ALIAS);
    if (utrWssGateway_alias == null || (utrWssGateway_alias != null && "".equals(utrWssGateway_alias.trim()))) {
      throw new Exception(UTRWSSGATEWAY_ALIAS_WS_NOT_DEFINED);
    }

    UtrWSSGatewayServiceLocator locator = new UtrWSSGatewayServiceLocator();
    UtrWSSGateway utrWssGateway = locator.getUtrWSSGateway(new URL(utrWssGateway_ws));
    return utrWssGateway;

  }

  /**
   * Ottiene WsTabelleSoap per l'accesso ai tabellati di JIRIDE.
   * 
   * @return
   * @throws Exception
   */
  private WsTabelleSoap getWSTabelleSoap() throws Exception {
    String wsTabelleAddress = InitialContext.doLookup(WSTABELLE);
    if (wsTabelleAddress == null || (wsTabelleAddress != null && "".equals(wsTabelleAddress.trim()))) {
      throw new Exception(WSTABELLE_NOT_DEFINED);
    }

    WsTabelle wstabelle = new WsTabelle();
    WsTabelleSoap wstabellesoap = wstabelle.getWsTabelleSoap();
    Client client = ClientProxy.getClient(wstabellesoap);
    client.getRequestContext().put(Message.ENDPOINT_ADDRESS, wsTabelleAddress);
    client.getRequestContext().put(Message.RECEIVE_TIMEOUT, 30 * 60 * 1000);
    return wstabellesoap;
  }

  /**
   * Ottiene WsPostaWebSoap
   * 
   * @return
   * @throws Exception
   */
  private WsPostaWebSoap getWSPostaSoap() throws Exception {
    String wsPostaAddress = InitialContext.doLookup(WSPOSTA);
    if (wsPostaAddress == null || (wsPostaAddress != null && "".equals(wsPostaAddress.trim()))) {
      throw new Exception(WSPOSTA_NOT_DEFINED);
    }
    WsPostaWeb wsPostaWeb = new WsPostaWeb();
    WsPostaWebSoap wsPostaWebSoap = wsPostaWeb.getWsPostaWebSoap();
    Client client = ClientProxy.getClient(wsPostaWebSoap);
    client.getRequestContext().put(Message.ENDPOINT_ADDRESS, wsPostaAddress);
    client.getRequestContext().put(Message.RECEIVE_TIMEOUT, 30 * 60 * 1000);
    return wsPostaWebSoap;
  }

  /**
   * Ottiene WSAttiSoap.
   * 
   * @return
   * @throws Exception
   */
  private WSattiSoap getWSAttiSoap() throws Exception {
    String wsAttiAddress = InitialContext.doLookup(WSATTO);
    if (wsAttiAddress == null || (wsAttiAddress != null && "".equals(wsAttiAddress.trim()))) {
      throw new Exception(WSATTO_NOT_DEFINED);
    }
    WSatti wsAtti = new WSatti();
    WSattiSoap wsAttiSoap = wsAtti.getWSattiSoap();
    Client client = ClientProxy.getClient(wsAttiSoap);
    client.getRequestContext().put(Message.ENDPOINT_ADDRESS, wsAttiAddress);
    client.getRequestContext().put(Message.RECEIVE_TIMEOUT, 30 * 60 * 1000);
    return wsAttiSoap;
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

    boolean esito = false;

    try {
      String filtro = null;
      if (utente != null && !"".equals(utente.trim())) {
        utente = conversioneCaratteriXML(utente);
        filtro = "<StrutturaFiltri><Utente>" + utente + "</Utente></StrutturaFiltri>";
      } else {
        filtro = "<StrutturaFiltri><UnitaOperativa>*</UnitaOperativa></StrutturaFiltri>";
      }

      String strutturaResponse = this.getWSTabelleSoap().wmStruttura(filtro);

      Document document = DocumentHelper.parseText(strutturaResponse);
      Element elRoot = document.getRootElement();
      if (elRoot != null) {
        List<?> strutture = elRoot.selectNodes("struttura");
        if (strutture != null && strutture.size() > 0) {
          esito = true;

          ArrayList<WSDMUfficio> uffici = new ArrayList<WSDMUfficio>();

          for (int s = 0; s < strutture.size(); s++) {
            WSDMUfficio wsdmUfficio = new WSDMUfficio();
            Element struttura = (Element) strutture.get(s);
            if (struttura != null) {

              boolean ufficioValido = true;

              if (struttura.element("dataFinVal") != null) {
                try {
                  String _datiFinValS = struttura.element("dataFinVal").getText();
                  Date dataFinVal = new SimpleDateFormat("dd/MM/yyyy").parse(_datiFinValS);
                  Date dataOdierna = new Date();
                  if (dataFinVal.compareTo(dataOdierna) <= 0) {
                    ufficioValido = false;
                  }
                } catch (Exception e) {
                }
              }

              if (ufficioValido) {
                if (struttura.element("codice") != null) {
                  String codice = struttura.element("codice").getText();
                  wsdmUfficio.setCodiceUfficio(codice);
                }
                if (struttura.element("descrizione") != null) {
                  String descrizione = struttura.element("descrizione").getText();
                  wsdmUfficio.setDescrizioneUfficio(descrizione);
                }
                uffici.add(wsdmUfficio);
              }
            }
          }

          if (uffici.size() > 0) {
            WSDMUfficio[] wsdmUffici = new WSDMUfficio[uffici.size()];
            for (int u = 0; u < uffici.size(); u++) {
              wsdmUffici[u] = new WSDMUfficio();
              wsdmUffici[u] = uffici.get(u);
            }
            wsdmListaUfficiRes.setListaUffici(wsdmUffici);
          } else {
            esito = false;
            wsdmListaUfficiRes.setMessaggio("Nessun elemento trovato");
          }

        } else {
          esito = false;
          wsdmListaUfficiRes.setMessaggio("Nessun elemento trovato");
        }

      }

      wsdmListaUfficiRes.setEsito(esito);

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
  public WSDMProtocolloDocumentoRes _protocolloInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {

    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (IrideUtilityControllo.ctrProtocolloDocumentoInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {

        boolean esito = true;
        String codiceFascicolo = null;
        Long annoFascicolo = null;
        String numeroFascicolo = null;
        String codiceAmministrazione = InitialContext.doLookup(CODICEAMMINISTRAZIONE);
        String codiceAOO = InitialContext.doLookup(CODICEAOO);

        // Eventuale creazione di un nuovo fascicolo
        if (WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
          String oggettoFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getOggettoFascicolo();
          String classificaFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getClassificaFascicolo();
          String descrizioneFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getDescrizioneFascicolo();
          String tipoFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getTipo();
          String strutturaFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getStruttura();
          WSDMFascicoloIn wsdmFascicoloIn = new WSDMFascicoloIn();
          wsdmFascicoloIn.setOggettoFascicolo(oggettoFascicolo);
          wsdmFascicoloIn.setClassificaFascicolo(classificaFascicolo);
          wsdmFascicoloIn.setDescrizioneFascicolo(descrizioneFascicolo);
          wsdmFascicoloIn.setTipo(tipoFascicolo);
          wsdmFascicoloIn.setStruttura(strutturaFascicolo);
          WSDMFascicoloRes wsdmFascicoloRes = this._fascicoloInserisci(username, password, loginAttr, wsdmFascicoloIn);
          if (!wsdmFascicoloRes.isEsito()) {
            esito = false;
            wsdmprotocolloDocumentoRes.setEsito(false);
            wsdmprotocolloDocumentoRes.setMessaggio("fascicolo: " + wsdmFascicoloRes.getMessaggio());
          } else {
            codiceFascicolo = wsdmFascicoloRes.getFascicolo().getCodiceFascicolo();
            annoFascicolo = wsdmFascicoloRes.getFascicolo().getAnnoFascicolo();
            numeroFascicolo = wsdmFascicoloRes.getFascicolo().getNumeroFascicolo();
          }
        }

        // Eventuale associazione con fascicolo gia' esistente.
        // In questo caso e' necessario conoscere solamente il codice fascicolo
        if (wsdmprotocolloDocumentoIn.getInserimentoInFascicolo().equals(WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE)) {
          codiceFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getCodiceFascicolo();
          annoFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getAnnoFascicolo();
          numeroFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getNumeroFascicolo();
        }

        // Inserimento dell'elemento documentale nel protocollo
        if (esito) {
          String protocolloInString = this.popolaProtocolloInString(username, password, loginAttr, wsdmprotocolloDocumentoIn);
          String protocolloOutString = this.getProtocolloSoap().inserisciProtocolloEAnagraficheString(protocolloInString,
              codiceAmministrazione, codiceAOO);
          ProtocolloOut protocolloOut = this.protocolloOutFromString(protocolloOutString);
          wsdmprotocolloDocumentoRes = this.popolaWSDMPDResDaProtocolloOut(protocolloOut, true);
          if (!wsdmprotocolloDocumentoRes.isEsito()) {
            esito = false;
          }
        }

        // Eventuale associazione del nuovo elemento documentale al fascicolo
        // (nuovo o esistente)
        if (esito) {
          if (WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())
              || WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
            String numeroDocumento = wsdmprotocolloDocumentoRes.getProtocolloDocumento().getNumeroDocumento();
            WSDMFascicoloRes wsdmFascicoloRes = this._fascicoloAggiungiDocumento(username, password, loginAttr, codiceFascicolo,
                numeroDocumento);
            if (wsdmFascicoloRes.isEsito()) {
              WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();
              wsdmFascicolo.setCodiceFascicolo(codiceFascicolo);
              wsdmFascicolo.setAnnoFascicolo(annoFascicolo);
              wsdmFascicolo.setNumeroFascicolo(numeroFascicolo);
              wsdmprotocolloDocumentoRes.getProtocolloDocumento().setFascicolo(wsdmFascicolo);
            } else {
              wsdmprotocolloDocumentoRes.setEsito(false);
              wsdmprotocolloDocumentoRes.setMessaggio("fascicolo: " + wsdmFascicoloRes.getMessaggio());
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

  @Override
  public WSDMProtocolloDocumentoRes _protocolloLeggi(String username, String password, WSDMLoginAttr loginAttr, Long annoProtocollo,
      String numeroProtocollo) {

    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (JirideUtilityControllo.ctrProtocolloLeggi(loginAttr, annoProtocollo, numeroProtocollo, messaggioCtr)) {
        String ruolo = loginAttr.getRuolo();
        String codiceAmministrazione = InitialContext.doLookup(CODICEAMMINISTRAZIONE);
        String codiceAOO = InitialContext.doLookup(CODICEAOO);
        String documentoOutString = this.getProtocolloSoap().leggiProtocolloString(annoProtocollo.shortValue(),
            new Long(numeroProtocollo).intValue(), username, ruolo, codiceAmministrazione, codiceAOO, "");
        wsdmprotocolloDocumentoRes = this.popolaWSDMPDResDaDocumentoOut(documentoOutString);
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
      if (IrideUtilityControllo.ctrProtocolloDocumentoInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {

        boolean esito = true;
        String codiceFascicolo = null;
        Long annoFascicolo = null;
        String numeroFascicolo = null;
        String codiceAmministrazione = InitialContext.doLookup(CODICEAMMINISTRAZIONE);
        String codiceAOO = InitialContext.doLookup(CODICEAOO);

        // Eventuale creazione di un nuovo fascicolo
        if (WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
          String oggettoFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getOggettoFascicolo();
          String classificaFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getClassificaFascicolo();
          String descrizioneFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getDescrizioneFascicolo();
          String tipoFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getTipo();
          String strutturaFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getStruttura();
          WSDMFascicoloIn wsdmFascicoloIn = new WSDMFascicoloIn();
          wsdmFascicoloIn.setOggettoFascicolo(oggettoFascicolo);
          wsdmFascicoloIn.setClassificaFascicolo(classificaFascicolo);
          wsdmFascicoloIn.setDescrizioneFascicolo(descrizioneFascicolo);
          wsdmFascicoloIn.setTipo(tipoFascicolo);
          wsdmFascicoloIn.setStruttura(strutturaFascicolo);
          WSDMFascicoloRes wsdmFascicoloRes = this._fascicoloInserisci(username, password, loginAttr, wsdmFascicoloIn);
          if (!wsdmFascicoloRes.isEsito()) {
            esito = false;
            wsdmprotocolloDocumentoRes.setEsito(false);
            wsdmprotocolloDocumentoRes.setMessaggio("fascicolo: " + wsdmFascicoloRes.getMessaggio());
          } else {
            codiceFascicolo = wsdmFascicoloRes.getFascicolo().getCodiceFascicolo();
            annoFascicolo = wsdmFascicoloRes.getFascicolo().getAnnoFascicolo();
            numeroFascicolo = wsdmFascicoloRes.getFascicolo().getNumeroFascicolo();
          }
        }

        // Eventuale associazione con fascicolo gia' esistente.
        // In questo caso e' necessario conoscere solamente il codice fascicolo
        if (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
          codiceFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getCodiceFascicolo();
          annoFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getAnnoFascicolo();
          numeroFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getNumeroFascicolo();
        }

        // Inserimento dell'elemento documentale nel protocollo
        if (esito) {
          String protocolloInString = this.popolaProtocolloInString(username, password, loginAttr, wsdmprotocolloDocumentoIn);
          String protocolloOutString = this.getProtocolloSoap().inserisciDocumentoEAnagraficheString(protocolloInString,
              codiceAmministrazione, codiceAOO);
          ProtocolloOut protocolloOut = this.protocolloOutFromString(protocolloOutString);
          wsdmprotocolloDocumentoRes = this.popolaWSDMPDResDaProtocolloOut(protocolloOut, false);
          if (!wsdmprotocolloDocumentoRes.isEsito()) {
            esito = false;
          }
        }

        // Eventuale associazione del nuovo elemento documentale al fascicolo
        // (nuovo o esistente)
        if (esito) {
          if (WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())
              || WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
            String numeroDocumento = wsdmprotocolloDocumentoRes.getProtocolloDocumento().getNumeroDocumento();
            WSDMFascicoloRes wsdmFascicoloRes = this._fascicoloAggiungiDocumento(username, password, loginAttr, codiceFascicolo,
                numeroDocumento);
            if (wsdmFascicoloRes.isEsito()) {
              WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();
              wsdmFascicolo.setCodiceFascicolo(codiceFascicolo);
              wsdmFascicolo.setAnnoFascicolo(annoFascicolo);
              wsdmFascicolo.setNumeroFascicolo(numeroFascicolo);
              wsdmprotocolloDocumentoRes.getProtocolloDocumento().setFascicolo(wsdmFascicolo);
            } else {
              wsdmprotocolloDocumentoRes.setEsito(false);
              wsdmprotocolloDocumentoRes.setMessaggio("fascicolo: " + wsdmFascicoloRes.getMessaggio());
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

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (JirideUtilityControllo.ctrDocumentoLeggi(loginAttr, numeroDocumento, messaggioCtr)) {
        String ruolo = loginAttr.getRuolo();
        String codiceAmministrazione = InitialContext.doLookup(CODICEAMMINISTRAZIONE);
        String codiceAOO = InitialContext.doLookup(CODICEAOO);
        String documentoOutString = this.getProtocolloSoap().leggiDocumentoString(Integer.parseInt(numeroDocumento), username, ruolo,
            codiceAmministrazione, codiceAOO);
        // DocumentoOut documentoOut =
        // this.documentoOutFromString(documentoOutString);
        wsdmprotocolloDocumentoRes = this.popolaWSDMPDResDaDocumentoOut(documentoOutString);
      } else {
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

  @Override
  public WSDMProtocolloDocumentoRes _documentoMetadatiLeggi(String username, String password, WSDMLoginAttr loginAttr,
      String numeroDocumento) {
    return _documentoLeggi(username, password, loginAttr, numeroDocumento);
  }

  @Override
  public WSDMFascicoloRes _fascicoloInserisci(String username, String password, WSDMLoginAttr loginAttr, WSDMFascicoloIn wsdmfascicoloIn) {

    WSDMFascicoloRes wsdmfascicoloRes = new WSDMFascicoloRes();

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (JirideUtilityControllo.ctrFascicoloInserisci(loginAttr, wsdmfascicoloIn, messaggioCtr)) {
        String ruolo = loginAttr.getRuolo();
        String codiceAmministrazione = InitialContext.doLookup(CODICEAMMINISTRAZIONE);
        String codiceAOO = InitialContext.doLookup(CODICEAOO);

        // <?xml version="1.0" encoding="UTF-8"?>
        // <FascicoloIn xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        // xsi:noNamespaceSchemaLocation="FascicoloIn.xsd">
        // <IDFascicolo>IDFascicolo</IDFascicolo>
        // <Anno>Anno</Anno>
        // <Numero>Numero</Numero>
        // <Data>Data</Data>
        // <Oggetto>Oggetto</Oggetto>
        // <OggettoBilingue>OggettoBilingue</OggettoBilingue>
        // <Classifica>Classifica</Classifica>
        // <AltriDati>AltriDati</AltriDati>
        // <DataChiusura>DataChiusura</DataChiusura>
        // <Utente>Utente</Utente>
        // <Ruolo>Ruolo</Ruolo>
        // </FascicoloIn>

        String fascicoloInString = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
        fascicoloInString += "<FascicoloIn>";

        // Anno e data fascicolo
        Date dataFascicolo = new Date();
        String dataYYYY = new SimpleDateFormat("yyyy").format(dataFascicolo);
        String dataDDMMYYYY = new SimpleDateFormat("yyyy-MM-dd").format(dataFascicolo);

        fascicoloInString += "<Anno>" + dataYYYY + "</Anno>";
        fascicoloInString += "<Data>" + dataDDMMYYYY + "</Data>";

        // Oggetto
        if (wsdmfascicoloIn.getOggettoFascicolo() != null) {
          fascicoloInString += "<Oggetto>" + wsdmfascicoloIn.getOggettoFascicolo() + "</Oggetto>";
        }

        // Classifica
        if (wsdmfascicoloIn.getClassificaFascicolo() != null) {
          fascicoloInString += "<Classifica>" + wsdmfascicoloIn.getClassificaFascicolo() + "</Classifica>";
        }

        // Altri dati
        if (wsdmfascicoloIn.getDescrizioneFascicolo() != null) {
          fascicoloInString += "<AltriDati>" + wsdmfascicoloIn.getDescrizioneFascicolo() + "</AltriDati>";
        }

        // Tipo fascicolo
        if (wsdmfascicoloIn.getTipo() != null) {
          fascicoloInString += "<TipoFascicolo>" + wsdmfascicoloIn.getTipo() + "</TipoFascicolo>";
        }

        // Struttura, ufficio responsabile
        if (wsdmfascicoloIn.getStruttura() != null) {
          fascicoloInString += "<UfficioResp>" + wsdmfascicoloIn.getStruttura() + "</UfficioResp>";
        }

        // Utente
        if (username != null) {
          fascicoloInString += "<Utente>" + username + "</Utente>";
        }

        // Ruolo
        if (ruolo != null) {
          fascicoloInString += "<Ruolo>" + ruolo + "</Ruolo>";
        }

        fascicoloInString += "</FascicoloIn>";

        String fascicoloOutString = this.getWSFascicoloSoap().creaFascicoloString(fascicoloInString, codiceAmministrazione, codiceAOO);

        wsdmfascicoloRes = this.popolaWSDMFResDaFascicoloOut(fascicoloOutString);
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

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (JirideUtilityControllo.ctrFascicoloAggiungiDocumento(loginAttr, codiceFascicolo, numeroDocumento, messaggioCtr)) {
        String ruolo = loginAttr.getRuolo();
        String codiceAmministrazione = InitialContext.doLookup(CODICEAMMINISTRAZIONE);
        String codiceAOO = InitialContext.doLookup(CODICEAOO);
        String aggiornaClassifica = "S";
        String principale = "S";

        EsitoOperazione esitoOperazione = this.getWSFascicoloSoap().fascicolaDocumento(Integer.parseInt(codiceFascicolo),
            Integer.parseInt(numeroDocumento), aggiornaClassifica, username, ruolo, codiceAmministrazione, codiceAOO, principale);

        // Esito, secondo le specifiche JIRIDE, e' necessario controllare se
        // l'attributo "Errore" e' popolato.
        // Se popolato la richiesta ad JIRIDE ha generato un errore la cui
        // descrizione dovra' essere concatenata all'attributo "Messaggio".
        boolean esito = true;
        String messaggio = esitoOperazione.getMessaggio();
        String errore = esitoOperazione.getErrore();
        if (errore != null && !errore.equals("")) {
          esito = false;
          messaggio += " - " + errore;
        }
        wsdmfascicoloRes.setEsito(esito);
        wsdmfascicoloRes.setMessaggio(messaggio);
      } else {
        wsdmfascicoloRes.setEsito(false);
        wsdmfascicoloRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (WebServiceException w) {
      wsdmfascicoloRes.setEsito(false);
      wsdmfascicoloRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_fascicoloAggiungiDocumento)", w);
    } catch (NamingException e) {
      wsdmfascicoloRes.setEsito(false);
      wsdmfascicoloRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_fascicoloAggiungiDocumento)", e);
    } catch (Throwable t) {
      wsdmfascicoloRes.setEsito(false);
      wsdmfascicoloRes.setMessaggio(t.getMessage());
      logger.error("Errore (_fascicoloAggiungiDocumento)", t);
    }

    return wsdmfascicoloRes;

  }

  @Override
  public WSDMFascicoloRes _fascicoloLeggi(String username, String password, WSDMLoginAttr loginAttr, String codiceFascicolo,
      Long annoFascicolo, String numeroFascicolo, String classificaFascicolo) {

    WSDMFascicoloRes wsdmfascicoloRes = new WSDMFascicoloRes();

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (JirideUtilityControllo.ctrFascicoloLeggi(loginAttr, codiceFascicolo, annoFascicolo, numeroFascicolo, messaggioCtr)) {
        String ruolo = loginAttr.getRuolo();
        String codiceAmministrazione = InitialContext.doLookup(CODICEAMMINISTRAZIONE);
        String codiceAOO = InitialContext.doLookup(CODICEAOO);

        String anno = null;
        if (annoFascicolo != null) anno = String.valueOf(annoFascicolo.longValue());

        // Inoltro richiesta la servizio JIRIDE
        String fascicoloOutString = this.getWSFascicoloSoap().leggiFascicoloString(codiceFascicolo, anno, numeroFascicolo, username, ruolo,
            codiceAmministrazione, codiceAOO, classificaFascicolo);
        wsdmfascicoloRes = this.popolaWSDMFResDaFascicoloOut(fascicoloOutString);
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
      Long annoFascicolo, String numeroFascicolo, String classificaFascicolo) {
    return _fascicoloLeggi(username, password, loginAttr, codiceFascicolo, annoFascicolo, numeroFascicolo, classificaFascicolo);
  }

  /**
   * Popola l'oggetto ELDASOFT WSDMFascicoloOut dall'oggetto JIRIDE
   * FascicoloOut.
   * 
   * @param fascicoloOut
   * @return
   * @throws DocumentException
   */
  private WSDMFascicoloRes popolaWSDMFResDaFascicoloOut(String fascicoloOutString) throws DocumentException {

    WSDMFascicoloRes wsdmfascicoloRes = new WSDMFascicoloRes();

    // Esito, secondo le specifiche JIRIDE, e' necessario controllare se
    // l'attributo "Errore" e' popolato.
    // Se popolato la richiesta ad JIRIDE ha generato un errore la cui
    // descrizione dovra' essere concatenata all'attributo "Messaggio".
    boolean esito = true;

    Document document = DocumentHelper.parseText(fascicoloOutString);
    Element elRoot = document.getRootElement();
    if (elRoot != null) {

      // Messaggio ed errore
      String messaggio = elRoot.element("Messaggio").getText();
      String errore = elRoot.element("Errore").getText();
      if (errore != null && !errore.equals("")) {
        esito = false;
        messaggio += " - " + errore;
      }
      wsdmfascicoloRes.setEsito(esito);
      wsdmfascicoloRes.setMessaggio(messaggio);

      if (esito) {
        WSDMFascicolo wsdmfascicolo = new WSDMFascicolo();

        // Anno
        if (elRoot.element("Anno") != null) {
          try {
            String anno = elRoot.element("Anno").getText();
            if (anno != null) {
              wsdmfascicolo.setAnnoFascicolo(new Long(anno));
            }
          } catch (Exception e) {

          }
        }

        // Classifica
        if (elRoot.element("Classifica") != null) {
          String classifica = elRoot.element("Classifica").getText();
          wsdmfascicolo.setClassificaFascicolo(classifica);
        }

        // Descrizione classifica
        if (elRoot.element("Classifica_Descrizione") != null) {
          String classificaDescrizione = elRoot.element("Classifica_Descrizione").getText();
          wsdmfascicolo.setClassificaFascicoloDescrizione(classificaDescrizione);
        }

        // Data (formato string dd/MM/yyyy)
        if (elRoot.element("Data") != null) {
          try {
            String dataFascicoloString = elRoot.element("Data").getText();
            if (dataFascicoloString != null) {
              Date dataFascicolo = new SimpleDateFormat("dd/MM/yyyy").parse(dataFascicoloString);
              wsdmfascicolo.setDataFascicolo(dataFascicolo);
            }
          } catch (Exception e) {

          }
        }

        // Altri dati, descrizione del fascicolo
        if (elRoot.element("AltriDati") != null) {
          String altriDati = elRoot.element("AltriDati").getText();
          wsdmfascicolo.setDescrizioneFascicolo(altriDati);
        }

        // Tipo
        if (elRoot.element("TipoFascicolo") != null) {
          String tipoFascicolo = elRoot.element("TipoFascicolo").getText();
          wsdmfascicolo.setTipo(tipoFascicolo);
        }

        // Ufficio responsabile
        if (elRoot.element("UfficioResp") != null) {
          String ufficioResp = elRoot.element("UfficioResp").getText();
          wsdmfascicolo.setStruttura(ufficioResp);
        }

        // Lista dei documenti
        Element listaDocumentiFascicolo = elRoot.element("DocumentiFascicoli");
        if (listaDocumentiFascicolo != null) {
          List<?> documentiFascicolo = listaDocumentiFascicolo.selectNodes("Documento");
          if (documentiFascicolo != null && documentiFascicolo.size() > 0) {
            WSDMFascicoloDocumento[] documenti = new WSDMFascicoloDocumento[documentiFascicolo.size()];
            for (int df = 0; df < documentiFascicolo.size(); df++) {
              documenti[df] = new WSDMFascicoloDocumento();
              Element documentoFascicolo = (Element) documentiFascicolo.get(df);
              if (documentoFascicolo != null) {

                if (documentoFascicolo.element("Oggetto") != null) {
                  String oggetto = documentoFascicolo.element("Oggetto").getText();
                  documenti[df].setOggetto(oggetto);
                }

                // Anno protocollo
                if (documentoFascicolo.element("AnnoProtocollo") != null) {
                  try {
                    String annoProtocollo = documentoFascicolo.element("AnnoProtocollo").getText();
                    if (annoProtocollo != null) {
                      documenti[df].setAnnoProtocollo(new Long(annoProtocollo));
                    }
                  } catch (Exception e) {

                  }
                }

                // Numero protocollo
                if (documentoFascicolo.element("NumeroProtocollo") != null) {
                  String numeroProtocollo = documentoFascicolo.element("NumeroProtocollo").getText();
                  documenti[df].setNumeroProtocollo(numeroProtocollo);
                }

                // Numero documento
                if (documentoFascicolo.element("IdDocumento") != null) {
                  String numeroDocumento = documentoFascicolo.element("IdDocumento").getText();
                  documenti[df].setNumeroDocumento(numeroDocumento);
                }

                // Origine (verso della protocollazione)
                if (documentoFascicolo.element("Origine") != null) {
                  String origine = documentoFascicolo.element("Origine").getText();
                  if (PROTOCOLLO_IN_ARRIVO.equals(origine) || PROTOCOLLO_IN_ENTRATA.equals(origine)) {
                    documenti[df].setInout(WSDMProtocolloInOut.IN);
                  } else if (PROTOCOLLO_IN_PARTENZA.equals(origine) || PROTOCOLLO_IN_USCITA.equals(origine)) {
                    documenti[df].setInout(WSDMProtocolloInOut.OUT);
                  } else if (PROTOCOLLO_INTERNO.equals(origine)) {
                    documenti[df].setInout(WSDMProtocolloInOut.INT);
                  }
                }
              }
            }
            wsdmfascicolo.setDocumenti(documenti);
          }
        }

        // Codice del fascicolo
        String id = elRoot.element("Id").getText();
        wsdmfascicolo.setCodiceFascicolo(id);

        // Numero del fascicolo
        String numero = elRoot.element("Numero").getText();
        wsdmfascicolo.setNumeroFascicolo(numero);

        // Oggetto del fascicolo
        String oggetto = elRoot.element("Oggetto").getText();
        wsdmfascicolo.setOggettoFascicolo(oggetto);

        // Dati personalizzati del fascicolo ("metadatiOut")
        Element metadatiOut = elRoot.element("MetadatiOut");
        if (metadatiOut != null) {

          // Lettura della lista delle tabelle
          List<?> listaTable = metadatiOut.selectNodes("table");
          if (listaTable != null && listaTable.size() > 0) {
            WSDMTabella[] wsdmTabella = new WSDMTabella[listaTable.size()];
            for (int ta = 0; ta < listaTable.size(); ta++) {
              Element table = (Element) listaTable.get(ta);
              wsdmTabella[ta] = new WSDMTabella();
              wsdmTabella[ta].setNome(table.attributeValue("name"));

              // Lettura delle righe di ogni tabella
              List<?> listaRow = table.selectNodes("row");
              if (listaRow != null && listaRow.size() > 0) {
                WSDMRiga[] wsdmRiga = new WSDMRiga[listaRow.size()];
                for (int ri = 0; ri < listaRow.size(); ri++) {
                  Element row = (Element) listaRow.get(ri);
                  wsdmRiga[ri] = new WSDMRiga();
                  wsdmRiga[ri].setNumero(new Long(ri));

                  // Lettura dei campi di ogni riga
                  List<?> listaField = row.selectNodes("field");
                  if (listaField != null && listaField.size() > 0) {
                    WSDMCampo[] wsdmCampo = new WSDMCampo[listaField.size()];
                    for (int ca = 0; ca < listaField.size(); ca++) {
                      Element field = (Element) listaField.get(ca);
                      wsdmCampo[ca] = new WSDMCampo();
                      wsdmCampo[ca].setNome(field.attributeValue("name"));
                      wsdmCampo[ca].setTipo(field.attributeValue("type"));
                      wsdmCampo[ca].setValore(field.getText());
                    }
                    wsdmRiga[ri].setCampo(wsdmCampo);
                  }
                }
                wsdmTabella[ta].setRiga(wsdmRiga);
              }
            }
            wsdmfascicolo.setDatiPersonalizzati(wsdmTabella);
          }

        }

        wsdmfascicoloRes.setFascicolo(wsdmfascicolo);

      }

    }

    return wsdmfascicoloRes;
  }

  /**
   * Crea la stringa XML per l'inserimento di un elemento documentale o di un
   * protocollo.
   * 
   * @param username
   * @param password
   * @param loginAttr
   * @param wsdmprotocolloDocumentoIn
   * @return
   * @throws IOException
   */
  private String popolaProtocolloInString(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) throws IOException {
    // Origine
    String origine = null;
    if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
      origine = PROTOCOLLO_IN_ARRIVO;
    } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      origine = PROTOCOLLO_IN_PARTENZA;
    } else if (WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      origine = PROTOCOLLO_INTERNO;
    }

    // Data
    Date now = new Date();
    String dataDDMMYYYY = new SimpleDateFormat("dd/MM/yyyy").format(now);

    // Dati generali del protocollo
    ProtoInDocument protoInDocument = ProtoInDocument.Factory.newInstance();
    ProtocolloIn protocolloIn = protoInDocument.addNewProtoIn();
    protocolloIn.setData(dataDDMMYYYY);

    if (WSDMInserimentoInFascicolo.NO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
      protocolloIn.setClassifica(wsdmprotocolloDocumentoIn.getClassifica());
    }
    protocolloIn.setTipoDocumento(wsdmprotocolloDocumentoIn.getTipoDocumento());
    protocolloIn.setOggetto(wsdmprotocolloDocumentoIn.getOggetto());
    protocolloIn.setOrigine(origine);
    protocolloIn.setMittenteInterno(wsdmprotocolloDocumentoIn.getMittenteInterno());

    // AggiornaAnagrafiche. Modifica richiesta da Paolo Urbanetto per gestione
    // Comune di Fiumicino.
    // Il valore di default e' "N". Il flagAggiornaAnagrafiche puo' essere
    // modificato con la nuova configurazione JIRIDE_AGGIORNAANAGRAFICHE
    // memorizzata nel file context.xml, se presente.
    String flagAggiornaAnagrafiche = "N";

    // Tentativo di lettura del valore di JIRIDE_AGGIORNAANAGRAFICHE
    try {
      flagAggiornaAnagrafiche = InitialContext.doLookup(AGGIORNAANAGRAFICHE);
    } catch (NamingException e) {

    }

    protocolloIn.setAggiornaAnagrafiche(flagAggiornaAnagrafiche);
    protocolloIn.setInCaricoA(wsdmprotocolloDocumentoIn.getMittenteInterno());
    protocolloIn.setAnnoPratica("");
    protocolloIn.setNumeroPratica("");
    protocolloIn.setUtente(username);
    protocolloIn.setRuolo(loginAttr.getRuolo());

    // Gestione dei mittenti/destinatari.
    // Se i documenti sono in arrivo le figure professionali coinvolte sono
    // "mittenti", se i documento sono in partenza le figure professionali
    // coinvolte sono "destinatari".

    if (PROTOCOLLO_IN_ARRIVO.equals(origine)) {
      WSDMProtocolloAnagrafica[] mittenti = wsdmprotocolloDocumentoIn.getMittenti();
      if (mittenti != null && mittenti.length > 0) {
        ArrayOfMittenteDestinatarioIn arrayOfMittenteDestinatarioIn = protocolloIn.addNewMittentiDestinatari();
        for (int mi = 0; mi < mittenti.length; mi++) {
          MittenteDestinatarioIn mittenteDestinarioIn = arrayOfMittenteDestinatarioIn.addNewMittenteDestinatario();
          mittenteDestinarioIn.setCodiceFiscale(mittenti[mi].getCodiceFiscale());
          mittenteDestinarioIn.setCognomeNome(mittenti[mi].getCognomeointestazione());
          mittenteDestinarioIn.setMezzo(mittenti[mi].getMezzo());

          if (mittenti[mi].getEmail() != null) {
            mittenteDestinarioIn.addNewRecapiti();
            RecapitoIn recapito = mittenteDestinarioIn.getRecapiti().addNewRecapito();
            recapito.setTipoRecapito("EMAIL");
            recapito.setValoreRecapito(mittenti[mi].getEmail());
          }

        }
      }
    } else if (PROTOCOLLO_IN_PARTENZA.equals(origine)) {
      WSDMProtocolloAnagrafica[] destinatari = wsdmprotocolloDocumentoIn.getDestinatari();
      if (destinatari != null && destinatari.length > 0) {
        ArrayOfMittenteDestinatarioIn arrayOfMittenteDestinatarioIn = protocolloIn.addNewMittentiDestinatari();
        for (int de = 0; de < destinatari.length; de++) {
          MittenteDestinatarioIn mittenteDestinarioIn = arrayOfMittenteDestinatarioIn.addNewMittenteDestinatario();
          mittenteDestinarioIn.setCodiceFiscale(destinatari[de].getCodiceFiscale());
          mittenteDestinarioIn.setCognomeNome(destinatari[de].getCognomeointestazione());
          mittenteDestinarioIn.setMezzo(destinatari[de].getMezzo());

          if (destinatari[de].getEmail() != null) {
            mittenteDestinarioIn.addNewRecapiti();
            RecapitoIn recapito = mittenteDestinarioIn.getRecapiti().addNewRecapito();
            recapito.setTipoRecapito("EMAIL");
            recapito.setValoreRecapito(destinatari[de].getEmail());
          }

        }
      }
    }

    // Allegati
    WSDMProtocolloAllegato[] allegati = wsdmprotocolloDocumentoIn.getAllegati();
    if (allegati != null && allegati.length > 0) {
      ArrayOfAllegatoIn arrayOfAllegatoIn = protocolloIn.addNewAllegati();
      for (int ai = 0; ai < allegati.length; ai++) {
        AllegatoIn allegatoIn = arrayOfAllegatoIn.addNewAllegato();
        allegatoIn.setNomeAllegato(allegati[ai].getNome());
        allegatoIn.setCommento(allegati[ai].getTitolo());
        allegatoIn.setTipoFile(allegati[ai].getTipo());
        allegatoIn.setImage(allegati[ai].getContenuto());
      }
    }

    // Livello di riservatezza
    if (wsdmprotocolloDocumentoIn.getLivelloRiservatezza() != null) {
      protocolloIn.setLivelloRiservatezza(wsdmprotocolloDocumentoIn.getLivelloRiservatezza());
    }

    // Date fine riservatezza
    if (wsdmprotocolloDocumentoIn.getDataFineRiservatezza() != null) {
      Date dataFineRiservatezza = wsdmprotocolloDocumentoIn.getDataFineRiservatezza();
      String dataFineRiservatezzaFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(dataFineRiservatezza);
      protocolloIn.setDataFineRiservatezza(dataFineRiservatezzaFormat);
    }

    XmlOptions opts = new XmlOptions();
    opts.setUseDefaultNamespace();
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    protoInDocument.save(baos, opts);
    String testoXML = baos.toString();
    baos.close();

    return testoXML;
  }

  /**
   * Popola l'oggetto ELDASOFT WSDMProtocolloDocumentoOut sulla base
   * dell'oggetto JIRIDE ProtocolloOut.
   * 
   * @param protocolloOut
   * @return
   */
  private WSDMProtocolloDocumentoRes popolaWSDMPDResDaProtocolloOut(ProtocolloOut protocolloOut, boolean setDataProtocolloOdierna) {

    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    // Esito, secondo le specifiche JIRIDE, e' necessario controllare se
    // l'attributo "Errore" e' popolato.
    // Se popolato la richiesta ad JIRIDE ha generato un errore la cui
    // descrizione dovra' essere concatenata all'attributo "Messaggio".
    boolean esito = true;
    String messaggio = protocolloOut.getMessaggio();
    String errore = protocolloOut.getErrore();
    if (errore != null && !errore.equals("")) {
      esito = false;
      messaggio += " - " + errore;
    }

    wsdmprotocolloDocumentoRes.setEsito(esito);
    wsdmprotocolloDocumentoRes.setMessaggio(messaggio);

    if (esito) {
      WSDMProtocolloDocumento wsdmprotocolloDocumento = new WSDMProtocolloDocumento();
      int idDocumento = protocolloOut.getIdDocumento();
      short annoProtocollo = protocolloOut.getAnnoProtocollo();
      int numeroProtocollo = protocolloOut.getNumeroProtocollo();
      XMLGregorianCalendar dataProtocollo = protocolloOut.getDataProtocollo();

      wsdmprotocolloDocumento.setNumeroDocumento(String.valueOf(idDocumento));
      wsdmprotocolloDocumento.setAnnoProtocollo(new Long(annoProtocollo));
      wsdmprotocolloDocumento.setNumeroProtocollo(String.valueOf(numeroProtocollo));

      if (setDataProtocolloOdierna == true) {
        // 08/02/2018 - La data e l'ora del protocollo viene impostata con la
        // data e l'ora corrente di sistema
        Calendar dataProtocolloToday = Calendar.getInstance();
        wsdmprotocolloDocumento.setDataProtocollo(dataProtocolloToday.getTime());
      } else {
        if (dataProtocollo != null) {
          wsdmprotocolloDocumento.setDataProtocollo(dataProtocollo.toGregorianCalendar().getTime());
        }
      }

      wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmprotocolloDocumento);
    }
    return wsdmprotocolloDocumentoRes;
  }

  /**
   * Popola l'oggetto ELDASOFT WSDMProtocolloDocumentoOut sulla base
   * dell'oggetto JIRIDE DocumentoOut restituito da servizi JIRIDE.
   * 
   * @param documentoOut
   * @return
   * @throws DocumentException
   */
  private WSDMProtocolloDocumentoRes popolaWSDMPDResDaDocumentoOut(String documentoOutString) throws DocumentException {

    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    // Esito, secondo le specifiche JIRIDE, e' necessario controllare se
    // l'attributo "Errore" e' popolato.
    // Se popolato la richiesta ad JIRIDE ha generato un errore la cui
    // descrizione dovra' essere concatenata all'attributo "Messaggio".
    boolean esito = true;

    Document document = DocumentHelper.parseText(documentoOutString);
    Element elRoot = document.getRootElement();
    if (elRoot != null) {
      String messaggio = elRoot.element("Messaggio").getText();
      String errore = elRoot.element("Errore").getText();
      if (errore != null && !errore.equals("")) {
        esito = false;
        messaggio += " - " + errore;
      }
      wsdmprotocolloDocumentoRes.setEsito(esito);
      wsdmprotocolloDocumentoRes.setMessaggio(messaggio);
    }

    // Se la richiesta con esito positivo.
    if (esito) {
      WSDMProtocolloDocumento wsdmprotocolloDocumento = new WSDMProtocolloDocumento();

      // Numero del documento
      if (elRoot.element("IdDocumento") != null) {
        String idDocumento = elRoot.element("IdDocumento").getText();
        wsdmprotocolloDocumento.setNumeroDocumento(idDocumento);
      }

      // Anno protocollo
      if (elRoot.element("AnnoProtocollo") != null) {
        try {
          String annoProtocollo = elRoot.element("AnnoProtocollo").getText();
          if (annoProtocollo != null) {
            wsdmprotocolloDocumento.setAnnoProtocollo(new Long(annoProtocollo));
          }
        } catch (Exception e) {

        }
      }

      // Numero del protocollo
      if (elRoot.element("NumeroProtocollo") != null) {
        String numeroProtocollo = elRoot.element("NumeroProtocollo").getText();
        wsdmprotocolloDocumento.setNumeroProtocollo(numeroProtocollo);
      }

      // Gestione documenti in Arrivo (A) o in Partenza (P) oppure Interno (I)
      String origine = null;
      if (elRoot.element("Origine") != null) {
        origine = elRoot.element("Origine").getText();
        if (PROTOCOLLO_IN_ARRIVO.equals(origine)) {
          wsdmprotocolloDocumento.setInout(WSDMProtocolloInOut.IN);
        } else if (PROTOCOLLO_IN_PARTENZA.equals(origine)) {
          wsdmprotocolloDocumento.setInout(WSDMProtocolloInOut.OUT);
        } else if (PROTOCOLLO_INTERNO.equals(origine)) {
          wsdmprotocolloDocumento.setInout(WSDMProtocolloInOut.INT);
        }
      }

      String documentoRiservato = null;
      if (elRoot.element("DocumentoRiservato") != null) {
        documentoRiservato = elRoot.element("DocumentoRiservato").getText();
      }

      if (documentoRiservato == null || (documentoRiservato != null && "false".equals(documentoRiservato.trim()))) {
        // Allegati
        Element listaAllegati = elRoot.element("Allegati");
        if (listaAllegati != null) {
          List<?> allegati = listaAllegati.selectNodes("Allegato");
          if (allegati != null && allegati.size() > 0) {
            WSDMProtocolloAllegato[] wsdmallegati = new WSDMProtocolloAllegato[allegati.size()];
            for (int ao = 0; ao < allegati.size(); ao++) {
              Element allegato = (Element) allegati.get(ao);
              if (allegato != null) {
                wsdmallegati[ao] = new WSDMProtocolloAllegato();

                if (allegato.element("NomeAllegato") != null) {
                  String nome = allegato.element("NomeAllegato").getText();
                  wsdmallegati[ao].setNome(nome);
                }

                if (allegato.element("Commento") != null) {
                  String titolo = allegato.element("Commento").getText();
                  wsdmallegati[ao].setTitolo(titolo);
                }

                if (allegato.element("TipoFile") != null) {
                  String tipo = allegato.element("TipoFile").getText();
                  wsdmallegati[ao].setTipo(tipo);
                }

                if (allegato.element("Image") != null) {
                  String contenuto = allegato.element("Image").getText();
                  if (contenuto != null) {
                    wsdmallegati[ao].setContenuto(Base64.decode(contenuto.getBytes()));
                  }
                }

              }
            }
            wsdmprotocolloDocumento.setAllegati(wsdmallegati);
          }
        }

        // Classifica (codice e descrizione)
        if (elRoot.element("Classifica") != null) {
          String classifica = elRoot.element("Classifica").getText();
          wsdmprotocolloDocumento.setClassifica(classifica);
        }

        if (elRoot.element("Classifica_Descrizione") != null) {
          String classificaDescrizione = elRoot.element("Classifica_Descrizione").getText();
          wsdmprotocolloDocumento.setClassificaDescrizione(classificaDescrizione);
        }

        // Data della richiesta di inserimento/protocollo
        // Data (formato string dd/MM/yyyy)
        if (elRoot.element("DataInserimento") != null) {
          try {
            String dataInserimentoString = elRoot.element("DataInserimento").getText();
            if (dataInserimentoString != null) {
              Date dataInserimento = new SimpleDateFormat("dd/MM/yyyy").parse(dataInserimentoString);
              wsdmprotocolloDocumento.setData(dataInserimento);
            }
          } catch (Exception e) {

          }
        }

        // Data del protocollo
        // Data (formato string dd/MM/yyyy)
        if (elRoot.element("DataProtocollo") != null) {
          try {
            String dataProtocolloString = elRoot.element("DataProtocollo").getText();
            if (dataProtocolloString != null) {
              Date dataProtocollo = new SimpleDateFormat("dd/MM/yyyy").parse(dataProtocolloString);
              wsdmprotocolloDocumento.setDataProtocollo(dataProtocollo);
            }
          } catch (Exception e) {

          }
        }

        // Gestione dei mittenti/destinatari.
        // Se i documenti sono in arrivo le figure professionali coinvolte sono
        // "mittenti", se i documento sono in partenza le figure professionali
        // coinvolte sono "destinatari".
        Element listaMittentiDestinatari = elRoot.element("MittentiDestinatari");
        if (listaMittentiDestinatari != null) {
          List<?> mittentiDestinatari = listaMittentiDestinatari.selectNodes("MittenteDestinatario");
          if (mittentiDestinatari != null && mittentiDestinatari.size() > 0) {
            WSDMProtocolloAnagrafica[] anagrafiche = new WSDMProtocolloAnagrafica[mittentiDestinatari.size()];
            for (int md = 0; md < mittentiDestinatari.size(); md++) {
              Element mittenteDestinatario = (Element) mittentiDestinatari.get(md);

              if (mittenteDestinatario != null) {
                anagrafiche[md] = new WSDMProtocolloAnagrafica();

                if (mittenteDestinatario.element("CognomeNome") != null) {
                  String cognomeNome = mittenteDestinatario.element("CognomeNome").getText();
                  anagrafiche[md].setCognomeointestazione(cognomeNome);
                }

                if (mittenteDestinatario.element("PartitaIVA") != null) {
                  String partitaIVA = mittenteDestinatario.element("PartitaIVA").getText();
                  anagrafiche[md].setCodiceFiscale(partitaIVA);
                }
              }
            }

            if (PROTOCOLLO_IN_ARRIVO.equals(origine)) {
              wsdmprotocolloDocumento.setMittenti(anagrafiche);
            } else if (PROTOCOLLO_IN_PARTENZA.equals(origine)) {
              wsdmprotocolloDocumento.setDestinatari(anagrafiche);
            }

          }
        }

        // Mittente interno (codice e descrizione)
        if (elRoot.element("MittenteInterno") != null) {
          String mittenteInterno = elRoot.element("MittenteInterno").getText();
          wsdmprotocolloDocumento.setMittenteInterno(mittenteInterno);
        }

        if (elRoot.element("MittenteInternoDescrizione") != null) {
          String mittenteInternoDescrizione = elRoot.element("MittenteInternoDescrizione").getText();
          wsdmprotocolloDocumento.setMittenteInternoDescrizione(mittenteInternoDescrizione);
        }

        // Oggetto del documento inserito/protocollo
        if (elRoot.element("Oggetto") != null) {
          String oggetto = elRoot.element("Oggetto").getText();
          wsdmprotocolloDocumento.setOggetto(oggetto);
        }

        // Tipo del documento inserito/protocollo (codice e descrizione)
        if (elRoot.element("TipoDocumento") != null) {
          String tipoDocumento = elRoot.element("TipoDocumento").getText();
          wsdmprotocolloDocumento.setTipoDocumento(tipoDocumento);
        }

        if (elRoot.element("TipoDocumento_Descrizione") != null) {
          String tipoDocumentoDescrizione = elRoot.element("TipoDocumento_Descrizione").getText();
          wsdmprotocolloDocumento.setTipoDocumentoDescrizione(tipoDocumentoDescrizione);
        }

        // Anno e numero del fascicolo
        if (elRoot.element("NumeroPratica") != null) {
          WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();

          // Numero
          String numeroPratica = elRoot.element("NumeroPratica").getText();
          wsdmFascicolo.setNumeroFascicolo(numeroPratica);

          // Anno
          if (elRoot.element("AnnoPratica") != null) {
            try {
              String annoPratica = elRoot.element("AnnoPratica").getText();
              wsdmFascicolo.setAnnoFascicolo(new Long(annoPratica));
            } catch (Exception e) {

            }
          }

          // Codice univoco
          if (elRoot.element("IdPratica") != null) {
            String codiceFascicolo = elRoot.element("IdPratica").getText();
            wsdmFascicolo.setCodiceFascicolo(codiceFascicolo);
          }

          wsdmprotocolloDocumento.setFascicolo(wsdmFascicolo);

        }

        // Lettura dei dati aggiuntivi "metadati"
        Element datiUtente = elRoot.element("DatiUtente");
        if (datiUtente != null) {
          // Lista delle tabelle
          List<?> listaTabellaUtente = datiUtente.selectNodes("TabellaUtente");
          if (listaTabellaUtente != null && listaTabellaUtente.size() > 0) {
            WSDMTabella[] wsdmTabella = new WSDMTabella[listaTabellaUtente.size()];
            for (int ta = 0; ta < listaTabellaUtente.size(); ta++) {
              Element tabellaUtente = (Element) listaTabellaUtente.get(ta);
              wsdmTabella[ta] = new WSDMTabella();

              if (tabellaUtente != null) {
                if (tabellaUtente.element("NomeTabella") != null) {
                  wsdmTabella[ta].setNome(tabellaUtente.element("NomeTabella").getText());
                }

                // Lettura delle righe della tabella
                try {

                  List<?> listaRighe = tabellaUtente.element("Righe").selectNodes("Riga");
                  if (listaRighe != null && listaRighe.size() > 0) {
                    WSDMRiga[] wsdmRiga = new WSDMRiga[listaRighe.size()];
                    for (int ri = 0; ri < listaRighe.size(); ri++) {
                      Element riga = (Element) listaRighe.get(ri);
                      wsdmRiga[ri] = new WSDMRiga();
                      if (riga != null) {
                        wsdmRiga[ri].setNumero(new Long(ri));

                        // Lettura dei campi della riga
                        List<?> listaCampi = riga.element("Campi").selectNodes("Campo");
                        if (listaCampi != null && listaCampi.size() > 0) {
                          WSDMCampo[] wsdmCampo = new WSDMCampo[listaCampi.size()];
                          for (int ca = 0; ca < listaCampi.size(); ca++) {
                            Element campo = (Element) listaCampi.get(ca);
                            wsdmCampo[ca] = new WSDMCampo();

                            if (campo != null) {
                              if (campo.element("NomeCampo") != null) {
                                wsdmCampo[ca].setNome(campo.element("NomeCampo").getText());
                              }

                              if (campo.element("TipoCampo") != null) {
                                wsdmCampo[ca].setTipo(campo.element("TipoCampo").getText());
                              }

                              if (campo.element("ValoreCampo") != null) {
                                wsdmCampo[ca].setValore(campo.element("ValoreCampo").getText());
                              }
                            }
                          }
                          wsdmRiga[ri].setCampo(wsdmCampo);
                        }
                      }
                      wsdmTabella[ta].setRiga(wsdmRiga);
                    }
                  }

                } catch (Exception e) {

                }

              }
              wsdmprotocolloDocumento.setDatiPersonalizzati(wsdmTabella);
            }
          }
        }

      } else {
        wsdmprotocolloDocumento.setOggetto("### Documento Riservato ###");
      }

      wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmprotocolloDocumento);

    }
    return wsdmprotocolloDocumentoRes;
  }

  @Override
  public WSDMProtocolloDocumentoRes _attoContrattoLeggi(String username, String password, WSDMLoginAttr loginAttr, String tipo,
      String organo, Long anno, String numero) {
    WSDMProtocolloDocumentoRes wsdmProtocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    try {

      StringBuffer messaggioCtr = new StringBuffer();
      if (JirideUtilityControllo.ctrAttoLeggi(loginAttr, tipo, organo, anno, numero, messaggioCtr)) {

        String ruolo = loginAttr.getRuolo();
        String codiceAmministrazione = InitialContext.doLookup(CODICEAMMINISTRAZIONE);
        String codiceAOO = InitialContext.doLookup(CODICEAOO);
        String attoOutString = this.getWSAttiSoap().leggiAttoString("", tipo, organo, anno.toString(), numero, username, ruolo,
            codiceAmministrazione, codiceAOO);
        AttoOut attoOut = this.attoOutFromString(attoOutString);
        wsdmProtocolloDocumentoRes = JirideUtilityAtto.popolaWSDMProtocolloDocumentoResDaAttoOut(attoOut);

      } else {
        wsdmProtocolloDocumentoRes.setEsito(false);
        wsdmProtocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (WebServiceException w) {
      wsdmProtocolloDocumentoRes.setEsito(false);
      wsdmProtocolloDocumentoRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_attoLeggi)", w);
    } catch (NamingException e) {
      wsdmProtocolloDocumentoRes.setEsito(false);
      wsdmProtocolloDocumentoRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_attoLeggi)", e);
    } catch (Throwable t) {
      wsdmProtocolloDocumentoRes.setEsito(false);
      wsdmProtocolloDocumentoRes.setMessaggio(t.getMessage());
      logger.error("Errore (_attoLeggi)", t);
    }

    return wsdmProtocolloDocumentoRes;
  }

  /**
   * Conversione della stringa attoOutString nel suo oggetto AttoOut
   * 
   * @param attoOutString
   * @return
   * @throws JAXBException
   * @throws ParserConfigurationException
   * @throws SAXException
   * @throws IOException
   */
  private AttoOut attoOutFromString(String attoOutString) throws JAXBException, ParserConfigurationException, SAXException, IOException {
    JAXBContext context = JAXBContext.newInstance(AttoOut.class);

    XMLFilter filter = new NamespaceFilter();
    SAXParserFactory spf = SAXParserFactory.newInstance();
    SAXParser sp = spf.newSAXParser();
    XMLReader xr = sp.getXMLReader();
    filter.setParent(xr);

    Unmarshaller unmarshaller = context.createUnmarshaller();
    UnmarshallerHandler unmarshallerHandler = unmarshaller.getUnmarshallerHandler();
    filter.setContentHandler(unmarshallerHandler);

    InputSource xml = new InputSource(new StringReader(attoOutString));
    filter.parse(xml);
    Object result = unmarshallerHandler.getResult();
    AttoOut attoOut = (AttoOut) result;
    return attoOut;
  }

  /**
   * Conversione della stringa protocolloOutString nel suo oggetto ProtocolloOut
   * 
   * @param protocolloOutString
   * @return
   * @throws JAXBException
   * @throws ParserConfigurationException
   * @throws SAXException
   * @throws IOException
   */
  private ProtocolloOut protocolloOutFromString(String protocolloOutString) throws JAXBException, ParserConfigurationException,
      SAXException, IOException {
    JAXBContext context = JAXBContext.newInstance(ProtocolloOut.class);

    XMLFilter filter = new NamespaceFilter();
    SAXParserFactory spf = SAXParserFactory.newInstance();
    SAXParser sp = spf.newSAXParser();
    XMLReader xr = sp.getXMLReader();
    filter.setParent(xr);

    Unmarshaller unmarshaller = context.createUnmarshaller();
    UnmarshallerHandler unmarshallerHandler = unmarshaller.getUnmarshallerHandler();
    filter.setContentHandler(unmarshallerHandler);

    InputSource xml = new InputSource(new StringReader(protocolloOutString));
    filter.parse(xml);
    Object result = unmarshallerHandler.getResult();
    ProtocolloOut protocolloOut = (ProtocolloOut) result;
    return protocolloOut;
  }

  @Override
  public WSDMInviaMailRes _inviaMail(String username, String password, WSDMLoginAttr loginAttr, WSDMInviaMail wsdmInviaMail) {
    WSDMInviaMailRes wsdmInviaMailRes = new WSDMInviaMailRes();

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (JirideUtilityControllo.ctrInviaMail(loginAttr, wsdmInviaMail, messaggioCtr)) {
        String ruolo = loginAttr.getRuolo();
        String codiceAmministrazione = InitialContext.doLookup(CODICEAMMINISTRAZIONE);
        String codiceAOO = InitialContext.doLookup(CODICEAOO);

        // MessaggioIn
        it.iride.protocollo.xsd.inviamail.messaggioin.MessaggioIn inviaMailMessaggioIn = new it.iride.protocollo.xsd.inviamail.messaggioin.MessaggioIn();
        inviaMailMessaggioIn.setUtente(username);
        inviaMailMessaggioIn.setRuolo(ruolo);

        // Numero documento
        if (wsdmInviaMail.getNumeroDocumento() != null) {
          inviaMailMessaggioIn.setDocId(wsdmInviaMail.getNumeroDocumento());
        } else {
          inviaMailMessaggioIn.setDocId("");
        }

        // Anno e numero protocollo
        String numeroProtocollo = wsdmInviaMail.getNumeroProtocollo();
        Long annoProtocollo = wsdmInviaMail.getAnnoProtocollo();
        if (numeroProtocollo != null && annoProtocollo != null) {
          inviaMailMessaggioIn.setNumProt(numeroProtocollo);
          inviaMailMessaggioIn.setAnnoProt(annoProtocollo.toString());
        }

        // Oggetto, testo e mittente
        String oggettoMail = wsdmInviaMail.getOggettoMail();
        if (oggettoMail != null) inviaMailMessaggioIn.setOggettoMail(oggettoMail);
        String testoMail = wsdmInviaMail.getTestoMail();
        if (testoMail != null) inviaMailMessaggioIn.setTestoMail(testoMail);
        String mittenteMail = wsdmInviaMail.getMittenteMail();
        if (mittenteMail != null) inviaMailMessaggioIn.setMittenteMail(mittenteMail);

        // Destinatari
        it.iride.protocollo.xsd.inviamail.messaggioin.DestinatariMailType destMail = new it.iride.protocollo.xsd.inviamail.messaggioin.DestinatariMailType();
        String[] destinatariMail = wsdmInviaMail.getDestinatariMail();
        if (destinatariMail != null && destinatariMail.length > 0) {
          for (int dm = 0; dm < destinatariMail.length; dm++) {
            destMail.getDestinatarioMail().add(destinatariMail[dm]);
          }
        }
        inviaMailMessaggioIn.setDestinatariMail(destMail);

        // Destinatari CC
        it.iride.protocollo.xsd.inviamail.messaggioin.DestinatariCCMailType destCCMail = new it.iride.protocollo.xsd.inviamail.messaggioin.DestinatariCCMailType();
        String[] destinatariMailCC = wsdmInviaMail.getDestinatariMailCC();
        if (destinatariMailCC != null && destinatariMailCC.length > 0) {
          for (int dmCC = 0; dmCC < destinatariMailCC.length; dmCC++) {
            destCCMail.getDestinatarioCCMail().add(destinatariMailCC[dmCC]);
          }
        }
        inviaMailMessaggioIn.setDestinatariCCMail(destCCMail);

        // Conversione dell'oggetto MessageIn in XML
        String inviaMailMessaggioInXML = this.getInviaMailMessaggioInXML(inviaMailMessaggioIn);

        // Invio della richiesta
        String inviaMailMessaggioOutXML = this.getWSPostaSoap().inviaMail(inviaMailMessaggioInXML, codiceAmministrazione, codiceAOO);

        // Conversione delle risposta XML in oggetto MessaggioOut
        it.iride.protocollo.xsd.inviamail.messaggioout.MessaggioOut messaggioOut = this.inviaMailMessageOutFromXML(inviaMailMessaggioOutXML);

        // Lettura della risposta.
        // Dalle specifiche JIRIDE si evince che
        // - descrizione: in caso di invio riuscito riporta l'id del messaggio
        // email. In caso di errore riporta la descrizione dell’errore.
        // - codice: 0 se invio riuscito con successo; -1 in caso di errore.
        if ("0".equals(messaggioOut.getCodice())) {
          wsdmInviaMailRes.setEsito(true);
        } else {
          wsdmInviaMailRes.setEsito(false);
        }

        if (messaggioOut.getDescrizione() != null) wsdmInviaMailRes.setMessaggio(messaggioOut.getDescrizione());

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

  /**
   * Conversione della stringa inviaMailMessaggioOutXML (verificaMail) nel suo
   * oggetto MessaggioOut.
   * 
   * @param inviaMailMessaggioOutXML
   * @return
   * @throws JAXBException
   * @throws ParserConfigurationException
   * @throws SAXException
   * @throws IOException
   */
  private it.iride.protocollo.xsd.inviamail.messaggioout.MessaggioOut inviaMailMessageOutFromXML(String inviaMailMessaggioOutXML)
      throws JAXBException, ParserConfigurationException, SAXException, IOException {
    Object objectJAXB = null;
    JAXBContext jaxbContext = JAXBContext.newInstance(it.iride.protocollo.xsd.inviamail.messaggioout.MessaggioOut.class);
    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
    StringBuffer xmlString = new StringBuffer(inviaMailMessaggioOutXML);
    objectJAXB = unmarshaller.unmarshal(new StringReader(xmlString.toString()));
    it.iride.protocollo.xsd.inviamail.messaggioout.MessaggioOut messaggioOut = (it.iride.protocollo.xsd.inviamail.messaggioout.MessaggioOut) objectJAXB;
    return messaggioOut;
  }

  /**
   * Conversione dell'oggetto MessaggioIn (inviaMail) in stringa XML
   * 
   * @param inviaMailMessaggioIn
   * @return
   */
  private String getInviaMailMessaggioInXML(it.iride.protocollo.xsd.inviamail.messaggioin.MessaggioIn inviaMailMessaggioIn)
      throws JAXBException {
    StringWriter xml = new StringWriter();
    JAXBContext jaxbLocalContext = JAXBContext.newInstance(it.iride.protocollo.xsd.inviamail.messaggioin.MessaggioIn.class);
    jaxbLocalContext.createMarshaller().marshal(inviaMailMessaggioIn, xml);
    return xml.toString();
  }

  @Override
  public WSDMVerificaMailRes _verificaMail(String username, String password, WSDMLoginAttr loginAttr, String numeroDocumento,
      Long annoProtocollo, String numeroProtocollo) {

    WSDMVerificaMailRes wsdmVerificaMailRes = new WSDMVerificaMailRes();

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (JirideUtilityControllo.ctrVerificaMail(loginAttr, numeroDocumento, annoProtocollo, numeroProtocollo, messaggioCtr)) {
        String ruolo = loginAttr.getRuolo();
        String codiceAmministrazione = InitialContext.doLookup(CODICEAMMINISTRAZIONE);
        String codiceAOO = InitialContext.doLookup(CODICEAOO);

        // MessageIn
        it.iride.protocollo.xsd.verificamail.messaggioin.MessaggioIn verificaMailMessaggioIn = new it.iride.protocollo.xsd.verificamail.messaggioin.MessaggioIn();
        verificaMailMessaggioIn.setUtente(username);
        verificaMailMessaggioIn.setRuolo(ruolo);

        if (numeroDocumento != null) {
          verificaMailMessaggioIn.setDocId(numeroDocumento);
        } else {
          verificaMailMessaggioIn.setDocId("");
        }
        if (annoProtocollo != null && numeroProtocollo != null) {
          verificaMailMessaggioIn.setAnnoProt(annoProtocollo.toString());
          verificaMailMessaggioIn.setNumProt(numeroProtocollo);
        }

        // Conversione dell'oggetto MessageIn in XML
        String verificaMailMessaggioInXML = this.getVerificaMailMessaggioInXML(verificaMailMessaggioIn);

        // Invio della richiesta
        String verificaMailMessaggioOutXML = this.getWSPostaSoap().verificaInvio(verificaMailMessaggioInXML, codiceAmministrazione,
            codiceAOO);

        // Conversione della risposta XML in oggetto MessaggioOut
        it.iride.protocollo.xsd.verificamail.messaggioout.MessaggioOut messaggioOut = this.verificaMailMessageOutFromXML(verificaMailMessaggioOutXML);
        wsdmVerificaMailRes.setEsito(true);
        wsdmVerificaMailRes.setInviato(messaggioOut.getInviato());
        if (messaggioOut.getNumAccettazioni() != null) {
          wsdmVerificaMailRes.setNumeroAccettazioni(new Long(messaggioOut.getNumAccettazioni()));
        } else {
          wsdmVerificaMailRes.setNumeroAccettazioni(new Long(0));
        }
        if (messaggioOut.getNumConsegne() != null) {
          wsdmVerificaMailRes.setNumeroConsegne(new Long(messaggioOut.getNumConsegne()));
        } else {
          wsdmVerificaMailRes.setNumeroConsegne(new Long(0));
        }
      } else {
        wsdmVerificaMailRes.setEsito(false);
        wsdmVerificaMailRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (WebServiceException w) {
      wsdmVerificaMailRes.setEsito(false);
      wsdmVerificaMailRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_verificaMail)", w);
    } catch (NamingException e) {
      wsdmVerificaMailRes.setEsito(false);
      wsdmVerificaMailRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_verificaMail)", e);
    } catch (Throwable t) {
      wsdmVerificaMailRes.setEsito(false);
      wsdmVerificaMailRes.setMessaggio(t.getMessage());
      logger.error("Errore (_verificaMail)", t);
    }

    return wsdmVerificaMailRes;

  }

  /**
   * Conversione della stringa verificaMailMessageOutXML (verificaMail) nel suo
   * oggetto MessaggioOut.
   * 
   * @param verificaMailMessageOutXML
   * @return
   * @throws JAXBException
   * @throws ParserConfigurationException
   * @throws SAXException
   * @throws IOException
   */
  private it.iride.protocollo.xsd.verificamail.messaggioout.MessaggioOut verificaMailMessageOutFromXML(String verificaMailMessageOutXML)
      throws JAXBException, ParserConfigurationException, SAXException, IOException {
    Object objectJAXB = null;
    JAXBContext jaxbContext = JAXBContext.newInstance(it.iride.protocollo.xsd.verificamail.messaggioout.MessaggioOut.class);
    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
    StringBuffer xmlString = new StringBuffer(verificaMailMessageOutXML);
    objectJAXB = unmarshaller.unmarshal(new StringReader(xmlString.toString()));
    it.iride.protocollo.xsd.verificamail.messaggioout.MessaggioOut messaggioOut = (it.iride.protocollo.xsd.verificamail.messaggioout.MessaggioOut) objectJAXB;
    return messaggioOut;
  }

  /**
   * Conversione dell'oggetto MessaggioIn (verificaMail) in stringa XML
   * 
   * @param verificaMailMessaggioIn
   * @return
   */
  private String getVerificaMailMessaggioInXML(it.iride.protocollo.xsd.verificamail.messaggioin.MessaggioIn verificaMailMessaggioIn)
      throws JAXBException {
    StringWriter xml = new StringWriter();
    JAXBContext jaxbLocalContext = JAXBContext.newInstance(it.iride.protocollo.xsd.verificamail.messaggioin.MessaggioIn.class);
    jaxbLocalContext.createMarshaller().marshal(verificaMailMessaggioIn, xml);
    return xml.toString();
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

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (JirideUtilityControllo.ctrProtocolloModifica(loginAttr, wsdmprotocolloModificaIn, messaggioCtr)) {
        String ruolo = loginAttr.getRuolo();
        String codiceAmministrazione = InitialContext.doLookup(CODICEAMMINISTRAZIONE);
        String codiceAOO = InitialContext.doLookup(CODICEAOO);

        // <?xml version="1.0" encoding="UTF-8"?>
        // <ProtoIn>
        // <EliminaRiservatezza>S</EliminaRiservatezza>
        // <IdDocumentoRIS>
        // <IdDocumentoRIS>IdDocumentoRIS</IdDocumentoRIS>
        // </IdDocumentoRIS>
        // <Utente>Utente</Utente>
        // <Ruolo>Ruolo</Ruolo>
        // <LivelloRiservatezza>LivelloRiservatezza</LivelloRiservatezza>
        // <DataFineRiservatezza>DataFineRiservatezza</DataFineRiservatezza>
        // </ProtoIn>

        String protocolloModificaInString = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
        protocolloModificaInString += "<ProtoIn>";

        // Se non e' settata ne' la data di fine riservatezza, ne' il livello si
        // suppone che si voglia annullare
        // la riservatezza dei documenti indicati
        if (wsdmprotocolloModificaIn.getDataFineRiservatezza() == null
            && (wsdmprotocolloModificaIn.getLivelloRiservatezza() == null || (wsdmprotocolloModificaIn.getLivelloRiservatezza() != null && "".equals(wsdmprotocolloModificaIn.getLivelloRiservatezza().trim())))) {
          protocolloModificaInString += "<EliminaRiservatezza>S</EliminaRiservatezza>";
        }

        // Lista dei numeri di documento
        String[] numeroDocumento = wsdmprotocolloModificaIn.getNumeroDocumento();
        if (numeroDocumento != null && numeroDocumento.length > 0) {
          protocolloModificaInString += "<IdDocumentiRIS>";
          for (int p = 0; p < numeroDocumento.length; p++) {
            protocolloModificaInString += "<IdDocumentoRIS>" + numeroDocumento[p] + "</IdDocumentoRIS>";
          }
          protocolloModificaInString += "</IdDocumentiRIS>";
        }

        // Utente
        if (username != null) {
          protocolloModificaInString += "<Utente>" + username + "</Utente>";
        }

        // Ruolo
        if (ruolo != null) {
          protocolloModificaInString += "<Ruolo>" + ruolo + "</Ruolo>";
        }

        // Livello di riservatezza
        if (wsdmprotocolloModificaIn.getLivelloRiservatezza() != null
            && !"".equals(wsdmprotocolloModificaIn.getLivelloRiservatezza().trim())) {
          protocolloModificaInString += "<LivelloRiservatezza>"
              + wsdmprotocolloModificaIn.getLivelloRiservatezza()
              + "</LivelloRiservatezza>";
        }

        // Date fine riservatezza
        if (wsdmprotocolloModificaIn.getDataFineRiservatezza() != null) {
          Date dataFineRiservatezza = wsdmprotocolloModificaIn.getDataFineRiservatezza();
          String dataFineRiservatezzaFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(dataFineRiservatezza);
          protocolloModificaInString += "<DataFineRiservatezza>" + dataFineRiservatezzaFormat + "</DataFineRiservatezza>";
        }

        protocolloModificaInString += "</ProtoIn>";

        String modificaDocumentoEAnagraficheString = this.getProtocolloSoap().modificaDocumentoEAnagraficheString(
            protocolloModificaInString, codiceAmministrazione, codiceAOO);

        Document document = DocumentHelper.parseText(modificaDocumentoEAnagraficheString);
        Element elRoot = document.getRootElement();
        if (elRoot != null) {
          // Messaggio ed errore
          boolean esito = true;
          String messaggio = elRoot.element("Messaggio").getText();
          String errore = elRoot.element("Errore").getText();
          if (errore != null && !errore.equals("")) {
            esito = false;
            messaggio += " - " + errore;
          }
          wsdmprotocolloModificaRes.setEsito(esito);
          wsdmprotocolloModificaRes.setMessaggio(messaggio);
        } else {
          wsdmprotocolloModificaRes.setEsito(false);
          wsdmprotocolloModificaRes.setMessaggio(modificaDocumentoEAnagraficheString);
        }

      } else {
        wsdmprotocolloModificaRes.setEsito(false);
        wsdmprotocolloModificaRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (WebServiceException w) {
      wsdmprotocolloModificaRes.setEsito(false);
      wsdmprotocolloModificaRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_protocolloModifica)", w);
    } catch (NamingException e) {
      wsdmprotocolloModificaRes.setEsito(false);
      wsdmprotocolloModificaRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_protocolloModifica)", e);
    } catch (Throwable t) {
      wsdmprotocolloModificaRes.setEsito(false);
      wsdmprotocolloModificaRes.setMessaggio(t.getMessage());
      logger.error("Errore (_protocolloModifica)", t);
    }

    return wsdmprotocolloModificaRes;
  }

  @Override
  public WSDMFascicoloModificaRes _fascicoloModifica(String username, String password, WSDMLoginAttr loginAttr,
      WSDMFascicoloModificaIn wsdmfascicoloModificaIn) {
    WSDMFascicoloModificaRes wsdmfascicoloModificaRes = new WSDMFascicoloModificaRes();

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (JirideUtilityControllo.ctrFascicoloModifica(loginAttr, wsdmfascicoloModificaIn, messaggioCtr)) {

        String codiceAmministrazione = InitialContext.doLookup(CODICEAMMINISTRAZIONE);

        // <MetadatiIn>
        // <table name="fascicolo">
        // <row progressive="0">
        // <field name="stato_gara">In fase di aggiudicazione</field>
        // </row>
        // </table>
        // <CheckMetaExistence>S</CheckMetaExistence>
        // </MetadatiIn>

        String metadatiIn = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";

        metadatiIn += "<MetadatiIn>";

        WSDMTabella[] listaTabelle = wsdmfascicoloModificaIn.getDatiPersonalizzati();
        if (listaTabelle != null && listaTabelle.length > 0) {
          for (int ta = 0; ta < listaTabelle.length; ta++) {
            WSDMTabella tabella = listaTabelle[ta];
            String nomeTabella = tabella.getNome();
            WSDMRiga[] listaRighe = tabella.getRiga();
            if (nomeTabella != null && listaRighe != null && listaRighe.length > 0) {
              metadatiIn += "<table name=\"" + nomeTabella + "\">";
              for (int ri = 0; ri < listaRighe.length; ri++) {
                WSDMRiga riga = listaRighe[ri];
                Long numeroRiga = riga.getNumero();
                WSDMCampo[] listaCampi = riga.getCampo();
                if (numeroRiga != null && listaCampi != null && listaCampi.length > 0) {
                  metadatiIn += "<row progressive=\"" + ri + "\">";
                  for (int ca = 0; ca < listaCampi.length; ca++) {
                    WSDMCampo campo = listaCampi[ca];
                    String nomeCampo = campo.getNome();
                    String valoreCampo = campo.getValore();
                    if (nomeCampo != null && valoreCampo != null) {
                      metadatiIn += "<field name=\"" + nomeCampo + "\">" + valoreCampo + "</field>";
                    }
                  }
                  metadatiIn += "</row>";
                }
              }
              metadatiIn += "</table>";
            }
          }
        }

        metadatiIn += "<CheckMetaExistence>S</CheckMetaExistence>";
        metadatiIn += "</MetadatiIn>";

        EsitoOperazione esitoOperazione = this.getWSFascicoloSoap().inserisciMetadati("", wsdmfascicoloModificaIn.getCodiceFascicolo(),
            metadatiIn, codiceAmministrazione);

        // Esito, secondo le specifiche JIRIDE, e' necessario controllare se
        // l'attributo "Errore" e' popolato.
        // Se popolato la richiesta ad JIRIDE ha generato un errore la cui
        // descrizione dovra' essere concatenata all'attributo "Messaggio".
        boolean esito = true;
        String messaggio = esitoOperazione.getMessaggio();
        String errore = esitoOperazione.getErrore();
        if (errore != null && !errore.equals("")) {
          esito = false;
          messaggio += " - " + errore;
        }
        wsdmfascicoloModificaRes.setEsito(esito);
        wsdmfascicoloModificaRes.setMessaggio(messaggio);

      } else {
        wsdmfascicoloModificaRes.setEsito(false);
        wsdmfascicoloModificaRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (WebServiceException w) {
      wsdmfascicoloModificaRes.setEsito(false);
      wsdmfascicoloModificaRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_fascicoloModifica)", w);
    } catch (NamingException e) {
      wsdmfascicoloModificaRes.setEsito(false);
      wsdmfascicoloModificaRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_fascicoloModifica)", e);
    } catch (Throwable t) {
      wsdmfascicoloModificaRes.setEsito(false);
      wsdmfascicoloModificaRes.setMessaggio(t.getMessage());
      logger.error("Errore (_fascicoloModifica)", t);
    }

    return wsdmfascicoloModificaRes;
  }

  @Override
  public WSDMAnagraficaLeggiRes _anagraficaLeggi(String username, String password, WSDMLoginAttr loginAttr, String codiceAnagrafica) {
    WSDMAnagraficaLeggiRes wsdmAnagraficaLeggiRes = new WSDMAnagraficaLeggiRes();

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (JirideUtilityControllo.ctrAnagraficaLeggi(loginAttr, codiceAnagrafica, messaggioCtr)) {

        String utrwssgateway_alias = InitialContext.doLookup(UTRWSSGATEWAY_ALIAS);

        // <soapenv:Body>
        // <urn:getEntities
        // soapenv:encodingStyle="http://schemas.xmlsoap.org/soap/encoding/">
        // <logonCredentials xsi:type="xsd:string">
        // &lt;logon_credentials
        // alias='alice@sicraweb'&gt;&lt;/logon_credentials&gt;
        // </logonCredentials>
        // <searchFilter xsi:type="xsd:string">
        // &lt;search_filter&gt;
        // &lt;filter_id&gt;2702&lt;/filter_id&gt;
        // &lt;fetch&gt;-,id,an1.codice_fiscale,an1.nominativo&lt;/fetch&gt;
        // &lt;/search_filter&gt;
        // </searchFilter>
        // </urn:getEntities>
        // </soapenv:Body>

        boolean esito = false;
        String messaggio = "";

        String logonCredentials = "<logon_credentials alias=\"" + utrwssgateway_alias + "\"></logon_credentials>";

        String searchFilter = "<search_filter>";
        searchFilter += "<filter_id>" + codiceAnagrafica + "</filter_id>";
        searchFilter += "<fetch>id,-relations,+an1</fetch>";
        searchFilter += "</search_filter>";

        String getEntitiesReturn = this.getUtrWssGateway().getEntities(logonCredentials, searchFilter);

        Document document = DocumentHelper.parseText(getEntitiesReturn);
        Element elRoot = document.getRootElement();
        if (elRoot != null) {
          List<?> entities = elRoot.selectNodes("entity");
          if (entities != null && entities.size() > 0) {
            if (entities.size() > 1) {
              esito = false;
              messaggio = "La lettura dell'anagrafica ha restituito piu' di un risultato (" + entities.size() + " risultati)";
            } else {
              esito = true;
              String nominativo = "";
              String codice_fiscale = "";
              Element entity = (Element) entities.get(0);
              if (entity != null) {
                if (entity.element("an1") != null) {
                  Element an1 = entity.element("an1");
                  if (an1 != null) {
                    nominativo = an1.attributeValue("nominativo");
                    codice_fiscale = an1.attributeValue("codice_fiscale");
                  }
                }
              }
              WSDMProtocolloAnagrafica wsdmProtocolloAnagrafica = new WSDMProtocolloAnagrafica();
              wsdmProtocolloAnagrafica.setCognomeointestazione(nominativo);
              wsdmProtocolloAnagrafica.setCodiceFiscale(codice_fiscale);
              wsdmAnagraficaLeggiRes.setAnagrafica(wsdmProtocolloAnagrafica);
            }
          } else {
            esito = false;
            messaggio = "Anagrafica non trovata";
          }
        }

        wsdmAnagraficaLeggiRes.setEsito(esito);
        wsdmAnagraficaLeggiRes.setMessaggio(messaggio);

      } else {
        wsdmAnagraficaLeggiRes.setEsito(false);
        wsdmAnagraficaLeggiRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (WebServiceException w) {
      wsdmAnagraficaLeggiRes.setEsito(false);
      wsdmAnagraficaLeggiRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_anagraficaLeggi)", w);
    } catch (NamingException e) {
      wsdmAnagraficaLeggiRes.setEsito(false);
      wsdmAnagraficaLeggiRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_anagraficaLeggi)", e);
    } catch (Throwable t) {
      wsdmAnagraficaLeggiRes.setEsito(false);
      wsdmAnagraficaLeggiRes.setMessaggio(t.getMessage());
      logger.error("Errore (_anagraficaLeggi)", t);
    }

    return wsdmAnagraficaLeggiRes;
  }

  @Override
  public WSDMDocumentoCollegaRes _documentoCollega(String username, String password, WSDMLoginAttr loginAttr, String numeroDocumentoPadre,
      String numeroDocumentoFiglio, String tipoCollegamento) {

    WSDMDocumentoCollegaRes wsdmDocumentoCollegaRes = new WSDMDocumentoCollegaRes();

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (JirideUtilityControllo.ctrDocumentoCollega(loginAttr, numeroDocumentoPadre, numeroDocumentoFiglio, tipoCollegamento, messaggioCtr)) {

        boolean esito = false;
        String messaggio = "";

        String codiceAmministrazione = InitialContext.doLookup(CODICEAMMINISTRAZIONE);
        String codiceAOO = InitialContext.doLookup(CODICEAOO);

        // <CollegaDocumentoIn>
        // <IdDocCollegante>4614</IdDocCollegante>
        // <IdDocCollegato>4585</IdDocCollegato>
        // <TipoCollegamento>COLL_PROT</TipoCollegamento>
        // </CollegaDocumentoIn>

        // IdDocCollegante Stringa O Identificativo del documento (o Fascicolo)
        // collegante (Figlio)
        // IdDocCollegato Stringa O Identificativo del documento (o Fascicolo)
        // a cui collegare (Padre)
        // TipoCollegamento Stringa O
        // Tipo di collegamento tra documenti (o
        // Fascicoli). Dalla gestione documentale ->
        // tipi collegamenti tra documenti (o tipi
        // collegamenti tra fascicoli).
        // Il codice (se non lo trova prova anche per
        // descrizione) del tipo collegamento.

        String collegaDocumentoIn = "<CollegaDocumentoIn>";
        collegaDocumentoIn += "<IdDocCollegante>" + numeroDocumentoFiglio + "</IdDocCollegante>";
        collegaDocumentoIn += "<IdDocCollegato>" + numeroDocumentoPadre + "</IdDocCollegato>";
        collegaDocumentoIn += "<TipoCollegamento>" + tipoCollegamento + "</TipoCollegamento>";
        collegaDocumentoIn += "</CollegaDocumentoIn>";

        String collegaDocumentoRes = this.getProtocolloSoap().collegaDocumento(collegaDocumentoIn, codiceAmministrazione, codiceAOO);

        Document document = DocumentHelper.parseText(collegaDocumentoRes);
        Element elRoot = document.getRootElement();
        if (elRoot != null) {

          String esitoRes = elRoot.element("Esito").getText();
          String messaggioRes = elRoot.element("Messaggio").getText();
          String erroreRes = elRoot.element("Errore").getText();

          if ("true".equals(esitoRes)) esito = true;

          if (messaggioRes != null && !messaggioRes.equals("")) {
            messaggio += messaggioRes;
          }

          if (erroreRes != null && !erroreRes.equals("")) {
            esito = false;
            messaggio += " - " + erroreRes;
          }

        }

        wsdmDocumentoCollegaRes.setEsito(esito);
        wsdmDocumentoCollegaRes.setMessaggio(messaggio);

      } else {
        wsdmDocumentoCollegaRes.setEsito(false);
        wsdmDocumentoCollegaRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (WebServiceException w) {
      wsdmDocumentoCollegaRes.setEsito(false);
      wsdmDocumentoCollegaRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_documentoCollega)", w);
    } catch (NamingException e) {
      wsdmDocumentoCollegaRes.setEsito(false);
      wsdmDocumentoCollegaRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_documentoCollega)", e);
    } catch (Throwable t) {
      wsdmDocumentoCollegaRes.setEsito(false);
      wsdmDocumentoCollegaRes.setMessaggio(t.getMessage());
      logger.error("Errore (_documentoCollega)", t);
    }

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

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (JirideUtilityControllo.ctrAggiungiAllegati(loginAttr, aggiungiAllegatiIn, messaggioCtr)) {

        boolean esito = true;
        String messaggio = "";

        String codiceAmministrazione = InitialContext.doLookup(CODICEAMMINISTRAZIONE);
        String codiceAOO = InitialContext.doLookup(CODICEAOO);

        String nuoviAllegatiStr = "<NuoviAllegati>";

        // Numero documento
        if (aggiungiAllegatiIn.getNumeroDocumento() != null) {
          nuoviAllegatiStr += "<idDoc>" + aggiungiAllegatiIn.getNumeroDocumento() + "</idDoc>";
        } else {
          nuoviAllegatiStr += "<idDoc></idDoc>";
        }

        // Anno e numero protocollo
        if (aggiungiAllegatiIn.getAnnoProtocollo() != null) {
          nuoviAllegatiStr += "<annoProt>" + aggiungiAllegatiIn.getAnnoProtocollo() + "</annoProt>";
        } else {
          nuoviAllegatiStr += "<annoProt></annoProt>";
        }
        if (aggiungiAllegatiIn.getNumeroProtocollo() != null) {
          nuoviAllegatiStr += "<numProt>" + aggiungiAllegatiIn.getNumeroProtocollo() + "</numProt>";
        } else {
          nuoviAllegatiStr += "<numProt></numProt>";
        }

        // Forza modifica
        // <forzaModifica>
        // <senzaLog>N</senzaLog>
        // <motivazione>AAAA1111</motivazione>
        // <estremiProvvAut>ffff1111</estremiProvvAut>
        // </forzaModifica>
        try {
          String senzalog = InitialContext.doLookup(AGGIUNGI_ALLEGATI_SENZALOG);
          String motivazione = InitialContext.doLookup(AGGIUNGI_ALLEGATI_MOTIVAZIONE);
          String estremiprovvaut = InitialContext.doLookup(AGGIUNGI_ALLEGATI_ESTREMIPROVVAUT);

          nuoviAllegatiStr += "<forzaModifica>";
          if (senzalog != null) {
            nuoviAllegatiStr += "<senzaLog>" + senzalog + "</senzaLog>";
          }
          if (motivazione != null) {
            nuoviAllegatiStr += "<motivazione>" + motivazione + "</motivazione>";
          }
          if (estremiprovvaut != null) {
            nuoviAllegatiStr += "<estremiProvvAut>" + estremiprovvaut + "</estremiProvvAut>";
          }
          nuoviAllegatiStr += "</forzaModifica>";
        } catch (Exception e) {

        }

        // Allegati
        if (aggiungiAllegatiIn.getAllegati() != null) {
          nuoviAllegatiStr += "<Allegati>";

          WSDMProtocolloAllegato[] allegati = aggiungiAllegatiIn.getAllegati();
          for (int a = 0; a < allegati.length; a++) {
            WSDMProtocolloAllegato allegato = allegati[a];
            nuoviAllegatiStr += "<Allegato>";
            nuoviAllegatiStr += "<TipoFile>" + allegato.getTipo() + "</TipoFile>";
            nuoviAllegatiStr += "<Image>" + org.apache.axis.encoding.Base64.encode(allegato.getContenuto()) + "</Image>";
            nuoviAllegatiStr += "<Commento>" + allegato.getTitolo() + "</Commento>";
            nuoviAllegatiStr += "<NomeAllegato>" + allegato.getNome() + "</NomeAllegato>";
            nuoviAllegatiStr += "</Allegato>";
          }
          nuoviAllegatiStr += "</Allegati>";
        }

        nuoviAllegatiStr += "</NuoviAllegati>";

        String aggiungiAllegatiRes = this.getProtocolloSoap().aggiungiAllegatiString(nuoviAllegatiStr, codiceAmministrazione, codiceAOO);

        Document document = DocumentHelper.parseText(aggiungiAllegatiRes);
        Element elRoot = document.getRootElement();
        if (elRoot != null) {

          String messaggioRes = elRoot.element("Messaggio").getText();
          String erroreRes = elRoot.element("Errore").getText();

          if (messaggioRes != null && !messaggioRes.equals("")) {
            messaggio += messaggioRes;
          }

          if (erroreRes != null && !erroreRes.equals("")) {
            esito = false;
            messaggio += " - " + erroreRes;
          }

        }

        wsdmAggiungiAllegatiRes.setEsito(esito);
        wsdmAggiungiAllegatiRes.setMessaggio(messaggio);

      } else {
        wsdmAggiungiAllegatiRes.setEsito(false);
        wsdmAggiungiAllegatiRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (WebServiceException w) {
      wsdmAggiungiAllegatiRes.setEsito(false);
      wsdmAggiungiAllegatiRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_aggiungiAllegati)", w);
    } catch (NamingException e) {
      wsdmAggiungiAllegatiRes.setEsito(false);
      wsdmAggiungiAllegatiRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_aggiungiAllegati)", e);
    } catch (Throwable t) {
      wsdmAggiungiAllegatiRes.setEsito(false);
      wsdmAggiungiAllegatiRes.setMessaggio(t.getMessage());
      logger.error("Errore (_aggiungiAllegati)", t);
    }

    return wsdmAggiungiAllegatiRes;
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
  public WSDMListaAccountEmailRes _listaAccountEmail(String username, String password, WSDMLoginAttr loginAttr,
      WSDMRicercaAccountEmail ricercaAccountEmail) {

    WSDMListaAccountEmailRes wsdmListaAccountEmailRes = new WSDMListaAccountEmailRes();

    HttpURLConnection connection = null;

    try {

      String account_email_ws = InitialContext.doLookup(ACCOUNT_EMAIL_WS);
      if (account_email_ws == null || (account_email_ws != null && "".equals(account_email_ws.trim()))) {
        throw new Exception(ACCOUNT_EMAIL_WS_NOT_DEFINED);
      }

      String ticket = InitialContext.doLookup(TICKET);
      if (ticket == null || (ticket != null && "".equals(ticket.trim()))) {
        throw new Exception(TICKET_NON_DEFINED);
      }

      URL url = new URL(account_email_ws);
      connection = (HttpURLConnection) url.openConnection();
      connection.setDoInput(true);
      connection.setDoOutput(true);
      connection.setUseCaches(false);
      connection.setRequestMethod("POST");
      connection.setRequestProperty("Authorization", "TICKET " + ticket);
      connection.setRequestProperty("Connection", "Keep-Alive");
      connection.setRequestProperty("Content-Type", "application/json");

      // {
      // “tipo” : “email|pec”,
      // “utilizzo” : “invio|ricezione”,
      // “contesto” : “generico|protocollo”,
      // “emailAddress” : “indirizzo di posta per cui filtrare”
      // "userGroupName": "lo username o l’identificativo del gruppo",
      // "codiceUfficio": "il codUfficio di organigramma"
      // }

      JSONObject jsonInput = new JSONObject();

      String tipo = ricercaAccountEmail.getTipo();
      if (tipo != null && !"".equals(tipo.trim())) {
        jsonInput.accumulate("tipo", tipo);
      }

      String utilizzo = ricercaAccountEmail.getUtilizzo();
      if (utilizzo != null && !"".equals(utilizzo.trim())) {
        jsonInput.accumulate("utilizzo", utilizzo);
      }

      String contesto = ricercaAccountEmail.getContesto();
      if (contesto != null && !"".equals(contesto.trim())) {
        jsonInput.accumulate("contesto", contesto);
      }

      String emailAddress = ricercaAccountEmail.getEmailAddress();
      if (emailAddress != null && !"".equals(emailAddress.trim())) {
        jsonInput.accumulate("emailAddress", emailAddress);
      }

      String userGroupName = ricercaAccountEmail.getUserGroupName();
      if (userGroupName != null && !"".equals(userGroupName.trim())) {
        jsonInput.accumulate("userGroupName", userGroupName);
      }

      String codiceUfficio = ricercaAccountEmail.getCodiceUfficio();
      if (codiceUfficio != null && !"".equals(codiceUfficio.trim())) {
        jsonInput.accumulate("codiceUfficio", codiceUfficio);
      }

      DataOutputStream output = new DataOutputStream(connection.getOutputStream());
      output.write(jsonInput.toString().getBytes());
      output.flush();

      if (logger.isDebugEnabled()) {
        OutputStream osr = connection.getOutputStream();
        logger.debug("getOutputStream: " + osr);
      }

      int httpStatus = connection.getResponseCode();

      wsdmListaAccountEmailRes.setEsito(false);

      if (httpStatus == 200) {
        InputStream isR = connection.getInputStream();
        String res = "";
        int countByte = 0;
        byte[] buffer = new byte[1024];
        while ((countByte = isR.read(buffer)) != -1) {
          byte[] tmpByte = new byte[countByte];
          for (int i = 0; i < countByte; i++)
            tmpByte[i] = buffer[i];
          String s = new String(tmpByte);
          buffer = new byte[1024];
          res += s;
        }
        res = res.trim();

        if (logger.isDebugEnabled()) {
          logger.debug("getInputStream: " + res);
        }

        // Lettura della risposta
        JSONObject jsonOutput = new JSONObject(res);
        String r_esito = (String) jsonOutput.get("esito");
        if ("ok".equals(r_esito)) {
          // {
          // "esito": "ok",
          // "messaggio": null,
          // "emailAccounts": [
          // {
          // "tipo": "email",
          // "des": "Account di default per invio eMail",
          // "emailAddress": null
          // },
          // {
          // "tipo": "pec",
          // "des": "Mail PEC del Corso di Febbraio",
          // "emailAddress": "assistenza.protocollo@maggioli.legalmail.it"
          // },
          // {
          // "tipo": "email",
          // "des": "Notifiche Protocollo",
          // "emailAddress": "cedafbo.pec@legalmail.it"
          // }
          // ]
          // }
          wsdmListaAccountEmailRes.setEsito(false);

          JSONArray r_lista_emailAccounts = jsonOutput.getJSONArray("emailAccounts");
          if (r_lista_emailAccounts.length() > 0) {

            wsdmListaAccountEmailRes.setEsito(true);

            WSDMAccountEmail[] listaAccountEmail = new WSDMAccountEmail[r_lista_emailAccounts.length()];
            for (int ae = 0; ae < r_lista_emailAccounts.length(); ae++) {
              listaAccountEmail[ae] = new WSDMAccountEmail();
              JSONObject r_emailAccounts = (JSONObject) r_lista_emailAccounts.get(ae);

              if (r_emailAccounts.get("tipo") != JSONObject.NULL) {
                listaAccountEmail[ae].setTipo(r_emailAccounts.getString("tipo"));
              } else {
                listaAccountEmail[ae].setTipo("");
              }

              if (r_emailAccounts.get("des") != JSONObject.NULL) {
                listaAccountEmail[ae].setDes(r_emailAccounts.getString("des"));
              } else {
                listaAccountEmail[ae].setDes("");
              }

              if (r_emailAccounts.get("emailAddress") != JSONObject.NULL) {
                listaAccountEmail[ae].setEmailAddress(r_emailAccounts.getString("emailAddress"));
              } else {
                listaAccountEmail[ae].setEmailAddress("");
              }
            }
            wsdmListaAccountEmailRes.setListaAccountEmail(listaAccountEmail);
          } else {
            wsdmListaAccountEmailRes.setEsito(false);
            wsdmListaAccountEmailRes.setMessaggio("Nessun account email trovato");
          }

        } else {
          // {
          // "esito": "errore",
          // "messaggio":
          // "E' stato specificato un tipo di account non riconosciuto",
          // "emailAccounts": null
          // }

          wsdmListaAccountEmailRes.setEsito(false);
          if (jsonOutput.get("messaggio") != JSONObject.NULL) {
            wsdmListaAccountEmailRes.setMessaggio((String) jsonOutput.get("messaggio"));
          } else {
            wsdmListaAccountEmailRes.setMessaggio("");
          }
        }

      } else {
        wsdmListaAccountEmailRes.setEsito(false);
        wsdmListaAccountEmailRes.setMessaggio("Il sistema ha risposto con l'errore "
            + httpStatus
            + "( "
            + connection.getResponseMessage()
            + ")");
      }

    } catch (WebServiceException w) {
      wsdmListaAccountEmailRes.setEsito(false);
      wsdmListaAccountEmailRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_listaAccountEmail)", w);
    } catch (NamingException e) {
      wsdmListaAccountEmailRes.setEsito(false);
      wsdmListaAccountEmailRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_listaAccountEmail)", e);
    } catch (Throwable t) {
      wsdmListaAccountEmailRes.setEsito(false);
      wsdmListaAccountEmailRes.setMessaggio(t.getMessage());
      logger.error("Errore (_listaAccountEmail)", t);
    }

    return wsdmListaAccountEmailRes;
  }
}
