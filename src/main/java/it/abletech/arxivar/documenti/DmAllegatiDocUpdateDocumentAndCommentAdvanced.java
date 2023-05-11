
package it.abletech.arxivar.documenti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="dmAllegatiDocId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="file" type="{http://www.Abletech.it/Arxivar}Arx_File" minOccurs="0"/>
 *         &lt;element name="commento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "dmAllegatiDocId",
    "file",
    "commento"
})
@XmlRootElement(name = "Dm_AllegatiDoc_Update_Document_And_Comment_Advanced")
public class DmAllegatiDocUpdateDocumentAndCommentAdvanced {

    protected String sessionId;
    protected int dmAllegatiDocId;
    protected ArxFile file;
    protected String commento;

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
     * Gets the value of the dmAllegatiDocId property.
     * 
     */
    public int getDmAllegatiDocId() {
        return dmAllegatiDocId;
    }

    /**
     * Sets the value of the dmAllegatiDocId property.
     * 
     */
    public void setDmAllegatiDocId(int value) {
        this.dmAllegatiDocId = value;
    }

    /**
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     {@link ArxFile }
     *     
     */
    public ArxFile getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArxFile }
     *     
     */
    public void setFile(ArxFile value) {
        this.file = value;
    }

    /**
     * Gets the value of the commento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommento() {
        return commento;
    }

    /**
     * Sets the value of the commento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommento(String value) {
        this.commento = value;
    }

}
