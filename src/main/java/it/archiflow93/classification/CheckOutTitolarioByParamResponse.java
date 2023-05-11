
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
 *         &lt;element name="CheckOutTitolarioByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}CheckOutTitolarioOutput" minOccurs="0"/>
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
    "checkOutTitolarioByParamResult"
})
@XmlRootElement(name = "CheckOutTitolarioByParamResponse", namespace = "http://tempuri.org/")
public class CheckOutTitolarioByParamResponse {

    @XmlElement(name = "CheckOutTitolarioByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected CheckOutTitolarioOutput checkOutTitolarioByParamResult;

    /**
     * Gets the value of the checkOutTitolarioByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link CheckOutTitolarioOutput }
     *     
     */
    public CheckOutTitolarioOutput getCheckOutTitolarioByParamResult() {
        return checkOutTitolarioByParamResult;
    }

    /**
     * Sets the value of the checkOutTitolarioByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckOutTitolarioOutput }
     *     
     */
    public void setCheckOutTitolarioByParamResult(CheckOutTitolarioOutput value) {
        this.checkOutTitolarioByParamResult = value;
    }

}
