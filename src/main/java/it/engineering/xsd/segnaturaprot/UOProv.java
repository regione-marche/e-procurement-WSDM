//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 02:58:50 PM CEST 
//


package it.engineering.xsd.segnaturaprot;

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
    "uo"
})
@XmlRootElement(name = "UOProv")
public class UOProv {

    @XmlElement(name = "UO", required = true)
    protected UO uo;

    /**
     * Gets the value of the uo property.
     * 
     * @return
     *     possible object is
     *     {@link UO }
     *     
     */
    public UO getUO() {
        return uo;
    }

    /**
     * Sets the value of the uo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UO }
     *     
     */
    public void setUO(UO value) {
        this.uo = value;
    }

}
