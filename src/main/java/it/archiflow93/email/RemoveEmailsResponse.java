
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
 *         &lt;element name="RemoveEmailsResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}RemoveEmailsOutput" minOccurs="0"/>
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
    "removeEmailsResult"
})
@XmlRootElement(name = "RemoveEmailsResponse", namespace = "http://tempuri.org/")
public class RemoveEmailsResponse {

    @XmlElement(name = "RemoveEmailsResult", namespace = "http://tempuri.org/", nillable = true)
    protected RemoveEmailsOutput removeEmailsResult;

    /**
     * Gets the value of the removeEmailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link RemoveEmailsOutput }
     *     
     */
    public RemoveEmailsOutput getRemoveEmailsResult() {
        return removeEmailsResult;
    }

    /**
     * Sets the value of the removeEmailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemoveEmailsOutput }
     *     
     */
    public void setRemoveEmailsResult(RemoveEmailsOutput value) {
        this.removeEmailsResult = value;
    }

}
