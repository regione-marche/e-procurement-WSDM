
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
 *         &lt;element name="SearchCardsGroupingResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oCardIdsExt" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfArchiveTypedocCardId" minOccurs="0"/>
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
    "searchCardsGroupingResult",
    "oCardIdsExt"
})
@XmlRootElement(name = "SearchCardsGroupingResponse")
public class SearchCardsGroupingResponse {

    @XmlElement(name = "SearchCardsGroupingResult")
    protected ResultInfo searchCardsGroupingResult;
    @XmlElement(nillable = true)
    protected ArrayOfArchiveTypedocCardId oCardIdsExt;

    /**
     * Gets the value of the searchCardsGroupingResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getSearchCardsGroupingResult() {
        return searchCardsGroupingResult;
    }

    /**
     * Sets the value of the searchCardsGroupingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setSearchCardsGroupingResult(ResultInfo value) {
        this.searchCardsGroupingResult = value;
    }

    /**
     * Gets the value of the oCardIdsExt property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArchiveTypedocCardId }
     *     
     */
    public ArrayOfArchiveTypedocCardId getOCardIdsExt() {
        return oCardIdsExt;
    }

    /**
     * Sets the value of the oCardIdsExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArchiveTypedocCardId }
     *     
     */
    public void setOCardIdsExt(ArrayOfArchiveTypedocCardId value) {
        this.oCardIdsExt = value;
    }

}
