
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
 *         &lt;element name="SendCardsResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}SendCardsOutput" minOccurs="0"/>
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
    "sendCardsResult"
})
@XmlRootElement(name = "SendCardsResponse")
public class SendCardsResponse {

    @XmlElement(name = "SendCardsResult", nillable = true)
    protected SendCardsOutput sendCardsResult;

    /**
     * Gets the value of the sendCardsResult property.
     * 
     * @return
     *     possible object is
     *     {@link SendCardsOutput }
     *     
     */
    public SendCardsOutput getSendCardsResult() {
        return sendCardsResult;
    }

    /**
     * Sets the value of the sendCardsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendCardsOutput }
     *     
     */
    public void setSendCardsResult(SendCardsOutput value) {
        this.sendCardsResult = value;
    }

}
