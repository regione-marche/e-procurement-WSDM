
package it.marche.regione.paleo2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRagioneInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRagioneInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RagioneInfo" type="{http://paleo.regione.marche.it/services/}RagioneInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRagioneInfo", namespace = "http://paleo.regione.marche.it/services/", propOrder = {
    "ragioneInfo"
})
public class ArrayOfRagioneInfo {

    @XmlElement(name = "RagioneInfo", nillable = true)
    protected List<RagioneInfo> ragioneInfo;

    /**
     * Gets the value of the ragioneInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ragioneInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRagioneInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RagioneInfo }
     * 
     * 
     */
    public List<RagioneInfo> getRagioneInfo() {
        if (ragioneInfo == null) {
            ragioneInfo = new ArrayList<RagioneInfo>();
        }
        return this.ragioneInfo;
    }

}
