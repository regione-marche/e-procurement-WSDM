
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
 *         &lt;element name="ModifyAddInEmailMappingResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
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
    "modifyAddInEmailMappingResult"
})
@XmlRootElement(name = "ModifyAddInEmailMappingResponse")
public class ModifyAddInEmailMappingResponse {

    @XmlElement(name = "ModifyAddInEmailMappingResult")
    protected ResultInfo modifyAddInEmailMappingResult;

    /**
     * Gets the value of the modifyAddInEmailMappingResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getModifyAddInEmailMappingResult() {
        return modifyAddInEmailMappingResult;
    }

    /**
     * Sets the value of the modifyAddInEmailMappingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setModifyAddInEmailMappingResult(ResultInfo value) {
        this.modifyAddInEmailMappingResult = value;
    }

}
