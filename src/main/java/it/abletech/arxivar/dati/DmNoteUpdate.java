
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
 *         &lt;element name="dmNoteId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="commenti" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flagAos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "dmNoteId",
    "commenti",
    "flagAos"
})
@XmlRootElement(name = "Dm_Note_Update")
public class DmNoteUpdate {

    protected String sessionId;
    protected int dmNoteId;
    protected String commenti;
    protected boolean flagAos;

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
     * Gets the value of the dmNoteId property.
     * 
     */
    public int getDmNoteId() {
        return dmNoteId;
    }

    /**
     * Sets the value of the dmNoteId property.
     * 
     */
    public void setDmNoteId(int value) {
        this.dmNoteId = value;
    }

    /**
     * Gets the value of the commenti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommenti() {
        return commenti;
    }

    /**
     * Sets the value of the commenti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommenti(String value) {
        this.commenti = value;
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

}
