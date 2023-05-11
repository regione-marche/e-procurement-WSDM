
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
 *         &lt;element name="SearchFoldersResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oFolders" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Folder.ValueObject}ArrayOfFolder" minOccurs="0"/>
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
    "searchFoldersResult",
    "oFolders"
})
@XmlRootElement(name = "SearchFoldersResponse")
public class SearchFoldersResponse {

    @XmlElement(name = "SearchFoldersResult")
    protected ResultInfo searchFoldersResult;
    @XmlElement(nillable = true)
    protected ArrayOfFolder oFolders;

    /**
     * Gets the value of the searchFoldersResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getSearchFoldersResult() {
        return searchFoldersResult;
    }

    /**
     * Sets the value of the searchFoldersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setSearchFoldersResult(ResultInfo value) {
        this.searchFoldersResult = value;
    }

    /**
     * Gets the value of the oFolders property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFolder }
     *     
     */
    public ArrayOfFolder getOFolders() {
        return oFolders;
    }

    /**
     * Sets the value of the oFolders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFolder }
     *     
     */
    public void setOFolders(ArrayOfFolder value) {
        this.oFolders = value;
    }

}
