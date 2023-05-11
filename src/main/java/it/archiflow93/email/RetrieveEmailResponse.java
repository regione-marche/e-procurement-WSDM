
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
 *         &lt;element name="RetrieveEmailResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}RetrieveEmailOutput" minOccurs="0"/>
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
    "retrieveEmailResult"
})
@XmlRootElement(name = "RetrieveEmailResponse", namespace = "http://tempuri.org/")
public class RetrieveEmailResponse {

    @XmlElement(name = "RetrieveEmailResult", namespace = "http://tempuri.org/", nillable = true)
    protected RetrieveEmailOutput retrieveEmailResult;

    /**
     * Gets the value of the retrieveEmailResult property.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveEmailOutput }
     *     
     */
    public RetrieveEmailOutput getRetrieveEmailResult() {
        return retrieveEmailResult;
    }

    /**
     * Sets the value of the retrieveEmailResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveEmailOutput }
     *     
     */
    public void setRetrieveEmailResult(RetrieveEmailOutput value) {
        this.retrieveEmailResult = value;
    }

}
