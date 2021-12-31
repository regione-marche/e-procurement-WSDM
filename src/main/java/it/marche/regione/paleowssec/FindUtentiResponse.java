
package it.marche.regione.paleowssec;

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
 *         &lt;element name="FindUtentiResult" type="{http://paleo.regione.marche.it/services/}BEListOfUtentePaleoZA0hwLp5" minOccurs="0"/>
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
    "findUtentiResult"
})
@XmlRootElement(name = "FindUtentiResponse")
public class FindUtentiResponse {

    @XmlElement(name = "FindUtentiResult", nillable = true)
    protected BEListOfUtentePaleoZA0HwLp5 findUtentiResult;

    /**
     * Gets the value of the findUtentiResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEListOfUtentePaleoZA0HwLp5 }
     *     
     */
    public BEListOfUtentePaleoZA0HwLp5 getFindUtentiResult() {
        return findUtentiResult;
    }

    /**
     * Sets the value of the findUtentiResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEListOfUtentePaleoZA0HwLp5 }
     *     
     */
    public void setFindUtentiResult(BEListOfUtentePaleoZA0HwLp5 value) {
        this.findUtentiResult = value;
    }

}
