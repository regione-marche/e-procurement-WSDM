
package it.archiflow93.classification;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTitolarioItemEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTitolarioItemEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TitolarioItemEntity" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TitolarioItem.ValueObject}TitolarioItemEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTitolarioItemEntity", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TitolarioItem.ValueObject", propOrder = {
    "titolarioItemEntity"
})
public class ArrayOfTitolarioItemEntity {

    @XmlElement(name = "TitolarioItemEntity", nillable = true)
    protected List<TitolarioItemEntity> titolarioItemEntity;

    /**
     * Gets the value of the titolarioItemEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titolarioItemEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitolarioItemEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TitolarioItemEntity }
     * 
     * 
     */
    public List<TitolarioItemEntity> getTitolarioItemEntity() {
        if (titolarioItemEntity == null) {
            titolarioItemEntity = new ArrayList<TitolarioItemEntity>();
        }
        return this.titolarioItemEntity;
    }

}
