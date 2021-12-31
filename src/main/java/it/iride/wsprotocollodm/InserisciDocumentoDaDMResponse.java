
package it.iride.wsprotocollodm;

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
 *         &lt;element name="DocumentumOut" type="{http://tempuri.org/}DocumentumOut"/>
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
    "documentumOut"
})
@XmlRootElement(name = "InserisciDocumentoDaDMResponse")
public class InserisciDocumentoDaDMResponse {

    @XmlElement(name = "DocumentumOut", required = true, nillable = true)
    protected DocumentumOut documentumOut;

    /**
     * Gets the value of the documentumOut property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentumOut }
     *     
     */
    public DocumentumOut getDocumentumOut() {
        return documentumOut;
    }

    /**
     * Sets the value of the documentumOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentumOut }
     *     
     */
    public void setDocumentumOut(DocumentumOut value) {
        this.documentumOut = value;
    }

}
