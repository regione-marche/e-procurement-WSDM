
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MailServiceSending complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MailServiceSending">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActivityInstanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InsertDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MessageBody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageState" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}MailServiceSendingState" minOccurs="0"/>
 *         &lt;element name="PriorityLevel" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}MailServiceSendingPriority" minOccurs="0"/>
 *         &lt;element name="ProcessInstanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProgramName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecipientsTo" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="RecipientsToBcc" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="RecipientsToCc" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="SendDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SenderFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SeverityLevel" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}MailServiceSendingSeverity" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkitemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailServiceSending", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", propOrder = {
    "activityInstanceId",
    "insertDate",
    "messageBody",
    "messageId",
    "messageState",
    "priorityLevel",
    "processInstanceId",
    "programName",
    "recipientsTo",
    "recipientsToBcc",
    "recipientsToCc",
    "sendDate",
    "senderFrom",
    "severityLevel",
    "subject",
    "workitemId"
})
public class MailServiceSending {

    @XmlElement(name = "ActivityInstanceId", nillable = true)
    protected String activityInstanceId;
    @XmlElement(name = "InsertDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar insertDate;
    @XmlElement(name = "MessageBody", nillable = true)
    protected String messageBody;
    @XmlElement(name = "MessageId", nillable = true)
    protected String messageId;
    @XmlElement(name = "MessageState")
    protected MailServiceSendingState messageState;
    @XmlElement(name = "PriorityLevel")
    protected MailServiceSendingPriority priorityLevel;
    @XmlElement(name = "ProcessInstanceId", nillable = true)
    protected String processInstanceId;
    @XmlElement(name = "ProgramName", nillable = true)
    protected String programName;
    @XmlElement(name = "RecipientsTo", nillable = true)
    protected ArrayOfstring recipientsTo;
    @XmlElement(name = "RecipientsToBcc", nillable = true)
    protected ArrayOfstring recipientsToBcc;
    @XmlElement(name = "RecipientsToCc", nillable = true)
    protected ArrayOfstring recipientsToCc;
    @XmlElement(name = "SendDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sendDate;
    @XmlElement(name = "SenderFrom", nillable = true)
    protected String senderFrom;
    @XmlElement(name = "SeverityLevel")
    protected MailServiceSendingSeverity severityLevel;
    @XmlElement(name = "Subject", nillable = true)
    protected String subject;
    @XmlElement(name = "WorkitemId", nillable = true)
    protected String workitemId;

    /**
     * Gets the value of the activityInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityInstanceId() {
        return activityInstanceId;
    }

    /**
     * Sets the value of the activityInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityInstanceId(String value) {
        this.activityInstanceId = value;
    }

    /**
     * Gets the value of the insertDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInsertDate() {
        return insertDate;
    }

    /**
     * Sets the value of the insertDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInsertDate(XMLGregorianCalendar value) {
        this.insertDate = value;
    }

    /**
     * Gets the value of the messageBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageBody() {
        return messageBody;
    }

    /**
     * Sets the value of the messageBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageBody(String value) {
        this.messageBody = value;
    }

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the messageState property.
     * 
     * @return
     *     possible object is
     *     {@link MailServiceSendingState }
     *     
     */
    public MailServiceSendingState getMessageState() {
        return messageState;
    }

    /**
     * Sets the value of the messageState property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailServiceSendingState }
     *     
     */
    public void setMessageState(MailServiceSendingState value) {
        this.messageState = value;
    }

    /**
     * Gets the value of the priorityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link MailServiceSendingPriority }
     *     
     */
    public MailServiceSendingPriority getPriorityLevel() {
        return priorityLevel;
    }

    /**
     * Sets the value of the priorityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailServiceSendingPriority }
     *     
     */
    public void setPriorityLevel(MailServiceSendingPriority value) {
        this.priorityLevel = value;
    }

    /**
     * Gets the value of the processInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessInstanceId() {
        return processInstanceId;
    }

    /**
     * Sets the value of the processInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessInstanceId(String value) {
        this.processInstanceId = value;
    }

    /**
     * Gets the value of the programName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramName() {
        return programName;
    }

    /**
     * Sets the value of the programName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramName(String value) {
        this.programName = value;
    }

    /**
     * Gets the value of the recipientsTo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getRecipientsTo() {
        return recipientsTo;
    }

    /**
     * Sets the value of the recipientsTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setRecipientsTo(ArrayOfstring value) {
        this.recipientsTo = value;
    }

    /**
     * Gets the value of the recipientsToBcc property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getRecipientsToBcc() {
        return recipientsToBcc;
    }

    /**
     * Sets the value of the recipientsToBcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setRecipientsToBcc(ArrayOfstring value) {
        this.recipientsToBcc = value;
    }

    /**
     * Gets the value of the recipientsToCc property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getRecipientsToCc() {
        return recipientsToCc;
    }

    /**
     * Sets the value of the recipientsToCc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setRecipientsToCc(ArrayOfstring value) {
        this.recipientsToCc = value;
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
     * Gets the value of the senderFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderFrom() {
        return senderFrom;
    }

    /**
     * Sets the value of the senderFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderFrom(String value) {
        this.senderFrom = value;
    }

    /**
     * Gets the value of the severityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link MailServiceSendingSeverity }
     *     
     */
    public MailServiceSendingSeverity getSeverityLevel() {
        return severityLevel;
    }

    /**
     * Sets the value of the severityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailServiceSendingSeverity }
     *     
     */
    public void setSeverityLevel(MailServiceSendingSeverity value) {
        this.severityLevel = value;
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
     * Gets the value of the workitemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkitemId() {
        return workitemId;
    }

    /**
     * Sets the value of the workitemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkitemId(String value) {
        this.workitemId = value;
    }

}
