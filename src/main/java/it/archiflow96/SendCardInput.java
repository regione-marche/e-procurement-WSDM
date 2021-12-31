
package it.archiflow96;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendCardInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendCardInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="CardId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="CardToSetReplyOrForward" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}CardToSetReplyOrForward" minOccurs="0"/>
 *         &lt;element name="CheckUserWithPrivacy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExtCfg" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ExtEMailConfig" minOccurs="0"/>
 *         &lt;element name="Groups" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfGroup" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Offices" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfOffice" minOccurs="0"/>
 *         &lt;element name="Users" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfUser" minOccurs="0"/>
 *         &lt;element name="VisAllNote" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VisOnlyDoc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendCardInput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "cardId",
    "cardToSetReplyOrForward",
    "checkUserWithPrivacy",
    "extCfg",
    "groups",
    "message",
    "note",
    "offices",
    "users",
    "visAllNote",
    "visOnlyDoc"
})
public class SendCardInput
    extends BaseInput
{

    @XmlElement(name = "CardId")
    protected String cardId;
    @XmlElement(name = "CardToSetReplyOrForward", nillable = true)
    protected CardToSetReplyOrForward cardToSetReplyOrForward;
    @XmlElement(name = "CheckUserWithPrivacy")
    protected Boolean checkUserWithPrivacy;
    @XmlElement(name = "ExtCfg", nillable = true)
    protected ExtEMailConfig extCfg;
    @XmlElement(name = "Groups", nillable = true)
    protected ArrayOfGroup groups;
    @XmlElement(name = "Message", nillable = true)
    protected String message;
    @XmlElement(name = "Note", nillable = true)
    protected String note;
    @XmlElement(name = "Offices", nillable = true)
    protected ArrayOfOffice offices;
    @XmlElement(name = "Users", nillable = true)
    protected ArrayOfUser users;
    @XmlElement(name = "VisAllNote")
    protected Boolean visAllNote;
    @XmlElement(name = "VisOnlyDoc")
    protected Boolean visOnlyDoc;

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
     * Gets the value of the cardToSetReplyOrForward property.
     * 
     * @return
     *     possible object is
     *     {@link CardToSetReplyOrForward }
     *     
     */
    public CardToSetReplyOrForward getCardToSetReplyOrForward() {
        return cardToSetReplyOrForward;
    }

    /**
     * Sets the value of the cardToSetReplyOrForward property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardToSetReplyOrForward }
     *     
     */
    public void setCardToSetReplyOrForward(CardToSetReplyOrForward value) {
        this.cardToSetReplyOrForward = value;
    }

    /**
     * Gets the value of the checkUserWithPrivacy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckUserWithPrivacy() {
        return checkUserWithPrivacy;
    }

    /**
     * Sets the value of the checkUserWithPrivacy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckUserWithPrivacy(Boolean value) {
        this.checkUserWithPrivacy = value;
    }

    /**
     * Gets the value of the extCfg property.
     * 
     * @return
     *     possible object is
     *     {@link ExtEMailConfig }
     *     
     */
    public ExtEMailConfig getExtCfg() {
        return extCfg;
    }

    /**
     * Sets the value of the extCfg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtEMailConfig }
     *     
     */
    public void setExtCfg(ExtEMailConfig value) {
        this.extCfg = value;
    }

    /**
     * Gets the value of the groups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGroup }
     *     
     */
    public ArrayOfGroup getGroups() {
        return groups;
    }

    /**
     * Sets the value of the groups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGroup }
     *     
     */
    public void setGroups(ArrayOfGroup value) {
        this.groups = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the offices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOffice }
     *     
     */
    public ArrayOfOffice getOffices() {
        return offices;
    }

    /**
     * Sets the value of the offices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOffice }
     *     
     */
    public void setOffices(ArrayOfOffice value) {
        this.offices = value;
    }

    /**
     * Gets the value of the users property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUser }
     *     
     */
    public ArrayOfUser getUsers() {
        return users;
    }

    /**
     * Sets the value of the users property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUser }
     *     
     */
    public void setUsers(ArrayOfUser value) {
        this.users = value;
    }

    /**
     * Gets the value of the visAllNote property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisAllNote() {
        return visAllNote;
    }

    /**
     * Sets the value of the visAllNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisAllNote(Boolean value) {
        this.visAllNote = value;
    }

    /**
     * Gets the value of the visOnlyDoc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisOnlyDoc() {
        return visOnlyDoc;
    }

    /**
     * Sets the value of the visOnlyDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisOnlyDoc(Boolean value) {
        this.visOnlyDoc = value;
    }

}
