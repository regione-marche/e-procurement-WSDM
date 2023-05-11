
package it.iride.wsprotocollodm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCopiaCreata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCopiaCreata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CopiaCreata" type="{http://tempuri.org/}CopiaCreata" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCopiaCreata", propOrder = {
    "copiaCreata"
})
public class ArrayOfCopiaCreata {

    @XmlElement(name = "CopiaCreata")
    protected List<CopiaCreata> copiaCreata;

    /**
     * Gets the value of the copiaCreata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the copiaCreata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCopiaCreata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CopiaCreata }
     * 
     * 
     */
    public List<CopiaCreata> getCopiaCreata() {
        if (copiaCreata == null) {
            copiaCreata = new ArrayList<CopiaCreata>();
        }
        return this.copiaCreata;
    }

}
