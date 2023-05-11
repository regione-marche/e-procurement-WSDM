
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IsCampoTipoFascicoloUsedInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IsCampoTipoFascicoloUsedInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="CampiTipoFascId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Identifier}CampiTipoFascicoloIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IsCampoTipoFascicoloUsedInput", propOrder = {
    "campiTipoFascId"
})
public class IsCampoTipoFascicoloUsedInput
    extends BaseInput
{

    @XmlElement(name = "CampiTipoFascId", nillable = true)
    protected CampiTipoFascicoloIdentifier campiTipoFascId;

    /**
     * Gets the value of the campiTipoFascId property.
     * 
     * @return
     *     possible object is
     *     {@link CampiTipoFascicoloIdentifier }
     *     
     */
    public CampiTipoFascicoloIdentifier getCampiTipoFascId() {
        return campiTipoFascId;
    }

    /**
     * Sets the value of the campiTipoFascId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampiTipoFascicoloIdentifier }
     *     
     */
    public void setCampiTipoFascId(CampiTipoFascicoloIdentifier value) {
        this.campiTipoFascId = value;
    }

}
