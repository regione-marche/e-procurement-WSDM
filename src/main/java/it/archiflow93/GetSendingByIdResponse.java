
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
 *         &lt;element name="GetSendingByIdResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="sending" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject}Sending" minOccurs="0"/>
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
    "getSendingByIdResult",
    "sending"
})
@XmlRootElement(name = "GetSendingByIdResponse")
public class GetSendingByIdResponse {

    @XmlElement(name = "GetSendingByIdResult")
    protected ResultInfo getSendingByIdResult;
    @XmlElement(nillable = true)
    protected Sending sending;

    /**
     * Gets the value of the getSendingByIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetSendingByIdResult() {
        return getSendingByIdResult;
    }

    /**
     * Sets the value of the getSendingByIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetSendingByIdResult(ResultInfo value) {
        this.getSendingByIdResult = value;
    }

    /**
     * Gets the value of the sending property.
     * 
     * @return
     *     possible object is
     *     {@link Sending }
     *     
     */
    public Sending getSending() {
        return sending;
    }

    /**
     * Sets the value of the sending property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sending }
     *     
     */
    public void setSending(Sending value) {
        this.sending = value;
    }

}
