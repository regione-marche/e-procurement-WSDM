
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.siav_common_baseclass.ArrayOfBaseNote;
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
 *         &lt;element name="ReadFascicoloNotesResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="pBaseNoteColl" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}ArrayOfBaseNote" minOccurs="0"/>
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
    "readFascicoloNotesResult",
    "pBaseNoteColl"
})
@XmlRootElement(name = "ReadFascicoloNotesResponse")
public class ReadFascicoloNotesResponse {

    @XmlElement(name = "ReadFascicoloNotesResult")
    protected ResultInfo readFascicoloNotesResult;
    @XmlElementRef(name = "pBaseNoteColl", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfBaseNote> pBaseNoteColl;

    /**
     * Gets the value of the readFascicoloNotesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getReadFascicoloNotesResult() {
        return readFascicoloNotesResult;
    }

    /**
     * Sets the value of the readFascicoloNotesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setReadFascicoloNotesResult(ResultInfo value) {
        this.readFascicoloNotesResult = value;
    }

    /**
     * Gets the value of the pBaseNoteColl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBaseNote }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBaseNote> getPBaseNoteColl() {
        return pBaseNoteColl;
    }

    /**
     * Sets the value of the pBaseNoteColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBaseNote }{@code >}
     *     
     */
    public void setPBaseNoteColl(JAXBElement<ArrayOfBaseNote> value) {
        this.pBaseNoteColl = ((JAXBElement<ArrayOfBaseNote> ) value);
    }

}
