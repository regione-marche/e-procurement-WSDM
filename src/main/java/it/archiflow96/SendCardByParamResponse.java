
package it.archiflow96;

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
 *         &lt;element name="SendCardByParamResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}SendCardOutput" minOccurs="0"/>
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
    "sendCardByParamResult"
})
@XmlRootElement(name = "SendCardByParamResponse")
public class SendCardByParamResponse {

    @XmlElement(name = "SendCardByParamResult", nillable = true)
    protected SendCardOutput sendCardByParamResult;

    /**
     * Gets the value of the sendCardByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link SendCardOutput }
     *     
     */
    public SendCardOutput getSendCardByParamResult() {
        return sendCardByParamResult;
    }

    /**
     * Sets the value of the sendCardByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendCardOutput }
     *     
     */
    public void setSendCardByParamResult(SendCardOutput value) {
        this.sendCardByParamResult = value;
    }

}
