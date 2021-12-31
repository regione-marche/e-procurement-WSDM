
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
 *         &lt;element name="ApriRegistroResult" type="{http://paleo.regione.marche.it/services/}Registro" minOccurs="0"/>
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
    "apriRegistroResult"
})
@XmlRootElement(name = "ApriRegistroResponse")
public class ApriRegistroResponse {

    @XmlElement(name = "ApriRegistroResult", nillable = true)
    protected Registro apriRegistroResult;

    /**
     * Gets the value of the apriRegistroResult property.
     * 
     * @return
     *     possible object is
     *     {@link Registro }
     *     
     */
    public Registro getApriRegistroResult() {
        return apriRegistroResult;
    }

    /**
     * Sets the value of the apriRegistroResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Registro }
     *     
     */
    public void setApriRegistroResult(Registro value) {
        this.apriRegistroResult = value;
    }

}
