
package it.archiflow93;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Office complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Office">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}Entity">
 *       &lt;sequence>
 *         &lt;element name="ChildOffices" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfOffice" minOccurs="0"/>
 *         &lt;element name="ExecutiveOfficeGroups" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfGroup" minOccurs="0"/>
 *         &lt;element name="IsExecutiveOffice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OfficePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentId" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="Users" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfUser" minOccurs="0"/>
 *         &lt;element name="VisibilityWeight" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Office", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", propOrder = {
    "childOffices",
    "executiveOfficeGroups",
    "isExecutiveOffice",
    "officePath",
    "parentId",
    "users",
    "visibilityWeight"
})
public class Office
    extends Entity
{

    @XmlElement(name = "ChildOffices", nillable = true)
    protected ArrayOfOffice childOffices;
    @XmlElement(name = "ExecutiveOfficeGroups", nillable = true)
    protected ArrayOfGroup executiveOfficeGroups;
    @XmlElement(name = "IsExecutiveOffice")
    protected Boolean isExecutiveOffice;
    @XmlElement(name = "OfficePath", nillable = true)
    protected String officePath;
    @XmlElement(name = "ParentId")
    protected Short parentId;
    @XmlElement(name = "Users", nillable = true)
    protected ArrayOfUser users;
    @XmlElement(name = "VisibilityWeight")
    protected Short visibilityWeight;

    /**
     * Gets the value of the childOffices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOffice }
     *     
     */
    public ArrayOfOffice getChildOffices() {
        return childOffices;
    }

    /**
     * Sets the value of the childOffices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOffice }
     *     
     */
    public void setChildOffices(ArrayOfOffice value) {
        this.childOffices = value;
    }

    /**
     * Gets the value of the executiveOfficeGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGroup }
     *     
     */
    public ArrayOfGroup getExecutiveOfficeGroups() {
        return executiveOfficeGroups;
    }

    /**
     * Sets the value of the executiveOfficeGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGroup }
     *     
     */
    public void setExecutiveOfficeGroups(ArrayOfGroup value) {
        this.executiveOfficeGroups = value;
    }

    /**
     * Gets the value of the isExecutiveOffice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExecutiveOffice() {
        return isExecutiveOffice;
    }

    /**
     * Sets the value of the isExecutiveOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExecutiveOffice(Boolean value) {
        this.isExecutiveOffice = value;
    }

    /**
     * Gets the value of the officePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficePath() {
        return officePath;
    }

    /**
     * Sets the value of the officePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficePath(String value) {
        this.officePath = value;
    }

    /**
     * Gets the value of the parentId property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setParentId(Short value) {
        this.parentId = value;
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
     * Gets the value of the visibilityWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getVisibilityWeight() {
        return visibilityWeight;
    }

    /**
     * Sets the value of the visibilityWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setVisibilityWeight(Short value) {
        this.visibilityWeight = value;
    }

}
