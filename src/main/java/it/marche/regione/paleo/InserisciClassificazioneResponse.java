
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
 *         &lt;element name="InserisciClassificazioneResult" type="{http://paleo.regione.marche.it/services/}BEListOfstring" minOccurs="0"/>
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
    "inserisciClassificazioneResult"
})
@XmlRootElement(name = "InserisciClassificazioneResponse")
public class InserisciClassificazioneResponse {

    @XmlElement(name = "InserisciClassificazioneResult", nillable = true)
    protected BEListOfstring inserisciClassificazioneResult;

    /**
     * Gets the value of the inserisciClassificazioneResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEListOfstring }
     *     
     */
    public BEListOfstring getInserisciClassificazioneResult() {
        return inserisciClassificazioneResult;
    }

    /**
     * Sets the value of the inserisciClassificazioneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEListOfstring }
     *     
     */
    public void setInserisciClassificazioneResult(BEListOfstring value) {
        this.inserisciClassificazioneResult = value;
    }

}
