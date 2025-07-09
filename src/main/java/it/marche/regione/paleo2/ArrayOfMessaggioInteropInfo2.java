
package it.marche.regione.paleo2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMessaggioInteropInfo2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMessaggioInteropInfo2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessaggioInteropInfo2" type="{http://paleo.regione.marche.it/services/}MessaggioInteropInfo2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMessaggioInteropInfo2", namespace = "http://paleo.regione.marche.it/services/", propOrder = {
    "messaggioInteropInfo2"
})
public class ArrayOfMessaggioInteropInfo2 {

    @XmlElement(name = "MessaggioInteropInfo2", nillable = true)
    protected List<MessaggioInteropInfo2> messaggioInteropInfo2;

    /**
     * Gets the value of the messaggioInteropInfo2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messaggioInteropInfo2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessaggioInteropInfo2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessaggioInteropInfo2 }
     * 
     * 
     */
    public List<MessaggioInteropInfo2> getMessaggioInteropInfo2() {
        if (messaggioInteropInfo2 == null) {
            messaggioInteropInfo2 = new ArrayList<MessaggioInteropInfo2>();
        }
        return this.messaggioInteropInfo2;
    }

}
