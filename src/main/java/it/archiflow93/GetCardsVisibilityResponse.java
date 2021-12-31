
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
 *         &lt;element name="GetCardsVisibilityResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}GetCardsVisibilityOutput" minOccurs="0"/>
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
    "getCardsVisibilityResult"
})
@XmlRootElement(name = "GetCardsVisibilityResponse")
public class GetCardsVisibilityResponse {

    @XmlElement(name = "GetCardsVisibilityResult", nillable = true)
    protected GetCardsVisibilityOutput getCardsVisibilityResult;

    /**
     * Gets the value of the getCardsVisibilityResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetCardsVisibilityOutput }
     *     
     */
    public GetCardsVisibilityOutput getGetCardsVisibilityResult() {
        return getCardsVisibilityResult;
    }

    /**
     * Sets the value of the getCardsVisibilityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCardsVisibilityOutput }
     *     
     */
    public void setGetCardsVisibilityResult(GetCardsVisibilityOutput value) {
        this.getCardsVisibilityResult = value;
    }

}
