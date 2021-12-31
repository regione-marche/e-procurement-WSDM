
package it.archiflow94;

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
 *         &lt;element name="SearchFoldersByParamResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Folder.ValueObject}SearchFoldersByParamOutput" minOccurs="0"/>
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
    "searchFoldersByParamResult"
})
@XmlRootElement(name = "SearchFoldersByParamResponse")
public class SearchFoldersByParamResponse {

    @XmlElement(name = "SearchFoldersByParamResult", nillable = true)
    protected SearchFoldersByParamOutput searchFoldersByParamResult;

    /**
     * Gets the value of the searchFoldersByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchFoldersByParamOutput }
     *     
     */
    public SearchFoldersByParamOutput getSearchFoldersByParamResult() {
        return searchFoldersByParamResult;
    }

    /**
     * Sets the value of the searchFoldersByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchFoldersByParamOutput }
     *     
     */
    public void setSearchFoldersByParamResult(SearchFoldersByParamOutput value) {
        this.searchFoldersByParamResult = value;
    }

}
