
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
 *         &lt;element name="RecoveryFascicoloByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}RecoveryFascicoloOutput" minOccurs="0"/>
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
    "recoveryFascicoloByParamResult"
})
@XmlRootElement(name = "RecoveryFascicoloByParamResponse", namespace = "http://tempuri.org/")
public class RecoveryFascicoloByParamResponse {

    @XmlElement(name = "RecoveryFascicoloByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected RecoveryFascicoloOutput recoveryFascicoloByParamResult;

    /**
     * Gets the value of the recoveryFascicoloByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link RecoveryFascicoloOutput }
     *     
     */
    public RecoveryFascicoloOutput getRecoveryFascicoloByParamResult() {
        return recoveryFascicoloByParamResult;
    }

    /**
     * Sets the value of the recoveryFascicoloByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecoveryFascicoloOutput }
     *     
     */
    public void setRecoveryFascicoloByParamResult(RecoveryFascicoloOutput value) {
        this.recoveryFascicoloByParamResult = value;
    }

}
