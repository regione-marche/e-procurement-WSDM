
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
 *         &lt;element name="UpdateTitolarioItemByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}UpdateTitolarioItemOutput" minOccurs="0"/>
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
    "updateTitolarioItemByParamResult"
})
@XmlRootElement(name = "UpdateTitolarioItemByParamResponse", namespace = "http://tempuri.org/")
public class UpdateTitolarioItemByParamResponse {

    @XmlElement(name = "UpdateTitolarioItemByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected UpdateTitolarioItemOutput updateTitolarioItemByParamResult;

    /**
     * Gets the value of the updateTitolarioItemByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateTitolarioItemOutput }
     *     
     */
    public UpdateTitolarioItemOutput getUpdateTitolarioItemByParamResult() {
        return updateTitolarioItemByParamResult;
    }

    /**
     * Sets the value of the updateTitolarioItemByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateTitolarioItemOutput }
     *     
     */
    public void setUpdateTitolarioItemByParamResult(UpdateTitolarioItemOutput value) {
        this.updateTitolarioItemByParamResult = value;
    }

}
