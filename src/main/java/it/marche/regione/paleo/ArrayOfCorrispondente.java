
package it.marche.regione.paleo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCorrispondente complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCorrispondente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Corrispondente" type="{http://paleo.regione.marche.it/services/}Corrispondente" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCorrispondente", propOrder = {
    "corrispondente"
})
public class ArrayOfCorrispondente {

    @XmlElement(name = "Corrispondente", nillable = true)
    protected List<Corrispondente> corrispondente;

    /**
     * Gets the value of the corrispondente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corrispondente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrispondente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Corrispondente }
     * 
     * 
     */
    public List<Corrispondente> getCorrispondente() {
        if (corrispondente == null) {
            corrispondente = new ArrayList<Corrispondente>();
        }
        return this.corrispondente;
    }

}
