
package it.archiflow96;

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
 *         &lt;element name="oAttachment" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ExternalAttachment" minOccurs="0"/>
 *         &lt;element name="bUseSecurity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "oAttachment",
    "bUseSecurity"
})
@XmlRootElement(name = "AttachExternalDocument")
public class AttachExternalDocument {

    @XmlElement(nillable = true)
    protected String strSessionId;
    protected String oCardId;
    @XmlElement(nillable = true)
    protected ExternalAttachment oAttachment;
    protected Boolean bUseSecurity;

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
     * Gets the value of the oAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalAttachment }
     *     
     */
    public ExternalAttachment getOAttachment() {
        return oAttachment;
    }

    /**
     * Sets the value of the oAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalAttachment }
     *     
     */
    public void setOAttachment(ExternalAttachment value) {
        this.oAttachment = value;
    }

    /**
     * Gets the value of the bUseSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBUseSecurity() {
        return bUseSecurity;
    }

    /**
     * Sets the value of the bUseSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBUseSecurity(Boolean value) {
        this.bUseSecurity = value;
    }

}
