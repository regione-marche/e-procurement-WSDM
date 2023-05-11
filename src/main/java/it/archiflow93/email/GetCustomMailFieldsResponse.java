
package it.archiflow93.email;

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
 *         &lt;element name="GetCustomMailFieldsResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}GetCustomMailFieldsOutput" minOccurs="0"/>
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
    "getCustomMailFieldsResult"
})
@XmlRootElement(name = "GetCustomMailFieldsResponse", namespace = "http://tempuri.org/")
public class GetCustomMailFieldsResponse {

    @XmlElement(name = "GetCustomMailFieldsResult", namespace = "http://tempuri.org/", nillable = true)
    protected GetCustomMailFieldsOutput getCustomMailFieldsResult;

    /**
     * Gets the value of the getCustomMailFieldsResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetCustomMailFieldsOutput }
     *     
     */
    public GetCustomMailFieldsOutput getGetCustomMailFieldsResult() {
        return getCustomMailFieldsResult;
    }

    /**
     * Sets the value of the getCustomMailFieldsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomMailFieldsOutput }
     *     
     */
    public void setGetCustomMailFieldsResult(GetCustomMailFieldsOutput value) {
        this.getCustomMailFieldsResult = value;
    }

}
