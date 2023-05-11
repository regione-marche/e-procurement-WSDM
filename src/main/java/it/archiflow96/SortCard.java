
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
 *         &lt;element name="strSessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oCard" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}CardBundle" minOccurs="0"/>
 *         &lt;element name="bIsAutomaticProtocol" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "strSessionId",
    "oCard",
    "bIsAutomaticProtocol"
})
@XmlRootElement(name = "SortCard")
public class SortCard {

    @XmlElement(nillable = true)
    protected String strSessionId;
    @XmlElement(nillable = true)
    protected CardBundle oCard;
    protected Boolean bIsAutomaticProtocol;

    /**
     * Gets the value of the strSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrSessionId() {
        return strSessionId;
    }

    /**
     * Sets the value of the strSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrSessionId(String value) {
        this.strSessionId = value;
    }

    /**
     * Gets the value of the oCard property.
     * 
     * @return
     *     possible object is
     *     {@link CardBundle }
     *     
     */
    public CardBundle getOCard() {
        return oCard;
    }

    /**
     * Sets the value of the oCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardBundle }
     *     
     */
    public void setOCard(CardBundle value) {
        this.oCard = value;
    }

    /**
     * Gets the value of the bIsAutomaticProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBIsAutomaticProtocol() {
        return bIsAutomaticProtocol;
    }

    /**
     * Sets the value of the bIsAutomaticProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBIsAutomaticProtocol(Boolean value) {
        this.bIsAutomaticProtocol = value;
    }

}
