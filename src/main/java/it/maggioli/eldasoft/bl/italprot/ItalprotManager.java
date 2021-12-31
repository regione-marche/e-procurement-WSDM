package it.maggioli.eldasoft.bl.italprot;

import it.italprot.prowsprotocollo.AllegatoPrecaricato;
import it.italprot.prowsprotocollo.DatiProtocollo;
import it.italprot.prowsprotocollo.Firmatario;
import it.italprot.prowsprotocollo.MittenteDestinatario;
import it.italprot.prowsprotocollo.ProWsProtocolloLocator;
import it.italprot.prowsprotocollo.ProWsProtocolloPortType;
import it.italprot.prowsprotocollo.holders.AllegatoPrecaricatoHolder;
import it.italprot.prowsprotocollo.holders.MessageResultHolder;
import it.italprot.prowsprotocollo.holders.StatoNotificaHolder;
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

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

import javax.naming.InitialContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.axis.encoding.Base64;
import org.apache.log4j.Logger;
import org.xml.sax.InputSource;
import org.xml.sax.SAXParseException;

public class ItalprotManager implements IWSDMManager {

  static Logger         logger                                     = Logger.getLogger(ItalprotManager.class);

  static private String ITALPROT_PROWSPROTOCOLLO                   = "java:comp/env/ITALPROT_PROWSPROTOCOLLO";
  static private String ITALPROT_PROWSPROTOCOLLO_NOT_DEFINED       = "ITALPROT: l'indirizzo del servizio di protocollo non e' definito";

  static private String ITALPROT_CODICEENTE                        = "java:comp/env/ITALPROT_CODICEENTE";
  static private String ITALPROT_CODICEENTE_NOT_DEFINED            = "ITALPROT: il codice dell'ente (domainCode) non e' definito";

  static private String ITALPROT_PARTENZA_CODICE_UFFICIO_OPERATORE = "java:comp/env/ITALPROT_PARTENZA_CODICE_UFFICIO_OPERATORE";
  static private String ITALPROT_ARRIVO_CODICE_UFFICIO_OPERATORE   = "java:comp/env/ITALPROT_ARRIVO_CODICE_UFFICIO_OPERATORE";
  static private String ITALPROT_INTERNO_CODICE_UFFICIO_OPERATORE  = "java:comp/env/ITALPROT_INTERNO_CODICE_UFFICIO_OPERATORE";

  static private String ITALPROT_PARTENZA_CODICE_FIRMATARIO        = "java:comp/env/ITALPROT_PARTENZA_CODICE_FIRMATARIO";
  static private String ITALPROT_ARRIVO_CODICE_FIRMATARIO          = "java:comp/env/ITALPROT_ARRIVO_CODICE_FIRMATARIO";
  static private String ITALPROT_INTERNO_CODICE_FIRMATARIO         = "java:comp/env/ITALPROT_INTERNO_CODICE_FIRMATARIO";

  static private String ITALPROT_PARTENZA_UFFICIO_FIRMATARIO       = "java:comp/env/ITALPROT_PARTENZA_UFFICIO_FIRMATARIO";
  static private String ITALPROT_ARRIVO_UFFICIO_FIRMATARIO         = "java:comp/env/ITALPROT_ARRIVO_UFFICIO_FIRMATARIO";
  static private String ITALPROT_INTERNO_UFFICIO_FIRMATARIO        = "java:comp/env/ITALPROT_INTERNO_UFFICIO_FIRMATARIO";

  static private String PROTOCOLLO_ARRIVO                          = "A";
  static private String PROTOCOLLO_PARTENZA                        = "P";
  static private String PROTOCOLLO_INTERNO                         = "C";

  static private String TIPO_RISULTATO_INFO                        = "INFO";
  static private String TIPO_RISULTATO_WARNING                     = "WARNING";

  static private String TIPO_FILE_PRINCIPALE                       = "PRINCIPALE";
  static private String TIPO_FILE_ALLEGATO                         = "ALLEGATO";

  static private String MAIL_INVIATA_CORRETTAMENTE                 = "1";

  static private String ALLEGATI_MARCA_DOCUMENTO                   = "0";
  static private String ALLEGATI_METTI_ALLA_FIRMA                  = "0";

  /**
   * Ottiene il riferimento al servizio di protocollo.
   * 
   * @param username
   * @param password
   * @return
   * @throws Exception
   */
  private ProWsProtocolloPortType _getProWsProtocolloPort() throws Exception {
    String url = InitialContext.doLookup(ITALPROT_PROWSPROTOCOLLO);
    if (url == null || (url != null && "".equals(url.trim()))) {
      throw new Exception(ITALPROT_PROWSPROTOCOLLO_NOT_DEFINED);
    }
    ProWsProtocolloLocator proWsProtocolloLocator = new ProWsProtocolloLocator();
    ProWsProtocolloPortType proWsProtocolloPort = proWsProtocolloLocator.getproWsProtocolloPort(new URL(url));
    return proWsProtocolloPort;
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

    StringBuffer messaggioCtr = new StringBuffer();

    if (ItalprotUtilityControllo.ctrProtocolloInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {
      _italprotProtocolloDocumentoInserisci(username, password, wsdmprotocolloDocumentoIn, wsdmprotocolloDocumentoRes);
    } else {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
    }

    return wsdmprotocolloDocumentoRes;
  }

  /**
   * Protocollazione, e' utilizzata per tutti i versi di protocollazione (A,P o
   * C).
   * 
   * @param username
   * @param password
   * @param wsdmprotocolloDocumentoIn
   * @param wsdmprotocolloDocumentoRes
   */
  private void _italprotProtocolloDocumentoInserisci(String username, String password, WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn,
      WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes) {
    String token = null;
    String codiceente = null;

    try {
      codiceente = InitialContext.doLookup(ITALPROT_CODICEENTE);
      if (codiceente == null || (codiceente != null && "".equals(codiceente.trim()))) {
        throw new Exception(ITALPROT_CODICEENTE_NOT_DEFINED);
      }

      ProWsProtocolloPortType proWsProtocolloPort = _getProWsProtocolloPort();

      // Lettura del token
      token = proWsProtocolloPort.getItaEngineContextToken(username, password, codiceente);

      // Dati del protocollo
      DatiProtocollo datiProtocollo = new DatiProtocollo();
      StringBuffer xmlDatiProtocollo = new StringBuffer();
      xmlDatiProtocollo.append("<datiProtocollo>");

      // Tipo di protocollo, ufficio operatore, codice ed ufficio firmatario
      // Sono tutti valori fissi configurati nel file "context.xml".
      // Dipendono esclusivamente dall'utenza di accesso ai servizi.
      String tipoProtocollo = null;
      String ufficioOperatore = null;
      String codiceFirmatario = null;
      String ufficioFirmatario = null;

      if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
        tipoProtocollo = PROTOCOLLO_ARRIVO;
        ufficioOperatore = InitialContext.doLookup(ITALPROT_ARRIVO_CODICE_UFFICIO_OPERATORE);
        codiceFirmatario = InitialContext.doLookup(ITALPROT_ARRIVO_CODICE_FIRMATARIO);
        ufficioFirmatario = InitialContext.doLookup(ITALPROT_ARRIVO_UFFICIO_FIRMATARIO);
      } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
        tipoProtocollo = PROTOCOLLO_PARTENZA;
        ufficioOperatore = InitialContext.doLookup(ITALPROT_PARTENZA_CODICE_UFFICIO_OPERATORE);
        codiceFirmatario = InitialContext.doLookup(ITALPROT_PARTENZA_CODICE_FIRMATARIO);
        ufficioFirmatario = InitialContext.doLookup(ITALPROT_PARTENZA_UFFICIO_FIRMATARIO);
      } else if (WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
        tipoProtocollo = PROTOCOLLO_INTERNO;
        ufficioOperatore = InitialContext.doLookup(ITALPROT_INTERNO_CODICE_UFFICIO_OPERATORE);
        codiceFirmatario = InitialContext.doLookup(ITALPROT_INTERNO_CODICE_FIRMATARIO);
        ufficioFirmatario = InitialContext.doLookup(ITALPROT_INTERNO_UFFICIO_FIRMATARIO);
      }

      // Tipo protocollo (A,P,C)
      datiProtocollo.setTipoProtocollo(tipoProtocollo);
      xmlDatiProtocollo.append("<tipoProtocollo>" + tipoProtocollo + "</tipoProtocollo>");
      // Codice ufficio dell'operatore
      datiProtocollo.setUfficioOperatore(ufficioOperatore);
      xmlDatiProtocollo.append("<ufficioOperatore>" + ufficioOperatore + "</ufficioOperatore>");

      // Firmatari, si carica un solo firmatario
      Firmatario[] firmatari = new Firmatario[1];
      firmatari[0] = new Firmatario();
      firmatari[0].setCodice(codiceFirmatario);
      firmatari[0].setUfficio(ufficioFirmatario);
      datiProtocollo.setFirmatari(firmatari);

      xmlDatiProtocollo.append("<firmatari>");
      xmlDatiProtocollo.append("<firmatario>");
      xmlDatiProtocollo.append("<codice>" + codiceFirmatario + "</codice>");
      xmlDatiProtocollo.append("<ufficio>" + ufficioFirmatario + "</ufficio>");
      xmlDatiProtocollo.append("</firmatario></firmatari>");

      // Oggetto del protocollo
      if (wsdmprotocolloDocumentoIn.getOggetto() != null) {
        datiProtocollo.setOggetto(wsdmprotocolloDocumentoIn.getOggetto());
        xmlDatiProtocollo.append("<oggetto>" + conversioneCaratteriXML(wsdmprotocolloDocumentoIn.getOggetto()) + "</oggetto>");
      }

      // Tipo documento
      if (wsdmprotocolloDocumentoIn.getTipoDocumento() != null) {
        datiProtocollo.setTipoDocumento(wsdmprotocolloDocumentoIn.getTipoDocumento());
        xmlDatiProtocollo.append("<tipoDocumento>" + conversioneCaratteriXML(wsdmprotocolloDocumentoIn.getTipoDocumento()) + "</tipoDocumento>");
      }

      if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {

        // Mittenti, solo per protocollo in arrivo/ingresso
        if (wsdmprotocolloDocumentoIn.getMittenti() != null) {

          WSDMProtocolloAnagrafica[] wsdmMittenti = wsdmprotocolloDocumentoIn.getMittenti();
          MittenteDestinatario[] mittenti = new MittenteDestinatario[wsdmMittenti.length];

          xmlDatiProtocollo.append("<mittenti>");

          for (int m = 0; m < wsdmMittenti.length; m++) {
            mittenti[m] = new MittenteDestinatario();
            // Denominazione (eventuale composizione con il nome)

            xmlDatiProtocollo.append("<mittenteDestinatario>");

            String denominazione = wsdmMittenti[m].getCognomeointestazione();
            if (wsdmMittenti[m].getNome() != null && !"".equals(wsdmMittenti[m].getNome())) {
              denominazione += " " + wsdmMittenti[m].getNome();
            }
            mittenti[m].setDenominazione(denominazione);
            xmlDatiProtocollo.append("<denominazione>" + conversioneCaratteriXML(denominazione) + "</denominazione>");

            // Indirizzo
            String indirizzo = wsdmMittenti[m].getIndirizzoResidenza();
            if (wsdmMittenti[m].getLocalitaResidenza() != null) {
              indirizzo += " " + wsdmMittenti[m].getLocalitaResidenza();
            }

            if (indirizzo != null) {
              mittenti[m].setIndirizzo(indirizzo);
              xmlDatiProtocollo.append("<indirizzo>" + conversioneCaratteriXML(indirizzo) + "</indirizzo>");
            }

            // CAP
            if (wsdmMittenti[m].getCapResidenza() != null) {
              mittenti[m].setCap(wsdmMittenti[m].getCapResidenza());
              xmlDatiProtocollo.append("<cap>" + conversioneCaratteriXML(wsdmMittenti[m].getCapResidenza()) + "</cap>");
            }

            // Citta'
            if (wsdmMittenti[m].getComuneResidenza() != null) {
              mittenti[m].setCitta(wsdmMittenti[m].getComuneResidenza());
              xmlDatiProtocollo.append("<citta>" + conversioneCaratteriXML(wsdmMittenti[m].getComuneResidenza()) + "</citta>");
            }

            // Provincia
            if (wsdmMittenti[m].getProvinciaResidenza() != null) {
              mittenti[m].setProv(wsdmMittenti[m].getProvinciaResidenza());
              xmlDatiProtocollo.append("<prov>" + conversioneCaratteriXML(wsdmMittenti[m].getProvinciaResidenza()) + "</prov>");
            }

            // Indirizzo email
            if (wsdmMittenti[m].getEmail() != null) {
              mittenti[m].setEmail(wsdmMittenti[m].getEmail());
              xmlDatiProtocollo.append("<email>" + conversioneCaratteriXML(wsdmMittenti[m].getProvinciaResidenza()) + "</email>");
            }

            // Codice fiscale
            if (wsdmMittenti[m].getCodiceFiscale() != null) {
              mittenti[m].setCodiceFiscale(wsdmMittenti[m].getCodiceFiscale());
              xmlDatiProtocollo.append("<codiceFiscale>" + conversioneCaratteriXML(wsdmMittenti[m].getCodiceFiscale()) + "</codiceFiscale>");
            }

            xmlDatiProtocollo.append("</mittenteDestinatario>");
          }

          datiProtocollo.setMittenti(mittenti);
          xmlDatiProtocollo.append("</mittenti>");

          // Destinatari vuoti (nel formato la lista dei destinatari e'
          // obbligatoria)
          MittenteDestinatario[] destinatari = new MittenteDestinatario[1];
          destinatari[0] = new MittenteDestinatario();
          destinatari[0].setDenominazione("");
          datiProtocollo.setDestinatari(destinatari);
        }

      } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {

        // Destinatari, solo per protocollo in partenza/uscita
        if (wsdmprotocolloDocumentoIn.getDestinatari() != null) {

          WSDMProtocolloAnagrafica[] wsdmDestinatari = wsdmprotocolloDocumentoIn.getDestinatari();
          MittenteDestinatario[] destinatari = new MittenteDestinatario[wsdmDestinatari.length];

          xmlDatiProtocollo.append("<destinatari>");

          for (int d = 0; d < wsdmDestinatari.length; d++) {
            destinatari[d] = new MittenteDestinatario();
            // Denominazione (eventuale composizione con il nome)

            xmlDatiProtocollo.append("<mittenteDestinatario>");

            String denominazione = wsdmDestinatari[d].getCognomeointestazione();
            if (wsdmDestinatari[d].getNome() != null && !"".equals(wsdmDestinatari[d].getNome())) {
              denominazione += " " + wsdmDestinatari[d].getNome();
            }
            destinatari[d].setDenominazione(denominazione);
            xmlDatiProtocollo.append("<denominazione>" + conversioneCaratteriXML(denominazione) + "</denominazione>");

            // Indirizzo
            String indirizzo = wsdmDestinatari[d].getIndirizzoResidenza();
            if (wsdmDestinatari[d].getLocalitaResidenza() != null) {
              indirizzo += " " + wsdmDestinatari[d].getLocalitaResidenza();
            }

            if (indirizzo != null) {
              destinatari[d].setIndirizzo(indirizzo);
              xmlDatiProtocollo.append("<indirizzo>" + conversioneCaratteriXML(indirizzo) + "</indirizzo>");
            }

            // CAP
            if (wsdmDestinatari[d].getCapResidenza() != null) {
              destinatari[d].setCap(wsdmDestinatari[d].getCapResidenza());
              xmlDatiProtocollo.append("<cap>" + conversioneCaratteriXML(wsdmDestinatari[d].getCapResidenza()) + "</cap>");
            }

            // Citta'
            if (wsdmDestinatari[d].getComuneResidenza() != null) {
              destinatari[d].setCitta(wsdmDestinatari[d].getComuneResidenza());
              xmlDatiProtocollo.append("<citta>" + conversioneCaratteriXML(wsdmDestinatari[d].getComuneResidenza()) + "</citta>");
            }

            // Provincia
            if (wsdmDestinatari[d].getProvinciaResidenza() != null) {
              destinatari[d].setProv(wsdmDestinatari[d].getProvinciaResidenza());
              xmlDatiProtocollo.append("<prov>" + conversioneCaratteriXML(wsdmDestinatari[d].getProvinciaResidenza()) + "</prov>");
            }

            // Indirizzo email
            if (wsdmDestinatari[d].getEmail() != null) {
              destinatari[d].setEmail(wsdmDestinatari[d].getEmail());
              xmlDatiProtocollo.append("<email>" + conversioneCaratteriXML(wsdmDestinatari[d].getEmail()) + "</email>");
            }

            // Codice fiscale
            if (wsdmDestinatari[d].getCodiceFiscale() != null) {
              destinatari[d].setCodiceFiscale(wsdmDestinatari[d].getCodiceFiscale());
              xmlDatiProtocollo.append("<codiceFiscale>" + conversioneCaratteriXML(wsdmDestinatari[d].getCodiceFiscale()) + "</codiceFiscale>");
            }

            xmlDatiProtocollo.append("</mittenteDestinatario>");

          }

          datiProtocollo.setDestinatari(destinatari);
          xmlDatiProtocollo.append("</destinatari>");

          // Mittenti vuoti (nel formato la lista dei mittenti e' obbligatoria)
          MittenteDestinatario[] mittenti = new MittenteDestinatario[1];
          mittenti[0] = new MittenteDestinatario();
          mittenti[0].setDenominazione("");
          datiProtocollo.setMittenti(mittenti);
        }

      } else if (WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {

        // Mittenti vuoti (nel formato la lista dei mittenti e' obbligatoria)
        MittenteDestinatario[] mittenti = new MittenteDestinatario[1];
        mittenti[0] = new MittenteDestinatario();
        mittenti[0].setDenominazione("");
        datiProtocollo.setMittenti(mittenti);

        // Destinatari vuoti (nel formato la lista dei destinatari e'
        // obbligatoria)
        MittenteDestinatario[] destinatari = new MittenteDestinatario[1];
        destinatari[0] = new MittenteDestinatario();
        destinatari[0].setDenominazione("");
        datiProtocollo.setDestinatari(destinatari);

      }

      // Classificazione
      if (wsdmprotocolloDocumentoIn.getClassifica() != null) {
        datiProtocollo.setClassificazione(wsdmprotocolloDocumentoIn.getClassifica());
        xmlDatiProtocollo.append("<classificazione>" + wsdmprotocolloDocumentoIn.getClassifica() + "</classificazione>");
      }

      // Gestione degli allegati
      if (wsdmprotocolloDocumentoIn.getAllegati() != null) {
        WSDMProtocolloAllegato[] wsdmAllegati = wsdmprotocolloDocumentoIn.getAllegati();
        AllegatoPrecaricato[] allegatiPrecaricati = new AllegatoPrecaricato[wsdmAllegati.length];

        xmlDatiProtocollo.append("<allegatiPrecaricati>");
        _italprotInserimentoAllegati(token, proWsProtocolloPort, wsdmAllegati, allegatiPrecaricati, xmlDatiProtocollo);
        xmlDatiProtocollo.append("</allegatiPrecaricati>");
        datiProtocollo.setAllegatiPrecaricati(allegatiPrecaricati);
      }

      xmlDatiProtocollo.append("</datiProtocollo>");

      // Invio della richiesta
      String responseString = "";
      String outputString = "";
      String wsURL = InitialContext.doLookup(ITALPROT_PROWSPROTOCOLLO);
      URL url = new URL(wsURL);
      URLConnection connection = url.openConnection();
      HttpURLConnection httpConn = (HttpURLConnection) connection;
      ByteArrayOutputStream bout = new ByteArrayOutputStream();

      // Composizione della stringa completa
      String xmlInput = " <soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soapenc=\"http://schemas.xmlsoap.org/soap/encoding/\">\n"
          + " <soapenv:Header/>\n"
          + " <soapenv:Body>\n"
          + " <PutProtocollo>\n"
          + " <token>"
          + token
          + "</token>\n"
          + xmlDatiProtocollo
          + "\n"
          + " </PutProtocollo>\n"
          + " </soapenv:Body>\n"
          + " </soapenv:Envelope>";

      logger.debug("Messaggio XML di richiesta: " + xmlInput);

      byte[] buffer = new byte[xmlInput.length()];
      buffer = xmlInput.getBytes("UTF-8");
      bout.write(buffer);
      byte[] b = bout.toByteArray();

      // Controllo per togliere l'ultima barra, se ce ne dovessero essere due il
      // sistema avrebbe problemi
      if ("/".equals(wsURL.substring(wsURL.length() - 1))) {
        wsURL = wsURL.substring(0, wsURL.length() - 1);
      }
      String SOAPAction = wsURL + "/PutProtocollo";

      // Parametri HTTP
      httpConn.setRequestProperty("Content-Length", String.valueOf(b.length));
      httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
      httpConn.setRequestProperty("SOAPAction", SOAPAction);
      httpConn.setRequestMethod("POST");
      httpConn.setDoOutput(true);
      httpConn.setDoInput(true);
      OutputStream out = httpConn.getOutputStream();
      out.write(b);
      out.close();

      // Risposta
      InputStreamReader isr = new InputStreamReader(httpConn.getInputStream());
      BufferedReader in = new BufferedReader(isr);

      while ((responseString = in.readLine()) != null) {
        outputString = outputString + responseString;
      }

      logger.debug("Messaggio XML di risposta: " + outputString);

      // Lettura della risposta
      DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
      InputSource src = new InputSource();
      src.setCharacterStream(new StringReader(outputString));
      org.w3c.dom.Document doc = builder.parse(src);

      if (doc != null) {
        // Messaggio ed errore
        String descrizioneResult = "";
        String tipoRisultatoResult = "";
        if (doc.getElementsByTagName("descrizione") != null && doc.getElementsByTagName("descrizione").item(0) != null) {
          descrizioneResult = doc.getElementsByTagName("descrizione").item(0).getTextContent();
        }
        if (doc.getElementsByTagName("tipoRisultato") != null && doc.getElementsByTagName("tipoRisultato").item(0) != null) {
          tipoRisultatoResult = doc.getElementsByTagName("tipoRisultato").item(0).getTextContent();
        }

        // Lettura risultato della protocollazione
        String rowidProtocolloResult = "";
        String annoProtocolloResult = "";
        String numeroProtocolloResult = "";

        if (doc.getElementsByTagName("rowidProtocollo") != null && doc.getElementsByTagName("rowidProtocollo").item(0) != null) {
          rowidProtocolloResult = doc.getElementsByTagName("rowidProtocollo").item(0).getTextContent();
        }
        if (doc.getElementsByTagName("annoProtocollo") != null && doc.getElementsByTagName("annoProtocollo").item(0) != null) {
          annoProtocolloResult = doc.getElementsByTagName("annoProtocollo").item(0).getTextContent();
        }
        if (doc.getElementsByTagName("numeroProtocollo") != null && doc.getElementsByTagName("numeroProtocollo").item(0) != null) {
          numeroProtocolloResult = doc.getElementsByTagName("numeroProtocollo").item(0).getTextContent();
        }

        // Invio dei dati al protocollo
        // RetProtocolloHolder retProtocolloHolder = new RetProtocolloHolder();
        // MessageResultHolder messageResultHolderProtocollo = new
        // MessageResultHolder();
        // proWsProtocolloPort.putProtocollo(token, datiProtocollo,
        // retProtocolloHolder, messageResultHolderProtocollo);

        // Lettura della risposta all'operazione di inserimento in protocollo
        // String tipoRisultato =
        // messageResultHolderProtocollo.value.getTipoRisultato().toUpperCase();
        if (TIPO_RISULTATO_INFO.equals(tipoRisultatoResult.toUpperCase())
            || TIPO_RISULTATO_WARNING.equals(tipoRisultatoResult.toUpperCase())) {
          wsdmprotocolloDocumentoRes.setEsito(true);
          WSDMProtocolloDocumento wsdmProtocolloDocumento = new WSDMProtocolloDocumento();
          wsdmProtocolloDocumento.setNumeroDocumento(rowidProtocolloResult);
          wsdmProtocolloDocumento.setAnnoProtocollo(new Long(annoProtocolloResult));
          wsdmProtocolloDocumento.setNumeroProtocollo(numeroProtocolloResult);
          wsdmProtocolloDocumento.setInout(wsdmprotocolloDocumentoIn.getInout());
          Calendar dataProtocolloToday = Calendar.getInstance();
          wsdmProtocolloDocumento.setDataProtocollo(dataProtocolloToday.getTime());

          wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmProtocolloDocumento);

        } else {
          wsdmprotocolloDocumentoRes.setEsito(false);
          wsdmprotocolloDocumentoRes.setMessaggio(descrizioneResult);
        }
      } else {
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio("Sono stati riscontrati problemi nell'interpretazione della risposta: " + outputString);
      }
    } catch (Exception e) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(e.getMessage());
      Throwable cause = e.getCause();
      if (cause instanceof SAXParseException) {
        wsdmprotocolloDocumentoRes.setMessaggio("La richiesta al servizio non restituisce alcun contenuto. Verificare la correttezza del codice dell'ente (domainCode) ["
            + e.getMessage()
            + "]");
      }
      logger.error("Errore (_italprotProtocolloDocumentoInserisci)", e);
    } finally {
      try {
        // Annullamento del token
        ProWsProtocolloPortType proWsProtocolloPort = _getProWsProtocolloPort();
        proWsProtocolloPort.destroyItaEngineContextToken(token, codiceente);
      } catch (Exception e) {

      }
    }
  }

  /**
   * Gestione del precaricamento dei file principale ed allegati.
   * 
   * @param token
   * @param proWsProtocolloPort
   * @param wsdmAllegati
   * @param allegatiPrecaricati
   * @throws RemoteException
   */
  private void _italprotInserimentoAllegati(String token, ProWsProtocolloPortType proWsProtocolloPort,
      WSDMProtocolloAllegato[] wsdmAllegati, AllegatoPrecaricato[] allegatiPrecaricati, StringBuffer xmlDatiProtocollo)
      throws RemoteException {

    for (int a = 0; a < wsdmAllegati.length; a++) {

      allegatiPrecaricati[a] = new AllegatoPrecaricato();

      // Nome del file comprensivo di estensione
      String nomeFile = wsdmAllegati[a].getNome();

      // Stream dei dati codificato in base64
      String stream = Base64.encode(wsdmAllegati[a].getContenuto());

      // Tipo di file (PRINCIPALE se l'allegato e' il primo della lista,
      // ALLEGATO per tutti gli altri)
      String tipoFile = null;
      if (a == 0) {
        tipoFile = TIPO_FILE_PRINCIPALE;
      } else {
        tipoFile = TIPO_FILE_ALLEGATO;
      }

      // Estensione
      String estensione = wsdmAllegati[a].getTipo();

      // Titolo
      String titolo = wsdmAllegati[a].getTitolo();

      // Invio dei dati
      AllegatoPrecaricatoHolder allegatoPrecaricatoHolder = new AllegatoPrecaricatoHolder();
      MessageResultHolder messageResultHolderAllegato = new MessageResultHolder();
      proWsProtocolloPort.insertDocumento(token, nomeFile, stream, allegatoPrecaricatoHolder, messageResultHolderAllegato);

      // Lettura della risposta
      String tipoRisultato = messageResultHolderAllegato.value.getTipoRisultato().toUpperCase();
      if (TIPO_RISULTATO_INFO.equals(tipoRisultato) || TIPO_RISULTATO_WARNING.equals(tipoRisultato)) {
        String idunivoco = allegatoPrecaricatoHolder.value.getIdunivoco();
        String hashfile = allegatoPrecaricatoHolder.value.getHashfile();

        xmlDatiProtocollo.append("<allegatoPrecaricato>");
        allegatiPrecaricati[a].setIdunivoco(idunivoco);
        xmlDatiProtocollo.append("<idunivoco>" + idunivoco + "</idunivoco>");

        allegatiPrecaricati[a].setHashfile(hashfile);
        xmlDatiProtocollo.append("<hashfile>" + hashfile + "</hashfile>");

        allegatiPrecaricati[a].setNomeFile(nomeFile);
        xmlDatiProtocollo.append("<nomeFile>" + conversioneCaratteriXML(nomeFile) + "</nomeFile>");

        allegatiPrecaricati[a].setTipoFile(tipoFile);
        xmlDatiProtocollo.append("<tipoFile>" + conversioneCaratteriXML(tipoFile) + "</tipoFile>");

        allegatiPrecaricati[a].setEstensione(estensione);
        xmlDatiProtocollo.append("<estensione>" + estensione + "</estensione>");

        allegatiPrecaricati[a].setNote(titolo);
        allegatiPrecaricati[a].setMarcaDocumento(ALLEGATI_MARCA_DOCUMENTO);
        allegatiPrecaricati[a].setMettiAllaFirma(ALLEGATI_METTI_ALLA_FIRMA);

        xmlDatiProtocollo.append("</allegatoPrecaricato>");
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

    StringBuffer messaggioCtr = new StringBuffer();

    if (ItalprotUtilityControllo.ctrDocumentoInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {
      _italprotProtocolloDocumentoInserisci(username, password, wsdmprotocolloDocumentoIn, wsdmprotocolloDocumentoRes);
    } else {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
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

    StringBuffer messaggioCtr = new StringBuffer();
    String token = null;
    String codiceente = null;

    if (ItalprotUtilityControllo.ctrInviaMail(loginAttr, wsdmInviaMail, messaggioCtr)) {

      try {
        codiceente = InitialContext.doLookup(ITALPROT_CODICEENTE);
        if (codiceente == null || (codiceente != null && "".equals(codiceente.trim()))) {
          throw new Exception(ITALPROT_CODICEENTE_NOT_DEFINED);
        }

        ProWsProtocolloPortType proWsProtocolloPort = _getProWsProtocolloPort();

        // Lettura del token
        token = proWsProtocolloPort.getItaEngineContextToken(username, password, codiceente);

        String anno = wsdmInviaMail.getAnnoProtocollo().toString();
        String numero = wsdmInviaMail.getNumeroProtocollo();
        String tipoProtocollo = PROTOCOLLO_PARTENZA;
        String oggetto = wsdmInviaMail.getOggettoMail();
        String testo = Base64.encode(wsdmInviaMail.getTestoMail().getBytes());

        // Invio dei dati per la richiesta di inoltro email
        StatoNotificaHolder statoNotificaHolder = new StatoNotificaHolder();
        MessageResultHolder messageResultHolder = new MessageResultHolder();
        proWsProtocolloPort.notificaMailProtocollo(token, anno, numero, tipoProtocollo, oggetto, testo, statoNotificaHolder,
            messageResultHolder);

        // Lettura della risposta
        String tipoRisultato = messageResultHolder.value.getTipoRisultato().toUpperCase();
        if (TIPO_RISULTATO_INFO.equals(tipoRisultato) || TIPO_RISULTATO_WARNING.equals(tipoRisultato)) {
          // Esiti
          // 0 Errore in invio
          // 1 Inviato Correttamente
          // 2 Nessun destinatario a cui inviare la notifica
          if (MAIL_INVIATA_CORRETTAMENTE.equals(statoNotificaHolder.value.getStato())) {
            wsdmInviaMailRes.setEsito(true);
          } else {
            wsdmInviaMailRes.setEsito(false);
          }
        } else {
          wsdmInviaMailRes.setEsito(false);

        }
        wsdmInviaMailRes.setMessaggio(messageResultHolder.value.getDescrizione());

      } catch (Exception e) {
        wsdmInviaMailRes.setEsito(false);
        wsdmInviaMailRes.setMessaggio(e.getMessage());
        logger.error("Errore (_italprotProtocolloDocumentoInserisci)", e);
      } finally {
        try {
          // Annullamento del token
          ProWsProtocolloPortType proWsProtocolloPort = _getProWsProtocolloPort();
          proWsProtocolloPort.destroyItaEngineContextToken(token, codiceente);
        } catch (Exception e) {

        }
      }
    } else {
      wsdmInviaMailRes.setEsito(false);
      wsdmInviaMailRes.setMessaggio(messaggioCtr.toString());
    }
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
  public WSDMListaAccountEmailRes _listaAccountEmail(String username, String password, WSDMLoginAttr loginAttr, WSDMRicercaAccountEmail ricercaAccountEmail) {
    WSDMListaAccountEmailRes wsdmListaAccountEmailRes = new WSDMListaAccountEmailRes();
    wsdmListaAccountEmailRes.setEsito(false);
    wsdmListaAccountEmailRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmListaAccountEmailRes;
  }
  
}
