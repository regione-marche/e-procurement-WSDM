
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCardsVisibilityOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCardsVisibilityOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="SendObj" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}SendObject" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCardsVisibilityOutput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "sendObj"
})
public class GetCardsVisibilityOutput
    extends BaseOutput
{

    @XmlElement(name = "SendObj", nillable = true)
    protected SendObject sendObj;

    /**
     * Gets the value of the sendObj property.
     * 
     * @return
     *     possible object is
     *     {@link SendObject }
     *     
     */
    public SendObject getSendObj() {
        return sendObj;
    }

    /**
     * Sets the value of the sendObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendObject }
     *     
     */
    public void setSendObj(SendObject value) {
        this.sendObj = value;
    }

}
