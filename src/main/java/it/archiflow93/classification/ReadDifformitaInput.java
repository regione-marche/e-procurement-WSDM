
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadDifformitaInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadDifformitaInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="TipoFascDiffSearcher" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Searcher}TipoFascDiffSearcher" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadDifformitaInput", propOrder = {
    "tipoFascDiffSearcher"
})
public class ReadDifformitaInput
    extends BaseInput
{

    @XmlElement(name = "TipoFascDiffSearcher", nillable = true)
    protected TipoFascDiffSearcher tipoFascDiffSearcher;

    /**
     * Gets the value of the tipoFascDiffSearcher property.
     * 
     * @return
     *     possible object is
     *     {@link TipoFascDiffSearcher }
     *     
     */
    public TipoFascDiffSearcher getTipoFascDiffSearcher() {
        return tipoFascDiffSearcher;
    }

    /**
     * Sets the value of the tipoFascDiffSearcher property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoFascDiffSearcher }
     *     
     */
    public void setTipoFascDiffSearcher(TipoFascDiffSearcher value) {
        this.tipoFascDiffSearcher = value;
    }

}
