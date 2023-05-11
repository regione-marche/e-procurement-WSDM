
package it.datagraph;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoginFederaResult" type="{http://tempuri.org/}LoginRet" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "loginFederaResult"
})
@XmlRootElement(name = "LoginFederaResponse")
public class LoginFederaResponse {

    @XmlElement(name = "LoginFederaResult")
    protected LoginRet loginFederaResult;

    /**
     * Gets the value of the loginFederaResult property.
     * 
     * @return
     *     possible object is
     *     {@link LoginRet }
     *     
     */
    public LoginRet getLoginFederaResult() {
        return loginFederaResult;
    }

    /**
     * Sets the value of the loginFederaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginRet }
     *     
     */
    public void setLoginFederaResult(LoginRet value) {
        this.loginFederaResult = value;
    }

}
