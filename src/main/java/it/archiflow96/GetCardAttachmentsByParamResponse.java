
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
 *         &lt;element name="GetCardAttachmentsByParamResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}GetCardAttachmentsByParamOutput" minOccurs="0"/>
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
    "getCardAttachmentsByParamResult"
})
@XmlRootElement(name = "GetCardAttachmentsByParamResponse")
public class GetCardAttachmentsByParamResponse {

    @XmlElement(name = "GetCardAttachmentsByParamResult", nillable = true)
    protected GetCardAttachmentsByParamOutput getCardAttachmentsByParamResult;

    /**
     * Gets the value of the getCardAttachmentsByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetCardAttachmentsByParamOutput }
     *     
     */
    public GetCardAttachmentsByParamOutput getGetCardAttachmentsByParamResult() {
        return getCardAttachmentsByParamResult;
    }

    /**
     * Sets the value of the getCardAttachmentsByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCardAttachmentsByParamOutput }
     *     
     */
    public void setGetCardAttachmentsByParamResult(GetCardAttachmentsByParamOutput value) {
        this.getCardAttachmentsByParamResult = value;
    }

}
