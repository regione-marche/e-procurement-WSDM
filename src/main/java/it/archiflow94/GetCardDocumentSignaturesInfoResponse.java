
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
 *         &lt;element name="GetCardDocumentSignaturesInfoResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}GetCardDocumentSignaturesInfoOutput" minOccurs="0"/>
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
    "getCardDocumentSignaturesInfoResult"
})
@XmlRootElement(name = "GetCardDocumentSignaturesInfoResponse")
public class GetCardDocumentSignaturesInfoResponse {

    @XmlElement(name = "GetCardDocumentSignaturesInfoResult", nillable = true)
    protected GetCardDocumentSignaturesInfoOutput getCardDocumentSignaturesInfoResult;

    /**
     * Gets the value of the getCardDocumentSignaturesInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetCardDocumentSignaturesInfoOutput }
     *     
     */
    public GetCardDocumentSignaturesInfoOutput getGetCardDocumentSignaturesInfoResult() {
        return getCardDocumentSignaturesInfoResult;
    }

    /**
     * Sets the value of the getCardDocumentSignaturesInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCardDocumentSignaturesInfoOutput }
     *     
     */
    public void setGetCardDocumentSignaturesInfoResult(GetCardDocumentSignaturesInfoOutput value) {
        this.getCardDocumentSignaturesInfoResult = value;
    }

}
