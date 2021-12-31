
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
 *         &lt;element name="ChangeVisibilityTypeResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ChangeVisibilityTypeOutput" minOccurs="0"/>
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
    "changeVisibilityTypeResult"
})
@XmlRootElement(name = "ChangeVisibilityTypeResponse")
public class ChangeVisibilityTypeResponse {

    @XmlElement(name = "ChangeVisibilityTypeResult", nillable = true)
    protected ChangeVisibilityTypeOutput changeVisibilityTypeResult;

    /**
     * Gets the value of the changeVisibilityTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeVisibilityTypeOutput }
     *     
     */
    public ChangeVisibilityTypeOutput getChangeVisibilityTypeResult() {
        return changeVisibilityTypeResult;
    }

    /**
     * Sets the value of the changeVisibilityTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeVisibilityTypeOutput }
     *     
     */
    public void setChangeVisibilityTypeResult(ChangeVisibilityTypeOutput value) {
        this.changeVisibilityTypeResult = value;
    }

}
