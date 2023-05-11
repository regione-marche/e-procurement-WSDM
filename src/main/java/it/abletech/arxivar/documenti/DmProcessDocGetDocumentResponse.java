
package it.abletech.arxivar.documenti;

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
 *         &lt;element name="Dm_ProcessDoc_GetDocumentResult" type="{http://www.Abletech.it/Arxivar}Arx_File" minOccurs="0"/>
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
    "dmProcessDocGetDocumentResult"
})
@XmlRootElement(name = "Dm_ProcessDoc_GetDocumentResponse")
public class DmProcessDocGetDocumentResponse {

    @XmlElement(name = "Dm_ProcessDoc_GetDocumentResult")
    protected ArxFile dmProcessDocGetDocumentResult;

    /**
     * Gets the value of the dmProcessDocGetDocumentResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArxFile }
     *     
     */
    public ArxFile getDmProcessDocGetDocumentResult() {
        return dmProcessDocGetDocumentResult;
    }

    /**
     * Sets the value of the dmProcessDocGetDocumentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArxFile }
     *     
     */
    public void setDmProcessDocGetDocumentResult(ArxFile value) {
        this.dmProcessDocGetDocumentResult = value;
    }

}
