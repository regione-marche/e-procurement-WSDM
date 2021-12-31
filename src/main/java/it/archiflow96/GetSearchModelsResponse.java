
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
 *         &lt;element name="GetSearchModelsResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="searchModelNames" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
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
    "getSearchModelsResult",
    "searchModelNames"
})
@XmlRootElement(name = "GetSearchModelsResponse")
public class GetSearchModelsResponse {

    @XmlElement(name = "GetSearchModelsResult")
    protected ResultInfo getSearchModelsResult;
    @XmlElement(nillable = true)
    protected ArrayOfstring searchModelNames;

    /**
     * Gets the value of the getSearchModelsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetSearchModelsResult() {
        return getSearchModelsResult;
    }

    /**
     * Sets the value of the getSearchModelsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetSearchModelsResult(ResultInfo value) {
        this.getSearchModelsResult = value;
    }

    /**
     * Gets the value of the searchModelNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getSearchModelNames() {
        return searchModelNames;
    }

    /**
     * Sets the value of the searchModelNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setSearchModelNames(ArrayOfstring value) {
        this.searchModelNames = value;
    }

}
