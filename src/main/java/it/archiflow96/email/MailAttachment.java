
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MailAttachment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MailAttachment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttachmentData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsInteropAttachment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsInteropMaindoc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SignStatus" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}EmailAttSignStatus" minOccurs="0"/>
 *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailAttachment", propOrder = {
    "attachmentData",
    "index",
    "isInteropAttachment",
    "isInteropMaindoc",
    "name",
    "signStatus",
    "size"
})
public class MailAttachment {

    @XmlElement(name = "AttachmentData", nillable = true)
    protected byte[] attachmentData;
    @XmlElement(name = "Index")
    protected Integer index;
    @XmlElement(name = "IsInteropAttachment")
    protected Boolean isInteropAttachment;
    @XmlElement(name = "IsInteropMaindoc")
    protected Boolean isInteropMaindoc;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "SignStatus")
    protected EmailAttSignStatus signStatus;
    @XmlElement(name = "Size")
    protected Long size;

    /**
     * Gets the value of the attachmentData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAttachmentData() {
        return attachmentData;
    }

    /**
     * Sets the value of the attachmentData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAttachmentData(byte[] value) {
        this.attachmentData = ((byte[]) value);
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndex(Integer value) {
        this.index = value;
    }

    /**
     * Gets the value of the isInteropAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInteropAttachment() {
        return isInteropAttachment;
    }

    /**
     * Sets the value of the isInteropAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInteropAttachment(Boolean value) {
        this.isInteropAttachment = value;
    }

    /**
     * Gets the value of the isInteropMaindoc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInteropMaindoc() {
        return isInteropMaindoc;
    }

    /**
     * Sets the value of the isInteropMaindoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInteropMaindoc(Boolean value) {
        this.isInteropMaindoc = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the signStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EmailAttSignStatus }
     *     
     */
    public EmailAttSignStatus getSignStatus() {
        return signStatus;
    }

    /**
     * Sets the value of the signStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAttSignStatus }
     *     
     */
    public void setSignStatus(EmailAttSignStatus value) {
        this.signStatus = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSize(Long value) {
        this.size = value;
    }

}
