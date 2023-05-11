
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardToSetReplyOrForward complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardToSetReplyOrForward">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DBA" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Mail.ValueObject}MailDBA" minOccurs="0"/>
 *         &lt;element name="OfficeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReplyOrForward" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardToSetReplyOrForward", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "dba",
    "officeId",
    "replyOrForward"
})
public class CardToSetReplyOrForward {

    @XmlElement(name = "DBA", nillable = true)
    protected MailDBA dba;
    @XmlElement(name = "OfficeId")
    protected Integer officeId;
    @XmlElement(name = "ReplyOrForward")
    protected Boolean replyOrForward;

    /**
     * Gets the value of the dba property.
     * 
     * @return
     *     possible object is
     *     {@link MailDBA }
     *     
     */
    public MailDBA getDBA() {
        return dba;
    }

    /**
     * Sets the value of the dba property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailDBA }
     *     
     */
    public void setDBA(MailDBA value) {
        this.dba = value;
    }

    /**
     * Gets the value of the officeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOfficeId() {
        return officeId;
    }

    /**
     * Sets the value of the officeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOfficeId(Integer value) {
        this.officeId = value;
    }

    /**
     * Gets the value of the replyOrForward property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReplyOrForward() {
        return replyOrForward;
    }

    /**
     * Sets the value of the replyOrForward property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplyOrForward(Boolean value) {
        this.replyOrForward = value;
    }

}
