
package it.archiflow93.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMailBoxesOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMailBoxesOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="MailBoxes" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.MailBox.ValueObject}ArrayOfMailBox" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMailBoxesOutput", propOrder = {
    "mailBoxes"
})
public class GetMailBoxesOutput
    extends BaseOutput
{

    @XmlElement(name = "MailBoxes", nillable = true)
    protected ArrayOfMailBox mailBoxes;

    /**
     * Gets the value of the mailBoxes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMailBox }
     *     
     */
    public ArrayOfMailBox getMailBoxes() {
        return mailBoxes;
    }

    /**
     * Sets the value of the mailBoxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMailBox }
     *     
     */
    public void setMailBoxes(ArrayOfMailBox value) {
        this.mailBoxes = value;
    }

}
