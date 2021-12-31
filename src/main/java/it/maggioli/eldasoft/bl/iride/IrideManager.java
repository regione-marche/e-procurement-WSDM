package it.maggioli.eldasoft.bl.iride;

import it.iride.protocollo.xsd.ProtoInDocument;
import it.iride.wsatti.AttoOut;
import it.iride.wsatti.WSatti;
import it.iride.wsatti.WSattiSoap;
import it.iride.wsfascicolo.DocumentoFascicoloOut;
import it.iride.wsfascicolo.EsitoOperazione;
import it.iride.wsfascicolo.FascicoloIn;
import it.iride.wsfascicolo.FascicoloOut;
import it.iride.wsfascicolo.WSFascicolo;
import it.iride.wsfascicolo.WSFascicoloSoap;
import it.iride.wsprotocollodm.AllegatoOut;
import it.iride.wsprotocollodm.DocumentoOut;
import it.iride.wsprotocollodm.InserisciDocumentoEAnagraficheString;
import it.iride.wsprotocollodm.InserisciDocumentoEAnagraficheStringResponse;
import it.iride.wsprotocollodm.InserisciProtocolloEAnagraficheString;
import it.iride.wsprotocollodm.InserisciProtocolloEAnagraficheStringResponse;
import it.iride.wsprotocollodm.MittenteDestinatarioOut;
import it.iride.wsprotocollodm.Protocollo;
import it.iride.wsprotocollodm.ProtocolloOut;
import it.iride.wsprotocollodm.ProtocolloSoap;
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
import it.maggioli.eldasoft.ws.dm.WSDMTrasmissioneIn;
import it.maggioli.eldasoft.ws.dm.WSDMTrasmissioneRes;
import it.maggioli.eldasoft.ws.dm.WSDMVerificaMailRes;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

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
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLFilter;
import org.xml.sax.XMLReader;

/**
 * Manager per la gestione documentale mediante sistema di protocollo IRIDE.
 * 
 */

public class IrideManager implements IWSDMManager {

  static Logger               logger                 = Logger.getLogger(IrideManager.class);

  static private String       WSPROTOCOLLO           = "java:comp/env/IRIDE_WSPROTOCOLLO";
  static private String       WSFASCICOLO            = "java:comp/env/IRIDE_WSFASCICOLO";
  static private String       WSATTO                 = "java:comp/env/IRIDE_WSATTO";
  static private String       CODICEAMMINISTRAZIONE  = "java:comp/env/IRIDE_CODICEAMMINISTRAZIONE";
  static private String       CODICEAOO              = "java:comp/env/IRIDE_CODICEAOO";

  static private final String PROTOCOLLO_IN_ARRIVO   = "A";
  static private final String PROTOCOLLO_IN_PARTENZA = "P";
  static private final String PROTOCOLLO_INTERNO     = "I";

  /**
   * Ottiene ProtocolloSoap da WSDL.
   * 
   * @return
   * @throws Exception
   */
  private ProtocolloSoap getProtocolloSoap() throws Exception {
    String wsProtocolloAddress = InitialContext.doLookup(WSPROTOCOLLO);
    if (wsProtocolloAddress == null || (wsProtocolloAddress != null && "".equals(wsProtocolloAddress.trim()))) {
      throw new Exception(URL_NOT_DEFINED);
    }
    Protocollo protocollo = new Protocollo();
    ProtocolloSoap protocolloSoap = protocollo.getProtocolloSoap();
    Client client = ClientProxy.getClient(protocolloSoap);
    client.getRequestContext().put(Message.ENDPOINT_ADDRESS, wsProtocolloAddress);
    return protocolloSoap;
  }

  /**
   * Ottiene WSFascicoloSoap da WSDL.
   * 
   * @return
   * @throws Exception
   */
  private WSFascicoloSoap getWSFascicoloSoap() throws Exception {
    String wsFascicoloAddress = InitialContext.doLookup(WSFASCICOLO);
    if (wsFascicoloAddress == null || (wsFascicoloAddress != null && "".equals(wsFascicoloAddress.trim()))) {
      throw new Exception(URL_NOT_DEFINED);
    }
    WSFascicolo wsfascicolo = new WSFascicolo();
    WSFascicoloSoap wsfascicoloSoap = wsfascicolo.getWSFascicoloSoap();
    Client client = ClientProxy.getClient(wsfascicoloSoap);
    client.getRequestContext().put(Message.ENDPOINT_ADDRESS, wsFascicoloAddress);
    return wsfascicoloSoap;
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
      throw new Exception(URL_NOT_DEFINED);
    }
    WSatti wsAtti = new WSatti();
    WSattiSoap wsAttiSoap = wsAtti.getWSattiSoap();
    Client client = ClientProxy.getClient(wsAttiSoap);
    client.getRequestContext().put(Message.ENDPOINT_ADDRESS, wsAttiAddress);
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
          WSDMFascicoloIn wsdmFascicoloIn = new WSDMFascicoloIn();
          wsdmFascicoloIn.setOggettoFascicolo(oggettoFascicolo);
          wsdmFascicoloIn.setClassificaFascicolo(classificaFascicolo);
          wsdmFascicoloIn.setDescrizioneFascicolo(descrizioneFascicolo);
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
        }

        // Inserimento dell'elemento documentale nel protocollo
        if (esito) {
          String protocolloInString = this.popolaProtocolloInString(username, password, loginAttr, wsdmprotocolloDocumentoIn);
          InserisciProtocolloEAnagraficheString inserisciProtocolloEAnagraficheString = new InserisciProtocolloEAnagraficheString();
          inserisciProtocolloEAnagraficheString.setProtocolloInStr(protocolloInString);
          inserisciProtocolloEAnagraficheString.setCodiceAmministrazione(codiceAmministrazione);
          inserisciProtocolloEAnagraficheString.setCodiceAOO(codiceAOO);
          InserisciProtocolloEAnagraficheStringResponse inserisciProtocolloEAnagraficheStringResponse = this.getProtocolloSoap().inserisciProtocolloString(
              inserisciProtocolloEAnagraficheString);
          String protocolloOutString = inserisciProtocolloEAnagraficheStringResponse.getInserisciProtocolloEAnagraficheStringResult();
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
      if (IrideUtilityControllo.ctrProtocolloLeggi(loginAttr, annoProtocollo, numeroProtocollo, messaggioCtr)) {
        String ruolo = loginAttr.getRuolo();
        String codiceAmministrazione = InitialContext.doLookup(CODICEAMMINISTRAZIONE);
        String codiceAOO = InitialContext.doLookup(CODICEAOO);
        String documentoOutString = this.getProtocolloSoap().leggiProtocolloString(annoProtocollo.shortValue(),
            new Long(numeroProtocollo).intValue(), username, ruolo, codiceAmministrazione, codiceAOO);
        DocumentoOut documentoOut = this.documentoOutFromString(documentoOutString);
        wsdmprotocolloDocumentoRes = this.popolaWSDMPDResDaDocumentoOut(documentoOut);

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
          WSDMFascicoloIn wsdmFascicoloIn = new WSDMFascicoloIn();
          wsdmFascicoloIn.setOggettoFascicolo(oggettoFascicolo);
          wsdmFascicoloIn.setClassificaFascicolo(classificaFascicolo);
          wsdmFascicoloIn.setDescrizioneFascicolo(descrizioneFascicolo);
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
        }

        // Inserimento dell'elemento documentale nel protocollo
        if (esito) {
          String protocolloInString = this.popolaProtocolloInString(username, password, loginAttr, wsdmprotocolloDocumentoIn);
          InserisciDocumentoEAnagraficheString inserisciDocumentoEAnagraficheString = new InserisciDocumentoEAnagraficheString();
          inserisciDocumentoEAnagraficheString.setProtocolloInStr(protocolloInString);
          inserisciDocumentoEAnagraficheString.setCodiceAmministrazione(codiceAmministrazione);
          inserisciDocumentoEAnagraficheString.setCodiceAOO(codiceAOO);
          InserisciDocumentoEAnagraficheStringResponse inserisciDocumentoEAnagraficheStringResponse = this.getProtocolloSoap().inserisciDocumentoString(
              inserisciDocumentoEAnagraficheString);
          String protocolloOutString = inserisciDocumentoEAnagraficheStringResponse.getInserisciDocumentoEAnagraficheStringResult();
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
      if (IrideUtilityControllo.ctrDocumentoLeggi(loginAttr, numeroDocumento, messaggioCtr)) {
        String ruolo = loginAttr.getRuolo();
        String codiceAmministrazione = InitialContext.doLookup(CODICEAMMINISTRAZIONE);
        String codiceAOO = InitialContext.doLookup(CODICEAOO);
        String documentoOutString = this.getProtocolloSoap().leggiDocumentoString(Integer.parseInt(numeroDocumento), username, ruolo,
            codiceAmministrazione, codiceAOO);
        DocumentoOut documentoOut = this.documentoOutFromString(documentoOutString);
        wsdmprotocolloDocumentoRes = this.popolaWSDMPDResDaDocumentoOut(documentoOut);
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
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    wsdmprotocolloDocumentoRes.setEsito(false);
    wsdmprotocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmprotocolloDocumentoRes;
  }

  @Override
  public WSDMFascicoloRes _fascicoloInserisci(String username, String password, WSDMLoginAttr login, WSDMFascicoloIn wsdmfascicoloIn) {

    WSDMFascicoloRes wsdmfascicoloRes = new WSDMFascicoloRes();

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (IrideUtilityControllo.ctrFascicoloInserisci(login, wsdmfascicoloIn, messaggioCtr)) {
        String ruolo = login.getRuolo();
        String codiceAmministrazione = InitialContext.doLookup(CODICEAMMINISTRAZIONE);
        String codiceAOO = InitialContext.doLookup(CODICEAOO);

        FascicoloIn fascicoloIn = new FascicoloIn();

        Date dataFascicolo = new Date();
        String dataYYYY = new SimpleDateFormat("yyyy").format(dataFascicolo);
        String dataDDMMYYYY = new SimpleDateFormat("dd/MM/yyyy").format(dataFascicolo);
        fascicoloIn.setAnno(dataYYYY);
        fascicoloIn.setData(dataDDMMYYYY);
        fascicoloIn.setOggetto(wsdmfascicoloIn.getOggettoFascicolo());
        fascicoloIn.setClassifica(wsdmfascicoloIn.getClassificaFascicolo());
        fascicoloIn.setAltriDati(wsdmfascicoloIn.getDescrizioneFascicolo());
        fascicoloIn.setUtente(username);
        fascicoloIn.setRuolo(ruolo);

        // Inoltro richiesta al servizio IRIDE
        FascicoloOut fascicoloOut = this.getWSFascicoloSoap().creaFascicolo(fascicoloIn, codiceAmministrazione, codiceAOO);
        wsdmfascicoloRes = this.popolaWSDMFResDaFascicoloOut(fascicoloOut);
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
      if (IrideUtilityControllo.ctrFascicoloAggiungiDocumento(loginAttr, codiceFascicolo, numeroDocumento, messaggioCtr)) {
        String ruolo = loginAttr.getRuolo();
        String codiceAmministrazione = InitialContext.doLookup(CODICEAMMINISTRAZIONE);
        String codiceAOO = InitialContext.doLookup(CODICEAOO);
        String aggiornaClassifica = "S";

        // Inoltro richiesta la servizio IRIDE
        EsitoOperazione esitoOperazione = this.getWSFascicoloSoap().fascicolaDocumento(Integer.parseInt(codiceFascicolo),
            Integer.parseInt(numeroDocumento), aggiornaClassifica, username, ruolo, codiceAmministrazione, codiceAOO);

        // Esito, secondo le specifiche IRIDE, e' necessario controllare se
        // l'attributo "Errore" e' popolato.
        // Se popolato la richiesta ad IRIDE ha generato un errore la cui
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
  public WSDMFascicoloRes _fascicoloLeggi(String username, String password, WSDMLoginAttr login, String codiceFascicolo,
      Long annoFascicolo, String numeroFascicolo, String classificaFascicolo) {

    WSDMFascicoloRes wsdmfascicoloRes = new WSDMFascicoloRes();

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (IrideUtilityControllo.ctrFascicoloLeggi(login, codiceFascicolo, annoFascicolo, numeroFascicolo, messaggioCtr)) {
        String ruolo = login.getRuolo();
        String codiceAmministrazione = InitialContext.doLookup(CODICEAMMINISTRAZIONE);
        String codiceAOO = InitialContext.doLookup(CODICEAOO);

        // Inoltro richiesta la servizio IRIDE
        FascicoloOut fascicoloOut = this.getWSFascicoloSoap().leggiFascicolo(codiceFascicolo, String.valueOf(annoFascicolo.longValue()),
            numeroFascicolo, username, ruolo, codiceAmministrazione, codiceAOO);
        wsdmfascicoloRes = this.popolaWSDMFResDaFascicoloOut(fascicoloOut);
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
  public WSDMFascicoloRes _fascicoloMetadatiLeggi(String username, String password, WSDMLoginAttr loginAttr, String codiceFascicolo,
      Long annoFascicolo, String numeroFascicolo, String classificaFascicolo) {
    return _fascicoloLeggi(username, password, loginAttr, codiceFascicolo, annoFascicolo, numeroFascicolo, classificaFascicolo);
  }

  /**
   * Popola l'oggetto ELDASOFT WSDMFascicoloOut dall'oggetto IRIDE FascicoloOut.
   * 
   * @param fascicoloOut
   * @return
   */
  private WSDMFascicoloRes popolaWSDMFResDaFascicoloOut(FascicoloOut fascicoloOut) {

    WSDMFascicoloRes wsdmfascicoloRes = new WSDMFascicoloRes();

    // Esito, secondo le specifiche IRIDE, e' necessario controllare se
    // l'attributo "Errore" e' popolato.
    // Se popolato la richiesta ad IRIDE ha generato un errore la cui
    // descrizione dovra' essere concatenata all'attributo "Messaggio".
    boolean esito = true;
    String messaggio = fascicoloOut.getMessaggio();
    String errore = fascicoloOut.getErrore();
    if (errore != null && !errore.equals("")) {
      esito = false;
      messaggio += " - " + errore;
    }
    wsdmfascicoloRes.setEsito(esito);
    wsdmfascicoloRes.setMessaggio(messaggio);

    if (esito) {
      WSDMFascicolo wsdmfascicolo = new WSDMFascicolo();
      wsdmfascicolo.setAnnoFascicolo(new Long(fascicoloOut.getAnno()));
      wsdmfascicolo.setClassificaFascicolo(fascicoloOut.getClassifica());
      wsdmfascicolo.setClassificaFascicoloDescrizione(fascicoloOut.getClassificaDescrizione());
      wsdmfascicolo.setDataFascicolo(fascicoloOut.getData().toGregorianCalendar().getTime());
      wsdmfascicolo.setDescrizioneFascicolo(fascicoloOut.getAltriDati());

      if (fascicoloOut.getDocumentiFascicolo() != null) {
        List<DocumentoFascicoloOut> listDocumentoFascicoloOut = fascicoloOut.getDocumentiFascicolo().getDocumento();
        if (!listDocumentoFascicoloOut.isEmpty() && listDocumentoFascicoloOut.size() > 0) {
          WSDMFascicoloDocumento[] documenti = new WSDMFascicoloDocumento[listDocumentoFascicoloOut.size()];
          for (int df = 0; df < documenti.length; df++) {
            DocumentoFascicoloOut documentoFascicoloOut = listDocumentoFascicoloOut.get(df);

            documenti[df] = new WSDMFascicoloDocumento();
            if (documentoFascicoloOut.getAnnoProtocollo() != null && !documentoFascicoloOut.getAnnoProtocollo().equals("")) {
              Long annoProtocollo = new Long(documentoFascicoloOut.getAnnoProtocollo());
              documenti[df].setAnnoProtocollo(annoProtocollo);
            }
            String numeroDocumento = String.valueOf(documentoFascicoloOut.getIdDocumento());
            documenti[df].setNumeroDocumento(numeroDocumento);
            documenti[df].setNumeroProtocollo(documentoFascicoloOut.getNumeroProtocollo());
            documenti[df].setOggetto(documentoFascicoloOut.getOggetto());

            String origine = documentoFascicoloOut.getOrigine();
            if (PROTOCOLLO_IN_ARRIVO.equals(origine)) {
              documenti[df].setInout(WSDMProtocolloInOut.IN);
            } else if (PROTOCOLLO_IN_PARTENZA.equals(origine)) {
              documenti[df].setInout(WSDMProtocolloInOut.OUT);
            } else if (PROTOCOLLO_INTERNO.equals(origine)) {
              documenti[df].setInout(WSDMProtocolloInOut.INT);
            }
          }
          wsdmfascicolo.setDocumenti(documenti);
        }
      }
      wsdmfascicolo.setCodiceFascicolo(String.valueOf(fascicoloOut.getId()));
      wsdmfascicolo.setNumeroFascicolo(fascicoloOut.getNumero());
      wsdmfascicolo.setOggettoFascicolo(fascicoloOut.getOggetto());
      wsdmfascicoloRes.setFascicolo(wsdmfascicolo);
    }

    return wsdmfascicoloRes;
  }

  /**
   * Popola la stringa XML per l'inserimento di un elemento documentale o di un
   * nuovo protocollo.
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
    it.iride.protocollo.xsd.ProtoInDocument protoInDocument = ProtoInDocument.Factory.newInstance();
    it.iride.protocollo.xsd.ProtocolloIn protocolloIn = protoInDocument.addNewProtoIn();
    protocolloIn.setData(dataDDMMYYYY);
    protocolloIn.setClassifica(wsdmprotocolloDocumentoIn.getClassifica());
    protocolloIn.setTipoDocumento(wsdmprotocolloDocumentoIn.getTipoDocumento());
    protocolloIn.setOggetto(wsdmprotocolloDocumentoIn.getOggetto());
    protocolloIn.setOrigine(origine);
    protocolloIn.setMittenteInterno(wsdmprotocolloDocumentoIn.getMittenteInterno());
    protocolloIn.setAggiornaAnagrafiche("S");
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
        it.iride.protocollo.xsd.ArrayOfMittenteDestinatarioIn arrayOfMittenteDestinatarioIn = protocolloIn.addNewMittentiDestinatari();
        for (int mi = 0; mi < mittenti.length; mi++) {
          it.iride.protocollo.xsd.MittenteDestinatarioIn mittenteDestinarioIn = arrayOfMittenteDestinatarioIn.addNewMittenteDestinatario();
          mittenteDestinarioIn.setCodiceFiscale(mittenti[mi].getCodiceFiscale());
          mittenteDestinarioIn.setCognomeNome(mittenti[mi].getCognomeointestazione());
          mittenteDestinarioIn.setMezzo(mittenti[mi].getMezzo());
        }
        protocolloIn.setMittentiDestinatari(arrayOfMittenteDestinatarioIn);
      }
    } else if (PROTOCOLLO_IN_PARTENZA.equals(origine)) {
      WSDMProtocolloAnagrafica[] destinatari = wsdmprotocolloDocumentoIn.getDestinatari();
      if (destinatari != null && destinatari.length > 0) {
        it.iride.protocollo.xsd.ArrayOfMittenteDestinatarioIn arrayOfMittenteDestinatarioIn = protocolloIn.addNewMittentiDestinatari();
        for (int de = 0; de < destinatari.length; de++) {
          it.iride.protocollo.xsd.MittenteDestinatarioIn mittenteDestinarioIn = arrayOfMittenteDestinatarioIn.addNewMittenteDestinatario();
          mittenteDestinarioIn.setCodiceFiscale(destinatari[de].getCodiceFiscale());
          mittenteDestinarioIn.setCognomeNome(destinatari[de].getCognomeointestazione());
          mittenteDestinarioIn.setMezzo(destinatari[de].getMezzo());
        }
        protocolloIn.setMittentiDestinatari(arrayOfMittenteDestinatarioIn);
      }
    }

    // Allegati
    WSDMProtocolloAllegato[] allegati = wsdmprotocolloDocumentoIn.getAllegati();
    if (allegati != null && allegati.length > 0) {
      it.iride.protocollo.xsd.ArrayOfAllegatoIn arrayOfAllegatoIn = protocolloIn.addNewAllegati();
      for (int ai = 0; ai < allegati.length; ai++) {
        it.iride.protocollo.xsd.AllegatoIn allegatoIn = arrayOfAllegatoIn.addNewAllegato();
        allegatoIn.setNomeAllegato(allegati[ai].getNome());
        allegatoIn.setCommento(allegati[ai].getTitolo());
        allegatoIn.setTipoFile(allegati[ai].getTipo());
        allegatoIn.setImage(allegati[ai].getContenuto());
      }
      protocolloIn.setAllegati(arrayOfAllegatoIn);
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
   * dell'oggetto IRIDE ProtocolloOut.
   * 
   * @param protocolloOut
   * @return
   */
  private WSDMProtocolloDocumentoRes popolaWSDMPDResDaProtocolloOut(ProtocolloOut protocolloOut, boolean setDataProtocolloOdierna) {

    WSDMProtocolloDocumentoRes wsdmProtocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    // Esito, secondo le specifiche IRIDE, e' necessario controllare se
    // l'attributo "Errore" e' popolato.
    // Se popolato la richiesta ad IRIDE ha generato un errore la cui
    // descrizione dovra' essere concatenata all'attributo "Messaggio".
    boolean esito = true;
    String messaggio = protocolloOut.getMessaggio();
    String errore = protocolloOut.getErrore();
    if (errore != null && !errore.equals("")) {
      esito = false;
      messaggio += " - " + errore;
    }

    wsdmProtocolloDocumentoRes.setEsito(esito);
    wsdmProtocolloDocumentoRes.setMessaggio(messaggio);

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

      wsdmProtocolloDocumentoRes.setProtocolloDocumento(wsdmprotocolloDocumento);
    }

    return wsdmProtocolloDocumentoRes;

  }

  /**
   * Popola l'oggetto ELDASOFT WSDMProtocolloDocumentoOut sulla base
   * dell'oggetto IRIDE DocumentoOut restituito da servizi IRIDE.
   * 
   * @param documentoOut
   * @return
   */
  private WSDMProtocolloDocumentoRes popolaWSDMPDResDaDocumentoOut(DocumentoOut documentoOut) {

    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    // Esito, secondo le specifiche IRIDE, e' necessario controllare se
    // l'attributo "Errore" e' popolato.
    // Se popolato la richiesta ad IRIDE ha generato un errore la cui
    // descrizione dovra' essere concatenata all'attributo "Messaggio".
    boolean esito = true;
    String messaggio = documentoOut.getMessaggio();
    String errore = documentoOut.getErrore();
    if (errore != null && !errore.equals("")) {
      esito = false;
      messaggio += " - " + errore;
    }

    wsdmprotocolloDocumentoRes.setEsito(esito);
    wsdmprotocolloDocumentoRes.setMessaggio(messaggio);

    // Se la richiesta con esito positivo.
    if (esito) {
      WSDMProtocolloDocumento wsdmprotocolloDocumento = new WSDMProtocolloDocumento();
      // Allegati
      if (documentoOut.getAllegati() != null) {
        List<AllegatoOut> listAllegatoOut = documentoOut.getAllegati().getAllegato();
        if (!listAllegatoOut.isEmpty() && listAllegatoOut.size() > 0) {
          WSDMProtocolloAllegato[] allegati = new WSDMProtocolloAllegato[listAllegatoOut.size()];
          for (int ao = 0; ao < listAllegatoOut.size(); ao++) {
            AllegatoOut allegatoOut = listAllegatoOut.get(ao);
            String nome = allegatoOut.getNomeAllegato();
            String titolo = allegatoOut.getCommento();
            String tipo = allegatoOut.getTipoFile();
            byte[] contenuto = allegatoOut.getImage();

            allegati[ao] = new WSDMProtocolloAllegato();
            allegati[ao].setContenuto(contenuto);
            allegati[ao].setNome(nome);
            allegati[ao].setTipo(tipo);
            allegati[ao].setTitolo(titolo);
          }
          wsdmprotocolloDocumento.setAllegati(allegati);
        }
      }

      // Anno protocollo
      wsdmprotocolloDocumento.setAnnoProtocollo(new Long(documentoOut.getAnnoProtocollo()));

      // Classifica (codice e descrizione)
      wsdmprotocolloDocumento.setClassifica(documentoOut.getClassifica());
      wsdmprotocolloDocumento.setClassificaDescrizione(documentoOut.getClassificaDescrizione());

      // Data della richiesta di inserimento/protocollo
      if (documentoOut.getDataInserimento() != null) {
        wsdmprotocolloDocumento.setData(documentoOut.getDataInserimento().toGregorianCalendar().getTime());
      }

      // Data del protocollo
      if (documentoOut.getDataProtocollo() != null) {
        wsdmprotocolloDocumento.setDataProtocollo(documentoOut.getDataProtocollo().toGregorianCalendar().getTime());
      }

      // Gestione documenti in Arrivo (A) o in Partenza (P) o interni (I)
      String origine = documentoOut.getOrigine();
      if (PROTOCOLLO_IN_ARRIVO.equals(origine)) {
        wsdmprotocolloDocumento.setInout(WSDMProtocolloInOut.IN);
      } else if (PROTOCOLLO_IN_PARTENZA.equals(origine)) {
        wsdmprotocolloDocumento.setInout(WSDMProtocolloInOut.OUT);
      } else if (PROTOCOLLO_INTERNO.equals(origine)) {
        wsdmprotocolloDocumento.setInout(WSDMProtocolloInOut.INT);
      }

      // Gestione dei mittenti/destinatari.
      // Se i documenti sono in arrivo le figure professionali coinvolte sono
      // "mittenti", se i documento sono in partenza le figure professionali
      // coinvolte sono "destinatari".
      if (documentoOut.getMittentiDestinatari() != null) {
        List<MittenteDestinatarioOut> listMittenteDestinatarioOut = documentoOut.getMittentiDestinatari().getMittenteDestinatario();
        if (!listMittenteDestinatarioOut.isEmpty() && listMittenteDestinatarioOut.size() > 0) {
          WSDMProtocolloAnagrafica[] anagrafiche = new WSDMProtocolloAnagrafica[listMittenteDestinatarioOut.size()];
          for (int md = 0; md < listMittenteDestinatarioOut.size(); md++) {
            MittenteDestinatarioOut mittenteDestinatarioOut = listMittenteDestinatarioOut.get(md);
            String cognomeNome = mittenteDestinatarioOut.getCognomeNome();
            String partitaIVA = mittenteDestinatarioOut.getPartitaIVA();

            anagrafiche[md] = new WSDMProtocolloAnagrafica();
            anagrafiche[md].setCognomeointestazione(cognomeNome);
            anagrafiche[md].setCodiceFiscale(partitaIVA);
          }

          if (PROTOCOLLO_IN_ARRIVO.equals(origine)) {
            wsdmprotocolloDocumento.setMittenti(anagrafiche);
          } else if (PROTOCOLLO_IN_PARTENZA.equals(origine)) {
            wsdmprotocolloDocumento.setDestinatari(anagrafiche);
          }

        }
      }

      // Mittente interno (codice e descrizione)
      wsdmprotocolloDocumento.setMittenteInterno(documentoOut.getMittenteInterno());
      wsdmprotocolloDocumento.setMittenteInternoDescrizione(documentoOut.getMittenteInternoDescrizione());

      // Numero del documento
      wsdmprotocolloDocumento.setNumeroDocumento(String.valueOf(documentoOut.getIdDocumento()));

      // Numero del protocollo
      wsdmprotocolloDocumento.setNumeroProtocollo(String.valueOf(documentoOut.getNumeroProtocollo()));

      // Oggetto del documento inserito/protocollo
      wsdmprotocolloDocumento.setOggetto(documentoOut.getOggetto());

      // Tipo del documento inserito/protocollo (codice e descrizione)
      wsdmprotocolloDocumento.setTipoDocumento(documentoOut.getTipoDocumento());
      wsdmprotocolloDocumento.setTipoDocumentoDescrizione(documentoOut.getTipoDocumentoDescrizione());

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
      if (IrideUtilityControllo.ctrAttoLeggi(loginAttr, tipo, organo, anno, numero, messaggioCtr)) {
        String ruolo = loginAttr.getRuolo();
        String codiceAmministrazione = InitialContext.doLookup(CODICEAMMINISTRAZIONE);
        String codiceAOO = InitialContext.doLookup(CODICEAOO);
        AttoOut attoOut = this.getWSAttiSoap().leggiAtto("", tipo, organo, anno.toString(), numero, username, ruolo, codiceAmministrazione,
            codiceAOO);
        wsdmProtocolloDocumentoRes = IrideUtilityAtto.popolaWSDMProtocolloDocumentoResDaAttoOut(attoOut);
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
   * Conversione della stringa documentoOutString nel suo oggetto DocumentoOut.
   * 
   * @param documentoOutString
   * @return
   * @throws JAXBException
   * @throws ParserConfigurationException
   * @throws SAXException
   * @throws IOException
   */
  private DocumentoOut documentoOutFromString(String documentoOutString) throws JAXBException, ParserConfigurationException, SAXException,
      IOException {
    JAXBContext context = JAXBContext.newInstance(DocumentoOut.class);

    XMLFilter filter = new NamespaceFilter();
    SAXParserFactory spf = SAXParserFactory.newInstance();
    SAXParser sp = spf.newSAXParser();
    XMLReader xr = sp.getXMLReader();
    filter.setParent(xr);

    Unmarshaller unmarshaller = context.createUnmarshaller();
    UnmarshallerHandler unmarshallerHandler = unmarshaller.getUnmarshallerHandler();
    filter.setContentHandler(unmarshallerHandler);

    InputSource xml = new InputSource(new StringReader(documentoOutString));
    filter.parse(xml);
    Object result = unmarshallerHandler.getResult();
    DocumentoOut documentoOut = (DocumentoOut) result;
    return documentoOut;
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
