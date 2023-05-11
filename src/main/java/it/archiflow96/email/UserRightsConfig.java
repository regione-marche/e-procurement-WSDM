
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserRightsConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserRightsConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UrAggiornamentoListe" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrAggiungerePagine" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrAnnullareProtocollo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrBloccoDocumento" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrCambiaSubnet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrCambioClassFascicolo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrCambioStatoFasc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrCancellaFascicolo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrCancellaLista" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrCestinareFascicolo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrClassificare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrConfermareAnnulla" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrConfermareRipristino" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrCreaArmadiCassetti" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrCreaFascicoli" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrCreateCompliantCopies" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrCreateLinkFascArch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrDisDisconnInattivita" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrEliminareFascicolo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrEnableSnaAnonymous" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrEnableSnaComplete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrExport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrExportFascicolo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrFascicolare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrFascicolareArch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrFirmare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrGestRegProt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrGestioneAnagrafica" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrGestioneCartucce" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrGestioneFascicolo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrGestionePrenotazioni" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrGestioneTemplTit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrGestioneTipoFasc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrGestioneTitolario" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrGestioneUtenti" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrGestioneVoceTit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrGestireModScanbatch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrImportEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrImportGenerico" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrImportSpool" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrImpostaDocumenti" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrImpostaScadenza" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrInsModRecAnagrafica" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrInsModRptModels" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrInserimentoVuoti" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrInserire" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrInserireNoteFasc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrInvioMessaggi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrInvioOnLine" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrInvioPec" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrInvioTelematico" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrInvoiceAppRejMailing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrInvoiceChangeMonChannel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrInvoiceDataTransm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrInvoiceManualMailing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrInvoiceManualReMailing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrInvoicePlannedMailing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrManageSharedMailboxData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrManagementLog" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrMassiveSending" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrMettereInSmistamento" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrModificaAllegati" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrModificaAnnotazioni" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrModificaArchDoc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrModificaDati" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrModificaDatiFasc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrModificaImmagini" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrModificaProtocollo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrMovimentazioneFasc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrOcr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrOrderManagementNSO" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrPartialCancels" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrPermalink" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrPostaEstesa" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrPutInPreservation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrRicercare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrRicezioneTelematica" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrRispedire" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrSapPublish" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrScansione" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrSignature" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrSmistare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrSocialWorkflowCreate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrSpedisciFax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrStampaImgControllata" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrStampaImmagini" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrStampaRegistro" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrTasksCreate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrTasksManage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrTogliVisibilita" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrUndefined" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrUtilizzoGlifo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrVerificaRicevute" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrViewRptModels" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrVisibilitaSoloDoc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrVoceObsoleta" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrVuoto1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrVuoto2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserRightsConfig", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", propOrder = {
    "urAggiornamentoListe",
    "urAggiungerePagine",
    "urAnnullareProtocollo",
    "urBloccoDocumento",
    "urCambiaSubnet",
    "urCambioClassFascicolo",
    "urCambioStatoFasc",
    "urCancellaFascicolo",
    "urCancellaLista",
    "urCestinareFascicolo",
    "urClassificare",
    "urConfermareAnnulla",
    "urConfermareRipristino",
    "urCreaArmadiCassetti",
    "urCreaFascicoli",
    "urCreateCompliantCopies",
    "urCreateLinkFascArch",
    "urDisDisconnInattivita",
    "urEliminareFascicolo",
    "urEnableSnaAnonymous",
    "urEnableSnaComplete",
    "urExport",
    "urExportFascicolo",
    "urFascicolare",
    "urFascicolareArch",
    "urFirmare",
    "urGestRegProt",
    "urGestioneAnagrafica",
    "urGestioneCartucce",
    "urGestioneFascicolo",
    "urGestionePrenotazioni",
    "urGestioneTemplTit",
    "urGestioneTipoFasc",
    "urGestioneTitolario",
    "urGestioneUtenti",
    "urGestioneVoceTit",
    "urGestireModScanbatch",
    "urImportEmail",
    "urImportGenerico",
    "urImportSpool",
    "urImpostaDocumenti",
    "urImpostaScadenza",
    "urInsModRecAnagrafica",
    "urInsModRptModels",
    "urInserimentoVuoti",
    "urInserire",
    "urInserireNoteFasc",
    "urInvioMessaggi",
    "urInvioOnLine",
    "urInvioPec",
    "urInvioTelematico",
    "urInvoiceAppRejMailing",
    "urInvoiceChangeMonChannel",
    "urInvoiceDataTransm",
    "urInvoiceManualMailing",
    "urInvoiceManualReMailing",
    "urInvoicePlannedMailing",
    "urManageSharedMailboxData",
    "urManagementLog",
    "urMassiveSending",
    "urMettereInSmistamento",
    "urModificaAllegati",
    "urModificaAnnotazioni",
    "urModificaArchDoc",
    "urModificaDati",
    "urModificaDatiFasc",
    "urModificaImmagini",
    "urModificaProtocollo",
    "urMovimentazioneFasc",
    "urOcr",
    "urOrderManagementNSO",
    "urPartialCancels",
    "urPermalink",
    "urPostaEstesa",
    "urPutInPreservation",
    "urRicercare",
    "urRicezioneTelematica",
    "urRispedire",
    "urSapPublish",
    "urScansione",
    "urSignature",
    "urSmistare",
    "urSocialWorkflowCreate",
    "urSpedisciFax",
    "urStampaImgControllata",
    "urStampaImmagini",
    "urStampaRegistro",
    "urTasksCreate",
    "urTasksManage",
    "urTogliVisibilita",
    "urUndefined",
    "urUtilizzoGlifo",
    "urVerificaRicevute",
    "urViewRptModels",
    "urVisibilitaSoloDoc",
    "urVoceObsoleta",
    "urVuoto1",
    "urVuoto2"
})
public class UserRightsConfig {

    @XmlElement(name = "UrAggiornamentoListe")
    protected Boolean urAggiornamentoListe;
    @XmlElement(name = "UrAggiungerePagine")
    protected Boolean urAggiungerePagine;
    @XmlElement(name = "UrAnnullareProtocollo")
    protected Boolean urAnnullareProtocollo;
    @XmlElement(name = "UrBloccoDocumento")
    protected Boolean urBloccoDocumento;
    @XmlElement(name = "UrCambiaSubnet")
    protected Boolean urCambiaSubnet;
    @XmlElement(name = "UrCambioClassFascicolo")
    protected Boolean urCambioClassFascicolo;
    @XmlElement(name = "UrCambioStatoFasc")
    protected Boolean urCambioStatoFasc;
    @XmlElement(name = "UrCancellaFascicolo")
    protected Boolean urCancellaFascicolo;
    @XmlElement(name = "UrCancellaLista")
    protected Boolean urCancellaLista;
    @XmlElement(name = "UrCestinareFascicolo")
    protected Boolean urCestinareFascicolo;
    @XmlElement(name = "UrClassificare")
    protected Boolean urClassificare;
    @XmlElement(name = "UrConfermareAnnulla")
    protected Boolean urConfermareAnnulla;
    @XmlElement(name = "UrConfermareRipristino")
    protected Boolean urConfermareRipristino;
    @XmlElement(name = "UrCreaArmadiCassetti")
    protected Boolean urCreaArmadiCassetti;
    @XmlElement(name = "UrCreaFascicoli")
    protected Boolean urCreaFascicoli;
    @XmlElement(name = "UrCreateCompliantCopies")
    protected Boolean urCreateCompliantCopies;
    @XmlElement(name = "UrCreateLinkFascArch")
    protected Boolean urCreateLinkFascArch;
    @XmlElement(name = "UrDisDisconnInattivita")
    protected Boolean urDisDisconnInattivita;
    @XmlElement(name = "UrEliminareFascicolo")
    protected Boolean urEliminareFascicolo;
    @XmlElement(name = "UrEnableSnaAnonymous")
    protected Boolean urEnableSnaAnonymous;
    @XmlElement(name = "UrEnableSnaComplete")
    protected Boolean urEnableSnaComplete;
    @XmlElement(name = "UrExport")
    protected Boolean urExport;
    @XmlElement(name = "UrExportFascicolo")
    protected Boolean urExportFascicolo;
    @XmlElement(name = "UrFascicolare")
    protected Boolean urFascicolare;
    @XmlElement(name = "UrFascicolareArch")
    protected Boolean urFascicolareArch;
    @XmlElement(name = "UrFirmare")
    protected Boolean urFirmare;
    @XmlElement(name = "UrGestRegProt")
    protected Boolean urGestRegProt;
    @XmlElement(name = "UrGestioneAnagrafica")
    protected Boolean urGestioneAnagrafica;
    @XmlElement(name = "UrGestioneCartucce")
    protected Boolean urGestioneCartucce;
    @XmlElement(name = "UrGestioneFascicolo")
    protected Boolean urGestioneFascicolo;
    @XmlElement(name = "UrGestionePrenotazioni")
    protected Boolean urGestionePrenotazioni;
    @XmlElement(name = "UrGestioneTemplTit")
    protected Boolean urGestioneTemplTit;
    @XmlElement(name = "UrGestioneTipoFasc")
    protected Boolean urGestioneTipoFasc;
    @XmlElement(name = "UrGestioneTitolario")
    protected Boolean urGestioneTitolario;
    @XmlElement(name = "UrGestioneUtenti")
    protected Boolean urGestioneUtenti;
    @XmlElement(name = "UrGestioneVoceTit")
    protected Boolean urGestioneVoceTit;
    @XmlElement(name = "UrGestireModScanbatch")
    protected Boolean urGestireModScanbatch;
    @XmlElement(name = "UrImportEmail")
    protected Boolean urImportEmail;
    @XmlElement(name = "UrImportGenerico")
    protected Boolean urImportGenerico;
    @XmlElement(name = "UrImportSpool")
    protected Boolean urImportSpool;
    @XmlElement(name = "UrImpostaDocumenti")
    protected Boolean urImpostaDocumenti;
    @XmlElement(name = "UrImpostaScadenza")
    protected Boolean urImpostaScadenza;
    @XmlElement(name = "UrInsModRecAnagrafica")
    protected Boolean urInsModRecAnagrafica;
    @XmlElement(name = "UrInsModRptModels")
    protected Boolean urInsModRptModels;
    @XmlElement(name = "UrInserimentoVuoti")
    protected Boolean urInserimentoVuoti;
    @XmlElement(name = "UrInserire")
    protected Boolean urInserire;
    @XmlElement(name = "UrInserireNoteFasc")
    protected Boolean urInserireNoteFasc;
    @XmlElement(name = "UrInvioMessaggi")
    protected Boolean urInvioMessaggi;
    @XmlElement(name = "UrInvioOnLine")
    protected Boolean urInvioOnLine;
    @XmlElement(name = "UrInvioPec")
    protected Boolean urInvioPec;
    @XmlElement(name = "UrInvioTelematico")
    protected Boolean urInvioTelematico;
    @XmlElement(name = "UrInvoiceAppRejMailing")
    protected Boolean urInvoiceAppRejMailing;
    @XmlElement(name = "UrInvoiceChangeMonChannel")
    protected Boolean urInvoiceChangeMonChannel;
    @XmlElement(name = "UrInvoiceDataTransm")
    protected Boolean urInvoiceDataTransm;
    @XmlElement(name = "UrInvoiceManualMailing")
    protected Boolean urInvoiceManualMailing;
    @XmlElement(name = "UrInvoiceManualReMailing")
    protected Boolean urInvoiceManualReMailing;
    @XmlElement(name = "UrInvoicePlannedMailing")
    protected Boolean urInvoicePlannedMailing;
    @XmlElement(name = "UrManageSharedMailboxData")
    protected Boolean urManageSharedMailboxData;
    @XmlElement(name = "UrManagementLog")
    protected Boolean urManagementLog;
    @XmlElement(name = "UrMassiveSending")
    protected Boolean urMassiveSending;
    @XmlElement(name = "UrMettereInSmistamento")
    protected Boolean urMettereInSmistamento;
    @XmlElement(name = "UrModificaAllegati")
    protected Boolean urModificaAllegati;
    @XmlElement(name = "UrModificaAnnotazioni")
    protected Boolean urModificaAnnotazioni;
    @XmlElement(name = "UrModificaArchDoc")
    protected Boolean urModificaArchDoc;
    @XmlElement(name = "UrModificaDati")
    protected Boolean urModificaDati;
    @XmlElement(name = "UrModificaDatiFasc")
    protected Boolean urModificaDatiFasc;
    @XmlElement(name = "UrModificaImmagini")
    protected Boolean urModificaImmagini;
    @XmlElement(name = "UrModificaProtocollo")
    protected Boolean urModificaProtocollo;
    @XmlElement(name = "UrMovimentazioneFasc")
    protected Boolean urMovimentazioneFasc;
    @XmlElement(name = "UrOcr")
    protected Boolean urOcr;
    @XmlElement(name = "UrOrderManagementNSO")
    protected Boolean urOrderManagementNSO;
    @XmlElement(name = "UrPartialCancels")
    protected Boolean urPartialCancels;
    @XmlElement(name = "UrPermalink")
    protected Boolean urPermalink;
    @XmlElement(name = "UrPostaEstesa")
    protected Boolean urPostaEstesa;
    @XmlElement(name = "UrPutInPreservation")
    protected Boolean urPutInPreservation;
    @XmlElement(name = "UrRicercare")
    protected Boolean urRicercare;
    @XmlElement(name = "UrRicezioneTelematica")
    protected Boolean urRicezioneTelematica;
    @XmlElement(name = "UrRispedire")
    protected Boolean urRispedire;
    @XmlElement(name = "UrSapPublish")
    protected Boolean urSapPublish;
    @XmlElement(name = "UrScansione")
    protected Boolean urScansione;
    @XmlElement(name = "UrSignature")
    protected Boolean urSignature;
    @XmlElement(name = "UrSmistare")
    protected Boolean urSmistare;
    @XmlElement(name = "UrSocialWorkflowCreate")
    protected Boolean urSocialWorkflowCreate;
    @XmlElement(name = "UrSpedisciFax")
    protected Boolean urSpedisciFax;
    @XmlElement(name = "UrStampaImgControllata")
    protected Boolean urStampaImgControllata;
    @XmlElement(name = "UrStampaImmagini")
    protected Boolean urStampaImmagini;
    @XmlElement(name = "UrStampaRegistro")
    protected Boolean urStampaRegistro;
    @XmlElement(name = "UrTasksCreate")
    protected Boolean urTasksCreate;
    @XmlElement(name = "UrTasksManage")
    protected Boolean urTasksManage;
    @XmlElement(name = "UrTogliVisibilita")
    protected Boolean urTogliVisibilita;
    @XmlElement(name = "UrUndefined")
    protected Boolean urUndefined;
    @XmlElement(name = "UrUtilizzoGlifo")
    protected Boolean urUtilizzoGlifo;
    @XmlElement(name = "UrVerificaRicevute")
    protected Boolean urVerificaRicevute;
    @XmlElement(name = "UrViewRptModels")
    protected Boolean urViewRptModels;
    @XmlElement(name = "UrVisibilitaSoloDoc")
    protected Boolean urVisibilitaSoloDoc;
    @XmlElement(name = "UrVoceObsoleta")
    protected Boolean urVoceObsoleta;
    @XmlElement(name = "UrVuoto1")
    protected Boolean urVuoto1;
    @XmlElement(name = "UrVuoto2")
    protected Boolean urVuoto2;

    /**
     * Gets the value of the urAggiornamentoListe property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrAggiornamentoListe() {
        return urAggiornamentoListe;
    }

    /**
     * Sets the value of the urAggiornamentoListe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrAggiornamentoListe(Boolean value) {
        this.urAggiornamentoListe = value;
    }

    /**
     * Gets the value of the urAggiungerePagine property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrAggiungerePagine() {
        return urAggiungerePagine;
    }

    /**
     * Sets the value of the urAggiungerePagine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrAggiungerePagine(Boolean value) {
        this.urAggiungerePagine = value;
    }

    /**
     * Gets the value of the urAnnullareProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrAnnullareProtocollo() {
        return urAnnullareProtocollo;
    }

    /**
     * Sets the value of the urAnnullareProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrAnnullareProtocollo(Boolean value) {
        this.urAnnullareProtocollo = value;
    }

    /**
     * Gets the value of the urBloccoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrBloccoDocumento() {
        return urBloccoDocumento;
    }

    /**
     * Sets the value of the urBloccoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrBloccoDocumento(Boolean value) {
        this.urBloccoDocumento = value;
    }

    /**
     * Gets the value of the urCambiaSubnet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrCambiaSubnet() {
        return urCambiaSubnet;
    }

    /**
     * Sets the value of the urCambiaSubnet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrCambiaSubnet(Boolean value) {
        this.urCambiaSubnet = value;
    }

    /**
     * Gets the value of the urCambioClassFascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrCambioClassFascicolo() {
        return urCambioClassFascicolo;
    }

    /**
     * Sets the value of the urCambioClassFascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrCambioClassFascicolo(Boolean value) {
        this.urCambioClassFascicolo = value;
    }

    /**
     * Gets the value of the urCambioStatoFasc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrCambioStatoFasc() {
        return urCambioStatoFasc;
    }

    /**
     * Sets the value of the urCambioStatoFasc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrCambioStatoFasc(Boolean value) {
        this.urCambioStatoFasc = value;
    }

    /**
     * Gets the value of the urCancellaFascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrCancellaFascicolo() {
        return urCancellaFascicolo;
    }

    /**
     * Sets the value of the urCancellaFascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrCancellaFascicolo(Boolean value) {
        this.urCancellaFascicolo = value;
    }

    /**
     * Gets the value of the urCancellaLista property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrCancellaLista() {
        return urCancellaLista;
    }

    /**
     * Sets the value of the urCancellaLista property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrCancellaLista(Boolean value) {
        this.urCancellaLista = value;
    }

    /**
     * Gets the value of the urCestinareFascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrCestinareFascicolo() {
        return urCestinareFascicolo;
    }

    /**
     * Sets the value of the urCestinareFascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrCestinareFascicolo(Boolean value) {
        this.urCestinareFascicolo = value;
    }

    /**
     * Gets the value of the urClassificare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrClassificare() {
        return urClassificare;
    }

    /**
     * Sets the value of the urClassificare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrClassificare(Boolean value) {
        this.urClassificare = value;
    }

    /**
     * Gets the value of the urConfermareAnnulla property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrConfermareAnnulla() {
        return urConfermareAnnulla;
    }

    /**
     * Sets the value of the urConfermareAnnulla property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrConfermareAnnulla(Boolean value) {
        this.urConfermareAnnulla = value;
    }

    /**
     * Gets the value of the urConfermareRipristino property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrConfermareRipristino() {
        return urConfermareRipristino;
    }

    /**
     * Sets the value of the urConfermareRipristino property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrConfermareRipristino(Boolean value) {
        this.urConfermareRipristino = value;
    }

    /**
     * Gets the value of the urCreaArmadiCassetti property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrCreaArmadiCassetti() {
        return urCreaArmadiCassetti;
    }

    /**
     * Sets the value of the urCreaArmadiCassetti property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrCreaArmadiCassetti(Boolean value) {
        this.urCreaArmadiCassetti = value;
    }

    /**
     * Gets the value of the urCreaFascicoli property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrCreaFascicoli() {
        return urCreaFascicoli;
    }

    /**
     * Sets the value of the urCreaFascicoli property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrCreaFascicoli(Boolean value) {
        this.urCreaFascicoli = value;
    }

    /**
     * Gets the value of the urCreateCompliantCopies property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrCreateCompliantCopies() {
        return urCreateCompliantCopies;
    }

    /**
     * Sets the value of the urCreateCompliantCopies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrCreateCompliantCopies(Boolean value) {
        this.urCreateCompliantCopies = value;
    }

    /**
     * Gets the value of the urCreateLinkFascArch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrCreateLinkFascArch() {
        return urCreateLinkFascArch;
    }

    /**
     * Sets the value of the urCreateLinkFascArch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrCreateLinkFascArch(Boolean value) {
        this.urCreateLinkFascArch = value;
    }

    /**
     * Gets the value of the urDisDisconnInattivita property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrDisDisconnInattivita() {
        return urDisDisconnInattivita;
    }

    /**
     * Sets the value of the urDisDisconnInattivita property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrDisDisconnInattivita(Boolean value) {
        this.urDisDisconnInattivita = value;
    }

    /**
     * Gets the value of the urEliminareFascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrEliminareFascicolo() {
        return urEliminareFascicolo;
    }

    /**
     * Sets the value of the urEliminareFascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrEliminareFascicolo(Boolean value) {
        this.urEliminareFascicolo = value;
    }

    /**
     * Gets the value of the urEnableSnaAnonymous property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrEnableSnaAnonymous() {
        return urEnableSnaAnonymous;
    }

    /**
     * Sets the value of the urEnableSnaAnonymous property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrEnableSnaAnonymous(Boolean value) {
        this.urEnableSnaAnonymous = value;
    }

    /**
     * Gets the value of the urEnableSnaComplete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrEnableSnaComplete() {
        return urEnableSnaComplete;
    }

    /**
     * Sets the value of the urEnableSnaComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrEnableSnaComplete(Boolean value) {
        this.urEnableSnaComplete = value;
    }

    /**
     * Gets the value of the urExport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrExport() {
        return urExport;
    }

    /**
     * Sets the value of the urExport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrExport(Boolean value) {
        this.urExport = value;
    }

    /**
     * Gets the value of the urExportFascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrExportFascicolo() {
        return urExportFascicolo;
    }

    /**
     * Sets the value of the urExportFascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrExportFascicolo(Boolean value) {
        this.urExportFascicolo = value;
    }

    /**
     * Gets the value of the urFascicolare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrFascicolare() {
        return urFascicolare;
    }

    /**
     * Sets the value of the urFascicolare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrFascicolare(Boolean value) {
        this.urFascicolare = value;
    }

    /**
     * Gets the value of the urFascicolareArch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrFascicolareArch() {
        return urFascicolareArch;
    }

    /**
     * Sets the value of the urFascicolareArch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrFascicolareArch(Boolean value) {
        this.urFascicolareArch = value;
    }

    /**
     * Gets the value of the urFirmare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrFirmare() {
        return urFirmare;
    }

    /**
     * Sets the value of the urFirmare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrFirmare(Boolean value) {
        this.urFirmare = value;
    }

    /**
     * Gets the value of the urGestRegProt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrGestRegProt() {
        return urGestRegProt;
    }

    /**
     * Sets the value of the urGestRegProt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrGestRegProt(Boolean value) {
        this.urGestRegProt = value;
    }

    /**
     * Gets the value of the urGestioneAnagrafica property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrGestioneAnagrafica() {
        return urGestioneAnagrafica;
    }

    /**
     * Sets the value of the urGestioneAnagrafica property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrGestioneAnagrafica(Boolean value) {
        this.urGestioneAnagrafica = value;
    }

    /**
     * Gets the value of the urGestioneCartucce property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrGestioneCartucce() {
        return urGestioneCartucce;
    }

    /**
     * Sets the value of the urGestioneCartucce property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrGestioneCartucce(Boolean value) {
        this.urGestioneCartucce = value;
    }

    /**
     * Gets the value of the urGestioneFascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrGestioneFascicolo() {
        return urGestioneFascicolo;
    }

    /**
     * Sets the value of the urGestioneFascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrGestioneFascicolo(Boolean value) {
        this.urGestioneFascicolo = value;
    }

    /**
     * Gets the value of the urGestionePrenotazioni property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrGestionePrenotazioni() {
        return urGestionePrenotazioni;
    }

    /**
     * Sets the value of the urGestionePrenotazioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrGestionePrenotazioni(Boolean value) {
        this.urGestionePrenotazioni = value;
    }

    /**
     * Gets the value of the urGestioneTemplTit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrGestioneTemplTit() {
        return urGestioneTemplTit;
    }

    /**
     * Sets the value of the urGestioneTemplTit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrGestioneTemplTit(Boolean value) {
        this.urGestioneTemplTit = value;
    }

    /**
     * Gets the value of the urGestioneTipoFasc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrGestioneTipoFasc() {
        return urGestioneTipoFasc;
    }

    /**
     * Sets the value of the urGestioneTipoFasc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrGestioneTipoFasc(Boolean value) {
        this.urGestioneTipoFasc = value;
    }

    /**
     * Gets the value of the urGestioneTitolario property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrGestioneTitolario() {
        return urGestioneTitolario;
    }

    /**
     * Sets the value of the urGestioneTitolario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrGestioneTitolario(Boolean value) {
        this.urGestioneTitolario = value;
    }

    /**
     * Gets the value of the urGestioneUtenti property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrGestioneUtenti() {
        return urGestioneUtenti;
    }

    /**
     * Sets the value of the urGestioneUtenti property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrGestioneUtenti(Boolean value) {
        this.urGestioneUtenti = value;
    }

    /**
     * Gets the value of the urGestioneVoceTit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrGestioneVoceTit() {
        return urGestioneVoceTit;
    }

    /**
     * Sets the value of the urGestioneVoceTit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrGestioneVoceTit(Boolean value) {
        this.urGestioneVoceTit = value;
    }

    /**
     * Gets the value of the urGestireModScanbatch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrGestireModScanbatch() {
        return urGestireModScanbatch;
    }

    /**
     * Sets the value of the urGestireModScanbatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrGestireModScanbatch(Boolean value) {
        this.urGestireModScanbatch = value;
    }

    /**
     * Gets the value of the urImportEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrImportEmail() {
        return urImportEmail;
    }

    /**
     * Sets the value of the urImportEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrImportEmail(Boolean value) {
        this.urImportEmail = value;
    }

    /**
     * Gets the value of the urImportGenerico property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrImportGenerico() {
        return urImportGenerico;
    }

    /**
     * Sets the value of the urImportGenerico property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrImportGenerico(Boolean value) {
        this.urImportGenerico = value;
    }

    /**
     * Gets the value of the urImportSpool property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrImportSpool() {
        return urImportSpool;
    }

    /**
     * Sets the value of the urImportSpool property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrImportSpool(Boolean value) {
        this.urImportSpool = value;
    }

    /**
     * Gets the value of the urImpostaDocumenti property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrImpostaDocumenti() {
        return urImpostaDocumenti;
    }

    /**
     * Sets the value of the urImpostaDocumenti property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrImpostaDocumenti(Boolean value) {
        this.urImpostaDocumenti = value;
    }

    /**
     * Gets the value of the urImpostaScadenza property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrImpostaScadenza() {
        return urImpostaScadenza;
    }

    /**
     * Sets the value of the urImpostaScadenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrImpostaScadenza(Boolean value) {
        this.urImpostaScadenza = value;
    }

    /**
     * Gets the value of the urInsModRecAnagrafica property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrInsModRecAnagrafica() {
        return urInsModRecAnagrafica;
    }

    /**
     * Sets the value of the urInsModRecAnagrafica property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrInsModRecAnagrafica(Boolean value) {
        this.urInsModRecAnagrafica = value;
    }

    /**
     * Gets the value of the urInsModRptModels property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrInsModRptModels() {
        return urInsModRptModels;
    }

    /**
     * Sets the value of the urInsModRptModels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrInsModRptModels(Boolean value) {
        this.urInsModRptModels = value;
    }

    /**
     * Gets the value of the urInserimentoVuoti property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrInserimentoVuoti() {
        return urInserimentoVuoti;
    }

    /**
     * Sets the value of the urInserimentoVuoti property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrInserimentoVuoti(Boolean value) {
        this.urInserimentoVuoti = value;
    }

    /**
     * Gets the value of the urInserire property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrInserire() {
        return urInserire;
    }

    /**
     * Sets the value of the urInserire property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrInserire(Boolean value) {
        this.urInserire = value;
    }

    /**
     * Gets the value of the urInserireNoteFasc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrInserireNoteFasc() {
        return urInserireNoteFasc;
    }

    /**
     * Sets the value of the urInserireNoteFasc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrInserireNoteFasc(Boolean value) {
        this.urInserireNoteFasc = value;
    }

    /**
     * Gets the value of the urInvioMessaggi property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrInvioMessaggi() {
        return urInvioMessaggi;
    }

    /**
     * Sets the value of the urInvioMessaggi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrInvioMessaggi(Boolean value) {
        this.urInvioMessaggi = value;
    }

    /**
     * Gets the value of the urInvioOnLine property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrInvioOnLine() {
        return urInvioOnLine;
    }

    /**
     * Sets the value of the urInvioOnLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrInvioOnLine(Boolean value) {
        this.urInvioOnLine = value;
    }

    /**
     * Gets the value of the urInvioPec property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrInvioPec() {
        return urInvioPec;
    }

    /**
     * Sets the value of the urInvioPec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrInvioPec(Boolean value) {
        this.urInvioPec = value;
    }

    /**
     * Gets the value of the urInvioTelematico property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrInvioTelematico() {
        return urInvioTelematico;
    }

    /**
     * Sets the value of the urInvioTelematico property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrInvioTelematico(Boolean value) {
        this.urInvioTelematico = value;
    }

    /**
     * Gets the value of the urInvoiceAppRejMailing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrInvoiceAppRejMailing() {
        return urInvoiceAppRejMailing;
    }

    /**
     * Sets the value of the urInvoiceAppRejMailing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrInvoiceAppRejMailing(Boolean value) {
        this.urInvoiceAppRejMailing = value;
    }

    /**
     * Gets the value of the urInvoiceChangeMonChannel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrInvoiceChangeMonChannel() {
        return urInvoiceChangeMonChannel;
    }

    /**
     * Sets the value of the urInvoiceChangeMonChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrInvoiceChangeMonChannel(Boolean value) {
        this.urInvoiceChangeMonChannel = value;
    }

    /**
     * Gets the value of the urInvoiceDataTransm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrInvoiceDataTransm() {
        return urInvoiceDataTransm;
    }

    /**
     * Sets the value of the urInvoiceDataTransm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrInvoiceDataTransm(Boolean value) {
        this.urInvoiceDataTransm = value;
    }

    /**
     * Gets the value of the urInvoiceManualMailing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrInvoiceManualMailing() {
        return urInvoiceManualMailing;
    }

    /**
     * Sets the value of the urInvoiceManualMailing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrInvoiceManualMailing(Boolean value) {
        this.urInvoiceManualMailing = value;
    }

    /**
     * Gets the value of the urInvoiceManualReMailing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrInvoiceManualReMailing() {
        return urInvoiceManualReMailing;
    }

    /**
     * Sets the value of the urInvoiceManualReMailing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrInvoiceManualReMailing(Boolean value) {
        this.urInvoiceManualReMailing = value;
    }

    /**
     * Gets the value of the urInvoicePlannedMailing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrInvoicePlannedMailing() {
        return urInvoicePlannedMailing;
    }

    /**
     * Sets the value of the urInvoicePlannedMailing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrInvoicePlannedMailing(Boolean value) {
        this.urInvoicePlannedMailing = value;
    }

    /**
     * Gets the value of the urManageSharedMailboxData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrManageSharedMailboxData() {
        return urManageSharedMailboxData;
    }

    /**
     * Sets the value of the urManageSharedMailboxData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrManageSharedMailboxData(Boolean value) {
        this.urManageSharedMailboxData = value;
    }

    /**
     * Gets the value of the urManagementLog property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrManagementLog() {
        return urManagementLog;
    }

    /**
     * Sets the value of the urManagementLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrManagementLog(Boolean value) {
        this.urManagementLog = value;
    }

    /**
     * Gets the value of the urMassiveSending property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrMassiveSending() {
        return urMassiveSending;
    }

    /**
     * Sets the value of the urMassiveSending property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrMassiveSending(Boolean value) {
        this.urMassiveSending = value;
    }

    /**
     * Gets the value of the urMettereInSmistamento property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrMettereInSmistamento() {
        return urMettereInSmistamento;
    }

    /**
     * Sets the value of the urMettereInSmistamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrMettereInSmistamento(Boolean value) {
        this.urMettereInSmistamento = value;
    }

    /**
     * Gets the value of the urModificaAllegati property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrModificaAllegati() {
        return urModificaAllegati;
    }

    /**
     * Sets the value of the urModificaAllegati property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrModificaAllegati(Boolean value) {
        this.urModificaAllegati = value;
    }

    /**
     * Gets the value of the urModificaAnnotazioni property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrModificaAnnotazioni() {
        return urModificaAnnotazioni;
    }

    /**
     * Sets the value of the urModificaAnnotazioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrModificaAnnotazioni(Boolean value) {
        this.urModificaAnnotazioni = value;
    }

    /**
     * Gets the value of the urModificaArchDoc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrModificaArchDoc() {
        return urModificaArchDoc;
    }

    /**
     * Sets the value of the urModificaArchDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrModificaArchDoc(Boolean value) {
        this.urModificaArchDoc = value;
    }

    /**
     * Gets the value of the urModificaDati property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrModificaDati() {
        return urModificaDati;
    }

    /**
     * Sets the value of the urModificaDati property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrModificaDati(Boolean value) {
        this.urModificaDati = value;
    }

    /**
     * Gets the value of the urModificaDatiFasc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrModificaDatiFasc() {
        return urModificaDatiFasc;
    }

    /**
     * Sets the value of the urModificaDatiFasc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrModificaDatiFasc(Boolean value) {
        this.urModificaDatiFasc = value;
    }

    /**
     * Gets the value of the urModificaImmagini property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrModificaImmagini() {
        return urModificaImmagini;
    }

    /**
     * Sets the value of the urModificaImmagini property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrModificaImmagini(Boolean value) {
        this.urModificaImmagini = value;
    }

    /**
     * Gets the value of the urModificaProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrModificaProtocollo() {
        return urModificaProtocollo;
    }

    /**
     * Sets the value of the urModificaProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrModificaProtocollo(Boolean value) {
        this.urModificaProtocollo = value;
    }

    /**
     * Gets the value of the urMovimentazioneFasc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrMovimentazioneFasc() {
        return urMovimentazioneFasc;
    }

    /**
     * Sets the value of the urMovimentazioneFasc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrMovimentazioneFasc(Boolean value) {
        this.urMovimentazioneFasc = value;
    }

    /**
     * Gets the value of the urOcr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrOcr() {
        return urOcr;
    }

    /**
     * Sets the value of the urOcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrOcr(Boolean value) {
        this.urOcr = value;
    }

    /**
     * Gets the value of the urOrderManagementNSO property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrOrderManagementNSO() {
        return urOrderManagementNSO;
    }

    /**
     * Sets the value of the urOrderManagementNSO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrOrderManagementNSO(Boolean value) {
        this.urOrderManagementNSO = value;
    }

    /**
     * Gets the value of the urPartialCancels property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrPartialCancels() {
        return urPartialCancels;
    }

    /**
     * Sets the value of the urPartialCancels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrPartialCancels(Boolean value) {
        this.urPartialCancels = value;
    }

    /**
     * Gets the value of the urPermalink property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrPermalink() {
        return urPermalink;
    }

    /**
     * Sets the value of the urPermalink property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrPermalink(Boolean value) {
        this.urPermalink = value;
    }

    /**
     * Gets the value of the urPostaEstesa property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrPostaEstesa() {
        return urPostaEstesa;
    }

    /**
     * Sets the value of the urPostaEstesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrPostaEstesa(Boolean value) {
        this.urPostaEstesa = value;
    }

    /**
     * Gets the value of the urPutInPreservation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrPutInPreservation() {
        return urPutInPreservation;
    }

    /**
     * Sets the value of the urPutInPreservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrPutInPreservation(Boolean value) {
        this.urPutInPreservation = value;
    }

    /**
     * Gets the value of the urRicercare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrRicercare() {
        return urRicercare;
    }

    /**
     * Sets the value of the urRicercare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrRicercare(Boolean value) {
        this.urRicercare = value;
    }

    /**
     * Gets the value of the urRicezioneTelematica property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrRicezioneTelematica() {
        return urRicezioneTelematica;
    }

    /**
     * Sets the value of the urRicezioneTelematica property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrRicezioneTelematica(Boolean value) {
        this.urRicezioneTelematica = value;
    }

    /**
     * Gets the value of the urRispedire property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrRispedire() {
        return urRispedire;
    }

    /**
     * Sets the value of the urRispedire property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrRispedire(Boolean value) {
        this.urRispedire = value;
    }

    /**
     * Gets the value of the urSapPublish property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrSapPublish() {
        return urSapPublish;
    }

    /**
     * Sets the value of the urSapPublish property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrSapPublish(Boolean value) {
        this.urSapPublish = value;
    }

    /**
     * Gets the value of the urScansione property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrScansione() {
        return urScansione;
    }

    /**
     * Sets the value of the urScansione property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrScansione(Boolean value) {
        this.urScansione = value;
    }

    /**
     * Gets the value of the urSignature property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrSignature() {
        return urSignature;
    }

    /**
     * Sets the value of the urSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrSignature(Boolean value) {
        this.urSignature = value;
    }

    /**
     * Gets the value of the urSmistare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrSmistare() {
        return urSmistare;
    }

    /**
     * Sets the value of the urSmistare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrSmistare(Boolean value) {
        this.urSmistare = value;
    }

    /**
     * Gets the value of the urSocialWorkflowCreate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrSocialWorkflowCreate() {
        return urSocialWorkflowCreate;
    }

    /**
     * Sets the value of the urSocialWorkflowCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrSocialWorkflowCreate(Boolean value) {
        this.urSocialWorkflowCreate = value;
    }

    /**
     * Gets the value of the urSpedisciFax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrSpedisciFax() {
        return urSpedisciFax;
    }

    /**
     * Sets the value of the urSpedisciFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrSpedisciFax(Boolean value) {
        this.urSpedisciFax = value;
    }

    /**
     * Gets the value of the urStampaImgControllata property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrStampaImgControllata() {
        return urStampaImgControllata;
    }

    /**
     * Sets the value of the urStampaImgControllata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrStampaImgControllata(Boolean value) {
        this.urStampaImgControllata = value;
    }

    /**
     * Gets the value of the urStampaImmagini property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrStampaImmagini() {
        return urStampaImmagini;
    }

    /**
     * Sets the value of the urStampaImmagini property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrStampaImmagini(Boolean value) {
        this.urStampaImmagini = value;
    }

    /**
     * Gets the value of the urStampaRegistro property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrStampaRegistro() {
        return urStampaRegistro;
    }

    /**
     * Sets the value of the urStampaRegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrStampaRegistro(Boolean value) {
        this.urStampaRegistro = value;
    }

    /**
     * Gets the value of the urTasksCreate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrTasksCreate() {
        return urTasksCreate;
    }

    /**
     * Sets the value of the urTasksCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrTasksCreate(Boolean value) {
        this.urTasksCreate = value;
    }

    /**
     * Gets the value of the urTasksManage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrTasksManage() {
        return urTasksManage;
    }

    /**
     * Sets the value of the urTasksManage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrTasksManage(Boolean value) {
        this.urTasksManage = value;
    }

    /**
     * Gets the value of the urTogliVisibilita property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrTogliVisibilita() {
        return urTogliVisibilita;
    }

    /**
     * Sets the value of the urTogliVisibilita property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrTogliVisibilita(Boolean value) {
        this.urTogliVisibilita = value;
    }

    /**
     * Gets the value of the urUndefined property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrUndefined() {
        return urUndefined;
    }

    /**
     * Sets the value of the urUndefined property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrUndefined(Boolean value) {
        this.urUndefined = value;
    }

    /**
     * Gets the value of the urUtilizzoGlifo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrUtilizzoGlifo() {
        return urUtilizzoGlifo;
    }

    /**
     * Sets the value of the urUtilizzoGlifo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrUtilizzoGlifo(Boolean value) {
        this.urUtilizzoGlifo = value;
    }

    /**
     * Gets the value of the urVerificaRicevute property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrVerificaRicevute() {
        return urVerificaRicevute;
    }

    /**
     * Sets the value of the urVerificaRicevute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrVerificaRicevute(Boolean value) {
        this.urVerificaRicevute = value;
    }

    /**
     * Gets the value of the urViewRptModels property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrViewRptModels() {
        return urViewRptModels;
    }

    /**
     * Sets the value of the urViewRptModels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrViewRptModels(Boolean value) {
        this.urViewRptModels = value;
    }

    /**
     * Gets the value of the urVisibilitaSoloDoc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrVisibilitaSoloDoc() {
        return urVisibilitaSoloDoc;
    }

    /**
     * Sets the value of the urVisibilitaSoloDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrVisibilitaSoloDoc(Boolean value) {
        this.urVisibilitaSoloDoc = value;
    }

    /**
     * Gets the value of the urVoceObsoleta property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrVoceObsoleta() {
        return urVoceObsoleta;
    }

    /**
     * Sets the value of the urVoceObsoleta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrVoceObsoleta(Boolean value) {
        this.urVoceObsoleta = value;
    }

    /**
     * Gets the value of the urVuoto1 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrVuoto1() {
        return urVuoto1;
    }

    /**
     * Sets the value of the urVuoto1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrVuoto1(Boolean value) {
        this.urVuoto1 = value;
    }

    /**
     * Gets the value of the urVuoto2 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrVuoto2() {
        return urVuoto2;
    }

    /**
     * Sets the value of the urVuoto2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrVuoto2(Boolean value) {
        this.urVuoto2 = value;
    }

}
