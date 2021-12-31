
package it.archiflow96;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAddressesContactsInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAddressesContactsInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="CardIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *         &lt;element name="GetOnlyMainAddresses" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAddressesContactsInput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "cardIds",
    "getOnlyMainAddresses"
})
public class GetAddressesContactsInput
    extends BaseInput
{

    @XmlElement(name = "CardIds", nillable = true)
    protected ArrayOfguid cardIds;
    @XmlElement(name = "GetOnlyMainAddresses")
    protected Boolean getOnlyMainAddresses;

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
     * Gets the value of the getOnlyMainAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGetOnlyMainAddresses() {
        return getOnlyMainAddresses;
    }

    /**
     * Sets the value of the getOnlyMainAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGetOnlyMainAddresses(Boolean value) {
        this.getOnlyMainAddresses = value;
    }

}
