
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
 *         &lt;element name="Dm_Note_DeleteResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "dmNoteDeleteResult"
})
@XmlRootElement(name = "Dm_Note_DeleteResponse")
public class DmNoteDeleteResponse {

    @XmlElement(name = "Dm_Note_DeleteResult")
    protected int dmNoteDeleteResult;

    /**
     * Gets the value of the dmNoteDeleteResult property.
     * 
     */
    public int getDmNoteDeleteResult() {
        return dmNoteDeleteResult;
    }

    /**
     * Sets the value of the dmNoteDeleteResult property.
     * 
     */
    public void setDmNoteDeleteResult(int value) {
        this.dmNoteDeleteResult = value;
    }

}
