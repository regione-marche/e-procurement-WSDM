
package it.archiflow96;

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
 *         &lt;element name="ResetCardResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ResetCardOutput" minOccurs="0"/>
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
    "resetCardResult"
})
@XmlRootElement(name = "ResetCardResponse")
public class ResetCardResponse {

    @XmlElement(name = "ResetCardResult", nillable = true)
    protected ResetCardOutput resetCardResult;

    /**
     * Gets the value of the resetCardResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResetCardOutput }
     *     
     */
    public ResetCardOutput getResetCardResult() {
        return resetCardResult;
    }

    /**
     * Sets the value of the resetCardResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResetCardOutput }
     *     
     */
    public void setResetCardResult(ResetCardOutput value) {
        this.resetCardResult = value;
    }

}
