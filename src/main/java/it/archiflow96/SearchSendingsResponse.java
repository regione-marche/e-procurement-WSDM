
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
 *         &lt;element name="SearchSendingsResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="sendingList" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject}ArrayOfSending" minOccurs="0"/>
 *         &lt;element name="HitCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "searchSendingsResult",
    "sendingList",
    "hitCount"
})
@XmlRootElement(name = "SearchSendingsResponse")
public class SearchSendingsResponse {

    @XmlElement(name = "SearchSendingsResult")
    protected ResultInfo searchSendingsResult;
    @XmlElement(nillable = true)
    protected ArrayOfSending sendingList;
    @XmlElement(name = "HitCount")
    protected Integer hitCount;

    /**
     * Gets the value of the searchSendingsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getSearchSendingsResult() {
        return searchSendingsResult;
    }

    /**
     * Sets the value of the searchSendingsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setSearchSendingsResult(ResultInfo value) {
        this.searchSendingsResult = value;
    }

    /**
     * Gets the value of the sendingList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSending }
     *     
     */
    public ArrayOfSending getSendingList() {
        return sendingList;
    }

    /**
     * Sets the value of the sendingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSending }
     *     
     */
    public void setSendingList(ArrayOfSending value) {
        this.sendingList = value;
    }

    /**
     * Gets the value of the hitCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHitCount() {
        return hitCount;
    }

    /**
     * Sets the value of the hitCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHitCount(Integer value) {
        this.hitCount = value;
    }

}
