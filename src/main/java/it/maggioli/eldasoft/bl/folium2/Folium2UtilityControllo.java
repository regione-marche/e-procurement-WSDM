package it.maggioli.eldasoft.bl.folium2;

import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import it.maggioli.eldasoft.ws.dm.WSDMLoginAttr;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloAllegato;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloDocumentoIn;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloInOut;

/**
 * Classe di utilita' a supporto delle richieste di protocollo e fascicolo.
 * 
 * 
 */
public class Folium2UtilityControllo {

  static private final String CTR_MESSAGE                            = "La richiesta non puo' essere inoltrata a causa dei seguenti controlli:";

  static private final String CTR_MESSAGE_MITTENTE                   = "inserire almeno un mittente";
  static private final String CTR_MESSAGE_DESTINATARIO               = "inserire almeno un destinatario";
  static private final String CTR_MESSAGE_ALLEGATO                   = "inserire almeno un allegato";
  static private final String CTR_MESSAGE_ALLEGATO_NOME              = "inserire il nome di tutti gli allegati";
  static private final String CTR_MESSAGE_ALLEGATO_CONTENUTO         = "inserire il contenuto di tutti gli allegati";
  static private final String CTR_MESSAGE_PROTOCOLLO_INT_NON_AMMESSA = "non e' ammessa la protocollazione di tipo interno (INT)";
  static private final String CTR_MESSAGE_CLASSIFICA                 = "indicare la classifica";

  static private String       FOLIUM2_ESEGUI_SALVA_DOCUMENTO         = "java:comp/env/FOLIUM2_ESEGUI_SALVA_DOCUMENTO";
  static public final String  ESEGUI_SALVA_DOCUMENTO_SI              = "SI";

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

    // Mittenti/destinatari in funzione del verso
    if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
      if (wsdmprotocolloDocumentoIn.getMittenti() == null) {
        alObb.add(CTR_MESSAGE_MITTENTE);
      }
    } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      if (wsdmprotocolloDocumentoIn.getDestinatari() == null) {
        alObb.add(CTR_MESSAGE_DESTINATARIO);
      }
    } else {
      alObb.add(CTR_MESSAGE_PROTOCOLLO_INT_NON_AMMESSA);
    }

    // Classifica/Titolario di classificazione
    if (wsdmprotocolloDocumentoIn.getClassifica() == null) {
      alObb.add(CTR_MESSAGE_CLASSIFICA);
    }

    // Allegato
    // Controllo esecuzione "salva documento". Di default si assume che
    // l'inserimento dei documenti venga sempre effettuato. La nuova proprieta'
    // non e' obbligatoria, se non presente si assume di default "SI". Se
    // presente si legge il valore.
    String eseguiSalvaDocumento = "SI";

    // Tentativo di lettura del valore di FOLIUM2_ESEGUI_SALVA_DOCUMENTO
    try {
      eseguiSalvaDocumento = InitialContext.doLookup(FOLIUM2_ESEGUI_SALVA_DOCUMENTO);
    } catch (NamingException e) {

    }

    // Inserimento degli allegati
    if (ESEGUI_SALVA_DOCUMENTO_SI.equals(eseguiSalvaDocumento.toUpperCase())) {
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
