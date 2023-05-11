package it.maggioli.eldasoft.bl.italprot;

import it.italprot.prowsfascicolo.ProWsFascicoloLocator;
import it.italprot.prowsfascicolo.ProWsFascicoloPortType;
import it.italprot.prowsfascicolo.holders.RetFascicoloHolder;
import it.italprot.prowsprotocollo.Allegato;
import it.italprot.prowsprotocollo.AllegatoPrecaricato;
import it.italprot.prowsprotocollo.DatiProtocollo;
import it.italprot.prowsprotocollo.Firmatario;
import it.italprot.prowsprotocollo.ItemEsitoFirma;
import it.italprot.prowsprotocollo.ItemProtocollo;
import it.italprot.prowsprotocollo.MittenteDestinatario;
import it.italprot.prowsprotocollo.ProWsProtocolloLocator;
import it.italprot.prowsprotocollo.ProWsProtocolloPortType;
import it.italprot.prowsprotocollo.holders.AllegatoHolder;
import it.italprot.prowsprotocollo.holders.AllegatoPrecaricatoHolder;
import it.italprot.prowsprotocollo.holders.ItemEsitoFirmaHolder;
import it.italprot.prowsprotocollo.holders.ItemProtocolloHolder;
import it.italprot.prowsprotocollo.holders.MessageResultHolder;
import it.italprot.prowsprotocollo.holders.StatoNotificaHolder;
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

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

import javax.naming.InitialContext;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

import org.apache.axis.encoding.Base64;
import org.apache.log4j.Logger;
import org.apache.ws.security.WSSecurityException;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXParseException;

public class ItalprotManager implements IWSDMManager {

  static Logger         logger                                     = Logger.getLogger(ItalprotManager.class);

  static private String ITALPROT_PROWSPROTOCOLLO                   = "java:comp/env/ITALPROT_PROWSPROTOCOLLO";
  static private String ITALPROT_PROWSPROTOCOLLO_NOT_DEFINED       = "ITALPROT: l'indirizzo del servizio protocollo non e' definito";

  static private String ITALPROT_PROWSFASCICOLO                    = "java:comp/env/ITALPROT_PROWSFASCICOLO";
  static private String ITALPROT_PROWSFASCICOLO_NOT_DEFINED        = "ITALPROT: l'indirizzo del servizio fascicolo non e' definito";

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
  
  // 15/11/2022 - WSDM-121
  // Annullare la modifica fatta nella ISSUE WSDM-104
  // Nella chiamata PutDocumentoAllaFirma il tag <tipoProtocollo> deve essere riportato a P (e non a C).
  static private String PROTOCOLLO_PUT_ALLA_FIRMA                  = "P";

  static private String TIPO_RISULTATO_INFO                        = "INFO";
  static private String TIPO_RISULTATO_WARNING                     = "WARNING";

  static private String TIPO_FILE_PRINCIPALE                       = "PRINCIPALE";
  static private String TIPO_FILE_ALLEGATO                         = "ALLEGATO";

  static private String MAIL_INVIATA_CORRETTAMENTE                 = "1";

  static private String ALLEGATI_MARCA_DOCUMENTO                   = "0";

  static private String FIRMA_ALLEGATI_SI                          = "1";
  static private String FIRMA_ALLEGATI_NO                          = "0";

  static private String RICERCA_FASCICOLO_NO                       = "Nessun fascicolo trovato";

  static private String ESITO_FIRMA_OK                             = "OK";

  /**
   * Ottiene il riferimento al servizio di protocollo.
   * 
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

  /**
   * Ottiene il riferimento al servizio fascicolo.
   * 
   * @return
   * @throws Exception
   */
  private ProWsFascicoloPortType _getProWsFascicoloPort() throws Exception {
    String url = InitialContext.doLookup(ITALPROT_PROWSFASCICOLO);
    if (url == null || (url != null && "".equals(url.trim()))) {
      throw new Exception(ITALPROT_PROWSFASCICOLO_NOT_DEFINED);
    }
    ProWsFascicoloLocator proWsFascicoloLocator = new ProWsFascicoloLocator();
    ProWsFascicoloPortType proWsFascicoloPort = proWsFascicoloLocator.getproWsFascicoloPort(new URL(url));
    return proWsFascicoloPort;
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
        xmlDatiProtocollo.append("<tipoDocumento>"
            + conversioneCaratteriXML(wsdmprotocolloDocumentoIn.getTipoDocumento())
            + "</tipoDocumento>");
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
              xmlDatiProtocollo.append("<email>" + conversioneCaratteriXML(wsdmMittenti[m].getEmail()) + "</email>");
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
              xmlDatiProtocollo.append("<codiceFiscale>"
                  + conversioneCaratteriXML(wsdmDestinatari[d].getCodiceFiscale())
                  + "</codiceFiscale>");
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
        _italprotInserimentoAllegati(token, proWsProtocolloPort, wsdmAllegati, allegatiPrecaricati, xmlDatiProtocollo, false);
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

          // Eventuale inserimento in fascicolo
          _italprotAssociaProtocolloAlFascicolo(username, password, wsdmprotocolloDocumentoIn, wsdmprotocolloDocumentoRes, token,
              codiceente, annoProtocolloResult, numeroProtocolloResult, tipoProtocollo);

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
   * Inserimento richiesta di firma.
   * 
   * @param username
   * @param password
   * @param wsdmprotocolloDocumentoIn
   * @param wsdmprotocolloDocumentoRes
   */
  private void _italprotFirmaInserisci(String username, String password, WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn,
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
      StringBuffer xmlDatiProtocollo = new StringBuffer();
      xmlDatiProtocollo.append("<datiDocumento>");

      // Tipo di protocollo, ufficio operatore, codice ed ufficio firmatario
      // Sono tutti valori fissi configurati nel file "context.xml".
      // Dipendono esclusivamente dall'utenza di accesso ai servizi.
      
      // 29/03/2022 - WSDM-104
      // Per un cambio di specifiche, il cliente richiede una modifica al campo
      // <tipoProtocollo>. Attualmente WSDM inserisce P (credo sia legato al
      // verso inviato da appalti nel WSDMFirmaInserisci tag
      // <inout>OUT</inout>). Il cliente chiede che nella chiamata
      // PutDocumentoAllaFirma il tag <tipoProtocollo> contenga sempre "C".
      // String tipoProtocollo = PROTOCOLLO_PARTENZA;
      
      // 15/11/2022 - WSDM-121
      // Annullare la modifica fatta nella ISSUE WSDM-104
      // Nella chiamata PutDocumentoAllaFirma il tag <tipoProtocollo> deve essere riportato a P (e non a C).
      String tipoProtocollo = PROTOCOLLO_PUT_ALLA_FIRMA;
      
      String ufficioOperatore = InitialContext.doLookup(ITALPROT_PARTENZA_CODICE_UFFICIO_OPERATORE);
      String codiceFirmatario = wsdmprotocolloDocumentoIn.getGenericS41();
      String ufficioFirmatario = wsdmprotocolloDocumentoIn.getGenericS42();

      // Tipo protocollo (solo P)
      xmlDatiProtocollo.append("<tipoProtocollo>" + tipoProtocollo + "</tipoProtocollo>");
      // Codice ufficio dell'operatore
      xmlDatiProtocollo.append("<ufficioOperatore>" + ufficioOperatore + "</ufficioOperatore>");

      // Firmatari, si carica un solo firmatario
      xmlDatiProtocollo.append("<firmatari>");
      xmlDatiProtocollo.append("<firmatario>");
      xmlDatiProtocollo.append("<codice>" + codiceFirmatario + "</codice>");
      xmlDatiProtocollo.append("<ufficio>" + ufficioFirmatario + "</ufficio>");
      xmlDatiProtocollo.append("</firmatario></firmatari>");

      // Oggetto del protocollo
      if (wsdmprotocolloDocumentoIn.getOggetto() != null) {
        xmlDatiProtocollo.append("<oggetto>" + conversioneCaratteriXML(wsdmprotocolloDocumentoIn.getOggetto()) + "</oggetto>");
      }

      // Tipo documento
      if (wsdmprotocolloDocumentoIn.getTipoDocumento() != null) {
        xmlDatiProtocollo.append("<tipoDocumento>"
            + conversioneCaratteriXML(wsdmprotocolloDocumentoIn.getTipoDocumento())
            + "</tipoDocumento>");
      }

      // Classificazione
      if (wsdmprotocolloDocumentoIn.getClassifica() != null) {
        xmlDatiProtocollo.append("<classificazione>" + wsdmprotocolloDocumentoIn.getClassifica() + "</classificazione>");
      }

      if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {

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
              xmlDatiProtocollo.append("<codiceFiscale>"
                  + conversioneCaratteriXML(wsdmDestinatari[d].getCodiceFiscale())
                  + "</codiceFiscale>");
            }

            xmlDatiProtocollo.append("</mittenteDestinatario>");

          }

          xmlDatiProtocollo.append("</destinatari>");

          // Mittenti vuoti (nel formato la lista dei mittenti e' obbligatoria)
          xmlDatiProtocollo.append("<mittenti>");
          xmlDatiProtocollo.append("<mittenteDestinatario>");
          xmlDatiProtocollo.append("<denominazione></denominazione>");
          xmlDatiProtocollo.append("</mittenteDestinatario>");
          xmlDatiProtocollo.append("</mittenti>");

        }
      }

      // Gestione degli allegati
      if (wsdmprotocolloDocumentoIn.getAllegati() != null) {
        WSDMProtocolloAllegato[] wsdmAllegati = wsdmprotocolloDocumentoIn.getAllegati();
        AllegatoPrecaricato[] allegatiPrecaricati = new AllegatoPrecaricato[wsdmAllegati.length];

        xmlDatiProtocollo.append("<allegatiPrecaricati>");
        _italprotInserimentoAllegati(token, proWsProtocolloPort, wsdmAllegati, allegatiPrecaricati, xmlDatiProtocollo, true);
        xmlDatiProtocollo.append("</allegatiPrecaricati>");
      }

      xmlDatiProtocollo.append("</datiDocumento>");

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
          + " <PutDocumentoAllaFirma>\n"
          + " <token>"
          + token
          + "</token>\n"
          + xmlDatiProtocollo
          + "\n"
          + " </PutDocumentoAllaFirma>\n"
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
      String SOAPAction = wsURL + "/PutDocumentoAllaFirma";

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
        String numeroDocumentoResult = "";

        if (doc.getElementsByTagName("numeroDocumento") != null && doc.getElementsByTagName("numeroDocumento").item(0) != null) {
          numeroDocumentoResult = doc.getElementsByTagName("numeroDocumento").item(0).getTextContent();
        }

        // Invio dei dati al protocollo
        if (TIPO_RISULTATO_INFO.equals(tipoRisultatoResult.toUpperCase())
            || TIPO_RISULTATO_WARNING.equals(tipoRisultatoResult.toUpperCase())) {
          wsdmprotocolloDocumentoRes.setEsito(true);
          WSDMProtocolloDocumento wsdmProtocolloDocumento = new WSDMProtocolloDocumento();
          wsdmProtocolloDocumento.setNumeroDocumento(numeroDocumentoResult);
          wsdmProtocolloDocumento.setInout(wsdmprotocolloDocumentoIn.getInout());

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
   * Associazione del protocollo al fascicolo.
   * 
   * @param username
   * @param password
   * @param wsdmprotocolloDocumentoIn
   * @param wsdmprotocolloDocumentoRes
   * @param token
   * @param codiceente
   * @param tipoProtocollo
   * @param annoProtocolloResult
   * @param numeroProtocolloResult
   */
  private void _italprotAssociaProtocolloAlFascicolo(String username, String password, WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn,
      WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes, String token, String codiceente, String annoProtocollo,
      String numeroProtocollo, String tipoProtocollo) {
    if (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {

      String tokenFascicolo = null;

      try {
        // Client wsFascicolo e lettura del token del fascicolo
        ProWsFascicoloPortType proWsFascicoloPort = _getProWsFascicoloPort();
        tokenFascicolo = proWsFascicoloPort.getItaEngineContextToken(username, password, codiceente);
        String codiceFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getCodiceFascicolo();
        String codiceSottoFascicolo = null;
        RetFascicoloHolder retDatiFascicolo = new RetFascicoloHolder();
        it.italprot.prowsfascicolo.holders.MessageResultHolder messageFascicoloResultHolder = new it.italprot.prowsfascicolo.holders.MessageResultHolder();
        proWsFascicoloPort.fascicolaProtocollo(token, annoProtocollo, numeroProtocollo, tipoProtocollo, codiceFascicolo,
            codiceSottoFascicolo, retDatiFascicolo, messageFascicoloResultHolder);

        String tipoRisultato = messageFascicoloResultHolder.value.getTipoRisultato().toUpperCase();
        if (TIPO_RISULTATO_INFO.equals(tipoRisultato) || TIPO_RISULTATO_WARNING.equals(tipoRisultato)) {
          WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();
          wsdmFascicolo.setCodiceFascicolo(codiceFascicolo);
          wsdmprotocolloDocumentoRes.getProtocolloDocumento().setFascicolo(wsdmFascicolo);
        }
      } catch (Exception e) {
        logger.error("Errore (_italprotProtocolloDocumentoInserisci-fascicolaProtocollo)", e);
      } finally {
        try {
          // Annullamento del token
          ProWsFascicoloPortType proWsFascicoloPort = _getProWsFascicoloPort();
          proWsFascicoloPort.destroyItaEngineContextToken(tokenFascicolo, codiceente);
        } catch (Exception e) {

        }
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
      WSDMProtocolloAllegato[] wsdmAllegati, AllegatoPrecaricato[] allegatiPrecaricati, StringBuffer xmlDatiProtocollo,
      boolean allegati_metti_alla_firma) throws RemoteException {

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
        xmlDatiProtocollo.append("<marcaDocumento>" + ALLEGATI_MARCA_DOCUMENTO + "</marcaDocumento>");
        if (allegati_metti_alla_firma == true) {
          allegatiPrecaricati[a].setMettiAllaFirma(FIRMA_ALLEGATI_SI);
          xmlDatiProtocollo.append("<mettiAllaFirma>" + FIRMA_ALLEGATI_SI + "</mettiAllaFirma>");
        } else {
          allegatiPrecaricati[a].setMettiAllaFirma(FIRMA_ALLEGATI_NO);
          xmlDatiProtocollo.append("<mettiAllaFirma>" + FIRMA_ALLEGATI_NO + "</mettiAllaFirma>");
        }

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

  /**
   * Lettura del protocollo.
   * 
   * @param username
   * @param password
   * @param annoProtocollo
   * @param numeroProtocollo
   * @param tipoProtocollo
   * @param wsdmprotocolloDocumentoRes
   */
  private void _italprotFirmaVerifica(String username, String password, String numeroDocumento,
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

      // Verifica della firma
      boolean esito = false;
      String messaggio = null;
      String numeroProtocollo = null;
      Long annoProtocollo = null;
      String tipoProtocollo = null;

      ItemEsitoFirmaHolder itemsEsitoFirmaHolder = new ItemEsitoFirmaHolder();
      MessageResultHolder checkDocumentoAllaFirmaMessageResult = new MessageResultHolder();
      proWsProtocolloPort.checkDocumentoAllaFirma(token, numeroDocumento, itemsEsitoFirmaHolder, checkDocumentoAllaFirmaMessageResult);
      String tipoRisultatoCheckAllaFirma = checkDocumentoAllaFirmaMessageResult.value.getTipoRisultato().toUpperCase();
      if (TIPO_RISULTATO_INFO.equals(tipoRisultatoCheckAllaFirma) || TIPO_RISULTATO_WARNING.equals(tipoRisultatoCheckAllaFirma)) {
        ItemEsitoFirma itemEsitoFirma = itemsEsitoFirmaHolder.value;

        if (ESITO_FIRMA_OK.equals(itemEsitoFirma.getEsitoFirma())) {
          esito = true;
          numeroProtocollo = itemEsitoFirma.getNumeroProtocollo();
          annoProtocollo = new Long(itemEsitoFirma.getAnnoProtocollo());
          tipoProtocollo = itemEsitoFirma.getTipoProtocollo();
        } else {
          esito = false;
          messaggio = checkDocumentoAllaFirmaMessageResult.value.getDescrizione();
        }

      } else {
        esito = false;
        messaggio = checkDocumentoAllaFirmaMessageResult.value.getDescrizione();
      }

      // Se il check della firma e' andato a buon fine scarico i dettagli del
      // documento ed i suoi allegati.
      if (esito == true) {

        String segnatura = null;
        ItemProtocolloHolder items = new ItemProtocolloHolder();
        MessageResultHolder messageResult = new MessageResultHolder();
        String tipoRisultato = null;

        proWsProtocolloPort.getProtocollo(token, annoProtocollo.toString(), numeroProtocollo, tipoProtocollo, segnatura, items,
            messageResult);
        tipoRisultato = messageResult.value.getTipoRisultato().toUpperCase();
        if (TIPO_RISULTATO_INFO.equals(tipoRisultato) || TIPO_RISULTATO_WARNING.equals(tipoRisultato)) {
          esito = true;
        } else {
          esito = false;
          messaggio = messageResult.value.getDescrizione();
        }

        // Se il protocollo e' stato trovato si provvede a leggere i metadati, i
        // mittenti, i destinatari e gli allegati.
        if (esito == true) {
          ItemProtocollo itemProtocollo = items.value;

          WSDMProtocolloDocumento wsdmProtocolloDocumento = new WSDMProtocolloDocumento();

          // Anno e numero protocollo, numero documento
          wsdmProtocolloDocumento.setAnnoProtocollo(annoProtocollo);
          wsdmProtocolloDocumento.setNumeroProtocollo(numeroProtocollo);
          wsdmProtocolloDocumento.setNumeroDocumento(numeroDocumento);

          // Data e ora protocollo
          // <dataProtocollo xsi:type="xsd:string">20210720</dataProtocollo>
          // <oraProtocollo xsi:type="xsd:string">17:16:32</oraProtocollo>
          try {
            String dataProtocollo = itemProtocollo.getDataProtocollo();
            String oraProtocollo = itemProtocollo.getOraProtocollo();
            if (dataProtocollo != null && oraProtocollo != null) {
              Date dataOraProtocollo = new SimpleDateFormat("yyyyMMdd HH:mm:ss").parse(dataProtocollo + " " + oraProtocollo);
              wsdmProtocolloDocumento.setDataProtocollo(dataOraProtocollo);
            }
          } catch (Exception e) {

          }

          // Oggetto
          if (itemProtocollo.getOggetto() != null) {
            wsdmProtocolloDocumento.setOggetto(itemProtocollo.getOggetto());
          }

          // Codice e descrizione classifica
          if (itemProtocollo.getClassificazione() != null) {
            wsdmProtocolloDocumento.setClassifica(itemProtocollo.getClassificazione());
          }
          if (itemProtocollo.getClassificazione_Descrizione() != null) {
            wsdmProtocolloDocumento.setClassificaDescrizione(itemProtocollo.getClassificazione_Descrizione());
          }

          // Tipo protocollo
          if (PROTOCOLLO_ARRIVO.equals(tipoProtocollo)) {
            wsdmProtocolloDocumento.setInout(WSDMProtocolloInOut.IN);
          } else if (PROTOCOLLO_PARTENZA.equals(tipoProtocollo)) {
            wsdmProtocolloDocumento.setInout(WSDMProtocolloInOut.OUT);
          } else if (PROTOCOLLO_INTERNO.equals(tipoProtocollo)) {
            wsdmProtocolloDocumento.setInout(WSDMProtocolloInOut.INT);
          }

          // Mittenti e destinatari
          if (PROTOCOLLO_ARRIVO.equals(tipoProtocollo)) {
            // Mittenti
            MittenteDestinatario[] mittenti = itemProtocollo.getMittenti();
            if (mittenti != null && mittenti.length > 0) {
              WSDMProtocolloAnagrafica[] wsdmMittenti = new WSDMProtocolloAnagrafica[mittenti.length];
              for (int m = 0; m < mittenti.length; m++) {
                wsdmMittenti[m] = new WSDMProtocolloAnagrafica();
                wsdmMittenti[m].setCognomeointestazione(mittenti[m].getDenominazione());
                wsdmMittenti[m].setIndirizzoResidenza(mittenti[m].getIndirizzo());
                wsdmMittenti[m].setCapResidenza(mittenti[m].getCap());
                wsdmMittenti[m].setLocalitaResidenza(mittenti[m].getCitta());
                wsdmMittenti[m].setProvinciaResidenza(mittenti[m].getProv());
                wsdmMittenti[m].setEmail(mittenti[m].getEmail());
                wsdmMittenti[m].setCodiceFiscale(mittenti[m].getCodiceFiscale());
              }
              wsdmProtocolloDocumento.setMittenti(wsdmMittenti);
            }

          } else if (PROTOCOLLO_PARTENZA.equals(tipoProtocollo)) {
            // Destinatari
            MittenteDestinatario[] destinatari = itemProtocollo.getDestinatari();
            if (destinatari != null && destinatari.length > 0) {
              WSDMProtocolloAnagrafica[] wsdmDestinatari = new WSDMProtocolloAnagrafica[destinatari.length];
              for (int d = 0; d < destinatari.length; d++) {
                wsdmDestinatari[d] = new WSDMProtocolloAnagrafica();
                wsdmDestinatari[d].setCognomeointestazione(destinatari[d].getDenominazione());
                wsdmDestinatari[d].setIndirizzoResidenza(destinatari[d].getIndirizzo());
                wsdmDestinatari[d].setCapResidenza(destinatari[d].getCap());
                wsdmDestinatari[d].setLocalitaResidenza(destinatari[d].getCitta());
                wsdmDestinatari[d].setProvinciaResidenza(destinatari[d].getProv());
                wsdmDestinatari[d].setEmail(destinatari[d].getEmail());
                wsdmDestinatari[d].setCodiceFiscale(destinatari[d].getCodiceFiscale());
              }
              wsdmProtocolloDocumento.setDestinatari(wsdmDestinatari);
            }
          }

          // Allegati
          Allegato[] allegati = itemProtocollo.getAllegati();
          if (allegati != null && allegati.length > 0) {
            WSDMProtocolloAllegato[] wsdmAllegati = new WSDMProtocolloAllegato[allegati.length];
            for (int a = 0; a < allegati.length; a++) {
              wsdmAllegati[a] = new WSDMProtocolloAllegato();
              wsdmAllegati[a].setNome(allegati[a].getNomeFile());
              wsdmAllegati[a].setTipo(allegati[a].getEstensione());
              wsdmAllegati[a].setTitolo(allegati[a].getNomeFile());

              String id = allegati[a].getId();
              wsdmAllegati[a].setIdAllegato(id);

              // Lettura dello stream dati del file identificato dal suo id
              String blockSize = "104857600";
              String part = "1";

              AllegatoHolder allegatoStreamHolder = new AllegatoHolder();
              MessageResultHolder messageResultAllegatoStream = new MessageResultHolder();
              proWsProtocolloPort.getAllegato(token, id, blockSize, part, allegatoStreamHolder, messageResultAllegatoStream);
              String tipoRisultatoStreamAllegato = messageResultAllegatoStream.value.getTipoRisultato().toUpperCase();
              if (TIPO_RISULTATO_INFO.equals(tipoRisultatoStreamAllegato) || TIPO_RISULTATO_WARNING.equals(tipoRisultatoStreamAllegato)) {
                Allegato allegatoStream = allegatoStreamHolder.value;
                byte[] contenuto = Base64.decode(allegatoStream.getStream());
                wsdmAllegati[a].setContenuto(contenuto);
              }
            }
            wsdmProtocolloDocumento.setAllegati(wsdmAllegati);
          }

          wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmProtocolloDocumento);
          wsdmprotocolloDocumentoRes.setEsito(true);

        }
      }

      if (esito == false) {
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(messaggio);
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
      logger.error("Errore (_protocolloLeggi)", e);
    } finally {
      try {
        // Annullamento del token
        ProWsProtocolloPortType proWsProtocolloPort = _getProWsProtocolloPort();
        proWsProtocolloPort.destroyItaEngineContextToken(token, codiceente);
      } catch (Exception e) {

      }
    }
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

      // Verifica della firma
      boolean esito = false;
      String messaggio = null;
      String numeroProtocollo = null;
      Long annoProtocollo = null;
      String tipoProtocollo = null;

      ItemEsitoFirmaHolder itemsEsitoFirmaHolder = new ItemEsitoFirmaHolder();
      MessageResultHolder checkDocumentoAllaFirmaMessageResult = new MessageResultHolder();
      proWsProtocolloPort.checkDocumentoAllaFirma(token, numeroDocumento, itemsEsitoFirmaHolder, checkDocumentoAllaFirmaMessageResult);
      String tipoRisultatoCheckAllaFirma = checkDocumentoAllaFirmaMessageResult.value.getTipoRisultato().toUpperCase();
      if (TIPO_RISULTATO_INFO.equals(tipoRisultatoCheckAllaFirma) || TIPO_RISULTATO_WARNING.equals(tipoRisultatoCheckAllaFirma)) {
        ItemEsitoFirma itemEsitoFirma = itemsEsitoFirmaHolder.value;

        if (ESITO_FIRMA_OK.equals(itemEsitoFirma.getEsitoFirma())) {
          esito = true;
          numeroProtocollo = itemEsitoFirma.getNumeroProtocollo();
          annoProtocollo = new Long(itemEsitoFirma.getAnnoProtocollo());
          tipoProtocollo = itemEsitoFirma.getTipoProtocollo();
        } else {
          esito = false;
          messaggio = checkDocumentoAllaFirmaMessageResult.value.getDescrizione();
        }

      } else {
        esito = false;
        messaggio = checkDocumentoAllaFirmaMessageResult.value.getDescrizione();
      }

      // Se il check della firma e' andato a buon fine scarico i dettagli del
      // documento ed i suoi allegati.
      if (esito == true) {

        String segnatura = null;
        ItemProtocolloHolder items = new ItemProtocolloHolder();
        MessageResultHolder messageResult = new MessageResultHolder();
        String tipoRisultato = null;

        proWsProtocolloPort.getProtocollo(token, annoProtocollo.toString(), numeroProtocollo, tipoProtocollo, segnatura, items,
            messageResult);
        tipoRisultato = messageResult.value.getTipoRisultato().toUpperCase();
        if (TIPO_RISULTATO_INFO.equals(tipoRisultato) || TIPO_RISULTATO_WARNING.equals(tipoRisultato)) {
          esito = true;
        } else {
          esito = false;
          messaggio = messageResult.value.getDescrizione();
        }

        // Inserimento in fascicolo
        if (esito == true) {

          String tokenFascicolo = null;

          try {
            // Client wsFascicolo e lettura del token del fascicolo
            ProWsFascicoloPortType proWsFascicoloPort = _getProWsFascicoloPort();
            tokenFascicolo = proWsFascicoloPort.getItaEngineContextToken(username, password, codiceente);
            String codiceSottoFascicolo = null;
            RetFascicoloHolder retDatiFascicolo = new RetFascicoloHolder();
            it.italprot.prowsfascicolo.holders.MessageResultHolder messageFascicoloResultHolder = new it.italprot.prowsfascicolo.holders.MessageResultHolder();
            proWsFascicoloPort.fascicolaProtocollo(token, annoProtocollo.toString(), numeroProtocollo, tipoProtocollo, codiceFascicolo,
                codiceSottoFascicolo, retDatiFascicolo, messageFascicoloResultHolder);

            String tipoRisultatoFascicolo = messageFascicoloResultHolder.value.getTipoRisultato().toUpperCase();
            if (TIPO_RISULTATO_INFO.equals(tipoRisultatoFascicolo) || TIPO_RISULTATO_WARNING.equals(tipoRisultatoFascicolo)) {
              WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();
              wsdmFascicolo.setCodiceFascicolo(codiceFascicolo);
              wsdmFascicoloRes.setFascicolo(wsdmFascicolo);
              esito = true;
              messaggio = messageFascicoloResultHolder.value.getDescrizione();
            } else {
              esito = false;
              messaggio = messageFascicoloResultHolder.value.getDescrizione();
            }
          } catch (Exception e) {
            logger.error("Errore (_italprotProtocolloDocumentoInserisci-fascicolaProtocollo)", e);
          } finally {
            try {
              // Annullamento del token
              ProWsFascicoloPortType proWsFascicoloPort = _getProWsFascicoloPort();
              proWsFascicoloPort.destroyItaEngineContextToken(tokenFascicolo, codiceente);
            } catch (Exception e) {

            }
          }
        }
      }
      
      wsdmFascicoloRes.setEsito(esito);
      wsdmFascicoloRes.setMessaggio(messaggio);
      
    } catch (Exception e) {
      wsdmFascicoloRes.setEsito(false);
      wsdmFascicoloRes.setMessaggio(e.getMessage());
      Throwable cause = e.getCause();
      if (cause instanceof SAXParseException) {
        wsdmFascicoloRes.setMessaggio("La richiesta al servizio non restituisce alcun contenuto. Verificare la correttezza del codice dell'ente (domainCode) ["
            + e.getMessage()
            + "]");
      }
      logger.error("Errore (_fascicoloAggiungiDocumento)", e);
    } finally {
      try {
        // Annullamento del token
        ProWsProtocolloPortType proWsProtocolloPort = _getProWsProtocolloPort();
        proWsProtocolloPort.destroyItaEngineContextToken(token, codiceente);
      } catch (Exception e) {

      }
    }
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

    StringBuffer messaggioCtr = new StringBuffer();

    if (ItalprotUtilityControllo.ctrRicercaFascicolo(loginAttr, ricercaFascicolo, messaggioCtr)) {

      String token = null;
      String codiceente = null;

      try {

        // Url
        String url = InitialContext.doLookup(ITALPROT_PROWSFASCICOLO);
        if (url == null || (url != null && "".equals(url.trim()))) {
          throw new Exception(ITALPROT_PROWSFASCICOLO_NOT_DEFINED);
        }

        // Codice dell'ente
        codiceente = InitialContext.doLookup(ITALPROT_CODICEENTE);
        if (codiceente == null || (codiceente != null && "".equals(codiceente.trim()))) {
          throw new Exception(ITALPROT_CODICEENTE_NOT_DEFINED);
        }

        ProWsFascicoloPortType proWsFascicoloPort = _getProWsFascicoloPort();

        // Lettura del token
        token = proWsFascicoloPort.getItaEngineContextToken(username, password, codiceente);

        StringBuffer requestString = new StringBuffer();
        requestString.append("<soapenv:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">\n");
        requestString.append("<soapenv:Header/>\n");
        requestString.append("<soapenv:Body>\n");

        requestString.append("<GetElencoFascicoli soapenv:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\">\n");
        requestString.append("<token xsi:type=\"xsd:string\">" + token + "</token>\n");

        // Parametri di ricerca
        requestString.append("<arrayParamRicerca xsi:type=\"urn:arrayParamRicerca\" xmlns:urn=\"urn:proWsFascicolo\">\n");

        if (ricercaFascicolo.getClassificaFascicolo() != null && !"".equals(ricercaFascicolo.getClassificaFascicolo().trim())) {
          requestString.append("<parametroRicerca xsi:type=\"urn:parametroRicerca\">\n");
          requestString.append("<chiave xsi:type=\"xsd:string\">TITOLARIO</chiave>\n");
          requestString.append("<valore xsi:type=\"xsd:string\">" + ricercaFascicolo.getClassificaFascicolo() + "</valore>\n");
          requestString.append("</parametroRicerca>\n");
        }
        if (ricercaFascicolo.getAnnoFascicolo() != null) {
          requestString.append("<parametroRicerca xsi:type=\"urn:parametroRicerca\">\n");
          requestString.append("<chiave xsi:type=\"xsd:string\">ANNO</chiave>\n");
          requestString.append("<valore xsi:type=\"xsd:string\">" + ricercaFascicolo.getAnnoFascicolo().toString() + "</valore>\n");
          requestString.append("</parametroRicerca>\n");
        }

        requestString.append("</arrayParamRicerca>\n");
        requestString.append("</GetElencoFascicoli>\n");
        requestString.append("</soapenv:Body>\n");
        requestString.append("</soapenv:Envelope>\n");

        SOAPMessage soapMessage = _sendRequestSOAP(token, requestString, url);

        SOAPBody body = soapMessage.getSOAPPart().getEnvelope().getBody();

        // Messaggio ed errore
        String descrizioneResult = "";
        String tipoRisultatoResult = "";
        if (body.getElementsByTagName("descrizione") != null && body.getElementsByTagName("descrizione").item(0) != null) {
          descrizioneResult = body.getElementsByTagName("descrizione").item(0).getTextContent();
        }
        if (body.getElementsByTagName("tipoRisultato") != null && body.getElementsByTagName("tipoRisultato").item(0) != null) {
          tipoRisultatoResult = body.getElementsByTagName("tipoRisultato").item(0).getTextContent();
        }

        logger.debug(descrizioneResult);
        logger.debug(tipoRisultatoResult);

        NodeList elencoFascicoliResponse = body.getElementsByTagName("ElencoFascicoli");
        if (elencoFascicoliResponse != null && elencoFascicoliResponse.item(0) != null) {

          NodeList elencoFascicoliNode = elencoFascicoliResponse.item(0).getChildNodes();

          if (elencoFascicoliNode != null && elencoFascicoliNode.getLength() > 0) {

            WSDMFascicolo[] wsdmListaFascicoli = new WSDMFascicolo[elencoFascicoliNode.getLength()];
            for (int efn = 0; efn < elencoFascicoliNode.getLength(); efn++) {

              wsdmListaFascicoli[efn] = new WSDMFascicolo();

              NodeList dettaglioFascicoloListNode = elencoFascicoliNode.item(efn).getChildNodes();

              for (int df = 0; df < dettaglioFascicoloListNode.getLength(); df++) {
                Node dettaglioFascicolo = dettaglioFascicoloListNode.item(df);
                String nodeName = dettaglioFascicolo.getNodeName();
                String textContent = dettaglioFascicolo.getTextContent();

                // Codice del fascicolo
                if ("codiceFascicolo".equals(nodeName)) {
                  wsdmListaFascicoli[efn].setCodiceFascicolo(textContent);
                }

                // Oggetto e descrizione fascicolo
                if ("descrizioneFascicolo".equals(nodeName)) {
                  wsdmListaFascicoli[efn].setOggettoFascicolo(textContent);
                  wsdmListaFascicoli[efn].setDescrizioneFascicolo(textContent);
                }

                // Titolario
                if ("titolario".equals(nodeName)) {
                  wsdmListaFascicoli[efn].setClassificaFascicolo(textContent);
                }

                // Descrizione titolario
                if ("titolarioDescrizione".equals(nodeName)) {
                  wsdmListaFascicoli[efn].setClassificaFascicoloDescrizione(textContent);
                }

                // Data fascicolo
                if ("dataFascicolo".equals(nodeName)) {
                  try {
                    if (textContent != null) {
                      Date dataFascicolo = new SimpleDateFormat("dd/MM/yyyy").parse(textContent);
                      Calendar cal = Calendar.getInstance();
                      cal.setTime(new SimpleDateFormat("dd/MM/yyyy").parse(textContent));
                      wsdmListaFascicoli[efn].setAnnoFascicolo(new Long(cal.get(Calendar.YEAR)));
                      wsdmListaFascicoli[efn].setDataFascicolo(dataFascicolo);
                    }
                  } catch (Exception e) {

                  }
                }
              }
            }
            wsdmRicercaFascicoloRes.setEsito(true);
            wsdmRicercaFascicoloRes.setFascicoli(wsdmListaFascicoli);

          } else {
            wsdmRicercaFascicoloRes.setEsito(false);
            wsdmRicercaFascicoloRes.setMessaggio(RICERCA_FASCICOLO_NO);
          }

        }

      } catch (Exception e) {
        wsdmRicercaFascicoloRes.setEsito(false);
        wsdmRicercaFascicoloRes.setMessaggio(e.getMessage());
        Throwable cause = e.getCause();
        if (cause instanceof SAXParseException) {
          wsdmRicercaFascicoloRes.setMessaggio("La richiesta al servizio non restituisce alcun contenuto. Verificare la correttezza del codice dell'ente (domainCode) ["
              + e.getMessage()
              + "]");
        }
        logger.error("Errore (_fascicoloRicerca)", e);
      } finally {
        try {
          // Annullamento del token
          ProWsFascicoloPortType proWsFascicoloPort = _getProWsFascicoloPort();
          proWsFascicoloPort.destroyItaEngineContextToken(token, codiceente);
        } catch (Exception e) {

        }
      }

    } else {
      wsdmRicercaFascicoloRes.setEsito(false);
      wsdmRicercaFascicoloRes.setMessaggio(messaggioCtr.toString());
    }

    return wsdmRicercaFascicoloRes;
  }

  private SOAPMessage _sendRequestSOAP(String token, StringBuffer requestString, String wsurl) throws MalformedURLException, IOException,
      UnsupportedEncodingException, ProtocolException, Exception, SOAPException, WSSecurityException, JAXBException {

    // Log dell'intera busta SOAP
    logger.debug("Messaggio SOAP di richiesta: " + requestString);

    MessageFactory msgFactory = MessageFactory.newInstance(SOAPConstants.SOAP_1_1_PROTOCOL);
    SOAPMessage requestSOAPMessage = msgFactory.createMessage();

    SOAPPart requestSOAPPart = requestSOAPMessage.getSOAPPart();
    javax.xml.transform.stream.StreamSource _msg = new javax.xml.transform.stream.StreamSource(new java.io.StringReader(
        requestString.toString()));
    requestSOAPPart.setContent(_msg);

    requestSOAPMessage.saveChanges();

    SOAPConnectionFactory factory = SOAPConnectionFactory.newInstance();
    SOAPConnection soapConnection = factory.createConnection();
    SOAPMessage message = soapConnection.call(requestSOAPMessage, wsurl);

    return message;
  }

  @Override
  public WSDMProtocolloDocumentoRes _firmaInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {

    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    StringBuffer messaggioCtr = new StringBuffer();

    if (ItalprotUtilityControllo.ctrFirmaInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {
      _italprotFirmaInserisci(username, password, wsdmprotocolloDocumentoIn, wsdmprotocolloDocumentoRes);
    } else {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
    }

    return wsdmprotocolloDocumentoRes;
  }

  @Override
  public WSDMProtocolloDocumentoRes _firmaVerifica(String username, String password, WSDMLoginAttr loginAttr, String numeroDocumento) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    StringBuffer messaggioCtr = new StringBuffer();

    if (ItalprotUtilityControllo.ctrFirmaVerifica(loginAttr, numeroDocumento, messaggioCtr)) {
      _italprotFirmaVerifica(username, password, numeroDocumento, wsdmprotocolloDocumentoRes);
    } else {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
    }
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
