
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProtocolCardResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ProtocolCardOutput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "protocolCardResult"
})
@XmlRootElement(name = "ProtocolCardResponse")
public class ProtocolCardResponse {

    @XmlElement(name = "ProtocolCardResult", nillable = true)
    protected ProtocolCardOutput protocolCardResult;

    /**
     * Gets the value of the protocolCardResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolCardOutput }
     *     
     */
    public ProtocolCardOutput getProtocolCardResult() {
        return protocolCardResult;
    }

    /**
     * Sets the value of the protocolCardResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolCardOutput }
     *     
     */
    public void setProtocolCardResult(ProtocolCardOutput value) {
        this.protocolCardResult = value;
    }

}
