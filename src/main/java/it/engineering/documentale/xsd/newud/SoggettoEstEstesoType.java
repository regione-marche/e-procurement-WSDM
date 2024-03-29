//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.01 at 11:53:11 AM CEST 
//


package it.engineering.documentale.xsd.newud;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Soggetto esterno che ha una relazione con un documento, fascicolo, proced. ecc. diversa da quella di mittente/destinatario
 * 
 * <p>Java class for SoggettoEstEstesoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoggettoEstEstesoType">
 *   &lt;complexContent>
 *     &lt;extension base="{}SoggettoEsternoType">
 *       &lt;sequence>
 *         &lt;element name="NaturaRelazioneConUD" type="{}OggDiTabDiSistemaType"/>
 *         &lt;element name="DettNaturaRelazioneConUD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoggettoEstEstesoType", propOrder = {
    "naturaRelazioneConUD",
    "dettNaturaRelazioneConUD"
})
public class SoggettoEstEstesoType
    extends SoggettoEsternoType
{

    @XmlElement(name = "NaturaRelazioneConUD", required = true)
    protected OggDiTabDiSistemaType naturaRelazioneConUD;
    @XmlElement(name = "DettNaturaRelazioneConUD")
    protected String dettNaturaRelazioneConUD;

    /**
     * Gets the value of the naturaRelazioneConUD property.
     * 
     * @return
     *     possible object is
     *     {@link OggDiTabDiSistemaType }
     *     
     */
    public OggDiTabDiSistemaType getNaturaRelazioneConUD() {
        return naturaRelazioneConUD;
    }

    /**
     * Sets the value of the naturaRelazioneConUD property.
     * 
     * @param value
     *     allowed object is
     *     {@link OggDiTabDiSistemaType }
     *     
     */
    public void setNaturaRelazioneConUD(OggDiTabDiSistemaType value) {
        this.naturaRelazioneConUD = value;
    }

    /**
     * Gets the value of the dettNaturaRelazioneConUD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDettNaturaRelazioneConUD() {
        return dettNaturaRelazioneConUD;
    }

    /**
     * Sets the value of the dettNaturaRelazioneConUD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDettNaturaRelazioneConUD(String value) {
        this.dettNaturaRelazioneConUD = value;
    }

}
