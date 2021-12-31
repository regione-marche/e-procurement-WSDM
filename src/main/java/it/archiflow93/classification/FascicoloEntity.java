
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FascicoloEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FascicoloEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject}BaseFascicolo">
 *       &lt;sequence>
 *         &lt;element name="CloseData" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass}CustomDateTimeNullable" minOccurs="0"/>
 *         &lt;element name="CurrentDiscardYears" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DepositId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass}CustomDateTimeNullable" minOccurs="0"/>
 *         &lt;element name="FascNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FirstDocumentId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.Identifier}DocumentIdentifier" minOccurs="0"/>
 *         &lt;element name="Has_Sons" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Instantiation_Process" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastDocumentId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.Identifier}DocumentIdentifier" minOccurs="0"/>
 *         &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumObjectInto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OpenData" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass}CustomDateTimeNullable" minOccurs="0"/>
 *         &lt;element name="Preservation" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}PreservationStatus" minOccurs="0"/>
 *         &lt;element name="PreservationDate" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass}CustomDateTimeNullable" minOccurs="0"/>
 *         &lt;element name="Reserved_Vis" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Sorting" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}ConservationType" minOccurs="0"/>
 *         &lt;element name="StoreDiscardYears" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Thesaurus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UO_Assigned" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UO_Manufacturer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UO_ManufacturerDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UO_Responsible" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Unlimited_Conservation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserId_Resp" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}TypeIdentifierComplete" minOccurs="0"/>
 *         &lt;element name="VisAll" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="YearBack" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FascicoloEntity", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", propOrder = {
    "closeData",
    "currentDiscardYears",
    "depositId",
    "description",
    "expirationDate",
    "fascNumber",
    "firstDocumentId",
    "hasSons",
    "instantiationProcess",
    "isDeleted",
    "lastDocumentId",
    "level",
    "locationName",
    "note",
    "numObjectInto",
    "openData",
    "preservation",
    "preservationDate",
    "reservedVis",
    "sorting",
    "status",
    "storeDiscardYears",
    "subject",
    "thesaurus",
    "uoAssigned",
    "uoManufacturer",
    "uoManufacturerDescription",
    "uoResponsible",
    "unlimitedConservation",
    "userIdResp",
    "visAll",
    "yearBack"
})
@XmlSeeAlso({
    FascicoloPreservation.class
})
public class FascicoloEntity
    extends BaseFascicolo
{

    @XmlElement(name = "CloseData", nillable = true)
    protected CustomDateTimeNullable closeData;
    @XmlElement(name = "CurrentDiscardYears")
    protected Integer currentDiscardYears;
    @XmlElement(name = "DepositId", nillable = true)
    protected String depositId;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "ExpirationDate", nillable = true)
    protected CustomDateTimeNullable expirationDate;
    @XmlElement(name = "FascNumber")
    protected Integer fascNumber;
    @XmlElement(name = "FirstDocumentId", nillable = true)
    protected DocumentIdentifier firstDocumentId;
    @XmlElement(name = "Has_Sons")
    protected Boolean hasSons;
    @XmlElement(name = "Instantiation_Process")
    protected Boolean instantiationProcess;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElement(name = "LastDocumentId", nillable = true)
    protected DocumentIdentifier lastDocumentId;
    @XmlElement(name = "Level")
    protected Integer level;
    @XmlElement(name = "LocationName", nillable = true)
    protected String locationName;
    @XmlElement(name = "Note", nillable = true)
    protected String note;
    @XmlElement(name = "NumObjectInto")
    protected Integer numObjectInto;
    @XmlElement(name = "OpenData", nillable = true)
    protected CustomDateTimeNullable openData;
    @XmlElement(name = "Preservation")
    protected PreservationStatus preservation;
    @XmlElement(name = "PreservationDate", nillable = true)
    protected CustomDateTimeNullable preservationDate;
    @XmlElement(name = "Reserved_Vis")
    protected Boolean reservedVis;
    @XmlElement(name = "Sorting")
    protected Integer sorting;
    @XmlElement(name = "Status")
    protected ConservationType status;
    @XmlElement(name = "StoreDiscardYears")
    protected Integer storeDiscardYears;
    @XmlElement(name = "Subject", nillable = true)
    protected String subject;
    @XmlElement(name = "Thesaurus", nillable = true)
    protected String thesaurus;
    @XmlElement(name = "UO_Assigned")
    protected Integer uoAssigned;
    @XmlElement(name = "UO_Manufacturer")
    protected Integer uoManufacturer;
    @XmlElement(name = "UO_ManufacturerDescription", nillable = true)
    protected String uoManufacturerDescription;
    @XmlElement(name = "UO_Responsible")
    protected Integer uoResponsible;
    @XmlElement(name = "Unlimited_Conservation")
    protected Boolean unlimitedConservation;
    @XmlElement(name = "UserId_Resp", nillable = true)
    protected TypeIdentifierComplete userIdResp;
    @XmlElement(name = "VisAll")
    protected Boolean visAll;
    @XmlElement(name = "YearBack")
    protected Integer yearBack;

    /**
     * Gets the value of the closeData property.
     * 
     * @return
     *     possible object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public CustomDateTimeNullable getCloseData() {
        return closeData;
    }

    /**
     * Sets the value of the closeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public void setCloseData(CustomDateTimeNullable value) {
        this.closeData = value;
    }

    /**
     * Gets the value of the currentDiscardYears property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentDiscardYears() {
        return currentDiscardYears;
    }

    /**
     * Sets the value of the currentDiscardYears property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentDiscardYears(Integer value) {
        this.currentDiscardYears = value;
    }

    /**
     * Gets the value of the depositId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositId() {
        return depositId;
    }

    /**
     * Sets the value of the depositId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositId(String value) {
        this.depositId = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public CustomDateTimeNullable getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public void setExpirationDate(CustomDateTimeNullable value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the fascNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFascNumber() {
        return fascNumber;
    }

    /**
     * Sets the value of the fascNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFascNumber(Integer value) {
        this.fascNumber = value;
    }

    /**
     * Gets the value of the firstDocumentId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentifier }
     *     
     */
    public DocumentIdentifier getFirstDocumentId() {
        return firstDocumentId;
    }

    /**
     * Sets the value of the firstDocumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentifier }
     *     
     */
    public void setFirstDocumentId(DocumentIdentifier value) {
        this.firstDocumentId = value;
    }

    /**
     * Gets the value of the hasSons property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasSons() {
        return hasSons;
    }

    /**
     * Sets the value of the hasSons property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasSons(Boolean value) {
        this.hasSons = value;
    }

    /**
     * Gets the value of the instantiationProcess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstantiationProcess() {
        return instantiationProcess;
    }

    /**
     * Sets the value of the instantiationProcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstantiationProcess(Boolean value) {
        this.instantiationProcess = value;
    }

    /**
     * Gets the value of the isDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeleted() {
        return isDeleted;
    }

    /**
     * Sets the value of the isDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeleted(Boolean value) {
        this.isDeleted = value;
    }

    /**
     * Gets the value of the lastDocumentId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentifier }
     *     
     */
    public DocumentIdentifier getLastDocumentId() {
        return lastDocumentId;
    }

    /**
     * Sets the value of the lastDocumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentifier }
     *     
     */
    public void setLastDocumentId(DocumentIdentifier value) {
        this.lastDocumentId = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLevel(Integer value) {
        this.level = value;
    }

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationName(String value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the numObjectInto property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumObjectInto() {
        return numObjectInto;
    }

    /**
     * Sets the value of the numObjectInto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumObjectInto(Integer value) {
        this.numObjectInto = value;
    }

    /**
     * Gets the value of the openData property.
     * 
     * @return
     *     possible object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public CustomDateTimeNullable getOpenData() {
        return openData;
    }

    /**
     * Sets the value of the openData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public void setOpenData(CustomDateTimeNullable value) {
        this.openData = value;
    }

    /**
     * Gets the value of the preservation property.
     * 
     * @return
     *     possible object is
     *     {@link PreservationStatus }
     *     
     */
    public PreservationStatus getPreservation() {
        return preservation;
    }

    /**
     * Sets the value of the preservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreservationStatus }
     *     
     */
    public void setPreservation(PreservationStatus value) {
        this.preservation = value;
    }

    /**
     * Gets the value of the preservationDate property.
     * 
     * @return
     *     possible object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public CustomDateTimeNullable getPreservationDate() {
        return preservationDate;
    }

    /**
     * Sets the value of the preservationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public void setPreservationDate(CustomDateTimeNullable value) {
        this.preservationDate = value;
    }

    /**
     * Gets the value of the reservedVis property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReservedVis() {
        return reservedVis;
    }

    /**
     * Sets the value of the reservedVis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReservedVis(Boolean value) {
        this.reservedVis = value;
    }

    /**
     * Gets the value of the sorting property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSorting() {
        return sorting;
    }

    /**
     * Sets the value of the sorting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSorting(Integer value) {
        this.sorting = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ConservationType }
     *     
     */
    public ConservationType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConservationType }
     *     
     */
    public void setStatus(ConservationType value) {
        this.status = value;
    }

    /**
     * Gets the value of the storeDiscardYears property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStoreDiscardYears() {
        return storeDiscardYears;
    }

    /**
     * Sets the value of the storeDiscardYears property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStoreDiscardYears(Integer value) {
        this.storeDiscardYears = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the thesaurus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThesaurus() {
        return thesaurus;
    }

    /**
     * Sets the value of the thesaurus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThesaurus(String value) {
        this.thesaurus = value;
    }

    /**
     * Gets the value of the uoAssigned property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUOAssigned() {
        return uoAssigned;
    }

    /**
     * Sets the value of the uoAssigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUOAssigned(Integer value) {
        this.uoAssigned = value;
    }

    /**
     * Gets the value of the uoManufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUOManufacturer() {
        return uoManufacturer;
    }

    /**
     * Sets the value of the uoManufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUOManufacturer(Integer value) {
        this.uoManufacturer = value;
    }

    /**
     * Gets the value of the uoManufacturerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUOManufacturerDescription() {
        return uoManufacturerDescription;
    }

    /**
     * Sets the value of the uoManufacturerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUOManufacturerDescription(String value) {
        this.uoManufacturerDescription = value;
    }

    /**
     * Gets the value of the uoResponsible property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUOResponsible() {
        return uoResponsible;
    }

    /**
     * Sets the value of the uoResponsible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUOResponsible(Integer value) {
        this.uoResponsible = value;
    }

    /**
     * Gets the value of the unlimitedConservation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnlimitedConservation() {
        return unlimitedConservation;
    }

    /**
     * Sets the value of the unlimitedConservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnlimitedConservation(Boolean value) {
        this.unlimitedConservation = value;
    }

    /**
     * Gets the value of the userIdResp property.
     * 
     * @return
     *     possible object is
     *     {@link TypeIdentifierComplete }
     *     
     */
    public TypeIdentifierComplete getUserIdResp() {
        return userIdResp;
    }

    /**
     * Sets the value of the userIdResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeIdentifierComplete }
     *     
     */
    public void setUserIdResp(TypeIdentifierComplete value) {
        this.userIdResp = value;
    }

    /**
     * Gets the value of the visAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisAll() {
        return visAll;
    }

    /**
     * Sets the value of the visAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisAll(Boolean value) {
        this.visAll = value;
    }

    /**
     * Gets the value of the yearBack property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYearBack() {
        return yearBack;
    }

    /**
     * Sets the value of the yearBack property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYearBack(Integer value) {
        this.yearBack = value;
    }

}
