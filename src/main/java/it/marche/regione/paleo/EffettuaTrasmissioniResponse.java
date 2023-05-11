
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
 *         &lt;element name="EffettuaTrasmissioniResult" type="{http://paleo.regione.marche.it/services/}BEBase" minOccurs="0"/>
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
    "effettuaTrasmissioniResult"
})
@XmlRootElement(name = "EffettuaTrasmissioniResponse")
public class EffettuaTrasmissioniResponse {

    @XmlElement(name = "EffettuaTrasmissioniResult", nillable = true)
    protected BEBase effettuaTrasmissioniResult;

    /**
     * Gets the value of the effettuaTrasmissioniResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEBase }
     *     
     */
    public BEBase getEffettuaTrasmissioniResult() {
        return effettuaTrasmissioniResult;
    }

    /**
     * Sets the value of the effettuaTrasmissioniResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEBase }
     *     
     */
    public void setEffettuaTrasmissioniResult(BEBase value) {
        this.effettuaTrasmissioniResult = value;
    }

}
