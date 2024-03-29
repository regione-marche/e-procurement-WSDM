
package it.archiflow93;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalculateCardExpirationOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalculateCardExpirationOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="CardExpiration" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}CardExpirationInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculateCardExpirationOutput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "cardExpiration"
})
public class CalculateCardExpirationOutput
    extends BaseOutput
{

    @XmlElement(name = "CardExpiration", nillable = true)
    protected CardExpirationInfo cardExpiration;

    /**
     * Gets the value of the cardExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link CardExpirationInfo }
     *     
     */
    public CardExpirationInfo getCardExpiration() {
        return cardExpiration;
    }

    /**
     * Sets the value of the cardExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardExpirationInfo }
     *     
     */
    public void setCardExpiration(CardExpirationInfo value) {
        this.cardExpiration = value;
    }

}
