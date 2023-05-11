
package it.archiflow96.classification;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOggettarioCfg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOggettarioCfg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OggettarioCfg" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject}OggettarioCfg" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOggettarioCfg", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", propOrder = {
    "oggettarioCfg"
})
public class ArrayOfOggettarioCfg {

    @XmlElement(name = "OggettarioCfg", nillable = true)
    protected List<OggettarioCfg> oggettarioCfg;

    /**
     * Gets the value of the oggettarioCfg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oggettarioCfg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOggettarioCfg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OggettarioCfg }
     * 
     * 
     */
    public List<OggettarioCfg> getOggettarioCfg() {
        if (oggettarioCfg == null) {
            oggettarioCfg = new ArrayList<OggettarioCfg>();
        }
        return this.oggettarioCfg;
    }

}
