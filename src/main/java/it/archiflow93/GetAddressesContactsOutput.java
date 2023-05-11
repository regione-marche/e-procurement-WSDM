
package it.archiflow93;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAddressesContactsOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAddressesContactsOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="AgrafCardTagAddresses" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject}ArrayOfAgrafCardTagAddressInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAddressesContactsOutput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "agrafCardTagAddresses"
})
public class GetAddressesContactsOutput
    extends BaseOutput
{

    @XmlElement(name = "AgrafCardTagAddresses", nillable = true)
    protected ArrayOfAgrafCardTagAddressInfo agrafCardTagAddresses;

    /**
     * Gets the value of the agrafCardTagAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAgrafCardTagAddressInfo }
     *     
     */
    public ArrayOfAgrafCardTagAddressInfo getAgrafCardTagAddresses() {
        return agrafCardTagAddresses;
    }

    /**
     * Sets the value of the agrafCardTagAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAgrafCardTagAddressInfo }
     *     
     */
    public void setAgrafCardTagAddresses(ArrayOfAgrafCardTagAddressInfo value) {
        this.agrafCardTagAddresses = value;
    }

}
