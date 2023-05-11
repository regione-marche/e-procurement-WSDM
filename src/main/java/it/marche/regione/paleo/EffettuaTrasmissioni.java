
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
 *         &lt;element name="opp" type="{http://paleo.regione.marche.it/services/}OperatorePaleo" minOccurs="0"/>
 *         &lt;element name="trasmissioni" type="{http://paleo.regione.marche.it/services/}ArrayOfTrasmissioneDoc" minOccurs="0"/>
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
    "opp",
    "trasmissioni"
})
@XmlRootElement(name = "EffettuaTrasmissioni")
public class EffettuaTrasmissioni {

    @XmlElement(nillable = true)
    protected OperatorePaleo opp;
    @XmlElement(nillable = true)
    protected ArrayOfTrasmissioneDoc trasmissioni;

    /**
     * Gets the value of the opp property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorePaleo }
     *     
     */
    public OperatorePaleo getOpp() {
        return opp;
    }

    /**
     * Sets the value of the opp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorePaleo }
     *     
     */
    public void setOpp(OperatorePaleo value) {
        this.opp = value;
    }

    /**
     * Gets the value of the trasmissioni property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTrasmissioneDoc }
     *     
     */
    public ArrayOfTrasmissioneDoc getTrasmissioni() {
        return trasmissioni;
    }

    /**
     * Sets the value of the trasmissioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTrasmissioneDoc }
     *     
     */
    public void setTrasmissioni(ArrayOfTrasmissioneDoc value) {
        this.trasmissioni = value;
    }

}
