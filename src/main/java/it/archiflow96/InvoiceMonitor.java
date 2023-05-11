
package it.archiflow96;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceMonitor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceMonitor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Common.Tools.Log}LoggableBase">
 *       &lt;sequence>
 *         &lt;element name="Archives" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfArchive" minOccurs="0"/>
 *         &lt;element name="Channels" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.Monitor}ArrayOfChannel" minOccurs="0"/>
 *         &lt;element name="DocumentTypes" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfDocumentType" minOccurs="0"/>
 *         &lt;element name="Phases" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.Monitor}ArrayOfPhase" minOccurs="0"/>
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceMonitor", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.Monitor", propOrder = {
    "archives",
    "channels",
    "documentTypes",
    "phases",
    "total"
})
public class InvoiceMonitor
    extends LoggableBase
{

    @XmlElement(name = "Archives", nillable = true)
    protected ArrayOfArchive archives;
    @XmlElement(name = "Channels", nillable = true)
    protected ArrayOfChannel channels;
    @XmlElement(name = "DocumentTypes", nillable = true)
    protected ArrayOfDocumentType documentTypes;
    @XmlElement(name = "Phases", nillable = true)
    protected ArrayOfPhase phases;
    @XmlElement(name = "Total")
    protected Integer total;

    /**
     * Gets the value of the archives property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArchive }
     *     
     */
    public ArrayOfArchive getArchives() {
        return archives;
    }

    /**
     * Sets the value of the archives property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArchive }
     *     
     */
    public void setArchives(ArrayOfArchive value) {
        this.archives = value;
    }

    /**
     * Gets the value of the channels property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChannel }
     *     
     */
    public ArrayOfChannel getChannels() {
        return channels;
    }

    /**
     * Sets the value of the channels property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChannel }
     *     
     */
    public void setChannels(ArrayOfChannel value) {
        this.channels = value;
    }

    /**
     * Gets the value of the documentTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDocumentType }
     *     
     */
    public ArrayOfDocumentType getDocumentTypes() {
        return documentTypes;
    }

    /**
     * Sets the value of the documentTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDocumentType }
     *     
     */
    public void setDocumentTypes(ArrayOfDocumentType value) {
        this.documentTypes = value;
    }

    /**
     * Gets the value of the phases property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhase }
     *     
     */
    public ArrayOfPhase getPhases() {
        return phases;
    }

    /**
     * Sets the value of the phases property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhase }
     *     
     */
    public void setPhases(ArrayOfPhase value) {
        this.phases = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotal(Integer value) {
        this.total = value;
    }

}
