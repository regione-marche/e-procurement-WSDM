
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
 *         &lt;element name="SendExternalMailResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}SendExternalMailOutput" minOccurs="0"/>
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
    "sendExternalMailResult"
})
@XmlRootElement(name = "SendExternalMailResponse", namespace = "http://tempuri.org/")
public class SendExternalMailResponse {

    @XmlElement(name = "SendExternalMailResult", namespace = "http://tempuri.org/", nillable = true)
    protected SendExternalMailOutput sendExternalMailResult;

    /**
     * Gets the value of the sendExternalMailResult property.
     * 
     * @return
     *     possible object is
     *     {@link SendExternalMailOutput }
     *     
     */
    public SendExternalMailOutput getSendExternalMailResult() {
        return sendExternalMailResult;
    }

    /**
     * Sets the value of the sendExternalMailResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendExternalMailOutput }
     *     
     */
    public void setSendExternalMailResult(SendExternalMailOutput value) {
        this.sendExternalMailResult = value;
    }

}
