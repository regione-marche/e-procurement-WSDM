
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateTitolarioTemplateInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateTitolarioTemplateInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject}TitolarioTemplateEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateTitolarioTemplateInput", propOrder = {
    "value"
})
public class UpdateTitolarioTemplateInput
    extends BaseInput
{

    @XmlElement(name = "Value", nillable = true)
    protected TitolarioTemplateEntity value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link TitolarioTemplateEntity }
     *     
     */
    public TitolarioTemplateEntity getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitolarioTemplateEntity }
     *     
     */
    public void setValue(TitolarioTemplateEntity value) {
        this.value = value;
    }

}
