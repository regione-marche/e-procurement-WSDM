
package it.archiflow94;

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
 *         &lt;element name="getListItemsInput" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}GetListItemsInput" minOccurs="0"/>
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
    "getListItemsInput"
})
@XmlRootElement(name = "GetListItemsByParam")
public class GetListItemsByParam {

    @XmlElement(nillable = true)
    protected GetListItemsInput getListItemsInput;

    /**
     * Gets the value of the getListItemsInput property.
     * 
     * @return
     *     possible object is
     *     {@link GetListItemsInput }
     *     
     */
    public GetListItemsInput getGetListItemsInput() {
        return getListItemsInput;
    }

    /**
     * Sets the value of the getListItemsInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetListItemsInput }
     *     
     */
    public void setGetListItemsInput(GetListItemsInput value) {
        this.getListItemsInput = value;
    }

}
