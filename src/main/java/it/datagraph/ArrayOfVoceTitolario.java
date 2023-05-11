
package it.datagraph;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVoceTitolario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVoceTitolario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VoceTitolario" type="{http://tempuri.org/}VoceTitolario" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVoceTitolario", propOrder = {
    "voceTitolario"
})
public class ArrayOfVoceTitolario {

    @XmlElement(name = "VoceTitolario", nillable = true)
    protected List<VoceTitolario> voceTitolario;

    /**
     * Gets the value of the voceTitolario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voceTitolario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoceTitolario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VoceTitolario }
     * 
     * 
     */
    public List<VoceTitolario> getVoceTitolario() {
        if (voceTitolario == null) {
            voceTitolario = new ArrayList<VoceTitolario>();
        }
        return this.voceTitolario;
    }

}
