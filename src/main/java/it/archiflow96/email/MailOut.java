
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MailOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MailOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Attachments" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}ArrayOfMailAttachment" minOccurs="0"/>
 *         &lt;element name="BCC" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}ArrayOfMailAddress" minOccurs="0"/>
 *         &lt;element name="Body" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CC" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}ArrayOfMailAddress" minOccurs="0"/>
 *         &lt;element name="From" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}MailAddress" minOccurs="0"/>
 *         &lt;element name="IsBodyHtml" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReplyTo" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}MailAddress" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="To" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}ArrayOfMailAddress" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailOut", propOrder = {
    "attachments",
    "bcc",
    "body",
    "cc",
    "from",
    "isBodyHtml",
    "replyTo",
    "subject",
    "to"
})
public class MailOut {

    @XmlElement(name = "Attachments", nillable = true)
    protected ArrayOfMailAttachment attachments;
    @XmlElement(name = "BCC", nillable = true)
    protected ArrayOfMailAddress bcc;
    @XmlElement(name = "Body", nillable = true)
    protected String body;
    @XmlElement(name = "CC", nillable = true)
    protected ArrayOfMailAddress cc;
    @XmlElement(name = "From", nillable = true)
    protected MailAddress from;
    @XmlElement(name = "IsBodyHtml")
    protected Boolean isBodyHtml;
    @XmlElement(name = "ReplyTo", nillable = true)
    protected MailAddress replyTo;
    @XmlElement(name = "Subject", nillable = true)
    protected String subject;
    @XmlElement(name = "To", nillable = true)
    protected ArrayOfMailAddress to;

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMailAttachment }
     *     
     */
    public ArrayOfMailAttachment getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMailAttachment }
     *     
     */
    public void setAttachments(ArrayOfMailAttachment value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the bcc property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMailAddress }
     *     
     */
    public ArrayOfMailAddress getBCC() {
        return bcc;
    }

    /**
     * Sets the value of the bcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMailAddress }
     *     
     */
    public void setBCC(ArrayOfMailAddress value) {
        this.bcc = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBody(String value) {
        this.body = value;
    }

    /**
     * Gets the value of the cc property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMailAddress }
     *     
     */
    public ArrayOfMailAddress getCC() {
        return cc;
    }

    /**
     * Sets the value of the cc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMailAddress }
     *     
     */
    public void setCC(ArrayOfMailAddress value) {
        this.cc = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link MailAddress }
     *     
     */
    public MailAddress getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailAddress }
     *     
     */
    public void setFrom(MailAddress value) {
        this.from = value;
    }

    /**
     * Gets the value of the isBodyHtml property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBodyHtml() {
        return isBodyHtml;
    }

    /**
     * Sets the value of the isBodyHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBodyHtml(Boolean value) {
        this.isBodyHtml = value;
    }

    /**
     * Gets the value of the replyTo property.
     * 
     * @return
     *     possible object is
     *     {@link MailAddress }
     *     
     */
    public MailAddress getReplyTo() {
        return replyTo;
    }

    /**
     * Sets the value of the replyTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailAddress }
     *     
     */
    public void setReplyTo(MailAddress value) {
        this.replyTo = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMailAddress }
     *     
     */
    public ArrayOfMailAddress getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMailAddress }
     *     
     */
    public void setTo(ArrayOfMailAddress value) {
        this.to = value;
    }

}
