
package it.archiflow96;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SendingSearchCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendingSearchCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Category" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}ArrayOfSendingCategory" minOccurs="0"/>
 *         &lt;element name="CreatedByCurrUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CreationTimeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreationTimeTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DescendingOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MailBoxOutId" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="NotCensusAddresses" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="OfficesIdSent" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="OrderBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Recipients" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject}AgrafSearchCriteria" minOccurs="0"/>
 *         &lt;element name="SentByCurrUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SentTimeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SentTimeTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}SendingStatus" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendingSearchCriteria", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", propOrder = {
    "category",
    "createdByCurrUser",
    "creationTimeFrom",
    "creationTimeTo",
    "descendingOrder",
    "mailBoxOutId",
    "notCensusAddresses",
    "officesIdSent",
    "orderBy",
    "recipients",
    "sentByCurrUser",
    "sentTimeFrom",
    "sentTimeTo",
    "status",
    "subject"
})
public class SendingSearchCriteria {

    @XmlElement(name = "Category", nillable = true)
    protected ArrayOfSendingCategory category;
    @XmlElement(name = "CreatedByCurrUser")
    protected Boolean createdByCurrUser;
    @XmlElement(name = "CreationTimeFrom", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationTimeFrom;
    @XmlElement(name = "CreationTimeTo", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationTimeTo;
    @XmlElement(name = "DescendingOrder")
    protected Boolean descendingOrder;
    @XmlElement(name = "MailBoxOutId", nillable = true)
    protected ArrayOfint mailBoxOutId;
    @XmlElement(name = "NotCensusAddresses", nillable = true)
    protected ArrayOfstring notCensusAddresses;
    @XmlElement(name = "OfficesIdSent", nillable = true)
    protected ArrayOfint officesIdSent;
    @XmlElement(name = "OrderBy", nillable = true)
    protected String orderBy;
    @XmlElement(name = "Recipients", nillable = true)
    protected AgrafSearchCriteria recipients;
    @XmlElement(name = "SentByCurrUser")
    protected Boolean sentByCurrUser;
    @XmlElement(name = "SentTimeFrom", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sentTimeFrom;
    @XmlElement(name = "SentTimeTo", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sentTimeTo;
    @XmlElement(name = "Status")
    protected SendingStatus status;
    @XmlElement(name = "Subject", nillable = true)
    protected String subject;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSendingCategory }
     *     
     */
    public ArrayOfSendingCategory getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSendingCategory }
     *     
     */
    public void setCategory(ArrayOfSendingCategory value) {
        this.category = value;
    }

    /**
     * Gets the value of the createdByCurrUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreatedByCurrUser() {
        return createdByCurrUser;
    }

    /**
     * Sets the value of the createdByCurrUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreatedByCurrUser(Boolean value) {
        this.createdByCurrUser = value;
    }

    /**
     * Gets the value of the creationTimeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationTimeFrom() {
        return creationTimeFrom;
    }

    /**
     * Sets the value of the creationTimeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationTimeFrom(XMLGregorianCalendar value) {
        this.creationTimeFrom = value;
    }

    /**
     * Gets the value of the creationTimeTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationTimeTo() {
        return creationTimeTo;
    }

    /**
     * Sets the value of the creationTimeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationTimeTo(XMLGregorianCalendar value) {
        this.creationTimeTo = value;
    }

    /**
     * Gets the value of the descendingOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDescendingOrder() {
        return descendingOrder;
    }

    /**
     * Sets the value of the descendingOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDescendingOrder(Boolean value) {
        this.descendingOrder = value;
    }

    /**
     * Gets the value of the mailBoxOutId property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getMailBoxOutId() {
        return mailBoxOutId;
    }

    /**
     * Sets the value of the mailBoxOutId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setMailBoxOutId(ArrayOfint value) {
        this.mailBoxOutId = value;
    }

    /**
     * Gets the value of the notCensusAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getNotCensusAddresses() {
        return notCensusAddresses;
    }

    /**
     * Sets the value of the notCensusAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setNotCensusAddresses(ArrayOfstring value) {
        this.notCensusAddresses = value;
    }

    /**
     * Gets the value of the officesIdSent property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getOfficesIdSent() {
        return officesIdSent;
    }

    /**
     * Sets the value of the officesIdSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setOfficesIdSent(ArrayOfint value) {
        this.officesIdSent = value;
    }

    /**
     * Gets the value of the orderBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * Sets the value of the orderBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderBy(String value) {
        this.orderBy = value;
    }

    /**
     * Gets the value of the recipients property.
     * 
     * @return
     *     possible object is
     *     {@link AgrafSearchCriteria }
     *     
     */
    public AgrafSearchCriteria getRecipients() {
        return recipients;
    }

    /**
     * Sets the value of the recipients property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgrafSearchCriteria }
     *     
     */
    public void setRecipients(AgrafSearchCriteria value) {
        this.recipients = value;
    }

    /**
     * Gets the value of the sentByCurrUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSentByCurrUser() {
        return sentByCurrUser;
    }

    /**
     * Sets the value of the sentByCurrUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSentByCurrUser(Boolean value) {
        this.sentByCurrUser = value;
    }

    /**
     * Gets the value of the sentTimeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSentTimeFrom() {
        return sentTimeFrom;
    }

    /**
     * Sets the value of the sentTimeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSentTimeFrom(XMLGregorianCalendar value) {
        this.sentTimeFrom = value;
    }

    /**
     * Gets the value of the sentTimeTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSentTimeTo() {
        return sentTimeTo;
    }

    /**
     * Sets the value of the sentTimeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSentTimeTo(XMLGregorianCalendar value) {
        this.sentTimeTo = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link SendingStatus }
     *     
     */
    public SendingStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendingStatus }
     *     
     */
    public void setStatus(SendingStatus value) {
        this.status = value;
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

}
