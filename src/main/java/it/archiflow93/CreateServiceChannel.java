
package it.archiflow93;

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
 *         &lt;element name="sessionInfo" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Login.ValueObject}SessionInfo" minOccurs="0"/>
 *         &lt;element name="serviceChannel" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject}ServiceChannel" minOccurs="0"/>
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
    "sessionInfo",
    "serviceChannel"
})
@XmlRootElement(name = "CreateServiceChannel")
public class CreateServiceChannel {

    @XmlElement(nillable = true)
    protected SessionInfo sessionInfo;
    @XmlElement(nillable = true)
    protected ServiceChannel serviceChannel;

    /**
     * Gets the value of the sessionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SessionInfo }
     *     
     */
    public SessionInfo getSessionInfo() {
        return sessionInfo;
    }

    /**
     * Sets the value of the sessionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionInfo }
     *     
     */
    public void setSessionInfo(SessionInfo value) {
        this.sessionInfo = value;
    }

    /**
     * Gets the value of the serviceChannel property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceChannel }
     *     
     */
    public ServiceChannel getServiceChannel() {
        return serviceChannel;
    }

    /**
     * Sets the value of the serviceChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceChannel }
     *     
     */
    public void setServiceChannel(ServiceChannel value) {
        this.serviceChannel = value;
    }

}
