
package it.easydoc.MailManagerService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenericServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericServiceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageResponse" type="{http://www.consorziocsa.it/easydoc/ws}MessageResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericServiceResponse", propOrder = {
    "messageResponse"
})
@XmlSeeAlso({
    GetReceiptContentResponseType.class,
    LoginResponseType.class,
    SendMailResponseType.class,
    GetMailStatusResponseType.class
})
public class GenericServiceResponse {

    @XmlElement(name = "MessageResponse", required = true)
    protected MessageResponse messageResponse;

    /**
     * Gets the value of the messageResponse property.
     * 
     * @return
     *     possible object is
     *     {@link MessageResponse }
     *     
     */
    public MessageResponse getMessageResponse() {
        return messageResponse;
    }

    /**
     * Sets the value of the messageResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageResponse }
     *     
     */
    public void setMessageResponse(MessageResponse value) {
        this.messageResponse = value;
    }

}
