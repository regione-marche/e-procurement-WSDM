
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadDifformitaOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadDifformitaOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="TipoFascDiffColl" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.ValueObject}ArrayOfTipoFascDiffValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadDifformitaOutput", propOrder = {
    "tipoFascDiffColl"
})
public class ReadDifformitaOutput
    extends BaseOutput
{

    @XmlElement(name = "TipoFascDiffColl", nillable = true)
    protected ArrayOfTipoFascDiffValue tipoFascDiffColl;

    /**
     * Gets the value of the tipoFascDiffColl property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTipoFascDiffValue }
     *     
     */
    public ArrayOfTipoFascDiffValue getTipoFascDiffColl() {
        return tipoFascDiffColl;
    }

    /**
     * Sets the value of the tipoFascDiffColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTipoFascDiffValue }
     *     
     */
    public void setTipoFascDiffColl(ArrayOfTipoFascDiffValue value) {
        this.tipoFascDiffColl = value;
    }

}
