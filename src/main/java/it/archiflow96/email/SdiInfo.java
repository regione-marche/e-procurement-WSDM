
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SdiInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SdiInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Common.Tools.Log}LoggableBase">
 *       &lt;sequence>
 *         &lt;element name="BatchInvoicesCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DocumentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HasXmlMT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Position" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RecipientCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SendingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransmissionFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SdiInfo", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.ValueObject", propOrder = {
    "batchInvoicesCount",
    "documentType",
    "fileId",
    "fileName",
    "hasXmlMT",
    "id",
    "position",
    "recipientCode",
    "sendingId",
    "transmissionFormat"
})
public class SdiInfo
    extends LoggableBase
{

    @XmlElement(name = "BatchInvoicesCount")
    protected Integer batchInvoicesCount;
    @XmlElement(name = "DocumentType", nillable = true)
    protected String documentType;
    @XmlElement(name = "FileId", nillable = true)
    protected String fileId;
    @XmlElement(name = "FileName", nillable = true)
    protected String fileName;
    @XmlElement(name = "HasXmlMT")
    protected Boolean hasXmlMT;
    @XmlElement(name = "Id", nillable = true)
    protected Long id;
    @XmlElement(name = "Position")
    protected Integer position;
    @XmlElement(name = "RecipientCode", nillable = true)
    protected String recipientCode;
    @XmlElement(name = "SendingId", nillable = true)
    protected String sendingId;
    @XmlElement(name = "TransmissionFormat", nillable = true)
    protected String transmissionFormat;

    /**
     * Gets the value of the batchInvoicesCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBatchInvoicesCount() {
        return batchInvoicesCount;
    }

    /**
     * Sets the value of the batchInvoicesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBatchInvoicesCount(Integer value) {
        this.batchInvoicesCount = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the fileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * Sets the value of the fileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileId(String value) {
        this.fileId = value;
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
     * Gets the value of the hasXmlMT property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasXmlMT() {
        return hasXmlMT;
    }

    /**
     * Sets the value of the hasXmlMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasXmlMT(Boolean value) {
        this.hasXmlMT = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPosition(Integer value) {
        this.position = value;
    }

    /**
     * Gets the value of the recipientCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientCode() {
        return recipientCode;
    }

    /**
     * Sets the value of the recipientCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientCode(String value) {
        this.recipientCode = value;
    }

    /**
     * Gets the value of the sendingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendingId() {
        return sendingId;
    }

    /**
     * Sets the value of the sendingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendingId(String value) {
        this.sendingId = value;
    }

    /**
     * Gets the value of the transmissionFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransmissionFormat() {
        return transmissionFormat;
    }

    /**
     * Sets the value of the transmissionFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransmissionFormat(String value) {
        this.transmissionFormat = value;
    }

}
