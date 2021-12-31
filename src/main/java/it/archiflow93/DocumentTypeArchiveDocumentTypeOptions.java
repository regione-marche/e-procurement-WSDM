
package it.archiflow93;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentType.ArchiveDocumentTypeOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentType.ArchiveDocumentTypeOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArchiveID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CardDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Preservation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentType.ArchiveDocumentTypeOptions", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "archiveID",
    "cardDuration",
    "preservation"
})
public class DocumentTypeArchiveDocumentTypeOptions {

    @XmlElement(name = "ArchiveID")
    protected Integer archiveID;
    @XmlElement(name = "CardDuration")
    protected Integer cardDuration;
    @XmlElement(name = "Preservation")
    protected Boolean preservation;

    /**
     * Gets the value of the archiveID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArchiveID() {
        return archiveID;
    }

    /**
     * Sets the value of the archiveID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArchiveID(Integer value) {
        this.archiveID = value;
    }

    /**
     * Gets the value of the cardDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCardDuration() {
        return cardDuration;
    }

    /**
     * Sets the value of the cardDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCardDuration(Integer value) {
        this.cardDuration = value;
    }

    /**
     * Gets the value of the preservation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreservation() {
        return preservation;
    }

    /**
     * Sets the value of the preservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreservation(Boolean value) {
        this.preservation = value;
    }

}
