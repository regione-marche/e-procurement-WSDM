
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
 *         &lt;element name="GetCardsOperationsAllowedResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfCardsOperationsOutput" minOccurs="0"/>
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
    "getCardsOperationsAllowedResult"
})
@XmlRootElement(name = "GetCardsOperationsAllowedResponse")
public class GetCardsOperationsAllowedResponse {

    @XmlElement(name = "GetCardsOperationsAllowedResult", nillable = true)
    protected ArrayOfCardsOperationsOutput getCardsOperationsAllowedResult;

    /**
     * Gets the value of the getCardsOperationsAllowedResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCardsOperationsOutput }
     *     
     */
    public ArrayOfCardsOperationsOutput getGetCardsOperationsAllowedResult() {
        return getCardsOperationsAllowedResult;
    }

    /**
     * Sets the value of the getCardsOperationsAllowedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCardsOperationsOutput }
     *     
     */
    public void setGetCardsOperationsAllowedResult(ArrayOfCardsOperationsOutput value) {
        this.getCardsOperationsAllowedResult = value;
    }

}
