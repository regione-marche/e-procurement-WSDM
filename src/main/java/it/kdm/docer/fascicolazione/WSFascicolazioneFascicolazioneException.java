
package it.kdm.docer.fascicolazione;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import it.kdm.docer.fascicolazione.xsd.FascicolazioneException;


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
 *         &lt;element name="FascicolazioneException" type="{http://fascicolazione.docer.kdm.it/xsd}FascicolazioneException" minOccurs="0"/>
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
    "fascicolazioneException"
})
@XmlRootElement(name = "WSFascicolazioneFascicolazioneException")
public class WSFascicolazioneFascicolazioneException {

    @XmlElement(name = "FascicolazioneException", nillable = true)
    protected FascicolazioneException fascicolazioneException;

    /**
     * Gets the value of the fascicolazioneException property.
     * 
     * @return
     *     possible object is
     *     {@link FascicolazioneException }
     *     
     */
    public FascicolazioneException getFascicolazioneException() {
        return fascicolazioneException;
    }

    /**
     * Sets the value of the fascicolazioneException property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicolazioneException }
     *     
     */
    public void setFascicolazioneException(FascicolazioneException value) {
        this.fascicolazioneException = value;
    }

}
