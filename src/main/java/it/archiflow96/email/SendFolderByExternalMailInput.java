
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendFolderByExternalMailInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendFolderByExternalMailInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="BCC" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}ArrayOfMailAddress" minOccurs="0"/>
 *         &lt;element name="Body" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CC" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}ArrayOfMailAddress" minOccurs="0"/>
 *         &lt;element name="FolderId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsBodyHtml" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsComputerizedFolder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSharedMailbox" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MailBoxID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="To" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}ArrayOfMailAddress" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendFolderByExternalMailInput", propOrder = {
    "bcc",
    "body",
    "cc",
    "folderId",
    "folderName",
    "isBodyHtml",
    "isComputerizedFolder",
    "isSharedMailbox",
    "mailBoxID",
    "subject",
    "to"
})
public class SendFolderByExternalMailInput
    extends BaseInput
{

    @XmlElement(name = "BCC", nillable = true)
    protected ArrayOfMailAddress bcc;
    @XmlElement(name = "Body", nillable = true)
    protected String body;
    @XmlElement(name = "CC", nillable = true)
    protected ArrayOfMailAddress cc;
    @XmlElement(name = "FolderId")
    protected Integer folderId;
    @XmlElement(name = "FolderName", nillable = true)
    protected String folderName;
    @XmlElement(name = "IsBodyHtml")
    protected Boolean isBodyHtml;
    @XmlElement(name = "IsComputerizedFolder")
    protected Boolean isComputerizedFolder;
    @XmlElement(name = "IsSharedMailbox")
    protected Boolean isSharedMailbox;
    @XmlElement(name = "MailBoxID")
    protected Integer mailBoxID;
    @XmlElement(name = "Subject", nillable = true)
    protected String subject;
    @XmlElement(name = "To", nillable = true)
    protected ArrayOfMailAddress to;

    /**
     * Gets the value of the bcc property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMailAddress }
     *     
     */
    public ArrayOfMailAddress getBCC() {
        return bcc;
    }

    /**
     * Sets the value of the bcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMailAddress }
     *     
     */
    public void setBCC(ArrayOfMailAddress value) {
        this.bcc = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBody(String value) {
        this.body = value;
    }

    /**
     * Gets the value of the cc property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMailAddress }
     *     
     */
    public ArrayOfMailAddress getCC() {
        return cc;
    }

    /**
     * Sets the value of the cc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMailAddress }
     *     
     */
    public void setCC(ArrayOfMailAddress value) {
        this.cc = value;
    }

    /**
     * Gets the value of the folderId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFolderId() {
        return folderId;
    }

    /**
     * Sets the value of the folderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFolderId(Integer value) {
        this.folderId = value;
    }

    /**
     * Gets the value of the folderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolderName() {
        return folderName;
    }

    /**
     * Sets the value of the folderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolderName(String value) {
        this.folderName = value;
    }

    /**
     * Gets the value of the isBodyHtml property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBodyHtml() {
        return isBodyHtml;
    }

    /**
     * Sets the value of the isBodyHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBodyHtml(Boolean value) {
        this.isBodyHtml = value;
    }

    /**
     * Gets the value of the isComputerizedFolder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsComputerizedFolder() {
        return isComputerizedFolder;
    }

    /**
     * Sets the value of the isComputerizedFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsComputerizedFolder(Boolean value) {
        this.isComputerizedFolder = value;
    }

    /**
     * Gets the value of the isSharedMailbox property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSharedMailbox() {
        return isSharedMailbox;
    }

    /**
     * Sets the value of the isSharedMailbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSharedMailbox(Boolean value) {
        this.isSharedMailbox = value;
    }

    /**
     * Gets the value of the mailBoxID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMailBoxID() {
        return mailBoxID;
    }

    /**
     * Sets the value of the mailBoxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMailBoxID(Integer value) {
        this.mailBoxID = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMailAddress }
     *     
     */
    public ArrayOfMailAddress getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMailAddress }
     *     
     */
    public void setTo(ArrayOfMailAddress value) {
        this.to = value;
    }

}
