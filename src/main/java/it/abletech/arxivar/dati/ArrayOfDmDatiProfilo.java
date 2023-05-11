
package it.abletech.arxivar.dati;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDm_DatiProfilo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDm_DatiProfilo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dm_DatiProfilo" type="{http://www.Abletech.it/Arxivar}Dm_DatiProfilo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDm_DatiProfilo", propOrder = {
    "dmDatiProfilo"
})
public class ArrayOfDmDatiProfilo {

    @XmlElement(name = "Dm_DatiProfilo", nillable = true)
    protected List<DmDatiProfilo> dmDatiProfilo;

    /**
     * Gets the value of the dmDatiProfilo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dmDatiProfilo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDmDatiProfilo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DmDatiProfilo }
     * 
     * 
     */
    public List<DmDatiProfilo> getDmDatiProfilo() {
        if (dmDatiProfilo == null) {
            dmDatiProfilo = new ArrayList<DmDatiProfilo>();
        }
        return this.dmDatiProfilo;
    }

}
