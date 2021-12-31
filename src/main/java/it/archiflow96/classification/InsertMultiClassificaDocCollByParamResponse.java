
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
 *         &lt;element name="InsertMultiClassificaDocCollByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}InsertMultiClassificaDocCollOutput" minOccurs="0"/>
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
    "insertMultiClassificaDocCollByParamResult"
})
@XmlRootElement(name = "InsertMultiClassificaDocCollByParamResponse", namespace = "http://tempuri.org/")
public class InsertMultiClassificaDocCollByParamResponse {

    @XmlElement(name = "InsertMultiClassificaDocCollByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected InsertMultiClassificaDocCollOutput insertMultiClassificaDocCollByParamResult;

    /**
     * Gets the value of the insertMultiClassificaDocCollByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link InsertMultiClassificaDocCollOutput }
     *     
     */
    public InsertMultiClassificaDocCollOutput getInsertMultiClassificaDocCollByParamResult() {
        return insertMultiClassificaDocCollByParamResult;
    }

    /**
     * Sets the value of the insertMultiClassificaDocCollByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertMultiClassificaDocCollOutput }
     *     
     */
    public void setInsertMultiClassificaDocCollByParamResult(InsertMultiClassificaDocCollOutput value) {
        this.insertMultiClassificaDocCollByParamResult = value;
    }

}
