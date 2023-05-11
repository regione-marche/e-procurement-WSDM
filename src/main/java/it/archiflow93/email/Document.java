
package it.archiflow93.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateModify" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DisplayType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}FileTypes" minOccurs="0"/>
 *         &lt;element name="DocDigest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentFullExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentGuid" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="DocumentTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsReadOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSigned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSignedPdf" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSignedXml" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsTimeStamp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NumPages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OriginalFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SignedExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeStampFormat" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}TimeStampFileFormat" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WarningExtensionOff" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "cardId",
    "content",
    "contentType",
    "dateModify",
    "displayType",
    "docDigest",
    "documentExtension",
    "documentFullExtension",
    "documentGuid",
    "documentTitle",
    "fileSize",
    "isLocked",
    "isReadOnly",
    "isSigned",
    "isSignedPdf",
    "isSignedXml",
    "isTimeStamp",
    "numPages",
    "originalFileName",
    "signedExtension",
    "timeStampFormat",
    "version",
    "warningExtensionOff"
})
public class Document {

    @XmlElement(name = "CardId")
    protected String cardId;
    @XmlElement(name = "Content", nillable = true)
    protected String content;
    @XmlElement(name = "ContentType", nillable = true)
    protected String contentType;
    @XmlElement(name = "DateModify", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateModify;
    @XmlElement(name = "DisplayType")
    protected FileTypes displayType;
    @XmlElement(name = "DocDigest", nillable = true)
    protected String docDigest;
    @XmlElement(name = "DocumentExtension", nillable = true)
    protected String documentExtension;
    @XmlElement(name = "DocumentFullExtension", nillable = true)
    protected String documentFullExtension;
    @XmlElement(name = "DocumentGuid")
    protected String documentGuid;
    @XmlElement(name = "DocumentTitle", nillable = true)
    protected String documentTitle;
    @XmlElement(name = "FileSize")
    protected Integer fileSize;
    @XmlElement(name = "IsLocked")
    protected Boolean isLocked;
    @XmlElement(name = "IsReadOnly")
    protected Boolean isReadOnly;
    @XmlElement(name = "IsSigned")
    protected Boolean isSigned;
    @XmlElement(name = "IsSignedPdf")
    protected Boolean isSignedPdf;
    @XmlElement(name = "IsSignedXml")
    protected Boolean isSignedXml;
    @XmlElement(name = "IsTimeStamp")
    protected Boolean isTimeStamp;
    @XmlElement(name = "NumPages")
    protected Integer numPages;
    @XmlElement(name = "OriginalFileName", nillable = true)
    protected String originalFileName;
    @XmlElement(name = "SignedExtension", nillable = true)
    protected String signedExtension;
    @XmlElement(name = "TimeStampFormat")
    protected TimeStampFileFormat timeStampFormat;
    @XmlElement(name = "Version")
    protected Integer version;
    @XmlElement(name = "WarningExtensionOff")
    protected Boolean warningExtensionOff;

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
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the dateModify property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateModify() {
        return dateModify;
    }

    /**
     * Sets the value of the dateModify property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateModify(XMLGregorianCalendar value) {
        this.dateModify = value;
    }

    /**
     * Gets the value of the displayType property.
     * 
     * @return
     *     possible object is
     *     {@link FileTypes }
     *     
     */
    public FileTypes getDisplayType() {
        return displayType;
    }

    /**
     * Sets the value of the displayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileTypes }
     *     
     */
    public void setDisplayType(FileTypes value) {
        this.displayType = value;
    }

    /**
     * Gets the value of the docDigest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocDigest() {
        return docDigest;
    }

    /**
     * Sets the value of the docDigest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocDigest(String value) {
        this.docDigest = value;
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
     * Gets the value of the documentFullExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentFullExtension() {
        return documentFullExtension;
    }

    /**
     * Sets the value of the documentFullExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentFullExtension(String value) {
        this.documentFullExtension = value;
    }

    /**
     * Gets the value of the documentGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentGuid() {
        return documentGuid;
    }

    /**
     * Sets the value of the documentGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentGuid(String value) {
        this.documentGuid = value;
    }

    /**
     * Gets the value of the documentTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentTitle() {
        return documentTitle;
    }

    /**
     * Sets the value of the documentTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentTitle(String value) {
        this.documentTitle = value;
    }

    /**
     * Gets the value of the fileSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFileSize() {
        return fileSize;
    }

    /**
     * Sets the value of the fileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFileSize(Integer value) {
        this.fileSize = value;
    }

    /**
     * Gets the value of the isLocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLocked() {
        return isLocked;
    }

    /**
     * Sets the value of the isLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLocked(Boolean value) {
        this.isLocked = value;
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
     * Gets the value of the isTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTimeStamp() {
        return isTimeStamp;
    }

    /**
     * Sets the value of the isTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTimeStamp(Boolean value) {
        this.isTimeStamp = value;
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
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVersion(Integer value) {
        this.version = value;
    }

    /**
     * Gets the value of the warningExtensionOff property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWarningExtensionOff() {
        return warningExtensionOff;
    }

    /**
     * Sets the value of the warningExtensionOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWarningExtensionOff(Boolean value) {
        this.warningExtensionOff = value;
    }

}
