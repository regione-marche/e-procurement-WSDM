
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
 *         &lt;element name="SetCardExpirationResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}SetCardExpirationOutput" minOccurs="0"/>
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
    "setCardExpirationResult"
})
@XmlRootElement(name = "SetCardExpirationResponse")
public class SetCardExpirationResponse {

    @XmlElement(name = "SetCardExpirationResult", nillable = true)
    protected SetCardExpirationOutput setCardExpirationResult;

    /**
     * Gets the value of the setCardExpirationResult property.
     * 
     * @return
     *     possible object is
     *     {@link SetCardExpirationOutput }
     *     
     */
    public SetCardExpirationOutput getSetCardExpirationResult() {
        return setCardExpirationResult;
    }

    /**
     * Sets the value of the setCardExpirationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetCardExpirationOutput }
     *     
     */
    public void setSetCardExpirationResult(SetCardExpirationOutput value) {
        this.setCardExpirationResult = value;
    }

}
