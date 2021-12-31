
package it.archiflow93.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SessionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SessionInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Common.Tools.Log}LoggableBase">
 *       &lt;sequence>
 *         &lt;element name="CharacterSet" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="ClientType" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="DateFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExecutiveOfficeCode" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="ExecutiveOffices" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfOfficeChart" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}Language" minOccurs="0"/>
 *         &lt;element name="LoginTicketUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LoginType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}UserLoginType" minOccurs="0"/>
 *         &lt;element name="SessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TokenSess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VelocisDatabase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VelocisServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkflowId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionInfo", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Login.ValueObject", propOrder = {
    "characterSet",
    "clientType",
    "dateFormat",
    "executiveOfficeCode",
    "executiveOffices",
    "language",
    "loginTicketUserId",
    "loginType",
    "sessionId",
    "tokenSess",
    "velocisDatabase",
    "velocisServer",
    "workflowId"
})
public class SessionInfo
    extends LoggableBase
{

    @XmlElement(name = "CharacterSet")
    protected Short characterSet;
    @XmlElement(name = "ClientType")
    protected Short clientType;
    @XmlElement(name = "DateFormat", nillable = true)
    protected String dateFormat;
    @XmlElement(name = "ExecutiveOfficeCode")
    protected Short executiveOfficeCode;
    @XmlElement(name = "ExecutiveOffices", nillable = true)
    protected ArrayOfOfficeChart executiveOffices;
    @XmlElement(name = "Language")
    protected Language language;
    @XmlElement(name = "LoginTicketUserId", nillable = true)
    protected String loginTicketUserId;
    @XmlElement(name = "LoginType")
    protected UserLoginType loginType;
    @XmlElement(name = "SessionId", nillable = true)
    protected String sessionId;
    @XmlElement(name = "TokenSess", nillable = true)
    protected String tokenSess;
    @XmlElement(name = "VelocisDatabase", nillable = true)
    protected String velocisDatabase;
    @XmlElement(name = "VelocisServer", nillable = true)
    protected String velocisServer;
    @XmlElement(name = "WorkflowId", nillable = true)
    protected String workflowId;

    /**
     * Gets the value of the characterSet property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCharacterSet() {
        return characterSet;
    }

    /**
     * Sets the value of the characterSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCharacterSet(Short value) {
        this.characterSet = value;
    }

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
     * Gets the value of the executiveOffices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOfficeChart }
     *     
     */
    public ArrayOfOfficeChart getExecutiveOffices() {
        return executiveOffices;
    }

    /**
     * Sets the value of the executiveOffices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOfficeChart }
     *     
     */
    public void setExecutiveOffices(ArrayOfOfficeChart value) {
        this.executiveOffices = value;
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
     * Gets the value of the loginTicketUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginTicketUserId() {
        return loginTicketUserId;
    }

    /**
     * Sets the value of the loginTicketUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginTicketUserId(String value) {
        this.loginTicketUserId = value;
    }

    /**
     * Gets the value of the loginType property.
     * 
     * @return
     *     possible object is
     *     {@link UserLoginType }
     *     
     */
    public UserLoginType getLoginType() {
        return loginType;
    }

    /**
     * Sets the value of the loginType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserLoginType }
     *     
     */
    public void setLoginType(UserLoginType value) {
        this.loginType = value;
    }

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
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
     * Gets the value of the velocisDatabase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVelocisDatabase() {
        return velocisDatabase;
    }

    /**
     * Sets the value of the velocisDatabase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVelocisDatabase(String value) {
        this.velocisDatabase = value;
    }

    /**
     * Gets the value of the velocisServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVelocisServer() {
        return velocisServer;
    }

    /**
     * Sets the value of the velocisServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVelocisServer(String value) {
        this.velocisServer = value;
    }

    /**
     * Gets the value of the workflowId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowId() {
        return workflowId;
    }

    /**
     * Sets the value of the workflowId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowId(String value) {
        this.workflowId = value;
    }

}
