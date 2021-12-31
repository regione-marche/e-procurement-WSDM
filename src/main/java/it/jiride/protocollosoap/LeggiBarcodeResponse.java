
package it.jiride.protocollosoap;

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
 *         &lt;element name="LeggiBarcodeResult" type="{http://tempuri.org/}DocumentoOut"/>
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
    "leggiBarcodeResult"
})
@XmlRootElement(name = "LeggiBarcodeResponse")
public class LeggiBarcodeResponse {

    @XmlElement(name = "LeggiBarcodeResult", required = true)
    protected DocumentoOut leggiBarcodeResult;

    /**
     * Gets the value of the leggiBarcodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoOut }
     *     
     */
    public DocumentoOut getLeggiBarcodeResult() {
        return leggiBarcodeResult;
    }

    /**
     * Sets the value of the leggiBarcodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoOut }
     *     
     */
    public void setLeggiBarcodeResult(DocumentoOut value) {
        this.leggiBarcodeResult = value;
    }

}
