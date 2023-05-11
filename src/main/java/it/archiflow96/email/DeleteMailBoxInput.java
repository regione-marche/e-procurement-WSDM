
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteMailBoxInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteMailBoxInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="IsUserMailBox" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MailBoxId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteMailBoxInput", propOrder = {
    "isUserMailBox",
    "mailBoxId"
})
public class DeleteMailBoxInput
    extends BaseInput
{

    @XmlElement(name = "IsUserMailBox")
    protected Boolean isUserMailBox;
    @XmlElement(name = "MailBoxId")
    protected Integer mailBoxId;

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

}
