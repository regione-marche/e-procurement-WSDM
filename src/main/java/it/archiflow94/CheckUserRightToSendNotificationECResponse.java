
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
 *         &lt;element name="CheckUserRightToSendNotificationECResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="eStatus" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}StatoFatturaPA_IN" minOccurs="0"/>
 *         &lt;element name="bRet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "checkUserRightToSendNotificationECResult",
    "eStatus",
    "bRet"
})
@XmlRootElement(name = "CheckUserRightToSendNotificationECResponse")
public class CheckUserRightToSendNotificationECResponse {

    @XmlElement(name = "CheckUserRightToSendNotificationECResult")
    protected ResultInfo checkUserRightToSendNotificationECResult;
    protected StatoFatturaPAIN eStatus;
    protected Boolean bRet;

    /**
     * Gets the value of the checkUserRightToSendNotificationECResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getCheckUserRightToSendNotificationECResult() {
        return checkUserRightToSendNotificationECResult;
    }

    /**
     * Sets the value of the checkUserRightToSendNotificationECResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setCheckUserRightToSendNotificationECResult(ResultInfo value) {
        this.checkUserRightToSendNotificationECResult = value;
    }

    /**
     * Gets the value of the eStatus property.
     * 
     * @return
     *     possible object is
     *     {@link StatoFatturaPAIN }
     *     
     */
    public StatoFatturaPAIN getEStatus() {
        return eStatus;
    }

    /**
     * Sets the value of the eStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatoFatturaPAIN }
     *     
     */
    public void setEStatus(StatoFatturaPAIN value) {
        this.eStatus = value;
    }

    /**
     * Gets the value of the bRet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBRet() {
        return bRet;
    }

    /**
     * Sets the value of the bRet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBRet(Boolean value) {
        this.bRet = value;
    }

}
