
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadFascicoloDocumentoInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadFascicoloDocumentoInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="Searcher" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher}FascicoloDocumentoSearcher" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadFascicoloDocumentoInput", propOrder = {
    "searcher"
})
public class ReadFascicoloDocumentoInput
    extends BaseInput
{

    @XmlElement(name = "Searcher", nillable = true)
    protected FascicoloDocumentoSearcher searcher;

    /**
     * Gets the value of the searcher property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloDocumentoSearcher }
     *     
     */
    public FascicoloDocumentoSearcher getSearcher() {
        return searcher;
    }

    /**
     * Sets the value of the searcher property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloDocumentoSearcher }
     *     
     */
    public void setSearcher(FascicoloDocumentoSearcher value) {
        this.searcher = value;
    }

}
