
package it.abletech.arxivar.login;

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
 *         &lt;element name="Login_with_language_For_DeviceResult" type="{http://www.Abletech.it/Arxivar}LoginModel" minOccurs="0"/>
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
    "loginWithLanguageForDeviceResult"
})
@XmlRootElement(name = "Login_with_language_For_DeviceResponse")
public class LoginWithLanguageForDeviceResponse {

    @XmlElement(name = "Login_with_language_For_DeviceResult")
    protected LoginModel loginWithLanguageForDeviceResult;

    /**
     * Gets the value of the loginWithLanguageForDeviceResult property.
     * 
     * @return
     *     possible object is
     *     {@link LoginModel }
     *     
     */
    public LoginModel getLoginWithLanguageForDeviceResult() {
        return loginWithLanguageForDeviceResult;
    }

    /**
     * Sets the value of the loginWithLanguageForDeviceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginModel }
     *     
     */
    public void setLoginWithLanguageForDeviceResult(LoginModel value) {
        this.loginWithLanguageForDeviceResult = value;
    }

}
