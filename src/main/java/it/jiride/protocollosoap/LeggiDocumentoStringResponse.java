
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
 *         &lt;element name="LeggiDocumentoStringResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "leggiDocumentoStringResult"
})
@XmlRootElement(name = "LeggiDocumentoStringResponse")
public class LeggiDocumentoStringResponse {

    @XmlElement(name = "LeggiDocumentoStringResult", required = true)
    protected String leggiDocumentoStringResult;

    /**
     * Gets the value of the leggiDocumentoStringResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeggiDocumentoStringResult() {
        return leggiDocumentoStringResult;
    }

    /**
     * Sets the value of the leggiDocumentoStringResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeggiDocumentoStringResult(String value) {
        this.leggiDocumentoStringResult = value;
    }

}
