
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveEmailInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveEmailInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="GetAttachmentsSize" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MailboxInEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MsgIdentifier" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}MessageIdentifier" minOccurs="0"/>
 *         &lt;element name="PrepareForArchInterop" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TestIfAttIsSigned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveEmailInput", propOrder = {
    "getAttachmentsSize",
    "mailboxInEmail",
    "msgIdentifier",
    "prepareForArchInterop",
    "testIfAttIsSigned"
})
public class RetrieveEmailInput
    extends BaseInput
{

    @XmlElement(name = "GetAttachmentsSize")
    protected Boolean getAttachmentsSize;
    @XmlElement(name = "MailboxInEmail", nillable = true)
    protected String mailboxInEmail;
    @XmlElement(name = "MsgIdentifier", nillable = true)
    protected MessageIdentifier msgIdentifier;
    @XmlElement(name = "PrepareForArchInterop")
    protected Boolean prepareForArchInterop;
    @XmlElement(name = "TestIfAttIsSigned")
    protected Boolean testIfAttIsSigned;

    /**
     * Gets the value of the getAttachmentsSize property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGetAttachmentsSize() {
        return getAttachmentsSize;
    }

    /**
     * Sets the value of the getAttachmentsSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGetAttachmentsSize(Boolean value) {
        this.getAttachmentsSize = value;
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

    /**
     * Gets the value of the prepareForArchInterop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrepareForArchInterop() {
        return prepareForArchInterop;
    }

    /**
     * Sets the value of the prepareForArchInterop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrepareForArchInterop(Boolean value) {
        this.prepareForArchInterop = value;
    }

    /**
     * Gets the value of the testIfAttIsSigned property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTestIfAttIsSigned() {
        return testIfAttIsSigned;
    }

    /**
     * Sets the value of the testIfAttIsSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTestIfAttIsSigned(Boolean value) {
        this.testIfAttIsSigned = value;
    }

}
