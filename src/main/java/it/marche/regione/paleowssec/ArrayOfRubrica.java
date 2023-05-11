
package it.marche.regione.paleowssec;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRubrica complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRubrica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Rubrica" type="{http://paleo.regione.marche.it/services/}Rubrica" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRubrica", propOrder = {
    "rubrica"
})
public class ArrayOfRubrica {

    @XmlElement(name = "Rubrica", nillable = true)
    protected List<Rubrica> rubrica;

    /**
     * Gets the value of the rubrica property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rubrica property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRubrica().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rubrica }
     * 
     * 
     */
    public List<Rubrica> getRubrica() {
        if (rubrica == null) {
            rubrica = new ArrayList<Rubrica>();
        }
        return this.rubrica;
    }

}
