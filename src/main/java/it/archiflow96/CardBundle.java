
package it.archiflow96;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardBundle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardBundle">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}Card">
 *       &lt;sequence>
 *         &lt;element name="AgrafCards" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject}ArrayOfAgrafCard" minOccurs="0"/>
 *         &lt;element name="Annotations" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfAnnotation" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfAttachment" minOccurs="0"/>
 *         &lt;element name="ClassFolder" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfintArrayOfintty7Ep6D1" minOccurs="0"/>
 *         &lt;element name="ClassFolderList" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfClassificationFolder" minOccurs="0"/>
 *         &lt;element name="History" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfHistory" minOccurs="0"/>
 *         &lt;element name="MainDocument" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}Document" minOccurs="0"/>
 *         &lt;element name="OldInvoiceCardId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="ProtocolMainDocType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}ProtocolMainDocType" minOccurs="0"/>
 *         &lt;element name="SaveAs" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}SaveCardAsType" minOccurs="0"/>
 *         &lt;element name="SaveAsInvoice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "CardBundle", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "agrafCards",
    "annotations",
    "attachments",
    "classFolder",
    "classFolderList",
    "history",
    "mainDocument",
    "oldInvoiceCardId",
    "protocolMainDocType",
    "saveAs",
    "saveAsInvoice",
    "useInvoiceOriginalFileName",
    "useOriginalFileName",
    "xmlMTFileId"
})
public class CardBundle
    extends Card
{

    @XmlElement(name = "AgrafCards", nillable = true)
    protected ArrayOfAgrafCard agrafCards;
    @XmlElement(name = "Annotations", nillable = true)
    protected ArrayOfAnnotation annotations;
    @XmlElement(name = "Attachments", nillable = true)
    protected ArrayOfAttachment attachments;
    @XmlElement(name = "ClassFolder", nillable = true)
    protected ArrayOfKeyValueOfintArrayOfintty7Ep6D1 classFolder;
    @XmlElement(name = "ClassFolderList", nillable = true)
    protected ArrayOfClassificationFolder classFolderList;
    @XmlElement(name = "History", nillable = true)
    protected ArrayOfHistory history;
    @XmlElement(name = "MainDocument", nillable = true)
    protected Document mainDocument;
    @XmlElement(name = "OldInvoiceCardId")
    protected String oldInvoiceCardId;
    @XmlElement(name = "ProtocolMainDocType")
    protected ProtocolMainDocType protocolMainDocType;
    @XmlElement(name = "SaveAs")
    protected SaveCardAsType saveAs;
    @XmlElement(name = "SaveAsInvoice")
    protected Boolean saveAsInvoice;
    @XmlElement(name = "UseInvoiceOriginalFileName")
    protected Boolean useInvoiceOriginalFileName;
    @XmlElement(name = "UseOriginalFileName")
    protected Boolean useOriginalFileName;
    @XmlElement(name = "XmlMTFileId")
    protected String xmlMTFileId;

    /**
     * Gets the value of the agrafCards property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAgrafCard }
     *     
     */
    public ArrayOfAgrafCard getAgrafCards() {
        return agrafCards;
    }

    /**
     * Sets the value of the agrafCards property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAgrafCard }
     *     
     */
    public void setAgrafCards(ArrayOfAgrafCard value) {
        this.agrafCards = value;
    }

    /**
     * Gets the value of the annotations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAnnotation }
     *     
     */
    public ArrayOfAnnotation getAnnotations() {
        return annotations;
    }

    /**
     * Sets the value of the annotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAnnotation }
     *     
     */
    public void setAnnotations(ArrayOfAnnotation value) {
        this.annotations = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttachment }
     *     
     */
    public ArrayOfAttachment getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttachment }
     *     
     */
    public void setAttachments(ArrayOfAttachment value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the classFolder property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValueOfintArrayOfintty7Ep6D1 }
     *     
     */
    public ArrayOfKeyValueOfintArrayOfintty7Ep6D1 getClassFolder() {
        return classFolder;
    }

    /**
     * Sets the value of the classFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValueOfintArrayOfintty7Ep6D1 }
     *     
     */
    public void setClassFolder(ArrayOfKeyValueOfintArrayOfintty7Ep6D1 value) {
        this.classFolder = value;
    }

    /**
     * Gets the value of the classFolderList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClassificationFolder }
     *     
     */
    public ArrayOfClassificationFolder getClassFolderList() {
        return classFolderList;
    }

    /**
     * Sets the value of the classFolderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClassificationFolder }
     *     
     */
    public void setClassFolderList(ArrayOfClassificationFolder value) {
        this.classFolderList = value;
    }

    /**
     * Gets the value of the history property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHistory }
     *     
     */
    public ArrayOfHistory getHistory() {
        return history;
    }

    /**
     * Sets the value of the history property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHistory }
     *     
     */
    public void setHistory(ArrayOfHistory value) {
        this.history = value;
    }

    /**
     * Gets the value of the mainDocument property.
     * 
     * @return
     *     possible object is
     *     {@link Document }
     *     
     */
    public Document getMainDocument() {
        return mainDocument;
    }

    /**
     * Sets the value of the mainDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Document }
     *     
     */
    public void setMainDocument(Document value) {
        this.mainDocument = value;
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
     * Gets the value of the protocolMainDocType property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolMainDocType }
     *     
     */
    public ProtocolMainDocType getProtocolMainDocType() {
        return protocolMainDocType;
    }

    /**
     * Sets the value of the protocolMainDocType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolMainDocType }
     *     
     */
    public void setProtocolMainDocType(ProtocolMainDocType value) {
        this.protocolMainDocType = value;
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
