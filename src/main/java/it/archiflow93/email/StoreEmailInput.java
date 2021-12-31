
package it.archiflow93.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoreEmailInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreEmailInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="Attachments" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}ArrayOfStoreEmailAttachment" minOccurs="0"/>
 *         &lt;element name="DeleteEml" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MailboxInEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MsgIdentifier" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}MessageIdentifier" minOccurs="0"/>
 *         &lt;element name="StoreEmailCardProp" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}StoreEmailCard" minOccurs="0"/>
 *         &lt;element name="StoreEml" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StoreEmlAsMainDoc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StoreInterop" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoreEmailInput", propOrder = {
    "attachments",
    "deleteEml",
    "mailboxInEmail",
    "msgIdentifier",
    "storeEmailCardProp",
    "storeEml",
    "storeEmlAsMainDoc",
    "storeInterop"
})
public class StoreEmailInput
    extends BaseInput
{

    @XmlElement(name = "Attachments", nillable = true)
    protected ArrayOfStoreEmailAttachment attachments;
    @XmlElement(name = "DeleteEml")
    protected Boolean deleteEml;
    @XmlElement(name = "MailboxInEmail", nillable = true)
    protected String mailboxInEmail;
    @XmlElement(name = "MsgIdentifier", nillable = true)
    protected MessageIdentifier msgIdentifier;
    @XmlElement(name = "StoreEmailCardProp", nillable = true)
    protected StoreEmailCard storeEmailCardProp;
    @XmlElement(name = "StoreEml")
    protected Boolean storeEml;
    @XmlElement(name = "StoreEmlAsMainDoc")
    protected Boolean storeEmlAsMainDoc;
    @XmlElement(name = "StoreInterop")
    protected Boolean storeInterop;

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStoreEmailAttachment }
     *     
     */
    public ArrayOfStoreEmailAttachment getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStoreEmailAttachment }
     *     
     */
    public void setAttachments(ArrayOfStoreEmailAttachment value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the deleteEml property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleteEml() {
        return deleteEml;
    }

    /**
     * Sets the value of the deleteEml property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleteEml(Boolean value) {
        this.deleteEml = value;
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
     * Gets the value of the storeEmailCardProp property.
     * 
     * @return
     *     possible object is
     *     {@link StoreEmailCard }
     *     
     */
    public StoreEmailCard getStoreEmailCardProp() {
        return storeEmailCardProp;
    }

    /**
     * Sets the value of the storeEmailCardProp property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreEmailCard }
     *     
     */
    public void setStoreEmailCardProp(StoreEmailCard value) {
        this.storeEmailCardProp = value;
    }

    /**
     * Gets the value of the storeEml property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStoreEml() {
        return storeEml;
    }

    /**
     * Sets the value of the storeEml property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStoreEml(Boolean value) {
        this.storeEml = value;
    }

    /**
     * Gets the value of the storeEmlAsMainDoc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStoreEmlAsMainDoc() {
        return storeEmlAsMainDoc;
    }

    /**
     * Sets the value of the storeEmlAsMainDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStoreEmlAsMainDoc(Boolean value) {
        this.storeEmlAsMainDoc = value;
    }

    /**
     * Gets the value of the storeInterop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStoreInterop() {
        return storeInterop;
    }

    /**
     * Sets the value of the storeInterop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStoreInterop(Boolean value) {
        this.storeInterop = value;
    }

}
