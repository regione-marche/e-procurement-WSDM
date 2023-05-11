
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
 *         &lt;element name="SendEMailResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oCardMailOutId" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
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
    "sendEMailResult",
    "oCardMailOutId"
})
@XmlRootElement(name = "SendEMailResponse", namespace = "http://tempuri.org/")
public class SendEMailResponse {

    @XmlElement(name = "SendEMailResult", namespace = "http://tempuri.org/")
    protected ResultInfo sendEMailResult;
    @XmlElement(namespace = "http://tempuri.org/", nillable = true)
    protected ArrayOfguid oCardMailOutId;

    /**
     * Gets the value of the sendEMailResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getSendEMailResult() {
        return sendEMailResult;
    }

    /**
     * Sets the value of the sendEMailResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setSendEMailResult(ResultInfo value) {
        this.sendEMailResult = value;
    }

    /**
     * Gets the value of the oCardMailOutId property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfguid }
     *     
     */
    public ArrayOfguid getOCardMailOutId() {
        return oCardMailOutId;
    }

    /**
     * Sets the value of the oCardMailOutId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfguid }
     *     
     */
    public void setOCardMailOutId(ArrayOfguid value) {
        this.oCardMailOutId = value;
    }

}
