
package it.archiflow96;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfArchiflowDomain complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfArchiflowDomain">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArchiflowDomain" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Login.ValueObject}ArchiflowDomain" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfArchiflowDomain", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Login.ValueObject", propOrder = {
    "archiflowDomain"
})
public class ArrayOfArchiflowDomain {

    @XmlElement(name = "ArchiflowDomain", nillable = true)
    protected List<ArchiflowDomain> archiflowDomain;

    /**
     * Gets the value of the archiflowDomain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the archiflowDomain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArchiflowDomain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArchiflowDomain }
     * 
     * 
     */
    public List<ArchiflowDomain> getArchiflowDomain() {
        if (archiflowDomain == null) {
            archiflowDomain = new ArrayList<ArchiflowDomain>();
        }
        return this.archiflowDomain;
    }

}
