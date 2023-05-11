
package it.jdoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocCondition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Conservation" type="{http://schemas.datacontract.org/2004/07/WS_Operazioni}DocConservation" minOccurs="0"/>
 *         &lt;element name="Iddoc" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Images" type="{http://schemas.datacontract.org/2004/07/WS_Operazioni}DocImages" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/WS_Operazioni}DocStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocCondition", namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", propOrder = {
    "conservation",
    "iddoc",
    "images",
    "status"
})
public class DocCondition {

    @XmlElement(name = "Conservation", nillable = true)
    protected DocConservation conservation;
    @XmlElement(name = "Iddoc")
    protected Long iddoc;
    @XmlElement(name = "Images", nillable = true)
    protected DocImages images;
    @XmlElement(name = "Status", nillable = true)
    protected DocStatus status;

    /**
     * Gets the value of the conservation property.
     * 
     * @return
     *     possible object is
     *     {@link DocConservation }
     *     
     */
    public DocConservation getConservation() {
        return conservation;
    }

    /**
     * Sets the value of the conservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocConservation }
     *     
     */
    public void setConservation(DocConservation value) {
        this.conservation = value;
    }

    /**
     * Gets the value of the iddoc property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIddoc() {
        return iddoc;
    }

    /**
     * Sets the value of the iddoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIddoc(Long value) {
        this.iddoc = value;
    }

    /**
     * Gets the value of the images property.
     * 
     * @return
     *     possible object is
     *     {@link DocImages }
     *     
     */
    public DocImages getImages() {
        return images;
    }

    /**
     * Sets the value of the images property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocImages }
     *     
     */
    public void setImages(DocImages value) {
        this.images = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link DocStatus }
     *     
     */
    public DocStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocStatus }
     *     
     */
    public void setStatus(DocStatus value) {
        this.status = value;
    }

}
