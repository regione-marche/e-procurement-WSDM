
package it.marche.regione.paleowssec;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfrespDocProtocolliInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfrespDocProtocolliInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="respDocProtocolliInfo" type="{http://paleo.regione.marche.it/services/}respDocProtocolliInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfrespDocProtocolliInfo", propOrder = {
    "respDocProtocolliInfo"
})
public class ArrayOfrespDocProtocolliInfo {

    @XmlElement(nillable = true)
    protected List<RespDocProtocolliInfo> respDocProtocolliInfo;

    /**
     * Gets the value of the respDocProtocolliInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the respDocProtocolliInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRespDocProtocolliInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RespDocProtocolliInfo }
     * 
     * 
     */
    public List<RespDocProtocolliInfo> getRespDocProtocolliInfo() {
        if (respDocProtocolliInfo == null) {
            respDocProtocolliInfo = new ArrayList<RespDocProtocolliInfo>();
        }
        return this.respDocProtocolliInfo;
    }

}
