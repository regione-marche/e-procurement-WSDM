
package it.infor.JProtocolloGenServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gestioneFascicoli complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gestioneFascicoli">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://infor.arezzo.it/jente/jprotocollo/webservices/gen}richiestaGestioneFascicoli" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gestioneFascicoli", propOrder = {
    "richiestaGestioneFascicoli"
})
public class GestioneFascicoli {

    protected RichiestaGestioneFascicoli richiestaGestioneFascicoli;

    /**
     * Gets the value of the richiestaGestioneFascicoli property.
     * 
     * @return
     *     possible object is
     *     {@link RichiestaGestioneFascicoli }
     *     
     */
    public RichiestaGestioneFascicoli getRichiestaGestioneFascicoli() {
        return richiestaGestioneFascicoli;
    }

    /**
     * Sets the value of the richiestaGestioneFascicoli property.
     * 
     * @param value
     *     allowed object is
     *     {@link RichiestaGestioneFascicoli }
     *     
     */
    public void setRichiestaGestioneFascicoli(RichiestaGestioneFascicoli value) {
        this.richiestaGestioneFascicoli = value;
    }

}
