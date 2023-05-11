
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
 *         &lt;element name="DeleteProxyResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}DeleteProxyOutput" minOccurs="0"/>
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
    "deleteProxyResult"
})
@XmlRootElement(name = "DeleteProxyResponse", namespace = "http://tempuri.org/")
public class DeleteProxyResponse {

    @XmlElement(name = "DeleteProxyResult", namespace = "http://tempuri.org/", nillable = true)
    protected DeleteProxyOutput deleteProxyResult;

    /**
     * Gets the value of the deleteProxyResult property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteProxyOutput }
     *     
     */
    public DeleteProxyOutput getDeleteProxyResult() {
        return deleteProxyResult;
    }

    /**
     * Sets the value of the deleteProxyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteProxyOutput }
     *     
     */
    public void setDeleteProxyResult(DeleteProxyOutput value) {
        this.deleteProxyResult = value;
    }

}
