
package it.jiride.protocollosoap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfImpegnoOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfImpegnoOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Impegno" type="{http://tempuri.org/}ImpegnoOut" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfImpegnoOut", propOrder = {
    "impegno"
})
public class ArrayOfImpegnoOut {

    @XmlElement(name = "Impegno")
    protected List<ImpegnoOut> impegno;

    /**
     * Gets the value of the impegno property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the impegno property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImpegno().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImpegnoOut }
     * 
     * 
     */
    public List<ImpegnoOut> getImpegno() {
        if (impegno == null) {
            impegno = new ArrayList<ImpegnoOut>();
        }
        return this.impegno;
    }

}
