
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateCampiTipoFascicoloOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateCampiTipoFascicoloOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="CampTipoFascColl" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.ValueObject}ArrayOfCampiTipoFascicolo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateCampiTipoFascicoloOutput", propOrder = {
    "campTipoFascColl"
})
public class UpdateCampiTipoFascicoloOutput
    extends BaseOutput
{

    @XmlElement(name = "CampTipoFascColl", nillable = true)
    protected ArrayOfCampiTipoFascicolo campTipoFascColl;

    /**
     * Gets the value of the campTipoFascColl property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCampiTipoFascicolo }
     *     
     */
    public ArrayOfCampiTipoFascicolo getCampTipoFascColl() {
        return campTipoFascColl;
    }

    /**
     * Sets the value of the campTipoFascColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCampiTipoFascicolo }
     *     
     */
    public void setCampTipoFascColl(ArrayOfCampiTipoFascicolo value) {
        this.campTipoFascColl = value;
    }

}
