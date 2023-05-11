
package it.archiflow94;

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
 *         &lt;element name="SetCardValidationByParamResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}SetCardValidationOutput" minOccurs="0"/>
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
    "setCardValidationByParamResult"
})
@XmlRootElement(name = "SetCardValidationByParamResponse")
public class SetCardValidationByParamResponse {

    @XmlElement(name = "SetCardValidationByParamResult", nillable = true)
    protected SetCardValidationOutput setCardValidationByParamResult;

    /**
     * Gets the value of the setCardValidationByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link SetCardValidationOutput }
     *     
     */
    public SetCardValidationOutput getSetCardValidationByParamResult() {
        return setCardValidationByParamResult;
    }

    /**
     * Sets the value of the setCardValidationByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetCardValidationOutput }
     *     
     */
    public void setSetCardValidationByParamResult(SetCardValidationOutput value) {
        this.setCardValidationByParamResult = value;
    }

}
