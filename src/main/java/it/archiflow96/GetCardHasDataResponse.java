
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
 *         &lt;element name="GetCardHasDataResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}GetCardHasDataOutput" minOccurs="0"/>
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
    "getCardHasDataResult"
})
@XmlRootElement(name = "GetCardHasDataResponse")
public class GetCardHasDataResponse {

    @XmlElement(name = "GetCardHasDataResult", nillable = true)
    protected GetCardHasDataOutput getCardHasDataResult;

    /**
     * Gets the value of the getCardHasDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetCardHasDataOutput }
     *     
     */
    public GetCardHasDataOutput getGetCardHasDataResult() {
        return getCardHasDataResult;
    }

    /**
     * Sets the value of the getCardHasDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCardHasDataOutput }
     *     
     */
    public void setGetCardHasDataResult(GetCardHasDataOutput value) {
        this.getCardHasDataResult = value;
    }

}
