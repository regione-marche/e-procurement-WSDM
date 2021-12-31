
package it.archiflow96;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConsolidateCardResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ConsolidateCardOutput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "consolidateCardResult"
})
@XmlRootElement(name = "ConsolidateCardResponse")
public class ConsolidateCardResponse {

    @XmlElement(name = "ConsolidateCardResult", nillable = true)
    protected ConsolidateCardOutput consolidateCardResult;

    /**
     * Gets the value of the consolidateCardResult property.
     * 
     * @return
     *     possible object is
     *     {@link ConsolidateCardOutput }
     *     
     */
    public ConsolidateCardOutput getConsolidateCardResult() {
        return consolidateCardResult;
    }

    /**
     * Sets the value of the consolidateCardResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsolidateCardOutput }
     *     
     */
    public void setConsolidateCardResult(ConsolidateCardOutput value) {
        this.consolidateCardResult = value;
    }

}
