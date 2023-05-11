
package it.archiflow93;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCardsVisibilityInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCardsVisibilityInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="CardIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *         &lt;element name="VisUserRight" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}UserRights" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCardsVisibilityInput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "cardIds",
    "visUserRight"
})
public class GetCardsVisibilityInput
    extends BaseInput
{

    @XmlElement(name = "CardIds", nillable = true)
    protected ArrayOfguid cardIds;
    @XmlElement(name = "VisUserRight")
    protected UserRights visUserRight;

    /**
     * Gets the value of the cardIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfguid }
     *     
     */
    public ArrayOfguid getCardIds() {
        return cardIds;
    }

    /**
     * Sets the value of the cardIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfguid }
     *     
     */
    public void setCardIds(ArrayOfguid value) {
        this.cardIds = value;
    }

    /**
     * Gets the value of the visUserRight property.
     * 
     * @return
     *     possible object is
     *     {@link UserRights }
     *     
     */
    public UserRights getVisUserRight() {
        return visUserRight;
    }

    /**
     * Sets the value of the visUserRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserRights }
     *     
     */
    public void setVisUserRight(UserRights value) {
        this.visUserRight = value;
    }

}
