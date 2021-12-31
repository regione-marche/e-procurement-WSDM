
package it.archiflow93;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateMailServiceSendingInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateMailServiceSendingInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="Sending" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject}MailServiceSending" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateMailServiceSendingInput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Posting.ValueObject", propOrder = {
    "sending"
})
public class CreateMailServiceSendingInput
    extends BaseInput
{

    @XmlElement(name = "Sending", nillable = true)
    protected MailServiceSending sending;

    /**
     * Gets the value of the sending property.
     * 
     * @return
     *     possible object is
     *     {@link MailServiceSending }
     *     
     */
    public MailServiceSending getSending() {
        return sending;
    }

    /**
     * Sets the value of the sending property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailServiceSending }
     *     
     */
    public void setSending(MailServiceSending value) {
        this.sending = value;
    }

}
