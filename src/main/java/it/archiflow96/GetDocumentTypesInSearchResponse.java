
package it.archiflow96;

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
 *         &lt;element name="GetDocumentTypesInSearchResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="searchResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}SearchResult" minOccurs="0"/>
 *         &lt;element name="docTypeIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
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
    "getDocumentTypesInSearchResult",
    "searchResult",
    "docTypeIds"
})
@XmlRootElement(name = "GetDocumentTypesInSearchResponse")
public class GetDocumentTypesInSearchResponse {

    @XmlElement(name = "GetDocumentTypesInSearchResult")
    protected ResultInfo getDocumentTypesInSearchResult;
    protected SearchResult searchResult;
    @XmlElement(nillable = true)
    protected ArrayOfint docTypeIds;

    /**
     * Gets the value of the getDocumentTypesInSearchResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetDocumentTypesInSearchResult() {
        return getDocumentTypesInSearchResult;
    }

    /**
     * Sets the value of the getDocumentTypesInSearchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetDocumentTypesInSearchResult(ResultInfo value) {
        this.getDocumentTypesInSearchResult = value;
    }

    /**
     * Gets the value of the searchResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchResult }
     *     
     */
    public SearchResult getSearchResult() {
        return searchResult;
    }

    /**
     * Sets the value of the searchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResult }
     *     
     */
    public void setSearchResult(SearchResult value) {
        this.searchResult = value;
    }

    /**
     * Gets the value of the docTypeIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getDocTypeIds() {
        return docTypeIds;
    }

    /**
     * Sets the value of the docTypeIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setDocTypeIds(ArrayOfint value) {
        this.docTypeIds = value;
    }

}
