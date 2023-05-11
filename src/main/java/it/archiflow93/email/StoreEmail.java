
package it.archiflow93.email;

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
 *         &lt;element name="storeEmailInput" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}StoreEmailInput" minOccurs="0"/>
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
    "storeEmailInput"
})
@XmlRootElement(name = "StoreEmail", namespace = "http://tempuri.org/")
public class StoreEmail {

    @XmlElement(namespace = "http://tempuri.org/", nillable = true)
    protected StoreEmailInput storeEmailInput;

    /**
     * Gets the value of the storeEmailInput property.
     * 
     * @return
     *     possible object is
     *     {@link StoreEmailInput }
     *     
     */
    public StoreEmailInput getStoreEmailInput() {
        return storeEmailInput;
    }

    /**
     * Sets the value of the storeEmailInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreEmailInput }
     *     
     */
    public void setStoreEmailInput(StoreEmailInput value) {
        this.storeEmailInput = value;
    }

}
