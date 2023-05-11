
package it.archiflow96;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendCardsOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendCardsOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="ListSendingValues" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfSendingOutValues" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendCardsOutput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "listSendingValues"
})
public class SendCardsOutput
    extends BaseOutput
{

    @XmlElement(name = "ListSendingValues", nillable = true)
    protected ArrayOfSendingOutValues listSendingValues;

    /**
     * Gets the value of the listSendingValues property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSendingOutValues }
     *     
     */
    public ArrayOfSendingOutValues getListSendingValues() {
        return listSendingValues;
    }

    /**
     * Sets the value of the listSendingValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSendingOutValues }
     *     
     */
    public void setListSendingValues(ArrayOfSendingOutValues value) {
        this.listSendingValues = value;
    }

}
