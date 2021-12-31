
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
 *         &lt;element name="Dm_Pn_Devices_RegisterResult" type="{http://www.Abletech.it/Arxivar}Dm_Pn_Devices" minOccurs="0"/>
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
    "dmPnDevicesRegisterResult"
})
@XmlRootElement(name = "Dm_Pn_Devices_RegisterResponse")
public class DmPnDevicesRegisterResponse {

    @XmlElement(name = "Dm_Pn_Devices_RegisterResult")
    protected DmPnDevices dmPnDevicesRegisterResult;

    /**
     * Gets the value of the dmPnDevicesRegisterResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmPnDevices }
     *     
     */
    public DmPnDevices getDmPnDevicesRegisterResult() {
        return dmPnDevicesRegisterResult;
    }

    /**
     * Sets the value of the dmPnDevicesRegisterResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmPnDevices }
     *     
     */
    public void setDmPnDevicesRegisterResult(DmPnDevices value) {
        this.dmPnDevicesRegisterResult = value;
    }

}
