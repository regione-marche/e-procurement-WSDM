
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
 *         &lt;element name="GetCardVisibilityResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oSendObject" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}SendObject" minOccurs="0"/>
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
    "getCardVisibilityResult",
    "oSendObject"
})
@XmlRootElement(name = "GetCardVisibilityResponse")
public class GetCardVisibilityResponse {

    @XmlElement(name = "GetCardVisibilityResult")
    protected ResultInfo getCardVisibilityResult;
    @XmlElement(nillable = true)
    protected SendObject oSendObject;

    /**
     * Gets the value of the getCardVisibilityResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetCardVisibilityResult() {
        return getCardVisibilityResult;
    }

    /**
     * Sets the value of the getCardVisibilityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetCardVisibilityResult(ResultInfo value) {
        this.getCardVisibilityResult = value;
    }

    /**
     * Gets the value of the oSendObject property.
     * 
     * @return
     *     possible object is
     *     {@link SendObject }
     *     
     */
    public SendObject getOSendObject() {
        return oSendObject;
    }

    /**
     * Sets the value of the oSendObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendObject }
     *     
     */
    public void setOSendObject(SendObject value) {
        this.oSendObject = value;
    }

}
