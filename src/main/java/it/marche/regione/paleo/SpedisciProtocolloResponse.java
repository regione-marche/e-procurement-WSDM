
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
 *         &lt;element name="SpedisciProtocolloResult" type="{http://paleo.regione.marche.it/services/}respSpedisciProtocollo" minOccurs="0"/>
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
    "spedisciProtocolloResult"
})
@XmlRootElement(name = "SpedisciProtocolloResponse")
public class SpedisciProtocolloResponse {

    @XmlElement(name = "SpedisciProtocolloResult", nillable = true)
    protected RespSpedisciProtocollo spedisciProtocolloResult;

    /**
     * Gets the value of the spedisciProtocolloResult property.
     * 
     * @return
     *     possible object is
     *     {@link RespSpedisciProtocollo }
     *     
     */
    public RespSpedisciProtocollo getSpedisciProtocolloResult() {
        return spedisciProtocolloResult;
    }

    /**
     * Sets the value of the spedisciProtocolloResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespSpedisciProtocollo }
     *     
     */
    public void setSpedisciProtocolloResult(RespSpedisciProtocollo value) {
        this.spedisciProtocolloResult = value;
    }

}
