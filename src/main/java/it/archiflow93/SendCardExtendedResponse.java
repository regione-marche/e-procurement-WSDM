
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
 *         &lt;element name="SendCardExtendedResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oSendingValuesRet" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}SendingOutValues" minOccurs="0"/>
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
    "sendCardExtendedResult",
    "oSendingValuesRet"
})
@XmlRootElement(name = "SendCardExtendedResponse")
public class SendCardExtendedResponse {

    @XmlElement(name = "SendCardExtendedResult")
    protected ResultInfo sendCardExtendedResult;
    @XmlElement(nillable = true)
    protected SendingOutValues oSendingValuesRet;

    /**
     * Gets the value of the sendCardExtendedResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getSendCardExtendedResult() {
        return sendCardExtendedResult;
    }

    /**
     * Sets the value of the sendCardExtendedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setSendCardExtendedResult(ResultInfo value) {
        this.sendCardExtendedResult = value;
    }

    /**
     * Gets the value of the oSendingValuesRet property.
     * 
     * @return
     *     possible object is
     *     {@link SendingOutValues }
     *     
     */
    public SendingOutValues getOSendingValuesRet() {
        return oSendingValuesRet;
    }

    /**
     * Sets the value of the oSendingValuesRet property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendingOutValues }
     *     
     */
    public void setOSendingValuesRet(SendingOutValues value) {
        this.oSendingValuesRet = value;
    }

}
