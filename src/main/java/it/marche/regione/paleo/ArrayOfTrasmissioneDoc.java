
package it.marche.regione.paleo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTrasmissioneDoc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTrasmissioneDoc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TrasmissioneDoc" type="{http://paleo.regione.marche.it/services/}TrasmissioneDoc" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTrasmissioneDoc", propOrder = {
    "trasmissioneDoc"
})
public class ArrayOfTrasmissioneDoc {

    @XmlElement(name = "TrasmissioneDoc", nillable = true)
    protected List<TrasmissioneDoc> trasmissioneDoc;

    /**
     * Gets the value of the trasmissioneDoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trasmissioneDoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrasmissioneDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrasmissioneDoc }
     * 
     * 
     */
    public List<TrasmissioneDoc> getTrasmissioneDoc() {
        if (trasmissioneDoc == null) {
            trasmissioneDoc = new ArrayList<TrasmissioneDoc>();
        }
        return this.trasmissioneDoc;
    }

}
