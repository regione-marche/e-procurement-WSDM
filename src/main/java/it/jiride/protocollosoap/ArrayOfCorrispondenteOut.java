
package it.jiride.protocollosoap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCorrispondenteOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCorrispondenteOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Corrispondente" type="{http://tempuri.org/}CorrispondenteOut" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCorrispondenteOut", propOrder = {
    "corrispondente"
})
public class ArrayOfCorrispondenteOut {

    @XmlElement(name = "Corrispondente")
    protected List<CorrispondenteOut> corrispondente;

    /**
     * Gets the value of the corrispondente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corrispondente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrispondente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorrispondenteOut }
     * 
     * 
     */
    public List<CorrispondenteOut> getCorrispondente() {
        if (corrispondente == null) {
            corrispondente = new ArrayList<CorrispondenteOut>();
        }
        return this.corrispondente;
    }

}
