
package it.archiflow96.email;

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
 *         &lt;element name="GetIndexesToStoreEmailResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}GetIndexesToStoreEmailOutput" minOccurs="0"/>
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
    "getIndexesToStoreEmailResult"
})
@XmlRootElement(name = "GetIndexesToStoreEmailResponse", namespace = "http://tempuri.org/")
public class GetIndexesToStoreEmailResponse {

    @XmlElement(name = "GetIndexesToStoreEmailResult", namespace = "http://tempuri.org/", nillable = true)
    protected GetIndexesToStoreEmailOutput getIndexesToStoreEmailResult;

    /**
     * Gets the value of the getIndexesToStoreEmailResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetIndexesToStoreEmailOutput }
     *     
     */
    public GetIndexesToStoreEmailOutput getGetIndexesToStoreEmailResult() {
        return getIndexesToStoreEmailResult;
    }

    /**
     * Sets the value of the getIndexesToStoreEmailResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetIndexesToStoreEmailOutput }
     *     
     */
    public void setGetIndexesToStoreEmailResult(GetIndexesToStoreEmailOutput value) {
        this.getIndexesToStoreEmailResult = value;
    }

}
