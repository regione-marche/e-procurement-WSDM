
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
 *         &lt;element name="GetSendingCountByCardIdResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="nSending" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "getSendingCountByCardIdResult",
    "nSending"
})
@XmlRootElement(name = "GetSendingCountByCardIdResponse")
public class GetSendingCountByCardIdResponse {

    @XmlElement(name = "GetSendingCountByCardIdResult")
    protected ResultInfo getSendingCountByCardIdResult;
    protected Integer nSending;

    /**
     * Gets the value of the getSendingCountByCardIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetSendingCountByCardIdResult() {
        return getSendingCountByCardIdResult;
    }

    /**
     * Sets the value of the getSendingCountByCardIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetSendingCountByCardIdResult(ResultInfo value) {
        this.getSendingCountByCardIdResult = value;
    }

    /**
     * Gets the value of the nSending property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSending() {
        return nSending;
    }

    /**
     * Sets the value of the nSending property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSending(Integer value) {
        this.nSending = value;
    }

}
