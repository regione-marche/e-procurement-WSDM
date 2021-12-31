
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
 *         &lt;element name="GetTipiDatiFascicoliResult" type="{http://paleo.regione.marche.it/services/}BEListOfTipoDatiFascicoloZA0hwLp5" minOccurs="0"/>
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
    "getTipiDatiFascicoliResult"
})
@XmlRootElement(name = "GetTipiDatiFascicoliResponse")
public class GetTipiDatiFascicoliResponse {

    @XmlElement(name = "GetTipiDatiFascicoliResult", nillable = true)
    protected BEListOfTipoDatiFascicoloZA0HwLp5 getTipiDatiFascicoliResult;

    /**
     * Gets the value of the getTipiDatiFascicoliResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEListOfTipoDatiFascicoloZA0HwLp5 }
     *     
     */
    public BEListOfTipoDatiFascicoloZA0HwLp5 getGetTipiDatiFascicoliResult() {
        return getTipiDatiFascicoliResult;
    }

    /**
     * Sets the value of the getTipiDatiFascicoliResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEListOfTipoDatiFascicoloZA0HwLp5 }
     *     
     */
    public void setGetTipiDatiFascicoliResult(BEListOfTipoDatiFascicoloZA0HwLp5 value) {
        this.getTipiDatiFascicoliResult = value;
    }

}
