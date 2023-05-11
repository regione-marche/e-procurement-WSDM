
package it.easydoc.MailManagerService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetReceiptContentResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetReceiptContentResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.consorziocsa.it/easydoc/ws}GenericServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="ReceiptContent" type="{http://www.consorziocsa.it/easydoc/ws}Attached"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetReceiptContentResponseType", propOrder = {
    "receiptContent"
})
public class GetReceiptContentResponseType
    extends GenericServiceResponse
{

    @XmlElement(name = "ReceiptContent", required = true)
    protected Attached receiptContent;

    /**
     * Gets the value of the receiptContent property.
     * 
     * @return
     *     possible object is
     *     {@link Attached }
     *     
     */
    public Attached getReceiptContent() {
        return receiptContent;
    }

    /**
     * Sets the value of the receiptContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attached }
     *     
     */
    public void setReceiptContent(Attached value) {
        this.receiptContent = value;
    }

}
