
package it.archiflow93;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardOperationsOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardOperationsOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="Operations" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}CardOperations" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardOperationsOutput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "operations"
})
public class CardOperationsOutput
    extends BaseOutput
{

    @XmlElement(name = "Operations", nillable = true)
    protected CardOperations operations;

    /**
     * Gets the value of the operations property.
     * 
     * @return
     *     possible object is
     *     {@link CardOperations }
     *     
     */
    public CardOperations getOperations() {
        return operations;
    }

    /**
     * Sets the value of the operations property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardOperations }
     *     
     */
    public void setOperations(CardOperations value) {
        this.operations = value;
    }

}
