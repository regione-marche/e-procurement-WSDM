
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
 *         &lt;element name="GetInboxMsgByCardIDResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oEMailInfo" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject}EMailIn" minOccurs="0"/>
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
    "getInboxMsgByCardIDResult",
    "oeMailInfo"
})
@XmlRootElement(name = "GetInboxMsgByCardIDResponse")
public class GetInboxMsgByCardIDResponse {

    @XmlElement(name = "GetInboxMsgByCardIDResult")
    protected ResultInfo getInboxMsgByCardIDResult;
    @XmlElement(name = "oEMailInfo", nillable = true)
    protected EMailIn oeMailInfo;

    /**
     * Gets the value of the getInboxMsgByCardIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetInboxMsgByCardIDResult() {
        return getInboxMsgByCardIDResult;
    }

    /**
     * Sets the value of the getInboxMsgByCardIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetInboxMsgByCardIDResult(ResultInfo value) {
        this.getInboxMsgByCardIDResult = value;
    }

    /**
     * Gets the value of the oeMailInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EMailIn }
     *     
     */
    public EMailIn getOEMailInfo() {
        return oeMailInfo;
    }

    /**
     * Sets the value of the oeMailInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMailIn }
     *     
     */
    public void setOEMailInfo(EMailIn value) {
        this.oeMailInfo = value;
    }

}
