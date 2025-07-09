
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
 *         &lt;element name="FindUtentiResult" type="{http://paleo.regione.marche.it/services2/}BEListOfUtentePaleoc14f1rMd" minOccurs="0"/>
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
    "findUtentiResult"
})
@XmlRootElement(name = "FindUtentiResponse")
public class FindUtentiResponse {

    @XmlElement(name = "FindUtentiResult", nillable = true)
    protected BEListOfUtentePaleoc14F1RMd findUtentiResult;

    /**
     * Gets the value of the findUtentiResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEListOfUtentePaleoc14F1RMd }
     *     
     */
    public BEListOfUtentePaleoc14F1RMd getFindUtentiResult() {
        return findUtentiResult;
    }

    /**
     * Sets the value of the findUtentiResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEListOfUtentePaleoc14F1RMd }
     *     
     */
    public void setFindUtentiResult(BEListOfUtentePaleoc14F1RMd value) {
        this.findUtentiResult = value;
    }

}
