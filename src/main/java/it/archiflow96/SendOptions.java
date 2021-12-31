
package it.archiflow96;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsAutomaticSending" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDisabledReceivers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsVisibleOnlyDoc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendOptions", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "isAutomaticSending",
    "isDisabledReceivers",
    "isVisibleOnlyDoc"
})
public class SendOptions {

    @XmlElement(name = "IsAutomaticSending")
    protected Boolean isAutomaticSending;
    @XmlElement(name = "IsDisabledReceivers")
    protected Boolean isDisabledReceivers;
    @XmlElement(name = "IsVisibleOnlyDoc")
    protected Boolean isVisibleOnlyDoc;

    /**
     * Gets the value of the isAutomaticSending property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAutomaticSending() {
        return isAutomaticSending;
    }

    /**
     * Sets the value of the isAutomaticSending property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAutomaticSending(Boolean value) {
        this.isAutomaticSending = value;
    }

    /**
     * Gets the value of the isDisabledReceivers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDisabledReceivers() {
        return isDisabledReceivers;
    }

    /**
     * Sets the value of the isDisabledReceivers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDisabledReceivers(Boolean value) {
        this.isDisabledReceivers = value;
    }

    /**
     * Gets the value of the isVisibleOnlyDoc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsVisibleOnlyDoc() {
        return isVisibleOnlyDoc;
    }

    /**
     * Sets the value of the isVisibleOnlyDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsVisibleOnlyDoc(Boolean value) {
        this.isVisibleOnlyDoc = value;
    }

}
