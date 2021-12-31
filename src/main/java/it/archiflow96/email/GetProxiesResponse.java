
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
 *         &lt;element name="GetProxiesResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}GetProxiesOutput" minOccurs="0"/>
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
    "getProxiesResult"
})
@XmlRootElement(name = "GetProxiesResponse", namespace = "http://tempuri.org/")
public class GetProxiesResponse {

    @XmlElement(name = "GetProxiesResult", namespace = "http://tempuri.org/", nillable = true)
    protected GetProxiesOutput getProxiesResult;

    /**
     * Gets the value of the getProxiesResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetProxiesOutput }
     *     
     */
    public GetProxiesOutput getGetProxiesResult() {
        return getProxiesResult;
    }

    /**
     * Sets the value of the getProxiesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetProxiesOutput }
     *     
     */
    public void setGetProxiesResult(GetProxiesOutput value) {
        this.getProxiesResult = value;
    }

}
