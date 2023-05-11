
package it.abletech.arxivar.search;

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
 *         &lt;element name="Dm_NoteWork_Select_Get_New_InstanceResult" type="{http://www.Abletech.it/Arxivar}Dm_NoteWork_Select" minOccurs="0"/>
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
    "dmNoteWorkSelectGetNewInstanceResult"
})
@XmlRootElement(name = "Dm_NoteWork_Select_Get_New_InstanceResponse")
public class DmNoteWorkSelectGetNewInstanceResponse {

    @XmlElement(name = "Dm_NoteWork_Select_Get_New_InstanceResult")
    protected DmNoteWorkSelect dmNoteWorkSelectGetNewInstanceResult;

    /**
     * Gets the value of the dmNoteWorkSelectGetNewInstanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmNoteWorkSelect }
     *     
     */
    public DmNoteWorkSelect getDmNoteWorkSelectGetNewInstanceResult() {
        return dmNoteWorkSelectGetNewInstanceResult;
    }

    /**
     * Sets the value of the dmNoteWorkSelectGetNewInstanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmNoteWorkSelect }
     *     
     */
    public void setDmNoteWorkSelectGetNewInstanceResult(DmNoteWorkSelect value) {
        this.dmNoteWorkSelectGetNewInstanceResult = value;
    }

}
