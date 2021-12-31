
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Pn_Devices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_Pn_Devices">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_UTENTE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DEVICE_KIND" type="{http://www.Abletech.it/Arxivar}Dm_Pn_Device_Kind"/>
 *         &lt;element name="TOKEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ENABLED" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="APP_KIND" type="{http://www.Abletech.it/Arxivar}Dm_Pn_Notifications_App_Kind"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_Pn_Devices", propOrder = {
    "id",
    "idutente",
    "devicekind",
    "token",
    "enabled",
    "appkind"
})
public class DmPnDevices
    extends Base
{

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "ID_UTENTE")
    protected int idutente;
    @XmlElement(name = "DEVICE_KIND", required = true)
    protected DmPnDeviceKind devicekind;
    @XmlElement(name = "TOKEN")
    protected String token;
    @XmlElement(name = "ENABLED")
    protected boolean enabled;
    @XmlElement(name = "APP_KIND", required = true)
    protected DmPnNotificationsAppKind appkind;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the idutente property.
     * 
     */
    public int getIDUTENTE() {
        return idutente;
    }

    /**
     * Sets the value of the idutente property.
     * 
     */
    public void setIDUTENTE(int value) {
        this.idutente = value;
    }

    /**
     * Gets the value of the devicekind property.
     * 
     * @return
     *     possible object is
     *     {@link DmPnDeviceKind }
     *     
     */
    public DmPnDeviceKind getDEVICEKIND() {
        return devicekind;
    }

    /**
     * Sets the value of the devicekind property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmPnDeviceKind }
     *     
     */
    public void setDEVICEKIND(DmPnDeviceKind value) {
        this.devicekind = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOKEN() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOKEN(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     */
    public boolean isENABLED() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setENABLED(boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the appkind property.
     * 
     * @return
     *     possible object is
     *     {@link DmPnNotificationsAppKind }
     *     
     */
    public DmPnNotificationsAppKind getAPPKIND() {
        return appkind;
    }

    /**
     * Sets the value of the appkind property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmPnNotificationsAppKind }
     *     
     */
    public void setAPPKIND(DmPnNotificationsAppKind value) {
        this.appkind = value;
    }

}
