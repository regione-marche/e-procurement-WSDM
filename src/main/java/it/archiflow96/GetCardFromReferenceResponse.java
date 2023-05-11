
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
 *         &lt;element name="GetCardFromReferenceResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oCard" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}Card" minOccurs="0"/>
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
    "getCardFromReferenceResult",
    "oCard"
})
@XmlRootElement(name = "GetCardFromReferenceResponse")
public class GetCardFromReferenceResponse {

    @XmlElement(name = "GetCardFromReferenceResult")
    protected ResultInfo getCardFromReferenceResult;
    @XmlElement(nillable = true)
    protected Card oCard;

    /**
     * Gets the value of the getCardFromReferenceResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetCardFromReferenceResult() {
        return getCardFromReferenceResult;
    }

    /**
     * Sets the value of the getCardFromReferenceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetCardFromReferenceResult(ResultInfo value) {
        this.getCardFromReferenceResult = value;
    }

    /**
     * Gets the value of the oCard property.
     * 
     * @return
     *     possible object is
     *     {@link Card }
     *     
     */
    public Card getOCard() {
        return oCard;
    }

    /**
     * Sets the value of the oCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Card }
     *     
     */
    public void setOCard(Card value) {
        this.oCard = value;
    }

}
