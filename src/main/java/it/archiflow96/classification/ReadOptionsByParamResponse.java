
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
 *         &lt;element name="ReadOptionsByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}ReadOptionsOutput" minOccurs="0"/>
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
    "readOptionsByParamResult"
})
@XmlRootElement(name = "ReadOptionsByParamResponse", namespace = "http://tempuri.org/")
public class ReadOptionsByParamResponse {

    @XmlElement(name = "ReadOptionsByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected ReadOptionsOutput readOptionsByParamResult;

    /**
     * Gets the value of the readOptionsByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReadOptionsOutput }
     *     
     */
    public ReadOptionsOutput getReadOptionsByParamResult() {
        return readOptionsByParamResult;
    }

    /**
     * Sets the value of the readOptionsByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadOptionsOutput }
     *     
     */
    public void setReadOptionsByParamResult(ReadOptionsOutput value) {
        this.readOptionsByParamResult = value;
    }

}
