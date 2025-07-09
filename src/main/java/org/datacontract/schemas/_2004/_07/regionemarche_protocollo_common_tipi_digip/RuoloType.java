
package org.datacontract.schemas._2004._07.regionemarche_protocollo_common_tipi_digip;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RuoloType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuoloType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Item" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuoloType", propOrder = {
    "item"
})
public class RuoloType {

    @XmlElement(name = "Item", nillable = true)
    protected Object item;

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setItem(Object value) {
        this.item = value;
    }

}
