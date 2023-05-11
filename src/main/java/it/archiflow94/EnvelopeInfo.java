
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnvelopeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnvelopeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Signature" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Sign.ValueObject}SignatureInfo" minOccurs="0"/>
 *         &lt;element name="TimeStamp" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Sign.ValueObject}TimeStampInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvelopeInfo", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Sign.ValueObject", propOrder = {
    "signature",
    "timeStamp"
})
public class EnvelopeInfo {

    @XmlElement(name = "Signature", nillable = true)
    protected SignatureInfo signature;
    @XmlElement(name = "TimeStamp", nillable = true)
    protected TimeStampInfo timeStamp;

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureInfo }
     *     
     */
    public SignatureInfo getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureInfo }
     *     
     */
    public void setSignature(SignatureInfo value) {
        this.signature = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link TimeStampInfo }
     *     
     */
    public TimeStampInfo getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeStampInfo }
     *     
     */
    public void setTimeStamp(TimeStampInfo value) {
        this.timeStamp = value;
    }

}
