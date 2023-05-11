
package it.marche.regione.paleowssec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BEListOfrespDocProtocolliInfoZA0hwLp5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BEListOfrespDocProtocolliInfoZA0hwLp5">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Lista" type="{http://paleo.regione.marche.it/services/}ArrayOfrespDocProtocolliInfo" minOccurs="0"/>
 *         &lt;element name="MessaggioRisultato" type="{http://paleo.regione.marche.it/services/}MessaggioRisultato" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BEListOfrespDocProtocolliInfoZA0hwLp5", propOrder = {
    "lista",
    "messaggioRisultato"
})
public class BEListOfrespDocProtocolliInfoZA0HwLp5 {

    @XmlElement(name = "Lista", nillable = true)
    protected ArrayOfrespDocProtocolliInfo lista;
    @XmlElement(name = "MessaggioRisultato", nillable = true)
    protected MessaggioRisultato messaggioRisultato;

    /**
     * Gets the value of the lista property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfrespDocProtocolliInfo }
     *     
     */
    public ArrayOfrespDocProtocolliInfo getLista() {
        return lista;
    }

    /**
     * Sets the value of the lista property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfrespDocProtocolliInfo }
     *     
     */
    public void setLista(ArrayOfrespDocProtocolliInfo value) {
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
