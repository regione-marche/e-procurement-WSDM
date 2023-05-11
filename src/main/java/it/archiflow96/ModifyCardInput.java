
package it.archiflow96;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifyCardInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyCardInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="ArchiveId" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="AutoCheckIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CardId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="ConcatDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Document" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}Document" minOccurs="0"/>
 *         &lt;element name="DocumentTypeId" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="Fields" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfField" minOccurs="0"/>
 *         &lt;element name="IsAutomaticProtocol" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OldInvoiceCardId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="SaveAs" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}SaveCardAsType" minOccurs="0"/>
 *         &lt;element name="SaveAsInvoice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SyncWF" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UseInvoiceOriginalFileName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UseOriginalFileName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="XmlMTFileId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyCardInput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "archiveId",
    "autoCheckIn",
    "cardId",
    "concatDocument",
    "document",
    "documentTypeId",
    "fields",
    "isAutomaticProtocol",
    "oldInvoiceCardId",
    "saveAs",
    "saveAsInvoice",
    "syncWF",
    "useInvoiceOriginalFileName",
    "useOriginalFileName",
    "xmlMTFileId"
})
public class ModifyCardInput
    extends BaseInput
{

    @XmlElement(name = "ArchiveId")
    protected Short archiveId;
    @XmlElement(name = "AutoCheckIn")
    protected Boolean autoCheckIn;
    @XmlElement(name = "CardId")
    protected String cardId;
    @XmlElement(name = "ConcatDocument")
    protected Boolean concatDocument;
    @XmlElement(name = "Document", nillable = true)
    protected Document document;
    @XmlElement(name = "DocumentTypeId")
    protected Short documentTypeId;
    @XmlElement(name = "Fields", nillable = true)
    protected ArrayOfField fields;
    @XmlElement(name = "IsAutomaticProtocol")
    protected Boolean isAutomaticProtocol;
    @XmlElement(name = "OldInvoiceCardId")
    protected String oldInvoiceCardId;
    @XmlElement(name = "SaveAs")
    protected SaveCardAsType saveAs;
    @XmlElement(name = "SaveAsInvoice")
    protected Boolean saveAsInvoice;
    @XmlElement(name = "SyncWF")
    protected Boolean syncWF;
    @XmlElement(name = "UseInvoiceOriginalFileName")
    protected Boolean useInvoiceOriginalFileName;
    @XmlElement(name = "UseOriginalFileName")
    protected Boolean useOriginalFileName;
    @XmlElement(name = "XmlMTFileId")
    protected String xmlMTFileId;

    /**
     * Gets the value of the archiveId property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getArchiveId() {
        return archiveId;
    }

    /**
     * Sets the value of the archiveId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setArchiveId(Short value) {
        this.archiveId = value;
    }

    /**
     * Gets the value of the autoCheckIn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoCheckIn() {
        return autoCheckIn;
    }

    /**
     * Sets the value of the autoCheckIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoCheckIn(Boolean value) {
        this.autoCheckIn = value;
    }

    /**
     * Gets the value of the cardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * Sets the value of the cardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardId(String value) {
        this.cardId = value;
    }

    /**
     * Gets the value of the concatDocument property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConcatDocument() {
        return concatDocument;
    }

    /**
     * Sets the value of the concatDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConcatDocument(Boolean value) {
        this.concatDocument = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link Document }
     *     
     */
    public Document getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link Document }
     *     
     */
    public void setDocument(Document value) {
        this.document = value;
    }

    /**
     * Gets the value of the documentTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDocumentTypeId() {
        return documentTypeId;
    }

    /**
     * Sets the value of the documentTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDocumentTypeId(Short value) {
        this.documentTypeId = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfField }
     *     
     */
    public ArrayOfField getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfField }
     *     
     */
    public void setFields(ArrayOfField value) {
        this.fields = value;
    }

    /**
     * Gets the value of the isAutomaticProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAutomaticProtocol() {
        return isAutomaticProtocol;
    }

    /**
     * Sets the value of the isAutomaticProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAutomaticProtocol(Boolean value) {
        this.isAutomaticProtocol = value;
    }

    /**
     * Gets the value of the oldInvoiceCardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldInvoiceCardId() {
        return oldInvoiceCardId;
    }

    /**
     * Sets the value of the oldInvoiceCardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldInvoiceCardId(String value) {
        this.oldInvoiceCardId = value;
    }

    /**
     * Gets the value of the saveAs property.
     * 
     * @return
     *     possible object is
     *     {@link SaveCardAsType }
     *     
     */
    public SaveCardAsType getSaveAs() {
        return saveAs;
    }

    /**
     * Sets the value of the saveAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaveCardAsType }
     *     
     */
    public void setSaveAs(SaveCardAsType value) {
        this.saveAs = value;
    }

    /**
     * Gets the value of the saveAsInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSaveAsInvoice() {
        return saveAsInvoice;
    }

    /**
     * Sets the value of the saveAsInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaveAsInvoice(Boolean value) {
        this.saveAsInvoice = value;
    }

    /**
     * Gets the value of the syncWF property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSyncWF() {
        return syncWF;
    }

    /**
     * Sets the value of the syncWF property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSyncWF(Boolean value) {
        this.syncWF = value;
    }

    /**
     * Gets the value of the useInvoiceOriginalFileName property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseInvoiceOriginalFileName() {
        return useInvoiceOriginalFileName;
    }

    /**
     * Sets the value of the useInvoiceOriginalFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseInvoiceOriginalFileName(Boolean value) {
        this.useInvoiceOriginalFileName = value;
    }

    /**
     * Gets the value of the useOriginalFileName property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseOriginalFileName() {
        return useOriginalFileName;
    }

    /**
     * Sets the value of the useOriginalFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseOriginalFileName(Boolean value) {
        this.useOriginalFileName = value;
    }

    /**
     * Gets the value of the xmlMTFileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlMTFileId() {
        return xmlMTFileId;
    }

    /**
     * Sets the value of the xmlMTFileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlMTFileId(String value) {
        this.xmlMTFileId = value;
    }

}
