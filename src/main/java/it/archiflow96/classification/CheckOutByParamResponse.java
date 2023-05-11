
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
 *         &lt;element name="CheckOutByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}CheckOutOutput" minOccurs="0"/>
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
    "checkOutByParamResult"
})
@XmlRootElement(name = "CheckOutByParamResponse", namespace = "http://tempuri.org/")
public class CheckOutByParamResponse {

    @XmlElement(name = "CheckOutByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected CheckOutOutput checkOutByParamResult;

    /**
     * Gets the value of the checkOutByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link CheckOutOutput }
     *     
     */
    public CheckOutOutput getCheckOutByParamResult() {
        return checkOutByParamResult;
    }

    /**
     * Sets the value of the checkOutByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckOutOutput }
     *     
     */
    public void setCheckOutByParamResult(CheckOutOutput value) {
        this.checkOutByParamResult = value;
    }

}
