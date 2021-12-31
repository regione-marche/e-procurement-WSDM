
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckInfoFatturaPA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckInfoFatturaPA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="CheckErrorInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CheckOk" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSigned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}StatoFatturaPA_OUT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckInfoFatturaPA", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", propOrder = {
    "cardId",
    "checkErrorInfo",
    "checkOk",
    "isSigned",
    "status"
})
public class CheckInfoFatturaPA {

    @XmlElement(name = "CardId")
    protected String cardId;
    @XmlElement(name = "CheckErrorInfo", nillable = true)
    protected String checkErrorInfo;
    @XmlElement(name = "CheckOk")
    protected Boolean checkOk;
    @XmlElement(name = "IsSigned")
    protected Boolean isSigned;
    @XmlElement(name = "Status")
    protected StatoFatturaPAOUT status;

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
     * Gets the value of the checkErrorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckErrorInfo() {
        return checkErrorInfo;
    }

    /**
     * Sets the value of the checkErrorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckErrorInfo(String value) {
        this.checkErrorInfo = value;
    }

    /**
     * Gets the value of the checkOk property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckOk() {
        return checkOk;
    }

    /**
     * Sets the value of the checkOk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckOk(Boolean value) {
        this.checkOk = value;
    }

    /**
     * Gets the value of the isSigned property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSigned() {
        return isSigned;
    }

    /**
     * Sets the value of the isSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSigned(Boolean value) {
        this.isSigned = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatoFatturaPAOUT }
     *     
     */
    public StatoFatturaPAOUT getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatoFatturaPAOUT }
     *     
     */
    public void setStatus(StatoFatturaPAOUT value) {
        this.status = value;
    }

}
