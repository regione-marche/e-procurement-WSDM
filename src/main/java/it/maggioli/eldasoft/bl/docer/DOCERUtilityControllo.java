package it.maggioli.eldasoft.bl.docer;

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
public class DOCERUtilityControllo {

  static private final String CTR_MESSAGE                                  = "La richiesta non puo' essere inoltrata a causa dei seguenti controlli:";

  static private final String CTR_MESSAGE_MITTENTE                         = "indicare almeno un mittente (protocolloDocumentoIn.mittenti)";
  static private final String CTR_MESSAGE_DESTINATARIO                     = "indicare almeno un destinatario (protocolloDocumentoIn.destinatari)";
  static private final String CTR_MESSAGE_OGGETTO                          = "valorizzare l'oggetto (protocolloDocumentoIn.oggetto)";
  static private final String CTR_MESSAGE_FIRMA                            = "valorizzare il tipo di firma (protocolloDocumentoIn.genericS11)";

  static private final String CTR_MESSAGE_UNITA_DESTINATARIA_DENOMINAZIONE = "valorizzare la denominazione dell'unita' organizzativa destinataria (protocolloDocumentoIn.genericS31)";
  static private final String CTR_MESSAGE_UNITA_DESTINATARIA_CODICE        = "valorizzare il codice identificativo dell'unita' organizzativa destinataria (protocolloDocumentoIn.genericS32)";
  static private final String CTR_MESSAGE_UNITA_MITTENTE_DENOMINAZIONE     = "valorizzare la denominazione dell'unita' organizzativa mittente (protocolloDocumentoIn.genericS21)";
  static private final String CTR_MESSAGE_UNITA_MITTENTE_CODICE            = "valorizzare il codice identificativo dell'unita' organizzativa mittente (protocolloDocumentoIn.genericS22)";

  static private final String CTR_MESSAGE_IN_OUT                           = "definire il verso della protocollazione (protocolloDocumentoIn.inout)";
  static private final String CTR_MESSAGE_PROTOCOLLO_INT_NON_AMMESSA       = "non e' ammessa la protocollazione di tipo interno (INT) (protocolloDocumentoIn.inout)";
  static private final String CTR_MESSAGE_PROTOCOLLO_SOLO_INT_AMMESSA      = "e' ammessa solo la protocollazione di tipo interno (INT) (protocolloDocumentoIn.inout)";
  static private final String CTR_MESSAGE_ALLEGATO                         = "inserire almeno un allegato (protocolloDocumentoIn.allegati)";
  static private final String CTR_MESSAGE_TIPO_DOCUMENTO                   = "il tipo documento non e' valorizzato (protocolloDocumentoIn.tipoDocumento)";

  static private final String CTR_MESSAGE_FASCICOLO_CLASSIFICA             = "valorizza la classifica del fascicolo (fascicoloIn.classificaFascicolo)";
  static private final String CTR_MESSAGE_FASCICOLO_ANNO                   = "valorizzare l'anno del fascicolo (fascicoloIn.annoFascicolo)";
  static private final String CTR_MESSAGE_FASCICOLO_NUMERO                 = "valorizzare il numero del fascicolo (fascicoloIn.numeroFascicolo)";

  /**
   * Controllo dei dati in ingresso per il protocollo.
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

    // Oggetto
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getOggetto())) alObb.add(CTR_MESSAGE_OGGETTO);

    // Firma (elemento generico genericS11)
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getGenericS11())) alObb.add(CTR_MESSAGE_FIRMA);

    // Tipo documento
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getTipoDocumento())) alObb.add(CTR_MESSAGE_TIPO_DOCUMENTO);

    if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
      // Denominazione dell'unita' organizzativa
      if (!isTestoValido(wsdmprotocolloDocumentoIn.getGenericS31())) alObb.add(CTR_MESSAGE_UNITA_DESTINATARIA_DENOMINAZIONE);
      // Codice dell'unita' organizzativa
      if (!isTestoValido(wsdmprotocolloDocumentoIn.getGenericS32())) alObb.add(CTR_MESSAGE_UNITA_DESTINATARIA_CODICE);
    } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      // Denominazione dell'unita' organizzativa
      if (!isTestoValido(wsdmprotocolloDocumentoIn.getGenericS21())) alObb.add(CTR_MESSAGE_UNITA_MITTENTE_DENOMINAZIONE);
      // Codice dell'unita' organizzativa
      if (!isTestoValido(wsdmprotocolloDocumentoIn.getGenericS22())) alObb.add(CTR_MESSAGE_UNITA_MITTENTE_CODICE);
    }

    // Inserimento in un fascicolo
    if (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
      if (wsdmprotocolloDocumentoIn.getFascicolo() != null) {
        if (!isTestoValido(wsdmprotocolloDocumentoIn.getFascicolo().getClassificaFascicolo())) {
          alObb.add(CTR_MESSAGE_FASCICOLO_CLASSIFICA);
        }
        if (!isTestoValido(wsdmprotocolloDocumentoIn.getFascicolo().getNumeroFascicolo())) {
          alObb.add(CTR_MESSAGE_FASCICOLO_NUMERO);
        }
        if (wsdmprotocolloDocumentoIn.getFascicolo().getAnnoFascicolo() == null) {
          alObb.add(CTR_MESSAGE_FASCICOLO_ANNO);
        }
      } else {
        alObb.add(CTR_MESSAGE_FASCICOLO_CLASSIFICA);
        alObb.add(CTR_MESSAGE_FASCICOLO_NUMERO);
        alObb.add(CTR_MESSAGE_FASCICOLO_ANNO);
      }
    } else {
      alObb.add(CTR_MESSAGE_FASCICOLO_CLASSIFICA);
      alObb.add(CTR_MESSAGE_FASCICOLO_NUMERO);
      alObb.add(CTR_MESSAGE_FASCICOLO_ANNO);
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

    // Mittenti e destinatari
    if (!WSDMProtocolloInOut.INT.equals(wsdmprotocolloDocumentoIn.getInout())) {
      alObb.add(CTR_MESSAGE_PROTOCOLLO_SOLO_INT_AMMESSA);
    }

    // Oggetto
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getOggetto())) alObb.add(CTR_MESSAGE_OGGETTO);

    // Firma (elemento generico genericS11)
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getGenericS11())) alObb.add(CTR_MESSAGE_FIRMA);

    // Tipo documento
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getTipoDocumento())) alObb.add(CTR_MESSAGE_TIPO_DOCUMENTO);

    // Unita' organizzativa destinataria
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getGenericS31())) alObb.add(CTR_MESSAGE_UNITA_DESTINATARIA_DENOMINAZIONE);
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getGenericS32())) alObb.add(CTR_MESSAGE_UNITA_DESTINATARIA_CODICE);
   
    // Unita' organizzativa mittente
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getGenericS21())) alObb.add(CTR_MESSAGE_UNITA_MITTENTE_DENOMINAZIONE);
    if (!isTestoValido(wsdmprotocolloDocumentoIn.getGenericS22())) alObb.add(CTR_MESSAGE_UNITA_MITTENTE_CODICE);

    // Inserimento in un fascicolo
    if (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
      if (wsdmprotocolloDocumentoIn.getFascicolo() != null) {
        if (!isTestoValido(wsdmprotocolloDocumentoIn.getFascicolo().getClassificaFascicolo())) {
          alObb.add(CTR_MESSAGE_FASCICOLO_CLASSIFICA);
        }
        if (!isTestoValido(wsdmprotocolloDocumentoIn.getFascicolo().getNumeroFascicolo())) {
          alObb.add(CTR_MESSAGE_FASCICOLO_NUMERO);
        }
        if (wsdmprotocolloDocumentoIn.getFascicolo().getAnnoFascicolo() == null) {
          alObb.add(CTR_MESSAGE_FASCICOLO_ANNO);
        }
      } else {
        alObb.add(CTR_MESSAGE_FASCICOLO_CLASSIFICA);
        alObb.add(CTR_MESSAGE_FASCICOLO_NUMERO);
        alObb.add(CTR_MESSAGE_FASCICOLO_ANNO);
      }
    } else {
      alObb.add(CTR_MESSAGE_FASCICOLO_CLASSIFICA);
      alObb.add(CTR_MESSAGE_FASCICOLO_NUMERO);
      alObb.add(CTR_MESSAGE_FASCICOLO_ANNO);
    }

    // Allegati
    if (wsdmprotocolloDocumentoIn.getAllegati() == null) alObb.add(CTR_MESSAGE_ALLEGATO);

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
