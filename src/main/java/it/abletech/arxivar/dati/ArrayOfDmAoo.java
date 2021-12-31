
package it.abletech.arxivar.dati;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDm_Aoo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDm_Aoo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dm_Aoo" type="{http://www.Abletech.it/Arxivar}Dm_Aoo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDm_Aoo", propOrder = {
    "dmAoo"
})
public class ArrayOfDmAoo {

    @XmlElement(name = "Dm_Aoo", nillable = true)
    protected List<DmAoo> dmAoo;

    /**
     * Gets the value of the dmAoo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dmAoo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDmAoo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DmAoo }
     * 
     * 
     */
    public List<DmAoo> getDmAoo() {
        if (dmAoo == null) {
            dmAoo = new ArrayList<DmAoo>();
        }
        return this.dmAoo;
    }

}
