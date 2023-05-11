
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
 *         &lt;element name="UpdateFascicoloByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}UpdateFascicoloOutput" minOccurs="0"/>
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
    "updateFascicoloByParamResult"
})
@XmlRootElement(name = "UpdateFascicoloByParamResponse", namespace = "http://tempuri.org/")
public class UpdateFascicoloByParamResponse {

    @XmlElement(name = "UpdateFascicoloByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected UpdateFascicoloOutput updateFascicoloByParamResult;

    /**
     * Gets the value of the updateFascicoloByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateFascicoloOutput }
     *     
     */
    public UpdateFascicoloOutput getUpdateFascicoloByParamResult() {
        return updateFascicoloByParamResult;
    }

    /**
     * Sets the value of the updateFascicoloByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateFascicoloOutput }
     *     
     */
    public void setUpdateFascicoloByParamResult(UpdateFascicoloOutput value) {
        this.updateFascicoloByParamResult = value;
    }

}
