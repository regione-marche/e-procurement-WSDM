//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.31 at 02:46:49 PM CEST 
//


package it.engineering.documentale.xsd.outputdatifolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACLRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACLRecordType">
 *   &lt;complexContent>
 *     &lt;extension base="{}SoggettoInternoInACLType">
 *       &lt;sequence>
 *         &lt;element name="VisualizzazioneDati" type="{}FlagConsentiNegaType" minOccurs="0"/>
 *         &lt;element name="ModificaDati" type="{}FlagConsentiNegaType" minOccurs="0"/>
 *         &lt;element name="ModificaContenutoUD" type="{}FlagConsentiNegaType" minOccurs="0"/>
 *         &lt;element name="ModificaContenutoSubFolder" type="{}FlagConsentiNegaType" minOccurs="0"/>
 *         &lt;element name="ModificaPermessi" type="{}FlagConsentiNegaType" minOccurs="0"/>
 *         &lt;element name="Copia" type="{}FlagConsentiNegaType" minOccurs="0"/>
 *         &lt;element name="Eliminazione" type="{}FlagConsentiNegaType" minOccurs="0"/>
 *         &lt;element name="Recupero" type="{}FlagConsentiNegaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACLRecordType", propOrder = {
    "visualizzazioneDati",
    "modificaDati",
    "modificaContenutoUD",
    "modificaContenutoSubFolder",
    "modificaPermessi",
    "copia",
    "eliminazione",
    "recupero"
})
public class ACLRecordType
    extends SoggettoInternoInACLType
{

    @XmlElement(name = "VisualizzazioneDati")
    protected String visualizzazioneDati;
    @XmlElement(name = "ModificaDati")
    protected String modificaDati;
    @XmlElement(name = "ModificaContenutoUD")
    protected String modificaContenutoUD;
    @XmlElement(name = "ModificaContenutoSubFolder")
    protected String modificaContenutoSubFolder;
    @XmlElement(name = "ModificaPermessi")
    protected String modificaPermessi;
    @XmlElement(name = "Copia")
    protected String copia;
    @XmlElement(name = "Eliminazione")
    protected String eliminazione;
    @XmlElement(name = "Recupero")
    protected String recupero;

    /**
     * Gets the value of the visualizzazioneDati property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisualizzazioneDati() {
        return visualizzazioneDati;
    }

    /**
     * Sets the value of the visualizzazioneDati property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisualizzazioneDati(String value) {
        this.visualizzazioneDati = value;
    }

    /**
     * Gets the value of the modificaDati property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificaDati() {
        return modificaDati;
    }

    /**
     * Sets the value of the modificaDati property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificaDati(String value) {
        this.modificaDati = value;
    }

    /**
     * Gets the value of the modificaContenutoUD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificaContenutoUD() {
        return modificaContenutoUD;
    }

    /**
     * Sets the value of the modificaContenutoUD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificaContenutoUD(String value) {
        this.modificaContenutoUD = value;
    }

    /**
     * Gets the value of the modificaContenutoSubFolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificaContenutoSubFolder() {
        return modificaContenutoSubFolder;
    }

    /**
     * Sets the value of the modificaContenutoSubFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificaContenutoSubFolder(String value) {
        this.modificaContenutoSubFolder = value;
    }

    /**
     * Gets the value of the modificaPermessi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificaPermessi() {
        return modificaPermessi;
    }

    /**
     * Sets the value of the modificaPermessi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificaPermessi(String value) {
        this.modificaPermessi = value;
    }

    /**
     * Gets the value of the copia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopia() {
        return copia;
    }

    /**
     * Sets the value of the copia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopia(String value) {
        this.copia = value;
    }

    /**
     * Gets the value of the eliminazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEliminazione() {
        return eliminazione;
    }

    /**
     * Sets the value of the eliminazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEliminazione(String value) {
        this.eliminazione = value;
    }

    /**
     * Gets the value of the recupero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecupero() {
        return recupero;
    }

    /**
     * Sets the value of the recupero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecupero(String value) {
        this.recupero = value;
    }

}
