package it.maggioli.eldasoft.bl.engineeringdoc;

import it.maggioli.eldasoft.ws.dm.WSDMFascicolo;
import it.maggioli.eldasoft.ws.dm.WSDMFascicoloIn;
import it.maggioli.eldasoft.ws.dm.WSDMInserimentoInFascicolo;
import it.maggioli.eldasoft.ws.dm.WSDMLoginAttr;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloDocumentoIn;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloInOut;

import java.util.ArrayList;

/**
 * Classe di utilita' a supporto delle richieste di protocollo e fascicolo.
 * 
 * 
 */
public class EngineeringDocUtilityControllo {

  static private final String CTR_MESSAGE                    = "La richiesta non puo' essere inoltrata a causa dei seguenti controlli:";
  static private final String CTR_MESSAGE_ID_UO_MITTENTE     = "valorizzare l'identificativo dell'unita' operativa mittente (di provenienza)";
  static private final String CTR_MESSAGE_ID_UO_DESTINATARIA = "valorizzare l'identificativo dell'unita' operativa destinataria";
  static private final String CTR_MESSAGE_OGGETTO_DOCUMENTO  = "valorizzare l'oggetto del documento";
  static private final String CTR_MESSAGE_MITTENTE           = "indicare almeno un mittente";
  static private final String CTR_MESSAGE_DESTINATARIO       = "indicare almeno un destinatario";
  static private final String CTR_MESSAGE_ALLEGATO           = "inserire almeno un allegato";
  static private final String CTR_MESSAGE_CODICE_FASCICOLO   = "valorizzare il codice del fascicolo";
  static private final String CTR_MESSAGE_OGGETTO_FASCICOLO  = "valorizzare l'oggetto del fascicolo";
  static private final String CTR_MESSAGE_NUMERO_DOCUMENTO   = "valorizzare il numero documento";
  
  static private final String CTR_MESSAGE_ATTO_ANNO             = "anno atto";
  static private final String CTR_MESSAGE_ATTO_NUMERO           = "numero atto";

  /**
   * Controllo valori in ingresso per la richiesta _documentoInserisci.
   * 
   * @param login
   * @param messaggio
   * @param wsdmprotocolloDocumentoIn
   * @return
   */
  public static boolean ctrDocumentoInserisci(WSDMLoginAttr loginAttr, WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn,
      StringBuffer messaggio) {
    ArrayList<String> alObb = new ArrayList<String>();

    // Oggetto
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getOggetto())) alObb.add(CTR_MESSAGE_OGGETTO_DOCUMENTO);

    // Mittenti/destinatari in funzione del verso:
    // - protocollo in ingresso: sono obbligatori almeno un mittente (esterno) e
    // l'identificativo dell'unita' operativa destinataria
    // - protocollo in uscita: sono obbligatori almeno un destinatario (esterno)
    // e l'identificativo dell'unita' operativa mittente
    // - protocollo interno (tra uffici): sono obbligatori l'identificativo
    // dell'unita' operativa mittente e dell'unita' operativa destinataria
    if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
      if (wsdmprotocolloDocumentoIn.getMittenti() == null) alObb.add(CTR_MESSAGE_MITTENTE);
      // if (wsdmprotocolloDocumentoIn.getIdUnitaOperativaDestinataria() == null) alObb.add(CTR_MESSAGE_ID_UO_DESTINATARIA);
    } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      if (wsdmprotocolloDocumentoIn.getDestinatari() == null) alObb.add(CTR_MESSAGE_DESTINATARIO);
      // if (wsdmprotocolloDocumentoIn.getIdUnitaOperativaMittente() == null) alObb.add(CTR_MESSAGE_ID_UO_MITTENTE);
    } 
//    else if (WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
//      if (wsdmprotocolloDocumentoIn.getIdUnitaOperativaDestinataria() == null) alObb.add(CTR_MESSAGE_ID_UO_DESTINATARIA);
//    }

    // Presenza allegati
    if (wsdmprotocolloDocumentoIn.getAllegati() == null) alObb.add(CTR_MESSAGE_ALLEGATO);

    // Eventuale inserimento in un nuovo fascicolo
    if (WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
      WSDMFascicolo wsdmFascicolo = wsdmprotocolloDocumentoIn.getFascicolo();
      if (wsdmFascicolo == null) {
        alObb.add(CTR_MESSAGE_OGGETTO_FASCICOLO);
      } else {
        if (!isTestoValido(wsdmFascicolo.getOggettoFascicolo())) alObb.add(CTR_MESSAGE_OGGETTO_FASCICOLO);
      }
    }

    // Eventuale inserimento in un fascicolo esistente
    if (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
      WSDMFascicolo wsdmFascicolo = wsdmprotocolloDocumentoIn.getFascicolo();
      if (wsdmFascicolo == null) {
        alObb.add(CTR_MESSAGE_CODICE_FASCICOLO);
      } else {
        if (!isTestoValido(wsdmFascicolo.getCodiceFascicolo())) alObb.add(CTR_MESSAGE_CODICE_FASCICOLO);
      }
    }

    return ctrEsito(messaggio, alObb);
  }

  /**
   * Controllo valori in ingresso per la richiesta _documentoLeggi.
   * 
   * @param login
   * @param numeroDocumento
   * @param messaggio
   * @return
   */
  public static boolean ctrDocumentoLeggi(WSDMLoginAttr loginAttr, String numeroDocumento, StringBuffer messaggio) {
    ArrayList<String> alObb = new ArrayList<String>();
    if (!isTestoValido(numeroDocumento)) alObb.add(CTR_MESSAGE_NUMERO_DOCUMENTO);
    return ctrEsito(messaggio, alObb);
  }

  /**
   * Controllo valori in ingresso per la richiesta _fascicoloLeggi.
   * 
   * @param login
   * @param codiceFascicolo
   * @param annoFascicolo
   * @param numeroFascicolo
   * @return
   */
  public static boolean ctrFascicoloLeggi(WSDMLoginAttr loginAttr, String codiceFascicolo, Long annoFascicolo, String numeroFascicolo,
      StringBuffer messaggio) {
    ArrayList<String> alObb = new ArrayList<String>();
    if (!isTestoValido(codiceFascicolo)) alObb.add(CTR_MESSAGE_CODICE_FASCICOLO);
    return ctrEsito(messaggio, alObb);
  }

  /**
   * Controllo valori in ingresso per la richiesta _fascicoloInserisci.
   * 
   * @param login
   * @param messaggio
   * @param wsdmfascicoloIn
   * @return
   */
  public static boolean ctrFascicoloInserisci(WSDMLoginAttr loginAttr, WSDMFascicoloIn wsdmfascicoloIn, StringBuffer messaggio) {
    ArrayList<String> alObb = new ArrayList<String>();
    if (!isTestoValido(wsdmfascicoloIn.getOggettoFascicolo())) alObb.add(CTR_MESSAGE_OGGETTO_FASCICOLO);
    return ctrEsito(messaggio, alObb);
  }

  /**
   * Controllo valori obbligatori per la lettura dell'atto.
   * 
   * @param loginAttr
   * @param annoProtocollo
   * @param numeroProtocollo
   * @param messaggio
   * @return
   */

  public static boolean ctrAttoLeggi(WSDMLoginAttr loginAttr, String tipo, String organo, Long anno, String numero, StringBuffer messaggio) {
    ArrayList<String> alObb = new ArrayList<String>();
    if (anno == null) alObb.add(CTR_MESSAGE_ATTO_ANNO);
    if (!isTestoValido(numero)) alObb.add(CTR_MESSAGE_ATTO_NUMERO);
    return ctrEsito(messaggio, alObb);
  }
  
  /**
   * Gestione esito sul controllo dati obbligatori e formattazione del
   * messaggio.
   * 
   * @param messaggio
   * @param alObb
   * @return
   */
  public static boolean ctrEsito(StringBuffer messaggio, ArrayList<String> alObb) {
    boolean esito = true;
    if (alObb.size() > 0) {
      esito = false;
      String[] obb = new String[alObb.size()];
      obb = alObb.toArray(obb);
      String infoObb = "";
      for (int m = 0; m < obb.length; m++) {
        if (m > 0) infoObb += ", ";
        infoObb += obb[m];
      }
      messaggio.append(CTR_MESSAGE + " " + infoObb + ".");
    }
    return esito;
  }

  /**
   * Controlla se la stringa e' valorizzata
   * 
   * @param str
   * @return
   */
  private static boolean isTestoValido(String str) {
    boolean isTestoValido = false;
    if (str == null || (str != null && "".equals(str.trim()))) {
      isTestoValido = false;
    } else {
      isTestoValido = true;
    }
    return isTestoValido;
  }

}
