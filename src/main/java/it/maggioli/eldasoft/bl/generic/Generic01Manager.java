package it.maggioli.eldasoft.bl.generic;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.axis.encoding.Base64;
import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

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
import it.maggioli.eldasoft.ws.dm.WSDMRicercaFascicolo;
import it.maggioli.eldasoft.ws.dm.WSDMRicercaFascicoloRes;
import it.maggioli.eldasoft.ws.dm.WSDMTrasmissioneIn;
import it.maggioli.eldasoft.ws.dm.WSDMTrasmissioneRes;
import it.maggioli.eldasoft.ws.dm.WSDMVerificaMailRes;

public class Generic01Manager implements IWSDMManager {

  static Logger         logger                                     = Logger.getLogger(Generic01Manager.class);

  static private String GENERIC01_LOGIN_WS                         = "java:comp/env/GENERIC01_LOGIN_WS";
  static private String GENERIC01_LOGIN_WS_NOT_DEFINED             = "Indirizzo del servizio LOGIN non valorizzato.";
  static private String GENERIC01_LOGIN_GRANT_TYPE                 = "java:comp/env/GENERIC01_LOGIN_GRANT_TYPE";
  static private String GENERIC01_LOGIN_GRANT_TYPE_NOT_DEFINED     = "Parametro GRANT_TYPE non definito.";
  static private String GENERIC01_LOGIN_SCOPE                      = "java:comp/env/GENERIC01_LOGIN_SCOPE";
  static private String GENERIC01_LOGIN_SCOPE_NOT_DEFINED          = "Parametro SCOPE non definito";

  static private String GENERIC01_PROTOCOLLO_WS                    = "java:comp/env/GENERIC01_PROTOCOLLO_WS";
  static private String GENERIC01_PROTOCOLLO_WS_NOT_DEFINED        = "Indirizzo del servizio PROTOCOLLO non valorizzato.";
  static private String GENERIC01_PROTOCOLLO_SERVICE_PROVIDER_CODE = "java:comp/env/GENERIC01_PROTOCOLLO_SERVICE_PROVIDER_CODE";
  static private String GENERIC01_PROTOCOLLO_PROTOCOLLO_CLIENT_ID  = "java:comp/env/GENERIC01_PROTOCOLLO_PROTOCOLLO_CLIENT_ID";
  static private String GENERIC01_PROTOCOLLO_PROTOCOLLO_USER_ID    = "java:comp/env/GENERIC01_PROTOCOLLO_PROTOCOLLO_USER_ID";

  static private String GENERIC01_SYSLOGIN                         = "java:comp/env/GENERIC01_SYSLOGIN";

  static private String GENERIC01_DOCUMENTALE_WS                   = "java:comp/env/GENERIC01_DOCUMENTALE_WS";
  static private String GENERIC01_DOCUMENTALE_WS_NOT_DEFINED       = "Indirizzo del servizio DOCUMENTALE non valorizzato.";

  static private String GENERIC01_INGRESSO                         = "E";
  static private String GENERIC01_USCITA                           = "U";

  static private String GENERIC01_TRICOD_USCITA                    = "2";
  static private String GENERIC01_TRICOD_INGRESSO                  = "1";

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
    wsdmListaClassificheRes.setEsito(false);
    wsdmListaClassificheRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmListaClassificheRes;
  }

  private String getErrorStream(HttpURLConnection connection) throws IOException {
//    InputStream isR = connection.getErrorStream();
//    String res = "";
//    int countByte = 0;
//    byte[] buffer = new byte[1024];
//    while ((countByte = isR.read(buffer)) != -1) {
//      byte[] tmpByte = new byte[countByte];
//      for (int i = 0; i < countByte; i++)
//        tmpByte[i] = buffer[i];
//      String s = new String(tmpByte);
//      buffer = new byte[1024];
//      res += s;
//    }
//    res = res.trim();
//    return res;
    
    StringWriter writer = new StringWriter();
    IOUtils.copy(connection.getErrorStream(), writer, "UTF-8");
    return writer.toString();
  }

  private String getInputStream(HttpURLConnection connection) throws IOException {
//    InputStream isR = connection.getInputStream();
//    String res = "";
//    int countByte = 0;
//    byte[] buffer = new byte[1024];
//    while ((countByte = isR.read(buffer)) != -1) {
//      byte[] tmpByte = new byte[countByte];
//      for (int i = 0; i < countByte; i++)
//        tmpByte[i] = buffer[i];
//      String s = new String(tmpByte);
//      buffer = new byte[1024];
//      res += s;
//    }
//    res = res.trim();
//    return res;
    
    StringWriter writer = new StringWriter();
    IOUtils.copy(connection.getInputStream(), writer, "UTF-8");
    return writer.toString();
  }

  /**
   * Restituisce l'indirizzo per l'accesso al servizio di LOGIN
   * 
   * @return
   * @throws NamingException
   * @throws Exception
   */
  private String getLOGIN_WS() throws NamingException, Exception {
    String url = InitialContext.doLookup(GENERIC01_LOGIN_WS);
    if (url == null || (url != null && "".equals(url.trim()))) {
      throw new Exception(GENERIC01_LOGIN_WS_NOT_DEFINED);
    } else {
      if (url.endsWith("/")) {
        url.subSequence(0, url.length() - 1);
      }
    }
    return url;
  }

  /**
   * Ricava il parametro GRANT_TYPE.
   * 
   * @return
   * @throws NamingException
   * @throws Exception
   */
  private String getLOGIN_GRANT_TYPE() throws NamingException, Exception {
    String val = InitialContext.doLookup(GENERIC01_LOGIN_GRANT_TYPE);
    if (val == null || (val != null && "".equals(val.trim()))) {
      throw new Exception(GENERIC01_LOGIN_GRANT_TYPE_NOT_DEFINED);
    }
    return val;
  }

  /**
   * Ricava il parametro SCOPE.
   * 
   * @return
   * @throws NamingException
   * @throws Exception
   */
  private String getLOGIN_SCOPE() throws NamingException, Exception {
    String val = InitialContext.doLookup(GENERIC01_LOGIN_SCOPE);
    if (val == null || (val != null && "".equals(val.trim()))) {
      throw new Exception(GENERIC01_LOGIN_SCOPE_NOT_DEFINED);
    }
    return val;
  }

  private String getSERVICE_PROVIDER_CODE() throws NamingException, Exception {
    String val = InitialContext.doLookup(GENERIC01_PROTOCOLLO_SERVICE_PROVIDER_CODE);
    if (val == null || (val != null && "".equals(val.trim()))) {
      throw new Exception("Parametro SERVICE_PROVIDER_CODE non definito.");
    }
    return val;
  }

  private String getPROTOCOLLO_CLIENT_ID() throws NamingException, Exception {
    String val = InitialContext.doLookup(GENERIC01_PROTOCOLLO_PROTOCOLLO_CLIENT_ID);
    if (val == null || (val != null && "".equals(val.trim()))) {
      throw new Exception("Parametro PROTOCOLLO_CLIENT_ID non definito.");
    }
    return val;
  }

  private String getPROTOCOLLO_USER_ID() throws NamingException, Exception {
    String val = InitialContext.doLookup(GENERIC01_PROTOCOLLO_PROTOCOLLO_USER_ID);
    if (val == null || (val != null && "".equals(val.trim()))) {
      throw new Exception("Parametro PROTOCOLLO_USER_ID non definito.");
    }
    return val;
  }

  private String getSYSLOGIN() throws NamingException, Exception {

    String val = null;
    try {
      val = InitialContext.doLookup(GENERIC01_SYSLOGIN);
    } catch (NamingException e) {

    }

    return val;
  }

  /**
   * Restituisce indirizzo per l'accesso al servizio PROTOCOLLAZIONE.
   * 
   * @return
   * @throws NamingException
   * @throws Exception
   */
  private String getPROTOCOLLO_WS() throws NamingException, Exception {
    String url = InitialContext.doLookup(GENERIC01_PROTOCOLLO_WS);
    if (url == null || (url != null && "".equals(url.trim()))) {
      throw new Exception(GENERIC01_PROTOCOLLO_WS_NOT_DEFINED);
    } else {
      if (url.endsWith("/")) {
        url.subSequence(0, url.length() - 1);
      }
    }
    return url;
  }

  /**
   * Restituisce indirizzo per l'accesso al servizio DOCUMENTALE
   * 
   * @return
   * @throws NamingException
   * @throws Exception
   */
  private String getDOCUMENTALE_WS() throws NamingException, Exception {
    String url = InitialContext.doLookup(GENERIC01_DOCUMENTALE_WS);
    if (url == null || (url != null && "".equals(url.trim()))) {
      throw new Exception(GENERIC01_DOCUMENTALE_WS_NOT_DEFINED);
    } else {
      if (url.endsWith("/")) {
        url.subSequence(0, url.length() - 1);
      }
    }
    return url;
  }

  /**
   * Lettura del TOKEN.
   * 
   * @return
   * @throws Exception
   */
  private String getTOKEN(String username, String password) throws Exception {

    String token = null;
    HttpURLConnection connection = null;

    try {

      String login_ws = getLOGIN_WS();
      String grant_type = getLOGIN_GRANT_TYPE();
      String scope = getLOGIN_SCOPE();

      URL url = new URL(login_ws);
      connection = (HttpURLConnection) url.openConnection();
      connection.setDoInput(true);
      connection.setDoOutput(true);
      connection.setUseCaches(false);
      connection.setRequestMethod("POST");
      connection.setRequestProperty("Accept-Encoding", "gzip,deflate");
      connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
      connection.setRequestProperty("Connection", "Keep-Alive");
      connection.setRequestProperty("Host", url.getHost());

      // Tentativo di scrittura in POST Query String
      String postQueryString = "client_id=" + username;
      postQueryString += "&client_secret=" + password;
      postQueryString += "&grant_type=" + grant_type;
      postQueryString += "&scope=" + scope;

      OutputStream osr = connection.getOutputStream();
      DataOutputStream output = new DataOutputStream(osr);
      output.write(postQueryString.getBytes());
      output.flush();

      logger.debug("Autenticazione getTOKEN URL: " + url.toString());
      logger.debug("Autenticazione getOutputStream: " + osr);

      // Risposta
      int httpStatus = connection.getResponseCode();

      if (httpStatus == 200) {
        String res = getInputStream(connection);
        logger.debug("Autenticazione getTOKEN getInputStream: " + res);
        JSONObject jsonOutput = new JSONObject(res);
        token = (String) jsonOutput.get("access_token");

      } else {
        String res = getErrorStream(connection);
        logger.debug("Autenticazione getTOKEN getErrorStream: " + res);
      }

    } catch (Exception e) {
      throw e;
    } finally {
      try {
        if (connection != null) {
          connection.disconnect();
        }
      } catch (Throwable t) {

      }
    }

    return token;
  }

  @Override
  public WSDMProtocolloDocumentoRes _protocolloInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {

    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    StringBuffer messaggioCtr = new StringBuffer();

    if (Generic01UtilityControllo.ctrProtocolloInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {
      wsdmprotocolloDocumentoRes = _generic01ProtocolloInserisci(username, password, wsdmprotocolloDocumentoIn);
    } else {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
    }

    return wsdmprotocolloDocumentoRes;

  }

  /**
   * Inserimento in protocollo. L'operazione inserisci in protocollo (con
   * rilascio del numero e la data del protocollo).
   * 
   * @param username
   * @param password
   * @param wsdmprotocolloDocumentoIn
   * @return
   */
  private WSDMProtocolloDocumentoRes _generic01ProtocolloInserisci(String username, String password,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    HttpURLConnection connection = null;

    try {

      String token = getTOKEN(username, password);
      String protocollo_ws = getPROTOCOLLO_WS();

      URL url = new URL(protocollo_ws);
      connection = (HttpURLConnection) url.openConnection();
      connection.setDoInput(true);
      connection.setDoOutput(true);
      connection.setUseCaches(false);
      connection.setRequestMethod("POST");
      connection.setRequestProperty("Authorization", "Bearer " + token);
      connection.setRequestProperty("Connection", "Keep-Alive");
      connection.setRequestProperty("Content-Type", "application/json");
      connection.setRequestProperty("Host", url.getHost());

      // Dati del nuovo protocollo
      JSONObject jsonInput = new JSONObject();

      // UserId, se valorizzato il parametro GENERIC01_SYSLOGIN considero questo
      // sovrascrivendo il valore inviato dal client.
      String userId = null;
      String syslogin = getSYSLOGIN();
      if (syslogin != null && !"".equals(syslogin.trim())) {
        userId = syslogin;
      } else {
        userId = wsdmprotocolloDocumentoIn.getGenericS11();
      }
      jsonInput.put("userId", userId);

      // ServiceProviderCode
      jsonInput.put("serviceProviderCode", getSERVICE_PROVIDER_CODE());

      // protocolloClientId
      jsonInput.put("protocolloClientId", getPROTOCOLLO_CLIENT_ID());

      // protocolloUserId
      jsonInput.put("protocolloUserId", getPROTOCOLLO_USER_ID());

      // Oggetto
      jsonInput.put("oggetto", wsdmprotocolloDocumentoIn.getOggetto());

      // Codice servizio
      jsonInput.put("codiceServizio", wsdmprotocolloDocumentoIn.getTipoDocumento());

      // Verso della comunicazione
      if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
        jsonInput.put("origine", GENERIC01_INGRESSO);
      } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
        jsonInput.put("origine", GENERIC01_USCITA);
      }

      // Data documento (esempio 2021-06-08)
      String dataDocumento = new SimpleDateFormat("yyyy-MM-dd").format(wsdmprotocolloDocumentoIn.getData());
      jsonInput.put("dataDocumento", dataDocumento);

      // Gestione mittenti e destinatari
      if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
        // Mittenti
        if (wsdmprotocolloDocumentoIn.getMittenti() != null) {
          WSDMProtocolloAnagrafica[] mittenti = wsdmprotocolloDocumentoIn.getMittenti();
          if (mittenti.length > 0) {
            JSONArray jsonMittenti = new JSONArray();
            for (int mi = 0; mi < mittenti.length; mi++) {
              WSDMProtocolloAnagrafica mittente = mittenti[mi];

              JSONObject jsonMittente = new JSONObject();

              // Ruolo - E' possibile indicare sempre "Autore"
              jsonMittente.put("ruolo", "Autore");
              
              // 23/02/2023 - TriCod per ingresso
              jsonMittente.put("triCod", GENERIC01_TRICOD_INGRESSO);

              // Tipo soggetto - Per protocollo in ingresso sono obbligatori i
              // mittenti - Tipo soggetto deve essere valorizzato sempre "M"
              // TODO: O06/12/2021 - Il servizio ad oggi funziona solo per i
              // tipo di soggetto e' D - Destinatario, con M - Mittente
              // restituisce sempre errore
              jsonMittente.put("tipoSoggetto", "M");
              // 23/02/2023 - Proviamo con M  jsonMittente.put("tipoSoggetto", "D");

              // Nome - Va valorizzato solo per persone fisiche, per le persone
              // giuridiche non va indicato
              // Cognome - Va valorizzato solo per persone fisiche, per le
              // persone giuridiche non va indicato
              // Denominazione - Va valorizzato solo per persone giuridiche, per
              // le persone fisiche non va indicato
              // if
              // (WSDMTipoVoceRubrica.IMPRESA.equals(mittente.getTipoVoceRubrica()))
              // {
              // jsonMittente.put("denominazione",
              // mittente.getCognomeointestazione());
              // } else {
              // jsonMittente.put("nome", mittente.getNome());
              // jsonMittente.put("cognome",
              // mittente.getCognomeointestazione());
              // }

              // TODO: 03/12/2021 - I valori "denominazione", "nome" e "cognome"
              // devono essere sempre indicati.
              jsonMittente.put("denominazione", mittente.getCognomeointestazione());
              if (mittente.getNome() != null && !"".equals(mittente.getNome().trim())) {
                jsonMittente.put("nome", mittente.getNome());
              } else {
                jsonMittente.put("nome", mittente.getCognomeointestazione());
              }
              jsonMittente.put("cognome", mittente.getCognomeointestazione());

              // TODO: 03/12/2021 - Il valore "sesso" deve essere sempre
              // indicato con il valore fisso "A"
              jsonMittente.put("sesso", "A");

              jsonMittenti.put(jsonMittente);

            }

            jsonInput.put("soggetti", jsonMittenti);
          }
        }
      } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
        // Destinatari
        if (wsdmprotocolloDocumentoIn.getDestinatari() != null) {
          WSDMProtocolloAnagrafica[] destinatari = wsdmprotocolloDocumentoIn.getDestinatari();
          if (destinatari.length > 0) {
            JSONArray jsonDestinatari = new JSONArray();
            for (int de = 0; de < destinatari.length; de++) {
              WSDMProtocolloAnagrafica destinatario = destinatari[de];

              JSONObject jsonDestinatario = new JSONObject();

              // Ruolo - E' possibile indicare sempre "Autore"
              jsonDestinatario.put("ruolo", "Autore");

              // 23/02/2023 - TriCod per uscita
              jsonDestinatario.put("triCod", GENERIC01_TRICOD_USCITA);

              // Tipo soggetto - Per protocollo in ingresso sono obbligatori i
              // mittenti - Tipo soggetto deve essere valorizzato sempre "D"
              jsonDestinatario.put("tipoSoggetto", "D");

              // Nome - Va valorizzato solo per persone fisiche, per le persone
              // giuridiche non va indicato
              // Cognome - Va valorizzato solo per persone fisiche, per le
              // persone giuridiche non va indicato
              // Denominazione - Va valorizzato solo per persone giuridiche, per
              // le persone fisiche non va indicato
              // if
              // (WSDMTipoVoceRubrica.IMPRESA.equals(destinatario.getTipoVoceRubrica()))
              // {
              // jsonDestinatario.put("denominazione",
              // destinatario.getCognomeointestazione());
              // } else {
              // jsonDestinatario.put("nome", destinatario.getNome());
              // jsonDestinatario.put("cognome",
              // destinatario.getCognomeointestazione());
              // }

              // TODO: 03/12/2021 - I valori "denominazione", "nome" e "cognome"
              // devono essere sempre indicati.
              jsonDestinatario.put("denominazione", destinatario.getCognomeointestazione());
              if (destinatario.getNome() != null && !"".equals(destinatario.getNome().trim())) {
                jsonDestinatario.put("nome", destinatario.getNome());
              } else {
                jsonDestinatario.put("nome", destinatario.getCognomeointestazione());
              }
              jsonDestinatario.put("nome", destinatario.getNome());
              jsonDestinatario.put("cognome", destinatario.getCognomeointestazione());

              // TODO: 03/12/2021 - Il valore "sesso" deve essere sempre
              // indicato con il valore fisso "A"
              jsonDestinatario.put("sesso", "A");

              jsonDestinatari.put(jsonDestinatario);
            }

            jsonInput.put("soggetti", jsonDestinatari);
          }
        }
      }

      // Allegati
      WSDMProtocolloAllegato[] allegati = wsdmprotocolloDocumentoIn.getAllegati();
      if (allegati != null && allegati.length > 0) {
        JSONArray jsonAllegati = new JSONArray();
        for (int al = 0; al < allegati.length; al++) {
          WSDMProtocolloAllegato allegato = allegati[al];
          JSONObject jsonAllegato = new JSONObject();
          if (al == 0) {
            jsonAllegato.put("tipo", "P");
          } else {
            jsonAllegato.put("tipo", "A");
          }
          jsonAllegato.put("nome", allegato.getNome());
          jsonAllegato.put("file", Base64.encode(allegato.getContenuto()));
          jsonAllegati.put(jsonAllegato);

        }
        jsonInput.put("allegati", jsonAllegati);
      }

      if (logger.isDebugEnabled()) {
        logger.debug("_protocolloInserisci URL: " + url.toString());
        logger.debug("_protocolloInserisci jsonInput: " + jsonInput.toString());
      }

      // Dimensione dello stream dati
      connection.setRequestProperty("Content-Length", String.valueOf(jsonInput.toString().getBytes().length));

      DataOutputStream output = new DataOutputStream(connection.getOutputStream());
      output.write(jsonInput.toString().getBytes());
      output.flush();

      // Log della richiesta
      if (logger.isDebugEnabled()) {
        OutputStream osr = connection.getOutputStream();
        logger.debug("_protocolloInserisci getOutputStream: " + osr);
      }

      // Risposta
      int httpStatus = connection.getResponseCode();
      
      if (logger.isDebugEnabled()) {
        logger.debug("_protocolloInserisci ResponseCode: " + httpStatus);
      }
      
      if (httpStatus == 201) {
        String res = getInputStream(connection);
        if (res == null || (res != null && "".equals(res.trim()))) {
          res = getErrorStream(connection);
        }

        if (logger.isDebugEnabled()) {
          logger.debug("_protocolloInserisci getInputStream: " + res);
        }

        // Lettura della risposta
        JSONObject jsonOutput = new JSONObject(res);

        WSDMProtocolloDocumento wsdmProtocolloDocumento = new WSDMProtocolloDocumento();

        // Numero protocollo e numero documento
        String numeroProtocollo = jsonOutput.getString("numeroProtocollo");
        wsdmProtocolloDocumento.setNumeroProtocollo(numeroProtocollo);
        wsdmProtocolloDocumento.setNumeroDocumento(numeroProtocollo);

        // Data protocollo ("dataProtocollo": "2021-11-25T00:00:00+01:00")
        // try {
        // String dataProtocollo = jsonOutput.getString("dataProtocollo");
        // Date _d = new
        // SimpleDateFormat("yyyy-MM-ddHH:mm:ss").parse(dataProtocollo);
        // wsdmProtocolloDocumento.setDataProtocollo(_d);
        // } catch (Exception e) {
        //
        // }

        Calendar dataProtocolloToday = Calendar.getInstance();
        wsdmProtocolloDocumento.setDataProtocollo(dataProtocolloToday.getTime());

        // Anno protocollo
        try {
          String annoProtocollo = jsonOutput.getString("annoProtocollo");
          wsdmProtocolloDocumento.setAnnoProtocollo(new Long(annoProtocollo));
        } catch (Exception e) {

        }

        wsdmprotocolloDocumentoRes.setEsito(true);
        wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmProtocolloDocumento);

      } else {
        String res = getErrorStream(connection);
        if (res == null || (res != null && "".equals(res.trim()))) {
          res = getInputStream(connection);
        }
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(res);
        if (logger.isDebugEnabled()) {
          logger.debug("_protocolloInserisci getErrorStream: " + res);
        }
      }
    } catch (Throwable e) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(e.getMessage());
      logger.error("Errore (_protocolloInserisci)", e);
    } finally {
      try {
        if (connection != null) {
          connection.disconnect();
        }
      } catch (Throwable t) {

      }
    }

    return wsdmprotocolloDocumentoRes;
  }

  private WSDMProtocolloDocumentoRes _generic01DocumentoInserisci(String username, String password,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    HttpURLConnection connection = null;

    try {

      String token = getTOKEN(username, password);
      String protocollo_ws = getDOCUMENTALE_WS();

      URL url = new URL(protocollo_ws);
      connection = (HttpURLConnection) url.openConnection();
      connection.setDoInput(true);
      connection.setDoOutput(true);
      connection.setUseCaches(false);
      connection.setRequestMethod("POST");
      connection.setRequestProperty("Authorization", "Bearer " + token);
      connection.setRequestProperty("Connection", "Keep-Alive");
      connection.setRequestProperty("Content-Type", "application/json");
      connection.setRequestProperty("Host", url.getHost());

      // Dati del nuovo documento
      JSONObject jsonInput = new JSONObject();

      // UserId
      // UserId, se valorizzato il parametro GENERIC01_SYSLOGIN considero questo
      // sovrascrivendo il valore inviato dal client.
      String userId = null;
      String syslogin = getSYSLOGIN();
      if (syslogin != null && !"".equals(syslogin.trim())) {
        userId = syslogin;
      } else {
        userId = wsdmprotocolloDocumentoIn.getGenericS11();
      }
      jsonInput.put("userId", userId);

      // Service
      jsonInput.put("service", getSERVICE_PROVIDER_CODE());

      // Allegati
      WSDMProtocolloAllegato[] allegati = wsdmprotocolloDocumentoIn.getAllegati();
      if (allegati != null && allegati.length > 0) {
        // Si considera solo il primo documento
        WSDMProtocolloAllegato allegato = allegati[0];

        // Descrizione del documento
        jsonInput.put("oggetto", allegato.getTitolo());

        // Nome del documento
        jsonInput.put("docname", allegato.getNome());

        // Contenuto
        JSONObject jsonFile = new JSONObject();
        jsonFile.put("file", Base64.encode(allegato.getContenuto()));
        jsonInput.accumulate("content", jsonFile);

      }

      if (logger.isDebugEnabled()) {
        logger.debug("_documentoInserisci URL: " + url.toString());
        logger.debug("_documentoInserisci jsonInput: " + jsonInput.toString());
      }

      // Dimensione dello stream dati
      connection.setRequestProperty("Content-Length", String.valueOf(jsonInput.toString().getBytes().length));

      DataOutputStream output = new DataOutputStream(connection.getOutputStream());
      output.write(jsonInput.toString().getBytes());
      output.flush();

      // Log della richiesta
      if (logger.isDebugEnabled()) {
        OutputStream osr = connection.getOutputStream();
        logger.debug("_documentoInserisci getOutputStream: " + osr);
      }

      // Risposta
      int httpStatus = connection.getResponseCode();
      
      if (logger.isDebugEnabled()) {
        logger.debug("_protocolloInserisci ResponseCode: " + httpStatus);
      }
      
      if (httpStatus == 201) {
        String res = getInputStream(connection);
        if (res == null || (res != null && "".equals(res.trim()))) {
          res = getErrorStream(connection);
        }

        if (logger.isDebugEnabled()) {
          logger.debug("_documentoInserisci getInputStream: " + res);
        }

        // Lettura della risposta
        // TODO: 03/12/2021 L'intera risposta è il numero del documento, non c'è
        // alcun JSON restituito dal servizio

        // JSONObject jsonOutput = new JSONObject(res);
        // String numeroDocumento =
        // jsonOutput.getString("identificativoDocumento");

        WSDMProtocolloDocumento wsdmProtocolloDocumento = new WSDMProtocolloDocumento();

        // Numero protocollo e numero documento
        String numeroDocumento = res;
        wsdmProtocolloDocumento.setNumeroDocumento(numeroDocumento);

        Calendar dataProtocolloToday = Calendar.getInstance();
        wsdmProtocolloDocumento.setDataProtocollo(dataProtocolloToday.getTime());

        wsdmprotocolloDocumentoRes.setEsito(true);
        wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmProtocolloDocumento);

      } else {
        String res = getErrorStream(connection);
        if (res == null || (res != null && "".equals(res.trim()))) {
          res = getInputStream(connection);
        }
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(res);
        if (logger.isDebugEnabled()) {
          logger.debug("_documentoInserisci getErrorStream: " + res);
        }
      }
    } catch (Throwable e) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(e.getMessage());
      logger.error("Errore (_documentoInserisci)", e);
    } finally {
      try {
        if (connection != null) {
          connection.disconnect();
        }
      } catch (Throwable t) {

      }
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

    if (Generic01UtilityControllo.ctrDocumentoInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {
      wsdmprotocolloDocumentoRes = _generic01DocumentoInserisci(username, password, wsdmprotocolloDocumentoIn);
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

  @Override
  public WSDMProtocolloDocumentoRes _protocolloAsincronoEsito(String username, String password, WSDMLoginAttr loginAttr, String id) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    wsdmprotocolloDocumentoRes.setEsito(false);
    wsdmprotocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmprotocolloDocumentoRes;
  }

}
