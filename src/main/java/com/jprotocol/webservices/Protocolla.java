
package com.jprotocol.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Protocolla complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Protocolla">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NuovoRecord" type="{http://WebServices.jprotocol.com/}protocolloDaRegistrare" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Protocolla", propOrder = {
    "nuovoRecord"
})
public class Protocolla {

    @XmlElement(name = "NuovoRecord")
    protected ProtocolloDaRegistrare nuovoRecord;

    /**
     * Gets the value of the nuovoRecord property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolloDaRegistrare }
     *     
     */
    public ProtocolloDaRegistrare getNuovoRecord() {
        return nuovoRecord;
    }

    /**
     * Sets the value of the nuovoRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolloDaRegistrare }
     *     
     */
    public void setNuovoRecord(ProtocolloDaRegistrare value) {
        this.nuovoRecord = value;
    }

}
