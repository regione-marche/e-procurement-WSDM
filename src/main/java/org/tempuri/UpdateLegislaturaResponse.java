
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.siav_common_baseclass.ResultInfo;


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
 *         &lt;element name="UpdateLegislaturaResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="bRetVal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "updateLegislaturaResult",
    "bRetVal"
})
@XmlRootElement(name = "UpdateLegislaturaResponse")
public class UpdateLegislaturaResponse {

    @XmlElement(name = "UpdateLegislaturaResult")
    protected ResultInfo updateLegislaturaResult;
    protected Boolean bRetVal;

    /**
     * Gets the value of the updateLegislaturaResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getUpdateLegislaturaResult() {
        return updateLegislaturaResult;
    }

    /**
     * Sets the value of the updateLegislaturaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setUpdateLegislaturaResult(ResultInfo value) {
        this.updateLegislaturaResult = value;
    }

    /**
     * Gets the value of the bRetVal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBRetVal() {
        return bRetVal;
    }

    /**
     * Sets the value of the bRetVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBRetVal(Boolean value) {
        this.bRetVal = value;
    }

}
