
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveEmailOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveEmailOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="MailIn" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}MailIn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveEmailOutput", propOrder = {
    "mailIn"
})
public class RetrieveEmailOutput
    extends BaseOutput
{

    @XmlElement(name = "MailIn", nillable = true)
    protected MailIn mailIn;

    /**
     * Gets the value of the mailIn property.
     * 
     * @return
     *     possible object is
     *     {@link MailIn }
     *     
     */
    public MailIn getMailIn() {
        return mailIn;
    }

    /**
     * Sets the value of the mailIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailIn }
     *     
     */
    public void setMailIn(MailIn value) {
        this.mailIn = value;
    }

}
