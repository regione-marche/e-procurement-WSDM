
package it.marche.regione.paleowssec;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTipoDatiFascicolo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTipoDatiFascicolo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoDatiFascicolo" type="{http://paleo.regione.marche.it/services/}TipoDatiFascicolo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTipoDatiFascicolo", propOrder = {
    "tipoDatiFascicolo"
})
public class ArrayOfTipoDatiFascicolo {

    @XmlElement(name = "TipoDatiFascicolo", nillable = true)
    protected List<TipoDatiFascicolo> tipoDatiFascicolo;

    /**
     * Gets the value of the tipoDatiFascicolo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tipoDatiFascicolo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTipoDatiFascicolo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoDatiFascicolo }
     * 
     * 
     */
    public List<TipoDatiFascicolo> getTipoDatiFascicolo() {
        if (tipoDatiFascicolo == null) {
            tipoDatiFascicolo = new ArrayList<TipoDatiFascicolo>();
        }
        return this.tipoDatiFascicolo;
    }

}
