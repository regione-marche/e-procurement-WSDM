
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Card complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Card">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Additives" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfAdditive" minOccurs="0"/>
 *         &lt;element name="ArchiveId" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="CardExpiration" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}CardExpirationInfo" minOccurs="0"/>
 *         &lt;element name="CardId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="CardProg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ComputerizedClassification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ComputerizedFolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocStatus" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}DocumentStatus" minOccurs="0"/>
 *         &lt;element name="DocumentExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentTypeId" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="EncryptedCardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternMailNotification" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternNotifications.ValueObject}ExternNotification" minOccurs="0"/>
 *         &lt;element name="ExternMailNotificationXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HasAdditionalData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasAttachment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasComputerizedClassification" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasComputerizedFolder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasData" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}CardHasData" minOccurs="0"/>
 *         &lt;element name="HasDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasFolder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasKeyVersions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasNotes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasPartialInvalidations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Indexes" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfField" minOccurs="0"/>
 *         &lt;element name="InvalidateAnnotation" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}Annotation" minOccurs="0"/>
 *         &lt;element name="Invoice" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.ValueObject}InvoiceBase" minOccurs="0"/>
 *         &lt;element name="IsCC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsCurrUserVisDoc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDocumentLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsMainDocSignRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsReadOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSigned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSignedPdf" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSignedXml" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSorted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsStoredProtocol" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsValid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsVisOnlyDoc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsWf" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsWfReadOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NumPages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OpsFromList" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}CardOperationsFromList" minOccurs="0"/>
 *         &lt;element name="OriginalFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcWF" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}ProcWF" minOccurs="0"/>
 *         &lt;element name="Progressive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SignedExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}CardStatus" minOccurs="0"/>
 *         &lt;element name="StreamId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreamIdShared" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeStampFormat" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}TimeStampFileFormat" minOccurs="0"/>
 *         &lt;element name="UserIdModifying" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Card", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "additives",
    "archiveId",
    "cardExpiration",
    "cardId",
    "cardProg",
    "computerizedClassification",
    "computerizedFolder",
    "docStatus",
    "documentExtension",
    "documentTypeId",
    "encryptedCardId",
    "externMailNotification",
    "externMailNotificationXML",
    "hasAdditionalData",
    "hasAttachment",
    "hasComputerizedClassification",
    "hasComputerizedFolder",
    "hasData",
    "hasDocument",
    "hasFolder",
    "hasKeyVersions",
    "hasNotes",
    "hasPartialInvalidations",
    "indexes",
    "invalidateAnnotation",
    "invoice",
    "isCC",
    "isCurrUserVisDoc",
    "isDocumentLocked",
    "isMainDocSignRequired",
    "isReadOnly",
    "isSigned",
    "isSignedPdf",
    "isSignedXml",
    "isSorted",
    "isStoredProtocol",
    "isValid",
    "isVisOnlyDoc",
    "isWf",
    "isWfReadOnly",
    "numPages",
    "opsFromList",
    "originalFileName",
    "procWF",
    "progressive",
    "signedExtension",
    "status",
    "streamId",
    "streamIdShared",
    "timeStampFormat",
    "userIdModifying"
})
public class Card {

    @XmlElement(name = "Additives", nillable = true)
    protected ArrayOfAdditive additives;
    @XmlElement(name = "ArchiveId")
    protected Short archiveId;
    @XmlElement(name = "CardExpiration", nillable = true)
    protected CardExpirationInfo cardExpiration;
    @XmlElement(name = "CardId")
    protected String cardId;
    @XmlElement(name = "CardProg")
    protected Long cardProg;
    @XmlElement(name = "ComputerizedClassification", nillable = true)
    protected String computerizedClassification;
    @XmlElement(name = "ComputerizedFolder", nillable = true)
    protected String computerizedFolder;
    @XmlElement(name = "DocStatus")
    protected DocumentStatus docStatus;
    @XmlElement(name = "DocumentExtension", nillable = true)
    protected String documentExtension;
    @XmlElement(name = "DocumentTypeId")
    protected Short documentTypeId;
    @XmlElement(name = "EncryptedCardId", nillable = true)
    protected String encryptedCardId;
    @XmlElement(name = "ExternMailNotification", nillable = true)
    protected ExternNotification externMailNotification;
    @XmlElement(name = "ExternMailNotificationXML", nillable = true)
    protected String externMailNotificationXML;
    @XmlElement(name = "HasAdditionalData")
    protected Boolean hasAdditionalData;
    @XmlElement(name = "HasAttachment")
    protected Boolean hasAttachment;
    @XmlElement(name = "HasComputerizedClassification")
    protected Boolean hasComputerizedClassification;
    @XmlElement(name = "HasComputerizedFolder")
    protected Boolean hasComputerizedFolder;
    @XmlElement(name = "HasData", nillable = true)
    protected CardHasData hasData;
    @XmlElement(name = "HasDocument")
    protected Boolean hasDocument;
    @XmlElement(name = "HasFolder")
    protected Boolean hasFolder;
    @XmlElement(name = "HasKeyVersions")
    protected Boolean hasKeyVersions;
    @XmlElement(name = "HasNotes")
    protected Boolean hasNotes;
    @XmlElement(name = "HasPartialInvalidations")
    protected Boolean hasPartialInvalidations;
    @XmlElement(name = "Indexes", nillable = true)
    protected ArrayOfField indexes;
    @XmlElement(name = "InvalidateAnnotation", nillable = true)
    protected Annotation invalidateAnnotation;
    @XmlElement(name = "Invoice", nillable = true)
    protected InvoiceBase invoice;
    @XmlElement(name = "IsCC")
    protected Boolean isCC;
    @XmlElement(name = "IsCurrUserVisDoc")
    protected Boolean isCurrUserVisDoc;
    @XmlElement(name = "IsDocumentLocked")
    protected Boolean isDocumentLocked;
    @XmlElement(name = "IsMainDocSignRequired")
    protected Boolean isMainDocSignRequired;
    @XmlElement(name = "IsReadOnly")
    protected Boolean isReadOnly;
    @XmlElement(name = "IsSigned")
    protected Boolean isSigned;
    @XmlElement(name = "IsSignedPdf")
    protected Boolean isSignedPdf;
    @XmlElement(name = "IsSignedXml")
    protected Boolean isSignedXml;
    @XmlElement(name = "IsSorted")
    protected Boolean isSorted;
    @XmlElement(name = "IsStoredProtocol")
    protected Boolean isStoredProtocol;
    @XmlElement(name = "IsValid")
    protected Boolean isValid;
    @XmlElement(name = "IsVisOnlyDoc")
    protected Boolean isVisOnlyDoc;
    @XmlElement(name = "IsWf")
    protected Boolean isWf;
    @XmlElement(name = "IsWfReadOnly")
    protected Boolean isWfReadOnly;
    @XmlElement(name = "NumPages")
    protected Integer numPages;
    @XmlElement(name = "OpsFromList", nillable = true)
    protected CardOperationsFromList opsFromList;
    @XmlElement(name = "OriginalFileName", nillable = true)
    protected String originalFileName;
    @XmlElement(name = "ProcWF")
    protected ProcWF procWF;
    @XmlElement(name = "Progressive", nillable = true)
    protected String progressive;
    @XmlElement(name = "SignedExtension", nillable = true)
    protected String signedExtension;
    @XmlElement(name = "Status")
    protected CardStatus status;
    @XmlElement(name = "StreamId", nillable = true)
    protected String streamId;
    @XmlElement(name = "StreamIdShared", nillable = true)
    protected String streamIdShared;
    @XmlElement(name = "TimeStampFormat")
    protected TimeStampFileFormat timeStampFormat;
    @XmlElement(name = "UserIdModifying")
    protected Integer userIdModifying;

    /**
     * Gets the value of the additives property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdditive }
     *     
     */
    public ArrayOfAdditive getAdditives() {
        return additives;
    }

    /**
     * Sets the value of the additives property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdditive }
     *     
     */
    public void setAdditives(ArrayOfAdditive value) {
        this.additives = value;
    }

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
     * Gets the value of the cardExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link CardExpirationInfo }
     *     
     */
    public CardExpirationInfo getCardExpiration() {
        return cardExpiration;
    }

    /**
     * Sets the value of the cardExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardExpirationInfo }
     *     
     */
    public void setCardExpiration(CardExpirationInfo value) {
        this.cardExpiration = value;
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
     * Gets the value of the cardProg property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCardProg() {
        return cardProg;
    }

    /**
     * Sets the value of the cardProg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCardProg(Long value) {
        this.cardProg = value;
    }

    /**
     * Gets the value of the computerizedClassification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComputerizedClassification() {
        return computerizedClassification;
    }

    /**
     * Sets the value of the computerizedClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComputerizedClassification(String value) {
        this.computerizedClassification = value;
    }

    /**
     * Gets the value of the computerizedFolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComputerizedFolder() {
        return computerizedFolder;
    }

    /**
     * Sets the value of the computerizedFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComputerizedFolder(String value) {
        this.computerizedFolder = value;
    }

    /**
     * Gets the value of the docStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentStatus }
     *     
     */
    public DocumentStatus getDocStatus() {
        return docStatus;
    }

    /**
     * Sets the value of the docStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentStatus }
     *     
     */
    public void setDocStatus(DocumentStatus value) {
        this.docStatus = value;
    }

    /**
     * Gets the value of the documentExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentExtension() {
        return documentExtension;
    }

    /**
     * Sets the value of the documentExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentExtension(String value) {
        this.documentExtension = value;
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
     * Gets the value of the encryptedCardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptedCardId() {
        return encryptedCardId;
    }

    /**
     * Sets the value of the encryptedCardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptedCardId(String value) {
        this.encryptedCardId = value;
    }

    /**
     * Gets the value of the externMailNotification property.
     * 
     * @return
     *     possible object is
     *     {@link ExternNotification }
     *     
     */
    public ExternNotification getExternMailNotification() {
        return externMailNotification;
    }

    /**
     * Sets the value of the externMailNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternNotification }
     *     
     */
    public void setExternMailNotification(ExternNotification value) {
        this.externMailNotification = value;
    }

    /**
     * Gets the value of the externMailNotificationXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternMailNotificationXML() {
        return externMailNotificationXML;
    }

    /**
     * Sets the value of the externMailNotificationXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternMailNotificationXML(String value) {
        this.externMailNotificationXML = value;
    }

    /**
     * Gets the value of the hasAdditionalData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasAdditionalData() {
        return hasAdditionalData;
    }

    /**
     * Sets the value of the hasAdditionalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAdditionalData(Boolean value) {
        this.hasAdditionalData = value;
    }

    /**
     * Gets the value of the hasAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasAttachment() {
        return hasAttachment;
    }

    /**
     * Sets the value of the hasAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAttachment(Boolean value) {
        this.hasAttachment = value;
    }

    /**
     * Gets the value of the hasComputerizedClassification property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasComputerizedClassification() {
        return hasComputerizedClassification;
    }

    /**
     * Sets the value of the hasComputerizedClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasComputerizedClassification(Boolean value) {
        this.hasComputerizedClassification = value;
    }

    /**
     * Gets the value of the hasComputerizedFolder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasComputerizedFolder() {
        return hasComputerizedFolder;
    }

    /**
     * Sets the value of the hasComputerizedFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasComputerizedFolder(Boolean value) {
        this.hasComputerizedFolder = value;
    }

    /**
     * Gets the value of the hasData property.
     * 
     * @return
     *     possible object is
     *     {@link CardHasData }
     *     
     */
    public CardHasData getHasData() {
        return hasData;
    }

    /**
     * Sets the value of the hasData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardHasData }
     *     
     */
    public void setHasData(CardHasData value) {
        this.hasData = value;
    }

    /**
     * Gets the value of the hasDocument property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasDocument() {
        return hasDocument;
    }

    /**
     * Sets the value of the hasDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasDocument(Boolean value) {
        this.hasDocument = value;
    }

    /**
     * Gets the value of the hasFolder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasFolder() {
        return hasFolder;
    }

    /**
     * Sets the value of the hasFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasFolder(Boolean value) {
        this.hasFolder = value;
    }

    /**
     * Gets the value of the hasKeyVersions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasKeyVersions() {
        return hasKeyVersions;
    }

    /**
     * Sets the value of the hasKeyVersions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasKeyVersions(Boolean value) {
        this.hasKeyVersions = value;
    }

    /**
     * Gets the value of the hasNotes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasNotes() {
        return hasNotes;
    }

    /**
     * Sets the value of the hasNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasNotes(Boolean value) {
        this.hasNotes = value;
    }

    /**
     * Gets the value of the hasPartialInvalidations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasPartialInvalidations() {
        return hasPartialInvalidations;
    }

    /**
     * Sets the value of the hasPartialInvalidations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasPartialInvalidations(Boolean value) {
        this.hasPartialInvalidations = value;
    }

    /**
     * Gets the value of the indexes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfField }
     *     
     */
    public ArrayOfField getIndexes() {
        return indexes;
    }

    /**
     * Sets the value of the indexes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfField }
     *     
     */
    public void setIndexes(ArrayOfField value) {
        this.indexes = value;
    }

    /**
     * Gets the value of the invalidateAnnotation property.
     * 
     * @return
     *     possible object is
     *     {@link Annotation }
     *     
     */
    public Annotation getInvalidateAnnotation() {
        return invalidateAnnotation;
    }

    /**
     * Sets the value of the invalidateAnnotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Annotation }
     *     
     */
    public void setInvalidateAnnotation(Annotation value) {
        this.invalidateAnnotation = value;
    }

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceBase }
     *     
     */
    public InvoiceBase getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceBase }
     *     
     */
    public void setInvoice(InvoiceBase value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the isCC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCC() {
        return isCC;
    }

    /**
     * Sets the value of the isCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCC(Boolean value) {
        this.isCC = value;
    }

    /**
     * Gets the value of the isCurrUserVisDoc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCurrUserVisDoc() {
        return isCurrUserVisDoc;
    }

    /**
     * Sets the value of the isCurrUserVisDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCurrUserVisDoc(Boolean value) {
        this.isCurrUserVisDoc = value;
    }

    /**
     * Gets the value of the isDocumentLocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDocumentLocked() {
        return isDocumentLocked;
    }

    /**
     * Sets the value of the isDocumentLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDocumentLocked(Boolean value) {
        this.isDocumentLocked = value;
    }

    /**
     * Gets the value of the isMainDocSignRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMainDocSignRequired() {
        return isMainDocSignRequired;
    }

    /**
     * Sets the value of the isMainDocSignRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMainDocSignRequired(Boolean value) {
        this.isMainDocSignRequired = value;
    }

    /**
     * Gets the value of the isReadOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReadOnly() {
        return isReadOnly;
    }

    /**
     * Sets the value of the isReadOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReadOnly(Boolean value) {
        this.isReadOnly = value;
    }

    /**
     * Gets the value of the isSigned property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSigned() {
        return isSigned;
    }

    /**
     * Sets the value of the isSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSigned(Boolean value) {
        this.isSigned = value;
    }

    /**
     * Gets the value of the isSignedPdf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSignedPdf() {
        return isSignedPdf;
    }

    /**
     * Sets the value of the isSignedPdf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSignedPdf(Boolean value) {
        this.isSignedPdf = value;
    }

    /**
     * Gets the value of the isSignedXml property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSignedXml() {
        return isSignedXml;
    }

    /**
     * Sets the value of the isSignedXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSignedXml(Boolean value) {
        this.isSignedXml = value;
    }

    /**
     * Gets the value of the isSorted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSorted() {
        return isSorted;
    }

    /**
     * Sets the value of the isSorted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSorted(Boolean value) {
        this.isSorted = value;
    }

    /**
     * Gets the value of the isStoredProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStoredProtocol() {
        return isStoredProtocol;
    }

    /**
     * Sets the value of the isStoredProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStoredProtocol(Boolean value) {
        this.isStoredProtocol = value;
    }

    /**
     * Gets the value of the isValid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsValid() {
        return isValid;
    }

    /**
     * Sets the value of the isValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsValid(Boolean value) {
        this.isValid = value;
    }

    /**
     * Gets the value of the isVisOnlyDoc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsVisOnlyDoc() {
        return isVisOnlyDoc;
    }

    /**
     * Sets the value of the isVisOnlyDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsVisOnlyDoc(Boolean value) {
        this.isVisOnlyDoc = value;
    }

    /**
     * Gets the value of the isWf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsWf() {
        return isWf;
    }

    /**
     * Sets the value of the isWf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsWf(Boolean value) {
        this.isWf = value;
    }

    /**
     * Gets the value of the isWfReadOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsWfReadOnly() {
        return isWfReadOnly;
    }

    /**
     * Sets the value of the isWfReadOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsWfReadOnly(Boolean value) {
        this.isWfReadOnly = value;
    }

    /**
     * Gets the value of the numPages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumPages() {
        return numPages;
    }

    /**
     * Sets the value of the numPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumPages(Integer value) {
        this.numPages = value;
    }

    /**
     * Gets the value of the opsFromList property.
     * 
     * @return
     *     possible object is
     *     {@link CardOperationsFromList }
     *     
     */
    public CardOperationsFromList getOpsFromList() {
        return opsFromList;
    }

    /**
     * Sets the value of the opsFromList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardOperationsFromList }
     *     
     */
    public void setOpsFromList(CardOperationsFromList value) {
        this.opsFromList = value;
    }

    /**
     * Gets the value of the originalFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalFileName() {
        return originalFileName;
    }

    /**
     * Sets the value of the originalFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalFileName(String value) {
        this.originalFileName = value;
    }

    /**
     * Gets the value of the procWF property.
     * 
     * @return
     *     possible object is
     *     {@link ProcWF }
     *     
     */
    public ProcWF getProcWF() {
        return procWF;
    }

    /**
     * Sets the value of the procWF property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcWF }
     *     
     */
    public void setProcWF(ProcWF value) {
        this.procWF = value;
    }

    /**
     * Gets the value of the progressive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgressive() {
        return progressive;
    }

    /**
     * Sets the value of the progressive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgressive(String value) {
        this.progressive = value;
    }

    /**
     * Gets the value of the signedExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignedExtension() {
        return signedExtension;
    }

    /**
     * Sets the value of the signedExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignedExtension(String value) {
        this.signedExtension = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CardStatus }
     *     
     */
    public CardStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardStatus }
     *     
     */
    public void setStatus(CardStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the streamId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreamId() {
        return streamId;
    }

    /**
     * Sets the value of the streamId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreamId(String value) {
        this.streamId = value;
    }

    /**
     * Gets the value of the streamIdShared property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreamIdShared() {
        return streamIdShared;
    }

    /**
     * Sets the value of the streamIdShared property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreamIdShared(String value) {
        this.streamIdShared = value;
    }

    /**
     * Gets the value of the timeStampFormat property.
     * 
     * @return
     *     possible object is
     *     {@link TimeStampFileFormat }
     *     
     */
    public TimeStampFileFormat getTimeStampFormat() {
        return timeStampFormat;
    }

    /**
     * Sets the value of the timeStampFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeStampFileFormat }
     *     
     */
    public void setTimeStampFormat(TimeStampFileFormat value) {
        this.timeStampFormat = value;
    }

    /**
     * Gets the value of the userIdModifying property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserIdModifying() {
        return userIdModifying;
    }

    /**
     * Sets the value of the userIdModifying property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserIdModifying(Integer value) {
        this.userIdModifying = value;
    }

}
