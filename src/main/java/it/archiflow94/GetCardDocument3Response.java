
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
 *         &lt;element name="GetCardDocument3Result" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oDocument" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}Document" minOccurs="0"/>
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
    "getCardDocument3Result",
    "oDocument"
})
@XmlRootElement(name = "GetCardDocument3Response")
public class GetCardDocument3Response {

    @XmlElement(name = "GetCardDocument3Result")
    protected ResultInfo getCardDocument3Result;
    @XmlElement(nillable = true)
    protected Document oDocument;

    /**
     * Gets the value of the getCardDocument3Result property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetCardDocument3Result() {
        return getCardDocument3Result;
    }

    /**
     * Sets the value of the getCardDocument3Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetCardDocument3Result(ResultInfo value) {
        this.getCardDocument3Result = value;
    }

    /**
     * Gets the value of the oDocument property.
     * 
     * @return
     *     possible object is
     *     {@link Document }
     *     
     */
    public Document getODocument() {
        return oDocument;
    }

    /**
     * Sets the value of the oDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Document }
     *     
     */
    public void setODocument(Document value) {
        this.oDocument = value;
    }

}
