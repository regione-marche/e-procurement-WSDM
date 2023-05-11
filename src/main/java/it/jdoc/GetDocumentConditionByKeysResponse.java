
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
 *         &lt;element name="GetDocumentConditionByKeysResult" type="{http://schemas.datacontract.org/2004/07/WS_Operazioni}DocResultCondition" minOccurs="0"/>
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
    "getDocumentConditionByKeysResult"
})
@XmlRootElement(name = "GetDocumentConditionByKeysResponse")
public class GetDocumentConditionByKeysResponse {

    @XmlElement(name = "GetDocumentConditionByKeysResult", nillable = true)
    protected DocResultCondition getDocumentConditionByKeysResult;

    /**
     * Gets the value of the getDocumentConditionByKeysResult property.
     * 
     * @return
     *     possible object is
     *     {@link DocResultCondition }
     *     
     */
    public DocResultCondition getGetDocumentConditionByKeysResult() {
        return getDocumentConditionByKeysResult;
    }

    /**
     * Sets the value of the getDocumentConditionByKeysResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocResultCondition }
     *     
     */
    public void setGetDocumentConditionByKeysResult(DocResultCondition value) {
        this.getDocumentConditionByKeysResult = value;
    }

}
