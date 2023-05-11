
package it.abletech.arxivar.dati;

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
 *         &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flagAos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="toSend" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="copiaConforme" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "filename",
    "commento",
    "flagAos",
    "toSend",
    "copiaConforme"
})
@XmlRootElement(name = "Dm_AllegatiDoc_Update")
public class DmAllegatiDocUpdate {

    protected String sessionId;
    protected int dmAllegatiDocId;
    protected String filename;
    protected String commento;
    protected boolean flagAos;
    protected boolean toSend;
    protected boolean copiaConforme;

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

    /**
     * Gets the value of the flagAos property.
     * 
     */
    public boolean isFlagAos() {
        return flagAos;
    }

    /**
     * Sets the value of the flagAos property.
     * 
     */
    public void setFlagAos(boolean value) {
        this.flagAos = value;
    }

    /**
     * Gets the value of the toSend property.
     * 
     */
    public boolean isToSend() {
        return toSend;
    }

    /**
     * Sets the value of the toSend property.
     * 
     */
    public void setToSend(boolean value) {
        this.toSend = value;
    }

    /**
     * Gets the value of the copiaConforme property.
     * 
     */
    public boolean isCopiaConforme() {
        return copiaConforme;
    }

    /**
     * Sets the value of the copiaConforme property.
     * 
     */
    public void setCopiaConforme(boolean value) {
        this.copiaConforme = value;
    }

}
