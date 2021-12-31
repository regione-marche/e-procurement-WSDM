
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
 *         &lt;element name="SendFolderByExternalMailResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}SendFolderByExternalMailOutput" minOccurs="0"/>
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
    "sendFolderByExternalMailResult"
})
@XmlRootElement(name = "SendFolderByExternalMailResponse", namespace = "http://tempuri.org/")
public class SendFolderByExternalMailResponse {

    @XmlElement(name = "SendFolderByExternalMailResult", namespace = "http://tempuri.org/", nillable = true)
    protected SendFolderByExternalMailOutput sendFolderByExternalMailResult;

    /**
     * Gets the value of the sendFolderByExternalMailResult property.
     * 
     * @return
     *     possible object is
     *     {@link SendFolderByExternalMailOutput }
     *     
     */
    public SendFolderByExternalMailOutput getSendFolderByExternalMailResult() {
        return sendFolderByExternalMailResult;
    }

    /**
     * Sets the value of the sendFolderByExternalMailResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendFolderByExternalMailOutput }
     *     
     */
    public void setSendFolderByExternalMailResult(SendFolderByExternalMailOutput value) {
        this.sendFolderByExternalMailResult = value;
    }

}
