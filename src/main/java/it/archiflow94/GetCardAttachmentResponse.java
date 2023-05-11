
package it.archiflow94;

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
 *         &lt;element name="GetCardAttachmentResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oAttachment" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}Attachment" minOccurs="0"/>
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
    "getCardAttachmentResult",
    "oAttachment"
})
@XmlRootElement(name = "GetCardAttachmentResponse")
public class GetCardAttachmentResponse {

    @XmlElement(name = "GetCardAttachmentResult")
    protected ResultInfo getCardAttachmentResult;
    @XmlElement(nillable = true)
    protected Attachment oAttachment;

    /**
     * Gets the value of the getCardAttachmentResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetCardAttachmentResult() {
        return getCardAttachmentResult;
    }

    /**
     * Sets the value of the getCardAttachmentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetCardAttachmentResult(ResultInfo value) {
        this.getCardAttachmentResult = value;
    }

    /**
     * Gets the value of the oAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getOAttachment() {
        return oAttachment;
    }

    /**
     * Sets the value of the oAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setOAttachment(Attachment value) {
        this.oAttachment = value;
    }

}
