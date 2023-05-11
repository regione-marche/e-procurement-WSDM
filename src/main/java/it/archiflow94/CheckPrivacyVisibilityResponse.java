
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
 *         &lt;element name="CheckPrivacyVisibilityResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}CheckPrivacyVisibilityOutput" minOccurs="0"/>
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
    "checkPrivacyVisibilityResult"
})
@XmlRootElement(name = "CheckPrivacyVisibilityResponse")
public class CheckPrivacyVisibilityResponse {

    @XmlElement(name = "CheckPrivacyVisibilityResult", nillable = true)
    protected CheckPrivacyVisibilityOutput checkPrivacyVisibilityResult;

    /**
     * Gets the value of the checkPrivacyVisibilityResult property.
     * 
     * @return
     *     possible object is
     *     {@link CheckPrivacyVisibilityOutput }
     *     
     */
    public CheckPrivacyVisibilityOutput getCheckPrivacyVisibilityResult() {
        return checkPrivacyVisibilityResult;
    }

    /**
     * Sets the value of the checkPrivacyVisibilityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckPrivacyVisibilityOutput }
     *     
     */
    public void setCheckPrivacyVisibilityResult(CheckPrivacyVisibilityOutput value) {
        this.checkPrivacyVisibilityResult = value;
    }

}
