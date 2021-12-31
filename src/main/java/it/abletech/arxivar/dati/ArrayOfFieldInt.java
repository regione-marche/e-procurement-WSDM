
package it.abletech.arxivar.dati;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfField_Int complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfField_Int">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Field_Int" type="{http://www.Abletech.it/Arxivar}Field_Int" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfField_Int", propOrder = {
    "fieldInt"
})
public class ArrayOfFieldInt {

    @XmlElement(name = "Field_Int", nillable = true)
    protected List<FieldInt> fieldInt;

    /**
     * Gets the value of the fieldInt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldInt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldInt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldInt }
     * 
     * 
     */
    public List<FieldInt> getFieldInt() {
        if (fieldInt == null) {
            fieldInt = new ArrayList<FieldInt>();
        }
        return this.fieldInt;
    }

}
