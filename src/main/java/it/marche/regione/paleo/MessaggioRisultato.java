
package it.marche.regione.paleo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessaggioRisultato complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessaggioRisultato">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoRisultato" type="{http://paleo.regione.marche.it/services/}TipoRisultato" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessaggioRisultato", propOrder = {
    "descrizione",
    "tipoRisultato"
})
public class MessaggioRisultato {

    @XmlElement(name = "Descrizione", nillable = true)
    protected String descrizione;
    @XmlElement(name = "TipoRisultato")
    protected TipoRisultato tipoRisultato;

    /**
     * Gets the value of the descrizione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * Sets the value of the descrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizione(String value) {
        this.descrizione = value;
    }

    /**
     * Gets the value of the tipoRisultato property.
     * 
     * @return
     *     possible object is
     *     {@link TipoRisultato }
     *     
     */
    public TipoRisultato getTipoRisultato() {
        return tipoRisultato;
    }

    /**
     * Sets the value of the tipoRisultato property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoRisultato }
     *     
     */
    public void setTipoRisultato(TipoRisultato value) {
        this.tipoRisultato = value;
    }

}
