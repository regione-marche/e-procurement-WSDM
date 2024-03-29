
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
 *         &lt;element name="GetCardResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
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
    "getCardResult",
    "oCard"
})
@XmlRootElement(name = "GetCardResponse")
public class GetCardResponse {

    @XmlElement(name = "GetCardResult")
    protected ResultInfo getCardResult;
    @XmlElement(nillable = true)
    protected Card oCard;

    /**
     * Gets the value of the getCardResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetCardResult() {
        return getCardResult;
    }

    /**
     * Sets the value of the getCardResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetCardResult(ResultInfo value) {
        this.getCardResult = value;
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
