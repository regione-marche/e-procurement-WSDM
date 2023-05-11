
package it.datagraph;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentoRetBase64 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentoRetBase64">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DescDoc" type="{}Documento" minOccurs="0"/>
 *         &lt;element name="FileBase64" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lngErrNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="strErrString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentoRetBase64", propOrder = {
    "descDoc",
    "fileBase64",
    "lngErrNumber",
    "strErrString"
})
public class DocumentoRetBase64 {

    @XmlElement(name = "DescDoc")
    protected Documento descDoc;
    @XmlElement(name = "FileBase64")
    protected String fileBase64;
    protected long lngErrNumber;
    protected String strErrString;

    /**
     * Gets the value of the descDoc property.
     * 
     * @return
     *     possible object is
     *     {@link Documento }
     *     
     */
    public Documento getDescDoc() {
        return descDoc;
    }

    /**
     * Sets the value of the descDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Documento }
     *     
     */
    public void setDescDoc(Documento value) {
        this.descDoc = value;
    }

    /**
     * Gets the value of the fileBase64 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileBase64() {
        return fileBase64;
    }

    /**
     * Sets the value of the fileBase64 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileBase64(String value) {
        this.fileBase64 = value;
    }

    /**
     * Gets the value of the lngErrNumber property.
     * 
     */
    public long getLngErrNumber() {
        return lngErrNumber;
    }

    /**
     * Sets the value of the lngErrNumber property.
     * 
     */
    public void setLngErrNumber(long value) {
        this.lngErrNumber = value;
    }

    /**
     * Gets the value of the strErrString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrErrString() {
        return strErrString;
    }

    /**
     * Sets the value of the strErrString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrErrString(String value) {
        this.strErrString = value;
    }

}
