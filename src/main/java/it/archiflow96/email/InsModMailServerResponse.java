
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
 *         &lt;element name="InsModMailServerResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}InsModMailServerOutput" minOccurs="0"/>
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
    "insModMailServerResult"
})
@XmlRootElement(name = "InsModMailServerResponse", namespace = "http://tempuri.org/")
public class InsModMailServerResponse {

    @XmlElement(name = "InsModMailServerResult", namespace = "http://tempuri.org/", nillable = true)
    protected InsModMailServerOutput insModMailServerResult;

    /**
     * Gets the value of the insModMailServerResult property.
     * 
     * @return
     *     possible object is
     *     {@link InsModMailServerOutput }
     *     
     */
    public InsModMailServerOutput getInsModMailServerResult() {
        return insModMailServerResult;
    }

    /**
     * Sets the value of the insModMailServerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsModMailServerOutput }
     *     
     */
    public void setInsModMailServerResult(InsModMailServerOutput value) {
        this.insModMailServerResult = value;
    }

}
