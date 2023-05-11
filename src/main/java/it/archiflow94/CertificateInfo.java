
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CertificateInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CertificateInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Attributes" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Sign.ValueObject}ArrayOfAttributeType" minOccurs="0"/>
 *         &lt;element name="Certificate" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="Errors" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="Extensions" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Sign.ValueObject}ArrayOfAttributeType" minOccurs="0"/>
 *         &lt;element name="Issuer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KeyUsage" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Sign.ValueObject}ArrayOfAttributeType" minOccurs="0"/>
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidityFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ValidityTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Verify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateInfo", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Sign.ValueObject", propOrder = {
    "attributes",
    "certificate",
    "errors",
    "extensions",
    "issuer",
    "keyUsage",
    "serialNumber",
    "subject",
    "validityFrom",
    "validityTo",
    "verify"
})
public class CertificateInfo {

    @XmlElement(name = "Attributes", nillable = true)
    protected ArrayOfAttributeType attributes;
    @XmlElement(name = "Certificate", nillable = true)
    protected byte[] certificate;
    @XmlElement(name = "Errors", nillable = true)
    protected ArrayOfstring errors;
    @XmlElement(name = "Extensions", nillable = true)
    protected ArrayOfAttributeType extensions;
    @XmlElement(name = "Issuer", nillable = true)
    protected String issuer;
    @XmlElement(name = "KeyUsage", nillable = true)
    protected ArrayOfAttributeType keyUsage;
    @XmlElement(name = "SerialNumber", nillable = true)
    protected String serialNumber;
    @XmlElement(name = "Subject", nillable = true)
    protected String subject;
    @XmlElement(name = "ValidityFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validityFrom;
    @XmlElement(name = "ValidityTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validityTo;
    @XmlElement(name = "Verify")
    protected Boolean verify;

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttributeType }
     *     
     */
    public ArrayOfAttributeType getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttributeType }
     *     
     */
    public void setAttributes(ArrayOfAttributeType value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the certificate property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCertificate() {
        return certificate;
    }

    /**
     * Sets the value of the certificate property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCertificate(byte[] value) {
        this.certificate = ((byte[]) value);
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setErrors(ArrayOfstring value) {
        this.errors = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttributeType }
     *     
     */
    public ArrayOfAttributeType getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttributeType }
     *     
     */
    public void setExtensions(ArrayOfAttributeType value) {
        this.extensions = value;
    }

    /**
     * Gets the value of the issuer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * Sets the value of the issuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuer(String value) {
        this.issuer = value;
    }

    /**
     * Gets the value of the keyUsage property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttributeType }
     *     
     */
    public ArrayOfAttributeType getKeyUsage() {
        return keyUsage;
    }

    /**
     * Sets the value of the keyUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttributeType }
     *     
     */
    public void setKeyUsage(ArrayOfAttributeType value) {
        this.keyUsage = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the validityFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidityFrom() {
        return validityFrom;
    }

    /**
     * Sets the value of the validityFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidityFrom(XMLGregorianCalendar value) {
        this.validityFrom = value;
    }

    /**
     * Gets the value of the validityTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidityTo() {
        return validityTo;
    }

    /**
     * Sets the value of the validityTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidityTo(XMLGregorianCalendar value) {
        this.validityTo = value;
    }

    /**
     * Gets the value of the verify property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVerify() {
        return verify;
    }

    /**
     * Sets the value of the verify property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVerify(Boolean value) {
        this.verify = value;
    }

}
