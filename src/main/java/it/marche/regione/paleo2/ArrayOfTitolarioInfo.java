
package it.marche.regione.paleo2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTitolarioInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTitolarioInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TitolarioInfo" type="{http://paleo.regione.marche.it/services2/}TitolarioInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTitolarioInfo", propOrder = {
    "titolarioInfo"
})
public class ArrayOfTitolarioInfo {

    @XmlElement(name = "TitolarioInfo", nillable = true)
    protected List<TitolarioInfo> titolarioInfo;

    /**
     * Gets the value of the titolarioInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titolarioInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitolarioInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TitolarioInfo }
     * 
     * 
     */
    public List<TitolarioInfo> getTitolarioInfo() {
        if (titolarioInfo == null) {
            titolarioInfo = new ArrayList<TitolarioInfo>();
        }
        return this.titolarioInfo;
    }

}
