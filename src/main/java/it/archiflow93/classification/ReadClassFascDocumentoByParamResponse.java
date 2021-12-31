
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
 *         &lt;element name="ReadClassFascDocumentoByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}ReadClassFascDocumentoOutput" minOccurs="0"/>
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
    "readClassFascDocumentoByParamResult"
})
@XmlRootElement(name = "ReadClassFascDocumentoByParamResponse", namespace = "http://tempuri.org/")
public class ReadClassFascDocumentoByParamResponse {

    @XmlElement(name = "ReadClassFascDocumentoByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected ReadClassFascDocumentoOutput readClassFascDocumentoByParamResult;

    /**
     * Gets the value of the readClassFascDocumentoByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReadClassFascDocumentoOutput }
     *     
     */
    public ReadClassFascDocumentoOutput getReadClassFascDocumentoByParamResult() {
        return readClassFascDocumentoByParamResult;
    }

    /**
     * Sets the value of the readClassFascDocumentoByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadClassFascDocumentoOutput }
     *     
     */
    public void setReadClassFascDocumentoByParamResult(ReadClassFascDocumentoOutput value) {
        this.readClassFascDocumentoByParamResult = value;
    }

}
