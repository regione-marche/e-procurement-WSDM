
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
 *         &lt;element name="GetStatusResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="cardStatus" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}CardStatus" minOccurs="0"/>
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
    "getStatusResult",
    "cardStatus"
})
@XmlRootElement(name = "GetStatusResponse")
public class GetStatusResponse {

    @XmlElement(name = "GetStatusResult")
    protected ResultInfo getStatusResult;
    protected CardStatus cardStatus;

    /**
     * Gets the value of the getStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetStatusResult() {
        return getStatusResult;
    }

    /**
     * Sets the value of the getStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetStatusResult(ResultInfo value) {
        this.getStatusResult = value;
    }

    /**
     * Gets the value of the cardStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CardStatus }
     *     
     */
    public CardStatus getCardStatus() {
        return cardStatus;
    }

    /**
     * Sets the value of the cardStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardStatus }
     *     
     */
    public void setCardStatus(CardStatus value) {
        this.cardStatus = value;
    }

}
