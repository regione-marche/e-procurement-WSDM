
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
 *         &lt;element name="GetListItemsAdditivesResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="indexItems" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfListItem" minOccurs="0"/>
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
    "getListItemsAdditivesResult",
    "indexItems"
})
@XmlRootElement(name = "GetListItemsAdditivesResponse")
public class GetListItemsAdditivesResponse {

    @XmlElement(name = "GetListItemsAdditivesResult")
    protected ResultInfo getListItemsAdditivesResult;
    @XmlElement(nillable = true)
    protected ArrayOfListItem indexItems;

    /**
     * Gets the value of the getListItemsAdditivesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetListItemsAdditivesResult() {
        return getListItemsAdditivesResult;
    }

    /**
     * Sets the value of the getListItemsAdditivesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetListItemsAdditivesResult(ResultInfo value) {
        this.getListItemsAdditivesResult = value;
    }

    /**
     * Gets the value of the indexItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfListItem }
     *     
     */
    public ArrayOfListItem getIndexItems() {
        return indexItems;
    }

    /**
     * Sets the value of the indexItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfListItem }
     *     
     */
    public void setIndexItems(ArrayOfListItem value) {
        this.indexItems = value;
    }

}
