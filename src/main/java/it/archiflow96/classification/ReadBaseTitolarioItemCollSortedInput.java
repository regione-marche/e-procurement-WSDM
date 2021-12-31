
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadBaseTitolarioItemCollSortedInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadBaseTitolarioItemCollSortedInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="Searcher" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TitolarioItem.Searcher}TitolarioItemSearcher" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadBaseTitolarioItemCollSortedInput", propOrder = {
    "searcher"
})
public class ReadBaseTitolarioItemCollSortedInput
    extends BaseInput
{

    @XmlElement(name = "Searcher", nillable = true)
    protected TitolarioItemSearcher searcher;

    /**
     * Gets the value of the searcher property.
     * 
     * @return
     *     possible object is
     *     {@link TitolarioItemSearcher }
     *     
     */
    public TitolarioItemSearcher getSearcher() {
        return searcher;
    }

    /**
     * Sets the value of the searcher property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitolarioItemSearcher }
     *     
     */
    public void setSearcher(TitolarioItemSearcher value) {
        this.searcher = value;
    }

}
