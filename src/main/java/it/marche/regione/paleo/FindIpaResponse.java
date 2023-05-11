
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
 *         &lt;element name="FindIpaResult" type="{http://paleo.regione.marche.it/services/}BEListOfIpaEntryRz2BRIZ5" minOccurs="0"/>
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
    "findIpaResult"
})
@XmlRootElement(name = "FindIpaResponse")
public class FindIpaResponse {

    @XmlElement(name = "FindIpaResult", nillable = true)
    protected BEListOfIpaEntryRz2BRIZ5 findIpaResult;

    /**
     * Gets the value of the findIpaResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEListOfIpaEntryRz2BRIZ5 }
     *     
     */
    public BEListOfIpaEntryRz2BRIZ5 getFindIpaResult() {
        return findIpaResult;
    }

    /**
     * Sets the value of the findIpaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEListOfIpaEntryRz2BRIZ5 }
     *     
     */
    public void setFindIpaResult(BEListOfIpaEntryRz2BRIZ5 value) {
        this.findIpaResult = value;
    }

}
