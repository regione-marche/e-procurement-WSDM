
package it.easydoc.MailManagerService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendMailResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendMailResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.consorziocsa.it/easydoc/ws}GenericServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="MessageID" type="{http://www.consorziocsa.it/easydoc/ws}Document_ID"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendMailResponseType", propOrder = {
    "messageID"
})
public class SendMailResponseType
    extends GenericServiceResponse
{

    @XmlElement(name = "MessageID", required = true)
    protected DocumentID messageID;

    /**
     * Gets the value of the messageID property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentID }
     *     
     */
    public DocumentID getMessageID() {
        return messageID;
    }

    /**
     * Sets the value of the messageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentID }
     *     
     */
    public void setMessageID(DocumentID value) {
        this.messageID = value;
    }

}
