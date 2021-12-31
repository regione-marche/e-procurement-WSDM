
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
 *         &lt;element name="DeleteMailServerResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}DeleteMailServerOutput" minOccurs="0"/>
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
    "deleteMailServerResult"
})
@XmlRootElement(name = "DeleteMailServerResponse", namespace = "http://tempuri.org/")
public class DeleteMailServerResponse {

    @XmlElement(name = "DeleteMailServerResult", namespace = "http://tempuri.org/", nillable = true)
    protected DeleteMailServerOutput deleteMailServerResult;

    /**
     * Gets the value of the deleteMailServerResult property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteMailServerOutput }
     *     
     */
    public DeleteMailServerOutput getDeleteMailServerResult() {
        return deleteMailServerResult;
    }

    /**
     * Sets the value of the deleteMailServerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteMailServerOutput }
     *     
     */
    public void setDeleteMailServerResult(DeleteMailServerOutput value) {
        this.deleteMailServerResult = value;
    }

}
