
package it.easydoc.rest.protocol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAoosRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAoosRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.consorziocsa.it/easydoc/ws}RoledUserProtocolServiceRequest">
 *       &lt;sequence>
 *         &lt;element name="UserAccessibleOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAoosRequestType", propOrder = {
    "userAccessibleOnly"
})
public class GetAoosRequestType
    extends RoledUserProtocolServiceRequest
{

    @XmlElement(name = "UserAccessibleOnly", defaultValue = "false")
    protected Boolean userAccessibleOnly;

    /**
     * Gets the value of the userAccessibleOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserAccessibleOnly() {
        return userAccessibleOnly;
    }

    /**
     * Sets the value of the userAccessibleOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserAccessibleOnly(Boolean value) {
        this.userAccessibleOnly = value;
    }

}
