package it.maggioli.eldasoft.bl.lapisopera;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.bind.JAXBContext;

import org.apache.axis.encoding.Base64;
import org.apache.commons.io.IOUtils;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.ContentBody;
import org.apache.http.entity.mime.content.InputStreamBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

import it.lapis.protobatch.ProtoBatch;
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
import it.maggioli.eldasoft.ws.dm.WSDMRicercaFascicolo;
import it.maggioli.eldasoft.ws.dm.WSDMRicercaFascicoloRes;
import it.maggioli.eldasoft.ws.dm.WSDMTrasmissioneIn;
import it.maggioli.eldasoft.ws.dm.WSDMTrasmissioneRes;
import it.maggioli.eldasoft.ws.dm.WSDMVerificaMailRes;
import localhost.LapisWebSOAP.LapisWebSOAPServiceLocator;
import localhost.LapisWebSOAP.LapisWebSOAPType;

/**
 * Manager per la gestione documentale.
 * 
 */

public class LapisOperaManager implements IWSDMManager {

  static Logger         logger                                    = Logger.getLogger(LapisOperaManager.class);

  static private String LAPIS_PROTOCOLLO_URL                      = "java:comp/env/LAPIS_PROTOCOLLO_URL";
  static private String LAPIS_PROTOCOLLO_URL_NOT_DEFINED          = "LAPISOPERA: l'indirizzo del servizio protocollo LAPIS non e' valorizzato";
  static private String LAPIS_CODICE_APPLICATIVO                  = "java:comp/env/LAPIS_CODICE_APPLICATIVO";
  static private String LAPIS_CODICE_APPLICATIVO_NOT_DEFINED      = "LAPISOPERA: il codice applicativo per il protocollo LAPIS non e' valorizzato";

  static private String OPERA_DOCUMENTALE_URL                     = "java:comp/env/OPERA_DOCUMENTALE_URL";
  static private String OPERA_DOCUMENTALE_URL_NOT_DEFINED         = "LAPISOPERA: l'indirizzo del servizio documentale OPERA non e' valorizzato";

  static private String OPERA_FASCICOLO_FIND_SIZE                 = "250";
  static private String OPERA_DOC_FIND_SIZE                       = "1000";

  static private String PROTOCOLLO_IN                             = "ENTRATA";
  static private String PROTOCOLLO_OUT                            = "USCITA";
  static private String PROTOCOLLO_INT                            = "INTERNO";

  static private String PROTO_BATCH_PROTOCOLLATO                  = "2";
  static private String PROTO_BATCH_PROTOCOLLATO_CON_SEGNALAZIONI = "3";

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

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (LapisOperaUtilityControllo.ctrProtocolloInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {

        // URL del protocollo
        String lapis_protocollo_url = InitialContext.doLookup(LAPIS_PROTOCOLLO_URL);
        if (lapis_protocollo_url == null || (lapis_protocollo_url != null && "".equals(lapis_protocollo_url.trim()))) {
          throw new Exception(LAPIS_PROTOCOLLO_URL_NOT_DEFINED);
        }

        // Codice applicativo
        String lapis_codice_applicativo = InitialContext.doLookup(LAPIS_CODICE_APPLICATIVO);
        if (lapis_codice_applicativo == null || (lapis_codice_applicativo != null && "".equals(lapis_codice_applicativo.trim()))) {
          throw new Exception(LAPIS_CODICE_APPLICATIVO_NOT_DEFINED);
        }

        String richiestaXML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
        richiestaXML += "<richiesta cod_applicativo=\"" + conversioneCaratteriXML(lapis_codice_applicativo) + "\">";

        // Operatore: l'operatore sembra una sigla, per esempio "laura-franco",
        // si
        // utilizza solo il WSDMLoginAttrType.Cognome, senza spezzare
        // l'informazione
        // nei due attributi "nome" e "cognome"
        if (loginAttr != null) {
          if (loginAttr.getCognome() != null) {
            richiestaXML += "<Operatore>" + conversioneCaratteriXML(loginAttr.getCognome()) + "</Operatore>";
          }
        }

        // IDC (Classifica)
        if (wsdmprotocolloDocumentoIn.getClassifica() != null) {
          richiestaXML += "<IDC>" + conversioneCaratteriXML(wsdmprotocolloDocumentoIn.getClassifica()) + "</IDC>";
        }

        // Codice del fascicolo, si tratta sempre di associazione a fascicolo
        // esistente
        if (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
          if (wsdmprotocolloDocumentoIn.getFascicolo() != null) {
            WSDMFascicolo fascicolo = wsdmprotocolloDocumentoIn.getFascicolo();
            if (fascicolo.getCodiceFascicolo() != null) {
              // Qui di utilizza il codice IEFASCICOLO
              // TODO: chiarire se Appalti e Portali Appalti passano il codice
              // "nRecord" o il codice "IEFascicolo".
              richiestaXML += "<IEFASCICOLO>" + conversioneCaratteriXML(fascicolo.getCodiceFascicolo()) + "</IEFASCICOLO>";
            }
          }
        }

        // Oggetto
        if (wsdmprotocolloDocumentoIn.getOggetto() != null) {
          richiestaXML += "<Oggetto>" + conversioneCaratteriXML(wsdmprotocolloDocumentoIn.getOggetto()) + "</Oggetto>";
        }

        if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {

          // Tipo documento
          // E' possibile indicare solo "FATTURA". Il dato non e' obbligatorio
          // ma
          // se
          // non e' indicato l'operazione ProtoBatchLog restituisce "Errore -
          // nessun tipologia documentale definita"
          // richiestaXML += "<TipoDocumento>FATTURA</TipoDocumento>";

          // Mittente (uno solo) per il protocollo in arrivo/ingresso
          if (wsdmprotocolloDocumentoIn.getMittenti() != null) {
            WSDMProtocolloAnagrafica[] wsdmmittenti = wsdmprotocolloDocumentoIn.getMittenti();
            if (wsdmmittenti != null && wsdmmittenti.length > 0) {
              richiestaXML += "<Mittente>";

              // Nominativo
              String nominativo = conversioneCaratteriXML(wsdmmittenti[0].getCognomeointestazione());
              if (wsdmmittenti[0].getNome() != null) {
                nominativo += " " + conversioneCaratteriXML(wsdmmittenti[0].getNome());
              }

              richiestaXML += "<Nominativo>" + nominativo + "</Nominativo>";

              // Indirizzo
              if (wsdmmittenti[0].getIndirizzoResidenza() != null) {
                String indirizzoResidenza = wsdmmittenti[0].getIndirizzoResidenza();
                if (wsdmmittenti[0].getNumeroCivicoResidenza() != null) {
                  indirizzoResidenza += " " + wsdmmittenti[0].getNumeroCivicoResidenza();
                }
                richiestaXML += "<Indirizzo>" + conversioneCaratteriXML(indirizzoResidenza) + "</Indirizzo>";
              }

              // CAP
              if (wsdmmittenti[0].getCapResidenza() != null) {
                richiestaXML += "<Cap>" + conversioneCaratteriXML(wsdmmittenti[0].getCapResidenza()) + "</Cap>";
              }

              // Citta'
              if (wsdmmittenti[0].getComuneResidenza() != null) {
                richiestaXML += "<Citta>" + conversioneCaratteriXML(wsdmmittenti[0].getComuneResidenza()) + "</Citta>";
              }

              // Provincia
              if (wsdmmittenti[0].getProvinciaResidenza() != null) {
                richiestaXML += "<Provincia>" + conversioneCaratteriXML(wsdmmittenti[0].getProvinciaResidenza()) + "</Provincia>";
              }

              // EMail PEC
              if (wsdmmittenti[0].getEmail() != null) {
                richiestaXML += "<PEC>" + conversioneCaratteriXML(wsdmmittenti[0].getEmail()) + "</PEC>";
              }

              // FAX
              if (wsdmmittenti[0].getFax() != null) {
                richiestaXML += "<FAX>" + conversioneCaratteriXML(wsdmmittenti[0].getFax()) + "</FAX>";
              }

              richiestaXML += "</Mittente>";
            }

            // Codice del destinatario (Struttura) per il protocollo in
            // arrivo/ingresso
            if (wsdmprotocolloDocumentoIn.getStruttura() != null) {
              // <Cod_Destinatario
              // data_arrivo="2022-10-05T06:45:37">88.00.11.01.00</Cod_Destinatario>
              SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
              String data_arrivo = f.format(new Date());

              richiestaXML += "<Destinatari>";
              richiestaXML += "<Cod_Destinatario data_arrivo=\""
                  + data_arrivo
                  + "\">"
                  + conversioneCaratteriXML(wsdmprotocolloDocumentoIn.getStruttura())
                  + "</Cod_Destinatario>";
              richiestaXML += "</Destinatari>";
            }

          }

        } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {

          // Codice del mittente (Struttura) per il protocollo in
          // uscita/partenza
          if (wsdmprotocolloDocumentoIn.getStruttura() != null) {
            richiestaXML += "<Cod_Mittente>" + conversioneCaratteriXML(wsdmprotocolloDocumentoIn.getStruttura()) + "</Cod_Mittente>";
          }

          // Tipo documento
          // E' possibile indicare solo "FATTURA". Il dato non e' obbligatorio
          // ma
          // se
          // non e' indicato l'operazione ProtoBatchLog restituisce "Errore -
          // nessun tipologia documentale definita"
          // richiestaXML += "<TipoDocumento>RIFIUTO FATTURA</TipoDocumento>";

          // Destinatari per il protocollo in uscita/partenza
          if (wsdmprotocolloDocumentoIn.getDestinatari() != null) {
            WSDMProtocolloAnagrafica[] wsdmdestinatari = wsdmprotocolloDocumentoIn.getDestinatari();
            if (wsdmdestinatari != null && wsdmdestinatari.length > 0) {
              richiestaXML += "<Destinatari>";
              for (int d = 0; d < wsdmdestinatari.length; d++) {
                richiestaXML += "<Destinatario tipo_vettore=\"\">";

                // Nominativo
                String nominativo = conversioneCaratteriXML(wsdmdestinatari[d].getCognomeointestazione());
                if (wsdmdestinatari[d].getNome() != null) {
                  nominativo += " " + conversioneCaratteriXML(wsdmdestinatari[d].getNome());
                }

                richiestaXML += "<Nominativo>" + nominativo + "</Nominativo>";

                // Indirizzo
                if (wsdmdestinatari[d].getIndirizzoResidenza() != null) {
                  String indirizzoResidenza = wsdmdestinatari[d].getIndirizzoResidenza();
                  if (wsdmdestinatari[d].getNumeroCivicoResidenza() != null) {
                    indirizzoResidenza += " " + wsdmdestinatari[d].getNumeroCivicoResidenza();
                  }
                  richiestaXML += "<Indirizzo>" + conversioneCaratteriXML(indirizzoResidenza) + "</Indirizzo>";
                }

                // CAP
                if (wsdmdestinatari[d].getCapResidenza() != null) {
                  richiestaXML += "<Cap>" + conversioneCaratteriXML(wsdmdestinatari[d].getCapResidenza()) + "</Cap>";
                }

                // Citta'
                if (wsdmdestinatari[d].getComuneResidenza() != null) {
                  richiestaXML += "<Citta>" + conversioneCaratteriXML(wsdmdestinatari[d].getComuneResidenza()) + "</Citta>";
                }

                // Provincia
                if (wsdmdestinatari[d].getProvinciaResidenza() != null) {
                  richiestaXML += "<Provincia>" + conversioneCaratteriXML(wsdmdestinatari[d].getProvinciaResidenza()) + "</Provincia>";
                }

                // EMail PEC
                if (wsdmdestinatari[d].getEmail() != null) {
                  richiestaXML += "<PEC>" + conversioneCaratteriXML(wsdmdestinatari[d].getEmail()) + "</PEC>";
                }

                // FAX
                if (wsdmdestinatari[d].getFax() != null) {
                  richiestaXML += "<FAX>" + conversioneCaratteriXML(wsdmdestinatari[d].getFax()) + "</FAX>";
                }

                richiestaXML += "</Destinatario>";
              }
              richiestaXML += "</Destinatari>";
            }
          }
        }

        // Allegati, il primo documento e' il documento principale
        if (wsdmprotocolloDocumentoIn.getAllegati() != null) {
          WSDMProtocolloAllegato[] wsdmallegati = wsdmprotocolloDocumentoIn.getAllegati();

          if (wsdmallegati != null && wsdmallegati.length > 0) {
            // Documento principale
            richiestaXML += "<Documento_Principale>";
            richiestaXML += "<Files>";
            richiestaXML += "<Documento Nome=\"" + conversioneCaratteriXML(wsdmallegati[0].getNome()) + "\">";
            byte[] _bdp = wsdmallegati[0].getContenuto();
            richiestaXML += "<Content>" + Base64.encode(_bdp) + "</Content>";
            richiestaXML += "</Documento>";
            richiestaXML += "</Files>";
            richiestaXML += "</Documento_Principale>";

            // Allegati
            if (wsdmallegati.length > 1) {
              richiestaXML += "<Allegati>";
              richiestaXML += "<Files>";
              for (int a = 1; a < wsdmallegati.length; a++) {
                richiestaXML += "<Documento Nome=\"" + conversioneCaratteriXML(wsdmallegati[a].getNome()) + "\">";
                byte[] _bal = wsdmallegati[a].getContenuto();
                richiestaXML += "<Content>" + Base64.encode(_bal) + "</Content>";
                richiestaXML += "</Documento>";
              }
              richiestaXML += "</Files>";
              richiestaXML += "</Allegati>";
            }
          }

        }

        richiestaXML += "</richiesta>";

        LapisWebSOAPServiceLocator locator = new LapisWebSOAPServiceLocator();
        LapisWebSOAPType service = locator.getLapisWebSOAPPort(new URL(lapis_protocollo_url));
        String id_proto_batch = service.protoBatch(richiestaXML);

        WSDMProtocolloDocumento wsdmprotocollodocumento = new WSDMProtocolloDocumento();
        wsdmprotocollodocumento.setGenericS11(id_proto_batch);

        wsdmprotocolloDocumentoRes.setEsito(true);
        wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmprotocollodocumento);
      } else {
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
      }
    } catch (Exception e) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(e.getMessage());
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
    StringBuffer messaggioCtr = new StringBuffer();

    if (LapisOperaUtilityControllo.ctrProtocolloLeggi(loginAttr, annoProtocollo, numeroProtocollo, messaggioCtr)) {
      String nRecord = _operaProtocolloRicerca(username, password, annoProtocollo, numeroProtocollo);
      if (nRecord != null) {
        wsdmprotocolloDocumentoRes = _operaDocumentoLeggi(username, password, nRecord);
      } else {
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio("Protocollo non trovato");
      }
    } else {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
    }

    return wsdmprotocolloDocumentoRes;
  }

  @Override
  public WSDMProtocolloDocumentoRes _documentoInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {

    WSDMProtocolloDocumentoRes wsdmProtocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    StringBuffer messaggioCtr = new StringBuffer();

    HttpURLConnection connection = null;

    try {

      if (LapisOperaUtilityControllo.ctrDocumentoInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {

        String bearer = _operaLogin(username, password);

        URL url = new URL(getOperaURL() + "/api/doc-console/create");
        connection = (HttpURLConnection) url.openConnection();
        connection.setDoInput(true);
        connection.setDoOutput(true);
        connection.setUseCaches(false);
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Connection", "Keep-Alive");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("Authorization", bearer);

        JSONObject jsonInput = new JSONObject();

        // Data creazione
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        String dataCreazione = f.format(new Date());
        jsonInput.put("dataCreazione", dataCreazione);

        // Tipo documento: valore DOCUMENTO
        jsonInput.put("tipodoc", "DOCUMENTO");

        if (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
          if (wsdmprotocolloDocumentoIn.getFascicolo() != null) {
            WSDMFascicolo fascicolo = wsdmprotocolloDocumentoIn.getFascicolo();
            if (fascicolo.getCodiceFascicolo() != null) {
              JSONArray jsonArrayFascicoli = new JSONArray();
              JSONObject jsonFascicolo = new JSONObject();
              jsonFascicolo.put("ieFascicolo", fascicolo.getCodiceFascicolo());
              jsonArrayFascicoli.put(jsonFascicolo);
              jsonInput.put("fascicoli", jsonArrayFascicoli);
            }
          }
        }

        // Oggetto
        JSONObject jsonMetaDocumento = new JSONObject();
        if (wsdmprotocolloDocumentoIn.getOggetto() != null) {
          jsonMetaDocumento.put("oggettoDocumento", wsdmprotocolloDocumentoIn.getOggetto());
        }
        jsonInput.put("metaDocumento", jsonMetaDocumento);

        // Accessi
        JSONArray jsonArrayAccessi = new JSONArray();
        JSONObject jsonAccesso = new JSONObject();
        jsonAccesso.put("codUtente", loginAttr.getCognome());
        jsonAccesso.put("descrizioneUtente", loginAttr.getCognome());
        if (wsdmprotocolloDocumentoIn.getStruttura() != null) {
          jsonAccesso.put("codUfficio", wsdmprotocolloDocumentoIn.getStruttura());
        }
        jsonAccesso.put("tipo", "OWNER");
        jsonAccesso.put("own", true);
        jsonAccesso.put("codCreatoDa", loginAttr.getCognome());
        jsonAccesso.put("personaUfficioScarto", loginAttr.getCognome());
        jsonAccesso.put("uffScarto", loginAttr.getCognome());
        jsonAccesso.put("loginScarto", loginAttr.getCognome());
        jsonAccesso.put("firmatario", loginAttr.getCognome());
        jsonArrayAccessi.put(jsonAccesso);
        jsonInput.put("accessi", jsonArrayAccessi);

        // Classe
        jsonInput.put("_class", "it.tredi.opera.entity.console.DocumentoConsole");

        if (logger.isDebugEnabled()) {
          logger.debug("URL: " + url.toString());
          logger.debug("jsonInput: " + jsonInput.toString());
        }

        DataOutputStream output = new DataOutputStream(connection.getOutputStream());
        output.write(jsonInput.toString().getBytes("UTF-8"));
        output.flush();

        // Risposta
        int httpStatus = connection.getResponseCode();
        if (logger.isDebugEnabled()) logger.debug("responseCode: " + httpStatus);
        if (httpStatus == 200) {
          String res = getInputStream(connection);
          if (logger.isDebugEnabled()) logger.debug("getInputStream: " + res);

          // nRecord
          JSONObject jsonOutput = new JSONObject(res);
          if (jsonOutput.has("nRecord")) {

            String nRecord = jsonOutput.getString("nRecord");

            WSDMProtocolloDocumento wsdmProtocolloDocumento = new WSDMProtocolloDocumento();
            wsdmProtocolloDocumento.setNumeroDocumento(nRecord);
            wsdmProtocolloDocumentoRes.setProtocolloDocumento(wsdmProtocolloDocumento);

            // Allegati
            if (wsdmprotocolloDocumentoIn.getAllegati() != null) {
              WSDMProtocolloAllegato[] wsdmallegati = wsdmprotocolloDocumentoIn.getAllegati();
              if (wsdmallegati != null && wsdmallegati.length > 0) {
                for (int al = 0; al < wsdmallegati.length; al++) {
                  _operaUploadAllegato(nRecord, bearer, wsdmallegati[al].getNome(), wsdmallegati[al].getContenuto());
                }
              }
            }
          }

          wsdmProtocolloDocumentoRes.setEsito(true);

        } else {
          String res = getErrorStream(connection);
          if (logger.isDebugEnabled()) logger.debug("getErrorStream: " + res);
          wsdmProtocolloDocumentoRes.setEsito(false);
          wsdmProtocolloDocumentoRes.setMessaggio(res);
        }
      } else {
        wsdmProtocolloDocumentoRes.setEsito(false);
        wsdmProtocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (Exception e) {
      wsdmProtocolloDocumentoRes.setEsito(false);
      wsdmProtocolloDocumentoRes.setMessaggio(e.getMessage());
      logger.error("Errore", e);
    } finally {
      try {
        if (connection != null) {
          connection.disconnect();
        }
      } catch (Throwable t) {

      }
    }

    return wsdmProtocolloDocumentoRes;
  }

  @Override
  public WSDMProtocolloDocumentoRes _documentoLeggi(String username, String password, WSDMLoginAttr loginAttr, String numeroDocumento) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    StringBuffer messaggioCtr = new StringBuffer();
    if (LapisOperaUtilityControllo.ctrDocumentoLeggi(loginAttr, numeroDocumento, messaggioCtr)) {
      wsdmprotocolloDocumentoRes = _operaDocumentoLeggi(username, password, numeroDocumento);
    } else {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
    }
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
    StringBuffer messaggioCtr = new StringBuffer();
    if (LapisOperaUtilityControllo.ctrDocumentoLeggi(loginAttr, numeroDocumento, messaggioCtr)) {
      wsdmprotocolloDocumentoRes = _operaDocumentoLeggi(username, password, numeroDocumento);
    } else {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
    }
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
    WSDMFascicoloRes wsdmfascicoloRes = new WSDMFascicoloRes();
    StringBuffer messaggioCtr = new StringBuffer();
    if (LapisOperaUtilityControllo.ctrFascicoloLeggi(loginAttr, codiceFascicolo, annoFascicolo, numeroFascicolo, messaggioCtr)) {
      wsdmfascicoloRes = _operaFascicoloGestioneLeggiRicerca(username, password, loginAttr, codiceFascicolo, classificaFascicolo,
          oggettoFascicolo, true);
    } else {
      wsdmfascicoloRes.setEsito(false);
      wsdmfascicoloRes.setMessaggio(messaggioCtr.toString());
    }
    return wsdmfascicoloRes;
  }

  /**
   * Lettura del fascicolo con ricerca preliminare. Il codiceFascicolo e' il
   * valore di "ieFascicolo". Per l'interrogazione "puntuale" del fascicolo
   * bisogna prima ricavare il valore di "nRecord" dalla ricerca.
   * 
   * @param username
   * @param password
   * @param loginAttr
   * @param codiceFascicolo
   * @param classificaFascicolo
   * @param oggettoFascicolo
   * @param leggiDocumenti
   * @return
   */
  private WSDMFascicoloRes _operaFascicoloGestioneLeggiRicerca(String username, String password, WSDMLoginAttr loginAttr,
      String codiceFascicolo, String classificaFascicolo, String oggettoFascicolo, boolean leggiDocumenti) {

    WSDMFascicoloRes wsdmFascicoloRes = new WSDMFascicoloRes();

    if (codiceFascicolo != null && !"".equals(codiceFascicolo.trim())) {

      // Il codice inviato dai client e' il valore di "ieFascicolo".
      // Deve essere effettuata una ricerca con l'operazione "find" ed dal primo
      // elemento della ricerca si estrae "nRecord" che poi deve essere inviato
      // all'operazione di lettura puntuale del fascicolo
      WSDMRicercaFascicolo wsdmRicercaFascicolo = new WSDMRicercaFascicolo();
      wsdmRicercaFascicolo.setCodiceFascicolo(codiceFascicolo);
      WSDMRicercaFascicoloRes wsdmRicercaFascicoloRes = _fascicoloRicerca(username, password, loginAttr, wsdmRicercaFascicolo);
      if (wsdmRicercaFascicoloRes.isEsito()) {
        WSDMFascicolo[] listaFascicoli = wsdmRicercaFascicoloRes.getFascicoli();
        if (listaFascicoli != null && listaFascicoli.length > 0) {
          String ieFascicolo = listaFascicoli[0].getCodiceFascicolo();
          String nRecord = listaFascicoli[0].getGenericS11();
          wsdmFascicoloRes = _operaFascicoloLeggi(username, password, ieFascicolo, nRecord, leggiDocumenti);
        }
      } else {
        wsdmFascicoloRes.setEsito(false);
        wsdmFascicoloRes.setMessaggio(wsdmRicercaFascicoloRes.getMessaggio());
      }
    }

    return wsdmFascicoloRes;
  }

  /**
   * Lettura del fascicolo. Vengono passati i valore di "ieFascicolo"
   * (utilizzato per la ricerca dei documenti contenuti nel fascicolo) e
   * "nRecord" per la lettura puntuale dei metadati del fascicolo.
   * 
   * @param username
   * @param password
   * @param ieFascicolo
   * @param nRecord
   * @param leggiDocumenti
   * @return
   */
  private WSDMFascicoloRes _operaFascicoloLeggi(String username, String password, String ieFascicolo, String nRecord,
      boolean leggiDocumenti) {

    WSDMFascicoloRes wsdmFascicoloRes = new WSDMFascicoloRes();

    HttpURLConnection connection = null;

    try {

      String bearer = _operaLogin(username, password);

      URL url = new URL(getOperaURL() + "/api/fascicolo/" + nRecord);
      connection = (HttpURLConnection) url.openConnection();
      connection.setDoInput(true);
      connection.setDoOutput(true);
      connection.setUseCaches(false);
      connection.setRequestMethod("GET");
      connection.setRequestProperty("Connection", "Keep-Alive");
      connection.setRequestProperty("Content-Type", "application/json");
      connection.setRequestProperty("Authorization", bearer);

      if (logger.isDebugEnabled()) {
        logger.debug("URL: " + url.toString());
      }

      // Risposta
      int httpStatus = connection.getResponseCode();
      if (logger.isDebugEnabled()) logger.debug("responseCode: " + httpStatus);
      if (httpStatus == 200) {
        String res = getInputStream(connection);
        if (logger.isDebugEnabled()) logger.debug("getInputStream: " + res);

        // Lettura informazioni del fascicolo
        JSONObject jsonOutput = new JSONObject(res);

        WSDMFascicolo fascicolo = new WSDMFascicolo();
        fascicolo.setCodiceFascicolo(ieFascicolo);
        fascicolo.setGenericS11(nRecord);

        // Anno del fascicolo
        try {
          if (jsonOutput.has("anno")) {
            if (!jsonOutput.isNull("anno")) {
              fascicolo.setAnnoFascicolo(new Long(jsonOutput.getLong("anno")));
            }
          }
        } catch (Exception e) {

        }

        // Numero del fascicolo
        try {
          if (jsonOutput.has("numero")) {
            if (!jsonOutput.isNull("numero")) {
              fascicolo.setNumeroFascicolo(String.valueOf(jsonOutput.getLong("numero")));
            }
          }
        } catch (Exception e) {

        }

        // Classifica
        if (jsonOutput.has("idc")) {
          JSONObject jsonClassifica = jsonOutput.getJSONObject("idc");
          if (!jsonClassifica.isEmpty()) {
            if (jsonClassifica.has("cod") && !jsonClassifica.isNull("cod")) {
              fascicolo.setClassificaFascicolo(jsonClassifica.getString("cod"));
            }
            if (jsonClassifica.has("descrizione") && !jsonClassifica.isNull("descrizione")) {
              fascicolo.setClassificaFascicoloDescrizione(jsonClassifica.getString("descrizione"));
            }
          }
        }

        // Struttura
        if (jsonOutput.has("struttura") && !jsonOutput.isNull("struttura")) {
          fascicolo.setStruttura(jsonOutput.getString("struttura"));
        }

        // Oggetto
        if (jsonOutput.has("oggetto") && !jsonOutput.isNull("oggetto")) {
          fascicolo.setOggettoFascicolo(jsonOutput.getString("oggetto"));
        }

        // Data fascicolo
        try {
          if (jsonOutput.has("dataCreazione") && !jsonOutput.isNull("dataCreazione")) {
            String dataCreazione = jsonOutput.getString("dataCreazione");
            Date dataFascicolo = new SimpleDateFormat("yyyy-MM-dd").parse(dataCreazione);
            fascicolo.setDataFascicolo(dataFascicolo);
          }
        } catch (Exception e) {

        }

        // Tipo documento
        if (jsonOutput.has("tipoDoc") && !jsonOutput.isNull("tipoDoc")) {
          fascicolo.setTipo(jsonOutput.getString("tipoDoc"));
        }

        // Identificativo gara
        if (jsonOutput.has("identificativoGara") && !jsonOutput.isNull("identificativoGara")) {
          fascicolo.setIdentificativoGara(jsonOutput.getString("identificativoGara"));
        }

        // CIG
        if (jsonOutput.has("cig") && !jsonOutput.isNull("cig")) {
          fascicolo.setCig(jsonOutput.getString("cig"));
        }

        // Ricerca dei documenti associati al fascicolo
        // Per la ricerca e' necessario essere in possesso del numero
        // IEFascicolo
        if (leggiDocumenti) {
          WSDMFascicoloDocumento[] fascicoloDocumenti = _operaFascicoloLeggiDocumenti(username, password, bearer, ieFascicolo);
          fascicolo.setDocumenti(fascicoloDocumenti);
        }

        wsdmFascicoloRes.setEsito(true);
        wsdmFascicoloRes.setFascicolo(fascicolo);

      } else {
        String res = getErrorStream(connection);
        if (logger.isDebugEnabled()) logger.debug("getErrorStream: " + res);

        // Lettura della risposta di errore. Se nella risposta esiste l'elemento
        // "message" con il valore "docNotFound" si restituisce il messaggio
        // semplice di "Fascicolo non trovato". In tutti gli altri casi si
        // restituisce la tracciatura di errore completa.
        JSONObject jsonOutput = new JSONObject(res);
        if (jsonOutput.has("message") && "docNotFound".equals(jsonOutput.getString("message"))) {
          wsdmFascicoloRes.setEsito(true);
          wsdmFascicoloRes.setMessaggio("Fascicolo non trovato");
        } else {
          throw new Exception(res);
        }
      }

    } catch (Exception e) {
      wsdmFascicoloRes.setEsito(false);
      wsdmFascicoloRes.setMessaggio(e.getMessage());
      logger.error("Errore", e);
    } finally {
      try {
        if (connection != null) {
          connection.disconnect();
        }
      } catch (Throwable t) {

      }
    }

    return wsdmFascicoloRes;
  }

  /**
   * Lettura del documento sulla base del valore "nRecord".
   * 
   * @param username
   * @param password
   * @param nRecord
   * @param leggiDocumenti
   * @return
   */
  private WSDMProtocolloDocumentoRes _operaDocumentoLeggi(String username, String password, String nRecord) {

    WSDMProtocolloDocumentoRes wsdmProtocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    HttpURLConnection connection = null;

    try {

      String bearer = _operaLogin(username, password);

      URL url = new URL(getOperaURL() + "/api/doc/" + nRecord);
      connection = (HttpURLConnection) url.openConnection();
      connection.setDoInput(true);
      connection.setDoOutput(true);
      connection.setUseCaches(false);
      connection.setRequestMethod("GET");
      connection.setRequestProperty("Connection", "Keep-Alive");
      connection.setRequestProperty("Content-Type", "application/json");
      connection.setRequestProperty("Authorization", bearer);

      if (logger.isDebugEnabled()) {
        logger.debug("URL: " + url.toString());
      }

      // Risposta
      int httpStatus = connection.getResponseCode();
      if (logger.isDebugEnabled()) logger.debug("responseCode: " + httpStatus);
      if (httpStatus == 200) {
        String res = getInputStream(connection);
        if (logger.isDebugEnabled()) logger.debug("getInputStream: " + res);

        WSDMProtocolloDocumento wsdmProtocolloDocumento = new WSDMProtocolloDocumento();
        wsdmProtocolloDocumento.setNumeroDocumento(nRecord);

        // Lettura informazioni del fascicolo
        JSONObject jsonOutput = new JSONObject(res);

        // Se esiste l'oggetto "metaDocumento" si tratta di un documento
        // semplice
        if (jsonOutput.has("metaDocumento") && !jsonOutput.isNull("metaDocumento")) {
          JSONObject jsonMetaDocumento = jsonOutput.getJSONObject("metaDocumento");

          // Oggetto
          if (jsonMetaDocumento.has("oggettoDocumento") && !jsonMetaDocumento.isNull("oggettoDocumento")) {
            wsdmProtocolloDocumento.setOggetto(jsonMetaDocumento.getString("oggettoDocumento"));
          }
          wsdmProtocolloDocumento.setInout(WSDMProtocolloInOut.INT);

        }

        // Se esiste l'oggetto "metaProtocollo" si tratta di un protocollo
        if (jsonOutput.has("metaProtocollo") && !jsonOutput.isNull("metaProtocollo")) {
          JSONObject jsonMetaProtocollo = jsonOutput.getJSONObject("metaProtocollo");

          // Oggetto
          if (jsonMetaProtocollo.has("oggettoProtocollo") && !jsonMetaProtocollo.isNull("oggettoProtocollo")) {
            wsdmProtocolloDocumento.setOggetto(jsonMetaProtocollo.getString("oggettoProtocollo"));
          }

          // Numero protocollo
          if (jsonMetaProtocollo.has("numero") && !jsonMetaProtocollo.isNull("numero")) {
            wsdmProtocolloDocumento.setNumeroProtocollo(jsonMetaProtocollo.getString("numero"));
          }

          // Data e anno protocollo
          try {
            if (jsonMetaProtocollo.has("data") && !jsonMetaProtocollo.isNull("data")) {
              Date dataProtocollo = new SimpleDateFormat("yyyy-MM-dd").parse(jsonMetaProtocollo.getString("data"));
              wsdmProtocolloDocumento.setDataProtocollo(dataProtocollo);
              wsdmProtocolloDocumento.setAnnoProtocollo(new Long(dataProtocollo.getYear() + 1900));
            }
          } catch (Exception e) {

          }

          // Gestione del verso
          String tipoProtocollo = null;
          if (jsonMetaProtocollo.has("tipo") && !jsonMetaProtocollo.isNull("tipo")) {
            tipoProtocollo = jsonMetaProtocollo.getString("tipo");
            if (PROTOCOLLO_INT.equals(tipoProtocollo)) {
              wsdmProtocolloDocumento.setInout(WSDMProtocolloInOut.INT);
            } else if (PROTOCOLLO_IN.equals(tipoProtocollo)) {
              wsdmProtocolloDocumento.setInout(WSDMProtocolloInOut.IN);
            } else if (PROTOCOLLO_OUT.equals(tipoProtocollo)) {
              wsdmProtocolloDocumento.setInout(WSDMProtocolloInOut.OUT);
            } else {
              wsdmProtocolloDocumento.setInout(WSDMProtocolloInOut.INT);
            }
          }

          // Soggetti esterni mittenti o destinatari

          if (jsonMetaProtocollo.has("soggettiEsterni") && !jsonMetaProtocollo.isNull("soggettiEsterni")) {
            JSONArray listaSoggettiEsterni = jsonMetaProtocollo.getJSONArray("soggettiEsterni");
            if (listaSoggettiEsterni != null && listaSoggettiEsterni.length() > 0) {
              WSDMProtocolloAnagrafica[] mittentiODestinatari = new WSDMProtocolloAnagrafica[listaSoggettiEsterni.length()];
              for (int m = 0; m < listaSoggettiEsterni.length(); m++) {
                mittentiODestinatari[m] = new WSDMProtocolloAnagrafica();
                if (!"null".equals(listaSoggettiEsterni.get(m).toString())) {
                  JSONObject soggettoEsterno = listaSoggettiEsterni.getJSONObject(m);
                  if (soggettoEsterno.has("anagrafica")) {
                    JSONObject anagrafica = soggettoEsterno.getJSONObject("anagrafica");

                    // Codice fiscale
                    if (anagrafica.has("codiceFiscale") && !anagrafica.isNull("codiceFiscale")) {
                      mittentiODestinatari[m].setCodiceFiscale(anagrafica.getString("codiceFiscale"));
                    }

                    // Ragione sociale
                    if (anagrafica.has("ragioneSociale") && !anagrafica.isNull("ragioneSociale")) {
                      mittentiODestinatari[m].setCognomeointestazione(anagrafica.getString("ragioneSociale"));
                    }

                    if (anagrafica.has("indirizzoProt") && !anagrafica.isNull("indirizzoProt")) {
                      JSONObject indirizzoProt = anagrafica.getJSONObject("indirizzoProt");

                      // CAP
                      if (indirizzoProt.has("cap") && !indirizzoProt.isNull("cap")) {
                        mittentiODestinatari[m].setCapResidenza(indirizzoProt.getString("cap"));
                      }

                      // Citta'
                      if (indirizzoProt.has("citta") && !indirizzoProt.isNull("citta")) {
                        mittentiODestinatari[m].setCodiceComuneResidenza(indirizzoProt.getString("citta"));
                      }

                      // Provincia
                      if (indirizzoProt.has("provincia") && !indirizzoProt.isNull("provincia")) {
                        mittentiODestinatari[m].setProvinciaResidenza(indirizzoProt.getString("provincia"));
                      }

                      // Email
                      if (indirizzoProt.has("email") && !indirizzoProt.isNull("email")) {
                        mittentiODestinatari[m].setEmail(indirizzoProt.getString("email"));
                      }

                      // Telefono
                      if (indirizzoProt.has("tel") && !indirizzoProt.isNull("tel")) {
                        mittentiODestinatari[m].setTelefono(indirizzoProt.getString("tel"));
                      }

                      // Via
                      if (indirizzoProt.has("via") && !indirizzoProt.isNull("via")) {
                        mittentiODestinatari[m].setIndirizzoResidenza(indirizzoProt.getString("via"));
                      }
                    }
                  }
                }

                if (PROTOCOLLO_IN.equals(tipoProtocollo)) {
                  wsdmProtocolloDocumento.setMittenti(mittentiODestinatari);
                } else if (PROTOCOLLO_OUT.equals(tipoProtocollo)) {
                  wsdmProtocolloDocumento.setDestinatari(mittentiODestinatari);
                }
              }
            }
          }

        }

        // Allegato principale
        if (jsonOutput.has("allegatoPrincipale") || jsonOutput.has("allegati")) {
          int numeroallegatiPrincipali = 0;
          int numeroTotaleAllegati = 0;

          // Verifica esistenza allegato principale
          if (jsonOutput.has("allegatoPrincipale")) {
            numeroallegatiPrincipali++;
            numeroTotaleAllegati++;
          }

          // Verifica esistenza altri allegati
          if (jsonOutput.has("allegati")) {
            JSONArray altriAllegati = jsonOutput.getJSONArray("allegati");
            if (altriAllegati != null && altriAllegati.length() > 0) {
              numeroTotaleAllegati = numeroTotaleAllegati + altriAllegati.length();
            }
          }

          // Struttura con il numero totale allegati, il primo (indice 0) e' per
          // l'allegato principale
          WSDMProtocolloAllegato[] wsdmAllegati = new WSDMProtocolloAllegato[numeroTotaleAllegati];

          // Allegato principale
          if (jsonOutput.has("allegatoPrincipale")) {
            JSONObject allegatoPrincipale = jsonOutput.getJSONObject("allegatoPrincipale");
            if (allegatoPrincipale.has("fileVersionInfoId")
                && allegatoPrincipale.has("file")
                && !allegatoPrincipale.isNull("fileVersionInfoId")
                && !allegatoPrincipale.isNull("file")) {
              String storageId = allegatoPrincipale.getString("fileVersionInfoId");
              JSONObject file = allegatoPrincipale.getJSONObject("file");
              if (file.has("nome") && !file.isNull("nome")) {
                wsdmAllegati[0] = new WSDMProtocolloAllegato();
                wsdmAllegati[0].setNome(file.getString("nome"));
                byte[] contenuto = _operaDownloadAllegato(nRecord, bearer, storageId);
                if (contenuto != null) {
                  wsdmAllegati[0].setContenuto(contenuto);
                }
              }
            }
          }

          // Altri allegati
          if (jsonOutput.has("allegati")) {
            JSONArray altriAllegati = jsonOutput.getJSONArray("allegati");
            if (altriAllegati != null && altriAllegati.length() > 0) {
              for (int al = 0; al < altriAllegati.length(); al++) {
                if (!"null".equals(altriAllegati.get(al).toString())) {
                  JSONObject altroAllegato = altriAllegati.getJSONObject(al);
                  if (altroAllegato.has("fileVersionInfoId")
                      && altroAllegato.has("file")
                      && !altroAllegato.isNull("fileVersionInfoId")
                      && !altroAllegato.isNull("file")) {
                    String storageId = altroAllegato.getString("fileVersionInfoId");
                    JSONObject file = altroAllegato.getJSONObject("file");
                    if (file.has("nome") && !file.isNull("nome")) {
                      wsdmAllegati[al + numeroallegatiPrincipali] = new WSDMProtocolloAllegato();
                      wsdmAllegati[al + numeroallegatiPrincipali].setNome(file.getString("nome"));
                      byte[] contenuto = _operaDownloadAllegato(nRecord, bearer, storageId);
                      if (contenuto != null) {
                        wsdmAllegati[al + numeroallegatiPrincipali].setContenuto(contenuto);
                      }
                    }
                  }
                }
              }
            }
          }

          wsdmProtocolloDocumento.setAllegati(wsdmAllegati);
        }

        wsdmProtocolloDocumentoRes.setEsito(true);
        wsdmProtocolloDocumentoRes.setProtocolloDocumento(wsdmProtocolloDocumento);

      } else {
        String res = getErrorStream(connection);
        if (logger.isDebugEnabled()) logger.debug("getErrorStream: " + res);

        // Lettura della risposta di errore. Se nella risposta esiste l'elemento
        // "message" con il valore "docNotFound" si restituisce il messaggio
        // semplice di "Fascicolo non trovato". In tutti gli altri casi si
        // restituisce la tracciatura di errore completa.
        JSONObject jsonOutput = new JSONObject(res);
        if (jsonOutput.has("message") && "docNotFoundNrecord".equals(jsonOutput.getString("message"))) {
          wsdmProtocolloDocumentoRes.setEsito(true);
          wsdmProtocolloDocumentoRes.setMessaggio("Documento non trovato");
        } else {
          throw new Exception(res);
        }

      }

    } catch (Exception e) {
      wsdmProtocolloDocumentoRes.setEsito(false);
      wsdmProtocolloDocumentoRes.setMessaggio(e.getMessage());
      logger.error("Errore", e);
    } finally {
      try {
        if (connection != null) {
          connection.disconnect();
        }
      } catch (Throwable t) {

      }
    }

    return wsdmProtocolloDocumentoRes;
  }

  /**
   * Download di un allegato.
   * 
   * @param nRecord
   * @param bearer
   * @param storageId
   * @return
   * @throws MalformedURLException
   * @throws NamingException
   * @throws Exception
   * @throws IOException
   * @throws ProtocolException
   */
  private byte[] _operaDownloadAllegato(String nRecord, String bearer, String storageId) throws Exception {

    byte[] contenuto = null;

    HttpURLConnection connectionDownload = null;

    try {
      URL urlDownload = new URL(getOperaURL() + "/api/files/download/" + nRecord + "/" + storageId);
      connectionDownload = (HttpURLConnection) urlDownload.openConnection();
      connectionDownload.setDoInput(true);
      connectionDownload.setDoOutput(true);
      connectionDownload.setUseCaches(false);
      connectionDownload.setRequestMethod("GET");
      connectionDownload.setRequestProperty("Connection", "Keep-Alive");
      connectionDownload.setRequestProperty("Content-Type", "application/json");
      connectionDownload.setRequestProperty("Authorization", bearer);

      if (logger.isDebugEnabled()) {
        logger.debug("URLDownload: " + urlDownload.toString());
      }

      int httpStatusDownload = connectionDownload.getResponseCode();
      if (logger.isDebugEnabled()) logger.debug("responseCode: " + httpStatusDownload);
      if (httpStatusDownload == 200) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        IOUtils.copy(connectionDownload.getInputStream(), byteArrayOutputStream);
        byteArrayOutputStream.toByteArray();
        contenuto = byteArrayOutputStream.toByteArray();
      } else {
        String resDownload = getErrorStream(connectionDownload);
        if (logger.isDebugEnabled()) logger.debug("getErrorStream: " + resDownload);
      }
    } catch (Exception e) {
      throw e;
    } finally {
      try {
        if (connectionDownload != null) {
          connectionDownload.disconnect();
        }
      } catch (Throwable t) {

      }
    }
    return contenuto;
  }

  /**
   * Upload allegato nel documento.
   * 
   * @param nRecord
   * @param bearer
   * @param contenuto
   * @throws Exception
   */
  private void _operaUploadAllegato(String nRecord, String bearer, String filename, byte[] contenuto) throws Exception {

    HttpURLConnection connectionUpload = null;

    try {
      URL urlUpload = new URL(getOperaURL() + "/api/files/upload");
      connectionUpload = (HttpURLConnection) urlUpload.openConnection();
      connectionUpload.setDoInput(true);
      connectionUpload.setDoOutput(true);
      connectionUpload.setUseCaches(false);
      connectionUpload.setRequestMethod("POST");
      connectionUpload.setRequestProperty("Connection", "Keep-Alive");
      connectionUpload.setRequestProperty("Content-Type", "multipart/form-data");
      connectionUpload.setRequestProperty("Authorization", bearer);

      JSONObject jsonInput = new JSONObject();
      jsonInput.put("docNrecord", nRecord);
      jsonInput.put("fileType", "ALLEGATO");
      jsonInput.put("fileIdOnly", false);

      if (logger.isDebugEnabled()) {
        logger.debug("URLUpload: " + urlUpload.toString());
        logger.debug("jsonInput: " + jsonInput.toString());
      }

      MultipartEntity multipartEntity = new MultipartEntity(HttpMultipartMode.STRICT);
      ContentBody cd_files = new InputStreamBody(new ByteArrayInputStream(contenuto), filename);
      multipartEntity.addPart("files", cd_files);
      StringBody allegatoUpload = new StringBody(jsonInput.toString());
      multipartEntity.addPart("allegatoUpload", allegatoUpload);
      connectionUpload.setRequestProperty("Content-Type", multipartEntity.getContentType().getValue());
      OutputStream out = connectionUpload.getOutputStream();
      try {
        multipartEntity.writeTo(out);
      } finally {
        out.close();
      }

      int httpStatusDownload = connectionUpload.getResponseCode();
      if (logger.isDebugEnabled()) logger.debug("responseCode: " + httpStatusDownload);
      if (httpStatusDownload == 200) {
        String resDownload = getInputStream(connectionUpload);
        if (logger.isDebugEnabled()) logger.debug("getInputStream: " + resDownload);
      } else {
        String resDownload = getErrorStream(connectionUpload);
        if (logger.isDebugEnabled()) logger.debug("getErrorStream: " + resDownload);
      }
    } catch (Exception e) {
      throw e;
    } finally {
      try {
        if (connectionUpload != null) {
          connectionUpload.disconnect();
        }
      } catch (Throwable t) {

      }
    }

  }

  /**
   * Lettura della lista dei documenti associati al fascicolo. Viene passato il
   * codice "ieFascicolo".
   * 
   * @param username
   * @param password
   * @param bearer
   * @param ieFascicolo
   * @return
   * @throws Exception
   */
  private WSDMFascicoloDocumento[] _operaFascicoloLeggiDocumenti(String username, String password, String bearer, String ieFascicolo)
      throws Exception {

    WSDMFascicoloDocumento[] wsdmFascicoloDocumenti = null;

    HttpURLConnection connection = null;

    try {

      // Size (numero dei record restituIti) deve essere indicato nel request
      String size = OPERA_DOC_FIND_SIZE;

      URL url = new URL(getOperaURL() + "/api/doc/find?size=" + size);
      connection = (HttpURLConnection) url.openConnection();
      connection.setDoInput(true);
      connection.setDoOutput(true);
      connection.setUseCaches(false);
      connection.setRequestMethod("POST");
      connection.setRequestProperty("Connection", "Keep-Alive");
      connection.setRequestProperty("Content-Type", "application/json");
      connection.setRequestProperty("Authorization", bearer);

      JSONObject jsonInput = new JSONObject();
      jsonInput.put("ieFascicolo", ieFascicolo);
      jsonInput.put("_class", "it.tredi.opera.entity.DocumentFilterSearchForm");

      if (logger.isDebugEnabled()) {
        logger.debug("URL: " + url.toString());
        logger.debug("jsonInput: " + jsonInput.toString());
      }

      DataOutputStream output = new DataOutputStream(connection.getOutputStream());
      output.write(jsonInput.toString().getBytes("UTF-8"));
      output.flush();

      // Risposta
      int httpStatus = connection.getResponseCode();
      if (logger.isDebugEnabled()) logger.debug("responseCode: " + httpStatus);
      if (httpStatus == 200) {
        String res = getInputStream(connection);
        if (logger.isDebugEnabled()) logger.debug("getInputStream: " + res);

        JSONObject jsonOutputRicerca = new JSONObject(res);

        if (jsonOutputRicerca.has("content")) {
          JSONArray jsonArrayContent = jsonOutputRicerca.getJSONArray("content");

          if (jsonArrayContent.length() > 0) {

            wsdmFascicoloDocumenti = new WSDMFascicoloDocumento[jsonArrayContent.length()];

            for (int c = 0; c < jsonArrayContent.length(); c++) {

              if (!"null".equals(jsonArrayContent.get(c).toString())) {

                JSONObject jsonContent = jsonArrayContent.getJSONObject(c);
                wsdmFascicoloDocumenti[c] = new WSDMFascicoloDocumento();

                // Numero documento
                if (jsonContent.has("nRecord") && !jsonContent.isNull("nRecord")) {
                  wsdmFascicoloDocumenti[c].setNumeroDocumento(jsonContent.getString("nRecord"));
                }

                // Se esiste l'oggetto "metaDocumento" si tratta di un documento
                // semplice
                if (jsonContent.has("metaDocumento") && !jsonContent.isNull("metaDocumento")) {
                  JSONObject jsonMetaDocumento = jsonContent.getJSONObject("metaDocumento");

                  // Oggetto
                  if (jsonMetaDocumento.has("oggettoDocumento") && !jsonMetaDocumento.isNull("oggettoDocumento")) {
                    wsdmFascicoloDocumenti[c].setOggetto(jsonMetaDocumento.getString("oggettoDocumento"));
                  }
                  wsdmFascicoloDocumenti[c].setInout(WSDMProtocolloInOut.INT);

                }

                // Se esiste l'oggetto "metaProtocollo" si tratta di un
                // protocollo
                if (jsonContent.has("metaProtocollo") && !jsonContent.isNull("metaProtocollo")) {
                  JSONObject jsonMetaProtocollo = jsonContent.getJSONObject("metaProtocollo");

                  // Oggetto
                  if (jsonMetaProtocollo.has("oggettoProtocollo") && !jsonMetaProtocollo.isNull("oggettoProtocollo")) {
                    wsdmFascicoloDocumenti[c].setOggetto(jsonMetaProtocollo.getString("oggettoProtocollo"));
                  }

                  // Numero protocollo
                  if (jsonMetaProtocollo.has("numero") && !jsonMetaProtocollo.isNull("numero")) {
                    wsdmFascicoloDocumenti[c].setNumeroProtocollo(jsonMetaProtocollo.getString("numero"));
                  }

                  // Data e anno protocollo
                  if (jsonMetaProtocollo.has("data") && !jsonMetaProtocollo.isNull("data")) {
                    Date dataProtocollo = new SimpleDateFormat("yyyy-MM-dd").parse(jsonMetaProtocollo.getString("data"));
                    wsdmFascicoloDocumenti[c].setDataProtocollo(dataProtocollo);
                    wsdmFascicoloDocumenti[c].setAnnoProtocollo(new Long(dataProtocollo.getYear() + 1900));
                  }

                  // Gestione del verso
                  if (jsonMetaProtocollo.has("tipo") && !jsonMetaProtocollo.isNull("tipo")) {
                    String tipoProtocollo = jsonMetaProtocollo.getString("tipo");
                    if (PROTOCOLLO_INT.equals(tipoProtocollo)) {
                      wsdmFascicoloDocumenti[c].setInout(WSDMProtocolloInOut.INT);
                    } else if (PROTOCOLLO_IN.equals(tipoProtocollo)) {
                      wsdmFascicoloDocumenti[c].setInout(WSDMProtocolloInOut.IN);
                    } else if (PROTOCOLLO_OUT.equals(tipoProtocollo)) {
                      wsdmFascicoloDocumenti[c].setInout(WSDMProtocolloInOut.OUT);
                    } else {
                      wsdmFascicoloDocumenti[c].setInout(WSDMProtocolloInOut.INT);
                    }
                  }
                }

              }
            }
          }
        }
      } else {
        String res = getErrorStream(connection);
        if (logger.isDebugEnabled()) logger.debug("getErrorStream: " + res);
        throw new Exception(res);
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

    return wsdmFascicoloDocumenti;
  }

  /**
   * Ricava l'indirizzo generico del servizio documentale OPERA.
   * 
   * @return
   * @throws NamingException
   * @throws Exception
   */
  private String getOperaURL() throws NamingException, Exception {
    String opera_documentale_url = InitialContext.doLookup(OPERA_DOCUMENTALE_URL);
    if (opera_documentale_url == null || (opera_documentale_url != null && "".equals(opera_documentale_url.trim()))) {
      throw new Exception(OPERA_DOCUMENTALE_URL_NOT_DEFINED);
    } else {
      if (opera_documentale_url.endsWith("/")) {
        opera_documentale_url.subSequence(0, opera_documentale_url.length() - 1);
      }
    }
    return opera_documentale_url;
  }

  /**
   * Ricava il bearer di connessione per il servizio documentale OPERA.
   * 
   * @param username
   * @param password
   * @return
   * @throws Exception
   */
  private String _operaLogin(String username, String password) throws Exception {

    HttpURLConnection connection = null;
    String bearer = null;

    try {
      String opera_documentale_url = getOperaURL();

      URL url = new URL(opera_documentale_url + "/login");
      connection = (HttpURLConnection) url.openConnection();
      connection.setDoInput(true);
      connection.setDoOutput(true);
      connection.setUseCaches(false);
      connection.setRequestMethod("POST");
      connection.setRequestProperty("Connection", "Keep-Alive");
      connection.setRequestProperty("Content-Type", "application/json");

      JSONObject jsonInput = new JSONObject();
      jsonInput.put("username", username);
      jsonInput.put("password", password);

      if (logger.isDebugEnabled()) logger.debug("URL: " + url.toString());

      DataOutputStream output = new DataOutputStream(connection.getOutputStream());
      output.write(jsonInput.toString().getBytes("UTF-8"));
      output.flush();

      // Risposta
      int httpStatus = connection.getResponseCode();
      if (logger.isDebugEnabled()) logger.debug("responseCode: " + httpStatus);
      if (httpStatus == 200) {
        String res = getInputStream(connection);
        bearer = connection.getHeaderField("Authorization");
        if (logger.isDebugEnabled()) logger.debug("getInputStream: " + res);
      } else {
        String res = getErrorStream(connection);
        if (logger.isDebugEnabled()) logger.debug("getErrorStream: " + res);
        throw new Exception(res);
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

    return bearer;
  }

  @Override
  public WSDMFascicoloRes _fascicoloMetadatiLeggi(String username, String password, WSDMLoginAttr loginAttr, String codiceFascicolo,
      Long annoFascicolo, String numeroFascicolo, String classificaFascicolo, String oggettoFascicolo) {
    WSDMFascicoloRes wsdmfascicoloRes = new WSDMFascicoloRes();
    StringBuffer messaggioCtr = new StringBuffer();
    if (LapisOperaUtilityControllo.ctrFascicoloLeggi(loginAttr, codiceFascicolo, annoFascicolo, numeroFascicolo, messaggioCtr)) {
      wsdmfascicoloRes = _operaFascicoloGestioneLeggiRicerca(username, password, loginAttr, codiceFascicolo, classificaFascicolo,
          oggettoFascicolo, false);
    } else {
      wsdmfascicoloRes.setEsito(false);
      wsdmfascicoloRes.setMessaggio(messaggioCtr.toString());
    }
    return wsdmfascicoloRes;
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

    // Ricerca della data del protocollo
    String dataProtocollo = _operaProtocolloRicercaResponseData(username, password, annoProtocollo, numeroProtocollo);

    if (logger.isDebugEnabled()) logger.debug("Data protocollo (YYYY-MM-DD) " + dataProtocollo);

    if (dataProtocollo != null) {
      // Inviare la richiesta a LAPIS
    } else {
      wsdmVerificaMailRes.setEsito(false);
      wsdmVerificaMailRes.setMessaggio("Protocollo non trovato");
    }

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
    if (LapisOperaUtilityControllo.ctrFascicoloRicerca(loginAttr, ricercaFascicolo, messaggioCtr)) {
      wsdmRicercaFascicoloRes = _operaFascicoloRicerca(username, password, loginAttr, ricercaFascicolo);
    } else {
      wsdmRicercaFascicoloRes.setEsito(false);
      wsdmRicercaFascicoloRes.setMessaggio(messaggioCtr.toString());
    }

    return wsdmRicercaFascicoloRes;
  }

  /**
   * Ricerca del fascicolo in base a vari parametri.
   * 
   * @param username
   * @param password
   * @param loginAttr
   * @param ricercaFascicolo
   * @return
   */
  private WSDMRicercaFascicoloRes _operaFascicoloRicerca(String username, String password, WSDMLoginAttr loginAttr,
      WSDMRicercaFascicolo ricercaFascicolo) {
    WSDMRicercaFascicoloRes wsdmRicercaFascicoloRes = new WSDMRicercaFascicoloRes();

    HttpURLConnection connection = null;

    try {

      // Size (numero dei record restituiti) deve essere indicato nel request
      String size = OPERA_FASCICOLO_FIND_SIZE;

      URL url = new URL(getOperaURL() + "/api/fascicolo/find?size=" + size);
      connection = (HttpURLConnection) url.openConnection();
      connection.setDoInput(true);
      connection.setDoOutput(true);
      connection.setUseCaches(false);
      connection.setRequestMethod("POST");
      connection.setRequestProperty("Connection", "Keep-Alive");
      connection.setRequestProperty("Content-Type", "application/json");
      connection.setRequestProperty("Authorization", _operaLogin(username, password));

      JSONObject jsonInput = new JSONObject();
      jsonInput.put("ieFascicolo", ricercaFascicolo.getCodiceFascicolo());
      jsonInput.put("idcCode", ricercaFascicolo.getClassificaFascicolo());
      jsonInput.put("oggetto", ricercaFascicolo.getOggettoFascicolo());
      jsonInput.put("struttura", ricercaFascicolo.getStrutturaFascicolo());
      // Ricerca per identificativi di gara
      jsonInput.put("fascicoliGara", true);
      jsonInput.put("identificativoGara", ricercaFascicolo.getIdentificativoGara());
      jsonInput.put("cig", ricercaFascicolo.getCig());

      jsonInput.put("_class", "it.tredi.opera.model.fascicolo.FascicoloFilterSearchForm");

      if (logger.isDebugEnabled()) {
        logger.debug("URL: " + url.toString());
        logger.debug("jsonInput: " + jsonInput.toString());
      }

      DataOutputStream output = new DataOutputStream(connection.getOutputStream());
      output.write(jsonInput.toString().getBytes("UTF-8"));
      output.flush();

      // Risposta
      int httpStatus = connection.getResponseCode();
      if (logger.isDebugEnabled()) logger.debug("responseCode: " + httpStatus);
      if (httpStatus == 200) {
        String res = getInputStream(connection);
        if (logger.isDebugEnabled()) logger.debug("getInputStream: " + res);

        JSONObject jsonOutputRicerca = new JSONObject(res);

        if (jsonOutputRicerca.has("content")) {
          JSONArray jsonArrayContent = jsonOutputRicerca.getJSONArray("content");

          if (jsonArrayContent.length() > 0) {

            WSDMFascicolo[] wsdmListaFascicoli = new WSDMFascicolo[jsonArrayContent.length()];

            for (int c = 0; c < jsonArrayContent.length(); c++) {

              if (!"null".equals(jsonArrayContent.get(c).toString())) {

                JSONObject jsonContent = jsonArrayContent.getJSONObject(c);
                wsdmListaFascicoli[c] = new WSDMFascicolo();

                // Codice del fascicolo (ieFascicolo)
                if (jsonContent.has("ieFascicolo") && !jsonContent.isNull("ieFascicolo")) {
                  wsdmListaFascicoli[c].setCodiceFascicolo(jsonContent.getString("ieFascicolo"));
                }

                // Numero univoco del fascicolo (nRecord)
                if (jsonContent.has("nRecord") && !jsonContent.isNull("nRecord")) {
                  wsdmListaFascicoli[c].setGenericS11(jsonContent.getString("nRecord"));
                }

                // Anno del fascicolo
                try {
                  if (jsonContent.has("anno")) {
                    if (!jsonContent.isNull("anno")) {
                      wsdmListaFascicoli[c].setAnnoFascicolo(new Long(jsonContent.getLong("anno")));
                    }
                  }
                } catch (Exception e) {

                }

                // Numero del fascicolo
                try {
                  if (jsonContent.has("numero")) {
                    if (!jsonContent.isNull("numero")) {
                      wsdmListaFascicoli[c].setNumeroFascicolo(String.valueOf(jsonContent.getLong("numero")));
                    }
                  }
                } catch (Exception e) {

                }

                // Classifica
                if (jsonContent.has("idc") && !jsonContent.isNull("idc")) {
                  JSONObject jsonClassifica = jsonContent.getJSONObject("idc");
                  if (!jsonClassifica.isEmpty()) {
                    if (jsonClassifica.has("cod") && !jsonClassifica.isNull("cod")) {
                      wsdmListaFascicoli[c].setClassificaFascicolo(jsonClassifica.getString("cod"));
                    }
                    if (jsonClassifica.has("descrizione") && !jsonClassifica.isNull("descrizione")) {
                      wsdmListaFascicoli[c].setClassificaFascicoloDescrizione(jsonClassifica.getString("descrizione"));
                    }
                  }
                }

                // Struttura
                if (jsonContent.has("struttura") && !jsonContent.isNull("struttura")) {
                  wsdmListaFascicoli[c].setStruttura(jsonContent.getString("struttura"));
                }

                // Oggetto
                if (jsonContent.has("oggetto") && !jsonContent.isNull("oggetto")) {
                  wsdmListaFascicoli[c].setOggettoFascicolo(jsonContent.getString("oggetto"));
                }

                // Data fascicolo
                try {
                  if (jsonContent.has("dataCreazione") && !jsonContent.isNull("dataCreazione")) {
                    String dataCreazione = jsonContent.getString("dataCreazione");
                    Date dataFascicolo = new SimpleDateFormat("yyyy-MM-dd").parse(dataCreazione);
                    wsdmListaFascicoli[c].setDataFascicolo(dataFascicolo);
                  }
                } catch (Exception e) {

                }

                // Tipo documento
                if (jsonContent.has("tipoDoc") && !jsonContent.isNull("tipoDoc")) {
                  wsdmListaFascicoli[c].setTipo(jsonContent.getString("tipoDoc"));
                }

                // Identificativo gara
                if (jsonContent.has("identificativoGara") && !jsonContent.isNull("identificativoGara")) {
                  wsdmListaFascicoli[c].setIdentificativoGara(jsonContent.getString("identificativoGara"));
                }

                // CIG
                if (jsonContent.has("cig") && !jsonContent.isNull("cig")) {
                  wsdmListaFascicoli[c].setCig(jsonContent.getString("cig"));
                }

              }

              wsdmRicercaFascicoloRes.setEsito(true);
              wsdmRicercaFascicoloRes.setFascicoli(wsdmListaFascicoli);
            }
          } else {
            wsdmRicercaFascicoloRes.setEsito(false);
            wsdmRicercaFascicoloRes.setMessaggio("Fascicolo non trovato");
          }
        } else {
          wsdmRicercaFascicoloRes.setEsito(false);
          wsdmRicercaFascicoloRes.setMessaggio("Fascicolo non trovato");
        }

      } else {
        String res = getErrorStream(connection);
        if (logger.isDebugEnabled()) logger.debug("getErrorStream: " + res);
        throw new Exception(res);

      }

    } catch (Exception e) {
      wsdmRicercaFascicoloRes.setEsito(false);
      wsdmRicercaFascicoloRes.setMessaggio(e.getMessage());
      logger.error("Errore", e);
    } finally {
      try {
        if (connection != null) {
          connection.disconnect();
        }
      } catch (Throwable t) {

      }
    }

    return wsdmRicercaFascicoloRes;
  }

  /**
   * Ricerca protocollo per anno e numero. Restituisce la data del protocollo
   * nel formato YYYY-MM-DD.
   * 
   * @param username
   * @param password
   * @param annoProtocollo
   * @param numeroProtocollo
   * @return
   */
  private String _operaProtocolloRicercaResponseData(String username, String password, Long annoProtocollo, String numeroProtocollo) {
    WSDMRicercaFascicoloRes wsdmRicercaFascicoloRes = new WSDMRicercaFascicoloRes();

    String dataProtocollo = null;

    HttpURLConnection connection = null;

    try {

      // Size (numero dei record restituiti) deve essere indicato nel request
      String size = OPERA_DOC_FIND_SIZE;

      URL url = new URL(getOperaURL() + "/api/doc/find?size=" + size);
      connection = (HttpURLConnection) url.openConnection();
      connection.setDoInput(true);
      connection.setDoOutput(true);
      connection.setUseCaches(false);
      connection.setRequestMethod("POST");
      connection.setRequestProperty("Connection", "Keep-Alive");
      connection.setRequestProperty("Content-Type", "application/json");
      connection.setRequestProperty("Authorization", _operaLogin(username, password));

      JSONObject jsonInput = new JSONObject();
      jsonInput.put("protNumero", numeroProtocollo);
      jsonInput.put("protDataDa", annoProtocollo.toString() + "-01-01T00:00:00");
      jsonInput.put("protDataA", annoProtocollo.toString() + "-12-31T23:59:59");
      jsonInput.put("_class", "it.tredi.opera.entity.DocumentFilterSearchForm");

      if (logger.isDebugEnabled()) {
        logger.debug("URL: " + url.toString());
        logger.debug("jsonInput: " + jsonInput.toString());
      }

      DataOutputStream output = new DataOutputStream(connection.getOutputStream());
      output.write(jsonInput.toString().getBytes("UTF-8"));
      output.flush();

      // Risposta
      int httpStatus = connection.getResponseCode();
      if (logger.isDebugEnabled()) logger.debug("responseCode: " + httpStatus);
      if (httpStatus == 200) {
        String res = getInputStream(connection);
        if (logger.isDebugEnabled()) logger.debug("getInputStream: " + res);

        JSONObject jsonOutputRicerca = new JSONObject(res);
        if (jsonOutputRicerca.has("content")) {
          JSONArray jsonArrayContent = jsonOutputRicerca.getJSONArray("content");

          if (jsonArrayContent.length() > 0) {
            if (!"null".equals(jsonArrayContent.get(0).toString())) {
              JSONObject jsonContent = jsonArrayContent.getJSONObject(0);
              // Numero univoco del fascicolo (nRecord)
              if (jsonContent.has("metaProtocollo") && !jsonContent.isNull("metaProtocollo")) {
                JSONObject jsonMetaProtocollo = jsonContent.getJSONObject("metaProtocollo");
                if (jsonMetaProtocollo.has("data") && !jsonMetaProtocollo.isNull("data")) {
                  dataProtocollo = jsonMetaProtocollo.getString("data");
                }
              }
            }
          }
        }

      } else {
        String res = getErrorStream(connection);
        if (logger.isDebugEnabled()) logger.debug("getErrorStream: " + res);
        throw new Exception(res);

      }

    } catch (Exception e) {
      wsdmRicercaFascicoloRes.setEsito(false);
      wsdmRicercaFascicoloRes.setMessaggio(e.getMessage());
      logger.error("Errore", e);
    } finally {
      try {
        if (connection != null) {
          connection.disconnect();
        }
      } catch (Throwable t) {

      }
    }

    return dataProtocollo;
  }

  private String _operaProtocolloRicerca(String username, String password, Long annoProtocollo, String numeroProtocollo) {
    WSDMRicercaFascicoloRes wsdmRicercaFascicoloRes = new WSDMRicercaFascicoloRes();

    String nRecord = null;

    HttpURLConnection connection = null;

    try {

      // Size (numero dei record restituiti) deve essere indicato nel request
      String size = OPERA_DOC_FIND_SIZE;

      URL url = new URL(getOperaURL() + "/api/doc/find?size=" + size);
      connection = (HttpURLConnection) url.openConnection();
      connection.setDoInput(true);
      connection.setDoOutput(true);
      connection.setUseCaches(false);
      connection.setRequestMethod("POST");
      connection.setRequestProperty("Connection", "Keep-Alive");
      connection.setRequestProperty("Content-Type", "application/json");
      connection.setRequestProperty("Authorization", _operaLogin(username, password));

      JSONObject jsonInput = new JSONObject();
      jsonInput.put("protNumero", numeroProtocollo);
      jsonInput.put("protDataDa", annoProtocollo.toString() + "-01-01T00:00:00");
      jsonInput.put("protDataA", annoProtocollo.toString() + "-12-31T23:59:59");
      jsonInput.put("_class", "it.tredi.opera.entity.DocumentFilterSearchForm");

      if (logger.isDebugEnabled()) {
        logger.debug("URL: " + url.toString());
        logger.debug("jsonInput: " + jsonInput.toString());
      }

      DataOutputStream output = new DataOutputStream(connection.getOutputStream());
      output.write(jsonInput.toString().getBytes("UTF-8"));
      output.flush();

      // Risposta
      int httpStatus = connection.getResponseCode();
      if (logger.isDebugEnabled()) logger.debug("responseCode: " + httpStatus);
      if (httpStatus == 200) {
        String res = getInputStream(connection);
        if (logger.isDebugEnabled()) logger.debug("getInputStream: " + res);

        JSONObject jsonOutputRicerca = new JSONObject(res);
        if (jsonOutputRicerca.has("content")) {
          JSONArray jsonArrayContent = jsonOutputRicerca.getJSONArray("content");

          if (jsonArrayContent.length() > 0) {
            if (!"null".equals(jsonArrayContent.get(0).toString())) {
              JSONObject jsonContent = jsonArrayContent.getJSONObject(0);
              // Numero univoco del fascicolo (nRecord)
              if (jsonContent.has("nRecord") && !jsonContent.isNull("nRecord")) {
                nRecord = jsonContent.getString("nRecord");
              }
            }
          }
        }

      } else {
        String res = getErrorStream(connection);
        if (logger.isDebugEnabled()) logger.debug("getErrorStream: " + res);
        throw new Exception(res);

      }

    } catch (Exception e) {
      wsdmRicercaFascicoloRes.setEsito(false);
      wsdmRicercaFascicoloRes.setMessaggio(e.getMessage());
      logger.error("Errore", e);
    } finally {
      try {
        if (connection != null) {
          connection.disconnect();
        }
      } catch (Throwable t) {

      }
    }

    return nRecord;
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
  public WSDMProtocolloDocumentoRes _protocolloAsincronoEsito(String username, String password, WSDMLoginAttr loginAttr, String id) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    StringBuffer messaggioCtr = new StringBuffer();

    try {
      if (LapisOperaUtilityControllo.ctrProtocolloAsincronoEsito(loginAttr, id, messaggioCtr)) {
        // URL del protocollo
        String lapis_protocollo_url = InitialContext.doLookup(LAPIS_PROTOCOLLO_URL);
        if (lapis_protocollo_url == null || (lapis_protocollo_url != null && "".equals(lapis_protocollo_url.trim()))) {
          throw new Exception(LAPIS_PROTOCOLLO_URL_NOT_DEFINED);
        }

        LapisWebSOAPServiceLocator locator = new LapisWebSOAPServiceLocator();
        LapisWebSOAPType service = locator.getLapisWebSOAPPort(new URL(lapis_protocollo_url));
        String risposta = service.protoBatchLog(new Long(id));

        // Trasformazione in oggetto ProtoBatch
        JAXBContext jaxbContext = JAXBContext.newInstance(ProtoBatch.class);
        Object objectJAXB = jaxbContext.createUnmarshaller().unmarshal(new StringReader(new StringBuffer(risposta).toString()));
        ProtoBatch protoBatch = (ProtoBatch) objectJAXB;

        if (PROTO_BATCH_PROTOCOLLATO.equals(protoBatch.getCodStato())
            || PROTO_BATCH_PROTOCOLLATO_CON_SEGNALAZIONI.equals(protoBatch.getCodStato())) {

          WSDMProtocolloDocumento wsdmProtocolloDocumento = new WSDMProtocolloDocumento();

          // Numero protocollo
          String nProto = protoBatch.getNProto();
          wsdmProtocolloDocumento.setNumeroProtocollo(nProto);

          // Anno e data protocollo
          try {
            String dProto = protoBatch.getDProto();
            Date dataProtocollo = new SimpleDateFormat("dd/MM/yyyy").parse(dProto);
            wsdmProtocolloDocumento.setDataProtocollo(dataProtocollo);
            wsdmProtocolloDocumento.setAnnoProtocollo(new Long(dataProtocollo.getYear() + 1900));
          } catch (Exception e) {

          }

          wsdmprotocolloDocumentoRes.setEsito(true);
          wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmProtocolloDocumento);
          String messaggio = protoBatch.getStato().toString();
          if (protoBatch.getLog() != null && !"".equals(protoBatch.getLog().trim())) {
            messaggio += ": " + protoBatch.getLog();
          }
          wsdmprotocolloDocumentoRes.setMessaggio(messaggio);

        } else {
          wsdmprotocolloDocumentoRes.setEsito(false);
          String messaggio = protoBatch.getStato().toString();
          if (protoBatch.getLog() != null && !"".equals(protoBatch.getLog().trim())) {
            messaggio += ": " + protoBatch.getLog();
          }
          wsdmprotocolloDocumentoRes.setMessaggio(messaggio);
        }
      } else {
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (Exception e) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(e.getMessage());
    }

    return wsdmprotocolloDocumentoRes;
  }

  private String getErrorStream(HttpURLConnection connection) throws IOException {
    StringWriter writer = new StringWriter();
    IOUtils.copy(connection.getErrorStream(), writer, "UTF-8");
    return writer.toString();
  }

  private String getInputStream(HttpURLConnection connection) throws IOException {
    StringWriter writer = new StringWriter();
    IOUtils.copy(connection.getInputStream(), writer, "UTF-8");
    return writer.toString();
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
}
