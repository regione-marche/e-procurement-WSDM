
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
 *         &lt;element name="Login_with_SoftwareType_For_DeviceResult" type="{http://www.Abletech.it/Arxivar}LoginModel" minOccurs="0"/>
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
    "loginWithSoftwareTypeForDeviceResult"
})
@XmlRootElement(name = "Login_with_SoftwareType_For_DeviceResponse")
public class LoginWithSoftwareTypeForDeviceResponse {

    @XmlElement(name = "Login_with_SoftwareType_For_DeviceResult")
    protected LoginModel loginWithSoftwareTypeForDeviceResult;

    /**
     * Gets the value of the loginWithSoftwareTypeForDeviceResult property.
     * 
     * @return
     *     possible object is
     *     {@link LoginModel }
     *     
     */
    public LoginModel getLoginWithSoftwareTypeForDeviceResult() {
        return loginWithSoftwareTypeForDeviceResult;
    }

    /**
     * Sets the value of the loginWithSoftwareTypeForDeviceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginModel }
     *     
     */
    public void setLoginWithSoftwareTypeForDeviceResult(LoginModel value) {
        this.loginWithSoftwareTypeForDeviceResult = value;
    }

}
