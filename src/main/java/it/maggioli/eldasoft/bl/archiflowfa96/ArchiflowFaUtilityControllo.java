package it.maggioli.eldasoft.bl.archiflowfa96;

import it.maggioli.eldasoft.ws.dm.WSDMFascicolo;
import it.maggioli.eldasoft.ws.dm.WSDMInserimentoInFascicolo;
import it.maggioli.eldasoft.ws.dm.WSDMLoginAttr;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloAllegato;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloDocumentoIn;

import java.util.ArrayList;

/**
 * Classe di utilita' a supporto delle richieste di protocollo e fascicolo.
 * 
 * 
 */
public class ArchiflowFaUtilityControllo {

  static private final String CTR_MESSAGE                           = "La richiesta non puo' essere inoltrata a causa dei seguenti controlli:";

  static private final String CTR_MESSAGE_FASCICOLO                 = "e' obbligatorio utilizzare un fascicolo esistente";
  static private final String CTR_MESSAGE_CODICE_FASCICOLO          = "valorizzare il codice del fascicolo";
  static private final String CTR_MESSAGE_CODICE_FASCICOLO_NUMERICO = "il codice del fascicolo deve essere numerico";
  static private final String CTR_MESSAGE_CLASSIFICA_FASCICOLO      = "valorizzare la classificazione del fascicolo";
  static private final String CTR_MESSAGE_ALLEGATO                  = "inserire almeno un allegato";
  static private final String CTR_MESSAGE_ALLEGATO_NOME             = "inserire il nome di tutti gli allegati";
  static private final String CTR_MESSAGE_ALLEGATO_CONTENUTO        = "inserire il contenuto di tutti gli allegati";

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

    // Fascicolo
    if (WSDMInserimentoInFascicolo.NO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())
        || WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
      alObb.add(CTR_MESSAGE_FASCICOLO);
    } else {
      WSDMFascicolo wsdmFascicolo = wsdmprotocolloDocumentoIn.getFascicolo();
      if (wsdmFascicolo == null) {
        alObb.add(CTR_MESSAGE_FASCICOLO);
      } else {
        if (!isTestoValido(wsdmFascicolo.getCodiceFascicolo())) alObb.add(CTR_MESSAGE_CODICE_FASCICOLO);

        try {
          Integer.parseInt(wsdmFascicolo.getCodiceFascicolo());
        } catch (Exception e) {
          alObb.add(CTR_MESSAGE_CODICE_FASCICOLO_NUMERICO);
        }

        if (!isTestoValido(wsdmFascicolo.getClassificaFascicolo())) alObb.add(CTR_MESSAGE_CLASSIFICA_FASCICOLO);
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

    ctrProtocolloInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggio);

    return ctrEsito(messaggio, alObb);

  }

  /**
   * Controllo valori per la lettura del fascicolo.
   * 
   * @param loginAttr
   * @param codiceFascicolo
   * @param annoFascicolo
   * @param numeroFascicolo
   * @param messaggio
   * @return
   */
  public static boolean ctrFascicoloLeggi(WSDMLoginAttr loginAttr, String codiceFascicolo, Long annoFascicolo, String numeroFascicolo,
      StringBuffer messaggio) {
    ArrayList<String> alObb = new ArrayList<String>();
    if (codiceFascicolo == null) alObb.add(CTR_MESSAGE_CODICE_FASCICOLO);
    try {
      Integer.parseInt(codiceFascicolo);
    } catch (Exception e) {
      alObb.add(CTR_MESSAGE_CODICE_FASCICOLO_NUMERICO);
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
