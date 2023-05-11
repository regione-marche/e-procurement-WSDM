
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsModMailBoxOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsModMailBoxOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="MailBox" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.MailBox.ValueObject}MailBox" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsModMailBoxOutput", propOrder = {
    "mailBox"
})
public class InsModMailBoxOutput
    extends BaseOutput
{

    @XmlElement(name = "MailBox", nillable = true)
    protected MailBox mailBox;

    /**
     * Gets the value of the mailBox property.
     * 
     * @return
     *     possible object is
     *     {@link MailBox }
     *     
     */
    public MailBox getMailBox() {
        return mailBox;
    }

    /**
     * Sets the value of the mailBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailBox }
     *     
     */
    public void setMailBox(MailBox value) {
        this.mailBox = value;
    }

}
