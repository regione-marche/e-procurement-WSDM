
package it.archiflow96;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRegistryField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRegistryField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegistryField" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Registry.ValueObject}RegistryField" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRegistryField", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Registry.ValueObject", propOrder = {
    "registryField"
})
public class ArrayOfRegistryField {

    @XmlElement(name = "RegistryField", nillable = true)
    protected List<RegistryField> registryField;

    /**
     * Gets the value of the registryField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registryField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistryField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistryField }
     * 
     * 
     */
    public List<RegistryField> getRegistryField() {
        if (registryField == null) {
            registryField = new ArrayList<RegistryField>();
        }
        return this.registryField;
    }

}
