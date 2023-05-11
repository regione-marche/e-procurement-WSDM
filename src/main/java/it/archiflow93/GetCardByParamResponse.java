
package it.archiflow93;

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
 *         &lt;element name="GetCardByParamResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}GetCardOutput" minOccurs="0"/>
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
    "getCardByParamResult"
})
@XmlRootElement(name = "GetCardByParamResponse")
public class GetCardByParamResponse {

    @XmlElement(name = "GetCardByParamResult", nillable = true)
    protected GetCardOutput getCardByParamResult;

    /**
     * Gets the value of the getCardByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetCardOutput }
     *     
     */
    public GetCardOutput getGetCardByParamResult() {
        return getCardByParamResult;
    }

    /**
     * Sets the value of the getCardByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCardOutput }
     *     
     */
    public void setGetCardByParamResult(GetCardOutput value) {
        this.getCardByParamResult = value;
    }

}
