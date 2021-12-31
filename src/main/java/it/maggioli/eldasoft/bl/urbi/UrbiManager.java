package it.maggioli.eldasoft.bl.urbi;

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

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.axis.encoding.Base64;
import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

/**
 * Manager per la gestione documentale.
 * 
 */

public class UrbiManager implements IWSDMManager {

  static Logger              logger                                                            = Logger.getLogger(UrbiManager.class);

  static private String      URBI_PROTOCOLLO_URL                                               = "java:comp/env/URBI_PROTOCOLLO_URL";
  static private String      URBI_PROTOCOLLO_NOT_DEFINED                                       = "URBI: l'indirizzo del servizio di protocollo non e' valorizzato";

  static private String      URBI_IDAOO                                                        = "java:comp/env/URBI_IDAOO";
  static private String      URBI_IDAOO_NOT_DEFINED                                            = "URBI: l'identificativo della AOO non e' valorizzato";

  static private String      URBI_UTENTE_REGISTRATORE                                          = "java:comp/env/URBI_UTENTE_REGISTRATORE";
  static private String      URBI_UTENTE_REGISTRATORE_NOT_DEFINED                              = "URBI: l'utente registratore non e' valorizzato";

  static private String      URBI_PARTENZA_TIPO_MEZZO                                          = "java:comp/env/URBI_PARTENZA_TIPO_MEZZO";
  static private String      URBI_PARTENZA_TIPO_MEZZO_NOT_DEFINED                              = "URBI: il tipo mezzo per le comunicazioni in partenza non e' valorizzato";

  static private String      URBI_ARRIVO_TIPO_MEZZO                                            = "java:comp/env/URBI_ARRIVO_TIPO_MEZZO";
  static private String      URBI_ARRIVO_TIPO_MEZZO_NOT_DEFINED                                = "URBI: il tipo mezzo per le comunicazioni in arrivo non e' valorizzato";

  static private String      URBI_PARTENZA_UFFICIO_MITTENTE                                    = "java:comp/env/URBI_PARTENZA_UFFICIO_MITTENTE";
  static private String      URBI_PARTENZA_UFFICIO_MITTENTE_NOT_DEFINED                        = "URBI: il parametro UFFICIO_MITTENTE per le comunicazioni in partenza non e' valorizzato";

  static private String      URBI_PARTENZA_UFFICIO_MITTENTE_ORIGINALE                          = "java:comp/env/URBI_PARTENZA_UFFICIO_MITTENTE_ORIGINALE";
  static private String      URBI_PARTENZA_UFFICIO_MITTENTE_ORIGINALE_NOT_DEFINED              = "URBI: il parametro UFFICIO_MITTENTE_ORIGINALE per le comunicazioni in partenza non e' valorizzato";

  static private String      URBI_PARTENZA_UFFICIO_MITTENTE_UTENTE_MITTENTE                    = "java:comp/env/URBI_PARTENZA_UFFICIO_MITTENTE_UTENTE_MITTENTE";
  static private String      URBI_PARTENZA_UFFICIO_MITTENTE_UTENTE_MITTENTE_NOT_DEFINED        = "URBI: il parametro UFFICIO_MITTENTE_UTENTE_MITTENTE per le comunicazioni in partenza non e' valorizzato";

  static private String      URBI_PARTENZA_INVIO_IMMEDIATO_PEC                                 = "java:comp/env/URBI_PARTENZA_INVIO_IMMEDIATO_PEC";
  static private String      URBI_PARTENZA_INVIO_IMMEDIATO_PEC_NOT_DEFINED                     = "URBI: il parametro INVIO_IMMEDIATO_PEC per le comunicazioni in partenza non e' valorizzato";

  static private String      URBI_PARTENZA_CLASSIFICAZIONE                                     = "java:comp/env/URBI_PARTENZA_CLASSIFICAZIONE";
  static private String      URBI_PARTENZA_CLASSIFICAZIONE_NOT_DEFINED                         = "URBI: la classificazione per i documenti  delle comunicazioni in partenza non e' definita";

  static private String      URBI_ARRIVO_UFFICIO_DESTINATARIO                                  = "java:comp/env/URBI_ARRIVO_UFFICIO_DESTINATARIO";
  static private String      URBI_ARRIVO_UFFICIO_DESTINATARIO_NOT_DEFINED                      = "URBI: il parametro UFFICIO_DESTINARARIO per le comunicazioni in arrivo non e' valorizzato";

  static private String      URBI_ARRIVO_UFFICIO_DESTINATARIO_ORIGINALE                        = "java:comp/env/URBI_ARRIVO_UFFICIO_DESTINATARIO_ORIGINALE";
  static private String      URBI_ARRIVO_UFFICIO_DESTINATARIO_ORIGINALE_NOT_DEFINED            = "URBI: il parametro UFFICIO_DESTINARARIO_ORIGINALE per le comunicazioni in arrivo non e' valorizzato";

  static private String      URBI_ARRIVO_UFFICIO_DESTINATARIO_UTENTE_CO_AUTOMATICI             = "java:comp/env/URBI_ARRIVO_UFFICIO_DESTINATARIO_UTENTE_CO_AUTOMATICI";
  static private String      URBI_ARRIVO_UFFICIO_DESTINATARIO_UTENTE_CO_AUTOMATICI_NOT_DEFINED = "URBI: il parametro UFFICIO_DESTINARARIO_UTENTE_CO_AUTOMATICI per le comunicazioni in arrivo non e' valorizzato";

  static private String      URBI_ARRIVO_UFFICIO_DESTINATARIO_ASSEGNAZIONE                     = "java:comp/env/URBI_ARRIVO_UFFICIO_DESTINATARIO_ASSEGNAZIONE";
  static private String      URBI_ARRIVO_UFFICIO_DESTINATARIO_ASSEGNAZIONE_NOT_DEFINED         = "URBI: il parametro UFFICIO_DESTINARARIO_ASSEGNAZIONE per le comunicazioni in arrivo non e' valorizzato";

  static private String      URBI_ARRIVO_UFFICIO_DESTINATARIO_UTENTE                           = "java:comp/env/URBI_ARRIVO_UFFICIO_DESTINATARIO_UTENTE";
  static private String      URBI_ARRIVO_UFFICIO_DESTINATARIO_UTENTE_NOT_DEFINED               = "URBI: il parametro UFFICIO_DESTINARARIO_UTENTE per le comunicazioni in arrivo non e' valorizzato";

  static private String      URBI_ARRIVO_CLASSIFICAZIONE                                       = "java:comp/env/URBI_ARRIVO_CLASSIFICAZIONE";
  static private String      URBI_ARRIVO_CLASSIFICAZIONE_NOT_DEFINED                           = "URBI: la classificazione per i documenti delle comunicazioni in arrivo non e' definita";

  static public final String PROTOCOLLO_IN_ENTRATA                                             = "A";
  static public final String PROTOCOLLO_IN_USCITA                                              = "P";

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

  public WSDMListaClassificheRes _listaClassifiche(String username, String password, WSDMLoginAttr loginAttr, String codice,
      String descrizione, String voce) {
    WSDMListaClassificheRes wsdmListaClassificheRes = new WSDMListaClassificheRes();
    wsdmListaClassificheRes.setEsito(false);
    wsdmListaClassificheRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmListaClassificheRes;
  }

  @Override
  public WSDMProtocolloDocumentoRes _protocolloInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {

    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    HttpURLConnection connection = null;

    try {

      StringBuffer messaggioCtr = new StringBuffer();
      if (UrbiUtilityControllo.ctrProtocolloInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {

        // Indirizzo servizio
        String urbi_protocollo_url = InitialContext.doLookup(URBI_PROTOCOLLO_URL);
        if (urbi_protocollo_url == null || (urbi_protocollo_url != null && "".equals(urbi_protocollo_url.trim()))) {
          throw new Exception(URBI_PROTOCOLLO_NOT_DEFINED);
        }

        String authentication = username + ":" + password;
        String authenticationBase64 = Base64.encode(authentication.getBytes());

        URL url = new URL(urbi_protocollo_url);
        connection = (HttpURLConnection) url.openConnection();
        connection.setDoInput(true);
        connection.setDoOutput(true);
        connection.setUseCaches(false);
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Authorization", "Basic " + authenticationBase64 + "==");
        connection.setRequestProperty("Connection", "Keep-Alive");

        String boundary = "----" + Long.toHexString(System.currentTimeMillis());
        connection.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + boundary);

        DataOutputStream output = new DataOutputStream(connection.getOutputStream());

        // Nome della funzione da richiamare
        _addParameter(boundary, output, "WTDK_REQ", "insProtocollo");

        // Identificativo AOO
        String urbi_idaoo = InitialContext.doLookup(URBI_IDAOO);
        if (urbi_idaoo == null || (urbi_idaoo != null && "".equals(urbi_idaoo.trim()))) {
          throw new Exception(URBI_IDAOO_NOT_DEFINED);
        }
        _addParameter(boundary, output, "PRCORE03_99991009_IDAOO", urbi_idaoo);

        // Verso della protocollazione
        if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
          _addParameter(boundary, output, "PRCORE03_99991009_Sezione", PROTOCOLLO_IN_USCITA);
        } else if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
          _addParameter(boundary, output, "PRCORE03_99991009_Sezione", PROTOCOLLO_IN_ENTRATA);
        }

        // Oggetto
        _addParameter(boundary, output, "PRCORE03_99991009_Oggetto", wsdmprotocolloDocumentoIn.getOggetto());

        // Utente registratore
        String urbi_utente_registratore = InitialContext.doLookup(URBI_UTENTE_REGISTRATORE);
        if (urbi_utente_registratore == null || (urbi_utente_registratore != null && "".equals(urbi_utente_registratore.trim()))) {
          throw new Exception(URBI_UTENTE_REGISTRATORE_NOT_DEFINED);
        }
        _addParameter(boundary, output, "PRCORE03_99991009_Utente_Registratore", urbi_utente_registratore);

        // Tipo mezzo (differente in base al verso di protocollazione)
        if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
          String urbi_partenza_tipo_mezzo = InitialContext.doLookup(URBI_PARTENZA_TIPO_MEZZO);
          if (urbi_partenza_tipo_mezzo == null || (urbi_partenza_tipo_mezzo != null && "".equals(urbi_partenza_tipo_mezzo.trim()))) {
            throw new Exception(URBI_PARTENZA_TIPO_MEZZO_NOT_DEFINED);
          }
          _addParameter(boundary, output, "PRCORE03_99991009_TipoMezzo", urbi_partenza_tipo_mezzo);
        } else if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
          String urbi_arrivo_tipo_mezzo = InitialContext.doLookup(URBI_ARRIVO_TIPO_MEZZO);
          if (urbi_arrivo_tipo_mezzo == null || (urbi_arrivo_tipo_mezzo != null && "".equals(urbi_arrivo_tipo_mezzo.trim()))) {
            throw new Exception(URBI_ARRIVO_TIPO_MEZZO_NOT_DEFINED);
          }
          _addParameter(boundary, output, "PRCORE03_99991009_TipoMezzo", urbi_arrivo_tipo_mezzo);
        }

        // Tipo documento (il valore deve essere indicato dal client Appalti o
        // Portale Appalti)
        _addParameter(boundary, output, "PRCORE03_99991009_TipoDocumento", wsdmprotocolloDocumentoIn.getTipoDocumento());

        // No avvio iter
        _addParameter(boundary, output, "PRCORE03_99991009_No_Avvio_Iter", "S");

        // Ufficio mittenti (per il verso in partenza)
        _ufficioMittente(wsdmprotocolloDocumentoIn, boundary, output);

        // Ufficio destinatario (per il verso in arrivo)
        _ufficioDestinatario(wsdmprotocolloDocumentoIn, boundary, output);

        // Corrispondenti destinatari (per il verso in partenza)
        if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
          if (wsdmprotocolloDocumentoIn.getDestinatari() != null && wsdmprotocolloDocumentoIn.getDestinatari().length > 0) {
            WSDMProtocolloAnagrafica[] anagrafiche = wsdmprotocolloDocumentoIn.getDestinatari();

            // Numero di corrispondenti
            _addParameter(boundary, output, "PRCORE03_99991009_Num_Corrispondenti", Integer.toString(anagrafiche.length));

            for (int a = 0; a < anagrafiche.length; a++) {
              String codiceSoggetto = _gestioneCorrispondente(username, password, anagrafiche[a]);
              // Codice del corrispondente
              _addParameter(boundary, output, "PRCORE03_99991009_" + (a + 1) + "_Corrispondente_CodiceSoggetto", codiceSoggetto);

              // Indirizzo email del corrispondente
              _addParameter(boundary, output, "PRCORE03_99991009_" + (a + 1) + "_Corrispondente_Indirizzo_Email_PEC",
                  anagrafiche[a].getEmail());
            }
          }

          // Invio immediato PEC
          String urbi_partenza_invio_immediato_pec = InitialContext.doLookup(URBI_PARTENZA_INVIO_IMMEDIATO_PEC);
          if (urbi_partenza_invio_immediato_pec == null
              || (urbi_partenza_invio_immediato_pec != null && "".equals(urbi_partenza_invio_immediato_pec.trim()))) {
            throw new Exception(URBI_PARTENZA_INVIO_IMMEDIATO_PEC_NOT_DEFINED);
          }
          _addParameter(boundary, output, "PRCORE03_99991009_Invio_Immediato_PEC", urbi_partenza_invio_immediato_pec);

        }

        // Corrispondenti mittenti (per il verso in arrivo)
        if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
          if (wsdmprotocolloDocumentoIn.getMittenti() != null && wsdmprotocolloDocumentoIn.getMittenti().length > 0) {
            WSDMProtocolloAnagrafica[] anagrafiche = wsdmprotocolloDocumentoIn.getMittenti();

            // Numero di corrispondenti
            _addParameter(boundary, output, "PRCORE03_99991009_Num_Corrispondenti", Integer.toString(anagrafiche.length));

            for (int a = 0; a < anagrafiche.length; a++) {
              String codiceSoggetto = _gestioneCorrispondente(username, password, anagrafiche[a]);
              // Codice del corrispondente
              _addParameter(boundary, output, "PRCORE03_99991009_" + (a + 1) + "_Corrispondente_CodiceSoggetto", codiceSoggetto);
            }
          }

        }

        // Gestione degli allegati
        if (wsdmprotocolloDocumentoIn.getAllegati() != null && wsdmprotocolloDocumentoIn.getAllegati().length > 0) {
          WSDMProtocolloAllegato[] allegati = wsdmprotocolloDocumentoIn.getAllegati();

          // Numero di allegati (bisogna escludere il documento principale)
          int numeroAllegati = allegati.length - 1;
          _addParameter(boundary, output, "PRCORE03_99991009_Num_Allegati", numeroAllegati + "");

          // Gestione della classificazione in funzione del verso di
          // protocollazione
          // La classificazione deve essere riportata per ogni documento del
          // protocollo (anche per il documento principale)
          String classificazione = "";
          if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
            classificazione = InitialContext.doLookup(URBI_ARRIVO_CLASSIFICAZIONE);
            if (classificazione == null || (classificazione != null && "".equals(classificazione.trim()))) {
              throw new Exception(URBI_ARRIVO_CLASSIFICAZIONE_NOT_DEFINED);
            }
          } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
            classificazione = InitialContext.doLookup(URBI_PARTENZA_CLASSIFICAZIONE);
            if (classificazione == null || (classificazione != null && "".equals(classificazione.trim()))) {
              throw new Exception(URBI_PARTENZA_CLASSIFICAZIONE_NOT_DEFINED);
            }
          }

          for (int a = 0; a < allegati.length; a++) {

            // Gestione dei file fisici
            String nome = allegati[a].getNome();
            String upload = "Content-Disposition: form-data; name=\""
                + "PRCORE03_99991009_"
                + a
                + "_Allegato_PathFile"
                + "\";"
                + " filename=\""
                + nome
                + "\"";
            byte[] contenuto = allegati[a].getContenuto();

            output.writeBytes("--" + boundary + "\r\n");
            output.writeBytes(upload);
            output.writeBytes("\r\n");
            output.writeBytes("");
            output.writeBytes("\r\n");
            output.write(contenuto);
            output.writeBytes("\r\n");

            // Classifica
            String parametroClassificazione = "PRCORE03_99991009_" + a + "_Allegato_Classificazione_1";
            _addParameter(boundary, output, parametroClassificazione, classificazione);
          }

        }

        // Chiusura della sezione "multipart/form-data"
        output.writeBytes("--" + boundary + "--" + "\r\n");
        output.flush();
        output.close();

        if (logger.isDebugEnabled()) {
          OutputStream osr = connection.getOutputStream();
          logger.debug("getOutputStream: " + osr);
        }
        
        int httpStatus = connection.getResponseCode();

        // Esito false, solo ne caso di esito positivo si riporta a TRUE
        wsdmprotocolloDocumentoRes.setEsito(false);

        if (httpStatus == 403) {
          wsdmprotocolloDocumentoRes.setEsito(false);
          wsdmprotocolloDocumentoRes.setMessaggio("I sistema ha risposto con l'errore 403 (utente/password errati, impossibile accedere)");
        } else {
          if (httpStatus >= 400) {
            wsdmprotocolloDocumentoRes.setEsito(false);
            wsdmprotocolloDocumentoRes.setMessaggio("Il sistema ha risposto con l'errore "
                + httpStatus
                + "( "
                + connection.getResponseMessage()
                + ")");
          } else {
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
            Document document = DocumentHelper.parseText(res);
            Element elRoot = document.getRootElement();

            if (elRoot != null) {
              Element insProtocollo_Result = elRoot.element("insProtocollo_Result");
              if (insProtocollo_Result != null) {
                String result = insProtocollo_Result.element("RESULT").getText();
                result = result.replace("\n", "").replace("\r", "");
                if ("S".equals(result.trim())) {
                  // L'inserimento e' andato a buon fine
                  String message = insProtocollo_Result.element("MESSAGE").getText();
                  wsdmprotocolloDocumentoRes.setEsito(true);
                  wsdmprotocolloDocumentoRes.setMessaggio(message);

                  // Lettura dei dettagli del protocollo
                  String idProto = insProtocollo_Result.element("IdProto").getText();
                  idProto = idProto.replace("\n", "").replace("\r", "");
                  String annoProtocollo = insProtocollo_Result.element("Anno").getText();
                  annoProtocollo = annoProtocollo.replace("\n", "").replace("\r", "");
                  String numeroProtocollo = insProtocollo_Result.element("Numero").getText();
                  numeroProtocollo = numeroProtocollo.replace("\n", "").replace("\r", "");
                  String dataProtocollo = insProtocollo_Result.element("DataProtocollo").getText();
                  dataProtocollo = dataProtocollo.replace("\n", "").replace("\r", "");
                  String oraProtocollo = insProtocollo_Result.element("OraProtocollo").getText();
                  oraProtocollo = oraProtocollo.replace("\n", "").replace("\r", "");

                  WSDMProtocolloDocumento wsdmProtocolloDocumento = new WSDMProtocolloDocumento();

                  // Numero documento
                  wsdmProtocolloDocumento.setNumeroDocumento(idProto);

                  // Anno del protocollo
                  try {
                    wsdmProtocolloDocumento.setAnnoProtocollo(Long.parseLong(annoProtocollo));
                  } catch (Exception e) {

                  }

                  // Numero del protocollo
                  wsdmProtocolloDocumento.setNumeroProtocollo(numeroProtocollo);

                  // Data e ora del protocollo
                  try {
                    SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                    Date dataProtocolloCompleta = format.parse(dataProtocollo + " " + oraProtocollo);
                    wsdmProtocolloDocumento.setDataProtocollo(dataProtocolloCompleta);
                  } catch (Exception e) {
                    // Se si presenta qualche problema con il formato calcolo
                    // data ed ora
                    Calendar dataProtocolloToday = Calendar.getInstance();
                    wsdmProtocolloDocumento.setDataProtocollo(dataProtocolloToday.getTime());
                  }

                  wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmProtocolloDocumento);

                } else {
                  // L'inserimento NON e' andato a buon fine
                  String errorcode = insProtocollo_Result.element("ERRORCODE").getText();
                  errorcode = errorcode.replace("\n", "").replace("\r", "");
                  String message = insProtocollo_Result.element("MESSAGE").getText();
                  wsdmprotocolloDocumentoRes.setEsito(false);
                  wsdmprotocolloDocumentoRes.setMessaggio(errorcode + " - " + message);

                }
              }
            }

          }
        }

      } else {
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (Exception e) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(e.getMessage());
      logger.error("Errore (_protocolloInserisci)", e);
    } finally {
      connection.disconnect();
    }

    return wsdmprotocolloDocumentoRes;

  }

  /**
   * Gestione dell'ufficio destinatario nel caso di protocollo in
   * arrivo/ingresso.
   * 
   * @param wsdmprotocolloDocumentoIn
   * @param boundary
   * @param output
   * @throws IOException
   * @throws NamingException
   * @throws Exception
   */
  private void _ufficioDestinatario(WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn, String boundary, DataOutputStream output)
      throws IOException, NamingException, Exception {
    if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
      // Numero uffici destinatari
      _addParameter(boundary, output, "PRCORE03_99991009_Num_Uffici_Destinatari", "1");

      // Ufficio destinatario
      String urbi_arrivo_ufficio_destinatario = InitialContext.doLookup(URBI_ARRIVO_UFFICIO_DESTINATARIO);
      if (urbi_arrivo_ufficio_destinatario == null
          || (urbi_arrivo_ufficio_destinatario != null && "".equals(urbi_arrivo_ufficio_destinatario.trim()))) {
        throw new Exception(URBI_ARRIVO_UFFICIO_DESTINATARIO_NOT_DEFINED);
      }
      _addParameter(boundary, output, "PRCORE03_99991009_1_Ufficio_Destinatario", urbi_arrivo_ufficio_destinatario);

      // Ufficio destinatario originale
      String urbi_arrivo_ufficio_destinatario_originale = InitialContext.doLookup(URBI_ARRIVO_UFFICIO_DESTINATARIO_ORIGINALE);
      if (urbi_arrivo_ufficio_destinatario_originale == null
          || (urbi_arrivo_ufficio_destinatario_originale != null && "".equals(urbi_arrivo_ufficio_destinatario_originale.trim()))) {
        throw new Exception(URBI_ARRIVO_UFFICIO_DESTINATARIO_ORIGINALE_NOT_DEFINED);
      }
      _addParameter(boundary, output, "PRCORE03_99991009_1_Ufficio_Destinatario_Originale", urbi_arrivo_ufficio_destinatario_originale);

      // Ufficio destinatario utente CO automatici
      String urbi_arrivo_ufficio_destinatario_utente_co_automatici = InitialContext.doLookup(URBI_ARRIVO_UFFICIO_DESTINATARIO_UTENTE_CO_AUTOMATICI);
      if (urbi_arrivo_ufficio_destinatario_utente_co_automatici == null
          || (urbi_arrivo_ufficio_destinatario_utente_co_automatici != null && "".equals(urbi_arrivo_ufficio_destinatario_utente_co_automatici.trim()))) {
        throw new Exception(URBI_ARRIVO_UFFICIO_DESTINATARIO_UTENTE_CO_AUTOMATICI_NOT_DEFINED);
      }
      _addParameter(boundary, output, "PRCORE03_99991009_1_Ufficio_Destinatario_Utente_CO_Automatici",
          urbi_arrivo_ufficio_destinatario_utente_co_automatici);

      // Ufficio destinatario assegnazione
      String urbi_arrivo_ufficio_destinatario_assegnazione = InitialContext.doLookup(URBI_ARRIVO_UFFICIO_DESTINATARIO_ASSEGNAZIONE);
      if (urbi_arrivo_ufficio_destinatario_assegnazione == null
          || (urbi_arrivo_ufficio_destinatario_assegnazione != null && "".equals(urbi_arrivo_ufficio_destinatario_assegnazione.trim()))) {
        throw new Exception(URBI_ARRIVO_UFFICIO_DESTINATARIO_ASSEGNAZIONE_NOT_DEFINED);
      }
      _addParameter(boundary, output, "PRCORE03_99991009_1_Ufficio_Destinatario_Assegnazione_Utente_Gruppo_Singola",
          urbi_arrivo_ufficio_destinatario_assegnazione);

      // Numero utenti
      _addParameter(boundary, output, "PRCORE03_99991009_1_Ufficio_Destinatario_Num_Utenti", "1");

      // Ufficio - utente
      String urbi_arrivo_ufficio_destinatario_utente = InitialContext.doLookup(URBI_ARRIVO_UFFICIO_DESTINATARIO_UTENTE);
      if (urbi_arrivo_ufficio_destinatario_utente == null
          || (urbi_arrivo_ufficio_destinatario_utente != null && "".equals(urbi_arrivo_ufficio_destinatario_utente.trim()))) {
        throw new Exception(URBI_ARRIVO_UFFICIO_DESTINATARIO_UTENTE_NOT_DEFINED);
      }
      _addParameter(boundary, output, "PRCORE03_99991009_1_Ufficio_Destinatario_1_Utente", urbi_arrivo_ufficio_destinatario_utente);

    }
  }

  /**
   * Gestione dell'ufficio mittente nel caso di protocollazione in
   * uscita/partenza.
   * 
   * @param wsdmprotocolloDocumentoIn
   * @param boundary
   * @param output
   * @throws IOException
   * @throws NamingException
   * @throws Exception
   */
  private void _ufficioMittente(WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn, String boundary, DataOutputStream output)
      throws IOException, NamingException, Exception {
    if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {

      // Numero uffici mittenti
      _addParameter(boundary, output, "PRCORE03_99991009_Num_Uffici_Mittenti", "1");

      // Ufficio mittente
      String urbi_partenza_ufficio_mittente = InitialContext.doLookup(URBI_PARTENZA_UFFICIO_MITTENTE);
      if (urbi_partenza_ufficio_mittente == null
          || (urbi_partenza_ufficio_mittente != null && "".equals(urbi_partenza_ufficio_mittente.trim()))) {
        throw new Exception(URBI_PARTENZA_UFFICIO_MITTENTE_NOT_DEFINED);
      }
      _addParameter(boundary, output, "PRCORE03_99991009_1_Ufficio_Mittente", urbi_partenza_ufficio_mittente);

      // Ufficio mittente originale
      String urbi_partenza_ufficio_mittente_originale = InitialContext.doLookup(URBI_PARTENZA_UFFICIO_MITTENTE_ORIGINALE);
      if (urbi_partenza_ufficio_mittente_originale == null
          || (urbi_partenza_ufficio_mittente_originale != null && "".equals(urbi_partenza_ufficio_mittente_originale.trim()))) {
        throw new Exception(URBI_PARTENZA_UFFICIO_MITTENTE_ORIGINALE_NOT_DEFINED);
      }
      _addParameter(boundary, output, "PRCORE03_99991009_1_Ufficio_Mittente_Originale", urbi_partenza_ufficio_mittente_originale);

      // Ufficio mittente utente mittente
      String urbi_partenza_ufficio_mittente_utente_mittente = InitialContext.doLookup(URBI_PARTENZA_UFFICIO_MITTENTE_UTENTE_MITTENTE);
      if (urbi_partenza_ufficio_mittente_originale == null
          || (urbi_partenza_ufficio_mittente_originale != null && "".equals(urbi_partenza_ufficio_mittente_originale.trim()))) {
        throw new Exception(URBI_PARTENZA_UFFICIO_MITTENTE_UTENTE_MITTENTE_NOT_DEFINED);
      }
      _addParameter(boundary, output, "PRCORE03_99991009_1_Ufficio_Mittente_UtenteMittente", urbi_partenza_ufficio_mittente_utente_mittente);

    }
  }

  /**
   * Gestione del corrispondente.
   * 
   * @param username
   * @param password
   * @param anagrafica
   * @return
   * @throws Exception
   */
  private String _gestioneCorrispondente(String username, String password, WSDMProtocolloAnagrafica anagrafica) throws Exception {
    String codiceSoggetto = null;

    // Ricerca del corrispondente
    // Si prova prima la ricerca per partita IVA, se è valorizzata e se non
    // restituisce nulla si prova per codice fiscale
    if (anagrafica.getPartitaIVA() != null && !"".equals(anagrafica.getPartitaIVA())) {
      codiceSoggetto = _ricercaCorrispondente(username, password, anagrafica, "PRCORE03_99991006_PartitaIVA");
      if (codiceSoggetto == null && anagrafica.getCodiceFiscale() != null && !"".equals(anagrafica.getCodiceFiscale())) {
        codiceSoggetto = _ricercaCorrispondente(username, password, anagrafica, "PRCORE03_99991006_CodiceFiscale");
      }
    } else if (anagrafica.getCodiceFiscale() != null && !"".equals(anagrafica.getCodiceFiscale())) {
      codiceSoggetto = _ricercaCorrispondente(username, password, anagrafica, "PRCORE03_99991006_CodiceFiscale");
    }

    // Se la ricerca per partita IVA e/o codice fiscale non ha restituito nulla,
    // si deve inserire il nuovo corrispodente
    if (codiceSoggetto == null) {
      codiceSoggetto = _inserimentoCorrispondente(username, password, anagrafica);
    }

    return codiceSoggetto;
  }

  /**
   * Inserimento di un nuovo corrispondente.
   * 
   * @param username
   * @param password
   * @param anagrafica
   * @return
   * @throws Exception
   */
  private String _inserimentoCorrispondente(String username, String password, WSDMProtocolloAnagrafica anagrafica) throws Exception {

    String codiceSoggetto = null;

    // Indirizzo servizio
    String urbi_protocollo_url = InitialContext.doLookup(URBI_PROTOCOLLO_URL);
    if (urbi_protocollo_url == null || (urbi_protocollo_url != null && "".equals(urbi_protocollo_url.trim()))) {
      throw new Exception(URBI_PROTOCOLLO_NOT_DEFINED);
    }

    String authentication = username + ":" + password;
    String authenticationBase64 = Base64.encode(authentication.getBytes());

    HttpURLConnection connection = null;
    URL url = new URL(urbi_protocollo_url);
    connection = (HttpURLConnection) url.openConnection();
    connection.setDoInput(true);
    connection.setDoOutput(true);
    connection.setUseCaches(false);
    connection.setRequestMethod("POST");
    connection.setRequestProperty("Authorization", "Basic " + authenticationBase64 + "==");
    connection.setRequestProperty("Connection", "Keep-Alive");

    String boundary = "----" + Long.toHexString(System.currentTimeMillis());
    connection.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + boundary);

    DataOutputStream output = new DataOutputStream(connection.getOutputStream());

    // Nome della funzione da richiamare
    _addParameter(boundary, output, "WTDK_REQ", "insCorrispondente");

    // Tipo persona (in questo caso sempre G - Giuridica)
    _addParameter(boundary, output, "PRCORE03_99991007_TipoPersona", "G");

    // Denominazione
    _addParameter(boundary, output, "PRCORE03_99991007_Denominazione", anagrafica.getCognomeointestazione());

    // Codice fiscale
    _addParameter(boundary, output, "PRCORE03_99991007_CodiceFiscale", anagrafica.getCodiceFiscale());

    // Partita IVA
    _addParameter(boundary, output, "PRCORE03_99991007_PartitaIVA", anagrafica.getPartitaIVA());

    output.writeBytes("--" + boundary + "--" + "\r\n");
    output.flush();
    output.close();

    if (logger.isDebugEnabled()) {
      OutputStream osr = connection.getOutputStream();
      logger.debug("getOutputStream: " + osr);
    }
    
    int httpStatus = connection.getResponseCode();

    if (httpStatus == 403) {
      throw new Exception("I sistema ha risposto con l'errore 403 (utente/password errati, impossibile accedere)");
    } else {
      if (httpStatus >= 400) {
        throw new Exception("Il sistema ha risposto con l'errore " + httpStatus + "( " + connection.getResponseMessage() + ")");
      } else {
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
        Document document = DocumentHelper.parseText(res);
        Element elRoot = document.getRootElement();

        if (elRoot != null) {
          Element insCorrispondente_Result = elRoot.element("insCorrispondente_Result");
          if (insCorrispondente_Result != null) {
            String result = insCorrispondente_Result.element("RESULT").getText();
            result = result.replace("\n", "").replace("\r", "");
            if ("S".equals(result.trim())) {
              codiceSoggetto = insCorrispondente_Result.element("CodiceSoggetto").getText();
              codiceSoggetto = codiceSoggetto.replace("\n", "").replace("\r", "");
              logger.info("Inserito un nuovo corrispondente con codice: " + codiceSoggetto);
            }
          }
        }
      }
    }

    connection.disconnect();

    return codiceSoggetto;
  }

  /**
   * Ricerca del corrispondente.
   * 
   * @param anagrafica
   * @return
   * @throws Exception
   */
  private String _ricercaCorrispondente(String username, String password, WSDMProtocolloAnagrafica anagrafica, String parametroRicerca)
      throws Exception {

    String codiceSoggetto = null;

    // Indirizzo servizio
    String urbi_protocollo_url = InitialContext.doLookup(URBI_PROTOCOLLO_URL);
    if (urbi_protocollo_url == null || (urbi_protocollo_url != null && "".equals(urbi_protocollo_url.trim()))) {
      throw new Exception(URBI_PROTOCOLLO_NOT_DEFINED);
    }

    String authentication = username + ":" + password;
    String authenticationBase64 = Base64.encode(authentication.getBytes());

    HttpURLConnection connection = null;
    URL url = new URL(urbi_protocollo_url);
    connection = (HttpURLConnection) url.openConnection();
    connection.setDoInput(true);
    connection.setDoOutput(true);
    connection.setUseCaches(false);
    connection.setRequestMethod("POST");
    connection.setRequestProperty("Authorization", "Basic " + authenticationBase64 + "==");
    connection.setRequestProperty("Connection", "Keep-Alive");

    String boundary = "----" + Long.toHexString(System.currentTimeMillis());
    connection.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + boundary);

    DataOutputStream output = new DataOutputStream(connection.getOutputStream());

    // Nome della funzione da richiamare
    _addParameter(boundary, output, "WTDK_REQ", "getElencoCorrispondenti");

    // Parametro di ricerca
    if ("PRCORE03_99991006_PartitaIVA".equals(parametroRicerca)) {
      _addParameter(boundary, output, "PRCORE03_99991006_PartitaIVA", anagrafica.getPartitaIVA());
    } else if ("PRCORE03_99991006_CodiceFiscale".equals(parametroRicerca)) {
      _addParameter(boundary, output, "PRCORE03_99991006_CodiceFiscale", anagrafica.getCodiceFiscale());
    }

    output.writeBytes("--" + boundary + "--" + "\r\n");
    output.flush();
    output.close();
    
    if (logger.isDebugEnabled()) {
      OutputStream osr = connection.getOutputStream();
      logger.debug("getOutputStream: " + osr);
    }
    
    int httpStatus = connection.getResponseCode();
    
    if (httpStatus == 403) {
      throw new Exception("I sistema ha risposto con l'errore 403 (utente/password errati, impossibile accedere)");
    } else {
      if (httpStatus >= 400) {
        throw new Exception("Il sistema ha risposto con l'errore " + httpStatus + "( " + connection.getResponseMessage() + ")");
      } else {
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
        Document document = DocumentHelper.parseText(res);
        Element elRoot = document.getRootElement();

        if (elRoot != null) {
          Element getElencoCorrispondenti_Result = elRoot.element("getElencoCorrispondenti_Result");
          if (getElencoCorrispondenti_Result != null) {
            String result = getElencoCorrispondenti_Result.element("RESULT").getText();
            result = result.replace("\n", "").replace("\r", "");
            if ("S".equals(result.trim())) {
              Element seq_Corrispondente = getElencoCorrispondenti_Result.element("SEQ_Corrispondente");
              if (seq_Corrispondente != null) {
                Element corrispondente = seq_Corrispondente.element("Corrispondente");
                if (corrispondente != null) {
                  codiceSoggetto = corrispondente.element("CodiceSoggetto").getText();
                  codiceSoggetto = codiceSoggetto.replace("\n", "").replace("\r", "");
                  if (logger.isDebugEnabled()) {
                    logger.info("Trovato il corrispondente con numero: " + codiceSoggetto);
                  }
                }
              }
            }
          }
        }
      }
    }

    connection.disconnect();

    return codiceSoggetto;

  }

  /**
   * Aggiunge il parametro alla chiamata POST ("multipart/form-data").
   * 
   * @param boundary
   * @param output
   * @param nomeParametro
   * @param valoreParametro
   * @throws IOException
   */
  private void _addParameter(String boundary, DataOutputStream output, String nomeParametro, String valoreParametro) throws IOException {
    output.writeBytes("--" + boundary + "\r\n");
    output.writeBytes("Content-Disposition: form-data; name=\"" + nomeParametro + "\"");
    output.writeBytes("\r\n");
    output.writeBytes("");
    output.writeBytes("\r\n");
    output.writeBytes(valoreParametro);
    output.writeBytes("\r\n");
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
