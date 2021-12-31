
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
 *         &lt;element name="EliminaClassificazioneResult" type="{http://paleo.regione.marche.it/services/}BEListOfstring" minOccurs="0"/>
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
    "eliminaClassificazioneResult"
})
@XmlRootElement(name = "EliminaClassificazioneResponse")
public class EliminaClassificazioneResponse {

    @XmlElement(name = "EliminaClassificazioneResult", nillable = true)
    protected BEListOfstring eliminaClassificazioneResult;

    /**
     * Gets the value of the eliminaClassificazioneResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEListOfstring }
     *     
     */
    public BEListOfstring getEliminaClassificazioneResult() {
        return eliminaClassificazioneResult;
    }

    /**
     * Sets the value of the eliminaClassificazioneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEListOfstring }
     *     
     */
    public void setEliminaClassificazioneResult(BEListOfstring value) {
        this.eliminaClassificazioneResult = value;
    }

}
