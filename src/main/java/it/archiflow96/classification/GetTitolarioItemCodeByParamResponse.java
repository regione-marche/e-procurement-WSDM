
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
 *         &lt;element name="GetTitolarioItemCodeByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}GetTitolarioItemCodeOutput" minOccurs="0"/>
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
    "getTitolarioItemCodeByParamResult"
})
@XmlRootElement(name = "GetTitolarioItemCodeByParamResponse", namespace = "http://tempuri.org/")
public class GetTitolarioItemCodeByParamResponse {

    @XmlElement(name = "GetTitolarioItemCodeByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected GetTitolarioItemCodeOutput getTitolarioItemCodeByParamResult;

    /**
     * Gets the value of the getTitolarioItemCodeByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetTitolarioItemCodeOutput }
     *     
     */
    public GetTitolarioItemCodeOutput getGetTitolarioItemCodeByParamResult() {
        return getTitolarioItemCodeByParamResult;
    }

    /**
     * Sets the value of the getTitolarioItemCodeByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTitolarioItemCodeOutput }
     *     
     */
    public void setGetTitolarioItemCodeByParamResult(GetTitolarioItemCodeOutput value) {
        this.getTitolarioItemCodeByParamResult = value;
    }

}
