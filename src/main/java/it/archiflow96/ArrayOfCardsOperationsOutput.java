
package it.archiflow96;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCardsOperationsOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCardsOperationsOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardsOperationsOutput" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}CardsOperationsOutput" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCardsOperationsOutput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "cardsOperationsOutput"
})
public class ArrayOfCardsOperationsOutput {

    @XmlElement(name = "CardsOperationsOutput", nillable = true)
    protected List<CardsOperationsOutput> cardsOperationsOutput;

    /**
     * Gets the value of the cardsOperationsOutput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardsOperationsOutput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardsOperationsOutput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardsOperationsOutput }
     * 
     * 
     */
    public List<CardsOperationsOutput> getCardsOperationsOutput() {
        if (cardsOperationsOutput == null) {
            cardsOperationsOutput = new ArrayList<CardsOperationsOutput>();
        }
        return this.cardsOperationsOutput;
    }

}
