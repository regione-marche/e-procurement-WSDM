
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
 *         &lt;element name="InsertClassificaDocCollByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}InsertClassificaDocCollOutput" minOccurs="0"/>
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
    "insertClassificaDocCollByParamResult"
})
@XmlRootElement(name = "InsertClassificaDocCollByParamResponse", namespace = "http://tempuri.org/")
public class InsertClassificaDocCollByParamResponse {

    @XmlElement(name = "InsertClassificaDocCollByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected InsertClassificaDocCollOutput insertClassificaDocCollByParamResult;

    /**
     * Gets the value of the insertClassificaDocCollByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link InsertClassificaDocCollOutput }
     *     
     */
    public InsertClassificaDocCollOutput getInsertClassificaDocCollByParamResult() {
        return insertClassificaDocCollByParamResult;
    }

    /**
     * Sets the value of the insertClassificaDocCollByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertClassificaDocCollOutput }
     *     
     */
    public void setInsertClassificaDocCollByParamResult(InsertClassificaDocCollOutput value) {
        this.insertClassificaDocCollByParamResult = value;
    }

}
