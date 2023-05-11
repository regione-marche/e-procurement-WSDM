
package it.abletech.arxivar.dati;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDm_CampiSpecifici complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDm_CampiSpecifici">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dm_CampiSpecifici" type="{http://www.Abletech.it/Arxivar}Dm_CampiSpecifici" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDm_CampiSpecifici", propOrder = {
    "dmCampiSpecifici"
})
public class ArrayOfDmCampiSpecifici {

    @XmlElement(name = "Dm_CampiSpecifici", nillable = true)
    protected List<DmCampiSpecifici> dmCampiSpecifici;

    /**
     * Gets the value of the dmCampiSpecifici property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dmCampiSpecifici property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDmCampiSpecifici().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DmCampiSpecifici }
     * 
     * 
     */
    public List<DmCampiSpecifici> getDmCampiSpecifici() {
        if (dmCampiSpecifici == null) {
            dmCampiSpecifici = new ArrayList<DmCampiSpecifici>();
        }
        return this.dmCampiSpecifici;
    }

}
