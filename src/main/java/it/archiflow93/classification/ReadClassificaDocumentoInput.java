
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadClassificaDocumentoInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadClassificaDocumentoInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="Searcher" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.Searcher}ClassificaDocumentoSearcher" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadClassificaDocumentoInput", propOrder = {
    "searcher"
})
public class ReadClassificaDocumentoInput
    extends BaseInput
{

    @XmlElement(name = "Searcher", nillable = true)
    protected ClassificaDocumentoSearcher searcher;

    /**
     * Gets the value of the searcher property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificaDocumentoSearcher }
     *     
     */
    public ClassificaDocumentoSearcher getSearcher() {
        return searcher;
    }

    /**
     * Sets the value of the searcher property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificaDocumentoSearcher }
     *     
     */
    public void setSearcher(ClassificaDocumentoSearcher value) {
        this.searcher = value;
    }

}
