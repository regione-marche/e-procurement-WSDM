
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCustomMailFieldsInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomMailFieldsInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="CEFContext" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}CustomEmailFieldsContext" minOccurs="0"/>
 *         &lt;element name="CardId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="MailboxEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomMailFieldsInput", propOrder = {
    "cefContext",
    "cardId",
    "mailboxEmail"
})
public class GetCustomMailFieldsInput
    extends BaseInput
{

    @XmlElement(name = "CEFContext")
    protected CustomEmailFieldsContext cefContext;
    @XmlElement(name = "CardId")
    protected String cardId;
    @XmlElement(name = "MailboxEmail", nillable = true)
    protected String mailboxEmail;

    /**
     * Gets the value of the cefContext property.
     * 
     * @return
     *     possible object is
     *     {@link CustomEmailFieldsContext }
     *     
     */
    public CustomEmailFieldsContext getCEFContext() {
        return cefContext;
    }

    /**
     * Sets the value of the cefContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomEmailFieldsContext }
     *     
     */
    public void setCEFContext(CustomEmailFieldsContext value) {
        this.cefContext = value;
    }

    /**
     * Gets the value of the cardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * Sets the value of the cardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardId(String value) {
        this.cardId = value;
    }

    /**
     * Gets the value of the mailboxEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailboxEmail() {
        return mailboxEmail;
    }

    /**
     * Sets the value of the mailboxEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailboxEmail(String value) {
        this.mailboxEmail = value;
    }

}
