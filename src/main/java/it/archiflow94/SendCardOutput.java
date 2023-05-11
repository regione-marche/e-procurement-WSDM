
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendCardOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendCardOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="SendingValues" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}SendingOutValues" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendCardOutput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "sendingValues"
})
public class SendCardOutput
    extends BaseOutput
{

    @XmlElement(name = "SendingValues", nillable = true)
    protected SendingOutValues sendingValues;

    /**
     * Gets the value of the sendingValues property.
     * 
     * @return
     *     possible object is
     *     {@link SendingOutValues }
     *     
     */
    public SendingOutValues getSendingValues() {
        return sendingValues;
    }

    /**
     * Sets the value of the sendingValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendingOutValues }
     *     
     */
    public void setSendingValues(SendingOutValues value) {
        this.sendingValues = value;
    }

}
