
package it.archiflow96;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Sending complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Sending">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddAllAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AddMainDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Body" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="Category" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}SendingCategory" minOccurs="0"/>
 *         &lt;element name="CreatingChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DelayedDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DeliverNotBefore" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IsSent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MessageId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Messages" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject}ArrayOfMessage" minOccurs="0"/>
 *         &lt;element name="OfficeCreate" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}Office" minOccurs="0"/>
 *         &lt;element name="OfficeSent" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}Office" minOccurs="0"/>
 *         &lt;element name="ParentCardId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="ParentSendingId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Recipients" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject}ArrayOfRecipient" minOccurs="0"/>
 *         &lt;element name="SendPriority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SendingId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SentTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}SendingStatus" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserCreate" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}User" minOccurs="0"/>
 *         &lt;element name="UserSent" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}User" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sending", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", propOrder = {
    "addAllAttachments",
    "addMainDocument",
    "body",
    "cardId",
    "category",
    "creatingChannel",
    "creationTime",
    "delayedDelivery",
    "deliverNotBefore",
    "isSent",
    "messageId",
    "messages",
    "officeCreate",
    "officeSent",
    "parentCardId",
    "parentSendingId",
    "recipients",
    "sendPriority",
    "sendingId",
    "sentTime",
    "status",
    "subject",
    "userCreate",
    "userSent"
})
public class Sending {

    @XmlElement(name = "AddAllAttachments")
    protected Boolean addAllAttachments;
    @XmlElement(name = "AddMainDocument")
    protected Boolean addMainDocument;
    @XmlElement(name = "Body", nillable = true)
    protected String body;
    @XmlElement(name = "CardId")
    protected String cardId;
    @XmlElement(name = "Category")
    protected SendingCategory category;
    @XmlElement(name = "CreatingChannel", nillable = true)
    protected String creatingChannel;
    @XmlElement(name = "CreationTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationTime;
    @XmlElement(name = "DelayedDelivery")
    protected Boolean delayedDelivery;
    @XmlElement(name = "DeliverNotBefore", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliverNotBefore;
    @XmlElement(name = "IsSent")
    protected Boolean isSent;
    @XmlElement(name = "MessageId")
    protected BigDecimal messageId;
    @XmlElement(name = "Messages", nillable = true)
    protected ArrayOfMessage messages;
    @XmlElement(name = "OfficeCreate", nillable = true)
    protected Office officeCreate;
    @XmlElement(name = "OfficeSent", nillable = true)
    protected Office officeSent;
    @XmlElement(name = "ParentCardId")
    protected String parentCardId;
    @XmlElement(name = "ParentSendingId")
    protected BigDecimal parentSendingId;
    @XmlElement(name = "Recipients", nillable = true)
    protected ArrayOfRecipient recipients;
    @XmlElement(name = "SendPriority")
    protected Integer sendPriority;
    @XmlElement(name = "SendingId")
    protected Integer sendingId;
    @XmlElement(name = "SentTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sentTime;
    @XmlElement(name = "Status")
    protected SendingStatus status;
    @XmlElement(name = "Subject", nillable = true)
    protected String subject;
    @XmlElement(name = "UserCreate", nillable = true)
    protected User userCreate;
    @XmlElement(name = "UserSent", nillable = true)
    protected User userSent;

    /**
     * Gets the value of the addAllAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddAllAttachments() {
        return addAllAttachments;
    }

    /**
     * Sets the value of the addAllAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddAllAttachments(Boolean value) {
        this.addAllAttachments = value;
    }

    /**
     * Gets the value of the addMainDocument property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddMainDocument() {
        return addMainDocument;
    }

    /**
     * Sets the value of the addMainDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddMainDocument(Boolean value) {
        this.addMainDocument = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBody(String value) {
        this.body = value;
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
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link SendingCategory }
     *     
     */
    public SendingCategory getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendingCategory }
     *     
     */
    public void setCategory(SendingCategory value) {
        this.category = value;
    }

    /**
     * Gets the value of the creatingChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatingChannel() {
        return creatingChannel;
    }

    /**
     * Sets the value of the creatingChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatingChannel(String value) {
        this.creatingChannel = value;
    }

    /**
     * Gets the value of the creationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationTime() {
        return creationTime;
    }

    /**
     * Sets the value of the creationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationTime(XMLGregorianCalendar value) {
        this.creationTime = value;
    }

    /**
     * Gets the value of the delayedDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelayedDelivery() {
        return delayedDelivery;
    }

    /**
     * Sets the value of the delayedDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelayedDelivery(Boolean value) {
        this.delayedDelivery = value;
    }

    /**
     * Gets the value of the deliverNotBefore property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliverNotBefore() {
        return deliverNotBefore;
    }

    /**
     * Sets the value of the deliverNotBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliverNotBefore(XMLGregorianCalendar value) {
        this.deliverNotBefore = value;
    }

    /**
     * Gets the value of the isSent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSent() {
        return isSent;
    }

    /**
     * Sets the value of the isSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSent(Boolean value) {
        this.isSent = value;
    }

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMessageId(BigDecimal value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the messages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMessage }
     *     
     */
    public ArrayOfMessage getMessages() {
        return messages;
    }

    /**
     * Sets the value of the messages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMessage }
     *     
     */
    public void setMessages(ArrayOfMessage value) {
        this.messages = value;
    }

    /**
     * Gets the value of the officeCreate property.
     * 
     * @return
     *     possible object is
     *     {@link Office }
     *     
     */
    public Office getOfficeCreate() {
        return officeCreate;
    }

    /**
     * Sets the value of the officeCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Office }
     *     
     */
    public void setOfficeCreate(Office value) {
        this.officeCreate = value;
    }

    /**
     * Gets the value of the officeSent property.
     * 
     * @return
     *     possible object is
     *     {@link Office }
     *     
     */
    public Office getOfficeSent() {
        return officeSent;
    }

    /**
     * Sets the value of the officeSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Office }
     *     
     */
    public void setOfficeSent(Office value) {
        this.officeSent = value;
    }

    /**
     * Gets the value of the parentCardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentCardId() {
        return parentCardId;
    }

    /**
     * Sets the value of the parentCardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentCardId(String value) {
        this.parentCardId = value;
    }

    /**
     * Gets the value of the parentSendingId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getParentSendingId() {
        return parentSendingId;
    }

    /**
     * Sets the value of the parentSendingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setParentSendingId(BigDecimal value) {
        this.parentSendingId = value;
    }

    /**
     * Gets the value of the recipients property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecipient }
     *     
     */
    public ArrayOfRecipient getRecipients() {
        return recipients;
    }

    /**
     * Sets the value of the recipients property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecipient }
     *     
     */
    public void setRecipients(ArrayOfRecipient value) {
        this.recipients = value;
    }

    /**
     * Gets the value of the sendPriority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSendPriority() {
        return sendPriority;
    }

    /**
     * Sets the value of the sendPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSendPriority(Integer value) {
        this.sendPriority = value;
    }

    /**
     * Gets the value of the sendingId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSendingId() {
        return sendingId;
    }

    /**
     * Sets the value of the sendingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSendingId(Integer value) {
        this.sendingId = value;
    }

    /**
     * Gets the value of the sentTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSentTime() {
        return sentTime;
    }

    /**
     * Sets the value of the sentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSentTime(XMLGregorianCalendar value) {
        this.sentTime = value;
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

    /**
     * Gets the value of the userCreate property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUserCreate() {
        return userCreate;
    }

    /**
     * Sets the value of the userCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUserCreate(User value) {
        this.userCreate = value;
    }

    /**
     * Gets the value of the userSent property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUserSent() {
        return userSent;
    }

    /**
     * Sets the value of the userSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUserSent(User value) {
        this.userSent = value;
    }

}
