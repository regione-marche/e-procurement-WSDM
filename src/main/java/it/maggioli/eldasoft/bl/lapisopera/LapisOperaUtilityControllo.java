package it.maggioli.eldasoft.bl.lapisopera;

import java.util.ArrayList;

import it.maggioli.eldasoft.ws.dm.WSDMLoginAttr;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloDocumentoIn;
import it.maggioli.eldasoft.ws.dm.WSDMRicercaFascicolo;

/**
 * Classe di utilita' a supporto delle richieste di protocollo e fascicolo.
 * 
 * 
 */
public class LapisOperaUtilityControllo {

  static private final String CTR_MESSAGE                             = "La richiesta non puo' essere inoltrata a causa dei seguenti controlli:";

  static private final String CTR_MESSAGE_OGGETTO                     = "valorizzare l'oggetto (protocolloDocumentoIn.oggetto)";
  static private final String CTR_MESSAGE_MITTENTE                    = "indicare almeno un mittente (protocolloDocumentoIn.mittenti)";
  static private final String CTR_MESSAGE_DESTINATARIO                = "indicare almeno un destinatario (protocolloDocumentoIn.destinatari)";
  static private final String CTR_MESSAGE_ALLEGATO                    = "inserire almeno il documento principale (protocolloDocumentoIn.allegati)";
  static private final String CTR_MESSAGE_IN_OUT                      = "definire il verso della protocollazione (protocolloDocumentoIn.inout)";
  static private final String CTR_MESSAGE_PROTOCOLLO_INT_NON_AMMESSA  = "non e' ammessa la protocollazione di tipo interno (INT) (protocolloDocumentoIn.inout)";
  static private final String CTR_MESSAGE_NUMERO_DOCUMENTO            = "indicare il numero documento";
  static private final String CTR_MESSAGE_COGNOME                     = "valorizzare il cognome/login dell'utente (loginAttr.cognome)";
  static private final String CTR_MESSAGE_CODICE_FASCICOLO            = "valorizzare il codice del fascicolo (ieFascicolo)";
  static private final String CTR_MESSAGE_RICERCA_FASCICOLO           = "valorizzare almeno uno dei parametri di ricerca codiceFascicolo (ieFascicolo), classificaFascicolo (idcCode), .oggettoFascicolo, strutturaFascicolo, identificativoGara, cig";
  static private final String CTR_MESSAGE_PROTOCOLLO_ASINCRONO_ESITO  = "valorizzare il codice di controllo (ProtoBatch)";
  static private final String CTR_MESSAGE_ANNO_PROTOCOLLO             = "valorizzare l'anno del protocollo";
  static private final String CTR_MESSAGE_NUMERO_PROTOCOLLO           = "valorizzare il numero di protocollo";
  static private final String CTR_MESSAGE_CLASSIFICA                  = "valorizzare la classifica (wsdmprotocolloDocumentoIn.classifica)";
  static private final String CTR_MESSAGE_OBBLIGO_FASCICOLO_ESISTENTE = "valorizzare i riferimenti di un fascicolo esistente, e' obbligatorio fascicolare su fascicolo esistente";
  static private final String CTR_MESSAGE_STRUTTURA                   = "valorizzare la struttura (wsdmprotocolloDocumentoIn.struttura)";

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

    // Controllo attributi di connessione
    ctrLoginAttr(loginAttr, alObb);
    //
    // // Classifica
    // if (!isTestoValido(wsdmprotocolloDocumentoIn.getClassifica()))
    // alObb.add(CTR_MESSAGE_CLASSIFICA);
    //
    // // Fascicolo e identificativo ieFascicolo
    // if
    // (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo()))
    // {
    // if (wsdmprotocolloDocumentoIn.getFascicolo() != null) {
    // if
    // (!isTestoValido(wsdmprotocolloDocumentoIn.getFascicolo().getCodiceFascicolo()))
    // alObb.add(CTR_MESSAGE_CODICE_FASCICOLO);
    // } else {
    // alObb.add(CTR_MESSAGE_CODICE_FASCICOLO);
    // }
    // } else {
    // alObb.add(CTR_MESSAGE_OBBLIGO_FASCICOLO_ESISTENTE);
    // }
    //
    // // Oggetto
    // if (!isTestoValido(wsdmprotocolloDocumentoIn.getOggetto()))
    // alObb.add(CTR_MESSAGE_OGGETTO);
    //
    // // Struttura
    // if (!isTestoValido(wsdmprotocolloDocumentoIn.getStruttura()))
    // alObb.add(CTR_MESSAGE_STRUTTURA);
    //
    // // Controllo verso mittenti e destinatari
    // if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout()))
    // {
    // if (wsdmprotocolloDocumentoIn.getMittenti() == null) {
    // alObb.add(CTR_MESSAGE_MITTENTE);
    // }
    // } else if
    // (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
    // if (wsdmprotocolloDocumentoIn.getDestinatari() == null) {
    // alObb.add(CTR_MESSAGE_DESTINATARIO);
    // }
    // } else if
    // (WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
    // alObb.add(CTR_MESSAGE_PROTOCOLLO_INT_NON_AMMESSA);
    //
    // } else {
    // alObb.add(CTR_MESSAGE_IN_OUT);
    // }
    //
    // // Allegati
    // if (wsdmprotocolloDocumentoIn.getAllegati() == null) {
    // alObb.add(CTR_MESSAGE_ALLEGATO);
    // }

    return ctrEsito(messaggio, alObb);

  }

  /**
   * Controllo valori per l'inserimento documentale.
   * 
   * @param loginAttr
   * @param wsdmprotocolloDocumentoIn
   * @param messaggio
   * @return
   */
  public static boolean ctrDocumentoInserisci(WSDMLoginAttr loginAttr, WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn,
      StringBuffer messaggio) {
    ArrayList<String> alObb = new ArrayList<String>();
    
    // Controllo attributi di connessione
    ctrLoginAttr(loginAttr, alObb);

    // // Oggetto
    // if (!isTestoValido(wsdmprotocolloDocumentoIn.getOggetto()))
    // alObb.add(CTR_MESSAGE_OGGETTO);
    //
    // // Struttura
    // if (!isTestoValido(wsdmprotocolloDocumentoIn.getStruttura()))
    // alObb.add(CTR_MESSAGE_STRUTTURA);
    //
    // // Allegati
    // if (wsdmprotocolloDocumentoIn.getAllegati() == null) {
    // alObb.add(CTR_MESSAGE_ALLEGATO);
    // }

    return ctrEsito(messaggio, alObb);

  }

  /**
   * Controllo valori in ingresso per la lettura del documento
   * 
   * @param login
   * @param numeroDocumento
   * @param messaggio
   * @return
   */
  public static boolean ctrDocumentoLeggi(WSDMLoginAttr loginAttr, String numeroDocumento, StringBuffer messaggio) {
    ArrayList<String> alObb = new ArrayList<String>();
    if (!isTestoValido(numeroDocumento)) alObb.add(CTR_MESSAGE_NUMERO_DOCUMENTO);
    return ctrEsito(messaggio, alObb);
  }

  /**
   * Controllo valori obbligatori per l'oggetto Login.
   * 
   * @param login
   * @param alObb
   */
  public static void ctrLoginAttr(WSDMLoginAttr loginAttr, ArrayList<String> alObb) {
    if (loginAttr == null) {
      alObb.add(CTR_MESSAGE_COGNOME);
    } else {
      if (!isTestoValido(loginAttr.getCognome())) alObb.add(CTR_MESSAGE_COGNOME);
    }
  }

  /**
   * Controllo valori in ingresso per la lettura del fascicolo.
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
   * Controllo valori in ingresso per la ricerca del fascicolo.
   * 
   * @param loginAttr
   * @param ricercaFascicolo
   * @param messaggio
   * @return
   */
  public static boolean ctrFascicoloRicerca(WSDMLoginAttr loginAttr, WSDMRicercaFascicolo ricercaFascicolo, StringBuffer messaggio) {
    ArrayList<String> alObb = new ArrayList<String>();

    if (ricercaFascicolo == null) {
      alObb.add(CTR_MESSAGE_RICERCA_FASCICOLO);
    } else {
      String codiceFascicolo = ricercaFascicolo.getCodiceFascicolo();
      String classificaFascicolo = ricercaFascicolo.getClassificaFascicolo();
      String oggettoFascicolo = ricercaFascicolo.getOggettoFascicolo();
      String struttura_fascicolo = ricercaFascicolo.getStrutturaFascicolo();
      String identificativoGara = ricercaFascicolo.getIdentificativoGara();
      String cig = ricercaFascicolo.getCig();
      if (!isTestoValido(codiceFascicolo)
          && !isTestoValido(classificaFascicolo)
          && !isTestoValido(oggettoFascicolo)
          && !isTestoValido(struttura_fascicolo)
          && !isTestoValido(identificativoGara)
          && !isTestoValido(cig)) {
        alObb.add(CTR_MESSAGE_RICERCA_FASCICOLO);
      }
    }

    return ctrEsito(messaggio, alObb);
  }

  /**
   * Controllo valori per la funzione di verifica della protocollazione
   * asincrona.
   * 
   * @param loginAttr
   * @param id
   * @param messaggio
   * @return
   */
  public static boolean ctrProtocolloAsincronoEsito(WSDMLoginAttr loginAttr, String id, StringBuffer messaggio) {
    ArrayList<String> alObb = new ArrayList<String>();
    if (!isTestoValido(id)) alObb.add(CTR_MESSAGE_PROTOCOLLO_ASINCRONO_ESITO);
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
    if (annoProtocollo == null) alObb.add(CTR_MESSAGE_ANNO_PROTOCOLLO);
    if (!isTestoValido(numeroProtocollo)) alObb.add(CTR_MESSAGE_NUMERO_PROTOCOLLO);
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
