
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
 *         &lt;element name="DeleteMailBoxResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}DeleteMailBoxOutput" minOccurs="0"/>
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
    "deleteMailBoxResult"
})
@XmlRootElement(name = "DeleteMailBoxResponse", namespace = "http://tempuri.org/")
public class DeleteMailBoxResponse {

    @XmlElement(name = "DeleteMailBoxResult", namespace = "http://tempuri.org/", nillable = true)
    protected DeleteMailBoxOutput deleteMailBoxResult;

    /**
     * Gets the value of the deleteMailBoxResult property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteMailBoxOutput }
     *     
     */
    public DeleteMailBoxOutput getDeleteMailBoxResult() {
        return deleteMailBoxResult;
    }

    /**
     * Sets the value of the deleteMailBoxResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteMailBoxOutput }
     *     
     */
    public void setDeleteMailBoxResult(DeleteMailBoxOutput value) {
        this.deleteMailBoxResult = value;
    }

}
