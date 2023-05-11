
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
 *         &lt;element name="StoreEmailResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}StoreEmailOutput" minOccurs="0"/>
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
    "storeEmailResult"
})
@XmlRootElement(name = "StoreEmailResponse", namespace = "http://tempuri.org/")
public class StoreEmailResponse {

    @XmlElement(name = "StoreEmailResult", namespace = "http://tempuri.org/", nillable = true)
    protected StoreEmailOutput storeEmailResult;

    /**
     * Gets the value of the storeEmailResult property.
     * 
     * @return
     *     possible object is
     *     {@link StoreEmailOutput }
     *     
     */
    public StoreEmailOutput getStoreEmailResult() {
        return storeEmailResult;
    }

    /**
     * Sets the value of the storeEmailResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreEmailOutput }
     *     
     */
    public void setStoreEmailResult(StoreEmailOutput value) {
        this.storeEmailResult = value;
    }

}
