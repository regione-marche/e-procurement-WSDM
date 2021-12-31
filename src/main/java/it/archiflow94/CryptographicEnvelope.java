
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CryptographicEnvelope complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CryptographicEnvelope">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Items" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Sign.ValueObject}ArrayOfEnvelopeInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptographicEnvelope", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Sign.ValueObject", propOrder = {
    "items"
})
public class CryptographicEnvelope {

    @XmlElement(name = "Items", nillable = true)
    protected ArrayOfEnvelopeInfo items;

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEnvelopeInfo }
     *     
     */
    public ArrayOfEnvelopeInfo getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEnvelopeInfo }
     *     
     */
    public void setItems(ArrayOfEnvelopeInfo value) {
        this.items = value;
    }

}
