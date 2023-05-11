
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
 *         &lt;element name="Dm_AllegatiDoc_GetDocumentResult" type="{http://www.Abletech.it/Arxivar}Arx_File" minOccurs="0"/>
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
    "dmAllegatiDocGetDocumentResult"
})
@XmlRootElement(name = "Dm_AllegatiDoc_GetDocumentResponse")
public class DmAllegatiDocGetDocumentResponse {

    @XmlElement(name = "Dm_AllegatiDoc_GetDocumentResult")
    protected ArxFile dmAllegatiDocGetDocumentResult;

    /**
     * Gets the value of the dmAllegatiDocGetDocumentResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArxFile }
     *     
     */
    public ArxFile getDmAllegatiDocGetDocumentResult() {
        return dmAllegatiDocGetDocumentResult;
    }

    /**
     * Sets the value of the dmAllegatiDocGetDocumentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArxFile }
     *     
     */
    public void setDmAllegatiDocGetDocumentResult(ArxFile value) {
        this.dmAllegatiDocGetDocumentResult = value;
    }

}
