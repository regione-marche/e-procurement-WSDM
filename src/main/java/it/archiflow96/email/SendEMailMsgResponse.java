
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
 *         &lt;element name="SendEMailMsgResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}SendEMailMsgOutput" minOccurs="0"/>
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
    "sendEMailMsgResult"
})
@XmlRootElement(name = "SendEMailMsgResponse", namespace = "http://tempuri.org/")
public class SendEMailMsgResponse {

    @XmlElement(name = "SendEMailMsgResult", namespace = "http://tempuri.org/", nillable = true)
    protected SendEMailMsgOutput sendEMailMsgResult;

    /**
     * Gets the value of the sendEMailMsgResult property.
     * 
     * @return
     *     possible object is
     *     {@link SendEMailMsgOutput }
     *     
     */
    public SendEMailMsgOutput getSendEMailMsgResult() {
        return sendEMailMsgResult;
    }

    /**
     * Sets the value of the sendEMailMsgResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendEMailMsgOutput }
     *     
     */
    public void setSendEMailMsgResult(SendEMailMsgOutput value) {
        this.sendEMailMsgResult = value;
    }

}
