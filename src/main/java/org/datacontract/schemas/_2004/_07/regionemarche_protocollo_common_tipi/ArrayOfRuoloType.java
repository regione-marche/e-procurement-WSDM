
package org.datacontract.schemas._2004._07.regionemarche_protocollo_common_tipi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRuoloType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRuoloType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RuoloType" type="{http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.Tipi.Digip}RuoloType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRuoloType", propOrder = {
    "ruoloType"
})
public class ArrayOfRuoloType {

    @XmlElement(name = "RuoloType", nillable = true)
    protected List<RuoloType> ruoloType;

    /**
     * Gets the value of the ruoloType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ruoloType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuoloType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RuoloType }
     * 
     * 
     */
    public List<RuoloType> getRuoloType() {
        if (ruoloType == null) {
            ruoloType = new ArrayList<RuoloType>();
        }
        return this.ruoloType;
    }

}
