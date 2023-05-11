
package it.archiflow96.classification;

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
    InsertOptionsInput.class,
    ReadTitolarioItemCollSortedInput.class,
    ReadTitolarioTemplateInput.class,
    ReadFascicoloInput.class,
    GetFascicoloToPreserveInput.class,
    ReadBaseFascicoloInput.class,
    DeleteFascicoloInput.class,
    CheckInInput.class,
    IsCampoTipoFascicoloUsedInput.class,
    ReadBaseTitolarioItemCollInput.class,
    UpdateValidToDateTitolarioInput.class,
    CheckOutTitolarioItemInput.class,
    IsTitolarioItemUsedInput.class,
    InsertDifformitaInput.class,
    UpdateCampiTipoFascicoloInput.class,
    SetPrimaryFascicoloDocumentoInput.class,
    InsertClassificaDocumentoInput.class,
    InsertFascicoloVisibilityInput.class,
    ReadValoreCampiTipoFascicoloInput.class,
    UpdateTitolarioTemplateInput.class,
    ReadFascicoloNotesInput.class,
    ReadTipoFascicoloInput.class,
    CopyTipoFascicoloInput.class,
    UpdateStatusHierarchyInput.class,
    IsFascicoloInCurrentTitolarioInput.class,
    InsertClassificaDocCollInput.class,
    ReadTipoFascVisibilityInput.class,
    DeleteCampiTipoFascicoloValueInput.class,
    SearchFascicoloInput.class,
    ReadTitolarioItemBaseInput.class,
    SearchTitolarioItemsIdInput.class,
    SetPrimaryClassificaDocumentoInput.class,
    UpdateLegislaturaInput.class,
    ReadTipoDocDefaultTitolarioItemCollInput.class,
    ReadClassFascDocumentoInput.class,
    UpdateTitolarioItemInput.class,
    ReadLegislaturaInput.class,
    ReadBaseTitolarioItemCollSortedInput.class,
    InsertFascicoloInput.class,
    InsertLegislaturaInput.class,
    UpdatePreservedFascicoloInput.class,
    ReadTitolarioItemCollInput.class,
    InsertClassificaFascicoloInput.class,
    UpdateStatoFascicoloInput.class,
    DeleteTitolarioItemByPrimaryKeyInput.class,
    DeleteLegislaturaInput.class,
    IsFascicoloUsedInput.class,
    InsertFascicoloNoteInput.class,
    CopyTitolarioInput.class,
    GetTitolarioItemCodeInput.class,
    DeleteCheckOutTitolarioInput.class,
    InsertTitolarioInput.class,
    SearchTitolarioItemsClassifyInput.class,
    ReadOptionsInput.class,
    UpdateTitolarioInput.class,
    ReadBaseTitolarioInput.class,
    InsertTipoFascVisibilityInput.class,
    InsertTitolarioTemplateInput.class,
    ReadFascicoloVisibilityPrivacyInput.class,
    UpdateFascicoloInput.class,
    DeleteCheckOutInput.class,
    ReadFascicoloDocumentoInput.class,
    ReadDifformitaInput.class,
    InsertCampiTipoFascicoloInput.class,
    ReadFascicoloHierarchyInput.class,
    InsertTitolarioItemInput.class,
    DeleteCheckOutTitolarioItemInput.class,
    CheckOutInput.class,
    IsTipoFascicoloUsedInput.class,
    ReadTitolarioInput.class,
    InsertValoreCampiTipoFascicoloInput.class,
    CheckOutTitolarioInput.class,
    DeleteFascicoloDocumentoInput.class,
    GetTitolarioItemSonsInput.class,
    SearchBaseFascicoloInput.class,
    OpenFascicoloInput.class,
    DeleteClassificaDocumentoInput.class,
    CloseFascicoloInput.class,
    ReadTitolarioItemInput.class,
    ReadClassificaCodeCollInput.class,
    ReadFascicoloHistoryInput.class,
    ReadFascicoloVisibilityInput.class,
    IsTitolarioUsedInput.class,
    GetTitolarioSonsInput.class,
    IsTitolarioItemValidInput.class,
    DeleteTitolarioTemplateInput.class,
    DeleteTipoFascicoloInput.class,
    DeleteTitolarioInput.class,
    ReadCardsInFolderInput.class,
    ReadClassificaDocumentoInput.class,
    UpdateClassificaFascicoloInput.class,
    UpdateTipoFascicoloInput.class,
    UpdateValidToDateTitolarioItemInput.class,
    RecoveryFascicoloInput.class,
    UpdateStatusTitolarioInput.class,
    GetClassificheValideInput.class,
    DeleteAllFascicoliDelInput.class,
    InsertTipoFascicoloInput.class,
    SendFascicoloInput.class,
    UpdateTipoFascicoloStatusInput.class,
    DeleteTitolarioItemByTitolarioIdInput.class,
    InsertMultiClassificaDocCollInput.class,
    ReadCampiTipoFascicoloInput.class
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
