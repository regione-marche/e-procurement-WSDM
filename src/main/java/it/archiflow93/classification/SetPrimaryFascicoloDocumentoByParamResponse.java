
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
 *         &lt;element name="SetPrimaryFascicoloDocumentoByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}SetPrimaryFascicoloDocumentoOutput" minOccurs="0"/>
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
    "setPrimaryFascicoloDocumentoByParamResult"
})
@XmlRootElement(name = "SetPrimaryFascicoloDocumentoByParamResponse", namespace = "http://tempuri.org/")
public class SetPrimaryFascicoloDocumentoByParamResponse {

    @XmlElement(name = "SetPrimaryFascicoloDocumentoByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected SetPrimaryFascicoloDocumentoOutput setPrimaryFascicoloDocumentoByParamResult;

    /**
     * Gets the value of the setPrimaryFascicoloDocumentoByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link SetPrimaryFascicoloDocumentoOutput }
     *     
     */
    public SetPrimaryFascicoloDocumentoOutput getSetPrimaryFascicoloDocumentoByParamResult() {
        return setPrimaryFascicoloDocumentoByParamResult;
    }

    /**
     * Sets the value of the setPrimaryFascicoloDocumentoByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetPrimaryFascicoloDocumentoOutput }
     *     
     */
    public void setSetPrimaryFascicoloDocumentoByParamResult(SetPrimaryFascicoloDocumentoOutput value) {
        this.setPrimaryFascicoloDocumentoByParamResult = value;
    }

}
