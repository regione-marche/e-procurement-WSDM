
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
 *         &lt;element name="GetExistingCardVisibilityCCByParamResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}GetExistingCardVisibilityCCOutput" minOccurs="0"/>
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
    "getExistingCardVisibilityCCByParamResult"
})
@XmlRootElement(name = "GetExistingCardVisibilityCCByParamResponse")
public class GetExistingCardVisibilityCCByParamResponse {

    @XmlElement(name = "GetExistingCardVisibilityCCByParamResult", nillable = true)
    protected GetExistingCardVisibilityCCOutput getExistingCardVisibilityCCByParamResult;

    /**
     * Gets the value of the getExistingCardVisibilityCCByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetExistingCardVisibilityCCOutput }
     *     
     */
    public GetExistingCardVisibilityCCOutput getGetExistingCardVisibilityCCByParamResult() {
        return getExistingCardVisibilityCCByParamResult;
    }

    /**
     * Sets the value of the getExistingCardVisibilityCCByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetExistingCardVisibilityCCOutput }
     *     
     */
    public void setGetExistingCardVisibilityCCByParamResult(GetExistingCardVisibilityCCOutput value) {
        this.getExistingCardVisibilityCCByParamResult = value;
    }

}
