/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.maggioli.eldasoft.bl.protservice;

//import it.viterbo.protservice;
import it.maggioli.eldasoft.bl.IWSDMManager;
import it.maggioli.eldasoft.bl.smat.SOAPHandlers;
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
import it.viterbo.protservice.ProtocolloPort;
import it.viterbo.protservice.ProtocolloServiceLocator;

import java.net.URL;
import java.text.SimpleDateFormat;
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
import org.apache.commons.io.FilenameUtils;
import org.springframework.util.StringUtils;

/**
 * 
 * @author Enrico
 */
public class ProtServiceManager implements IWSDMManager {

  static private String          PROTSERVICE_ENDPOINT   = "java:comp/env/PROTSERVICE_ENDPOINT";
  static private String          PROTSERVICE_RISERVATO  = "java:comp/env/PROTSERVICE_RISERVATO";
  static private String          PROTSERVICE_REGISTRO   = "java:comp/env/PROTSERVICE_REGISTRO";

  static public final String     PROTOCOLLO_IN_INGRESSO = "E";
  static public final String     PROTOCOLLO_IN_USCITA   = "U";

  static org.apache.log4j.Logger logger                 = org.apache.log4j.Logger.getLogger(ProtServiceManager.class);
  String                         token                  = "";

  private ProtocolloPort getProtocolloPort(String username, String password) throws Exception {
    String wsProtServiceAddress = InitialContext.doLookup(PROTSERVICE_ENDPOINT);
    if (wsProtServiceAddress == null || (wsProtServiceAddress != null && "".equals(wsProtServiceAddress))) {
      throw new Exception(URL_NOT_DEFINED);
    }

    // Gestione servizio ed "endpoint"
    ProtocolloServiceLocator protocolloServiceLocator = new ProtocolloServiceLocator();
    ProtocolloPort protocolloService = protocolloServiceLocator.getProtocolloPort(new URL(wsProtServiceAddress));

    // Aggiunta di un handler per la modifica del messaggio SOAP
    SimpleProvider clientConfig = new SimpleProvider();
    SOAPHandlers soapHandler = new SOAPHandlers();
    SimpleChain reqHandler = new SimpleChain();
    SimpleChain respHandler = new SimpleChain();
    reqHandler.addHandler(soapHandler);
    org.apache.axis.Handler pivot = new HTTPSender();
    org.apache.axis.Handler transport = new SimpleTargetedChain(reqHandler, pivot, respHandler);
    clientConfig.deployTransport(HTTPTransport.DEFAULT_TRANSPORT_NAME, transport);
    protocolloServiceLocator.setEngineConfiguration(clientConfig);
    protocolloServiceLocator.setEngine(new AxisClient(clientConfig));

    // Autenticazione
    ((Stub) protocolloService)._setProperty(Call.USERNAME_PROPERTY, username);
    ((Stub) protocolloService)._setProperty(Call.PASSWORD_PROPERTY, password);

    return protocolloService;

  }

  @Override
  public WSDMProtocolloDocumentoRes _protocolloInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {

    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (ProtServiceUtilityControllo.ctrProtocolloInserisci(wsdmprotocolloDocumentoIn, messaggioCtr)) {
        String s = "S";
        ProtocolloPort protocolloPort = this.getProtocolloPort(username, password);

        // Tipo di protocollazione (I: ingresso, U: uscita).
        String tipo = "";
        WSDMProtocolloInOut inOut = wsdmprotocolloDocumentoIn.getInout();
        if (WSDMProtocolloInOut.IN.equals(inOut)) {
          tipo = PROTOCOLLO_IN_INGRESSO;
        } else if (WSDMProtocolloInOut.OUT.equals(inOut)) {
          tipo = PROTOCOLLO_IN_USCITA;
        }

        // Riservato (SI, NO)
        String riservato = InitialContext.doLookup(PROTSERVICE_RISERVATO);

        // Registro
        String registro = InitialContext.doLookup(PROTSERVICE_REGISTRO);

        // Oggetto di gara / della comunicazione di Appalti
        String oggetto = wsdmprotocolloDocumentoIn.getOggetto();

        // Classifica
        String classificazione = wsdmprotocolloDocumentoIn.getClassifica();

        // Mittente della comunicazione.
        // Puo' essere lasciato vuoto.
        // Il formato permette di indicare un solo mittente, si considera solo
        // il primo.
        // Il mittente e' identificato dal solo indirizzo email
        String mittente = "";
        String tipomittente = "";
        if (tipo == PROTOCOLLO_IN_INGRESSO) {
          WSDMProtocolloAnagrafica[] wsdmMittenti = wsdmprotocolloDocumentoIn.getMittenti();

          if (wsdmMittenti != null && wsdmMittenti.length > 0) {
            mittente = wsdmMittenti[0].getEmail();
          }
          // Tipo Mittente
          // Sempre 6
          tipomittente = "6";
        }

        // Destinatario della comunicazione.
        // Puo' essere lasciato vuoto.
        // Il formato permette di indicare anche piu' di un destinatario, per i
        // destinatari multipli utilizzare il separatore ";".
        // Il destinatario e' identificato dal solo indirizzo email.
        String destinatario = "";
        if (tipo == PROTOCOLLO_IN_USCITA) {
          WSDMProtocolloAnagrafica[] wsdmDestinatari = wsdmprotocolloDocumentoIn.getDestinatari();
          if (wsdmDestinatari != null && wsdmDestinatari.length > 0) {
            for (int d = 0; d < wsdmDestinatari.length; d++) {
              if (d > 0) {
                destinatario += ";";
              }
              destinatario += wsdmDestinatari[d].getEmail();
            }
          }
        }

        // Descrizione
        String descrizione = wsdmprotocolloDocumentoIn.getDescrizione();

        // Richiesta di modifiche del 08/10/2019.
        // Il cliente lamenta che la valorizzazione delle due date non e' corretta.
        // Il valore "NA" nella data di arrivo e nella data di spedizione non va bene. Deve essere passato nel formato AAAA-MM-GG. 
        
        Date dataOdierna = new Date();
        
        // Data di arrivo
        String datadiarrivo = new SimpleDateFormat("yyyy-MM-dd").format(dataOdierna);

        // Data di spedizione
        String datadispedizione = new SimpleDateFormat("yyyy-MM-dd").format(dataOdierna);

        // Tipo di documento
        String tipodidocumento = wsdmprotocolloDocumentoIn.getTipoDocumento();

        // Allegato
        String nomefile = "";
        String estensione = "";
        byte[] base64FILE = null;
        WSDMProtocolloAllegato[] wsdmprotocolloAllegati = wsdmprotocolloDocumentoIn.getAllegati();
        if (wsdmprotocolloAllegati != null && wsdmprotocolloAllegati.length > 0) {
          nomefile = wsdmprotocolloAllegati[0].getNome();
          base64FILE = wsdmprotocolloAllegati[0].getContenuto();
          estensione = FilenameUtils.getExtension(nomefile);
        }

        // Lettura della risposta
        try {
          String docResponse = protocolloPort.doProtocollo(tipo, riservato, registro, oggetto, classificazione, mittente, tipomittente,
              destinatario, descrizione, datadiarrivo, datadispedizione, tipodidocumento, base64FILE, estensione);
          String[] response = docResponse.split(";");

          if (!StringUtils.isEmpty(response[0])) {
            String numeroProtocollo = response[0];
            String annoProtocollo = response[0].split("/")[3];
            String dataProtocollo = response[1];

            wsdmprotocolloDocumentoRes.setEsito(true);
            WSDMProtocolloDocumento wsdmProtocolloDocumento = new WSDMProtocolloDocumento();
            wsdmProtocolloDocumento.setNumeroProtocollo(numeroProtocollo);

            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            wsdmProtocolloDocumento.setDataProtocollo(f.parse(dataProtocollo));
            wsdmProtocolloDocumento.setAnnoProtocollo(new Long(annoProtocollo));

            wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmProtocolloDocumento);
          } else {
            wsdmprotocolloDocumentoRes.setEsito(false);
          }
        } catch (Exception e) {
          wsdmprotocolloDocumentoRes.setEsito(false);
          wsdmprotocolloDocumentoRes.setMessaggio(e.getMessage());
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
  public WSDMProtocolloDocumentoRes _documentoInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {
    // WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new
    // WSDMProtocolloDocumentoRes();
    // wsdmprotocolloDocumentoRes.setEsito(false);
    // wsdmprotocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    // return wsdmprotocolloDocumentoRes;
    return _protocolloInserisci(username, password, loginAttr, wsdmprotocolloDocumentoIn);
  }

  @Override
  public WSDMListaProfiliRes _listaProfili(String username, String password, String utenteApplicativo) {
    WSDMListaProfiliRes retval = new WSDMListaProfiliRes();
    retval.setEsito(false);
    retval.setMessaggio(OPERATION_NOT_SUPPORTED);
    return retval;
  }

  @Override
  public WSDMListaAmministrazioniAooRes _listaAmministrazioniAoo(String username, String password) {
    WSDMListaAmministrazioniAooRes retval = new WSDMListaAmministrazioniAooRes();
    retval.setEsito(false);
    retval.setMessaggio(OPERATION_NOT_SUPPORTED);
    return retval;
  }

  @Override
  public WSDMListaUfficiRes _listaUffici(String username, String password, WSDMLoginAttr loginAttr, String codiceAoo,
      String descrizioneUfficio, String utente) {
    WSDMListaUfficiRes retval = new WSDMListaUfficiRes();
    retval.setEsito(false);
    retval.setMessaggio(OPERATION_NOT_SUPPORTED);
    return retval;
  }

  @Override
  public WSDMProtocolloDocumentoRes _protocolloLeggi(String username, String password, WSDMLoginAttr loginAttr, Long annoProtocollo,
      String numeroProtocollo) {
    WSDMProtocolloDocumentoRes retval = new WSDMProtocolloDocumentoRes();
    retval.setEsito(false);
    retval.setMessaggio(OPERATION_NOT_SUPPORTED);
    return retval;
  }

  @Override
  public WSDMProtocolloDocumentoRes _documentoLeggi(String username, String password, WSDMLoginAttr loginAttr, String numeroDocumento) {
    WSDMProtocolloDocumentoRes retval = new WSDMProtocolloDocumentoRes();
    retval.setEsito(false);
    retval.setMessaggio(OPERATION_NOT_SUPPORTED);
    return retval;
  }

  @Override
  public WSDMProtocolloDocumentoRes _documentoMetadatiLeggi(String username, String password, WSDMLoginAttr loginAttr,
      String numeroDocumento) {
    WSDMProtocolloDocumentoRes retval = new WSDMProtocolloDocumentoRes();
    retval.setEsito(false);
    retval.setMessaggio(OPERATION_NOT_SUPPORTED);
    return retval;
  }

  @Override
  public WSDMFascicoloRes _fascicoloInserisci(String username, String password, WSDMLoginAttr loginAttr, WSDMFascicoloIn wsdmfascicoloIn) {
    WSDMFascicoloRes retval = new WSDMFascicoloRes();
    retval.setEsito(false);
    retval.setMessaggio(OPERATION_NOT_SUPPORTED);
    return retval;
  }

  @Override
  public WSDMFascicoloRes _fascicoloAggiungiDocumento(String username, String password, WSDMLoginAttr loginAttr, String codiceFascicolo,
      String numeroDocumento) {
    WSDMFascicoloRes retval = new WSDMFascicoloRes();
    retval.setEsito(false);
    retval.setMessaggio(OPERATION_NOT_SUPPORTED);
    return retval;
  }

  @Override
  public WSDMFascicoloRes _fascicoloLeggi(String username, String password, WSDMLoginAttr loginAttr, String codiceFascicolo,
      Long annoFascicolo, String numeroFascicolo, String classificaFascicolo) {
    WSDMFascicoloRes retval = new WSDMFascicoloRes();
    retval.setEsito(false);
    retval.setMessaggio(OPERATION_NOT_SUPPORTED);
    return retval;
  }

  @Override
  public WSDMFascicoloRes _fascicoloMetadatiLeggi(String username, String password, WSDMLoginAttr loginAttr, String codiceFascicolo,
      Long annoFascicolo, String numeroFascicolo, String classificaFascicolo) {
    WSDMFascicoloRes retval = new WSDMFascicoloRes();
    retval.setEsito(false);
    retval.setMessaggio(OPERATION_NOT_SUPPORTED);
    return retval;
  }

  @Override
  public WSDMProtocolloDocumentoRes _attoContrattoLeggi(String username, String password, WSDMLoginAttr loginAttr, String tipo,
      String organo, Long anno, String numero) {
    WSDMProtocolloDocumentoRes retval = new WSDMProtocolloDocumentoRes();
    retval.setEsito(false);
    retval.setMessaggio(OPERATION_NOT_SUPPORTED);
    return retval;
  }

  @Override
  public WSDMInviaMailRes _inviaMail(String username, String password, WSDMLoginAttr loginAttr, WSDMInviaMail wsdmInviaMail) {
    WSDMInviaMailRes retval = new WSDMInviaMailRes();
    retval.setEsito(false);
    retval.setMessaggio(OPERATION_NOT_SUPPORTED);
    return retval;
  }

  @Override
  public WSDMVerificaMailRes _verificaMail(String username, String password, WSDMLoginAttr loginAttr, String numeroDocumento,
      Long annoProtocollo, String numeroProtocollo) {
    WSDMVerificaMailRes retval = new WSDMVerificaMailRes();
    retval.setEsito(false);
    retval.setMessaggio(OPERATION_NOT_SUPPORTED);
    return retval;
  }

  @Override
  public WSDMAttoContrattoRes _attoContrattoRicerca(String username, String password, WSDMLoginAttr loginAttr, String tipo, String organo,
      Long anno, String numeroDa, String numeroA, Date dataDa, Date dataA) {
    WSDMAttoContrattoRes retval = new WSDMAttoContrattoRes();
    retval.setEsito(false);
    retval.setMessaggio(OPERATION_NOT_SUPPORTED);
    return retval;
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
