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
    "attrOpz"
})
@XmlRootElement(name = "AttrOpzIn")
public class AttrOpzIn {

    @XmlElement(name = "AttrOpz", required = true)
    protected AttrOpz attrOpz;

    /**
     * Gets the value of the attrOpz property.
     * 
     * @return
     *     possible object is
     *     {@link AttrOpz }
     *     
     */
    public AttrOpz getAttrOpz() {
        return attrOpz;
    }

    /**
     * Sets the value of the attrOpz property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttrOpz }
     *     
     */
    public void setAttrOpz(AttrOpz value) {
        this.attrOpz = value;
    }

}
