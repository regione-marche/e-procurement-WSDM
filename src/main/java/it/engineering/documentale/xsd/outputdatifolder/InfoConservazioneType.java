//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.31 at 02:46:49 PM CEST 
//


package it.engineering.documentale.xsd.outputdatifolder;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InfoConservazioneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InfoConservazioneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="Permanente" type="{}FlagSiNoType" minOccurs="0"/>
 *           &lt;element name="PerAnni" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="Supporto" type="{}OggDiTabDiSistemaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoConservazioneType", propOrder = {
    "permanente",
    "perAnni",
    "supporto"
})
public class InfoConservazioneType {

    @XmlElement(name = "Permanente")
    protected String permanente;
    @XmlElement(name = "PerAnni")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger perAnni;
    @XmlElement(name = "Supporto")
    protected OggDiTabDiSistemaType supporto;

    /**
     * Gets the value of the permanente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermanente() {
        return permanente;
    }

    /**
     * Sets the value of the permanente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermanente(String value) {
        this.permanente = value;
    }

    /**
     * Gets the value of the perAnni property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPerAnni() {
        return perAnni;
    }

    /**
     * Sets the value of the perAnni property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPerAnni(BigInteger value) {
        this.perAnni = value;
    }

    /**
     * Gets the value of the supporto property.
     * 
     * @return
     *     possible object is
     *     {@link OggDiTabDiSistemaType }
     *     
     */
    public OggDiTabDiSistemaType getSupporto() {
        return supporto;
    }

    /**
     * Sets the value of the supporto property.
     * 
     * @param value
     *     allowed object is
     *     {@link OggDiTabDiSistemaType }
     *     
     */
    public void setSupporto(OggDiTabDiSistemaType value) {
        this.supporto = value;
    }

}
