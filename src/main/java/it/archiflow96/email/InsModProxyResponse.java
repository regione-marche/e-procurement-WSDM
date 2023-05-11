
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
 *         &lt;element name="InsModProxyResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}InsModProxyOutput" minOccurs="0"/>
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
    "insModProxyResult"
})
@XmlRootElement(name = "InsModProxyResponse", namespace = "http://tempuri.org/")
public class InsModProxyResponse {

    @XmlElement(name = "InsModProxyResult", namespace = "http://tempuri.org/", nillable = true)
    protected InsModProxyOutput insModProxyResult;

    /**
     * Gets the value of the insModProxyResult property.
     * 
     * @return
     *     possible object is
     *     {@link InsModProxyOutput }
     *     
     */
    public InsModProxyOutput getInsModProxyResult() {
        return insModProxyResult;
    }

    /**
     * Sets the value of the insModProxyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsModProxyOutput }
     *     
     */
    public void setInsModProxyResult(InsModProxyOutput value) {
        this.insModProxyResult = value;
    }

}
