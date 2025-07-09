
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
 *         &lt;element name="GetTitolarioClassificazioneResult" type="{http://paleo.regione.marche.it/services2/}BEListOfTitolarioInfoc14f1rMd" minOccurs="0"/>
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
    "getTitolarioClassificazioneResult"
})
@XmlRootElement(name = "GetTitolarioClassificazioneResponse")
public class GetTitolarioClassificazioneResponse {

    @XmlElement(name = "GetTitolarioClassificazioneResult", nillable = true)
    protected BEListOfTitolarioInfoc14F1RMd getTitolarioClassificazioneResult;

    /**
     * Gets the value of the getTitolarioClassificazioneResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEListOfTitolarioInfoc14F1RMd }
     *     
     */
    public BEListOfTitolarioInfoc14F1RMd getGetTitolarioClassificazioneResult() {
        return getTitolarioClassificazioneResult;
    }

    /**
     * Sets the value of the getTitolarioClassificazioneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEListOfTitolarioInfoc14F1RMd }
     *     
     */
    public void setGetTitolarioClassificazioneResult(BEListOfTitolarioInfoc14F1RMd value) {
        this.getTitolarioClassificazioneResult = value;
    }

}
