
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetIndexesToStoreEmailInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetIndexesToStoreEmailInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="ArchiveId" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="DocumentTypeId" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="GetDefaultModel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MailboxInEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MsgIdentifier" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}MessageIdentifier" minOccurs="0"/>
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
@XmlType(name = "GetIndexesToStoreEmailInput", propOrder = {
    "archiveId",
    "documentTypeId",
    "getDefaultModel",
    "mailboxInEmail",
    "msgIdentifier",
    "storeInterop"
})
public class GetIndexesToStoreEmailInput
    extends BaseInput
{

    @XmlElement(name = "ArchiveId")
    protected Short archiveId;
    @XmlElement(name = "DocumentTypeId")
    protected Short documentTypeId;
    @XmlElement(name = "GetDefaultModel")
    protected Boolean getDefaultModel;
    @XmlElement(name = "MailboxInEmail", nillable = true)
    protected String mailboxInEmail;
    @XmlElement(name = "MsgIdentifier", nillable = true)
    protected MessageIdentifier msgIdentifier;
    @XmlElement(name = "StoreInterop")
    protected Boolean storeInterop;

    /**
     * Gets the value of the archiveId property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getArchiveId() {
        return archiveId;
    }

    /**
     * Sets the value of the archiveId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setArchiveId(Short value) {
        this.archiveId = value;
    }

    /**
     * Gets the value of the documentTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDocumentTypeId() {
        return documentTypeId;
    }

    /**
     * Sets the value of the documentTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDocumentTypeId(Short value) {
        this.documentTypeId = value;
    }

    /**
     * Gets the value of the getDefaultModel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGetDefaultModel() {
        return getDefaultModel;
    }

    /**
     * Sets the value of the getDefaultModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGetDefaultModel(Boolean value) {
        this.getDefaultModel = value;
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
