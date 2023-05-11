
package it.infor.JProtocolloServices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}smistamento" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "smistamento"
})
@XmlRootElement(name = "smistamenti")
public class Smistamenti {

    @XmlElement(required = true)
    protected List<Smistamento> smistamento;

    /**
     * Gets the value of the smistamento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the smistamento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSmistamento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Smistamento }
     * 
     * 
     */
    public List<Smistamento> getSmistamento() {
        if (smistamento == null) {
            smistamento = new ArrayList<Smistamento>();
        }
        return this.smistamento;
    }

}
