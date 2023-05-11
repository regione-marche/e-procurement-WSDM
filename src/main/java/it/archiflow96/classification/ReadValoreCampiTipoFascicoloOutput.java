
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadValoreCampiTipoFascicoloOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadValoreCampiTipoFascicoloOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="CampiTipoFascColl" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject}ArrayOfCampiTipoFascicoloValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadValoreCampiTipoFascicoloOutput", propOrder = {
    "campiTipoFascColl"
})
public class ReadValoreCampiTipoFascicoloOutput
    extends BaseOutput
{

    @XmlElement(name = "CampiTipoFascColl", nillable = true)
    protected ArrayOfCampiTipoFascicoloValue campiTipoFascColl;

    /**
     * Gets the value of the campiTipoFascColl property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCampiTipoFascicoloValue }
     *     
     */
    public ArrayOfCampiTipoFascicoloValue getCampiTipoFascColl() {
        return campiTipoFascColl;
    }

    /**
     * Sets the value of the campiTipoFascColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCampiTipoFascicoloValue }
     *     
     */
    public void setCampiTipoFascColl(ArrayOfCampiTipoFascicoloValue value) {
        this.campiTipoFascColl = value;
    }

}
