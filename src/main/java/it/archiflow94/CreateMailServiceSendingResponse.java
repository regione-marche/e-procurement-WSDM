
package it.archiflow94;

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
 *         &lt;element name="CreateMailServiceSendingResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Posting.ValueObject}CreateMailServiceSendingOutput" minOccurs="0"/>
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
    "createMailServiceSendingResult"
})
@XmlRootElement(name = "CreateMailServiceSendingResponse")
public class CreateMailServiceSendingResponse {

    @XmlElement(name = "CreateMailServiceSendingResult", nillable = true)
    protected CreateMailServiceSendingOutput createMailServiceSendingResult;

    /**
     * Gets the value of the createMailServiceSendingResult property.
     * 
     * @return
     *     possible object is
     *     {@link CreateMailServiceSendingOutput }
     *     
     */
    public CreateMailServiceSendingOutput getCreateMailServiceSendingResult() {
        return createMailServiceSendingResult;
    }

    /**
     * Sets the value of the createMailServiceSendingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateMailServiceSendingOutput }
     *     
     */
    public void setCreateMailServiceSendingResult(CreateMailServiceSendingOutput value) {
        this.createMailServiceSendingResult = value;
    }

}
