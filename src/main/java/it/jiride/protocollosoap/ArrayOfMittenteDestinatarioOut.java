
package it.jiride.protocollosoap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMittenteDestinatarioOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMittenteDestinatarioOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MittenteDestinatario" type="{http://tempuri.org/}MittenteDestinatarioOut" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMittenteDestinatarioOut", propOrder = {
    "mittenteDestinatario"
})
public class ArrayOfMittenteDestinatarioOut {

    @XmlElement(name = "MittenteDestinatario")
    protected List<MittenteDestinatarioOut> mittenteDestinatario;

    /**
     * Gets the value of the mittenteDestinatario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mittenteDestinatario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMittenteDestinatario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MittenteDestinatarioOut }
     * 
     * 
     */
    public List<MittenteDestinatarioOut> getMittenteDestinatario() {
        if (mittenteDestinatario == null) {
            mittenteDestinatario = new ArrayList<MittenteDestinatarioOut>();
        }
        return this.mittenteDestinatario;
    }

}
