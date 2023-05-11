package it.maggioli.eldasoft.bl.jdoc;

import it.maggioli.eldasoft.ws.dm.WSDMFascicoloIn;
import it.maggioli.eldasoft.ws.dm.WSDMInserimentoInFascicolo;
import it.maggioli.eldasoft.ws.dm.WSDMInviaMail;
import it.maggioli.eldasoft.ws.dm.WSDMLoginAttr;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloDocumentoIn;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloInOut;

import java.util.ArrayList;

/**
 * Classe di utilita' a supporto delle richieste di protocollo e fascicolo.
 * 
 * 
 */
public class JDocUtilityControllo {

  static private final String CTR_MESSAGE                             = "La richiesta non puo' essere inoltrata a causa dei seguenti controlli:";

  static private final String CTR_MESSAGE_MITTENTE                    = "indicare almeno un mittente (protocolloDocumentoIn.mittenti)";
  static private final String CTR_MESSAGE_DESTINATARIO                = "indicare almeno un destinatario (protocolloDocumentoIn.destinatari)";
  static private final String CTR_MESSAGE_OGGETTO                     = "valorizzare l'oggetto (protocolloDocumentoIn.oggetto)";
  static private final String CTR_MESSAGE_IN_OUT                      = "definire il verso della protocollazione (protocolloDocumentoIn.inout)";
  static private final String CTR_MESSAGE_PROTOCOLLO_INT_NON_AMMESSA  = "non e' ammessa la protocollazione di tipo interno (INT) (protocolloDocumentoIn.inout)";
  static private final String CTR_MESSAGE_PROTOCOLLO_SOLO_INT_AMMESSA = "e' ammessa solo la protocollazione di tipo interno (INT) (protocolloDocumentoIn.inout)";
  static private final String CTR_MESSAGE_ALLEGATO                    = "inserire almeno un allegato (protocolloDocumentoIn.allegati)";
  static private final String CTR_MESSAGE_TIPO_DOCUMENTO              = "il tipo documento non e' valorizzato (protocolloDocumentoIn.tipoDocumento)";

  static private final String CTR_MESSAGE_FASCICOLO                   = "non e' possibile effettuare l'operazione senza indicare la fascicolazione";
  static private final String CTR_MESSAGE_FASCICOLO_CODICE            = "indicare il codice fascicolo (fascicoloIn.codiceFascicolo)";
  static private final String CTR_MESSAGE_FASCICOLO_OGGETTO           = "valorizzare l'oggetto (fascicoloIn.oggettoFascicolo)";
  static private final String CTR_MESSAGE_FASCICOLO_ACRONIMO_RUP      = "valorizzare l'acronimo RUP (fascicoloIn.genericS11)";
  static private final String CTR_MESSAGE_FASCICOLO_RUP               = "valorizzare il nome ed il cognome del RUP (fascicoloIn.genericS12)";

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

    // Controllo del tipo documento.
    // WSDM-77: il tipo documento viene passato da Appalti per la
    // protocollazioni in uscita (OUT) ed interne (INT)
    if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      if (!isTestoValido(wsdmprotocolloDocumentoIn.getTipoDocumento())) alObb.add(CTR_MESSAGE_TIPO_DOCUMENTO);
    } else if (WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      if (!isTestoValido(wsdmprotocolloDocumentoIn.getTipoDocumento())) alObb.add(CTR_MESSAGE_TIPO_DOCUMENTO);
    }

    // Mittenti e destinatari
    // WSDM-93 Nuovo tipo documento "CONTRATTO".
    // Se il tipo documento e' "CONTRATTO" non e' necessario controllare nulla.
    // Mittenti e destinatari sono obbligatori solo per tipo documento diverso
    // da "CONTRATTO".
    String tipoDocumento = wsdmprotocolloDocumentoIn.getTipoDocumento();
    if (!"CONTRATTO".equals(tipoDocumento)) {
      if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
        if (wsdmprotocolloDocumentoIn.getMittenti() == null) alObb.add(CTR_MESSAGE_MITTENTE);
      } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
        if (wsdmprotocolloDocumentoIn.getDestinatari() == null) alObb.add(CTR_MESSAGE_DESTINATARIO);
      } else if (WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
        alObb.add(CTR_MESSAGE_PROTOCOLLO_INT_NON_AMMESSA);
      } else {
        alObb.add(CTR_MESSAGE_IN_OUT);
      }
    }

    // Inserimento in un fascicolo
    if (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
      if (wsdmprotocolloDocumentoIn.getFascicolo() != null) {
        if (!isTestoValido(wsdmprotocolloDocumentoIn.getFascicolo().getCodiceFascicolo())) {
          alObb.add(CTR_MESSAGE_FASCICOLO_CODICE);
        }
      } else {
        alObb.add(CTR_MESSAGE_FASCICOLO_CODICE);
      }
    } else if (WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
      if (wsdmprotocolloDocumentoIn.getFascicolo() != null) {
        // Oggetto
        if (!isTestoValido(wsdmprotocolloDocumentoIn.getFascicolo().getOggettoFascicolo())) alObb.add(CTR_MESSAGE_FASCICOLO_OGGETTO);
        // Acronimo RUP
        if (!isTestoValido(wsdmprotocolloDocumentoIn.getFascicolo().getGenericS11())) alObb.add(CTR_MESSAGE_FASCICOLO_ACRONIMO_RUP);
        // Nome e cognome del RUP
        if (!isTestoValido(wsdmprotocolloDocumentoIn.getFascicolo().getGenericS12())) alObb.add(CTR_MESSAGE_FASCICOLO_RUP);
      } else {
        alObb.add(CTR_MESSAGE_FASCICOLO_OGGETTO);
        alObb.add(CTR_MESSAGE_FASCICOLO_ACRONIMO_RUP);
        alObb.add(CTR_MESSAGE_FASCICOLO_RUP);
      }
    } else {
      alObb.add(CTR_MESSAGE_FASCICOLO);
    }

    // Allegati
    if (wsdmprotocolloDocumentoIn.getAllegati() == null) alObb.add(CTR_MESSAGE_ALLEGATO);

    return ctrEsito(messaggio, alObb);

  }

  /**
   * Controllo dati in ingresso per il documentale.
   * 
   * @param loginAttr
   * @param wsdmprotocolloDocumentoIn
   * @param messaggio
   * @return
   */
  public static boolean ctrDocumentoInserisci(WSDMLoginAttr loginAttr, WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn,
      StringBuffer messaggio) {
    ArrayList<String> alObb = new ArrayList<String>();

    // Controllo verso di protocollazione, mittenti e destinatari
    if (WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {

    } else {
      alObb.add(CTR_MESSAGE_PROTOCOLLO_SOLO_INT_AMMESSA);
    }

    // Oggetto
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getOggetto())) alObb.add(CTR_MESSAGE_OGGETTO);

    // Controllo del tipo documento.
    // WSDM-77: il tipo documento viene passato da Appalti per la
    // protocollazioni in uscita (OUT) ed interne (INT)
    if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      if (!isTestoValido(wsdmprotocolloDocumentoIn.getTipoDocumento())) alObb.add(CTR_MESSAGE_TIPO_DOCUMENTO);
    } else if (WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      if (!isTestoValido(wsdmprotocolloDocumentoIn.getTipoDocumento())) alObb.add(CTR_MESSAGE_TIPO_DOCUMENTO);
    }

    // Inserimento in un fascicolo
    if (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
      if (wsdmprotocolloDocumentoIn.getFascicolo() != null) {
        if (!isTestoValido(wsdmprotocolloDocumentoIn.getFascicolo().getCodiceFascicolo())) {
          alObb.add(CTR_MESSAGE_FASCICOLO_CODICE);
        }
      } else {
        alObb.add(CTR_MESSAGE_FASCICOLO_CODICE);
      }
    } else if (WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
      if (wsdmprotocolloDocumentoIn.getFascicolo() != null) {
        // Oggetto
        if (!isTestoValido(wsdmprotocolloDocumentoIn.getFascicolo().getOggettoFascicolo())) alObb.add(CTR_MESSAGE_FASCICOLO_OGGETTO);
        // // Acronimo RUP
        // if
        // (!isTestoValido(wsdmprotocolloDocumentoIn.getFascicolo().getGenericS11()))
        // alObb.add(CTR_MESSAGE_FASCICOLO_ACRONIMO_RUP);
        // // Nome e cognome del RUP
        // if
        // (!isTestoValido(wsdmprotocolloDocumentoIn.getFascicolo().getGenericS12()))
        // alObb.add(CTR_MESSAGE_FASCICOLO_RUP);
      } else {
        alObb.add(CTR_MESSAGE_FASCICOLO_OGGETTO);
        // alObb.add(CTR_MESSAGE_FASCICOLO_ACRONIMO_RUP);
        // alObb.add(CTR_MESSAGE_FASCICOLO_RUP);
      }
    } else {
      alObb.add(CTR_MESSAGE_FASCICOLO);
    }

    // Allegati
    if (wsdmprotocolloDocumentoIn.getAllegati() == null) alObb.add(CTR_MESSAGE_ALLEGATO);

    return ctrEsito(messaggio, alObb);

  }

  /**
   * Controllo valori in ingresso per la richiesta _protocolloLeggi.
   * 
   * @param loginAttr
   * @param annoProtocollo
   * @param numeroProtocollo
   * @param messaggio
   * @return
   */
  public static boolean ctrProtocolloLeggi(WSDMLoginAttr loginAttr, Long annoProtocollo, String numeroProtocollo, StringBuffer messaggio) {
    ArrayList<String> alObb = new ArrayList<String>();

    return ctrEsito(messaggio, alObb);
  }

  /**
   * Controllo valori in ingresso per la richiesta _fascicoloInserisci.
   * 
   * @param loginAttr
   * @param wsdmprotocolloFascicoloIn
   * @param messaggio
   * @return
   */
  public static boolean ctrFascicoloInserisci(WSDMLoginAttr loginAttr, WSDMFascicoloIn wsdmprotocolloFascicoloIn, StringBuffer messaggio) {
    ArrayList<String> alObb = new ArrayList<String>();

    // Oggetto
    if (!isTestoValido(wsdmprotocolloFascicoloIn.getOggettoFascicolo())) alObb.add(CTR_MESSAGE_FASCICOLO_OGGETTO);

    // // Acronimo RUP
    // if (!isTestoValido(wsdmprotocolloFascicoloIn.getGenericS11()))
    // alObb.add(CTR_MESSAGE_FASCICOLO_ACRONIMO_RUP);
    //
    // // Nome e cognome del RUP
    // if (!isTestoValido(wsdmprotocolloFascicoloIn.getGenericS12()))
    // alObb.add(CTR_MESSAGE_FASCICOLO_RUP);

    return ctrEsito(messaggio, alObb);

  }

  /**
   * Controllo valori in ingresso per la richiesta _fascicoloLeggi.
   * 
   * @param login
   * @param codiceFascicolo
   * @param annoFascicolo
   * @param numeroFascicolo
   * @param classificaFascicolo
   * @return
   */
  public static boolean ctrFascicoloLeggi(WSDMLoginAttr loginAttr, String codiceFascicolo, Long annoFascicolo, String numeroFascicolo,
      String classificaFascicolo, StringBuffer messaggio) {
    ArrayList<String> alObb = new ArrayList<String>();

    return ctrEsito(messaggio, alObb);
  }

  /**
   * Controlla valori obbligatori per l'invio mail.
   * 
   * @param loginAttr
   * @param wsdmInviaMail
   * @param messaggio
   * @return
   */
  public static boolean ctrInviaMail(WSDMLoginAttr loginAttr, WSDMInviaMail wsdmInviaMail, StringBuffer messaggio) {
    ArrayList<String> alObb = new ArrayList<String>();

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
