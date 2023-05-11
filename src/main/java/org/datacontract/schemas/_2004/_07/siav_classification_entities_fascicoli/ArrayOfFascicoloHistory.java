
package org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFascicoloHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFascicoloHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FascicoloHistory" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject}FascicoloHistory" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFascicoloHistory", propOrder = {
    "fascicoloHistory"
})
public class ArrayOfFascicoloHistory {

    @XmlElement(name = "FascicoloHistory", nillable = true)
    protected List<FascicoloHistory> fascicoloHistory;

    /**
     * Gets the value of the fascicoloHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fascicoloHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFascicoloHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FascicoloHistory }
     * 
     * 
     */
    public List<FascicoloHistory> getFascicoloHistory() {
        if (fascicoloHistory == null) {
            fascicoloHistory = new ArrayList<FascicoloHistory>();
        }
        return this.fascicoloHistory;
    }

}
