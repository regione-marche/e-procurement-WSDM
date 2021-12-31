
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
 *         &lt;element name="ReadBaseTitolarioItemCollSortedByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}ReadBaseTitolarioItemCollSortedOutput" minOccurs="0"/>
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
    "readBaseTitolarioItemCollSortedByParamResult"
})
@XmlRootElement(name = "ReadBaseTitolarioItemCollSortedByParamResponse", namespace = "http://tempuri.org/")
public class ReadBaseTitolarioItemCollSortedByParamResponse {

    @XmlElement(name = "ReadBaseTitolarioItemCollSortedByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected ReadBaseTitolarioItemCollSortedOutput readBaseTitolarioItemCollSortedByParamResult;

    /**
     * Gets the value of the readBaseTitolarioItemCollSortedByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReadBaseTitolarioItemCollSortedOutput }
     *     
     */
    public ReadBaseTitolarioItemCollSortedOutput getReadBaseTitolarioItemCollSortedByParamResult() {
        return readBaseTitolarioItemCollSortedByParamResult;
    }

    /**
     * Sets the value of the readBaseTitolarioItemCollSortedByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadBaseTitolarioItemCollSortedOutput }
     *     
     */
    public void setReadBaseTitolarioItemCollSortedByParamResult(ReadBaseTitolarioItemCollSortedOutput value) {
        this.readBaseTitolarioItemCollSortedByParamResult = value;
    }

}
