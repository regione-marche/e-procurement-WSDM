
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
 *         &lt;element name="IsInBoxProtocolResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="bFound" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="nMsgCardID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "isInBoxProtocolResult",
    "bFound",
    "nMsgCardID"
})
@XmlRootElement(name = "IsInBoxProtocolResponse")
public class IsInBoxProtocolResponse {

    @XmlElement(name = "IsInBoxProtocolResult")
    protected ResultInfo isInBoxProtocolResult;
    protected Boolean bFound;
    protected Integer nMsgCardID;

    /**
     * Gets the value of the isInBoxProtocolResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getIsInBoxProtocolResult() {
        return isInBoxProtocolResult;
    }

    /**
     * Sets the value of the isInBoxProtocolResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setIsInBoxProtocolResult(ResultInfo value) {
        this.isInBoxProtocolResult = value;
    }

    /**
     * Gets the value of the bFound property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBFound() {
        return bFound;
    }

    /**
     * Sets the value of the bFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBFound(Boolean value) {
        this.bFound = value;
    }

    /**
     * Gets the value of the nMsgCardID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNMsgCardID() {
        return nMsgCardID;
    }

    /**
     * Sets the value of the nMsgCardID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNMsgCardID(Integer value) {
        this.nMsgCardID = value;
    }

}
