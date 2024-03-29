
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
 *         &lt;element name="GetCardHistoryResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oHistories" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfHistory" minOccurs="0"/>
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
    "getCardHistoryResult",
    "oHistories"
})
@XmlRootElement(name = "GetCardHistoryResponse")
public class GetCardHistoryResponse {

    @XmlElement(name = "GetCardHistoryResult")
    protected ResultInfo getCardHistoryResult;
    @XmlElement(nillable = true)
    protected ArrayOfHistory oHistories;

    /**
     * Gets the value of the getCardHistoryResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetCardHistoryResult() {
        return getCardHistoryResult;
    }

    /**
     * Sets the value of the getCardHistoryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetCardHistoryResult(ResultInfo value) {
        this.getCardHistoryResult = value;
    }

    /**
     * Gets the value of the oHistories property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHistory }
     *     
     */
    public ArrayOfHistory getOHistories() {
        return oHistories;
    }

    /**
     * Sets the value of the oHistories property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHistory }
     *     
     */
    public void setOHistories(ArrayOfHistory value) {
        this.oHistories = value;
    }

}
