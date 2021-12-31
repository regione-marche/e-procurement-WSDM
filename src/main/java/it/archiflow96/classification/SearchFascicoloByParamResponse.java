
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchFascicoloByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}SearchFascicoloOutput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "searchFascicoloByParamResult"
})
@XmlRootElement(name = "SearchFascicoloByParamResponse", namespace = "http://tempuri.org/")
public class SearchFascicoloByParamResponse {

    @XmlElement(name = "SearchFascicoloByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected SearchFascicoloOutput searchFascicoloByParamResult;

    /**
     * Gets the value of the searchFascicoloByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchFascicoloOutput }
     *     
     */
    public SearchFascicoloOutput getSearchFascicoloByParamResult() {
        return searchFascicoloByParamResult;
    }

    /**
     * Sets the value of the searchFascicoloByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchFascicoloOutput }
     *     
     */
    public void setSearchFascicoloByParamResult(SearchFascicoloOutput value) {
        this.searchFascicoloByParamResult = value;
    }

}
