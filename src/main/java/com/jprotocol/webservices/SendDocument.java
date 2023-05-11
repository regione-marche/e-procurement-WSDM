
package com.jprotocol.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceRequest" type="{http://WebServices.jprotocol.com/}mailServiceRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendDocument", propOrder = {
    "serviceRequest"
})
public class SendDocument {

    @XmlElement(name = "ServiceRequest")
    protected MailServiceRequest serviceRequest;

    /**
     * Gets the value of the serviceRequest property.
     * 
     * @return
     *     possible object is
     *     {@link MailServiceRequest }
     *     
     */
    public MailServiceRequest getServiceRequest() {
        return serviceRequest;
    }

    /**
     * Sets the value of the serviceRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailServiceRequest }
     *     
     */
    public void setServiceRequest(MailServiceRequest value) {
        this.serviceRequest = value;
    }

}
