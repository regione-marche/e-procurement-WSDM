
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArchiveTypedocCardId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArchiveTypedocCardId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArchiveId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GuidCard" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="TypeDocId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArchiveTypedocCardId", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "archiveId",
    "guidCard",
    "typeDocId"
})
public class ArchiveTypedocCardId {

    @XmlElement(name = "ArchiveId")
    protected Integer archiveId;
    @XmlElement(name = "GuidCard")
    protected String guidCard;
    @XmlElement(name = "TypeDocId")
    protected Integer typeDocId;

    /**
     * Gets the value of the archiveId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArchiveId() {
        return archiveId;
    }

    /**
     * Sets the value of the archiveId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArchiveId(Integer value) {
        this.archiveId = value;
    }

    /**
     * Gets the value of the guidCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuidCard() {
        return guidCard;
    }

    /**
     * Sets the value of the guidCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuidCard(String value) {
        this.guidCard = value;
    }

    /**
     * Gets the value of the typeDocId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTypeDocId() {
        return typeDocId;
    }

    /**
     * Sets the value of the typeDocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTypeDocId(Integer value) {
        this.typeDocId = value;
    }

}
