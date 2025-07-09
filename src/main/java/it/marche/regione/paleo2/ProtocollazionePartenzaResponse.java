
package it.marche.regione.paleo2;

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
 *         &lt;element name="ProtocollazionePartenzaResult" type="{http://paleo.regione.marche.it/services2/}BEBaseOfrespProtocolloPartenzac14f1rMd" minOccurs="0"/>
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
    protected BEBaseOfrespProtocolloPartenzac14F1RMd protocollazionePartenzaResult;

    /**
     * Gets the value of the protocollazionePartenzaResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEBaseOfrespProtocolloPartenzac14F1RMd }
     *     
     */
    public BEBaseOfrespProtocolloPartenzac14F1RMd getProtocollazionePartenzaResult() {
        return protocollazionePartenzaResult;
    }

    /**
     * Sets the value of the protocollazionePartenzaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEBaseOfrespProtocolloPartenzac14F1RMd }
     *     
     */
    public void setProtocollazionePartenzaResult(BEBaseOfrespProtocolloPartenzac14F1RMd value) {
        this.protocollazionePartenzaResult = value;
    }

}
