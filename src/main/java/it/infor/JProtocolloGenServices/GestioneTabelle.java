
package it.infor.JProtocolloGenServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gestioneTabelle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gestioneTabelle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://infor.arezzo.it/jente/jprotocollo/webservices/gen}richiestaGestioneTabelle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gestioneTabelle", propOrder = {
    "richiestaGestioneTabelle"
})
public class GestioneTabelle {

    protected RichiestaGestioneTabelle richiestaGestioneTabelle;

    /**
     * Gets the value of the richiestaGestioneTabelle property.
     * 
     * @return
     *     possible object is
     *     {@link RichiestaGestioneTabelle }
     *     
     */
    public RichiestaGestioneTabelle getRichiestaGestioneTabelle() {
        return richiestaGestioneTabelle;
    }

    /**
     * Sets the value of the richiestaGestioneTabelle property.
     * 
     * @param value
     *     allowed object is
     *     {@link RichiestaGestioneTabelle }
     *     
     */
    public void setRichiestaGestioneTabelle(RichiestaGestioneTabelle value) {
        this.richiestaGestioneTabelle = value;
    }

}
