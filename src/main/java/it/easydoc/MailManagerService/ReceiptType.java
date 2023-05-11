
package it.easydoc.MailManagerService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ReceiptType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceiptType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReceiptID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Type" type="{http://www.consorziocsa.it/easydoc/ws}ReceiptTypeType"/>
 *         &lt;element name="MailUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DateReceipt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateCreation" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TrasmissionState" type="{http://www.consorziocsa.it/easydoc/ws}TrasmissionStateType"/>
 *         &lt;element name="ReceiverAddress" type="{http://www.consorziocsa.it/easydoc/ws}MailAddress"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiptType", propOrder = {
    "receiptID",
    "type",
    "mailUID",
    "dateReceipt",
    "dateCreation",
    "trasmissionState",
    "receiverAddress"
})
public class ReceiptType {

    @XmlElement(name = "ReceiptID", required = true)
    protected String receiptID;
    @XmlElement(name = "Type", required = true)
    protected ReceiptTypeType type;
    @XmlElement(name = "MailUID", required = true)
    protected String mailUID;
    @XmlElement(name = "DateReceipt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateReceipt;
    @XmlElement(name = "DateCreation", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreation;
    @XmlElement(name = "TrasmissionState", required = true)
    protected TrasmissionStateType trasmissionState;
    @XmlElement(name = "ReceiverAddress", required = true)
    protected String receiverAddress;

    /**
     * Gets the value of the receiptID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptID() {
        return receiptID;
    }

    /**
     * Sets the value of the receiptID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiptID(String value) {
        this.receiptID = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiptTypeType }
     *     
     */
    public ReceiptTypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiptTypeType }
     *     
     */
    public void setType(ReceiptTypeType value) {
        this.type = value;
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
     * Gets the value of the dateReceipt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateReceipt() {
        return dateReceipt;
    }

    /**
     * Sets the value of the dateReceipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateReceipt(XMLGregorianCalendar value) {
        this.dateReceipt = value;
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
     * Gets the value of the trasmissionState property.
     * 
     * @return
     *     possible object is
     *     {@link TrasmissionStateType }
     *     
     */
    public TrasmissionStateType getTrasmissionState() {
        return trasmissionState;
    }

    /**
     * Sets the value of the trasmissionState property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrasmissionStateType }
     *     
     */
    public void setTrasmissionState(TrasmissionStateType value) {
        this.trasmissionState = value;
    }

    /**
     * Gets the value of the receiverAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverAddress() {
        return receiverAddress;
    }

    /**
     * Sets the value of the receiverAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverAddress(String value) {
        this.receiverAddress = value;
    }

}
