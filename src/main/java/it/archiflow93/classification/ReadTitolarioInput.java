
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadTitolarioInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadTitolarioInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="Searcher" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.Searcher}TitolarioSearcher" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadTitolarioInput", propOrder = {
    "searcher"
})
public class ReadTitolarioInput
    extends BaseInput
{

    @XmlElement(name = "Searcher", nillable = true)
    protected TitolarioSearcher searcher;

    /**
     * Gets the value of the searcher property.
     * 
     * @return
     *     possible object is
     *     {@link TitolarioSearcher }
     *     
     */
    public TitolarioSearcher getSearcher() {
        return searcher;
    }

    /**
     * Sets the value of the searcher property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitolarioSearcher }
     *     
     */
    public void setSearcher(TitolarioSearcher value) {
        this.searcher = value;
    }

}
