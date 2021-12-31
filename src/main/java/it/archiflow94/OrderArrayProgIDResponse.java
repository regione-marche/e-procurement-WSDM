
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
 *         &lt;element name="OrderArrayProgIDResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oOrderedCardIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
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
    "orderArrayProgIDResult",
    "oOrderedCardIds"
})
@XmlRootElement(name = "OrderArrayProgIDResponse")
public class OrderArrayProgIDResponse {

    @XmlElement(name = "OrderArrayProgIDResult")
    protected ResultInfo orderArrayProgIDResult;
    @XmlElement(nillable = true)
    protected ArrayOfguid oOrderedCardIds;

    /**
     * Gets the value of the orderArrayProgIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getOrderArrayProgIDResult() {
        return orderArrayProgIDResult;
    }

    /**
     * Sets the value of the orderArrayProgIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setOrderArrayProgIDResult(ResultInfo value) {
        this.orderArrayProgIDResult = value;
    }

    /**
     * Gets the value of the oOrderedCardIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfguid }
     *     
     */
    public ArrayOfguid getOOrderedCardIds() {
        return oOrderedCardIds;
    }

    /**
     * Sets the value of the oOrderedCardIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfguid }
     *     
     */
    public void setOOrderedCardIds(ArrayOfguid value) {
        this.oOrderedCardIds = value;
    }

}
