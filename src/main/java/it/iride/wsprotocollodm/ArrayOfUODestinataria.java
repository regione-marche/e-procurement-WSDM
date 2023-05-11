
package it.iride.wsprotocollodm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUODestinataria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUODestinataria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UODestinataria" type="{http://tempuri.org/}UODestinataria" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUODestinataria", propOrder = {
    "uoDestinataria"
})
public class ArrayOfUODestinataria {

    @XmlElement(name = "UODestinataria")
    protected List<UODestinataria> uoDestinataria;

    /**
     * Gets the value of the uoDestinataria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uoDestinataria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUODestinataria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UODestinataria }
     * 
     * 
     */
    public List<UODestinataria> getUODestinataria() {
        if (uoDestinataria == null) {
            uoDestinataria = new ArrayList<UODestinataria>();
        }
        return this.uoDestinataria;
    }

}
