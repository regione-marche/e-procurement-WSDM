
package it.easydoc.MailManagerService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Login complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Login">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoginRequestType" type="{http://www.consorziocsa.it/easydoc/ws}LoginRequestType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Login", propOrder = {
    "loginRequestType"
})
public class Login {

    @XmlElement(name = "LoginRequestType", required = true)
    protected LoginRequestType loginRequestType;

    /**
     * Gets the value of the loginRequestType property.
     * 
     * @return
     *     possible object is
     *     {@link LoginRequestType }
     *     
     */
    public LoginRequestType getLoginRequestType() {
        return loginRequestType;
    }

    /**
     * Sets the value of the loginRequestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginRequestType }
     *     
     */
    public void setLoginRequestType(LoginRequestType value) {
        this.loginRequestType = value;
    }

}
