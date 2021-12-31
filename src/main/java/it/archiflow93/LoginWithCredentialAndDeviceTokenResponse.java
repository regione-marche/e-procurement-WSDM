
package it.archiflow93;

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
 *         &lt;element name="LoginWithCredentialAndDeviceTokenResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oSessionInfo" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Login.ValueObject}SessionInfo" minOccurs="0"/>
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
    "loginWithCredentialAndDeviceTokenResult",
    "oSessionInfo"
})
@XmlRootElement(name = "LoginWithCredentialAndDeviceTokenResponse")
public class LoginWithCredentialAndDeviceTokenResponse {

    @XmlElement(name = "LoginWithCredentialAndDeviceTokenResult")
    protected ResultInfo loginWithCredentialAndDeviceTokenResult;
    @XmlElement(nillable = true)
    protected SessionInfo oSessionInfo;

    /**
     * Gets the value of the loginWithCredentialAndDeviceTokenResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getLoginWithCredentialAndDeviceTokenResult() {
        return loginWithCredentialAndDeviceTokenResult;
    }

    /**
     * Sets the value of the loginWithCredentialAndDeviceTokenResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setLoginWithCredentialAndDeviceTokenResult(ResultInfo value) {
        this.loginWithCredentialAndDeviceTokenResult = value;
    }

    /**
     * Gets the value of the oSessionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SessionInfo }
     *     
     */
    public SessionInfo getOSessionInfo() {
        return oSessionInfo;
    }

    /**
     * Sets the value of the oSessionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionInfo }
     *     
     */
    public void setOSessionInfo(SessionInfo value) {
        this.oSessionInfo = value;
    }

}
