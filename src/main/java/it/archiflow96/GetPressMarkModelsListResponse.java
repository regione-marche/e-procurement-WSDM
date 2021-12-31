
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
 *         &lt;element name="GetPressMarkModelsListResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}GetPressMarkModelsListOutput" minOccurs="0"/>
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
    "getPressMarkModelsListResult"
})
@XmlRootElement(name = "GetPressMarkModelsListResponse")
public class GetPressMarkModelsListResponse {

    @XmlElement(name = "GetPressMarkModelsListResult", nillable = true)
    protected GetPressMarkModelsListOutput getPressMarkModelsListResult;

    /**
     * Gets the value of the getPressMarkModelsListResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetPressMarkModelsListOutput }
     *     
     */
    public GetPressMarkModelsListOutput getGetPressMarkModelsListResult() {
        return getPressMarkModelsListResult;
    }

    /**
     * Sets the value of the getPressMarkModelsListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPressMarkModelsListOutput }
     *     
     */
    public void setGetPressMarkModelsListResult(GetPressMarkModelsListOutput value) {
        this.getPressMarkModelsListResult = value;
    }

}
