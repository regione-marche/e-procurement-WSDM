
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateClassificaFascicoloInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateClassificaFascicoloInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="FascEntity" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject}FascicoloEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateClassificaFascicoloInput", propOrder = {
    "fascEntity"
})
public class UpdateClassificaFascicoloInput
    extends BaseInput
{

    @XmlElement(name = "FascEntity", nillable = true)
    protected FascicoloEntity fascEntity;

    /**
     * Gets the value of the fascEntity property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloEntity }
     *     
     */
    public FascicoloEntity getFascEntity() {
        return fascEntity;
    }

    /**
     * Sets the value of the fascEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloEntity }
     *     
     */
    public void setFascEntity(FascicoloEntity value) {
        this.fascEntity = value;
    }

}
