
package it.archiflow96.email;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProcessInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProcessInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcessInfo" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.MailBox.ValueObject}ProcessInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProcessInfo", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.MailBox.ValueObject", propOrder = {
    "processInfo"
})
public class ArrayOfProcessInfo {

    @XmlElement(name = "ProcessInfo", nillable = true)
    protected List<ProcessInfo> processInfo;

    /**
     * Gets the value of the processInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessInfo }
     * 
     * 
     */
    public List<ProcessInfo> getProcessInfo() {
        if (processInfo == null) {
            processInfo = new ArrayList<ProcessInfo>();
        }
        return this.processInfo;
    }

}
