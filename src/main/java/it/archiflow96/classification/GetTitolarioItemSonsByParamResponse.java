
package it.archiflow96.classification;

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
 *         &lt;element name="GetTitolarioItemSonsByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}GetTitolarioItemSonsOutput" minOccurs="0"/>
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
    "getTitolarioItemSonsByParamResult"
})
@XmlRootElement(name = "GetTitolarioItemSonsByParamResponse", namespace = "http://tempuri.org/")
public class GetTitolarioItemSonsByParamResponse {

    @XmlElement(name = "GetTitolarioItemSonsByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected GetTitolarioItemSonsOutput getTitolarioItemSonsByParamResult;

    /**
     * Gets the value of the getTitolarioItemSonsByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetTitolarioItemSonsOutput }
     *     
     */
    public GetTitolarioItemSonsOutput getGetTitolarioItemSonsByParamResult() {
        return getTitolarioItemSonsByParamResult;
    }

    /**
     * Sets the value of the getTitolarioItemSonsByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTitolarioItemSonsOutput }
     *     
     */
    public void setGetTitolarioItemSonsByParamResult(GetTitolarioItemSonsOutput value) {
        this.getTitolarioItemSonsByParamResult = value;
    }

}
