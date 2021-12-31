
package it.easydoc.MailManagerService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendMailResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendMailResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SendMailResponseType" type="{http://www.consorziocsa.it/easydoc/ws}SendMailResponseType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendMailResponse", propOrder = {
    "sendMailResponseType"
})
public class SendMailResponse {

    @XmlElement(name = "SendMailResponseType", required = true)
    protected SendMailResponseType sendMailResponseType;

    /**
     * Gets the value of the sendMailResponseType property.
     * 
     * @return
     *     possible object is
     *     {@link SendMailResponseType }
     *     
     */
    public SendMailResponseType getSendMailResponseType() {
        return sendMailResponseType;
    }

    /**
     * Sets the value of the sendMailResponseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendMailResponseType }
     *     
     */
    public void setSendMailResponseType(SendMailResponseType value) {
        this.sendMailResponseType = value;
    }

}
