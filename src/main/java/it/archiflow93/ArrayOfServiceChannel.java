
package it.archiflow93;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfServiceChannel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfServiceChannel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceChannel" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject}ServiceChannel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServiceChannel", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", propOrder = {
    "serviceChannel"
})
public class ArrayOfServiceChannel {

    @XmlElement(name = "ServiceChannel", nillable = true)
    protected List<ServiceChannel> serviceChannel;

    /**
     * Gets the value of the serviceChannel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceChannel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceChannel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceChannel }
     * 
     * 
     */
    public List<ServiceChannel> getServiceChannel() {
        if (serviceChannel == null) {
            serviceChannel = new ArrayList<ServiceChannel>();
        }
        return this.serviceChannel;
    }

}
