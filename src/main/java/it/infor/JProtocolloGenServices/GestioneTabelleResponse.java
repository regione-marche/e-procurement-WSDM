
package it.infor.JProtocolloGenServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gestioneTabelleResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gestioneTabelleResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://infor.arezzo.it/jente/jprotocollo/webservices/gen}rispostaGestioneTabelle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gestioneTabelleResponse", propOrder = {
    "rispostaGestioneTabelle"
})
public class GestioneTabelleResponse {

    protected RispostaGestioneTabelle rispostaGestioneTabelle;

    /**
     * Gets the value of the rispostaGestioneTabelle property.
     * 
     * @return
     *     possible object is
     *     {@link RispostaGestioneTabelle }
     *     
     */
    public RispostaGestioneTabelle getRispostaGestioneTabelle() {
        return rispostaGestioneTabelle;
    }

    /**
     * Sets the value of the rispostaGestioneTabelle property.
     * 
     * @param value
     *     allowed object is
     *     {@link RispostaGestioneTabelle }
     *     
     */
    public void setRispostaGestioneTabelle(RispostaGestioneTabelle value) {
        this.rispostaGestioneTabelle = value;
    }

}
