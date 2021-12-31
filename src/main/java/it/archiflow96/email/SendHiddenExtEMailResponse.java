
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
 *         &lt;element name="SendHiddenExtEMailResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}SendHiddenExtEMailOutput" minOccurs="0"/>
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
    "sendHiddenExtEMailResult"
})
@XmlRootElement(name = "SendHiddenExtEMailResponse", namespace = "http://tempuri.org/")
public class SendHiddenExtEMailResponse {

    @XmlElement(name = "SendHiddenExtEMailResult", namespace = "http://tempuri.org/", nillable = true)
    protected SendHiddenExtEMailOutput sendHiddenExtEMailResult;

    /**
     * Gets the value of the sendHiddenExtEMailResult property.
     * 
     * @return
     *     possible object is
     *     {@link SendHiddenExtEMailOutput }
     *     
     */
    public SendHiddenExtEMailOutput getSendHiddenExtEMailResult() {
        return sendHiddenExtEMailResult;
    }

    /**
     * Sets the value of the sendHiddenExtEMailResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendHiddenExtEMailOutput }
     *     
     */
    public void setSendHiddenExtEMailResult(SendHiddenExtEMailOutput value) {
        this.sendHiddenExtEMailResult = value;
    }

}
