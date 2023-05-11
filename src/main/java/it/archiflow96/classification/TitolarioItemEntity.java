
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TitolarioItemEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TitolarioItemEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TitolarioItem.ValueObject}BaseTitolarioItem">
 *       &lt;sequence>
 *         &lt;element name="AggregationAdmittedList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="AutoCreateSeries" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CardDuration" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass}CustomIntNullable" minOccurs="0"/>
 *         &lt;element name="CardExpirationMethod" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}ExpirationMethodType" minOccurs="0"/>
 *         &lt;element name="CreateFolderThisLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CurrentDiscardYears" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EndValidationDate" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass}CustomDateTimeNullable" minOccurs="0"/>
 *         &lt;element name="ModifyDate" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass}CustomDateTimeNullable" minOccurs="0"/>
 *         &lt;element name="ObjectList" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject}ArrayOfOggettarioCfg" minOccurs="0"/>
 *         &lt;element name="StartValidationDate" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass}CustomDateTimeNullable" minOccurs="0"/>
 *         &lt;element name="StoreDiscardYears" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Thesaurus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TitolarioId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.Identifier}TitolarioIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TitolarioItemEntity", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TitolarioItem.ValueObject", propOrder = {
    "aggregationAdmittedList",
    "autoCreateSeries",
    "cardDuration",
    "cardExpirationMethod",
    "createFolderThisLevel",
    "creationDate",
    "currentDiscardYears",
    "endValidationDate",
    "modifyDate",
    "objectList",
    "startValidationDate",
    "storeDiscardYears",
    "thesaurus",
    "titolarioId"
})
public class TitolarioItemEntity
    extends BaseTitolarioItem
{

    @XmlElement(name = "AggregationAdmittedList", nillable = true)
    protected ArrayOfint aggregationAdmittedList;
    @XmlElement(name = "AutoCreateSeries")
    protected Boolean autoCreateSeries;
    @XmlElement(name = "CardDuration", nillable = true)
    protected CustomIntNullable cardDuration;
    @XmlElement(name = "CardExpirationMethod")
    protected ExpirationMethodType cardExpirationMethod;
    @XmlElement(name = "CreateFolderThisLevel")
    protected Integer createFolderThisLevel;
    @XmlElement(name = "CreationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "CurrentDiscardYears")
    protected Integer currentDiscardYears;
    @XmlElement(name = "EndValidationDate", nillable = true)
    protected CustomDateTimeNullable endValidationDate;
    @XmlElement(name = "ModifyDate", nillable = true)
    protected CustomDateTimeNullable modifyDate;
    @XmlElement(name = "ObjectList", nillable = true)
    protected ArrayOfOggettarioCfg objectList;
    @XmlElement(name = "StartValidationDate", nillable = true)
    protected CustomDateTimeNullable startValidationDate;
    @XmlElement(name = "StoreDiscardYears")
    protected Integer storeDiscardYears;
    @XmlElement(name = "Thesaurus", nillable = true)
    protected String thesaurus;
    @XmlElement(name = "TitolarioId", nillable = true)
    protected TitolarioIdentifier titolarioId;

    /**
     * Gets the value of the aggregationAdmittedList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getAggregationAdmittedList() {
        return aggregationAdmittedList;
    }

    /**
     * Sets the value of the aggregationAdmittedList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setAggregationAdmittedList(ArrayOfint value) {
        this.aggregationAdmittedList = value;
    }

    /**
     * Gets the value of the autoCreateSeries property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoCreateSeries() {
        return autoCreateSeries;
    }

    /**
     * Sets the value of the autoCreateSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoCreateSeries(Boolean value) {
        this.autoCreateSeries = value;
    }

    /**
     * Gets the value of the cardDuration property.
     * 
     * @return
     *     possible object is
     *     {@link CustomIntNullable }
     *     
     */
    public CustomIntNullable getCardDuration() {
        return cardDuration;
    }

    /**
     * Sets the value of the cardDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomIntNullable }
     *     
     */
    public void setCardDuration(CustomIntNullable value) {
        this.cardDuration = value;
    }

    /**
     * Gets the value of the cardExpirationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ExpirationMethodType }
     *     
     */
    public ExpirationMethodType getCardExpirationMethod() {
        return cardExpirationMethod;
    }

    /**
     * Sets the value of the cardExpirationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpirationMethodType }
     *     
     */
    public void setCardExpirationMethod(ExpirationMethodType value) {
        this.cardExpirationMethod = value;
    }

    /**
     * Gets the value of the createFolderThisLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreateFolderThisLevel() {
        return createFolderThisLevel;
    }

    /**
     * Sets the value of the createFolderThisLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreateFolderThisLevel(Integer value) {
        this.createFolderThisLevel = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
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
     * Gets the value of the endValidationDate property.
     * 
     * @return
     *     possible object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public CustomDateTimeNullable getEndValidationDate() {
        return endValidationDate;
    }

    /**
     * Sets the value of the endValidationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public void setEndValidationDate(CustomDateTimeNullable value) {
        this.endValidationDate = value;
    }

    /**
     * Gets the value of the modifyDate property.
     * 
     * @return
     *     possible object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public CustomDateTimeNullable getModifyDate() {
        return modifyDate;
    }

    /**
     * Sets the value of the modifyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public void setModifyDate(CustomDateTimeNullable value) {
        this.modifyDate = value;
    }

    /**
     * Gets the value of the objectList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOggettarioCfg }
     *     
     */
    public ArrayOfOggettarioCfg getObjectList() {
        return objectList;
    }

    /**
     * Sets the value of the objectList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOggettarioCfg }
     *     
     */
    public void setObjectList(ArrayOfOggettarioCfg value) {
        this.objectList = value;
    }

    /**
     * Gets the value of the startValidationDate property.
     * 
     * @return
     *     possible object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public CustomDateTimeNullable getStartValidationDate() {
        return startValidationDate;
    }

    /**
     * Sets the value of the startValidationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public void setStartValidationDate(CustomDateTimeNullable value) {
        this.startValidationDate = value;
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
     * Gets the value of the titolarioId property.
     * 
     * @return
     *     possible object is
     *     {@link TitolarioIdentifier }
     *     
     */
    public TitolarioIdentifier getTitolarioId() {
        return titolarioId;
    }

    /**
     * Sets the value of the titolarioId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitolarioIdentifier }
     *     
     */
    public void setTitolarioId(TitolarioIdentifier value) {
        this.titolarioId = value;
    }

}
