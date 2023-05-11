
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SortCardInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SortCardInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="AutoCheckIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Card" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}CardBundle" minOccurs="0"/>
 *         &lt;element name="IsAutomaticProtocol" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SortCardInput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "autoCheckIn",
    "card",
    "isAutomaticProtocol"
})
public class SortCardInput
    extends BaseInput
{

    @XmlElement(name = "AutoCheckIn")
    protected Boolean autoCheckIn;
    @XmlElement(name = "Card", nillable = true)
    protected CardBundle card;
    @XmlElement(name = "IsAutomaticProtocol")
    protected Boolean isAutomaticProtocol;

    /**
     * Gets the value of the autoCheckIn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoCheckIn() {
        return autoCheckIn;
    }

    /**
     * Sets the value of the autoCheckIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoCheckIn(Boolean value) {
        this.autoCheckIn = value;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link CardBundle }
     *     
     */
    public CardBundle getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardBundle }
     *     
     */
    public void setCard(CardBundle value) {
        this.card = value;
    }

    /**
     * Gets the value of the isAutomaticProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAutomaticProtocol() {
        return isAutomaticProtocol;
    }

    /**
     * Sets the value of the isAutomaticProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAutomaticProtocol(Boolean value) {
        this.isAutomaticProtocol = value;
    }

}
