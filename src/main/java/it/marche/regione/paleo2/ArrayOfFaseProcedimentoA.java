
package it.marche.regione.paleo2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFaseProcedimentoA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFaseProcedimentoA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FaseProcedimentoA" type="{http://paleo.regione.marche.it/services2/}FaseProcedimentoA" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFaseProcedimentoA", propOrder = {
    "faseProcedimentoA"
})
public class ArrayOfFaseProcedimentoA {

    @XmlElement(name = "FaseProcedimentoA", nillable = true)
    protected List<FaseProcedimentoA> faseProcedimentoA;

    /**
     * Gets the value of the faseProcedimentoA property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faseProcedimentoA property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFaseProcedimentoA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FaseProcedimentoA }
     * 
     * 
     */
    public List<FaseProcedimentoA> getFaseProcedimentoA() {
        if (faseProcedimentoA == null) {
            faseProcedimentoA = new ArrayList<FaseProcedimentoA>();
        }
        return this.faseProcedimentoA;
    }

}
