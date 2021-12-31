
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
 *         &lt;element name="UpdateTipoFascicoloByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}UpdateTipoFascicoloOutput" minOccurs="0"/>
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
    "updateTipoFascicoloByParamResult"
})
@XmlRootElement(name = "UpdateTipoFascicoloByParamResponse", namespace = "http://tempuri.org/")
public class UpdateTipoFascicoloByParamResponse {

    @XmlElement(name = "UpdateTipoFascicoloByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected UpdateTipoFascicoloOutput updateTipoFascicoloByParamResult;

    /**
     * Gets the value of the updateTipoFascicoloByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateTipoFascicoloOutput }
     *     
     */
    public UpdateTipoFascicoloOutput getUpdateTipoFascicoloByParamResult() {
        return updateTipoFascicoloByParamResult;
    }

    /**
     * Sets the value of the updateTipoFascicoloByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateTipoFascicoloOutput }
     *     
     */
    public void setUpdateTipoFascicoloByParamResult(UpdateTipoFascicoloOutput value) {
        this.updateTipoFascicoloByParamResult = value;
    }

}
