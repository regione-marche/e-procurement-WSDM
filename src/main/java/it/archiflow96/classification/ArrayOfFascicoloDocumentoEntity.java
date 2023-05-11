
package it.archiflow96.classification;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFascicoloDocumentoEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFascicoloDocumentoEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FascicoloDocumentoEntity" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject}FascicoloDocumentoEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFascicoloDocumentoEntity", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", propOrder = {
    "fascicoloDocumentoEntity"
})
public class ArrayOfFascicoloDocumentoEntity {

    @XmlElement(name = "FascicoloDocumentoEntity", nillable = true)
    protected List<FascicoloDocumentoEntity> fascicoloDocumentoEntity;

    /**
     * Gets the value of the fascicoloDocumentoEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fascicoloDocumentoEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFascicoloDocumentoEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FascicoloDocumentoEntity }
     * 
     * 
     */
    public List<FascicoloDocumentoEntity> getFascicoloDocumentoEntity() {
        if (fascicoloDocumentoEntity == null) {
            fascicoloDocumentoEntity = new ArrayList<FascicoloDocumentoEntity>();
        }
        return this.fascicoloDocumentoEntity;
    }

}
