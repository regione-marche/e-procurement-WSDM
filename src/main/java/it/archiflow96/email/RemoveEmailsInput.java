
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemoveEmailsInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoveEmailsInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="MailboxInEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MsgIdentifiers" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}ArrayOfMessageIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveEmailsInput", propOrder = {
    "mailboxInEmail",
    "msgIdentifiers"
})
public class RemoveEmailsInput
    extends BaseInput
{

    @XmlElement(name = "MailboxInEmail", nillable = true)
    protected String mailboxInEmail;
    @XmlElement(name = "MsgIdentifiers", nillable = true)
    protected ArrayOfMessageIdentifier msgIdentifiers;

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
     * Gets the value of the msgIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMessageIdentifier }
     *     
     */
    public ArrayOfMessageIdentifier getMsgIdentifiers() {
        return msgIdentifiers;
    }

    /**
     * Sets the value of the msgIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMessageIdentifier }
     *     
     */
    public void setMsgIdentifiers(ArrayOfMessageIdentifier value) {
        this.msgIdentifiers = value;
    }

}
