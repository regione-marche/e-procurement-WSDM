//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 02:58:49 PM CEST 
//


package it.engineering.xsd.risultatoricerca;

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
    "estremiReg"
})
@XmlRootElement(name = "RegSecondaria")
public class RegSecondaria {

    @XmlElement(name = "EstremiReg", required = true)
    protected EstremiReg estremiReg;

    /**
     * Gets the value of the estremiReg property.
     * 
     * @return
     *     possible object is
     *     {@link EstremiReg }
     *     
     */
    public EstremiReg getEstremiReg() {
        return estremiReg;
    }

    /**
     * Sets the value of the estremiReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstremiReg }
     *     
     */
    public void setEstremiReg(EstremiReg value) {
        this.estremiReg = value;
    }

}
