
package it.archiflow96;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetExistingCardVisibilityCCOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetExistingCardVisibilityCCOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="Users" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfUser" minOccurs="0"/>
 *         &lt;element name="UsersCC" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfUser" minOccurs="0"/>
 *         &lt;element name="Groups" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfGroup" minOccurs="0"/>
 *         &lt;element name="GroupsCC" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfGroup" minOccurs="0"/>
 *         &lt;element name="Offices" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfOffice" minOccurs="0"/>
 *         &lt;element name="OfficesCC" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfOffice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetExistingCardVisibilityCCOutput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "users",
    "usersCC",
    "groups",
    "groupsCC",
    "offices",
    "officesCC"
})
public class GetExistingCardVisibilityCCOutput
    extends BaseOutput
{

    @XmlElement(name = "Users", nillable = true)
    protected ArrayOfUser users;
    @XmlElement(name = "UsersCC", nillable = true)
    protected ArrayOfUser usersCC;
    @XmlElement(name = "Groups", nillable = true)
    protected ArrayOfGroup groups;
    @XmlElement(name = "GroupsCC", nillable = true)
    protected ArrayOfGroup groupsCC;
    @XmlElement(name = "Offices", nillable = true)
    protected ArrayOfOffice offices;
    @XmlElement(name = "OfficesCC", nillable = true)
    protected ArrayOfOffice officesCC;

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
     * Gets the value of the usersCC property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUser }
     *     
     */
    public ArrayOfUser getUsersCC() {
        return usersCC;
    }

    /**
     * Sets the value of the usersCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUser }
     *     
     */
    public void setUsersCC(ArrayOfUser value) {
        this.usersCC = value;
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
     * Gets the value of the groupsCC property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGroup }
     *     
     */
    public ArrayOfGroup getGroupsCC() {
        return groupsCC;
    }

    /**
     * Sets the value of the groupsCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGroup }
     *     
     */
    public void setGroupsCC(ArrayOfGroup value) {
        this.groupsCC = value;
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
     * Gets the value of the officesCC property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOffice }
     *     
     */
    public ArrayOfOffice getOfficesCC() {
        return officesCC;
    }

    /**
     * Sets the value of the officesCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOffice }
     *     
     */
    public void setOfficesCC(ArrayOfOffice value) {
        this.officesCC = value;
    }

}
