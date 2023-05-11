
package it.marche.regione.paleo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOperatorePaleo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOperatorePaleo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OperatorePaleo" type="{http://paleo.regione.marche.it/services/}OperatorePaleo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOperatorePaleo", propOrder = {
    "operatorePaleo"
})
public class ArrayOfOperatorePaleo {

    @XmlElement(name = "OperatorePaleo", nillable = true)
    protected List<OperatorePaleo> operatorePaleo;

    /**
     * Gets the value of the operatorePaleo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operatorePaleo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatorePaleo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperatorePaleo }
     * 
     * 
     */
    public List<OperatorePaleo> getOperatorePaleo() {
        if (operatorePaleo == null) {
            operatorePaleo = new ArrayList<OperatorePaleo>();
        }
        return this.operatorePaleo;
    }

}
