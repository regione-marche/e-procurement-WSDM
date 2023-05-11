
package it.archiflow93.classification;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFascicoloPreservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFascicoloPreservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FascicoloPreservation" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject}FascicoloPreservation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFascicoloPreservation", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", propOrder = {
    "fascicoloPreservation"
})
public class ArrayOfFascicoloPreservation {

    @XmlElement(name = "FascicoloPreservation", nillable = true)
    protected List<FascicoloPreservation> fascicoloPreservation;

    /**
     * Gets the value of the fascicoloPreservation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fascicoloPreservation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFascicoloPreservation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FascicoloPreservation }
     * 
     * 
     */
    public List<FascicoloPreservation> getFascicoloPreservation() {
        if (fascicoloPreservation == null) {
            fascicoloPreservation = new ArrayList<FascicoloPreservation>();
        }
        return this.fascicoloPreservation;
    }

}
