
package it.kdm.docer.core.authentication;

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
 *         &lt;element name="AuthenticationServiceException" type="{http://authentication.core.docer.kdm.it}Exception" minOccurs="0"/>
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
    "authenticationServiceException"
})
@XmlRootElement(name = "AuthenticationServiceException")
public class AuthenticationServiceException {

    @XmlElement(name = "AuthenticationServiceException", nillable = true)
    protected Exception authenticationServiceException;

    /**
     * Gets the value of the authenticationServiceException property.
     * 
     * @return
     *     possible object is
     *     {@link Exception }
     *     
     */
    public Exception getAuthenticationServiceException() {
        return authenticationServiceException;
    }

    /**
     * Sets the value of the authenticationServiceException property.
     * 
     * @param value
     *     allowed object is
     *     {@link Exception }
     *     
     */
    public void setAuthenticationServiceException(Exception value) {
        this.authenticationServiceException = value;
    }

}
