
package it.infor.JProtocolloGenServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for allegaProtocolloFascicolo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="allegaProtocolloFascicolo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://infor.arezzo.it/jente/jprotocollo/webservices/gen}richiestaAllegaProtocolloFascicolo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "allegaProtocolloFascicolo", propOrder = {
    "richiestaAllegaProtocolloFascicolo"
})
public class AllegaProtocolloFascicolo {

    protected RichiestaAllegaProtocolloFascicolo richiestaAllegaProtocolloFascicolo;

    /**
     * Gets the value of the richiestaAllegaProtocolloFascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link RichiestaAllegaProtocolloFascicolo }
     *     
     */
    public RichiestaAllegaProtocolloFascicolo getRichiestaAllegaProtocolloFascicolo() {
        return richiestaAllegaProtocolloFascicolo;
    }

    /**
     * Sets the value of the richiestaAllegaProtocolloFascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RichiestaAllegaProtocolloFascicolo }
     *     
     */
    public void setRichiestaAllegaProtocolloFascicolo(RichiestaAllegaProtocolloFascicolo value) {
        this.richiestaAllegaProtocolloFascicolo = value;
    }

}
