
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
 *         &lt;element name="GetDocumentoRegResult" type="{http://tempuri.org/}DocumentoRet" minOccurs="0"/>
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
    "getDocumentoRegResult"
})
@XmlRootElement(name = "GetDocumentoRegResponse")
public class GetDocumentoRegResponse {

    @XmlElement(name = "GetDocumentoRegResult")
    protected DocumentoRet getDocumentoRegResult;

    /**
     * Gets the value of the getDocumentoRegResult property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoRet }
     *     
     */
    public DocumentoRet getGetDocumentoRegResult() {
        return getDocumentoRegResult;
    }

    /**
     * Sets the value of the getDocumentoRegResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoRet }
     *     
     */
    public void setGetDocumentoRegResult(DocumentoRet value) {
        this.getDocumentoRegResult = value;
    }

}
