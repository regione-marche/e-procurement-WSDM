
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
 *         &lt;element name="GetCardAttachments2Result" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
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
    "getCardAttachments2Result",
    "oAttachments"
})
@XmlRootElement(name = "GetCardAttachments2Response")
public class GetCardAttachments2Response {

    @XmlElement(name = "GetCardAttachments2Result")
    protected ResultInfo getCardAttachments2Result;
    @XmlElement(nillable = true)
    protected ArrayOfAttachment oAttachments;

    /**
     * Gets the value of the getCardAttachments2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetCardAttachments2Result() {
        return getCardAttachments2Result;
    }

    /**
     * Sets the value of the getCardAttachments2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetCardAttachments2Result(ResultInfo value) {
        this.getCardAttachments2Result = value;
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
