
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
 *         &lt;element name="RichiediPubblicazioneResult" type="{http://tempuri.org/}RegistrazioneRet" minOccurs="0"/>
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
    "richiediPubblicazioneResult"
})
@XmlRootElement(name = "RichiediPubblicazioneResponse")
public class RichiediPubblicazioneResponse {

    @XmlElement(name = "RichiediPubblicazioneResult")
    protected RegistrazioneRet richiediPubblicazioneResult;

    /**
     * Gets the value of the richiediPubblicazioneResult property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrazioneRet }
     *     
     */
    public RegistrazioneRet getRichiediPubblicazioneResult() {
        return richiediPubblicazioneResult;
    }

    /**
     * Sets the value of the richiediPubblicazioneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrazioneRet }
     *     
     */
    public void setRichiediPubblicazioneResult(RegistrazioneRet value) {
        this.richiediPubblicazioneResult = value;
    }

}
