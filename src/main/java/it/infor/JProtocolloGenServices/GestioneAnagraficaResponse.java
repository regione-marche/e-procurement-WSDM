
package it.infor.JProtocolloGenServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gestioneAnagraficaResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gestioneAnagraficaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://infor.arezzo.it/jente/jprotocollo/webservices/gen}rispostaGestioneAnagrafica" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gestioneAnagraficaResponse", propOrder = {
    "rispostaGestioneAnagrafica"
})
public class GestioneAnagraficaResponse {

    protected RispostaGestioneAnagrafica rispostaGestioneAnagrafica;

    /**
     * Gets the value of the rispostaGestioneAnagrafica property.
     * 
     * @return
     *     possible object is
     *     {@link RispostaGestioneAnagrafica }
     *     
     */
    public RispostaGestioneAnagrafica getRispostaGestioneAnagrafica() {
        return rispostaGestioneAnagrafica;
    }

    /**
     * Sets the value of the rispostaGestioneAnagrafica property.
     * 
     * @param value
     *     allowed object is
     *     {@link RispostaGestioneAnagrafica }
     *     
     */
    public void setRispostaGestioneAnagrafica(RispostaGestioneAnagrafica value) {
        this.rispostaGestioneAnagrafica = value;
    }

}
