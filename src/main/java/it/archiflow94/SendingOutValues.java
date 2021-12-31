
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendingOutValues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendingOutValues">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExternMailNotification" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternNotifications.ValueObject}ExternNotification" minOccurs="0"/>
 *         &lt;element name="ExternMailNotificationXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendingOutValues", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "externMailNotification",
    "externMailNotificationXML"
})
public class SendingOutValues {

    @XmlElement(name = "ExternMailNotification", nillable = true)
    protected ExternNotification externMailNotification;
    @XmlElement(name = "ExternMailNotificationXML", nillable = true)
    protected String externMailNotificationXML;

    /**
     * Gets the value of the externMailNotification property.
     * 
     * @return
     *     possible object is
     *     {@link ExternNotification }
     *     
     */
    public ExternNotification getExternMailNotification() {
        return externMailNotification;
    }

    /**
     * Sets the value of the externMailNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternNotification }
     *     
     */
    public void setExternMailNotification(ExternNotification value) {
        this.externMailNotification = value;
    }

    /**
     * Gets the value of the externMailNotificationXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternMailNotificationXML() {
        return externMailNotificationXML;
    }

    /**
     * Sets the value of the externMailNotificationXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternMailNotificationXML(String value) {
        this.externMailNotificationXML = value;
    }

}
