
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateMailServiceSendingOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateMailServiceSendingOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="MessageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageState" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}MailServiceSendingState" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateMailServiceSendingOutput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Posting.ValueObject", propOrder = {
    "messageId",
    "messageState"
})
public class CreateMailServiceSendingOutput
    extends BaseOutput
{

    @XmlElement(name = "MessageId", nillable = true)
    protected String messageId;
    @XmlElement(name = "MessageState")
    protected MailServiceSendingState messageState;

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the messageState property.
     * 
     * @return
     *     possible object is
     *     {@link MailServiceSendingState }
     *     
     */
    public MailServiceSendingState getMessageState() {
        return messageState;
    }

    /**
     * Sets the value of the messageState property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailServiceSendingState }
     *     
     */
    public void setMessageState(MailServiceSendingState value) {
        this.messageState = value;
    }

}
