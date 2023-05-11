
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
 *         &lt;element name="UpdateTitolarioTemplateByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}UpdateTitolarioTemplateOutput" minOccurs="0"/>
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
    "updateTitolarioTemplateByParamResult"
})
@XmlRootElement(name = "UpdateTitolarioTemplateByParamResponse", namespace = "http://tempuri.org/")
public class UpdateTitolarioTemplateByParamResponse {

    @XmlElement(name = "UpdateTitolarioTemplateByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected UpdateTitolarioTemplateOutput updateTitolarioTemplateByParamResult;

    /**
     * Gets the value of the updateTitolarioTemplateByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateTitolarioTemplateOutput }
     *     
     */
    public UpdateTitolarioTemplateOutput getUpdateTitolarioTemplateByParamResult() {
        return updateTitolarioTemplateByParamResult;
    }

    /**
     * Sets the value of the updateTitolarioTemplateByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateTitolarioTemplateOutput }
     *     
     */
    public void setUpdateTitolarioTemplateByParamResult(UpdateTitolarioTemplateOutput value) {
        this.updateTitolarioTemplateByParamResult = value;
    }

}
