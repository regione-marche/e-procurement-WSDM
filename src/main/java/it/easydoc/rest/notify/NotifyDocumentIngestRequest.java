
package it.easydoc.rest.notify;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotifyDocumentIngestRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotifyDocumentIngestRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocumentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Document_ID" type="{http://www.consorziocsa.it/easydoc/ws}Document_ID"/>
 *         &lt;element name="Metadata" type="{http://www.consorziocsa.it/easydoc/ws}Metadata" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifyDocumentIngestRequest", propOrder = {
    "eventType",
    "documentType",
    "documentID",
    "metadata"
})
public class NotifyDocumentIngestRequest {

    @XmlElement(name = "EventType", required = true)
    protected String eventType;
    @XmlElement(name = "DocumentType", required = true)
    protected String documentType;
    @XmlElement(name = "Document_ID", required = true)
    protected DocumentID documentID;
    @XmlElement(name = "Metadata")
    protected Metadata metadata;

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventType(String value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the documentID property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentID }
     *     
     */
    public DocumentID getDocumentID() {
        return documentID;
    }

    /**
     * Sets the value of the documentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentID }
     *     
     */
    public void setDocumentID(DocumentID value) {
        this.documentID = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link Metadata }
     *     
     */
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Metadata }
     *     
     */
    public void setMetadata(Metadata value) {
        this.metadata = value;
    }

}
