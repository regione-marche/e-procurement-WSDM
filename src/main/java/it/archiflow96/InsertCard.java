
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
 *         &lt;element name="oUsers" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfUser" minOccurs="0"/>
 *         &lt;element name="oGroups" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfGroup" minOccurs="0"/>
 *         &lt;element name="oOffices" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfOffice" minOccurs="0"/>
 *         &lt;element name="strNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bIsAutomaticProtocol" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="bVisOnlyDoc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="bVisAllNote" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="bSorted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "oUsers",
    "oGroups",
    "oOffices",
    "strNote",
    "strMessage",
    "bIsAutomaticProtocol",
    "bVisOnlyDoc",
    "bVisAllNote",
    "bSorted"
})
@XmlRootElement(name = "InsertCard")
public class InsertCard {

    @XmlElement(nillable = true)
    protected String strSessionId;
    @XmlElement(nillable = true)
    protected CardBundle oCard;
    @XmlElement(nillable = true)
    protected ArrayOfUser oUsers;
    @XmlElement(nillable = true)
    protected ArrayOfGroup oGroups;
    @XmlElement(nillable = true)
    protected ArrayOfOffice oOffices;
    @XmlElement(nillable = true)
    protected String strNote;
    @XmlElement(nillable = true)
    protected String strMessage;
    protected Boolean bIsAutomaticProtocol;
    protected Boolean bVisOnlyDoc;
    protected Boolean bVisAllNote;
    protected Boolean bSorted;

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
     * Gets the value of the oUsers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUser }
     *     
     */
    public ArrayOfUser getOUsers() {
        return oUsers;
    }

    /**
     * Sets the value of the oUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUser }
     *     
     */
    public void setOUsers(ArrayOfUser value) {
        this.oUsers = value;
    }

    /**
     * Gets the value of the oGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGroup }
     *     
     */
    public ArrayOfGroup getOGroups() {
        return oGroups;
    }

    /**
     * Sets the value of the oGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGroup }
     *     
     */
    public void setOGroups(ArrayOfGroup value) {
        this.oGroups = value;
    }

    /**
     * Gets the value of the oOffices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOffice }
     *     
     */
    public ArrayOfOffice getOOffices() {
        return oOffices;
    }

    /**
     * Sets the value of the oOffices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOffice }
     *     
     */
    public void setOOffices(ArrayOfOffice value) {
        this.oOffices = value;
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

}
