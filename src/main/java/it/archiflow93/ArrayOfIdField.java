
package it.archiflow93;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfIdField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfIdField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdField" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}IdField" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfIdField", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", propOrder = {
    "idField"
})
public class ArrayOfIdField {

    @XmlElement(name = "IdField")
    protected List<IdField> idField;

    /**
     * Gets the value of the idField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdField }
     * 
     * 
     */
    public List<IdField> getIdField() {
        if (idField == null) {
            idField = new ArrayList<IdField>();
        }
        return this.idField;
    }

}
