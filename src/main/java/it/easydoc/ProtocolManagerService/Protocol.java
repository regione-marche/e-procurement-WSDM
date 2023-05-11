
package it.easydoc.ProtocolManagerService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Protocol complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Protocol">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordDocumentRequestType" type="{http://www.consorziocsa.it/easydoc/ws}RecordDocumentRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Protocol", propOrder = {
    "recordDocumentRequestType"
})
public class Protocol {

    @XmlElement(name = "RecordDocumentRequestType")
    protected RecordDocumentRequestType recordDocumentRequestType;

    /**
     * Gets the value of the recordDocumentRequestType property.
     * 
     * @return
     *     possible object is
     *     {@link RecordDocumentRequestType }
     *     
     */
    public RecordDocumentRequestType getRecordDocumentRequestType() {
        return recordDocumentRequestType;
    }

    /**
     * Sets the value of the recordDocumentRequestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordDocumentRequestType }
     *     
     */
    public void setRecordDocumentRequestType(RecordDocumentRequestType value) {
        this.recordDocumentRequestType = value;
    }

}
