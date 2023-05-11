
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
 *         &lt;element name="InsModMailBoxResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}InsModMailBoxOutput" minOccurs="0"/>
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
    "insModMailBoxResult"
})
@XmlRootElement(name = "InsModMailBoxResponse", namespace = "http://tempuri.org/")
public class InsModMailBoxResponse {

    @XmlElement(name = "InsModMailBoxResult", namespace = "http://tempuri.org/", nillable = true)
    protected InsModMailBoxOutput insModMailBoxResult;

    /**
     * Gets the value of the insModMailBoxResult property.
     * 
     * @return
     *     possible object is
     *     {@link InsModMailBoxOutput }
     *     
     */
    public InsModMailBoxOutput getInsModMailBoxResult() {
        return insModMailBoxResult;
    }

    /**
     * Sets the value of the insModMailBoxResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsModMailBoxOutput }
     *     
     */
    public void setInsModMailBoxResult(InsModMailBoxOutput value) {
        this.insModMailBoxResult = value;
    }

}
