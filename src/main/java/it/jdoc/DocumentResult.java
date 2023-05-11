
package it.jdoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WS_Operazioni}Result">
 *       &lt;sequence>
 *         &lt;element name="FileImage" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentResult", namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", propOrder = {
    "fileImage",
    "fileName",
    "fileType"
})
public class DocumentResult
    extends Result
{

    @XmlElement(name = "FileImage", nillable = true)
    protected byte[] fileImage;
    @XmlElement(name = "FileName", nillable = true)
    protected String fileName;
    @XmlElement(name = "FileType", nillable = true)
    protected String fileType;

    /**
     * Gets the value of the fileImage property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFileImage() {
        return fileImage;
    }

    /**
     * Sets the value of the fileImage property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFileImage(byte[] value) {
        this.fileImage = ((byte[]) value);
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the fileType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * Sets the value of the fileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileType(String value) {
        this.fileType = value;
    }

}
