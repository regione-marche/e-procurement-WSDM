//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 02:58:47 PM CEST 
//


package it.engineering.xsd.ricercafascicoli;

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
    "classificazione"
})
@XmlRootElement(name = "Classif")
public class Classif {

    @XmlElement(name = "CLASSIFICAZIONE", required = true)
    protected CLASSIFICAZIONE classificazione;

    /**
     * Gets the value of the classificazione property.
     * 
     * @return
     *     possible object is
     *     {@link CLASSIFICAZIONE }
     *     
     */
    public CLASSIFICAZIONE getCLASSIFICAZIONE() {
        return classificazione;
    }

    /**
     * Sets the value of the classificazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLASSIFICAZIONE }
     *     
     */
    public void setCLASSIFICAZIONE(CLASSIFICAZIONE value) {
        this.classificazione = value;
    }

}
