
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttachPressMarkInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttachPressMarkInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="CardId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="ContentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NotWritePressmarkHistory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PressMarkContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachPressMarkInput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "cardId",
    "contentType",
    "notWritePressmarkHistory",
    "pressMarkContent"
})
public class AttachPressMarkInput
    extends BaseInput
{

    @XmlElement(name = "CardId")
    protected String cardId;
    @XmlElement(name = "ContentType", nillable = true)
    protected String contentType;
    @XmlElement(name = "NotWritePressmarkHistory")
    protected Boolean notWritePressmarkHistory;
    @XmlElement(name = "PressMarkContent", nillable = true)
    protected byte[] pressMarkContent;

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
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the notWritePressmarkHistory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotWritePressmarkHistory() {
        return notWritePressmarkHistory;
    }

    /**
     * Sets the value of the notWritePressmarkHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotWritePressmarkHistory(Boolean value) {
        this.notWritePressmarkHistory = value;
    }

    /**
     * Gets the value of the pressMarkContent property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPressMarkContent() {
        return pressMarkContent;
    }

    /**
     * Sets the value of the pressMarkContent property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPressMarkContent(byte[] value) {
        this.pressMarkContent = ((byte[]) value);
    }

}
