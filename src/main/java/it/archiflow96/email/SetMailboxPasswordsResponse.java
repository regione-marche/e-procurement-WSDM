
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
 *         &lt;element name="SetMailboxPasswordsResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}SetMailboxPasswordsOutput" minOccurs="0"/>
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
    "setMailboxPasswordsResult"
})
@XmlRootElement(name = "SetMailboxPasswordsResponse", namespace = "http://tempuri.org/")
public class SetMailboxPasswordsResponse {

    @XmlElement(name = "SetMailboxPasswordsResult", namespace = "http://tempuri.org/", nillable = true)
    protected SetMailboxPasswordsOutput setMailboxPasswordsResult;

    /**
     * Gets the value of the setMailboxPasswordsResult property.
     * 
     * @return
     *     possible object is
     *     {@link SetMailboxPasswordsOutput }
     *     
     */
    public SetMailboxPasswordsOutput getSetMailboxPasswordsResult() {
        return setMailboxPasswordsResult;
    }

    /**
     * Sets the value of the setMailboxPasswordsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetMailboxPasswordsOutput }
     *     
     */
    public void setSetMailboxPasswordsResult(SetMailboxPasswordsOutput value) {
        this.setMailboxPasswordsResult = value;
    }

}
