
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
 *         &lt;element name="GetAddressesContactsResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}GetAddressesContactsOutput" minOccurs="0"/>
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
    "getAddressesContactsResult"
})
@XmlRootElement(name = "GetAddressesContactsResponse")
public class GetAddressesContactsResponse {

    @XmlElement(name = "GetAddressesContactsResult", nillable = true)
    protected GetAddressesContactsOutput getAddressesContactsResult;

    /**
     * Gets the value of the getAddressesContactsResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetAddressesContactsOutput }
     *     
     */
    public GetAddressesContactsOutput getGetAddressesContactsResult() {
        return getAddressesContactsResult;
    }

    /**
     * Sets the value of the getAddressesContactsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAddressesContactsOutput }
     *     
     */
    public void setGetAddressesContactsResult(GetAddressesContactsOutput value) {
        this.getAddressesContactsResult = value;
    }

}
