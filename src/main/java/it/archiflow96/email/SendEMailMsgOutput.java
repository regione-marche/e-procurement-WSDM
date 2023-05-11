
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendEMailMsgOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendEMailMsgOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="MailOutGuidCards" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendEMailMsgOutput", propOrder = {
    "mailOutGuidCards"
})
public class SendEMailMsgOutput
    extends BaseOutput
{

    @XmlElement(name = "MailOutGuidCards", nillable = true)
    protected ArrayOfguid mailOutGuidCards;

    /**
     * Gets the value of the mailOutGuidCards property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfguid }
     *     
     */
    public ArrayOfguid getMailOutGuidCards() {
        return mailOutGuidCards;
    }

    /**
     * Sets the value of the mailOutGuidCards property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfguid }
     *     
     */
    public void setMailOutGuidCards(ArrayOfguid value) {
        this.mailOutGuidCards = value;
    }

}
