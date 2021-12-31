
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
 *         &lt;element name="CheckInByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}CheckInOutput" minOccurs="0"/>
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
    "checkInByParamResult"
})
@XmlRootElement(name = "CheckInByParamResponse", namespace = "http://tempuri.org/")
public class CheckInByParamResponse {

    @XmlElement(name = "CheckInByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected CheckInOutput checkInByParamResult;

    /**
     * Gets the value of the checkInByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link CheckInOutput }
     *     
     */
    public CheckInOutput getCheckInByParamResult() {
        return checkInByParamResult;
    }

    /**
     * Sets the value of the checkInByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckInOutput }
     *     
     */
    public void setCheckInByParamResult(CheckInOutput value) {
        this.checkInByParamResult = value;
    }

}
