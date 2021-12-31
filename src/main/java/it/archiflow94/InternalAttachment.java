
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InternalAttachment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InternalAttachment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}Attachment">
 *       &lt;sequence>
 *         &lt;element name="ArchiveId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AttachType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}InternalAttachType" minOccurs="0"/>
 *         &lt;element name="AttachmentCardId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="HasMainDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InternalNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternalAttachment", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "archiveId",
    "attachType",
    "attachmentCardId",
    "hasMainDocument",
    "internalNote"
})
public class InternalAttachment
    extends Attachment
{

    @XmlElement(name = "ArchiveId")
    protected Integer archiveId;
    @XmlElement(name = "AttachType")
    protected InternalAttachType attachType;
    @XmlElement(name = "AttachmentCardId")
    protected String attachmentCardId;
    @XmlElement(name = "HasMainDocument")
    protected Boolean hasMainDocument;
    @XmlElement(name = "InternalNote", nillable = true)
    protected String internalNote;

    /**
     * Gets the value of the archiveId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArchiveId() {
        return archiveId;
    }

    /**
     * Sets the value of the archiveId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArchiveId(Integer value) {
        this.archiveId = value;
    }

    /**
     * Gets the value of the attachType property.
     * 
     * @return
     *     possible object is
     *     {@link InternalAttachType }
     *     
     */
    public InternalAttachType getAttachType() {
        return attachType;
    }

    /**
     * Sets the value of the attachType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalAttachType }
     *     
     */
    public void setAttachType(InternalAttachType value) {
        this.attachType = value;
    }

    /**
     * Gets the value of the attachmentCardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentCardId() {
        return attachmentCardId;
    }

    /**
     * Sets the value of the attachmentCardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentCardId(String value) {
        this.attachmentCardId = value;
    }

    /**
     * Gets the value of the hasMainDocument property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasMainDocument() {
        return hasMainDocument;
    }

    /**
     * Sets the value of the hasMainDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasMainDocument(Boolean value) {
        this.hasMainDocument = value;
    }

    /**
     * Gets the value of the internalNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalNote() {
        return internalNote;
    }

    /**
     * Sets the value of the internalNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalNote(String value) {
        this.internalNote = value;
    }

}
