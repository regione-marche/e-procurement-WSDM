
package it.archiflow96;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MoveCardDocAndAttachmentsInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MoveCardDocAndAttachmentsInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="CardId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="IdAttachmentsVol" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="IdDocumentVol" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoveCardDocAndAttachmentsInput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "cardId",
    "idAttachmentsVol",
    "idDocumentVol"
})
public class MoveCardDocAndAttachmentsInput
    extends BaseInput
{

    @XmlElement(name = "CardId")
    protected String cardId;
    @XmlElement(name = "IdAttachmentsVol")
    protected Short idAttachmentsVol;
    @XmlElement(name = "IdDocumentVol")
    protected Short idDocumentVol;

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
     * Gets the value of the idAttachmentsVol property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIdAttachmentsVol() {
        return idAttachmentsVol;
    }

    /**
     * Sets the value of the idAttachmentsVol property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIdAttachmentsVol(Short value) {
        this.idAttachmentsVol = value;
    }

    /**
     * Gets the value of the idDocumentVol property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIdDocumentVol() {
        return idDocumentVol;
    }

    /**
     * Sets the value of the idDocumentVol property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIdDocumentVol(Short value) {
        this.idDocumentVol = value;
    }

}
