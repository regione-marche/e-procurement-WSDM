
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
 *         &lt;element name="SearchCardsResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oCardIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
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
    "searchCardsResult",
    "oCardIds"
})
@XmlRootElement(name = "SearchCardsResponse")
public class SearchCardsResponse {

    @XmlElement(name = "SearchCardsResult")
    protected ResultInfo searchCardsResult;
    @XmlElement(nillable = true)
    protected ArrayOfguid oCardIds;

    /**
     * Gets the value of the searchCardsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getSearchCardsResult() {
        return searchCardsResult;
    }

    /**
     * Sets the value of the searchCardsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setSearchCardsResult(ResultInfo value) {
        this.searchCardsResult = value;
    }

    /**
     * Gets the value of the oCardIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfguid }
     *     
     */
    public ArrayOfguid getOCardIds() {
        return oCardIds;
    }

    /**
     * Sets the value of the oCardIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfguid }
     *     
     */
    public void setOCardIds(ArrayOfguid value) {
        this.oCardIds = value;
    }

}
