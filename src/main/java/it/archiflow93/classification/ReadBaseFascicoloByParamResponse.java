
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
 *         &lt;element name="ReadBaseFascicoloByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}ReadBaseFascicoloOutput" minOccurs="0"/>
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
    "readBaseFascicoloByParamResult"
})
@XmlRootElement(name = "ReadBaseFascicoloByParamResponse", namespace = "http://tempuri.org/")
public class ReadBaseFascicoloByParamResponse {

    @XmlElement(name = "ReadBaseFascicoloByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected ReadBaseFascicoloOutput readBaseFascicoloByParamResult;

    /**
     * Gets the value of the readBaseFascicoloByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReadBaseFascicoloOutput }
     *     
     */
    public ReadBaseFascicoloOutput getReadBaseFascicoloByParamResult() {
        return readBaseFascicoloByParamResult;
    }

    /**
     * Sets the value of the readBaseFascicoloByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadBaseFascicoloOutput }
     *     
     */
    public void setReadBaseFascicoloByParamResult(ReadBaseFascicoloOutput value) {
        this.readBaseFascicoloByParamResult = value;
    }

}
