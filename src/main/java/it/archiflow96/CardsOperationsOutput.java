
package it.archiflow96;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardsOperationsOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardsOperationsOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="CardId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="Operations" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}CardOperations" minOccurs="0"/>
 *         &lt;element name="OperationsNotAllowed" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}ArrayOfCardOperationNotAllowedInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardsOperationsOutput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "cardId",
    "operations",
    "operationsNotAllowed"
})
public class CardsOperationsOutput
    extends BaseOutput
{

    @XmlElement(name = "CardId")
    protected String cardId;
    @XmlElement(name = "Operations", nillable = true)
    protected CardOperations operations;
    @XmlElement(name = "OperationsNotAllowed", nillable = true)
    protected ArrayOfCardOperationNotAllowedInfo operationsNotAllowed;

    /**
     * Gets the value of the cardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * Sets the value of the cardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardId(String value) {
        this.cardId = value;
    }

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

    /**
     * Gets the value of the operationsNotAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCardOperationNotAllowedInfo }
     *     
     */
    public ArrayOfCardOperationNotAllowedInfo getOperationsNotAllowed() {
        return operationsNotAllowed;
    }

    /**
     * Sets the value of the operationsNotAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCardOperationNotAllowedInfo }
     *     
     */
    public void setOperationsNotAllowed(ArrayOfCardOperationNotAllowedInfo value) {
        this.operationsNotAllowed = value;
    }

}
