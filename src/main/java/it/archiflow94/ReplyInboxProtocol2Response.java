
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
 *         &lt;element name="ReplyInboxProtocol2Result" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="enRet" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}EMailSendRet" minOccurs="0"/>
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
    "replyInboxProtocol2Result",
    "enRet"
})
@XmlRootElement(name = "ReplyInboxProtocol2Response")
public class ReplyInboxProtocol2Response {

    @XmlElement(name = "ReplyInboxProtocol2Result")
    protected ResultInfo replyInboxProtocol2Result;
    protected EMailSendRet enRet;

    /**
     * Gets the value of the replyInboxProtocol2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getReplyInboxProtocol2Result() {
        return replyInboxProtocol2Result;
    }

    /**
     * Sets the value of the replyInboxProtocol2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setReplyInboxProtocol2Result(ResultInfo value) {
        this.replyInboxProtocol2Result = value;
    }

    /**
     * Gets the value of the enRet property.
     * 
     * @return
     *     possible object is
     *     {@link EMailSendRet }
     *     
     */
    public EMailSendRet getEnRet() {
        return enRet;
    }

    /**
     * Sets the value of the enRet property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMailSendRet }
     *     
     */
    public void setEnRet(EMailSendRet value) {
        this.enRet = value;
    }

}
