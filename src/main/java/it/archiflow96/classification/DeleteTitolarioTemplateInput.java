
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteTitolarioTemplateInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteTitolarioTemplateInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="Pk" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.Identifier}TitolarioTemplateIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteTitolarioTemplateInput", propOrder = {
    "pk"
})
public class DeleteTitolarioTemplateInput
    extends BaseInput
{

    @XmlElement(name = "Pk", nillable = true)
    protected TitolarioTemplateIdentifier pk;

    /**
     * Gets the value of the pk property.
     * 
     * @return
     *     possible object is
     *     {@link TitolarioTemplateIdentifier }
     *     
     */
    public TitolarioTemplateIdentifier getPk() {
        return pk;
    }

    /**
     * Sets the value of the pk property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitolarioTemplateIdentifier }
     *     
     */
    public void setPk(TitolarioTemplateIdentifier value) {
        this.pk = value;
    }

}
