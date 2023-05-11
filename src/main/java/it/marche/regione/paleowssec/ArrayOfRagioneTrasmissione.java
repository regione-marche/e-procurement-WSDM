
package it.marche.regione.paleowssec;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRagioneTrasmissione complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRagioneTrasmissione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RagioneTrasmissione" type="{http://paleo.regione.marche.it/services/}RagioneTrasmissione" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRagioneTrasmissione", propOrder = {
    "ragioneTrasmissione"
})
public class ArrayOfRagioneTrasmissione {

    @XmlElement(name = "RagioneTrasmissione", nillable = true)
    protected List<RagioneTrasmissione> ragioneTrasmissione;

    /**
     * Gets the value of the ragioneTrasmissione property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ragioneTrasmissione property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRagioneTrasmissione().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RagioneTrasmissione }
     * 
     * 
     */
    public List<RagioneTrasmissione> getRagioneTrasmissione() {
        if (ragioneTrasmissione == null) {
            ragioneTrasmissione = new ArrayList<RagioneTrasmissione>();
        }
        return this.ragioneTrasmissione;
    }

}
