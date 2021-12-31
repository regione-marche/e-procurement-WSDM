
package it.easydoc.MailManagerService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetReceiptContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetReceiptContent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetReceiptContentRequestType" type="{http://www.consorziocsa.it/easydoc/ws}GetReceiptContentRequestType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetReceiptContent", propOrder = {
    "getReceiptContentRequestType"
})
public class GetReceiptContent {

    @XmlElement(name = "GetReceiptContentRequestType", required = true)
    protected GetReceiptContentRequestType getReceiptContentRequestType;

    /**
     * Gets the value of the getReceiptContentRequestType property.
     * 
     * @return
     *     possible object is
     *     {@link GetReceiptContentRequestType }
     *     
     */
    public GetReceiptContentRequestType getGetReceiptContentRequestType() {
        return getReceiptContentRequestType;
    }

    /**
     * Sets the value of the getReceiptContentRequestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetReceiptContentRequestType }
     *     
     */
    public void setGetReceiptContentRequestType(GetReceiptContentRequestType value) {
        this.getReceiptContentRequestType = value;
    }

}
