
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
 *         &lt;element name="oSessionInfo" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Login.ValueObject}SessionInfo" minOccurs="0"/>
 *         &lt;element name="oCardId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="bAutomaticProtocol" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="oIndexes" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfField" minOccurs="0"/>
 *         &lt;element name="oArchive" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}Archive" minOccurs="0"/>
 *         &lt;element name="oDocumentType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}DocumentType" minOccurs="0"/>
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
    "oSessionInfo",
    "oCardId",
    "bAutomaticProtocol",
    "oIndexes",
    "oArchive",
    "oDocumentType"
})
@XmlRootElement(name = "SetCardIndexes")
public class SetCardIndexes {

    @XmlElement(nillable = true)
    protected SessionInfo oSessionInfo;
    protected String oCardId;
    protected Boolean bAutomaticProtocol;
    @XmlElement(nillable = true)
    protected ArrayOfField oIndexes;
    @XmlElement(nillable = true)
    protected Archive oArchive;
    @XmlElement(nillable = true)
    protected DocumentType oDocumentType;

    /**
     * Gets the value of the oSessionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SessionInfo }
     *     
     */
    public SessionInfo getOSessionInfo() {
        return oSessionInfo;
    }

    /**
     * Sets the value of the oSessionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionInfo }
     *     
     */
    public void setOSessionInfo(SessionInfo value) {
        this.oSessionInfo = value;
    }

    /**
     * Gets the value of the oCardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOCardId() {
        return oCardId;
    }

    /**
     * Sets the value of the oCardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOCardId(String value) {
        this.oCardId = value;
    }

    /**
     * Gets the value of the bAutomaticProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBAutomaticProtocol() {
        return bAutomaticProtocol;
    }

    /**
     * Sets the value of the bAutomaticProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBAutomaticProtocol(Boolean value) {
        this.bAutomaticProtocol = value;
    }

    /**
     * Gets the value of the oIndexes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfField }
     *     
     */
    public ArrayOfField getOIndexes() {
        return oIndexes;
    }

    /**
     * Sets the value of the oIndexes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfField }
     *     
     */
    public void setOIndexes(ArrayOfField value) {
        this.oIndexes = value;
    }

    /**
     * Gets the value of the oArchive property.
     * 
     * @return
     *     possible object is
     *     {@link Archive }
     *     
     */
    public Archive getOArchive() {
        return oArchive;
    }

    /**
     * Sets the value of the oArchive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Archive }
     *     
     */
    public void setOArchive(Archive value) {
        this.oArchive = value;
    }

    /**
     * Gets the value of the oDocumentType property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType }
     *     
     */
    public DocumentType getODocumentType() {
        return oDocumentType;
    }

    /**
     * Sets the value of the oDocumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *     
     */
    public void setODocumentType(DocumentType value) {
        this.oDocumentType = value;
    }

}
