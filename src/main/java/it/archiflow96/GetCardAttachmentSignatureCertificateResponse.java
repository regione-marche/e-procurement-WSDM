
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
 *         &lt;element name="GetCardAttachmentSignatureCertificateResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}GetCardAttachmentSignatureCertificateOutput" minOccurs="0"/>
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
    "getCardAttachmentSignatureCertificateResult"
})
@XmlRootElement(name = "GetCardAttachmentSignatureCertificateResponse")
public class GetCardAttachmentSignatureCertificateResponse {

    @XmlElement(name = "GetCardAttachmentSignatureCertificateResult", nillable = true)
    protected GetCardAttachmentSignatureCertificateOutput getCardAttachmentSignatureCertificateResult;

    /**
     * Gets the value of the getCardAttachmentSignatureCertificateResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetCardAttachmentSignatureCertificateOutput }
     *     
     */
    public GetCardAttachmentSignatureCertificateOutput getGetCardAttachmentSignatureCertificateResult() {
        return getCardAttachmentSignatureCertificateResult;
    }

    /**
     * Sets the value of the getCardAttachmentSignatureCertificateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCardAttachmentSignatureCertificateOutput }
     *     
     */
    public void setGetCardAttachmentSignatureCertificateResult(GetCardAttachmentSignatureCertificateOutput value) {
        this.getCardAttachmentSignatureCertificateResult = value;
    }

}
