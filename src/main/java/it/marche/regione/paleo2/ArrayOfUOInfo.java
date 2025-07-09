
package it.marche.regione.paleo2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUOInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUOInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UOInfo" type="{http://paleo.regione.marche.it/services/}UOInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUOInfo", namespace = "http://paleo.regione.marche.it/services/", propOrder = {
    "uoInfo"
})
public class ArrayOfUOInfo {

    @XmlElement(name = "UOInfo", nillable = true)
    protected List<UOInfo> uoInfo;

    /**
     * Gets the value of the uoInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uoInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUOInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UOInfo }
     * 
     * 
     */
    public List<UOInfo> getUOInfo() {
        if (uoInfo == null) {
            uoInfo = new ArrayList<UOInfo>();
        }
        return this.uoInfo;
    }

}
