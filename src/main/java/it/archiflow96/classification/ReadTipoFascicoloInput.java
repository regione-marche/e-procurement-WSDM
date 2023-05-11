
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadTipoFascicoloInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadTipoFascicoloInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="TipoFascSearcher" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Searcher}TipoFascicoloSearcher" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadTipoFascicoloInput", propOrder = {
    "tipoFascSearcher"
})
public class ReadTipoFascicoloInput
    extends BaseInput
{

    @XmlElement(name = "TipoFascSearcher", nillable = true)
    protected TipoFascicoloSearcher tipoFascSearcher;

    /**
     * Gets the value of the tipoFascSearcher property.
     * 
     * @return
     *     possible object is
     *     {@link TipoFascicoloSearcher }
     *     
     */
    public TipoFascicoloSearcher getTipoFascSearcher() {
        return tipoFascSearcher;
    }

    /**
     * Sets the value of the tipoFascSearcher property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoFascicoloSearcher }
     *     
     */
    public void setTipoFascSearcher(TipoFascicoloSearcher value) {
        this.tipoFascSearcher = value;
    }

}
