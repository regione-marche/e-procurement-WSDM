
package it.archiflow94;

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
 *         &lt;element name="GetCardsByParamResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}GetCardsOutput" minOccurs="0"/>
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
    "getCardsByParamResult"
})
@XmlRootElement(name = "GetCardsByParamResponse")
public class GetCardsByParamResponse {

    @XmlElement(name = "GetCardsByParamResult", nillable = true)
    protected GetCardsOutput getCardsByParamResult;

    /**
     * Gets the value of the getCardsByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetCardsOutput }
     *     
     */
    public GetCardsOutput getGetCardsByParamResult() {
        return getCardsByParamResult;
    }

    /**
     * Sets the value of the getCardsByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCardsOutput }
     *     
     */
    public void setGetCardsByParamResult(GetCardsOutput value) {
        this.getCardsByParamResult = value;
    }

}
