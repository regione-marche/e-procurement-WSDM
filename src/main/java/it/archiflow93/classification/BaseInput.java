
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionInfo" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Login.ValueObject}SessionInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseInput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities", propOrder = {
    "sessionInfo"
})
@XmlSeeAlso({
    ReadBaseTitolarioItemCollSortedInput.class,
    UpdateValidToDateTitolarioItemInput.class,
    ReadFascicoloVisibilityPrivacyInput.class,
    ReadFascicoloInput.class,
    GetTitolarioItemCodeInput.class,
    IsTipoFascicoloUsedInput.class,
    InsertCampiTipoFascicoloInput.class,
    DeleteCheckOutTitolarioInput.class,
    ReadTitolarioItemBaseInput.class,
    DeleteFascicoloDocumentoInput.class,
    InsertTipoFascVisibilityInput.class,
    DeleteCheckOutInput.class,
    CheckOutTitolarioInput.class,
    UpdateStatusTitolarioInput.class,
    SearchBaseFascicoloInput.class,
    SetPrimaryFascicoloDocumentoInput.class,
    ReadBaseTitolarioInput.class,
    UpdateStatoFascicoloInput.class,
    ReadTitolarioItemCollInput.class,
    InsertTitolarioInput.class,
    CopyTipoFascicoloInput.class,
    CheckOutTitolarioItemInput.class,
    InsertDifformitaInput.class,
    DeleteTitolarioItemByPrimaryKeyInput.class,
    ReadClassFascDocumentoInput.class,
    GetFascicoloToPreserveInput.class,
    UpdateTipoFascicoloInput.class,
    ReadTitolarioItemInput.class,
    ReadFascicoloVisibilityInput.class,
    InsertValoreCampiTipoFascicoloInput.class,
    ReadFascicoloHierarchyInput.class,
    ReadClassificaDocumentoInput.class,
    InsertTipoFascicoloInput.class,
    DeleteTitolarioItemByTitolarioIdInput.class,
    InsertFascicoloNoteInput.class,
    ReadBaseTitolarioItemCollInput.class,
    UpdateTipoFascicoloStatusInput.class,
    SearchTitolarioItemsIdInput.class,
    IsCampoTipoFascicoloUsedInput.class,
    DeleteAllFascicoliDelInput.class,
    ReadDifformitaInput.class,
    IsTitolarioItemValidInput.class,
    UpdateClassificaFascicoloInput.class,
    InsertClassificaDocCollInput.class,
    CheckOutInput.class,
    SearchTitolarioItemsClassifyInput.class,
    ReadBaseFascicoloInput.class,
    RecoveryFascicoloInput.class,
    InsertFascicoloVisibilityInput.class,
    ReadFascicoloNotesInput.class,
    DeleteCheckOutTitolarioItemInput.class,
    GetTitolarioItemSonsInput.class,
    ReadValoreCampiTipoFascicoloInput.class,
    GetClassificheValideInput.class,
    IsTitolarioItemUsedInput.class,
    ReadClassificaCodeCollInput.class,
    CloseFascicoloInput.class,
    ReadTipoFascVisibilityInput.class,
    InsertTitolarioItemInput.class,
    UpdateValidToDateTitolarioInput.class,
    DeleteTitolarioTemplateInput.class,
    InsertTitolarioTemplateInput.class,
    IsFascicoloInCurrentTitolarioInput.class,
    InsertMultiClassificaDocCollInput.class,
    SetPrimaryClassificaDocumentoInput.class,
    SendFascicoloInput.class,
    DeleteTitolarioInput.class,
    ReadTitolarioItemCollSortedInput.class,
    CheckInInput.class,
    ReadCampiTipoFascicoloInput.class,
    UpdateFascicoloInput.class,
    ReadFascicoloHistoryInput.class,
    SearchFascicoloInput.class,
    UpdateTitolarioTemplateInput.class,
    UpdateStatusHierarchyInput.class,
    ReadLegislaturaInput.class,
    ReadTitolarioInput.class,
    ReadTipoDocDefaultTitolarioItemCollInput.class,
    UpdateLegislaturaInput.class,
    InsertClassificaFascicoloInput.class,
    IsTitolarioUsedInput.class,
    ReadTipoFascicoloInput.class,
    DeleteTipoFascicoloInput.class,
    OpenFascicoloInput.class,
    InsertClassificaDocumentoInput.class,
    DeleteCampiTipoFascicoloValueInput.class,
    IsFascicoloUsedInput.class,
    ReadOptionsInput.class,
    ReadTitolarioTemplateInput.class,
    UpdateCampiTipoFascicoloInput.class,
    UpdatePreservedFascicoloInput.class,
    GetTitolarioSonsInput.class,
    CopyTitolarioInput.class,
    InsertLegislaturaInput.class,
    UpdateTitolarioItemInput.class,
    InsertFascicoloInput.class,
    DeleteFascicoloInput.class,
    UpdateTitolarioInput.class,
    InsertOptionsInput.class,
    DeleteClassificaDocumentoInput.class,
    ReadCardsInFolderInput.class,
    ReadFascicoloDocumentoInput.class,
    DeleteLegislaturaInput.class
})
public class BaseInput {

    @XmlElement(name = "SessionInfo", required = true, nillable = true)
    protected SessionInfo sessionInfo;

    /**
     * Gets the value of the sessionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SessionInfo }
     *     
     */
    public SessionInfo getSessionInfo() {
        return sessionInfo;
    }

    /**
     * Sets the value of the sessionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionInfo }
     *     
     */
    public void setSessionInfo(SessionInfo value) {
        this.sessionInfo = value;
    }

}
