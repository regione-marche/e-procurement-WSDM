
package it.iride.wsprotocollodm;

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
 *         &lt;element name="RicercaAmministrazioneResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "ricercaAmministrazioneResult"
})
@XmlRootElement(name = "RicercaAmministrazioneResponse")
public class RicercaAmministrazioneResponse {

    @XmlElement(name = "RicercaAmministrazioneResult")
    protected String ricercaAmministrazioneResult;

    /**
     * Gets the value of the ricercaAmministrazioneResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRicercaAmministrazioneResult() {
        return ricercaAmministrazioneResult;
    }

    /**
     * Sets the value of the ricercaAmministrazioneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRicercaAmministrazioneResult(String value) {
        this.ricercaAmministrazioneResult = value;
    }

}
