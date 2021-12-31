
package it.archiflow93;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgrafCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgrafCard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgrafNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardContacts" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject}ArrayOfAgrafCardContact" minOccurs="0"/>
 *         &lt;element name="GuidCard" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Options" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Tag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgrafCard", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject", propOrder = {
    "agrafNote",
    "cardContacts",
    "guidCard",
    "id",
    "options",
    "tag"
})
public class AgrafCard {

    @XmlElement(name = "AgrafNote", nillable = true)
    protected String agrafNote;
    @XmlElement(name = "CardContacts", nillable = true)
    protected ArrayOfAgrafCardContact cardContacts;
    @XmlElement(name = "GuidCard")
    protected String guidCard;
    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElement(name = "Options")
    protected Integer options;
    @XmlElement(name = "Tag", nillable = true)
    protected String tag;

    /**
     * Gets the value of the agrafNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgrafNote() {
        return agrafNote;
    }

    /**
     * Sets the value of the agrafNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgrafNote(String value) {
        this.agrafNote = value;
    }

    /**
     * Gets the value of the cardContacts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAgrafCardContact }
     *     
     */
    public ArrayOfAgrafCardContact getCardContacts() {
        return cardContacts;
    }

    /**
     * Sets the value of the cardContacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAgrafCardContact }
     *     
     */
    public void setCardContacts(ArrayOfAgrafCardContact value) {
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
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOptions(Integer value) {
        this.options = value;
    }

    /**
     * Gets the value of the tag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag(String value) {
        this.tag = value;
    }

}
