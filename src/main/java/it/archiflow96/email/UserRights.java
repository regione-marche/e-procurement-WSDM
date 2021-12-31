
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserRights.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserRights">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UrUndefined"/>
 *     &lt;enumeration value="UrGestioneUtenti"/>
 *     &lt;enumeration value="UrGestioneCartucce"/>
 *     &lt;enumeration value="UrImpostaDocumenti"/>
 *     &lt;enumeration value="UrRicercare"/>
 *     &lt;enumeration value="UrInserire"/>
 *     &lt;enumeration value="UrSmistare"/>
 *     &lt;enumeration value="UrRispedire"/>
 *     &lt;enumeration value="UrModificaProtocollo"/>
 *     &lt;enumeration value="UrAggiungerePagine"/>
 *     &lt;enumeration value="UrCancellaLista"/>
 *     &lt;enumeration value="UrImportSpool"/>
 *     &lt;enumeration value="UrAnnullareProtocollo"/>
 *     &lt;enumeration value="UrModificaDati"/>
 *     &lt;enumeration value="UrModificaAnnotazioni"/>
 *     &lt;enumeration value="UrModificaAllegati"/>
 *     &lt;enumeration value="UrModificaImmagini"/>
 *     &lt;enumeration value="UrSpedisciFax"/>
 *     &lt;enumeration value="UrCreaFascicoli"/>
 *     &lt;enumeration value="UrCreaArmadiCassetti"/>
 *     &lt;enumeration value="UrFascicolare"/>
 *     &lt;enumeration value="UrOcr"/>
 *     &lt;enumeration value="UrVuoto1"/>
 *     &lt;enumeration value="UrVuoto2"/>
 *     &lt;enumeration value="UrModificaArchDoc"/>
 *     &lt;enumeration value="UrTogliVisibilita"/>
 *     &lt;enumeration value="UrCancellaFascicolo"/>
 *     &lt;enumeration value="UrImportGenerico"/>
 *     &lt;enumeration value="UrStampaRegistro"/>
 *     &lt;enumeration value="UrPostaEstesa"/>
 *     &lt;enumeration value="UrCambiaSubnet"/>
 *     &lt;enumeration value="UrScansione"/>
 *     &lt;enumeration value="UrGestireModScanbatch"/>
 *     &lt;enumeration value="UrImportEmail"/>
 *     &lt;enumeration value="UrFirmare"/>
 *     &lt;enumeration value="UrStampaImmagini"/>
 *     &lt;enumeration value="UrExport"/>
 *     &lt;enumeration value="UrImpostaScadenza"/>
 *     &lt;enumeration value="UrConfermareAnnulla"/>
 *     &lt;enumeration value="UrInvioTelematico"/>
 *     &lt;enumeration value="UrRicezioneTelematica"/>
 *     &lt;enumeration value="UrVerificaRicevute"/>
 *     &lt;enumeration value="UrGestioneAnagrafica"/>
 *     &lt;enumeration value="UrInvioMessaggi"/>
 *     &lt;enumeration value="UrAggiornamentoListe"/>
 *     &lt;enumeration value="UrVisibilitaSoloDoc"/>
 *     &lt;enumeration value="UrGestionePrenotazioni"/>
 *     &lt;enumeration value="UrStampaImgControllata"/>
 *     &lt;enumeration value="UrInsModRecAnagrafica"/>
 *     &lt;enumeration value="UrConfermareRipristino"/>
 *     &lt;enumeration value="UrExportFascicolo"/>
 *     &lt;enumeration value="UrBloccoDocumento"/>
 *     &lt;enumeration value="UrDisDisconnInattivita"/>
 *     &lt;enumeration value="UrInvioOnLine"/>
 *     &lt;enumeration value="UrInvioPec"/>
 *     &lt;enumeration value="UrGestRegProt"/>
 *     &lt;enumeration value="UrMettereInSmistamento"/>
 *     &lt;enumeration value="UrGestioneTemplTit"/>
 *     &lt;enumeration value="UrGestioneTitolario"/>
 *     &lt;enumeration value="UrGestioneVoceTit"/>
 *     &lt;enumeration value="UrVoceObsoleta"/>
 *     &lt;enumeration value="UrGestioneTipoFasc"/>
 *     &lt;enumeration value="UrGestioneFascicolo"/>
 *     &lt;enumeration value="UrCambioStatoFasc"/>
 *     &lt;enumeration value="UrModificaDatiFasc"/>
 *     &lt;enumeration value="UrInserireNoteFasc"/>
 *     &lt;enumeration value="UrMovimentazioneFasc"/>
 *     &lt;enumeration value="UrInserimentoVuoti"/>
 *     &lt;enumeration value="UrFascicolareArch"/>
 *     &lt;enumeration value="UrClassificare"/>
 *     &lt;enumeration value="UrCestinareFascicolo"/>
 *     &lt;enumeration value="UrEliminareFascicolo"/>
 *     &lt;enumeration value="UrCambioClassFascicolo"/>
 *     &lt;enumeration value="UrManageSharedMailboxData"/>
 *     &lt;enumeration value="UrUtilizzoGlifo"/>
 *     &lt;enumeration value="UrPutInPreservation"/>
 *     &lt;enumeration value="UrEnableSnaAnonymous"/>
 *     &lt;enumeration value="UrEnableSnaComplete"/>
 *     &lt;enumeration value="UrPartialCancels"/>
 *     &lt;enumeration value="UrCreateCompliantCopies"/>
 *     &lt;enumeration value="UrTasksCreate"/>
 *     &lt;enumeration value="UrTasksManage"/>
 *     &lt;enumeration value="UrSapPublish"/>
 *     &lt;enumeration value="UrMassiveSending"/>
 *     &lt;enumeration value="UrInvoicePlannedMailing"/>
 *     &lt;enumeration value="UrInvoiceManualMailing"/>
 *     &lt;enumeration value="UrInvoiceManualReMailing"/>
 *     &lt;enumeration value="UrInvoiceChangeMonChannel"/>
 *     &lt;enumeration value="UrInvoiceAppRejMailing"/>
 *     &lt;enumeration value="UrInvoiceDataTransm"/>
 *     &lt;enumeration value="UrPermalink"/>
 *     &lt;enumeration value="UrCreateLinkFascArch"/>
 *     &lt;enumeration value="UrSignature"/>
 *     &lt;enumeration value="UrOrderManagementNSO"/>
 *     &lt;enumeration value="UrManagementLog"/>
 *     &lt;enumeration value="UrSocialWorkflowCreate"/>
 *     &lt;enumeration value="UrInsModRptModels"/>
 *     &lt;enumeration value="UrViewRptModels"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserRights", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum UserRights {

    @XmlEnumValue("UrUndefined")
    UR_UNDEFINED("UrUndefined"),
    @XmlEnumValue("UrGestioneUtenti")
    UR_GESTIONE_UTENTI("UrGestioneUtenti"),
    @XmlEnumValue("UrGestioneCartucce")
    UR_GESTIONE_CARTUCCE("UrGestioneCartucce"),
    @XmlEnumValue("UrImpostaDocumenti")
    UR_IMPOSTA_DOCUMENTI("UrImpostaDocumenti"),
    @XmlEnumValue("UrRicercare")
    UR_RICERCARE("UrRicercare"),
    @XmlEnumValue("UrInserire")
    UR_INSERIRE("UrInserire"),
    @XmlEnumValue("UrSmistare")
    UR_SMISTARE("UrSmistare"),
    @XmlEnumValue("UrRispedire")
    UR_RISPEDIRE("UrRispedire"),
    @XmlEnumValue("UrModificaProtocollo")
    UR_MODIFICA_PROTOCOLLO("UrModificaProtocollo"),
    @XmlEnumValue("UrAggiungerePagine")
    UR_AGGIUNGERE_PAGINE("UrAggiungerePagine"),
    @XmlEnumValue("UrCancellaLista")
    UR_CANCELLA_LISTA("UrCancellaLista"),
    @XmlEnumValue("UrImportSpool")
    UR_IMPORT_SPOOL("UrImportSpool"),
    @XmlEnumValue("UrAnnullareProtocollo")
    UR_ANNULLARE_PROTOCOLLO("UrAnnullareProtocollo"),
    @XmlEnumValue("UrModificaDati")
    UR_MODIFICA_DATI("UrModificaDati"),
    @XmlEnumValue("UrModificaAnnotazioni")
    UR_MODIFICA_ANNOTAZIONI("UrModificaAnnotazioni"),
    @XmlEnumValue("UrModificaAllegati")
    UR_MODIFICA_ALLEGATI("UrModificaAllegati"),
    @XmlEnumValue("UrModificaImmagini")
    UR_MODIFICA_IMMAGINI("UrModificaImmagini"),
    @XmlEnumValue("UrSpedisciFax")
    UR_SPEDISCI_FAX("UrSpedisciFax"),
    @XmlEnumValue("UrCreaFascicoli")
    UR_CREA_FASCICOLI("UrCreaFascicoli"),
    @XmlEnumValue("UrCreaArmadiCassetti")
    UR_CREA_ARMADI_CASSETTI("UrCreaArmadiCassetti"),
    @XmlEnumValue("UrFascicolare")
    UR_FASCICOLARE("UrFascicolare"),
    @XmlEnumValue("UrOcr")
    UR_OCR("UrOcr"),
    @XmlEnumValue("UrVuoto1")
    UR_VUOTO_1("UrVuoto1"),
    @XmlEnumValue("UrVuoto2")
    UR_VUOTO_2("UrVuoto2"),
    @XmlEnumValue("UrModificaArchDoc")
    UR_MODIFICA_ARCH_DOC("UrModificaArchDoc"),
    @XmlEnumValue("UrTogliVisibilita")
    UR_TOGLI_VISIBILITA("UrTogliVisibilita"),
    @XmlEnumValue("UrCancellaFascicolo")
    UR_CANCELLA_FASCICOLO("UrCancellaFascicolo"),
    @XmlEnumValue("UrImportGenerico")
    UR_IMPORT_GENERICO("UrImportGenerico"),
    @XmlEnumValue("UrStampaRegistro")
    UR_STAMPA_REGISTRO("UrStampaRegistro"),
    @XmlEnumValue("UrPostaEstesa")
    UR_POSTA_ESTESA("UrPostaEstesa"),
    @XmlEnumValue("UrCambiaSubnet")
    UR_CAMBIA_SUBNET("UrCambiaSubnet"),
    @XmlEnumValue("UrScansione")
    UR_SCANSIONE("UrScansione"),
    @XmlEnumValue("UrGestireModScanbatch")
    UR_GESTIRE_MOD_SCANBATCH("UrGestireModScanbatch"),
    @XmlEnumValue("UrImportEmail")
    UR_IMPORT_EMAIL("UrImportEmail"),
    @XmlEnumValue("UrFirmare")
    UR_FIRMARE("UrFirmare"),
    @XmlEnumValue("UrStampaImmagini")
    UR_STAMPA_IMMAGINI("UrStampaImmagini"),
    @XmlEnumValue("UrExport")
    UR_EXPORT("UrExport"),
    @XmlEnumValue("UrImpostaScadenza")
    UR_IMPOSTA_SCADENZA("UrImpostaScadenza"),
    @XmlEnumValue("UrConfermareAnnulla")
    UR_CONFERMARE_ANNULLA("UrConfermareAnnulla"),
    @XmlEnumValue("UrInvioTelematico")
    UR_INVIO_TELEMATICO("UrInvioTelematico"),
    @XmlEnumValue("UrRicezioneTelematica")
    UR_RICEZIONE_TELEMATICA("UrRicezioneTelematica"),
    @XmlEnumValue("UrVerificaRicevute")
    UR_VERIFICA_RICEVUTE("UrVerificaRicevute"),
    @XmlEnumValue("UrGestioneAnagrafica")
    UR_GESTIONE_ANAGRAFICA("UrGestioneAnagrafica"),
    @XmlEnumValue("UrInvioMessaggi")
    UR_INVIO_MESSAGGI("UrInvioMessaggi"),
    @XmlEnumValue("UrAggiornamentoListe")
    UR_AGGIORNAMENTO_LISTE("UrAggiornamentoListe"),
    @XmlEnumValue("UrVisibilitaSoloDoc")
    UR_VISIBILITA_SOLO_DOC("UrVisibilitaSoloDoc"),
    @XmlEnumValue("UrGestionePrenotazioni")
    UR_GESTIONE_PRENOTAZIONI("UrGestionePrenotazioni"),
    @XmlEnumValue("UrStampaImgControllata")
    UR_STAMPA_IMG_CONTROLLATA("UrStampaImgControllata"),
    @XmlEnumValue("UrInsModRecAnagrafica")
    UR_INS_MOD_REC_ANAGRAFICA("UrInsModRecAnagrafica"),
    @XmlEnumValue("UrConfermareRipristino")
    UR_CONFERMARE_RIPRISTINO("UrConfermareRipristino"),
    @XmlEnumValue("UrExportFascicolo")
    UR_EXPORT_FASCICOLO("UrExportFascicolo"),
    @XmlEnumValue("UrBloccoDocumento")
    UR_BLOCCO_DOCUMENTO("UrBloccoDocumento"),
    @XmlEnumValue("UrDisDisconnInattivita")
    UR_DIS_DISCONN_INATTIVITA("UrDisDisconnInattivita"),
    @XmlEnumValue("UrInvioOnLine")
    UR_INVIO_ON_LINE("UrInvioOnLine"),
    @XmlEnumValue("UrInvioPec")
    UR_INVIO_PEC("UrInvioPec"),
    @XmlEnumValue("UrGestRegProt")
    UR_GEST_REG_PROT("UrGestRegProt"),
    @XmlEnumValue("UrMettereInSmistamento")
    UR_METTERE_IN_SMISTAMENTO("UrMettereInSmistamento"),
    @XmlEnumValue("UrGestioneTemplTit")
    UR_GESTIONE_TEMPL_TIT("UrGestioneTemplTit"),
    @XmlEnumValue("UrGestioneTitolario")
    UR_GESTIONE_TITOLARIO("UrGestioneTitolario"),
    @XmlEnumValue("UrGestioneVoceTit")
    UR_GESTIONE_VOCE_TIT("UrGestioneVoceTit"),
    @XmlEnumValue("UrVoceObsoleta")
    UR_VOCE_OBSOLETA("UrVoceObsoleta"),
    @XmlEnumValue("UrGestioneTipoFasc")
    UR_GESTIONE_TIPO_FASC("UrGestioneTipoFasc"),
    @XmlEnumValue("UrGestioneFascicolo")
    UR_GESTIONE_FASCICOLO("UrGestioneFascicolo"),
    @XmlEnumValue("UrCambioStatoFasc")
    UR_CAMBIO_STATO_FASC("UrCambioStatoFasc"),
    @XmlEnumValue("UrModificaDatiFasc")
    UR_MODIFICA_DATI_FASC("UrModificaDatiFasc"),
    @XmlEnumValue("UrInserireNoteFasc")
    UR_INSERIRE_NOTE_FASC("UrInserireNoteFasc"),
    @XmlEnumValue("UrMovimentazioneFasc")
    UR_MOVIMENTAZIONE_FASC("UrMovimentazioneFasc"),
    @XmlEnumValue("UrInserimentoVuoti")
    UR_INSERIMENTO_VUOTI("UrInserimentoVuoti"),
    @XmlEnumValue("UrFascicolareArch")
    UR_FASCICOLARE_ARCH("UrFascicolareArch"),
    @XmlEnumValue("UrClassificare")
    UR_CLASSIFICARE("UrClassificare"),
    @XmlEnumValue("UrCestinareFascicolo")
    UR_CESTINARE_FASCICOLO("UrCestinareFascicolo"),
    @XmlEnumValue("UrEliminareFascicolo")
    UR_ELIMINARE_FASCICOLO("UrEliminareFascicolo"),
    @XmlEnumValue("UrCambioClassFascicolo")
    UR_CAMBIO_CLASS_FASCICOLO("UrCambioClassFascicolo"),
    @XmlEnumValue("UrManageSharedMailboxData")
    UR_MANAGE_SHARED_MAILBOX_DATA("UrManageSharedMailboxData"),
    @XmlEnumValue("UrUtilizzoGlifo")
    UR_UTILIZZO_GLIFO("UrUtilizzoGlifo"),
    @XmlEnumValue("UrPutInPreservation")
    UR_PUT_IN_PRESERVATION("UrPutInPreservation"),
    @XmlEnumValue("UrEnableSnaAnonymous")
    UR_ENABLE_SNA_ANONYMOUS("UrEnableSnaAnonymous"),
    @XmlEnumValue("UrEnableSnaComplete")
    UR_ENABLE_SNA_COMPLETE("UrEnableSnaComplete"),
    @XmlEnumValue("UrPartialCancels")
    UR_PARTIAL_CANCELS("UrPartialCancels"),
    @XmlEnumValue("UrCreateCompliantCopies")
    UR_CREATE_COMPLIANT_COPIES("UrCreateCompliantCopies"),
    @XmlEnumValue("UrTasksCreate")
    UR_TASKS_CREATE("UrTasksCreate"),
    @XmlEnumValue("UrTasksManage")
    UR_TASKS_MANAGE("UrTasksManage"),
    @XmlEnumValue("UrSapPublish")
    UR_SAP_PUBLISH("UrSapPublish"),
    @XmlEnumValue("UrMassiveSending")
    UR_MASSIVE_SENDING("UrMassiveSending"),
    @XmlEnumValue("UrInvoicePlannedMailing")
    UR_INVOICE_PLANNED_MAILING("UrInvoicePlannedMailing"),
    @XmlEnumValue("UrInvoiceManualMailing")
    UR_INVOICE_MANUAL_MAILING("UrInvoiceManualMailing"),
    @XmlEnumValue("UrInvoiceManualReMailing")
    UR_INVOICE_MANUAL_RE_MAILING("UrInvoiceManualReMailing"),
    @XmlEnumValue("UrInvoiceChangeMonChannel")
    UR_INVOICE_CHANGE_MON_CHANNEL("UrInvoiceChangeMonChannel"),
    @XmlEnumValue("UrInvoiceAppRejMailing")
    UR_INVOICE_APP_REJ_MAILING("UrInvoiceAppRejMailing"),
    @XmlEnumValue("UrInvoiceDataTransm")
    UR_INVOICE_DATA_TRANSM("UrInvoiceDataTransm"),
    @XmlEnumValue("UrPermalink")
    UR_PERMALINK("UrPermalink"),
    @XmlEnumValue("UrCreateLinkFascArch")
    UR_CREATE_LINK_FASC_ARCH("UrCreateLinkFascArch"),
    @XmlEnumValue("UrSignature")
    UR_SIGNATURE("UrSignature"),
    @XmlEnumValue("UrOrderManagementNSO")
    UR_ORDER_MANAGEMENT_NSO("UrOrderManagementNSO"),
    @XmlEnumValue("UrManagementLog")
    UR_MANAGEMENT_LOG("UrManagementLog"),
    @XmlEnumValue("UrSocialWorkflowCreate")
    UR_SOCIAL_WORKFLOW_CREATE("UrSocialWorkflowCreate"),
    @XmlEnumValue("UrInsModRptModels")
    UR_INS_MOD_RPT_MODELS("UrInsModRptModels"),
    @XmlEnumValue("UrViewRptModels")
    UR_VIEW_RPT_MODELS("UrViewRptModels");
    private final String value;

    UserRights(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserRights fromValue(String v) {
        for (UserRights c: UserRights.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
