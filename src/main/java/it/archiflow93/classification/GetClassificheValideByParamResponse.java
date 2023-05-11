
package it.archiflow93.classification;

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
 *         &lt;element name="GetClassificheValideByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}GetClassificheValideOutput" minOccurs="0"/>
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
    "getClassificheValideByParamResult"
})
@XmlRootElement(name = "GetClassificheValideByParamResponse", namespace = "http://tempuri.org/")
public class GetClassificheValideByParamResponse {

    @XmlElement(name = "GetClassificheValideByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected GetClassificheValideOutput getClassificheValideByParamResult;

    /**
     * Gets the value of the getClassificheValideByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetClassificheValideOutput }
     *     
     */
    public GetClassificheValideOutput getGetClassificheValideByParamResult() {
        return getClassificheValideByParamResult;
    }

    /**
     * Sets the value of the getClassificheValideByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetClassificheValideOutput }
     *     
     */
    public void setGetClassificheValideByParamResult(GetClassificheValideOutput value) {
        this.getClassificheValideByParamResult = value;
    }

}
