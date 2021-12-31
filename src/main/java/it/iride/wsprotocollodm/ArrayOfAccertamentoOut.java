
package it.iride.wsprotocollodm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAccertamentoOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAccertamentoOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Accertamento" type="{http://tempuri.org/}AccertamentoOut" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAccertamentoOut", propOrder = {
    "accertamento"
})
public class ArrayOfAccertamentoOut {

    @XmlElement(name = "Accertamento")
    protected List<AccertamentoOut> accertamento;

    /**
     * Gets the value of the accertamento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accertamento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccertamento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccertamentoOut }
     * 
     * 
     */
    public List<AccertamentoOut> getAccertamento() {
        if (accertamento == null) {
            accertamento = new ArrayList<AccertamentoOut>();
        }
        return this.accertamento;
    }

}
