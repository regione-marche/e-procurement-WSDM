
package it.archiflow96;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCardAttachmentInChunkInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCardAttachmentInChunkInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="CardId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DimChunk" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Mode" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}AttachmentContentMode" minOccurs="0"/>
 *         &lt;element name="NumChunk" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCardAttachmentInChunkInput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "cardId",
    "code",
    "dimChunk",
    "mode",
    "numChunk"
})
public class GetCardAttachmentInChunkInput
    extends BaseInput
{

    @XmlElement(name = "CardId")
    protected String cardId;
    @XmlElement(name = "Code")
    protected Long code;
    @XmlElement(name = "DimChunk")
    protected Long dimChunk;
    @XmlList
    @XmlElement(name = "Mode")
    protected List<String> mode;
    @XmlElement(name = "NumChunk")
    protected Long numChunk;

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
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCode(Long value) {
        this.code = value;
    }

    /**
     * Gets the value of the dimChunk property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDimChunk() {
        return dimChunk;
    }

    /**
     * Sets the value of the dimChunk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDimChunk(Long value) {
        this.dimChunk = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMode() {
        if (mode == null) {
            mode = new ArrayList<String>();
        }
        return this.mode;
    }

    /**
     * Gets the value of the numChunk property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumChunk() {
        return numChunk;
    }

    /**
     * Sets the value of the numChunk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumChunk(Long value) {
        this.numChunk = value;
    }

}
