
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
 *         &lt;element name="UpdatePreservedFascicoloByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}UpdatePreservedFascicoloOutput" minOccurs="0"/>
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
    "updatePreservedFascicoloByParamResult"
})
@XmlRootElement(name = "UpdatePreservedFascicoloByParamResponse", namespace = "http://tempuri.org/")
public class UpdatePreservedFascicoloByParamResponse {

    @XmlElement(name = "UpdatePreservedFascicoloByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected UpdatePreservedFascicoloOutput updatePreservedFascicoloByParamResult;

    /**
     * Gets the value of the updatePreservedFascicoloByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatePreservedFascicoloOutput }
     *     
     */
    public UpdatePreservedFascicoloOutput getUpdatePreservedFascicoloByParamResult() {
        return updatePreservedFascicoloByParamResult;
    }

    /**
     * Sets the value of the updatePreservedFascicoloByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatePreservedFascicoloOutput }
     *     
     */
    public void setUpdatePreservedFascicoloByParamResult(UpdatePreservedFascicoloOutput value) {
        this.updatePreservedFascicoloByParamResult = value;
    }

}
