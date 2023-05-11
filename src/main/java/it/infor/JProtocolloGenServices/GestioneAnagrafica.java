
package it.infor.JProtocolloGenServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gestioneAnagrafica complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gestioneAnagrafica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://infor.arezzo.it/jente/jprotocollo/webservices/gen}richiestaGestioneAnagrafica" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gestioneAnagrafica", propOrder = {
    "richiestaGestioneAnagrafica"
})
public class GestioneAnagrafica {

    protected RichiestaGestioneAnagrafica richiestaGestioneAnagrafica;

    /**
     * Gets the value of the richiestaGestioneAnagrafica property.
     * 
     * @return
     *     possible object is
     *     {@link RichiestaGestioneAnagrafica }
     *     
     */
    public RichiestaGestioneAnagrafica getRichiestaGestioneAnagrafica() {
        return richiestaGestioneAnagrafica;
    }

    /**
     * Sets the value of the richiestaGestioneAnagrafica property.
     * 
     * @param value
     *     allowed object is
     *     {@link RichiestaGestioneAnagrafica }
     *     
     */
    public void setRichiestaGestioneAnagrafica(RichiestaGestioneAnagrafica value) {
        this.richiestaGestioneAnagrafica = value;
    }

}
