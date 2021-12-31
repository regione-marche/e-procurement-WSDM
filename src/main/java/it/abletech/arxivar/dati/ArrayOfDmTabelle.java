
package it.abletech.arxivar.dati;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDm_Tabelle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDm_Tabelle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dm_Tabelle" type="{http://www.Abletech.it/Arxivar}Dm_Tabelle" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDm_Tabelle", propOrder = {
    "dmTabelle"
})
public class ArrayOfDmTabelle {

    @XmlElement(name = "Dm_Tabelle", nillable = true)
    protected List<DmTabelle> dmTabelle;

    /**
     * Gets the value of the dmTabelle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dmTabelle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDmTabelle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DmTabelle }
     * 
     * 
     */
    public List<DmTabelle> getDmTabelle() {
        if (dmTabelle == null) {
            dmTabelle = new ArrayList<DmTabelle>();
        }
        return this.dmTabelle;
    }

}
