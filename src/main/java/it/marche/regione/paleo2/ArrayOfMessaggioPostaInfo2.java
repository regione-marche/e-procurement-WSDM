
package it.marche.regione.paleo2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMessaggioPostaInfo2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMessaggioPostaInfo2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessaggioPostaInfo2" type="{http://paleo.regione.marche.it/services/}MessaggioPostaInfo2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMessaggioPostaInfo2", namespace = "http://paleo.regione.marche.it/services/", propOrder = {
    "messaggioPostaInfo2"
})
public class ArrayOfMessaggioPostaInfo2 {

    @XmlElement(name = "MessaggioPostaInfo2", nillable = true)
    protected List<MessaggioPostaInfo2> messaggioPostaInfo2;

    /**
     * Gets the value of the messaggioPostaInfo2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messaggioPostaInfo2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessaggioPostaInfo2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessaggioPostaInfo2 }
     * 
     * 
     */
    public List<MessaggioPostaInfo2> getMessaggioPostaInfo2() {
        if (messaggioPostaInfo2 == null) {
            messaggioPostaInfo2 = new ArrayList<MessaggioPostaInfo2>();
        }
        return this.messaggioPostaInfo2;
    }

}
