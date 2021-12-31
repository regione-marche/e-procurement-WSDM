
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendExternalMailOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendExternalMailOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="CardIdsNotVisible" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendExternalMailOutput", propOrder = {
    "cardIdsNotVisible"
})
public class SendExternalMailOutput
    extends BaseOutput
{

    @XmlElement(name = "CardIdsNotVisible", nillable = true)
    protected ArrayOfguid cardIdsNotVisible;

    /**
     * Gets the value of the cardIdsNotVisible property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfguid }
     *     
     */
    public ArrayOfguid getCardIdsNotVisible() {
        return cardIdsNotVisible;
    }

    /**
     * Sets the value of the cardIdsNotVisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfguid }
     *     
     */
    public void setCardIdsNotVisible(ArrayOfguid value) {
        this.cardIdsNotVisible = value;
    }

}
