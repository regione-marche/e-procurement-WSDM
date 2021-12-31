package it.maggioli.eldasoft.bl.titulus;

import it.maggioli.eldasoft.ws.dm.WSDMInserimentoInFascicolo;
import it.maggioli.eldasoft.ws.dm.WSDMInviaMail;
import it.maggioli.eldasoft.ws.dm.WSDMLoginAttr;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloAllegato;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloDocumentoIn;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloInOut;

import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * Classe di utilita' a supporto delle richieste di protocollo e fascicolo.
 * 
 * 
 */
public class TitulusUtilityControllo {

  static private final String CTR_MESSAGE                                = "La richiesta non puo' essere inoltrata a causa dei seguenti controlli:";
  static private final String CTR_MESSAGE_NUMERO_PROTOCOLLO              = "il numero protocollo non e' valorizzato";
  static private final String CTR_MESSAGE_NUMERO_DOCUMENTO               = "il numero documento non e' valorizzato";
  static private final String CTR_MESSAGE_CODICE_NUMERO_FASCICOLO        = "il codice o il numero di fascicolo non sono valorizzati";
  static private final String CTR_MESSAGE_TIPO_DOCUMENTO                 = "il tipo documento non e' valorizzato";
  static private final String CTR_MESSAGE_TIPO_DOCUMENTO_NON_GESTITO     = "il tipo documento indicato non e' gestito";
  static private final String CTR_MESSAGE_PROTOCOLLO_INT_NON_AMMESSA     = "non e' ammessa la protocollazione di tipo interno (INT)";
  static private final String CTR_MESSAGE_DOCUMENTALE_IN_OUT_NON_AMMESSE = "non e' ammesso l'inserimento documentale di tipo arrivo (IN) o partenza (OUT)";
  static private final String CTR_MESSAGE_ID_DOCUMENTO                   = "non e' valorizzato l'identificativo univoco del documento";
  static private final String CTR_MESSAGE_MITTENTE                       = "la lista dei mittenti non e' valorizzata";
  static private final String CTR_MESSAGE_DESTINATARIO                   = "la lista dei destinatari non e' valorizzata";
  static private final String CTR_MESSAGE_PUBBLICAZIONE                  = "i dati di pubblicazione non sono valorizzati";
  static private final String CTR_MESSAGE_LOGIN_NUMERO_PROFILO           = "il profilo non e' valorizzato";
  static private final String CTR_MESSAGE_LOGIN_CODICE_AMM_AOO           = "il codice Amministrazione/AOO non e' valorizzato";
  static private final String CTR_MESSAGE_TESTO_PEC                      = "il testo della PEC non e' valorizzato";
  static private final String CTR_MESSAGE_FASCICOLO                      = "e' stato richiesto l'inserimento senza fascicolazione (la fascicolazione e' obbligatoria)";
  static private final String CTR_MESSAGE_CODICE_FASCICOLO               = "il codice identificativo del fascicolo non e' valorizzato";
  static private final String CTR_MESSAGE_OGGETTO_FASCICOLO              = "l'oggetto del fascicolo non e' valorizzato";

  // static private String TITULUS_TABELLATI =
  // "classpath:META-INF/tabellati/TitulusTabellati.xml";

  /**
   * Lettura di una chiave (key) da un lista (entry) di una mappa (map).
   * 
   * @param mapName
   * @param keyName
   * @return
   */
  private static String _readKey(String mapName, String keyName) {

    String look = "java:comp/env/tab/TITULUS/" + mapName + "/" + keyName;
    String keyValue = null;
    try {
      keyValue = InitialContext.doLookup(look);
    } catch (NamingException e) {

    }

    // ApplicationContext ctx = new
    // ClassPathXmlApplicationContext(TITULUS_TABELLATI);
    // String keyValue = null;
    // Map<String, String> mapEntry = (Map<String, String>)
    // ctx.getBean(mapName);
    // if (mapEntry != null && mapEntry.size() > 0) {
    // List<String> listMapKey = new ArrayList<String>(mapEntry.keySet());
    // List<String> listMapValue = new ArrayList<String>(mapEntry.values());
    // for (int l = 0; l < listMapKey.size(); l++) {
    // if (keyName.equals((String) listMapKey.get(l))) {
    // keyValue = (String) listMapValue.get(l);
    // }
    // }
    // }

    return keyValue;
  }

  /**
   * Controllo congruenza tra tipo documento/voce indice ed il verso della
   * comunicazione.
   * 
   * @param alObb
   * @param wsdmprotocolloDocumentoIn
   */
  private static void ctrTipoDocumento(ArrayList<String> alObb, WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {
    String tipoDocumento = wsdmprotocolloDocumentoIn.getTipoDocumento();
    WSDMProtocolloInOut inout = wsdmprotocolloDocumentoIn.getInout();
    if (isTestoValido(tipoDocumento) && inout != null) {
      String ctrInOut = _readKey(tipoDocumento, "inout");
      if (!inout.toString().equals(ctrInOut)) {
        alObb.add("Tipo documento (" + tipoDocumento + ") e verso (" + inout.toString() + ") non sono compatibili");
      }
    }
  }

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

    // Controllo login
    ctrLoginAttrAOO(loginAttr, alObb);

    // Controllo compatibilita' protocollazione e verso
    if (wsdmprotocolloDocumentoIn.getInout().toString().equals("INT")) alObb.add(CTR_MESSAGE_PROTOCOLLO_INT_NON_AMMESSA);

    // Identificativo univoco documento. Fondamentale per l'annullamento della
    // protocollazione (vedi email di Massimo Esposito del 12/12/2017).
    if (wsdmprotocolloDocumentoIn.getIdDocumento() == null) alObb.add(CTR_MESSAGE_ID_DOCUMENTO);

    // Controllo tipo documento
    String tipoDocumento = wsdmprotocolloDocumentoIn.getTipoDocumento();
    if (!isTestoValido(tipoDocumento)) {
      alObb.add(CTR_MESSAGE_TIPO_DOCUMENTO);
    } else {
      if (_readKey("tipodocumento", tipoDocumento) != null) {
        // Controllo tipo documento e verso
        ctrTipoDocumento(alObb, wsdmprotocolloDocumentoIn);
        // Mittenti/destinatari in funzione del verso
        if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
          if (wsdmprotocolloDocumentoIn.getMittenti() == null) alObb.add(CTR_MESSAGE_MITTENTE);
        } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
          if (wsdmprotocolloDocumentoIn.getDestinatari() == null) alObb.add(CTR_MESSAGE_DESTINATARIO);
        }

        // Controlli aggiuntivi
        if (isTestoValido(tipoDocumento)) {
          String obb = _readKey(wsdmprotocolloDocumentoIn.getTipoDocumento(), "obb");
          if (obb != null) {
            String obbs[] = obb.split(",");
            if (obbs != null && obbs.length > 0) {
              for (int o = 0; o < obbs.length; o++) {
                // Dati di pubblicazione, utilizzati per l'invio del bando
                if ("pubblicazione".equals(obbs[o])) {
                  if (wsdmprotocolloDocumentoIn.getPubblicazioneDal() == null || wsdmprotocolloDocumentoIn.getPubblicazioneAl() == null) {
                    alObb.add(CTR_MESSAGE_PUBBLICAZIONE);
                  }
                }
                // Testo della email PEC
                if ("testo_pec".equals(obbs[o])) {
                  if (wsdmprotocolloDocumentoIn.getInviaMail() == null) {
                    alObb.add(CTR_MESSAGE_TESTO_PEC);
                  } else {
                    WSDMInviaMail inviaMail = wsdmprotocolloDocumentoIn.getInviaMail();
                    if (!isTestoValido(inviaMail.getTestoMail())) {
                      alObb.add(CTR_MESSAGE_TESTO_PEC);
                    }
                  }
                }
              }
            }
          }
        }
      } else {
        alObb.add(CTR_MESSAGE_TIPO_DOCUMENTO_NON_GESTITO);
      }
    }

    // Controllo fascicolo
    if (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())
        || WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
      if (wsdmprotocolloDocumentoIn.getFascicolo() != null) {
        if (!isTestoValido(wsdmprotocolloDocumentoIn.getFascicolo().getCodiceFascicolo())) alObb.add(CTR_MESSAGE_CODICE_FASCICOLO);
        if (!isTestoValido(wsdmprotocolloDocumentoIn.getFascicolo().getOggettoFascicolo())) alObb.add(CTR_MESSAGE_OGGETTO_FASCICOLO);
      } else {
        alObb.add(CTR_MESSAGE_CODICE_FASCICOLO);
        alObb.add(CTR_MESSAGE_OGGETTO_FASCICOLO);
      }
    } else {
      alObb.add(CTR_MESSAGE_FASCICOLO);
    }

    // Controllo allegati
    WSDMProtocolloAllegato[] allegati = wsdmprotocolloDocumentoIn.getAllegati();
    if (allegati != null && allegati.length > 0) {
      for (int fai = 0; fai < allegati.length; fai++) {
        String idAllegato = allegati[fai].getIdAllegato();
        String nome = allegati[fai].getNome();
        if (idAllegato == null) alObb.add("il file allegato " + nome + " e' privo di identificativo univoco");
      }
    }

    return ctrEsito(messaggio, alObb);

  }

  /**
   * Controllo valori in ingresso per la richiesta _documentoInserisci.
   * 
   * @param login
   * @param messaggio
   * @param wsdmprotocolloDocumentoIn
   * @return
   */
  public static boolean ctrDocumentoInserisci(WSDMLoginAttr loginAttr, WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn,
      StringBuffer messaggio) {
    ArrayList<String> alObb = new ArrayList<String>();

    // Controllo login
    ctrLoginAttrAOO(loginAttr, alObb);

    // Controllo compatibilita' tra inserimento documentale e verso
    if (!wsdmprotocolloDocumentoIn.getInout().toString().equals("INT")) alObb.add(CTR_MESSAGE_DOCUMENTALE_IN_OUT_NON_AMMESSE);

    // Identificativo univoco documento. Fondamentale per l'annullamento della
    // protocollazione (vedi email di Massimo Esposito del 12/12/2017).
    if (wsdmprotocolloDocumentoIn.getIdDocumento() == null) alObb.add(CTR_MESSAGE_ID_DOCUMENTO);

    // Controllo tipo documento
    String tipoDocumento = wsdmprotocolloDocumentoIn.getTipoDocumento();
    if (!isTestoValido(tipoDocumento)) {
      alObb.add(CTR_MESSAGE_TIPO_DOCUMENTO);
    } else {
      if (_readKey("tipodocumento", tipoDocumento) != null) {
        ctrTipoDocumento(alObb, wsdmprotocolloDocumentoIn);
      } else {
        alObb.add(CTR_MESSAGE_TIPO_DOCUMENTO_NON_GESTITO);
      }
    }

    // Controllo fascicolo
    if (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())
        || WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
      if (wsdmprotocolloDocumentoIn.getFascicolo() != null) {
        if (!isTestoValido(wsdmprotocolloDocumentoIn.getFascicolo().getCodiceFascicolo())) alObb.add(CTR_MESSAGE_CODICE_FASCICOLO);
        if (!isTestoValido(wsdmprotocolloDocumentoIn.getFascicolo().getOggettoFascicolo())) alObb.add(CTR_MESSAGE_OGGETTO_FASCICOLO);
      } else {
        alObb.add(CTR_MESSAGE_CODICE_FASCICOLO);
        alObb.add(CTR_MESSAGE_OGGETTO_FASCICOLO);
      }
    } else {
      alObb.add(CTR_MESSAGE_FASCICOLO);
    }

    // Controllo allegati
    WSDMProtocolloAllegato[] allegati = wsdmprotocolloDocumentoIn.getAllegati();
    if (allegati != null && allegati.length > 0) {
      for (int fai = 0; fai < allegati.length; fai++) {
        String idAllegato = allegati[fai].getIdAllegato();
        String nome = allegati[fai].getNome();
        if (idAllegato == null) alObb.add("il file allegato " + nome + " e' privo di identificativo univoco");
      }
    }

    return ctrEsito(messaggio, alObb);
  }

  /**
   * Controllo valori in ingresso per la richiesta _protocolloLeggi.
   * 
   * @param login
   * @param numeroProtocollo
   * @param messaggio
   * @return
   */
  public static boolean ctrProtocolloLeggi(WSDMLoginAttr loginAttr, Long annoProtocollo, String numeroProtocollo, StringBuffer messaggio) {
    ArrayList<String> alObb = new ArrayList<String>();
    ctrLoginAttrProfilo(loginAttr, alObb);
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
    ctrLoginAttrProfilo(loginAttr, alObb);
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
    ctrLoginAttrProfilo(loginAttr, alObb);
    if (!isTestoValido(codiceFascicolo) && !isTestoValido(numeroFascicolo)) alObb.add(CTR_MESSAGE_CODICE_NUMERO_FASCICOLO);
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
    return true;
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
   * Controllo valori obbligatori per l'oggetto Login per l'inserimento dei
   * documenti
   * 
   * @param login
   * @param alObb
   */
  public static void ctrLoginAttrAOO(WSDMLoginAttr loginAttr, ArrayList<String> alObb) {
    if (loginAttr == null) {
      alObb.add(CTR_MESSAGE_LOGIN_CODICE_AMM_AOO);
    } else if (loginAttr != null && loginAttr.getLoginTitAttr() == null) {
      alObb.add(CTR_MESSAGE_LOGIN_CODICE_AMM_AOO);
    } else if (loginAttr != null && loginAttr.getLoginTitAttr() != null) {
      if (!isTestoValido(loginAttr.getLoginTitAttr().getCodiceAmministrazioneAoo())) alObb.add(CTR_MESSAGE_LOGIN_CODICE_AMM_AOO);
    }
  }

  /**
   * Controllo valori obbligatori per l'oggetto Login per la lettura dei
   * documenti
   * 
   * @param login
   * @param alObb
   */
  public static void ctrLoginAttrProfilo(WSDMLoginAttr loginAttr, ArrayList<String> alObb) {
    if (loginAttr == null) {
      alObb.add(CTR_MESSAGE_LOGIN_NUMERO_PROFILO);
    } else if (loginAttr != null && loginAttr.getLoginTitAttr() == null) {
      alObb.add(CTR_MESSAGE_LOGIN_NUMERO_PROFILO);
    } else if (loginAttr != null && loginAttr.getLoginTitAttr() != null) {
      if (!isTestoValido(loginAttr.getLoginTitAttr().getNumeroProfilo())) alObb.add(CTR_MESSAGE_LOGIN_NUMERO_PROFILO);
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
