
package it.marche.regione.paleo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDestinatarioInfoInterop complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDestinatarioInfoInterop">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DestinatarioInfoInterop" type="{http://paleo.regione.marche.it/services/}DestinatarioInfoInterop" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDestinatarioInfoInterop", propOrder = {
    "destinatarioInfoInterop"
})
public class ArrayOfDestinatarioInfoInterop {

    @XmlElement(name = "DestinatarioInfoInterop", nillable = true)
    protected List<DestinatarioInfoInterop> destinatarioInfoInterop;

    /**
     * Gets the value of the destinatarioInfoInterop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinatarioInfoInterop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinatarioInfoInterop().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DestinatarioInfoInterop }
     * 
     * 
     */
    public List<DestinatarioInfoInterop> getDestinatarioInfoInterop() {
        if (destinatarioInfoInterop == null) {
            destinatarioInfoInterop = new ArrayList<DestinatarioInfoInterop>();
        }
        return this.destinatarioInfoInterop;
    }

}
