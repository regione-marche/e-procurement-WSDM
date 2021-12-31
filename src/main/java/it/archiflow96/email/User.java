
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for User complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="User">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}Entity">
 *       &lt;sequence>
 *         &lt;element name="AuthenticationType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}AuthenticationType" minOccurs="0"/>
 *         &lt;element name="DefaultExecutiveOffice" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}Office" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email_WF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Groups" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfGroup" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsOnlyGED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsReadOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MainOffice" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}Office" minOccurs="0"/>
 *         &lt;element name="Offices" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfOffice" minOccurs="0"/>
 *         &lt;element name="Rights" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfUserRight" minOccurs="0"/>
 *         &lt;element name="RightsConfig" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}UserRightsConfig" minOccurs="0"/>
 *         &lt;element name="UserType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}UserType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", propOrder = {
    "authenticationType",
    "defaultExecutiveOffice",
    "email",
    "emailWF",
    "groups",
    "id",
    "isOnlyGED",
    "isReadOnly",
    "mainOffice",
    "offices",
    "rights",
    "rightsConfig",
    "userType"
})
public class User
    extends Entity
{

    @XmlElement(name = "AuthenticationType")
    protected AuthenticationType authenticationType;
    @XmlElement(name = "DefaultExecutiveOffice", nillable = true)
    protected Office defaultExecutiveOffice;
    @XmlElement(name = "Email", nillable = true)
    protected String email;
    @XmlElement(name = "Email_WF", nillable = true)
    protected String emailWF;
    @XmlElement(name = "Groups", nillable = true)
    protected ArrayOfGroup groups;
    @XmlElement(name = "Id", nillable = true)
    protected String id;
    @XmlElement(name = "IsOnlyGED")
    protected Boolean isOnlyGED;
    @XmlElement(name = "IsReadOnly")
    protected Boolean isReadOnly;
    @XmlElement(name = "MainOffice", nillable = true)
    protected Office mainOffice;
    @XmlElement(name = "Offices", nillable = true)
    protected ArrayOfOffice offices;
    @XmlElement(name = "Rights", nillable = true)
    protected ArrayOfUserRight rights;
    @XmlElement(name = "RightsConfig", nillable = true)
    protected UserRightsConfig rightsConfig;
    @XmlElement(name = "UserType")
    protected UserType userType;

    /**
     * Gets the value of the authenticationType property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationType }
     *     
     */
    public AuthenticationType getAuthenticationType() {
        return authenticationType;
    }

    /**
     * Sets the value of the authenticationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationType }
     *     
     */
    public void setAuthenticationType(AuthenticationType value) {
        this.authenticationType = value;
    }

    /**
     * Gets the value of the defaultExecutiveOffice property.
     * 
     * @return
     *     possible object is
     *     {@link Office }
     *     
     */
    public Office getDefaultExecutiveOffice() {
        return defaultExecutiveOffice;
    }

    /**
     * Sets the value of the defaultExecutiveOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Office }
     *     
     */
    public void setDefaultExecutiveOffice(Office value) {
        this.defaultExecutiveOffice = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the emailWF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailWF() {
        return emailWF;
    }

    /**
     * Sets the value of the emailWF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailWF(String value) {
        this.emailWF = value;
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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the isOnlyGED property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOnlyGED() {
        return isOnlyGED;
    }

    /**
     * Sets the value of the isOnlyGED property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOnlyGED(Boolean value) {
        this.isOnlyGED = value;
    }

    /**
     * Gets the value of the isReadOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReadOnly() {
        return isReadOnly;
    }

    /**
     * Sets the value of the isReadOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReadOnly(Boolean value) {
        this.isReadOnly = value;
    }

    /**
     * Gets the value of the mainOffice property.
     * 
     * @return
     *     possible object is
     *     {@link Office }
     *     
     */
    public Office getMainOffice() {
        return mainOffice;
    }

    /**
     * Sets the value of the mainOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Office }
     *     
     */
    public void setMainOffice(Office value) {
        this.mainOffice = value;
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
     * Gets the value of the rights property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUserRight }
     *     
     */
    public ArrayOfUserRight getRights() {
        return rights;
    }

    /**
     * Sets the value of the rights property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUserRight }
     *     
     */
    public void setRights(ArrayOfUserRight value) {
        this.rights = value;
    }

    /**
     * Gets the value of the rightsConfig property.
     * 
     * @return
     *     possible object is
     *     {@link UserRightsConfig }
     *     
     */
    public UserRightsConfig getRightsConfig() {
        return rightsConfig;
    }

    /**
     * Sets the value of the rightsConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserRightsConfig }
     *     
     */
    public void setRightsConfig(UserRightsConfig value) {
        this.rightsConfig = value;
    }

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setUserType(UserType value) {
        this.userType = value;
    }

}
