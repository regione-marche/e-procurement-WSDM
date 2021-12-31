package it.maggioli.eldasoft.bl.paleo;

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
import it.maggioli.eldasoft.ws.dm.WSDMMailInfo;
import it.maggioli.eldasoft.ws.dm.WSDMMailInfo2;
import it.maggioli.eldasoft.ws.dm.WSDMOperatore;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloAllegato;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloAnagrafica;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloDocumento;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloDocumentoIn;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloDocumentoRes;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloInOut;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloModificaIn;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloModificaRes;
import it.maggioli.eldasoft.ws.dm.WSDMRicercaAccountEmail;
import it.maggioli.eldasoft.ws.dm.WSDMTipoDocumentoPrincipaleOriginale;
import it.maggioli.eldasoft.ws.dm.WSDMTipoTrasmissione;
import it.maggioli.eldasoft.ws.dm.WSDMTipoVoceRubrica;
import it.maggioli.eldasoft.ws.dm.WSDMTrasmissioneDocumento;
import it.maggioli.eldasoft.ws.dm.WSDMTrasmissioneIn;
import it.maggioli.eldasoft.ws.dm.WSDMTrasmissioneRes;
import it.maggioli.eldasoft.ws.dm.WSDMTrasmissioneUtente;
import it.maggioli.eldasoft.ws.dm.WSDMVerificaMailRes;
import it.marche.regione.paleo.Allegato;
import it.marche.regione.paleo.ArrayOfAllegato;
import it.marche.regione.paleo.ArrayOfClassificazione;
import it.marche.regione.paleo.ArrayOfCorrispondente;
import it.marche.regione.paleo.ArrayOfDestinatarioInfoInterop;
import it.marche.regione.paleo.ArrayOfMessaggioInteropInfo2;
import it.marche.regione.paleo.ArrayOfMessaggioPostaInfo2;
import it.marche.regione.paleo.ArrayOfOperatorePaleo;
import it.marche.regione.paleo.ArrayOfRagioneTrasmissione;
import it.marche.regione.paleo.ArrayOfTrasmissioneDoc;
import it.marche.regione.paleo.ArrayOfTrasmissioneUtente;
import it.marche.regione.paleo.ArrayOfrespDocProtocolliInfo;
import it.marche.regione.paleo.BEBase;
import it.marche.regione.paleo.BEBaseOfFileZA0HwLp5;
import it.marche.regione.paleo.BEListOfOperatorePaleoZA0HwLp5;
import it.marche.regione.paleo.BEListOfRagioneTrasmissioneZA0HwLp5;
import it.marche.regione.paleo.BEListOfrespDocProtocolliInfoZA0HwLp5;
import it.marche.regione.paleo.Classificazione;
import it.marche.regione.paleo.Corrispondente;
import it.marche.regione.paleo.DatiCorrispondente;
import it.marche.regione.paleo.DatiNuovoFascicolo;
import it.marche.regione.paleo.DestinatarioInfoInterop;
import it.marche.regione.paleo.File;
import it.marche.regione.paleo.IPaleoService;
import it.marche.regione.paleo.MessaggioInteropInfo2;
import it.marche.regione.paleo.MessaggioPostaInfo2;
import it.marche.regione.paleo.OperatorePaleo;
import it.marche.regione.paleo.PaleoService;
import it.marche.regione.paleo.RagioneTrasmissione;
import it.marche.regione.paleo.ReqAddAllegati;
import it.marche.regione.paleo.ReqCercaProtocollo;
import it.marche.regione.paleo.ReqDocProtocolliInFascicolo;
import it.marche.regione.paleo.ReqDocumento;
import it.marche.regione.paleo.ReqProtocolloArrivo;
import it.marche.regione.paleo.ReqProtocolloPartenza;
import it.marche.regione.paleo.ReqSpedisciProtocollo;
import it.marche.regione.paleo.RespAddAllegati;
import it.marche.regione.paleo.RespDocProtocolliInfo;
import it.marche.regione.paleo.RespDocumento;
import it.marche.regione.paleo.RespDocumentoExt;
import it.marche.regione.paleo.RespProtocolloArrivo;
import it.marche.regione.paleo.RespProtocolloArrivoExt;
import it.marche.regione.paleo.RespProtocolloPartenza;
import it.marche.regione.paleo.RespProtocolloPartenzaExt;
import it.marche.regione.paleo.RespSpedisciProtocollo;
import it.marche.regione.paleo.TipoOriginale;
import it.marche.regione.paleo.TipoRisultato;
import it.marche.regione.paleo.TipoVoceRubrica;
import it.marche.regione.paleo.TrasmissioneDoc;
import it.marche.regione.paleo.TrasmissioneUtente;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.WebServiceException;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.message.Message;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.log4j.Logger;
import org.apache.ws.security.WSConstants;
import org.apache.ws.security.handler.WSHandlerConstants;
import org.datacontract.schemas._2004._07.regionemarche_protocollo_common.TipoProtocollo;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;

/**
 * Manager per la gestione documentale mediante sistema di protocollo PALEO.
 * 
 */

public class PaleoManager implements IWSDMManager {

  static Logger              logger                            = Logger.getLogger(PaleoManager.class);

  static public final String FASCICOLO_OPERATION_NOT_SUPPORTED = "Operazione non disponibile: la creazione di un fascicolo e l'aggiunta del documento al fascicolo e' disponibile solamente con le operazioni di inserimento protocollo o documento";

  static private String      PALEO_WS                          = "java:comp/env/PALEO_WS";
  static private String      PALEO_CODICEAMMINISTRAZIONE       = "java:comp/env/PALEO_CODICEAMMINISTRAZIONE";

  static private String      PALEO_DOCUMENTOPRIVATO            = "java:comp/env/PALEO_DOCUMENTOPRIVATO";

  static private String      PALEO_TA                          = "java:comp/env/PALEO_TA";
  static private String      PALEO_TA_OP_RUOLO                 = "java:comp/env/PALEO_TA_OP_RUOLO";
  static private String      PALEO_TA_OP_NOME                  = "java:comp/env/PALEO_TA_OP_NOME";
  static private String      PALEO_TA_OP_COGNOME               = "java:comp/env/PALEO_TA_OP_COGNOME";
  static private String      PALEO_TA_OP_CODICEUO              = "java:comp/env/PALEO_TA_OP_CODICEUO";
  static private String      PALEO_TA_TIPO                     = "java:comp/env/PALEO_TA_TIPO";

  /**
   * Ottiene iPaleoService configurato con OutInterceptor per l'utilizzo di
   * WS-Security.
   * 
   * @param username
   * @param password
   * @return
   * @throws Exception
   */
  private IPaleoService getIPaleoService(String username, String password) throws Exception {
    String wsPaleoAddress = InitialContext.doLookup(PALEO_WS);
    if (wsPaleoAddress == null || (wsPaleoAddress != null && "".equals(wsPaleoAddress.trim()))) {
      throw new Exception(URL_NOT_DEFINED);
    }
    String paleoCodiceAmministrazione = InitialContext.doLookup(PALEO_CODICEAMMINISTRAZIONE);

    PaleoService paleoService = new PaleoService();
    IPaleoService iPaleoService = paleoService.getBasicHttpBindingIPaleoService();
    Client client = ClientProxy.getClient(iPaleoService);
    client.getRequestContext().put(Message.ENDPOINT_ADDRESS, wsPaleoAddress);

    PaleoPasswordCallback paleoPasswordCallback = new PaleoPasswordCallback();
    paleoPasswordCallback.setAliasPassword(paleoCodiceAmministrazione + "\\" + username, password);

    Map<String, Object> outProps = new HashMap<String, Object>();
    outProps.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN);
    outProps.put(WSHandlerConstants.USER, paleoCodiceAmministrazione + "\\" + username);
    outProps.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_TEXT);
    outProps.put(WSHandlerConstants.PW_CALLBACK_REF, paleoPasswordCallback);

    client.getOutInterceptors().add(new WSS4JOutInterceptor(outProps));
    return iPaleoService;
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

    AllegatoHash[] allegatiHash = null;

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (PaleoUtilityControllo.ctrProtocolloInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {
        WSDMProtocolloInOut inOut = wsdmprotocolloDocumentoIn.getInout();

        if (WSDMProtocolloInOut.IN.equals(inOut)) {
          // Protocollo in ingresso/arrivo
          _protocolloInserisciArrivo(username, password, loginAttr, wsdmprotocolloDocumentoIn, wsdmprotocolloDocumentoRes, allegatiHash);
        } else if (WSDMProtocolloInOut.OUT.equals(inOut)) {
          // Protocollo in uscita/partenza
          _protocolloInserisciPartenza(username, password, loginAttr, wsdmprotocolloDocumentoIn, wsdmprotocolloDocumentoRes, allegatiHash);
        } else if (WSDMProtocolloInOut.INT.equals(inOut)) {
          // Archiviazione documento interno (si tratta della sola registrazione
          // del documento)
          _archiviaDocumentoInterno(username, password, loginAttr, wsdmprotocolloDocumentoIn, wsdmprotocolloDocumentoRes, allegatiHash);
        }

        // Trasmissione automatica
        try {

          String paleo_ta = InitialContext.doLookup(PALEO_TA);
          if (paleo_ta != null && paleo_ta.toLowerCase().equals("true")) {

            String ta_ruolo = InitialContext.doLookup(PALEO_TA_OP_RUOLO);
            String ta_nome = InitialContext.doLookup(PALEO_TA_OP_NOME);
            String ta_cognome = InitialContext.doLookup(PALEO_TA_OP_COGNOME);
            String ta_codiceuo = InitialContext.doLookup(PALEO_TA_OP_CODICEUO);
            String ta_tipo = InitialContext.doLookup(PALEO_TA_TIPO);

            if (wsdmprotocolloDocumentoRes.isEsito()) {
              if (wsdmprotocolloDocumentoRes.getProtocolloDocumento() != null) {
                String numeroDocumento = wsdmprotocolloDocumentoRes.getProtocolloDocumento().getNumeroDocumento();

                WSDMTrasmissioneIn trasmissioneIn = new WSDMTrasmissioneIn();
                WSDMTrasmissioneDocumento[] trasmissioneDocumenti = new WSDMTrasmissioneDocumento[1];
                trasmissioneDocumenti[0] = new WSDMTrasmissioneDocumento();

                // Utente destinatario della trasmissione (costituito da
                // operatore
                // e tipo trasmissione)
                WSDMTrasmissioneUtente[] trasmissioneUtenti = new WSDMTrasmissioneUtente[1];
                trasmissioneUtenti[0] = new WSDMTrasmissioneUtente();

                // Operatore
                WSDMOperatore operatore = new WSDMOperatore();
                operatore.setNome(ta_nome);
                operatore.setCognome(ta_cognome);
                operatore.setRuolo(ta_ruolo);
                operatore.setCodiceUO(ta_codiceuo);

                trasmissioneUtenti[0].setOperatore(operatore);
                trasmissioneUtenti[0].setTipoTrasmissione(ta_tipo);
                trasmissioneDocumenti[0].setNumeroDocumento(numeroDocumento);
                trasmissioneDocumenti[0].setUtenti(trasmissioneUtenti);
                trasmissioneIn.setDocumenti(trasmissioneDocumenti);

                WSDMTrasmissioneRes wsdmTrasmissioneRes = new WSDMTrasmissioneRes();
                wsdmTrasmissioneRes = _trasmissione(username, password, loginAttr, trasmissioneIn);

                if (wsdmTrasmissioneRes.isEsito()) {
                  logger.info("La trasmissione automatica del documento " + numeroDocumento + " e' avvenuta correttamente");
                } else {
                  logger.error("Errore durante la trasmissione automatica del documento "
                      + numeroDocumento
                      + ": "
                      + wsdmTrasmissioneRes.getMessaggio());
                }

              }
            }
          }
        } catch (Exception e) {
          logger.error("Errore duramente la trasmissione automatica del documento", e);
        }

      } else {
        // Non sono stati superati i controlli di validita'
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

  /**
   * Inserisce il protocollo in entrata/arrivo
   * 
   * @param username
   * @param password
   * @param loginAttr
   * @param wsdmprotocolloDocumentoIn
   * @param wsdmprotocolloDocumentoRes
   * @param inOut
   * @throws Exception
   */
  private void _protocolloInserisciArrivo(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn, WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes,
      AllegatoHash[] allegatiHash) throws Exception {
    IPaleoService iPaleoService = this.getIPaleoService(username, password);
    ReqProtocolloArrivo reqProtocolloArrivo = new ReqProtocolloArrivo();

    // Operatore
    OperatorePaleo operatorePaleo = _getOperatore(loginAttr);
    reqProtocolloArrivo.setOperatore(operatorePaleo);

    // Codice registro
    String codiceRegistro = wsdmprotocolloDocumentoIn.getCodiceRegistro();
    reqProtocolloArrivo.setCodiceRegistro(codiceRegistro);

    // Oggetto
    String oggetto = wsdmprotocolloDocumentoIn.getOggetto();
    reqProtocolloArrivo.setOggetto(oggetto);

    // Documento privato
    // 16/07/2019 - Modifica richiesta per rendere privato il documento e
    // successivamente assegnarlo con la "trasmissione".
    boolean documentoPrivato = true;
    try {
      String pdr = InitialContext.doLookup(PALEO_DOCUMENTOPRIVATO);
      if (pdr != null && pdr.toLowerCase().equals("false")) {
        documentoPrivato = false;
      }
    } catch (NamingException e) {

    }
    reqProtocolloArrivo.setPrivato(documentoPrivato);

    // Tipo documento originale principale
    // Documento principale originale principale
    WSDMTipoDocumentoPrincipaleOriginale tipoDocumentoPrincipaleOriginale = wsdmprotocolloDocumentoIn.getTipoDocumentoPrincipaleOriginale();
    if (tipoDocumentoPrincipaleOriginale != null) {
      if (tipoDocumentoPrincipaleOriginale.equals(WSDMTipoDocumentoPrincipaleOriginale.NON_DEFINITO)) {
        reqProtocolloArrivo.setDocumentoPrincipaleOriginale(TipoOriginale.NON_DEFINITO);
      } else if (tipoDocumentoPrincipaleOriginale.equals(WSDMTipoDocumentoPrincipaleOriginale.DIGITALE)) {
        reqProtocolloArrivo.setDocumentoPrincipaleOriginale(TipoOriginale.DIGITALE);
      } else if (tipoDocumentoPrincipaleOriginale.equals(WSDMTipoDocumentoPrincipaleOriginale.CARTACEO)) {
        reqProtocolloArrivo.setDocumentoPrincipaleOriginale(TipoOriginale.CARTACEO);
      }
    }

    // Documento acquisito integralmente
    reqProtocolloArrivo.setDocumentoPrincipaleAcquisitoIntegralmente(true);

    // Documento principale e documenti allegati
    WSDMProtocolloAllegato[] wsdmprotocolloAllegati = wsdmprotocolloDocumentoIn.getAllegati();
    if (wsdmprotocolloAllegati != null && wsdmprotocolloAllegati.length > 0) {
      // Il primo documento viene inserito come documento principale
      File documentoPrincipale = new File();
      documentoPrincipale.setNome(wsdmprotocolloAllegati[0].getNome());
      documentoPrincipale.setEstensione(wsdmprotocolloAllegati[0].getTipo());
      documentoPrincipale.setStream(wsdmprotocolloAllegati[0].getContenuto());

      String improntaDocumentoPrincipale = getImpronta(wsdmprotocolloAllegati[0].getContenuto());
      documentoPrincipale.setImpronta(improntaDocumentoPrincipale);

      reqProtocolloArrivo.setDocumentoPrincipale(documentoPrincipale);

      // I documenti con indice superiore ad 1 vengono inseriti come
      // documenti allegati
      // 09/07/2019 - Modifica struttura dei servizi. Ogni file allegato
      // (file oltre il documento principale) deve essere indicato, in fase
      // di protocollazione, con il suo hash calcolato in SHA-256.
      // Successivamente, con l'operazione "AddAllegatiDocumentoProtocollo"
      // potra' essere inviato il file effettivo.
      // In questo contesto non deve essere piu' inviato lo stream.

      if (wsdmprotocolloAllegati.length > 1) {

        allegatiHash = new AllegatoHash[wsdmprotocolloAllegati.length - 1];

        ArrayOfAllegato arrayOfAllegato = new ArrayOfAllegato();
        for (int ai = 1; ai < wsdmprotocolloAllegati.length; ai++) {
          Allegato allegato = new Allegato();
          allegato.setDescrizione(wsdmprotocolloAllegati[ai].getTitolo());
          File documentoAllegato = new File();
          documentoAllegato.setNome(wsdmprotocolloAllegati[ai].getNome());
          documentoAllegato.setEstensione(wsdmprotocolloAllegati[ai].getTipo());

          // Calcolo hash SHA-256
          String impronta = getImpronta(wsdmprotocolloAllegati[ai].getContenuto());
          documentoAllegato.setImpronta(impronta);

          // Salvataggio sulla struttura "allegatoHash" per il successivo invio,
          // del file, a PALEO.
          allegatiHash[ai - 1] = new AllegatoHash();
          allegatiHash[ai - 1].setTipo(wsdmprotocolloAllegati[ai].getTipo());
          allegatiHash[ai - 1].setNome(wsdmprotocolloAllegati[ai].getNome());
          allegatiHash[ai - 1].setContenuto(wsdmprotocolloAllegati[ai].getContenuto());
          allegatiHash[ai - 1].setTitolo(wsdmprotocolloAllegati[ai].getTitolo());
          allegatiHash[ai - 1].setHash(impronta);

          allegato.setDocumento(documentoAllegato);
          arrayOfAllegato.getAllegato().add(allegato);
        }
        reqProtocolloArrivo.setDocumentiAllegati(arrayOfAllegato);
      }
    }

    // Documento principale acquisito integralmente
    reqProtocolloArrivo.setDocumentoPrincipaleAcquisitoIntegralmente(true);

    // Classificazioni, fascicolo... (possibile inserimento su fascicolo
    // esistente o su nuovo fascicolo)
    WSDMInserimentoInFascicolo inserimentoInFascicolo = wsdmprotocolloDocumentoIn.getInserimentoInFascicolo();
    if (inserimentoInFascicolo != null) {
      if (WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO.equals(inserimentoInFascicolo)) {
        ArrayOfClassificazione arrayOfClassificazione = new ArrayOfClassificazione();
        Classificazione classificazione = new Classificazione();
        DatiNuovoFascicolo datiNuovoFascicolo = new DatiNuovoFascicolo();
        datiNuovoFascicolo.setCodiceClassifica(wsdmprotocolloDocumentoIn.getFascicolo().getClassificaFascicolo());
        datiNuovoFascicolo.setDescrizione(wsdmprotocolloDocumentoIn.getFascicolo().getOggettoFascicolo());
        datiNuovoFascicolo.setCustode(operatorePaleo);
        classificazione.setNuovoFascicolo(datiNuovoFascicolo);
        arrayOfClassificazione.getClassificazione().add(classificazione);
        reqProtocolloArrivo.setClassificazioni(arrayOfClassificazione);
      } else if (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(inserimentoInFascicolo)) {
        ArrayOfClassificazione arrayOfClassificazione = new ArrayOfClassificazione();
        Classificazione classificazione = new Classificazione();
        classificazione.setCodiceFascicolo(wsdmprotocolloDocumentoIn.getFascicolo().getCodiceFascicolo());
        arrayOfClassificazione.getClassificazione().add(classificazione);
        reqProtocolloArrivo.setClassificazioni(arrayOfClassificazione);
      }
    }

    // Data arrivo
    GregorianCalendar gregorianCalendar = new GregorianCalendar();
    XMLGregorianCalendar now = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
    reqProtocolloArrivo.setDataArrivo(now);

    // Mittente per il protocollo in arrivo (e' ammesso un solo mittente che
    // deve essere indicato come corrispondente occasionale)
    WSDMProtocolloAnagrafica[] mittenti = wsdmprotocolloDocumentoIn.getMittenti();
    if (mittenti != null && mittenti.length > 0) {
      // Si considera solamente il primo mittente
      Corrispondente corrispondente = new Corrispondente();
      DatiCorrispondente datiCorrispondente = new DatiCorrispondente();
      datiCorrispondente.setNome(mittenti[0].getNome());
      datiCorrispondente.setCognome(mittenti[0].getCognomeointestazione());
      datiCorrispondente.setIdFiscale(mittenti[0].getCodiceFiscale());
      datiCorrispondente.setEmail(mittenti[0].getEmail());
      datiCorrispondente.setIstatComune(mittenti[0].getIstatComune());

      WSDMTipoVoceRubrica tipoVoceRubrica = mittenti[0].getTipoVoceRubrica();
      if (tipoVoceRubrica != null) {
        if (tipoVoceRubrica.equals(WSDMTipoVoceRubrica.ALTRO)) {
          datiCorrispondente.setTipo(TipoVoceRubrica.ALTRO);
        } else if (tipoVoceRubrica.equals(WSDMTipoVoceRubrica.AMMINISTRAZIONE)) {
          datiCorrispondente.setTipo(TipoVoceRubrica.AMMINISTRAZIONE);
        } else if (tipoVoceRubrica.equals(WSDMTipoVoceRubrica.AOO)) {
          datiCorrispondente.setTipo(TipoVoceRubrica.AOO);
        } else if (tipoVoceRubrica.equals(WSDMTipoVoceRubrica.IMPRESA)) {
          datiCorrispondente.setTipo(TipoVoceRubrica.IMPRESA);
        } else if (tipoVoceRubrica.equals(WSDMTipoVoceRubrica.INDEFINITO)) {
          datiCorrispondente.setTipo(TipoVoceRubrica.INDEFINITO);
        } else if (tipoVoceRubrica.equals(WSDMTipoVoceRubrica.PERSONA)) {
          datiCorrispondente.setTipo(TipoVoceRubrica.PERSONA);
        } else if (tipoVoceRubrica.equals(WSDMTipoVoceRubrica.UO)) {
          datiCorrispondente.setTipo(TipoVoceRubrica.UO);
        }
      }

      corrispondente.setCorrispondenteOccasionale(datiCorrispondente);
      reqProtocolloArrivo.setMittente(corrispondente);
    }

    // Invio richiesta di protocollo in arrivo e lettura della risposta
    RespProtocolloArrivo respProtocolloArrivo = iPaleoService.protocollazioneEntrata(reqProtocolloArrivo);
    wsdmprotocolloDocumentoRes.setMessaggio(respProtocolloArrivo.getMessaggioRisultato().getDescrizione());
    if (TipoRisultato.ERROR.equals(respProtocolloArrivo.getMessaggioRisultato().getTipoRisultato())) {
      wsdmprotocolloDocumentoRes.setEsito(false);
    } else {
      wsdmprotocolloDocumentoRes.setEsito(true);
      WSDMProtocolloDocumento wsdmprotocolloDocumento = new WSDMProtocolloDocumento();

      String numeroDocumento = String.valueOf(respProtocolloArrivo.getDocNumber());
      wsdmprotocolloDocumento.setNumeroDocumento(numeroDocumento);

      wsdmprotocolloDocumento.setNumeroProtocollo(respProtocolloArrivo.getNumero());
      XMLGregorianCalendar dataProtocollo = respProtocolloArrivo.getDataProtocollazione();
      if (dataProtocollo != null) {
        // wsdmprotocolloDocumento.setDataProtocollo(dataProtocollo.toGregorianCalendar().getTime());
        Calendar cal = Calendar.getInstance();
        cal.setTime(dataProtocollo.toGregorianCalendar().getTime());
        wsdmprotocolloDocumento.setAnnoProtocollo(new Long(cal.get(Calendar.YEAR)));
      }

      // 08/02/2018 - La data e l'ora del protocollo viene impostata con la data
      // e l'ora corrente di sistema
      Calendar dataProtocolloToday = Calendar.getInstance();
      wsdmprotocolloDocumento.setDataProtocollo(dataProtocolloToday.getTime());

      // Lettura codice eventuale fascicolo inserito
      if (respProtocolloArrivo.getClassificazioni() != null) {
        List<String> listaClassificazioni = respProtocolloArrivo.getClassificazioni().getString();
        if (listaClassificazioni != null && !listaClassificazioni.isEmpty() && listaClassificazioni.size() > 0) {
          WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();
          wsdmFascicolo.setCodiceFascicolo(listaClassificazioni.get(0));
          wsdmprotocolloDocumento.setFascicolo(wsdmFascicolo);
        }
      }

      wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmprotocolloDocumento);

      // Invio degli allegati
      String messaggioAddAllegati = "";
      this._addAllegatiDocumentoProtocollo(username, password, loginAttr, numeroDocumento, allegatiHash, messaggioAddAllegati);
      wsdmprotocolloDocumentoRes.setMessaggio(messaggioAddAllegati);

    }

  }

  /**
   * Inserisce il protocollo in partenza/uscita.
   * 
   * @param username
   * @param password
   * @param loginAttr
   * @param wsdmprotocolloDocumentoIn
   * @param wsdmprotocolloDocumentoRes
   * @param inOut
   * @throws Exception
   */
  private void _protocolloInserisciPartenza(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn, WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes,
      AllegatoHash[] allegatiHash) throws Exception {
    IPaleoService iPaleoService = this.getIPaleoService(username, password);
    ReqProtocolloPartenza reqProtocolloPartenza = new ReqProtocolloPartenza();

    // Operatore
    OperatorePaleo operatorePaleo = _getOperatore(loginAttr);
    reqProtocolloPartenza.setOperatore(operatorePaleo);

    // Codice registro
    String codiceRegistro = wsdmprotocolloDocumentoIn.getCodiceRegistro();
    reqProtocolloPartenza.setCodiceRegistro(codiceRegistro);

    // Oggetto
    String oggetto = wsdmprotocolloDocumentoIn.getOggetto();
    reqProtocolloPartenza.setOggetto(oggetto);

    // Documento privato
    // 16/07/2019 - Modifica richiesta per rendere privato il documento e
    // successivamente assegnarlo con la "trasmissione".
    boolean documentoPrivato = true;
    try {
      String pdr = InitialContext.doLookup(PALEO_DOCUMENTOPRIVATO);
      if (pdr != null && pdr.toLowerCase().equals("false")) {
        documentoPrivato = false;
      }
    } catch (NamingException e) {

    }
    reqProtocolloPartenza.setPrivato(documentoPrivato);

    // Tipo documento principale originale
    WSDMTipoDocumentoPrincipaleOriginale tipoDocumentoPrincipaleOriginale = wsdmprotocolloDocumentoIn.getTipoDocumentoPrincipaleOriginale();
    if (tipoDocumentoPrincipaleOriginale != null) {
      if (tipoDocumentoPrincipaleOriginale.equals(WSDMTipoDocumentoPrincipaleOriginale.NON_DEFINITO)) {
        reqProtocolloPartenza.setDocumentoPrincipaleOriginale(TipoOriginale.NON_DEFINITO);
      } else if (tipoDocumentoPrincipaleOriginale.equals(WSDMTipoDocumentoPrincipaleOriginale.DIGITALE)) {
        reqProtocolloPartenza.setDocumentoPrincipaleOriginale(TipoOriginale.DIGITALE);
      } else if (tipoDocumentoPrincipaleOriginale.equals(WSDMTipoDocumentoPrincipaleOriginale.CARTACEO)) {
        reqProtocolloPartenza.setDocumentoPrincipaleOriginale(TipoOriginale.CARTACEO);
      }
    }

    // Documento acquisito integralmente
    reqProtocolloPartenza.setDocumentoPrincipaleAcquisitoIntegralmente(true);

    // Documento principale e documenti allegati
    WSDMProtocolloAllegato[] wsdmprotocolloAllegati = wsdmprotocolloDocumentoIn.getAllegati();
    if (wsdmprotocolloAllegati != null && wsdmprotocolloAllegati.length > 0) {
      // Il primo documento viene inserito come documento principale
      File documentoPrincipale = new File();
      documentoPrincipale.setNome(wsdmprotocolloAllegati[0].getNome());
      documentoPrincipale.setEstensione(wsdmprotocolloAllegati[0].getTipo());

      // Il contenuto del documento principale deve essere sempre fornito.
      // Se non indicato il servizio restituisce il messaggio
      // "Contenuto del documento principale mancante"
      documentoPrincipale.setStream(wsdmprotocolloAllegati[0].getContenuto());

      String improntaDocumentoPrincipale = getImpronta(wsdmprotocolloAllegati[0].getContenuto());
      documentoPrincipale.setImpronta(improntaDocumentoPrincipale);

      reqProtocolloPartenza.setDocumentoPrincipale(documentoPrincipale);

      // I documenti con indice superiore ad 1 vengono inseriti come
      // documenti allegati

      // 09/07/2019 - Modifica struttura dei servizi. Ogni file allegato
      // (file oltre il documento principale) deve essere indicato, in fase
      // di protocollazione, con il suo hash calcolato in SHA-256.
      // Successivamente, con l'operazione "AddAllegatiDocumentoProtocollo"
      // potra' essere inviato il file effettivo.
      // In questo contesto non deve essere piu' inviato lo stream.
      if (wsdmprotocolloAllegati.length > 1) {

        allegatiHash = new AllegatoHash[wsdmprotocolloAllegati.length - 1];

        ArrayOfAllegato arrayOfAllegato = new ArrayOfAllegato();
        for (int ai = 1; ai < wsdmprotocolloAllegati.length; ai++) {
          Allegato allegato = new Allegato();
          allegato.setDescrizione(wsdmprotocolloAllegati[ai].getTitolo());
          File documentoAllegato = new File();
          documentoAllegato.setNome(wsdmprotocolloAllegati[ai].getNome());
          documentoAllegato.setEstensione(wsdmprotocolloAllegati[ai].getTipo());

          // Lo stream per gli allegati non deve essere indicato.
          // Se si indica lo stream il servizio restituisce il seguente
          // messaggio:
          // "In fase di registrazione/protocollazione non è possibile inserire più di 0 allegati."
          // Se non si indica lo stream il servizio risponde con il messaggio:
          // "Object reference not set to an instance of an object."

          // Calcolo hash SHA-256
          String impronta = getImpronta(wsdmprotocolloAllegati[ai].getContenuto());
          documentoAllegato.setImpronta(impronta);

          // Salvataggio sulla struttura "allegatoHash" per il successivo invio,
          // del file, a PALEO.
          allegatiHash[ai - 1] = new AllegatoHash();
          allegatiHash[ai - 1].setTipo(wsdmprotocolloAllegati[ai].getTipo());
          allegatiHash[ai - 1].setNome(wsdmprotocolloAllegati[ai].getNome());
          allegatiHash[ai - 1].setContenuto(wsdmprotocolloAllegati[ai].getContenuto());
          allegatiHash[ai - 1].setTitolo(wsdmprotocolloAllegati[ai].getTitolo());
          allegatiHash[ai - 1].setHash(impronta);

          allegato.setDocumento(documentoAllegato);
          arrayOfAllegato.getAllegato().add(allegato);

        }
        reqProtocolloPartenza.setDocumentiAllegati(arrayOfAllegato);
      }
    }

    // Documento principale acquisito integralmente
    reqProtocolloPartenza.setDocumentoPrincipaleAcquisitoIntegralmente(true);

    // Classificazioni, fascicolo... (possibile inserimento su fascicolo
    // esistente o su nuovo fascicolo)
    WSDMInserimentoInFascicolo inserimentoInFascicolo = wsdmprotocolloDocumentoIn.getInserimentoInFascicolo();
    if (inserimentoInFascicolo != null) {
      if (WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO.equals(inserimentoInFascicolo)) {
        ArrayOfClassificazione arrayOfClassificazione = new ArrayOfClassificazione();
        Classificazione classificazione = new Classificazione();
        DatiNuovoFascicolo datiNuovoFascicolo = new DatiNuovoFascicolo();
        datiNuovoFascicolo.setCodiceClassifica(wsdmprotocolloDocumentoIn.getFascicolo().getClassificaFascicolo());
        datiNuovoFascicolo.setDescrizione(wsdmprotocolloDocumentoIn.getFascicolo().getOggettoFascicolo());
        datiNuovoFascicolo.setCustode(operatorePaleo);
        classificazione.setNuovoFascicolo(datiNuovoFascicolo);
        arrayOfClassificazione.getClassificazione().add(classificazione);
        reqProtocolloPartenza.setClassificazioni(arrayOfClassificazione);
      } else if (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(inserimentoInFascicolo)) {
        ArrayOfClassificazione arrayOfClassificazione = new ArrayOfClassificazione();
        Classificazione classificazione = new Classificazione();
        classificazione.setCodiceFascicolo(wsdmprotocolloDocumentoIn.getFascicolo().getCodiceFascicolo());
        arrayOfClassificazione.getClassificazione().add(classificazione);
        reqProtocolloPartenza.setClassificazioni(arrayOfClassificazione);
      }
    }

    // Destinatari per il protocollo in partenza (devono essere indicati
    // come destinatari occasionali)
    WSDMProtocolloAnagrafica[] destinatari = wsdmprotocolloDocumentoIn.getDestinatari();
    if (destinatari != null && destinatari.length > 0) {
      ArrayOfCorrispondente arrayOfCorrispondente = new ArrayOfCorrispondente();
      for (int d = 0; d < destinatari.length; d++) {
        Corrispondente corrispondente = new Corrispondente();
        DatiCorrispondente datiCorrispondente = new DatiCorrispondente();
        datiCorrispondente.setNome(destinatari[d].getNome());
        datiCorrispondente.setCognome(destinatari[d].getCognomeointestazione());
        datiCorrispondente.setIdFiscale(destinatari[d].getCodiceFiscale());
        datiCorrispondente.setEmail(destinatari[d].getEmail());
        datiCorrispondente.setIstatComune(destinatari[d].getIstatComune());

        WSDMTipoVoceRubrica tipoVoceRubrica = destinatari[d].getTipoVoceRubrica();
        if (tipoVoceRubrica != null) {
          if (tipoVoceRubrica.equals(WSDMTipoVoceRubrica.ALTRO)) {
            datiCorrispondente.setTipo(TipoVoceRubrica.ALTRO);
          } else if (tipoVoceRubrica.equals(WSDMTipoVoceRubrica.AMMINISTRAZIONE)) {
            datiCorrispondente.setTipo(TipoVoceRubrica.AMMINISTRAZIONE);
          } else if (tipoVoceRubrica.equals(WSDMTipoVoceRubrica.AOO)) {
            datiCorrispondente.setTipo(TipoVoceRubrica.AOO);
          } else if (tipoVoceRubrica.equals(WSDMTipoVoceRubrica.IMPRESA)) {
            datiCorrispondente.setTipo(TipoVoceRubrica.IMPRESA);
          } else if (tipoVoceRubrica.equals(WSDMTipoVoceRubrica.INDEFINITO)) {
            datiCorrispondente.setTipo(TipoVoceRubrica.INDEFINITO);
          } else if (tipoVoceRubrica.equals(WSDMTipoVoceRubrica.PERSONA)) {
            datiCorrispondente.setTipo(TipoVoceRubrica.PERSONA);
          } else if (tipoVoceRubrica.equals(WSDMTipoVoceRubrica.UO)) {
            datiCorrispondente.setTipo(TipoVoceRubrica.UO);
          }
        }

        corrispondente.setCorrispondenteOccasionale(datiCorrispondente);
        arrayOfCorrispondente.getCorrispondente().add(corrispondente);
      }
      reqProtocolloPartenza.setDestinatari(arrayOfCorrispondente);
    }

    // Inoltro richiesta di protocollo in partenza e lettura della
    // risposta
    RespProtocolloPartenza respProtocolloPartenza = iPaleoService.protocollazionePartenza(reqProtocolloPartenza);
    wsdmprotocolloDocumentoRes.setMessaggio(respProtocolloPartenza.getMessaggioRisultato().getDescrizione());
    if (TipoRisultato.ERROR.equals(respProtocolloPartenza.getMessaggioRisultato().getTipoRisultato())) {
      wsdmprotocolloDocumentoRes.setEsito(false);
    } else {
      wsdmprotocolloDocumentoRes.setEsito(true);
      WSDMProtocolloDocumento wsdmprotocolloDocumento = new WSDMProtocolloDocumento();

      String numeroDocumento = String.valueOf(respProtocolloPartenza.getDocNumber());
      wsdmprotocolloDocumento.setNumeroDocumento(numeroDocumento);

      wsdmprotocolloDocumento.setNumeroProtocollo(respProtocolloPartenza.getNumero());
      XMLGregorianCalendar dataProtocollo = respProtocolloPartenza.getDataProtocollazione();
      if (dataProtocollo != null) {
        // wsdmprotocolloDocumento.setDataProtocollo(dataProtocollo.toGregorianCalendar().getTime());
        Calendar cal = Calendar.getInstance();
        cal.setTime(dataProtocollo.toGregorianCalendar().getTime());
        wsdmprotocolloDocumento.setAnnoProtocollo(new Long(cal.get(Calendar.YEAR)));
      }
      // 08/02/2018 - La data e l'ora del protocollo viene impostata con la data
      // e l'ora corrente di sistema
      Calendar dataProtocolloToday = Calendar.getInstance();
      wsdmprotocolloDocumento.setDataProtocollo(dataProtocolloToday.getTime());

      // Lettura codice eventuale fascicolo inserito
      if (respProtocolloPartenza.getClassificazioni() != null) {
        List<String> listaClassificazioni = respProtocolloPartenza.getClassificazioni().getString();
        if (listaClassificazioni != null && !listaClassificazioni.isEmpty() && listaClassificazioni.size() > 0) {
          WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();
          wsdmFascicolo.setCodiceFascicolo(listaClassificazioni.get(0));
          wsdmprotocolloDocumento.setFascicolo(wsdmFascicolo);
        }
      }

      wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmprotocolloDocumento);

      // Invio degli allegati
      String messaggioAddAllegati = null;
      this._addAllegatiDocumentoProtocollo(username, password, loginAttr, numeroDocumento, allegatiHash, messaggioAddAllegati);
      wsdmprotocolloDocumentoRes.setMessaggio(messaggioAddAllegati);

    }

  }

  /**
   * Calcolo dell'impronta dello stream.
   * 
   * @param stream
   * @return
   * @throws NoSuchAlgorithmException
   */
  private String getImpronta(byte[] stream) throws NoSuchAlgorithmException {
    MessageDigest digest = MessageDigest.getInstance("SHA-256");
    byte[] hash = digest.digest(stream);
    String impronta = javax.xml.bind.DatatypeConverter.printHexBinary(hash);
    return impronta;
  }

  @Override
  public WSDMProtocolloDocumentoRes _protocolloLeggi(String username, String password, WSDMLoginAttr loginAttr, Long annoProtocollo,
      String numeroProtocollo) {
    // L'operazione non e' disponibile in quanto per l'interrogazione e'
    // richiesta la "segnatura". Questo valore non e' memorizzato nei "client" e
    // non e' nemmeno possibile ricavarlo dall'anno o dal numero protocollo.
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    wsdmprotocolloDocumentoRes.setEsito(false);
    wsdmprotocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmprotocolloDocumentoRes;
  }

  @Override
  public WSDMProtocolloDocumentoRes _documentoInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    AllegatoHash[] allegatoHash = null;

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (PaleoUtilityControllo.ctrDocumentoInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {
        _archiviaDocumentoInterno(username, password, loginAttr, wsdmprotocolloDocumentoIn, wsdmprotocolloDocumentoRes, allegatoHash);
      } else {
        // Non sono stati superati i controlli di validita'
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

  /**
   * Archivia un documento interno. In questo caso non c'e' alcun verso in
   * ingresso/arrivo (IN) o uscita/partenza (OUT) ma l'unico verso gestito e'
   * quello interno (INT).
   * 
   * @param username
   * @param password
   * @param loginAttr
   * @param wsdmprotocolloDocumentoIn
   * @param wsdmprotocolloDocumentoRes
   * @throws Exception
   */
  private void _archiviaDocumentoInterno(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn, WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes,
      AllegatoHash[] allegatiHash) throws Exception {
    IPaleoService iPaleoService = this.getIPaleoService(username, password);
    ReqDocumento reqDocumento = new ReqDocumento();

    // Operatore
    OperatorePaleo operatorePaleo = _getOperatore(loginAttr);
    reqDocumento.setOperatore(operatorePaleo);

    // Oggetto
    String oggetto = wsdmprotocolloDocumentoIn.getOggetto();
    reqDocumento.setOggetto(oggetto);

    // Documento privato
    // 16/07/2019 - Modifica richiesta per rendere privato il documento e
    // successivamente assegnarlo con la "trasmissione".
    boolean documentoPrivato = true;
    try {
      String pdr = InitialContext.doLookup(PALEO_DOCUMENTOPRIVATO);
      if (pdr != null && pdr.toLowerCase().equals("false")) {
        documentoPrivato = false;
      }
    } catch (NamingException e) {

    }
    reqDocumento.setPrivato(documentoPrivato);

    // Tipo documento principale originale
    WSDMTipoDocumentoPrincipaleOriginale tipoDocumentoPrincipaleOriginale = wsdmprotocolloDocumentoIn.getTipoDocumentoPrincipaleOriginale();
    if (tipoDocumentoPrincipaleOriginale != null) {
      if (tipoDocumentoPrincipaleOriginale.equals(WSDMTipoDocumentoPrincipaleOriginale.NON_DEFINITO)) {
        reqDocumento.setDocumentoPrincipaleOriginale(TipoOriginale.NON_DEFINITO);
      } else if (tipoDocumentoPrincipaleOriginale.equals(WSDMTipoDocumentoPrincipaleOriginale.DIGITALE)) {
        reqDocumento.setDocumentoPrincipaleOriginale(TipoOriginale.DIGITALE);
      } else if (tipoDocumentoPrincipaleOriginale.equals(WSDMTipoDocumentoPrincipaleOriginale.CARTACEO)) {
        reqDocumento.setDocumentoPrincipaleOriginale(TipoOriginale.CARTACEO);
      }
    }

    // Documento acquisito integralmente
    reqDocumento.setDocumentoPrincipaleAcquisitoIntegralmente(true);

    // Documento principale e documenti allegati
    WSDMProtocolloAllegato[] wsdmprotocolloAllegati = wsdmprotocolloDocumentoIn.getAllegati();
    if (wsdmprotocolloAllegati != null && wsdmprotocolloAllegati.length > 0) {
      // Il primo documento viene inserito come documento principale
      File documentoPrincipale = new File();
      documentoPrincipale.setNome(wsdmprotocolloAllegati[0].getNome());
      documentoPrincipale.setEstensione(wsdmprotocolloAllegati[0].getTipo());
      documentoPrincipale.setStream(wsdmprotocolloAllegati[0].getContenuto());

      String improntaDocumentoPrincipale = getImpronta(wsdmprotocolloAllegati[0].getContenuto());
      documentoPrincipale.setImpronta(improntaDocumentoPrincipale);

      reqDocumento.setDocumentoPrincipale(documentoPrincipale);

      // I documenti con indice superiore ad 1 vengono inseriti come
      // documenti allegati
      // 09/07/2019 - Modifica struttura dei servizi. Ogni file allegato
      // (file oltre il documento principale) deve essere indicato, in fase
      // di protocollazione, con il suo hash calcolato in SHA-256.
      // Successivamente, con l'operazione "AddAllegatiDocumentoProtocollo"
      // potra' essere inviato il file effettivo.
      // In questo contesto non deve essere piu' inviato lo stream.

      if (wsdmprotocolloAllegati.length > 1) {

        allegatiHash = new AllegatoHash[wsdmprotocolloAllegati.length - 1];

        ArrayOfAllegato arrayOfAllegato = new ArrayOfAllegato();
        for (int ai = 1; ai < wsdmprotocolloAllegati.length; ai++) {
          Allegato allegato = new Allegato();
          allegato.setDescrizione(wsdmprotocolloAllegati[ai].getTitolo());
          File documentoAllegato = new File();
          documentoAllegato.setNome(wsdmprotocolloAllegati[ai].getNome());
          documentoAllegato.setEstensione(wsdmprotocolloAllegati[ai].getTipo());

          // Calcolo hash SHA-256
          String impronta = getImpronta(wsdmprotocolloAllegati[ai].getContenuto());
          documentoAllegato.setImpronta(impronta);

          // Salvataggio sulla struttura "allegatoHash" per il successivo invio,
          // del file, a PALEO.
          allegatiHash[ai - 1] = new AllegatoHash();
          allegatiHash[ai - 1].setTipo(wsdmprotocolloAllegati[ai].getTipo());
          allegatiHash[ai - 1].setNome(wsdmprotocolloAllegati[ai].getNome());
          allegatiHash[ai - 1].setContenuto(wsdmprotocolloAllegati[ai].getContenuto());
          allegatiHash[ai - 1].setTitolo(wsdmprotocolloAllegati[ai].getTitolo());
          allegatiHash[ai - 1].setHash(impronta);

          allegato.setDocumento(documentoAllegato);
          arrayOfAllegato.getAllegato().add(allegato);
        }
        reqDocumento.setDocumentiAllegati(arrayOfAllegato);
      }
    }

    // Documento principale acquisito integralmente
    reqDocumento.setDocumentoPrincipaleAcquisitoIntegralmente(true);

    // Classificazioni, fascicolo... (possibile inserimento su fascicolo
    // esistente o su nuovo fascicolo)
    WSDMInserimentoInFascicolo inserimentoInFascicolo = wsdmprotocolloDocumentoIn.getInserimentoInFascicolo();
    if (inserimentoInFascicolo != null) {
      if (WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO.equals(inserimentoInFascicolo)) {
        ArrayOfClassificazione arrayOfClassificazione = new ArrayOfClassificazione();
        Classificazione classificazione = new Classificazione();
        DatiNuovoFascicolo datiNuovoFascicolo = new DatiNuovoFascicolo();
        datiNuovoFascicolo.setCodiceClassifica(wsdmprotocolloDocumentoIn.getFascicolo().getClassificaFascicolo());
        datiNuovoFascicolo.setDescrizione(wsdmprotocolloDocumentoIn.getFascicolo().getOggettoFascicolo());
        datiNuovoFascicolo.setCustode(operatorePaleo);
        classificazione.setNuovoFascicolo(datiNuovoFascicolo);
        arrayOfClassificazione.getClassificazione().add(classificazione);
        reqDocumento.setClassificazioni(arrayOfClassificazione);
      } else if (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(inserimentoInFascicolo)) {
        ArrayOfClassificazione arrayOfClassificazione = new ArrayOfClassificazione();
        Classificazione classificazione = new Classificazione();
        classificazione.setCodiceFascicolo(wsdmprotocolloDocumentoIn.getFascicolo().getCodiceFascicolo());
        arrayOfClassificazione.getClassificazione().add(classificazione);
        reqDocumento.setClassificazioni(arrayOfClassificazione);
      }
    }

    RespDocumento respDocumento = iPaleoService.archiviaDocumentoInterno(reqDocumento);
    wsdmprotocolloDocumentoRes.setMessaggio(respDocumento.getMessaggioRisultato().getDescrizione());
    if (TipoRisultato.ERROR.equals(respDocumento.getMessaggioRisultato().getTipoRisultato())) {
      wsdmprotocolloDocumentoRes.setEsito(false);
    } else {
      wsdmprotocolloDocumentoRes.setEsito(true);
      WSDMProtocolloDocumento wsdmprotocolloDocumento = new WSDMProtocolloDocumento();

      String numeroDocumento = String.valueOf(respDocumento.getDocNumber());
      wsdmprotocolloDocumento.setNumeroDocumento(numeroDocumento);

      // Lettura codice eventuale fascicolo inserito
      if (respDocumento.getClassificazioni() != null) {
        List<String> listaClassificazioni = respDocumento.getClassificazioni().getString();
        if (listaClassificazioni != null && !listaClassificazioni.isEmpty() && listaClassificazioni.size() > 0) {
          WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();
          wsdmFascicolo.setCodiceFascicolo(listaClassificazioni.get(0));
          wsdmprotocolloDocumento.setFascicolo(wsdmFascicolo);
        }
      }

      wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmprotocolloDocumento);

      // Invio degli allegati
      String messaggioAddAllegati = null;
      this._addAllegatiDocumentoProtocollo(username, password, loginAttr, numeroDocumento, allegatiHash, messaggioAddAllegati);
      wsdmprotocolloDocumentoRes.setMessaggio(messaggioAddAllegati);

    }
  }

  @Override
  public WSDMProtocolloDocumentoRes _documentoLeggi(String username, String password, WSDMLoginAttr loginAttr, String numeroDocumento) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (PaleoUtilityControllo.ctrDocumentoLeggi(loginAttr, numeroDocumento, messaggioCtr)) {
        IPaleoService iPaleoService = this.getIPaleoService(username, password);
        ReqCercaProtocollo reqCercaProtocollo = new ReqCercaProtocollo();
        OperatorePaleo operatorePaleo = _getOperatore(loginAttr);
        reqCercaProtocollo.setOperatore(operatorePaleo);
        reqCercaProtocollo.setDocNumber(numeroDocumento);
        Object resp = iPaleoService.cercaDocumentoProtocollo(reqCercaProtocollo);
        // La lettura del documento (mediante numeroDocumento) permette di
        // leggere i documenti protocollati nei due versi (arrivo e partenza) ed
        // i documenti interni. Per ogni tipologia di documento e' previsto uno
        // specifico formato di restituzione dei dati.
        if (resp instanceof RespProtocolloArrivoExt) {
          wsdmprotocolloDocumentoRes = this.popolaWSDMPDResDaRespProtArrivoExt(username, password, loginAttr,
              (RespProtocolloArrivoExt) resp);
        } else if (resp instanceof RespProtocolloPartenzaExt) {
          wsdmprotocolloDocumentoRes = this.popolaWSDMPDResDaRespProtPartenzaExt(username, password, loginAttr,
              (RespProtocolloPartenzaExt) resp);
        } else if (resp instanceof RespDocumentoExt) {
          wsdmprotocolloDocumentoRes = this.popolaWSDMPDResDaRespDocumentoExt(username, password, loginAttr, (RespDocumentoExt) resp);
        }
      } else {
        // Non sono stati superati i controlli di validita'
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
  public WSDMFascicoloRes _fascicoloInserisci(String username, String password, WSDMLoginAttr loginAttr, WSDMFascicoloIn wsdmfascicoloIn) {
    // L'operazione non e' disponibile. L'inserimento di un nuovo fascicolo puo'
    // essere richiesto contestualmente alla richiesta di protocollazione.
    WSDMFascicoloRes wsdmfascicoloRes = new WSDMFascicoloRes();
    wsdmfascicoloRes.setEsito(false);
    wsdmfascicoloRes.setMessaggio(FASCICOLO_OPERATION_NOT_SUPPORTED);
    return wsdmfascicoloRes;
  }

  @Override
  public WSDMFascicoloRes _fascicoloAggiungiDocumento(String username, String password, WSDMLoginAttr loginAttr, String codiceFascicolo,
      String numeroDocumento) {
    // L'operazione non e' disponibile. Un documento puo' essere aggiunto ad un
    // fascicolo esistente solo contestualmente alla richiesta di inserimento,
    // del documento stesso, nel sistema documentale.
    WSDMFascicoloRes wsdmfascicoloRes = new WSDMFascicoloRes();
    wsdmfascicoloRes.setEsito(false);
    wsdmfascicoloRes.setMessaggio(FASCICOLO_OPERATION_NOT_SUPPORTED);
    return wsdmfascicoloRes;
  }

  @Override
  public WSDMFascicoloRes _fascicoloLeggi(String username, String password, WSDMLoginAttr loginAttr, String codiceFascicolo,
      Long annoFascicolo, String numeroFascicolo, String classificaFascicolo) {

    WSDMFascicoloRes wsdmfascicoloRes = new WSDMFascicoloRes();

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (PaleoUtilityControllo.ctrFascicoloLeggi(loginAttr, codiceFascicolo, annoFascicolo, numeroFascicolo, messaggioCtr)) {
        IPaleoService iPaleoService = this.getIPaleoService(username, password);

        // Parametri di ricerca del fascicolo
        ReqDocProtocolliInFascicolo reqDocProtocolliInFascicolo = new ReqDocProtocolliInFascicolo();
        OperatorePaleo operatorePaleo = _getOperatore(loginAttr);
        reqDocProtocolliInFascicolo.setOperatore(operatorePaleo);
        reqDocProtocolliInFascicolo.setSoloPubblici(false);
        reqDocProtocolliInFascicolo.setCodiceFascicolo(codiceFascicolo);

        BEListOfrespDocProtocolliInfoZA0HwLp5 listOfDocProt = iPaleoService.getDocumentiProtocolliInFascicolo(reqDocProtocolliInFascicolo);

        wsdmfascicoloRes.setMessaggio(listOfDocProt.getMessaggioRisultato().getDescrizione());
        if (TipoRisultato.ERROR.equals(listOfDocProt.getMessaggioRisultato().getTipoRisultato())) {
          wsdmfascicoloRes.setEsito(false);
        } else {
          wsdmfascicoloRes.setEsito(true);
          ArrayOfrespDocProtocolliInfo arrayOfDocProt = listOfDocProt.getLista();
          WSDMFascicolo wsdmfascicolo = new WSDMFascicolo();

          if (arrayOfDocProt != null
              && !arrayOfDocProt.getRespDocProtocolliInfo().isEmpty()
              && arrayOfDocProt.getRespDocProtocolliInfo().size() > 0) {
            WSDMFascicoloDocumento[] documenti = new WSDMFascicoloDocumento[arrayOfDocProt.getRespDocProtocolliInfo().size()];
            for (int dc = 0; dc < arrayOfDocProt.getRespDocProtocolliInfo().size(); dc++) {
              documenti[dc] = new WSDMFascicoloDocumento();
              RespDocProtocolliInfo respDocProtocolliInfo = arrayOfDocProt.getRespDocProtocolliInfo().get(dc);

              XMLGregorianCalendar dataProtocollo = respDocProtocolliInfo.getDataProtocollo();
              if (dataProtocollo != null) {
                documenti[dc].setDataProtocollo(dataProtocollo.toGregorianCalendar().getTime());
                documenti[dc].setAnnoProtocollo(new Long(dataProtocollo.getYear()));
              }
              documenti[dc].setNumeroDocumento(String.valueOf(respDocProtocolliInfo.getDocNumber()));
              documenti[dc].setOggetto(respDocProtocolliInfo.getOggetto());
              if (respDocProtocolliInfo.getNumeroProtocollo() != null) {
                documenti[dc].setNumeroProtocollo(String.valueOf(respDocProtocolliInfo.getNumeroProtocollo()));
              }
              documenti[dc].setSegnaturaProtocollo(respDocProtocolliInfo.getSegnaturaProtocollo());

              TipoProtocollo tipoProtocollo = respDocProtocolliInfo.getTipoProtocollo();
              if (TipoProtocollo.INGRESSO.equals(tipoProtocollo)) {
                documenti[dc].setInout(WSDMProtocolloInOut.IN);
              } else if (TipoProtocollo.USCITA.equals(tipoProtocollo)) {
                documenti[dc].setInout(WSDMProtocolloInOut.OUT);
              } else {
                documenti[dc].setInout(WSDMProtocolloInOut.INT);
              }
            }
            wsdmfascicolo.setDocumenti(documenti);
          }
          wsdmfascicoloRes.setFascicolo(wsdmfascicolo);
        }
      } else {
        // Non sono stati superati i controlli di validita'
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
   * Gestione operatore
   * 
   * @param loginAttr
   * @return
   */
  private OperatorePaleo _getOperatore(WSDMLoginAttr loginAttr) {
    OperatorePaleo operatorePaleo = new OperatorePaleo();
    operatorePaleo.setNome(loginAttr.getNome());
    operatorePaleo.setCognome(loginAttr.getCognome());
    operatorePaleo.setCodiceUO(loginAttr.getCodiceUO());
    operatorePaleo.setRuolo(loginAttr.getRuolo());
    return operatorePaleo;
  }

  /**
   * Popola l'oggetto WSDMProtocolloDocumentoRes sulla base del protocollo in
   * partenza.
   * 
   * @param respProtocolloPartenzaExt
   * @return
   */
  private WSDMProtocolloDocumentoRes popolaWSDMPDResDaRespProtPartenzaExt(String username, String password, WSDMLoginAttr loginAttr,
      RespProtocolloPartenzaExt respProtocolloPartenzaExt) throws Exception {

    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    wsdmprotocolloDocumentoRes.setMessaggio(respProtocolloPartenzaExt.getMessaggioRisultato().getDescrizione());

    if (TipoRisultato.ERROR.equals(respProtocolloPartenzaExt.getMessaggioRisultato().getTipoRisultato())) {
      wsdmprotocolloDocumentoRes.setEsito(false);
    } else {
      wsdmprotocolloDocumentoRes.setEsito(true);

      WSDMProtocolloDocumento wsdmprotocolloDocumento = new WSDMProtocolloDocumento();
      wsdmprotocolloDocumento.setInout(WSDMProtocolloInOut.OUT);

      // Documento principale e documenti allegati
      File documentoPrincipale = respProtocolloPartenzaExt.getDocumentoPrincipale();
      ArrayOfAllegato arrayOfAllegato = respProtocolloPartenzaExt.getAllegati();
      if (documentoPrincipale != null) {
        if (arrayOfAllegato != null && !arrayOfAllegato.getAllegato().isEmpty() && arrayOfAllegato.getAllegato().size() > 0) {
          int sizeArrayOfAllegato = arrayOfAllegato.getAllegato().size();
          WSDMProtocolloAllegato[] allegati = new WSDMProtocolloAllegato[sizeArrayOfAllegato + 1];

          // Documento principale
          allegati[0] = new WSDMProtocolloAllegato();
          byte[] contenutoDocumentoPrincipale = this._getFile(username, password, loginAttr, documentoPrincipale.getIdFile());
          allegati[0].setContenuto(contenutoDocumentoPrincipale);
          allegati[0].setNome(documentoPrincipale.getNome() + "." + documentoPrincipale.getEstensione());
          allegati[0].setTipo(documentoPrincipale.getEstensione());
          allegati[0].setTitolo("Allegato principale");

          // Ulteriori documenti allegati
          for (int ao = 0; ao < arrayOfAllegato.getAllegato().size(); ao++) {
            Allegato allegato = arrayOfAllegato.getAllegato().get(ao);
            String nome = allegato.getDocumento().getNome();
            String titolo = allegato.getDescrizione();
            String tipo = allegato.getDocumento().getEstensione();
            byte[] contenuto = this._getFile(username, password, loginAttr, allegato.getDocumento().getIdFile());
            allegati[ao + 1] = new WSDMProtocolloAllegato();
            allegati[ao + 1].setContenuto(contenuto);
            allegati[ao + 1].setNome(nome + "." + tipo);
            allegati[ao + 1].setTipo(tipo);
            allegati[ao + 1].setTitolo(titolo);
          }
          wsdmprotocolloDocumento.setAllegati(allegati);

        } else {
          // Solo documento principale
          WSDMProtocolloAllegato[] allegati = new WSDMProtocolloAllegato[1];
          allegati[0] = new WSDMProtocolloAllegato();
          byte[] contenutoDocumentoPrincipale = this._getFile(username, password, loginAttr, documentoPrincipale.getIdFile());
          allegati[0].setContenuto(contenutoDocumentoPrincipale);
          allegati[0].setNome(documentoPrincipale.getNome());
          allegati[0].setTipo(documentoPrincipale.getEstensione());
          wsdmprotocolloDocumento.setAllegati(allegati);
        }
      }

      // Numero del documento
      wsdmprotocolloDocumento.setNumeroDocumento(String.valueOf(respProtocolloPartenzaExt.getDocNumber()));

      // Anno del protocollo
      if (respProtocolloPartenzaExt.getDataProtocollazione() != null) {
        wsdmprotocolloDocumento.setAnnoProtocollo(new Long(respProtocolloPartenzaExt.getDataProtocollazione().getYear()));
      }

      // Destinatari
      ArrayOfstring arrayOfDestinatari = respProtocolloPartenzaExt.getDestinatari();
      if (arrayOfDestinatari != null && !arrayOfDestinatari.getString().isEmpty() && arrayOfDestinatari.getString().size() > 0) {
        WSDMProtocolloAnagrafica[] anagrafiche = new WSDMProtocolloAnagrafica[arrayOfDestinatari.getString().size()];
        for (int dest = 0; dest < arrayOfDestinatari.getString().size(); dest++) {
          String cognomeNome = arrayOfDestinatari.getString().get(dest);
          anagrafiche[dest] = new WSDMProtocolloAnagrafica();
          anagrafiche[dest].setCognomeointestazione(cognomeNome);
        }
        wsdmprotocolloDocumento.setDestinatari(anagrafiche);
      }

      // Numero del protocollo
      wsdmprotocolloDocumento.setNumeroProtocollo(respProtocolloPartenzaExt.getNumero());

      // Oggetto del documento inserito/protocollo
      wsdmprotocolloDocumento.setOggetto(respProtocolloPartenzaExt.getOggetto());

      // Lettura codice eventuale fascicolo inserito
      if (respProtocolloPartenzaExt.getClassificazioni() != null) {
        List<String> listaClassificazioni = respProtocolloPartenzaExt.getClassificazioni().getString();
        if (listaClassificazioni != null && !listaClassificazioni.isEmpty() && listaClassificazioni.size() > 0) {
          WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();
          wsdmFascicolo.setCodiceFascicolo(listaClassificazioni.get(0));
          wsdmprotocolloDocumento.setFascicolo(wsdmFascicolo);
        }
      }

      wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmprotocolloDocumento);
    }
    return wsdmprotocolloDocumentoRes;
  }

  /**
   * Popola l'oggetto WSDMProtocolloDocumentoRes sulla base del protocollo in
   * arrivo.
   * 
   * @param respProtocolloArrivoExt
   * @return
   */
  private WSDMProtocolloDocumentoRes popolaWSDMPDResDaRespProtArrivoExt(String username, String password, WSDMLoginAttr loginAttr,
      RespProtocolloArrivoExt respProtocolloArrivoExt) throws Exception {

    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    wsdmprotocolloDocumentoRes.setMessaggio(respProtocolloArrivoExt.getMessaggioRisultato().getDescrizione());

    if (TipoRisultato.ERROR.equals(respProtocolloArrivoExt.getMessaggioRisultato().getTipoRisultato())) {
      wsdmprotocolloDocumentoRes.setEsito(false);
    } else {
      wsdmprotocolloDocumentoRes.setEsito(true);

      WSDMProtocolloDocumento wsdmprotocolloDocumento = new WSDMProtocolloDocumento();
      wsdmprotocolloDocumento.setInout(WSDMProtocolloInOut.IN);

      // Documento principale e documenti allegati
      File documentoPrincipale = respProtocolloArrivoExt.getDocumentoPrincipale();
      ArrayOfAllegato arrayOfAllegato = respProtocolloArrivoExt.getAllegati();
      if (documentoPrincipale != null) {
        if (arrayOfAllegato != null && !arrayOfAllegato.getAllegato().isEmpty() && arrayOfAllegato.getAllegato().size() > 0) {
          int sizeArrayOfAllegato = arrayOfAllegato.getAllegato().size();
          WSDMProtocolloAllegato[] allegati = new WSDMProtocolloAllegato[sizeArrayOfAllegato + 1];

          // Documento principale
          allegati[0] = new WSDMProtocolloAllegato();
          byte[] contenutoDocumentoPrincipale = this._getFile(username, password, loginAttr, documentoPrincipale.getIdFile());
          allegati[0].setContenuto(contenutoDocumentoPrincipale);
          allegati[0].setNome(documentoPrincipale.getNome() + "." + documentoPrincipale.getEstensione());
          allegati[0].setTipo(documentoPrincipale.getEstensione());
          allegati[0].setTitolo("Allegato principale");

          // Ulteriori documenti allegati
          for (int ao = 0; ao < arrayOfAllegato.getAllegato().size(); ao++) {
            Allegato allegato = arrayOfAllegato.getAllegato().get(ao);
            String nome = allegato.getDocumento().getNome();
            String titolo = allegato.getDescrizione();
            String tipo = allegato.getDocumento().getEstensione();
            byte[] contenuto = this._getFile(username, password, loginAttr, allegato.getDocumento().getIdFile());
            allegati[ao + 1] = new WSDMProtocolloAllegato();
            allegati[ao + 1].setContenuto(contenuto);
            allegati[ao + 1].setNome(nome + "." + tipo);
            allegati[ao + 1].setTipo(tipo);
            allegati[ao + 1].setTitolo(titolo);
          }
          wsdmprotocolloDocumento.setAllegati(allegati);

        } else {
          // Solo documento principale
          WSDMProtocolloAllegato[] allegati = new WSDMProtocolloAllegato[1];
          allegati[0] = new WSDMProtocolloAllegato();
          byte[] contenutoDocumentoPrincipale = this._getFile(username, password, loginAttr, documentoPrincipale.getIdFile());
          allegati[0].setContenuto(contenutoDocumentoPrincipale);
          allegati[0].setNome(documentoPrincipale.getNome());
          allegati[0].setTipo(documentoPrincipale.getEstensione());
          wsdmprotocolloDocumento.setAllegati(allegati);
        }
      }

      // Numero del documento
      wsdmprotocolloDocumento.setNumeroDocumento(String.valueOf(respProtocolloArrivoExt.getDocNumber()));

      // Anno Protocollo
      if (respProtocolloArrivoExt.getDataProtocollazione() != null) {
        wsdmprotocolloDocumento.setAnnoProtocollo(new Long(respProtocolloArrivoExt.getDataProtocollazione().getYear()));
      }

      // Mittente
      WSDMProtocolloAnagrafica[] anagrafiche = new WSDMProtocolloAnagrafica[1];
      anagrafiche[0] = new WSDMProtocolloAnagrafica();
      anagrafiche[0].setCognomeointestazione(respProtocolloArrivoExt.getMittente());
      wsdmprotocolloDocumento.setMittenti(anagrafiche);

      // Numero del protocollo
      wsdmprotocolloDocumento.setNumeroProtocollo(respProtocolloArrivoExt.getNumero());

      // Oggetto del documento inserito/protocollo
      wsdmprotocolloDocumento.setOggetto(respProtocolloArrivoExt.getOggetto());

      // Lettura codice eventuale fascicolo inserito
      if (respProtocolloArrivoExt.getClassificazioni() != null) {
        List<String> listaClassificazioni = respProtocolloArrivoExt.getClassificazioni().getString();
        if (listaClassificazioni != null && !listaClassificazioni.isEmpty() && listaClassificazioni.size() > 0) {
          WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();
          wsdmFascicolo.setCodiceFascicolo(listaClassificazioni.get(0));
          wsdmprotocolloDocumento.setFascicolo(wsdmFascicolo);
        }
      }

      wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmprotocolloDocumento);
    }
    return wsdmprotocolloDocumentoRes;
  }

  /**
   * Popola l'oggetto WSDMProtocolloDocumentoRes sulla base di un elemento
   * documentale di tipo RespDocumentoExt.
   * 
   * @param respProtocolloArrivoExt
   * @return
   */
  private WSDMProtocolloDocumentoRes popolaWSDMPDResDaRespDocumentoExt(String username, String password, WSDMLoginAttr loginAttr,
      RespDocumentoExt respDocumentoExt) throws Exception {

    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    wsdmprotocolloDocumentoRes.setMessaggio(respDocumentoExt.getMessaggioRisultato().getDescrizione());

    if (TipoRisultato.ERROR.equals(respDocumentoExt.getMessaggioRisultato().getTipoRisultato())) {
      wsdmprotocolloDocumentoRes.setEsito(false);
    } else {
      wsdmprotocolloDocumentoRes.setEsito(true);

      WSDMProtocolloDocumento wsdmprotocolloDocumento = new WSDMProtocolloDocumento();
      wsdmprotocolloDocumento.setInout(WSDMProtocolloInOut.INT);

      // Documento principale e documenti allegati
      File documentoPrincipale = respDocumentoExt.getDocumentoPrincipale();
      ArrayOfAllegato arrayOfAllegato = respDocumentoExt.getAllegati();
      if (documentoPrincipale != null) {
        if (arrayOfAllegato != null && !arrayOfAllegato.getAllegato().isEmpty() && arrayOfAllegato.getAllegato().size() > 0) {
          int sizeArrayOfAllegato = arrayOfAllegato.getAllegato().size();
          WSDMProtocolloAllegato[] allegati = new WSDMProtocolloAllegato[sizeArrayOfAllegato + 1];

          // Documento principale
          allegati[0] = new WSDMProtocolloAllegato();
          byte[] contenutoDocumentoPrincipale = this._getFile(username, password, loginAttr, documentoPrincipale.getIdFile());
          allegati[0].setContenuto(contenutoDocumentoPrincipale);
          allegati[0].setNome(documentoPrincipale.getNome() + "." + documentoPrincipale.getEstensione());
          allegati[0].setTipo(documentoPrincipale.getEstensione());
          allegati[0].setTitolo("Allegato principale");

          // Ulteriori documenti allegati
          for (int ao = 0; ao < arrayOfAllegato.getAllegato().size(); ao++) {
            Allegato allegato = arrayOfAllegato.getAllegato().get(ao);
            String nome = allegato.getDocumento().getNome();
            String titolo = allegato.getDescrizione();
            String tipo = allegato.getDocumento().getEstensione();
            byte[] contenuto = this._getFile(username, password, loginAttr, allegato.getDocumento().getIdFile());

            allegati[ao + 1] = new WSDMProtocolloAllegato();
            allegati[ao + 1].setContenuto(contenuto);
            allegati[ao + 1].setNome(nome + "." + tipo);
            allegati[ao + 1].setTipo(tipo);
            allegati[ao + 1].setTitolo(titolo);
          }
          wsdmprotocolloDocumento.setAllegati(allegati);

        } else {
          // Solo documento principale
          WSDMProtocolloAllegato[] allegati = new WSDMProtocolloAllegato[1];
          allegati[0] = new WSDMProtocolloAllegato();
          byte[] contenutoDocumentoPrincipale = this._getFile(username, password, loginAttr, documentoPrincipale.getIdFile());
          allegati[0].setContenuto(contenutoDocumentoPrincipale);
          allegati[0].setNome(documentoPrincipale.getNome());
          allegati[0].setTipo(documentoPrincipale.getEstensione());
          wsdmprotocolloDocumento.setAllegati(allegati);
        }
      }

      // Numero del documento
      wsdmprotocolloDocumento.setNumeroDocumento(String.valueOf(respDocumentoExt.getDocNumber()));

      // Anno protocollo
      wsdmprotocolloDocumento.setAnnoProtocollo(null);

      // Numero del protocollo
      wsdmprotocolloDocumento.setNumeroProtocollo(null);

      // Oggetto del documento inserito/protocollo
      wsdmprotocolloDocumento.setOggetto(respDocumentoExt.getOggetto());

      // Lettura codice eventuale fascicolo inserito
      if (respDocumentoExt.getClassificazioni() != null) {
        List<String> listaClassificazioni = respDocumentoExt.getClassificazioni().getString();
        if (listaClassificazioni != null && !listaClassificazioni.isEmpty() && listaClassificazioni.size() > 0) {
          WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();
          wsdmFascicolo.setCodiceFascicolo(listaClassificazioni.get(0));
          wsdmprotocolloDocumento.setFascicolo(wsdmFascicolo);
        }
      }

      wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmprotocolloDocumento);
    }
    return wsdmprotocolloDocumentoRes;
  }

  @Override
  public WSDMProtocolloDocumentoRes _attoContrattoLeggi(String username, String password, WSDMLoginAttr loginAttr, String tipo,
      String organo, Long anno, String numero) {
    WSDMProtocolloDocumentoRes wsdmProtocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    wsdmProtocolloDocumentoRes.setEsito(false);
    wsdmProtocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmProtocolloDocumentoRes;
  }

  @Override
  public WSDMInviaMailRes _inviaMail(String username, String password, WSDMLoginAttr loginAttr, WSDMInviaMail wsdmInviaMail) {
    WSDMInviaMailRes wsdmInviaMailRes = new WSDMInviaMailRes();
    try {
      StringBuffer messaggioCtr = new StringBuffer();

      if (PaleoUtilityControllo.ctrInviaMail(loginAttr, wsdmInviaMail, messaggioCtr)) {
        IPaleoService iPaleoService = this.getIPaleoService(username, password);
        OperatorePaleo operatorePaleo = _getOperatore(loginAttr);

        String segnatura = null;
        String numeroDocumento = wsdmInviaMail.getNumeroDocumento();

        // Bisogna cercare la segnatura associata al numero documento indicato.
        // E' necessario, quindi, interrogare il protocollo mediante
        // l'operazione "cercaDocumentoProtocollo". Il protocollo puo' essere in
        // "Arrivo" oppure in "Partenza". In questi due casi e' possibile
        // ottenere la "segnatura", il solo elemento documentale e' privo di
        // segnatura.
        ReqCercaProtocollo reqCercaProtocollo = new ReqCercaProtocollo();
        reqCercaProtocollo.setOperatore(operatorePaleo);
        reqCercaProtocollo.setDocNumber(numeroDocumento);
        Object resp = iPaleoService.cercaDocumentoProtocollo(reqCercaProtocollo);
        if (resp instanceof RespProtocolloArrivoExt) {
          RespProtocolloArrivoExt respProtocolloArrivoExt = (RespProtocolloArrivoExt) resp;
          if (TipoRisultato.ERROR.equals(respProtocolloArrivoExt.getMessaggioRisultato().getTipoRisultato())) {
            wsdmInviaMailRes.setEsito(false);
            wsdmInviaMailRes.setMessaggio(respProtocolloArrivoExt.getMessaggioRisultato().getDescrizione());
          } else {
            segnatura = respProtocolloArrivoExt.getSegnatura();
          }
        } else if (resp instanceof RespProtocolloPartenzaExt) {
          RespProtocolloPartenzaExt respProtocolloPartenzaExt = (RespProtocolloPartenzaExt) resp;
          if (TipoRisultato.ERROR.equals(respProtocolloPartenzaExt.getMessaggioRisultato().getTipoRisultato())) {
            wsdmInviaMailRes.setEsito(false);
            wsdmInviaMailRes.setMessaggio(respProtocolloPartenzaExt.getMessaggioRisultato().getDescrizione());
          } else {
            segnatura = respProtocolloPartenzaExt.getSegnatura();
          }
        } else if (resp instanceof RespDocumentoExt) {
          wsdmInviaMailRes.setEsito(false);
          wsdmInviaMailRes.setMessaggio("Il numero documento non corrisponde ad alcun protocollo");
        }

        // Se e' stata ottenuta la "segnatura" si procede ad effettuare la
        // richiesta di invio mail.
        if (segnatura != null) {
          ReqSpedisciProtocollo reqSpedisciProtocollo = new ReqSpedisciProtocollo();
          reqSpedisciProtocollo.setOperatore(operatorePaleo);
          reqSpedisciProtocollo.setSegnatura(segnatura);
          RespSpedisciProtocollo respSpedisciProtocollo = iPaleoService.spedisciProtocollo(reqSpedisciProtocollo);
          if (TipoRisultato.ERROR.equals(respSpedisciProtocollo.getMessaggioRisultato().getTipoRisultato())) {
            wsdmInviaMailRes.setEsito(false);
            wsdmInviaMailRes.setMessaggio(respSpedisciProtocollo.getMessaggioRisultato().getDescrizione());
          } else {
            wsdmInviaMailRes.setEsito(true);
            wsdmInviaMailRes.setMessaggio(respSpedisciProtocollo.getMessaggioRisultato().getDescrizione());
          }

          // Lettura dello stato di invio per i destinatari
          if (respSpedisciProtocollo.getDestinatari() != null) {
            ArrayOfDestinatarioInfoInterop arrayOfDestinatarioInfoInterop = respSpedisciProtocollo.getDestinatari();
            WSDMMailInfo[] destinatariMailInfo = _getDestinatariInfoInterop(arrayOfDestinatarioInfoInterop);
            wsdmInviaMailRes.setDestinatariMailInfo(destinatariMailInfo);
          }

          // Lettura dello stato di invio per i destinatari CC
          if (respSpedisciProtocollo.getDestinatariCC() != null) {
            ArrayOfDestinatarioInfoInterop arrayOfDestinatarioCCInfoInterop = respSpedisciProtocollo.getDestinatariCC();
            WSDMMailInfo[] destinatariCCMailInfo = _getDestinatariInfoInterop(arrayOfDestinatarioCCInfoInterop);
            wsdmInviaMailRes.setDestinatariCCMailInfo(destinatariCCMailInfo);
          }

        }

      } else {
        // Non sono stati superati i controlli di validita'
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
   * Lettura delle informazioni di spedizione della mail.
   * 
   * @param arrayOfDestinatarioInfoInterop
   * @return
   */
  private WSDMMailInfo[] _getDestinatariInfoInterop(ArrayOfDestinatarioInfoInterop arrayOfDestinatarioInfoInterop) {
    List<DestinatarioInfoInterop> listDestinatarioInfoInterop = arrayOfDestinatarioInfoInterop.getDestinatarioInfoInterop();

    WSDMMailInfo[] destinatariMailInfo = new WSDMMailInfo[listDestinatarioInfoInterop.size()];

    for (int dest = 0; dest < listDestinatarioInfoInterop.size(); dest++) {

      DestinatarioInfoInterop destinatarioInfoInterop = listDestinatarioInfoInterop.get(dest);

      destinatariMailInfo[dest] = new WSDMMailInfo();

      // Dati principali del destinatario
      destinatariMailInfo[dest].setDestinatarioDescrizione(destinatarioInfoInterop.getDescrizione());
      destinatariMailInfo[dest].setDestinatarioEmail(destinatarioInfoInterop.getEmail());
      destinatariMailInfo[dest].setDestinatarioCodiceFiscale(destinatarioInfoInterop.getIdFiscale());

      // Dati di spedizione
      ArrayOfMessaggioInteropInfo2 arrayOfMessaggioInteropInfo2 = destinatarioInfoInterop.getMessaggiInterop();
      List<MessaggioInteropInfo2> listMessaggioInteropInfo2 = arrayOfMessaggioInteropInfo2.getMessaggioInteropInfo2();

      // Dati del messaggio
      List<WSDMMailInfo2> arrayOfWSDMMailInfo2 = new ArrayList<WSDMMailInfo2>();
      for (int mess = 0; mess < listMessaggioInteropInfo2.size(); mess++) {
        MessaggioInteropInfo2 messaggioInteropInfo2 = listMessaggioInteropInfo2.get(mess);
        ArrayOfMessaggioPostaInfo2 arrayOfMessaggioPostaInfo2 = messaggioInteropInfo2.getMessaggiPosta();
        List<MessaggioPostaInfo2> listMessaggioPostaInfo2 = arrayOfMessaggioPostaInfo2.getMessaggioPostaInfo2();

        for (int post = 0; post < listMessaggioPostaInfo2.size(); post++) {
          MessaggioPostaInfo2 messaggioPostaInfo2 = listMessaggioPostaInfo2.get(post);

          WSDMMailInfo2 destinatariMailInfo2 = new WSDMMailInfo2();
          // Data/ora invio
          if (messaggioPostaInfo2.getDataOra() != null) {
            destinatariMailInfo2.setMessaggioDataOra(messaggioPostaInfo2.getDataOra().toGregorianCalendar().getTime());
          }

          // Direzione
          if (messaggioPostaInfo2.getDirezione() != null) {
            destinatariMailInfo2.setMessaggioDirezione(messaggioPostaInfo2.getDirezione().toString());
          }

          // Stato spedizione
          if (messaggioInteropInfo2.getStatoSpedizione() != null) {
            destinatariMailInfo2.setStatoSpedizione(messaggioInteropInfo2.getStatoSpedizione().toString());
          }

          // Tipo spedizione
          if (messaggioInteropInfo2.getTipo() != null) {
            destinatariMailInfo2.setTipoSpedizione(messaggioInteropInfo2.getTipo().toString());
          }

          // Id casella di posta
          if (messaggioPostaInfo2.getIdCasellaPosta() != null) {
            destinatariMailInfo2.setMessaggioIdCasellaPosta(messaggioPostaInfo2.getIdCasellaPosta().toString());
          }

          // Indirizzo casella di posta
          destinatariMailInfo2.setMessaggioIndirizzoCasellaPosta(messaggioPostaInfo2.getIndirizzoCasella());

          // Identificativo del messaggio
          destinatariMailInfo2.setMessaggioId(messaggioPostaInfo2.getMessageId());

          // Oggetto del messaggio
          destinatariMailInfo2.setMessaggioOggetto(messaggioPostaInfo2.getSubject());

          arrayOfWSDMMailInfo2.add(destinatariMailInfo2);

        }
      }

      if (arrayOfWSDMMailInfo2 != null && arrayOfWSDMMailInfo2.size() > 0) {
        WSDMMailInfo2[] wsdmMailInfo2 = new WSDMMailInfo2[arrayOfWSDMMailInfo2.size()];
        for (int mi2 = 0; mi2 < arrayOfWSDMMailInfo2.size(); mi2++) {
          wsdmMailInfo2[mi2] = arrayOfWSDMMailInfo2.get(mi2);
        }
        destinatariMailInfo[dest].setMailInfo2(wsdmMailInfo2);
      }
    }
    return destinatariMailInfo;
  }

  @Override
  public WSDMVerificaMailRes _verificaMail(String username, String password, WSDMLoginAttr loginAttr, String numeroDocumento,
      Long annoProtocollo, String numeroProtocollo) {
    WSDMVerificaMailRes wsdmVerificaMailRes = new WSDMVerificaMailRes();

    WSDMInviaMail wsdmInviaMail = new WSDMInviaMail();
    wsdmInviaMail.setNumeroDocumento(numeroDocumento);

    WSDMInviaMailRes wsdmInviaMailRes = this._inviaMail(username, password, loginAttr, wsdmInviaMail);
    wsdmVerificaMailRes.setEsito(wsdmInviaMailRes.isEsito());
    wsdmVerificaMailRes.setMessaggio(wsdmInviaMailRes.getMessaggio());
    wsdmVerificaMailRes.setDestinatariMailInfo(wsdmInviaMailRes.getDestinatariMailInfo());
    wsdmVerificaMailRes.setDestinatariCCMailInfo(wsdmInviaMailRes.getDestinatariCCMailInfo());

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

  /**
   * Gestione dell'invio dei file. Gli allegati devono essere inviati con
   * chiamata singola, ossia una chiamata al servizio per un singolo allegato.
   * 
   * @param username
   * @param password
   * @param loginAttr
   * @param numeroDocumento
   * @param allegatiHash
   * @param messaggioAddAllegati
   * @return
   * @throws Exception
   */
  private void _addAllegatiDocumentoProtocollo(String username, String password, WSDMLoginAttr loginAttr, String numeroDocumento,
      AllegatoHash[] allegatiHash, String messaggioAddAllegati) throws Exception {

    // Servizio
    IPaleoService iPaleoService = this.getIPaleoService(username, password);

    // Operatore
    OperatorePaleo operatorePaleo = _getOperatore(loginAttr);

    // Allegati
    if (allegatiHash != null && allegatiHash.length > 0) {
      for (int ah = 0; ah < allegatiHash.length; ah++) {

        ReqAddAllegati reqAddAllegati = new ReqAddAllegati();
        reqAddAllegati.setOperatore(operatorePaleo);
        reqAddAllegati.setDocNumber(Integer.parseInt(numeroDocumento));

        ArrayOfAllegato arrayOfAllegato = new ArrayOfAllegato();

        Allegato allegato = new Allegato();

        File documento = new File();
        AllegatoHash allegatoHash = allegatiHash[ah];
        allegato.setDescrizione(allegatoHash.getTitolo());
        documento.setNome(allegatoHash.getNome());
        documento.setEstensione(allegatoHash.getTipo());
        documento.setImpronta(allegatoHash.getHash());
        documento.setStream(allegatoHash.getContenuto());
        allegato.setDocumento(documento);

        arrayOfAllegato.getAllegato().add(allegato);
        reqAddAllegati.setAllegati(arrayOfAllegato);

        // Invio della richiesta e lettura della risposta
        RespAddAllegati respAddAllegati = iPaleoService.addAllegatiDocumentoProtocollo(reqAddAllegati);

        if (messaggioAddAllegati == null) {
          messaggioAddAllegati = "";
        } else {
          messaggioAddAllegati += ", ";
        }

        messaggioAddAllegati += respAddAllegati.getMessaggioRisultato().getDescrizione() + " [" + allegatoHash.getNome() + "]";
      }

    }

  }

  /**
   * Lettura del contenuto del file in base al suo identificativo "idFile".
   * 
   * @param username
   * @param password
   * @param loginAttr
   * @param idFile
   * @return
   * @throws Exception
   */
  private byte[] _getFile(String username, String password, WSDMLoginAttr loginAttr, int idFile) throws Exception {

    byte[] stream = null;

    IPaleoService iPaleoService = this.getIPaleoService(username, password);
    OperatorePaleo operatorePaleo = _getOperatore(loginAttr);
    BEBaseOfFileZA0HwLp5 beBase = iPaleoService.getFile(operatorePaleo, idFile);
    if (beBase != null) {
      if (!TipoRisultato.ERROR.equals(beBase.getMessaggioRisultato().getTipoRisultato())) {
        if (beBase.getOggetto() != null) {
          stream = beBase.getOggetto().getStream();
        }
      }
    }

    return stream;

  }

  @Override
  public WSDMListaOperatoriRes _listaOperatori(String username, String password, WSDMLoginAttr loginAttr, String cognome,
      String codiceFiscale) {

    WSDMListaOperatoriRes wsdmListaUtentiRes = new WSDMListaOperatoriRes();

    try {

      IPaleoService iPaleoService = this.getIPaleoService(username, password);

      BEListOfOperatorePaleoZA0HwLp5 findOperatoriResult = iPaleoService.findOperatori(cognome, codiceFiscale);
      if (findOperatoriResult != null) {
        if (findOperatoriResult.getMessaggioRisultato() != null) {
          if (TipoRisultato.ERROR.equals(findOperatoriResult.getMessaggioRisultato().getTipoRisultato())) {
            wsdmListaUtentiRes.setEsito(false);
            wsdmListaUtentiRes.setMessaggio(findOperatoriResult.getMessaggioRisultato().getDescrizione());
          } else {
            if (findOperatoriResult.getLista() != null) {
              ArrayOfOperatorePaleo arrayOfOperatorePaleo = findOperatoriResult.getLista();
              List<OperatorePaleo> listaOperatoriPaleo = arrayOfOperatorePaleo.getOperatorePaleo();

              WSDMOperatore[] listaOperatori = new WSDMOperatore[listaOperatoriPaleo.size()];

              for (int o = 0; o < listaOperatoriPaleo.size(); o++) {

                OperatorePaleo operatorePaleo = listaOperatoriPaleo.get(o);
                listaOperatori[o] = new WSDMOperatore();

                listaOperatori[o].setCodiceUO(operatorePaleo.getCodiceUO());
                listaOperatori[o].setCognome(operatorePaleo.getCognome());
                listaOperatori[o].setNome(operatorePaleo.getNome());
                listaOperatori[o].setRuolo(operatorePaleo.getRuolo());

              }

              wsdmListaUtentiRes.setEsito(true);
              wsdmListaUtentiRes.setOperatori(listaOperatori);

            } else {
              wsdmListaUtentiRes.setEsito(false);
              wsdmListaUtentiRes.setMessaggio("Non e' stato trovato alcun operatore.");
            }
          }
        }
      }

    } catch (WebServiceException w) {
      wsdmListaUtentiRes.setEsito(false);
      wsdmListaUtentiRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_listaUtenti)", w);
    } catch (NamingException e) {
      wsdmListaUtentiRes.setEsito(false);
      wsdmListaUtentiRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_listaUtenti)", e);
    } catch (Throwable t) {
      wsdmListaUtentiRes.setEsito(false);
      wsdmListaUtentiRes.setMessaggio(t.getMessage());
      logger.error("Errore (_listaUtenti)", t);
    }

    return wsdmListaUtentiRes;
  }

  @Override
  public WSDMListaTipiTrasmissioneRes _listaTipiTrasmissione(String username, String password, WSDMLoginAttr loginAttr) {

    WSDMListaTipiTrasmissioneRes wsdmListaTipiTrasmissioneRes = new WSDMListaTipiTrasmissioneRes();

    try {

      IPaleoService iPaleoService = this.getIPaleoService(username, password);
      OperatorePaleo operatorePaleo = _getOperatore(loginAttr);

      BEListOfRagioneTrasmissioneZA0HwLp5 getRagioniTramissioneResult = iPaleoService.getRagioniTrasmissione(operatorePaleo);
      if (getRagioniTramissioneResult != null) {
        if (getRagioniTramissioneResult.getMessaggioRisultato() != null) {
          if (TipoRisultato.ERROR.equals(getRagioniTramissioneResult.getMessaggioRisultato().getTipoRisultato())) {
            wsdmListaTipiTrasmissioneRes.setEsito(false);
            wsdmListaTipiTrasmissioneRes.setMessaggio(getRagioniTramissioneResult.getMessaggioRisultato().getDescrizione());
          } else {
            if (getRagioniTramissioneResult.getLista() != null) {
              ArrayOfRagioneTrasmissione arrayOfRagioniTrasmissionePaleo = getRagioniTramissioneResult.getLista();
              List<RagioneTrasmissione> listaRagioniTrasmissionePaleo = arrayOfRagioniTrasmissionePaleo.getRagioneTrasmissione();

              WSDMTipoTrasmissione[] listaTipiTrasmissione = new WSDMTipoTrasmissione[listaRagioniTrasmissionePaleo.size()];

              for (int r = 0; r < listaRagioniTrasmissionePaleo.size(); r++) {

                RagioneTrasmissione ragioneTrasmissionePaleo = listaRagioniTrasmissionePaleo.get(r);
                listaTipiTrasmissione[r] = new WSDMTipoTrasmissione();

                listaTipiTrasmissione[r].setNome(ragioneTrasmissionePaleo.getNome());
                listaTipiTrasmissione[r].setDescrizione(ragioneTrasmissionePaleo.getDescrizione());
                listaTipiTrasmissione[r].setCodice(ragioneTrasmissionePaleo.getCodice());
                listaTipiTrasmissione[r].setTipoDestinatario(ragioneTrasmissionePaleo.getTipoDestinatario());

              }

              wsdmListaTipiTrasmissioneRes.setEsito(true);
              wsdmListaTipiTrasmissioneRes.setTipiTrasmissione(listaTipiTrasmissione);

            } else {
              wsdmListaTipiTrasmissioneRes.setEsito(false);
              wsdmListaTipiTrasmissioneRes.setMessaggio("Non e' stato trovato alcun tipo trasmissione.");
            }
          }
        }
      }

    } catch (WebServiceException w) {
      wsdmListaTipiTrasmissioneRes.setEsito(false);
      wsdmListaTipiTrasmissioneRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_listaTipiTrasmissione)", w);
    } catch (NamingException e) {
      wsdmListaTipiTrasmissioneRes.setEsito(false);
      wsdmListaTipiTrasmissioneRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_listaTipiTrasmissione)", e);
    } catch (Throwable t) {
      wsdmListaTipiTrasmissioneRes.setEsito(false);
      wsdmListaTipiTrasmissioneRes.setMessaggio(t.getMessage());
      logger.error("Errore (_listaTipiTrasmissione)", t);
    }

    return wsdmListaTipiTrasmissioneRes;

  }

  @Override
  public WSDMTrasmissioneRes _trasmissione(String username, String password, WSDMLoginAttr loginAttr, WSDMTrasmissioneIn trasmissioneIn) {

    WSDMTrasmissioneRes wsdmTrasmissioneRes = new WSDMTrasmissioneRes();

    try {

      StringBuffer messaggioCtr = new StringBuffer();
      if (PaleoUtilityControllo.ctrTrasmissione(loginAttr, trasmissioneIn, messaggioCtr)) {

        IPaleoService iPaleoService = this.getIPaleoService(username, password);
        OperatorePaleo operatorePaleo = _getOperatore(loginAttr);

        ArrayOfTrasmissioneDoc arrayOfTrasmissioneDoc = new ArrayOfTrasmissioneDoc();
        List<TrasmissioneDoc> listTrasmissioneDoc = arrayOfTrasmissioneDoc.getTrasmissioneDoc();

        // Documento (possono essere indicati vari documenti)
        for (int td = 0; td < trasmissioneIn.getDocumenti().length; td++) {
          WSDMTrasmissioneDocumento trasmissioneDocumentoWSDM = trasmissioneIn.getDocumenti()[td];
          TrasmissioneDoc trasmissioneDoc = new TrasmissioneDoc();

          String numeroDocumento = trasmissioneDocumentoWSDM.getNumeroDocumento();
          trasmissioneDoc.setDocNumber(Integer.parseInt(numeroDocumento));

          ArrayOfTrasmissioneUtente arrayOfTrasmissioneUtente = new ArrayOfTrasmissioneUtente();
          List<TrasmissioneUtente> listTrasmissioneUtente = arrayOfTrasmissioneUtente.getTrasmissioneUtente();

          // Utente cui assegnare il documento (possono essere identificati
          // vari utenti)
          for (int tu = 0; tu < trasmissioneDocumentoWSDM.getUtenti().length; tu++) {
            WSDMTrasmissioneUtente trasmissioneUtenteWSDM = trasmissioneDocumentoWSDM.getUtenti()[tu];
            TrasmissioneUtente trasmissioneUtente = new TrasmissioneUtente();

            OperatorePaleo trasmissioneOperatore = new OperatorePaleo();
            trasmissioneOperatore.setCodiceUO(trasmissioneUtenteWSDM.getOperatore().getCodiceUO());
            trasmissioneOperatore.setCognome(trasmissioneUtenteWSDM.getOperatore().getCognome());
            trasmissioneOperatore.setNome(trasmissioneUtenteWSDM.getOperatore().getNome());
            trasmissioneOperatore.setRuolo(trasmissioneUtenteWSDM.getOperatore().getRuolo());

            trasmissioneUtente.setOperatoreDestinatario(trasmissioneOperatore);
            trasmissioneUtente.setRagione(trasmissioneUtenteWSDM.getTipoTrasmissione());

            listTrasmissioneUtente.add(trasmissioneUtente);

          }

          trasmissioneDoc.setTrasmissioniUtente(arrayOfTrasmissioneUtente);
          listTrasmissioneDoc.add(trasmissioneDoc);

        }

        BEBase beBase = iPaleoService.effettuaTrasmissioni(operatorePaleo, arrayOfTrasmissioneDoc);

        if (TipoRisultato.ERROR.equals(beBase.getMessaggioRisultato().getTipoRisultato())) {
          wsdmTrasmissioneRes.setEsito(false);
        } else {
          wsdmTrasmissioneRes.setEsito(true);
        }
        wsdmTrasmissioneRes.setMessaggio(beBase.getMessaggioRisultato().getDescrizione());

      } else {
        wsdmTrasmissioneRes.setEsito(false);
        wsdmTrasmissioneRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (WebServiceException w) {
      wsdmTrasmissioneRes.setEsito(false);
      wsdmTrasmissioneRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_trasmissione)", w);
    } catch (NamingException e) {
      wsdmTrasmissioneRes.setEsito(false);
      wsdmTrasmissioneRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_trasmissione)", e);
    } catch (Throwable t) {
      wsdmTrasmissioneRes.setEsito(false);
      wsdmTrasmissioneRes.setMessaggio(t.getMessage());
      logger.error("Errore (_trasmissione)", t);
    }

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
