
package it.marche.regione.paleo2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTrasmissioneRuoloInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTrasmissioneRuoloInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TrasmissioneRuoloInfo" type="{http://paleo.regione.marche.it/services2/}TrasmissioneRuoloInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTrasmissioneRuoloInfo", propOrder = {
    "trasmissioneRuoloInfo"
})
public class ArrayOfTrasmissioneRuoloInfo {

    @XmlElement(name = "TrasmissioneRuoloInfo", nillable = true)
    protected List<TrasmissioneRuoloInfo> trasmissioneRuoloInfo;

    /**
     * Gets the value of the trasmissioneRuoloInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trasmissioneRuoloInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrasmissioneRuoloInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrasmissioneRuoloInfo }
     * 
     * 
     */
    public List<TrasmissioneRuoloInfo> getTrasmissioneRuoloInfo() {
        if (trasmissioneRuoloInfo == null) {
            trasmissioneRuoloInfo = new ArrayList<TrasmissioneRuoloInfo>();
        }
        return this.trasmissioneRuoloInfo;
    }

}
