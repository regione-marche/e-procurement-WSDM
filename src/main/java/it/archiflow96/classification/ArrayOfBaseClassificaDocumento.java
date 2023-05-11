
package it.archiflow96.classification;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBaseClassificaDocumento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBaseClassificaDocumento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseClassificaDocumento" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject}BaseClassificaDocumento" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBaseClassificaDocumento", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject", propOrder = {
    "baseClassificaDocumento"
})
public class ArrayOfBaseClassificaDocumento {

    @XmlElement(name = "BaseClassificaDocumento", nillable = true)
    protected List<BaseClassificaDocumento> baseClassificaDocumento;

    /**
     * Gets the value of the baseClassificaDocumento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baseClassificaDocumento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaseClassificaDocumento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaseClassificaDocumento }
     * 
     * 
     */
    public List<BaseClassificaDocumento> getBaseClassificaDocumento() {
        if (baseClassificaDocumento == null) {
            baseClassificaDocumento = new ArrayList<BaseClassificaDocumento>();
        }
        return this.baseClassificaDocumento;
    }

}
