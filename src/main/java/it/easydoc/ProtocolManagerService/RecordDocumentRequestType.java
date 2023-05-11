
package it.easydoc.ProtocolManagerService;

import java.util.ArrayList;
import java.util.List;
import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecordDocumentRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecordDocumentRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AooCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DominioCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Channels" type="{http://www.consorziocsa.it/easydoc/ws}ChannelItem" maxOccurs="unbounded"/>
 *         &lt;element name="TransmissionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SenderNumberProtocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SenderDataProtocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProtocolObject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="File" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="FileHash" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Metadata" type="{http://www.consorziocsa.it/easydoc/ws}MetadataItemType" maxOccurs="unbounded"/>
 *         &lt;element name="AttachmentsNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AttachmentsDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{http://www.consorziocsa.it/easydoc/ws}Attached" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExternalSendersRecipients" type="{http://www.consorziocsa.it/easydoc/ws}ExternalSenderRecipientItem" maxOccurs="unbounded"/>
 *         &lt;element name="InternalSendersRecipients" type="{http://www.consorziocsa.it/easydoc/ws}InternalSenderRecipientItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Classifications" type="{http://www.consorziocsa.it/easydoc/ws}ClassificationItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Folders" type="{http://www.consorziocsa.it/easydoc/ws}Folder" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AdditionalAssigneesType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AdditionalAssignees" type="{http://www.consorziocsa.it/easydoc/ws}InternalSenderRecipientItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordDocumentRequestType", propOrder = {
    "aooCode",
    "dominioCode",
    "type",
    "channels",
    "transmissionIdentifier",
    "senderNumberProtocol",
    "senderDataProtocol",
    "documentDate",
    "protocolObject",
    "fileName",
    "file",
    "fileHash",
    "metadata",
    "attachmentsNumber",
    "attachmentsDescription",
    "attachments",
    "externalSendersRecipients",
    "internalSendersRecipients",
    "classifications",
    "folders",
    "additionalAssigneesType",
    "additionalAssignees"
})
public class RecordDocumentRequestType {

    @XmlElement(name = "AooCode")
    protected String aooCode;
    @XmlElement(name = "DominioCode")
    protected String dominioCode;
    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "Channels", required = true)
    protected List<ChannelItem> channels;
    @XmlElement(name = "TransmissionIdentifier")
    protected String transmissionIdentifier;
    @XmlElement(name = "SenderNumberProtocol")
    protected String senderNumberProtocol;
    @XmlElement(name = "SenderDataProtocol")
    protected String senderDataProtocol;
    @XmlElement(name = "DocumentDate")
    protected String documentDate;
    @XmlElement(name = "ProtocolObject", required = true)
    protected String protocolObject;
    @XmlElement(name = "FileName", required = true)
    protected String fileName;
    @XmlElement(name = "File", required = true)
    @XmlMimeType("application/octet-stream")
    protected DataHandler file;
    @XmlElement(name = "FileHash", required = true)
    protected String fileHash;
    @XmlElement(name = "Metadata", required = true)
    protected List<MetadataItemType> metadata;
    @XmlElement(name = "AttachmentsNumber")
    protected int attachmentsNumber;
    @XmlElement(name = "AttachmentsDescription")
    protected String attachmentsDescription;
    @XmlElement(name = "Attachments")
    protected List<Attached> attachments;
    @XmlElement(name = "ExternalSendersRecipients", required = true)
    protected List<ExternalSenderRecipientItem> externalSendersRecipients;
    @XmlElement(name = "InternalSendersRecipients")
    protected List<InternalSenderRecipientItem> internalSendersRecipients;
    @XmlElement(name = "Classifications")
    protected List<ClassificationItem> classifications;
    @XmlElement(name = "Folders")
    protected List<Folder> folders;
    @XmlElement(name = "AdditionalAssigneesType", required = true)
    protected String additionalAssigneesType;
    @XmlElement(name = "AdditionalAssignees")
    protected List<InternalSenderRecipientItem> additionalAssignees;

    /**
     * Gets the value of the aooCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAooCode() {
        return aooCode;
    }

    /**
     * Sets the value of the aooCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAooCode(String value) {
        this.aooCode = value;
    }

    /**
     * Gets the value of the dominioCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDominioCode() {
        return dominioCode;
    }

    /**
     * Sets the value of the dominioCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDominioCode(String value) {
        this.dominioCode = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the channels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChannelItem }
     * 
     * 
     */
    public List<ChannelItem> getChannels() {
        if (channels == null) {
            channels = new ArrayList<ChannelItem>();
        }
        return this.channels;
    }

    /**
     * Gets the value of the transmissionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransmissionIdentifier() {
        return transmissionIdentifier;
    }

    /**
     * Sets the value of the transmissionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransmissionIdentifier(String value) {
        this.transmissionIdentifier = value;
    }

    /**
     * Gets the value of the senderNumberProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderNumberProtocol() {
        return senderNumberProtocol;
    }

    /**
     * Sets the value of the senderNumberProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderNumberProtocol(String value) {
        this.senderNumberProtocol = value;
    }

    /**
     * Gets the value of the senderDataProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderDataProtocol() {
        return senderDataProtocol;
    }

    /**
     * Sets the value of the senderDataProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderDataProtocol(String value) {
        this.senderDataProtocol = value;
    }

    /**
     * Gets the value of the documentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentDate() {
        return documentDate;
    }

    /**
     * Sets the value of the documentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentDate(String value) {
        this.documentDate = value;
    }

    /**
     * Gets the value of the protocolObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolObject() {
        return protocolObject;
    }

    /**
     * Sets the value of the protocolObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolObject(String value) {
        this.protocolObject = value;
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
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setFile(DataHandler value) {
        this.file = value;
    }

    /**
     * Gets the value of the fileHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileHash() {
        return fileHash;
    }

    /**
     * Sets the value of the fileHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileHash(String value) {
        this.fileHash = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetadataItemType }
     * 
     * 
     */
    public List<MetadataItemType> getMetadata() {
        if (metadata == null) {
            metadata = new ArrayList<MetadataItemType>();
        }
        return this.metadata;
    }

    /**
     * Gets the value of the attachmentsNumber property.
     * 
     */
    public int getAttachmentsNumber() {
        return attachmentsNumber;
    }

    /**
     * Sets the value of the attachmentsNumber property.
     * 
     */
    public void setAttachmentsNumber(int value) {
        this.attachmentsNumber = value;
    }

    /**
     * Gets the value of the attachmentsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentsDescription() {
        return attachmentsDescription;
    }

    /**
     * Sets the value of the attachmentsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentsDescription(String value) {
        this.attachmentsDescription = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attached }
     * 
     * 
     */
    public List<Attached> getAttachments() {
        if (attachments == null) {
            attachments = new ArrayList<Attached>();
        }
        return this.attachments;
    }

    /**
     * Gets the value of the externalSendersRecipients property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalSendersRecipients property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalSendersRecipients().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalSenderRecipientItem }
     * 
     * 
     */
    public List<ExternalSenderRecipientItem> getExternalSendersRecipients() {
        if (externalSendersRecipients == null) {
            externalSendersRecipients = new ArrayList<ExternalSenderRecipientItem>();
        }
        return this.externalSendersRecipients;
    }

    /**
     * Gets the value of the internalSendersRecipients property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalSendersRecipients property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalSendersRecipients().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternalSenderRecipientItem }
     * 
     * 
     */
    public List<InternalSenderRecipientItem> getInternalSendersRecipients() {
        if (internalSendersRecipients == null) {
            internalSendersRecipients = new ArrayList<InternalSenderRecipientItem>();
        }
        return this.internalSendersRecipients;
    }

    /**
     * Gets the value of the classifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationItem }
     * 
     * 
     */
    public List<ClassificationItem> getClassifications() {
        if (classifications == null) {
            classifications = new ArrayList<ClassificationItem>();
        }
        return this.classifications;
    }

    /**
     * Gets the value of the folders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the folders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFolders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Folder }
     * 
     * 
     */
    public List<Folder> getFolders() {
        if (folders == null) {
            folders = new ArrayList<Folder>();
        }
        return this.folders;
    }

    /**
     * Gets the value of the additionalAssigneesType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAssigneesType() {
        return additionalAssigneesType;
    }

    /**
     * Sets the value of the additionalAssigneesType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalAssigneesType(String value) {
        this.additionalAssigneesType = value;
    }

    /**
     * Gets the value of the additionalAssignees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalAssignees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalAssignees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternalSenderRecipientItem }
     * 
     * 
     */
    public List<InternalSenderRecipientItem> getAdditionalAssignees() {
        if (additionalAssignees == null) {
            additionalAssignees = new ArrayList<InternalSenderRecipientItem>();
        }
        return this.additionalAssignees;
    }

}
