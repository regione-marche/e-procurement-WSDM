
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternNotification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OfficesAddress" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternNotifications.ValueObject}ArrayOfExternNotificationOffice" minOccurs="0"/>
 *         &lt;element name="UsersAddress" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternNotifications.ValueObject}ExternNotificationUsers" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternNotification", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternNotifications.ValueObject", propOrder = {
    "officesAddress",
    "usersAddress"
})
public class ExternNotification {

    @XmlElement(name = "OfficesAddress", nillable = true)
    protected ArrayOfExternNotificationOffice officesAddress;
    @XmlElement(name = "UsersAddress", nillable = true)
    protected ExternNotificationUsers usersAddress;

    /**
     * Gets the value of the officesAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExternNotificationOffice }
     *     
     */
    public ArrayOfExternNotificationOffice getOfficesAddress() {
        return officesAddress;
    }

    /**
     * Sets the value of the officesAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExternNotificationOffice }
     *     
     */
    public void setOfficesAddress(ArrayOfExternNotificationOffice value) {
        this.officesAddress = value;
    }

    /**
     * Gets the value of the usersAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ExternNotificationUsers }
     *     
     */
    public ExternNotificationUsers getUsersAddress() {
        return usersAddress;
    }

    /**
     * Sets the value of the usersAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternNotificationUsers }
     *     
     */
    public void setUsersAddress(ExternNotificationUsers value) {
        this.usersAddress = value;
    }

}
