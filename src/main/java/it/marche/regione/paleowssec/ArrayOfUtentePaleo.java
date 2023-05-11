
package it.marche.regione.paleowssec;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUtentePaleo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUtentePaleo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UtentePaleo" type="{http://paleo.regione.marche.it/services/}UtentePaleo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUtentePaleo", propOrder = {
    "utentePaleo"
})
public class ArrayOfUtentePaleo {

    @XmlElement(name = "UtentePaleo", nillable = true)
    protected List<UtentePaleo> utentePaleo;

    /**
     * Gets the value of the utentePaleo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the utentePaleo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUtentePaleo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UtentePaleo }
     * 
     * 
     */
    public List<UtentePaleo> getUtentePaleo() {
        if (utentePaleo == null) {
            utentePaleo = new ArrayList<UtentePaleo>();
        }
        return this.utentePaleo;
    }

}
