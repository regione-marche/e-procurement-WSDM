
package it.archiflow96.email;

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
 *         &lt;element name="GetMailServersResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}GetMailServersOutput" minOccurs="0"/>
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
    "getMailServersResult"
})
@XmlRootElement(name = "GetMailServersResponse", namespace = "http://tempuri.org/")
public class GetMailServersResponse {

    @XmlElement(name = "GetMailServersResult", namespace = "http://tempuri.org/", nillable = true)
    protected GetMailServersOutput getMailServersResult;

    /**
     * Gets the value of the getMailServersResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetMailServersOutput }
     *     
     */
    public GetMailServersOutput getGetMailServersResult() {
        return getMailServersResult;
    }

    /**
     * Sets the value of the getMailServersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMailServersOutput }
     *     
     */
    public void setGetMailServersResult(GetMailServersOutput value) {
        this.getMailServersResult = value;
    }

}
