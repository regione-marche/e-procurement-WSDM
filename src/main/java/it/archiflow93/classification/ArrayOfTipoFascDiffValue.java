
package it.archiflow93.classification;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTipoFascDiffValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTipoFascDiffValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoFascDiffValue" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.ValueObject}TipoFascDiffValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTipoFascDiffValue", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.ValueObject", propOrder = {
    "tipoFascDiffValue"
})
public class ArrayOfTipoFascDiffValue {

    @XmlElement(name = "TipoFascDiffValue", nillable = true)
    protected List<TipoFascDiffValue> tipoFascDiffValue;

    /**
     * Gets the value of the tipoFascDiffValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tipoFascDiffValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTipoFascDiffValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoFascDiffValue }
     * 
     * 
     */
    public List<TipoFascDiffValue> getTipoFascDiffValue() {
        if (tipoFascDiffValue == null) {
            tipoFascDiffValue = new ArrayList<TipoFascDiffValue>();
        }
        return this.tipoFascDiffValue;
    }

}
