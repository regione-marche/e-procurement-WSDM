
package it.infor.JProtocolloGenServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for allegaProtocolloFascicoloResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="allegaProtocolloFascicoloResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://infor.arezzo.it/jente/jprotocollo/webservices/gen}rispostaAllegaProtocolloFascicolo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "allegaProtocolloFascicoloResponse", propOrder = {
    "rispostaAllegaProtocolloFascicolo"
})
public class AllegaProtocolloFascicoloResponse {

    protected RispostaAllegaProtocolloFascicolo rispostaAllegaProtocolloFascicolo;

    /**
     * Gets the value of the rispostaAllegaProtocolloFascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link RispostaAllegaProtocolloFascicolo }
     *     
     */
    public RispostaAllegaProtocolloFascicolo getRispostaAllegaProtocolloFascicolo() {
        return rispostaAllegaProtocolloFascicolo;
    }

    /**
     * Sets the value of the rispostaAllegaProtocolloFascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RispostaAllegaProtocolloFascicolo }
     *     
     */
    public void setRispostaAllegaProtocolloFascicolo(RispostaAllegaProtocolloFascicolo value) {
        this.rispostaAllegaProtocolloFascicolo = value;
    }

}
