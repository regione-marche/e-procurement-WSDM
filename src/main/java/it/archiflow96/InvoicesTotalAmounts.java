
package it.archiflow96;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoicesTotalAmounts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoicesTotalAmounts">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="InTotalAmount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="OutTotalAmount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoicesTotalAmounts", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "inTotalAmount",
    "outTotalAmount"
})
public class InvoicesTotalAmounts
    extends BaseOutput
{

    @XmlElement(name = "InTotalAmount", nillable = true)
    protected Float inTotalAmount;
    @XmlElement(name = "OutTotalAmount", nillable = true)
    protected Float outTotalAmount;

    /**
     * Gets the value of the inTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getInTotalAmount() {
        return inTotalAmount;
    }

    /**
     * Sets the value of the inTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setInTotalAmount(Float value) {
        this.inTotalAmount = value;
    }

    /**
     * Gets the value of the outTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOutTotalAmount() {
        return outTotalAmount;
    }

    /**
     * Sets the value of the outTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOutTotalAmount(Float value) {
        this.outTotalAmount = value;
    }

}
