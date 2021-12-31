
package it.archiflow93;

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
 *         &lt;element name="CalculateCardExpirationResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}CalculateCardExpirationOutput" minOccurs="0"/>
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
    "calculateCardExpirationResult"
})
@XmlRootElement(name = "CalculateCardExpirationResponse")
public class CalculateCardExpirationResponse {

    @XmlElement(name = "CalculateCardExpirationResult", nillable = true)
    protected CalculateCardExpirationOutput calculateCardExpirationResult;

    /**
     * Gets the value of the calculateCardExpirationResult property.
     * 
     * @return
     *     possible object is
     *     {@link CalculateCardExpirationOutput }
     *     
     */
    public CalculateCardExpirationOutput getCalculateCardExpirationResult() {
        return calculateCardExpirationResult;
    }

    /**
     * Sets the value of the calculateCardExpirationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculateCardExpirationOutput }
     *     
     */
    public void setCalculateCardExpirationResult(CalculateCardExpirationOutput value) {
        this.calculateCardExpirationResult = value;
    }

}
