
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
 *         &lt;element name="retrieveEmailsInput" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}RetrieveEmailsInput" minOccurs="0"/>
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
    "retrieveEmailsInput"
})
@XmlRootElement(name = "RetrieveEmails", namespace = "http://tempuri.org/")
public class RetrieveEmails {

    @XmlElement(namespace = "http://tempuri.org/", nillable = true)
    protected RetrieveEmailsInput retrieveEmailsInput;

    /**
     * Gets the value of the retrieveEmailsInput property.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveEmailsInput }
     *     
     */
    public RetrieveEmailsInput getRetrieveEmailsInput() {
        return retrieveEmailsInput;
    }

    /**
     * Sets the value of the retrieveEmailsInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveEmailsInput }
     *     
     */
    public void setRetrieveEmailsInput(RetrieveEmailsInput value) {
        this.retrieveEmailsInput = value;
    }

}
