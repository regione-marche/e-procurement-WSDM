
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
 *         &lt;element name="Dm_NoteWork_GetDataResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "dmNoteWorkGetDataResult"
})
@XmlRootElement(name = "Dm_NoteWork_GetDataResponse")
public class DmNoteWorkGetDataResponse {

    @XmlElement(name = "Dm_NoteWork_GetDataResult")
    protected String dmNoteWorkGetDataResult;

    /**
     * Gets the value of the dmNoteWorkGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmNoteWorkGetDataResult() {
        return dmNoteWorkGetDataResult;
    }

    /**
     * Sets the value of the dmNoteWorkGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDmNoteWorkGetDataResult(String value) {
        this.dmNoteWorkGetDataResult = value;
    }

}
