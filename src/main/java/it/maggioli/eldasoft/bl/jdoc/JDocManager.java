package it.maggioli.eldasoft.bl.jdoc;

import it.jdoc.AddAttachmentResult;
import it.jdoc.ArchiveResult;
import it.jdoc.ArrayOfDocField;
import it.jdoc.ArrayOfError;
import it.jdoc.DocField;
import it.jdoc.DocPutRequestOptions;
import it.jdoc.DocResultCondition;
import it.jdoc.IWSOperazioni;
import it.jdoc.InputAddAttachment;
import it.jdoc.InputArchive;
import it.jdoc.InputByIdDoc;
import it.jdoc.InputLink;
import it.jdoc.InputParameter;
import it.jdoc.LinkResult;
import it.jdoc.UserResult;
import it.jdoc.WSOperazioni;
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
import it.maggioli.eldasoft.ws.dm.WSDMTrasmissioneIn;
import it.maggioli.eldasoft.ws.dm.WSDMTrasmissioneRes;
import it.maggioli.eldasoft.ws.dm.WSDMVerificaMailRes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.ws.WebServiceException;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.message.Message;
import org.apache.log4j.Logger;

/**
 * Manager per la gestione documentale mediante sistema di protocollo ARXIVAR.
 * 
 */

public class JDocManager implements IWSDMManager {

  static Logger         logger                        = Logger.getLogger(JDocManager.class);

  static private String JDOC_WS_OPERAZIONI            = "java:comp/env/JDOC_WS_OPERAZIONI";
  static private String JDOC_WS_OPERAZIONI_ND         = "JDOC: l'indirizzo del servizio protocollo non e' definito";

  static private String JDOC_USER                     = "java:comp/env/JDOC_USER";
  static private String JDOC_USER_ND                  = "JDOC: l'utente (USER) che sta archiviando non e' definito";

  static private String JDOC_COMPANY                  = "java:comp/env/JDOC_COMPANY";
  static private String JDOC_COMPANY_ND               = "JDOC: l'azienda (COMPANY) che sta archiviando non e' definita";

  static private String JDOC_DOCTYPE_ENTRATA          = "java:comp/env/JDOC_DOCTYPE_ENTRATA";
  static private String JDOC_DOCTYPE_ENTRATA_ND       = "JDOC: il tipo documento (ingresso/entrata) non e' definito";

  static private String JDOC_DOCTYPE_FASCICOLO        = "java:comp/env/JDOC_DOCTYPE_FASCICOLO";
  static private String JDOC_DOCTYPE_FASCICOLO_ND     = "JDOC: il tipo documento (fascicolo) non e' definito";

  static private String JDOC_FASCICOLO_TESTO_ALLEGATO = "java:comp/env/JDOC_FASCICOLO_TESTO_ALLEGATO";

  static private String JDOC_ENTRATA                  = "E";
  static private String JDOC_INTERNO                  = "I";
  static private String JDOC_USCITA                   = "U";

  static private String JDOC_PROTOCOLLO_C01           = "java:comp/env/JDOC_PROTOCOLLO_C01";
  static private String JDOC_FASCICOLO_C01            = "java:comp/env/JDOC_FASCICOLO_C01";
  static private String JDOC_PROTOCOLLO_C11           = "java:comp/env/JDOC_PROTOCOLLO_C11";

  private IWSOperazioni getIWSOperazioni() throws Exception {
    String address = InitialContext.doLookup(JDOC_WS_OPERAZIONI);
    if (address == null || (address != null && "".equals(address.trim()))) {
      throw new Exception(JDOC_WS_OPERAZIONI_ND);
    }

    WSOperazioni service = new WSOperazioni();
    IWSOperazioni port = service.getBasicHttpBindingIWSOperazioni();
    Client client = ClientProxy.getClient(port);
    client.getRequestContext().put(Message.ENDPOINT_ADDRESS, address);
    client.getRequestContext().put(Message.RECEIVE_TIMEOUT, 30 * 60 * 1000);
    return port;

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
      if (JDocUtilityControllo.ctrProtocolloInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {
        wsdmprotocolloDocumentoRes = archivia(username, password, loginAttr, wsdmprotocolloDocumentoIn);
      } else {
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
      }
    } catch (WebServiceException w) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_protocolloInserisci)", w);
    } catch (Throwable t) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(t.getMessage());
      logger.error("Errore (_protocolloInserisci)", t);
    }

    return wsdmprotocolloDocumentoRes;
  }

  private WSDMProtocolloDocumentoRes archivia(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) throws Exception, NamingException {

    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    IWSOperazioni wsOperazioni = this.getIWSOperazioni();
    InputParameter doLoginInput = new InputParameter();
    doLoginInput.setUsername(username);
    doLoginInput.setTokenOrPassword(password);

    UserResult userResult = wsOperazioni.doLogin(doLoginInput);
    Boolean _b = userResult.isIsOk();
    if (_b) {

      // Oggetto di input per la protocollazione
      InputArchive inputArchive = new InputArchive();

      // Username
      inputArchive.setUsername(username);

      // Token
      String tokenOrPassword = userResult.getToken();
      if (tokenOrPassword == null) {
        tokenOrPassword = password;
      }
      inputArchive.setTokenOrPassword(tokenOrPassword);

      // Utente che sta archiviando
      String user = InitialContext.doLookup(JDOC_USER);
      if (user == null || (user != null && "".equals(user.trim()))) {
        throw new Exception(JDOC_USER_ND);
      } else {
        inputArchive.setUser(user);
      }

      // Azienda
      String company = InitialContext.doLookup(JDOC_COMPANY);
      if (company == null || (company != null && "".equals(company.trim()))) {
        throw new Exception(JDOC_COMPANY_ND);
      } else {
        inputArchive.setCompany(company);
      }

      // Tipo di documento (doctype)
      if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
        String doctype = InitialContext.doLookup(JDOC_DOCTYPE_ENTRATA);
        if (doctype == null || (doctype != null && "".equals(doctype.trim()))) {
          throw new Exception(JDOC_DOCTYPE_ENTRATA_ND);
        } else {
          inputArchive.setDocType(doctype);
        }
      } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
        // WSDM-77: il doctype per la protocollazione in uscita viene ora
        // passato da Appalti
        // String doctype = InitialContext.doLookup(JDOC_DOCTYPE_USCITA);
        String doctype = wsdmprotocolloDocumentoIn.getTipoDocumento();
        inputArchive.setDocType(doctype);
      } else if (WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
        // WSDM-77: il doctype per la protocollazione in uscita viene ora
        // passato da Appalti
        // String doctype = InitialContext.doLookup(JDOC_DOCTYPE_INTERNO);
        String doctype = wsdmprotocolloDocumentoIn.getTipoDocumento();
        inputArchive.setDocType(doctype);
      }

      // Lista dei "docField"
      ArrayOfDocField arrayOfDocField = new ArrayOfDocField();

      // Sottotipo
      // WSDM-77: il sottotipo deve confluire nel campo C05 e non più' nel campo
      // C08.
      // Il campo C08 non serve piu' non e' piu' necessario popolarlo.
      // Destinazione: DocField/C05
      // Sorgente: GenericS11
      if (wsdmprotocolloDocumentoIn.getGenericS11() != null) {
        DocField c05 = new DocField();
        c05.setChiave("C05");
        c05.setValore(wsdmprotocolloDocumentoIn.getGenericS11());
        arrayOfDocField.getDocField().add(c05);
      }

      // Oggetto
      // Destinazione: DocField/C16
      // Sorgente: Oggetto
      if (wsdmprotocolloDocumentoIn.getOggetto() != null) {
        DocField c16 = new DocField();
        c16.setChiave("C16");
        c16.setValore(wsdmprotocolloDocumentoIn.getOggetto());
        arrayOfDocField.getDocField().add(c16);
      }

      // Data
      // Destinazione: DocField/C02
      // Sorgente: data corrente
      DateFormat dataCorrenteFormat = new SimpleDateFormat("dd/MM/yyyy");
      String sdataCorrente = dataCorrenteFormat.format(new Date());
      DocField c02 = new DocField();
      c02.setChiave("C02");
      c02.setValore(sdataCorrente);
      arrayOfDocField.getDocField().add(c02);

      // Flusso
      // Destinazione: DocField/C20
      // Sorgente: InOut
      // Protocollo OUT: U
      // Protocollo IN: E
      // Protocollo INT: I
      String flusso = null;
      if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
        flusso = JDOC_ENTRATA;
      } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
        flusso = JDOC_USCITA;
      } else if (WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
        flusso = JDOC_INTERNO;
      }
      if (flusso != null) {
        DocField c20 = new DocField();
        c20.setChiave("C20");
        c20.setValore(flusso);
        arrayOfDocField.getDocField().add(c20);
      }

      // Mezzo spedizione
      // Destinazione: DocField/C14
      // Sorgente: Mezzo
      if (wsdmprotocolloDocumentoIn.getMezzo() != null) {
        DocField c14 = new DocField();
        c14.setChiave("C14");
        c14.setValore(wsdmprotocolloDocumentoIn.getMezzo());
        arrayOfDocField.getDocField().add(c14);
      }

      // Codice RUP
      // Destinazione: DocField/C22
      // Sorgente: GenericS12
      if (wsdmprotocolloDocumentoIn.getGenericS12() != null) {
        DocField c22 = new DocField();
        c22.setChiave("C22");
        c22.setValore(wsdmprotocolloDocumentoIn.getGenericS12());
        arrayOfDocField.getDocField().add(c22);
      }

      // Destinatario per l'archiviazione in uscita
      // Destinazione: DocField/C12
      // Sorgente: Concatenzazione di cognomeointestazione e nome della
      // prima anagrafica destinataria
      if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
        WSDMProtocolloAnagrafica[] anagraficaDestinatari = wsdmprotocolloDocumentoIn.getDestinatari();
        if (anagraficaDestinatari != null && anagraficaDestinatari.length > 0) {
          String c12_value = "";
          for (int d = 0; d < anagraficaDestinatari.length; d++) {
            String destinatario = anagraficaDestinatari[d].getCognomeointestazione();
            if (anagraficaDestinatari[d].getNome() != null) {
              destinatario += " " + anagraficaDestinatari[d].getNome();
            }
            if (destinatario != null && !"".equals(destinatario.trim())) {
              if ("".equals(c12_value)) {
                c12_value = destinatario;
              } else {
                c12_value += "," + destinatario;
              }
            }
          }
          DocField c12 = new DocField();
          c12.setChiave("C12");
          c12.setValore(c12_value);
          arrayOfDocField.getDocField().add(c12);
        }
      }

      // Destinatario per l'archiviazione in ingresso
      // Destinazione: DocField/C12
      // Sorgente: Concatenzazione di cognomeointestazione e nome della
      // prima anagrafica destinataria
      if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
        WSDMProtocolloAnagrafica[] anagraficaMittenti = wsdmprotocolloDocumentoIn.getMittenti();
        if (anagraficaMittenti != null && anagraficaMittenti.length > 0) {
          String c12_value = "";
          for (int m = 0; m < anagraficaMittenti.length; m++) {
            String mittente = anagraficaMittenti[m].getCognomeointestazione();
            if (anagraficaMittenti[m].getNome() != null) {
              mittente += " " + anagraficaMittenti[m].getNome();
            }
            if (mittente != null && !"".equals(mittente.trim())) {
              if ("".equals(c12_value)) {
                c12_value = mittente;
              } else {
                c12_value += "," + mittente;
              }
            }
          }
          DocField c12 = new DocField();
          c12.setChiave("C12");
          c12.setValore(c12_value);
          arrayOfDocField.getDocField().add(c12);
        }
      }

      // Mittente per l'archiviazione interna
      // Destinazione: DocField/C12
      // Sorgente: valore fisso "Non necessario"
      if (WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
        DocField c12 = new DocField();
        c12.setChiave("C12");
        c12.setValore("Non necessario");
        arrayOfDocField.getDocField().add(c12);
      }

      // Data documento
      // Destinazione: DocField/C13
      // Sorgente: data corrente
      DocField c13 = new DocField();
      c13.setChiave("C13");
      c13.setValore(sdataCorrente);
      arrayOfDocField.getDocField().add(c13);

      // Campo C01 aggiunto il 19/11/2020
      DocField c01 = new DocField();
      c01.setChiave("C01");
      String c01_value = InitialContext.doLookup(JDOC_PROTOCOLLO_C01);
      c01.setValore(c01_value);
      arrayOfDocField.getDocField().add(c01);

      // WSDM-77: il popolamento del campo C05 viene effettuato con il valore
      // del sottotipo.
      // Inizialmente il sottotipo confluiva nel campo C08, ora il campo C08 non
      // serve piu' e al suo posto si utilizza il campo C05.
      // Campi mancanti C05, C11
      // Ad oggi 17/09/2020 non sappiamo come valorizzarli, il nostro referente
      // Federico Olioso non risponde alle nostre richieste, per questo motivo
      // li indichiamo con valori fasulli
      // String c05_value = " ";
      // try {
      // if (wsdmprotocolloDocumentoIn.getGenericS13() != null) {
      // c05_value = wsdmprotocolloDocumentoIn.getGenericS13();
      // } else {
      // c05_value = InitialContext.doLookup(JDOC_PROTOCOLLO_C05);
      // }
      // } catch (Exception e) {
      //
      // }
      // DocField c05 = new DocField();
      // c05.setChiave("C05");
      // c05.setValore(c05_value);
      // arrayOfDocField.getDocField().add(c05);

      String c11_value = " ";
      try {
        if (wsdmprotocolloDocumentoIn.getGenericS14() != null) {
          c11_value = wsdmprotocolloDocumentoIn.getGenericS14();
        } else {
          c11_value = InitialContext.doLookup(JDOC_PROTOCOLLO_C11);
        }
      } catch (Exception e) {

      }
      DocField c11 = new DocField();
      c11.setChiave("C11");
      c11.setValore(c11_value);
      arrayOfDocField.getDocField().add(c11);

      // Eventuale creazione di un nuovo fascicolo
      boolean esitoFascicolo = true;
      String oggettoFascicolo = null;
      String codiceFascicolo = null;
      Long annoFascicolo = null;
      String numeroFascicolo = null;
      String genericS11 = null;
      String genericS12 = null;

      if (WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {

        oggettoFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getOggettoFascicolo();
        genericS11 = wsdmprotocolloDocumentoIn.getFascicolo().getGenericS11();
        genericS12 = wsdmprotocolloDocumentoIn.getFascicolo().getGenericS12();

        WSDMFascicoloIn wsdmFascicoloIn = new WSDMFascicoloIn();
        wsdmFascicoloIn.setOggettoFascicolo(oggettoFascicolo);
        wsdmFascicoloIn.setGenericS11(genericS11);
        wsdmFascicoloIn.setGenericS12(genericS12);

        WSDMFascicoloRes wsdmFascicoloRes = this._fascicoloInserisci(username, password, loginAttr, wsdmFascicoloIn);
        if (!wsdmFascicoloRes.isEsito()) {
          esitoFascicolo = false;
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

      if (esitoFascicolo == true) {
        DocField c90 = new DocField();
        c90.setChiave("C90");
        c90.setValore(codiceFascicolo);
        arrayOfDocField.getDocField().add(c90);
      }

      // Delega invio PEC per l'archiviazione in uscita
      // Destinazione: DocField/C89
      // Sorgente: valore fisso "NO"
      // Lista indirizzi email dei destinatari
      // Destinazione: DocField/C88
      // Sorgente: email di tutti i destinatari convolti
      if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
        DocField c89 = new DocField();
        c89.setChiave("C89");
        c89.setValore("NO");
        arrayOfDocField.getDocField().add(c89);

        WSDMProtocolloAnagrafica[] anagraficaDestinatari = wsdmprotocolloDocumentoIn.getDestinatari();
        if (anagraficaDestinatari != null && anagraficaDestinatari.length > 0) {
          String c88_value = "";
          for (int d = 0; d < anagraficaDestinatari.length; d++) {
            String email = anagraficaDestinatari[d].getEmail();
            if (email != null && !"".equals(email.trim())) {
              if ("".equals(c88_value)) {
                c88_value = email;
              } else {
                c88_value += "," + email;
              }
            }
          }
          DocField c88 = new DocField();
          c88.setChiave("C88");
          c88.setValore(c88_value);
          arrayOfDocField.getDocField().add(c88);
        }
      }

      inputArchive.setDocFields(arrayOfDocField);

      // Gestione del primo allegato.
      // Gli altri allegati dovranno essere inviati con l'operazione
      // "AddAttachment"
      WSDMProtocolloAllegato[] allegati = wsdmprotocolloDocumentoIn.getAllegati();
      if (allegati != null && allegati.length > 0) {
        DocPutRequestOptions doc = new DocPutRequestOptions();
        doc.setFileName(allegati[0].getNome());
        doc.setFileType(allegati[0].getTipo());
        doc.setIMG(allegati[0].getContenuto());

        inputArchive.setDocPutRequestOptions(doc);
      }

      if (esitoFascicolo == true) {
        ArchiveResult archiveResult = wsOperazioni.doArchive(inputArchive);
        boolean archiveResultIsOk = archiveResult.isIsOk();
        if (archiveResultIsOk) {
          // Numero protocollo
          Long numeroProtocollo = archiveResult.getResult();

          // Verifica della protocollazione mediante GetDocumentConditionByIdDoc
          InputByIdDoc inputByIdDoc = new InputByIdDoc();
          inputByIdDoc.setIddoc(numeroProtocollo);
          inputByIdDoc.setUsername(username);
          inputByIdDoc.setTokenOrPassword(tokenOrPassword);

          DocResultCondition docResultCondition = wsOperazioni.getDocumentConditionByIdDoc(inputByIdDoc);
          boolean docResultConditionOk = docResultCondition.isIsOk();
          if (docResultConditionOk) {

            wsdmprotocolloDocumentoRes.setEsito(true);

            // Dati del protocollo
            WSDMProtocolloDocumento wsdmprotocolloDocumento = new WSDMProtocolloDocumento();
            wsdmprotocolloDocumento.setNumeroDocumento(String.valueOf(numeroProtocollo));

            Date now = new Date();
            DateFormat annoCorrenteFormat = new SimpleDateFormat("yyyy");
            String sAnnoCorrente = annoCorrenteFormat.format(now);
            wsdmprotocolloDocumento.setAnnoProtocollo(new Long(sAnnoCorrente));

            wsdmprotocolloDocumento.setNumeroProtocollo(String.valueOf(numeroProtocollo));
            wsdmprotocolloDocumento.setDataProtocollo(now);

            // Dati del fascicolo
            WSDMFascicolo fascicolo = new WSDMFascicolo();
            fascicolo.setAnnoFascicolo(annoFascicolo);
            fascicolo.setCodiceFascicolo(codiceFascicolo);
            fascicolo.setNumeroFascicolo(numeroFascicolo);
            fascicolo.setOggettoFascicolo(oggettoFascicolo);
            fascicolo.setGenericS11(genericS11);
            fascicolo.setGenericS12(genericS12);
            wsdmprotocolloDocumento.setInserimentoInFascicolo(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo());
            wsdmprotocolloDocumento.setFascicolo(fascicolo);

            wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmprotocolloDocumento);

            // Aggiunta ulteriori allegati
            if (allegati != null && allegati.length > 1) {
              for (int a = 1; a < allegati.length; a++) {
                InputAddAttachment inputAddAttachment = new InputAddAttachment();
                inputAddAttachment.setUsername(username);
                inputAddAttachment.setTokenOrPassword(tokenOrPassword);
                inputAddAttachment.setDescription(allegati[a].getTitolo());
                inputAddAttachment.setFileName(allegati[a].getNome());
                inputAddAttachment.setIdDoc(numeroProtocollo.toString());
                inputAddAttachment.setIMG(allegati[a].getContenuto());
                inputAddAttachment.setNotes(allegati[a].getTitolo());

                AddAttachmentResult addAttachmentResult = wsOperazioni.addAttachment(inputAddAttachment);
                if (!addAttachmentResult.isIsOk()) {
                  ArrayOfError addAttachmentArrayOfError = addAttachmentResult.getErrorList();
                  if (addAttachmentArrayOfError != null) {
                    List<it.jdoc.Error> addAttachmentErrorList = addAttachmentArrayOfError.getError();
                    String addAttachmentMessaggio = "";
                    for (int e = 0; e < addAttachmentErrorList.size(); e++) {
                      if ("".equals(addAttachmentMessaggio)) {
                        addAttachmentMessaggio = addAttachmentErrorList.get(e).getErrorMessage();
                      } else {
                        addAttachmentMessaggio += " - " + addAttachmentErrorList.get(e).getErrorMessage();
                      }
                    }
                    logger.debug("Errore nell'inserimento degli allegati successivi al documento principale: " + addAttachmentMessaggio);
                  }
                }
              }
            }

            // Collegamento protocollo-fascicolo mediante operazione dolink
            InputLink inputLink = new InputLink();
            inputLink.setUsername(username);
            inputLink.setTokenOrPassword(tokenOrPassword);
            inputLink.setUser(user);
            inputLink.setCompany(company);
            inputLink.setIddoc1(new Long(codiceFascicolo));
            inputLink.setIddoc2(numeroProtocollo);
            LinkResult linkResult = wsOperazioni.doLink(inputLink);
            if (!linkResult.isIsOk()) {
              ArrayOfError arrayOfError = linkResult.getErrorList();
              List<it.jdoc.Error> errorList = arrayOfError.getError();
              String messaggioErroreDoLink = "";
              for (int e = 0; e < errorList.size(); e++) {
                if ("".equals(messaggioErroreDoLink)) {
                  messaggioErroreDoLink = errorList.get(e).getErrorMessage();
                } else {
                  messaggioErroreDoLink += " - " + errorList.get(e).getErrorMessage();
                }
              }
              logger.info("Errore nell'invocazione dell'operazione DoLink: " + messaggioErroreDoLink);
            }
          }

        } else {
          wsdmprotocolloDocumentoRes.setEsito(false);
          String messaggio = "";
          ArrayOfError arrayOfError = archiveResult.getErrorList();
          if (arrayOfError != null) {
            List<it.jdoc.Error> errorList = arrayOfError.getError();
            for (int e = 0; e < errorList.size(); e++) {
              if ("".equals(messaggio)) {
                messaggio = errorList.get(e).getErrorMessage();
              } else {
                messaggio += " - " + errorList.get(e).getErrorMessage();
              }
            }
          }
          wsdmprotocolloDocumentoRes.setMessaggio(messaggio);
        }
      }

    }

    return wsdmprotocolloDocumentoRes;

  }

  @Override
  public WSDMProtocolloDocumentoRes _protocolloLeggi(String username, String password, WSDMLoginAttr loginAttr, Long annoProtocollo,
      String numeroProtocollo) {

    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (JDocUtilityControllo.ctrProtocolloLeggi(loginAttr, annoProtocollo, numeroProtocollo, messaggioCtr)) {

      } else {
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (WebServiceException w) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_protocolloLeggi)", w);
      // } catch (NamingException e) {
      // wsdmprotocolloDocumentoRes.setEsito(false);
      // wsdmprotocolloDocumentoRes.setMessaggio(NAMING_ERROR + " " +
      // e.getMessage());
      // logger.error("Errore (_protocolloLeggi)", e);
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
      if (JDocUtilityControllo.ctrDocumentoInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {
        wsdmprotocolloDocumentoRes = archivia(username, password, loginAttr, wsdmprotocolloDocumentoIn);
      } else {
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
      }
    } catch (WebServiceException w) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_documentoInserisci)", w);
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
  public WSDMFascicoloRes _fascicoloInserisci(String username, String password, WSDMLoginAttr loginAttr, WSDMFascicoloIn wsdmFascicoloIn) {
    WSDMFascicoloRes wsdmfascicoloRes = new WSDMFascicoloRes();

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (JDocUtilityControllo.ctrFascicoloInserisci(loginAttr, wsdmFascicoloIn, messaggioCtr)) {
        IWSOperazioni wsOperazioni = this.getIWSOperazioni();
        InputParameter doLoginInput = new InputParameter();
        doLoginInput.setUsername(username);
        doLoginInput.setTokenOrPassword(password);

        UserResult userResult = wsOperazioni.doLogin(doLoginInput);
        Boolean _b = userResult.isIsOk();
        if (_b) {

          // Oggetto di input per la protocollazione
          InputArchive inputArchive = new InputArchive();

          // Username
          inputArchive.setUsername(username);

          // Token
          String tokenOrPassword = userResult.getToken();
          if (tokenOrPassword == null) {
            tokenOrPassword = password;
          }
          inputArchive.setTokenOrPassword(tokenOrPassword);

          // Utente che sta archiviando
          String user = InitialContext.doLookup(JDOC_USER);
          if (user == null || (user != null && "".equals(user.trim()))) {
            throw new Exception(JDOC_USER_ND);
          } else {
            inputArchive.setUser(user);
          }

          // Azienda
          String company = InitialContext.doLookup(JDOC_COMPANY);
          if (company == null || (company != null && "".equals(company.trim()))) {
            throw new Exception(JDOC_COMPANY_ND);
          } else {
            inputArchive.setCompany(company);
          }

          // Tipo di documento (doctype)
          String doctype = InitialContext.doLookup(JDOC_DOCTYPE_FASCICOLO);
          if (doctype == null || (doctype != null && "".equals(doctype.trim()))) {
            throw new Exception(JDOC_DOCTYPE_FASCICOLO_ND);
          } else {
            inputArchive.setDocType(doctype);
          }

          // Lista dei "docField"
          ArrayOfDocField arrayOfDocField = new ArrayOfDocField();

          // Oggetto
          // Destinazione: DocField/C16
          // Sorgente: OggettoFascicolo
          if (wsdmFascicoloIn.getOggettoFascicolo() != null) {
            DocField c16 = new DocField();
            c16.setChiave("C16");
            c16.setValore(wsdmFascicoloIn.getOggettoFascicolo());
            arrayOfDocField.getDocField().add(c16);
          }

          // Data
          // Destinazione: DocField/C50
          // Sorgente: Data corrente
          // Destinazione: DocField/C21
          // Sorgente: Anno corrente
          Date now = new Date();
          DocField c50 = new DocField();
          DateFormat dataCorrenteFormat = new SimpleDateFormat("dd/MM/yyyy");
          String sdataCorrente = dataCorrenteFormat.format(now);
          c50.setChiave("C50");
          c50.setValore(sdataCorrente);
          arrayOfDocField.getDocField().add(c50);

          DocField c21 = new DocField();
          DateFormat annoCorrenteFormat = new SimpleDateFormat("yyyy");
          String sAnnoCorrente = annoCorrenteFormat.format(now);
          c21.setChiave("C21");
          c21.setValore(sAnnoCorrente);
          arrayOfDocField.getDocField().add(c21);

          // Acronimi RUP
          // Destinazione: DocField/C06
          // Sorgente: genericS11
          if (wsdmFascicoloIn.getGenericS11() != null) {
            DocField c06 = new DocField();
            c06.setChiave("C06");
            c06.setValore(wsdmFascicoloIn.getGenericS11());
            arrayOfDocField.getDocField().add(c06);
          }
          // Nome e cognome RUP
          // Destinazione: DocField/C17
          // Sorgente: genericS12
          if (wsdmFascicoloIn.getGenericS12() != null) {
            DocField c17 = new DocField();
            c17.setChiave("C17");
            c17.setValore(wsdmFascicoloIn.getGenericS12());
            arrayOfDocField.getDocField().add(c17);
          }

          // Azienda
          // Destinazione: DocFiled/C01
          // Sorgente: JDOC_COMPANY su context.xml
          // Indicazione fornita da Federico Olioso il 16/09/2020
          // Per linserimento della pratica di acquisto, anche qui azienda ‘PPC’
          // e aggiungi la chiave
          // <DocField>
          // <Chiave>C01</Chiave>
          // <Valore>PPC</Valore>
          // </DocField>
          // if (company != null) {
          // DocField c01 = new DocField();
          // c01.setChiave("C01");
          // c01.setValore(company);
          // arrayOfDocField.getDocField().add(c01);
          // }

          // Campo C01 aggiunto il 19/11/2020
          DocField c01 = new DocField();
          c01.setChiave("C01");
          String c01_value = InitialContext.doLookup(JDOC_FASCICOLO_C01);
          c01.setValore(c01_value);
          arrayOfDocField.getDocField().add(c01);

          inputArchive.setDocFields(arrayOfDocField);

          // Gestione dell'allegato fisso per la creazione del fascicolo
          DocPutRequestOptions doc = new DocPutRequestOptions();
          doc.setFileName("Allegato.txt");
          doc.setFileType("TXT");
          String testoAllegato = (String) InitialContext.doLookup(JDOC_FASCICOLO_TESTO_ALLEGATO);
          doc.setIMG(testoAllegato.getBytes());
          inputArchive.setDocPutRequestOptions(doc);

          ArchiveResult archiveResult = wsOperazioni.doArchive(inputArchive);
          if (archiveResult.isIsOk()) {
            wsdmfascicoloRes.setEsito(true);
            WSDMFascicolo wsdmfascicolo = new WSDMFascicolo();

            // Codice e numero del fascicolo
            Long numeroFascicolo = archiveResult.getResult();
            wsdmfascicolo.setCodiceFascicolo(numeroFascicolo.toString());
            wsdmfascicolo.setNumeroFascicolo(numeroFascicolo.toString());

            // Oggetto del fascicolo
            wsdmfascicolo.setOggettoFascicolo(wsdmFascicoloIn.getOggettoFascicolo());

            // Anno e data del fascicolo
            wsdmfascicolo.setAnnoFascicolo(new Long(sAnnoCorrente));
            wsdmfascicolo.setDataFascicolo(now);

            wsdmfascicoloRes.setFascicolo(wsdmfascicolo);

          } else {
            wsdmfascicoloRes.setEsito(false);
            String messaggio = "";
            ArrayOfError arrayOfError = archiveResult.getErrorList();
            if (arrayOfError != null) {
              List<it.jdoc.Error> errorList = arrayOfError.getError();
              for (int e = 0; e < errorList.size(); e++) {
                if ("".equals(messaggio)) {
                  messaggio = errorList.get(e).getErrorMessage();
                } else {
                  messaggio += " - " + errorList.get(e).getErrorMessage();
                }
              }
            }
            wsdmfascicoloRes.setMessaggio(messaggio);
          }
        }
      } else {
        wsdmfascicoloRes.setEsito(false);
        wsdmfascicoloRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (WebServiceException w) {
      wsdmfascicoloRes.setEsito(false);
      wsdmfascicoloRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_fascicoloInserisci)", w);
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
    wsdmfascicoloRes.setEsito(false);
    wsdmfascicoloRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmfascicoloRes;
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
  public WSDMFascicoloModificaRes _fascicoloModifica(String username, String password, WSDMLoginAttr loginAttr,
      WSDMFascicoloModificaIn wsdmfascicoloModificaIn) {
    WSDMFascicoloModificaRes wsdmfascicoloModificaRes = new WSDMFascicoloModificaRes();
    wsdmfascicoloModificaRes.setEsito(false);
    wsdmfascicoloModificaRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmfascicoloModificaRes;
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

}
