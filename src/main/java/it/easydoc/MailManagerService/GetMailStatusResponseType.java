
package it.easydoc.MailManagerService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GetMailStatusResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMailStatusResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.consorziocsa.it/easydoc/ws}GenericServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="MailType" type="{http://www.consorziocsa.it/easydoc/ws}MailConfigurationTypeType"/>
 *         &lt;element name="MailUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MailServerUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateCreation" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateSent" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateAccepted" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MailState" type="{http://www.consorziocsa.it/easydoc/ws}MailStateType"/>
 *         &lt;element name="HasErrorReceipt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Receipts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Receipt" type="{http://www.consorziocsa.it/easydoc/ws}ReceiptType" maxOccurs="unbounded"/>
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
@XmlType(name = "GetMailStatusResponseType", propOrder = {
    "mailType",
    "mailUID",
    "mailServerUID",
    "dateCreation",
    "dateSent",
    "dateAccepted",
    "mailState",
    "hasErrorReceipt",
    "receipts"
})
public class GetMailStatusResponseType
    extends GenericServiceResponse
{

    @XmlElement(name = "MailType", required = true)
    protected MailConfigurationTypeType mailType;
    @XmlElement(name = "MailUID", required = true)
    protected String mailUID;
    @XmlElement(name = "MailServerUID")
    protected String mailServerUID;
    @XmlElement(name = "DateCreation", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreation;
    @XmlElement(name = "DateSent", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateSent;
    @XmlElement(name = "DateAccepted")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAccepted;
    @XmlElement(name = "MailState", required = true)
    protected MailStateType mailState;
    @XmlElement(name = "HasErrorReceipt")
    protected Boolean hasErrorReceipt;
    @XmlElement(name = "Receipts")
    protected GetMailStatusResponseType.Receipts receipts;

    /**
     * Gets the value of the mailType property.
     * 
     * @return
     *     possible object is
     *     {@link MailConfigurationTypeType }
     *     
     */
    public MailConfigurationTypeType getMailType() {
        return mailType;
    }

    /**
     * Sets the value of the mailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailConfigurationTypeType }
     *     
     */
    public void setMailType(MailConfigurationTypeType value) {
        this.mailType = value;
    }

    /**
     * Gets the value of the mailUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailUID() {
        return mailUID;
    }

    /**
     * Sets the value of the mailUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailUID(String value) {
        this.mailUID = value;
    }

    /**
     * Gets the value of the mailServerUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailServerUID() {
        return mailServerUID;
    }

    /**
     * Sets the value of the mailServerUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailServerUID(String value) {
        this.mailServerUID = value;
    }

    /**
     * Gets the value of the dateCreation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreation() {
        return dateCreation;
    }

    /**
     * Sets the value of the dateCreation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreation(XMLGregorianCalendar value) {
        this.dateCreation = value;
    }

    /**
     * Gets the value of the dateSent property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateSent() {
        return dateSent;
    }

    /**
     * Sets the value of the dateSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateSent(XMLGregorianCalendar value) {
        this.dateSent = value;
    }

    /**
     * Gets the value of the dateAccepted property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAccepted() {
        return dateAccepted;
    }

    /**
     * Sets the value of the dateAccepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAccepted(XMLGregorianCalendar value) {
        this.dateAccepted = value;
    }

    /**
     * Gets the value of the mailState property.
     * 
     * @return
     *     possible object is
     *     {@link MailStateType }
     *     
     */
    public MailStateType getMailState() {
        return mailState;
    }

    /**
     * Sets the value of the mailState property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailStateType }
     *     
     */
    public void setMailState(MailStateType value) {
        this.mailState = value;
    }

    /**
     * Gets the value of the hasErrorReceipt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasErrorReceipt() {
        return hasErrorReceipt;
    }

    /**
     * Sets the value of the hasErrorReceipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasErrorReceipt(Boolean value) {
        this.hasErrorReceipt = value;
    }

    /**
     * Gets the value of the receipts property.
     * 
     * @return
     *     possible object is
     *     {@link GetMailStatusResponseType.Receipts }
     *     
     */
    public GetMailStatusResponseType.Receipts getReceipts() {
        return receipts;
    }

    /**
     * Sets the value of the receipts property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMailStatusResponseType.Receipts }
     *     
     */
    public void setReceipts(GetMailStatusResponseType.Receipts value) {
        this.receipts = value;
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
     *         &lt;element name="Receipt" type="{http://www.consorziocsa.it/easydoc/ws}ReceiptType" maxOccurs="unbounded"/>
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
        protected List<ReceiptType> receipt;

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
         * {@link ReceiptType }
         * 
         * 
         */
        public List<ReceiptType> getReceipt() {
            if (receipt == null) {
                receipt = new ArrayList<ReceiptType>();
            }
            return this.receipt;
        }

    }

}
