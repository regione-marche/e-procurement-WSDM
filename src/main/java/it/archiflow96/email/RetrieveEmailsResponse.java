
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
 *         &lt;element name="RetrieveEmailsResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}RetrieveEmailsOutput" minOccurs="0"/>
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
    "retrieveEmailsResult"
})
@XmlRootElement(name = "RetrieveEmailsResponse", namespace = "http://tempuri.org/")
public class RetrieveEmailsResponse {

    @XmlElement(name = "RetrieveEmailsResult", namespace = "http://tempuri.org/", nillable = true)
    protected RetrieveEmailsOutput retrieveEmailsResult;

    /**
     * Gets the value of the retrieveEmailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveEmailsOutput }
     *     
     */
    public RetrieveEmailsOutput getRetrieveEmailsResult() {
        return retrieveEmailsResult;
    }

    /**
     * Sets the value of the retrieveEmailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveEmailsOutput }
     *     
     */
    public void setRetrieveEmailsResult(RetrieveEmailsOutput value) {
        this.retrieveEmailsResult = value;
    }

}
