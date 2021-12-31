
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
 *         &lt;element name="Dm_Note_GetData_By_DocnumberResult" type="{http://www.Abletech.it/Arxivar}ArrayOfNote" minOccurs="0"/>
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
    "dmNoteGetDataByDocnumberResult"
})
@XmlRootElement(name = "Dm_Note_GetData_By_DocnumberResponse")
public class DmNoteGetDataByDocnumberResponse {

    @XmlElement(name = "Dm_Note_GetData_By_DocnumberResult")
    protected ArrayOfNote dmNoteGetDataByDocnumberResult;

    /**
     * Gets the value of the dmNoteGetDataByDocnumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNote }
     *     
     */
    public ArrayOfNote getDmNoteGetDataByDocnumberResult() {
        return dmNoteGetDataByDocnumberResult;
    }

    /**
     * Sets the value of the dmNoteGetDataByDocnumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNote }
     *     
     */
    public void setDmNoteGetDataByDocnumberResult(ArrayOfNote value) {
        this.dmNoteGetDataByDocnumberResult = value;
    }

}
