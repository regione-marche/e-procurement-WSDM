
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
 *         &lt;element name="GetRagioniTrasmissioneResult" type="{http://paleo.regione.marche.it/services/}BEListOfRagioneTrasmissioneZA0hwLp5" minOccurs="0"/>
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
    "getRagioniTrasmissioneResult"
})
@XmlRootElement(name = "GetRagioniTrasmissioneResponse")
public class GetRagioniTrasmissioneResponse {

    @XmlElement(name = "GetRagioniTrasmissioneResult", nillable = true)
    protected BEListOfRagioneTrasmissioneZA0HwLp5 getRagioniTrasmissioneResult;

    /**
     * Gets the value of the getRagioniTrasmissioneResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEListOfRagioneTrasmissioneZA0HwLp5 }
     *     
     */
    public BEListOfRagioneTrasmissioneZA0HwLp5 getGetRagioniTrasmissioneResult() {
        return getRagioniTrasmissioneResult;
    }

    /**
     * Sets the value of the getRagioniTrasmissioneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEListOfRagioneTrasmissioneZA0HwLp5 }
     *     
     */
    public void setGetRagioniTrasmissioneResult(BEListOfRagioneTrasmissioneZA0HwLp5 value) {
        this.getRagioniTrasmissioneResult = value;
    }

}
