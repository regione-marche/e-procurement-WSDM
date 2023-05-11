package it.maggioli.eldasoft.bl.numix;

import java.util.ArrayList;

import it.maggioli.eldasoft.ws.dm.WSDMLoginAttr;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloAllegato;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloAnagrafica;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloDocumentoIn;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloInOut;

/**
 * Classe di utilita' a supporto delle richieste di protocollo e fascicolo.
 * 
 * 
 */
public class NumixUtilityControllo {

  static private final String CTR_MESSAGE                             = "La richiesta non puo' essere inoltrata a causa dei seguenti controlli:";

  static private final String CTR_MESSAGE_OGGETTO                     = "valorizzare l'oggetto (protocolloDocumentoIn.oggetto)";
  static private final String CTR_MESSAGE_MITTENTE                    = "indicare almeno un mittente (protocolloDocumentoIn.mittenti)";
  static private final String CTR_MESSAGE_MITTENTE_NOME               = "valorizzare la proprieta' 'nome' (protocolloDocumentoIn.mittenti.nome)";
  static private final String CTR_MESSAGE_MITTENTE_EMAIL              = "valorizzare la proprieta' 'email' (protocolloDocumentoIn.mittenti.email)";

  static private final String CTR_MESSAGE_DESTINATARIO                = "indicare almeno un destinatario (protocolloDocumentoIn.destinatari)";
  static private final String CTR_MESSAGE_DESTINATARIO_NOME           = "valorizzare la proprieta' 'nome'  (protocolloDocumentoIn.destinatari.nome)";
  static private final String CTR_MESSAGE_DESTINATARIO_EMAIL          = "valorizzare la proprieta' 'email' (protocolloDocumentoIn.destinatari.email)";

  static private final String CTR_MESSAGE_ALLEGATO                    = "inserire almeno un allegato (protocolloDocumentoIn.allegati)";
  static private final String CTR_MESSAGE_IN_OUT                      = "definire il verso della protocollazione (protocolloDocumentoIn.inout)";
  static private final String CTR_MESSAGE_PROTOCOLLO_INT_NON_AMMESSA  = "non e' ammessa la protocollazione di tipo interno (INT) (protocolloDocumentoIn.inout)";
  static private final String CTR_MESSAGE_PROTOCOLLO_SOLO_INT_AMMESSA = "e' ammessa solo la protocollazione di tipo interno (INT) (protocolloDocumentoIn.inout)";
  static private final String CTR_MESSAGE_CLASSIFICA                  = "valorizzare la classifica/titolario (protocolloDocumentoIn.classifica)";
  static private final String CTR_MESSAGE_MEZZO                       = "valorizzare il mezzo (protocolloDocumentoIn.mezzo)";

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

    // Classifica
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getClassifica())) alObb.add(CTR_MESSAGE_CLASSIFICA);

    // Mezzo
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getMezzo())) alObb.add(CTR_MESSAGE_MEZZO);

    // Controllo verso di protocollazione, mittenti e destinatari
    if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
      if (wsdmprotocolloDocumentoIn.getMittenti() == null) {
        alObb.add(CTR_MESSAGE_MITTENTE);
      } else {
        WSDMProtocolloAnagrafica[] mittenti = wsdmprotocolloDocumentoIn.getMittenti();
        if (mittenti.length > 0) {
          for (int mi = 0; mi < mittenti.length; mi++) {
            WSDMProtocolloAnagrafica mittente = mittenti[mi];

//            if (!isTestoValido(mittente.getNome()))
//              alObb.add("Mittente " + mittente.getCognomeointestazione() + " - " + CTR_MESSAGE_MITTENTE_NOME);
            if (!isTestoValido(mittente.getEmail()))
              alObb.add("Mittente " + mittente.getCognomeointestazione() + " - " + CTR_MESSAGE_MITTENTE_EMAIL);
          }
        }
      }

    } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      if (wsdmprotocolloDocumentoIn.getDestinatari() == null) {
        alObb.add(CTR_MESSAGE_DESTINATARIO);
      } else {
        WSDMProtocolloAnagrafica[] destinatari = wsdmprotocolloDocumentoIn.getDestinatari();
        if (destinatari.length > 0) {
          for (int de = 0; de < destinatari.length; de++) {
            WSDMProtocolloAnagrafica destinatario = destinatari[de];
//            if (!isTestoValido(destinatario.getNome()))
//              alObb.add("Destinatario " + destinatario.getCognomeointestazione() + " - " + CTR_MESSAGE_DESTINATARIO_NOME);
            if (!isTestoValido(destinatario.getEmail()))
              alObb.add("Destinatario " + destinatario.getCognomeointestazione() + " - " + CTR_MESSAGE_DESTINATARIO_EMAIL);
          }
        }
      }
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

    // Classifica
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getClassifica())) alObb.add(CTR_MESSAGE_CLASSIFICA);

    // Mezzo
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getMezzo())) alObb.add(CTR_MESSAGE_MEZZO);

    // Controllo verso di protocollazione, non sono obbligatori mittenti e
    // destinatari
    if (!WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      alObb.add(CTR_MESSAGE_PROTOCOLLO_SOLO_INT_AMMESSA);
    }

    // TODO: 21/12/2021 - dalle prove effettuate sembra che anche in ingresso
    // debbano essere indicati i 'Receivers' qui forniti con i 'Destinatari'
    if (wsdmprotocolloDocumentoIn.getDestinatari() == null) {
      alObb.add(CTR_MESSAGE_DESTINATARIO);
    } else {
      WSDMProtocolloAnagrafica[] destinatari = wsdmprotocolloDocumentoIn.getDestinatari();
      if (destinatari.length > 0) {
        for (int de = 0; de < destinatari.length; de++) {
          WSDMProtocolloAnagrafica destinatario = destinatari[de];
//          if (!isTestoValido(destinatario.getNome()))
//            alObb.add("Destinatario " + destinatario.getCognomeointestazione() + " - " + CTR_MESSAGE_DESTINATARIO_NOME);
          if (!isTestoValido(destinatario.getEmail()))
            alObb.add("Destinatario " + destinatario.getCognomeointestazione() + " - " + CTR_MESSAGE_DESTINATARIO_EMAIL);
        }
      }
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
