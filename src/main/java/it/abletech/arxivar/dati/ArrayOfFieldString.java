
package it.abletech.arxivar.dati;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfField_String complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfField_String">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Field_String" type="{http://www.Abletech.it/Arxivar}Field_String" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfField_String", propOrder = {
    "fieldString"
})
public class ArrayOfFieldString {

    @XmlElement(name = "Field_String", nillable = true)
    protected List<FieldString> fieldString;

    /**
     * Gets the value of the fieldString property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldString property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldString().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldString }
     * 
     * 
     */
    public List<FieldString> getFieldString() {
        if (fieldString == null) {
            fieldString = new ArrayList<FieldString>();
        }
        return this.fieldString;
    }

}
