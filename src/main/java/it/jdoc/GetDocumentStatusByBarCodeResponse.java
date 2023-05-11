
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
 *         &lt;element name="GetDocumentStatusByBarCodeResult" type="{http://schemas.datacontract.org/2004/07/WS_Operazioni}DocResultStatus" minOccurs="0"/>
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
    "getDocumentStatusByBarCodeResult"
})
@XmlRootElement(name = "GetDocumentStatusByBarCodeResponse")
public class GetDocumentStatusByBarCodeResponse {

    @XmlElement(name = "GetDocumentStatusByBarCodeResult", nillable = true)
    protected DocResultStatus getDocumentStatusByBarCodeResult;

    /**
     * Gets the value of the getDocumentStatusByBarCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link DocResultStatus }
     *     
     */
    public DocResultStatus getGetDocumentStatusByBarCodeResult() {
        return getDocumentStatusByBarCodeResult;
    }

    /**
     * Sets the value of the getDocumentStatusByBarCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocResultStatus }
     *     
     */
    public void setGetDocumentStatusByBarCodeResult(DocResultStatus value) {
        this.getDocumentStatusByBarCodeResult = value;
    }

}
