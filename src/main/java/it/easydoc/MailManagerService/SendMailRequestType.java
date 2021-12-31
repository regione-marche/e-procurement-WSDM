
package it.easydoc.MailManagerService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendMailRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendMailRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.consorziocsa.it/easydoc/ws}MailerUserMailerServiceRequest">
 *       &lt;sequence>
 *         &lt;element name="Channel" type="{http://www.consorziocsa.it/easydoc/ws}ChannelItem"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShowLogo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BodyContent" type="{http://www.consorziocsa.it/easydoc/ws}BodyContentItem"/>
 *         &lt;element name="Receipts">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Receipt" type="{http://www.consorziocsa.it/easydoc/ws}MailAddress" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CarbonCopyReceipts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CarbonCopyReceipt" type="{http://www.consorziocsa.it/easydoc/ws}MailAddress" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BlindCarbonCopyReceipts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BlindCarbonCopyReceipt" type="{http://www.consorziocsa.it/easydoc/ws}MailAddress" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Attachments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Attachment" type="{http://www.consorziocsa.it/easydoc/ws}Attached" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendMailRequestType", propOrder = {
    "channel",
    "subject",
    "showLogo",
    "bodyContent",
    "receipts",
    "carbonCopyReceipts",
    "blindCarbonCopyReceipts",
    "attachments"
})
public class SendMailRequestType
    extends MailerUserMailerServiceRequest
{

    @XmlElement(name = "Channel", required = true)
    protected ChannelItem channel;
    @XmlElement(name = "Subject", required = true)
    protected String subject;
    @XmlElement(name = "ShowLogo", defaultValue = "false")
    protected Boolean showLogo;
    @XmlElement(name = "BodyContent", required = true)
    protected BodyContentItem bodyContent;
    @XmlElement(name = "Receipts", required = true)
    protected SendMailRequestType.Receipts receipts;
    @XmlElement(name = "CarbonCopyReceipts")
    protected SendMailRequestType.CarbonCopyReceipts carbonCopyReceipts;
    @XmlElement(name = "BlindCarbonCopyReceipts")
    protected SendMailRequestType.BlindCarbonCopyReceipts blindCarbonCopyReceipts;
    @XmlElement(name = "Attachments")
    protected SendMailRequestType.Attachments attachments;

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelItem }
     *     
     */
    public ChannelItem getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelItem }
     *     
     */
    public void setChannel(ChannelItem value) {
        this.channel = value;
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
     * Gets the value of the showLogo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowLogo() {
        return showLogo;
    }

    /**
     * Sets the value of the showLogo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowLogo(Boolean value) {
        this.showLogo = value;
    }

    /**
     * Gets the value of the bodyContent property.
     * 
     * @return
     *     possible object is
     *     {@link BodyContentItem }
     *     
     */
    public BodyContentItem getBodyContent() {
        return bodyContent;
    }

    /**
     * Sets the value of the bodyContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyContentItem }
     *     
     */
    public void setBodyContent(BodyContentItem value) {
        this.bodyContent = value;
    }

    /**
     * Gets the value of the receipts property.
     * 
     * @return
     *     possible object is
     *     {@link SendMailRequestType.Receipts }
     *     
     */
    public SendMailRequestType.Receipts getReceipts() {
        return receipts;
    }

    /**
     * Sets the value of the receipts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendMailRequestType.Receipts }
     *     
     */
    public void setReceipts(SendMailRequestType.Receipts value) {
        this.receipts = value;
    }

    /**
     * Gets the value of the carbonCopyReceipts property.
     * 
     * @return
     *     possible object is
     *     {@link SendMailRequestType.CarbonCopyReceipts }
     *     
     */
    public SendMailRequestType.CarbonCopyReceipts getCarbonCopyReceipts() {
        return carbonCopyReceipts;
    }

    /**
     * Sets the value of the carbonCopyReceipts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendMailRequestType.CarbonCopyReceipts }
     *     
     */
    public void setCarbonCopyReceipts(SendMailRequestType.CarbonCopyReceipts value) {
        this.carbonCopyReceipts = value;
    }

    /**
     * Gets the value of the blindCarbonCopyReceipts property.
     * 
     * @return
     *     possible object is
     *     {@link SendMailRequestType.BlindCarbonCopyReceipts }
     *     
     */
    public SendMailRequestType.BlindCarbonCopyReceipts getBlindCarbonCopyReceipts() {
        return blindCarbonCopyReceipts;
    }

    /**
     * Sets the value of the blindCarbonCopyReceipts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendMailRequestType.BlindCarbonCopyReceipts }
     *     
     */
    public void setBlindCarbonCopyReceipts(SendMailRequestType.BlindCarbonCopyReceipts value) {
        this.blindCarbonCopyReceipts = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link SendMailRequestType.Attachments }
     *     
     */
    public SendMailRequestType.Attachments getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendMailRequestType.Attachments }
     *     
     */
    public void setAttachments(SendMailRequestType.Attachments value) {
        this.attachments = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Attachment" type="{http://www.consorziocsa.it/easydoc/ws}Attached" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "attachment"
    })
    public static class Attachments {

        @XmlElement(name = "Attachment", required = true)
        protected List<Attached> attachment;

        /**
         * Gets the value of the attachment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attachment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttachment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Attached }
         * 
         * 
         */
        public List<Attached> getAttachment() {
            if (attachment == null) {
                attachment = new ArrayList<Attached>();
            }
            return this.attachment;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="BlindCarbonCopyReceipt" type="{http://www.consorziocsa.it/easydoc/ws}MailAddress" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "blindCarbonCopyReceipt"
    })
    public static class BlindCarbonCopyReceipts {

        @XmlElement(name = "BlindCarbonCopyReceipt", required = true)
        protected List<String> blindCarbonCopyReceipt;

        /**
         * Gets the value of the blindCarbonCopyReceipt property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the blindCarbonCopyReceipt property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBlindCarbonCopyReceipt().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getBlindCarbonCopyReceipt() {
            if (blindCarbonCopyReceipt == null) {
                blindCarbonCopyReceipt = new ArrayList<String>();
            }
            return this.blindCarbonCopyReceipt;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CarbonCopyReceipt" type="{http://www.consorziocsa.it/easydoc/ws}MailAddress" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "carbonCopyReceipt"
    })
    public static class CarbonCopyReceipts {

        @XmlElement(name = "CarbonCopyReceipt", required = true)
        protected List<String> carbonCopyReceipt;

        /**
         * Gets the value of the carbonCopyReceipt property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the carbonCopyReceipt property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCarbonCopyReceipt().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCarbonCopyReceipt() {
            if (carbonCopyReceipt == null) {
                carbonCopyReceipt = new ArrayList<String>();
            }
            return this.carbonCopyReceipt;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Receipt" type="{http://www.consorziocsa.it/easydoc/ws}MailAddress" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "receipt"
    })
    public static class Receipts {

        @XmlElement(name = "Receipt", required = true)
        protected List<String> receipt;

        /**
         * Gets the value of the receipt property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the receipt property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReceipt().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getReceipt() {
            if (receipt == null) {
                receipt = new ArrayList<String>();
            }
            return this.receipt;
        }

    }

}
