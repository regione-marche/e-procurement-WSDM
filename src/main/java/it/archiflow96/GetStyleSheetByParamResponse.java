
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
 *         &lt;element name="GetStyleSheetByParamResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}GetStyleSheetOutput" minOccurs="0"/>
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
    "getStyleSheetByParamResult"
})
@XmlRootElement(name = "GetStyleSheetByParamResponse")
public class GetStyleSheetByParamResponse {

    @XmlElement(name = "GetStyleSheetByParamResult", nillable = true)
    protected GetStyleSheetOutput getStyleSheetByParamResult;

    /**
     * Gets the value of the getStyleSheetByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetStyleSheetOutput }
     *     
     */
    public GetStyleSheetOutput getGetStyleSheetByParamResult() {
        return getStyleSheetByParamResult;
    }

    /**
     * Sets the value of the getStyleSheetByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetStyleSheetOutput }
     *     
     */
    public void setGetStyleSheetByParamResult(GetStyleSheetOutput value) {
        this.getStyleSheetByParamResult = value;
    }

}
