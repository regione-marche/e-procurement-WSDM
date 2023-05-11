
package it.kdm.docer.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import it.kdm.docer.sdk.exceptions.xsd.DocerException;


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
 *         &lt;element name="DocerException" type="{http://exceptions.sdk.docer.kdm.it/xsd}DocerException" minOccurs="0"/>
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
    "docerException"
})
@XmlRootElement(name = "DocerServicesDocerException")
public class DocerServicesDocerException {

    @XmlElement(name = "DocerException", nillable = true)
    protected DocerException docerException;

    /**
     * Gets the value of the docerException property.
     * 
     * @return
     *     possible object is
     *     {@link DocerException }
     *     
     */
    public DocerException getDocerException() {
        return docerException;
    }

    /**
     * Sets the value of the docerException property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocerException }
     *     
     */
    public void setDocerException(DocerException value) {
        this.docerException = value;
    }

}
