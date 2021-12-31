
package it.jiride.protocollosoap;

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
 *         &lt;element name="LeggiProtocolloStringResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "leggiProtocolloStringResult"
})
@XmlRootElement(name = "LeggiProtocolloStringResponse")
public class LeggiProtocolloStringResponse {

    @XmlElement(name = "LeggiProtocolloStringResult", required = true)
    protected String leggiProtocolloStringResult;

    /**
     * Gets the value of the leggiProtocolloStringResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeggiProtocolloStringResult() {
        return leggiProtocolloStringResult;
    }

    /**
     * Sets the value of the leggiProtocolloStringResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeggiProtocolloStringResult(String value) {
        this.leggiProtocolloStringResult = value;
    }

}
