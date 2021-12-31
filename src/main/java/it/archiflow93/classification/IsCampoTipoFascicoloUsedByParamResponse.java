
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
 *         &lt;element name="IsCampoTipoFascicoloUsedByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}IsCampoTipoFascicoloUsedOutput" minOccurs="0"/>
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
    "isCampoTipoFascicoloUsedByParamResult"
})
@XmlRootElement(name = "IsCampoTipoFascicoloUsedByParamResponse", namespace = "http://tempuri.org/")
public class IsCampoTipoFascicoloUsedByParamResponse {

    @XmlElement(name = "IsCampoTipoFascicoloUsedByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected IsCampoTipoFascicoloUsedOutput isCampoTipoFascicoloUsedByParamResult;

    /**
     * Gets the value of the isCampoTipoFascicoloUsedByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link IsCampoTipoFascicoloUsedOutput }
     *     
     */
    public IsCampoTipoFascicoloUsedOutput getIsCampoTipoFascicoloUsedByParamResult() {
        return isCampoTipoFascicoloUsedByParamResult;
    }

    /**
     * Sets the value of the isCampoTipoFascicoloUsedByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsCampoTipoFascicoloUsedOutput }
     *     
     */
    public void setIsCampoTipoFascicoloUsedByParamResult(IsCampoTipoFascicoloUsedOutput value) {
        this.isCampoTipoFascicoloUsedByParamResult = value;
    }

}
