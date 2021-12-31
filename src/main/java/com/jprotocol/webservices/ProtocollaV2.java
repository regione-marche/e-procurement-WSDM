
package com.jprotocol.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProtocollaV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProtocollaV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NuovoRecord" type="{http://WebServices.jprotocol.com/}protocolloDaRegistrareV2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtocollaV2", propOrder = {
    "nuovoRecord"
})
public class ProtocollaV2 {

    @XmlElement(name = "NuovoRecord")
    protected ProtocolloDaRegistrareV2 nuovoRecord;

    /**
     * Gets the value of the nuovoRecord property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolloDaRegistrareV2 }
     *     
     */
    public ProtocolloDaRegistrareV2 getNuovoRecord() {
        return nuovoRecord;
    }

    /**
     * Sets the value of the nuovoRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolloDaRegistrareV2 }
     *     
     */
    public void setNuovoRecord(ProtocolloDaRegistrareV2 value) {
        this.nuovoRecord = value;
    }

}
