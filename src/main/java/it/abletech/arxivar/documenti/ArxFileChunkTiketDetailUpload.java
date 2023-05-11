
package it.abletech.arxivar.documenti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Arx_FileChunkTiketId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chunkIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="chunkContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="isComplete" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionId",
    "arxFileChunkTiketId",
    "chunkIndex",
    "chunkContent",
    "isComplete"
})
@XmlRootElement(name = "Arx_FileChunkTiket_Detail_Upload")
public class ArxFileChunkTiketDetailUpload {

    protected String sessionId;
    @XmlElement(name = "Arx_FileChunkTiketId")
    protected String arxFileChunkTiketId;
    protected int chunkIndex;
    protected byte[] chunkContent;
    protected boolean isComplete;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the arxFileChunkTiketId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArxFileChunkTiketId() {
        return arxFileChunkTiketId;
    }

    /**
     * Sets the value of the arxFileChunkTiketId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArxFileChunkTiketId(String value) {
        this.arxFileChunkTiketId = value;
    }

    /**
     * Gets the value of the chunkIndex property.
     * 
     */
    public int getChunkIndex() {
        return chunkIndex;
    }

    /**
     * Sets the value of the chunkIndex property.
     * 
     */
    public void setChunkIndex(int value) {
        this.chunkIndex = value;
    }

    /**
     * Gets the value of the chunkContent property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getChunkContent() {
        return chunkContent;
    }

    /**
     * Sets the value of the chunkContent property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setChunkContent(byte[] value) {
        this.chunkContent = ((byte[]) value);
    }

    /**
     * Gets the value of the isComplete property.
     * 
     */
    public boolean isIsComplete() {
        return isComplete;
    }

    /**
     * Sets the value of the isComplete property.
     * 
     */
    public void setIsComplete(boolean value) {
        this.isComplete = value;
    }

}
