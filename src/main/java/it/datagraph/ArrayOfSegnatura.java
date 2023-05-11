
package it.datagraph;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSegnatura complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSegnatura">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Segnatura" type="{}Segnatura" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSegnatura", propOrder = {
    "segnatura"
})
public class ArrayOfSegnatura {

    @XmlElement(name = "Segnatura", nillable = true)
    protected List<Segnatura> segnatura;

    /**
     * Gets the value of the segnatura property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segnatura property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegnatura().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Segnatura }
     * 
     * 
     */
    public List<Segnatura> getSegnatura() {
        if (segnatura == null) {
            segnatura = new ArrayList<Segnatura>();
        }
        return this.segnatura;
    }

}
