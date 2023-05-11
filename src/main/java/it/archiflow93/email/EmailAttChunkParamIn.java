
package it.archiflow93.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmailAttChunkParamIn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmailAttChunkParamIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChunkSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DecodeFile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GuidEml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumChunk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}EmailAttType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailAttChunkParamIn", propOrder = {
    "chunkSize",
    "decodeFile",
    "guidEml",
    "index",
    "name",
    "numChunk",
    "type"
})
public class EmailAttChunkParamIn {

    @XmlElement(name = "ChunkSize")
    protected Integer chunkSize;
    @XmlElement(name = "DecodeFile")
    protected Boolean decodeFile;
    @XmlElement(name = "GuidEml", nillable = true)
    protected String guidEml;
    @XmlElement(name = "Index")
    protected Integer index;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "NumChunk")
    protected Integer numChunk;
    @XmlElement(name = "Type")
    protected EmailAttType type;

    /**
     * Gets the value of the chunkSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChunkSize() {
        return chunkSize;
    }

    /**
     * Sets the value of the chunkSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChunkSize(Integer value) {
        this.chunkSize = value;
    }

    /**
     * Gets the value of the decodeFile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDecodeFile() {
        return decodeFile;
    }

    /**
     * Sets the value of the decodeFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDecodeFile(Boolean value) {
        this.decodeFile = value;
    }

    /**
     * Gets the value of the guidEml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuidEml() {
        return guidEml;
    }

    /**
     * Sets the value of the guidEml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuidEml(String value) {
        this.guidEml = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndex(Integer value) {
        this.index = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the numChunk property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumChunk() {
        return numChunk;
    }

    /**
     * Sets the value of the numChunk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumChunk(Integer value) {
        this.numChunk = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EmailAttType }
     *     
     */
    public EmailAttType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAttType }
     *     
     */
    public void setType(EmailAttType value) {
        this.type = value;
    }

}
