
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CopyTipoFascicoloInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CopyTipoFascicoloInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="TipoFascEntity" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.ValueObject}TipoFascicoloEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CopyTipoFascicoloInput", propOrder = {
    "tipoFascEntity"
})
public class CopyTipoFascicoloInput
    extends BaseInput
{

    @XmlElement(name = "TipoFascEntity", nillable = true)
    protected TipoFascicoloEntity tipoFascEntity;

    /**
     * Gets the value of the tipoFascEntity property.
     * 
     * @return
     *     possible object is
     *     {@link TipoFascicoloEntity }
     *     
     */
    public TipoFascicoloEntity getTipoFascEntity() {
        return tipoFascEntity;
    }

    /**
     * Sets the value of the tipoFascEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoFascicoloEntity }
     *     
     */
    public void setTipoFascEntity(TipoFascicoloEntity value) {
        this.tipoFascEntity = value;
    }

}
