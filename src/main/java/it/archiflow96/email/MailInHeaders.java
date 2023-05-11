
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MailInHeaders complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MailInHeaders">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CC" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}ArrayOfMailAddress" minOccurs="0"/>
 *         &lt;element name="EMailType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}EMailType" minOccurs="0"/>
 *         &lt;element name="From" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}MailAddress" minOccurs="0"/>
 *         &lt;element name="MsgIdentifier" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}MessageIdentifier" minOccurs="0"/>
 *         &lt;element name="ReceiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SendDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="To" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}ArrayOfMailAddress" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailInHeaders", propOrder = {
    "cc",
    "eMailType",
    "from",
    "msgIdentifier",
    "receiveDate",
    "sendDate",
    "subject",
    "to"
})
@XmlSeeAlso({
    MailIn.class
})
public class MailInHeaders {

    @XmlElement(name = "CC", nillable = true)
    protected ArrayOfMailAddress cc;
    @XmlElement(name = "EMailType")
    protected EMailType eMailType;
    @XmlElement(name = "From", nillable = true)
    protected MailAddress from;
    @XmlElement(name = "MsgIdentifier", nillable = true)
    protected MessageIdentifier msgIdentifier;
    @XmlElement(name = "ReceiveDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receiveDate;
    @XmlElement(name = "SendDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sendDate;
    @XmlElement(name = "Subject", nillable = true)
    protected String subject;
    @XmlElement(name = "To", nillable = true)
    protected ArrayOfMailAddress to;

    /**
     * Gets the value of the cc property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMailAddress }
     *     
     */
    public ArrayOfMailAddress getCC() {
        return cc;
    }

    /**
     * Sets the value of the cc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMailAddress }
     *     
     */
    public void setCC(ArrayOfMailAddress value) {
        this.cc = value;
    }

    /**
     * Gets the value of the eMailType property.
     * 
     * @return
     *     possible object is
     *     {@link EMailType }
     *     
     */
    public EMailType getEMailType() {
        return eMailType;
    }

    /**
     * Sets the value of the eMailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMailType }
     *     
     */
    public void setEMailType(EMailType value) {
        this.eMailType = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link MailAddress }
     *     
     */
    public MailAddress getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailAddress }
     *     
     */
    public void setFrom(MailAddress value) {
        this.from = value;
    }

    /**
     * Gets the value of the msgIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentifier }
     *     
     */
    public MessageIdentifier getMsgIdentifier() {
        return msgIdentifier;
    }

    /**
     * Sets the value of the msgIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentifier }
     *     
     */
    public void setMsgIdentifier(MessageIdentifier value) {
        this.msgIdentifier = value;
    }

    /**
     * Gets the value of the receiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceiveDate() {
        return receiveDate;
    }

    /**
     * Sets the value of the receiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceiveDate(XMLGregorianCalendar value) {
        this.receiveDate = value;
    }

    /**
     * Gets the value of the sendDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSendDate() {
        return sendDate;
    }

    /**
     * Sets the value of the sendDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSendDate(XMLGregorianCalendar value) {
        this.sendDate = value;
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
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMailAddress }
     *     
     */
    public ArrayOfMailAddress getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMailAddress }
     *     
     */
    public void setTo(ArrayOfMailAddress value) {
        this.to = value;
    }

}
