
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
 *         &lt;element name="ReadLegislaturaByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}ReadLegislaturaOutput" minOccurs="0"/>
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
    "readLegislaturaByParamResult"
})
@XmlRootElement(name = "ReadLegislaturaByParamResponse", namespace = "http://tempuri.org/")
public class ReadLegislaturaByParamResponse {

    @XmlElement(name = "ReadLegislaturaByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected ReadLegislaturaOutput readLegislaturaByParamResult;

    /**
     * Gets the value of the readLegislaturaByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReadLegislaturaOutput }
     *     
     */
    public ReadLegislaturaOutput getReadLegislaturaByParamResult() {
        return readLegislaturaByParamResult;
    }

    /**
     * Sets the value of the readLegislaturaByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadLegislaturaOutput }
     *     
     */
    public void setReadLegislaturaByParamResult(ReadLegislaturaOutput value) {
        this.readLegislaturaByParamResult = value;
    }

}
