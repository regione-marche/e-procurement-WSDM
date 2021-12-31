
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
 *         &lt;element name="ReadTipoDocDefaultTitolarioItemCollByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}ReadTipoDocDefaultTitolarioItemCollOutput" minOccurs="0"/>
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
    "readTipoDocDefaultTitolarioItemCollByParamResult"
})
@XmlRootElement(name = "ReadTipoDocDefaultTitolarioItemCollByParamResponse", namespace = "http://tempuri.org/")
public class ReadTipoDocDefaultTitolarioItemCollByParamResponse {

    @XmlElement(name = "ReadTipoDocDefaultTitolarioItemCollByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected ReadTipoDocDefaultTitolarioItemCollOutput readTipoDocDefaultTitolarioItemCollByParamResult;

    /**
     * Gets the value of the readTipoDocDefaultTitolarioItemCollByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReadTipoDocDefaultTitolarioItemCollOutput }
     *     
     */
    public ReadTipoDocDefaultTitolarioItemCollOutput getReadTipoDocDefaultTitolarioItemCollByParamResult() {
        return readTipoDocDefaultTitolarioItemCollByParamResult;
    }

    /**
     * Sets the value of the readTipoDocDefaultTitolarioItemCollByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadTipoDocDefaultTitolarioItemCollOutput }
     *     
     */
    public void setReadTipoDocDefaultTitolarioItemCollByParamResult(ReadTipoDocDefaultTitolarioItemCollOutput value) {
        this.readTipoDocDefaultTitolarioItemCollByParamResult = value;
    }

}
