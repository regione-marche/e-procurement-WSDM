
package it.archiflow94;

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
 *         &lt;element name="GetEmailPropsByCardIdResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Posting.ValueObject}GetEmailPropsByCardIdOutput" minOccurs="0"/>
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
    "getEmailPropsByCardIdResult"
})
@XmlRootElement(name = "GetEmailPropsByCardIdResponse")
public class GetEmailPropsByCardIdResponse {

    @XmlElement(name = "GetEmailPropsByCardIdResult", nillable = true)
    protected GetEmailPropsByCardIdOutput getEmailPropsByCardIdResult;

    /**
     * Gets the value of the getEmailPropsByCardIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetEmailPropsByCardIdOutput }
     *     
     */
    public GetEmailPropsByCardIdOutput getGetEmailPropsByCardIdResult() {
        return getEmailPropsByCardIdResult;
    }

    /**
     * Sets the value of the getEmailPropsByCardIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetEmailPropsByCardIdOutput }
     *     
     */
    public void setGetEmailPropsByCardIdResult(GetEmailPropsByCardIdOutput value) {
        this.getEmailPropsByCardIdResult = value;
    }

}
