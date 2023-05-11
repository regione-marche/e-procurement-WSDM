
package it.iride.wsprotocollodm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProtocolloGeneratoOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProtocolloGeneratoOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProtocolloGenerato" type="{http://tempuri.org/}ProtocolloGeneratoOut" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProtocolloGeneratoOut", propOrder = {
    "protocolloGenerato"
})
public class ArrayOfProtocolloGeneratoOut {

    @XmlElement(name = "ProtocolloGenerato")
    protected List<ProtocolloGeneratoOut> protocolloGenerato;

    /**
     * Gets the value of the protocolloGenerato property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the protocolloGenerato property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProtocolloGenerato().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProtocolloGeneratoOut }
     * 
     * 
     */
    public List<ProtocolloGeneratoOut> getProtocolloGenerato() {
        if (protocolloGenerato == null) {
            protocolloGenerato = new ArrayList<ProtocolloGeneratoOut>();
        }
        return this.protocolloGenerato;
    }

}
