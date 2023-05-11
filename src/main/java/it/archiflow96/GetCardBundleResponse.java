
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
 *         &lt;element name="GetCardBundleResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oCardBundle" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}CardBundle" minOccurs="0"/>
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
    "getCardBundleResult",
    "oCardBundle"
})
@XmlRootElement(name = "GetCardBundleResponse")
public class GetCardBundleResponse {

    @XmlElement(name = "GetCardBundleResult")
    protected ResultInfo getCardBundleResult;
    @XmlElement(nillable = true)
    protected CardBundle oCardBundle;

    /**
     * Gets the value of the getCardBundleResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetCardBundleResult() {
        return getCardBundleResult;
    }

    /**
     * Sets the value of the getCardBundleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetCardBundleResult(ResultInfo value) {
        this.getCardBundleResult = value;
    }

    /**
     * Gets the value of the oCardBundle property.
     * 
     * @return
     *     possible object is
     *     {@link CardBundle }
     *     
     */
    public CardBundle getOCardBundle() {
        return oCardBundle;
    }

    /**
     * Sets the value of the oCardBundle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardBundle }
     *     
     */
    public void setOCardBundle(CardBundle value) {
        this.oCardBundle = value;
    }

}
