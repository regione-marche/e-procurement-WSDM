
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
 *         &lt;element name="SearchTitolarioItemsClassifyByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}SearchTitolarioItemsClassifyOutput" minOccurs="0"/>
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
    "searchTitolarioItemsClassifyByParamResult"
})
@XmlRootElement(name = "SearchTitolarioItemsClassifyByParamResponse", namespace = "http://tempuri.org/")
public class SearchTitolarioItemsClassifyByParamResponse {

    @XmlElement(name = "SearchTitolarioItemsClassifyByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected SearchTitolarioItemsClassifyOutput searchTitolarioItemsClassifyByParamResult;

    /**
     * Gets the value of the searchTitolarioItemsClassifyByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchTitolarioItemsClassifyOutput }
     *     
     */
    public SearchTitolarioItemsClassifyOutput getSearchTitolarioItemsClassifyByParamResult() {
        return searchTitolarioItemsClassifyByParamResult;
    }

    /**
     * Sets the value of the searchTitolarioItemsClassifyByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchTitolarioItemsClassifyOutput }
     *     
     */
    public void setSearchTitolarioItemsClassifyByParamResult(SearchTitolarioItemsClassifyOutput value) {
        this.searchTitolarioItemsClassifyByParamResult = value;
    }

}
