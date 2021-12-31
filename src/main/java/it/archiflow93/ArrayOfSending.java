
package it.archiflow93;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSending complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSending">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sending" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject}Sending" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSending", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", propOrder = {
    "sending"
})
public class ArrayOfSending {

    @XmlElement(name = "Sending", nillable = true)
    protected List<Sending> sending;

    /**
     * Gets the value of the sending property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sending property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSending().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sending }
     * 
     * 
     */
    public List<Sending> getSending() {
        if (sending == null) {
            sending = new ArrayList<Sending>();
        }
        return this.sending;
    }

}
