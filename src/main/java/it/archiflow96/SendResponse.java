
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
 *         &lt;element name="SendResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="msgIdTmp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sendResult",
    "msgIdTmp"
})
@XmlRootElement(name = "SendResponse")
public class SendResponse {

    @XmlElement(name = "SendResult")
    protected ResultInfo sendResult;
    @XmlElement(nillable = true)
    protected String msgIdTmp;

    /**
     * Gets the value of the sendResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getSendResult() {
        return sendResult;
    }

    /**
     * Sets the value of the sendResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setSendResult(ResultInfo value) {
        this.sendResult = value;
    }

    /**
     * Gets the value of the msgIdTmp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgIdTmp() {
        return msgIdTmp;
    }

    /**
     * Sets the value of the msgIdTmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgIdTmp(String value) {
        this.msgIdTmp = value;
    }

}
