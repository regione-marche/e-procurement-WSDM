
package it.archiflow93.classification;

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
 *         &lt;element name="UpdateValidToDateTitolarioItemByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}UpdateValidToDateTitolarioItemOutput" minOccurs="0"/>
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
    "updateValidToDateTitolarioItemByParamResult"
})
@XmlRootElement(name = "UpdateValidToDateTitolarioItemByParamResponse", namespace = "http://tempuri.org/")
public class UpdateValidToDateTitolarioItemByParamResponse {

    @XmlElement(name = "UpdateValidToDateTitolarioItemByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected UpdateValidToDateTitolarioItemOutput updateValidToDateTitolarioItemByParamResult;

    /**
     * Gets the value of the updateValidToDateTitolarioItemByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateValidToDateTitolarioItemOutput }
     *     
     */
    public UpdateValidToDateTitolarioItemOutput getUpdateValidToDateTitolarioItemByParamResult() {
        return updateValidToDateTitolarioItemByParamResult;
    }

    /**
     * Sets the value of the updateValidToDateTitolarioItemByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateValidToDateTitolarioItemOutput }
     *     
     */
    public void setUpdateValidToDateTitolarioItemByParamResult(UpdateValidToDateTitolarioItemOutput value) {
        this.updateValidToDateTitolarioItemByParamResult = value;
    }

}
