
package org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCampiTipoFascicoloValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCampiTipoFascicoloValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CampiTipoFascicoloValue" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject}CampiTipoFascicoloValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCampiTipoFascicoloValue", propOrder = {
    "campiTipoFascicoloValue"
})
public class ArrayOfCampiTipoFascicoloValue {

    @XmlElement(name = "CampiTipoFascicoloValue", nillable = true)
    protected List<CampiTipoFascicoloValue> campiTipoFascicoloValue;

    /**
     * Gets the value of the campiTipoFascicoloValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campiTipoFascicoloValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampiTipoFascicoloValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CampiTipoFascicoloValue }
     * 
     * 
     */
    public List<CampiTipoFascicoloValue> getCampiTipoFascicoloValue() {
        if (campiTipoFascicoloValue == null) {
            campiTipoFascicoloValue = new ArrayList<CampiTipoFascicoloValue>();
        }
        return this.campiTipoFascicoloValue;
    }

}
