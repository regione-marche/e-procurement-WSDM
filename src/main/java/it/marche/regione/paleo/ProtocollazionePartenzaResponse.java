
package it.marche.regione.paleo;

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
 *         &lt;element name="ProtocollazionePartenzaResult" type="{http://paleo.regione.marche.it/services/}respProtocolloPartenza" minOccurs="0"/>
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
    "protocollazionePartenzaResult"
})
@XmlRootElement(name = "ProtocollazionePartenzaResponse")
public class ProtocollazionePartenzaResponse {

    @XmlElement(name = "ProtocollazionePartenzaResult", nillable = true)
    protected RespProtocolloPartenza protocollazionePartenzaResult;

    /**
     * Gets the value of the protocollazionePartenzaResult property.
     * 
     * @return
     *     possible object is
     *     {@link RespProtocolloPartenza }
     *     
     */
    public RespProtocolloPartenza getProtocollazionePartenzaResult() {
        return protocollazionePartenzaResult;
    }

    /**
     * Sets the value of the protocollazionePartenzaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespProtocolloPartenza }
     *     
     */
    public void setProtocollazionePartenzaResult(RespProtocolloPartenza value) {
        this.protocollazionePartenzaResult = value;
    }

}
