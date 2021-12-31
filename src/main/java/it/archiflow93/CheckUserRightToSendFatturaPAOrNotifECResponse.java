
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
 *         &lt;element name="CheckUserRightToSendFatturaPAOrNotifECResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="eStatusOut" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}StatoFatturaPA_OUT" minOccurs="0"/>
 *         &lt;element name="bRetOut" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eStatusIn" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}StatoFatturaPA_IN" minOccurs="0"/>
 *         &lt;element name="bRetIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "checkUserRightToSendFatturaPAOrNotifECResult",
    "eStatusOut",
    "bRetOut",
    "eStatusIn",
    "bRetIn"
})
@XmlRootElement(name = "CheckUserRightToSendFatturaPAOrNotifECResponse")
public class CheckUserRightToSendFatturaPAOrNotifECResponse {

    @XmlElement(name = "CheckUserRightToSendFatturaPAOrNotifECResult")
    protected ResultInfo checkUserRightToSendFatturaPAOrNotifECResult;
    protected StatoFatturaPAOUT eStatusOut;
    protected Boolean bRetOut;
    protected StatoFatturaPAIN eStatusIn;
    protected Boolean bRetIn;

    /**
     * Gets the value of the checkUserRightToSendFatturaPAOrNotifECResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getCheckUserRightToSendFatturaPAOrNotifECResult() {
        return checkUserRightToSendFatturaPAOrNotifECResult;
    }

    /**
     * Sets the value of the checkUserRightToSendFatturaPAOrNotifECResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setCheckUserRightToSendFatturaPAOrNotifECResult(ResultInfo value) {
        this.checkUserRightToSendFatturaPAOrNotifECResult = value;
    }

    /**
     * Gets the value of the eStatusOut property.
     * 
     * @return
     *     possible object is
     *     {@link StatoFatturaPAOUT }
     *     
     */
    public StatoFatturaPAOUT getEStatusOut() {
        return eStatusOut;
    }

    /**
     * Sets the value of the eStatusOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatoFatturaPAOUT }
     *     
     */
    public void setEStatusOut(StatoFatturaPAOUT value) {
        this.eStatusOut = value;
    }

    /**
     * Gets the value of the bRetOut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBRetOut() {
        return bRetOut;
    }

    /**
     * Sets the value of the bRetOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBRetOut(Boolean value) {
        this.bRetOut = value;
    }

    /**
     * Gets the value of the eStatusIn property.
     * 
     * @return
     *     possible object is
     *     {@link StatoFatturaPAIN }
     *     
     */
    public StatoFatturaPAIN getEStatusIn() {
        return eStatusIn;
    }

    /**
     * Sets the value of the eStatusIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatoFatturaPAIN }
     *     
     */
    public void setEStatusIn(StatoFatturaPAIN value) {
        this.eStatusIn = value;
    }

    /**
     * Gets the value of the bRetIn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBRetIn() {
        return bRetIn;
    }

    /**
     * Sets the value of the bRetIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBRetIn(Boolean value) {
        this.bRetIn = value;
    }

}
