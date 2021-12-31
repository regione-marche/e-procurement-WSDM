
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertTipoFascicoloInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertTipoFascicoloInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="BaseVis" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}BaseVisibility" minOccurs="0"/>
 *         &lt;element name="CampiTipoFascColl" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.ValueObject}ArrayOfCampiTipoFascicolo" minOccurs="0"/>
 *         &lt;element name="TipoFascDiffColl" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.ValueObject}ArrayOfTipoFascDiffValue" minOccurs="0"/>
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
@XmlType(name = "InsertTipoFascicoloInput", propOrder = {
    "baseVis",
    "campiTipoFascColl",
    "tipoFascDiffColl",
    "tipoFascEntity"
})
public class InsertTipoFascicoloInput
    extends BaseInput
{

    @XmlElement(name = "BaseVis", nillable = true)
    protected BaseVisibility baseVis;
    @XmlElement(name = "CampiTipoFascColl", nillable = true)
    protected ArrayOfCampiTipoFascicolo campiTipoFascColl;
    @XmlElement(name = "TipoFascDiffColl", nillable = true)
    protected ArrayOfTipoFascDiffValue tipoFascDiffColl;
    @XmlElement(name = "TipoFascEntity", nillable = true)
    protected TipoFascicoloEntity tipoFascEntity;

    /**
     * Gets the value of the baseVis property.
     * 
     * @return
     *     possible object is
     *     {@link BaseVisibility }
     *     
     */
    public BaseVisibility getBaseVis() {
        return baseVis;
    }

    /**
     * Sets the value of the baseVis property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseVisibility }
     *     
     */
    public void setBaseVis(BaseVisibility value) {
        this.baseVis = value;
    }

    /**
     * Gets the value of the campiTipoFascColl property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCampiTipoFascicolo }
     *     
     */
    public ArrayOfCampiTipoFascicolo getCampiTipoFascColl() {
        return campiTipoFascColl;
    }

    /**
     * Sets the value of the campiTipoFascColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCampiTipoFascicolo }
     *     
     */
    public void setCampiTipoFascColl(ArrayOfCampiTipoFascicolo value) {
        this.campiTipoFascColl = value;
    }

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
