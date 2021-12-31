
package it.archiflow93.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendedEMailOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedEMailOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttachmentsIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="SendAdditionalData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendAnnotations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendExtAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendIndexes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendIntAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendMainDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendTif2Pdf" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedEMailOptions", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "attachmentsIds",
    "sendAdditionalData",
    "sendAnnotations",
    "sendExtAttachments",
    "sendIndexes",
    "sendIntAttachments",
    "sendMainDocument",
    "sendTif2Pdf"
})
public class ExtendedEMailOptions {

    @XmlElement(name = "AttachmentsIds", nillable = true)
    protected ArrayOfint attachmentsIds;
    @XmlElement(name = "SendAdditionalData")
    protected Boolean sendAdditionalData;
    @XmlElement(name = "SendAnnotations")
    protected Boolean sendAnnotations;
    @XmlElement(name = "SendExtAttachments")
    protected Boolean sendExtAttachments;
    @XmlElement(name = "SendIndexes")
    protected Boolean sendIndexes;
    @XmlElement(name = "SendIntAttachments")
    protected Boolean sendIntAttachments;
    @XmlElement(name = "SendMainDocument")
    protected Boolean sendMainDocument;
    @XmlElement(name = "SendTif2Pdf")
    protected Boolean sendTif2Pdf;

    /**
     * Gets the value of the attachmentsIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getAttachmentsIds() {
        return attachmentsIds;
    }

    /**
     * Sets the value of the attachmentsIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setAttachmentsIds(ArrayOfint value) {
        this.attachmentsIds = value;
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
     * Gets the value of the sendExtAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendExtAttachments() {
        return sendExtAttachments;
    }

    /**
     * Sets the value of the sendExtAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendExtAttachments(Boolean value) {
        this.sendExtAttachments = value;
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
     * Gets the value of the sendIntAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendIntAttachments() {
        return sendIntAttachments;
    }

    /**
     * Sets the value of the sendIntAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendIntAttachments(Boolean value) {
        this.sendIntAttachments = value;
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
     * Gets the value of the sendTif2Pdf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendTif2Pdf() {
        return sendTif2Pdf;
    }

    /**
     * Sets the value of the sendTif2Pdf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendTif2Pdf(Boolean value) {
        this.sendTif2Pdf = value;
    }

}
