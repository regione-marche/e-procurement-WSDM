
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetCardExpirationOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetCardExpirationOutput">
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
@XmlType(name = "SetCardExpirationOutput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "cardExpiration"
})
public class SetCardExpirationOutput
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
