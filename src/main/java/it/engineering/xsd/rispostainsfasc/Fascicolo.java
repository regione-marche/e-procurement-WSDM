//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 02:58:48 PM CEST 
//


package it.engineering.xsd.rispostainsfasc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idFascicolo",
    "annoFascicolo",
    "numeroFascicolo",
    "numeroSottofascicolo"
})
@XmlRootElement(name = "Fascicolo")
public class Fascicolo {

    @XmlElement(name = "IdFascicolo", required = true)
    protected String idFascicolo;
    @XmlElement(name = "AnnoFascicolo", required = true)
    protected String annoFascicolo;
    @XmlElement(name = "NumeroFascicolo", required = true)
    protected String numeroFascicolo;
    @XmlElement(name = "NumeroSottofascicolo", required = true)
    protected String numeroSottofascicolo;

    /**
     * Gets the value of the idFascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFascicolo() {
        return idFascicolo;
    }

    /**
     * Sets the value of the idFascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFascicolo(String value) {
        this.idFascicolo = value;
    }

    /**
     * Gets the value of the annoFascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnoFascicolo() {
        return annoFascicolo;
    }

    /**
     * Sets the value of the annoFascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnoFascicolo(String value) {
        this.annoFascicolo = value;
    }

    /**
     * Gets the value of the numeroFascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroFascicolo() {
        return numeroFascicolo;
    }

    /**
     * Sets the value of the numeroFascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroFascicolo(String value) {
        this.numeroFascicolo = value;
    }

    /**
     * Gets the value of the numeroSottofascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroSottofascicolo() {
        return numeroSottofascicolo;
    }

    /**
     * Sets the value of the numeroSottofascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroSottofascicolo(String value) {
        this.numeroSottofascicolo = value;
    }

}
