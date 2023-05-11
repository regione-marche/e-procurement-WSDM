
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
 *         &lt;element name="UpdateTitolarioByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}UpdateTitolarioOutput" minOccurs="0"/>
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
    "updateTitolarioByParamResult"
})
@XmlRootElement(name = "UpdateTitolarioByParamResponse", namespace = "http://tempuri.org/")
public class UpdateTitolarioByParamResponse {

    @XmlElement(name = "UpdateTitolarioByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected UpdateTitolarioOutput updateTitolarioByParamResult;

    /**
     * Gets the value of the updateTitolarioByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateTitolarioOutput }
     *     
     */
    public UpdateTitolarioOutput getUpdateTitolarioByParamResult() {
        return updateTitolarioByParamResult;
    }

    /**
     * Sets the value of the updateTitolarioByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateTitolarioOutput }
     *     
     */
    public void setUpdateTitolarioByParamResult(UpdateTitolarioOutput value) {
        this.updateTitolarioByParamResult = value;
    }

}
