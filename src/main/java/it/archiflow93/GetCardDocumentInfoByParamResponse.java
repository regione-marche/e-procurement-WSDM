
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
 *         &lt;element name="GetCardDocumentInfoByParamResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}GetCardDocumentInfoOutput" minOccurs="0"/>
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
    "getCardDocumentInfoByParamResult"
})
@XmlRootElement(name = "GetCardDocumentInfoByParamResponse")
public class GetCardDocumentInfoByParamResponse {

    @XmlElement(name = "GetCardDocumentInfoByParamResult", nillable = true)
    protected GetCardDocumentInfoOutput getCardDocumentInfoByParamResult;

    /**
     * Gets the value of the getCardDocumentInfoByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetCardDocumentInfoOutput }
     *     
     */
    public GetCardDocumentInfoOutput getGetCardDocumentInfoByParamResult() {
        return getCardDocumentInfoByParamResult;
    }

    /**
     * Sets the value of the getCardDocumentInfoByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCardDocumentInfoOutput }
     *     
     */
    public void setGetCardDocumentInfoByParamResult(GetCardDocumentInfoOutput value) {
        this.getCardDocumentInfoByParamResult = value;
    }

}
