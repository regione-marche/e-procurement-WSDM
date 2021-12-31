
package it.archiflow93.classification;

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
 *         &lt;element name="SearchBaseFascicoloByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}SearchBaseFascicoloOutput" minOccurs="0"/>
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
    "searchBaseFascicoloByParamResult"
})
@XmlRootElement(name = "SearchBaseFascicoloByParamResponse", namespace = "http://tempuri.org/")
public class SearchBaseFascicoloByParamResponse {

    @XmlElement(name = "SearchBaseFascicoloByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected SearchBaseFascicoloOutput searchBaseFascicoloByParamResult;

    /**
     * Gets the value of the searchBaseFascicoloByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBaseFascicoloOutput }
     *     
     */
    public SearchBaseFascicoloOutput getSearchBaseFascicoloByParamResult() {
        return searchBaseFascicoloByParamResult;
    }

    /**
     * Sets the value of the searchBaseFascicoloByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBaseFascicoloOutput }
     *     
     */
    public void setSearchBaseFascicoloByParamResult(SearchBaseFascicoloOutput value) {
        this.searchBaseFascicoloByParamResult = value;
    }

}
