
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
 *         &lt;element name="IsTipoFascicoloUsedByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}IsTipoFascicoloUsedOutput" minOccurs="0"/>
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
    "isTipoFascicoloUsedByParamResult"
})
@XmlRootElement(name = "IsTipoFascicoloUsedByParamResponse", namespace = "http://tempuri.org/")
public class IsTipoFascicoloUsedByParamResponse {

    @XmlElement(name = "IsTipoFascicoloUsedByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected IsTipoFascicoloUsedOutput isTipoFascicoloUsedByParamResult;

    /**
     * Gets the value of the isTipoFascicoloUsedByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link IsTipoFascicoloUsedOutput }
     *     
     */
    public IsTipoFascicoloUsedOutput getIsTipoFascicoloUsedByParamResult() {
        return isTipoFascicoloUsedByParamResult;
    }

    /**
     * Sets the value of the isTipoFascicoloUsedByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsTipoFascicoloUsedOutput }
     *     
     */
    public void setIsTipoFascicoloUsedByParamResult(IsTipoFascicoloUsedOutput value) {
        this.isTipoFascicoloUsedByParamResult = value;
    }

}
