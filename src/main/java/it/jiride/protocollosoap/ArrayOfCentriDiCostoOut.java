
package it.jiride.protocollosoap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCentriDiCostoOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCentriDiCostoOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CdC" type="{http://tempuri.org/}CentriDiCostoOut" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCentriDiCostoOut", propOrder = {
    "cdC"
})
public class ArrayOfCentriDiCostoOut {

    @XmlElement(name = "CdC")
    protected List<CentriDiCostoOut> cdC;

    /**
     * Gets the value of the cdC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cdC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCdC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CentriDiCostoOut }
     * 
     * 
     */
    public List<CentriDiCostoOut> getCdC() {
        if (cdC == null) {
            cdC = new ArrayList<CentriDiCostoOut>();
        }
        return this.cdC;
    }

}
