
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
 *         &lt;element name="removeEmailsInput" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}RemoveEmailsInput" minOccurs="0"/>
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
    "removeEmailsInput"
})
@XmlRootElement(name = "RemoveEmails", namespace = "http://tempuri.org/")
public class RemoveEmails {

    @XmlElement(namespace = "http://tempuri.org/", nillable = true)
    protected RemoveEmailsInput removeEmailsInput;

    /**
     * Gets the value of the removeEmailsInput property.
     * 
     * @return
     *     possible object is
     *     {@link RemoveEmailsInput }
     *     
     */
    public RemoveEmailsInput getRemoveEmailsInput() {
        return removeEmailsInput;
    }

    /**
     * Sets the value of the removeEmailsInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemoveEmailsInput }
     *     
     */
    public void setRemoveEmailsInput(RemoveEmailsInput value) {
        this.removeEmailsInput = value;
    }

}
