
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.siav_common_baseclass.DateIdentifier;
import org.datacontract.schemas._2004._07.siav_common_baseclass.ResultInfo;


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
 *         &lt;element name="InsertFascicoloNoteResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="NoteInfo" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}DateIdentifier" minOccurs="0"/>
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
    "insertFascicoloNoteResult",
    "noteInfo"
})
@XmlRootElement(name = "InsertFascicoloNoteResponse")
public class InsertFascicoloNoteResponse {

    @XmlElement(name = "InsertFascicoloNoteResult")
    protected ResultInfo insertFascicoloNoteResult;
    @XmlElementRef(name = "NoteInfo", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<DateIdentifier> noteInfo;

    /**
     * Gets the value of the insertFascicoloNoteResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getInsertFascicoloNoteResult() {
        return insertFascicoloNoteResult;
    }

    /**
     * Sets the value of the insertFascicoloNoteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setInsertFascicoloNoteResult(ResultInfo value) {
        this.insertFascicoloNoteResult = value;
    }

    /**
     * Gets the value of the noteInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateIdentifier }{@code >}
     *     
     */
    public JAXBElement<DateIdentifier> getNoteInfo() {
        return noteInfo;
    }

    /**
     * Sets the value of the noteInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateIdentifier }{@code >}
     *     
     */
    public void setNoteInfo(JAXBElement<DateIdentifier> value) {
        this.noteInfo = ((JAXBElement<DateIdentifier> ) value);
    }

}
