
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCardHasDataOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCardHasDataOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="HasData" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}CardHasData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCardHasDataOutput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "hasData"
})
public class GetCardHasDataOutput
    extends BaseOutput
{

    @XmlElement(name = "HasData", nillable = true)
    protected CardHasData hasData;

    /**
     * Gets the value of the hasData property.
     * 
     * @return
     *     possible object is
     *     {@link CardHasData }
     *     
     */
    public CardHasData getHasData() {
        return hasData;
    }

    /**
     * Sets the value of the hasData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardHasData }
     *     
     */
    public void setHasData(CardHasData value) {
        this.hasData = value;
    }

}
