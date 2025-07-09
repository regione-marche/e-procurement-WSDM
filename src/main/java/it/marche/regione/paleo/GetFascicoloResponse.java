
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
 *         &lt;element name="GetFascicoloResult" type="{http://paleo.regione.marche.it/services/}BEBaseOfFascicoloInfoZA0hwLp5" minOccurs="0"/>
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
    "getFascicoloResult"
})
@XmlRootElement(name = "GetFascicoloResponse")
public class GetFascicoloResponse {

    @XmlElement(name = "GetFascicoloResult", nillable = true)
    protected BEBaseOfFascicoloInfoZA0HwLp5 getFascicoloResult;

    /**
     * Gets the value of the getFascicoloResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEBaseOfFascicoloInfoZA0HwLp5 }
     *     
     */
    public BEBaseOfFascicoloInfoZA0HwLp5 getGetFascicoloResult() {
        return getFascicoloResult;
    }

    /**
     * Sets the value of the getFascicoloResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEBaseOfFascicoloInfoZA0HwLp5 }
     *     
     */
    public void setGetFascicoloResult(BEBaseOfFascicoloInfoZA0HwLp5 value) {
        this.getFascicoloResult = value;
    }

}
