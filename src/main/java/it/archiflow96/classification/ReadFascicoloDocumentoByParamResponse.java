
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
 *         &lt;element name="ReadFascicoloDocumentoByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}ReadFascicoloDocumentoOutput" minOccurs="0"/>
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
    "readFascicoloDocumentoByParamResult"
})
@XmlRootElement(name = "ReadFascicoloDocumentoByParamResponse", namespace = "http://tempuri.org/")
public class ReadFascicoloDocumentoByParamResponse {

    @XmlElement(name = "ReadFascicoloDocumentoByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected ReadFascicoloDocumentoOutput readFascicoloDocumentoByParamResult;

    /**
     * Gets the value of the readFascicoloDocumentoByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReadFascicoloDocumentoOutput }
     *     
     */
    public ReadFascicoloDocumentoOutput getReadFascicoloDocumentoByParamResult() {
        return readFascicoloDocumentoByParamResult;
    }

    /**
     * Sets the value of the readFascicoloDocumentoByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadFascicoloDocumentoOutput }
     *     
     */
    public void setReadFascicoloDocumentoByParamResult(ReadFascicoloDocumentoOutput value) {
        this.readFascicoloDocumentoByParamResult = value;
    }

}
