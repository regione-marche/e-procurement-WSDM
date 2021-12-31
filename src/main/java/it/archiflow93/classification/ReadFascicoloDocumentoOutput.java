
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadFascicoloDocumentoOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadFascicoloDocumentoOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="ReturnValue" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject}ArrayOfFascicoloDocumentoEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadFascicoloDocumentoOutput", propOrder = {
    "returnValue"
})
public class ReadFascicoloDocumentoOutput
    extends BaseOutput
{

    @XmlElement(name = "ReturnValue", nillable = true)
    protected ArrayOfFascicoloDocumentoEntity returnValue;

    /**
     * Gets the value of the returnValue property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFascicoloDocumentoEntity }
     *     
     */
    public ArrayOfFascicoloDocumentoEntity getReturnValue() {
        return returnValue;
    }

    /**
     * Sets the value of the returnValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFascicoloDocumentoEntity }
     *     
     */
    public void setReturnValue(ArrayOfFascicoloDocumentoEntity value) {
        this.returnValue = value;
    }

}
