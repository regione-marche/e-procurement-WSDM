
package it.archiflow96;

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
 *         &lt;element name="strUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strDeviceToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bSave" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="oConnectionInfo" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Login.ValueObject}ConnectionInfo" minOccurs="0"/>
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
    "strUser",
    "strPassword",
    "strDeviceToken",
    "bSave",
    "oConnectionInfo"
})
@XmlRootElement(name = "LoginWithCredentialAndDeviceToken")
public class LoginWithCredentialAndDeviceToken {

    @XmlElement(nillable = true)
    protected String strUser;
    @XmlElement(nillable = true)
    protected String strPassword;
    @XmlElement(nillable = true)
    protected String strDeviceToken;
    protected Boolean bSave;
    @XmlElement(nillable = true)
    protected ConnectionInfo oConnectionInfo;

    /**
     * Gets the value of the strUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrUser() {
        return strUser;
    }

    /**
     * Sets the value of the strUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrUser(String value) {
        this.strUser = value;
    }

    /**
     * Gets the value of the strPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrPassword() {
        return strPassword;
    }

    /**
     * Sets the value of the strPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrPassword(String value) {
        this.strPassword = value;
    }

    /**
     * Gets the value of the strDeviceToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrDeviceToken() {
        return strDeviceToken;
    }

    /**
     * Sets the value of the strDeviceToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrDeviceToken(String value) {
        this.strDeviceToken = value;
    }

    /**
     * Gets the value of the bSave property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBSave() {
        return bSave;
    }

    /**
     * Sets the value of the bSave property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBSave(Boolean value) {
        this.bSave = value;
    }

    /**
     * Gets the value of the oConnectionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionInfo }
     *     
     */
    public ConnectionInfo getOConnectionInfo() {
        return oConnectionInfo;
    }

    /**
     * Sets the value of the oConnectionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionInfo }
     *     
     */
    public void setOConnectionInfo(ConnectionInfo value) {
        this.oConnectionInfo = value;
    }

}
