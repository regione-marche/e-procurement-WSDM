
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertFascicoloNoteOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertFascicoloNoteOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="NoteInfo" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}DateIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertFascicoloNoteOutput", propOrder = {
    "noteInfo"
})
public class InsertFascicoloNoteOutput
    extends BaseOutput
{

    @XmlElement(name = "NoteInfo", nillable = true)
    protected DateIdentifier noteInfo;

    /**
     * Gets the value of the noteInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DateIdentifier }
     *     
     */
    public DateIdentifier getNoteInfo() {
        return noteInfo;
    }

    /**
     * Sets the value of the noteInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateIdentifier }
     *     
     */
    public void setNoteInfo(DateIdentifier value) {
        this.noteInfo = value;
    }

}
