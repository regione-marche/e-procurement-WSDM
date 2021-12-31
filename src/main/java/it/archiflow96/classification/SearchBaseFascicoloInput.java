
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchBaseFascicoloInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchBaseFascicoloInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="FascSearcher" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher}FascicoloSearcher" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchBaseFascicoloInput", propOrder = {
    "fascSearcher"
})
public class SearchBaseFascicoloInput
    extends BaseInput
{

    @XmlElement(name = "FascSearcher", nillable = true)
    protected FascicoloSearcher fascSearcher;

    /**
     * Gets the value of the fascSearcher property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloSearcher }
     *     
     */
    public FascicoloSearcher getFascSearcher() {
        return fascSearcher;
    }

    /**
     * Sets the value of the fascSearcher property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloSearcher }
     *     
     */
    public void setFascSearcher(FascicoloSearcher value) {
        this.fascSearcher = value;
    }

}
