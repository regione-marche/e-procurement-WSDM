
package it.marche.regione.paleowssec;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfrespProtocolloInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfrespProtocolloInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="respProtocolloInfo" type="{http://paleo.regione.marche.it/services/}respProtocolloInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfrespProtocolloInfo", propOrder = {
    "respProtocolloInfo"
})
public class ArrayOfrespProtocolloInfo {

    @XmlElement(nillable = true)
    protected List<RespProtocolloInfo> respProtocolloInfo;

    /**
     * Gets the value of the respProtocolloInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the respProtocolloInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRespProtocolloInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RespProtocolloInfo }
     * 
     * 
     */
    public List<RespProtocolloInfo> getRespProtocolloInfo() {
        if (respProtocolloInfo == null) {
            respProtocolloInfo = new ArrayList<RespProtocolloInfo>();
        }
        return this.respProtocolloInfo;
    }

}
