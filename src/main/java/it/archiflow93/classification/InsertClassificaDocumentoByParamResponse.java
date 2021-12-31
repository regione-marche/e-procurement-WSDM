
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
 *         &lt;element name="InsertClassificaDocumentoByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}InsertClassificaDocumentoOutput" minOccurs="0"/>
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
    "insertClassificaDocumentoByParamResult"
})
@XmlRootElement(name = "InsertClassificaDocumentoByParamResponse", namespace = "http://tempuri.org/")
public class InsertClassificaDocumentoByParamResponse {

    @XmlElement(name = "InsertClassificaDocumentoByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected InsertClassificaDocumentoOutput insertClassificaDocumentoByParamResult;

    /**
     * Gets the value of the insertClassificaDocumentoByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link InsertClassificaDocumentoOutput }
     *     
     */
    public InsertClassificaDocumentoOutput getInsertClassificaDocumentoByParamResult() {
        return insertClassificaDocumentoByParamResult;
    }

    /**
     * Sets the value of the insertClassificaDocumentoByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertClassificaDocumentoOutput }
     *     
     */
    public void setInsertClassificaDocumentoByParamResult(InsertClassificaDocumentoOutput value) {
        this.insertClassificaDocumentoByParamResult = value;
    }

}
