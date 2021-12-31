
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
 *         &lt;element name="ReadTitolarioItemBaseByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}ReadTitolarioItemBaseOutput" minOccurs="0"/>
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
    "readTitolarioItemBaseByParamResult"
})
@XmlRootElement(name = "ReadTitolarioItemBaseByParamResponse", namespace = "http://tempuri.org/")
public class ReadTitolarioItemBaseByParamResponse {

    @XmlElement(name = "ReadTitolarioItemBaseByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected ReadTitolarioItemBaseOutput readTitolarioItemBaseByParamResult;

    /**
     * Gets the value of the readTitolarioItemBaseByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReadTitolarioItemBaseOutput }
     *     
     */
    public ReadTitolarioItemBaseOutput getReadTitolarioItemBaseByParamResult() {
        return readTitolarioItemBaseByParamResult;
    }

    /**
     * Sets the value of the readTitolarioItemBaseByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadTitolarioItemBaseOutput }
     *     
     */
    public void setReadTitolarioItemBaseByParamResult(ReadTitolarioItemBaseOutput value) {
        this.readTitolarioItemBaseByParamResult = value;
    }

}
