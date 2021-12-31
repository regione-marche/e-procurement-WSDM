package it.maggioli.eldasoft.bl.engineering;

import it.engineering.xsd.inserimentofasc.InserimentoFasc;
import it.engineering.xsd.ricercafascicoli.CLASSIFFASC;
import it.engineering.xsd.ricercafascicoli.CLASSIFICAZIONE;
import it.engineering.xsd.ricercafascicoli.Classif;
import it.engineering.xsd.ricercafascicoli.ClassifFascApp;
import it.engineering.xsd.ricercafascicoli.RicercaFascicolo;
import it.engineering.xsd.ricercaprotocollo.EstremiReg;
import it.engineering.xsd.ricercaprotocollo.RegPrimaria;
import it.engineering.xsd.ricercaprotocollo.RicercaProtocollo;
import it.engineering.xsd.risposta.Risposta;
import it.engineering.xsd.risposta.Stato;
import it.engineering.xsd.risultatoricerca.RisultatoRicerca;
import it.engineering.xsd.risultatoricercafasc.Fascicolo;
import it.engineering.xsd.segnaturaprot.AllegaArrIn;
import it.engineering.xsd.segnaturaprot.CodFis;
import it.engineering.xsd.segnaturaprot.Cognome;
import it.engineering.xsd.segnaturaprot.CopieArrIn;
import it.engineering.xsd.segnaturaprot.Dati;
import it.engineering.xsd.segnaturaprot.DocumentoElettronico;
import it.engineering.xsd.segnaturaprot.EmailDest;
import it.engineering.xsd.segnaturaprot.EmailDestCC;
import it.engineering.xsd.segnaturaprot.EsibDest;
import it.engineering.xsd.segnaturaprot.Firm;
import it.engineering.xsd.segnaturaprot.IdUo;
import it.engineering.xsd.segnaturaprot.InvioPEC;
import it.engineering.xsd.segnaturaprot.Nome;
import it.engineering.xsd.segnaturaprot.RagioneSociale;
import it.engineering.xsd.segnaturaprot.SegnaturaGenerica;
import it.engineering.xsd.segnaturaprot.UO;
import it.engineering.xsd.segnaturaprot.UOProv;
import it.engineering.xsd.segnaturaprot.UoAss;
import it.genova.comune.protocollotest.axis.services.wsinserimentofasc.PROTOWOTestWSInserimentoFasc;
import it.genova.comune.protocollotest.axis.services.wsinserimentofasc.PROTOWOTestWSInserimentoFascPortType;
import it.genova.comune.protocollotest.axis.services.wsprotocollazione.PROTOWOTestWSProtocollazione;
import it.genova.comune.protocollotest.axis.services.wsprotocollazione.PROTOWOTestWSProtocollazionePortType;
import it.genova.comune.protocollotest.axis.services.wsricercafascicolo.PROTOWOTestWSRicercaFascicolo;
import it.genova.comune.protocollotest.axis.services.wsricercafascicolo.PROTOWOTestWSRicercaFascicoloPortType;
import it.genova.comune.protocollotest.axis.services.wsricercaprotocollo.PROTOWOTestWSRicercaProtocollo;
import it.genova.comune.protocollotest.axis.services.wsricercaprotocollo.PROTOWOTestWSRicercaProtocolloPortType;
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

import java.io.StringReader;
import java.io.StringWriter;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.activation.DataHandler;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.ws.WebServiceException;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.cxf.attachment.AttachmentImpl;
import org.apache.cxf.attachment.AttachmentUtil;
import org.apache.cxf.attachment.ByteDataSource;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.message.Attachment;
import org.apache.cxf.message.Message;
import org.apache.log4j.Logger;
import org.apache.ws.security.util.Base64;

/**
 * Manager per la gestione documentale mediante sistema di protocollo JIRIDE.
 * 
 */

public class EngineeringManager implements IWSDMManager {

  static Logger              logger                          = Logger.getLogger(EngineeringManager.class);

  static private String      WSINSERIMENTOFASC               = "java:comp/env/ENGINEERING_WSINSERIMENTOFASC";
  static private String      WSPROTOCOLLAZIONE               = "java:comp/env/ENGINEERING_WSPROTOCOLLAZIONE";
  static private String      WSRICERCAFASCICOLO              = "java:comp/env/ENGINEERING_WSRICERCAFASCICOLO";
  static private String      WSRICERCAPROTOCOLLO             = "java:comp/env/ENGINEERING_WSRICERCAPROTOCOLLO";
  static private String      CODICEENTE                      = "java:comp/env/ENGINEERING_CODICEENTE";

  static public final String ENG_PROTOCOLLO_IN_ENTRATA       = "E";
  static public final String ENG_PROTOCOLLO_IN_USCITA        = "U";
  // Il protocollo interno (tra uffici) e' trattato come un protocollo in
  // entrata. 19/02/2019 su richiesta il protocollo interno deve essere
  // identificato da I
  static public final String ENG_PROTOCOLLO_INTERNO          = "I";

  static public final String ENG_LEGGI_PROTOCOLLO_IN_ENTRATA = "In entrata";
  static public final String ENG_LEGGI_PROTOCOLLO_IN_USCITA  = "In uscita";
  static public final String ENG_LEGGI_PROTOCOLLO_INTERNO    = "Tra uffici";

  /**
   * Ottiene l'oggetto PROTOWOTestWSRicercaProtocolloPortType per la connessione
   * al servizio di ricerca protocollo.
   * 
   * @return
   * @throws NamingException
   */
  private PROTOWOTestWSRicercaProtocolloPortType getPROTOWOTestWSRicercaProtocolloPortType() throws Exception {
    String wsRicercaProtocollo = InitialContext.doLookup(WSRICERCAPROTOCOLLO);
    if (wsRicercaProtocollo == null || (wsRicercaProtocollo != null && "".equals(wsRicercaProtocollo.trim()))) {
      throw new Exception(URL_NOT_DEFINED);
    }
    PROTOWOTestWSRicercaProtocollo ricercaProtocollo = new PROTOWOTestWSRicercaProtocollo();
    PROTOWOTestWSRicercaProtocolloPortType ricercaProtocolloPortType = ricercaProtocollo.getPROTOWOTestWSRicercaProtocolloHttpEndpoint();
    Client client = ClientProxy.getClient(ricercaProtocolloPortType);
    client.getRequestContext().put(Message.ENDPOINT_ADDRESS, wsRicercaProtocollo);
    return ricercaProtocolloPortType;
  }

  /**
   * Ottiene l'oggetto PROTOWOTestWSRicercaFascicoloPortType per la connessione
   * al servizio di ricerca fascicolo.
   * 
   * @return
   * @throws Exception
   */
  private PROTOWOTestWSRicercaFascicoloPortType getPROTOWOTestWSRicercaFascicoloPortType() throws Exception {
    String wsRicercaFascicolo = InitialContext.doLookup(WSRICERCAFASCICOLO);
    if (wsRicercaFascicolo == null || (wsRicercaFascicolo != null && "".equals(wsRicercaFascicolo.trim()))) {
      throw new Exception(URL_NOT_DEFINED);
    }
    PROTOWOTestWSRicercaFascicolo ricercaFascicolo = new PROTOWOTestWSRicercaFascicolo();
    PROTOWOTestWSRicercaFascicoloPortType ricercaFascicoloPortType = ricercaFascicolo.getPROTOWOTestWSRicercaFascicoloHttpEndpoint();
    Client client = ClientProxy.getClient(ricercaFascicoloPortType);
    client.getRequestContext().put(Message.ENDPOINT_ADDRESS, wsRicercaFascicolo);
    return ricercaFascicoloPortType;
  }

  /**
   * Ottiene l'oggetto PROTOWOTestWSInserimentoFascPortType per la connessione
   * al servizio di inserimento fascicolo.
   * 
   * @return
   * @throws Exception
   */
  private PROTOWOTestWSInserimentoFascPortType getPROTOWOTestWSInserimentoFascPortType() throws Exception {
    String wsInserimentoFasc = InitialContext.doLookup(WSINSERIMENTOFASC);
    if (wsInserimentoFasc == null || (wsInserimentoFasc != null && "".equals(wsInserimentoFasc.trim()))) {
      throw new Exception(URL_NOT_DEFINED);
    }
    PROTOWOTestWSInserimentoFasc inserimentoFasc = new PROTOWOTestWSInserimentoFasc();
    PROTOWOTestWSInserimentoFascPortType inserimentoFascPortType = inserimentoFasc.getPROTOWOTestWSInserimentoFascHttpEndpoint();
    Client client = ClientProxy.getClient(inserimentoFascPortType);
    client.getRequestContext().put(Message.ENDPOINT_ADDRESS, wsInserimentoFasc);
    return inserimentoFascPortType;
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
      if (EngineeringUtilityControllo.ctrProtocolloInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {

        boolean esitoInserimentoFascicolo = true;

        // Codice ente
        String codEnte = InitialContext.doLookup(CODICEENTE);

        // Indirizzo IP
        String indirizzoIP = this.getIndirizzoIP();

        // XML input, segnatura generica
        SegnaturaGenerica segnaturaGenerica = new SegnaturaGenerica();
        Dati dati = new Dati();
        segnaturaGenerica.setDati(dati);

        // Identificativo dell'utente collegato
        dati.setIdUteIn(loginAttr.getLoginEngAttr().getIdUtente());

        // Identificativo dell'unita' operativa collegata
        dati.setIdUOIn(loginAttr.getLoginEngAttr().getIdUtenteUnitaOperativa());

        // Data estesa di arrivo del documento
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String dataEstesa = df.format(wsdmprotocolloDocumentoIn.getData());
        dati.setDtArrivoIn(dataEstesa);

        // Oggetto del documento
        dati.setTxtOggIn(wsdmprotocolloDocumentoIn.getOggetto());

        // Identificativo univoco dell'indice dell'originale
        dati.setIdIndice(wsdmprotocolloDocumentoIn.getIdIndice());

        // Identificativo univoco della titolazione dell'originale
        dati.setIdTitolazione(wsdmprotocolloDocumentoIn.getIdTitolazione());

        // Gestione del fascicolo.
        // L'indicazione del fascicolo e' obbligatoria in uscita: deve essere
        // indicato un fascicolo esistente.
        // Per supportare l'indicazione di un nuovo fascicolo e' necessario
        // inserire "autonomamente" il nuovo fascicolo, richiamando il metodo
        // _fascicoloInserisci, e referenziando la risposta nella creazione del
        // nuovo protocollo.
        Long annoFascicolo = null;
        String numeroFascicolo = null;
        if (WSDMInserimentoInFascicolo.NO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
          dati.setIdFascicolo("");
          dati.setNumFasc("");
          dati.setNumSottofasc("");
          dati.setAnnoFasc("");
        } else if (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
          annoFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getAnnoFascicolo();
          numeroFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getNumeroFascicolo();
          dati.setIdFascicolo("");
          dati.setNumFasc(numeroFascicolo);
          dati.setNumSottofasc("0");
          dati.setAnnoFasc(annoFascicolo.toString());
        } else if (WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
          String oggettoNuovoFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getOggettoFascicolo();
          String classificaNuovoFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getClassificaFascicolo();
          String descrizioneNuovoFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getDescrizioneFascicolo();
          WSDMFascicoloIn wsdmNuovoFascicoloIn = new WSDMFascicoloIn();
          wsdmNuovoFascicoloIn.setOggettoFascicolo(oggettoNuovoFascicolo);
          wsdmNuovoFascicoloIn.setClassificaFascicolo(classificaNuovoFascicolo);
          wsdmNuovoFascicoloIn.setDescrizioneFascicolo(descrizioneNuovoFascicolo);
          WSDMFascicoloRes wsdmNuovoFascicoloRes = this._fascicoloInserisci(username, password, loginAttr, wsdmNuovoFascicoloIn);
          if (!wsdmNuovoFascicoloRes.isEsito()) {
            esitoInserimentoFascicolo = false;
            wsdmprotocolloDocumentoRes.setEsito(false);
            wsdmprotocolloDocumentoRes.setMessaggio("L'inserimento del nuovo fascicolo ha restituito il messaggio: "
                + wsdmNuovoFascicoloRes.getMessaggio());
          } else {
            annoFascicolo = wsdmNuovoFascicoloRes.getFascicolo().getAnnoFascicolo();
            numeroFascicolo = wsdmNuovoFascicoloRes.getFascicolo().getNumeroFascicolo();
            dati.setIdFascicolo("");
            dati.setNumFasc(numeroFascicolo);
            dati.setNumSottofasc("0");
            dati.setAnnoFasc(annoFascicolo.toString());
          }
        } else {
          dati.setIdFascicolo("");
          dati.setNumFasc("");
          dati.setNumSottofasc("");
          dati.setAnnoFasc("");
        }

        if (esitoInserimentoFascicolo) {
          // Mittenti, i mittenti sono obbligatori per le protocollazioni in
          // entrata (IN)
          if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
            WSDMProtocolloAnagrafica[] mittenti = wsdmprotocolloDocumentoIn.getMittenti();
            if (mittenti != null && mittenti.length > 0) {
              List<Firm> firmatari = dati.getFirm();
              for (int mi = 0; mi < mittenti.length; mi++) {
                Firm firmatario = new Firm();
                firmatari.add(firmatario);
                List<Object> cognomeNomeRagioneSociale = firmatario.getCognomeOrNomeOrRagioneSociale();
                // Se il nome e' valorizzato allora devo popolare gli attributi
                // "Cognome" e "Nome", altrimenti devo popolare solo l'attributo
                // "RagioneSociale"
                if (mittenti[mi].getNome() != null) {
                  Cognome cognome = new Cognome();
                  cognome.setvalue(mittenti[mi].getCognomeointestazione());
                  Nome nome = new Nome();
                  nome.setvalue(mittenti[mi].getNome());
                  cognomeNomeRagioneSociale.add(cognome);
                  cognomeNomeRagioneSociale.add(nome);
                  firmatario.setFlgTpAnag("P");
                } else {
                  RagioneSociale ragioneSociale = new RagioneSociale();
                  ragioneSociale.setvalue(mittenti[mi].getCognomeointestazione());
                  cognomeNomeRagioneSociale.add(ragioneSociale);
                  firmatario.setFlgTpAnag("D");
                }
                // Codice fiscale
                List<Object> codFisOrParIva = firmatario.getCodFisOrParIva();
                CodFis codFis = new CodFis();
                codFis.setvalue(mittenti[mi].getCodiceFiscale());
                codFisOrParIva.add(codFis);
              }
            }
          }

          // Destinatari, i destinatari sono obbligatori per le protocollazioni
          // in
          // uscita (OUT)
          if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
            WSDMProtocolloAnagrafica[] destinatari = wsdmprotocolloDocumentoIn.getDestinatari();
            if (destinatari != null && destinatari.length > 0) {
              List<EsibDest> esibDestinatari = dati.getEsibDest();
              for (int de = 0; de < destinatari.length; de++) {
                EsibDest esibDestinatario = new EsibDest();
                esibDestinatari.add(esibDestinatario);
                List<Object> cognomeNomeRagioneSociale = esibDestinatario.getCognomeOrNomeOrRagioneSociale();
                // Se il nome e' valorizzato allora devo popolare gli attributi
                // "Cognome" e "Nome", altrimenti devo popolare solo l'attributo
                // "RagioneSociale"
                if (destinatari[de].getNome() != null) {
                  Cognome cognome = new Cognome();
                  cognome.setvalue(destinatari[de].getCognomeointestazione());
                  Nome nome = new Nome();
                  nome.setvalue(destinatari[de].getNome());
                  cognomeNomeRagioneSociale.add(cognome);
                  cognomeNomeRagioneSociale.add(nome);
                  esibDestinatario.setFlgTpAnag("P");
                } else {
                  RagioneSociale ragioneSociale = new RagioneSociale();
                  ragioneSociale.setvalue(destinatari[de].getCognomeointestazione());
                  cognomeNomeRagioneSociale.add(ragioneSociale);
                  esibDestinatario.setFlgTpAnag("D");
                }
                esibDestinatario.setFlgDestCopia("N");
                esibDestinatario.setFlgCC("N");
                // Codice fiscale
                List<Object> codFisOrParIva = esibDestinatario.getCodFisOrParIva();
                CodFis codFis = new CodFis();
                codFis.setvalue(destinatari[de].getCodiceFiscale());
                codFisOrParIva.add(codFis);
              }
            }
          }

          // Elenco delle copie.
          // In entrata e' obbligatorio, viene utilizzato anche per la
          // protocollazione interna (da ufficio a ufficio).
          // Allo scopo si utilizza il nuovo attributo
          // idUnitaOperativaDestinataria.
          // Dalla email inviata il 18/10/2016 con i parametri di connessione si
          // riporta quanto segue: IdUo: 100046 UO: SettIn: 176, ServIn: 0,
          // UOCIn:
          // 0, UOSIn: 0, PostIn: 0 (Direzione di appartenenza dell'utente - da
          // usare nei tag CopieArriIn/UoAss/UO/IdUo oppure CopieArriIn/UoAss/UO
          // per l'entrata; UOProv/UO/IdUo oppure UOProv/UO per l'uscita).
          if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())
              || WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
            // Per il documento in ingresso contrassegnato come originale
            // (Flgorig
            // = 'S') e' obbligatorio indicare l'assegnatario
            List<CopieArrIn> copieArrIn = dati.getCopieArrIn();

            // Assegnatario
            CopieArrIn copiaArrIn = new CopieArrIn();
            copiaArrIn.setFlgorig("S");
            copiaArrIn.setFlgCC("");
            copiaArrIn.setIdInd(wsdmprotocolloDocumentoIn.getIdIndice());
            UoAss uoAss = new UoAss();
            UO objUO_ass = new UO();
            List<Object> lObjIdUo_ass = objUO_ass.getIdUoOrSettInOrServInOrUOCInOrUOSInOrPostIn();
            IdUo objIdUo_ass = new IdUo();
            objIdUo_ass.setvalue(wsdmprotocolloDocumentoIn.getIdUnitaOperativaDestinataria());
            lObjIdUo_ass.add(objIdUo_ass);
            uoAss.setUO(objUO_ass);
            copiaArrIn.setUoAss(uoAss);
            copieArrIn.add(copiaArrIn);

            // Altro set di dati (relativo al mittente) su richiesta di Paolo
            // Urbanetto (vedi email del 03/07/2017).
            // <CopieArrIn flgorig="S" note="" flgCC="">
            // <UoAss>
            // <UO>
            // <IdUo>8578</IdUo>
            // </UO>
            // </UoAss>
            // <IdInd>217</IdInd>
            // <AnnoFasc></AnnoFasc>
            // <ProgrFasc></ProgrFasc>
            // <Numsottofasc></Numsottofasc>
            // </CopieArrIn>
            // CopieArrIn copiaArrInALTRO = new CopieArrIn();
            // copiaArrInALTRO.setFlgorig("S");
            // copiaArrInALTRO.setFlgCC("");
            // copiaArrInALTRO.setIdInd(wsdmprotocolloDocumentoIn.getIdIndice());
            // UoAss uoAssALTRO = new UoAss();
            // UO objUO_assALTRO = new UO();
            // List<Object> lObjIdUO_assALTRO =
            // objUO_assALTRO.getIdUoOrSettInOrServInOrUOCInOrUOSInOrPostIn();
            // IdUo objIdUo_assALTRO = new IdUo();
            // objIdUo_assALTRO.setvalue(wsdmprotocolloDocumentoIn.getIdUnitaOperativaMittente());
            // lObjIdUO_assALTRO.add(objIdUo_assALTRO);
            // uoAssALTRO.setUO(objUO_assALTRO);
            // copiaArrInALTRO.setUoAss(uoAssALTRO);
            // copieArrIn.add(copiaArrInALTRO);

          }

          // Se il protocollo è di tipo interno bisogna inserire anche un
          // attributo "copieArrIn"
          // con il mittente stesso.
          // Chiarimento da parte di Loenardo Rocca del 05/04/2017
          if (WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
            // Per il documento in ingresso contrassegnato come originale
            // (Flgorig
            // = 'N') e' obbligatorio indicare l'assegnatario
            List<CopieArrIn> copieArrIn = dati.getCopieArrIn();
            CopieArrIn copiaArrIn = new CopieArrIn();
            copiaArrIn.setFlgorig("N");
            copiaArrIn.setFlgCC("C");
            copiaArrIn.setIdInd(wsdmprotocolloDocumentoIn.getIdIndice());
            // Assegnatario
            UoAss uoAss = new UoAss();
            UO objUO_ass = new UO();
            List<Object> lObjIdUo_ass = objUO_ass.getIdUoOrSettInOrServInOrUOCInOrUOSInOrPostIn();
            IdUo objIdUo_ass = new IdUo();
            objIdUo_ass.setvalue(wsdmprotocolloDocumentoIn.getIdUnitaOperativaMittente());
            lObjIdUo_ass.add(objIdUo_ass);
            uoAss.setUO(objUO_ass);
            copiaArrIn.setUoAss(uoAss);
            copieArrIn.add(copiaArrIn);
          }

          // Identificativo dell'unita' operativa di provenienza (UOProv), solo
          // se il protocollo e' in uscita o di tipo interno (da ufficio a
          // ufficio). Si utilizza il nuovo attributo idUnitaOperativaMittente.
          if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())
              || WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
            UOProv objUOProv = new UOProv();
            UO objUO = new UO();
            List<Object> lObjIdUo = objUO.getIdUoOrSettInOrServInOrUOCInOrUOSInOrPostIn();
            IdUo objIdUo = new IdUo();
            objIdUo.setvalue(wsdmprotocolloDocumentoIn.getIdUnitaOperativaMittente());
            lObjIdUo.add(objIdUo);
            objUOProv.setUO(objUO);
            dati.setUOProv(objUOProv);
          }

          // Tipo protocollazione: E - entrata, U - uscita. La protocollazione
          // interna (INT) e' trattata come una protocollazione in entrata con
          // indicazione obbligatoria dell'unita' operativa mittente
          // (idUnitaOperativaMittente) e dell'unita' operativa destinataria
          // (idUnitaOperativaDestinataria).
          // 19/02/2019 su richiesta il protocollo interno deve essere
          // identificato da I.
          if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
            dati.setTipoProtIN(ENG_PROTOCOLLO_IN_ENTRATA);
          } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
            dati.setTipoProtIN(ENG_PROTOCOLLO_IN_USCITA);
          } else if (WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
            dati.setTipoProtIN(ENG_PROTOCOLLO_INTERNO);
          }

          // Gestione invio mail
          WSDMInviaMail inviaMail = wsdmprotocolloDocumentoIn.getInviaMail();
          if (inviaMail != null) {
            List<InvioPEC> inviiPEC = dati.getInvioPEC();
            InvioPEC invioPEC = new InvioPEC();
            inviiPEC.add(invioPEC);
            invioPEC.setOggetto(inviaMail.getOggettoMail());
            invioPEC.setCorpo(inviaMail.getTestoMail());
            invioPEC.setFlgSegnatura("S");

            // Destinatari
            List<EmailDest> destinatariEmail = invioPEC.getEmailDest();
            if (inviaMail.getDestinatariMail() != null) {
              for (int dest = 0; dest < inviaMail.getDestinatariMail().length; dest++) {
                EmailDest destinatarioEmail = new EmailDest();
                destinatarioEmail.setvalue(inviaMail.getDestinatariMail()[dest]);
                destinatariEmail.add(destinatarioEmail);
              }
            }

            // Destinatari CC
            List<EmailDestCC> destinatariEmailCC = invioPEC.getEmailDestCC();
            if (inviaMail.getDestinatariMailCC() != null) {
              for (int destCC = 0; destCC < inviaMail.getDestinatariMailCC().length; destCC++) {
                EmailDestCC destinatarioEmailCC = new EmailDestCC();
                destinatarioEmailCC.setvalue(inviaMail.getDestinatariMailCC()[destCC]);
                destinatariEmailCC.add(destinatarioEmailCC);
              }
            }
          }

          // Oggetto PROTOWOTestWSProtocollazionePortType per la connessione al
          // servizio di protocollazione.
          String wsProtocollazione = InitialContext.doLookup(WSPROTOCOLLAZIONE);
          if (wsProtocollazione == null || (wsProtocollazione != null && "".equals(wsProtocollazione.trim()))) {
            throw new Exception(URL_NOT_DEFINED);
          }
          PROTOWOTestWSProtocollazione protocollazione = new PROTOWOTestWSProtocollazione();
          PROTOWOTestWSProtocollazionePortType protocollazionePortType = protocollazione.getPROTOWOTestWSProtocollazioneHttpEndpoint();
          Client client = ClientProxy.getClient(protocollazionePortType);
          client.getRequestContext().put(Message.ENDPOINT_ADDRESS, wsProtocollazione);

          // Allegati. Gli allegati devono essere gestiti in "attach".
          // All'interno dell'XML di richiesta deve essere indicato il numero di
          // attach.
          WSDMProtocolloAllegato[] allegati = wsdmprotocolloDocumentoIn.getAllegati();
          if (allegati != null && allegati.length > 0) {

            boolean insertAttachments = true;

            Collection<Attachment> attachments = new ArrayList<Attachment>();

            // Il primo elemento degli allegati viene registrato come documento
            // principale.
            it.engineering.xsd.segnaturaprot.DocumentoElettronico documentoElettronico = new DocumentoElettronico();
            documentoElettronico.setNomeFile(allegati[0].getNome());
            documentoElettronico.setNumeroAttachment("0");
            dati.setDocumentoElettronico(documentoElettronico);

            // Attach del documento elettronico (principale)
            if (insertAttachments) {
              ByteDataSource sourceDocumentoElettronico = new ByteDataSource(allegati[0].getContenuto());
              sourceDocumentoElettronico.setName(allegati[0].getNome());
              sourceDocumentoElettronico.setContentType("application/octet-stream");
              String idDocumentoElettronico = AttachmentUtil.createContentID(allegati[0].getNome());
              Attachment attDocumentoElettronico = new AttachmentImpl(idDocumentoElettronico, new DataHandler(sourceDocumentoElettronico));
              attachments.add(attDocumentoElettronico);
            }

            // Gli allegati superiori al primo, se esistenti, devono essere
            // inseriti come ulteriori allegati.
            if (allegati.length > 1) {
              List<it.engineering.xsd.segnaturaprot.AllegaArrIn> listaAllegati = dati.getAllegaArrIn();
              for (int ai = 1; ai < allegati.length; ai++) {
                it.engineering.xsd.segnaturaprot.AllegaArrIn schedaAllegato = new AllegaArrIn();
                schedaAllegato.setNomeFile(allegati[ai].getNome());
                schedaAllegato.setNote(allegati[ai].getTitolo());
                schedaAllegato.setNumeroAttachment(String.valueOf(ai));
                // schedaAllegato.setTipo(allegati[ai].getTipo());
                schedaAllegato.setTipo("0");
                listaAllegati.add(schedaAllegato);

                // Attach dell'ulteriore allegato
                if (insertAttachments) {
                  ByteDataSource sourceAllegato = new ByteDataSource(allegati[ai].getContenuto());
                  sourceAllegato.setName(allegati[ai].getNome());
                  sourceAllegato.setContentType("application/octet-stream");
                  String idAllegato = AttachmentUtil.createContentID(allegati[ai].getNome());
                  Attachment attAllegato = new AttachmentImpl(idAllegato, new DataHandler(sourceAllegato));
                  attachments.add(attAllegato);
                }
              }
            }
            client.getRequestContext().put(Message.ATTACHMENTS, attachments);
          }

          // Conversione in stringa XML (marshal)
          StringWriter xmlStringWriter = new StringWriter();
          JAXBContext jaxbLocalContext = JAXBContext.newInstance(SegnaturaGenerica.class);
          jaxbLocalContext.createMarshaller().marshal(segnaturaGenerica, xmlStringWriter);
          String xmlInput = xmlStringWriter.toString();
          String xmlInputBase64 = Base64.encode(xmlInput.getBytes());

          // XML Hash
          byte[] xmlHash = DigestUtils.sha(xmlInput + password);
          String xmlHashBase64 = Base64.encode(xmlHash);

          // Log della richiesta
          if (logger.isDebugEnabled()) logger.debug("Richiesta inserimento protocollo: " + xmlInput);

          // Richiesta
          String rispostaProtocollazioneXMLBase64 = protocollazionePortType.protocolla(codEnte, username, password, indirizzoIP,
              xmlInputBase64, xmlHashBase64);

          String rispostaProtocollazioneXML = new String(Base64.decode(rispostaProtocollazioneXMLBase64));

          // Log risposta
          if (logger.isDebugEnabled()) logger.debug("Risposta inserimento protocollo: " + rispostaProtocollazioneXML);

          // Trasformazione in oggetto da stringa XML (unmarshal)
          JAXBContext jaxbContext = JAXBContext.newInstance(Risposta.class);
          Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
          StringBuffer stringBufferXML = new StringBuffer(rispostaProtocollazioneXML);
          Object objectJAXB = unmarshaller.unmarshal(new StringReader(stringBufferXML.toString()));
          Risposta rispostaProtocollazione = (Risposta) objectJAXB;

          // Lettura della risposta
          // Valori possibili per il campo "codice"
          // 0: Successo
          // 1: Bad XML (il file xml non è "well formed")
          // 2: Troppi record selezionati (per le ricerche)
          // 3: Codice ente non valido
          // 4: Utente non trovato o password errata
          // 5: Utente non autorizzato
          // 6: IP non trovato (attualmente non gestito)
          // 7: IP Non autorizzato (attualmente non gestito)
          // 8: XML Alterato (la verica dell’hash è fallita)
          // 9: Password scaduta
          // 100: Errore applicativo
          // 101: Errore applicativo imprevisto (solo per protocollazione)
          // >101 Errore applicativo SQL (=100 + SQL CODE solo per
          // protocollazione)
          Stato rispostaProtocollazioneStato = rispostaProtocollazione.getStato();
          String rispostaProtocollazioneCodice = rispostaProtocollazioneStato.getCodice();
          String rispostaProtocollazioneMessaggio = rispostaProtocollazioneStato.getMessaggio();

          if ("0".equals(rispostaProtocollazioneCodice)) {
            if (rispostaProtocollazione.getNumeroProtocollo() != null) {
              WSDMProtocolloDocumento wsdmProtocolloDocumento = new WSDMProtocolloDocumento();

              String rispostaProtocollazioneTipo = rispostaProtocollazione.getNumeroProtocollo().getTipo();
              String rispostaProtocollazioneAnno = rispostaProtocollazione.getNumeroProtocollo().getAnno();
              String rispostaProtocollazioneNumero = rispostaProtocollazione.getNumeroProtocollo().getNumero();

              // Nella risposta si riporta, all'attributo "NumeroProtocollo" la
              // stringa ottenuta concatenando il tipo, l'anno ed il numero,
              // onde
              // evitare di introdurre il nuovo attributo "tipo" nella risposta
              // del servizio interno Eldasoft. L'introduzione di questo nuovo
              // attributo richiederebbe, inoltre, la memorizzazione nelle
              // tabelle
              // del client.
              String numeroProtocolloComplessivo = rispostaProtocollazioneTipo
                  + "/"
                  + rispostaProtocollazioneAnno
                  + "/"
                  + rispostaProtocollazioneNumero;

              wsdmProtocolloDocumento.setAnnoProtocollo(new Long(rispostaProtocollazioneAnno));
              wsdmProtocolloDocumento.setNumeroProtocollo(numeroProtocolloComplessivo);
              // 08/02/2018 - La data e l'ora del protocollo viene impostata con
              // la
              // data e l'ora corrente di sistema
              Calendar dataProtocolloToday = Calendar.getInstance();
              wsdmProtocolloDocumento.setDataProtocollo(dataProtocolloToday.getTime());

              if (annoFascicolo != null && numeroFascicolo != null) {
                WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();
                wsdmFascicolo.setAnnoFascicolo(annoFascicolo);
                wsdmFascicolo.setNumeroFascicolo(numeroFascicolo);
                wsdmProtocolloDocumento.setFascicolo(wsdmFascicolo);
              }

              wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmProtocolloDocumento);
            }

            wsdmprotocolloDocumentoRes.setEsito(true);
            wsdmprotocolloDocumentoRes.setMessaggio(rispostaProtocollazioneCodice + " - " + rispostaProtocollazioneMessaggio);
          } else {
            wsdmprotocolloDocumentoRes.setEsito(false);
            wsdmprotocolloDocumentoRes.setMessaggio(rispostaProtocollazioneCodice + " - " + rispostaProtocollazioneMessaggio);
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
      if (EngineeringUtilityControllo.ctrProtocolloLeggi(loginAttr, annoProtocollo, numeroProtocollo, messaggioCtr)) {

        // Codice ente
        String codEnte = InitialContext.doLookup(CODICEENTE);

        // Indirizzo IP
        String indirizzoIP = getIndirizzoIP();

        // XML input
        RicercaProtocollo ricercaProtocollo = new RicercaProtocollo();

        // Identificativo dell'utente collegato
        ricercaProtocollo.setIdPostazLavoro(loginAttr.getLoginEngAttr().getIdUtenteUnitaOperativa());

        // Estremi della registrazione per la ricerca (formato complesso
        // tipo/anno/numero)
        String[] estremiProtocollo = numeroProtocollo.split("/");
        EstremiReg estremiReg = new EstremiReg();
        estremiReg.setSigla(estremiProtocollo[0]);
        estremiReg.setAnno(estremiProtocollo[1]);
        estremiReg.setNro(estremiProtocollo[2]);
        RegPrimaria regPrimaria = new RegPrimaria();
        regPrimaria.setEstremiReg(estremiReg);
        ricercaProtocollo.setRegPrimaria(regPrimaria);

        // Conversione in stringa XML
        StringWriter xmlStringWriter = new StringWriter();
        JAXBContext jaxbLocalContext = JAXBContext.newInstance(it.engineering.xsd.ricercaprotocollo.RicercaProtocollo.class);
        jaxbLocalContext.createMarshaller().marshal(ricercaProtocollo, xmlStringWriter);
        String xmlInput = xmlStringWriter.toString();
        String xmlInputBase64 = Base64.encode(xmlInput.getBytes());

        // XML Hash
        byte[] xmlHash = DigestUtils.sha(xmlInput + password);
        String xmlHashBase64 = Base64.encode(xmlHash);

        // Log della richiesta
        if (logger.isDebugEnabled()) logger.debug("Richiesta ricerca protocollo: " + xmlInput);

        // Richiesta
        String rispostaRicercaXMLBase64 = this.getPROTOWOTestWSRicercaProtocolloPortType().ricerca(codEnte, username, password,
            indirizzoIP, xmlInputBase64, xmlHashBase64);
        String rispostaRicercaXML = new String(Base64.decode(rispostaRicercaXMLBase64));

        // Log della risposta
        if (logger.isDebugEnabled()) logger.debug("Risposta ricerca protocollo: " + rispostaRicercaXML);

        // Trasformazione in oggetto da stringa XML (unmarshal)
        JAXBContext jaxbContext = JAXBContext.newInstance(RisultatoRicerca.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        StringBuffer stringBufferXML = new StringBuffer(rispostaRicercaXML);
        Object objectJAXB = unmarshaller.unmarshal(new StringReader(stringBufferXML.toString()));
        RisultatoRicerca risultatoRicercaProtocollo = (RisultatoRicerca) objectJAXB;

        // Lettura della risposta
        it.engineering.xsd.risultatoricerca.Stato risultatoRicercaStato = risultatoRicercaProtocollo.getStato();
        String risultatoRicercaCodice = risultatoRicercaStato.getCodice();
        String risultatoRicercaMessaggio = risultatoRicercaStato.getMessaggio();

        if ("0".equals(risultatoRicercaCodice)) {
          List<it.engineering.xsd.risultatoricerca.Documento> listaDocumenti = risultatoRicercaProtocollo.getDocumento();
          if (!listaDocumenti.isEmpty() && listaDocumenti.size() > 0) {
            WSDMProtocolloDocumento[] wsdmProtocolloDocumento = this.getDocumenti(listaDocumenti);
            wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmProtocolloDocumento[0]);
            wsdmprotocolloDocumentoRes.setEsito(true);
            wsdmprotocolloDocumentoRes.setMessaggio(risultatoRicercaCodice + " - " + risultatoRicercaMessaggio);
          } else {
            wsdmprotocolloDocumentoRes.setEsito(false);
            wsdmprotocolloDocumentoRes.setMessaggio("La ricerca del protocollo non ha restituito alcun risultato.");
          }
        } else {
          wsdmprotocolloDocumentoRes.setEsito(false);
          wsdmprotocolloDocumentoRes.setMessaggio(risultatoRicercaCodice + " - " + risultatoRicercaMessaggio);
        }

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

  /**
   * Estrae la lista dei documenti dalla ricerca del protocollo e la trasforma
   * nel formato WSDM. La lista e' multipla, a seconda dei casi si considera
   * solo il primo elemento (nel metodo ricerca protocollo per il quale è
   * previsto un solo documento in uscita).
   * 
   * @param listaDocumenti
   * @return
   */
  private WSDMProtocolloDocumento[] getDocumenti(List<it.engineering.xsd.risultatoricerca.Documento> listaDocumenti) {
    WSDMProtocolloDocumento[] wsdmProtocolloDocumento = new WSDMProtocolloDocumento[listaDocumenti.size()];
    if (!listaDocumenti.isEmpty() && listaDocumenti.size() > 0) {
      for (int iDoc = 0; iDoc < listaDocumenti.size(); iDoc++) {
        wsdmProtocolloDocumento[iDoc] = new WSDMProtocolloDocumento();
        it.engineering.xsd.risultatoricerca.Documento schedaDocumento = listaDocumenti.get(iDoc);
        String tipoRegistrazione = schedaDocumento.getTipoReg();
        if (ENG_LEGGI_PROTOCOLLO_IN_USCITA.equals(tipoRegistrazione)) {
          wsdmProtocolloDocumento[iDoc].setInout(WSDMProtocolloInOut.OUT);
        } else if (ENG_LEGGI_PROTOCOLLO_IN_ENTRATA.equals(tipoRegistrazione)) {
          wsdmProtocolloDocumento[iDoc].setInout(WSDMProtocolloInOut.IN);
        } else if (ENG_LEGGI_PROTOCOLLO_INTERNO.equals(tipoRegistrazione)) {
          wsdmProtocolloDocumento[iDoc].setInout(WSDMProtocolloInOut.INT);
        }

        String tipoProtocollo = schedaDocumento.getRegPrimaria().getEstremiReg().getSigla();
        String annoProtocollo = schedaDocumento.getRegPrimaria().getEstremiReg().getAnno();
        String numeroProtocollo = schedaDocumento.getRegPrimaria().getEstremiReg().getNro();

        // Nella risposta si riporta, all'attributo "NumeroProtocollo" la
        // stringa ottenuta concatenando il tipo, l'anno ed il numero, onde
        // evitare di introdurre il nuovo attributo "tipo" nella risposta del
        // servizio interno Eldasoft. L'introduzione di questo nuovo attributo
        // richiederebbe, inoltre, la memorizzazione nelle tabelle del client.
        String numeroProtocolloComplessivo = tipoProtocollo + "/" + annoProtocollo + "/" + numeroProtocollo;

        wsdmProtocolloDocumento[iDoc].setAnnoProtocollo(new Long(schedaDocumento.getRegPrimaria().getEstremiReg().getAnno()));
        wsdmProtocolloDocumento[iDoc].setNumeroProtocollo(numeroProtocolloComplessivo);
        wsdmProtocolloDocumento[iDoc].setNumeroDocumento(schedaDocumento.getIdDoc());
        wsdmProtocolloDocumento[iDoc].setOggetto(schedaDocumento.getOggetto());

        if (ENG_LEGGI_PROTOCOLLO_INTERNO.equals(tipoRegistrazione)) {
          WSDMProtocolloAnagrafica[] anagraficheMittente = new WSDMProtocolloAnagrafica[1];
          WSDMProtocolloAnagrafica[] anagraficheDestinatario = new WSDMProtocolloAnagrafica[1];
          anagraficheMittente[0] = new WSDMProtocolloAnagrafica();
          anagraficheDestinatario[0] = new WSDMProtocolloAnagrafica();
          anagraficheMittente[0].setCognomeointestazione(schedaDocumento.getMittenti());
          anagraficheDestinatario[0].setCognomeointestazione(schedaDocumento.getDestinatari());
          wsdmProtocolloDocumento[iDoc].setMittenti(anagraficheMittente);
          wsdmProtocolloDocumento[iDoc].setDestinatari(anagraficheDestinatario);
        } else {
          List<it.engineering.xsd.risultatoricerca.Nominativo> listaNominativi = schedaDocumento.getNominativo();
          if (!listaNominativi.isEmpty() && listaNominativi.size() > 0) {
            WSDMProtocolloAnagrafica[] anagrafiche = new WSDMProtocolloAnagrafica[listaNominativi.size()];
            for (int iNom = 0; iNom < listaNominativi.size(); iNom++) {
              it.engineering.xsd.risultatoricerca.Nominativo schedaNominativo = listaNominativi.get(iNom);
              anagrafiche[iNom] = new WSDMProtocolloAnagrafica();
              List<Object> cnrs = schedaNominativo.getCognomeOrNomeOrRagioneSociale();
              if (cnrs.size() > 0) {
                String cognomeOIntestazione = null;
                String nome = null;
                for (int c = 0; c < cnrs.size(); c++) {
                  Object o_cnrs = cnrs.get(c);
                  if (o_cnrs instanceof it.engineering.xsd.risultatoricerca.RagioneSociale) {
                    cognomeOIntestazione = ((it.engineering.xsd.risultatoricerca.RagioneSociale) o_cnrs).getvalue();
                  } else if (o_cnrs instanceof it.engineering.xsd.risultatoricerca.Cognome) {
                    cognomeOIntestazione = ((it.engineering.xsd.risultatoricerca.Cognome) o_cnrs).getvalue();
                  } else if (o_cnrs instanceof it.engineering.xsd.risultatoricerca.Nome) {
                    nome = ((it.engineering.xsd.risultatoricerca.Nome) o_cnrs).getvalue();
                  }
                }
                anagrafiche[iNom].setCognomeointestazione(cognomeOIntestazione);
                anagrafiche[iNom].setNome(nome);
              }

              anagrafiche[iNom].setCodiceFiscale(schedaNominativo.getCodFis());
            }
            if (ENG_LEGGI_PROTOCOLLO_IN_ENTRATA.equals(tipoRegistrazione)) {
              wsdmProtocolloDocumento[iDoc].setMittenti(anagrafiche);
            } else if (ENG_LEGGI_PROTOCOLLO_IN_USCITA.equals(tipoRegistrazione)) {
              wsdmProtocolloDocumento[iDoc].setDestinatari(anagrafiche);
            }
          }
        }
      }
    }
    return wsdmProtocolloDocumento;
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
    WSDMFascicoloRes wsdmfascicoloRes = new WSDMFascicoloRes();

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (EngineeringUtilityControllo.ctrFascicoloInserisci(loginAttr, wsdmfascicoloIn, messaggioCtr)) {

        // Codice ente
        String codEnte = InitialContext.doLookup(CODICEENTE);

        // Indirizzo IP
        String indirizzoIP = getIndirizzoIP();

        // XML input
        it.engineering.xsd.inserimentofasc.InserimentoFasc inserimentoFasc = new InserimentoFasc();
        it.engineering.xsd.inserimentofasc.Dati dati = new it.engineering.xsd.inserimentofasc.Dati();
        inserimentoFasc.setDati(dati);

        // Identificativo dell'unita' operativa collegata all'utente
        dati.setIdUoIn(loginAttr.getLoginEngAttr().getIdUtenteUnitaOperativa());

        // Flag per indicare se creare un fascicolo o un sottofascicolo (F =
        // fascicolo, S = sottofascicolo)
        dati.setFlgFSIn("F");

        // Identificativo della classificazione del fascicolo
        dati.setIdTitolazioneIn(wsdmfascicoloIn.getClassificaFascicolo());

        // Oggetto del fascicolo
        dati.setTxtOggIn(wsdmfascicoloIn.getOggettoFascicolo());

        // Note/descrizione del fascicolo
        if (wsdmfascicoloIn.getDescrizioneFascicolo() != null) {
          dati.setNoteIn(wsdmfascicoloIn.getDescrizioneFascicolo());
        }

        // Conversione in stringa XML
        StringWriter xmlStringWriter = new StringWriter();
        JAXBContext jaxbLocalContext = JAXBContext.newInstance(it.engineering.xsd.inserimentofasc.InserimentoFasc.class);
        jaxbLocalContext.createMarshaller().marshal(inserimentoFasc, xmlStringWriter);
        String xmlInput = xmlStringWriter.toString();
        String xmlInputBase64 = Base64.encode(xmlInput.getBytes());

        // XML Hash
        byte[] xmlHash = DigestUtils.sha(xmlInput + password);
        String xmlHashBase64 = Base64.encode(xmlHash);

        // Log della richiesta
        if (logger.isDebugEnabled()) logger.debug("Richiesta inserimento fascicolo: " + xmlInput);

        // Richiesta
        String rispostaInserimentoXMLBase = this.getPROTOWOTestWSInserimentoFascPortType().service(codEnte, username, password,
            indirizzoIP, xmlInputBase64, xmlHashBase64);
        String rispostaInserimentoXML = new String(Base64.decode(rispostaInserimentoXMLBase));

        // Log della risposta
        if (logger.isDebugEnabled()) logger.debug("Risposta inserimento fascicolo: " + rispostaInserimentoXML);

        // Trasformazione in oggetto da stringa XML (unmarshal)
        JAXBContext jaxbContext = JAXBContext.newInstance(it.engineering.xsd.rispostainsfasc.RispostaInsFasc.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        StringBuffer stringBufferXML = new StringBuffer(rispostaInserimentoXML);
        Object objectJAXB = unmarshaller.unmarshal(new StringReader(stringBufferXML.toString()));
        it.engineering.xsd.rispostainsfasc.RispostaInsFasc risultatoInserimentoFasc = (it.engineering.xsd.rispostainsfasc.RispostaInsFasc) objectJAXB;

        // Lettura della risposta
        it.engineering.xsd.rispostainsfasc.Stato risultatoInserimentoStato = risultatoInserimentoFasc.getStato();
        String risultatoInserimentoCodice = risultatoInserimentoStato.getCodice();
        String risultatoInserimentoMessaggio = risultatoInserimentoStato.getMessaggio();

        if ("0".equals(risultatoInserimentoCodice)) {
          WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();
          wsdmFascicolo.setCodiceFascicolo(risultatoInserimentoFasc.getFascicolo().getIdFascicolo());
          wsdmFascicolo.setAnnoFascicolo(new Long(risultatoInserimentoFasc.getFascicolo().getAnnoFascicolo()));
          wsdmFascicolo.setNumeroFascicolo(risultatoInserimentoFasc.getFascicolo().getNumeroFascicolo());
          wsdmfascicoloRes.setFascicolo(wsdmFascicolo);
          wsdmfascicoloRes.setEsito(true);
        } else {
          wsdmfascicoloRes.setEsito(false);
        }

        wsdmfascicoloRes.setMessaggio(risultatoInserimentoCodice + " - " + risultatoInserimentoMessaggio);

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
    wsdmfascicoloRes.setEsito(false);
    wsdmfascicoloRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmfascicoloRes;
  }

  @Override
  public WSDMFascicoloRes _fascicoloLeggi(String username, String password, WSDMLoginAttr loginAttr, String codiceFascicolo,
      Long annoFascicolo, String numeroFascicolo, String classificaFascicolo) {
    WSDMFascicoloRes wsdmfascicoloRes = new WSDMFascicoloRes();

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (EngineeringUtilityControllo.ctrFascicoloLeggi(loginAttr, codiceFascicolo, annoFascicolo, numeroFascicolo, messaggioCtr)) {

        // Codice ente
        String codEnte = InitialContext.doLookup(CODICEENTE);

        // Indirizzo IP
        String indirizzoIP = getIndirizzoIP();

        // XML input
        RicercaFascicolo ricercaFascicolo = new RicercaFascicolo();

        // Identificativo dell'unita' operativa dell'utente collegato
        ricercaFascicolo.setIdUoIn(loginAttr.getLoginEngAttr().getIdUtenteUnitaOperativa());

        // Parametri di ricerca
        it.engineering.xsd.ricercafascicoli.CLASSIFFASC classifFasc = new CLASSIFFASC();
        classifFasc.setAnnoFasc(annoFascicolo.toString());
        classifFasc.setProgrFasc(numeroFascicolo);

        it.engineering.xsd.ricercafascicoli.CLASSIFICAZIONE classificazione = new CLASSIFICAZIONE();
        classificazione.setTitolo("");
        it.engineering.xsd.ricercafascicoli.Classif classif = new Classif();
        classif.setCLASSIFICAZIONE(classificazione);
        classifFasc.setClassif(classif);

        it.engineering.xsd.ricercafascicoli.ClassifFascApp classifFascApp = new ClassifFascApp();
        classifFascApp.setCLASSIFFASC(classifFasc);
        ricercaFascicolo.setClassifFascApp(classifFascApp);

        // Conversione in stringa XML
        StringWriter xmlStringWriter = new StringWriter();
        JAXBContext jaxbLocalContext = JAXBContext.newInstance(RicercaFascicolo.class);
        jaxbLocalContext.createMarshaller().marshal(ricercaFascicolo, xmlStringWriter);
        String xmlInput = xmlStringWriter.toString();
        String xmlInputBase64 = Base64.encode(xmlInput.getBytes());

        // XML Hash
        byte[] xmlHash = DigestUtils.sha(xmlInput + password);
        String xmlHashBase64 = Base64.encode(xmlHash);

        // Log della richiesta
        if (logger.isDebugEnabled()) logger.debug("Richiesta ricerca fascicolo: " + xmlInput);

        // Richiesta
        String rispostaRicercaXMLBase64 = this.getPROTOWOTestWSRicercaFascicoloPortType().ricerca(codEnte, username, password, indirizzoIP,
            xmlInputBase64, xmlHashBase64);
        String rispostaRicercaXML = new String(Base64.decode(rispostaRicercaXMLBase64));

        // Log della risposta
        if (logger.isDebugEnabled()) logger.debug("Risposta ricerca fascicolo: " + rispostaRicercaXML);

        // Trasformazione in oggetto da stringa XML (unmarshal)
        JAXBContext jaxbContext = JAXBContext.newInstance(it.engineering.xsd.risultatoricercafasc.RisultatoRicerca.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        StringBuffer stringBufferXML = new StringBuffer(rispostaRicercaXML);
        Object objectJAXB = unmarshaller.unmarshal(new StringReader(stringBufferXML.toString()));
        it.engineering.xsd.risultatoricercafasc.RisultatoRicerca risultatoRicercaFascicolo = (it.engineering.xsd.risultatoricercafasc.RisultatoRicerca) objectJAXB;

        // Lettura della risposta
        it.engineering.xsd.risultatoricercafasc.Stato risultatoRicercaStato = risultatoRicercaFascicolo.getStato();
        String risultatoRicercaCodice = risultatoRicercaStato.getCodice();
        String risultatoRicercaMessaggio = risultatoRicercaStato.getMessaggio();

        if ("0".equals(risultatoRicercaCodice)) {
          WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();
          wsdmfascicoloRes.setFascicolo(wsdmFascicolo);
          List<Fascicolo> listaFascicoli = risultatoRicercaFascicolo.getFascicolo();
          if (!listaFascicoli.isEmpty() && listaFascicoli.size() > 0) {
            it.engineering.xsd.risultatoricercafasc.Fascicolo schedaFascicolo = listaFascicoli.get(0);
            if (schedaFascicolo.getAnnoFasc() != null) {
              wsdmFascicolo.setAnnoFascicolo(new Long(schedaFascicolo.getAnnoFasc()));
            }
            wsdmFascicolo.setNumeroFascicolo(schedaFascicolo.getNumeroFascicolo());
            wsdmFascicolo.setCodiceFascicolo(schedaFascicolo.getIdFascicolo());
            wsdmFascicolo.setOggettoFascicolo(schedaFascicolo.getOggettoFasc());
            wsdmFascicolo.setClassificaFascicoloDescrizione(schedaFascicolo.getDesTitolazione());
            this._fascicoloLeggiDocumenti(username, password, loginAttr, schedaFascicolo, wsdmfascicoloRes);
            wsdmfascicoloRes.setEsito(true);
            wsdmfascicoloRes.setMessaggio(risultatoRicercaCodice + " - " + risultatoRicercaMessaggio);
          } else {
            wsdmfascicoloRes.setEsito(false);
            wsdmfascicoloRes.setMessaggio("La ricerca del fascicolo non ha restituito alcun risultato.");
          }

        } else {
          wsdmfascicoloRes.setEsito(false);
          wsdmfascicoloRes.setMessaggio(risultatoRicercaCodice + " - " + risultatoRicercaMessaggio);
        }

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

  /**
   * Ottiene l'indirizzo IP del client.
   * 
   * @return
   * @throws UnknownHostException
   */
  private String getIndirizzoIP() throws UnknownHostException {
    InetAddress addr = InetAddress.getLocalHost();
    String indirizzoIP = addr.getHostAddress();
    return indirizzoIP;
  }

  /**
   * Lettura delle lista dei documenti per il fascicolo.
   * 
   * @param username
   * @param password
   * @param loginAttr
   * @param codiceFascicolo
   * @param annoFascicolo
   * @param numeroFascicolo
   * @return
   * @throws Exception
   */
  private void _fascicoloLeggiDocumenti(String username, String password, WSDMLoginAttr loginAttr,
      it.engineering.xsd.risultatoricercafasc.Fascicolo schedaFascicolo, WSDMFascicoloRes wsdmfascicoloRes) throws Exception {

    // Codice ente
    String codEnte = InitialContext.doLookup(CODICEENTE);

    // Indirizzo IP
    String indirizzoIP = getIndirizzoIP();

    // XML input
    RicercaProtocollo ricercaProtocollo = new RicercaProtocollo();

    // Identificativo dell'utente collegato
    ricercaProtocollo.setIdPostazLavoro(loginAttr.getLoginEngAttr().getIdUtenteUnitaOperativa());

    // Ricerca dei documenti per fascicolo
    it.engineering.xsd.ricercaprotocollo.CLASSIFFASC classifFasc = new it.engineering.xsd.ricercaprotocollo.CLASSIFFASC();
    classifFasc.setIdFascicolo(schedaFascicolo.getIdFascicolo());
    classifFasc.setAnnoFasc(schedaFascicolo.getAnnoFasc());
    classifFasc.setProgrFasc(schedaFascicolo.getNumeroFascicolo());
    classifFasc.setNumSottofasc(schedaFascicolo.getNumSottofasc());
    it.engineering.xsd.ricercaprotocollo.CLASSIFICAZIONE classificazione = new it.engineering.xsd.ricercaprotocollo.CLASSIFICAZIONE();
    classificazione.setTitolo(schedaFascicolo.getTitolo());
    classificazione.setClasse(schedaFascicolo.getClasse());
    classificazione.setSottoClasse(schedaFascicolo.getSottoClasse());
    classificazione.setLivello4(schedaFascicolo.getLivello4());
    classificazione.setLivello5(schedaFascicolo.getLivello5());
    it.engineering.xsd.ricercaprotocollo.Classif classif = new it.engineering.xsd.ricercaprotocollo.Classif();
    classif.setCLASSIFICAZIONE(classificazione);
    classifFasc.setClassif(classif);

    it.engineering.xsd.ricercaprotocollo.ClassifFascApp classifFascApp = new it.engineering.xsd.ricercaprotocollo.ClassifFascApp();
    classifFascApp.setCLASSIFFASC(classifFasc);
    ricercaProtocollo.setClassifFascApp(classifFascApp);

    // Conversione in stringa XML
    StringWriter xmlStringWriter = new StringWriter();
    JAXBContext jaxbLocalContext = JAXBContext.newInstance(it.engineering.xsd.ricercaprotocollo.RicercaProtocollo.class);
    jaxbLocalContext.createMarshaller().marshal(ricercaProtocollo, xmlStringWriter);
    String xmlInput = xmlStringWriter.toString();
    String xmlInputBase64 = Base64.encode(xmlInput.getBytes());

    // XML Hash
    byte[] xmlHash = DigestUtils.sha(xmlInput + password);
    String xmlHashBase64 = Base64.encode(xmlHash);

    // Log della richiesta
    if (logger.isDebugEnabled()) logger.debug("Richiesta ricerca documenti del fascicolo: " + xmlInput);

    // Richiesta
    String rispostaRicercaXMLBase64 = this.getPROTOWOTestWSRicercaProtocolloPortType().ricerca(codEnte, username, password, indirizzoIP,
        xmlInputBase64, xmlHashBase64);
    String rispostaRicercaXML = new String(Base64.decode(rispostaRicercaXMLBase64));

    // Log della risposta
    if (logger.isDebugEnabled()) logger.debug("Risposta ricerca documenti del fascicolo: " + rispostaRicercaXML);

    // Trasformazione in oggetto da stringa XML (unmarshal)
    JAXBContext jaxbContext = JAXBContext.newInstance(RisultatoRicerca.class);
    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
    StringBuffer stringBufferXML = new StringBuffer(rispostaRicercaXML);
    Object objectJAXB = unmarshaller.unmarshal(new StringReader(stringBufferXML.toString()));
    RisultatoRicerca risultatoRicercaProtocollo = (RisultatoRicerca) objectJAXB;

    // Lettura della risposta
    it.engineering.xsd.risultatoricerca.Stato risultatoRicercaStato = risultatoRicercaProtocollo.getStato();
    String risultatoRicercaCodice = risultatoRicercaStato.getCodice();
    String risultatoRicercaMessaggio = risultatoRicercaStato.getMessaggio();

    if ("0".equals(risultatoRicercaCodice) || "2".equals(risultatoRicercaCodice)) {
      List<it.engineering.xsd.risultatoricerca.Documento> listaDocumenti = risultatoRicercaProtocollo.getDocumento();
      if (!listaDocumenti.isEmpty() && listaDocumenti.size() > 0) {
        WSDMFascicoloDocumento[] wsdmFascicoloDocumento = new WSDMFascicoloDocumento[listaDocumenti.size()];
        for (int iDoc = 0; iDoc < listaDocumenti.size(); iDoc++) {
          wsdmFascicoloDocumento[iDoc] = new WSDMFascicoloDocumento();
          it.engineering.xsd.risultatoricerca.Documento schedaDocumento = listaDocumenti.get(iDoc);
          String tipoRegistrazione = schedaDocumento.getTipoReg();
          if (ENG_LEGGI_PROTOCOLLO_IN_USCITA.equals(tipoRegistrazione)) {
            wsdmFascicoloDocumento[iDoc].setInout(WSDMProtocolloInOut.OUT);
          } else if (ENG_LEGGI_PROTOCOLLO_IN_ENTRATA.equals(tipoRegistrazione)) {
            wsdmFascicoloDocumento[iDoc].setInout(WSDMProtocolloInOut.IN);
          } else if (ENG_LEGGI_PROTOCOLLO_INTERNO.equals(tipoRegistrazione)) {
            wsdmFascicoloDocumento[iDoc].setInout(WSDMProtocolloInOut.INT);
          }

          String tipoProtocollo = schedaDocumento.getRegPrimaria().getEstremiReg().getSigla();
          String annoProtocollo = schedaDocumento.getRegPrimaria().getEstremiReg().getAnno();
          String numeroProtocollo = schedaDocumento.getRegPrimaria().getEstremiReg().getNro();

          // Nella risposta si riporta, all'attributo "NumeroProtocollo" la
          // stringa ottenuta concatenando il tipo, l'anno ed il numero, onde
          // evitare di introdurre il nuovo attributo "tipo" nella risposta del
          // servizio interno Eldasoft. L'introduzione di questo nuovo attributo
          // richiederebbe, inoltre, la memorizzazione nelle tabelle del client.
          String numeroProtocolloComplessivo = tipoProtocollo + "/" + annoProtocollo + "/" + numeroProtocollo;
          wsdmFascicoloDocumento[iDoc].setAnnoProtocollo(new Long(schedaDocumento.getRegPrimaria().getEstremiReg().getAnno()));
          wsdmFascicoloDocumento[iDoc].setNumeroProtocollo(numeroProtocolloComplessivo);
          wsdmFascicoloDocumento[iDoc].setNumeroDocumento(schedaDocumento.getIdDoc());
          wsdmFascicoloDocumento[iDoc].setOggetto(schedaDocumento.getOggetto());
        }
        wsdmfascicoloRes.getFascicolo().setDocumenti(wsdmFascicoloDocumento);
      }
    } else {
      logger.error("Errore nella ricerca dei documenti contenuti nel fascicolo. Richiesta: "
          + xmlInput
          + ". Risposta: "
          + risultatoRicercaCodice
          + " - "
          + risultatoRicercaMessaggio);
    }

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
