package it.maggioli.eldasoft.bl.engineering;

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
public class EngineeringUtilityControllo {

  static private final String CTR_MESSAGE                           = "La richiesta non puo' essere inoltrata a causa dei seguenti controlli:";
  static private final String CTR_MESSAGE_ID_UTENTE                 = "valorizzare l'identificativo dell'utente";
  static private final String CTR_MESSAGE_ID_UTENTE_UNITA           = "valorizzare l'identificativo dell'unita' operativa dell'utente";
  static private final String CTR_MESSAGE_ID_UO_MITTENTE            = "valorizzare l'identificativo dell'unita' operativa mittente (di provenienza)";
  static private final String CTR_MESSAGE_ID_UO_DESTINATARIA        = "valorizzare l'identificativo dell'unita' operativa destinataria";
  static private final String CTR_MESSAGE_ANNO_PROTOCOLLO           = "valorizzare l'anno del protocollo";
  static private final String CTR_MESSAGE_NUMERO_PROTOCOLLO         = "valorizzare il numero di protocollo";
  static private final String CTR_MESSAGE_NUMERO_PROTOCOLLO_FORMATO = "il numero protocollo non rispetta il formato previsto (tipo/anno/numero)";
  static private final String CTR_MESSAGE_DATA_DOCUMENTO            = "valorizzare la data del documento";
  static private final String CTR_MESSAGE_OGGETTO_DOCUMENTO         = "valorizzare l'oggetto del documento";
  static private final String CTR_MESSAGE_IDINDICE                  = "valorizzare l'identificativo univoco dell'indice dell'originale";
  static private final String CTR_MESSAGE_IDTITOLAZIONE             = "valorizzare l'identificativo univoco della titolazione dell'originale";
  static private final String CTR_MESSAGE_FASCICOLO                 = "per la protocollazione in uscita e' necessario indicare il fascicolo";
  static private final String CTR_MESSAGE_MITTENTE                  = "indicare almeno un mittente";
  static private final String CTR_MESSAGE_DESTINATARIO              = "indicare almeno un destinatario";
  static private final String CTR_MESSAGE_ALLEGATO                  = "inserire almeno un allegato";
  static private final String CTR_MESSAGE_ANNO_FASCICOLO            = "valorizzare l'anno del fascicolo";
  static private final String CTR_MESSAGE_NUMERO_FASCICOLO          = "valorizzare il numero fascicolo";
  static private final String CTR_MESSAGE_OGGETTO_FASCICOLO         = "valorizzare l'oggetto del fascicolo";
  static private final String CTR_MESSAGE_CLASSIFICA_FASCICOLO      = "valorizzare la classifica (titolazione) del fascicolo";

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
    ctrLoginAttrExt(loginAttr, alObb);

    if (wsdmprotocolloDocumentoIn.getData() == null) alObb.add(CTR_MESSAGE_DATA_DOCUMENTO);
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getOggetto())) alObb.add(CTR_MESSAGE_OGGETTO_DOCUMENTO);
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getIdIndice())) alObb.add(CTR_MESSAGE_IDINDICE);
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getIdTitolazione())) alObb.add(CTR_MESSAGE_IDTITOLAZIONE);

    // La protocollazione in uscita richiedere obbligatoriamente l'indicazione
    // del fascicolo.
    if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      if (WSDMInserimentoInFascicolo.NO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
        alObb.add(CTR_MESSAGE_FASCICOLO);
      } else if (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
        if (wsdmprotocolloDocumentoIn.getFascicolo() == null) {
          alObb.add(CTR_MESSAGE_ANNO_FASCICOLO);
          alObb.add(CTR_MESSAGE_NUMERO_FASCICOLO);
        } else {
          Long annoFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getAnnoFascicolo();
          String numeroFascicolo = wsdmprotocolloDocumentoIn.getFascicolo().getNumeroFascicolo();
          if (annoFascicolo == null) alObb.add(CTR_MESSAGE_ANNO_FASCICOLO);
          if (!isTestoValido(numeroFascicolo)) alObb.add(CTR_MESSAGE_NUMERO_FASCICOLO);
        }
      }
    }

    // Mittenti/destinatari in funzione del verso:
    // - protocollo in ingresso: sono obbligatori almeno un mittente (esterno) e
    // l'identificativo dell'unita' operativa destinataria
    // - protocollo in uscita: sono obbligatori almeno un destinatario (esterno)
    // e l'identificativo dell'unita' operativa mittente
    // - protocollo interno (tra uffici): sono obbligatori l'identificativo
    // dell'unita' operativa mittente e dell'unita' operativa destinataria
    if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
      if (wsdmprotocolloDocumentoIn.getMittenti() == null) alObb.add(CTR_MESSAGE_MITTENTE);
      if (wsdmprotocolloDocumentoIn.getIdUnitaOperativaDestinataria() == null) alObb.add(CTR_MESSAGE_ID_UO_DESTINATARIA);
    } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      if (wsdmprotocolloDocumentoIn.getDestinatari() == null) alObb.add(CTR_MESSAGE_DESTINATARIO);
      if (wsdmprotocolloDocumentoIn.getIdUnitaOperativaMittente() == null) alObb.add(CTR_MESSAGE_ID_UO_MITTENTE);
    } else if (WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      if (wsdmprotocolloDocumentoIn.getIdUnitaOperativaMittente() == null) alObb.add(CTR_MESSAGE_ID_UO_MITTENTE);
      if (wsdmprotocolloDocumentoIn.getIdUnitaOperativaDestinataria() == null) alObb.add(CTR_MESSAGE_ID_UO_DESTINATARIA);
    }

    // Presenza allegati
    if (wsdmprotocolloDocumentoIn.getAllegati() == null) alObb.add(CTR_MESSAGE_ALLEGATO);

    return ctrEsito(messaggio, alObb);
  }

  /**
   * Controllo valori in ingresso per la richiesta _protocolloLeggi.
   * 
   * @param login
   * @param annoProtocollo
   * @param numeroProtocollo
   * @param messaggio
   * @return
   */
  public static boolean ctrProtocolloLeggi(WSDMLoginAttr loginAttr, Long annoProtocollo, String numeroProtocollo, StringBuffer messaggio) {
    ArrayList<String> alObb = new ArrayList<String>();
    ctrLoginAttrExt(loginAttr, alObb);
    if (annoProtocollo == null) alObb.add(CTR_MESSAGE_ANNO_PROTOCOLLO);
    if (!isTestoValido(numeroProtocollo)) alObb.add(CTR_MESSAGE_NUMERO_PROTOCOLLO);
    
    if (!isTestoValido(numeroProtocollo)) {
      alObb.add(CTR_MESSAGE_NUMERO_PROTOCOLLO);
    } else {
      // Il numero protocollo deve essere una stringa complessa costituita da
      // tipo, anno e numero, separatati dal carattere "/" (per esempio
      // PG/2016/345).
      String estremiProtocollo[] = numeroProtocollo.split("/");
      if (estremiProtocollo.length == 3) {
        if (!isTestoValido(estremiProtocollo[0]) || !isTestoValido(estremiProtocollo[1]) || !isTestoValido(estremiProtocollo[2])) {
          alObb.add(CTR_MESSAGE_NUMERO_PROTOCOLLO_FORMATO);
        }
      } else {
        alObb.add(CTR_MESSAGE_NUMERO_PROTOCOLLO_FORMATO);
      }
    }

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
    ctrLoginAttrExt(loginAttr, alObb);
    if (annoFascicolo == null) alObb.add(CTR_MESSAGE_ANNO_FASCICOLO);
    if (!isTestoValido(numeroFascicolo)) alObb.add(CTR_MESSAGE_NUMERO_FASCICOLO);
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
    ctrLoginAttrExt(loginAttr, alObb);
    if (!isTestoValido(wsdmfascicoloIn.getOggettoFascicolo())) alObb.add(CTR_MESSAGE_OGGETTO_FASCICOLO);
    if (!isTestoValido(wsdmfascicoloIn.getClassificaFascicolo())) alObb.add(CTR_MESSAGE_CLASSIFICA_FASCICOLO);
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
   * Controllo valori obbligatori per l'oggetto Login.
   * 
   * @param login
   * @param alObb
   */
  public static void ctrLoginAttr(WSDMLoginAttr loginAttr, ArrayList<String> alObb) {
    if (loginAttr == null) {
      alObb.add(CTR_MESSAGE_ID_UTENTE);
    } else {
      if (loginAttr.getLoginEngAttr() == null) {
        alObb.add(CTR_MESSAGE_ID_UTENTE);
      } else if (!isTestoValido(loginAttr.getLoginEngAttr().getIdUtente())) {
        alObb.add(CTR_MESSAGE_ID_UTENTE);
      }
    }
  }

  /**
   * Controllo esteso valori obbligatori per l'oggetto login
   * 
   * @param loginAttr
   * @param alObb
   */
  public static void ctrLoginAttrExt(WSDMLoginAttr loginAttr, ArrayList<String> alObb) {
    if (loginAttr == null) {
      alObb.add(CTR_MESSAGE_ID_UTENTE);
    } else {
      if (loginAttr.getLoginEngAttr() == null) {
        alObb.add(CTR_MESSAGE_ID_UTENTE);
        alObb.add(CTR_MESSAGE_ID_UTENTE_UNITA);
      } else {
        if (!isTestoValido(loginAttr.getLoginEngAttr().getIdUtente())) alObb.add(CTR_MESSAGE_ID_UTENTE);
        if (!isTestoValido(loginAttr.getLoginEngAttr().getIdUtenteUnitaOperativa())) alObb.add(CTR_MESSAGE_ID_UTENTE_UNITA);
      }
    }
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
