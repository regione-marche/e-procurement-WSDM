
package it.archiflow93.classification;

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
 *         &lt;element name="SendFascicoloByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}SendFascicoloOutput" minOccurs="0"/>
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
    "sendFascicoloByParamResult"
})
@XmlRootElement(name = "SendFascicoloByParamResponse", namespace = "http://tempuri.org/")
public class SendFascicoloByParamResponse {

    @XmlElement(name = "SendFascicoloByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected SendFascicoloOutput sendFascicoloByParamResult;

    /**
     * Gets the value of the sendFascicoloByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link SendFascicoloOutput }
     *     
     */
    public SendFascicoloOutput getSendFascicoloByParamResult() {
        return sendFascicoloByParamResult;
    }

    /**
     * Sets the value of the sendFascicoloByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendFascicoloOutput }
     *     
     */
    public void setSendFascicoloByParamResult(SendFascicoloOutput value) {
        this.sendFascicoloByParamResult = value;
    }

}
