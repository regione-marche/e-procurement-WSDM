
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
 *         &lt;element name="GetCardExpirationResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}GetCardExpirationOutput" minOccurs="0"/>
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
    "getCardExpirationResult"
})
@XmlRootElement(name = "GetCardExpirationResponse")
public class GetCardExpirationResponse {

    @XmlElement(name = "GetCardExpirationResult", nillable = true)
    protected GetCardExpirationOutput getCardExpirationResult;

    /**
     * Gets the value of the getCardExpirationResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetCardExpirationOutput }
     *     
     */
    public GetCardExpirationOutput getGetCardExpirationResult() {
        return getCardExpirationResult;
    }

    /**
     * Sets the value of the getCardExpirationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCardExpirationOutput }
     *     
     */
    public void setGetCardExpirationResult(GetCardExpirationOutput value) {
        this.getCardExpirationResult = value;
    }

}
