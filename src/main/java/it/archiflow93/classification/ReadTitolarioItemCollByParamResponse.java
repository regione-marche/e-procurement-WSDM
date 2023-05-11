
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
 *         &lt;element name="ReadTitolarioItemCollByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}ReadTitolarioItemCollOutput" minOccurs="0"/>
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
    "readTitolarioItemCollByParamResult"
})
@XmlRootElement(name = "ReadTitolarioItemCollByParamResponse", namespace = "http://tempuri.org/")
public class ReadTitolarioItemCollByParamResponse {

    @XmlElement(name = "ReadTitolarioItemCollByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected ReadTitolarioItemCollOutput readTitolarioItemCollByParamResult;

    /**
     * Gets the value of the readTitolarioItemCollByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReadTitolarioItemCollOutput }
     *     
     */
    public ReadTitolarioItemCollOutput getReadTitolarioItemCollByParamResult() {
        return readTitolarioItemCollByParamResult;
    }

    /**
     * Sets the value of the readTitolarioItemCollByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadTitolarioItemCollOutput }
     *     
     */
    public void setReadTitolarioItemCollByParamResult(ReadTitolarioItemCollOutput value) {
        this.readTitolarioItemCollByParamResult = value;
    }

}
