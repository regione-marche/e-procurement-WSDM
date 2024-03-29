
package it.abletech.arxivar.dati;

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
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceKind" type="{http://www.Abletech.it/Arxivar}Dm_Pn_Device_Kind"/>
 *         &lt;element name="appKind" type="{http://www.Abletech.it/Arxivar}Dm_Pn_Notifications_App_Kind"/>
 *         &lt;element name="newToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sessionId",
    "deviceKind",
    "appKind",
    "newToken",
    "oldToken"
})
@XmlRootElement(name = "Dm_Pn_Devices_Register_App_Kind")
public class DmPnDevicesRegisterAppKind {

    protected String sessionId;
    @XmlElement(required = true)
    protected DmPnDeviceKind deviceKind;
    @XmlElement(required = true)
    protected DmPnNotificationsAppKind appKind;
    protected String newToken;
    protected String oldToken;

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
     * Gets the value of the deviceKind property.
     * 
     * @return
     *     possible object is
     *     {@link DmPnDeviceKind }
     *     
     */
    public DmPnDeviceKind getDeviceKind() {
        return deviceKind;
    }

    /**
     * Sets the value of the deviceKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmPnDeviceKind }
     *     
     */
    public void setDeviceKind(DmPnDeviceKind value) {
        this.deviceKind = value;
    }

    /**
     * Gets the value of the appKind property.
     * 
     * @return
     *     possible object is
     *     {@link DmPnNotificationsAppKind }
     *     
     */
    public DmPnNotificationsAppKind getAppKind() {
        return appKind;
    }

    /**
     * Sets the value of the appKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmPnNotificationsAppKind }
     *     
     */
    public void setAppKind(DmPnNotificationsAppKind value) {
        this.appKind = value;
    }

    /**
     * Gets the value of the newToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewToken() {
        return newToken;
    }

    /**
     * Sets the value of the newToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewToken(String value) {
        this.newToken = value;
    }

    /**
     * Gets the value of the oldToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldToken() {
        return oldToken;
    }

    /**
     * Sets the value of the oldToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldToken(String value) {
        this.oldToken = value;
    }

}
