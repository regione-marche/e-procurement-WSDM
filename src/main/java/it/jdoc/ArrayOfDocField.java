
package it.jdoc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDocField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDocField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocField" type="{http://schemas.datacontract.org/2004/07/WS_Operazioni}DocField" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDocField", namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", propOrder = {
    "docField"
})
public class ArrayOfDocField {

    @XmlElement(name = "DocField", nillable = true)
    protected List<DocField> docField;

    /**
     * Gets the value of the docField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the docField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocField }
     * 
     * 
     */
    public List<DocField> getDocField() {
        if (docField == null) {
            docField = new ArrayList<DocField>();
        }
        return this.docField;
    }

}
