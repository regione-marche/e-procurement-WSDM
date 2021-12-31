
package it.jdoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InputAddAttachment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InputAddAttachment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WS_Operazioni}InputParameter">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IMG" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="IdDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputAddAttachment", namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", propOrder = {
    "description",
    "fileName",
    "img",
    "idDoc",
    "notes"
})
public class InputAddAttachment
    extends InputParameter
{

    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "FileName", nillable = true)
    protected String fileName;
    @XmlElement(name = "IMG", nillable = true)
    protected byte[] img;
    @XmlElement(name = "IdDoc", nillable = true)
    protected String idDoc;
    @XmlElement(name = "Notes", nillable = true)
    protected String notes;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the img property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getIMG() {
        return img;
    }

    /**
     * Sets the value of the img property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setIMG(byte[] value) {
        this.img = ((byte[]) value);
    }

    /**
     * Gets the value of the idDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDoc() {
        return idDoc;
    }

    /**
     * Sets the value of the idDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDoc(String value) {
        this.idDoc = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

}
