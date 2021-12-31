
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertCampiTipoFascicoloOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertCampiTipoFascicoloOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="CampiTipoFascCollOut" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.ValueObject}ArrayOfCampiTipoFascicolo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertCampiTipoFascicoloOutput", propOrder = {
    "campiTipoFascCollOut"
})
public class InsertCampiTipoFascicoloOutput
    extends BaseOutput
{

    @XmlElement(name = "CampiTipoFascCollOut", nillable = true)
    protected ArrayOfCampiTipoFascicolo campiTipoFascCollOut;

    /**
     * Gets the value of the campiTipoFascCollOut property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCampiTipoFascicolo }
     *     
     */
    public ArrayOfCampiTipoFascicolo getCampiTipoFascCollOut() {
        return campiTipoFascCollOut;
    }

    /**
     * Sets the value of the campiTipoFascCollOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCampiTipoFascicolo }
     *     
     */
    public void setCampiTipoFascCollOut(ArrayOfCampiTipoFascicolo value) {
        this.campiTipoFascCollOut = value;
    }

}
