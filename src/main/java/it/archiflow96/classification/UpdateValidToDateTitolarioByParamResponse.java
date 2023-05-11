
package it.archiflow96.classification;

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
 *         &lt;element name="UpdateValidToDateTitolarioByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}UpdateValidToDateTitolarioOutput" minOccurs="0"/>
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
    "updateValidToDateTitolarioByParamResult"
})
@XmlRootElement(name = "UpdateValidToDateTitolarioByParamResponse", namespace = "http://tempuri.org/")
public class UpdateValidToDateTitolarioByParamResponse {

    @XmlElement(name = "UpdateValidToDateTitolarioByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected UpdateValidToDateTitolarioOutput updateValidToDateTitolarioByParamResult;

    /**
     * Gets the value of the updateValidToDateTitolarioByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateValidToDateTitolarioOutput }
     *     
     */
    public UpdateValidToDateTitolarioOutput getUpdateValidToDateTitolarioByParamResult() {
        return updateValidToDateTitolarioByParamResult;
    }

    /**
     * Sets the value of the updateValidToDateTitolarioByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateValidToDateTitolarioOutput }
     *     
     */
    public void setUpdateValidToDateTitolarioByParamResult(UpdateValidToDateTitolarioOutput value) {
        this.updateValidToDateTitolarioByParamResult = value;
    }

}
