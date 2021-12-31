
package it.archiflow96.classification;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTypeIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTypeIdentifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TypeIdentifier" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}TypeIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTypeIdentifier", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", propOrder = {
    "typeIdentifier"
})
public class ArrayOfTypeIdentifier {

    @XmlElement(name = "TypeIdentifier", nillable = true)
    protected List<TypeIdentifier> typeIdentifier;

    /**
     * Gets the value of the typeIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeIdentifier }
     * 
     * 
     */
    public List<TypeIdentifier> getTypeIdentifier() {
        if (typeIdentifier == null) {
            typeIdentifier = new ArrayList<TypeIdentifier>();
        }
        return this.typeIdentifier;
    }

}
