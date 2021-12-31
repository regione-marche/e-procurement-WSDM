package it.maggioli.eldasoft.bl.jprotocol;

import it.maggioli.eldasoft.ws.dm.WSDMFascicoloIn;
import it.maggioli.eldasoft.ws.dm.WSDMInserimentoInFascicolo;
import it.maggioli.eldasoft.ws.dm.WSDMInviaMail;
import it.maggioli.eldasoft.ws.dm.WSDMLoginAttr;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloDocumentoIn;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloInOut;

import java.util.ArrayList;

import javax.naming.InitialContext;

/**
 * Classe di utilita' a supporto delle richieste di protocollo e fascicolo.
 * 
 * 
 */
public class JProtocolUtilityControllo {

  static private final String CTR_MESSAGE                             = "La richiesta non puo' essere inoltrata a causa dei seguenti controlli:";

  static private final String CTR_MESSAGE_MITTENTE                    = "indicare almeno un mittente (protocolloDocumentoIn.mittenti)";
  static private final String CTR_MESSAGE_DESTINATARIO                = "indicare almeno un destinatario (protocolloDocumentoIn.destinatari)";
  static private final String CTR_MESSAGE_CLASSIFICA                  = "valorizzare la classifica/titolario (protocolloDocumentoIn.classifica)";
  static private final String CTR_MESSAGE_OGGETTO                     = "valorizzare l'oggetto (protocolloDocumentoIn.oggetto)";
  static private final String CTR_MESSAGE_STRUTTURA                   = "valorizzare il codice dell'unita' protocollante/unita' di competenza (protocolloDocumentoIn.Struttura)";
  static private final String CTR_MESSAGE_TIPOASSEGNAZIONE            = "valorizzare il tipo di assegnazione (protocolloDocumentoIn.TipoAssegnazione)";
  static private final String CTR_MESSAGE_IN_OUT                      = "definire il verso della protocollazione (protocolloDocumentoIn.inout)";
  static private final String CTR_MESSAGE_PROTOCOLLO_INT_NON_AMMESSA  = "non e' ammessa la protocollazione di tipo interno (INT) (protocolloDocumentoIn.inout)";
  static private final String CTR_MESSAGE_PROTOCOLLO_SOLO_INT_AMMESSA = "e' ammessa solo la protocollazione di tipo interno (INT) (protocolloDocumentoIn.inout)";

  static private final String CTR_MESSAGE_ALLEGATO                    = "inserire almeno un allegato (protocolloDocumentoIn.allegati)";

  static private final String CTR_MESSAGE_ANNO_FASCICOLO              = "valorizzare l'anno del fascicolo (protocolloDocumentoIn.fascicolo.annoFascicolo)";
  static private final String CTR_MESSAGE_NUMERO_FASCICOLO            = "valorizzare il numero del fascicolo (protocolloDocumentoIn.fascicolo.numeroFascicolo)";

  static private final String CTR_MESSAGE_LEGGI_PROTOCOLLO_CODICEUO   = "indicare il codice dell'unita' organizzativa";
  static private final String CTR_MESSAGE_LEGGI_PROTOCOLLO_ANNO       = "valorizzare l'anno del protocollo";
  static private final String CTR_MESSAGE_LEGGI_PROTOCOLLO_NUMERO     = "valorizzare il numero di protocollo";

  static private final String CTR_MESSAGE_FASCICOLO_OGGETTO           = "valorizzare l'oggetto del fascicolo (fascicoloIn.oggettoFascicolo)";
  static private final String CTR_MESSAGE_FASCICOLO_CLASSIFICA        = "valorizzare la classifica/titolario del fascicolo (fascicoloIn.classificaFascicolo)";

  static private final String CTR_MESSAGE_LEGGI_FASCICOLO_ANNO        = "valorizzare l'anno del fascicolo";
  static private final String CTR_MESSAGE_LEGGI_FASCICOLO_NUMERO      = "valorizzare il numero del fascicolo";

  static private final String CTR_MESSAGE_MAIL_ANNO_NUMERO_PROTOCOLLO = "valorizzare l'anno ed il numero protocollo";
  static private final String CTR_MESSAGE_MAIL_OGGETTO                = "valorizzare l'oggetto";
  static private final String CTR_MESSAGE_MAIL_TESTO                  = "valorizza il testo";
  static private final String CTR_MESSAGE_MAIL_DESTINATARI            = "indicare almeno un destinatario";

  static private String       JPROTOCOL_GRADO_RISERVATEZZA            = "java:comp/env/JPROTOCOL_GRADO_RISERVATEZZA";
  static private String       JPROTOCOL_MITTDEST_TIPOLOGIA            = "java:comp/env/JPROTOCOL_MITTDEST_TIPOLOGIA";

  static private final String CTR_MESSAGE_GRADO_RISERVATEZZA          = "indicare il grado riservatezza (JPROTOCOL_GRADO_RISERVATEZZA tra i parametri di inizializzazione di EldasoftWSDM)";
  static private final String CTR_MESSAGE_MITTDEST_TIPOLOGIA          = "indicare la tipologia di anagrafica (JPROTOCOL_MITTDEST_TIPOLOGIA tra i parametri di inizializzazione di EldasoftWSDM)";

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

    // Mittenti e destinatari
    if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
      if (wsdmprotocolloDocumentoIn.getMittenti() == null) alObb.add(CTR_MESSAGE_MITTENTE);
    } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      if (wsdmprotocolloDocumentoIn.getDestinatari() == null) alObb.add(CTR_MESSAGE_DESTINATARIO);
    } else if (WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      alObb.add(CTR_MESSAGE_PROTOCOLLO_INT_NON_AMMESSA);
    } else {
      alObb.add(CTR_MESSAGE_IN_OUT);
    }

    // Classifica
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getClassifica())) alObb.add(CTR_MESSAGE_CLASSIFICA);

    // Oggetto
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getOggetto())) alObb.add(CTR_MESSAGE_OGGETTO);

    // Struttura e tipo assegnazione
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getStruttura())) alObb.add(CTR_MESSAGE_STRUTTURA);
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getTipoAssegnazione())) alObb.add(CTR_MESSAGE_TIPOASSEGNAZIONE);

    // Tipologia mittente/destinatario
    String tipologia = null;
    try {
      tipologia = InitialContext.doLookup(JPROTOCOL_MITTDEST_TIPOLOGIA);
    } catch (Exception e) {
    }
    if (!isTestoValido(tipologia)) alObb.add(CTR_MESSAGE_MITTDEST_TIPOLOGIA);

    // Grado riservatezza
    String gradoRiservatezza = null;
    try {
      gradoRiservatezza = InitialContext.doLookup(JPROTOCOL_GRADO_RISERVATEZZA);
    } catch (Exception e) {
    }
    if (!isTestoValido(gradoRiservatezza)) alObb.add(CTR_MESSAGE_GRADO_RISERVATEZZA);

    // Allegati
    if (wsdmprotocolloDocumentoIn.getAllegati() == null) alObb.add(CTR_MESSAGE_ALLEGATO);

    // Eventuale inserimento in un fascicolo
    if (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
      if (wsdmprotocolloDocumentoIn.getFascicolo() != null) {
        if (wsdmprotocolloDocumentoIn.getFascicolo().getAnnoFascicolo() == null) alObb.add(CTR_MESSAGE_ANNO_FASCICOLO);
        if (!isTestoValido(wsdmprotocolloDocumentoIn.getFascicolo().getNumeroFascicolo())) alObb.add(CTR_MESSAGE_NUMERO_FASCICOLO);
      } else {
        alObb.add(CTR_MESSAGE_ANNO_FASCICOLO);
        alObb.add(CTR_MESSAGE_NUMERO_FASCICOLO);
      }
    } else if (WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
      if (wsdmprotocolloDocumentoIn.getFascicolo() != null) {
        if (!isTestoValido(wsdmprotocolloDocumentoIn.getFascicolo().getOggettoFascicolo())) alObb.add(CTR_MESSAGE_FASCICOLO_OGGETTO);
        if (!isTestoValido(wsdmprotocolloDocumentoIn.getFascicolo().getClassificaFascicolo())) alObb.add(CTR_MESSAGE_FASCICOLO_CLASSIFICA);
      } else {
        alObb.add(CTR_MESSAGE_FASCICOLO_OGGETTO);
        alObb.add(CTR_MESSAGE_FASCICOLO_CLASSIFICA);
      }
    }

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

    // Mittenti e destinatari
    // Controllo verso di protocollazione, mittenti e destinatari
    if (WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {

    } else {
      alObb.add(CTR_MESSAGE_PROTOCOLLO_SOLO_INT_AMMESSA);
    }

    // Classifica
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getClassifica())) alObb.add(CTR_MESSAGE_CLASSIFICA);

    // Oggetto
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getOggetto())) alObb.add(CTR_MESSAGE_OGGETTO);

    // Struttura e tipo assegnazione
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getStruttura())) alObb.add(CTR_MESSAGE_STRUTTURA);
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getTipoAssegnazione())) alObb.add(CTR_MESSAGE_TIPOASSEGNAZIONE);

    // Tipologia mittente/destinatario
    String tipologia = null;
    try {
      tipologia = InitialContext.doLookup(JPROTOCOL_MITTDEST_TIPOLOGIA);
    } catch (Exception e) {
    }
    if (!isTestoValido(tipologia)) alObb.add(CTR_MESSAGE_MITTDEST_TIPOLOGIA);

    // Grado riservatezza
    String gradoRiservatezza = null;
    try {
      gradoRiservatezza = InitialContext.doLookup(JPROTOCOL_GRADO_RISERVATEZZA);
    } catch (Exception e) {
    }
    if (!isTestoValido(gradoRiservatezza)) alObb.add(CTR_MESSAGE_GRADO_RISERVATEZZA);
    
    // Allegati
    if (wsdmprotocolloDocumentoIn.getAllegati() == null) alObb.add(CTR_MESSAGE_ALLEGATO);

    // Eventuale inserimento in un fascicolo
    if (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
      if (wsdmprotocolloDocumentoIn.getFascicolo() != null) {
        if (wsdmprotocolloDocumentoIn.getFascicolo().getAnnoFascicolo() == null) alObb.add(CTR_MESSAGE_ANNO_FASCICOLO);
        if (!isTestoValido(wsdmprotocolloDocumentoIn.getFascicolo().getNumeroFascicolo())) alObb.add(CTR_MESSAGE_NUMERO_FASCICOLO);
      } else {
        alObb.add(CTR_MESSAGE_ANNO_FASCICOLO);
        alObb.add(CTR_MESSAGE_NUMERO_FASCICOLO);
      }
    } else if (WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
      if (wsdmprotocolloDocumentoIn.getFascicolo() != null) {
        if (!isTestoValido(wsdmprotocolloDocumentoIn.getFascicolo().getOggettoFascicolo())) alObb.add(CTR_MESSAGE_FASCICOLO_OGGETTO);
        if (!isTestoValido(wsdmprotocolloDocumentoIn.getFascicolo().getClassificaFascicolo())) alObb.add(CTR_MESSAGE_FASCICOLO_CLASSIFICA);
      } else {
        alObb.add(CTR_MESSAGE_FASCICOLO_OGGETTO);
        alObb.add(CTR_MESSAGE_FASCICOLO_CLASSIFICA);
      }
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
    if (loginAttr == null) {
      alObb.add(CTR_MESSAGE_LEGGI_PROTOCOLLO_CODICEUO);
    } else {
      if (loginAttr.getCodiceUO() == null || (loginAttr.getCodiceUO() != null && "".equals(loginAttr.getCodiceUO()))) {
        alObb.add(CTR_MESSAGE_LEGGI_PROTOCOLLO_CODICEUO);
      }
    }
    if (annoProtocollo == null) alObb.add(CTR_MESSAGE_LEGGI_PROTOCOLLO_ANNO);
    if (!isTestoValido(numeroProtocollo)) alObb.add(CTR_MESSAGE_LEGGI_PROTOCOLLO_NUMERO);
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
    if (!isTestoValido(wsdmprotocolloFascicoloIn.getOggettoFascicolo())) alObb.add(CTR_MESSAGE_FASCICOLO_OGGETTO);
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
        alObb.add(CTR_MESSAGE_MAIL_ANNO_NUMERO_PROTOCOLLO);
      }
    }
    if (!isTestoValido(wsdmInviaMail.getOggettoMail())) alObb.add(CTR_MESSAGE_MAIL_OGGETTO);
    if (!isTestoValido(wsdmInviaMail.getTestoMail())) alObb.add(CTR_MESSAGE_MAIL_TESTO);
    if (wsdmInviaMail.getDestinatariMail() == null) alObb.add(CTR_MESSAGE_MAIL_DESTINATARI);
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
