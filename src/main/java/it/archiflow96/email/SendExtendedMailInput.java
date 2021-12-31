
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendExtendedMailInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendExtendedMailInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="BCC" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}ArrayOfMailAddress" minOccurs="0"/>
 *         &lt;element name="Body" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CC" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}ArrayOfMailAddress" minOccurs="0"/>
 *         &lt;element name="CardIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *         &lt;element name="ExtAttachmentIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="IsBodyHtml" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSharedMailbox" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MailBoxID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SendAdditionalData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendAllExtAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendAllIntAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendAnnotations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendIndexes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendMainDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tif2Pdf" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="To" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}ArrayOfMailAddress" minOccurs="0"/>
 *         &lt;element name="WebUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendExtendedMailInput", propOrder = {
    "bcc",
    "body",
    "cc",
    "cardIds",
    "extAttachmentIds",
    "isBodyHtml",
    "isSharedMailbox",
    "mailBoxID",
    "sendAdditionalData",
    "sendAllExtAttachments",
    "sendAllIntAttachments",
    "sendAnnotations",
    "sendIndexes",
    "sendMainDocument",
    "subject",
    "tif2Pdf",
    "to",
    "webUrl"
})
public class SendExtendedMailInput
    extends BaseInput
{

    @XmlElement(name = "BCC", nillable = true)
    protected ArrayOfMailAddress bcc;
    @XmlElement(name = "Body", nillable = true)
    protected String body;
    @XmlElement(name = "CC", nillable = true)
    protected ArrayOfMailAddress cc;
    @XmlElement(name = "CardIds", nillable = true)
    protected ArrayOfguid cardIds;
    @XmlElement(name = "ExtAttachmentIds", nillable = true)
    protected ArrayOfint extAttachmentIds;
    @XmlElement(name = "IsBodyHtml")
    protected Boolean isBodyHtml;
    @XmlElement(name = "IsSharedMailbox")
    protected Boolean isSharedMailbox;
    @XmlElement(name = "MailBoxID")
    protected Integer mailBoxID;
    @XmlElement(name = "SendAdditionalData")
    protected Boolean sendAdditionalData;
    @XmlElement(name = "SendAllExtAttachments")
    protected Boolean sendAllExtAttachments;
    @XmlElement(name = "SendAllIntAttachments")
    protected Boolean sendAllIntAttachments;
    @XmlElement(name = "SendAnnotations")
    protected Boolean sendAnnotations;
    @XmlElement(name = "SendIndexes")
    protected Boolean sendIndexes;
    @XmlElement(name = "SendMainDocument")
    protected Boolean sendMainDocument;
    @XmlElement(name = "Subject", nillable = true)
    protected String subject;
    @XmlElement(name = "Tif2Pdf")
    protected Boolean tif2Pdf;
    @XmlElement(name = "To", nillable = true)
    protected ArrayOfMailAddress to;
    @XmlElement(name = "WebUrl", nillable = true)
    protected String webUrl;

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
     * Gets the value of the cardIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfguid }
     *     
     */
    public ArrayOfguid getCardIds() {
        return cardIds;
    }

    /**
     * Sets the value of the cardIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfguid }
     *     
     */
    public void setCardIds(ArrayOfguid value) {
        this.cardIds = value;
    }

    /**
     * Gets the value of the extAttachmentIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getExtAttachmentIds() {
        return extAttachmentIds;
    }

    /**
     * Sets the value of the extAttachmentIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setExtAttachmentIds(ArrayOfint value) {
        this.extAttachmentIds = value;
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
     * Gets the value of the isSharedMailbox property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSharedMailbox() {
        return isSharedMailbox;
    }

    /**
     * Sets the value of the isSharedMailbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSharedMailbox(Boolean value) {
        this.isSharedMailbox = value;
    }

    /**
     * Gets the value of the mailBoxID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMailBoxID() {
        return mailBoxID;
    }

    /**
     * Sets the value of the mailBoxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMailBoxID(Integer value) {
        this.mailBoxID = value;
    }

    /**
     * Gets the value of the sendAdditionalData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendAdditionalData() {
        return sendAdditionalData;
    }

    /**
     * Sets the value of the sendAdditionalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendAdditionalData(Boolean value) {
        this.sendAdditionalData = value;
    }

    /**
     * Gets the value of the sendAllExtAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendAllExtAttachments() {
        return sendAllExtAttachments;
    }

    /**
     * Sets the value of the sendAllExtAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendAllExtAttachments(Boolean value) {
        this.sendAllExtAttachments = value;
    }

    /**
     * Gets the value of the sendAllIntAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendAllIntAttachments() {
        return sendAllIntAttachments;
    }

    /**
     * Sets the value of the sendAllIntAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendAllIntAttachments(Boolean value) {
        this.sendAllIntAttachments = value;
    }

    /**
     * Gets the value of the sendAnnotations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendAnnotations() {
        return sendAnnotations;
    }

    /**
     * Sets the value of the sendAnnotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendAnnotations(Boolean value) {
        this.sendAnnotations = value;
    }

    /**
     * Gets the value of the sendIndexes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendIndexes() {
        return sendIndexes;
    }

    /**
     * Sets the value of the sendIndexes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendIndexes(Boolean value) {
        this.sendIndexes = value;
    }

    /**
     * Gets the value of the sendMainDocument property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendMainDocument() {
        return sendMainDocument;
    }

    /**
     * Sets the value of the sendMainDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendMainDocument(Boolean value) {
        this.sendMainDocument = value;
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
     * Gets the value of the tif2Pdf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTif2Pdf() {
        return tif2Pdf;
    }

    /**
     * Sets the value of the tif2Pdf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTif2Pdf(Boolean value) {
        this.tif2Pdf = value;
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

    /**
     * Gets the value of the webUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebUrl() {
        return webUrl;
    }

    /**
     * Sets the value of the webUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebUrl(String value) {
        this.webUrl = value;
    }

}
