
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
 *         &lt;element name="GetSerieArchivisticheFascicoliResult" type="{http://paleo.regione.marche.it/services/}BEListOfSerieArchivisticaZA0hwLp5" minOccurs="0"/>
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
    "getSerieArchivisticheFascicoliResult"
})
@XmlRootElement(name = "GetSerieArchivisticheFascicoliResponse")
public class GetSerieArchivisticheFascicoliResponse {

    @XmlElement(name = "GetSerieArchivisticheFascicoliResult", nillable = true)
    protected BEListOfSerieArchivisticaZA0HwLp5 getSerieArchivisticheFascicoliResult;

    /**
     * Gets the value of the getSerieArchivisticheFascicoliResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEListOfSerieArchivisticaZA0HwLp5 }
     *     
     */
    public BEListOfSerieArchivisticaZA0HwLp5 getGetSerieArchivisticheFascicoliResult() {
        return getSerieArchivisticheFascicoliResult;
    }

    /**
     * Sets the value of the getSerieArchivisticheFascicoliResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEListOfSerieArchivisticaZA0HwLp5 }
     *     
     */
    public void setGetSerieArchivisticheFascicoliResult(BEListOfSerieArchivisticaZA0HwLp5 value) {
        this.getSerieArchivisticheFascicoliResult = value;
    }

}
