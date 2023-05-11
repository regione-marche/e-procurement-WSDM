package it.maggioli.eldasoft.bl.datagraph;

import java.util.ArrayList;

import it.maggioli.eldasoft.ws.dm.WSDMFascicolo;
import it.maggioli.eldasoft.ws.dm.WSDMFascicoloIn;
import it.maggioli.eldasoft.ws.dm.WSDMInserimentoInFascicolo;
import it.maggioli.eldasoft.ws.dm.WSDMInviaMail;
import it.maggioli.eldasoft.ws.dm.WSDMLoginAttr;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloDocumentoIn;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloInOut;

/**
 * Classe di utilita' a supporto delle richieste di protocollo e fascicolo.
 * 
 * 
 */
public class DatagraphUtilityControllo {

  static private final String CTR_MESSAGE                                = "La richiesta non puo' essere inoltrata a causa dei seguenti controlli:";

  static private final String CTR_MESSAGE_OGGETTO                        = "valorizzare l'oggetto (protocolloDocumentoIn.oggetto)";
  static private final String CTR_MESSAGE_MITTENTE                       = "indicare almeno un mittente (protocolloDocumentoIn.mittenti)";
  static private final String CTR_MESSAGE_DESTINATARIO                   = "indicare almeno un destinatario (protocolloDocumentoIn.destinatari)";
  static private final String CTR_MESSAGE_ALLEGATO                       = "inserire almeno un allegato (protocolloDocumentoIn.allegati)";
  static private final String CTR_MESSAGE_IN_OUT                         = "definire il verso della protocollazione (protocolloDocumentoIn.inout)";
  static private final String CTR_MESSAGE_PROTOCOLLO_INT_NON_AMMESSA     = "non e' ammessa la protocollazione di tipo interno (INT) (protocolloDocumentoIn.inout)";
  static private final String CTR_MESSAGE_PROTOCOLLO_SOLO_INT_AMMESSA    = "e' ammessa solo la protocollazione di tipo interno (INT) (protocolloDocumentoIn.inout)";
  static private final String CTR_MESSAGE_CLASSIFICA                     = "valorizzare la classifica/titolario (protocolloDocumentoIn.classifica)";
  static private final String CTR_MESSAGE_ANNO_FASCICOLO                 = "valorizzare l'anno del fascicolo (protocolloDocumentoIn.fascicolo.annoFascicolo)";
  static private final String CTR_MESSAGE_NUMERO_FASCICOLO               = "valorizzare il numero del fascicolo (protocolloDocumentoIn.fascicolo.numeroFascicolo)";
  static private final String CTR_MESSAGE_UO_MITTENTE                    = "valorizzare l'unita' organizzativa/unita' di smistamento mittente (protocolloDocumentoIn.IdUnitaOperativaMittente)";
  static private final String CTR_MESSAGE_UO_DESTINATARIA                = "valorizzare l'unita' organizzativa/unita' di smistamento destinataria (protocolloDocumentoIn.IdUnitaOperativaDestinataria)";
  static private final String CTR_MESSAGE_STRUTTURA                      = "valorizzare il codice dell'unita' protocollante/unita' di competenza (protocolloDocumentoIn.Struttura)";

  static private final String CTR_MESSAGE_LEGGI_PROTOCOLLO_ANNO          = "valorizzare l'anno del protocollo";
  static private final String CTR_MESSAGE_LEGGI_PROTOCOLLO_NUMERO        = "valorizzare il numero di protocollo";
  static private final String CTR_MESSAGE_LEGGI_DOCUMENTO_NUMERO         = "valorizzare il numero di documento";
  static private final String CTR_MESSAGE_LEGGI_DOCUMENTO_NUMERO_FORMATO = "il numero di documento non rispetta il formato previsto (anno/numero)";

  static private final String CTR_MESSAGE_FASCICOLO_OGGETTO              = "valorizzare l'oggetto del fascicolo (fascicoloIn.oggettoFascicolo)";
  static private final String CTR_MESSAGE_FASCICOLO_CLASSIFICA           = "valorizzare la classifica/titolario del fascicolo (fascicoloIn.classificaFascicolo)";
  static private final String CTR_MESSAGE_FASCICOLO_STRUTTURA            = "valorizzare il codice dell'unita' protocollante/unita' di competenza (fascicoloIn.Struttura)";

  static private final String CTR_MESSAGE_LEGGI_FASCICOLO_ANNO           = "valorizzare l'anno del fascicolo";
  static private final String CTR_MESSAGE_LEGGI_FASCICOLO_NUMERO         = "valorizzare il numero del fascicolo";
  static private final String CTR_MESSAGE_LEGGI_FASCICOLO_CLASSIFICA     = "valorizzare la classifica del fascicolo";
  
  static private final String CTR_MESSAGE_MAIL_RIFERIMENTI               = "valorizzare il numero documento oppure l'anno ed il numero protocollo (inviaMail.numeroDocumento oppure inviaMail.annoProtocollo e inviaMail.numeroProtocollo)";

  static private final String CTR_MESSAGE_FASCICOLO                      = "e' stato richiesto l'inserimento senza fascicolazione (la fascicolazione e' obbligatoria)";
  
  static private final String CTR_MESSAGE_MAIL_DESTINATARIO              = "indicare l'email del destinatario (wsdmInviaMail.destinatariMail)";

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

    // Codice UO della sezione attributi di connessione: si tratta dell'unita'
    // protocollante
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getStruttura())) alObb.add(CTR_MESSAGE_STRUTTURA);

    // Oggetto
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getOggetto())) alObb.add(CTR_MESSAGE_OGGETTO);

    // Classifica
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getClassifica())) alObb.add(CTR_MESSAGE_CLASSIFICA);

    // Controllo verso di protocollazione, mittenti e destinatari
    if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
      if (!isTestoValido(wsdmprotocolloDocumentoIn.getIdUnitaOperativaDestinataria())) alObb.add(CTR_MESSAGE_UO_DESTINATARIA);
      if (wsdmprotocolloDocumentoIn.getMittenti() == null) alObb.add(CTR_MESSAGE_MITTENTE);
    } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      if (!isTestoValido(wsdmprotocolloDocumentoIn.getIdUnitaOperativaMittente())) alObb.add(CTR_MESSAGE_UO_MITTENTE);
      if (wsdmprotocolloDocumentoIn.getDestinatari() == null) alObb.add(CTR_MESSAGE_DESTINATARIO);
    } else if (WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      alObb.add(CTR_MESSAGE_PROTOCOLLO_INT_NON_AMMESSA);
    } else {
      alObb.add(CTR_MESSAGE_IN_OUT);
    }

    // Fascicolo
    if (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
      WSDMFascicolo wsdmFascicolo = wsdmprotocolloDocumentoIn.getFascicolo();
      if (wsdmFascicolo == null) {
        alObb.add(CTR_MESSAGE_ANNO_FASCICOLO);
        alObb.add(CTR_MESSAGE_NUMERO_FASCICOLO);
      } else {
        if (wsdmFascicolo.getAnnoFascicolo() == null) alObb.add(CTR_MESSAGE_ANNO_FASCICOLO);
        if (!isTestoValido(wsdmFascicolo.getNumeroFascicolo())) alObb.add(CTR_MESSAGE_NUMERO_FASCICOLO);
      }
    } else if (WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
      WSDMFascicolo wsdmFascicolo = wsdmprotocolloDocumentoIn.getFascicolo();
      if (wsdmFascicolo == null) {
        alObb.add(CTR_MESSAGE_FASCICOLO_CLASSIFICA);
        alObb.add(CTR_MESSAGE_FASCICOLO_OGGETTO);
        alObb.add(CTR_MESSAGE_FASCICOLO_STRUTTURA);
      } else {
        if (!isTestoValido(wsdmFascicolo.getClassificaFascicolo())) alObb.add(CTR_MESSAGE_FASCICOLO_CLASSIFICA);
        if (!isTestoValido(wsdmFascicolo.getOggettoFascicolo())) alObb.add(CTR_MESSAGE_FASCICOLO_OGGETTO);
        if (!isTestoValido(wsdmFascicolo.getStruttura())) alObb.add(CTR_MESSAGE_FASCICOLO_STRUTTURA);
      }
    } else {
      alObb.add(CTR_MESSAGE_FASCICOLO);
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

    // Codice UO della sezione attributi di connessione: si tratta dell'unita'
    // protocollante
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getStruttura())) alObb.add(CTR_MESSAGE_STRUTTURA);

    // Oggetto
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getOggetto())) alObb.add(CTR_MESSAGE_OGGETTO);

    // Classifica
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getClassifica())) alObb.add(CTR_MESSAGE_CLASSIFICA);

    // Controllo verso di protocollazione, mittenti e destinatari
    if (WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      if (!isTestoValido(wsdmprotocolloDocumentoIn.getIdUnitaOperativaMittente())) alObb.add(CTR_MESSAGE_UO_MITTENTE);
      if (!isTestoValido(wsdmprotocolloDocumentoIn.getIdUnitaOperativaDestinataria())) alObb.add(CTR_MESSAGE_UO_DESTINATARIA);
    } else {
      alObb.add(CTR_MESSAGE_PROTOCOLLO_SOLO_INT_AMMESSA);
    }

    // Fascicolo
    if (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
      WSDMFascicolo wsdmFascicolo = wsdmprotocolloDocumentoIn.getFascicolo();
      if (wsdmFascicolo == null) {
        alObb.add(CTR_MESSAGE_ANNO_FASCICOLO);
        alObb.add(CTR_MESSAGE_NUMERO_FASCICOLO);
      } else {
        if (wsdmFascicolo.getAnnoFascicolo() == null) alObb.add(CTR_MESSAGE_ANNO_FASCICOLO);
        if (!isTestoValido(wsdmFascicolo.getNumeroFascicolo())) alObb.add(CTR_MESSAGE_NUMERO_FASCICOLO);
      }
    } else if (WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
      WSDMFascicolo wsdmFascicolo = wsdmprotocolloDocumentoIn.getFascicolo();
      if (wsdmFascicolo == null) {
        alObb.add(CTR_MESSAGE_FASCICOLO_CLASSIFICA);
        alObb.add(CTR_MESSAGE_FASCICOLO_OGGETTO);
        alObb.add(CTR_MESSAGE_FASCICOLO_STRUTTURA);
      } else {
        if (!isTestoValido(wsdmFascicolo.getClassificaFascicolo())) alObb.add(CTR_MESSAGE_FASCICOLO_CLASSIFICA);
        if (!isTestoValido(wsdmFascicolo.getOggettoFascicolo())) alObb.add(CTR_MESSAGE_FASCICOLO_OGGETTO);
        if (!isTestoValido(wsdmFascicolo.getStruttura())) alObb.add(CTR_MESSAGE_FASCICOLO_STRUTTURA);
      }
    } else {
      alObb.add(CTR_MESSAGE_FASCICOLO);
    }

    // Allegati
    if (wsdmprotocolloDocumentoIn.getAllegati() == null) {
      alObb.add(CTR_MESSAGE_ALLEGATO);
    }

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
    if (annoProtocollo == null) alObb.add(CTR_MESSAGE_LEGGI_PROTOCOLLO_ANNO);
    if (!isTestoValido(numeroProtocollo)) alObb.add(CTR_MESSAGE_LEGGI_PROTOCOLLO_NUMERO);
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
    if (!isTestoValido(numeroDocumento)) {
      alObb.add(CTR_MESSAGE_LEGGI_DOCUMENTO_NUMERO);
    } else {
      // Il numero documento e' un numero fittizio (non restituito dal
      // protocollo) composto dall'anno e dal numero di protocollo
      // (per esempio 2022/04)
      String[] numeroDocumentSplit = numeroDocumento.split("\\/");
      if (numeroDocumentSplit.length != 2) {
        alObb.add(CTR_MESSAGE_LEGGI_DOCUMENTO_NUMERO_FORMATO);
      } else {
        if (!isNumber(numeroDocumentSplit[0]) || !isNumber(numeroDocumentSplit[1])) {
          alObb.add(CTR_MESSAGE_LEGGI_DOCUMENTO_NUMERO_FORMATO);
        }
      }
    }
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

    // Codice UO della sezione attributi di connessione: si tratta dell'unita'
    // protocollante
    if (!isTestoValido(wsdmprotocolloFascicoloIn.getStruttura())) alObb.add(CTR_MESSAGE_FASCICOLO_STRUTTURA);

    // Oggetto
    if (!isTestoValido(wsdmprotocolloFascicoloIn.getOggettoFascicolo())) alObb.add(CTR_MESSAGE_FASCICOLO_OGGETTO);

    // Classifica
    if (!isTestoValido(wsdmprotocolloFascicoloIn.getClassificaFascicolo())) alObb.add(CTR_MESSAGE_FASCICOLO_CLASSIFICA);

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
    if (annoFascicolo == null) alObb.add(CTR_MESSAGE_LEGGI_FASCICOLO_ANNO);
    if (!isTestoValido(numeroFascicolo)) alObb.add(CTR_MESSAGE_LEGGI_FASCICOLO_NUMERO);
    if (!isTestoValido(classificaFascicolo)) alObb.add(CTR_MESSAGE_LEGGI_FASCICOLO_CLASSIFICA);
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
    } else {
      // Il numero documento e' un numero fittizio (non restituito dal
      // protocollo) composto dall'anno e dal numero di protocollo
      // (per esempio 2022/04)
      String[] numeroDocumentSplit = wsdmInviaMail.getNumeroDocumento().split("\\/");
      if (numeroDocumentSplit.length != 2) {
        alObb.add(CTR_MESSAGE_LEGGI_DOCUMENTO_NUMERO_FORMATO);
      } else {
        if (!isNumber(numeroDocumentSplit[0]) || !isNumber(numeroDocumentSplit[1])) {
          alObb.add(CTR_MESSAGE_LEGGI_DOCUMENTO_NUMERO_FORMATO);
        }
      }
    }
    
    if (wsdmInviaMail.getDestinatariMail() == null) alObb.add(CTR_MESSAGE_MAIL_DESTINATARIO);
    
    return ctrEsito(messaggio, alObb);
  }

  /**
   * Controllo valori in ingresso per la richiesta _leggiClassifiche
   * 
   * @param loginAttr
   * @param codice
   * @param descrizione
   * @param messaggio
   * @return
   */
  public static boolean ctrLeggiClassifiche(WSDMLoginAttr loginAttr, String codice, String descrizione, StringBuffer messaggio) {
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

  public static boolean isNumber(String s) {
    try {
      new Long(s);
    } catch (NumberFormatException e) {
      return false;
    } catch (NullPointerException e) {
      return false;
    }
    return true;
  }

}
