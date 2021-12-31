
package it.archiflow93;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DurationSearchCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DurationSearchCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Duration" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.ValueObject}RangeOfNullableOfint5F2dSckg" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.ValueObject}RangeOfNullableOfdateTime5F2dSckg" minOccurs="0"/>
 *         &lt;element name="ExpirationMethod" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}ExpirationMethodType" minOccurs="0"/>
 *         &lt;element name="UnlimitedDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DurationSearchCriteria", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "duration",
    "expirationDate",
    "expirationMethod",
    "unlimitedDuration"
})
public class DurationSearchCriteria {

    @XmlElement(name = "Duration", nillable = true)
    protected RangeOfNullableOfint5F2DSckg duration;
    @XmlElement(name = "ExpirationDate", nillable = true)
    protected RangeOfNullableOfdateTime5F2DSckg expirationDate;
    @XmlElement(name = "ExpirationMethod")
    protected ExpirationMethodType expirationMethod;
    @XmlElement(name = "UnlimitedDuration", nillable = true)
    protected Boolean unlimitedDuration;

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link RangeOfNullableOfint5F2DSckg }
     *     
     */
    public RangeOfNullableOfint5F2DSckg getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeOfNullableOfint5F2DSckg }
     *     
     */
    public void setDuration(RangeOfNullableOfint5F2DSckg value) {
        this.duration = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link RangeOfNullableOfdateTime5F2DSckg }
     *     
     */
    public RangeOfNullableOfdateTime5F2DSckg getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeOfNullableOfdateTime5F2DSckg }
     *     
     */
    public void setExpirationDate(RangeOfNullableOfdateTime5F2DSckg value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the expirationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ExpirationMethodType }
     *     
     */
    public ExpirationMethodType getExpirationMethod() {
        return expirationMethod;
    }

    /**
     * Sets the value of the expirationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpirationMethodType }
     *     
     */
    public void setExpirationMethod(ExpirationMethodType value) {
        this.expirationMethod = value;
    }

    /**
     * Gets the value of the unlimitedDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnlimitedDuration() {
        return unlimitedDuration;
    }

    /**
     * Sets the value of the unlimitedDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnlimitedDuration(Boolean value) {
        this.unlimitedDuration = value;
    }

}
