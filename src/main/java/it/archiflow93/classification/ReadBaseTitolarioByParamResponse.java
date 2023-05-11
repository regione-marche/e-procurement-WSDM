
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
 *         &lt;element name="ReadBaseTitolarioByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}ReadBaseTitolarioOutput" minOccurs="0"/>
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
    "readBaseTitolarioByParamResult"
})
@XmlRootElement(name = "ReadBaseTitolarioByParamResponse", namespace = "http://tempuri.org/")
public class ReadBaseTitolarioByParamResponse {

    @XmlElement(name = "ReadBaseTitolarioByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected ReadBaseTitolarioOutput readBaseTitolarioByParamResult;

    /**
     * Gets the value of the readBaseTitolarioByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReadBaseTitolarioOutput }
     *     
     */
    public ReadBaseTitolarioOutput getReadBaseTitolarioByParamResult() {
        return readBaseTitolarioByParamResult;
    }

    /**
     * Sets the value of the readBaseTitolarioByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadBaseTitolarioOutput }
     *     
     */
    public void setReadBaseTitolarioByParamResult(ReadBaseTitolarioOutput value) {
        this.readBaseTitolarioByParamResult = value;
    }

}
