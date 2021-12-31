/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.maggioli.eldasoft.bl.protservice;

//import it.viterbo.protservice;
import it.viterbo.protservice.*;
import it.maggioli.eldasoft.ws.dm.WSDMFascicolo;
import it.maggioli.eldasoft.ws.dm.WSDMInserimentoInFascicolo;
import it.maggioli.eldasoft.ws.dm.WSDMInviaMail;
import it.maggioli.eldasoft.ws.dm.WSDMLoginAttr;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloAnagrafica;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloDocumentoIn;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloInOut;

import java.util.ArrayList;

/**
 * Classe di utilita' a supporto delle richieste di protocollo e fascicolo.
 *
 *
 */
public class ProtServiceUtilityControllo {

    static private final String CTR_MESSAGE = "La richiesta non puo' essere inoltrata a causa dei seguenti controlli: ";
    static private final String CTR_MESSAGE_CLASSIFICA = "valorizzare la classificazione";
    static private final String CTR_MESSAGE_OGGETTO = "valorizzare l'oggetto";
    static private final String CTR_MESSAGE_MITTENTE = "inserire il mittente";
    static private final String CTR_MESSAGE_DESTINATARIO = "inserire almeno un destinatario";
    static private final String CTR_MESSAGE_ALLEGATO = "inserire almeno un allegato";
    static private final String CTR_MESSAGE_TIPO_DOCUMENTO = "indicare il tipo di documento";

    /**
     * Controllo valori in ingresso per la richiesta _protocolloInserisci
     *
     * @param login
     * @param messaggio
     * @param wsdmprotocolloDocumentoIn
     * @return
     */
    public static boolean ctrProtocolloInserisci(WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn,
            StringBuffer messaggio) {
        ArrayList<String> alObb = new ArrayList<String>();

        if (wsdmprotocolloDocumentoIn.getOggetto() == null) {
            alObb.add(CTR_MESSAGE_OGGETTO);
        }

        if (wsdmprotocolloDocumentoIn.getClassifica() == null) {
            alObb.add(CTR_MESSAGE_CLASSIFICA);
        }

        //Mittenti/destinatari in funzione del verso
        if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
            WSDMProtocolloAnagrafica[] wsdmMittenti = wsdmprotocolloDocumentoIn.getMittenti();

            if (wsdmMittenti == null || wsdmMittenti.length == 0) {
                alObb.add(CTR_MESSAGE_MITTENTE);
            }
        } else if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
            WSDMProtocolloAnagrafica[] wsdmDestinatari = wsdmprotocolloDocumentoIn.getDestinatari();

            if (wsdmDestinatari == null || wsdmDestinatari.length == 0) {
                alObb.add(CTR_MESSAGE_DESTINATARIO);
            }
        }

        if (wsdmprotocolloDocumentoIn.getTipoDocumento() == null) {
            alObb.add(CTR_MESSAGE_TIPO_DOCUMENTO);
        }

        //Presenza allegati
        if (wsdmprotocolloDocumentoIn.getAllegati() == null) {
            alObb.add(CTR_MESSAGE_ALLEGATO);
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
                if (m > 0) {
                    infoObb += ", ";
                }
                infoObb += obb[m];
            }
            messaggio.append(CTR_MESSAGE + " " + infoObb + ".");
        }
        return esito;
    }
}
