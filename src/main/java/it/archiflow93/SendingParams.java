
package it.archiflow93;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendingParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SendPriority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bSingleRecipients" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="bSplitAddr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="oAgrafRecips" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject}ArrayOfRecipient" minOccurs="0"/>
 *         &lt;element name="oEMailInfo" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject}EMail" minOccurs="0"/>
 *         &lt;element name="strChannelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendingParams", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", propOrder = {
    "sendPriority",
    "bSingleRecipients",
    "bSplitAddr",
    "oAgrafRecips",
    "oeMailInfo",
    "strChannelID"
})
public class SendingParams {

    @XmlElement(name = "SendPriority")
    protected Integer sendPriority;
    protected Boolean bSingleRecipients;
    protected Boolean bSplitAddr;
    @XmlElement(nillable = true)
    protected ArrayOfRecipient oAgrafRecips;
    @XmlElement(name = "oEMailInfo", nillable = true)
    protected EMail oeMailInfo;
    @XmlElement(nillable = true)
    protected String strChannelID;

    /**
     * Gets the value of the sendPriority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSendPriority() {
        return sendPriority;
    }

    /**
     * Sets the value of the sendPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSendPriority(Integer value) {
        this.sendPriority = value;
    }

    /**
     * Gets the value of the bSingleRecipients property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBSingleRecipients() {
        return bSingleRecipients;
    }

    /**
     * Sets the value of the bSingleRecipients property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBSingleRecipients(Boolean value) {
        this.bSingleRecipients = value;
    }

    /**
     * Gets the value of the bSplitAddr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBSplitAddr() {
        return bSplitAddr;
    }

    /**
     * Sets the value of the bSplitAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBSplitAddr(Boolean value) {
        this.bSplitAddr = value;
    }

    /**
     * Gets the value of the oAgrafRecips property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecipient }
     *     
     */
    public ArrayOfRecipient getOAgrafRecips() {
        return oAgrafRecips;
    }

    /**
     * Sets the value of the oAgrafRecips property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecipient }
     *     
     */
    public void setOAgrafRecips(ArrayOfRecipient value) {
        this.oAgrafRecips = value;
    }

    /**
     * Gets the value of the oeMailInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EMail }
     *     
     */
    public EMail getOEMailInfo() {
        return oeMailInfo;
    }

    /**
     * Sets the value of the oeMailInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMail }
     *     
     */
    public void setOEMailInfo(EMail value) {
        this.oeMailInfo = value;
    }

    /**
     * Gets the value of the strChannelID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrChannelID() {
        return strChannelID;
    }

    /**
     * Sets the value of the strChannelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrChannelID(String value) {
        this.strChannelID = value;
    }

}
