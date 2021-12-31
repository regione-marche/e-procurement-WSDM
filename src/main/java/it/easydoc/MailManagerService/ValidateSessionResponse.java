
package it.easydoc.MailManagerService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidateSessionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateSessionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GenericServiceResponse" type="{http://www.consorziocsa.it/easydoc/ws}GenericServiceResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateSessionResponse", propOrder = {
    "genericServiceResponse"
})
public class ValidateSessionResponse {

    @XmlElement(name = "GenericServiceResponse", required = true)
    protected GenericServiceResponse genericServiceResponse;

    /**
     * Gets the value of the genericServiceResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GenericServiceResponse }
     *     
     */
    public GenericServiceResponse getGenericServiceResponse() {
        return genericServiceResponse;
    }

    /**
     * Sets the value of the genericServiceResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericServiceResponse }
     *     
     */
    public void setGenericServiceResponse(GenericServiceResponse value) {
        this.genericServiceResponse = value;
    }

}
