//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 02:58:48 PM CEST 
//


package it.engineering.xsd.ricercaprotocollo;

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
    "idUO",
    "liv1",
    "liv2",
    "liv3",
    "liv4",
    "postazione"
})
@XmlRootElement(name = "UO")
public class UO {

    @XmlAttribute(name = "FlgInclSottoUO")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String flgInclSottoUO;
    @XmlElement(name = "IdUO")
    protected String idUO;
    @XmlElement(name = "Liv1", required = true)
    protected String liv1;
    @XmlElement(name = "Liv2", required = true)
    protected String liv2;
    @XmlElement(name = "Liv3", required = true)
    protected String liv3;
    @XmlElement(name = "Liv4", required = true)
    protected String liv4;
    @XmlElement(name = "Postazione", required = true)
    protected String postazione;

    /**
     * Gets the value of the flgInclSottoUO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlgInclSottoUO() {
        if (flgInclSottoUO == null) {
            return "0";
        } else {
            return flgInclSottoUO;
        }
    }

    /**
     * Sets the value of the flgInclSottoUO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlgInclSottoUO(String value) {
        this.flgInclSottoUO = value;
    }

    /**
     * Gets the value of the idUO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUO() {
        return idUO;
    }

    /**
     * Sets the value of the idUO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUO(String value) {
        this.idUO = value;
    }

    /**
     * Gets the value of the liv1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiv1() {
        return liv1;
    }

    /**
     * Sets the value of the liv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiv1(String value) {
        this.liv1 = value;
    }

    /**
     * Gets the value of the liv2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiv2() {
        return liv2;
    }

    /**
     * Sets the value of the liv2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiv2(String value) {
        this.liv2 = value;
    }

    /**
     * Gets the value of the liv3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiv3() {
        return liv3;
    }

    /**
     * Sets the value of the liv3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiv3(String value) {
        this.liv3 = value;
    }

    /**
     * Gets the value of the liv4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiv4() {
        return liv4;
    }

    /**
     * Sets the value of the liv4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiv4(String value) {
        this.liv4 = value;
    }

    /**
     * Gets the value of the postazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostazione() {
        return postazione;
    }

    /**
     * Sets the value of the postazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostazione(String value) {
        this.postazione = value;
    }

}
