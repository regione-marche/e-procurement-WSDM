
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
 *         &lt;element name="RichiediNotificaResult" type="{http://tempuri.org/}RegistrazioneRet" minOccurs="0"/>
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
    "richiediNotificaResult"
})
@XmlRootElement(name = "RichiediNotificaResponse")
public class RichiediNotificaResponse {

    @XmlElement(name = "RichiediNotificaResult")
    protected RegistrazioneRet richiediNotificaResult;

    /**
     * Gets the value of the richiediNotificaResult property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrazioneRet }
     *     
     */
    public RegistrazioneRet getRichiediNotificaResult() {
        return richiediNotificaResult;
    }

    /**
     * Sets the value of the richiediNotificaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrazioneRet }
     *     
     */
    public void setRichiediNotificaResult(RegistrazioneRet value) {
        this.richiediNotificaResult = value;
    }

}
