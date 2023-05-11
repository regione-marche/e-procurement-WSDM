
package it.abletech.arxivar.dati;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDm_UtentiBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDm_UtentiBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dm_UtentiBase" type="{http://www.Abletech.it/Arxivar}Dm_UtentiBase" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDm_UtentiBase", propOrder = {
    "dmUtentiBase"
})
public class ArrayOfDmUtentiBase {

    @XmlElement(name = "Dm_UtentiBase", nillable = true)
    protected List<DmUtentiBase> dmUtentiBase;

    /**
     * Gets the value of the dmUtentiBase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dmUtentiBase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDmUtentiBase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DmUtentiBase }
     * 
     * 
     */
    public List<DmUtentiBase> getDmUtentiBase() {
        if (dmUtentiBase == null) {
            dmUtentiBase = new ArrayList<DmUtentiBase>();
        }
        return this.dmUtentiBase;
    }

}
