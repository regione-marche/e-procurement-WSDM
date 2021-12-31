
package it.archiflow93;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgrafCardTagAddressInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgrafCardTagAddressInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardContacts" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject}ArrayOfAgrafCardContactAddressInfo" minOccurs="0"/>
 *         &lt;element name="GuidCard" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="TagId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TagName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgrafCardTagAddressInfo", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject", propOrder = {
    "cardContacts",
    "guidCard",
    "tagId",
    "tagName"
})
public class AgrafCardTagAddressInfo {

    @XmlElement(name = "CardContacts", nillable = true)
    protected ArrayOfAgrafCardContactAddressInfo cardContacts;
    @XmlElement(name = "GuidCard")
    protected String guidCard;
    @XmlElement(name = "TagId", nillable = true)
    protected String tagId;
    @XmlElement(name = "TagName", nillable = true)
    protected String tagName;

    /**
     * Gets the value of the cardContacts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAgrafCardContactAddressInfo }
     *     
     */
    public ArrayOfAgrafCardContactAddressInfo getCardContacts() {
        return cardContacts;
    }

    /**
     * Sets the value of the cardContacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAgrafCardContactAddressInfo }
     *     
     */
    public void setCardContacts(ArrayOfAgrafCardContactAddressInfo value) {
        this.cardContacts = value;
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
     * Gets the value of the tagId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagId() {
        return tagId;
    }

    /**
     * Sets the value of the tagId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagId(String value) {
        this.tagId = value;
    }

    /**
     * Gets the value of the tagName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * Sets the value of the tagName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagName(String value) {
        this.tagName = value;
    }

}
