
package it.archiflow96;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertCardByParamInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertCardByParamInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="AutoCheckIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AutomaticProtocol" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Card" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}CardBundle" minOccurs="0"/>
 *         &lt;element name="CheckUserWithPrivacy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClassificationFolders" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfClassificationFolder" minOccurs="0"/>
 *         &lt;element name="DisableExtEMail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExtCfg" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ExtEMailConfig" minOccurs="0"/>
 *         &lt;element name="Groups" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfGroup" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Offices" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfOffice" minOccurs="0"/>
 *         &lt;element name="PressMarkModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sorted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Users" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfUser" minOccurs="0"/>
 *         &lt;element name="VisibilityAllNotes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VisibilityOnlyDoc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertCardByParamInput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "autoCheckIn",
    "automaticProtocol",
    "card",
    "checkUserWithPrivacy",
    "classificationFolders",
    "disableExtEMail",
    "extCfg",
    "groups",
    "message",
    "note",
    "offices",
    "pressMarkModel",
    "sorted",
    "users",
    "visibilityAllNotes",
    "visibilityOnlyDoc"
})
public class InsertCardByParamInput
    extends BaseInput
{

    @XmlElement(name = "AutoCheckIn")
    protected Boolean autoCheckIn;
    @XmlElement(name = "AutomaticProtocol")
    protected Boolean automaticProtocol;
    @XmlElement(name = "Card", nillable = true)
    protected CardBundle card;
    @XmlElement(name = "CheckUserWithPrivacy")
    protected Boolean checkUserWithPrivacy;
    @XmlElement(name = "ClassificationFolders", nillable = true)
    protected ArrayOfClassificationFolder classificationFolders;
    @XmlElement(name = "DisableExtEMail")
    protected Boolean disableExtEMail;
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
    @XmlElement(name = "PressMarkModel", nillable = true)
    protected String pressMarkModel;
    @XmlElement(name = "Sorted")
    protected Boolean sorted;
    @XmlElement(name = "Users", nillable = true)
    protected ArrayOfUser users;
    @XmlElement(name = "VisibilityAllNotes")
    protected Boolean visibilityAllNotes;
    @XmlElement(name = "VisibilityOnlyDoc")
    protected Boolean visibilityOnlyDoc;

    /**
     * Gets the value of the autoCheckIn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoCheckIn() {
        return autoCheckIn;
    }

    /**
     * Sets the value of the autoCheckIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoCheckIn(Boolean value) {
        this.autoCheckIn = value;
    }

    /**
     * Gets the value of the automaticProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutomaticProtocol() {
        return automaticProtocol;
    }

    /**
     * Sets the value of the automaticProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutomaticProtocol(Boolean value) {
        this.automaticProtocol = value;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link CardBundle }
     *     
     */
    public CardBundle getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardBundle }
     *     
     */
    public void setCard(CardBundle value) {
        this.card = value;
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
     * Gets the value of the classificationFolders property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClassificationFolder }
     *     
     */
    public ArrayOfClassificationFolder getClassificationFolders() {
        return classificationFolders;
    }

    /**
     * Sets the value of the classificationFolders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClassificationFolder }
     *     
     */
    public void setClassificationFolders(ArrayOfClassificationFolder value) {
        this.classificationFolders = value;
    }

    /**
     * Gets the value of the disableExtEMail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableExtEMail() {
        return disableExtEMail;
    }

    /**
     * Sets the value of the disableExtEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableExtEMail(Boolean value) {
        this.disableExtEMail = value;
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
     * Gets the value of the pressMarkModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPressMarkModel() {
        return pressMarkModel;
    }

    /**
     * Sets the value of the pressMarkModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPressMarkModel(String value) {
        this.pressMarkModel = value;
    }

    /**
     * Gets the value of the sorted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSorted() {
        return sorted;
    }

    /**
     * Sets the value of the sorted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSorted(Boolean value) {
        this.sorted = value;
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
     * Gets the value of the visibilityAllNotes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisibilityAllNotes() {
        return visibilityAllNotes;
    }

    /**
     * Sets the value of the visibilityAllNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisibilityAllNotes(Boolean value) {
        this.visibilityAllNotes = value;
    }

    /**
     * Gets the value of the visibilityOnlyDoc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisibilityOnlyDoc() {
        return visibilityOnlyDoc;
    }

    /**
     * Sets the value of the visibilityOnlyDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisibilityOnlyDoc(Boolean value) {
        this.visibilityOnlyDoc = value;
    }

}
