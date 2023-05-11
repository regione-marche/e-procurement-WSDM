
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
 *         &lt;element name="retrieveEmailInput" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}RetrieveEmailInput" minOccurs="0"/>
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
    "retrieveEmailInput"
})
@XmlRootElement(name = "RetrieveEmail", namespace = "http://tempuri.org/")
public class RetrieveEmail {

    @XmlElement(namespace = "http://tempuri.org/", nillable = true)
    protected RetrieveEmailInput retrieveEmailInput;

    /**
     * Gets the value of the retrieveEmailInput property.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveEmailInput }
     *     
     */
    public RetrieveEmailInput getRetrieveEmailInput() {
        return retrieveEmailInput;
    }

    /**
     * Sets the value of the retrieveEmailInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveEmailInput }
     *     
     */
    public void setRetrieveEmailInput(RetrieveEmailInput value) {
        this.retrieveEmailInput = value;
    }

}
