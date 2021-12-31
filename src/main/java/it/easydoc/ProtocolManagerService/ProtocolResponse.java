
package it.easydoc.ProtocolManagerService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProtocolResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProtocolResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordDocumentResponseType" type="{http://www.consorziocsa.it/easydoc/ws}recordDocumentResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtocolResponse", propOrder = {
    "recordDocumentResponseType"
})
public class ProtocolResponse {

    @XmlElement(name = "RecordDocumentResponseType")
    protected RecordDocumentResponseType recordDocumentResponseType;

    /**
     * Gets the value of the recordDocumentResponseType property.
     * 
     * @return
     *     possible object is
     *     {@link RecordDocumentResponseType }
     *     
     */
    public RecordDocumentResponseType getRecordDocumentResponseType() {
        return recordDocumentResponseType;
    }

    /**
     * Sets the value of the recordDocumentResponseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordDocumentResponseType }
     *     
     */
    public void setRecordDocumentResponseType(RecordDocumentResponseType value) {
        this.recordDocumentResponseType = value;
    }

}
