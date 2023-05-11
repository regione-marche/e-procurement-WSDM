
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
 *         &lt;element name="InsertFascicoloVisibilityResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
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
    "insertFascicoloVisibilityResult"
})
@XmlRootElement(name = "InsertFascicoloVisibilityResponse")
public class InsertFascicoloVisibilityResponse {

    @XmlElement(name = "InsertFascicoloVisibilityResult")
    protected ResultInfo insertFascicoloVisibilityResult;

    /**
     * Gets the value of the insertFascicoloVisibilityResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getInsertFascicoloVisibilityResult() {
        return insertFascicoloVisibilityResult;
    }

    /**
     * Sets the value of the insertFascicoloVisibilityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setInsertFascicoloVisibilityResult(ResultInfo value) {
        this.insertFascicoloVisibilityResult = value;
    }

}
