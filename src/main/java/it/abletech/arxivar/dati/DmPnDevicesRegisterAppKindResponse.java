
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
 *         &lt;element name="Dm_Pn_Devices_Register_App_KindResult" type="{http://www.Abletech.it/Arxivar}Dm_Pn_Devices" minOccurs="0"/>
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
    "dmPnDevicesRegisterAppKindResult"
})
@XmlRootElement(name = "Dm_Pn_Devices_Register_App_KindResponse")
public class DmPnDevicesRegisterAppKindResponse {

    @XmlElement(name = "Dm_Pn_Devices_Register_App_KindResult")
    protected DmPnDevices dmPnDevicesRegisterAppKindResult;

    /**
     * Gets the value of the dmPnDevicesRegisterAppKindResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmPnDevices }
     *     
     */
    public DmPnDevices getDmPnDevicesRegisterAppKindResult() {
        return dmPnDevicesRegisterAppKindResult;
    }

    /**
     * Sets the value of the dmPnDevicesRegisterAppKindResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmPnDevices }
     *     
     */
    public void setDmPnDevicesRegisterAppKindResult(DmPnDevices value) {
        this.dmPnDevicesRegisterAppKindResult = value;
    }

}
