package it.maggioli.eldasoft.bl.iride;

import it.maggioli.eldasoft.ws.dm.WSDMAggiungiAllegatiIn;
import it.maggioli.eldasoft.ws.dm.WSDMFascicoloIn;
import it.maggioli.eldasoft.ws.dm.WSDMFascicoloModificaIn;
import it.maggioli.eldasoft.ws.dm.WSDMInserimentoInFascicolo;
import it.maggioli.eldasoft.ws.dm.WSDMInviaMail;
import it.maggioli.eldasoft.ws.dm.WSDMLoginAttr;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloDocumentoIn;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloInOut;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloModificaIn;

import java.util.ArrayList;

/**
 * Classe di utilita' a supporto delle richieste di protocollo e fascicolo.
 * 
 * 
 */
public class IrideUtilityControllo {

  static private final String CTR_MESSAGE                                          = "La richiesta non puo' essere inoltrata a causa della mancanza di alcune informazioni obbligatorie";
  static private final String CTR_MESSAGE_RUOLO                                    = "ruolo";
  static private final String CTR_MESSAGE_CLASSIFICA                               = "classifica";
  static private final String CTR_MESSAGE_TIPO_DOCUMENTO                           = "tipo documento";
  static private final String CTR_MESSAGE_MITTENTE                                 = "mittente";
  static private final String CTR_MESSAGE_DESTINATARIO                             = "destinatario";
  static private final String CTR_MESSAGE_ALLEGATO                                 = "allegato";
  static private final String CTR_MESSAGE_ANNO_PROTOCOLLO                          = "anno protocollo";
  static private final String CTR_MESSAGE_NUMERO_PROTOCOLLO                        = "numero protocollo";
  static private final String CTR_MESSAGE_NUMERO_DOCUMENTO                         = "numero documento";
  static private final String CTR_MESSAGE_OGGETTO_FASCICOLO                        = "oggetto fascicolo";
  static private final String CTR_MESSAGE_CLASSIFICA_FASCICOLO                     = "classifica fascicolo";
  static private final String CTR_MESSAGE_CODICE_FASCICOLO                         = "codice identificativo fascicolo";
  static private final String CTR_MESSAGE_ANNO_FASCICOLO                           = "anno fascicolo";
  static private final String CTR_MESSAGE_NUMERO_FASCICOLO                         = "numero fascicolo";
  static private final String CTR_MESSAGE_DATI_PERSONALIZZATI_FASCICOLO            = "dati personalizzati fascicolo";
  static private final String CTR_MESSAGE_ANAGRAFICA_CODICE                        = "codice dell'anagrafica";

  static private final String CTR_MESSAGE_ATTO_TIPO                                = "tipo atto";
  static private final String CTR_MESSAGE_ATTO_ORGANO                              = "organo atto";
  static private final String CTR_MESSAGE_ATTO_ANNO                                = "anno atto";
  static private final String CTR_MESSAGE_ATTO_NUMERO                              = "numero atto";

  static private final String CTR_MESSAGE_MAIL_NUMERO_DOCUMENTO                    = "numero documento oppure anno e numero protocollo";
  static private final String CTR_MESSAGE_MAIL_OGGETTO                             = "oggetto";
  static private final String CTR_MESSAGE_MAIL_TESTO                               = "testo";
  static private final String CTR_MESSAGE_MAIL_MITTENTE                            = "mittente";
  static private final String CTR_MESSAGE_MAIL_DESTINATARI                         = "destinatari";

  static private final String CTR_MESSAGE_PROTOCOLLO_MODIFICA_LISTA_DOCUMENTI      = "numero del documento";
  static private final String CTR_MESSAGE_PROTOCOLLO_MODIFICA_LIVELLO_RISERVATEZZA = "livello di riservatezza";
  static private final String CTR_MESSAGE_PROTOCOLLO_MODIFICA_DATA_RISERVATEZZA    = "data di termine riservatezza";

  static private final String CTR_MESSAGE_DOCUMENTO_COLLEGA_PADRE                  = "numero documento padre";
  static private final String CTR_MESSAGE_DOCUMENTO_COLLEGA_FIGLIO                 = "numero documento figlio";
  static private final String CTR_MESSAGE_DOCUMENTO_COLLEGA_TIPO                   = "tipo collegamento";

  static private final String CTR_MESSAGE_AGGIUNGI_ALLEGATI                        = "numero documento oppure anno e numero protocollo";

  /**
   * Controllo valori in ingresso per la richiesta _protocolloInserisci e
   * _documentoInserisci.
   * 
   * @param login
   * @param messaggio
   * @param wsdmprotocolloDocumentoIn
   * @return
   */
  public static boolean ctrProtocolloDocumentoInserisci(WSDMLoginAttr loginAttr, WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn,
      StringBuffer messaggio) {
    ArrayList<String> alObb = new ArrayList<String>();
    ctrLoginAttr(loginAttr, alObb);
    // if (!isTestoValido(wsdmprotocolloDocumentoIn.getClassifica()))
    // alObb.add(CTR_MESSAGE_CLASSIFICA);
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getTipoDocumento())) alObb.add(CTR_MESSAGE_TIPO_DOCUMENTO);

    // Mittenti/destinatari in funzione del verso
    if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
      if (wsdmprotocolloDocumentoIn.getMittenti() == null) alObb.add(CTR_MESSAGE_MITTENTE);
    } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      if (wsdmprotocolloDocumentoIn.getDestinatari() == null) alObb.add(CTR_MESSAGE_DESTINATARIO);
    }

    // Allegati
    if (wsdmprotocolloDocumentoIn.getAllegati() == null) alObb.add(CTR_MESSAGE_ALLEGATO);

    // Eventuale inserimento in un fascicolo
    if (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
      if (wsdmprotocolloDocumentoIn.getFascicolo() != null) {
        if (!isTestoValido(wsdmprotocolloDocumentoIn.getFascicolo().getCodiceFascicolo())) alObb.add(CTR_MESSAGE_CODICE_FASCICOLO);
      } else {
        alObb.add(CTR_MESSAGE_CODICE_FASCICOLO);
      }
    } else if (WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
      if (wsdmprotocolloDocumentoIn.getFascicolo() != null) {
        if (!isTestoValido(wsdmprotocolloDocumentoIn.getFascicolo().getOggettoFascicolo())) alObb.add(CTR_MESSAGE_OGGETTO_FASCICOLO);
        if (!isTestoValido(wsdmprotocolloDocumentoIn.getFascicolo().getClassificaFascicolo())) alObb.add(CTR_MESSAGE_CLASSIFICA_FASCICOLO);
      } else {
        alObb.add(CTR_MESSAGE_OGGETTO_FASCICOLO);
        alObb.add(CTR_MESSAGE_CLASSIFICA_FASCICOLO);
      }
    }

    return ctrEsito(messaggio, alObb);
  }

  /**
   * Controllo valori in ingresso per la richiesta _protocolloModifica e
   * _documentoInserisci.
   * 
   * @param login
   * @param messaggio
   * @param wsdmprotocolloModificaIn
   * @return
   */
  public static boolean ctrProtocolloModifica(WSDMLoginAttr loginAttr, WSDMProtocolloModificaIn wsdmprotocolloModificaIn,
      StringBuffer messaggio) {
    ArrayList<String> alObb = new ArrayList<String>();
    ctrLoginAttr(loginAttr, alObb);

    // Numero di documenti da modificare (indicarne almeno uno)
    if (wsdmprotocolloModificaIn.getNumeroDocumento() == null) {
      alObb.add(CTR_MESSAGE_PROTOCOLLO_MODIFICA_LISTA_DOCUMENTI);
    }

    // Controllo livello di riservatezza
    // if (!isTestoValido(wsdmprotocolloModificaIn.getLivelloRiservatezza())) {
    // alObb.add(CTR_MESSAGE_PROTOCOLLO_MODIFICA_LIVELLO_RISERVATEZZA);
    // }

    // Controllo data scadenza riservatezza
    // if (wsdmprotocolloModificaIn.getDataFineRiservatezza() == null) {
    // alObb.add(CTR_MESSAGE_PROTOCOLLO_MODIFICA_DATA_RISERVATEZZA);
    // }

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
    ctrLoginAttr(loginAttr, alObb);
    if (annoProtocollo == null) alObb.add(CTR_MESSAGE_ANNO_PROTOCOLLO);
    if (!isTestoValido(numeroProtocollo)) alObb.add(CTR_MESSAGE_NUMERO_PROTOCOLLO);
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
    ctrLoginAttr(loginAttr, alObb);
    if (!isTestoValido(numeroDocumento)) alObb.add(CTR_MESSAGE_NUMERO_DOCUMENTO);
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
    ctrLoginAttr(loginAttr, alObb);
    if (!isTestoValido(wsdmfascicoloIn.getOggettoFascicolo())) alObb.add(CTR_MESSAGE_OGGETTO_FASCICOLO);
    if (!isTestoValido(wsdmfascicoloIn.getClassificaFascicolo())) alObb.add(CTR_MESSAGE_CLASSIFICA);
    return ctrEsito(messaggio, alObb);
  }

  /**
   * Controllo valori in ingresso per la richiesta _fascicoloAggiungiDocumento.
   * 
   * @param login
   * @param codiceFascicolo
   * @param numeroDocumento
   * @param messaggio
   * @return
   */
  public static boolean ctrFascicoloAggiungiDocumento(WSDMLoginAttr loginAttr, String codiceFascicolo, String numeroDocumento,
      StringBuffer messaggio) {
    ArrayList<String> alObb = new ArrayList<String>();
    ctrLoginAttr(loginAttr, alObb);
    if (!isTestoValido(codiceFascicolo)) alObb.add(CTR_MESSAGE_CODICE_FASCICOLO);
    if (!isTestoValido(numeroDocumento)) alObb.add(CTR_MESSAGE_NUMERO_DOCUMENTO);
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
    ctrLoginAttr(loginAttr, alObb);
    // if (annoFascicolo == null) alObb.add(CTR_MESSAGE_ANNO_FASCICOLO);
    // if (!isTestoValido(numeroFascicolo))
    // alObb.add(CTR_MESSAGE_NUMERO_FASCICOLO);
    return ctrEsito(messaggio, alObb);
  }

  /**
   * Controllo valori in ingresso per la richiesta _fascicoloModifica.
   * 
   * @param loginAttr
   * @param wsdmfascicoloModificaIn
   * @param messaggio
   * @return
   */
  public static boolean ctrFascicoloModifica(WSDMLoginAttr loginAttr, WSDMFascicoloModificaIn wsdmfascicoloModificaIn,
      StringBuffer messaggio) {
    ArrayList<String> alObb = new ArrayList<String>();
    ctrLoginAttr(loginAttr, alObb);

    // Codice del fascicolo
    if (wsdmfascicoloModificaIn.getCodiceFascicolo() == null) {
      alObb.add(CTR_MESSAGE_CODICE_FASCICOLO);
    }

    // Dati personalizzati del fascicolo
    if (wsdmfascicoloModificaIn.getDatiPersonalizzati() == null) {
      alObb.add(CTR_MESSAGE_DATI_PERSONALIZZATI_FASCICOLO);
    }

    return ctrEsito(messaggio, alObb);
  }

  /**
   * Controllo dei parametri in ingresso dell'anagrafica.
   * 
   * @param loginAttr
   * @param codiceAnagrafica
   * @param messaggio
   * @return
   */
  public static boolean ctrAnagraficaLeggi(WSDMLoginAttr loginAttr, String codiceAnagrafica, StringBuffer messaggio) {
    ArrayList<String> alObb = new ArrayList<String>();
    ctrLoginAttr(loginAttr, alObb);

    // Codice dell'anagrafica
    if (!isTestoValido(codiceAnagrafica)) alObb.add(CTR_MESSAGE_ANAGRAFICA_CODICE);

    return ctrEsito(messaggio, alObb);
  }

  /**
   * Controllo parametri in ingresso per l'operazione di collegamento tra
   * elementi documentali.
   * 
   * @param loginAttr
   * @param numeroDocumentoPadre
   * @param numeroDocumentoFiglio
   * @param tipoCollegamento
   * @param messaggio
   * @return
   */
  public static boolean ctrDocumentoCollega(WSDMLoginAttr loginAttr, String numeroDocumentoPadre, String numeroDocumentoFiglio,
      String tipoCollegamento, StringBuffer messaggio) {
    ArrayList<String> alObb = new ArrayList<String>();
    ctrLoginAttr(loginAttr, alObb);

    if (!isTestoValido(numeroDocumentoPadre)) alObb.add(CTR_MESSAGE_DOCUMENTO_COLLEGA_PADRE);
    if (!isTestoValido(numeroDocumentoFiglio)) alObb.add(CTR_MESSAGE_DOCUMENTO_COLLEGA_FIGLIO);
    if (!isTestoValido(tipoCollegamento)) alObb.add(CTR_MESSAGE_DOCUMENTO_COLLEGA_TIPO);

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
      messaggio.append(CTR_MESSAGE + " (" + infoObb + ")");
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
      alObb.add("ruolo");
    } else {
      if (!isTestoValido(loginAttr.getRuolo())) alObb.add(CTR_MESSAGE_RUOLO);
    }
  }

  /**
   * Controllo valori obbligatori per la lettura dell'atto.
   * 
   * @param loginAttr
   * @param annoProtocollo
   * @param numeroProtocollo
   * @param messaggio
   * @return
   */

  public static boolean ctrAttoLeggi(WSDMLoginAttr loginAttr, String tipo, String organo, Long anno, String numero, StringBuffer messaggio) {
    ArrayList<String> alObb = new ArrayList<String>();
    ctrLoginAttr(loginAttr, alObb);
    if (tipo == null) {
      alObb.add(CTR_MESSAGE_ATTO_TIPO);
    } else {
      if ("DL".equals(tipo)) {
        if (!isTestoValido(organo)) alObb.add(CTR_MESSAGE_ATTO_ORGANO);
      }
    }
    if (anno == null) alObb.add(CTR_MESSAGE_ATTO_ANNO);
    if (!isTestoValido(numero)) alObb.add(CTR_MESSAGE_ATTO_NUMERO);
    return ctrEsito(messaggio, alObb);
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
    ctrLoginAttr(loginAttr, alObb);
    if (!isTestoValido(wsdmInviaMail.getNumeroDocumento())) {
      if (wsdmInviaMail.getAnnoProtocollo() == null || !isTestoValido(wsdmInviaMail.getNumeroProtocollo())) {
        alObb.add(CTR_MESSAGE_MAIL_NUMERO_DOCUMENTO);
      }
    }
    if (!isTestoValido(wsdmInviaMail.getOggettoMail())) alObb.add(CTR_MESSAGE_MAIL_OGGETTO);
    if (!isTestoValido(wsdmInviaMail.getTestoMail())) alObb.add(CTR_MESSAGE_MAIL_TESTO);
    if (!isTestoValido(wsdmInviaMail.getMittenteMail())) alObb.add(CTR_MESSAGE_MAIL_MITTENTE);
    if (wsdmInviaMail.getDestinatariMail() == null) alObb.add(CTR_MESSAGE_MAIL_DESTINATARI);
    return ctrEsito(messaggio, alObb);
  }

  /**
   * Controlla valori obbligatori per la verifica mail.
   * 
   * @param loginAttr
   * @param numeroDocumento
   * @param annoProtocollo
   * @param numeroProtocollo
   * @param messaggio
   * @return
   */
  public static boolean ctrVerificaMail(WSDMLoginAttr loginAttr, String numeroDocumento, Long annoProtocollo, String numeroProtocollo,
      StringBuffer messaggio) {
    ArrayList<String> alObb = new ArrayList<String>();
    ctrLoginAttr(loginAttr, alObb);
    if (!isTestoValido(numeroDocumento)) {
      if (annoProtocollo == null || !isTestoValido(numeroProtocollo)) {
        alObb.add(CTR_MESSAGE_MAIL_NUMERO_DOCUMENTO);
      }
    }
    return ctrEsito(messaggio, alObb);
  }

  /**
   * Controlla i valori obbligatori per la richiesta di inserimento di ulteriori
   * allegati in un elemento documentale protocollato o non protocollato.
   * 
   * @param loginAttr
   * @param wsdmaggiungiAllegatiIn
   * @param messaggio
   * @return
   */
  public static boolean ctrAggiungiAllegati(WSDMLoginAttr loginAttr, WSDMAggiungiAllegatiIn wsdmaggiungiAllegatiIn, StringBuffer messaggio) {
    ArrayList<String> alObb = new ArrayList<String>();
    ctrLoginAttr(loginAttr, alObb);

    String numeroDocumento = wsdmaggiungiAllegatiIn.getNumeroDocumento();
    Long annoProtocollo = wsdmaggiungiAllegatiIn.getAnnoProtocollo();
    String numeroProtocollo = wsdmaggiungiAllegatiIn.getNumeroProtocollo();

    // Controllo numero documento o anno e numero protocollo
    if (!isTestoValido(wsdmaggiungiAllegatiIn.getNumeroDocumento())) {
      if (wsdmaggiungiAllegatiIn.getAnnoProtocollo() == null || !isTestoValido(wsdmaggiungiAllegatiIn.getNumeroProtocollo())) {
        alObb.add(CTR_MESSAGE_AGGIUNGI_ALLEGATI);
      }
    }

    // Allegati
    if (wsdmaggiungiAllegatiIn.getAllegati() == null) alObb.add(CTR_MESSAGE_ALLEGATO);

    return ctrEsito(messaggio, alObb);
  }

}
