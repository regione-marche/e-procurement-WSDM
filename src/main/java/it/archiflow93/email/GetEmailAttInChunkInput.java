
package it.archiflow93.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetEmailAttInChunkInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetEmailAttInChunkInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="ChunkParamIn" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}EmailAttChunkParamIn" minOccurs="0"/>
 *         &lt;element name="MailboxInEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MsgIdentifier" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}MessageIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetEmailAttInChunkInput", propOrder = {
    "chunkParamIn",
    "mailboxInEmail",
    "msgIdentifier"
})
public class GetEmailAttInChunkInput
    extends BaseInput
{

    @XmlElement(name = "ChunkParamIn", nillable = true)
    protected EmailAttChunkParamIn chunkParamIn;
    @XmlElement(name = "MailboxInEmail", nillable = true)
    protected String mailboxInEmail;
    @XmlElement(name = "MsgIdentifier", nillable = true)
    protected MessageIdentifier msgIdentifier;

    /**
     * Gets the value of the chunkParamIn property.
     * 
     * @return
     *     possible object is
     *     {@link EmailAttChunkParamIn }
     *     
     */
    public EmailAttChunkParamIn getChunkParamIn() {
        return chunkParamIn;
    }

    /**
     * Sets the value of the chunkParamIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAttChunkParamIn }
     *     
     */
    public void setChunkParamIn(EmailAttChunkParamIn value) {
        this.chunkParamIn = value;
    }

    /**
     * Gets the value of the mailboxInEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailboxInEmail() {
        return mailboxInEmail;
    }

    /**
     * Sets the value of the mailboxInEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailboxInEmail(String value) {
        this.mailboxInEmail = value;
    }

    /**
     * Gets the value of the msgIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentifier }
     *     
     */
    public MessageIdentifier getMsgIdentifier() {
        return msgIdentifier;
    }

    /**
     * Sets the value of the msgIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentifier }
     *     
     */
    public void setMsgIdentifier(MessageIdentifier value) {
        this.msgIdentifier = value;
    }

}
