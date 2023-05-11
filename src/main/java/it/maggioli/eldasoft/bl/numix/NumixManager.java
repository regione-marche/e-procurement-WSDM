package it.maggioli.eldasoft.bl.numix;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.activation.MimetypesFileTypeMap;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.axis.encoding.Base64;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

import it.maggioli.eldasoft.bl.IWSDMManager;
import it.maggioli.eldasoft.ws.dm.WSDMAggiungiAllegatiIn;
import it.maggioli.eldasoft.ws.dm.WSDMAggiungiAllegatiRes;
import it.maggioli.eldasoft.ws.dm.WSDMAnagraficaLeggiRes;
import it.maggioli.eldasoft.ws.dm.WSDMAttoContrattoRes;
import it.maggioli.eldasoft.ws.dm.WSDMClassifica;
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

public class NumixManager implements IWSDMManager {

  static Logger         logger                               = Logger.getLogger(NumixManager.class);

  static private String NUMIX_WS                             = "java:comp/env/NUMIX_WS";
  static private String NUMIX_WS_NOT_DEFINED                 = "NUMIX: l'indirizzo del servizio REST non e' valorizzato";

  static private String NUMIX_ORGCODE                        = "java:comp/env/NUMIX_ORGCODE";
  static private String NUMIX_ORGCODE_NOT_DEFINED            = "NUMIX: il codice organizzazione ORGCODE non e' valorizzato";

  static private String NUMIX_INGRESSO                       = "INCOMING";
  static private String NUMIX_INTERNO                        = "INTERNAL";
  static private String NUMIX_USCITA                         = "OUTGOING";

  static private String NUMIX_IN_SENDER_ID                   = "java:comp/env/NUMIX_IN_SENDER_ID";
  static private String NUMIX_OUT_SENDER_ID                  = "java:comp/env/NUMIX_OUT_SENDER_ID";
  static private String NUMIX_INT_SENDER_ID                  = "java:comp/env/NUMIX_INT_SENDER_ID";

  static private String NUMIX_REGISTRY_TYPE_PROTOCOL         = "java:comp/env/NUMIX_REGISTRY_TYPE_PROTOCOL";
  static private String NUMIX_REGISTRY_TYPE_PROTOCOL_DEFAULT = "Protocollo Ordinario/ Protocollo Emergenza";

  static private String NUMIX_REGISTRY_TYPE_DOCUMENT         = "java:comp/env/NUMIX_REGISTRY_TYPE_DOCUMENT";
  static private String NUMIX_REGISTRY_TYPE_DOCUMENT_DEFAULT = "Nessuno";

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
  public WSDMListaClassificheRes _listaClassifiche(String username, String password, WSDMLoginAttr loginAttr, String codice,
      String descrizione, String voce) {

    WSDMListaClassificheRes wsdmListaClassificheRes = new WSDMListaClassificheRes();

    HttpURLConnection connection = null;

    try {

      String numix_ws = getNUMIX_WS();
      String numix_orgcode = getNUMIX_ORGCODE();
      String authenticationBase64 = getAuthentication(username, password);

      String search = "?status=A";
      if (descrizione != null && !"".equals(descrizione)) {
        search += "&CategoryDesc=" + descrizione;
      }

      URL url = new URL(numix_ws + "/" + numix_orgcode + "/DocCategories" + search);
      connection = (HttpURLConnection) url.openConnection();
      connection.setDoInput(true);
      connection.setDoOutput(true);
      connection.setUseCaches(false);
      connection.setRequestMethod("GET");
      connection.setRequestProperty("Authorization", "Basic " + authenticationBase64);
      connection.setRequestProperty("Connection", "Keep-Alive");
      connection.setRequestProperty("Host", url.getHost());

      if (logger.isDebugEnabled()) {
        logger.debug("_listaClassifiche URL: " + url.toString());
      }

      // Risposta
      int httpStatus = connection.getResponseCode();

      wsdmListaClassificheRes.setEsito(false);

      if (httpStatus == 200) {
        String res = getInputStream(connection);

        if (logger.isDebugEnabled()) {
          logger.debug("_listaClassifiche getInputStream: " + res);
        }

        // Lettura della risposta
        JSONObject jsonOutput = new JSONObject(res);

        wsdmListaClassificheRes.setEsito(false);

        JSONArray r_lista_classifiche = jsonOutput.getJSONArray("Data");
        if (r_lista_classifiche.length() > 0) {
          wsdmListaClassificheRes.setEsito(true);
          WSDMClassifica[] listaClassifiche = new WSDMClassifica[r_lista_classifiche.length()];
          for (int cl = 0; cl < r_lista_classifiche.length(); cl++) {
            listaClassifiche[cl] = new WSDMClassifica();
            JSONObject r_classifica = (JSONObject) r_lista_classifiche.get(cl);

            // Identificativo della categoria
            if (r_classifica.get("CategoryId") != JSONObject.NULL) {
              listaClassifiche[cl].setCodice(r_classifica.getString("CategoryId"));
            } else {
              listaClassifiche[cl].setCodice("");
            }

            // Descrizione della categoria
            if (r_classifica.get("CategoryDesc") != JSONObject.NULL && r_classifica.get("CategoryCode") != JSONObject.NULL) {
              listaClassifiche[cl].setDescrizione(r_classifica.getString("CategoryCode") + " - " + r_classifica.getString("CategoryDesc"));
            } else {
              listaClassifiche[cl].setDescrizione("");
            }
          }
          wsdmListaClassificheRes.setListaClassifiche(listaClassifiche);
        } else {
          wsdmListaClassificheRes.setEsito(false);
          wsdmListaClassificheRes.setMessaggio("Nessuna classifica trovata");
        }

      } else {

        String res = getErrorStream(connection);

        if (logger.isDebugEnabled()) {
          logger.debug("_listaClassifiche getErrorStream: " + res);
        }

        wsdmListaClassificheRes.setEsito(false);
        wsdmListaClassificheRes.setMessaggio("Il sistema ha risposto con l'errore " + httpStatus + " (" + res + ")");
      }

    } catch (Exception e) {
      wsdmListaClassificheRes.setEsito(false);
      wsdmListaClassificheRes.setMessaggio(e.getMessage());
      logger.error("Errore (_listaClassifiche)", e);
    } finally {
      connection.disconnect();
    }

    return wsdmListaClassificheRes;
  }

  /**
   * Gestione del contatto (anagrafica impresa). Restituisce il codice
   * identificativo del contatto "contactId".
   * 
   * @param username
   * @param password
   * @param wsdmProtocolloAnagrafica
   * @return
   * @throws Throwable
   */
  private String contattoGestione(String username, String password, WSDMProtocolloAnagrafica wsdmProtocolloAnagrafica) throws Throwable {

    String contactId = null;

    try {
      // Ricerca per codice fiscale
      String codiceFiscale = wsdmProtocolloAnagrafica.getCodiceFiscale();
      contactId = contattoRicerca(username, password, codiceFiscale, null);

      // Ricerca per partita IVA, si esegue se la ricerca del codice fiscale non
      // ha avuto esito
      if (contactId == null || (contactId != null && "".equals(contactId))) {
        String partitaIVA = wsdmProtocolloAnagrafica.getPartitaIVA();
        if (partitaIVA != null && "".equals(partitaIVA)) {
          contactId = contattoRicerca(username, password, null, partitaIVA);
        }
      }

      // Se dopo la ricerca per codice fiscale e partita IVA non e' stato
      // trovato
      // alcun contatto, bisogna inserirlo in NUMIX.
      if (contactId == null || (contactId != null && "".equals(contactId))) {
        contactId = contattoInserisci(username, password, wsdmProtocolloAnagrafica);
      }
    } catch (Exception e) {
      throw e;
    }
    return contactId;
  }

  /**
   * Ricerca del contatto in base al codice fiscale o la partita IVA.
   * 
   * @param username
   * @param password
   * @param codiceFiscale
   * @param partitaIVA
   * @return
   * @throws NamingException
   * @throws Exception
   * @throws MalformedURLException
   * @throws IOException
   * @throws ProtocolException
   */
  private String contattoRicerca(String username, String password, String codiceFiscale, String partitaIVA) throws Throwable {
    HttpURLConnection connection = null;

    String contactId = null;

    try {
      String numix_ws = getNUMIX_WS();
      String numix_orgcode = getNUMIX_ORGCODE();
      String authenticationBase64 = getAuthentication(username, password);

      String search = null;
      if (codiceFiscale != null && !"".equals(codiceFiscale.trim())) {
        search = "?TaxCode=" + codiceFiscale;
      } else if (partitaIVA != null && !"".equals(partitaIVA.trim())) {
        search = "?VatCode=" + partitaIVA;
      }

      URL url = new URL(numix_ws + "/" + numix_orgcode + "/contacts" + search);
      connection = (HttpURLConnection) url.openConnection();
      connection.setDoInput(true);
      connection.setDoOutput(true);
      connection.setUseCaches(false);
      connection.setRequestMethod("GET");
      connection.setRequestProperty("Authorization", "Basic " + authenticationBase64);
      connection.setRequestProperty("Connection", "Keep-Alive");
      connection.setRequestProperty("Host", url.getHost());

      if (logger.isDebugEnabled()) {
        logger.debug("getContactId URL: " + url.toString());
      }

      // Risposta
      int httpStatus = connection.getResponseCode();
      if (httpStatus == 200) {
        String res = getInputStream(connection);

        if (logger.isDebugEnabled()) {
          logger.debug("getContactId getInputStream: " + res);
        }

        // Lettura della risposta
        JSONObject jsonOutput = new JSONObject(res);

        // La ricerca potrebbe restituire piu' di un contatto.
        // Si considera il primo contatto restituito.
        JSONArray r_lista_contatti = jsonOutput.getJSONArray("Data");
        if (r_lista_contatti.length() > 0) {
          JSONObject r_contatto = (JSONObject) r_lista_contatti.get(0);
          if (r_contatto.get("ContactId") != JSONObject.NULL) {
            contactId = r_contatto.getString("ContactId");
          }
        }

      } else {
        String res = getErrorStream(connection);
        if (logger.isDebugEnabled()) {
          logger.debug("getContactId getErrorStream: " + res);
        }
      }

    } finally {
      connection.disconnect();
    }
    return contactId;
  }

  private String getErrorStream(HttpURLConnection connection) throws IOException {
    InputStream isR = connection.getErrorStream();
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
    return res;
  }

  private String getInputStream(HttpURLConnection connection) throws IOException {
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
    return res;
  }

  /**
   * Inserimento di un nuovo contatto.
   * 
   * @param username
   * @param password
   * @param wsdmProtocolloAnagrafica
   * @return
   * @throws Throwable
   */
  private String contattoInserisci(String username, String password, WSDMProtocolloAnagrafica wsdmProtocolloAnagrafica) throws Throwable {
    HttpURLConnection connection = null;

    String contactId = null;

    try {
      String numix_ws = getNUMIX_WS();
      String numix_orgcode = getNUMIX_ORGCODE();
      String authenticationBase64 = getAuthentication(username, password);

      URL url = new URL(numix_ws + "/" + numix_orgcode + "/contacts");
      connection = (HttpURLConnection) url.openConnection();
      connection.setDoInput(true);
      connection.setDoOutput(true);
      connection.setUseCaches(false);
      connection.setRequestMethod("POST");
      connection.setRequestProperty("Authorization", "Basic " + authenticationBase64);
      connection.setRequestProperty("Connection", "Keep-Alive");
      connection.setRequestProperty("Content-Type", "application/json");

      connection.setRequestProperty("Host", url.getHost());

      // Dati del nuovo contatto
      JSONObject jsonInput = new JSONObject();

      // TODO: Tipo di contatto - PG - Persona Giuridica
      jsonInput.put("ContactType", "PG");

      // Contatto "esterno"
      JSONArray relationShipsArray = new JSONArray();
      relationShipsArray.put("ESTERNO");
      jsonInput.put("Relationships", relationShipsArray);

      // Stato "attivo"
      jsonInput.put("Status", "A");

      // Intestazione dell'impresa
      String cognomeointestazione = wsdmProtocolloAnagrafica.getCognomeointestazione();
      if (cognomeointestazione != null && !"".equals(cognomeointestazione.trim())) {
        // L'operazione NUMIX "createContact" non ammette piu' di 50 caratteri nel cognome.
        // Il valore viene troncato a 50 caratteri
        if (cognomeointestazione.length() > 50) {
          cognomeointestazione = cognomeointestazione.substring(0, 50);
        }
        jsonInput.put("ContactBusinessName", cognomeointestazione);
        jsonInput.put("ContactSurname", cognomeointestazione);
      }

      // Nome
      String nome = wsdmProtocolloAnagrafica.getNome();
      if (nome != null && !"".equals(nome.trim())) {
        // L'operazione NUMIX "createContact" non ammette piu' di 50 caratteri nel nome.
        // Il valore viene troncato a 50 caratteri
        if (nome.length() > 50) {
          nome = nome.substring(0, 50);
        }
        jsonInput.put("ContactFirstName", nome);
      } else {
        // Il servizio NUMIX richiede obbligatoriamente l'indicazione dell'attributi "ContactFirstName"
        // Se in ingresso non e' indicato nulla si passa il carattere "-"
        jsonInput.put("ContactFirstName", "-");
      }

      // Partita IVA
      String partitaIVA = wsdmProtocolloAnagrafica.getPartitaIVA();
      if (partitaIVA != null && !"".equals(partitaIVA.trim())) {
        jsonInput.put("VatCode", partitaIVA);
      }

      // Codice fiscale
      String codiceFiscale = wsdmProtocolloAnagrafica.getCodiceFiscale();
      if (codiceFiscale != null && !"".equals(codiceFiscale.trim())) {
        jsonInput.put("TaxCode", codiceFiscale);
      }

      // Email standard non PEC
      String emailAggiuntiva = wsdmProtocolloAnagrafica.getEmailAggiuntiva();
      if (emailAggiuntiva != null && !"".equals(emailAggiuntiva.trim())) {
        jsonInput.put("ContactMail", emailAggiuntiva);
      }

      // Email PEC
      String email = wsdmProtocolloAnagrafica.getEmail();
      if (email != null && !"".equals(email.trim())) {
        jsonInput.put("ContactMailCertified", email);
      }

      // Telefono
      String telefono = wsdmProtocolloAnagrafica.getTelefono();
      if (telefono != null && !"".equals(telefono.trim())) {
        jsonInput.put("ContactPhone", telefono);
      }

      // Fax
      String fax = wsdmProtocolloAnagrafica.getFax();
      if (fax != null && !"".equals(fax.trim())) {
        jsonInput.put("ContactFax", fax);
      }

      // La sezione indirizzo deve essere completa di tutti i suoi dati oppure
      // non indicata.
      // ContactAddress (indirizzoResidenza)
      // LocalityDesc (Localita', concatenazione di comuneResidenza e
      // provinciaResidenza)
      // PostCode (capResidenza)
      // CountryId (nazionalitaISO3166)
      // ContactStreetNumber (numeroCivicoResidenza)
      // ContactToponym (fisso a "-")

      String contactAddress = wsdmProtocolloAnagrafica.getIndirizzoResidenza();

      String localityDesc = null;
      String comuneResidenza = wsdmProtocolloAnagrafica.getComuneResidenza();
      String provinciaResidenza = wsdmProtocolloAnagrafica.getProvinciaResidenza();
      if (comuneResidenza != null && provinciaResidenza != null) {
        localityDesc = comuneResidenza + ", " + provinciaResidenza;
      } else if ((comuneResidenza != null && provinciaResidenza == null)) {
        localityDesc = comuneResidenza;
      } else if ((comuneResidenza == null && provinciaResidenza != null)) {
        localityDesc = provinciaResidenza;
      }

      String postCode = wsdmProtocolloAnagrafica.getCapResidenza();

      String countryId = wsdmProtocolloAnagrafica.getNazionalitaISO3166();

      String contactStreetNumber = wsdmProtocolloAnagrafica.getNumeroCivicoResidenza();

      if (isTestoValido(contactAddress)
          && isTestoValido(localityDesc)
          && isTestoValido(postCode)
          && isTestoValido(countryId)
          && isTestoValido(contactStreetNumber)) {
        jsonInput.put("ContactAddress", contactAddress);
        jsonInput.put("LocalityDesc", localityDesc);
        jsonInput.put("PostCode", postCode);
        jsonInput.put("CountryId", countryId);
        jsonInput.put("ContactStreetNumber", contactStreetNumber);
        jsonInput.put("ContactToponym", "-");
      }

      if (logger.isDebugEnabled()) {
        logger.debug("createContact URL: " + url.toString());
        logger.debug("createContact jsonInput: " + jsonInput.toString());
      }

      DataOutputStream output = new DataOutputStream(connection.getOutputStream());
      output.write(jsonInput.toString().getBytes("UTF-8"));
      output.flush();

      // Log della richiesta
      if (logger.isDebugEnabled()) {
        OutputStream osr = connection.getOutputStream();
        logger.debug("createContact getOutputStream: " + osr);
      }

      // Risposta
      int httpStatus = connection.getResponseCode();
      if (httpStatus == 200) {
        String res = getInputStream(connection);

        if (logger.isDebugEnabled()) {
          logger.debug("createContact getInputStream: " + res);
        }

        // Lettura della risposta
        JSONObject jsonOutput = new JSONObject(res);

        // Se l'inserimento e' andato a buon fine, il servizio restituisce il
        // contactId
        JSONObject contattoInserito = jsonOutput.getJSONObject("Data");
        if (contattoInserito.get("ContactId") != JSONObject.NULL) {
          contactId = contattoInserito.getString("ContactId");
        }

      } else {
        String res = getErrorStream(connection);
        if (logger.isDebugEnabled()) {
          logger.debug("createContact getErrorStream: " + res);
        }
        throw new Exception(res);
      }

    } finally {
      connection.disconnect();
    }
    return contactId;
  }

  /**
   * Inserimento del singolo documento.
   * 
   * @param username
   * @param password
   * @param protocolId
   * @param wsdmProtocolloAllegato
   * @param mainDocument
   * @return
   * @throws Throwable
   */
  private String documentoPrincipaleAllegatoInserisci(String username, String password, String protocolId,
      WSDMProtocolloAllegato wsdmProtocolloAllegato, boolean mainDocument) throws Throwable {
    HttpURLConnection connection = null;

    String contactId = null;

    try {
      String numix_ws = getNUMIX_WS();
      String numix_orgcode = getNUMIX_ORGCODE();
      String authenticationBase64 = getAuthentication(username, password);

      URL url = new URL(numix_ws + "/" + numix_orgcode + "/Protocols/" + protocolId + "/documents");
      connection = (HttpURLConnection) url.openConnection();
      connection.setDoInput(true);
      connection.setDoOutput(true);
      connection.setUseCaches(false);
      connection.setRequestMethod("POST");
      connection.setRequestProperty("Authorization", "Basic " + authenticationBase64);
      connection.setRequestProperty("Connection", "Keep-Alive");
      connection.setRequestProperty("Content-Type", "application/json");

      // Dati del nuovo contatto
      JSONObject jsonInput = new JSONObject();

      // Descrizione
      jsonInput.put("Description", wsdmProtocolloAllegato.getTitolo());

      // Documento principale/allegato e tipo documento
      if (mainDocument) {
        jsonInput.put("IsMainDocument", 1);
        jsonInput.put("DocumentType", "DOCUMENT");
      } else {
        jsonInput.put("IsMainDocument", 0);
        jsonInput.put("DocumentType", "ATTACHMENT");
      }

      // Nome del file
      String nome = wsdmProtocolloAllegato.getNome();
      jsonInput.put("FileName", nome);

      // Dimensione dei file
      byte[] _b = wsdmProtocolloAllegato.getContenuto();
      jsonInput.put("FileSize", _b.length);

      // Contenuto del file
      jsonInput.put("FileContent", Base64.encode(_b));

      // MimeType
//      String mimeType = new MimetypesFileTypeMap().getContentType(nome);
//      jsonInput.put("FileMimeType", mimeType);

      // Modo di formazione (sempre di tipo "b")
      jsonInput.put("FormationModes", "b");

      // TODO: DocumentalTypology
      jsonInput.put("DocumentalTypology", "testo");

      // TODO: isSigned
      if (wsdmProtocolloAllegato.getIsSigned() != null) {
        jsonInput.put("isSigned", wsdmProtocolloAllegato.getIsSigned().toString());
      } else {
        jsonInput.put("isSigned", "0");
      }

      // TODO: isSealed
      if (wsdmProtocolloAllegato.getIsSealed() != null) {
        jsonInput.put("isSealed", wsdmProtocolloAllegato.getIsSealed().toString());
      } else {
        jsonInput.put("isSealed", "0");
      }

      // TODO: isTimeMarked
      if (wsdmProtocolloAllegato.getIsTimeMarked() != null) {
        jsonInput.put("isTimeMarked", wsdmProtocolloAllegato.getIsTimeMarked().toString());
      } else {
        jsonInput.put("isTimeMarked", "0");
      }

      // TODO: isCertifiedCopy
      if (wsdmProtocolloAllegato.getIsCertifiedCopy() != null) {
        jsonInput.put("isCertifiedCopy", wsdmProtocolloAllegato.getIsCertifiedCopy().toString());
      } else {
        jsonInput.put("isCertifiedCopy", "0");
      }

      if (logger.isDebugEnabled()) {
        logger.debug("insertDocument URL: " + url.toString());
        logger.debug("insertDocument jsonInput: " + jsonInput.toString());
      }

      DataOutputStream output = new DataOutputStream(connection.getOutputStream());
      output.write(jsonInput.toString().getBytes("UTF-8"));
      output.flush();

      // Log della richiesta
      if (logger.isDebugEnabled()) {
        OutputStream osr = connection.getOutputStream();
        logger.debug("insertDocument getOutputStream: " + osr);
      }

      // Risposta
      int httpStatus = connection.getResponseCode();
      if (httpStatus == 200) {
        String res = getInputStream(connection);

        if (logger.isDebugEnabled()) {
          logger.debug("insertDocument getInputStream: " + res);
        }

      } else {
        String res = getErrorStream(connection);
        if (logger.isDebugEnabled()) {
          logger.debug("insertDocument getErrorStream: " + res);
        }
      }

    } finally {
      connection.disconnect();
    }
    return contactId;
  }

  /**
   * Restituisce credenziali formattate secondo lo standard Basic
   * Authentication.
   * 
   * @param username
   * @param password
   * @return
   */
  private String getAuthentication(String username, String password) {
    String authentication = username + ":" + password;
    String authenticationBase64 = Base64.encode(authentication.getBytes());
    return authenticationBase64;
  }

  /**
   * Restituisce codice dell'organizzazione ORG_CODE.
   * 
   * @return
   * @throws NamingException
   * @throws Exception
   */
  private String getNUMIX_ORGCODE() throws NamingException, Exception {
    String numix_orgcode = InitialContext.doLookup(NUMIX_ORGCODE);
    if (numix_orgcode == null || (numix_orgcode != null && "".equals(numix_orgcode.trim()))) {
      throw new Exception(NUMIX_ORGCODE_NOT_DEFINED);
    }
    return numix_orgcode;
  }

  /**
   * Restituisce indirizzo base per l'accesso ai servizi REST. Va completato, di
   * volta in volta, con la risorsa da utilizzare.
   * 
   * @return
   * @throws NamingException
   * @throws Exception
   */
  private String getNUMIX_WS() throws NamingException, Exception {
    String numix_ws = InitialContext.doLookup(NUMIX_WS);
    if (numix_ws == null || (numix_ws != null && "".equals(numix_ws.trim()))) {
      throw new Exception(NUMIX_WS_NOT_DEFINED);
    } else {
      if (numix_ws.endsWith("/")) {
        numix_ws.subSequence(0, numix_ws.length() - 1);
      }
    }
    return numix_ws;
  }

  @Override
  public WSDMProtocolloDocumentoRes _protocolloInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {

    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    StringBuffer messaggioCtr = new StringBuffer();

    if (NumixUtilityControllo.ctrProtocolloInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {

      String numix_registry_type_protocol = NUMIX_REGISTRY_TYPE_PROTOCOL_DEFAULT;
      try {
        numix_registry_type_protocol = InitialContext.doLookup(NUMIX_REGISTRY_TYPE_PROTOCOL);
      } catch (Exception e) {

      }
      wsdmprotocolloDocumentoRes = _protocolloDocumentoInserisci(username, password, wsdmprotocolloDocumentoIn,
          numix_registry_type_protocol);
    } else {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
    }

    return wsdmprotocolloDocumentoRes;

  }

  /**
   * Inserimento in protocollo o documentale. L'operazione inserisci in
   * protocollo (con rilascio del numero e la data del protocollo) oppure
   * inserisce sul documentale in funzione del valore di "registryType".
   * 
   * @param username
   * @param password
   * @param wsdmprotocolloDocumentoIn
   * @param registryType
   * @return
   */
  private WSDMProtocolloDocumentoRes _protocolloDocumentoInserisci(String username, String password,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn, String registryType) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    HttpURLConnection connection = null;

    try {
      String numix_ws = getNUMIX_WS();
      String numix_orgcode = getNUMIX_ORGCODE();
      String authenticationBase64 = getAuthentication(username, password);

      URL url = new URL(numix_ws + "/" + numix_orgcode + "/Protocols");
      connection = (HttpURLConnection) url.openConnection();
      connection.setDoInput(true);
      connection.setDoOutput(true);
      connection.setUseCaches(false);
      connection.setRequestMethod("POST");
      connection.setRequestProperty("Authorization", "Basic " + authenticationBase64);
      connection.setRequestProperty("Connection", "Keep-Alive");
      connection.setRequestProperty("Content-Type", "application/json");
      connection.setRequestProperty("Host", url.getHost());

      // Dati del nuovo protocollo
      JSONObject jsonInput = new JSONObject();

      // Classifica
      String classifica = wsdmprotocolloDocumentoIn.getClassifica();
      jsonInput.put("CategoryId", classifica);

      // Verso della comunicazione e SenderID
      String senderId = null;
      String directionType = null;
      if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
        directionType = NUMIX_INGRESSO;
        senderId = InitialContext.doLookup(NUMIX_IN_SENDER_ID);
      } else if (WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
        directionType = NUMIX_INTERNO;
        senderId = InitialContext.doLookup(NUMIX_INT_SENDER_ID);
      } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
        directionType = NUMIX_USCITA;
        senderId = InitialContext.doLookup(NUMIX_OUT_SENDER_ID);
      }
      jsonInput.put("DirectionType", directionType);
      jsonInput.put("SenderId", senderId);

      // Supporto, sempre "DIGITAL"
      jsonInput.put("SupportType", "DIGITAL");

      // Mezzo
      if (wsdmprotocolloDocumentoIn.getMezzo() != null) {
        jsonInput.put("SentMode", wsdmprotocolloDocumentoIn.getMezzo());
      }

      // Oggetto
      jsonInput.put("Object", wsdmprotocolloDocumentoIn.getOggetto());

      // Numero del protocollo di riferimento
      if (isTestoValido(wsdmprotocolloDocumentoIn.getGenericS11()) && wsdmprotocolloDocumentoIn.getGenericD11() != null) {
        jsonInput.put("RefProtocolNum", wsdmprotocolloDocumentoIn.getGenericS11());
        String refProtocolDate = new SimpleDateFormat("yyyy-MM-dd").format(wsdmprotocolloDocumentoIn.getGenericD11());
        jsonInput.put("RefProtocolDate", refProtocolDate);
      }

      // Parola chiave
      // Nella richiesta di protocollazione non viene popolato l'attributo
      // genericS12:
      // la 'parola chiave di identificazione' viene popolata concatenando
      // il codice gara e il CIG, gia' forniti con gli attributi
      // 'codiceGaraLotto' e 'cig'.
      String protocolKeywords = "";
      String codiceGaraLotto = wsdmprotocolloDocumentoIn.getCodiceGaraLotto();
      if (codiceGaraLotto != null && !"".equals(codiceGaraLotto.trim())) {
        protocolKeywords += "Gara/lotto " + codiceGaraLotto;
      }

      String cig = wsdmprotocolloDocumentoIn.getCig();
      if (cig != null && !"".equals(cig.trim())) {
        protocolKeywords += " CIG " + cig;
      }

      jsonInput.put("ProtocolKeywords", protocolKeywords);

      // Tipo di registro
      jsonInput.put("RegistryType", registryType);

      // Gestione mittenti e destinatari
      if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
        // Mittenti
        if (wsdmprotocolloDocumentoIn.getMittenti() != null) {
          WSDMProtocolloAnagrafica[] mittenti = wsdmprotocolloDocumentoIn.getMittenti();
          if (mittenti.length > 0) {
            JSONArray jsonArrayMittenti = new JSONArray();
            for (int mi = 0; mi < mittenti.length; mi++) {
              WSDMProtocolloAnagrafica mittente = mittenti[mi];
              String contactId = contattoGestione(username, password, mittente);
              JSONObject jsonMittente = new JSONObject();
              jsonMittente.put("ContactId", contactId);
              jsonArrayMittenti.put(jsonMittente);
            }
            jsonInput.put("Assignees", jsonArrayMittenti);
          }
        }

        // TODO: 21/12/2021, dalle prove effettuate anche in INGRESSO e'
        // necessario fornire la lista dei 'Receivers'
        if (wsdmprotocolloDocumentoIn.getMittenti() != null) {
          WSDMProtocolloAnagrafica[] mittenti = wsdmprotocolloDocumentoIn.getMittenti();
          if (mittenti.length > 0) {
            JSONArray jsonArrayMittenti = new JSONArray();
            for (int mi = 0; mi < mittenti.length; mi++) {
              WSDMProtocolloAnagrafica mittente = mittenti[mi];
              String contactId = contattoGestione(username, password, mittente);
              JSONObject jsonMittente = new JSONObject();
              jsonMittente.put("ContactId", contactId);
              jsonMittente.put("RoleType", 0);
              jsonArrayMittenti.put(jsonMittente);
            }
            jsonInput.put("Receivers", jsonArrayMittenti);
          }
        }

      } else {
        // TODO: 21/12/2021, dalle prove effettuate anche per protocollazioni
        // INTERNE e' necessario fornire la lista dei 'Receivers'
        // Destinatari
        if (wsdmprotocolloDocumentoIn.getDestinatari() != null) {
          WSDMProtocolloAnagrafica[] destinatari = wsdmprotocolloDocumentoIn.getDestinatari();
          if (destinatari.length > 0) {
            JSONArray jsonArrayDestinatari = new JSONArray();
            for (int de = 0; de < destinatari.length; de++) {
              WSDMProtocolloAnagrafica destinatario = destinatari[de];
              String contactId = contattoGestione(username, password, destinatario);
              JSONObject jsonDestinatario = new JSONObject();
              jsonDestinatario.put("ContactId", contactId);
              jsonDestinatario.put("RoleType", 0);
              jsonArrayDestinatari.put(jsonDestinatario);
            }
            jsonInput.put("Receivers", jsonArrayDestinatari);
          }
        }
      }

      if (logger.isDebugEnabled()) {
        logger.debug("_protocolloInserisci URL: " + url.toString());
        logger.debug("_protocolloInserisci jsonInput: " + jsonInput.toString());
      }

      DataOutputStream output = new DataOutputStream(connection.getOutputStream());
      output.write(jsonInput.toString().getBytes("UTF-8"));
      output.flush();

      // Log della richiesta
      if (logger.isDebugEnabled()) {
        OutputStream osr = connection.getOutputStream();
        logger.debug("_protocolloInserisci getOutputStream: " + osr);
      }

      // Risposta
      int httpStatus = connection.getResponseCode();
      if (httpStatus == 200) {
        String res = getInputStream(connection);

        if (logger.isDebugEnabled()) {
          logger.debug("_protocolloInserisci getInputStream: " + res);
        }

        // Lettura della risposta
        JSONObject jsonOutput = new JSONObject(res);

        WSDMProtocolloDocumento wsdmProtocolloDocumento = new WSDMProtocolloDocumento();

        // Identificativo del protocollo, si considera come numero documento
        JSONObject jsonData = jsonOutput.getJSONObject("Data");
        String protocolId = jsonData.getString("ProtocolId");
        wsdmProtocolloDocumento.setNumeroDocumento(protocolId);

        // Numero protocollo
        String protocolNum = jsonData.getString("ProtocolNum");
        wsdmProtocolloDocumento.setNumeroProtocollo(protocolNum);

        // Data protocollo
        // try {
        // String protocolDate = jsonData.getString("ProtocolDate");
        // Date dataProtocollo = new
        // SimpleDateFormat("yyyy-MM-dd").parse(protocolDate);
        // wsdmProtocolloDocumento.setDataProtocollo(dataProtocollo);
        // } catch (Exception e) {
        //
        // }

        Calendar dataProtocolloToday = Calendar.getInstance();
        wsdmProtocolloDocumento.setDataProtocollo(dataProtocolloToday.getTime());

        // Anno protocollo
        try {
          int protocoloYear = jsonData.getInt("ProtocolYear");
          wsdmProtocolloDocumento.setAnnoProtocollo(new Long(protocoloYear));
        } catch (Exception e) {

        }

        wsdmprotocolloDocumentoRes.setEsito(true);
        wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmProtocolloDocumento);

        // Gestione degli allegati
        WSDMProtocolloAllegato[] allegati = wsdmprotocolloDocumentoIn.getAllegati();
        if (allegati != null && allegati.length > 0) {
          for (int al = 0; al < allegati.length; al++) {
            WSDMProtocolloAllegato allegato = allegati[al];
            if (al == 0) {
              documentoPrincipaleAllegatoInserisci(username, password, protocolId, allegato, true);
            } else {
              documentoPrincipaleAllegatoInserisci(username, password, protocolId, allegato, false);
            }
          }
        }

      } else {
        String res = getErrorStream(connection);
        if (logger.isDebugEnabled()) {
          logger.debug("_protocolloInserisci getErrorStream: " + res);
        }
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(res);

      }
    } catch (Throwable e) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(e.getMessage());
      logger.error("Errore (_protocolloInserisci)", e);
    } finally {
      connection.disconnect();
    }

    return wsdmprotocolloDocumentoRes;
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

    String numix_registry_type_document = NUMIX_REGISTRY_TYPE_DOCUMENT_DEFAULT;
    try {
      numix_registry_type_document = InitialContext.doLookup(NUMIX_REGISTRY_TYPE_DOCUMENT);
    } catch (Exception e) {

    }

    if (NumixUtilityControllo.ctrDocumentoInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {
      wsdmprotocolloDocumentoRes = _protocolloDocumentoInserisci(username, password, wsdmprotocolloDocumentoIn,
          numix_registry_type_document);
    } else {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
    }

    return wsdmprotocolloDocumentoRes;
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
  public WSDMProtocolloDocumentoRes _documentoLeggi(String username, String password, WSDMLoginAttr loginAttr, String numeroDocumento) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    wsdmprotocolloDocumentoRes.setEsito(false);
    wsdmprotocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmprotocolloDocumentoRes;
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
  public WSDMAnagraficaLeggiRes _anagraficaLeggi(String username, String password, WSDMLoginAttr loginAttr, String codiceAnagrafica) {
    WSDMAnagraficaLeggiRes wsdmAnagraficaLeggiRes = new WSDMAnagraficaLeggiRes();
    wsdmAnagraficaLeggiRes.setEsito(false);
    wsdmAnagraficaLeggiRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmAnagraficaLeggiRes;
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
      WSDMAggiungiAllegatiIn wsdmaggiungiAllegatiIn) {
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

  private static boolean isTestoValido(String str) {
    boolean isTestoValido = false;
    if (str == null || (str != null && "".equals(str.trim()))) {
      isTestoValido = false;
    } else {
      isTestoValido = true;
    }
    return isTestoValido;
  }
  
  @Override
  public WSDMProtocolloDocumentoRes _protocolloAsincronoEsito(String username, String password, WSDMLoginAttr loginAttr, String id) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    wsdmprotocolloDocumentoRes.setEsito(false);
    wsdmprotocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmprotocolloDocumentoRes;
  }

}
