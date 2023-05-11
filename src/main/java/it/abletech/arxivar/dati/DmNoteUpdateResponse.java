
package it.abletech.arxivar.dati;

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
 *         &lt;element name="Dm_Note_UpdateResult" type="{http://www.Abletech.it/Arxivar}Note" minOccurs="0"/>
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
    "dmNoteUpdateResult"
})
@XmlRootElement(name = "Dm_Note_UpdateResponse")
public class DmNoteUpdateResponse {

    @XmlElement(name = "Dm_Note_UpdateResult")
    protected Note dmNoteUpdateResult;

    /**
     * Gets the value of the dmNoteUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link Note }
     *     
     */
    public Note getDmNoteUpdateResult() {
        return dmNoteUpdateResult;
    }

    /**
     * Sets the value of the dmNoteUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Note }
     *     
     */
    public void setDmNoteUpdateResult(Note value) {
        this.dmNoteUpdateResult = value;
    }

}
