
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardHasData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardHasData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HasAdditionalData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasAgraf" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasAttachment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasComputerizedClassification" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasComputerizedFolder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasEeEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasFolder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasIMInvoice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasInternalAttachment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasNotes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasPartialInvalidations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasPosteOnline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasTasksAssignedTo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasTasksToDo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsWf" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardHasData", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "hasAdditionalData",
    "hasAgraf",
    "hasAttachment",
    "hasComputerizedClassification",
    "hasComputerizedFolder",
    "hasDocument",
    "hasEeEmail",
    "hasFolder",
    "hasIMInvoice",
    "hasInternalAttachment",
    "hasNotes",
    "hasPartialInvalidations",
    "hasPosteOnline",
    "hasTasksAssignedTo",
    "hasTasksToDo",
    "isWf"
})
public class CardHasData {

    @XmlElement(name = "HasAdditionalData")
    protected Boolean hasAdditionalData;
    @XmlElement(name = "HasAgraf")
    protected Boolean hasAgraf;
    @XmlElement(name = "HasAttachment")
    protected Boolean hasAttachment;
    @XmlElement(name = "HasComputerizedClassification")
    protected Boolean hasComputerizedClassification;
    @XmlElement(name = "HasComputerizedFolder")
    protected Boolean hasComputerizedFolder;
    @XmlElement(name = "HasDocument")
    protected Boolean hasDocument;
    @XmlElement(name = "HasEeEmail")
    protected Boolean hasEeEmail;
    @XmlElement(name = "HasFolder")
    protected Boolean hasFolder;
    @XmlElement(name = "HasIMInvoice")
    protected Boolean hasIMInvoice;
    @XmlElement(name = "HasInternalAttachment")
    protected Boolean hasInternalAttachment;
    @XmlElement(name = "HasNotes")
    protected Boolean hasNotes;
    @XmlElement(name = "HasPartialInvalidations")
    protected Boolean hasPartialInvalidations;
    @XmlElement(name = "HasPosteOnline")
    protected Boolean hasPosteOnline;
    @XmlElement(name = "HasTasksAssignedTo")
    protected Boolean hasTasksAssignedTo;
    @XmlElement(name = "HasTasksToDo")
    protected Boolean hasTasksToDo;
    @XmlElement(name = "IsWf")
    protected Boolean isWf;

    /**
     * Gets the value of the hasAdditionalData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasAdditionalData() {
        return hasAdditionalData;
    }

    /**
     * Sets the value of the hasAdditionalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAdditionalData(Boolean value) {
        this.hasAdditionalData = value;
    }

    /**
     * Gets the value of the hasAgraf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasAgraf() {
        return hasAgraf;
    }

    /**
     * Sets the value of the hasAgraf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAgraf(Boolean value) {
        this.hasAgraf = value;
    }

    /**
     * Gets the value of the hasAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasAttachment() {
        return hasAttachment;
    }

    /**
     * Sets the value of the hasAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAttachment(Boolean value) {
        this.hasAttachment = value;
    }

    /**
     * Gets the value of the hasComputerizedClassification property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasComputerizedClassification() {
        return hasComputerizedClassification;
    }

    /**
     * Sets the value of the hasComputerizedClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasComputerizedClassification(Boolean value) {
        this.hasComputerizedClassification = value;
    }

    /**
     * Gets the value of the hasComputerizedFolder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasComputerizedFolder() {
        return hasComputerizedFolder;
    }

    /**
     * Sets the value of the hasComputerizedFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasComputerizedFolder(Boolean value) {
        this.hasComputerizedFolder = value;
    }

    /**
     * Gets the value of the hasDocument property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasDocument() {
        return hasDocument;
    }

    /**
     * Sets the value of the hasDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasDocument(Boolean value) {
        this.hasDocument = value;
    }

    /**
     * Gets the value of the hasEeEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasEeEmail() {
        return hasEeEmail;
    }

    /**
     * Sets the value of the hasEeEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasEeEmail(Boolean value) {
        this.hasEeEmail = value;
    }

    /**
     * Gets the value of the hasFolder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasFolder() {
        return hasFolder;
    }

    /**
     * Sets the value of the hasFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasFolder(Boolean value) {
        this.hasFolder = value;
    }

    /**
     * Gets the value of the hasIMInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasIMInvoice() {
        return hasIMInvoice;
    }

    /**
     * Sets the value of the hasIMInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasIMInvoice(Boolean value) {
        this.hasIMInvoice = value;
    }

    /**
     * Gets the value of the hasInternalAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasInternalAttachment() {
        return hasInternalAttachment;
    }

    /**
     * Sets the value of the hasInternalAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasInternalAttachment(Boolean value) {
        this.hasInternalAttachment = value;
    }

    /**
     * Gets the value of the hasNotes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasNotes() {
        return hasNotes;
    }

    /**
     * Sets the value of the hasNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasNotes(Boolean value) {
        this.hasNotes = value;
    }

    /**
     * Gets the value of the hasPartialInvalidations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasPartialInvalidations() {
        return hasPartialInvalidations;
    }

    /**
     * Sets the value of the hasPartialInvalidations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasPartialInvalidations(Boolean value) {
        this.hasPartialInvalidations = value;
    }

    /**
     * Gets the value of the hasPosteOnline property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasPosteOnline() {
        return hasPosteOnline;
    }

    /**
     * Sets the value of the hasPosteOnline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasPosteOnline(Boolean value) {
        this.hasPosteOnline = value;
    }

    /**
     * Gets the value of the hasTasksAssignedTo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasTasksAssignedTo() {
        return hasTasksAssignedTo;
    }

    /**
     * Sets the value of the hasTasksAssignedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasTasksAssignedTo(Boolean value) {
        this.hasTasksAssignedTo = value;
    }

    /**
     * Gets the value of the hasTasksToDo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasTasksToDo() {
        return hasTasksToDo;
    }

    /**
     * Sets the value of the hasTasksToDo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasTasksToDo(Boolean value) {
        this.hasTasksToDo = value;
    }

    /**
     * Gets the value of the isWf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsWf() {
        return isWf;
    }

    /**
     * Sets the value of the isWf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsWf(Boolean value) {
        this.isWf = value;
    }

}
