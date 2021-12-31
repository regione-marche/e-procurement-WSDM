//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 02:58:48 PM CEST 
//


package it.engineering.xsd.risposta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "stato",
    "numeroProtocollo",
    "nuoveAnagrafiche"
})
@XmlRootElement(name = "Risposta")
public class Risposta {

    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String versione;
    @XmlAttribute(name = "xml:lang")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String xmlLang;
    @XmlElement(name = "Stato", required = true)
    protected Stato stato;
    @XmlElement(name = "NumeroProtocollo")
    protected NumeroProtocollo numeroProtocollo;
    @XmlElement(name = "NuoveAnagrafiche")
    protected NuoveAnagrafiche nuoveAnagrafiche;

    /**
     * Gets the value of the versione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersione() {
        if (versione == null) {
            return "2004-01-19";
        } else {
            return versione;
        }
    }

    /**
     * Sets the value of the versione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersione(String value) {
        this.versione = value;
    }

    /**
     * Gets the value of the xmlLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlLang() {
        if (xmlLang == null) {
            return "it";
        } else {
            return xmlLang;
        }
    }

    /**
     * Sets the value of the xmlLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlLang(String value) {
        this.xmlLang = value;
    }

    /**
     * Gets the value of the stato property.
     * 
     * @return
     *     possible object is
     *     {@link Stato }
     *     
     */
    public Stato getStato() {
        return stato;
    }

    /**
     * Sets the value of the stato property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stato }
     *     
     */
    public void setStato(Stato value) {
        this.stato = value;
    }

    /**
     * Gets the value of the numeroProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link NumeroProtocollo }
     *     
     */
    public NumeroProtocollo getNumeroProtocollo() {
        return numeroProtocollo;
    }

    /**
     * Sets the value of the numeroProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumeroProtocollo }
     *     
     */
    public void setNumeroProtocollo(NumeroProtocollo value) {
        this.numeroProtocollo = value;
    }

    /**
     * Gets the value of the nuoveAnagrafiche property.
     * 
     * @return
     *     possible object is
     *     {@link NuoveAnagrafiche }
     *     
     */
    public NuoveAnagrafiche getNuoveAnagrafiche() {
        return nuoveAnagrafiche;
    }

    /**
     * Sets the value of the nuoveAnagrafiche property.
     * 
     * @param value
     *     allowed object is
     *     {@link NuoveAnagrafiche }
     *     
     */
    public void setNuoveAnagrafiche(NuoveAnagrafiche value) {
        this.nuoveAnagrafiche = value;
    }

}
