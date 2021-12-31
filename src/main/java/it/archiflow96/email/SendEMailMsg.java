
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
 *         &lt;element name="sendEMailMsgInput" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}SendEMailMsgInput" minOccurs="0"/>
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
    "sendEMailMsgInput"
})
@XmlRootElement(name = "SendEMailMsg", namespace = "http://tempuri.org/")
public class SendEMailMsg {

    @XmlElement(namespace = "http://tempuri.org/", nillable = true)
    protected SendEMailMsgInput sendEMailMsgInput;

    /**
     * Gets the value of the sendEMailMsgInput property.
     * 
     * @return
     *     possible object is
     *     {@link SendEMailMsgInput }
     *     
     */
    public SendEMailMsgInput getSendEMailMsgInput() {
        return sendEMailMsgInput;
    }

    /**
     * Sets the value of the sendEMailMsgInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendEMailMsgInput }
     *     
     */
    public void setSendEMailMsgInput(SendEMailMsgInput value) {
        this.sendEMailMsgInput = value;
    }

}
