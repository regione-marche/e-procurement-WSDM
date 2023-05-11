package it.maggioli.eldasoft.bl.generic;

import java.util.ArrayList;

import it.maggioli.eldasoft.ws.dm.WSDMLoginAttr;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloDocumentoIn;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloInOut;

/**
 * Classe di utilita' a supporto delle richieste di protocollo e fascicolo.
 * 
 * 
 */
public class Generic01UtilityControllo {

  static private final String CTR_MESSAGE                             = "La richiesta non puo' essere inoltrata a causa dei seguenti controlli:";

  static private final String CTR_MESSAGE_OGGETTO                     = "valorizzare l'oggetto (protocolloDocumentoIn.oggetto)";
  static private final String CTR_MESSAGE_MITTENTE                    = "indicare almeno un mittente (protocolloDocumentoIn.mittenti)";
  static private final String CTR_MESSAGE_DESTINATARIO                = "indicare almeno un destinatario (protocolloDocumentoIn.destinatari)";
  static private final String CTR_MESSAGE_ALLEGATO                    = "inserire almeno un allegato (protocolloDocumentoIn.allegati)";
  static private final String CTR_MESSAGE_IN_OUT                      = "definire il verso della protocollazione (protocolloDocumentoIn.inout)";
  static private final String CTR_MESSAGE_PROTOCOLLO_INT_NON_AMMESSA  = "non e' ammessa la protocollazione di tipo interno (INT) (protocolloDocumentoIn.inout)";
  static private final String CTR_MESSAGE_PROTOCOLLO_SOLO_INT_AMMESSA = "e' ammessa solo la protocollazione di tipo interno (INT) (protocolloDocumentoIn.inout)";
  static private final String CTR_MESSAGE_TIPO_DOCUMENTO              = "valorizzare il tipo documento (protocolloDocumentoIn.tipoDocumento)";

  /**
   * Controllo dei dati in ingresso per il protocollo.
   * 
   * 
   * @param loginAttr
   * @param wsdmprotocolloDocumentoIn
   * @param messaggio
   * @return
   */
  public static boolean ctrProtocolloInserisci(WSDMLoginAttr loginAttr, WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn,
      StringBuffer messaggio) {
    ArrayList<String> alObb = new ArrayList<String>();

    // Oggetto
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getOggetto())) alObb.add(CTR_MESSAGE_OGGETTO);

    // Tipo documento
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getTipoDocumento())) alObb.add(CTR_MESSAGE_TIPO_DOCUMENTO);

    // Controllo verso, mittenti e destinatari
    if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
      if (wsdmprotocolloDocumentoIn.getMittenti() == null) alObb.add(CTR_MESSAGE_MITTENTE);
    } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      if (wsdmprotocolloDocumentoIn.getDestinatari() == null) alObb.add(CTR_MESSAGE_DESTINATARIO);
    } else if (WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      alObb.add(CTR_MESSAGE_PROTOCOLLO_INT_NON_AMMESSA);
    } else {
      alObb.add(CTR_MESSAGE_IN_OUT);
    }

    // Allegati
    if (wsdmprotocolloDocumentoIn.getAllegati() == null) {
      alObb.add(CTR_MESSAGE_ALLEGATO);
    }

    return ctrEsito(messaggio, alObb);

  }

  /**
   * Controllo dei dati in ingresso per il documentale.
   * 
   * @param loginAttr
   * @param wsdmprotocolloDocumentoIn
   * @param messaggio
   * @return
   */
  public static boolean ctrDocumentoInserisci(WSDMLoginAttr loginAttr, WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn,
      StringBuffer messaggio) {
    ArrayList<String> alObb = new ArrayList<String>();

    // Oggetto
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getOggetto())) alObb.add(CTR_MESSAGE_OGGETTO);

    // Controllo verso
    if (!WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      alObb.add(CTR_MESSAGE_PROTOCOLLO_SOLO_INT_AMMESSA);
    }

    // Allegati
    if (wsdmprotocolloDocumentoIn.getAllegati() == null) {
      alObb.add(CTR_MESSAGE_ALLEGATO);
    }

    return ctrEsito(messaggio, alObb);

  }

  /**
   * Gestione esito sul controllo dati obbligatori e formattazione del
   * messaggio.
   * 
   * @param wsdmprotocolloDocumentoOut
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
