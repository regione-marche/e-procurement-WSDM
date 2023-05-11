
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsModMailServerOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsModMailServerOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="MailServer" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.MailBox.ValueObject}MailServer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsModMailServerOutput", propOrder = {
    "mailServer"
})
public class InsModMailServerOutput
    extends BaseOutput
{

    @XmlElement(name = "MailServer", nillable = true)
    protected MailServer mailServer;

    /**
     * Gets the value of the mailServer property.
     * 
     * @return
     *     possible object is
     *     {@link MailServer }
     *     
     */
    public MailServer getMailServer() {
        return mailServer;
    }

    /**
     * Sets the value of the mailServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailServer }
     *     
     */
    public void setMailServer(MailServer value) {
        this.mailServer = value;
    }

}
