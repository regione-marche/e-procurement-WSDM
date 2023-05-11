
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Base_Search complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_Base_Search">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="Lang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SEARCHDESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Aggiuntivi" type="{http://www.Abletech.it/Arxivar}ArrayOfField_Abstract" minOccurs="0"/>
 *         &lt;element name="forceCaseInsensitive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_Base_Search", propOrder = {
    "lang",
    "searchdescription",
    "aggiuntivi",
    "forceCaseInsensitive"
})
@XmlSeeAlso({
    DmProfileSearch.class,
    DmTaskWorkSearch.class,
    DmContattiSearch.class,
    DmNoteWorkSearch.class,
    DmFascicoliSearch.class,
    DmAllegatiWorkSearch.class,
    DmDatiProfiloSearch.class,
    DmCampispecificiSearch.class,
    DmAssociaFolderSearch.class,
    DmMsgSearch.class,
    DmAllegatiDocSearch.class,
    DmProcessiSearch.class,
    DmNpceOutSearch.class,
    DmUtentiBaseSearch.class,
    DmElencoPraticheSearch.class
})
public abstract class DmBaseSearch
    extends Base
{

    @XmlElement(name = "Lang")
    protected String lang;
    @XmlElement(name = "SEARCHDESCRIPTION")
    protected String searchdescription;
    @XmlElement(name = "Aggiuntivi")
    protected ArrayOfFieldAbstract aggiuntivi;
    protected boolean forceCaseInsensitive;

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the searchdescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEARCHDESCRIPTION() {
        return searchdescription;
    }

    /**
     * Sets the value of the searchdescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEARCHDESCRIPTION(String value) {
        this.searchdescription = value;
    }

    /**
     * Gets the value of the aggiuntivi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFieldAbstract }
     *     
     */
    public ArrayOfFieldAbstract getAggiuntivi() {
        return aggiuntivi;
    }

    /**
     * Sets the value of the aggiuntivi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFieldAbstract }
     *     
     */
    public void setAggiuntivi(ArrayOfFieldAbstract value) {
        this.aggiuntivi = value;
    }

    /**
     * Gets the value of the forceCaseInsensitive property.
     * 
     */
    public boolean isForceCaseInsensitive() {
        return forceCaseInsensitive;
    }

    /**
     * Sets the value of the forceCaseInsensitive property.
     * 
     */
    public void setForceCaseInsensitive(boolean value) {
        this.forceCaseInsensitive = value;
    }

}
