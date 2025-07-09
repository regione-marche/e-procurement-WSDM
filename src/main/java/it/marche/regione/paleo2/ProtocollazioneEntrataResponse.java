
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
 *         &lt;element name="ProtocollazioneEntrataResult" type="{http://paleo.regione.marche.it/services2/}BEBaseOfrespProtocolloArrivoc14f1rMd" minOccurs="0"/>
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
    "protocollazioneEntrataResult"
})
@XmlRootElement(name = "ProtocollazioneEntrataResponse")
public class ProtocollazioneEntrataResponse {

    @XmlElement(name = "ProtocollazioneEntrataResult", nillable = true)
    protected BEBaseOfrespProtocolloArrivoc14F1RMd protocollazioneEntrataResult;

    /**
     * Gets the value of the protocollazioneEntrataResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEBaseOfrespProtocolloArrivoc14F1RMd }
     *     
     */
    public BEBaseOfrespProtocolloArrivoc14F1RMd getProtocollazioneEntrataResult() {
        return protocollazioneEntrataResult;
    }

    /**
     * Sets the value of the protocollazioneEntrataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEBaseOfrespProtocolloArrivoc14F1RMd }
     *     
     */
    public void setProtocollazioneEntrataResult(BEBaseOfrespProtocolloArrivoc14F1RMd value) {
        this.protocollazioneEntrataResult = value;
    }

}
