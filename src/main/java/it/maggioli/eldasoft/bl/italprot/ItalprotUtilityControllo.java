package it.maggioli.eldasoft.bl.italprot;

import it.maggioli.eldasoft.ws.dm.WSDMInserimentoInFascicolo;
import it.maggioli.eldasoft.ws.dm.WSDMInviaMail;
import it.maggioli.eldasoft.ws.dm.WSDMLoginAttr;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloDocumentoIn;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloInOut;
import it.maggioli.eldasoft.ws.dm.WSDMRicercaFascicolo;

import java.util.ArrayList;

/**
 * Classe di utilita' a supporto delle richieste di protocollo e fascicolo.
 * 
 * 
 */
public class ItalprotUtilityControllo {

  static private final String CTR_MESSAGE                                  = "La richiesta non puo' essere inoltrata a causa dei seguenti controlli:";

  static private final String CTR_MESSAGE_OGGETTO                          = "valorizzare l'oggetto (protocolloDocumentoIn.oggetto)";
  static private final String CTR_MESSAGE_MITTENTE                         = "indicare almeno un mittente (protocolloDocumentoIn.mittenti)";
  static private final String CTR_MESSAGE_DESTINATARIO                     = "indicare almeno un destinatario (protocolloDocumentoIn.destinatari)";
  static private final String CTR_MESSAGE_ALLEGATO                         = "inserire almeno un allegato (protocolloDocumentoIn.allegati)";
  static private final String CTR_MESSAGE_IN_OUT                           = "definire il verso della protocollazione (protocolloDocumentoIn.inout)";
  static private final String CTR_MESSAGE_PROTOCOLLO_INT_NON_AMMESSA       = "non e' ammessa la protocollazione di tipo interno (INT) (protocolloDocumentoIn.inout)";
  static private final String CTR_MESSAGE_PROTOCOLLO_SOLO_INT_AMMESSA      = "e' ammessa solo la protocollazione di tipo interno (INT) (protocolloDocumentoIn.inout)";
  static private final String CTR_MESSAGE_FIRMA_SOLO_OUT_AMMESSA           = "per la richiesta di firma e' ammessa solo la protocollazione in uscita/partenza (OUT) (protocolloDocumentoIn.inout)";
  static private final String CTR_MESSAGE_CLASSIFICA                       = "valorizzare la classifica/titolario (protocolloDocumentoIn.classifica)";
  static private final String CTR_MESSAGE_MAIL_RIFERIMENTI                 = "valorizzare l'anno, il numero ed il verso del protocollo (inviaMail.annoProtocollo, inviaMail.numeroProtocollo)";
  static private final String CTR_MESSAGE_RICERCA_FASCICOLO                = "indicare la classifica/titolario e/o l'anno (ricercafascicolo.classificafascicolo e/o ricercafascicolo.annofascicolo)";
  static private final String CTR_MESSAGE_FASCICOLO_NUOVO                  = "la creazione contestuale di un nuovo fascicolo non e' ammessa (protocolloDocumentoIn.inserimentiInFascicolo)";
  static private final String CTR_MESSAGE_CODICE_FASCICOLO                 = "indicare il codice identificativo del fascicolo (protocolloDocumentoIn.fascicolo.codiceFascicolo)";
  static private final String CTR_MESSAGE_FIRMA_CODICE_SOGGETTO_FIRMATARIO = "indicare il codice soggetto firmatario (protocolloDocumentoIn.genericS41)";
  static private final String CTR_MESSAGE_FIRMA_CODICE_UFFICIO_FIRMATARIO  = "indicare il codice ufficio firmatario (protocolloDocumentoIn.genericS42)";
  static private final String CTR_FIRMA_VERIFICA_NUMERO_DOCUMENTO          = "indicare il numero documento";

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

    // Controllo verso di protocollazione, mittenti e destinatari
    if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
      if (wsdmprotocolloDocumentoIn.getMittenti() == null) alObb.add(CTR_MESSAGE_MITTENTE);
    } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      if (wsdmprotocolloDocumentoIn.getDestinatari() == null) alObb.add(CTR_MESSAGE_DESTINATARIO);
    } else if (WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      alObb.add(CTR_MESSAGE_PROTOCOLLO_INT_NON_AMMESSA);
    } else {
      alObb.add(CTR_MESSAGE_IN_OUT);
    }

    // Eventuale inserimento in un fascicolo, non e' disponibile la creazione
    // contestuale di un nuovo fascicolo
    if (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
      if (wsdmprotocolloDocumentoIn.getFascicolo() != null) {
        if (!isTestoValido(wsdmprotocolloDocumentoIn.getFascicolo().getCodiceFascicolo())) alObb.add(CTR_MESSAGE_CODICE_FASCICOLO);
      } else {
        alObb.add(CTR_MESSAGE_CODICE_FASCICOLO);
      }
    } else if (WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
      alObb.add(CTR_MESSAGE_FASCICOLO_NUOVO);
    }

    // Allegati
    if (wsdmprotocolloDocumentoIn.getAllegati() == null) {
      alObb.add(CTR_MESSAGE_ALLEGATO);
    }

    return ctrEsito(messaggio, alObb);

  }

  /**
   * Controllo dei dati in ingresso per il protocollo.
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

    // Controllo verso di protocollazione, non sono obbligatori mittenti e
    // destinatari
    if (!WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      alObb.add(CTR_MESSAGE_PROTOCOLLO_SOLO_INT_AMMESSA);
    }

    // Eventuale inserimento in un fascicolo, non e' disponibile la creazione
    // contestuale di un nuovo fascicolo
    if (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
      if (wsdmprotocolloDocumentoIn.getFascicolo() != null) {
        if (!isTestoValido(wsdmprotocolloDocumentoIn.getFascicolo().getCodiceFascicolo())) alObb.add(CTR_MESSAGE_CODICE_FASCICOLO);
      } else {
        alObb.add(CTR_MESSAGE_CODICE_FASCICOLO);
      }
    } else if (WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
      alObb.add(CTR_MESSAGE_FASCICOLO_NUOVO);
    }

    // Allegati
    if (wsdmprotocolloDocumentoIn.getAllegati() == null) {
      alObb.add(CTR_MESSAGE_ALLEGATO);
    }

    return ctrEsito(messaggio, alObb);

  }

  public static boolean ctrFirmaInserisci(WSDMLoginAttr loginAttr, WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn,
      StringBuffer messaggio) {
    ArrayList<String> alObb = new ArrayList<String>();

    // Oggetto
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getOggetto())) alObb.add(CTR_MESSAGE_OGGETTO);

    // Classifica
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getClassifica())) alObb.add(CTR_MESSAGE_CLASSIFICA);

    // Controllo verso di protocollazione, non sono obbligatori mittenti e
    // destinatari
    if (!WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      alObb.add(CTR_MESSAGE_FIRMA_SOLO_OUT_AMMESSA);
    }

    // Codice soggetto firmatario
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getGenericS41())) alObb.add(CTR_MESSAGE_FIRMA_CODICE_SOGGETTO_FIRMATARIO);

    // Codice ufficio firmatario
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getGenericS42())) alObb.add(CTR_MESSAGE_FIRMA_CODICE_UFFICIO_FIRMATARIO);

    // Eventuale inserimento in un fascicolo, non e' disponibile la creazione
    // contestuale di un nuovo fascicolo
    if (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
      if (wsdmprotocolloDocumentoIn.getFascicolo() != null) {
        if (!isTestoValido(wsdmprotocolloDocumentoIn.getFascicolo().getCodiceFascicolo())) alObb.add(CTR_MESSAGE_CODICE_FASCICOLO);
      } else {
        alObb.add(CTR_MESSAGE_CODICE_FASCICOLO);
      }
    } else if (WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
      alObb.add(CTR_MESSAGE_FASCICOLO_NUOVO);
    }
    
    // Allegati
    if (wsdmprotocolloDocumentoIn.getAllegati() == null) {
      alObb.add(CTR_MESSAGE_ALLEGATO);
    }

    return ctrEsito(messaggio, alObb);

  }

  /**
   * Controllo valori obbligatori per la verifica firma.
   * 
   * @param loginAttr
   * @param numeroDocumento
   * @param messaggio
   * @return
   */
  public static boolean ctrFirmaVerifica(WSDMLoginAttr loginAttr, String numeroDocumento, StringBuffer messaggio) {
    ArrayList<String> alObb = new ArrayList<String>();
    if (!isTestoValido(numeroDocumento)) alObb.add(CTR_FIRMA_VERIFICA_NUMERO_DOCUMENTO);
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

    if (!isTestoValido(wsdmInviaMail.getNumeroDocumento())) {
      if (wsdmInviaMail.getAnnoProtocollo() == null || !isTestoValido(wsdmInviaMail.getNumeroProtocollo())) {
        alObb.add(CTR_MESSAGE_MAIL_RIFERIMENTI);
      }
    }

    return ctrEsito(messaggio, alObb);
  }

  /**
   * Controlla i parametri di ricerca del fascicolo.
   * 
   * @param loginAttr
   * @param ricercaFascicolo
   * @param messaggio
   * @return
   */
  public static boolean ctrRicercaFascicolo(WSDMLoginAttr loginAttr, WSDMRicercaFascicolo ricercaFascicolo, StringBuffer messaggio) {
    ArrayList<String> alObb = new ArrayList<String>();

    if (!isTestoValido(ricercaFascicolo.getClassificaFascicolo()) && ricercaFascicolo.getAnnoFascicolo() == null) {
      alObb.add(CTR_MESSAGE_RICERCA_FASCICOLO);
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
