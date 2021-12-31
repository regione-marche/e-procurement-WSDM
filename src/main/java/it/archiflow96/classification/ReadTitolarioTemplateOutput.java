
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadTitolarioTemplateOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadTitolarioTemplateOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="ReturnValue" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject}ArrayOfTitolarioTemplateEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadTitolarioTemplateOutput", propOrder = {
    "returnValue"
})
public class ReadTitolarioTemplateOutput
    extends BaseOutput
{

    @XmlElement(name = "ReturnValue", nillable = true)
    protected ArrayOfTitolarioTemplateEntity returnValue;

    /**
     * Gets the value of the returnValue property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTitolarioTemplateEntity }
     *     
     */
    public ArrayOfTitolarioTemplateEntity getReturnValue() {
        return returnValue;
    }

    /**
     * Sets the value of the returnValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTitolarioTemplateEntity }
     *     
     */
    public void setReturnValue(ArrayOfTitolarioTemplateEntity value) {
        this.returnValue = value;
    }

}
