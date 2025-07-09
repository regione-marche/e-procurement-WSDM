package it.maggioli.eldasoft.bl.paleo;

import it.maggioli.eldasoft.ws.dm.*;

import java.util.ArrayList;

/**
 * Classe di utilita' a supporto delle richieste di protocollo e fascicolo.
 */
public class Paleo2UtilityControllo {

    static private final String CTR_MESSAGE = "La richiesta non puo' essere inoltrata a causa dei seguenti controlli: ";
    static private final String CTR_MESSAGE_NOME = "valorizzare il nome dell'utente";
    static private final String CTR_MESSAGE_COGNOME = "valorizzare il cognome dell'utente";
    static private final String CTR_MESSAGE_CODICEUO = "valorizzare il codiceUO";
    static private final String CTR_MESSAGE_RUOLO = "valorizzare il ruolo dell'utente";
    static private final String CTR_MESSAGE_CODICE_REGISTRO = "valorizzare il codice del registro";
    static private final String CTR_MESSAGE_CODICE_FASCICOLO = "valorizzare il codice del fascicolo";
    static private final String CTR_MESSAGE_CLASSIFICA_FASCICOLO = "valorizzare la classifica del fascicolo";
    static private final String CTR_MESSAGE_OGGETTO_FASCICOLO = "valorizzare l'oggetto del fascicolo";
    static private final String CTR_MESSAGE_MITTENTE = "inserire il mittente";
    static private final String CTR_MESSAGE_MITTENTE_PIU = "inserire un solo mittente";
    static private final String CTR_MESSAGE_DESTINATARIO = "inserire almeno un destinatario";
    static private final String CTR_MESSAGE_ALLEGATO = "inserire almeno un allegato";
    static private final String CTR_MESSAGE_ALLEGATO_NUMERO_MAX = "il numero di allegati non puo' essere superiore a 100";
    static private final String CTR_MESSAGE_ALLEGATO_DIMENSIONE_MAX = "l'allegato non puo' avere una dimensione superiore a 30MB";
    static private final String CTR_MESSAGE_NUMERO_PROTOCOLLO = "indicare il numero protocollo";
    static private final String CTR_MESSAGE_NUMERO_DOCUMENTO = "indicare il numero documento";
    static private final String CTR_MESSAGE_NUMERO_DOCUMENTO_NUMERICO = "il numero documento deve essere numerico";
    static private final String CTR_MESSAGE_TIPO_RUBRICA_MITTENTE = "indicare il tipo di voce rubrica per il mittente";
    static private final String CTR_MESSAGE_TIPO_RUBRICA_DESTINATARI = "indicare il tipo di voce rubrica per tutti i destinatari";

    static private final String CTR_MESSAGE_TRASMISSIONE = "valorizzare i dati per la trasmissione";
    static private final String CTR_MESSAGE_TRASMISSIONE_NUMERO_DOCUMENTO = "indicare il numero documento";
    static private final String CTR_MESSAGE_TRASMISSIONE_UTENTI = "indicare la lista degli utenti cui trasmettere il documento";
    static private final String CTR_MESSAGE_TRASMISSIONE_OPERATORE = "indicare i dati dell'operatore";
    static private final String CTR_MESSAGE_TRASMISSIONE_TIPO = "indicare il tipo di trasmissione";

    static private final String CTR_MESSAGE_CUSTODE_FASCICOLO = "valorizzare i dati del custode del fascicolo";
    static private final String CTR_MESSAGE_CUSTODE_NOME = "valorizzare il nome del custode";
    static private final String CTR_MESSAGE_CUSTODE_COGNOME = "valorizzare il cognome del nome";
    static private final String CTR_MESSAGE_CUSTODE_CODICEUO = "valorizzare il codiceUO del custode";
    static private final String CTR_MESSAGE_CUSTODE_RUOLO = "valorizzare il ruolo del custode";


    static private final int NUMERO_MASSIMO_ALLEGATI = 100;
    static private final double DIMENSIONE_MASSIMA_ALLEGATO = 30 * 1024 * 1024;

    /**
     * Controllo valori in ingresso per la richiesta _protocolloInserisci
     */
    public static boolean ctrProtocolloInserisci(WSDMLoginAttr loginAttr, WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn,
                                                 StringBuffer messaggio) {
        ArrayList<String> alObb = new ArrayList<>();
        ctrLoginAttr(loginAttr, alObb);

        // Codice registro, solo se si tratta di protocollo in uscita o in ingresso
        if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())
                || WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
            if (!isTestoValido(wsdmprotocolloDocumentoIn.getCodiceRegistro())) alObb.add(CTR_MESSAGE_CODICE_REGISTRO);
        }

        // Mittenti/destinatari in funzione del verso
        if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
            if (wsdmprotocolloDocumentoIn.getMittenti() == null) {
                alObb.add(CTR_MESSAGE_MITTENTE);
            } else {
                WSDMProtocolloAnagrafica[] mittenti = wsdmprotocolloDocumentoIn.getMittenti();
                if (mittenti[0].getTipoVoceRubrica() == null)
                    alObb.add(CTR_MESSAGE_TIPO_RUBRICA_MITTENTE);

                if (mittenti != null && mittenti.length > 1) {
                    alObb.add(CTR_MESSAGE_MITTENTE_PIU);
                }
            }

        } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
            if (wsdmprotocolloDocumentoIn.getDestinatari() == null) {
                alObb.add(CTR_MESSAGE_DESTINATARIO);
            } else {
                WSDMProtocolloAnagrafica[] destinatari = wsdmprotocolloDocumentoIn.getDestinatari();
                if (destinatari != null && destinatari.length > 0) {
                    for (int d = 0; d < destinatari.length; d++) {
                        if (destinatari[d].getTipoVoceRubrica() == null)
                            alObb.add(CTR_MESSAGE_TIPO_RUBRICA_DESTINATARI);
                    }
                }
            }
        }

        // Presenza allegati
        if (wsdmprotocolloDocumentoIn.getAllegati() == null) alObb.add(CTR_MESSAGE_ALLEGATO);

        // Controllo numero massimo allegati, dimensione massima di ogni allegato
        if (wsdmprotocolloDocumentoIn.getAllegati() != null) {

            if (wsdmprotocolloDocumentoIn.getAllegati().length > NUMERO_MASSIMO_ALLEGATI) {
                alObb.add(CTR_MESSAGE_ALLEGATO_NUMERO_MAX);
            }

            for (int a = 0; a < wsdmprotocolloDocumentoIn.getAllegati().length; a++) {
                WSDMProtocolloAllegato allegato = wsdmprotocolloDocumentoIn.getAllegati()[a];
                if (allegato != null && allegato.getContenuto().length > DIMENSIONE_MASSIMA_ALLEGATO) {
                    alObb.add(CTR_MESSAGE_ALLEGATO_DIMENSIONE_MAX + " [" + allegato.getNome() + "]");
                }
            }

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
                alObb.add(CTR_MESSAGE_CODICE_FASCICOLO);
            } else {
                if (!isTestoValido(wsdmFascicolo.getCodiceFascicolo())) alObb.add(CTR_MESSAGE_CODICE_FASCICOLO);
            }
        }

        return ctrEsito(messaggio, alObb);
    }

    /**
     * Controllo valori in ingresso per la richiesta _documentoInserisci.
     */
    public static boolean ctrDocumentoInserisci(WSDMLoginAttr loginAttr, WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn,
                                                StringBuffer messaggio) {
        ArrayList<String> alObb = new ArrayList<>();
        ctrLoginAttr(loginAttr, alObb);

        // Presenza allegati
        if (wsdmprotocolloDocumentoIn.getAllegati() == null) alObb.add(CTR_MESSAGE_ALLEGATO);

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
                alObb.add(CTR_MESSAGE_CODICE_FASCICOLO);
            } else {
                if (!isTestoValido(wsdmFascicolo.getCodiceFascicolo())) alObb.add(CTR_MESSAGE_CODICE_FASCICOLO);
            }
        }

        return ctrEsito(messaggio, alObb);
    }

    /**
     * Controllo valori in ingresso per la richiesta _protocolloLeggi.
     */
    public static boolean ctrProtocolloLeggi(WSDMLoginAttr loginAttr, String numeroProtocollo, StringBuffer messaggio) {
        ArrayList<String> alObb = new ArrayList<>();
        ctrLoginAttr(loginAttr, alObb);
        if (!isTestoValido(numeroProtocollo)) alObb.add(CTR_MESSAGE_NUMERO_PROTOCOLLO);
        return ctrEsito(messaggio, alObb);
    }

    /**
     * Controllo valori in ingresso per la richiesta _documentoLeggi.
     */
    public static boolean ctrDocumentoLeggi(WSDMLoginAttr loginAttr, String numeroDocumento, StringBuffer messaggio) {
        ArrayList<String> alObb = new ArrayList<>();
        ctrLoginAttr(loginAttr, alObb);
        if (!isTestoValido(numeroDocumento)) {
            alObb.add(CTR_MESSAGE_NUMERO_DOCUMENTO);
        } else {
            try {
                Integer.valueOf(numeroDocumento);
            } catch (Throwable t) {
                alObb.add(CTR_MESSAGE_NUMERO_DOCUMENTO_NUMERICO);
            }
        }

        return ctrEsito(messaggio, alObb);
    }

    /**
     * Controllo valori in ingresso per la richiesta _fascicoloLeggi.
     */
    public static boolean ctrFascicoloLeggi(WSDMLoginAttr loginAttr, String codiceFascicolo, Long annoFascicolo, String numeroFascicolo,
                                            StringBuffer messaggio) {
        ArrayList<String> alObb = new ArrayList<>();
        ctrLoginAttr(loginAttr, alObb);
        if (!isTestoValido(codiceFascicolo)) alObb.add(CTR_MESSAGE_CODICE_FASCICOLO);
        return ctrEsito(messaggio, alObb);
    }

    /**
     * Controlla valori obbligatori per l'invio mail.
     */
    public static boolean ctrInviaMail(WSDMLoginAttr loginAttr, WSDMInviaMail wsdmInviaMail, StringBuffer messaggio) {
        ArrayList<String> alObb = new ArrayList<>();
        ctrLoginAttr(loginAttr, alObb);

        if (!isTestoValido(wsdmInviaMail.getNumeroDocumento())) {
            alObb.add(CTR_MESSAGE_NUMERO_DOCUMENTO);
        } else {
            try {
                Integer.valueOf(wsdmInviaMail.getNumeroDocumento());
            } catch (Throwable t) {
                alObb.add(CTR_MESSAGE_NUMERO_DOCUMENTO_NUMERICO);
            }
        }

        return ctrEsito(messaggio, alObb);
    }

    /**
     * Controlla valori obbligatori per la richiesta di trasmissione (delega,
     * inoltro)
     */
    public static boolean ctrTrasmissione(WSDMLoginAttr loginAttr, WSDMTrasmissioneIn trasmissioneIn, StringBuffer messaggio) {
        ArrayList<String> alObb = new ArrayList<>();
        ctrLoginAttr(loginAttr, alObb);

        if (trasmissioneIn == null) {
            alObb.add(CTR_MESSAGE_TRASMISSIONE);
        } else if (trasmissioneIn.getDocumenti() == null) {
            alObb.add(CTR_MESSAGE_TRASMISSIONE);
        } else if (trasmissioneIn.getDocumenti().length == 0) {
            alObb.add(CTR_MESSAGE_TRASMISSIONE);
        } else {
            for (int d = 0; d < trasmissioneIn.getDocumenti().length; d++) {
                WSDMTrasmissioneDocumento trasmissioneDocumento = trasmissioneIn.getDocumenti()[d];
                if (!isTestoValido(trasmissioneDocumento.getNumeroDocumento())) {
                    alObb.add(CTR_MESSAGE_TRASMISSIONE_NUMERO_DOCUMENTO);
                }
                if (trasmissioneDocumento.getUtenti() == null) {
                    alObb.add(CTR_MESSAGE_TRASMISSIONE_UTENTI);
                } else if (trasmissioneDocumento.getUtenti().length == 0) {
                    alObb.add(CTR_MESSAGE_TRASMISSIONE_UTENTI);
                } else {
                    for (int u = 0; u < trasmissioneDocumento.getUtenti().length; u++) {
                        WSDMTrasmissioneUtente trasmissioneUtente = trasmissioneDocumento.getUtenti()[u];

                        if (trasmissioneUtente.getOperatore() == null) {
                            alObb.add(CTR_MESSAGE_TRASMISSIONE_OPERATORE);
                        } else {
                            if (!isTestoValido(trasmissioneUtente.getOperatore().getCodiceUO()))
                                alObb.add(CTR_MESSAGE_CODICEUO);
                            if (!isTestoValido(trasmissioneUtente.getOperatore().getCognome()))
                                alObb.add(CTR_MESSAGE_COGNOME);
                            if (!isTestoValido(trasmissioneUtente.getOperatore().getRuolo()))
                                alObb.add(CTR_MESSAGE_RUOLO);
                        }

                        if (!isTestoValido(trasmissioneUtente.getTipoTrasmissione()))
                            alObb.add(CTR_MESSAGE_TRASMISSIONE_TIPO);

                    }
                }

            }
        }

        return ctrEsito(messaggio, alObb);
    }

    public static boolean ctrFascicoloChiudi(WSDMLoginAttr loginAttr, WSDMFascicoloChiudiIn fascicoloChiudiIn, StringBuffer messaggio) {
        ArrayList<String> alObb = new ArrayList<>();
        ctrLoginAttr(loginAttr, alObb);

        // Controllo codice fascicolo e custode
        if (fascicoloChiudiIn != null) {

            // Codice del fascicolo
            if (!isTestoValido(fascicoloChiudiIn.getCodiceFascicolo())) {
                alObb.add(CTR_MESSAGE_CODICE_FASCICOLO);
            }

            // Custode
            if (fascicoloChiudiIn.getCustode() == null) {
                alObb.add(CTR_MESSAGE_CUSTODE_FASCICOLO);
            } else {
                if (!isTestoValido(fascicoloChiudiIn.getCustode().getNome())) alObb.add(CTR_MESSAGE_CUSTODE_NOME);
                if (!isTestoValido(fascicoloChiudiIn.getCustode().getCognome())) alObb.add(CTR_MESSAGE_CUSTODE_COGNOME);
                if (!isTestoValido(fascicoloChiudiIn.getCustode().getCodiceUO())) alObb.add(CTR_MESSAGE_CUSTODE_CODICEUO);
                if (!isTestoValido(fascicoloChiudiIn.getCustode().getRuolo())) alObb.add(CTR_MESSAGE_CUSTODE_RUOLO);
            }

        } else {
            alObb.add(CTR_MESSAGE_CODICE_FASCICOLO);
            alObb.add(CTR_MESSAGE_CUSTODE_FASCICOLO);
        }

        return ctrEsito(messaggio, alObb);
    }

    /**
     * Gestione esito sul controllo dati obbligatori e formattazione del
     * messaggio.
     */
    public static boolean ctrEsito(StringBuffer messaggio, ArrayList<String> alObb) {
        boolean esito = true;
        if (!alObb.isEmpty()) {
            esito = false;
            String[] obb = new String[alObb.size()];
            obb = alObb.toArray(obb);
            String infoObb = "";
            for (int m = 0; m < obb.length; m++) {
                if (m > 0) infoObb += ", ";
                infoObb += obb[m];
            }
            messaggio.append(CTR_MESSAGE + " ").append(infoObb).append(".");
        }
        return esito;
    }

    /**
     * Controllo valori obbligatori per l'oggetto Login.
     */
    public static void ctrLoginAttr(WSDMLoginAttr loginAttr, ArrayList<String> alObb) {
        if (loginAttr == null) {
            alObb.add(CTR_MESSAGE_NOME);
            alObb.add(CTR_MESSAGE_COGNOME);
            alObb.add(CTR_MESSAGE_CODICEUO);
            alObb.add(CTR_MESSAGE_RUOLO);
        } else {
            if (!isTestoValido(loginAttr.getNome())) alObb.add(CTR_MESSAGE_NOME);
            if (!isTestoValido(loginAttr.getCognome())) alObb.add(CTR_MESSAGE_COGNOME);
            if (!isTestoValido(loginAttr.getCodiceUO())) alObb.add(CTR_MESSAGE_CODICEUO);
            if (!isTestoValido(loginAttr.getRuolo())) alObb.add(CTR_MESSAGE_RUOLO);
        }
    }

    /**
     * Controlla se la stringa è valorizzata
     */
    private static boolean isTestoValido(String str) {
        boolean isTestoValido;
        if (str == null || (str != null && "".equals(str.trim()))) {
            isTestoValido = false;
        } else {
            isTestoValido = true;
        }
        return isTestoValido;
    }

}
