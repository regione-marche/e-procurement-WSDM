
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
 *         &lt;element name="SetPrimaryClassificaDocumentoByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}SetPrimaryClassificaDocumentoOutput" minOccurs="0"/>
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
    "setPrimaryClassificaDocumentoByParamResult"
})
@XmlRootElement(name = "SetPrimaryClassificaDocumentoByParamResponse", namespace = "http://tempuri.org/")
public class SetPrimaryClassificaDocumentoByParamResponse {

    @XmlElement(name = "SetPrimaryClassificaDocumentoByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected SetPrimaryClassificaDocumentoOutput setPrimaryClassificaDocumentoByParamResult;

    /**
     * Gets the value of the setPrimaryClassificaDocumentoByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link SetPrimaryClassificaDocumentoOutput }
     *     
     */
    public SetPrimaryClassificaDocumentoOutput getSetPrimaryClassificaDocumentoByParamResult() {
        return setPrimaryClassificaDocumentoByParamResult;
    }

    /**
     * Sets the value of the setPrimaryClassificaDocumentoByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetPrimaryClassificaDocumentoOutput }
     *     
     */
    public void setSetPrimaryClassificaDocumentoByParamResult(SetPrimaryClassificaDocumentoOutput value) {
        this.setPrimaryClassificaDocumentoByParamResult = value;
    }

}
