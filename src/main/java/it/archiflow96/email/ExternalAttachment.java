
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalAttachment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalAttachment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}Attachment">
 *       &lt;sequence>
 *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Digest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsInInvoiceXML" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsInteroperability" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSigned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSignedPdf" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSignedXml" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsTimeStamp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SignedExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="TimeStampFormat" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}TimeStampFileFormat" minOccurs="0"/>
 *         &lt;element name="VolumeID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WarningExtensionOff" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalAttachment", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "content",
    "contentType",
    "digest",
    "extension",
    "isInInvoiceXML",
    "isInteroperability",
    "isSigned",
    "isSignedPdf",
    "isSignedXml",
    "isTimeStamp",
    "signedExtension",
    "size",
    "timeStampFormat",
    "volumeID",
    "warningExtensionOff"
})
public class ExternalAttachment
    extends Attachment
{

    @XmlElement(name = "Content", nillable = true)
    protected String content;
    @XmlElement(name = "ContentType", nillable = true)
    protected String contentType;
    @XmlElement(name = "Digest", nillable = true)
    protected String digest;
    @XmlElement(name = "Extension", nillable = true)
    protected String extension;
    @XmlElement(name = "IsInInvoiceXML")
    protected Boolean isInInvoiceXML;
    @XmlElement(name = "IsInteroperability")
    protected Boolean isInteroperability;
    @XmlElement(name = "IsSigned")
    protected Boolean isSigned;
    @XmlElement(name = "IsSignedPdf")
    protected Boolean isSignedPdf;
    @XmlElement(name = "IsSignedXml")
    protected Boolean isSignedXml;
    @XmlElement(name = "IsTimeStamp")
    protected Boolean isTimeStamp;
    @XmlElement(name = "SignedExtension", nillable = true)
    protected String signedExtension;
    @XmlElement(name = "Size")
    @XmlSchemaType(name = "unsignedInt")
    protected Long size;
    @XmlElement(name = "TimeStampFormat")
    protected TimeStampFileFormat timeStampFormat;
    @XmlElement(name = "VolumeID")
    protected Integer volumeID;
    @XmlElement(name = "WarningExtensionOff")
    protected Boolean warningExtensionOff;

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
     * Gets the value of the digest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigest() {
        return digest;
    }

    /**
     * Sets the value of the digest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigest(String value) {
        this.digest = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * Gets the value of the isInInvoiceXML property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInInvoiceXML() {
        return isInInvoiceXML;
    }

    /**
     * Sets the value of the isInInvoiceXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInInvoiceXML(Boolean value) {
        this.isInInvoiceXML = value;
    }

    /**
     * Gets the value of the isInteroperability property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInteroperability() {
        return isInteroperability;
    }

    /**
     * Sets the value of the isInteroperability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInteroperability(Boolean value) {
        this.isInteroperability = value;
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
     * Gets the value of the volumeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVolumeID() {
        return volumeID;
    }

    /**
     * Sets the value of the volumeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVolumeID(Integer value) {
        this.volumeID = value;
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
