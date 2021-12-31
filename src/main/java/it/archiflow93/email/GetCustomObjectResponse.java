
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
 *         &lt;element name="GetCustomObjectResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oCustomObject" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
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
    "getCustomObjectResult",
    "oCustomObject"
})
@XmlRootElement(name = "GetCustomObjectResponse", namespace = "http://tempuri.org/")
public class GetCustomObjectResponse {

    @XmlElement(name = "GetCustomObjectResult", namespace = "http://tempuri.org/")
    protected ResultInfo getCustomObjectResult;
    @XmlElement(namespace = "http://tempuri.org/", nillable = true)
    protected ArrayOfstring oCustomObject;

    /**
     * Gets the value of the getCustomObjectResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetCustomObjectResult() {
        return getCustomObjectResult;
    }

    /**
     * Sets the value of the getCustomObjectResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetCustomObjectResult(ResultInfo value) {
        this.getCustomObjectResult = value;
    }

    /**
     * Gets the value of the oCustomObject property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getOCustomObject() {
        return oCustomObject;
    }

    /**
     * Sets the value of the oCustomObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setOCustomObject(ArrayOfstring value) {
        this.oCustomObject = value;
    }

}
