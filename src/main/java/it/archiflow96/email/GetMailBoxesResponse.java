
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
 *         &lt;element name="GetMailBoxesResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}GetMailBoxesOutput" minOccurs="0"/>
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
    "getMailBoxesResult"
})
@XmlRootElement(name = "GetMailBoxesResponse", namespace = "http://tempuri.org/")
public class GetMailBoxesResponse {

    @XmlElement(name = "GetMailBoxesResult", namespace = "http://tempuri.org/", nillable = true)
    protected GetMailBoxesOutput getMailBoxesResult;

    /**
     * Gets the value of the getMailBoxesResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetMailBoxesOutput }
     *     
     */
    public GetMailBoxesOutput getGetMailBoxesResult() {
        return getMailBoxesResult;
    }

    /**
     * Sets the value of the getMailBoxesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMailBoxesOutput }
     *     
     */
    public void setGetMailBoxesResult(GetMailBoxesOutput value) {
        this.getMailBoxesResult = value;
    }

}
