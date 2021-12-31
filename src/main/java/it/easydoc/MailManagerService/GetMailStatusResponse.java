
package it.easydoc.MailManagerService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMailStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMailStatusResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetMailStatusResponseType" type="{http://www.consorziocsa.it/easydoc/ws}GetMailStatusResponseType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMailStatusResponse", propOrder = {
    "getMailStatusResponseType"
})
public class GetMailStatusResponse {

    @XmlElement(name = "GetMailStatusResponseType", required = true)
    protected GetMailStatusResponseType getMailStatusResponseType;

    /**
     * Gets the value of the getMailStatusResponseType property.
     * 
     * @return
     *     possible object is
     *     {@link GetMailStatusResponseType }
     *     
     */
    public GetMailStatusResponseType getGetMailStatusResponseType() {
        return getMailStatusResponseType;
    }

    /**
     * Sets the value of the getMailStatusResponseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMailStatusResponseType }
     *     
     */
    public void setGetMailStatusResponseType(GetMailStatusResponseType value) {
        this.getMailStatusResponseType = value;
    }

}
