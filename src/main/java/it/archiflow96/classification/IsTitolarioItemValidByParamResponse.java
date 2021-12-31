
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
 *         &lt;element name="IsTitolarioItemValidByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}IsTitolarioItemValidOutput" minOccurs="0"/>
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
    "isTitolarioItemValidByParamResult"
})
@XmlRootElement(name = "IsTitolarioItemValidByParamResponse", namespace = "http://tempuri.org/")
public class IsTitolarioItemValidByParamResponse {

    @XmlElement(name = "IsTitolarioItemValidByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected IsTitolarioItemValidOutput isTitolarioItemValidByParamResult;

    /**
     * Gets the value of the isTitolarioItemValidByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link IsTitolarioItemValidOutput }
     *     
     */
    public IsTitolarioItemValidOutput getIsTitolarioItemValidByParamResult() {
        return isTitolarioItemValidByParamResult;
    }

    /**
     * Sets the value of the isTitolarioItemValidByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsTitolarioItemValidOutput }
     *     
     */
    public void setIsTitolarioItemValidByParamResult(IsTitolarioItemValidOutput value) {
        this.isTitolarioItemValidByParamResult = value;
    }

}
