
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertClassificaFascicoloInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertClassificaFascicoloInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject}FascicoloDocumentoEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertClassificaFascicoloInput", propOrder = {
    "value"
})
public class InsertClassificaFascicoloInput
    extends BaseInput
{

    @XmlElement(name = "Value", nillable = true)
    protected FascicoloDocumentoEntity value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloDocumentoEntity }
     *     
     */
    public FascicoloDocumentoEntity getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloDocumentoEntity }
     *     
     */
    public void setValue(FascicoloDocumentoEntity value) {
        this.value = value;
    }

}
