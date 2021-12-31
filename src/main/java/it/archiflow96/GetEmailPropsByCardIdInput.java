
package it.archiflow96;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetEmailPropsByCardIdInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetEmailPropsByCardIdInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="CardId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="PrepareEmailFor" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}PrepareEmailFor" minOccurs="0"/>
 *         &lt;element name="SaveAttachmentsToTemp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetEmailPropsByCardIdInput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Posting.ValueObject", propOrder = {
    "cardId",
    "prepareEmailFor",
    "saveAttachmentsToTemp"
})
public class GetEmailPropsByCardIdInput
    extends BaseInput
{

    @XmlElement(name = "CardId")
    protected String cardId;
    @XmlElement(name = "PrepareEmailFor")
    protected PrepareEmailFor prepareEmailFor;
    @XmlElement(name = "SaveAttachmentsToTemp")
    protected Boolean saveAttachmentsToTemp;

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
     * Gets the value of the prepareEmailFor property.
     * 
     * @return
     *     possible object is
     *     {@link PrepareEmailFor }
     *     
     */
    public PrepareEmailFor getPrepareEmailFor() {
        return prepareEmailFor;
    }

    /**
     * Sets the value of the prepareEmailFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepareEmailFor }
     *     
     */
    public void setPrepareEmailFor(PrepareEmailFor value) {
        this.prepareEmailFor = value;
    }

    /**
     * Gets the value of the saveAttachmentsToTemp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSaveAttachmentsToTemp() {
        return saveAttachmentsToTemp;
    }

    /**
     * Sets the value of the saveAttachmentsToTemp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaveAttachmentsToTemp(Boolean value) {
        this.saveAttachmentsToTemp = value;
    }

}
