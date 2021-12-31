
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgrafCardContactAddressInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgrafCardContactAddressInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardAddresses" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject}ArrayOfAgrafCardAddressInfo" minOccurs="0"/>
 *         &lt;element name="EntityId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="EntityType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}AgrafEntityType" minOccurs="0"/>
 *         &lt;element name="IsVisible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgrafCardContactAddressInfo", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject", propOrder = {
    "cardAddresses",
    "entityId",
    "entityType",
    "isVisible",
    "lastname",
    "name",
    "version"
})
public class AgrafCardContactAddressInfo {

    @XmlElement(name = "CardAddresses", nillable = true)
    protected ArrayOfAgrafCardAddressInfo cardAddresses;
    @XmlElement(name = "EntityId")
    protected String entityId;
    @XmlElement(name = "EntityType")
    protected AgrafEntityType entityType;
    @XmlElement(name = "IsVisible")
    protected Boolean isVisible;
    @XmlElement(name = "Lastname", nillable = true)
    protected String lastname;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Version")
    protected Integer version;

    /**
     * Gets the value of the cardAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAgrafCardAddressInfo }
     *     
     */
    public ArrayOfAgrafCardAddressInfo getCardAddresses() {
        return cardAddresses;
    }

    /**
     * Sets the value of the cardAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAgrafCardAddressInfo }
     *     
     */
    public void setCardAddresses(ArrayOfAgrafCardAddressInfo value) {
        this.cardAddresses = value;
    }

    /**
     * Gets the value of the entityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityId(String value) {
        this.entityId = value;
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link AgrafEntityType }
     *     
     */
    public AgrafEntityType getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgrafEntityType }
     *     
     */
    public void setEntityType(AgrafEntityType value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the isVisible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsVisible() {
        return isVisible;
    }

    /**
     * Sets the value of the isVisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsVisible(Boolean value) {
        this.isVisible = value;
    }

    /**
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname(String value) {
        this.lastname = value;
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
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVersion(Integer value) {
        this.version = value;
    }

}
