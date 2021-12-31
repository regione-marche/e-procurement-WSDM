
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
 *         &lt;element name="FindOperatoriResult" type="{http://paleo.regione.marche.it/services/}BEListOfOperatorePaleoZA0hwLp5" minOccurs="0"/>
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
    "findOperatoriResult"
})
@XmlRootElement(name = "FindOperatoriResponse")
public class FindOperatoriResponse {

    @XmlElement(name = "FindOperatoriResult", nillable = true)
    protected BEListOfOperatorePaleoZA0HwLp5 findOperatoriResult;

    /**
     * Gets the value of the findOperatoriResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEListOfOperatorePaleoZA0HwLp5 }
     *     
     */
    public BEListOfOperatorePaleoZA0HwLp5 getFindOperatoriResult() {
        return findOperatoriResult;
    }

    /**
     * Sets the value of the findOperatoriResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEListOfOperatorePaleoZA0HwLp5 }
     *     
     */
    public void setFindOperatoriResult(BEListOfOperatorePaleoZA0HwLp5 value) {
        this.findOperatoriResult = value;
    }

}
