
package it.abletech.arxivar.documenti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Arx_FileChunkTiket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Arx_FileChunkTiket">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Utente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Sha1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChunkCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ChunkSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FileSize" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ExpitationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IsCompressed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Arx_FileChunkTiket", propOrder = {
    "id",
    "fileName",
    "utente",
    "sha1",
    "chunkCount",
    "chunkSize",
    "fileSize",
    "expitationDate",
    "isCompressed"
})
public class ArxFileChunkTiket
    extends Base
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "FileName")
    protected String fileName;
    @XmlElement(name = "Utente")
    protected int utente;
    @XmlElement(name = "Sha1")
    protected String sha1;
    @XmlElement(name = "ChunkCount")
    protected int chunkCount;
    @XmlElement(name = "ChunkSize")
    protected int chunkSize;
    @XmlElement(name = "FileSize")
    protected long fileSize;
    @XmlElement(name = "ExpitationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expitationDate;
    @XmlElement(name = "IsCompressed")
    protected boolean isCompressed;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
     * Gets the value of the utente property.
     * 
     */
    public int getUtente() {
        return utente;
    }

    /**
     * Sets the value of the utente property.
     * 
     */
    public void setUtente(int value) {
        this.utente = value;
    }

    /**
     * Gets the value of the sha1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSha1() {
        return sha1;
    }

    /**
     * Sets the value of the sha1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSha1(String value) {
        this.sha1 = value;
    }

    /**
     * Gets the value of the chunkCount property.
     * 
     */
    public int getChunkCount() {
        return chunkCount;
    }

    /**
     * Sets the value of the chunkCount property.
     * 
     */
    public void setChunkCount(int value) {
        this.chunkCount = value;
    }

    /**
     * Gets the value of the chunkSize property.
     * 
     */
    public int getChunkSize() {
        return chunkSize;
    }

    /**
     * Sets the value of the chunkSize property.
     * 
     */
    public void setChunkSize(int value) {
        this.chunkSize = value;
    }

    /**
     * Gets the value of the fileSize property.
     * 
     */
    public long getFileSize() {
        return fileSize;
    }

    /**
     * Sets the value of the fileSize property.
     * 
     */
    public void setFileSize(long value) {
        this.fileSize = value;
    }

    /**
     * Gets the value of the expitationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpitationDate() {
        return expitationDate;
    }

    /**
     * Sets the value of the expitationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpitationDate(XMLGregorianCalendar value) {
        this.expitationDate = value;
    }

    /**
     * Gets the value of the isCompressed property.
     * 
     */
    public boolean isIsCompressed() {
        return isCompressed;
    }

    /**
     * Sets the value of the isCompressed property.
     * 
     */
    public void setIsCompressed(boolean value) {
        this.isCompressed = value;
    }

}
