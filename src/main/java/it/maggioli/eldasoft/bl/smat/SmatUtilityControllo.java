package it.maggioli.eldasoft.bl.smat;

import it.maggioli.eldasoft.ws.dm.WSDMFascicolo;
import it.maggioli.eldasoft.ws.dm.WSDMInserimentoInFascicolo;
import it.maggioli.eldasoft.ws.dm.WSDMLoginAttr;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloAllegato;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloAnagrafica;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloDocumentoIn;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloInOut;

import java.util.ArrayList;

/**
 * Classe di utilita' a supporto delle richieste di protocollo e fascicolo.
 * 
 * 
 */
public class SmatUtilityControllo {

  static private final String CTR_MESSAGE                            = "La richiesta non puo' essere inoltrata a causa dei seguenti controlli:";

  static private final String CTR_MESSAGE_DATA_DOCUMENTO             = "valorizzare la data del documento";
  static private final String CTR_MESSAGE_MITTENTE                   = "inserire il mittente";
  static private final String CTR_MESSAGE_EMAIL_MITTENTE             = "inserire l'indirizzo email del mittente";
  static private final String CTR_MESSAGE_MITTENTE_PIU               = "inserire un solo mittente";
  static private final String CTR_MESSAGE_DESTINATARIO               = "inserire almeno un destinatario";
  static private final String CTR_MESSAGE_EMAIL_DESTINATARIO         = "inserire l'indirizzo email di tutti i destinatari";
  static private final String CTR_MESSAGE_CODICE_FASCICOLO           = "valorizzare il codice del fascicolo";
  static private final String CTR_MESSAGE_ALLEGATO                   = "inserire almeno un allegato";
  static private final String CTR_MESSAGE_ALLEGATO_NOME              = "inserire il nome di tutti gli allegati";
  static private final String CTR_MESSAGE_ALLEGATO_CONTENUTO         = "inserire il contenuto di tutti gli allegati";
  static private final String CTR_MESSAGE_PROTOCOLLO_INT_NON_AMMESSA = "non e' ammessa la protocollazione di tipo interno (INT)";

  /**
   * Controllo valori in ingresso per la richiesta _protocolloInserisci
   * 
   * @param login
   * @param messaggio
   * @param wsdmprotocolloDocumentoIn
   * @return
   */
  public static boolean ctrProtocolloInserisci(WSDMLoginAttr loginAttr, WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn,
      StringBuffer messaggio) {
    ArrayList<String> alObb = new ArrayList<String>();

    // Data del documento
    if (wsdmprotocolloDocumentoIn.getData() == null) alObb.add(CTR_MESSAGE_DATA_DOCUMENTO);

    // Mittenti/destinatari in funzione del verso
    if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
      if (wsdmprotocolloDocumentoIn.getMittenti() == null) {
        alObb.add(CTR_MESSAGE_MITTENTE);
      } else {
        WSDMProtocolloAnagrafica[] mittenti = wsdmprotocolloDocumentoIn.getMittenti();
        if (mittenti != null && mittenti.length > 1) {
          alObb.add(CTR_MESSAGE_MITTENTE_PIU);
        }

        // Controllo indirizzo email
        if (mittenti != null && mittenti.length == 1) {
          if (!isTestoValido(mittenti[0].getEmail())) alObb.add(CTR_MESSAGE_EMAIL_MITTENTE);
        }

      }
    } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      if (wsdmprotocolloDocumentoIn.getDestinatari() == null) {
        alObb.add(CTR_MESSAGE_DESTINATARIO);
      } else {

        // Controllo indirizzi email
        WSDMProtocolloAnagrafica[] destinatari = wsdmprotocolloDocumentoIn.getDestinatari();
        if (destinatari != null && destinatari.length > 0) {
          for (int d = 0; d < destinatari.length; d++) {
            if (!isTestoValido(destinatari[d].getEmail())) alObb.add(CTR_MESSAGE_EMAIL_DESTINATARIO);
          }
        }
      }
    } else {
      alObb.add(CTR_MESSAGE_PROTOCOLLO_INT_NON_AMMESSA);
    }

    // Fascicolo
    if (WSDMInserimentoInFascicolo.NO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
      alObb.add(CTR_MESSAGE_CODICE_FASCICOLO);
    } else {
      WSDMFascicolo wsdmFascicolo = wsdmprotocolloDocumentoIn.getFascicolo();
      if (wsdmFascicolo == null) {
        alObb.add(CTR_MESSAGE_CODICE_FASCICOLO);
      } else {
        if (!isTestoValido(wsdmFascicolo.getCodiceFascicolo())) alObb.add(CTR_MESSAGE_CODICE_FASCICOLO);
      }
    }

    // Allegato
    if (wsdmprotocolloDocumentoIn.getAllegati() == null) {
      alObb.add(CTR_MESSAGE_ALLEGATO);
    } else {
      WSDMProtocolloAllegato[] allegati = wsdmprotocolloDocumentoIn.getAllegati();
      if (allegati != null && allegati.length > 0) {
        for (int a = 0; a < allegati.length; a++) {
          if (!isTestoValido(allegati[a].getNome())) alObb.add(CTR_MESSAGE_ALLEGATO_NOME);
          if (allegati[a].getContenuto() == null) {
            alObb.add(CTR_MESSAGE_ALLEGATO_CONTENUTO);
          } else if (allegati[a].getContenuto().length == 0) {
            alObb.add(CTR_MESSAGE_ALLEGATO_CONTENUTO);
          }
        }
      }
    }

    return ctrEsito(messaggio, alObb);

  }

  /**
   * Controllo valori in ingresso per la richiesta _documentoInserisci
   * 
   * @param login
   * @param messaggio
   * @param wsdmprotocolloDocumentoIn
   * @return
   */
  public static boolean ctrDocumentoInserisci(WSDMLoginAttr loginAttr, WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn,
      StringBuffer messaggio) {
    ArrayList<String> alObb = new ArrayList<String>();

    // Data del documento
    if (wsdmprotocolloDocumentoIn.getData() == null) alObb.add(CTR_MESSAGE_DATA_DOCUMENTO);

    // Fascicolo
    if (WSDMInserimentoInFascicolo.NO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
      alObb.add(CTR_MESSAGE_CODICE_FASCICOLO);
    } else {
      WSDMFascicolo wsdmFascicolo = wsdmprotocolloDocumentoIn.getFascicolo();
      if (wsdmFascicolo == null) {
        alObb.add(CTR_MESSAGE_CODICE_FASCICOLO);
      } else {
        if (!isTestoValido(wsdmFascicolo.getCodiceFascicolo())) alObb.add(CTR_MESSAGE_CODICE_FASCICOLO);
      }
    }

    // Allegato
    if (wsdmprotocolloDocumentoIn.getAllegati() == null) alObb.add(CTR_MESSAGE_ALLEGATO);

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
