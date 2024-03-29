
package it.jdoc;

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
 *         &lt;element name="GetDocumentByIdDocResult" type="{http://schemas.datacontract.org/2004/07/WS_Operazioni}DocumentResult" minOccurs="0"/>
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
    "getDocumentByIdDocResult"
})
@XmlRootElement(name = "GetDocumentByIdDocResponse")
public class GetDocumentByIdDocResponse {

    @XmlElement(name = "GetDocumentByIdDocResult", nillable = true)
    protected DocumentResult getDocumentByIdDocResult;

    /**
     * Gets the value of the getDocumentByIdDocResult property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentResult }
     *     
     */
    public DocumentResult getGetDocumentByIdDocResult() {
        return getDocumentByIdDocResult;
    }

    /**
     * Sets the value of the getDocumentByIdDocResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentResult }
     *     
     */
    public void setGetDocumentByIdDocResult(DocumentResult value) {
        this.getDocumentByIdDocResult = value;
    }

}
