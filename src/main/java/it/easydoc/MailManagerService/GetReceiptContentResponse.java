
package it.easydoc.MailManagerService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetReceiptContentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetReceiptContentResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetReceiptContentResponseType" type="{http://www.consorziocsa.it/easydoc/ws}GetReceiptContentResponseType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetReceiptContentResponse", propOrder = {
    "getReceiptContentResponseType"
})
public class GetReceiptContentResponse {

    @XmlElement(name = "GetReceiptContentResponseType", required = true)
    protected GetReceiptContentResponseType getReceiptContentResponseType;

    /**
     * Gets the value of the getReceiptContentResponseType property.
     * 
     * @return
     *     possible object is
     *     {@link GetReceiptContentResponseType }
     *     
     */
    public GetReceiptContentResponseType getGetReceiptContentResponseType() {
        return getReceiptContentResponseType;
    }

    /**
     * Sets the value of the getReceiptContentResponseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetReceiptContentResponseType }
     *     
     */
    public void setGetReceiptContentResponseType(GetReceiptContentResponseType value) {
        this.getReceiptContentResponseType = value;
    }

}
