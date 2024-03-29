
package it.archiflow93.email;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProxy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProxy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Proxy" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.MailBox.ValueObject}Proxy" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProxy", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.MailBox.ValueObject", propOrder = {
    "proxy"
})
public class ArrayOfProxy {

    @XmlElement(name = "Proxy", nillable = true)
    protected List<Proxy> proxy;

    /**
     * Gets the value of the proxy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proxy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProxy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Proxy }
     * 
     * 
     */
    public List<Proxy> getProxy() {
        if (proxy == null) {
            proxy = new ArrayList<Proxy>();
        }
        return this.proxy;
    }

}
