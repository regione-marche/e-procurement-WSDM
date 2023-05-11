
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
 *         &lt;element name="GetDocumentConditionByBarCodeResult" type="{http://schemas.datacontract.org/2004/07/WS_Operazioni}DocResultCondition" minOccurs="0"/>
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
    "getDocumentConditionByBarCodeResult"
})
@XmlRootElement(name = "GetDocumentConditionByBarCodeResponse")
public class GetDocumentConditionByBarCodeResponse {

    @XmlElement(name = "GetDocumentConditionByBarCodeResult", nillable = true)
    protected DocResultCondition getDocumentConditionByBarCodeResult;

    /**
     * Gets the value of the getDocumentConditionByBarCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link DocResultCondition }
     *     
     */
    public DocResultCondition getGetDocumentConditionByBarCodeResult() {
        return getDocumentConditionByBarCodeResult;
    }

    /**
     * Sets the value of the getDocumentConditionByBarCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocResultCondition }
     *     
     */
    public void setGetDocumentConditionByBarCodeResult(DocResultCondition value) {
        this.getDocumentConditionByBarCodeResult = value;
    }

}
