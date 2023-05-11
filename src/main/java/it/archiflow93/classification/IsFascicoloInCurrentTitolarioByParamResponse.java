
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
 *         &lt;element name="IsFascicoloInCurrentTitolarioByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}IsFascicoloInCurrentTitolarioOutput" minOccurs="0"/>
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
    "isFascicoloInCurrentTitolarioByParamResult"
})
@XmlRootElement(name = "IsFascicoloInCurrentTitolarioByParamResponse", namespace = "http://tempuri.org/")
public class IsFascicoloInCurrentTitolarioByParamResponse {

    @XmlElement(name = "IsFascicoloInCurrentTitolarioByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected IsFascicoloInCurrentTitolarioOutput isFascicoloInCurrentTitolarioByParamResult;

    /**
     * Gets the value of the isFascicoloInCurrentTitolarioByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link IsFascicoloInCurrentTitolarioOutput }
     *     
     */
    public IsFascicoloInCurrentTitolarioOutput getIsFascicoloInCurrentTitolarioByParamResult() {
        return isFascicoloInCurrentTitolarioByParamResult;
    }

    /**
     * Sets the value of the isFascicoloInCurrentTitolarioByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsFascicoloInCurrentTitolarioOutput }
     *     
     */
    public void setIsFascicoloInCurrentTitolarioByParamResult(IsFascicoloInCurrentTitolarioOutput value) {
        this.isFascicoloInCurrentTitolarioByParamResult = value;
    }

}
