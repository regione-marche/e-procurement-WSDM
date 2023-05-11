
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoFascDiffSearcher complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoFascDiffSearcher">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}BaseSearcher">
 *       &lt;sequence>
 *         &lt;element name="TipoFascId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Identifier}TipoFascicoloIdentifier" minOccurs="0"/>
 *         &lt;element name="TitItemId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TitolarioItem.Identifier}TitolarioItemIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoFascDiffSearcher", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Searcher", propOrder = {
    "tipoFascId",
    "titItemId"
})
public class TipoFascDiffSearcher
    extends BaseSearcher
{

    @XmlElement(name = "TipoFascId", nillable = true)
    protected TipoFascicoloIdentifier tipoFascId;
    @XmlElement(name = "TitItemId", nillable = true)
    protected TitolarioItemIdentifier titItemId;

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

    /**
     * Gets the value of the titItemId property.
     * 
     * @return
     *     possible object is
     *     {@link TitolarioItemIdentifier }
     *     
     */
    public TitolarioItemIdentifier getTitItemId() {
        return titItemId;
    }

    /**
     * Sets the value of the titItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitolarioItemIdentifier }
     *     
     */
    public void setTitItemId(TitolarioItemIdentifier value) {
        this.titItemId = value;
    }

}
