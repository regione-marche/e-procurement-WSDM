
package it.archiflow93;

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
 *         &lt;element name="DocumentDigestResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}DocumentDigestOutput" minOccurs="0"/>
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
    "documentDigestResult"
})
@XmlRootElement(name = "DocumentDigestResponse")
public class DocumentDigestResponse {

    @XmlElement(name = "DocumentDigestResult", nillable = true)
    protected DocumentDigestOutput documentDigestResult;

    /**
     * Gets the value of the documentDigestResult property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentDigestOutput }
     *     
     */
    public DocumentDigestOutput getDocumentDigestResult() {
        return documentDigestResult;
    }

    /**
     * Sets the value of the documentDigestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentDigestOutput }
     *     
     */
    public void setDocumentDigestResult(DocumentDigestOutput value) {
        this.documentDigestResult = value;
    }

}
