
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadCampiTipoFascicoloInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadCampiTipoFascicoloInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="CampiTipoFascSearcher" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Searcher}CampiTipoFascicoloSearcher" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadCampiTipoFascicoloInput", propOrder = {
    "campiTipoFascSearcher"
})
public class ReadCampiTipoFascicoloInput
    extends BaseInput
{

    @XmlElement(name = "CampiTipoFascSearcher", nillable = true)
    protected CampiTipoFascicoloSearcher campiTipoFascSearcher;

    /**
     * Gets the value of the campiTipoFascSearcher property.
     * 
     * @return
     *     possible object is
     *     {@link CampiTipoFascicoloSearcher }
     *     
     */
    public CampiTipoFascicoloSearcher getCampiTipoFascSearcher() {
        return campiTipoFascSearcher;
    }

    /**
     * Sets the value of the campiTipoFascSearcher property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampiTipoFascicoloSearcher }
     *     
     */
    public void setCampiTipoFascSearcher(CampiTipoFascicoloSearcher value) {
        this.campiTipoFascSearcher = value;
    }

}
