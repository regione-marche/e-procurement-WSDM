package it.maggioli.eldasoft.bl.paleo;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.WebServiceException;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import it.maggioli.eldasoft.ws.dm.*;
import it.marche.regione.paleo2.*;
import org.apache.commons.lang.StringUtils;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.message.Message;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.log4j.Logger;
import org.apache.ws.security.WSConstants;
import org.apache.ws.security.handler.WSHandlerConstants;
import it.maggioli.eldasoft.bl.IWSDMManager;
import org.datacontract.schemas._2004._07.regionemarche_protocollo2_common.TipoProtocollo;
import org.datacontract.schemas._2004._07.regionemarche_protocollo_common_tipi_digip.*;

/**
 * Manager per la gestione documentale mediante sistema di protocollo PALEO.
 */

public class Paleo2Manager implements IWSDMManager {

    static Logger logger = Logger.getLogger(PaleoManager.class);

    static public final String FASCICOLO_OPERATION_NOT_SUPPORTED = "Operazione non disponibile: la creazione di un fascicolo e l'aggiunta del documento al fascicolo e' disponibile solamente con le operazioni di inserimento protocollo o documento";

    static private final String PALEO_WS = "java:comp/env/PALEO_WS";
    static private final String PALEO_CODICEAMMINISTRAZIONE = "java:comp/env/PALEO_CODICEAMMINISTRAZIONE";

    static private final String PALEO_DOCUMENTOPRIVATO = "java:comp/env/PALEO_DOCUMENTOPRIVATO";

    static private final String PALEO_TA = "java:comp/env/PALEO_TA";
    static private final String PALEO_TA_OP_RUOLO = "java:comp/env/PALEO_TA_OP_RUOLO";
    static private final String PALEO_TA_OP_NOME = "java:comp/env/PALEO_TA_OP_NOME";
    static private final String PALEO_TA_OP_COGNOME = "java:comp/env/PALEO_TA_OP_COGNOME";
    static private final String PALEO_TA_OP_CODICEUO = "java:comp/env/PALEO_TA_OP_CODICEUO";
    static private final String PALEO_TA_TIPO = "java:comp/env/PALEO_TA_TIPO";

    static private final String PALEO_FASCICOLO_MATERIA = "java:comp/env/PALEO_FASCICOLO_MATERIA";
    static private final String PALEO_FASCICOLO_URICATALOGO = "java:comp/env/PALEO_FASCICOLO_URICATALOGO";

    static private final String PALEO_FASCICOLO_OP_RUOLO = "java:comp/env/PALEO_FASCICOLO_OP_RUOLO";
    static private final String PALEO_FASCICOLO_OP_NOME = "java:comp/env/PALEO_FASCICOLO_OP_NOME";
    static private final String PALEO_FASCICOLO_OP_COGNOME = "java:comp/env/PALEO_FASCICOLO_OP_COGNOME";
    static private final String PALEO_FASCICOLO_OP_CODICEUO = "java:comp/env/PALEO_FASCICOLO_OP_CODICEUO";

    static private final String PALEO_FASEPROCEDIMENTO_TIPO = "java:comp/env/PALEO_FASEPROCEDIMENTO_TIPO";


    /**
     * Ottiene iPaleoService configurato con OutInterceptor per l'utilizzo di
     * WS-Security.
     */
    private IPaleoService2 getIPaleo2Service(String username, String password) throws Exception {
        String wsPaleoAddress = InitialContext.doLookup(PALEO_WS);
        if (wsPaleoAddress == null || wsPaleoAddress.trim().isEmpty()) {
            throw new Exception(URL_NOT_DEFINED);
        }
        String paleoCodiceAmministrazione = InitialContext.doLookup(PALEO_CODICEAMMINISTRAZIONE);

        PaleoService2 paleo2Service = new PaleoService2();
        IPaleoService2 iPaleo2Service = paleo2Service.getBasicHttpBindingIPaleoService2();
        Client client = ClientProxy.getClient(iPaleo2Service);
        client.getRequestContext().put(Message.ENDPOINT_ADDRESS, wsPaleoAddress);

        PaleoPasswordCallback paleoPasswordCallback = new PaleoPasswordCallback();
        paleoPasswordCallback.setAliasPassword(paleoCodiceAmministrazione + "\\" + username, password);

        Map<String, Object> outProps = new HashMap<>();
        outProps.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN);
        outProps.put(WSHandlerConstants.USER, paleoCodiceAmministrazione + "\\" + username);
        outProps.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_TEXT);
        outProps.put(WSHandlerConstants.PW_CALLBACK_REF, paleoPasswordCallback);

        client.getOutInterceptors().add(new WSS4JOutInterceptor(outProps));
        return iPaleo2Service;
    }

    @Override
    public WSDMListaProfiliRes _listaProfili(String username, String password, String utenteApplicativo) {
        WSDMListaProfiliRes wsdmListaProfiliRes = new WSDMListaProfiliRes();
        wsdmListaProfiliRes.setEsito(false);
        wsdmListaProfiliRes.setMessaggio(OPERATION_NOT_SUPPORTED);
        return wsdmListaProfiliRes;
    }

    @Override
    public WSDMListaAmministrazioniAooRes _listaAmministrazioniAoo(String username, String password) {
        WSDMListaAmministrazioniAooRes wsdmListaAmministrazioniAooRes = new WSDMListaAmministrazioniAooRes();
        wsdmListaAmministrazioniAooRes.setEsito(false);
        wsdmListaAmministrazioniAooRes.setMessaggio(OPERATION_NOT_SUPPORTED);
        return wsdmListaAmministrazioniAooRes;
    }

    @Override
    public WSDMListaUfficiRes _listaUffici(String username, String password, WSDMLoginAttr loginAttr, String codiceAoo, String descrizioneUfficio, String utente) {
        WSDMListaUfficiRes wsdmListaUfficiRes = new WSDMListaUfficiRes();
        wsdmListaUfficiRes.setEsito(false);
        wsdmListaUfficiRes.setMessaggio(OPERATION_NOT_SUPPORTED);
        return wsdmListaUfficiRes;
    }

    @Override
    public WSDMProtocolloDocumentoRes _protocolloInserisci(String username, String password, WSDMLoginAttr loginAttr, WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {

        WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

        AllegatoHash[] allegatiHash = null;

        try {
            StringBuffer messaggioCtr = new StringBuffer();
            if (Paleo2UtilityControllo.ctrProtocolloInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {
                WSDMProtocolloInOut inOut = wsdmprotocolloDocumentoIn.getInout();

                if (WSDMProtocolloInOut.IN.equals(inOut)) {
                    // Protocollo in ingresso/arrivo
                    _protocolloInserisciArrivo(username, password, loginAttr, wsdmprotocolloDocumentoIn, wsdmprotocolloDocumentoRes, allegatiHash);
                } else if (WSDMProtocolloInOut.OUT.equals(inOut)) {
                    // Protocollo in uscita/partenza
                    _protocolloInserisciPartenza(username, password, loginAttr, wsdmprotocolloDocumentoIn, wsdmprotocolloDocumentoRes, allegatiHash);
                } else if (WSDMProtocolloInOut.INT.equals(inOut)) {
                    // Archiviazione documento interno (si tratta della sola registrazione
                    // del documento)
                    _archiviaDocumentoInterno(username, password, loginAttr, wsdmprotocolloDocumentoIn, wsdmprotocolloDocumentoRes, allegatiHash);
                }

                // Trasmissione automatica
                try {

                    String paleo_ta = InitialContext.doLookup(PALEO_TA);
                    if (paleo_ta != null && paleo_ta.equalsIgnoreCase("true")) {

                        String ta_ruolo = InitialContext.doLookup(PALEO_TA_OP_RUOLO);
                        String ta_nome = InitialContext.doLookup(PALEO_TA_OP_NOME);
                        String ta_cognome = InitialContext.doLookup(PALEO_TA_OP_COGNOME);
                        String ta_codiceuo = InitialContext.doLookup(PALEO_TA_OP_CODICEUO);
                        String ta_tipo = InitialContext.doLookup(PALEO_TA_TIPO);

                        if (wsdmprotocolloDocumentoRes.isEsito()) {
                            if (wsdmprotocolloDocumentoRes.getProtocolloDocumento() != null) {
                                String numeroDocumento = wsdmprotocolloDocumentoRes.getProtocolloDocumento().getNumeroDocumento();

                                WSDMTrasmissioneIn trasmissioneIn = new WSDMTrasmissioneIn();
                                WSDMTrasmissioneDocumento[] trasmissioneDocumenti = new WSDMTrasmissioneDocumento[1];
                                trasmissioneDocumenti[0] = new WSDMTrasmissioneDocumento();

                                // Utente destinatario della trasmissione (costituito da operatore e tipo trasmissione)
                                WSDMTrasmissioneUtente[] trasmissioneUtenti = new WSDMTrasmissioneUtente[1];
                                trasmissioneUtenti[0] = new WSDMTrasmissioneUtente();

                                // Operatore
                                WSDMOperatore operatore = new WSDMOperatore();
                                operatore.setNome(ta_nome);
                                operatore.setCognome(ta_cognome);
                                operatore.setRuolo(ta_ruolo);
                                operatore.setCodiceUO(ta_codiceuo);

                                trasmissioneUtenti[0].setOperatore(operatore);
                                trasmissioneUtenti[0].setTipoTrasmissione(ta_tipo);
                                trasmissioneDocumenti[0].setNumeroDocumento(numeroDocumento);
                                trasmissioneDocumenti[0].setUtenti(trasmissioneUtenti);
                                trasmissioneIn.setDocumenti(trasmissioneDocumenti);

                                WSDMTrasmissioneRes wsdmTrasmissioneRes = _trasmissione(username, password, loginAttr, trasmissioneIn);

                                if (wsdmTrasmissioneRes.isEsito()) {
                                    logger.info("La trasmissione automatica del documento " + numeroDocumento + " e' avvenuta correttamente");
                                } else {
                                    logger.error("Errore durante la trasmissione automatica del documento " + numeroDocumento + ": " + wsdmTrasmissioneRes.getMessaggio());
                                }

                            }
                        }
                    }
                } catch (Exception e) {
                    logger.error("Errore duramente la trasmissione automatica del documento", e);
                }

            } else {
                // Non sono stati superati i controlli di validita'
                wsdmprotocolloDocumentoRes.setEsito(false);
                wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
            }

        } catch (WebServiceException w) {
            wsdmprotocolloDocumentoRes.setEsito(false);
            wsdmprotocolloDocumentoRes.setMessaggio(WS_ERROR + " " + w.getMessage());
            logger.error("Errore (_protocolloInserisci)", w);
        } catch (NamingException e) {
            wsdmprotocolloDocumentoRes.setEsito(false);
            wsdmprotocolloDocumentoRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
            logger.error("Errore (_protocolloInserisci)", e);
        } catch (Throwable t) {
            wsdmprotocolloDocumentoRes.setEsito(false);
            wsdmprotocolloDocumentoRes.setMessaggio(t.getMessage());
            logger.error("Errore (_protocolloInserisci)", t);
        }

        return wsdmprotocolloDocumentoRes;
    }

    /**
     * Inserisce il protocollo in entrata/arrivo
     */
    private void _protocolloInserisciArrivo(String username, String password, WSDMLoginAttr loginAttr, WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn, WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes, AllegatoHash[] allegatiHash) throws Exception {
        IPaleoService2 iPaleo2Service = this.getIPaleo2Service(username, password);
        ReqProtocolloArrivo reqProtocolloArrivo = new ReqProtocolloArrivo();

        // Operatore
        OperatorePaleo operatorePaleo = _getOperatore(loginAttr);
        reqProtocolloArrivo.setOperatore(operatorePaleo);

        // Codice registro
        String codiceRegistro = wsdmprotocolloDocumentoIn.getCodiceRegistro();
        reqProtocolloArrivo.setCodiceRegistro(codiceRegistro);

        // Oggetto
        String oggetto = wsdmprotocolloDocumentoIn.getOggetto();
        reqProtocolloArrivo.setOggetto(oggetto);

        // Documento privato
        // 16/07/2019 - Modifica richiesta per rendere privata la richiesta e
        // successivamente assegnarla con la "trasmissione".
        reqProtocolloArrivo.setPrivato(gestioneDocumentoPrivato());

        // Documento principale e documenti allegati
        allegatiHash = gestioneDocumentoPrincipaleAllegati(wsdmprotocolloDocumentoIn, allegatiHash, reqProtocolloArrivo);

        // Classificazioni, fascicolo... (possibile inserimento su fascicolo
        // esistente o su nuovo fascicolo)
        gestioneFascicolo(wsdmprotocolloDocumentoIn, operatorePaleo, reqProtocolloArrivo);

        // Data arrivo
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        XMLGregorianCalendar now = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
        reqProtocolloArrivo.setDataArrivo(now);

        // Mittente per il protocollo in arrivo (è ammesso un solo mittente che
        // deve essere indicato come corrispondente occasionale)
//        WSDMProtocolloAnagrafica[] mittenti = wsdmprotocolloDocumentoIn.getMittenti();
//        if (mittenti != null && mittenti.length > 0) {
//            // Si considera solamente il primo mittente
//            String codiceRubrica = _gestisciVoceRubrica(username, password, loginAttr, mittenti[0]);
//            reqProtocolloArrivo.setCodiceRubricaMittente(codiceRubrica);
//        }

        // 06/08/2024 Soggetti occasionali AgID
        // Mittente per il protocollo in arrivo (e' ammesso un solo mittente che
        // deve essere indicato come corrispondente occasionale)
        WSDMProtocolloAnagrafica[] mittenti = wsdmprotocolloDocumentoIn.getMittenti();
        if (mittenti != null && mittenti.length > 0) {
            SoggettiXml soggettiXML = new SoggettiXml();
            ArrayOfRuoloType arrayOfRuoloType = new ArrayOfRuoloType();
            List<RuoloType> listRuoloType = arrayOfRuoloType.getRuoloType();
            RuoloType ruoloType = new RuoloType();

            // Tipo soggetto 32 (Protocollo.Common.Tipi.Digip.Protocollo)
            TipoSoggetto32Type tipoSoggetto32Type = new TipoSoggetto32Type();
            tipoSoggetto32Type.setTipoRuolo("Mittente");

            // PGType
            PGType pgType = new PGType();

            // #011: Nell'utilizzo del tipo PGType non riusciamo ad inserire un Codice Fiscale di 16 caratteri (Ditte individuali) perchè viene restituito l'errore:
            //"La sezione Soggetti non risulta conforme allo schema Agid; la verifica ha riportato i seguenti errori: The 'CodiceFiscale_PartitaIva' element is invalid - The value 'XXXYYY99W00A271V' is invalid according to its datatype 'PIType' - The Pattern constraint failed.".
            //Il problema è conosciuto e purtroppo non dipende da Paleo ma dall'XSD di Agid (allegato 5) e quindi non abbiamo margine operativo per correggere l'errore.
            //L'XSD di AGID prevede che l'elemento CodiceFiscale_PartitaIva debba avere una lunghezza di 11 caratteri e questo vincolo esclude i Codici Fiscali
            //Fortunatamente il campo non è obbligatorio.
//            if (StringUtils.isNotBlank(mittenti[0].getPartitaIVA())) {
//                if (mittenti[0].getPartitaIVA().length() == 11) {
//                    pgType.setCodiceFiscalePartitaIva(mittenti[0].getPartitaIVA());
//                }
//            }

            // Denominazione
            String denominazioneOrganizzazione = mittenti[0].getCognomeointestazione();
            if (StringUtils.isNotBlank(mittenti[0].getNome())) {
                denominazioneOrganizzazione += " " + mittenti[0].getNome();
            }
            pgType.setDenominazioneOrganizzazione(denominazioneOrganizzazione);

            // Indirizzo email
            if (StringUtils.isNotBlank(mittenti[0].getEmail())) {
                ArrayOfstring a = new ArrayOfstring();
                a.getString().add(mittenti[0].getEmail());
                pgType.setIndirizziDigitaliDiRiferimento(a);
            }

            tipoSoggetto32Type.setItem(pgType);
            ruoloType.setItem(tipoSoggetto32Type);

            listRuoloType.add(ruoloType);
            soggettiXML.setRuolo(arrayOfRuoloType);
            reqProtocolloArrivo.setSoggettiAgid(soggettiXML);
        }

        // Invio richiesta di protocollo in arrivo e lettura della risposta
        BEBaseOfrespProtocolloArrivoc14F1RMd baseRespProtocolloArrivo = iPaleo2Service.protocollazioneEntrata(reqProtocolloArrivo);
        wsdmprotocolloDocumentoRes.setMessaggio(baseRespProtocolloArrivo.getMessaggioRisultato().getDescrizione());
        if (TipoRisultato.ERROR.equals(baseRespProtocolloArrivo.getMessaggioRisultato().getTipoRisultato())
                || TipoRisultato.EXCEPTION.equals(baseRespProtocolloArrivo.getMessaggioRisultato().getTipoRisultato())) {
            wsdmprotocolloDocumentoRes.setEsito(false);
        } else {

            RespProtocolloArrivo respProtocolloArrivo = baseRespProtocolloArrivo.getOggetto();

            wsdmprotocolloDocumentoRes.setEsito(true);
            WSDMProtocolloDocumento wsdmprotocolloDocumento = new WSDMProtocolloDocumento();

            String numeroDocumento = String.valueOf(respProtocolloArrivo.getDocNumber());
            wsdmprotocolloDocumento.setNumeroDocumento(numeroDocumento);

            try {
                wsdmprotocolloDocumento.setNumeroProtocollo(String.valueOf(respProtocolloArrivo.getNumero()));
            } catch (Exception e) {

            }

            XMLGregorianCalendar dataProtocollo = respProtocolloArrivo.getDataProtocollazione();
            if (dataProtocollo != null) {
                // wsdmprotocolloDocumento.setDataProtocollo(dataProtocollo.toGregorianCalendar().getTime());
                Calendar cal = Calendar.getInstance();
                cal.setTime(dataProtocollo.toGregorianCalendar().getTime());
                wsdmprotocolloDocumento.setAnnoProtocollo((long) cal.get(Calendar.YEAR));
            }

            // 08/02/2018 - La data e l'ora del protocollo viene impostata con la data
            // e l'ora corrente di sistema
            Calendar dataProtocolloToday = Calendar.getInstance();
            wsdmprotocolloDocumento.setDataProtocollo(dataProtocolloToday.getTime());

            // Lettura codice eventuale fascicolo inserito
            if (respProtocolloArrivo.getClassificazioni() != null) {
                List<String> listaClassificazioni = respProtocolloArrivo.getClassificazioni().getString();
                if ((listaClassificazioni != null) && !listaClassificazioni.isEmpty()) {
                    WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();
                    wsdmFascicolo.setCodiceFascicolo(listaClassificazioni.get(0));
                    wsdmprotocolloDocumento.setFascicolo(wsdmFascicolo);
                }
            }

            wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmprotocolloDocumento);

            // Invio degli allegati
            String messaggioAddAllegati = "";
            this._addAllegatiDocumentoProtocollo(username, password, loginAttr, numeroDocumento, allegatiHash, messaggioAddAllegati);
            wsdmprotocolloDocumentoRes.setMessaggio(messaggioAddAllegati);

        }

    }

    /**
     * Gestione delle voci della rubrica Paleo.
     * Le operazioni chiamate sono due: FindRubrica e SaveVoceRubrica.
     * Bisogna verificare prima di tutto la presenza dell'anagrafica nella rubrica Paleo (FindRubrica), se non viene restituito alcun codice anagrafico si procede con l'inserimento (SaveVoceRubrica)
     */
    private String _gestisciVoceRubrica(String username, String password, WSDMLoginAttr loginAttr, WSDMProtocolloAnagrafica wsdmProcolloAnagrafica) throws Exception {
        IPaleoService2 iPaleo2Service = this.getIPaleo2Service(username, password);

        String codiceRubrica = null;

        ReqFindRubrica reqFindRubrica = new ReqFindRubrica();

        // Operatore
        OperatorePaleo operatorePaleo = _getOperatore(loginAttr);
        reqFindRubrica.setOperatore(operatorePaleo);

        // Codice fiscale
        String codiceFiscale = wsdmProcolloAnagrafica.getCodiceFiscale();
        reqFindRubrica.setIdFiscale(codiceFiscale);

        // Tipo voce rubrica
        TipoVoceRubrica tipoVoceRubrica = null;
        if (WSDMTipoVoceRubrica.PERSONA.equals(wsdmProcolloAnagrafica.getTipoVoceRubrica())) {
            tipoVoceRubrica = TipoVoceRubrica.PF;
        } else if (WSDMTipoVoceRubrica.IMPRESA.equals(wsdmProcolloAnagrafica.getTipoVoceRubrica())) {
            tipoVoceRubrica = TipoVoceRubrica.PG;
        } else if (WSDMTipoVoceRubrica.AMMINISTRAZIONE.equals(wsdmProcolloAnagrafica.getTipoVoceRubrica())) {
            tipoVoceRubrica = TipoVoceRubrica.PAI;
        } else if (WSDMTipoVoceRubrica.ALTRO.equals(wsdmProcolloAnagrafica.getTipoVoceRubrica())) {
            tipoVoceRubrica = TipoVoceRubrica.PAE;
        }
        reqFindRubrica.setTipo(tipoVoceRubrica);

        // Invio della richiesta di ricerca in rubrica
        BEListOfRubricaZA0HwLp5 baseRespFindRubrica = iPaleo2Service.findRubrica(reqFindRubrica);
        if (TipoRisultato.ERROR.equals(baseRespFindRubrica.getMessaggioRisultato().getTipoRisultato())
                || TipoRisultato.EXCEPTION.equals(baseRespFindRubrica.getMessaggioRisultato().getTipoRisultato())) {
            throw new Exception(baseRespFindRubrica.getMessaggioRisultato().getDescrizione());
        } else {
            ArrayOfRubrica arrayOfRubrica = baseRespFindRubrica.getLista();
            if (arrayOfRubrica != null && arrayOfRubrica.getRubrica().size() > 0) {
                // Si considera il primo elemento trovato
                Rubrica rubrica = arrayOfRubrica.getRubrica().get(0);
                codiceRubrica = rubrica.getCodiceRubrica();

                // Se è stato trovato più di un elemento si segnala nel log
                if (arrayOfRubrica.getRubrica().size() > 1) {
                    logger.info("Nella ricerca della voce in rubrica per il codice fiscale " + codiceFiscale + " e' stato trovato più di un elemento.");
                }
            } else {
                // In questo caso non è stata trovata nessuna voce in rubrica. Si procede all'inserimento.

                Rubrica rubrica = new Rubrica();

                // 03/06/2024, nell'inserimento di un nuovo elemento della rubrica si deve comunque fornire il codice rubrica.
                // Infatti il tentativo di inserimento senza indicare alcun codice restituisce il messaggio
                // <SaveVoceRubricaResponse xmlns="http://paleo.regione.marche.it/services2/">
                //      <SaveVoceRubricaResult xmlns:i="http://www.w3.org/2001/XMLSchema-instance">
                //        <MessaggioRisultato>
                //          <Descrizione>Codice rubrica obbligatorio.</Descrizione>
                //          <TipoRisultato>Error</TipoRisultato>
                //        </MessaggioRisultato>
                //        <Oggetto xmlns:a="http://paleo.regione.marche.it/services/" i:nil="true"/>
                //      </SaveVoceRubricaResult>
                //    </SaveVoceRubricaResponse>

                // Per il codice rubrica si utilizza, in modo che sia sempre univoco, un codice UUID generato al momento
                UUID uuid = UUID.randomUUID();
                codiceRubrica = uuid.toString();
                rubrica.setCodiceRubrica(codiceRubrica);

                String toponimo = null;
                if (StringUtils.isNotBlank(wsdmProcolloAnagrafica.getIndirizzoResidenza())) {
                    toponimo = wsdmProcolloAnagrafica.getIndirizzoResidenza();
                }
                if (StringUtils.isNotBlank(wsdmProcolloAnagrafica.getLocalitaResidenza())) {
                    toponimo += " - " + wsdmProcolloAnagrafica.getLocalitaResidenza();
                }
                rubrica.setToponimo(toponimo);
                rubrica.setCap(wsdmProcolloAnagrafica.getCapResidenza());
                rubrica.setComune(wsdmProcolloAnagrafica.getComuneResidenza());
                rubrica.setProvincia(wsdmProcolloAnagrafica.getProvinciaResidenza());
                rubrica.setNazione(wsdmProcolloAnagrafica.getNazionalita());
                rubrica.setTelefono(wsdmProcolloAnagrafica.getTelefono());
                rubrica.setFax(wsdmProcolloAnagrafica.getFax());

                if (TipoVoceRubrica.PF.equals(tipoVoceRubrica)) {
                    PFType pfType = new PFType();
                    pfType.setCodiceFiscale(codiceFiscale);
                    pfType.setCognome(wsdmProcolloAnagrafica.getCognomeointestazione());
                    pfType.setNome(wsdmProcolloAnagrafica.getNome());
                    ArrayOfstring a = new ArrayOfstring();
                    a.getString().add(wsdmProcolloAnagrafica.getEmail());
                    pfType.setIndirizziDigitaliDiRiferimento(a);
                    rubrica.setOggetto(pfType);
                    rubrica.setTipo(TipoVoceRubrica.PF);
                } else if (TipoVoceRubrica.PG.equals(tipoVoceRubrica)) {
                    PGType pgType = new PGType();
                    pgType.setCodiceFiscalePartitaIva(codiceFiscale);
                    String denominazioneOrganizzazione = wsdmProcolloAnagrafica.getCognomeointestazione();
                    if (StringUtils.isNotBlank(wsdmProcolloAnagrafica.getNome())) {
                        denominazioneOrganizzazione += " " + wsdmProcolloAnagrafica.getNome();
                    }
                    pgType.setDenominazioneOrganizzazione(denominazioneOrganizzazione);
                    ArrayOfstring a = new ArrayOfstring();
                    a.getString().add(wsdmProcolloAnagrafica.getEmail());
                    pgType.setIndirizziDigitaliDiRiferimento(a);
                    rubrica.setOggetto(pgType);
                    rubrica.setTipo(TipoVoceRubrica.PG);
                } else if (TipoVoceRubrica.PAI.equals(tipoVoceRubrica)) {
                    PAIType paiType = new PAIType();
                    ArrayOfstring a = new ArrayOfstring();
                    a.getString().add(wsdmProcolloAnagrafica.getEmail());
                    paiType.setIndirizziDigitaliDiRiferimento(a);
                    rubrica.setOggetto(paiType);
                    rubrica.setTipo(TipoVoceRubrica.PAI);
                } else if (TipoVoceRubrica.PAE.equals(tipoVoceRubrica)) {
                    PAEType paeType = new PAEType();
                    paeType.setDenominazioneAmministrazione(wsdmProcolloAnagrafica.getCognomeointestazione());
                    ArrayOfstring a = new ArrayOfstring();
                    a.getString().add(wsdmProcolloAnagrafica.getEmail());
                    paeType.setIndirizziDigitaliDiRiferimento(a);
                    rubrica.setOggetto(paeType);
                    rubrica.setTipo(TipoVoceRubrica.PAE);
                }

                BEBaseOfRubricaZA0HwLp5 baseRespSaveVoceRubrica = iPaleo2Service.saveVoceRubrica(operatorePaleo, rubrica);
                if (TipoRisultato.ERROR.equals(baseRespSaveVoceRubrica.getMessaggioRisultato().getTipoRisultato())
                    || TipoRisultato.EXCEPTION.equals(baseRespSaveVoceRubrica.getMessaggioRisultato().getTipoRisultato())) {
                    throw new Exception(baseRespSaveVoceRubrica.getMessaggioRisultato().getDescrizione());
                }
            }
        }

        if (codiceRubrica == null) {
            throw new Exception("Impossibile gestire la voce di rubrica per il codice fiscale " + codiceFiscale);
        }

        return codiceRubrica;

    }


    /**
     * Inserisce il protocollo in partenza/uscita.
     */
    private void _protocolloInserisciPartenza(String username, String password, WSDMLoginAttr loginAttr, WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn, WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes, AllegatoHash[] allegatiHash) throws Exception {
        IPaleoService2 iPaleo2Service = this.getIPaleo2Service(username, password);
        ReqProtocolloPartenza reqProtocolloPartenza = new ReqProtocolloPartenza();

        // Operatore
        OperatorePaleo operatorePaleo = _getOperatore(loginAttr);
        reqProtocolloPartenza.setOperatore(operatorePaleo);

        // Codice registro
        String codiceRegistro = wsdmprotocolloDocumentoIn.getCodiceRegistro();
        reqProtocolloPartenza.setCodiceRegistro(codiceRegistro);

        // Oggetto
        String oggetto = wsdmprotocolloDocumentoIn.getOggetto();
        reqProtocolloPartenza.setOggetto(oggetto);

        // Documento privato
        // 16/07/2019 - Modifica richiesta per rendere privata la richiesta e
        // successivamente assegnarla con la "trasmissione".
        reqProtocolloPartenza.setPrivato(gestioneDocumentoPrivato());

        // Documento principale e documenti allegati
        allegatiHash = gestioneDocumentoPrincipaleAllegati(wsdmprotocolloDocumentoIn, allegatiHash, reqProtocolloPartenza);

        // Classificazioni, fascicolo... (possibile inserimento su fascicolo
        // esistente o su nuovo fascicolo)
        gestioneFascicolo(wsdmprotocolloDocumentoIn, operatorePaleo, reqProtocolloPartenza);

        // Destinatari per il protocollo in partenza (devono essere indicati
        // come destinatari occasionali)
//        WSDMProtocolloAnagrafica[] destinatari = wsdmprotocolloDocumentoIn.getDestinatari();
//        if (destinatari != null && destinatari.length > 0) {
//            ArrayOfDestinatario arrayOfDestinatario = new ArrayOfDestinatario();
//
//            for (int d = 0; d < destinatari.length; d++) {
//                Destinatario destinatario = new Destinatario();
//                String codiceRubrica = _gestisciVoceRubrica(username, password, loginAttr, destinatari[d]);
//                destinatario.setCodiceRubrica(codiceRubrica);
//                arrayOfDestinatario.getDestinatario().add(destinatario);
//            }
//            reqProtocolloPartenza.setDestinatariRubrica(arrayOfDestinatario);
//        }

        // 06/08/2024 Destinatari occasionali AgID
        WSDMProtocolloAnagrafica[] destinatari = wsdmprotocolloDocumentoIn.getDestinatari();
        if (destinatari != null && destinatari.length > 0) {
            SoggettiXml soggettiXML = new SoggettiXml();
            ArrayOfRuoloType arrayOfRuoloType = new ArrayOfRuoloType();
            List<RuoloType> listRuoloType = arrayOfRuoloType.getRuoloType();

            for (int d = 0; d < destinatari.length; d++) {

                if (WSDMTipoVoceRubrica.IMPRESA.equals(destinatari[d].getTipoVoceRubrica())) {

                    RuoloType ruoloType = new RuoloType();

                    // Tipo soggetto 31 (Protocollo.Common.Tipi.Digip.Protocollo)
                    TipoSoggetto31Type tipoSoggetto31Type = new TipoSoggetto31Type();
                    tipoSoggetto31Type.setTipoRuolo("Destinatario");

                    // PGType
                    PGType pgType = new PGType();

                    // #011: Nell'utilizzo del tipo PGType non riusciamo ad inserire un Codice Fiscale di 16 caratteri (Ditte individuali) perchè viene restituito l'errore:
                    //"La sezione Soggetti non risulta conforme allo schema Agid; la verifica ha riportato i seguenti errori: The 'CodiceFiscale_PartitaIva' element is invalid - The value 'XXXYYY99W00A271V' is invalid according to its datatype 'PIType' - The Pattern constraint failed.".
                    //Il problema è conosciuto e purtroppo non dipende da Paleo ma dall'XSD di Agid (allegato 5) e quindi non abbiamo margine operativo per correggere l'errore.
                    //L'XSD di AGID prevede che l'elemento CodiceFiscale_PartitaIva debba avere una lunghezza di 11 caratteri e questo vincolo esclude i Codici Fiscali
                    //Fortunatamente il campo non è obbligatorio.
//                    if (StringUtils.isNotBlank(destinatari[d].getPartitaIVA())) {
//                        if (destinatari[d].getPartitaIVA().length() == 11) {
//                            pgType.setCodiceFiscalePartitaIva(destinatari[d].getPartitaIVA());
//                        }
//                    }

                    // Denominazione
                    String denominazioneOrganizzazione = destinatari[d].getCognomeointestazione();
                    if (StringUtils.isNotBlank(destinatari[d].getNome())) {
                        denominazioneOrganizzazione += " " + destinatari[d].getNome();
                    }
                    pgType.setDenominazioneOrganizzazione(denominazioneOrganizzazione);

                    // Indirizzo Email
                    if (StringUtils.isNotBlank(destinatari[d].getEmail())) {
                        ArrayOfstring a = new ArrayOfstring();
                        a.getString().add(destinatari[d].getEmail());
                        pgType.setIndirizziDigitaliDiRiferimento(a);
                    }

                    tipoSoggetto31Type.setItem(pgType);
                    ruoloType.setItem(tipoSoggetto31Type);
                    listRuoloType.add(ruoloType);

                } else if (WSDMTipoVoceRubrica.PERSONA.equals(destinatari[d].getTipoVoceRubrica())) {

                    RuoloType ruoloType = new RuoloType();

                    // Tipo soggetto 31 (Protocollo.Common.Tipi.Digip.Protocollo)
                    TipoSoggetto31Type tipoSoggetto31Type = new TipoSoggetto31Type();
                    tipoSoggetto31Type.setTipoRuolo("Destinatario");

                    // PFType
                    PFType pfType = new PFType();

                    // Codice fiscale
                    if (StringUtils.isNotBlank(destinatari[d].getCodiceFiscale())) {
                        if (destinatari[d].getCodiceFiscale().length() == 16) {
                            pfType.setCodiceFiscale(destinatari[d].getCodiceFiscale());
                        }
                    }

                    // Cognome o intestazione
                    pfType.setCognome(destinatari[d].getCognomeointestazione());

                    // Il dato è obbligatorio per AgID
                    // La sezione Soggetti non risulta conforme allo schema Agid; la verifica ha riportato i seguenti errori: The element 'PF' has invalid child element 'CodiceFiscale'. List of possible elements expected: 'Nome'.&#13;
                    if (StringUtils.isNotBlank(destinatari[d].getNome())) {
                        pfType.setNome(destinatari[d].getNome());
                    } else {
                        pfType.setNome(destinatari[d].getCognomeointestazione());
                    }

                    // Indirizzo Email
                    if (StringUtils.isNotBlank(destinatari[d].getEmail())) {
                        ArrayOfstring a = new ArrayOfstring();
                        a.getString().add(destinatari[d].getEmail());
                        pfType.setIndirizziDigitaliDiRiferimento(a);
                    }

                    tipoSoggetto31Type.setItem(pfType);
                    ruoloType.setItem(tipoSoggetto31Type);
                    listRuoloType.add(ruoloType);

                }

                soggettiXML.setRuolo(arrayOfRuoloType);
                reqProtocolloPartenza.setSoggettiAgid(soggettiXML);

            }

            // Inoltro richiesta di protocollo in partenza e lettura della
            // risposta
            BEBaseOfrespProtocolloPartenzac14F1RMd baseRespProtocolloPartenza = iPaleo2Service.protocollazionePartenza(reqProtocolloPartenza);
            wsdmprotocolloDocumentoRes.setMessaggio(baseRespProtocolloPartenza.getMessaggioRisultato().getDescrizione());
            if (TipoRisultato.ERROR.equals(baseRespProtocolloPartenza.getMessaggioRisultato().getTipoRisultato())
                    || TipoRisultato.EXCEPTION.equals(baseRespProtocolloPartenza.getMessaggioRisultato().getTipoRisultato())) {
                wsdmprotocolloDocumentoRes.setEsito(false);
            } else {
                wsdmprotocolloDocumentoRes.setEsito(true);
                WSDMProtocolloDocumento wsdmprotocolloDocumento = new WSDMProtocolloDocumento();

                RespProtocolloPartenza respProtocolloPartenza = baseRespProtocolloPartenza.getOggetto();

                String numeroDocumento = String.valueOf(respProtocolloPartenza.getDocNumber());
                wsdmprotocolloDocumento.setNumeroDocumento(numeroDocumento);

                try {
                    wsdmprotocolloDocumento.setNumeroProtocollo(String.valueOf(respProtocolloPartenza.getNumero()));
                } catch (Exception e) {

                }

                XMLGregorianCalendar dataProtocollo = respProtocolloPartenza.getDataProtocollazione();
                if (dataProtocollo != null) {
                    // wsdmprotocolloDocumento.setDataProtocollo(dataProtocollo.toGregorianCalendar().getTime());
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(dataProtocollo.toGregorianCalendar().getTime());
                    wsdmprotocolloDocumento.setAnnoProtocollo((long) cal.get(Calendar.YEAR));
                }
                // 08/02/2018 - La data e l'ora del protocollo viene impostata con la data
                // e l'ora corrente di sistema
                Calendar dataProtocolloToday = Calendar.getInstance();
                wsdmprotocolloDocumento.setDataProtocollo(dataProtocolloToday.getTime());

                // Lettura codice eventuale fascicolo inserito
                if (respProtocolloPartenza.getClassificazioni() != null) {
                    List<String> listaClassificazioni = respProtocolloPartenza.getClassificazioni().getString();
                    if (listaClassificazioni != null && !listaClassificazioni.isEmpty()) {
                        WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();
                        wsdmFascicolo.setCodiceFascicolo(listaClassificazioni.get(0));
                        wsdmprotocolloDocumento.setFascicolo(wsdmFascicolo);
                    }
                }

                wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmprotocolloDocumento);

                // Invio degli allegati
                String messaggioAddAllegati = null;
                this._addAllegatiDocumentoProtocollo(username, password, loginAttr, numeroDocumento, allegatiHash, messaggioAddAllegati);
                wsdmprotocolloDocumentoRes.setMessaggio(messaggioAddAllegati);

            }

        }
    }

    private void gestioneFascicolo(WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn, OperatorePaleo
            operatorePaleo, Object req) throws DatatypeConfigurationException {
        WSDMInserimentoInFascicolo inserimentoInFascicolo = wsdmprotocolloDocumentoIn.getInserimentoInFascicolo();
        if (inserimentoInFascicolo != null) {
            if (WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO.equals(inserimentoInFascicolo)) {
                ArrayOfClassificazione arrayOfClassificazione = new ArrayOfClassificazione();
                Classificazione classificazione = new Classificazione();
                DatiNuovoFascicolo datiNuovoFascicolo = new DatiNuovoFascicolo();
                datiNuovoFascicolo.setCodiceClassifica(wsdmprotocolloDocumentoIn.getFascicolo().getClassificaFascicolo());
                datiNuovoFascicolo.setDescrizione(wsdmprotocolloDocumentoIn.getFascicolo().getOggettoFascicolo());
                datiNuovoFascicolo.setCustode(operatorePaleo);
                classificazione.setNuovoFascicolo(datiNuovoFascicolo);
                arrayOfClassificazione.getClassificazione().add(classificazione);

                // WSDM-168 Nuovi dati obbligatori per il fascicolo
                datiNuovoFascicolo.setTipologia(TipologiaFascicolo.PROCEDIMENTOAMMINISTRATIVO);

                // Procedimento amministrativo
                ProcedimentoAmministrativo procedimentoAmministrativo = new ProcedimentoAmministrativo();

                // Materia
                String materia = null;
                try {
                    materia = InitialContext.doLookup(PALEO_FASCICOLO_MATERIA);
                } catch (NamingException e) {

                }
                procedimentoAmministrativo.setMateria(materia);

                // Denominazione
                procedimentoAmministrativo.setDenominazione(wsdmprotocolloDocumentoIn.getFascicolo().getOggettoFascicolo());

                // URI catalogo
                String uricatalogo = null;
                try {
                    uricatalogo = InitialContext.doLookup(PALEO_FASCICOLO_URICATALOGO);
                } catch (NamingException e) {

                }
                procedimentoAmministrativo.setUriCatalogo(uricatalogo);

                // RUP (Nome, Cognome, Ruolo, CodiceUO)
                String fascicoloopnome = null;
                try {
                    fascicoloopnome = InitialContext.doLookup(PALEO_FASCICOLO_OP_NOME);
                } catch (NamingException e) {

                }
                String fascicoloopcognome = null;
                try {
                    fascicoloopcognome = InitialContext.doLookup(PALEO_FASCICOLO_OP_COGNOME);
                } catch (NamingException e) {

                }
                String fascicoloopruolo = null;
                try {
                    fascicoloopruolo = InitialContext.doLookup(PALEO_FASCICOLO_OP_RUOLO);
                } catch (NamingException e) {

                }
                String fascicoloopcodiceuo = null;
                try {
                    fascicoloopcodiceuo = InitialContext.doLookup(PALEO_FASCICOLO_OP_CODICEUO);
                } catch (NamingException e) {

                }

                OperatorePaleo fascicoloRUP = new OperatorePaleo();
                fascicoloRUP.setNome(fascicoloopnome);
                fascicoloRUP.setCognome(fascicoloopcognome);
                fascicoloRUP.setCodiceRuolo(fascicoloopruolo);
                fascicoloRUP.setCodiceUO(fascicoloopcodiceuo);

                procedimentoAmministrativo.setRUP(fascicoloRUP);

                // Fase
                FaseProcedimentoA faseProcedimentoA = new FaseProcedimentoA();

                // Tipo procedimento
                String faseprocedimentotipo = null;
                try {
                    faseprocedimentotipo = InitialContext.doLookup(PALEO_FASEPROCEDIMENTO_TIPO);
                } catch (NamingException e) {

                }

                if (faseprocedimentotipo != null) {
                    if ("CONSULTIVA".equals(faseprocedimentotipo.toUpperCase())) {
                        faseProcedimentoA.setTipo(TipoFaseProcedimentoA.CONSULTIVA);
                    } else if ("DECISORIAODELIBERATIVA".equals(faseprocedimentotipo.toUpperCase())) {
                        faseProcedimentoA.setTipo(TipoFaseProcedimentoA.DECISORIAODELIBERATIVA);
                    } else if ("ISTRUTTORIA".equals(faseprocedimentotipo.toUpperCase())) {
                        faseProcedimentoA.setTipo(TipoFaseProcedimentoA.ISTRUTTORIA);
                    } else if ("INTEGRAZIONEDELLEFFICACIA".equals(faseprocedimentotipo.toUpperCase())) {
                        faseProcedimentoA.setTipo(TipoFaseProcedimentoA.INTEGRAZIONEDELLEFFICACIA);
                    } else if ("PREPARATORIA".equals(faseprocedimentotipo.toUpperCase())) {
                        faseProcedimentoA.setTipo(TipoFaseProcedimentoA.PREPARATORIA);
                    }
               }

                // Data odierna in XMLGregorianCalendar
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                XMLGregorianCalendar dataOggi = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
                faseProcedimentoA.setDataInizio(dataOggi);

                ArrayOfFaseProcedimentoA arrayOfFaseProcedimentoA = new ArrayOfFaseProcedimentoA();
                arrayOfFaseProcedimentoA.getFaseProcedimentoA().add(faseProcedimentoA);
                procedimentoAmministrativo.setFasi(arrayOfFaseProcedimentoA);

                datiNuovoFascicolo.setDatiProcedimento(procedimentoAmministrativo);

                if (req instanceof ReqProtocolloPartenza) {
                    ((ReqProtocolloPartenza) req).setClassificazioni(arrayOfClassificazione);
                } else if (req instanceof ReqProtocolloArrivo) {
                    ((ReqProtocolloArrivo) req).setClassificazioni(arrayOfClassificazione);
                } else if (req instanceof ReqDocumento) {
                    ((ReqDocumento) req).setClassificazioni(arrayOfClassificazione);
                }

            } else if (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(inserimentoInFascicolo)) {
                ArrayOfClassificazione arrayOfClassificazione = new ArrayOfClassificazione();
                Classificazione classificazione = new Classificazione();
                classificazione.setCodiceFascicolo(wsdmprotocolloDocumentoIn.getFascicolo().getCodiceFascicolo());
                arrayOfClassificazione.getClassificazione().add(classificazione);

                if (req instanceof ReqProtocolloPartenza) {
                    ((ReqProtocolloPartenza) req).setClassificazioni(arrayOfClassificazione);
                } else if (req instanceof ReqProtocolloArrivo) {
                    ((ReqProtocolloArrivo) req).setClassificazioni(arrayOfClassificazione);
                } else if (req instanceof ReqDocumento) {
                    ((ReqDocumento) req).setClassificazioni(arrayOfClassificazione);
                }

            }
        }
    }

    private AllegatoHash[] gestioneDocumentoPrincipaleAllegati(WSDMProtocolloDocumentoIn
                                                                       wsdmprotocolloDocumentoIn, AllegatoHash[] allegatiHash, Object req) throws NoSuchAlgorithmException {
        WSDMProtocolloAllegato[] wsdmprotocolloAllegati = wsdmprotocolloDocumentoIn.getAllegati();
        if (wsdmprotocolloAllegati != null && wsdmprotocolloAllegati.length > 0) {
            // Il primo documento viene inserito come documento principale
            File documentoPrincipale = new File();
            documentoPrincipale.setNomeFile(wsdmprotocolloAllegati[0].getNome());

            // Il contenuto del documento principale deve essere sempre fornito.
            // Se non indicato il servizio restituisce il messaggio
            // "Contenuto del documento principale mancante"
            documentoPrincipale.setStream(wsdmprotocolloAllegati[0].getContenuto());

            String improntaDocumentoPrincipale = getImpronta(wsdmprotocolloAllegati[0].getContenuto());
            documentoPrincipale.setImpronta(improntaDocumentoPrincipale);

            boolean documentoPrincipaleIsSigned = false;
            boolean documentoPrincipaleIsSealed = false;
            boolean documentoPrincipaleIsTimeMarked = false;
            boolean documentoPrincipaleIsCertifiedCopy = false;

            if (wsdmprotocolloAllegati[0].getIsSigned() != null && wsdmprotocolloAllegati[0].getIsSigned().longValue() == 1) {
                documentoPrincipaleIsSigned = true;
            }

            if (wsdmprotocolloAllegati[0].getIsSealed() != null && wsdmprotocolloAllegati[0].getIsSealed().longValue() == 1) {
                documentoPrincipaleIsSealed = true;
            }

            if (wsdmprotocolloAllegati[0].getIsTimeMarked() != null && wsdmprotocolloAllegati[0].getIsTimeMarked().longValue() == 1) {
                documentoPrincipaleIsTimeMarked = true;
            }

            if (wsdmprotocolloAllegati[0].getIsCertifiedCopy() != null && wsdmprotocolloAllegati[0].getIsCertifiedCopy().longValue() == 1) {
                documentoPrincipaleIsCertifiedCopy = true;
            }

            if (req instanceof ReqProtocolloPartenza) {

                // Documento
                ((ReqProtocolloPartenza) req).setDocumentoPrincipale(documentoPrincipale);

                // Documento principale, tipo di formazione
                ((ReqProtocolloPartenza) req).setDocumentoPrincipaleModalitaFormazione(TipoOriginale.DIGITALE);

                // Documento acquisito integralmente
                ((ReqProtocolloPartenza) req).setDocumentoPrincipaleAcquisitoIntegralmente(true);

                // Documento firmato
                ((ReqProtocolloPartenza) req).setDocumentoPrincipaleFirmatoDigitalmente(documentoPrincipaleIsSigned);

                // Documento sigillato
                ((ReqProtocolloPartenza) req).setDocumentoPrincipaleSigillatoElettronicamente(documentoPrincipaleIsSealed);

                // Documento marcato
                ((ReqProtocolloPartenza) req).setDocumentoPrincipaleMarcaturaTemporale(documentoPrincipaleIsTimeMarked);

                // Documento conforme
                ((ReqProtocolloPartenza) req).setDocumentoPrincipaleConformitaCopieImmagineSuSupportoInformatico(documentoPrincipaleIsCertifiedCopy);

            } else if (req instanceof ReqProtocolloArrivo) {

                // Documento
                ((ReqProtocolloArrivo) req).setDocumentoPrincipale(documentoPrincipale);

                // Documento principale, tipo di formazione
                ((ReqProtocolloArrivo) req).setDocumentoPrincipaleModalitaFormazione(TipoOriginale.DIGITALE);

                // Documento acquisito integralmente
                ((ReqProtocolloArrivo) req).setDocumentoPrincipaleAcquisitoIntegralmente(true);

                // Documento firmato
                ((ReqProtocolloArrivo) req).setDocumentoPrincipaleFirmatoDigitalmente(documentoPrincipaleIsSigned);

                // Documento sigillato
                ((ReqProtocolloArrivo) req).setDocumentoPrincipaleSigillatoElettronicamente(documentoPrincipaleIsSealed);

                // Documento marcato
                ((ReqProtocolloArrivo) req).setDocumentoPrincipaleMarcaturaTemporale(documentoPrincipaleIsTimeMarked);

                // Documento conforme
                ((ReqProtocolloArrivo) req).setDocumentoPrincipaleConformitaCopieImmagineSuSupportoInformatico(documentoPrincipaleIsCertifiedCopy);

            } else if (req instanceof ReqDocumento) {

                // Documento
                ((ReqDocumento) req).setDocumentoPrincipale(documentoPrincipale);

                // Documento principale, tipo di formazione
                ((ReqDocumento) req).setDocumentoPrincipaleModalitaFormazione(TipoOriginale.DIGITALE);

                // Documento acquisito integralmente
                ((ReqDocumento) req).setDocumentoPrincipaleAcquisitoIntegralmente(true);

                // Documento firmato
                ((ReqDocumento) req).setDocumentoPrincipaleFirmatoDigitalmente(documentoPrincipaleIsSigned);

                // Documento sigillato
                ((ReqDocumento) req).setDocumentoPrincipaleSigillatoElettronicamente(documentoPrincipaleIsSealed);

                // Documento marcato
                ((ReqDocumento) req).setDocumentoPrincipaleMarcaturaTemporale(documentoPrincipaleIsTimeMarked);

                // Documento conforme
                ((ReqDocumento) req).setDocumentoPrincipaleConformitaCopieImmagineSuSupportoInformatico(documentoPrincipaleIsCertifiedCopy);

            }

            // I documenti con indice superiore ad 1 vengono inseriti come
            // documenti allegati

            // 09/07/2019 - Modifica struttura dei servizi. Ogni file allegato
            // (file oltre il documento principale) deve essere indicato, in fase
            // di protocollazione, con il suo hash calcolato in SHA-256.
            // Successivamente, con l'operazione "AddAllegatiDocumentoProtocollo"
            // potrà essere inviato il file effettivo.
            // In questo contesto non deve essere piu' inviato lo stream.
            if (wsdmprotocolloAllegati.length > 1) {

                allegatiHash = new AllegatoHash[wsdmprotocolloAllegati.length - 1];

                ArrayOfAllegato arrayOfAllegato = new ArrayOfAllegato();
                for (int ai = 1; ai < wsdmprotocolloAllegati.length; ai++) {
                    Allegato allegato = new Allegato();
                    allegato.setDescrizione(wsdmprotocolloAllegati[ai].getTitolo());

                    // Modalità di formazione
                    allegato.setModalitaFormazione(TipoOriginale.DIGITALE);

                    boolean allegatoIsSigned = false;
                    boolean allegatoIsSealed = false;
                    boolean allegatoIsTimeMarked = false;
                    boolean allegatoIsCertifiedCopy = false;

                    if (wsdmprotocolloAllegati[ai].getIsSigned() != null && wsdmprotocolloAllegati[ai].getIsSigned().longValue() == 1) {
                        allegatoIsSigned = true;
                    }

                    if (wsdmprotocolloAllegati[ai].getIsSealed() != null && wsdmprotocolloAllegati[ai].getIsSealed().longValue() == 1) {
                        allegatoIsSealed = true;
                    }

                    if (wsdmprotocolloAllegati[ai].getIsTimeMarked() != null && wsdmprotocolloAllegati[ai].getIsTimeMarked().longValue() == 1) {
                        allegatoIsTimeMarked = true;
                    }

                    if (wsdmprotocolloAllegati[ai].getIsCertifiedCopy() != null && wsdmprotocolloAllegati[ai].getIsCertifiedCopy().longValue() == 1) {
                        allegatoIsCertifiedCopy = true;
                    }

                    // Documento firmato
                    allegato.setFirmatoDigitalmente(allegatoIsSigned);

                    // Documento sigillato
                    allegato.setSigillatoElettronicamente(allegatoIsSealed);

                    // Documento marcato
                    allegato.setMarcaturaTemporale(allegatoIsTimeMarked);

                    // Documento conforme
                    allegato.setConformitaCopieImmagineSuSupportoInformatico(allegatoIsCertifiedCopy);

                    File documentoAllegato = new File();
                    documentoAllegato.setNomeFile(wsdmprotocolloAllegati[ai].getNome());


                    // Lo stream per gli allegati non deve essere indicato.
                    // Se si indica lo stream il servizio restituisce il seguente
                    // messaggio:
                    // "In fase di registrazione/protocollazione non è possibile inserire
                    // più di 0 allegati."
                    // Se non si indica lo stream il servizio risponde con il messaggio:
                    // "Object reference not set to an instance of an object."

                    // Calcolo hash SHA-256
                    String impronta = getImpronta(wsdmprotocolloAllegati[ai].getContenuto());
                    documentoAllegato.setImpronta(impronta);

                    // Salvataggio sulla struttura "allegatoHash" per il successivo invio,
                    // del file, a PALEO.
                    allegatiHash[ai - 1] = new AllegatoHash();
                    allegatiHash[ai - 1].setTipo(wsdmprotocolloAllegati[ai].getTipo());
                    allegatiHash[ai - 1].setNome(wsdmprotocolloAllegati[ai].getNome());
                    allegatiHash[ai - 1].setContenuto(wsdmprotocolloAllegati[ai].getContenuto());
                    allegatiHash[ai - 1].setTitolo(wsdmprotocolloAllegati[ai].getTitolo());
                    allegatiHash[ai - 1].setHash(impronta);

                    allegatiHash[ai - 1].setSigned(allegatoIsSigned);
                    allegatiHash[ai - 1].setSealed(allegatoIsSealed);
                    allegatiHash[ai - 1].setTimeMarked(allegatoIsTimeMarked);
                    allegatiHash[ai - 1].setCertifiedCopy(allegatoIsCertifiedCopy);

                    allegato.setDocumento(documentoAllegato);
                    arrayOfAllegato.getAllegato().add(allegato);

                }

                if (req instanceof ReqProtocolloPartenza) {
                    ((ReqProtocolloPartenza) req).setDocumentiAllegati(arrayOfAllegato);
                } else if (req instanceof ReqProtocolloArrivo) {
                    ((ReqProtocolloArrivo) req).setDocumentiAllegati(arrayOfAllegato);
                } else if (req instanceof ReqDocumento) {
                    ((ReqDocumento) req).setDocumentiAllegati(arrayOfAllegato);
                }

            }
        }
        return allegatiHash;
    }

    private static boolean gestioneDocumentoPrivato() {
        boolean documentoPrivato = true;
        try {
            String pdr = InitialContext.doLookup(PALEO_DOCUMENTOPRIVATO);
            if (pdr != null && pdr.equalsIgnoreCase("false")) {
                documentoPrivato = false;
            }
        } catch (NamingException ignored) {

        }
        return documentoPrivato;
    }

    /**
     * Calcolo dell'impronta dello stream.
     */
    private String getImpronta(byte[] stream) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(stream);
        return javax.xml.bind.DatatypeConverter.printHexBinary(hash);
    }

    @Override
    public WSDMProtocolloDocumentoRes _protocolloLeggi(String username, String password, WSDMLoginAttr
            loginAttr, Long annoProtocollo, String numeroProtocollo) {
        // L'operazione non è disponibile in quanto per l'interrogazione è
        // richiesta la "segnatura". Questo valore non è memorizzato nei "client" e
        // non è nemmeno possibile ricavarlo dall'anno o dal numero protocollo.
        WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
        return wsdmprotocolloDocumentoRes;
    }

    @Override
    public WSDMProtocolloDocumentoRes _documentoInserisci(String username, String password, WSDMLoginAttr
            loginAttr, WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {
        WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

        AllegatoHash[] allegatoHash = null;

        try {
            StringBuffer messaggioCtr = new StringBuffer();
            if (Paleo2UtilityControllo.ctrDocumentoInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {
                _archiviaDocumentoInterno(username, password, loginAttr, wsdmprotocolloDocumentoIn, wsdmprotocolloDocumentoRes, allegatoHash);
            } else {
                // Non sono stati superati i controlli di validita'
                wsdmprotocolloDocumentoRes.setEsito(false);
                wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
            }

        } catch (WebServiceException w) {
            wsdmprotocolloDocumentoRes.setEsito(false);
            wsdmprotocolloDocumentoRes.setMessaggio(WS_ERROR + " " + w.getMessage());
            logger.error("Errore (_documentoInserisci)", w);
        } catch (NamingException e) {
            wsdmprotocolloDocumentoRes.setEsito(false);
            wsdmprotocolloDocumentoRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
            logger.error("Errore (_documentoInserisci)", e);
        } catch (Throwable t) {
            wsdmprotocolloDocumentoRes.setEsito(false);
            wsdmprotocolloDocumentoRes.setMessaggio(t.getMessage());
            logger.error("Errore (_documentoInserisci)", t);
        }

        return wsdmprotocolloDocumentoRes;

    }

    /**
     * Archivia un documento interno. In questo caso non c'e' alcun verso in
     * ingresso/arrivo (IN) o uscita/partenza (OUT) ma l'unico verso gestito è
     * quello interno (INT).
     */
    private void _archiviaDocumentoInterno(String username, String password, WSDMLoginAttr
            loginAttr, WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn, WSDMProtocolloDocumentoRes
                                                   wsdmprotocolloDocumentoRes, AllegatoHash[] allegatiHash) throws Exception {
        IPaleoService2 iPaleo2Service = this.getIPaleo2Service(username, password);
        ReqDocumento reqDocumento = new ReqDocumento();

        // Operatore
        OperatorePaleo operatorePaleo = _getOperatore(loginAttr);
        reqDocumento.setOperatore(operatorePaleo);

        // Oggetto
        String oggetto = wsdmprotocolloDocumentoIn.getOggetto();
        reqDocumento.setOggetto(oggetto);

        // Documento privato
        // 16/07/2019 - Modifica richiesta per rendere privata la richiesta e
        // successivamente assegnarla con la "trasmissione".
        reqDocumento.setPrivato(gestioneDocumentoPrivato());

        // Documento principale e documenti allegati
        allegatiHash = gestioneDocumentoPrincipaleAllegati(wsdmprotocolloDocumentoIn, allegatiHash, reqDocumento);

        // Classificazioni, fascicolo... (possibile inserimento su fascicolo
        // esistente o su nuovo fascicolo)
        gestioneFascicolo(wsdmprotocolloDocumentoIn, operatorePaleo, reqDocumento);

        BEBaseOfrespDocumentoc14F1RMd baseRespDocumento = iPaleo2Service.archiviaDocumentoInterno(reqDocumento);
        wsdmprotocolloDocumentoRes.setMessaggio(baseRespDocumento.getMessaggioRisultato().getDescrizione());
        if (TipoRisultato.ERROR.equals(baseRespDocumento.getMessaggioRisultato().getTipoRisultato())
                || TipoRisultato.EXCEPTION.equals(baseRespDocumento.getMessaggioRisultato().getTipoRisultato())) {
            wsdmprotocolloDocumentoRes.setEsito(false);
        } else {
            wsdmprotocolloDocumentoRes.setEsito(true);
            WSDMProtocolloDocumento wsdmprotocolloDocumento = new WSDMProtocolloDocumento();

            RespDocumento respDocumento = baseRespDocumento.getOggetto();

            String numeroDocumento = String.valueOf(respDocumento.getDocNumber());
            wsdmprotocolloDocumento.setNumeroDocumento(numeroDocumento);

            // Lettura codice eventuale fascicolo inserito
            if (respDocumento.getClassificazioni() != null) {
                List<String> listaClassificazioni = respDocumento.getClassificazioni().getString();
                if (listaClassificazioni != null && !listaClassificazioni.isEmpty()) {
                    WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();
                    wsdmFascicolo.setCodiceFascicolo(listaClassificazioni.get(0));
                    wsdmprotocolloDocumento.setFascicolo(wsdmFascicolo);
                }
            }

            wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmprotocolloDocumento);

            // Invio degli allegati
            String messaggioAddAllegati = null;
            this._addAllegatiDocumentoProtocollo(username, password, loginAttr, numeroDocumento, allegatiHash, messaggioAddAllegati);
            wsdmprotocolloDocumentoRes.setMessaggio(messaggioAddAllegati);

        }
    }

    @Override
    public WSDMProtocolloDocumentoRes _documentoLeggi(String username, String password, WSDMLoginAttr
            loginAttr, String numeroDocumento) {
        WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
        try {
            StringBuffer messaggioCtr = new StringBuffer();
            if (Paleo2UtilityControllo.ctrDocumentoLeggi(loginAttr, numeroDocumento, messaggioCtr)) {
                IPaleoService2 iPaleo2Service = this.getIPaleo2Service(username, password);
                ReqCercaProtocollo reqCercaProtocollo = new ReqCercaProtocollo();
                OperatorePaleo operatorePaleo = _getOperatore(loginAttr);
                reqCercaProtocollo.setOperatore(operatorePaleo);

                try {
                    reqCercaProtocollo.setDocNumber(Integer.valueOf(numeroDocumento));
                } catch (Throwable ignored) {

                }

                BEBaseOfRespDocumentoExtc14F1RMd beResp = iPaleo2Service.cercaDocumentoProtocollo(reqCercaProtocollo);

                wsdmprotocolloDocumentoRes.setMessaggio(beResp.getMessaggioRisultato().getDescrizione());
                if (TipoRisultato.ERROR.equals(beResp.getMessaggioRisultato().getTipoRisultato())
                        || TipoRisultato.EXCEPTION.equals(beResp.getMessaggioRisultato().getTipoRisultato())) {
                    wsdmprotocolloDocumentoRes.setEsito(false);
                } else {
                    // La lettura del documento (mediante numeroDocumento) permette di
                    // leggere i documenti protocollati nei due versi (arrivo e partenza) e
                    // i documenti interni. Per ogni tipologia di documento è previsto uno
                    // specifico formato di restituzione dei dati.
                    Object respDocumentoExt = beResp.getOggetto();

                    if (respDocumentoExt instanceof RespProtocolloArrivoExt) {
                        wsdmprotocolloDocumentoRes = this.popolaWSDMPDResDaRespProtArrivoExt(username, password, loginAttr, (RespProtocolloArrivoExt) respDocumentoExt);
                    } else if (respDocumentoExt instanceof RespProtocolloPartenzaExt) {
                        wsdmprotocolloDocumentoRes = this.popolaWSDMPDResDaRespProtPartenzaExt(username, password, loginAttr, (RespProtocolloPartenzaExt) respDocumentoExt);
                    } else if (respDocumentoExt instanceof RespDocumentoExt) {
                        wsdmprotocolloDocumentoRes = this.popolaWSDMPDResDaRespDocumentoExt(username, password, loginAttr, (RespDocumentoExt) respDocumentoExt);
                    }

                    wsdmprotocolloDocumentoRes.setEsito(true);
                }
            } else {
                // Non sono stati superati i controlli di validita'
                wsdmprotocolloDocumentoRes.setEsito(false);
                wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
            }
        } catch (WebServiceException w) {
            wsdmprotocolloDocumentoRes.setEsito(false);
            wsdmprotocolloDocumentoRes.setMessaggio(WS_ERROR + " " + w.getMessage());
            logger.error("Errore (_documentoLeggi)", w);
        } catch (NamingException e) {
            wsdmprotocolloDocumentoRes.setEsito(false);
            wsdmprotocolloDocumentoRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
            logger.error("Errore (_documentoLeggi)", e);
        } catch (Throwable t) {
            wsdmprotocolloDocumentoRes.setEsito(false);
            wsdmprotocolloDocumentoRes.setMessaggio(t.getMessage());
            logger.error("Errore (_documentoLeggi)", t);
        }
        return wsdmprotocolloDocumentoRes;
    }

    @Override
    public WSDMProtocolloDocumentoRes _documentoMetadatiLeggi(String username, String password, WSDMLoginAttr
            loginAttr, String numeroDocumento) {
        WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
        return wsdmprotocolloDocumentoRes;
    }

    @Override
    public WSDMFascicoloRes _fascicoloInserisci(String username, String password, WSDMLoginAttr
            loginAttr, WSDMFascicoloIn wsdmfascicoloIn) {
        // L'operazione non è disponibile. L'inserimento di un nuovo fascicolo puo'
        // essere richiesto contestualmente alla richiesta di protocollazione.
        WSDMFascicoloRes wsdmfascicoloRes = new WSDMFascicoloRes();
        wsdmfascicoloRes.setEsito(false);
        wsdmfascicoloRes.setMessaggio(FASCICOLO_OPERATION_NOT_SUPPORTED);
        return wsdmfascicoloRes;
    }

    @Override
    public WSDMFascicoloRes _fascicoloAggiungiDocumento(String username, String password, WSDMLoginAttr
            loginAttr, String codiceFascicolo, String numeroDocumento) {
        // L'operazione non è disponibile. Un documento puo' essere aggiunto a un
        // fascicolo esistente solo contestualmente alla richiesta di inserimento,
        // del documento stesso, nel sistema documentale.
        WSDMFascicoloRes wsdmfascicoloRes = new WSDMFascicoloRes();
        wsdmfascicoloRes.setEsito(false);
        wsdmfascicoloRes.setMessaggio(FASCICOLO_OPERATION_NOT_SUPPORTED);
        return wsdmfascicoloRes;
    }

    @Override
    public WSDMFascicoloRes _fascicoloLeggi(String username, String password, WSDMLoginAttr loginAttr, String
            codiceFascicolo, Long annoFascicolo, String numeroFascicolo, String classificaFascicolo, String oggettoFascicolo) {

        WSDMFascicoloRes wsdmfascicoloRes = new WSDMFascicoloRes();

        try {
            StringBuffer messaggioCtr = new StringBuffer();
            if (Paleo2UtilityControllo.ctrFascicoloLeggi(loginAttr, codiceFascicolo, annoFascicolo, numeroFascicolo, messaggioCtr)) {
                IPaleoService2 iPaleo2Service = this.getIPaleo2Service(username, password);

                // Parametri di ricerca del fascicolo
                ReqDocProtocolliInFascicolo reqDocProtocolliInFascicolo = new ReqDocProtocolliInFascicolo();
                OperatorePaleo operatorePaleo = _getOperatore(loginAttr);
                reqDocProtocolliInFascicolo.setOperatore(operatorePaleo);
                reqDocProtocolliInFascicolo.setSoloPubblici(false);
                reqDocProtocolliInFascicolo.setCodiceFascicolo(codiceFascicolo);

                BEListOfrespDocProtocolliInfoc14F1RMd beListOfRespDocProtocolli = iPaleo2Service.getDocumentiProtocolliInFascicolo(reqDocProtocolliInFascicolo);

                wsdmfascicoloRes.setMessaggio(beListOfRespDocProtocolli.getMessaggioRisultato().getDescrizione());
                if (TipoRisultato.ERROR.equals(beListOfRespDocProtocolli.getMessaggioRisultato().getTipoRisultato())
                        || TipoRisultato.EXCEPTION.equals(beListOfRespDocProtocolli.getMessaggioRisultato().getTipoRisultato())) {
                    wsdmfascicoloRes.setEsito(false);
                } else {
                    wsdmfascicoloRes.setEsito(true);
                    ArrayOfrespDocProtocolliInfo arrayOfDocProt = beListOfRespDocProtocolli.getLista();
                    WSDMFascicolo wsdmfascicolo = new WSDMFascicolo();

                    if (arrayOfDocProt != null && !arrayOfDocProt.getRespDocProtocolliInfo().isEmpty()) {
                        WSDMFascicoloDocumento[] documenti = new WSDMFascicoloDocumento[arrayOfDocProt.getRespDocProtocolliInfo().size()];
                        for (int dc = 0; dc < arrayOfDocProt.getRespDocProtocolliInfo().size(); dc++) {
                            documenti[dc] = new WSDMFascicoloDocumento();
                            RespDocProtocolliInfo respDocProtocolliInfo = arrayOfDocProt.getRespDocProtocolliInfo().get(dc);

                            XMLGregorianCalendar dataProtocollo = respDocProtocolliInfo.getDataProtocollo();
                            if (dataProtocollo != null) {
                                documenti[dc].setDataProtocollo(dataProtocollo.toGregorianCalendar().getTime());
                                documenti[dc].setAnnoProtocollo((long) dataProtocollo.getYear());
                            }
                            documenti[dc].setNumeroDocumento(String.valueOf(respDocProtocolliInfo.getDocNumber()));
                            documenti[dc].setOggetto(respDocProtocolliInfo.getOggetto());
                            if (respDocProtocolliInfo.getNumeroProtocollo() != null) {
                                documenti[dc].setNumeroProtocollo(String.valueOf(respDocProtocolliInfo.getNumeroProtocollo()));
                            }
                            documenti[dc].setSegnaturaProtocollo(respDocProtocolliInfo.getSegnaturaProtocollo());

                            TipoProtocollo tipoProtocollo = respDocProtocolliInfo.getTipoProtocollo();
                            if (TipoProtocollo.INGRESSO.equals(tipoProtocollo)) {
                                documenti[dc].setInout(WSDMProtocolloInOut.IN);
                            } else if (TipoProtocollo.USCITA.equals(tipoProtocollo)) {
                                documenti[dc].setInout(WSDMProtocolloInOut.OUT);
                            } else {
                                documenti[dc].setInout(WSDMProtocolloInOut.INT);
                            }
                        }
                        wsdmfascicolo.setDocumenti(documenti);
                    }
                    wsdmfascicoloRes.setFascicolo(wsdmfascicolo);
                }
            } else {
                // Non sono stati superati i controlli di validita'
                wsdmfascicoloRes.setEsito(false);
                wsdmfascicoloRes.setMessaggio(messaggioCtr.toString());
            }
        } catch (WebServiceException w) {
            wsdmfascicoloRes.setEsito(false);
            wsdmfascicoloRes.setMessaggio(WS_ERROR + " " + w.getMessage());
            logger.error("Errore (_fascicoloLeggi)", w);
        } catch (NamingException e) {
            wsdmfascicoloRes.setEsito(false);
            wsdmfascicoloRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
            logger.error("Errore (_fascicoloLeggi)", e);
        } catch (Throwable t) {
            wsdmfascicoloRes.setEsito(false);
            wsdmfascicoloRes.setMessaggio(t.getMessage());
            logger.error("Errore (_fascicoloLeggi)", t);
        }
        return wsdmfascicoloRes;

    }

    @Override
    public WSDMFascicoloRes _fascicoloMetadatiLeggi(String username, String password, WSDMLoginAttr
            loginAttr, String codiceFascicolo, Long annoFascicolo, String numeroFascicolo, String
                                                            classificaFascicolo, String oggettoFascicolo) {
        return _fascicoloLeggi(username, password, loginAttr, codiceFascicolo, annoFascicolo, numeroFascicolo, classificaFascicolo, oggettoFascicolo);
    }

    /**
     * Gestione operatore
     */
    private OperatorePaleo _getOperatore(WSDMLoginAttr loginAttr) {
        OperatorePaleo operatorePaleo = new OperatorePaleo();
        operatorePaleo.setNome(loginAttr.getNome());
        operatorePaleo.setCognome(loginAttr.getCognome());
        operatorePaleo.setCodiceUO(loginAttr.getCodiceUO());
        operatorePaleo.setCodiceRuolo(loginAttr.getRuolo());
        return operatorePaleo;
    }

    /**
     * Popola l'oggetto WSDMProtocolloDocumentoRes sulla base del protocollo in
     * partenza.
     */
    private WSDMProtocolloDocumentoRes popolaWSDMPDResDaRespProtPartenzaExt(String username, String
            password, WSDMLoginAttr loginAttr, RespProtocolloPartenzaExt respProtocolloPartenzaExt) throws Exception {

        WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

        WSDMProtocolloDocumento wsdmprotocolloDocumento = new WSDMProtocolloDocumento();
        wsdmprotocolloDocumento.setInout(WSDMProtocolloInOut.OUT);

        // Documento principale e documenti allegati
        File documentoPrincipale = respProtocolloPartenzaExt.getDocumentoPrincipale();
        ArrayOfAllegato arrayOfAllegato = respProtocolloPartenzaExt.getAllegati();
        if (documentoPrincipale != null) {
            if (arrayOfAllegato != null && !arrayOfAllegato.getAllegato().isEmpty()) {
                int sizeArrayOfAllegato = arrayOfAllegato.getAllegato().size();
                WSDMProtocolloAllegato[] allegati = new WSDMProtocolloAllegato[sizeArrayOfAllegato + 1];

                // Documento principale
                allegati[0] = new WSDMProtocolloAllegato();
                byte[] contenutoDocumentoPrincipale = this._getFile(username, password, loginAttr, documentoPrincipale.getIdFile());
                allegati[0].setContenuto(contenutoDocumentoPrincipale);
                allegati[0].setNome(documentoPrincipale.getNomeFile());
                allegati[0].setTipo(getTipo(documentoPrincipale.getNomeFile()));
                allegati[0].setTitolo("Allegato principale");

                // Ulteriori documenti allegati
                for (int ao = 0; ao < arrayOfAllegato.getAllegato().size(); ao++) {
                    Allegato allegato = arrayOfAllegato.getAllegato().get(ao);
                    String nome = allegato.getDocumento().getNomeFile();
                    String titolo = allegato.getDescrizione();
                    byte[] contenuto = this._getFile(username, password, loginAttr, allegato.getDocumento().getIdFile());
                    allegati[ao + 1] = new WSDMProtocolloAllegato();
                    allegati[ao + 1].setContenuto(contenuto);
                    allegati[ao + 1].setNome(nome);
                    allegati[ao + 1].setTipo(getTipo(allegato.getDocumento().getNomeFile()));
                    allegati[ao + 1].setTitolo(titolo);
                }
                wsdmprotocolloDocumento.setAllegati(allegati);

            } else {
                // Solo documento principale
                WSDMProtocolloAllegato[] allegati = new WSDMProtocolloAllegato[1];
                allegati[0] = new WSDMProtocolloAllegato();
                byte[] contenutoDocumentoPrincipale = this._getFile(username, password, loginAttr, documentoPrincipale.getIdFile());
                allegati[0].setContenuto(contenutoDocumentoPrincipale);
                allegati[0].setNome(documentoPrincipale.getNomeFile());
                allegati[0].setTipo(getTipo(documentoPrincipale.getNomeFile()));
                allegati[0].setTitolo("Allegato principale");
                wsdmprotocolloDocumento.setAllegati(allegati);
            }
        }

        // Numero del documento
        wsdmprotocolloDocumento.setNumeroDocumento(String.valueOf(respProtocolloPartenzaExt.getDocNumber()));

        // Anno del protocollo
        if (respProtocolloPartenzaExt.getDataProtocollazione() != null) {
            wsdmprotocolloDocumento.setAnnoProtocollo((long) respProtocolloPartenzaExt.getDataProtocollazione().getYear());
        }

        // Destinatari
        ArrayOfDestinatarioInfo arrayOfDestinatari = respProtocolloPartenzaExt.getDestinatari();
        if (arrayOfDestinatari != null && !arrayOfDestinatari.getDestinatarioInfo().isEmpty()) {
            WSDMProtocolloAnagrafica[] anagrafiche = new WSDMProtocolloAnagrafica[arrayOfDestinatari.getDestinatarioInfo().size()];
            for (int dest = 0; dest < arrayOfDestinatari.getDestinatarioInfo().size(); dest++) {
                DestinatarioInfo destinatarioInfo = arrayOfDestinatari.getDestinatarioInfo().get(dest);
                anagrafiche[dest] = new WSDMProtocolloAnagrafica();
                anagrafiche[dest].setCognomeointestazione(destinatarioInfo.getDescrizione());
                anagrafiche[dest].setEmail(destinatarioInfo.getEmail());
            }
            wsdmprotocolloDocumento.setDestinatari(anagrafiche);
        }

        // Numero del protocollo
        try {
            wsdmprotocolloDocumento.setNumeroProtocollo(String.valueOf(respProtocolloPartenzaExt.getNumero()));
        } catch (Exception e) {

        }

        // Oggetto del documento inserito/protocollo
        wsdmprotocolloDocumento.setOggetto(respProtocolloPartenzaExt.getOggetto());

        // Lettura codice eventuale fascicolo inserito
        if (respProtocolloPartenzaExt.getClassificazioni() != null) {
            List<String> listaClassificazioni = respProtocolloPartenzaExt.getClassificazioni().getString();
            if (listaClassificazioni != null && !listaClassificazioni.isEmpty()) {
                WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();
                wsdmFascicolo.setCodiceFascicolo(listaClassificazioni.get(0));
                wsdmprotocolloDocumento.setFascicolo(wsdmFascicolo);
            }
        }

        wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmprotocolloDocumento);

        return wsdmprotocolloDocumentoRes;
    }

    /**
     * Estrae estensione
     */
    private static String getTipo(String nomeFile) {
        String estensione = null;
        int indice = nomeFile.lastIndexOf(".");
        if (indice != -1) {
            estensione = nomeFile.substring(indice + 1);
        }
        return estensione;
    }

    /**
     * Popola l'oggetto WSDMProtocolloDocumentoRes sulla base del protocollo in
     * arrivo.
     */
    private WSDMProtocolloDocumentoRes popolaWSDMPDResDaRespProtArrivoExt(String username, String
            password, WSDMLoginAttr loginAttr, RespProtocolloArrivoExt respProtocolloArrivoExt) throws Exception {

        WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

        WSDMProtocolloDocumento wsdmprotocolloDocumento = new WSDMProtocolloDocumento();
        wsdmprotocolloDocumento.setInout(WSDMProtocolloInOut.IN);

        // Documento principale e documenti allegati
        File documentoPrincipale = respProtocolloArrivoExt.getDocumentoPrincipale();
        ArrayOfAllegato arrayOfAllegato = respProtocolloArrivoExt.getAllegati();
        if (documentoPrincipale != null) {
            if (arrayOfAllegato != null && !arrayOfAllegato.getAllegato().isEmpty()) {
                int sizeArrayOfAllegato = arrayOfAllegato.getAllegato().size();
                WSDMProtocolloAllegato[] allegati = new WSDMProtocolloAllegato[sizeArrayOfAllegato + 1];

                // Documento principale
                allegati[0] = new WSDMProtocolloAllegato();
                byte[] contenutoDocumentoPrincipale = this._getFile(username, password, loginAttr, documentoPrincipale.getIdFile());
                allegati[0].setContenuto(contenutoDocumentoPrincipale);
                allegati[0].setNome(documentoPrincipale.getNomeFile());
                allegati[0].setTipo(getTipo(documentoPrincipale.getNomeFile()));
                allegati[0].setTitolo("Allegato principale");

                // Ulteriori documenti allegati
                for (int ao = 0; ao < arrayOfAllegato.getAllegato().size(); ao++) {
                    Allegato allegato = arrayOfAllegato.getAllegato().get(ao);
                    String nome = allegato.getDocumento().getNomeFile();
                    String titolo = allegato.getDescrizione();
                    byte[] contenuto = this._getFile(username, password, loginAttr, allegato.getDocumento().getIdFile());
                    allegati[ao + 1] = new WSDMProtocolloAllegato();
                    allegati[ao + 1].setContenuto(contenuto);
                    allegati[ao + 1].setNome(nome);
                    allegati[ao + 1].setTipo(getTipo(allegato.getDocumento().getNomeFile()));
                    allegati[ao + 1].setTitolo(titolo);
                }
                wsdmprotocolloDocumento.setAllegati(allegati);

            } else {
                // Solo documento principale
                WSDMProtocolloAllegato[] allegati = new WSDMProtocolloAllegato[1];
                allegati[0] = new WSDMProtocolloAllegato();
                byte[] contenutoDocumentoPrincipale = this._getFile(username, password, loginAttr, documentoPrincipale.getIdFile());
                allegati[0].setContenuto(contenutoDocumentoPrincipale);
                allegati[0].setNome(documentoPrincipale.getNomeFile());
                allegati[0].setTipo(getTipo(documentoPrincipale.getNomeFile()));
                allegati[0].setTitolo("Allegato principale");
                wsdmprotocolloDocumento.setAllegati(allegati);
            }
        }

        // Numero del documento
        wsdmprotocolloDocumento.setNumeroDocumento(String.valueOf(respProtocolloArrivoExt.getDocNumber()));

        // Anno Protocollo
        if (respProtocolloArrivoExt.getDataProtocollazione() != null) {
            wsdmprotocolloDocumento.setAnnoProtocollo((long) respProtocolloArrivoExt.getDataProtocollazione().getYear());
        }

        // Mittente
        WSDMProtocolloAnagrafica[] anagrafiche = new WSDMProtocolloAnagrafica[1];
        anagrafiche[0] = new WSDMProtocolloAnagrafica();
        anagrafiche[0].setCognomeointestazione(respProtocolloArrivoExt.getMittente());
        wsdmprotocolloDocumento.setMittenti(anagrafiche);

        // Numero del protocollo
        try {
            wsdmprotocolloDocumento.setNumeroProtocollo(String.valueOf(respProtocolloArrivoExt.getNumero()));
        } catch (Exception e) {

        }

        // Oggetto del documento inserito/protocollo
        wsdmprotocolloDocumento.setOggetto(respProtocolloArrivoExt.getOggetto());

        // Lettura codice eventuale fascicolo inserito
        if (respProtocolloArrivoExt.getClassificazioni() != null) {
            List<String> listaClassificazioni = respProtocolloArrivoExt.getClassificazioni().getString();
            if (listaClassificazioni != null && !listaClassificazioni.isEmpty()) {
                WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();
                wsdmFascicolo.setCodiceFascicolo(listaClassificazioni.get(0));
                wsdmprotocolloDocumento.setFascicolo(wsdmFascicolo);
            }
        }

        wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmprotocolloDocumento);

        return wsdmprotocolloDocumentoRes;
    }

    /**
     * Popola l'oggetto WSDMProtocolloDocumentoRes sulla base di un elemento
     * documentale di tipo RespDocumentoExt.
     */
    private WSDMProtocolloDocumentoRes popolaWSDMPDResDaRespDocumentoExt(String username, String
            password, WSDMLoginAttr loginAttr, RespDocumentoExt respDocumentoExt) throws Exception {
        WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

        WSDMProtocolloDocumento wsdmprotocolloDocumento = new WSDMProtocolloDocumento();
        wsdmprotocolloDocumento.setInout(WSDMProtocolloInOut.INT);

        // Documento principale e documenti allegati
        File documentoPrincipale = respDocumentoExt.getDocumentoPrincipale();
        ArrayOfAllegato arrayOfAllegato = respDocumentoExt.getAllegati();
        if (documentoPrincipale != null) {
            if (arrayOfAllegato != null && !arrayOfAllegato.getAllegato().isEmpty()) {
                int sizeArrayOfAllegato = arrayOfAllegato.getAllegato().size();
                WSDMProtocolloAllegato[] allegati = new WSDMProtocolloAllegato[sizeArrayOfAllegato + 1];

                // Documento principale
                allegati[0] = new WSDMProtocolloAllegato();
                byte[] contenutoDocumentoPrincipale = this._getFile(username, password, loginAttr, documentoPrincipale.getIdFile());
                allegati[0].setContenuto(contenutoDocumentoPrincipale);
                allegati[0].setNome(documentoPrincipale.getNomeFile());
                allegati[0].setTipo(getTipo(documentoPrincipale.getNomeFile()));
                allegati[0].setTitolo("Allegato principale");

                // Ulteriori documenti allegati
                for (int ao = 0; ao < arrayOfAllegato.getAllegato().size(); ao++) {
                    Allegato allegato = arrayOfAllegato.getAllegato().get(ao);
                    String nome = allegato.getDocumento().getNomeFile();
                    String titolo = allegato.getDescrizione();
                    byte[] contenuto = this._getFile(username, password, loginAttr, allegato.getDocumento().getIdFile());

                    allegati[ao + 1] = new WSDMProtocolloAllegato();
                    allegati[ao + 1].setContenuto(contenuto);
                    allegati[ao + 1].setNome(nome);
                    allegati[ao + 1].setTipo(getTipo(allegato.getDocumento().getNomeFile()));
                    allegati[ao + 1].setTitolo(titolo);
                }
                wsdmprotocolloDocumento.setAllegati(allegati);

            } else {
                // Solo documento principale
                WSDMProtocolloAllegato[] allegati = new WSDMProtocolloAllegato[1];
                allegati[0] = new WSDMProtocolloAllegato();
                byte[] contenutoDocumentoPrincipale = this._getFile(username, password, loginAttr, documentoPrincipale.getIdFile());
                allegati[0].setContenuto(contenutoDocumentoPrincipale);
                allegati[0].setNome(documentoPrincipale.getNomeFile());
                allegati[0].setTipo(getTipo(documentoPrincipale.getNomeFile()));
                allegati[0].setTitolo("Allegato principale");
                wsdmprotocolloDocumento.setAllegati(allegati);
            }
        }

        // Numero del documento
        wsdmprotocolloDocumento.setNumeroDocumento(String.valueOf(respDocumentoExt.getDocNumber()));

        // Anno protocollo
        wsdmprotocolloDocumento.setAnnoProtocollo(null);

        // Numero del protocollo
        wsdmprotocolloDocumento.setNumeroProtocollo(null);

        // Oggetto del documento inserito/protocollo
        wsdmprotocolloDocumento.setOggetto(respDocumentoExt.getOggetto());

        // Lettura codice eventuale fascicolo inserito
        if (respDocumentoExt.getClassificazioni() != null) {
            List<String> listaClassificazioni = respDocumentoExt.getClassificazioni().getString();
            if (listaClassificazioni != null && !listaClassificazioni.isEmpty()) {
                WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();
                wsdmFascicolo.setCodiceFascicolo(listaClassificazioni.get(0));
                wsdmprotocolloDocumento.setFascicolo(wsdmFascicolo);
            }
        }

        wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmprotocolloDocumento);

        return wsdmprotocolloDocumentoRes;
    }

    @Override
    public WSDMProtocolloDocumentoRes _attoContrattoLeggi(String username, String password, WSDMLoginAttr
            loginAttr, String tipo, String organo, Long anno, String numero) {
        WSDMProtocolloDocumentoRes wsdmProtocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
        wsdmProtocolloDocumentoRes.setEsito(false);
        wsdmProtocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
        return wsdmProtocolloDocumentoRes;
    }

    @Override
    public WSDMInviaMailRes _inviaMail(String username, String password, WSDMLoginAttr loginAttr, WSDMInviaMail
            wsdmInviaMail) {
        WSDMInviaMailRes wsdmInviaMailRes = new WSDMInviaMailRes();
        try {
            StringBuffer messaggioCtr = new StringBuffer();

            if (Paleo2UtilityControllo.ctrInviaMail(loginAttr, wsdmInviaMail, messaggioCtr)) {
                IPaleoService2 iPaleo2Service = this.getIPaleo2Service(username, password);
                OperatorePaleo operatorePaleo = _getOperatore(loginAttr);

                String segnatura = null;
                String numeroDocumento = wsdmInviaMail.getNumeroDocumento();

                // Bisogna cercare la segnatura associata al numero documento indicato.
                // E' necessario, quindi, interrogare il protocollo mediante
                // l'operazione "cercaDocumentoProtocollo". Il protocollo puo' essere in
                // "Arrivo" oppure in "Partenza". In questi due casi è possibile
                // ottenere la "segnatura", il solo elemento documentale è privo di
                // segnatura.
                ReqCercaProtocollo reqCercaProtocollo = new ReqCercaProtocollo();
                reqCercaProtocollo.setOperatore(operatorePaleo);
                reqCercaProtocollo.setDocNumber(Integer.valueOf(numeroDocumento));
                BEBaseOfRespDocumentoExtc14F1RMd beResp = iPaleo2Service.cercaDocumentoProtocollo(reqCercaProtocollo);

                if (TipoRisultato.ERROR.equals(beResp.getMessaggioRisultato().getTipoRisultato())
                        || TipoRisultato.EXCEPTION.equals(beResp.getMessaggioRisultato().getTipoRisultato())) {
                    wsdmInviaMailRes.setEsito(false);
                    wsdmInviaMailRes.setMessaggio(beResp.getMessaggioRisultato().getDescrizione());
                } else {
                    Object resp = beResp.getOggetto();
                    if (resp instanceof RespProtocolloArrivoExt) {
                        RespProtocolloArrivoExt respProtocolloArrivoExt = (RespProtocolloArrivoExt) resp;
                        segnatura = respProtocolloArrivoExt.getSegnatura();
                    } else if (resp instanceof RespProtocolloPartenzaExt) {
                        RespProtocolloPartenzaExt respProtocolloPartenzaExt = (RespProtocolloPartenzaExt) resp;
                        segnatura = respProtocolloPartenzaExt.getSegnatura();
                    } else if (resp instanceof RespDocumentoExt) {
                        wsdmInviaMailRes.setEsito(false);
                        wsdmInviaMailRes.setMessaggio("Il numero documento non corrisponde ad alcun protocollo");
                    }
                }


                // Se è stata ottenuta la "segnatura" si procede a effettuare la
                // richiesta di invio mail.
                if (segnatura != null) {
                    ReqSpedisciProtocollo reqSpedisciProtocollo = new ReqSpedisciProtocollo();
                    reqSpedisciProtocollo.setOperatore(operatorePaleo);
                    reqSpedisciProtocollo.setSegnatura(segnatura);
                    BEBaseOfrespSpedisciProtocolloc14F1RMd beRespSpedisciProtocollo = iPaleo2Service.spedisciProtocollo(reqSpedisciProtocollo);

                    wsdmInviaMailRes.setEsito(true);
                    wsdmInviaMailRes.setMessaggio(beRespSpedisciProtocollo.getMessaggioRisultato().getDescrizione());

                    wsdmInviaMailRes.setMessaggio(beRespSpedisciProtocollo.getMessaggioRisultato().getDescrizione());

                    RespSpedisciProtocollo respSpedisciProtocollo = beRespSpedisciProtocollo.getOggetto();

                    // Lettura dello stato di invio per i destinatari
                    if (respSpedisciProtocollo.getDestinatari() != null) {
                        ArrayOfDestinatarioInfoInterop arrayOfDestinatarioInfoInterop = respSpedisciProtocollo.getDestinatari();
                        WSDMMailInfo[] destinatariMailInfo = _getDestinatariInfoInterop(arrayOfDestinatarioInfoInterop);
                        wsdmInviaMailRes.setDestinatariMailInfo(destinatariMailInfo);
                    }

                }

            } else {
                // Non sono stati superati i controlli di validita'
                wsdmInviaMailRes.setEsito(false);
                wsdmInviaMailRes.setMessaggio(messaggioCtr.toString());
            }
        } catch (WebServiceException w) {
            wsdmInviaMailRes.setEsito(false);
            wsdmInviaMailRes.setMessaggio(WS_ERROR + " " + w.getMessage());
            logger.error("Errore (_inviaMail)", w);
        } catch (NamingException e) {
            wsdmInviaMailRes.setEsito(false);
            wsdmInviaMailRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
            logger.error("Errore (_inviaMail)", e);
        } catch (Throwable t) {
            wsdmInviaMailRes.setEsito(false);
            wsdmInviaMailRes.setMessaggio(t.getMessage());
            logger.error("Errore (_inviaMail)", t);
        }

        return wsdmInviaMailRes;
    }

    /**
     * Lettura delle informazioni di spedizione della mail.
     */
    private WSDMMailInfo[] _getDestinatariInfoInterop(ArrayOfDestinatarioInfoInterop arrayOfDestinatarioInfoInterop) {
        List<DestinatarioInfoInterop> listDestinatarioInfoInterop = arrayOfDestinatarioInfoInterop.getDestinatarioInfoInterop();

        WSDMMailInfo[] destinatariMailInfo = new WSDMMailInfo[listDestinatarioInfoInterop.size()];

        for (int dest = 0; dest < listDestinatarioInfoInterop.size(); dest++) {

            DestinatarioInfoInterop destinatarioInfoInterop = listDestinatarioInfoInterop.get(dest);

            destinatariMailInfo[dest] = new WSDMMailInfo();

            // Dati principali del destinatario
            destinatariMailInfo[dest].setDestinatarioDescrizione(destinatarioInfoInterop.getDescrizione());
            destinatariMailInfo[dest].setDestinatarioEmail(destinatarioInfoInterop.getEmail());

            // Dati di spedizione
            ArrayOfMessaggioInteropInfo2 arrayOfMessaggioInteropInfo2 = destinatarioInfoInterop.getMessaggiInterop();
            List<MessaggioInteropInfo2> listMessaggioInteropInfo2 = arrayOfMessaggioInteropInfo2.getMessaggioInteropInfo2();

            // Dati del messaggio
            List<WSDMMailInfo2> arrayOfWSDMMailInfo2 = new ArrayList<>();
            for (MessaggioInteropInfo2 messaggioInteropInfo2 : listMessaggioInteropInfo2) {
                ArrayOfMessaggioPostaInfo2 arrayOfMessaggioPostaInfo2 = messaggioInteropInfo2.getMessaggiPosta();
                List<MessaggioPostaInfo2> listMessaggioPostaInfo2 = arrayOfMessaggioPostaInfo2.getMessaggioPostaInfo2();

                for (MessaggioPostaInfo2 messaggioPostaInfo2 : listMessaggioPostaInfo2) {
                    WSDMMailInfo2 destinatariMailInfo2 = new WSDMMailInfo2();
                    // Data/ora invio
                    if (messaggioPostaInfo2.getDataOra() != null) {
                        destinatariMailInfo2.setMessaggioDataOra(messaggioPostaInfo2.getDataOra().toGregorianCalendar().getTime());
                    }

                    // Direzione
                    if (messaggioPostaInfo2.getDirezione() != null) {
                        destinatariMailInfo2.setMessaggioDirezione(messaggioPostaInfo2.getDirezione().toString());
                    }

                    // Stato spedizione
                    if (messaggioInteropInfo2.getStatoSpedizione() != null) {
                        destinatariMailInfo2.setStatoSpedizione(messaggioInteropInfo2.getStatoSpedizione().toString());
                    }

                    // Tipo spedizione
                    if (messaggioInteropInfo2.getTipo() != null) {
                        destinatariMailInfo2.setTipoSpedizione(messaggioInteropInfo2.getTipo().toString());
                    }

                    // Id casella di posta
                    if (messaggioPostaInfo2.getIdCasellaPosta() != null) {
                        destinatariMailInfo2.setMessaggioIdCasellaPosta(messaggioPostaInfo2.getIdCasellaPosta().toString());
                    }

                    // Indirizzo casella di posta
                    destinatariMailInfo2.setMessaggioIndirizzoCasellaPosta(messaggioPostaInfo2.getIndirizzoCasella());

                    // Identificativo del messaggio
                    destinatariMailInfo2.setMessaggioId(messaggioPostaInfo2.getMessageId());

                    // Oggetto del messaggio
                    destinatariMailInfo2.setMessaggioOggetto(messaggioPostaInfo2.getSubject());

                    arrayOfWSDMMailInfo2.add(destinatariMailInfo2);

                }
            }

            if (!arrayOfWSDMMailInfo2.isEmpty()) {
                WSDMMailInfo2[] wsdmMailInfo2 = new WSDMMailInfo2[arrayOfWSDMMailInfo2.size()];
                for (int mi2 = 0; mi2 < arrayOfWSDMMailInfo2.size(); mi2++) {
                    wsdmMailInfo2[mi2] = arrayOfWSDMMailInfo2.get(mi2);
                }
                destinatariMailInfo[dest].setMailInfo2(wsdmMailInfo2);
            }
        }
        return destinatariMailInfo;
    }

    @Override
    public WSDMVerificaMailRes _verificaMail(String username, String password, WSDMLoginAttr loginAttr, String
            numeroDocumento, Long annoProtocollo, String numeroProtocollo) {
        WSDMVerificaMailRes wsdmVerificaMailRes = new WSDMVerificaMailRes();

        WSDMInviaMail wsdmInviaMail = new WSDMInviaMail();
        wsdmInviaMail.setNumeroDocumento(numeroDocumento);

        WSDMInviaMailRes wsdmInviaMailRes = this._inviaMail(username, password, loginAttr, wsdmInviaMail);
        wsdmVerificaMailRes.setEsito(wsdmInviaMailRes.isEsito());
        wsdmVerificaMailRes.setMessaggio(wsdmInviaMailRes.getMessaggio());
        wsdmVerificaMailRes.setDestinatariMailInfo(wsdmInviaMailRes.getDestinatariMailInfo());
        wsdmVerificaMailRes.setDestinatariCCMailInfo(wsdmInviaMailRes.getDestinatariCCMailInfo());

        return wsdmVerificaMailRes;
    }

    @Override
    public WSDMAttoContrattoRes _attoContrattoRicerca(String username, String password, WSDMLoginAttr
            loginAttr, String tipo, String organo, Long anno, String numeroDa, String numeroA, Date dataDa, Date dataA) {
        WSDMAttoContrattoRes wsdmAttoContrattoRes = new WSDMAttoContrattoRes();
        wsdmAttoContrattoRes.setEsito(false);
        wsdmAttoContrattoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
        return wsdmAttoContrattoRes;
    }

    @Override
    public WSDMListaClassificheRes _listaClassifiche(String username, String password, WSDMLoginAttr
            loginAttr, String codice, String descrizione, String voce) {
        WSDMListaClassificheRes wsdmListaClassificheRes = new WSDMListaClassificheRes();
        wsdmListaClassificheRes.setEsito(false);
        wsdmListaClassificheRes.setMessaggio(OPERATION_NOT_SUPPORTED);
        return wsdmListaClassificheRes;
    }

    @Override
    public WSDMProtocolloModificaRes _protocolloModifica(String username, String password, WSDMLoginAttr
            loginAttr, WSDMProtocolloModificaIn wsdmprotocolloModificaIn) {
        WSDMProtocolloModificaRes wsdmprotocolloModificaRes = new WSDMProtocolloModificaRes();
        wsdmprotocolloModificaRes.setEsito(false);
        wsdmprotocolloModificaRes.setMessaggio(OPERATION_NOT_SUPPORTED);
        return wsdmprotocolloModificaRes;
    }

    @Override
    public WSDMFascicoloModificaRes _fascicoloModifica(String username, String password, WSDMLoginAttr
            loginAttr, WSDMFascicoloModificaIn wsdmfascicoloModificaIn) {
        WSDMFascicoloModificaRes wsdmfascicoloModificaRes = new WSDMFascicoloModificaRes();
        wsdmfascicoloModificaRes.setEsito(false);
        wsdmfascicoloModificaRes.setMessaggio(OPERATION_NOT_SUPPORTED);
        return wsdmfascicoloModificaRes;
    }

    @Override
    public WSDMAnagraficaLeggiRes _anagraficaLeggi(String username, String password, WSDMLoginAttr
            loginAttr, String codiceAnagrafica) {
        WSDMAnagraficaLeggiRes wsdmAnagraficaLeggiRes = new WSDMAnagraficaLeggiRes();
        wsdmAnagraficaLeggiRes.setEsito(false);
        wsdmAnagraficaLeggiRes.setMessaggio(OPERATION_NOT_SUPPORTED);
        return wsdmAnagraficaLeggiRes;
    }

    @Override
    public WSDMDocumentoCollegaRes _documentoCollega(String username, String password, WSDMLoginAttr
            loginAttr, String numeroDocumentoPadre, String numeroDocumentoFiglio, String tipoCollegamento) {
        WSDMDocumentoCollegaRes wsdmDocumentoCollegaRes = new WSDMDocumentoCollegaRes();
        wsdmDocumentoCollegaRes.setEsito(false);
        wsdmDocumentoCollegaRes.setMessaggio(OPERATION_NOT_SUPPORTED);
        return wsdmDocumentoCollegaRes;
    }

    /**
     * Gestione dell'invio dei file. Gli allegati devono essere inviati con
     * chiamata singola, ossia una chiamata al servizio per un singolo allegato.
     */
    private void _addAllegatiDocumentoProtocollo(String username, String password, WSDMLoginAttr loginAttr, String
            numeroDocumento, AllegatoHash[] allegatiHash, String messaggioAddAllegati) throws Exception {

        // Servizio
        IPaleoService2 iPaleo2Service = this.getIPaleo2Service(username, password);

        // Operatore
        OperatorePaleo operatorePaleo = _getOperatore(loginAttr);

        // Allegati
        if (allegatiHash != null) {
            for (AllegatoHash hash : allegatiHash) {

                ReqAddAllegati reqAddAllegati = new ReqAddAllegati();
                reqAddAllegati.setOperatore(operatorePaleo);
                reqAddAllegati.setDocNumber(Integer.parseInt(numeroDocumento));

                ArrayOfAllegato arrayOfAllegato = new ArrayOfAllegato();

                Allegato allegato = new Allegato();

                File documento = new File();
                allegato.setDescrizione(hash.getTitolo());
                documento.setNomeFile(hash.getNome());
                documento.setImpronta(hash.getHash());
                documento.setStream(hash.getContenuto());
                allegato.setDocumento(documento);
                allegato.setFirmatoDigitalmente(hash.isSigned());
                allegato.setModalitaFormazione(TipoOriginale.DIGITALE);
                allegato.setSigillatoElettronicamente(hash.isSealed());
                allegato.setMarcaturaTemporale(hash.isTimeMarked());
                allegato.setConformitaCopieImmagineSuSupportoInformatico(hash.isCertifiedCopy());

                arrayOfAllegato.getAllegato().add(allegato);
                reqAddAllegati.setAllegati(arrayOfAllegato);

                // Invio della richiesta e lettura della risposta
                BEBaseOfrespAddAllegatic14F1RMd beRespAddAllegati = iPaleo2Service.addAllegatiDocumentoProtocollo(reqAddAllegati);
                if (messaggioAddAllegati == null) {
                    messaggioAddAllegati = "";
                } else {
                    messaggioAddAllegati += ", ";
                }
                messaggioAddAllegati += beRespAddAllegati.getMessaggioRisultato().getDescrizione() + " [" + hash.getNome() + "]";
            }

        }

    }

    /**
     * Lettura del contenuto del file in base al suo identificativo "idFile".
     */
    private byte[] _getFile(String username, String password, WSDMLoginAttr loginAttr, int idFile) throws Exception {

        byte[] stream = null;

        IPaleoService2 iPaleoService = this.getIPaleo2Service(username, password);
        OperatorePaleo operatorePaleo = _getOperatore(loginAttr);
        BEBaseOfFilec14F1RMd beBase = iPaleoService.getFile(operatorePaleo, idFile);
        if (beBase != null) {
            if (!TipoRisultato.ERROR.equals(beBase.getMessaggioRisultato().getTipoRisultato()) && !TipoRisultato.EXCEPTION.equals(beBase.getMessaggioRisultato().getTipoRisultato())) {
                if (beBase.getOggetto() != null) {
                    stream = beBase.getOggetto().getStream();
                }
            }
        }

        return stream;

    }

    @Override
    public WSDMListaOperatoriRes _listaOperatori(String username, String password, WSDMLoginAttr loginAttr, String
            cognome, String codiceFiscale) {

        WSDMListaOperatoriRes wsdmListaUtentiRes = new WSDMListaOperatoriRes();

        try {

            IPaleoService2 iPaleoService = this.getIPaleo2Service(username, password);

            BEListOfOperatorePaleoc14F1RMd findOperatoriResult = iPaleoService.findOperatori(cognome, codiceFiscale);
            if (findOperatoriResult != null) {
                if (findOperatoriResult.getMessaggioRisultato() != null) {
                    if (TipoRisultato.ERROR.equals(findOperatoriResult.getMessaggioRisultato().getTipoRisultato())
                            || TipoRisultato.EXCEPTION.equals(findOperatoriResult.getMessaggioRisultato().getTipoRisultato())) {
                        wsdmListaUtentiRes.setEsito(false);
                        wsdmListaUtentiRes.setMessaggio(findOperatoriResult.getMessaggioRisultato().getDescrizione());
                    } else {
                        if (findOperatoriResult.getLista() != null) {
                            ArrayOfOperatorePaleo arrayOfOperatorePaleo = findOperatoriResult.getLista();
                            List<OperatorePaleo> listaOperatoriPaleo = arrayOfOperatorePaleo.getOperatorePaleo();

                            WSDMOperatore[] listaOperatori = new WSDMOperatore[listaOperatoriPaleo.size()];

                            for (int o = 0; o < listaOperatoriPaleo.size(); o++) {

                                OperatorePaleo operatorePaleo = listaOperatoriPaleo.get(o);
                                listaOperatori[o] = new WSDMOperatore();

                                listaOperatori[o].setCodiceUO(operatorePaleo.getCodiceUO());
                                listaOperatori[o].setCognome(operatorePaleo.getCognome());
                                listaOperatori[o].setNome(operatorePaleo.getNome());
                                listaOperatori[o].setRuolo(operatorePaleo.getCodiceRuolo());

                            }

                            wsdmListaUtentiRes.setEsito(true);
                            wsdmListaUtentiRes.setOperatori(listaOperatori);

                        } else {
                            wsdmListaUtentiRes.setEsito(false);
                            wsdmListaUtentiRes.setMessaggio("Non e' stato trovato alcun operatore.");
                        }
                    }
                }
            }

        } catch (WebServiceException w) {
            wsdmListaUtentiRes.setEsito(false);
            wsdmListaUtentiRes.setMessaggio(WS_ERROR + " " + w.getMessage());
            logger.error("Errore (_listaUtenti)", w);
        } catch (NamingException e) {
            wsdmListaUtentiRes.setEsito(false);
            wsdmListaUtentiRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
            logger.error("Errore (_listaUtenti)", e);
        } catch (Throwable t) {
            wsdmListaUtentiRes.setEsito(false);
            wsdmListaUtentiRes.setMessaggio(t.getMessage());
            logger.error("Errore (_listaUtenti)", t);
        }

        return wsdmListaUtentiRes;
    }

    @Override
    public WSDMListaTipiTrasmissioneRes _listaTipiTrasmissione(String username, String password, WSDMLoginAttr
            loginAttr) {

        WSDMListaTipiTrasmissioneRes wsdmListaTipiTrasmissioneRes = new WSDMListaTipiTrasmissioneRes();

        try {

            IPaleoService2 iPaleoService = this.getIPaleo2Service(username, password);

            BEListOfRagioneInfoZA0HwLp5 getRagioniTramissioneResult = iPaleoService.getRagioniTrasmissione();
            if (getRagioniTramissioneResult != null) {
                if (getRagioniTramissioneResult.getMessaggioRisultato() != null) {
                    if (TipoRisultato.ERROR.equals(getRagioniTramissioneResult.getMessaggioRisultato().getTipoRisultato()) || TipoRisultato.EXCEPTION.equals(getRagioniTramissioneResult.getMessaggioRisultato().getTipoRisultato())) {
                        wsdmListaTipiTrasmissioneRes.setEsito(false);
                        wsdmListaTipiTrasmissioneRes.setMessaggio(getRagioniTramissioneResult.getMessaggioRisultato().getDescrizione());
                    } else {
                        if (getRagioniTramissioneResult.getLista() != null) {
                            ArrayOfRagioneInfo arrayOfRagioniInfo = getRagioniTramissioneResult.getLista();
                            List<RagioneInfo> listaRagioniInfo = arrayOfRagioniInfo.getRagioneInfo();

                            WSDMTipoTrasmissione[] listaTipiTrasmissione = new WSDMTipoTrasmissione[listaRagioniInfo.size()];

                            for (int r = 0; r < listaRagioniInfo.size(); r++) {

                                RagioneInfo ragioneInfo = listaRagioniInfo.get(r);
                                listaTipiTrasmissione[r] = new WSDMTipoTrasmissione();

                                listaTipiTrasmissione[r].setNome(ragioneInfo.getDescrizione());
                                listaTipiTrasmissione[r].setDescrizione(ragioneInfo.getDescrizione());
                                listaTipiTrasmissione[r].setCodice(ragioneInfo.getCodice());
                                listaTipiTrasmissione[r].setTipoDestinatario(ragioneInfo.getTipoDestinatario().value());

                            }

                            wsdmListaTipiTrasmissioneRes.setEsito(true);
                            wsdmListaTipiTrasmissioneRes.setTipiTrasmissione(listaTipiTrasmissione);

                        } else {
                            wsdmListaTipiTrasmissioneRes.setEsito(false);
                            wsdmListaTipiTrasmissioneRes.setMessaggio("Non e' stato trovato alcun tipo trasmissione.");
                        }
                    }
                }
            }

        } catch (WebServiceException w) {
            wsdmListaTipiTrasmissioneRes.setEsito(false);
            wsdmListaTipiTrasmissioneRes.setMessaggio(WS_ERROR + " " + w.getMessage());
            logger.error("Errore (_listaTipiTrasmissione)", w);
        } catch (NamingException e) {
            wsdmListaTipiTrasmissioneRes.setEsito(false);
            wsdmListaTipiTrasmissioneRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
            logger.error("Errore (_listaTipiTrasmissione)", e);
        } catch (Throwable t) {
            wsdmListaTipiTrasmissioneRes.setEsito(false);
            wsdmListaTipiTrasmissioneRes.setMessaggio(t.getMessage());
            logger.error("Errore (_listaTipiTrasmissione)", t);
        }

        return wsdmListaTipiTrasmissioneRes;

    }

    @Override
    public WSDMTrasmissioneRes _trasmissione(String username, String password, WSDMLoginAttr
            loginAttr, WSDMTrasmissioneIn trasmissioneIn) {

        WSDMTrasmissioneRes wsdmTrasmissioneRes = new WSDMTrasmissioneRes();

        try {

            StringBuffer messaggioCtr = new StringBuffer();
            if (Paleo2UtilityControllo.ctrTrasmissione(loginAttr, trasmissioneIn, messaggioCtr)) {

                IPaleoService2 iPaleo2Service = this.getIPaleo2Service(username, password);
                OperatorePaleo operatorePaleo = _getOperatore(loginAttr);

                ArrayOfTrasmissioneDoc arrayOfTrasmissioneDoc = new ArrayOfTrasmissioneDoc();
                List<TrasmissioneDoc> listTrasmissioneDoc = arrayOfTrasmissioneDoc.getTrasmissioneDoc();

                // Documento (possono essere indicati vari documenti)
                for (int td = 0; td < trasmissioneIn.getDocumenti().length; td++) {
                    WSDMTrasmissioneDocumento trasmissioneDocumentoWSDM = trasmissioneIn.getDocumenti()[td];
                    TrasmissioneDoc trasmissioneDoc = new TrasmissioneDoc();

                    String numeroDocumento = trasmissioneDocumentoWSDM.getNumeroDocumento();
                    trasmissioneDoc.setDocNumber(Integer.parseInt(numeroDocumento));

                    ArrayOfTrasmissioneUtente arrayOfTrasmissioneUtente = new ArrayOfTrasmissioneUtente();
                    List<TrasmissioneUtente> listTrasmissioneUtente = arrayOfTrasmissioneUtente.getTrasmissioneUtente();

                    // Utente cui assegnare il documento (possono essere identificati
                    // vari utenti)
                    for (int tu = 0; tu < trasmissioneDocumentoWSDM.getUtenti().length; tu++) {
                        WSDMTrasmissioneUtente trasmissioneUtenteWSDM = trasmissioneDocumentoWSDM.getUtenti()[tu];
                        TrasmissioneUtente trasmissioneUtente = new TrasmissioneUtente();

                        OperatorePaleo trasmissioneOperatore = new OperatorePaleo();
                        trasmissioneOperatore.setCodiceUO(trasmissioneUtenteWSDM.getOperatore().getCodiceUO());
                        trasmissioneOperatore.setCognome(trasmissioneUtenteWSDM.getOperatore().getCognome());
                        trasmissioneOperatore.setNome(trasmissioneUtenteWSDM.getOperatore().getNome());
                        trasmissioneOperatore.setCodiceRuolo(trasmissioneUtenteWSDM.getOperatore().getRuolo());

                        trasmissioneUtente.setOperatoreDestinatario(trasmissioneOperatore);
                        trasmissioneUtente.setCodiceRagione(trasmissioneUtenteWSDM.getTipoTrasmissione());

                        listTrasmissioneUtente.add(trasmissioneUtente);

                    }

                    trasmissioneDoc.setTrasmissioniUtente(arrayOfTrasmissioneUtente);
                    listTrasmissioneDoc.add(trasmissioneDoc);

                }

                ReqEffettuaTrasmissioni reqEffettuaTrasmissioni = new ReqEffettuaTrasmissioni();
                reqEffettuaTrasmissioni.setInviaEmail(true);
                reqEffettuaTrasmissioni.setOperatore(operatorePaleo);
                reqEffettuaTrasmissioni.setTrasmissioni(arrayOfTrasmissioneDoc);
                BEBase beBase = iPaleo2Service.effettuaTrasmissioni(reqEffettuaTrasmissioni);

                wsdmTrasmissioneRes.setEsito(!TipoRisultato.ERROR.equals(beBase.getMessaggioRisultato().getTipoRisultato())
                        && !TipoRisultato.EXCEPTION.equals(beBase.getMessaggioRisultato().getTipoRisultato()));
                wsdmTrasmissioneRes.setMessaggio(beBase.getMessaggioRisultato().getDescrizione());

            } else {
                wsdmTrasmissioneRes.setEsito(false);
                wsdmTrasmissioneRes.setMessaggio(messaggioCtr.toString());
            }

        } catch (WebServiceException w) {
            wsdmTrasmissioneRes.setEsito(false);
            wsdmTrasmissioneRes.setMessaggio(WS_ERROR + " " + w.getMessage());
            logger.error("Errore (_trasmissione)", w);
        } catch (NamingException e) {
            wsdmTrasmissioneRes.setEsito(false);
            wsdmTrasmissioneRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
            logger.error("Errore (_trasmissione)", e);
        } catch (Throwable t) {
            wsdmTrasmissioneRes.setEsito(false);
            wsdmTrasmissioneRes.setMessaggio(t.getMessage());
            logger.error("Errore (_trasmissione)", t);
        }

        return wsdmTrasmissioneRes;
    }

    @Override
    public WSDMAggiungiAllegatiRes _aggiungiAllegati(String username, String password, WSDMLoginAttr
            loginAttr, WSDMAggiungiAllegatiIn aggiungiAllegatiIn) {
        WSDMAggiungiAllegatiRes wsdmAggiungiAllegatiRes = new WSDMAggiungiAllegatiRes();
        wsdmAggiungiAllegatiRes.setEsito(false);
        wsdmAggiungiAllegatiRes.setMessaggio(OPERATION_NOT_SUPPORTED);
        return wsdmAggiungiAllegatiRes;
    }

    @Override
    public WSDMListaAccountEmailRes _listaAccountEmail(String username, String password, WSDMLoginAttr
            loginAttr, WSDMRicercaAccountEmail ricercaAccountEmail) {
        WSDMListaAccountEmailRes wsdmListaAccountEmailRes = new WSDMListaAccountEmailRes();
        wsdmListaAccountEmailRes.setEsito(false);
        wsdmListaAccountEmailRes.setMessaggio(OPERATION_NOT_SUPPORTED);
        return wsdmListaAccountEmailRes;
    }

    @Override
    public WSDMRicercaFascicoloRes _fascicoloRicerca(String username, String password, WSDMLoginAttr
            loginAttr, WSDMRicercaFascicolo ricercaFascicolo) {
        WSDMRicercaFascicoloRes wsdmRicercaFascicoloRes = new WSDMRicercaFascicoloRes();
        wsdmRicercaFascicoloRes.setEsito(false);
        wsdmRicercaFascicoloRes.setMessaggio(OPERATION_NOT_SUPPORTED);
        return wsdmRicercaFascicoloRes;
    }

    @Override
    public WSDMProtocolloDocumentoRes _firmaInserisci(String username, String password, WSDMLoginAttr
            loginAttr, WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {
        WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
        return wsdmprotocolloDocumentoRes;
    }

    @Override
    public WSDMProtocolloDocumentoRes _firmaVerifica(String username, String password, WSDMLoginAttr
            loginAttr, String numeroDocumento) {
        WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
        return wsdmprotocolloDocumentoRes;
    }

    @Override
    public WSDMProtocolloDocumentoRes _protocolloAsincronoEsito(String username, String password, WSDMLoginAttr
            loginAttr, String id) {
        WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
        return wsdmprotocolloDocumentoRes;
    }

    @Override
    public WSDMDocumentoAggiungiInformazioniRes _documentoAggiungiInformazioni(String username, String
            password, WSDMLoginAttr loginAttr, WSDMDocumentoAggiungiInformazioni documentoAggiungiInformazioni) {
        WSDMDocumentoAggiungiInformazioniRes wsdmDocumentoAggiungiInformazioniRes = new WSDMDocumentoAggiungiInformazioniRes();
        wsdmDocumentoAggiungiInformazioniRes.setEsito(false);
        wsdmDocumentoAggiungiInformazioniRes.setMessaggio(OPERATION_NOT_SUPPORTED);
        return wsdmDocumentoAggiungiInformazioniRes;
    }

    @Override
    public WSDMFascicoloChiudiRes _fascicoloChiudi(String username, String password, WSDMLoginAttr loginAttr, WSDMFascicoloChiudiIn fascicoloChiudiIn) {
        WSDMFascicoloChiudiRes wsdmFascicoloChiudiRes = new WSDMFascicoloChiudiRes();

        try {

            StringBuffer messaggioCtr = new StringBuffer();
            if (Paleo2UtilityControllo.ctrFascicoloChiudi(loginAttr, fascicoloChiudiIn, messaggioCtr)) {

                IPaleoService2 iPaleo2Service = this.getIPaleo2Service(username, password);
                OperatorePaleo operatorePaleo = _getOperatore(loginAttr);

                ReqApriChiudiFascicolo reqApriChiudiFascicolo = new ReqApriChiudiFascicolo();
                reqApriChiudiFascicolo.setOperatore(operatorePaleo);

                // Codice del fascicolo
                reqApriChiudiFascicolo.setCodice(fascicoloChiudiIn.getCodiceFascicolo());

                // Custode
                if (fascicoloChiudiIn.getCustode() != null) {
                    OperatorePaleo custode = new OperatorePaleo();
                    if (fascicoloChiudiIn.getCustode().getCodiceUO() != null) {
                        custode.setCodiceUO(fascicoloChiudiIn.getCustode().getCodiceUO());
                    }
                    if (fascicoloChiudiIn.getCustode().getCognome() != null) {
                        custode.setCognome(fascicoloChiudiIn.getCustode().getCognome());
                    }
                    if (fascicoloChiudiIn.getCustode().getNome() != null) {
                        custode.setNome(fascicoloChiudiIn.getCustode().getNome());
                    }
                    if (fascicoloChiudiIn.getCustode().getRuolo() != null) {
                        custode.setCodiceRuolo(fascicoloChiudiIn.getCustode().getRuolo());
                    }
                    reqApriChiudiFascicolo.setCustode(custode);
                }

                BEBase beBase = iPaleo2Service.chiudiFascicolo(reqApriChiudiFascicolo);

                wsdmFascicoloChiudiRes.setEsito(!TipoRisultato.ERROR.equals(beBase.getMessaggioRisultato().getTipoRisultato())
                        && !TipoRisultato.EXCEPTION.equals(beBase.getMessaggioRisultato().getTipoRisultato()));
                wsdmFascicoloChiudiRes.setMessaggio(beBase.getMessaggioRisultato().getDescrizione());

            } else {
                wsdmFascicoloChiudiRes.setEsito(false);
                wsdmFascicoloChiudiRes.setMessaggio(messaggioCtr.toString());
            }

        } catch (WebServiceException w) {
            wsdmFascicoloChiudiRes.setEsito(false);
            wsdmFascicoloChiudiRes.setMessaggio(WS_ERROR + " " + w.getMessage());
            logger.error("Errore (_trasmissione)", w);
        } catch (NamingException e) {
            wsdmFascicoloChiudiRes.setEsito(false);
            wsdmFascicoloChiudiRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
            logger.error("Errore (_trasmissione)", e);
        } catch (Throwable t) {
            wsdmFascicoloChiudiRes.setEsito(false);
            wsdmFascicoloChiudiRes.setMessaggio(t.getMessage());
            logger.error("Errore (_trasmissione)", t);
        }

        return wsdmFascicoloChiudiRes;

    }


}
