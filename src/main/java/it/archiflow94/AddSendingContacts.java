
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionInfo" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Login.ValueObject}SessionInfo" minOccurs="0"/>
 *         &lt;element name="sendingId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="contacts" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject}ArrayOfRecipient" minOccurs="0"/>
 *         &lt;element name="creatingUser" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}User" minOccurs="0"/>
 *         &lt;element name="creatingOffice" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}Office" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionInfo",
    "sendingId",
    "contacts",
    "creatingUser",
    "creatingOffice"
})
@XmlRootElement(name = "AddSendingContacts")
public class AddSendingContacts {

    @XmlElement(nillable = true)
    protected SessionInfo sessionInfo;
    protected Integer sendingId;
    @XmlElement(nillable = true)
    protected ArrayOfRecipient contacts;
    @XmlElement(nillable = true)
    protected User creatingUser;
    @XmlElement(nillable = true)
    protected Office creatingOffice;

    /**
     * Gets the value of the sessionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SessionInfo }
     *     
     */
    public SessionInfo getSessionInfo() {
        return sessionInfo;
    }

    /**
     * Sets the value of the sessionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionInfo }
     *     
     */
    public void setSessionInfo(SessionInfo value) {
        this.sessionInfo = value;
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
     * Gets the value of the contacts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecipient }
     *     
     */
    public ArrayOfRecipient getContacts() {
        return contacts;
    }

    /**
     * Sets the value of the contacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecipient }
     *     
     */
    public void setContacts(ArrayOfRecipient value) {
        this.contacts = value;
    }

    /**
     * Gets the value of the creatingUser property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getCreatingUser() {
        return creatingUser;
    }

    /**
     * Sets the value of the creatingUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setCreatingUser(User value) {
        this.creatingUser = value;
    }

    /**
     * Gets the value of the creatingOffice property.
     * 
     * @return
     *     possible object is
     *     {@link Office }
     *     
     */
    public Office getCreatingOffice() {
        return creatingOffice;
    }

    /**
     * Sets the value of the creatingOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Office }
     *     
     */
    public void setCreatingOffice(Office value) {
        this.creatingOffice = value;
    }

}
