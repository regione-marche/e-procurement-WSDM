
package it.archiflow93;

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
 *         &lt;element name="GetListItemsResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oIndexItems" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfListItem" minOccurs="0"/>
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
    "getListItemsResult",
    "oIndexItems"
})
@XmlRootElement(name = "GetListItemsResponse")
public class GetListItemsResponse {

    @XmlElement(name = "GetListItemsResult")
    protected ResultInfo getListItemsResult;
    @XmlElement(nillable = true)
    protected ArrayOfListItem oIndexItems;

    /**
     * Gets the value of the getListItemsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetListItemsResult() {
        return getListItemsResult;
    }

    /**
     * Sets the value of the getListItemsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetListItemsResult(ResultInfo value) {
        this.getListItemsResult = value;
    }

    /**
     * Gets the value of the oIndexItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfListItem }
     *     
     */
    public ArrayOfListItem getOIndexItems() {
        return oIndexItems;
    }

    /**
     * Sets the value of the oIndexItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfListItem }
     *     
     */
    public void setOIndexItems(ArrayOfListItem value) {
        this.oIndexItems = value;
    }

}
