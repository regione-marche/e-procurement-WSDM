
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportDocumentByParamInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportDocumentByParamInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="AutoCheckIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CardId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="ConcatDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Document" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}Document" minOccurs="0"/>
 *         &lt;element name="OverridePrevious" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PressMarkModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportDocumentByParamInput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "autoCheckIn",
    "cardId",
    "concatDocument",
    "document",
    "overridePrevious",
    "pressMarkModel"
})
public class ImportDocumentByParamInput
    extends BaseInput
{

    @XmlElement(name = "AutoCheckIn")
    protected Boolean autoCheckIn;
    @XmlElement(name = "CardId")
    protected String cardId;
    @XmlElement(name = "ConcatDocument")
    protected Boolean concatDocument;
    @XmlElement(name = "Document", nillable = true)
    protected Document document;
    @XmlElement(name = "OverridePrevious")
    protected Boolean overridePrevious;
    @XmlElement(name = "PressMarkModel", nillable = true)
    protected String pressMarkModel;

    /**
     * Gets the value of the autoCheckIn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoCheckIn() {
        return autoCheckIn;
    }

    /**
     * Sets the value of the autoCheckIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoCheckIn(Boolean value) {
        this.autoCheckIn = value;
    }

    /**
     * Gets the value of the cardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * Sets the value of the cardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardId(String value) {
        this.cardId = value;
    }

    /**
     * Gets the value of the concatDocument property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConcatDocument() {
        return concatDocument;
    }

    /**
     * Sets the value of the concatDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConcatDocument(Boolean value) {
        this.concatDocument = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link Document }
     *     
     */
    public Document getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link Document }
     *     
     */
    public void setDocument(Document value) {
        this.document = value;
    }

    /**
     * Gets the value of the overridePrevious property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverridePrevious() {
        return overridePrevious;
    }

    /**
     * Sets the value of the overridePrevious property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverridePrevious(Boolean value) {
        this.overridePrevious = value;
    }

    /**
     * Gets the value of the pressMarkModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPressMarkModel() {
        return pressMarkModel;
    }

    /**
     * Sets the value of the pressMarkModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPressMarkModel(String value) {
        this.pressMarkModel = value;
    }

}
