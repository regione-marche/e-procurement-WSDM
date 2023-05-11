
package it.abletech.arxivar.dati;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDm_Fascicoli complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDm_Fascicoli">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dm_Fascicoli" type="{http://www.Abletech.it/Arxivar}Dm_Fascicoli" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDm_Fascicoli", propOrder = {
    "dmFascicoli"
})
public class ArrayOfDmFascicoli {

    @XmlElement(name = "Dm_Fascicoli", nillable = true)
    protected List<DmFascicoli> dmFascicoli;

    /**
     * Gets the value of the dmFascicoli property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dmFascicoli property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDmFascicoli().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DmFascicoli }
     * 
     * 
     */
    public List<DmFascicoli> getDmFascicoli() {
        if (dmFascicoli == null) {
            dmFascicoli = new ArrayList<DmFascicoli>();
        }
        return this.dmFascicoli;
    }

}
