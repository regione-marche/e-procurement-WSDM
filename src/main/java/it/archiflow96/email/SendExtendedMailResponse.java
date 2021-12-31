
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
 *         &lt;element name="SendExtendedMailResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}SendExtendedMailOutput" minOccurs="0"/>
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
    "sendExtendedMailResult"
})
@XmlRootElement(name = "SendExtendedMailResponse", namespace = "http://tempuri.org/")
public class SendExtendedMailResponse {

    @XmlElement(name = "SendExtendedMailResult", namespace = "http://tempuri.org/", nillable = true)
    protected SendExtendedMailOutput sendExtendedMailResult;

    /**
     * Gets the value of the sendExtendedMailResult property.
     * 
     * @return
     *     possible object is
     *     {@link SendExtendedMailOutput }
     *     
     */
    public SendExtendedMailOutput getSendExtendedMailResult() {
        return sendExtendedMailResult;
    }

    /**
     * Sets the value of the sendExtendedMailResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendExtendedMailOutput }
     *     
     */
    public void setSendExtendedMailResult(SendExtendedMailOutput value) {
        this.sendExtendedMailResult = value;
    }

}
