
package it.archiflow94;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCheckInfoFatturaPA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCheckInfoFatturaPA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CheckInfoFatturaPA" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject}CheckInfoFatturaPA" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCheckInfoFatturaPA", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", propOrder = {
    "checkInfoFatturaPA"
})
public class ArrayOfCheckInfoFatturaPA {

    @XmlElement(name = "CheckInfoFatturaPA", nillable = true)
    protected List<CheckInfoFatturaPA> checkInfoFatturaPA;

    /**
     * Gets the value of the checkInfoFatturaPA property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkInfoFatturaPA property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckInfoFatturaPA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckInfoFatturaPA }
     * 
     * 
     */
    public List<CheckInfoFatturaPA> getCheckInfoFatturaPA() {
        if (checkInfoFatturaPA == null) {
            checkInfoFatturaPA = new ArrayList<CheckInfoFatturaPA>();
        }
        return this.checkInfoFatturaPA;
    }

}
