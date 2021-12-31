
package it.archiflow93;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CheckDupType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}CheckDuplicatiType" minOccurs="0"/>
 *         &lt;element name="IsVerifySignedFile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="bIsAutomaticProtocol" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="bSorted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="bSyncWF" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="bVisAllNote" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="bVisOnlyDoc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="extCfg" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ExtEMailConfig" minOccurs="0"/>
 *         &lt;element name="oCard" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}CardBundle" minOccurs="0"/>
 *         &lt;element name="strMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertParameters", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "checkDupType",
    "isVerifySignedFile",
    "bIsAutomaticProtocol",
    "bSorted",
    "bSyncWF",
    "bVisAllNote",
    "bVisOnlyDoc",
    "extCfg",
    "oCard",
    "strMessage",
    "strNote"
})
public class InsertParameters {

    @XmlElement(name = "CheckDupType")
    protected CheckDuplicatiType checkDupType;
    @XmlElement(name = "IsVerifySignedFile")
    protected Boolean isVerifySignedFile;
    protected Boolean bIsAutomaticProtocol;
    protected Boolean bSorted;
    protected Boolean bSyncWF;
    protected Boolean bVisAllNote;
    protected Boolean bVisOnlyDoc;
    @XmlElement(nillable = true)
    protected ExtEMailConfig extCfg;
    @XmlElement(nillable = true)
    protected CardBundle oCard;
    @XmlElement(nillable = true)
    protected String strMessage;
    @XmlElement(nillable = true)
    protected String strNote;

    /**
     * Gets the value of the checkDupType property.
     * 
     * @return
     *     possible object is
     *     {@link CheckDuplicatiType }
     *     
     */
    public CheckDuplicatiType getCheckDupType() {
        return checkDupType;
    }

    /**
     * Sets the value of the checkDupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckDuplicatiType }
     *     
     */
    public void setCheckDupType(CheckDuplicatiType value) {
        this.checkDupType = value;
    }

    /**
     * Gets the value of the isVerifySignedFile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsVerifySignedFile() {
        return isVerifySignedFile;
    }

    /**
     * Sets the value of the isVerifySignedFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsVerifySignedFile(Boolean value) {
        this.isVerifySignedFile = value;
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

    /**
     * Gets the value of the bSorted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBSorted() {
        return bSorted;
    }

    /**
     * Sets the value of the bSorted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBSorted(Boolean value) {
        this.bSorted = value;
    }

    /**
     * Gets the value of the bSyncWF property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBSyncWF() {
        return bSyncWF;
    }

    /**
     * Sets the value of the bSyncWF property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBSyncWF(Boolean value) {
        this.bSyncWF = value;
    }

    /**
     * Gets the value of the bVisAllNote property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBVisAllNote() {
        return bVisAllNote;
    }

    /**
     * Sets the value of the bVisAllNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBVisAllNote(Boolean value) {
        this.bVisAllNote = value;
    }

    /**
     * Gets the value of the bVisOnlyDoc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBVisOnlyDoc() {
        return bVisOnlyDoc;
    }

    /**
     * Sets the value of the bVisOnlyDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBVisOnlyDoc(Boolean value) {
        this.bVisOnlyDoc = value;
    }

    /**
     * Gets the value of the extCfg property.
     * 
     * @return
     *     possible object is
     *     {@link ExtEMailConfig }
     *     
     */
    public ExtEMailConfig getExtCfg() {
        return extCfg;
    }

    /**
     * Sets the value of the extCfg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtEMailConfig }
     *     
     */
    public void setExtCfg(ExtEMailConfig value) {
        this.extCfg = value;
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
     * Gets the value of the strMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrMessage() {
        return strMessage;
    }

    /**
     * Sets the value of the strMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrMessage(String value) {
        this.strMessage = value;
    }

    /**
     * Gets the value of the strNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrNote() {
        return strNote;
    }

    /**
     * Sets the value of the strNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrNote(String value) {
        this.strNote = value;
    }

}
