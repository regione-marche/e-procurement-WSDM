
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendEMailMsgInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendEMailMsgInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="AddCardAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AddCardMainDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AddCourtesyCopy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ArchiveID" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="EMailVisType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}EMailVisType" minOccurs="0"/>
 *         &lt;element name="ExtAttCodesOrNames" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfanyType" minOccurs="0"/>
 *         &lt;element name="GuidCard" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="MailInteropType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}MailInteropType" minOccurs="0"/>
 *         &lt;element name="MailOut" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}MailOut" minOccurs="0"/>
 *         &lt;element name="SplitEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendEMailMsgInput", propOrder = {
    "addCardAttachments",
    "addCardMainDocument",
    "addCourtesyCopy",
    "archiveID",
    "eMailVisType",
    "extAttCodesOrNames",
    "guidCard",
    "mailInteropType",
    "mailOut",
    "splitEmail"
})
public class SendEMailMsgInput
    extends BaseInput
{

    @XmlElement(name = "AddCardAttachments")
    protected Boolean addCardAttachments;
    @XmlElement(name = "AddCardMainDocument")
    protected Boolean addCardMainDocument;
    @XmlElement(name = "AddCourtesyCopy")
    protected Boolean addCourtesyCopy;
    @XmlElement(name = "ArchiveID")
    protected Short archiveID;
    @XmlElement(name = "EMailVisType")
    protected EMailVisType eMailVisType;
    @XmlElement(name = "ExtAttCodesOrNames", nillable = true)
    protected ArrayOfanyType extAttCodesOrNames;
    @XmlElement(name = "GuidCard")
    protected String guidCard;
    @XmlElement(name = "MailInteropType")
    protected MailInteropType mailInteropType;
    @XmlElement(name = "MailOut", nillable = true)
    protected MailOut mailOut;
    @XmlElement(name = "SplitEmail")
    protected Boolean splitEmail;

    /**
     * Gets the value of the addCardAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddCardAttachments() {
        return addCardAttachments;
    }

    /**
     * Sets the value of the addCardAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddCardAttachments(Boolean value) {
        this.addCardAttachments = value;
    }

    /**
     * Gets the value of the addCardMainDocument property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddCardMainDocument() {
        return addCardMainDocument;
    }

    /**
     * Sets the value of the addCardMainDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddCardMainDocument(Boolean value) {
        this.addCardMainDocument = value;
    }

    /**
     * Gets the value of the addCourtesyCopy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddCourtesyCopy() {
        return addCourtesyCopy;
    }

    /**
     * Sets the value of the addCourtesyCopy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddCourtesyCopy(Boolean value) {
        this.addCourtesyCopy = value;
    }

    /**
     * Gets the value of the archiveID property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getArchiveID() {
        return archiveID;
    }

    /**
     * Sets the value of the archiveID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setArchiveID(Short value) {
        this.archiveID = value;
    }

    /**
     * Gets the value of the eMailVisType property.
     * 
     * @return
     *     possible object is
     *     {@link EMailVisType }
     *     
     */
    public EMailVisType getEMailVisType() {
        return eMailVisType;
    }

    /**
     * Sets the value of the eMailVisType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMailVisType }
     *     
     */
    public void setEMailVisType(EMailVisType value) {
        this.eMailVisType = value;
    }

    /**
     * Gets the value of the extAttCodesOrNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfanyType }
     *     
     */
    public ArrayOfanyType getExtAttCodesOrNames() {
        return extAttCodesOrNames;
    }

    /**
     * Sets the value of the extAttCodesOrNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfanyType }
     *     
     */
    public void setExtAttCodesOrNames(ArrayOfanyType value) {
        this.extAttCodesOrNames = value;
    }

    /**
     * Gets the value of the guidCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuidCard() {
        return guidCard;
    }

    /**
     * Sets the value of the guidCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuidCard(String value) {
        this.guidCard = value;
    }

    /**
     * Gets the value of the mailInteropType property.
     * 
     * @return
     *     possible object is
     *     {@link MailInteropType }
     *     
     */
    public MailInteropType getMailInteropType() {
        return mailInteropType;
    }

    /**
     * Sets the value of the mailInteropType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailInteropType }
     *     
     */
    public void setMailInteropType(MailInteropType value) {
        this.mailInteropType = value;
    }

    /**
     * Gets the value of the mailOut property.
     * 
     * @return
     *     possible object is
     *     {@link MailOut }
     *     
     */
    public MailOut getMailOut() {
        return mailOut;
    }

    /**
     * Sets the value of the mailOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailOut }
     *     
     */
    public void setMailOut(MailOut value) {
        this.mailOut = value;
    }

    /**
     * Gets the value of the splitEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSplitEmail() {
        return splitEmail;
    }

    /**
     * Sets the value of the splitEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSplitEmail(Boolean value) {
        this.splitEmail = value;
    }

}
