
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
 *         &lt;element name="ReadFascicoloVisibilityPrivacyByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}ReadFascicoloVisibilityPrivacyOutput" minOccurs="0"/>
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
    "readFascicoloVisibilityPrivacyByParamResult"
})
@XmlRootElement(name = "ReadFascicoloVisibilityPrivacyByParamResponse", namespace = "http://tempuri.org/")
public class ReadFascicoloVisibilityPrivacyByParamResponse {

    @XmlElement(name = "ReadFascicoloVisibilityPrivacyByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected ReadFascicoloVisibilityPrivacyOutput readFascicoloVisibilityPrivacyByParamResult;

    /**
     * Gets the value of the readFascicoloVisibilityPrivacyByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReadFascicoloVisibilityPrivacyOutput }
     *     
     */
    public ReadFascicoloVisibilityPrivacyOutput getReadFascicoloVisibilityPrivacyByParamResult() {
        return readFascicoloVisibilityPrivacyByParamResult;
    }

    /**
     * Sets the value of the readFascicoloVisibilityPrivacyByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadFascicoloVisibilityPrivacyOutput }
     *     
     */
    public void setReadFascicoloVisibilityPrivacyByParamResult(ReadFascicoloVisibilityPrivacyOutput value) {
        this.readFascicoloVisibilityPrivacyByParamResult = value;
    }

}
