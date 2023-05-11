
package it.marche.regione.paleowssec;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTrasmissioneRuolo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTrasmissioneRuolo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TrasmissioneRuolo" type="{http://paleo.regione.marche.it/services/}TrasmissioneRuolo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTrasmissioneRuolo", propOrder = {
    "trasmissioneRuolo"
})
public class ArrayOfTrasmissioneRuolo {

    @XmlElement(name = "TrasmissioneRuolo", nillable = true)
    protected List<TrasmissioneRuolo> trasmissioneRuolo;

    /**
     * Gets the value of the trasmissioneRuolo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trasmissioneRuolo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrasmissioneRuolo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrasmissioneRuolo }
     * 
     * 
     */
    public List<TrasmissioneRuolo> getTrasmissioneRuolo() {
        if (trasmissioneRuolo == null) {
            trasmissioneRuolo = new ArrayList<TrasmissioneRuolo>();
        }
        return this.trasmissioneRuolo;
    }

}
