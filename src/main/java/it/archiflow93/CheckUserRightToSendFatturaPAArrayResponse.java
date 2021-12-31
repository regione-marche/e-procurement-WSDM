
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
 *         &lt;element name="CheckUserRightToSendFatturaPAArrayResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="checkInfo" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject}ArrayOfCheckInfoFatturaPA" minOccurs="0"/>
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
    "checkUserRightToSendFatturaPAArrayResult",
    "checkInfo",
    "bRet"
})
@XmlRootElement(name = "CheckUserRightToSendFatturaPAArrayResponse")
public class CheckUserRightToSendFatturaPAArrayResponse {

    @XmlElement(name = "CheckUserRightToSendFatturaPAArrayResult")
    protected ResultInfo checkUserRightToSendFatturaPAArrayResult;
    @XmlElement(nillable = true)
    protected ArrayOfCheckInfoFatturaPA checkInfo;
    protected Boolean bRet;

    /**
     * Gets the value of the checkUserRightToSendFatturaPAArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getCheckUserRightToSendFatturaPAArrayResult() {
        return checkUserRightToSendFatturaPAArrayResult;
    }

    /**
     * Sets the value of the checkUserRightToSendFatturaPAArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setCheckUserRightToSendFatturaPAArrayResult(ResultInfo value) {
        this.checkUserRightToSendFatturaPAArrayResult = value;
    }

    /**
     * Gets the value of the checkInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCheckInfoFatturaPA }
     *     
     */
    public ArrayOfCheckInfoFatturaPA getCheckInfo() {
        return checkInfo;
    }

    /**
     * Sets the value of the checkInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCheckInfoFatturaPA }
     *     
     */
    public void setCheckInfo(ArrayOfCheckInfoFatturaPA value) {
        this.checkInfo = value;
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
