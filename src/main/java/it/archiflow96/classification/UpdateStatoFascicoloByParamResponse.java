
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
 *         &lt;element name="UpdateStatoFascicoloByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}UpdateStatoFascicoloOutput" minOccurs="0"/>
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
    "updateStatoFascicoloByParamResult"
})
@XmlRootElement(name = "UpdateStatoFascicoloByParamResponse", namespace = "http://tempuri.org/")
public class UpdateStatoFascicoloByParamResponse {

    @XmlElement(name = "UpdateStatoFascicoloByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected UpdateStatoFascicoloOutput updateStatoFascicoloByParamResult;

    /**
     * Gets the value of the updateStatoFascicoloByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateStatoFascicoloOutput }
     *     
     */
    public UpdateStatoFascicoloOutput getUpdateStatoFascicoloByParamResult() {
        return updateStatoFascicoloByParamResult;
    }

    /**
     * Sets the value of the updateStatoFascicoloByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateStatoFascicoloOutput }
     *     
     */
    public void setUpdateStatoFascicoloByParamResult(UpdateStatoFascicoloOutput value) {
        this.updateStatoFascicoloByParamResult = value;
    }

}
