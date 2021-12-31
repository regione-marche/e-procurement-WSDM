
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
 *         &lt;element name="StampaRegistroResult" type="{http://paleo.regione.marche.it/services/}BEBase" minOccurs="0"/>
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
    "stampaRegistroResult"
})
@XmlRootElement(name = "StampaRegistroResponse")
public class StampaRegistroResponse {

    @XmlElement(name = "StampaRegistroResult", nillable = true)
    protected BEBase stampaRegistroResult;

    /**
     * Gets the value of the stampaRegistroResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEBase }
     *     
     */
    public BEBase getStampaRegistroResult() {
        return stampaRegistroResult;
    }

    /**
     * Sets the value of the stampaRegistroResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEBase }
     *     
     */
    public void setStampaRegistroResult(BEBase value) {
        this.stampaRegistroResult = value;
    }

}
