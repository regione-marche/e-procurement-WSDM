
package it.archiflow94;

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
 *         &lt;element name="strDeviceid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "strDeviceid",
    "oConnectionInfo"
})
@XmlRootElement(name = "LoginWithDeviceId")
public class LoginWithDeviceId {

    @XmlElement(nillable = true)
    protected String strDeviceid;
    @XmlElement(nillable = true)
    protected ConnectionInfo oConnectionInfo;

    /**
     * Gets the value of the strDeviceid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrDeviceid() {
        return strDeviceid;
    }

    /**
     * Sets the value of the strDeviceid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrDeviceid(String value) {
        this.strDeviceid = value;
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
