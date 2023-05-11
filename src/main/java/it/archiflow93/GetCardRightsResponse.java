
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
 *         &lt;element name="GetCardRightsResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oCardRights" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfCardRight" minOccurs="0"/>
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
    "getCardRightsResult",
    "oCardRights"
})
@XmlRootElement(name = "GetCardRightsResponse")
public class GetCardRightsResponse {

    @XmlElement(name = "GetCardRightsResult")
    protected ResultInfo getCardRightsResult;
    @XmlElement(nillable = true)
    protected ArrayOfCardRight oCardRights;

    /**
     * Gets the value of the getCardRightsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetCardRightsResult() {
        return getCardRightsResult;
    }

    /**
     * Sets the value of the getCardRightsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetCardRightsResult(ResultInfo value) {
        this.getCardRightsResult = value;
    }

    /**
     * Gets the value of the oCardRights property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCardRight }
     *     
     */
    public ArrayOfCardRight getOCardRights() {
        return oCardRights;
    }

    /**
     * Sets the value of the oCardRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCardRight }
     *     
     */
    public void setOCardRights(ArrayOfCardRight value) {
        this.oCardRights = value;
    }

}
