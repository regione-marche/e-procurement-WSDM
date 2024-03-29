
package it.iride.wsprotocollodm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCampoUtente complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCampoUtente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Campo" type="{http://tempuri.org/}CampoUtente" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCampoUtente", propOrder = {
    "campo"
})
public class ArrayOfCampoUtente {

    @XmlElement(name = "Campo")
    protected List<CampoUtente> campo;

    /**
     * Gets the value of the campo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CampoUtente }
     * 
     * 
     */
    public List<CampoUtente> getCampo() {
        if (campo == null) {
            campo = new ArrayList<CampoUtente>();
        }
        return this.campo;
    }

}
