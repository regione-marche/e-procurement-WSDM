
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
 *         &lt;element name="ReadBaseTitolarioItemCollByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}ReadBaseTitolarioItemCollOutput" minOccurs="0"/>
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
    "readBaseTitolarioItemCollByParamResult"
})
@XmlRootElement(name = "ReadBaseTitolarioItemCollByParamResponse", namespace = "http://tempuri.org/")
public class ReadBaseTitolarioItemCollByParamResponse {

    @XmlElement(name = "ReadBaseTitolarioItemCollByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected ReadBaseTitolarioItemCollOutput readBaseTitolarioItemCollByParamResult;

    /**
     * Gets the value of the readBaseTitolarioItemCollByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReadBaseTitolarioItemCollOutput }
     *     
     */
    public ReadBaseTitolarioItemCollOutput getReadBaseTitolarioItemCollByParamResult() {
        return readBaseTitolarioItemCollByParamResult;
    }

    /**
     * Sets the value of the readBaseTitolarioItemCollByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadBaseTitolarioItemCollOutput }
     *     
     */
    public void setReadBaseTitolarioItemCollByParamResult(ReadBaseTitolarioItemCollOutput value) {
        this.readBaseTitolarioItemCollByParamResult = value;
    }

}
