
package it.marche.regione.paleowssec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Classificazione complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Classificazione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodiceFascicolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NuovoFascicolo" type="{http://paleo.regione.marche.it/services/}DatiNuovoFascicolo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Classificazione", propOrder = {
    "codiceFascicolo",
    "nuovoFascicolo"
})
public class Classificazione {

    @XmlElement(name = "CodiceFascicolo", nillable = true)
    protected String codiceFascicolo;
    @XmlElement(name = "NuovoFascicolo", nillable = true)
    protected DatiNuovoFascicolo nuovoFascicolo;

    /**
     * Gets the value of the codiceFascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFascicolo() {
        return codiceFascicolo;
    }

    /**
     * Sets the value of the codiceFascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFascicolo(String value) {
        this.codiceFascicolo = value;
    }

    /**
     * Gets the value of the nuovoFascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link DatiNuovoFascicolo }
     *     
     */
    public DatiNuovoFascicolo getNuovoFascicolo() {
        return nuovoFascicolo;
    }

    /**
     * Sets the value of the nuovoFascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiNuovoFascicolo }
     *     
     */
    public void setNuovoFascicolo(DatiNuovoFascicolo value) {
        this.nuovoFascicolo = value;
    }

}
