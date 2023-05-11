
package it.archiflow96;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAgrafCardContactId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAgrafCardContactId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgrafCardContactId" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject}AgrafCardContactId" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAgrafCardContactId", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject", propOrder = {
    "agrafCardContactId"
})
public class ArrayOfAgrafCardContactId {

    @XmlElement(name = "AgrafCardContactId", nillable = true)
    protected List<AgrafCardContactId> agrafCardContactId;

    /**
     * Gets the value of the agrafCardContactId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agrafCardContactId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgrafCardContactId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgrafCardContactId }
     * 
     * 
     */
    public List<AgrafCardContactId> getAgrafCardContactId() {
        if (agrafCardContactId == null) {
            agrafCardContactId = new ArrayList<AgrafCardContactId>();
        }
        return this.agrafCardContactId;
    }

}
