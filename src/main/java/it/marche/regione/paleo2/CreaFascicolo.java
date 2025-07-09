
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
 *         &lt;element name="richiesta" type="{http://paleo.regione.marche.it/services2/}reqCreaFascicolo" minOccurs="0"/>
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
    "richiesta"
})
@XmlRootElement(name = "CreaFascicolo")
public class CreaFascicolo {

    @XmlElement(nillable = true)
    protected ReqCreaFascicolo richiesta;

    /**
     * Gets the value of the richiesta property.
     * 
     * @return
     *     possible object is
     *     {@link ReqCreaFascicolo }
     *     
     */
    public ReqCreaFascicolo getRichiesta() {
        return richiesta;
    }

    /**
     * Sets the value of the richiesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReqCreaFascicolo }
     *     
     */
    public void setRichiesta(ReqCreaFascicolo value) {
        this.richiesta = value;
    }

}
