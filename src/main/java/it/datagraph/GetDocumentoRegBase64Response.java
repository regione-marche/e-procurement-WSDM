
package it.datagraph;

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
 *         &lt;element name="GetDocumentoRegBase64Result" type="{http://tempuri.org/}DocumentoRetBase64" minOccurs="0"/>
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
    "getDocumentoRegBase64Result"
})
@XmlRootElement(name = "GetDocumentoRegBase64Response")
public class GetDocumentoRegBase64Response {

    @XmlElement(name = "GetDocumentoRegBase64Result")
    protected DocumentoRetBase64 getDocumentoRegBase64Result;

    /**
     * Gets the value of the getDocumentoRegBase64Result property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoRetBase64 }
     *     
     */
    public DocumentoRetBase64 getGetDocumentoRegBase64Result() {
        return getDocumentoRegBase64Result;
    }

    /**
     * Sets the value of the getDocumentoRegBase64Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoRetBase64 }
     *     
     */
    public void setGetDocumentoRegBase64Result(DocumentoRetBase64 value) {
        this.getDocumentoRegBase64Result = value;
    }

}
