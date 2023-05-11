
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
 *         &lt;element name="GetCardWorkItemsResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}GetCardWorkItemsOutput" minOccurs="0"/>
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
    "getCardWorkItemsResult"
})
@XmlRootElement(name = "GetCardWorkItemsResponse")
public class GetCardWorkItemsResponse {

    @XmlElement(name = "GetCardWorkItemsResult", nillable = true)
    protected GetCardWorkItemsOutput getCardWorkItemsResult;

    /**
     * Gets the value of the getCardWorkItemsResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetCardWorkItemsOutput }
     *     
     */
    public GetCardWorkItemsOutput getGetCardWorkItemsResult() {
        return getCardWorkItemsResult;
    }

    /**
     * Sets the value of the getCardWorkItemsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCardWorkItemsOutput }
     *     
     */
    public void setGetCardWorkItemsResult(GetCardWorkItemsOutput value) {
        this.getCardWorkItemsResult = value;
    }

}
