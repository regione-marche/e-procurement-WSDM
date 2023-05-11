
package it.archiflow96.classification;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTitolarioTemplateEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTitolarioTemplateEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TitolarioTemplateEntity" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject}TitolarioTemplateEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTitolarioTemplateEntity", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject", propOrder = {
    "titolarioTemplateEntity"
})
public class ArrayOfTitolarioTemplateEntity {

    @XmlElement(name = "TitolarioTemplateEntity", nillable = true)
    protected List<TitolarioTemplateEntity> titolarioTemplateEntity;

    /**
     * Gets the value of the titolarioTemplateEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titolarioTemplateEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitolarioTemplateEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TitolarioTemplateEntity }
     * 
     * 
     */
    public List<TitolarioTemplateEntity> getTitolarioTemplateEntity() {
        if (titolarioTemplateEntity == null) {
            titolarioTemplateEntity = new ArrayList<TitolarioTemplateEntity>();
        }
        return this.titolarioTemplateEntity;
    }

}
