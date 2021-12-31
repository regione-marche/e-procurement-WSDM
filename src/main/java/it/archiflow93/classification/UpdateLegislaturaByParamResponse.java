
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
 *         &lt;element name="UpdateLegislaturaByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}UpdateLegislaturaOutput" minOccurs="0"/>
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
    "updateLegislaturaByParamResult"
})
@XmlRootElement(name = "UpdateLegislaturaByParamResponse", namespace = "http://tempuri.org/")
public class UpdateLegislaturaByParamResponse {

    @XmlElement(name = "UpdateLegislaturaByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected UpdateLegislaturaOutput updateLegislaturaByParamResult;

    /**
     * Gets the value of the updateLegislaturaByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLegislaturaOutput }
     *     
     */
    public UpdateLegislaturaOutput getUpdateLegislaturaByParamResult() {
        return updateLegislaturaByParamResult;
    }

    /**
     * Sets the value of the updateLegislaturaByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLegislaturaOutput }
     *     
     */
    public void setUpdateLegislaturaByParamResult(UpdateLegislaturaOutput value) {
        this.updateLegislaturaByParamResult = value;
    }

}
