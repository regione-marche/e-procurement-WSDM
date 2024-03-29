
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
 *         &lt;element name="LeggiDocumentoPlusResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "leggiDocumentoPlusResult"
})
@XmlRootElement(name = "LeggiDocumentoPlusResponse")
public class LeggiDocumentoPlusResponse {

    @XmlElement(name = "LeggiDocumentoPlusResult", required = true)
    protected String leggiDocumentoPlusResult;

    /**
     * Gets the value of the leggiDocumentoPlusResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeggiDocumentoPlusResult() {
        return leggiDocumentoPlusResult;
    }

    /**
     * Sets the value of the leggiDocumentoPlusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeggiDocumentoPlusResult(String value) {
        this.leggiDocumentoPlusResult = value;
    }

}
