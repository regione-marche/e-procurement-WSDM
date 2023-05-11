package it.maggioli.eldasoft.bl.infor;

import java.util.ArrayList;

import it.maggioli.eldasoft.ws.dm.WSDMFascicolo;
import it.maggioli.eldasoft.ws.dm.WSDMFascicoloIn;
import it.maggioli.eldasoft.ws.dm.WSDMInserimentoInFascicolo;
import it.maggioli.eldasoft.ws.dm.WSDMInviaMail;
import it.maggioli.eldasoft.ws.dm.WSDMLoginAttr;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloAnagrafica;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloDocumentoIn;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloInOut;

/**
 * Classe di utilita' a supporto delle richieste di protocollo e fascicolo.
 * 
 * 
 */
public class Infor2UtilityControllo {

  static private final String CTR_MESSAGE                      = "La richiesta non puo' essere inoltrata a causa dei seguenti controlli: ";
  static private final String CTR_MESSAGE_CODICE_FASCICOLO     = "valorizzare il codice del fascicolo (fascicoloIn.codiceFascicolo)";
  static private final String CTR_MESSAGE_NUMERO_FASCICOLO     = "valorizzare il numero del fascicolo (fascicoloIn.numeroFascicolo)";
  static private final String CTR_MESSAGE_ANNO_FASCICOLO       = "valorizzare l'anno del fascicolo (fascicoloIn.annoFascicolo)";
  static private final String CTR_MESSAGE_CLASSIFICA_FASCICOLO = "valorizzare la classifica del fascicolo (fascicoloIn.classificaFascicolo)";
  static private final String CTR_MESSAGE_OGGETTO_FASCICOLO    = "valorizzare l'oggetto del fascicolo (fascicoloIn.oggettoFascicolo)";
  static private final String CTR_MESSAGE_MITTENTE             = "inserire il mittente (protocolloDocumentoIn.mittenti)";
  static private final String CTR_MESSAGE_MITTENTE_PIU         = "inserire un solo mittente (protocolloDocumentoIn.mittenti)";
  static private final String CTR_MESSAGE_DESTINATARIO         = "inserire almeno un destinatario (protocolloDocumentoIn.destinatari)";
  static private final String CTR_MESSAGE_ALLEGATO             = "inserire almeno un allegato (protocolloDocumentoIn.allegati)";
  static private final String CTR_MESSAGE_FASCICOLO            = "non e' possibile effettuare l'operazione senza indicare la fascicolazione";
  static private final String CTR_MESSAGE_MAIL_RIFERIMENTI     = "valorizzare l'anno ed il numero protocollo (inviaMail.annoProtocollo e inviaMail.numeroProtocollo)";


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
      } else {
        WSDMProtocolloAnagrafica[] mittenti = wsdmprotocolloDocumentoIn.getMittenti();
        if (mittenti != null && mittenti.length > 1) {
          alObb.add(CTR_MESSAGE_MITTENTE_PIU);
        }
      }
    } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      if (wsdmprotocolloDocumentoIn.getDestinatari() == null) alObb.add(CTR_MESSAGE_DESTINATARIO);
    }

    // Presenza allegati
    if (wsdmprotocolloDocumentoIn.getAllegati() == null) alObb.add(CTR_MESSAGE_ALLEGATO);

    // Controllo fascicolo
    if (WSDMInserimentoInFascicolo.NO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
      alObb.add(CTR_MESSAGE_FASCICOLO);
    }

    // Eventuale inserimento in un nuovo fascicolo
    if (WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
      WSDMFascicolo wsdmFascicolo = wsdmprotocolloDocumentoIn.getFascicolo();
      if (wsdmFascicolo == null) {
        alObb.add(CTR_MESSAGE_CLASSIFICA_FASCICOLO);
        alObb.add(CTR_MESSAGE_OGGETTO_FASCICOLO);
      } else {
        if (!isTestoValido(wsdmFascicolo.getClassificaFascicolo())) alObb.add(CTR_MESSAGE_CLASSIFICA_FASCICOLO);
        if (!isTestoValido(wsdmFascicolo.getOggettoFascicolo())) alObb.add(CTR_MESSAGE_OGGETTO_FASCICOLO);
      }
    }

    // Eventuale inserimento in un fascicolo esistente
    if (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
      WSDMFascicolo wsdmFascicolo = wsdmprotocolloDocumentoIn.getFascicolo();
      if (wsdmFascicolo == null) {
        alObb.add(CTR_MESSAGE_ANNO_FASCICOLO);
        alObb.add(CTR_MESSAGE_NUMERO_FASCICOLO);
        alObb.add(CTR_MESSAGE_CLASSIFICA_FASCICOLO);
      } else {
        if (wsdmFascicolo.getAnnoFascicolo() == null) alObb.add(CTR_MESSAGE_ANNO_FASCICOLO);
        if (!isTestoValido(wsdmFascicolo.getNumeroFascicolo())) alObb.add(CTR_MESSAGE_NUMERO_FASCICOLO);
        if (!isTestoValido(wsdmFascicolo.getClassificaFascicolo())) alObb.add(CTR_MESSAGE_CLASSIFICA_FASCICOLO);
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
    if (!isTestoValido(wsdmprotocolloFascicoloIn.getClassificaFascicolo())) alObb.add(CTR_MESSAGE_CLASSIFICA_FASCICOLO);
    if (!isTestoValido(wsdmprotocolloFascicoloIn.getOggettoFascicolo())) alObb.add(CTR_MESSAGE_OGGETTO_FASCICOLO);
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
   * Controlla valori obbligatori per l'invio mail.
   * 
   * @param loginAttr
   * @param wsdmInviaMail
   * @param messaggio
   * @return
   */
  public static boolean ctrInviaMail(WSDMLoginAttr loginAttr, WSDMInviaMail wsdmInviaMail, StringBuffer messaggio) {
    ArrayList<String> alObb = new ArrayList<String>();
    if (wsdmInviaMail.getAnnoProtocollo() == null || !isTestoValido(wsdmInviaMail.getNumeroProtocollo())) {
      alObb.add(CTR_MESSAGE_MAIL_RIFERIMENTI);
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
