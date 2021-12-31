
package it.archiflow96.classification;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTipoFascicoloEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTipoFascicoloEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoFascicoloEntity" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.ValueObject}TipoFascicoloEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTipoFascicoloEntity", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.ValueObject", propOrder = {
    "tipoFascicoloEntity"
})
public class ArrayOfTipoFascicoloEntity {

    @XmlElement(name = "TipoFascicoloEntity", nillable = true)
    protected List<TipoFascicoloEntity> tipoFascicoloEntity;

    /**
     * Gets the value of the tipoFascicoloEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tipoFascicoloEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTipoFascicoloEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoFascicoloEntity }
     * 
     * 
     */
    public List<TipoFascicoloEntity> getTipoFascicoloEntity() {
        if (tipoFascicoloEntity == null) {
            tipoFascicoloEntity = new ArrayList<TipoFascicoloEntity>();
        }
        return this.tipoFascicoloEntity;
    }

}
