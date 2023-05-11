
package it.archiflow93;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Folder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Folder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="GroupsRead" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfGroup" minOccurs="0"/>
 *         &lt;element name="GroupsWrite" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfGroup" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfficesRead" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfOffice" minOccurs="0"/>
 *         &lt;element name="OfficesWrite" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfOffice" minOccurs="0"/>
 *         &lt;element name="ParentDrawers" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Folder.ValueObject}ArrayOfDrawer" minOccurs="0"/>
 *         &lt;element name="UsersRead" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfUser" minOccurs="0"/>
 *         &lt;element name="UsersWrite" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfUser" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Folder", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Folder.ValueObject", propOrder = {
    "cardIds",
    "code",
    "date",
    "groupsRead",
    "groupsWrite",
    "name",
    "note",
    "officesRead",
    "officesWrite",
    "parentDrawers",
    "usersRead",
    "usersWrite"
})
public class Folder {

    @XmlElement(name = "CardIds", nillable = true)
    protected ArrayOfguid cardIds;
    @XmlElement(name = "Code")
    protected Integer code;
    @XmlElement(name = "Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "GroupsRead", nillable = true)
    protected ArrayOfGroup groupsRead;
    @XmlElement(name = "GroupsWrite", nillable = true)
    protected ArrayOfGroup groupsWrite;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Note", nillable = true)
    protected String note;
    @XmlElement(name = "OfficesRead", nillable = true)
    protected ArrayOfOffice officesRead;
    @XmlElement(name = "OfficesWrite", nillable = true)
    protected ArrayOfOffice officesWrite;
    @XmlElement(name = "ParentDrawers", nillable = true)
    protected ArrayOfDrawer parentDrawers;
    @XmlElement(name = "UsersRead", nillable = true)
    protected ArrayOfUser usersRead;
    @XmlElement(name = "UsersWrite", nillable = true)
    protected ArrayOfUser usersWrite;

    /**
     * Gets the value of the cardIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfguid }
     *     
     */
    public ArrayOfguid getCardIds() {
        return cardIds;
    }

    /**
     * Sets the value of the cardIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfguid }
     *     
     */
    public void setCardIds(ArrayOfguid value) {
        this.cardIds = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCode(Integer value) {
        this.code = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the parentDrawers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDrawer }
     *     
     */
    public ArrayOfDrawer getParentDrawers() {
        return parentDrawers;
    }

    /**
     * Sets the value of the parentDrawers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDrawer }
     *     
     */
    public void setParentDrawers(ArrayOfDrawer value) {
        this.parentDrawers = value;
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
