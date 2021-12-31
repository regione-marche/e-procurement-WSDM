
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendFolderInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendFolderInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="FolderId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ForceSend" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Groups" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfGroup" minOccurs="0"/>
 *         &lt;element name="GroupsRead" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfGroup" minOccurs="0"/>
 *         &lt;element name="GroupsWrite" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfGroup" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Offices" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfOffice" minOccurs="0"/>
 *         &lt;element name="OfficesRead" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfOffice" minOccurs="0"/>
 *         &lt;element name="OfficesWrite" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfOffice" minOccurs="0"/>
 *         &lt;element name="Users" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfUser" minOccurs="0"/>
 *         &lt;element name="UsersRead" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfUser" minOccurs="0"/>
 *         &lt;element name="UsersWrite" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfUser" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendFolderInput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Folder.ValueObject", propOrder = {
    "folderId",
    "forceSend",
    "groups",
    "groupsRead",
    "groupsWrite",
    "message",
    "offices",
    "officesRead",
    "officesWrite",
    "users",
    "usersRead",
    "usersWrite"
})
public class SendFolderInput
    extends BaseInput
{

    @XmlElement(name = "FolderId")
    protected Integer folderId;
    @XmlElement(name = "ForceSend")
    protected Boolean forceSend;
    @XmlElement(name = "Groups", nillable = true)
    protected ArrayOfGroup groups;
    @XmlElement(name = "GroupsRead", nillable = true)
    protected ArrayOfGroup groupsRead;
    @XmlElement(name = "GroupsWrite", nillable = true)
    protected ArrayOfGroup groupsWrite;
    @XmlElement(name = "Message", nillable = true)
    protected String message;
    @XmlElement(name = "Offices", nillable = true)
    protected ArrayOfOffice offices;
    @XmlElement(name = "OfficesRead", nillable = true)
    protected ArrayOfOffice officesRead;
    @XmlElement(name = "OfficesWrite", nillable = true)
    protected ArrayOfOffice officesWrite;
    @XmlElement(name = "Users", nillable = true)
    protected ArrayOfUser users;
    @XmlElement(name = "UsersRead", nillable = true)
    protected ArrayOfUser usersRead;
    @XmlElement(name = "UsersWrite", nillable = true)
    protected ArrayOfUser usersWrite;

    /**
     * Gets the value of the folderId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFolderId() {
        return folderId;
    }

    /**
     * Sets the value of the folderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFolderId(Integer value) {
        this.folderId = value;
    }

    /**
     * Gets the value of the forceSend property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceSend() {
        return forceSend;
    }

    /**
     * Sets the value of the forceSend property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceSend(Boolean value) {
        this.forceSend = value;
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
     * Gets the value of the groupsRead property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGroup }
     *     
     */
    public ArrayOfGroup getGroupsRead() {
        return groupsRead;
    }

    /**
     * Sets the value of the groupsRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGroup }
     *     
     */
    public void setGroupsRead(ArrayOfGroup value) {
        this.groupsRead = value;
    }

    /**
     * Gets the value of the groupsWrite property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGroup }
     *     
     */
    public ArrayOfGroup getGroupsWrite() {
        return groupsWrite;
    }

    /**
     * Sets the value of the groupsWrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGroup }
     *     
     */
    public void setGroupsWrite(ArrayOfGroup value) {
        this.groupsWrite = value;
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
     * Gets the value of the officesRead property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOffice }
     *     
     */
    public ArrayOfOffice getOfficesRead() {
        return officesRead;
    }

    /**
     * Sets the value of the officesRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOffice }
     *     
     */
    public void setOfficesRead(ArrayOfOffice value) {
        this.officesRead = value;
    }

    /**
     * Gets the value of the officesWrite property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOffice }
     *     
     */
    public ArrayOfOffice getOfficesWrite() {
        return officesWrite;
    }

    /**
     * Sets the value of the officesWrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOffice }
     *     
     */
    public void setOfficesWrite(ArrayOfOffice value) {
        this.officesWrite = value;
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
     * Gets the value of the usersRead property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUser }
     *     
     */
    public ArrayOfUser getUsersRead() {
        return usersRead;
    }

    /**
     * Sets the value of the usersRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUser }
     *     
     */
    public void setUsersRead(ArrayOfUser value) {
        this.usersRead = value;
    }

    /**
     * Gets the value of the usersWrite property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUser }
     *     
     */
    public ArrayOfUser getUsersWrite() {
        return usersWrite;
    }

    /**
     * Sets the value of the usersWrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUser }
     *     
     */
    public void setUsersWrite(ArrayOfUser value) {
        this.usersWrite = value;
    }

}
