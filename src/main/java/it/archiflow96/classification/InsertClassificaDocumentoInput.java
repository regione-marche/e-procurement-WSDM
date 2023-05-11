
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertClassificaDocumentoInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertClassificaDocumentoInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject}ClassificaDocumentoEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertClassificaDocumentoInput", propOrder = {
    "value"
})
public class InsertClassificaDocumentoInput
    extends BaseInput
{

    @XmlElement(name = "Value", nillable = true)
    protected ClassificaDocumentoEntity value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificaDocumentoEntity }
     *     
     */
    public ClassificaDocumentoEntity getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificaDocumentoEntity }
     *     
     */
    public void setValue(ClassificaDocumentoEntity value) {
        this.value = value;
    }

}
