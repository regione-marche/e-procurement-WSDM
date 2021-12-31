
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
 *         &lt;element name="GetDocumentByBarCodeResult" type="{http://schemas.datacontract.org/2004/07/WS_Operazioni}DocumentResult" minOccurs="0"/>
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
    "getDocumentByBarCodeResult"
})
@XmlRootElement(name = "GetDocumentByBarCodeResponse")
public class GetDocumentByBarCodeResponse {

    @XmlElement(name = "GetDocumentByBarCodeResult", nillable = true)
    protected DocumentResult getDocumentByBarCodeResult;

    /**
     * Gets the value of the getDocumentByBarCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentResult }
     *     
     */
    public DocumentResult getGetDocumentByBarCodeResult() {
        return getDocumentByBarCodeResult;
    }

    /**
     * Sets the value of the getDocumentByBarCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentResult }
     *     
     */
    public void setGetDocumentByBarCodeResult(DocumentResult value) {
        this.getDocumentByBarCodeResult = value;
    }

}
