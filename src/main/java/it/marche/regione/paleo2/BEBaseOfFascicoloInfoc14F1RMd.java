
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BEBaseOfFascicoloInfoc14f1rMd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BEBaseOfFascicoloInfoc14f1rMd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessaggioRisultato" type="{http://paleo.regione.marche.it/services2/}MessaggioRisultato" minOccurs="0"/>
 *         &lt;element name="Oggetto" type="{http://paleo.regione.marche.it/services2/}FascicoloInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BEBaseOfFascicoloInfoc14f1rMd", propOrder = {
    "messaggioRisultato",
    "oggetto"
})
public class BEBaseOfFascicoloInfoc14F1RMd {

    @XmlElement(name = "MessaggioRisultato", nillable = true)
    protected MessaggioRisultato messaggioRisultato;
    @XmlElement(name = "Oggetto", nillable = true)
    protected FascicoloInfo oggetto;

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
     *     {@link FascicoloInfo }
     *     
     */
    public FascicoloInfo getOggetto() {
        return oggetto;
    }

    /**
     * Sets the value of the oggetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloInfo }
     *     
     */
    public void setOggetto(FascicoloInfo value) {
        this.oggetto = value;
    }

}
