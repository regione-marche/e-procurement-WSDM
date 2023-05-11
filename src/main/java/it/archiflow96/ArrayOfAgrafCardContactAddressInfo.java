
package it.archiflow96;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAgrafCardContactAddressInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAgrafCardContactAddressInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgrafCardContactAddressInfo" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject}AgrafCardContactAddressInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAgrafCardContactAddressInfo", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject", propOrder = {
    "agrafCardContactAddressInfo"
})
public class ArrayOfAgrafCardContactAddressInfo {

    @XmlElement(name = "AgrafCardContactAddressInfo", nillable = true)
    protected List<AgrafCardContactAddressInfo> agrafCardContactAddressInfo;

    /**
     * Gets the value of the agrafCardContactAddressInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agrafCardContactAddressInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgrafCardContactAddressInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgrafCardContactAddressInfo }
     * 
     * 
     */
    public List<AgrafCardContactAddressInfo> getAgrafCardContactAddressInfo() {
        if (agrafCardContactAddressInfo == null) {
            agrafCardContactAddressInfo = new ArrayList<AgrafCardContactAddressInfo>();
        }
        return this.agrafCardContactAddressInfo;
    }

}
