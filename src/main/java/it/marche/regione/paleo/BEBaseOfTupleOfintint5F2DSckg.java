
package it.marche.regione.paleo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.system.TupleOfintint;


/**
 * <p>Java class for BEBaseOfTupleOfintint5F2dSckg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BEBaseOfTupleOfintint5F2dSckg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessaggioRisultato" type="{http://paleo.regione.marche.it/services/}MessaggioRisultato" minOccurs="0"/>
 *         &lt;element name="Oggetto" type="{http://schemas.datacontract.org/2004/07/System}TupleOfintint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BEBaseOfTupleOfintint5F2dSckg", propOrder = {
    "messaggioRisultato",
    "oggetto"
})
public class BEBaseOfTupleOfintint5F2DSckg {

    @XmlElement(name = "MessaggioRisultato", nillable = true)
    protected MessaggioRisultato messaggioRisultato;
    @XmlElement(name = "Oggetto", nillable = true)
    protected TupleOfintint oggetto;

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
     *     {@link TupleOfintint }
     *     
     */
    public TupleOfintint getOggetto() {
        return oggetto;
    }

    /**
     * Sets the value of the oggetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link TupleOfintint }
     *     
     */
    public void setOggetto(TupleOfintint value) {
        this.oggetto = value;
    }

}
