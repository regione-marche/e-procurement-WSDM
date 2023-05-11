
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
 *         &lt;element name="ChiudiFascicoloResult" type="{http://paleo.regione.marche.it/services/}BEBase" minOccurs="0"/>
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
    "chiudiFascicoloResult"
})
@XmlRootElement(name = "ChiudiFascicoloResponse")
public class ChiudiFascicoloResponse {

    @XmlElement(name = "ChiudiFascicoloResult", nillable = true)
    protected BEBase chiudiFascicoloResult;

    /**
     * Gets the value of the chiudiFascicoloResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEBase }
     *     
     */
    public BEBase getChiudiFascicoloResult() {
        return chiudiFascicoloResult;
    }

    /**
     * Sets the value of the chiudiFascicoloResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEBase }
     *     
     */
    public void setChiudiFascicoloResult(BEBase value) {
        this.chiudiFascicoloResult = value;
    }

}
