
package org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.siav_classification_entities.ConservationType;
import org.datacontract.schemas._2004._07.siav_classification_entities_common.CustomDateTimeNullable;
import org.datacontract.schemas._2004._07.siav_classification_entities_common.DocumentIdentifier;
import org.datacontract.schemas._2004._07.siav_common_baseclass.TypeIdentifierComplete;


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
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="Reserved_Vis" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Sorting" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Types}ConservationType" minOccurs="0"/>
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
@XmlType(name = "FascicoloEntity", propOrder = {
    "closeData",
    "currentDiscardYears",
    "description",
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
public class FascicoloEntity
    extends BaseFascicolo
{

    @XmlElementRef(name = "CloseData", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", type = JAXBElement.class)
    protected JAXBElement<CustomDateTimeNullable> closeData;
    @XmlElement(name = "CurrentDiscardYears")
    protected Integer currentDiscardYears;
    @XmlElementRef(name = "Description", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", type = JAXBElement.class)
    protected JAXBElement<String> description;
    @XmlElement(name = "FascNumber")
    protected Integer fascNumber;
    @XmlElementRef(name = "FirstDocumentId", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", type = JAXBElement.class)
    protected JAXBElement<DocumentIdentifier> firstDocumentId;
    @XmlElement(name = "Has_Sons")
    protected Boolean hasSons;
    @XmlElement(name = "Instantiation_Process")
    protected Boolean instantiationProcess;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElementRef(name = "LastDocumentId", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", type = JAXBElement.class)
    protected JAXBElement<DocumentIdentifier> lastDocumentId;
    @XmlElement(name = "Level")
    protected Integer level;
    @XmlElementRef(name = "LocationName", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", type = JAXBElement.class)
    protected JAXBElement<String> locationName;
    @XmlElementRef(name = "Note", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", type = JAXBElement.class)
    protected JAXBElement<String> note;
    @XmlElement(name = "NumObjectInto")
    protected Integer numObjectInto;
    @XmlElementRef(name = "OpenData", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", type = JAXBElement.class)
    protected JAXBElement<CustomDateTimeNullable> openData;
    @XmlElement(name = "Reserved_Vis")
    protected Boolean reservedVis;
    @XmlElement(name = "Sorting")
    protected Integer sorting;
    @XmlElement(name = "Status")
    protected ConservationType status;
    @XmlElement(name = "StoreDiscardYears")
    protected Integer storeDiscardYears;
    @XmlElementRef(name = "Subject", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", type = JAXBElement.class)
    protected JAXBElement<String> subject;
    @XmlElementRef(name = "Thesaurus", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", type = JAXBElement.class)
    protected JAXBElement<String> thesaurus;
    @XmlElement(name = "UO_Assigned")
    protected Integer uoAssigned;
    @XmlElement(name = "UO_Manufacturer")
    protected Integer uoManufacturer;
    @XmlElementRef(name = "UO_ManufacturerDescription", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", type = JAXBElement.class)
    protected JAXBElement<String> uoManufacturerDescription;
    @XmlElement(name = "UO_Responsible")
    protected Integer uoResponsible;
    @XmlElement(name = "Unlimited_Conservation")
    protected Boolean unlimitedConservation;
    @XmlElementRef(name = "UserId_Resp", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", type = JAXBElement.class)
    protected JAXBElement<TypeIdentifierComplete> userIdResp;
    @XmlElement(name = "VisAll")
    protected Boolean visAll;
    @XmlElement(name = "YearBack")
    protected Integer yearBack;

    /**
     * Gets the value of the closeData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomDateTimeNullable }{@code >}
     *     
     */
    public JAXBElement<CustomDateTimeNullable> getCloseData() {
        return closeData;
    }

    /**
     * Sets the value of the closeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomDateTimeNullable }{@code >}
     *     
     */
    public void setCloseData(JAXBElement<CustomDateTimeNullable> value) {
        this.closeData = ((JAXBElement<CustomDateTimeNullable> ) value);
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = ((JAXBElement<String> ) value);
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
     *     {@link JAXBElement }{@code <}{@link DocumentIdentifier }{@code >}
     *     
     */
    public JAXBElement<DocumentIdentifier> getFirstDocumentId() {
        return firstDocumentId;
    }

    /**
     * Sets the value of the firstDocumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DocumentIdentifier }{@code >}
     *     
     */
    public void setFirstDocumentId(JAXBElement<DocumentIdentifier> value) {
        this.firstDocumentId = ((JAXBElement<DocumentIdentifier> ) value);
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
     *     {@link JAXBElement }{@code <}{@link DocumentIdentifier }{@code >}
     *     
     */
    public JAXBElement<DocumentIdentifier> getLastDocumentId() {
        return lastDocumentId;
    }

    /**
     * Sets the value of the lastDocumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DocumentIdentifier }{@code >}
     *     
     */
    public void setLastDocumentId(JAXBElement<DocumentIdentifier> value) {
        this.lastDocumentId = ((JAXBElement<DocumentIdentifier> ) value);
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationName(JAXBElement<String> value) {
        this.locationName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNote(JAXBElement<String> value) {
        this.note = ((JAXBElement<String> ) value);
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
     *     {@link JAXBElement }{@code <}{@link CustomDateTimeNullable }{@code >}
     *     
     */
    public JAXBElement<CustomDateTimeNullable> getOpenData() {
        return openData;
    }

    /**
     * Sets the value of the openData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomDateTimeNullable }{@code >}
     *     
     */
    public void setOpenData(JAXBElement<CustomDateTimeNullable> value) {
        this.openData = ((JAXBElement<CustomDateTimeNullable> ) value);
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubject(JAXBElement<String> value) {
        this.subject = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the thesaurus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getThesaurus() {
        return thesaurus;
    }

    /**
     * Sets the value of the thesaurus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setThesaurus(JAXBElement<String> value) {
        this.thesaurus = ((JAXBElement<String> ) value);
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUOManufacturerDescription() {
        return uoManufacturerDescription;
    }

    /**
     * Sets the value of the uoManufacturerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUOManufacturerDescription(JAXBElement<String> value) {
        this.uoManufacturerDescription = ((JAXBElement<String> ) value);
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
     *     {@link JAXBElement }{@code <}{@link TypeIdentifierComplete }{@code >}
     *     
     */
    public JAXBElement<TypeIdentifierComplete> getUserIdResp() {
        return userIdResp;
    }

    /**
     * Sets the value of the userIdResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TypeIdentifierComplete }{@code >}
     *     
     */
    public void setUserIdResp(JAXBElement<TypeIdentifierComplete> value) {
        this.userIdResp = ((JAXBElement<TypeIdentifierComplete> ) value);
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
