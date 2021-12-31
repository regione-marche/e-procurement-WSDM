
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
 *         &lt;element name="ReadTitolarioItemByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}ReadTitolarioItemOutput" minOccurs="0"/>
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
    "readTitolarioItemByParamResult"
})
@XmlRootElement(name = "ReadTitolarioItemByParamResponse", namespace = "http://tempuri.org/")
public class ReadTitolarioItemByParamResponse {

    @XmlElement(name = "ReadTitolarioItemByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected ReadTitolarioItemOutput readTitolarioItemByParamResult;

    /**
     * Gets the value of the readTitolarioItemByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReadTitolarioItemOutput }
     *     
     */
    public ReadTitolarioItemOutput getReadTitolarioItemByParamResult() {
        return readTitolarioItemByParamResult;
    }

    /**
     * Sets the value of the readTitolarioItemByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadTitolarioItemOutput }
     *     
     */
    public void setReadTitolarioItemByParamResult(ReadTitolarioItemOutput value) {
        this.readTitolarioItemByParamResult = value;
    }

}
