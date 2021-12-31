
package it.archiflow93.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMailServersOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMailServersOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="MailServers" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.MailBox.ValueObject}ArrayOfMailServer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMailServersOutput", propOrder = {
    "mailServers"
})
public class GetMailServersOutput
    extends BaseOutput
{

    @XmlElement(name = "MailServers", nillable = true)
    protected ArrayOfMailServer mailServers;

    /**
     * Gets the value of the mailServers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMailServer }
     *     
     */
    public ArrayOfMailServer getMailServers() {
        return mailServers;
    }

    /**
     * Sets the value of the mailServers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMailServer }
     *     
     */
    public void setMailServers(ArrayOfMailServer value) {
        this.mailServers = value;
    }

}
