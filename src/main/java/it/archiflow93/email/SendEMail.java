
package it.archiflow93.email;

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
 *         &lt;element name="oMailOut" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}MailOut" minOccurs="0"/>
 *         &lt;element name="oCardId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="bAddCardMainDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="bAddCardAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="bSplitEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eEMailVisType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}EMailVisType" minOccurs="0"/>
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
    "oMailOut",
    "oCardId",
    "bAddCardMainDocument",
    "bAddCardAttachments",
    "bSplitEmail",
    "eeMailVisType"
})
@XmlRootElement(name = "SendEMail", namespace = "http://tempuri.org/")
public class SendEMail {

    @XmlElement(namespace = "http://tempuri.org/", nillable = true)
    protected String strSessionId;
    @XmlElement(namespace = "http://tempuri.org/", nillable = true)
    protected MailOut oMailOut;
    @XmlElement(namespace = "http://tempuri.org/")
    protected String oCardId;
    @XmlElement(namespace = "http://tempuri.org/")
    protected Boolean bAddCardMainDocument;
    @XmlElement(namespace = "http://tempuri.org/")
    protected Boolean bAddCardAttachments;
    @XmlElement(namespace = "http://tempuri.org/")
    protected Boolean bSplitEmail;
    @XmlElement(name = "eEMailVisType", namespace = "http://tempuri.org/")
    protected EMailVisType eeMailVisType;

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
     * Gets the value of the oMailOut property.
     * 
     * @return
     *     possible object is
     *     {@link MailOut }
     *     
     */
    public MailOut getOMailOut() {
        return oMailOut;
    }

    /**
     * Sets the value of the oMailOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailOut }
     *     
     */
    public void setOMailOut(MailOut value) {
        this.oMailOut = value;
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
     * Gets the value of the bAddCardMainDocument property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBAddCardMainDocument() {
        return bAddCardMainDocument;
    }

    /**
     * Sets the value of the bAddCardMainDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBAddCardMainDocument(Boolean value) {
        this.bAddCardMainDocument = value;
    }

    /**
     * Gets the value of the bAddCardAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBAddCardAttachments() {
        return bAddCardAttachments;
    }

    /**
     * Sets the value of the bAddCardAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBAddCardAttachments(Boolean value) {
        this.bAddCardAttachments = value;
    }

    /**
     * Gets the value of the bSplitEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBSplitEmail() {
        return bSplitEmail;
    }

    /**
     * Sets the value of the bSplitEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBSplitEmail(Boolean value) {
        this.bSplitEmail = value;
    }

    /**
     * Gets the value of the eeMailVisType property.
     * 
     * @return
     *     possible object is
     *     {@link EMailVisType }
     *     
     */
    public EMailVisType getEEMailVisType() {
        return eeMailVisType;
    }

    /**
     * Sets the value of the eeMailVisType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMailVisType }
     *     
     */
    public void setEEMailVisType(EMailVisType value) {
        this.eeMailVisType = value;
    }

}
