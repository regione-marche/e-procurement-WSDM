
package it.easydoc.MailManagerService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMailStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMailStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetMailStatusRequestType" type="{http://www.consorziocsa.it/easydoc/ws}GetMailStatusRequestType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMailStatus", propOrder = {
    "getMailStatusRequestType"
})
public class GetMailStatus {

    @XmlElement(name = "GetMailStatusRequestType", required = true)
    protected GetMailStatusRequestType getMailStatusRequestType;

    /**
     * Gets the value of the getMailStatusRequestType property.
     * 
     * @return
     *     possible object is
     *     {@link GetMailStatusRequestType }
     *     
     */
    public GetMailStatusRequestType getGetMailStatusRequestType() {
        return getMailStatusRequestType;
    }

    /**
     * Sets the value of the getMailStatusRequestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMailStatusRequestType }
     *     
     */
    public void setGetMailStatusRequestType(GetMailStatusRequestType value) {
        this.getMailStatusRequestType = value;
    }

}
