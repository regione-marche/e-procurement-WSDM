
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertCampiTipoFascicoloInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertCampiTipoFascicoloInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="CampiTipoFascColl" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.ValueObject}ArrayOfCampiTipoFascicolo" minOccurs="0"/>
 *         &lt;element name="TipoFascId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Identifier}TipoFascicoloIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertCampiTipoFascicoloInput", propOrder = {
    "campiTipoFascColl",
    "tipoFascId"
})
public class InsertCampiTipoFascicoloInput
    extends BaseInput
{

    @XmlElement(name = "CampiTipoFascColl", nillable = true)
    protected ArrayOfCampiTipoFascicolo campiTipoFascColl;
    @XmlElement(name = "TipoFascId", nillable = true)
    protected TipoFascicoloIdentifier tipoFascId;

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
     * Gets the value of the tipoFascId property.
     * 
     * @return
     *     possible object is
     *     {@link TipoFascicoloIdentifier }
     *     
     */
    public TipoFascicoloIdentifier getTipoFascId() {
        return tipoFascId;
    }

    /**
     * Sets the value of the tipoFascId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoFascicoloIdentifier }
     *     
     */
    public void setTipoFascId(TipoFascicoloIdentifier value) {
        this.tipoFascId = value;
    }

}
