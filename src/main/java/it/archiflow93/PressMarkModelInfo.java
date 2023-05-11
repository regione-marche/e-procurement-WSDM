
package it.archiflow93;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PressMarkModelInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PressMarkModelInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RawBytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TextXml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UseEndorser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PressMarkModelInfo", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "rawBytes",
    "text",
    "textXml",
    "useEndorser"
})
public class PressMarkModelInfo {

    @XmlElement(name = "RawBytes", nillable = true)
    protected byte[] rawBytes;
    @XmlElement(name = "Text", nillable = true)
    protected String text;
    @XmlElement(name = "TextXml", nillable = true)
    protected String textXml;
    @XmlElement(name = "UseEndorser")
    protected Boolean useEndorser;

    /**
     * Gets the value of the rawBytes property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRawBytes() {
        return rawBytes;
    }

    /**
     * Sets the value of the rawBytes property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setRawBytes(byte[] value) {
        this.rawBytes = ((byte[]) value);
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the textXml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextXml() {
        return textXml;
    }

    /**
     * Sets the value of the textXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextXml(String value) {
        this.textXml = value;
    }

    /**
     * Gets the value of the useEndorser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseEndorser() {
        return useEndorser;
    }

    /**
     * Sets the value of the useEndorser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseEndorser(Boolean value) {
        this.useEndorser = value;
    }

}
