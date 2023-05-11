
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
 *         &lt;element name="IsTitolarioItemUsedByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}IsTitolarioItemUsedOutput" minOccurs="0"/>
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
    "isTitolarioItemUsedByParamResult"
})
@XmlRootElement(name = "IsTitolarioItemUsedByParamResponse", namespace = "http://tempuri.org/")
public class IsTitolarioItemUsedByParamResponse {

    @XmlElement(name = "IsTitolarioItemUsedByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected IsTitolarioItemUsedOutput isTitolarioItemUsedByParamResult;

    /**
     * Gets the value of the isTitolarioItemUsedByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link IsTitolarioItemUsedOutput }
     *     
     */
    public IsTitolarioItemUsedOutput getIsTitolarioItemUsedByParamResult() {
        return isTitolarioItemUsedByParamResult;
    }

    /**
     * Sets the value of the isTitolarioItemUsedByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsTitolarioItemUsedOutput }
     *     
     */
    public void setIsTitolarioItemUsedByParamResult(IsTitolarioItemUsedOutput value) {
        this.isTitolarioItemUsedByParamResult = value;
    }

}
