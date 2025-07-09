
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
 *         &lt;element name="GetOperatoriAttiviResult" type="{http://paleo.regione.marche.it/services/}BEListOfOperatorePaleoZA0hwLp5" minOccurs="0"/>
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
    "getOperatoriAttiviResult"
})
@XmlRootElement(name = "GetOperatoriAttiviResponse")
public class GetOperatoriAttiviResponse {

    @XmlElement(name = "GetOperatoriAttiviResult", nillable = true)
    protected BEListOfOperatorePaleoZA0HwLp5 getOperatoriAttiviResult;

    /**
     * Gets the value of the getOperatoriAttiviResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEListOfOperatorePaleoZA0HwLp5 }
     *     
     */
    public BEListOfOperatorePaleoZA0HwLp5 getGetOperatoriAttiviResult() {
        return getOperatoriAttiviResult;
    }

    /**
     * Sets the value of the getOperatoriAttiviResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEListOfOperatorePaleoZA0HwLp5 }
     *     
     */
    public void setGetOperatoriAttiviResult(BEListOfOperatorePaleoZA0HwLp5 value) {
        this.getOperatoriAttiviResult = value;
    }

}
