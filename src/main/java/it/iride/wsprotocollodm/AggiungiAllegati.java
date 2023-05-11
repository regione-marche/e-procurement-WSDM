
package it.iride.wsprotocollodm;

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
 *         &lt;element name="NuoviAllegati" type="{http://tempuri.org/}NuoviAllegati"/>
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
    "nuoviAllegati"
})
@XmlRootElement(name = "AggiungiAllegati")
public class AggiungiAllegati {

    @XmlElement(name = "NuoviAllegati", required = true, nillable = true)
    protected NuoviAllegati nuoviAllegati;

    /**
     * Gets the value of the nuoviAllegati property.
     * 
     * @return
     *     possible object is
     *     {@link NuoviAllegati }
     *     
     */
    public NuoviAllegati getNuoviAllegati() {
        return nuoviAllegati;
    }

    /**
     * Sets the value of the nuoviAllegati property.
     * 
     * @param value
     *     allowed object is
     *     {@link NuoviAllegati }
     *     
     */
    public void setNuoviAllegati(NuoviAllegati value) {
        this.nuoviAllegati = value;
    }

}
