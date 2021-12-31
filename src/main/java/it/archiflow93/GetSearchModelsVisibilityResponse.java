
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
 *         &lt;element name="GetSearchModelsVisibilityResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}GetSearchModelsVisibilityOutput" minOccurs="0"/>
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
    "getSearchModelsVisibilityResult"
})
@XmlRootElement(name = "GetSearchModelsVisibilityResponse")
public class GetSearchModelsVisibilityResponse {

    @XmlElement(name = "GetSearchModelsVisibilityResult", nillable = true)
    protected GetSearchModelsVisibilityOutput getSearchModelsVisibilityResult;

    /**
     * Gets the value of the getSearchModelsVisibilityResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetSearchModelsVisibilityOutput }
     *     
     */
    public GetSearchModelsVisibilityOutput getGetSearchModelsVisibilityResult() {
        return getSearchModelsVisibilityResult;
    }

    /**
     * Sets the value of the getSearchModelsVisibilityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSearchModelsVisibilityOutput }
     *     
     */
    public void setGetSearchModelsVisibilityResult(GetSearchModelsVisibilityOutput value) {
        this.getSearchModelsVisibilityResult = value;
    }

}
