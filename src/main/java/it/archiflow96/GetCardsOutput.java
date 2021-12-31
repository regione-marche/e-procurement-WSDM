
package it.archiflow96;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCardsOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCardsOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="Cards" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfCard" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCardsOutput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "cards"
})
public class GetCardsOutput
    extends BaseOutput
{

    @XmlElement(name = "Cards", nillable = true)
    protected ArrayOfCard cards;

    /**
     * Gets the value of the cards property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCard }
     *     
     */
    public ArrayOfCard getCards() {
        return cards;
    }

    /**
     * Sets the value of the cards property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCard }
     *     
     */
    public void setCards(ArrayOfCard value) {
        this.cards = value;
    }

}
