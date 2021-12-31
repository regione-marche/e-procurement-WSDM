
package it.archiflow93;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EMailAttachment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EMailAttachment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttachInterop" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FileBytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="FileGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MainDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EMailAttachment", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", propOrder = {
    "attachInterop",
    "fileBytes",
    "fileGUID",
    "fileName",
    "fileSize",
    "mainDocument"
})
public class EMailAttachment {

    @XmlElement(name = "AttachInterop")
    protected Boolean attachInterop;
    @XmlElement(name = "FileBytes", nillable = true)
    protected byte[] fileBytes;
    @XmlElement(name = "FileGUID", nillable = true)
    protected String fileGUID;
    @XmlElement(name = "FileName", nillable = true)
    protected String fileName;
    @XmlElement(name = "FileSize")
    protected Long fileSize;
    @XmlElement(name = "MainDocument")
    protected Boolean mainDocument;

    /**
     * Gets the value of the attachInterop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttachInterop() {
        return attachInterop;
    }

    /**
     * Sets the value of the attachInterop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAttachInterop(Boolean value) {
        this.attachInterop = value;
    }

    /**
     * Gets the value of the fileBytes property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFileBytes() {
        return fileBytes;
    }

    /**
     * Sets the value of the fileBytes property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFileBytes(byte[] value) {
        this.fileBytes = ((byte[]) value);
    }

    /**
     * Gets the value of the fileGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileGUID() {
        return fileGUID;
    }

    /**
     * Sets the value of the fileGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileGUID(String value) {
        this.fileGUID = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the fileSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFileSize() {
        return fileSize;
    }

    /**
     * Sets the value of the fileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFileSize(Long value) {
        this.fileSize = value;
    }

    /**
     * Gets the value of the mainDocument property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMainDocument() {
        return mainDocument;
    }

    /**
     * Sets the value of the mainDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMainDocument(Boolean value) {
        this.mainDocument = value;
    }

}
