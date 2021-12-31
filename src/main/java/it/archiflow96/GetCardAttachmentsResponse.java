
package it.archiflow96;

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
 *         &lt;element name="GetCardAttachmentsResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oAttachments" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfAttachment" minOccurs="0"/>
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
    "getCardAttachmentsResult",
    "oAttachments"
})
@XmlRootElement(name = "GetCardAttachmentsResponse")
public class GetCardAttachmentsResponse {

    @XmlElement(name = "GetCardAttachmentsResult")
    protected ResultInfo getCardAttachmentsResult;
    @XmlElement(nillable = true)
    protected ArrayOfAttachment oAttachments;

    /**
     * Gets the value of the getCardAttachmentsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetCardAttachmentsResult() {
        return getCardAttachmentsResult;
    }

    /**
     * Sets the value of the getCardAttachmentsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetCardAttachmentsResult(ResultInfo value) {
        this.getCardAttachmentsResult = value;
    }

    /**
     * Gets the value of the oAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttachment }
     *     
     */
    public ArrayOfAttachment getOAttachments() {
        return oAttachments;
    }

    /**
     * Sets the value of the oAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttachment }
     *     
     */
    public void setOAttachments(ArrayOfAttachment value) {
        this.oAttachments = value;
    }

}
