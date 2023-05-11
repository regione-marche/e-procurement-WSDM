
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MailBox complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MailBox">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeleteAfterRead" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FromIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FromOut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsEnabledAlertsPEC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsEnabledIntNotifPEC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsEnabledReceiptsPEC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsEnabledSavePEOIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsEnabledSavePEOOut" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsMailVisUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPEC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsUserDefaultIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsUserDefaultOut" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsUserMailBox" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MailBoxInvoiceCfg" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.MailBox.ValueObject}MailBoxInvoiceCfg" minOccurs="0"/>
 *         &lt;element name="MailBoxNsoCfg" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.MailBox.ValueObject}MailBoxNsoCfg" minOccurs="0"/>
 *         &lt;element name="MailServerInId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MailServerOutId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MailVisType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}EMailVisType" minOccurs="0"/>
 *         &lt;element name="MaxRecipientsEmail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxSizeEmail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxToRead" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Offices" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="ProcessInfo" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.MailBox.ValueObject}ArrayOfProcessInfo" minOccurs="0"/>
 *         &lt;element name="ReplyTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UserNameIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserNameOut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserPasswordIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserPasswordOut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailBox", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.MailBox.ValueObject", propOrder = {
    "deleteAfterRead",
    "description",
    "fromIn",
    "fromOut",
    "id",
    "isDisabled",
    "isEnabledAlertsPEC",
    "isEnabledIntNotifPEC",
    "isEnabledReceiptsPEC",
    "isEnabledSavePEOIn",
    "isEnabledSavePEOOut",
    "isMailVisUser",
    "isPEC",
    "isUserDefaultIn",
    "isUserDefaultOut",
    "isUserMailBox",
    "mailBoxInvoiceCfg",
    "mailBoxNsoCfg",
    "mailServerInId",
    "mailServerOutId",
    "mailVisType",
    "maxRecipientsEmail",
    "maxSizeEmail",
    "maxToRead",
    "name",
    "offices",
    "processInfo",
    "replyTo",
    "userId",
    "userNameIn",
    "userNameOut",
    "userPasswordIn",
    "userPasswordOut"
})
public class MailBox {

    @XmlElement(name = "DeleteAfterRead")
    protected Boolean deleteAfterRead;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "FromIn", nillable = true)
    protected String fromIn;
    @XmlElement(name = "FromOut", nillable = true)
    protected String fromOut;
    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElement(name = "IsDisabled")
    protected Boolean isDisabled;
    @XmlElement(name = "IsEnabledAlertsPEC")
    protected Boolean isEnabledAlertsPEC;
    @XmlElement(name = "IsEnabledIntNotifPEC")
    protected Boolean isEnabledIntNotifPEC;
    @XmlElement(name = "IsEnabledReceiptsPEC")
    protected Boolean isEnabledReceiptsPEC;
    @XmlElement(name = "IsEnabledSavePEOIn")
    protected Boolean isEnabledSavePEOIn;
    @XmlElement(name = "IsEnabledSavePEOOut")
    protected Boolean isEnabledSavePEOOut;
    @XmlElement(name = "IsMailVisUser")
    protected Boolean isMailVisUser;
    @XmlElement(name = "IsPEC")
    protected Boolean isPEC;
    @XmlElement(name = "IsUserDefaultIn")
    protected Boolean isUserDefaultIn;
    @XmlElement(name = "IsUserDefaultOut")
    protected Boolean isUserDefaultOut;
    @XmlElement(name = "IsUserMailBox")
    protected Boolean isUserMailBox;
    @XmlElement(name = "MailBoxInvoiceCfg", nillable = true)
    protected MailBoxInvoiceCfg mailBoxInvoiceCfg;
    @XmlElement(name = "MailBoxNsoCfg", nillable = true)
    protected MailBoxNsoCfg mailBoxNsoCfg;
    @XmlElement(name = "MailServerInId")
    protected Integer mailServerInId;
    @XmlElement(name = "MailServerOutId")
    protected Integer mailServerOutId;
    @XmlElement(name = "MailVisType")
    protected EMailVisType mailVisType;
    @XmlElement(name = "MaxRecipientsEmail")
    protected Integer maxRecipientsEmail;
    @XmlElement(name = "MaxSizeEmail")
    protected Integer maxSizeEmail;
    @XmlElement(name = "MaxToRead")
    protected Integer maxToRead;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Offices", nillable = true)
    protected ArrayOfint offices;
    @XmlElement(name = "ProcessInfo", nillable = true)
    protected ArrayOfProcessInfo processInfo;
    @XmlElement(name = "ReplyTo", nillable = true)
    protected String replyTo;
    @XmlElement(name = "UserId")
    protected Integer userId;
    @XmlElement(name = "UserNameIn", nillable = true)
    protected String userNameIn;
    @XmlElement(name = "UserNameOut", nillable = true)
    protected String userNameOut;
    @XmlElement(name = "UserPasswordIn", nillable = true)
    protected String userPasswordIn;
    @XmlElement(name = "UserPasswordOut", nillable = true)
    protected String userPasswordOut;

    /**
     * Gets the value of the deleteAfterRead property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleteAfterRead() {
        return deleteAfterRead;
    }

    /**
     * Sets the value of the deleteAfterRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleteAfterRead(Boolean value) {
        this.deleteAfterRead = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the fromIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromIn() {
        return fromIn;
    }

    /**
     * Sets the value of the fromIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromIn(String value) {
        this.fromIn = value;
    }

    /**
     * Gets the value of the fromOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromOut() {
        return fromOut;
    }

    /**
     * Sets the value of the fromOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromOut(String value) {
        this.fromOut = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the isDisabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDisabled() {
        return isDisabled;
    }

    /**
     * Sets the value of the isDisabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDisabled(Boolean value) {
        this.isDisabled = value;
    }

    /**
     * Gets the value of the isEnabledAlertsPEC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEnabledAlertsPEC() {
        return isEnabledAlertsPEC;
    }

    /**
     * Sets the value of the isEnabledAlertsPEC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEnabledAlertsPEC(Boolean value) {
        this.isEnabledAlertsPEC = value;
    }

    /**
     * Gets the value of the isEnabledIntNotifPEC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEnabledIntNotifPEC() {
        return isEnabledIntNotifPEC;
    }

    /**
     * Sets the value of the isEnabledIntNotifPEC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEnabledIntNotifPEC(Boolean value) {
        this.isEnabledIntNotifPEC = value;
    }

    /**
     * Gets the value of the isEnabledReceiptsPEC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEnabledReceiptsPEC() {
        return isEnabledReceiptsPEC;
    }

    /**
     * Sets the value of the isEnabledReceiptsPEC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEnabledReceiptsPEC(Boolean value) {
        this.isEnabledReceiptsPEC = value;
    }

    /**
     * Gets the value of the isEnabledSavePEOIn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEnabledSavePEOIn() {
        return isEnabledSavePEOIn;
    }

    /**
     * Sets the value of the isEnabledSavePEOIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEnabledSavePEOIn(Boolean value) {
        this.isEnabledSavePEOIn = value;
    }

    /**
     * Gets the value of the isEnabledSavePEOOut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEnabledSavePEOOut() {
        return isEnabledSavePEOOut;
    }

    /**
     * Sets the value of the isEnabledSavePEOOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEnabledSavePEOOut(Boolean value) {
        this.isEnabledSavePEOOut = value;
    }

    /**
     * Gets the value of the isMailVisUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMailVisUser() {
        return isMailVisUser;
    }

    /**
     * Sets the value of the isMailVisUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMailVisUser(Boolean value) {
        this.isMailVisUser = value;
    }

    /**
     * Gets the value of the isPEC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPEC() {
        return isPEC;
    }

    /**
     * Sets the value of the isPEC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPEC(Boolean value) {
        this.isPEC = value;
    }

    /**
     * Gets the value of the isUserDefaultIn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUserDefaultIn() {
        return isUserDefaultIn;
    }

    /**
     * Sets the value of the isUserDefaultIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUserDefaultIn(Boolean value) {
        this.isUserDefaultIn = value;
    }

    /**
     * Gets the value of the isUserDefaultOut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUserDefaultOut() {
        return isUserDefaultOut;
    }

    /**
     * Sets the value of the isUserDefaultOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUserDefaultOut(Boolean value) {
        this.isUserDefaultOut = value;
    }

    /**
     * Gets the value of the isUserMailBox property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUserMailBox() {
        return isUserMailBox;
    }

    /**
     * Sets the value of the isUserMailBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUserMailBox(Boolean value) {
        this.isUserMailBox = value;
    }

    /**
     * Gets the value of the mailBoxInvoiceCfg property.
     * 
     * @return
     *     possible object is
     *     {@link MailBoxInvoiceCfg }
     *     
     */
    public MailBoxInvoiceCfg getMailBoxInvoiceCfg() {
        return mailBoxInvoiceCfg;
    }

    /**
     * Sets the value of the mailBoxInvoiceCfg property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailBoxInvoiceCfg }
     *     
     */
    public void setMailBoxInvoiceCfg(MailBoxInvoiceCfg value) {
        this.mailBoxInvoiceCfg = value;
    }

    /**
     * Gets the value of the mailBoxNsoCfg property.
     * 
     * @return
     *     possible object is
     *     {@link MailBoxNsoCfg }
     *     
     */
    public MailBoxNsoCfg getMailBoxNsoCfg() {
        return mailBoxNsoCfg;
    }

    /**
     * Sets the value of the mailBoxNsoCfg property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailBoxNsoCfg }
     *     
     */
    public void setMailBoxNsoCfg(MailBoxNsoCfg value) {
        this.mailBoxNsoCfg = value;
    }

    /**
     * Gets the value of the mailServerInId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMailServerInId() {
        return mailServerInId;
    }

    /**
     * Sets the value of the mailServerInId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMailServerInId(Integer value) {
        this.mailServerInId = value;
    }

    /**
     * Gets the value of the mailServerOutId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMailServerOutId() {
        return mailServerOutId;
    }

    /**
     * Sets the value of the mailServerOutId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMailServerOutId(Integer value) {
        this.mailServerOutId = value;
    }

    /**
     * Gets the value of the mailVisType property.
     * 
     * @return
     *     possible object is
     *     {@link EMailVisType }
     *     
     */
    public EMailVisType getMailVisType() {
        return mailVisType;
    }

    /**
     * Sets the value of the mailVisType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMailVisType }
     *     
     */
    public void setMailVisType(EMailVisType value) {
        this.mailVisType = value;
    }

    /**
     * Gets the value of the maxRecipientsEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxRecipientsEmail() {
        return maxRecipientsEmail;
    }

    /**
     * Sets the value of the maxRecipientsEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxRecipientsEmail(Integer value) {
        this.maxRecipientsEmail = value;
    }

    /**
     * Gets the value of the maxSizeEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxSizeEmail() {
        return maxSizeEmail;
    }

    /**
     * Sets the value of the maxSizeEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxSizeEmail(Integer value) {
        this.maxSizeEmail = value;
    }

    /**
     * Gets the value of the maxToRead property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxToRead() {
        return maxToRead;
    }

    /**
     * Sets the value of the maxToRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxToRead(Integer value) {
        this.maxToRead = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the offices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getOffices() {
        return offices;
    }

    /**
     * Sets the value of the offices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setOffices(ArrayOfint value) {
        this.offices = value;
    }

    /**
     * Gets the value of the processInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProcessInfo }
     *     
     */
    public ArrayOfProcessInfo getProcessInfo() {
        return processInfo;
    }

    /**
     * Sets the value of the processInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProcessInfo }
     *     
     */
    public void setProcessInfo(ArrayOfProcessInfo value) {
        this.processInfo = value;
    }

    /**
     * Gets the value of the replyTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyTo() {
        return replyTo;
    }

    /**
     * Sets the value of the replyTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyTo(String value) {
        this.replyTo = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserId(Integer value) {
        this.userId = value;
    }

    /**
     * Gets the value of the userNameIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserNameIn() {
        return userNameIn;
    }

    /**
     * Sets the value of the userNameIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserNameIn(String value) {
        this.userNameIn = value;
    }

    /**
     * Gets the value of the userNameOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserNameOut() {
        return userNameOut;
    }

    /**
     * Sets the value of the userNameOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserNameOut(String value) {
        this.userNameOut = value;
    }

    /**
     * Gets the value of the userPasswordIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPasswordIn() {
        return userPasswordIn;
    }

    /**
     * Sets the value of the userPasswordIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPasswordIn(String value) {
        this.userPasswordIn = value;
    }

    /**
     * Gets the value of the userPasswordOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPasswordOut() {
        return userPasswordOut;
    }

    /**
     * Sets the value of the userPasswordOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPasswordOut(String value) {
        this.userPasswordOut = value;
    }

}
