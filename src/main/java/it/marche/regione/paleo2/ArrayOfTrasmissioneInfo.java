
package it.marche.regione.paleo2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTrasmissioneInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTrasmissioneInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TrasmissioneInfo" type="{http://paleo.regione.marche.it/services2/}TrasmissioneInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTrasmissioneInfo", propOrder = {
    "trasmissioneInfo"
})
public class ArrayOfTrasmissioneInfo {

    @XmlElement(name = "TrasmissioneInfo", nillable = true)
    protected List<TrasmissioneInfo> trasmissioneInfo;

    /**
     * Gets the value of the trasmissioneInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trasmissioneInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrasmissioneInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrasmissioneInfo }
     * 
     * 
     */
    public List<TrasmissioneInfo> getTrasmissioneInfo() {
        if (trasmissioneInfo == null) {
            trasmissioneInfo = new ArrayList<TrasmissioneInfo>();
        }
        return this.trasmissioneInfo;
    }

}
