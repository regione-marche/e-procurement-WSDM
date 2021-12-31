
package it.easydoc.ProtocolManagerService;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Attached complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Attached">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Filename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="File" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="FileHash" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Attached", propOrder = {
    "filename",
    "file",
    "fileHash",
    "contentType"
})
public class Attached {

    @XmlElement(name = "Filename", required = true)
    protected String filename;
    @XmlElement(name = "File", required = true)
    @XmlMimeType("application/octect-stream")
    protected DataHandler file;
    @XmlElement(name = "FileHash", required = true)
    protected String fileHash;
    @XmlElement(name = "ContentType")
    protected String contentType;

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
    }

    /**
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setFile(DataHandler value) {
        this.file = value;
    }

    /**
     * Gets the value of the fileHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileHash() {
        return fileHash;
    }

    /**
     * Sets the value of the fileHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileHash(String value) {
        this.fileHash = value;
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

}
