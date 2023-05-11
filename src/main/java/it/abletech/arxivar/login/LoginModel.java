
package it.abletech.arxivar.login;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LoginModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoginModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoggedIn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpiratedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ChangePasswordRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AooLocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ArxLogOnErrorType" type="{http://www.Abletech.it/Arxivar}ArxLogOnErrorType"/>
 *         &lt;element name="ArxLogOnErrorTypeString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginModel", propOrder = {
    "loggedIn",
    "sessionId",
    "expiratedTime",
    "changePasswordRequired",
    "aooLocked",
    "arxLogOnErrorType",
    "arxLogOnErrorTypeString"
})
public class LoginModel {

    @XmlElement(name = "LoggedIn")
    protected boolean loggedIn;
    @XmlElement(name = "SessionId")
    protected String sessionId;
    @XmlElement(name = "ExpiratedTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiratedTime;
    @XmlElement(name = "ChangePasswordRequired")
    protected boolean changePasswordRequired;
    @XmlElement(name = "AooLocked")
    protected boolean aooLocked;
    @XmlElement(name = "ArxLogOnErrorType", required = true)
    protected ArxLogOnErrorType arxLogOnErrorType;
    @XmlElement(name = "ArxLogOnErrorTypeString")
    protected String arxLogOnErrorTypeString;

    /**
     * Gets the value of the loggedIn property.
     * 
     */
    public boolean isLoggedIn() {
        return loggedIn;
    }

    /**
     * Sets the value of the loggedIn property.
     * 
     */
    public void setLoggedIn(boolean value) {
        this.loggedIn = value;
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
     * Gets the value of the expiratedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiratedTime() {
        return expiratedTime;
    }

    /**
     * Sets the value of the expiratedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiratedTime(XMLGregorianCalendar value) {
        this.expiratedTime = value;
    }

    /**
     * Gets the value of the changePasswordRequired property.
     * 
     */
    public boolean isChangePasswordRequired() {
        return changePasswordRequired;
    }

    /**
     * Sets the value of the changePasswordRequired property.
     * 
     */
    public void setChangePasswordRequired(boolean value) {
        this.changePasswordRequired = value;
    }

    /**
     * Gets the value of the aooLocked property.
     * 
     */
    public boolean isAooLocked() {
        return aooLocked;
    }

    /**
     * Sets the value of the aooLocked property.
     * 
     */
    public void setAooLocked(boolean value) {
        this.aooLocked = value;
    }

    /**
     * Gets the value of the arxLogOnErrorType property.
     * 
     * @return
     *     possible object is
     *     {@link ArxLogOnErrorType }
     *     
     */
    public ArxLogOnErrorType getArxLogOnErrorType() {
        return arxLogOnErrorType;
    }

    /**
     * Sets the value of the arxLogOnErrorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArxLogOnErrorType }
     *     
     */
    public void setArxLogOnErrorType(ArxLogOnErrorType value) {
        this.arxLogOnErrorType = value;
    }

    /**
     * Gets the value of the arxLogOnErrorTypeString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArxLogOnErrorTypeString() {
        return arxLogOnErrorTypeString;
    }

    /**
     * Sets the value of the arxLogOnErrorTypeString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArxLogOnErrorTypeString(String value) {
        this.arxLogOnErrorTypeString = value;
    }

}
