
package it.easydoc.MailManagerService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendMail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendMail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SendMailRequestType" type="{http://www.consorziocsa.it/easydoc/ws}SendMailRequestType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendMail", propOrder = {
    "sendMailRequestType"
})
public class SendMail {

    @XmlElement(name = "SendMailRequestType", required = true)
    protected SendMailRequestType sendMailRequestType;

    /**
     * Gets the value of the sendMailRequestType property.
     * 
     * @return
     *     possible object is
     *     {@link SendMailRequestType }
     *     
     */
    public SendMailRequestType getSendMailRequestType() {
        return sendMailRequestType;
    }

    /**
     * Sets the value of the sendMailRequestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendMailRequestType }
     *     
     */
    public void setSendMailRequestType(SendMailRequestType value) {
        this.sendMailRequestType = value;
    }

}
