
package it.archiflow93;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Recipient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Recipient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}EmailAddressType" minOccurs="0"/>
 *         &lt;element name="CardContactId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ChannelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChannelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationOffice" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}Office" minOccurs="0"/>
 *         &lt;element name="CreationUser" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}User" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntityId" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject}AgrafEntityId" minOccurs="0"/>
 *         &lt;element name="ErrorStatusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsAgrafNotCensus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Modality" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}RecipientModality" minOccurs="0"/>
 *         &lt;element name="RecipientId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SendMailBox" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}SendingStatus" minOccurs="0"/>
 *         &lt;element name="StatusDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Recipient", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", propOrder = {
    "address",
    "addressType",
    "cardContactId",
    "channelId",
    "channelName",
    "creationOffice",
    "creationUser",
    "description",
    "entityId",
    "errorStatusDescription",
    "isAgrafNotCensus",
    "modality",
    "recipientId",
    "sendMailBox",
    "status",
    "statusDate"
})
public class Recipient {

    @XmlElement(name = "Address", nillable = true)
    protected String address;
    @XmlElement(name = "AddressType")
    protected EmailAddressType addressType;
    @XmlElement(name = "CardContactId")
    protected Integer cardContactId;
    @XmlElement(name = "ChannelId", nillable = true)
    protected String channelId;
    @XmlElement(name = "ChannelName", nillable = true)
    protected String channelName;
    @XmlElement(name = "CreationOffice", nillable = true)
    protected Office creationOffice;
    @XmlElement(name = "CreationUser", nillable = true)
    protected User creationUser;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "EntityId", nillable = true)
    protected AgrafEntityId entityId;
    @XmlElement(name = "ErrorStatusDescription", nillable = true)
    protected String errorStatusDescription;
    @XmlElement(name = "IsAgrafNotCensus")
    protected Boolean isAgrafNotCensus;
    @XmlElement(name = "Modality")
    protected RecipientModality modality;
    @XmlElement(name = "RecipientId")
    protected Integer recipientId;
    @XmlElement(name = "SendMailBox")
    protected Integer sendMailBox;
    @XmlElement(name = "Status")
    protected SendingStatus status;
    @XmlElement(name = "StatusDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusDate;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddressType }
     *     
     */
    public EmailAddressType getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddressType }
     *     
     */
    public void setAddressType(EmailAddressType value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the cardContactId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCardContactId() {
        return cardContactId;
    }

    /**
     * Sets the value of the cardContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCardContactId(Integer value) {
        this.cardContactId = value;
    }

    /**
     * Gets the value of the channelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * Sets the value of the channelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelId(String value) {
        this.channelId = value;
    }

    /**
     * Gets the value of the channelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * Sets the value of the channelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelName(String value) {
        this.channelName = value;
    }

    /**
     * Gets the value of the creationOffice property.
     * 
     * @return
     *     possible object is
     *     {@link Office }
     *     
     */
    public Office getCreationOffice() {
        return creationOffice;
    }

    /**
     * Sets the value of the creationOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Office }
     *     
     */
    public void setCreationOffice(Office value) {
        this.creationOffice = value;
    }

    /**
     * Gets the value of the creationUser property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getCreationUser() {
        return creationUser;
    }

    /**
     * Sets the value of the creationUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setCreationUser(User value) {
        this.creationUser = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the entityId property.
     * 
     * @return
     *     possible object is
     *     {@link AgrafEntityId }
     *     
     */
    public AgrafEntityId getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgrafEntityId }
     *     
     */
    public void setEntityId(AgrafEntityId value) {
        this.entityId = value;
    }

    /**
     * Gets the value of the errorStatusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorStatusDescription() {
        return errorStatusDescription;
    }

    /**
     * Sets the value of the errorStatusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorStatusDescription(String value) {
        this.errorStatusDescription = value;
    }

    /**
     * Gets the value of the isAgrafNotCensus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAgrafNotCensus() {
        return isAgrafNotCensus;
    }

    /**
     * Sets the value of the isAgrafNotCensus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAgrafNotCensus(Boolean value) {
        this.isAgrafNotCensus = value;
    }

    /**
     * Gets the value of the modality property.
     * 
     * @return
     *     possible object is
     *     {@link RecipientModality }
     *     
     */
    public RecipientModality getModality() {
        return modality;
    }

    /**
     * Sets the value of the modality property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipientModality }
     *     
     */
    public void setModality(RecipientModality value) {
        this.modality = value;
    }

    /**
     * Gets the value of the recipientId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecipientId() {
        return recipientId;
    }

    /**
     * Sets the value of the recipientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecipientId(Integer value) {
        this.recipientId = value;
    }

    /**
     * Gets the value of the sendMailBox property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSendMailBox() {
        return sendMailBox;
    }

    /**
     * Sets the value of the sendMailBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSendMailBox(Integer value) {
        this.sendMailBox = value;
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
     * Gets the value of the statusDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusDate() {
        return statusDate;
    }

    /**
     * Sets the value of the statusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusDate(XMLGregorianCalendar value) {
        this.statusDate = value;
    }

}
