
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
 *         &lt;element name="ChangePasswordByParamResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Login.ValueObject}ChangePasswordOutput" minOccurs="0"/>
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
    "changePasswordByParamResult"
})
@XmlRootElement(name = "ChangePasswordByParamResponse")
public class ChangePasswordByParamResponse {

    @XmlElement(name = "ChangePasswordByParamResult", nillable = true)
    protected ChangePasswordOutput changePasswordByParamResult;

    /**
     * Gets the value of the changePasswordByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link ChangePasswordOutput }
     *     
     */
    public ChangePasswordOutput getChangePasswordByParamResult() {
        return changePasswordByParamResult;
    }

    /**
     * Sets the value of the changePasswordByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangePasswordOutput }
     *     
     */
    public void setChangePasswordByParamResult(ChangePasswordOutput value) {
        this.changePasswordByParamResult = value;
    }

}
