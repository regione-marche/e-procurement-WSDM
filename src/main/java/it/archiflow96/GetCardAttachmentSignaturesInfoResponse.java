
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
 *         &lt;element name="GetCardAttachmentSignaturesInfoResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}GetCardAttachmentSignaturesInfoOutput" minOccurs="0"/>
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
    "getCardAttachmentSignaturesInfoResult"
})
@XmlRootElement(name = "GetCardAttachmentSignaturesInfoResponse")
public class GetCardAttachmentSignaturesInfoResponse {

    @XmlElement(name = "GetCardAttachmentSignaturesInfoResult", nillable = true)
    protected GetCardAttachmentSignaturesInfoOutput getCardAttachmentSignaturesInfoResult;

    /**
     * Gets the value of the getCardAttachmentSignaturesInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetCardAttachmentSignaturesInfoOutput }
     *     
     */
    public GetCardAttachmentSignaturesInfoOutput getGetCardAttachmentSignaturesInfoResult() {
        return getCardAttachmentSignaturesInfoResult;
    }

    /**
     * Sets the value of the getCardAttachmentSignaturesInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCardAttachmentSignaturesInfoOutput }
     *     
     */
    public void setGetCardAttachmentSignaturesInfoResult(GetCardAttachmentSignaturesInfoOutput value) {
        this.getCardAttachmentSignaturesInfoResult = value;
    }

}
