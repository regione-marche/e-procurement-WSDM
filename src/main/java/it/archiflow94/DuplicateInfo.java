
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DuplicateInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DuplicateInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CopyAttachmentsById" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="CopyExternalAttachment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CopyInternalAttachment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CopyMainDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CopyRegistry" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DualAttachmentParentCard" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ParentCardId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DuplicateInfo", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "copyAttachmentsById",
    "copyExternalAttachment",
    "copyInternalAttachment",
    "copyMainDocument",
    "copyRegistry",
    "dualAttachmentParentCard",
    "parentCardId"
})
public class DuplicateInfo {

    @XmlElement(name = "CopyAttachmentsById", nillable = true)
    protected ArrayOfint copyAttachmentsById;
    @XmlElement(name = "CopyExternalAttachment")
    protected Boolean copyExternalAttachment;
    @XmlElement(name = "CopyInternalAttachment")
    protected Boolean copyInternalAttachment;
    @XmlElement(name = "CopyMainDocument")
    protected Boolean copyMainDocument;
    @XmlElement(name = "CopyRegistry")
    protected Boolean copyRegistry;
    @XmlElement(name = "DualAttachmentParentCard")
    protected Boolean dualAttachmentParentCard;
    @XmlElement(name = "ParentCardId")
    protected String parentCardId;

    /**
     * Gets the value of the copyAttachmentsById property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getCopyAttachmentsById() {
        return copyAttachmentsById;
    }

    /**
     * Sets the value of the copyAttachmentsById property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setCopyAttachmentsById(ArrayOfint value) {
        this.copyAttachmentsById = value;
    }

    /**
     * Gets the value of the copyExternalAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCopyExternalAttachment() {
        return copyExternalAttachment;
    }

    /**
     * Sets the value of the copyExternalAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCopyExternalAttachment(Boolean value) {
        this.copyExternalAttachment = value;
    }

    /**
     * Gets the value of the copyInternalAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCopyInternalAttachment() {
        return copyInternalAttachment;
    }

    /**
     * Sets the value of the copyInternalAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCopyInternalAttachment(Boolean value) {
        this.copyInternalAttachment = value;
    }

    /**
     * Gets the value of the copyMainDocument property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCopyMainDocument() {
        return copyMainDocument;
    }

    /**
     * Sets the value of the copyMainDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCopyMainDocument(Boolean value) {
        this.copyMainDocument = value;
    }

    /**
     * Gets the value of the copyRegistry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCopyRegistry() {
        return copyRegistry;
    }

    /**
     * Sets the value of the copyRegistry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCopyRegistry(Boolean value) {
        this.copyRegistry = value;
    }

    /**
     * Gets the value of the dualAttachmentParentCard property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDualAttachmentParentCard() {
        return dualAttachmentParentCard;
    }

    /**
     * Sets the value of the dualAttachmentParentCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDualAttachmentParentCard(Boolean value) {
        this.dualAttachmentParentCard = value;
    }

    /**
     * Gets the value of the parentCardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentCardId() {
        return parentCardId;
    }

    /**
     * Sets the value of the parentCardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentCardId(String value) {
        this.parentCardId = value;
    }

}
