
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadTipoFascicoloOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadTipoFascicoloOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="TipoFascColl" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.ValueObject}ArrayOfTipoFascicoloEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadTipoFascicoloOutput", propOrder = {
    "tipoFascColl"
})
public class ReadTipoFascicoloOutput
    extends BaseOutput
{

    @XmlElement(name = "TipoFascColl", nillable = true)
    protected ArrayOfTipoFascicoloEntity tipoFascColl;

    /**
     * Gets the value of the tipoFascColl property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTipoFascicoloEntity }
     *     
     */
    public ArrayOfTipoFascicoloEntity getTipoFascColl() {
        return tipoFascColl;
    }

    /**
     * Sets the value of the tipoFascColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTipoFascicoloEntity }
     *     
     */
    public void setTipoFascColl(ArrayOfTipoFascicoloEntity value) {
        this.tipoFascColl = value;
    }

}
