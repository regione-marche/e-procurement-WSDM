
package it.abletech.arxivar.search;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfField_Abstract complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfField_Abstract">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Field_Abstract" type="{http://www.Abletech.it/Arxivar}Field_Abstract" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfField_Abstract", propOrder = {
    "fieldAbstract"
})
public class ArrayOfFieldAbstract {

    @XmlElement(name = "Field_Abstract", nillable = true)
    protected List<FieldAbstract> fieldAbstract;

    /**
     * Gets the value of the fieldAbstract property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldAbstract property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldAbstract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldAbstract }
     * 
     * 
     */
    public List<FieldAbstract> getFieldAbstract() {
        if (fieldAbstract == null) {
            fieldAbstract = new ArrayList<FieldAbstract>();
        }
        return this.fieldAbstract;
    }

}
