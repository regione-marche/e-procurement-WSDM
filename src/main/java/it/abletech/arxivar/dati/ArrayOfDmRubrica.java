
package it.abletech.arxivar.dati;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDm_Rubrica complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDm_Rubrica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dm_Rubrica" type="{http://www.Abletech.it/Arxivar}Dm_Rubrica" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDm_Rubrica", propOrder = {
    "dmRubrica"
})
public class ArrayOfDmRubrica {

    @XmlElement(name = "Dm_Rubrica", nillable = true)
    protected List<DmRubrica> dmRubrica;

    /**
     * Gets the value of the dmRubrica property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dmRubrica property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDmRubrica().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DmRubrica }
     * 
     * 
     */
    public List<DmRubrica> getDmRubrica() {
        if (dmRubrica == null) {
            dmRubrica = new ArrayList<DmRubrica>();
        }
        return this.dmRubrica;
    }

}
