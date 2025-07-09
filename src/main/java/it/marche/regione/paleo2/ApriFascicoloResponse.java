
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
 *         &lt;element name="ApriFascicoloResult" type="{http://paleo.regione.marche.it/services2/}BEBase" minOccurs="0"/>
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
    "apriFascicoloResult"
})
@XmlRootElement(name = "ApriFascicoloResponse")
public class ApriFascicoloResponse {

    @XmlElement(name = "ApriFascicoloResult", nillable = true)
    protected BEBase apriFascicoloResult;

    /**
     * Gets the value of the apriFascicoloResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEBase }
     *     
     */
    public BEBase getApriFascicoloResult() {
        return apriFascicoloResult;
    }

    /**
     * Sets the value of the apriFascicoloResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEBase }
     *     
     */
    public void setApriFascicoloResult(BEBase value) {
        this.apriFascicoloResult = value;
    }

}
