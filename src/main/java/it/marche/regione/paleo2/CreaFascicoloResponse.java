
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
 *         &lt;element name="CreaFascicoloResult" type="{http://paleo.regione.marche.it/services2/}BEBaseOfFascicoloInfoc14f1rMd" minOccurs="0"/>
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
    "creaFascicoloResult"
})
@XmlRootElement(name = "CreaFascicoloResponse")
public class CreaFascicoloResponse {

    @XmlElement(name = "CreaFascicoloResult", nillable = true)
    protected BEBaseOfFascicoloInfoc14F1RMd creaFascicoloResult;

    /**
     * Gets the value of the creaFascicoloResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEBaseOfFascicoloInfoc14F1RMd }
     *     
     */
    public BEBaseOfFascicoloInfoc14F1RMd getCreaFascicoloResult() {
        return creaFascicoloResult;
    }

    /**
     * Sets the value of the creaFascicoloResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEBaseOfFascicoloInfoc14F1RMd }
     *     
     */
    public void setCreaFascicoloResult(BEBaseOfFascicoloInfoc14F1RMd value) {
        this.creaFascicoloResult = value;
    }

}
