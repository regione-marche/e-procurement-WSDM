//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.01 at 11:53:11 AM CEST 
//


package it.engineering.documentale.xsd.outputdatiud;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClassifFascicoloEstesoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassifFascicoloEstesoType">
 *   &lt;complexContent>
 *     &lt;extension base="{}ClassifFascicoloType">
 *       &lt;sequence>
 *         &lt;element name="OggettoFasc" type="{}OggettoFascType" minOccurs="0"/>
 *         &lt;element name="TipoFasc" type="{}OggDiTabDiSistemaType" minOccurs="0"/>
 *         &lt;element name="InCaricoA" type="{}AssegnatarioEffType" minOccurs="0"/>
 *         &lt;element name="ApertoDa" type="{}UOUserType" minOccurs="0"/>
 *         &lt;element name="AttributoAddFasc" type="{}AttributoAddizionaleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassifFascicoloEstesoType", propOrder = {
    "oggettoFasc",
    "tipoFasc",
    "inCaricoA",
    "apertoDa",
    "attributoAddFasc"
})
public class ClassifFascicoloEstesoType
    extends ClassifFascicoloType
{

    @XmlElement(name = "OggettoFasc")
    protected String oggettoFasc;
    @XmlElement(name = "TipoFasc")
    protected OggDiTabDiSistemaType tipoFasc;
    @XmlElement(name = "InCaricoA")
    protected AssegnatarioEffType inCaricoA;
    @XmlElement(name = "ApertoDa")
    protected UOUserType apertoDa;
    @XmlElement(name = "AttributoAddFasc")
    protected List<AttributoAddizionaleType> attributoAddFasc;

    /**
     * Gets the value of the oggettoFasc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOggettoFasc() {
        return oggettoFasc;
    }

    /**
     * Sets the value of the oggettoFasc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOggettoFasc(String value) {
        this.oggettoFasc = value;
    }

    /**
     * Gets the value of the tipoFasc property.
     * 
     * @return
     *     possible object is
     *     {@link OggDiTabDiSistemaType }
     *     
     */
    public OggDiTabDiSistemaType getTipoFasc() {
        return tipoFasc;
    }

    /**
     * Sets the value of the tipoFasc property.
     * 
     * @param value
     *     allowed object is
     *     {@link OggDiTabDiSistemaType }
     *     
     */
    public void setTipoFasc(OggDiTabDiSistemaType value) {
        this.tipoFasc = value;
    }

    /**
     * Gets the value of the inCaricoA property.
     * 
     * @return
     *     possible object is
     *     {@link AssegnatarioEffType }
     *     
     */
    public AssegnatarioEffType getInCaricoA() {
        return inCaricoA;
    }

    /**
     * Sets the value of the inCaricoA property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssegnatarioEffType }
     *     
     */
    public void setInCaricoA(AssegnatarioEffType value) {
        this.inCaricoA = value;
    }

    /**
     * Gets the value of the apertoDa property.
     * 
     * @return
     *     possible object is
     *     {@link UOUserType }
     *     
     */
    public UOUserType getApertoDa() {
        return apertoDa;
    }

    /**
     * Sets the value of the apertoDa property.
     * 
     * @param value
     *     allowed object is
     *     {@link UOUserType }
     *     
     */
    public void setApertoDa(UOUserType value) {
        this.apertoDa = value;
    }

    /**
     * Gets the value of the attributoAddFasc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributoAddFasc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributoAddFasc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributoAddizionaleType }
     * 
     * 
     */
    public List<AttributoAddizionaleType> getAttributoAddFasc() {
        if (attributoAddFasc == null) {
            attributoAddFasc = new ArrayList<AttributoAddizionaleType>();
        }
        return this.attributoAddFasc;
    }

}
