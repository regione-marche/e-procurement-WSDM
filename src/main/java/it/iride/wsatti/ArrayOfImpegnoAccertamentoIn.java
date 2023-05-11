
package it.iride.wsatti;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfImpegnoAccertamentoIn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfImpegnoAccertamentoIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ImpegnoAccertamento" type="{http://tempuri.org/}ImpegnoAccertamentoIn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfImpegnoAccertamentoIn", propOrder = {
    "impegnoAccertamento"
})
public class ArrayOfImpegnoAccertamentoIn {

    @XmlElement(name = "ImpegnoAccertamento")
    protected List<ImpegnoAccertamentoIn> impegnoAccertamento;

    /**
     * Gets the value of the impegnoAccertamento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the impegnoAccertamento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImpegnoAccertamento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImpegnoAccertamentoIn }
     * 
     * 
     */
    public List<ImpegnoAccertamentoIn> getImpegnoAccertamento() {
        if (impegnoAccertamento == null) {
            impegnoAccertamento = new ArrayList<ImpegnoAccertamentoIn>();
        }
        return this.impegnoAccertamento;
    }

}
