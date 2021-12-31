
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
 *         &lt;element name="LeggiCopieResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "leggiCopieResult"
})
@XmlRootElement(name = "LeggiCopieResponse")
public class LeggiCopieResponse {

    @XmlElement(name = "LeggiCopieResult", required = true)
    protected String leggiCopieResult;

    /**
     * Gets the value of the leggiCopieResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeggiCopieResult() {
        return leggiCopieResult;
    }

    /**
     * Sets the value of the leggiCopieResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeggiCopieResult(String value) {
        this.leggiCopieResult = value;
    }

}
