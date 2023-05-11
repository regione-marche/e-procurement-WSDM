
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
 *         &lt;element name="SearchTitolarioItemsIdByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}SearchTitolarioItemsIdOutput" minOccurs="0"/>
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
    "searchTitolarioItemsIdByParamResult"
})
@XmlRootElement(name = "SearchTitolarioItemsIdByParamResponse", namespace = "http://tempuri.org/")
public class SearchTitolarioItemsIdByParamResponse {

    @XmlElement(name = "SearchTitolarioItemsIdByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected SearchTitolarioItemsIdOutput searchTitolarioItemsIdByParamResult;

    /**
     * Gets the value of the searchTitolarioItemsIdByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchTitolarioItemsIdOutput }
     *     
     */
    public SearchTitolarioItemsIdOutput getSearchTitolarioItemsIdByParamResult() {
        return searchTitolarioItemsIdByParamResult;
    }

    /**
     * Sets the value of the searchTitolarioItemsIdByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchTitolarioItemsIdOutput }
     *     
     */
    public void setSearchTitolarioItemsIdByParamResult(SearchTitolarioItemsIdOutput value) {
        this.searchTitolarioItemsIdByParamResult = value;
    }

}
