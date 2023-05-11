
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
 *         &lt;element name="IsTitolarioUsedByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}IsTitolarioUsedOutput" minOccurs="0"/>
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
    "isTitolarioUsedByParamResult"
})
@XmlRootElement(name = "IsTitolarioUsedByParamResponse", namespace = "http://tempuri.org/")
public class IsTitolarioUsedByParamResponse {

    @XmlElement(name = "IsTitolarioUsedByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected IsTitolarioUsedOutput isTitolarioUsedByParamResult;

    /**
     * Gets the value of the isTitolarioUsedByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link IsTitolarioUsedOutput }
     *     
     */
    public IsTitolarioUsedOutput getIsTitolarioUsedByParamResult() {
        return isTitolarioUsedByParamResult;
    }

    /**
     * Sets the value of the isTitolarioUsedByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsTitolarioUsedOutput }
     *     
     */
    public void setIsTitolarioUsedByParamResult(IsTitolarioUsedOutput value) {
        this.isTitolarioUsedByParamResult = value;
    }

}
