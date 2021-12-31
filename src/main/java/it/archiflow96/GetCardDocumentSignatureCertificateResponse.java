
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
 *         &lt;element name="GetCardDocumentSignatureCertificateResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}GetCardDocumentSignatureCertificateOutput" minOccurs="0"/>
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
    "getCardDocumentSignatureCertificateResult"
})
@XmlRootElement(name = "GetCardDocumentSignatureCertificateResponse")
public class GetCardDocumentSignatureCertificateResponse {

    @XmlElement(name = "GetCardDocumentSignatureCertificateResult", nillable = true)
    protected GetCardDocumentSignatureCertificateOutput getCardDocumentSignatureCertificateResult;

    /**
     * Gets the value of the getCardDocumentSignatureCertificateResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetCardDocumentSignatureCertificateOutput }
     *     
     */
    public GetCardDocumentSignatureCertificateOutput getGetCardDocumentSignatureCertificateResult() {
        return getCardDocumentSignatureCertificateResult;
    }

    /**
     * Sets the value of the getCardDocumentSignatureCertificateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCardDocumentSignatureCertificateOutput }
     *     
     */
    public void setGetCardDocumentSignatureCertificateResult(GetCardDocumentSignatureCertificateOutput value) {
        this.getCardDocumentSignatureCertificateResult = value;
    }

}
