
package it.archiflow93;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetCardExpirationInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetCardExpirationInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="CardId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid"/>
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ExpirationMethod" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}ExpirationMethodType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetCardExpirationInput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "cardId",
    "duration",
    "expirationMethod"
})
public class SetCardExpirationInput
    extends BaseInput
{

    @XmlElement(name = "CardId", required = true)
    protected String cardId;
    @XmlElement(name = "Duration", nillable = true)
    protected Integer duration;
    @XmlElement(name = "ExpirationMethod")
    protected ExpirationMethodType expirationMethod;

    /**
     * Gets the value of the cardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * Sets the value of the cardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardId(String value) {
        this.cardId = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDuration(Integer value) {
        this.duration = value;
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

}
