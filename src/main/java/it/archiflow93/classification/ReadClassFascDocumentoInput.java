
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadClassFascDocumentoInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadClassFascDocumentoInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="SearcherDoc" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.Searcher}ClassificaDocumentoSearcher" minOccurs="0"/>
 *         &lt;element name="SearcherFasc" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher}FascicoloDocumentoSearcher" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadClassFascDocumentoInput", propOrder = {
    "searcherDoc",
    "searcherFasc"
})
public class ReadClassFascDocumentoInput
    extends BaseInput
{

    @XmlElement(name = "SearcherDoc", nillable = true)
    protected ClassificaDocumentoSearcher searcherDoc;
    @XmlElement(name = "SearcherFasc", nillable = true)
    protected FascicoloDocumentoSearcher searcherFasc;

    /**
     * Gets the value of the searcherDoc property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificaDocumentoSearcher }
     *     
     */
    public ClassificaDocumentoSearcher getSearcherDoc() {
        return searcherDoc;
    }

    /**
     * Sets the value of the searcherDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificaDocumentoSearcher }
     *     
     */
    public void setSearcherDoc(ClassificaDocumentoSearcher value) {
        this.searcherDoc = value;
    }

    /**
     * Gets the value of the searcherFasc property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloDocumentoSearcher }
     *     
     */
    public FascicoloDocumentoSearcher getSearcherFasc() {
        return searcherFasc;
    }

    /**
     * Sets the value of the searcherFasc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloDocumentoSearcher }
     *     
     */
    public void setSearcherFasc(FascicoloDocumentoSearcher value) {
        this.searcherFasc = value;
    }

}
