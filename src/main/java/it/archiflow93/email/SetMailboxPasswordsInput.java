
package it.archiflow93.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetMailboxPasswordsInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetMailboxPasswordsInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="IsUserMailBox" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MailBoxId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UserPasswordIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserPasswordOut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetMailboxPasswordsInput", propOrder = {
    "isUserMailBox",
    "mailBoxId",
    "userPasswordIn",
    "userPasswordOut"
})
public class SetMailboxPasswordsInput
    extends BaseInput
{

    @XmlElement(name = "IsUserMailBox")
    protected Boolean isUserMailBox;
    @XmlElement(name = "MailBoxId")
    protected Integer mailBoxId;
    @XmlElement(name = "UserPasswordIn", nillable = true)
    protected String userPasswordIn;
    @XmlElement(name = "UserPasswordOut", nillable = true)
    protected String userPasswordOut;

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
     * Gets the value of the mailBoxId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMailBoxId() {
        return mailBoxId;
    }

    /**
     * Sets the value of the mailBoxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMailBoxId(Integer value) {
        this.mailBoxId = value;
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
