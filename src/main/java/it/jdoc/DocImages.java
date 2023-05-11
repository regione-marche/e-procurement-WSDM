
package it.jdoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocImages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocImages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ImagesCounter" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocImages", namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", propOrder = {
    "imagesCounter"
})
public class DocImages {

    @XmlElement(name = "ImagesCounter")
    protected Long imagesCounter;

    /**
     * Gets the value of the imagesCounter property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getImagesCounter() {
        return imagesCounter;
    }

    /**
     * Sets the value of the imagesCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setImagesCounter(Long value) {
        this.imagesCounter = value;
    }

}
