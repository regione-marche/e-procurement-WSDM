
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BEBaseOfRubricaZA0hwLp5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BEBaseOfRubricaZA0hwLp5">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessaggioRisultato" type="{http://paleo.regione.marche.it/services2/}MessaggioRisultato" minOccurs="0"/>
 *         &lt;element name="Oggetto" type="{http://paleo.regione.marche.it/services/}Rubrica" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BEBaseOfRubricaZA0hwLp5", propOrder = {
    "messaggioRisultato",
    "oggetto"
})
public class BEBaseOfRubricaZA0HwLp5 {

    @XmlElement(name = "MessaggioRisultato", nillable = true)
    protected MessaggioRisultato messaggioRisultato;
    @XmlElement(name = "Oggetto", nillable = true)
    protected Rubrica oggetto;

    /**
     * Gets the value of the messaggioRisultato property.
     * 
     * @return
     *     possible object is
     *     {@link MessaggioRisultato }
     *     
     */
    public MessaggioRisultato getMessaggioRisultato() {
        return messaggioRisultato;
    }

    /**
     * Sets the value of the messaggioRisultato property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessaggioRisultato }
     *     
     */
    public void setMessaggioRisultato(MessaggioRisultato value) {
        this.messaggioRisultato = value;
    }

    /**
     * Gets the value of the oggetto property.
     * 
     * @return
     *     possible object is
     *     {@link Rubrica }
     *     
     */
    public Rubrica getOggetto() {
        return oggetto;
    }

    /**
     * Sets the value of the oggetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rubrica }
     *     
     */
    public void setOggetto(Rubrica value) {
        this.oggetto = value;
    }

}
