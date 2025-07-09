
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BEListOfRagioneInfoZA0hwLp5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BEListOfRagioneInfoZA0hwLp5">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Lista" type="{http://paleo.regione.marche.it/services/}ArrayOfRagioneInfo" minOccurs="0"/>
 *         &lt;element name="MessaggioRisultato" type="{http://paleo.regione.marche.it/services2/}MessaggioRisultato" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BEListOfRagioneInfoZA0hwLp5", propOrder = {
    "lista",
    "messaggioRisultato"
})
public class BEListOfRagioneInfoZA0HwLp5 {

    @XmlElement(name = "Lista", nillable = true)
    protected ArrayOfRagioneInfo lista;
    @XmlElement(name = "MessaggioRisultato", nillable = true)
    protected MessaggioRisultato messaggioRisultato;

    /**
     * Gets the value of the lista property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRagioneInfo }
     *     
     */
    public ArrayOfRagioneInfo getLista() {
        return lista;
    }

    /**
     * Sets the value of the lista property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRagioneInfo }
     *     
     */
    public void setLista(ArrayOfRagioneInfo value) {
        this.lista = value;
    }

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

}
