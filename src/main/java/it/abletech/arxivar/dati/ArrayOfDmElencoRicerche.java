
package it.abletech.arxivar.dati;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDm_Elenco_Ricerche complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDm_Elenco_Ricerche">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dm_Elenco_Ricerche" type="{http://www.Abletech.it/Arxivar}Dm_Elenco_Ricerche" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDm_Elenco_Ricerche", propOrder = {
    "dmElencoRicerche"
})
public class ArrayOfDmElencoRicerche {

    @XmlElement(name = "Dm_Elenco_Ricerche", nillable = true)
    protected List<DmElencoRicerche> dmElencoRicerche;

    /**
     * Gets the value of the dmElencoRicerche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dmElencoRicerche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDmElencoRicerche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DmElencoRicerche }
     * 
     * 
     */
    public List<DmElencoRicerche> getDmElencoRicerche() {
        if (dmElencoRicerche == null) {
            dmElencoRicerche = new ArrayList<DmElencoRicerche>();
        }
        return this.dmElencoRicerche;
    }

}
