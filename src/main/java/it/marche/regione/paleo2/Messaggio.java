
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.regionemarche_protocollo2_common.MessaggioClass;


/**
 * <p>Java class for Messaggio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Messaggio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessaggioRisultato" type="{http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.Tipi}MessaggioClass" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Messaggio", namespace = "http://paleo.regione.marche.it/services/", propOrder = {
    "messaggioRisultato"
})
@XmlSeeAlso({
    TipoDocumento.class
})
public class Messaggio {

    @XmlElement(name = "MessaggioRisultato", nillable = true)
    protected MessaggioClass messaggioRisultato;

    /**
     * Gets the value of the messaggioRisultato property.
     * 
     * @return
     *     possible object is
     *     {@link MessaggioClass }
     *     
     */
    public MessaggioClass getMessaggioRisultato() {
        return messaggioRisultato;
    }

    /**
     * Sets the value of the messaggioRisultato property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessaggioClass }
     *     
     */
    public void setMessaggioRisultato(MessaggioClass value) {
        this.messaggioRisultato = value;
    }

}
