
package it.archiflow96;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConnectionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectionInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientType" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="ContentRepository" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExecutiveOfficeCode" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}Language" minOccurs="0"/>
 *         &lt;element name="LoginTicket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mode" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}LoginMode" minOccurs="0"/>
 *         &lt;element name="NewPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecurityToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TokenSess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UseSystemUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WorkflowDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionInfo", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Login.ValueObject", propOrder = {
    "clientType",
    "contentRepository",
    "dateFormat",
    "executiveOfficeCode",
    "language",
    "loginTicket",
    "mode",
    "newPassword",
    "securityToken",
    "systemDomain",
    "tokenSess",
    "useSystemUser",
    "workflowDomain"
})
public class ConnectionInfo {

    @XmlElement(name = "ClientType")
    protected Short clientType;
    @XmlElement(name = "ContentRepository", nillable = true)
    protected String contentRepository;
    @XmlElement(name = "DateFormat", nillable = true)
    protected String dateFormat;
    @XmlElement(name = "ExecutiveOfficeCode")
    protected Short executiveOfficeCode;
    @XmlElement(name = "Language")
    protected Language language;
    @XmlElement(name = "LoginTicket", nillable = true)
    protected String loginTicket;
    @XmlElement(name = "Mode")
    protected LoginMode mode;
    @XmlElement(name = "NewPassword", nillable = true)
    protected String newPassword;
    @XmlElement(name = "SecurityToken", nillable = true)
    protected String securityToken;
    @XmlElement(name = "SystemDomain", nillable = true)
    protected String systemDomain;
    @XmlElement(name = "TokenSess", nillable = true)
    protected String tokenSess;
    @XmlElement(name = "UseSystemUser")
    protected Boolean useSystemUser;
    @XmlElement(name = "WorkflowDomain", nillable = true)
    protected String workflowDomain;

    /**
     * Gets the value of the clientType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getClientType() {
        return clientType;
    }

    /**
     * Sets the value of the clientType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setClientType(Short value) {
        this.clientType = value;
    }

    /**
     * Gets the value of the contentRepository property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentRepository() {
        return contentRepository;
    }

    /**
     * Sets the value of the contentRepository property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentRepository(String value) {
        this.contentRepository = value;
    }

    /**
     * Gets the value of the dateFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFormat() {
        return dateFormat;
    }

    /**
     * Sets the value of the dateFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFormat(String value) {
        this.dateFormat = value;
    }

    /**
     * Gets the value of the executiveOfficeCode property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getExecutiveOfficeCode() {
        return executiveOfficeCode;
    }

    /**
     * Sets the value of the executiveOfficeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setExecutiveOfficeCode(Short value) {
        this.executiveOfficeCode = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link Language }
     *     
     */
    public Language getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link Language }
     *     
     */
    public void setLanguage(Language value) {
        this.language = value;
    }

    /**
     * Gets the value of the loginTicket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginTicket() {
        return loginTicket;
    }

    /**
     * Sets the value of the loginTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginTicket(String value) {
        this.loginTicket = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link LoginMode }
     *     
     */
    public LoginMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginMode }
     *     
     */
    public void setMode(LoginMode value) {
        this.mode = value;
    }

    /**
     * Gets the value of the newPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPassword() {
        return newPassword;
    }

    /**
     * Sets the value of the newPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPassword(String value) {
        this.newPassword = value;
    }

    /**
     * Gets the value of the securityToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityToken() {
        return securityToken;
    }

    /**
     * Sets the value of the securityToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityToken(String value) {
        this.securityToken = value;
    }

    /**
     * Gets the value of the systemDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemDomain() {
        return systemDomain;
    }

    /**
     * Sets the value of the systemDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemDomain(String value) {
        this.systemDomain = value;
    }

    /**
     * Gets the value of the tokenSess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenSess() {
        return tokenSess;
    }

    /**
     * Sets the value of the tokenSess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenSess(String value) {
        this.tokenSess = value;
    }

    /**
     * Gets the value of the useSystemUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseSystemUser() {
        return useSystemUser;
    }

    /**
     * Sets the value of the useSystemUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseSystemUser(Boolean value) {
        this.useSystemUser = value;
    }

    /**
     * Gets the value of the workflowDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowDomain() {
        return workflowDomain;
    }

    /**
     * Sets the value of the workflowDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowDomain(String value) {
        this.workflowDomain = value;
    }

}
