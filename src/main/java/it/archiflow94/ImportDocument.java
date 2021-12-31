
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="strSessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oCardId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="oDocument" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}Document" minOccurs="0"/>
 *         &lt;element name="bOverridePrevious" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="bConcatDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "strSessionId",
    "oCardId",
    "oDocument",
    "bOverridePrevious",
    "bConcatDocument"
})
@XmlRootElement(name = "ImportDocument")
public class ImportDocument {

    @XmlElement(nillable = true)
    protected String strSessionId;
    protected String oCardId;
    @XmlElement(nillable = true)
    protected Document oDocument;
    protected Boolean bOverridePrevious;
    protected Boolean bConcatDocument;

    /**
     * Gets the value of the strSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrSessionId() {
        return strSessionId;
    }

    /**
     * Sets the value of the strSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrSessionId(String value) {
        this.strSessionId = value;
    }

    /**
     * Gets the value of the oCardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOCardId() {
        return oCardId;
    }

    /**
     * Sets the value of the oCardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOCardId(String value) {
        this.oCardId = value;
    }

    /**
     * Gets the value of the oDocument property.
     * 
     * @return
     *     possible object is
     *     {@link Document }
     *     
     */
    public Document getODocument() {
        return oDocument;
    }

    /**
     * Sets the value of the oDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Document }
     *     
     */
    public void setODocument(Document value) {
        this.oDocument = value;
    }

    /**
     * Gets the value of the bOverridePrevious property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOverridePrevious() {
        return bOverridePrevious;
    }

    /**
     * Sets the value of the bOverridePrevious property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOverridePrevious(Boolean value) {
        this.bOverridePrevious = value;
    }

    /**
     * Gets the value of the bConcatDocument property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBConcatDocument() {
        return bConcatDocument;
    }

    /**
     * Sets the value of the bConcatDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBConcatDocument(Boolean value) {
        this.bConcatDocument = value;
    }

}
