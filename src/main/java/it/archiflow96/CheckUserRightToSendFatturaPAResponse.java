
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
 *         &lt;element name="CheckUserRightToSendFatturaPAResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="eStatus" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}StatoFatturaPA_OUT" minOccurs="0"/>
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
    "checkUserRightToSendFatturaPAResult",
    "eStatus",
    "bRet"
})
@XmlRootElement(name = "CheckUserRightToSendFatturaPAResponse")
public class CheckUserRightToSendFatturaPAResponse {

    @XmlElement(name = "CheckUserRightToSendFatturaPAResult")
    protected ResultInfo checkUserRightToSendFatturaPAResult;
    protected StatoFatturaPAOUT eStatus;
    protected Boolean bRet;

    /**
     * Gets the value of the checkUserRightToSendFatturaPAResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getCheckUserRightToSendFatturaPAResult() {
        return checkUserRightToSendFatturaPAResult;
    }

    /**
     * Sets the value of the checkUserRightToSendFatturaPAResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setCheckUserRightToSendFatturaPAResult(ResultInfo value) {
        this.checkUserRightToSendFatturaPAResult = value;
    }

    /**
     * Gets the value of the eStatus property.
     * 
     * @return
     *     possible object is
     *     {@link StatoFatturaPAOUT }
     *     
     */
    public StatoFatturaPAOUT getEStatus() {
        return eStatus;
    }

    /**
     * Sets the value of the eStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatoFatturaPAOUT }
     *     
     */
    public void setEStatus(StatoFatturaPAOUT value) {
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
