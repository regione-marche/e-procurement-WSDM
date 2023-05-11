
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
 *         &lt;element name="IsFascicoloUsedByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}IsFascicoloUsedOutput" minOccurs="0"/>
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
    "isFascicoloUsedByParamResult"
})
@XmlRootElement(name = "IsFascicoloUsedByParamResponse", namespace = "http://tempuri.org/")
public class IsFascicoloUsedByParamResponse {

    @XmlElement(name = "IsFascicoloUsedByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected IsFascicoloUsedOutput isFascicoloUsedByParamResult;

    /**
     * Gets the value of the isFascicoloUsedByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link IsFascicoloUsedOutput }
     *     
     */
    public IsFascicoloUsedOutput getIsFascicoloUsedByParamResult() {
        return isFascicoloUsedByParamResult;
    }

    /**
     * Sets the value of the isFascicoloUsedByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsFascicoloUsedOutput }
     *     
     */
    public void setIsFascicoloUsedByParamResult(IsFascicoloUsedOutput value) {
        this.isFascicoloUsedByParamResult = value;
    }

}
