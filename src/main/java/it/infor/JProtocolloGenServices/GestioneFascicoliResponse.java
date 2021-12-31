
package it.infor.JProtocolloGenServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gestioneFascicoliResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gestioneFascicoliResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://infor.arezzo.it/jente/jprotocollo/webservices/gen}rispostaGestioneFascicoli" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gestioneFascicoliResponse", propOrder = {
    "rispostaGestioneFascicoli"
})
public class GestioneFascicoliResponse {

    protected RispostaGestioneFascicoli rispostaGestioneFascicoli;

    /**
     * Gets the value of the rispostaGestioneFascicoli property.
     * 
     * @return
     *     possible object is
     *     {@link RispostaGestioneFascicoli }
     *     
     */
    public RispostaGestioneFascicoli getRispostaGestioneFascicoli() {
        return rispostaGestioneFascicoli;
    }

    /**
     * Sets the value of the rispostaGestioneFascicoli property.
     * 
     * @param value
     *     allowed object is
     *     {@link RispostaGestioneFascicoli }
     *     
     */
    public void setRispostaGestioneFascicoli(RispostaGestioneFascicoli value) {
        this.rispostaGestioneFascicoli = value;
    }

}
