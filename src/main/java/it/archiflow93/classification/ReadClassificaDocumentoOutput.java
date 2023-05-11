
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadClassificaDocumentoOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadClassificaDocumentoOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="ReturnValue" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject}ArrayOfClassificaDocumentoEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadClassificaDocumentoOutput", propOrder = {
    "returnValue"
})
public class ReadClassificaDocumentoOutput
    extends BaseOutput
{

    @XmlElement(name = "ReturnValue", nillable = true)
    protected ArrayOfClassificaDocumentoEntity returnValue;

    /**
     * Gets the value of the returnValue property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClassificaDocumentoEntity }
     *     
     */
    public ArrayOfClassificaDocumentoEntity getReturnValue() {
        return returnValue;
    }

    /**
     * Sets the value of the returnValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClassificaDocumentoEntity }
     *     
     */
    public void setReturnValue(ArrayOfClassificaDocumentoEntity value) {
        this.returnValue = value;
    }

}
