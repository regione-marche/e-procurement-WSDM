
package it.archiflow93;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgrafCardContact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgrafCardContact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntityId" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject}AgrafCardContactId" minOccurs="0"/>
 *         &lt;element name="GuidCard" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsUserSelected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MainAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MainEMailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MainPecAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MainPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VatId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgrafCardContact", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject", propOrder = {
    "description",
    "entityId",
    "guidCard",
    "id",
    "isUserSelected",
    "lastName",
    "mainAddress",
    "mainEMailAddress",
    "mainPecAddress",
    "mainPhoneNumber",
    "name",
    "taxId",
    "vatId"
})
public class AgrafCardContact {

    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "EntityId", nillable = true)
    protected AgrafCardContactId entityId;
    @XmlElement(name = "GuidCard")
    protected String guidCard;
    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElement(name = "IsUserSelected")
    protected Boolean isUserSelected;
    @XmlElement(name = "LastName", nillable = true)
    protected String lastName;
    @XmlElement(name = "MainAddress", nillable = true)
    protected String mainAddress;
    @XmlElement(name = "MainEMailAddress", nillable = true)
    protected String mainEMailAddress;
    @XmlElement(name = "MainPecAddress", nillable = true)
    protected String mainPecAddress;
    @XmlElement(name = "MainPhoneNumber", nillable = true)
    protected String mainPhoneNumber;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "TaxId", nillable = true)
    protected String taxId;
    @XmlElement(name = "VatId", nillable = true)
    protected String vatId;

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
     * Gets the value of the entityId property.
     * 
     * @return
     *     possible object is
     *     {@link AgrafCardContactId }
     *     
     */
    public AgrafCardContactId getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgrafCardContactId }
     *     
     */
    public void setEntityId(AgrafCardContactId value) {
        this.entityId = value;
    }

    /**
     * Gets the value of the guidCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuidCard() {
        return guidCard;
    }

    /**
     * Sets the value of the guidCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuidCard(String value) {
        this.guidCard = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the isUserSelected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUserSelected() {
        return isUserSelected;
    }

    /**
     * Sets the value of the isUserSelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUserSelected(Boolean value) {
        this.isUserSelected = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the mainAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainAddress() {
        return mainAddress;
    }

    /**
     * Sets the value of the mainAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainAddress(String value) {
        this.mainAddress = value;
    }

    /**
     * Gets the value of the mainEMailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainEMailAddress() {
        return mainEMailAddress;
    }

    /**
     * Sets the value of the mainEMailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainEMailAddress(String value) {
        this.mainEMailAddress = value;
    }

    /**
     * Gets the value of the mainPecAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainPecAddress() {
        return mainPecAddress;
    }

    /**
     * Sets the value of the mainPecAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainPecAddress(String value) {
        this.mainPecAddress = value;
    }

    /**
     * Gets the value of the mainPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainPhoneNumber() {
        return mainPhoneNumber;
    }

    /**
     * Sets the value of the mainPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainPhoneNumber(String value) {
        this.mainPhoneNumber = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the taxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxId() {
        return taxId;
    }

    /**
     * Sets the value of the taxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxId(String value) {
        this.taxId = value;
    }

    /**
     * Gets the value of the vatId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatId() {
        return vatId;
    }

    /**
     * Sets the value of the vatId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatId(String value) {
        this.vatId = value;
    }

}
