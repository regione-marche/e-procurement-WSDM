
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertDifformitaOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertDifformitaOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="TipoFasDiffColl" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.ValueObject}ArrayOfTipoFascDiffValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertDifformitaOutput", propOrder = {
    "tipoFasDiffColl"
})
public class InsertDifformitaOutput
    extends BaseOutput
{

    @XmlElement(name = "TipoFasDiffColl", nillable = true)
    protected ArrayOfTipoFascDiffValue tipoFasDiffColl;

    /**
     * Gets the value of the tipoFasDiffColl property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTipoFascDiffValue }
     *     
     */
    public ArrayOfTipoFascDiffValue getTipoFasDiffColl() {
        return tipoFasDiffColl;
    }

    /**
     * Sets the value of the tipoFasDiffColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTipoFascDiffValue }
     *     
     */
    public void setTipoFasDiffColl(ArrayOfTipoFascDiffValue value) {
        this.tipoFasDiffColl = value;
    }

}
