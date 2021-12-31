
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetProxiesOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetProxiesOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="Proxies" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.MailBox.ValueObject}ArrayOfProxy" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetProxiesOutput", propOrder = {
    "proxies"
})
public class GetProxiesOutput
    extends BaseOutput
{

    @XmlElement(name = "Proxies", nillable = true)
    protected ArrayOfProxy proxies;

    /**
     * Gets the value of the proxies property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProxy }
     *     
     */
    public ArrayOfProxy getProxies() {
        return proxies;
    }

    /**
     * Sets the value of the proxies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProxy }
     *     
     */
    public void setProxies(ArrayOfProxy value) {
        this.proxies = value;
    }

}
